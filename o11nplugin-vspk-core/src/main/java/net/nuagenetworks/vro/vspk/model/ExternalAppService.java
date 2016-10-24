/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vro.vspk.model;
import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.ExternalAppServiceEgressType;

import net.nuagenetworks.vro.vspk.model.enums.ExternalAppServiceEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.ExternalAppServiceIngressType;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.annotation.RestEntity;
import net.nuagenetworks.vro.model.BaseObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.EXTERNALAPPSERVICE, datasource = Constants.DATASOURCE, image = Constants.EXTERNALAPPSERVICE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "externalappservice", resourceName = "externalappservices")
public class ExternalAppService extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedServiceEgressGroupID")
    protected String associatedServiceEgressGroupID;
    
    @JsonProperty(value = "associatedServiceEgressRedirectID")
    protected String associatedServiceEgressRedirectID;
    
    @JsonProperty(value = "associatedServiceIngressGroupID")
    protected String associatedServiceIngressGroupID;
    
    @JsonProperty(value = "associatedServiceIngressRedirectID")
    protected String associatedServiceIngressRedirectID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destinationNATAddress")
    protected String destinationNATAddress;
    
    @JsonProperty(value = "destinationNATEnabled")
    protected Boolean destinationNATEnabled;
    
    @JsonProperty(value = "destinationNATMask")
    protected String destinationNATMask;
    
    @JsonProperty(value = "egressType")
    protected ExternalAppServiceEgressType egressType;
    
    @JsonProperty(value = "entityScope")
    protected ExternalAppServiceEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "ingressType")
    protected ExternalAppServiceIngressType ingressType;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "metadata")
    protected String metadata;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "sourceNATAddress")
    protected String sourceNATAddress;
    
    @JsonProperty(value = "sourceNATEnabled")
    protected Boolean sourceNATEnabled;
    
    @JsonProperty(value = "virtualIP")
    protected String virtualIP;
    
    @JsonProperty(value = "virtualIPRequired")
    protected Boolean virtualIPRequired;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public ExternalAppService() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }@VsoProperty(displayName = "RestName", readOnly = true)
    public String getRestName() {
        return super.getRestName();
    }

    @VsoProperty(displayName = "Id", readOnly = false)
    public String getId() {
        return super.getId();
    }

    @VsoProperty(displayName = "ParentId", readOnly = false)
    public String getParentId() {
        return super.getParentId();
    }

    @VsoProperty(displayName = "ParentType", readOnly = false)
    public String getParentType() {
        return super.getParentType();
    }

    @VsoProperty(displayName = "CreationDate", readOnly = false)
    public String getCreationDate() {
        return super.getCreationDate();
    }

    @VsoProperty(displayName = "UpdatedDate", readOnly = false)
    public String getLastUpdatedDate() {
        return super.getLastUpdatedDate();
    }

    @VsoProperty(displayName = "Owner", readOnly = false)
    public String getOwner() {
        return super.getOwner();
    }
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedServiceEgressGroupID", readOnly = false)   
    public String getAssociatedServiceEgressGroupID() {
       return associatedServiceEgressGroupID;
    }

    @JsonIgnore
    public void setAssociatedServiceEgressGroupID(String value) { 
        this.associatedServiceEgressGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedServiceEgressRedirectID", readOnly = false)   
    public String getAssociatedServiceEgressRedirectID() {
       return associatedServiceEgressRedirectID;
    }

    @JsonIgnore
    public void setAssociatedServiceEgressRedirectID(String value) { 
        this.associatedServiceEgressRedirectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedServiceIngressGroupID", readOnly = false)   
    public String getAssociatedServiceIngressGroupID() {
       return associatedServiceIngressGroupID;
    }

    @JsonIgnore
    public void setAssociatedServiceIngressGroupID(String value) { 
        this.associatedServiceIngressGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedServiceIngressRedirectID", readOnly = false)   
    public String getAssociatedServiceIngressRedirectID() {
       return associatedServiceIngressRedirectID;
    }

    @JsonIgnore
    public void setAssociatedServiceIngressRedirectID(String value) { 
        this.associatedServiceIngressRedirectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationNATAddress", readOnly = false)   
    public String getDestinationNATAddress() {
       return destinationNATAddress;
    }

    @JsonIgnore
    public void setDestinationNATAddress(String value) { 
        this.destinationNATAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationNATEnabled", readOnly = false)   
    public Boolean getDestinationNATEnabled() {
       return destinationNATEnabled;
    }

    @JsonIgnore
    public void setDestinationNATEnabled(Boolean value) { 
        this.destinationNATEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationNATMask", readOnly = false)   
    public String getDestinationNATMask() {
       return destinationNATMask;
    }

    @JsonIgnore
    public void setDestinationNATMask(String value) { 
        this.destinationNATMask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressType", readOnly = false)   
    public ExternalAppServiceEgressType getEgressType() {
       return egressType;
    }

    @JsonIgnore
    public void setEgressType(ExternalAppServiceEgressType value) { 
        this.egressType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public ExternalAppServiceEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(ExternalAppServiceEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExternalID", readOnly = false)   
    public String getExternalID() {
       return externalID;
    }

    @JsonIgnore
    public void setExternalID(String value) { 
        this.externalID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressType", readOnly = false)   
    public ExternalAppServiceIngressType getIngressType() {
       return ingressType;
    }

    @JsonIgnore
    public void setIngressType(ExternalAppServiceIngressType value) { 
        this.ingressType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastUpdatedBy", readOnly = false)   
    public String getLastUpdatedBy() {
       return lastUpdatedBy;
    }

    @JsonIgnore
    public void setLastUpdatedBy(String value) { 
        this.lastUpdatedBy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadata", readOnly = false)   
    public String getMetadata() {
       return metadata;
    }

    @JsonIgnore
    public void setMetadata(String value) { 
        this.metadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceNATAddress", readOnly = false)   
    public String getSourceNATAddress() {
       return sourceNATAddress;
    }

    @JsonIgnore
    public void setSourceNATAddress(String value) { 
        this.sourceNATAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceNATEnabled", readOnly = false)   
    public Boolean getSourceNATEnabled() {
       return sourceNATEnabled;
    }

    @JsonIgnore
    public void setSourceNATEnabled(Boolean value) { 
        this.sourceNATEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualIP", readOnly = false)   
    public String getVirtualIP() {
       return virtualIP;
    }

    @JsonIgnore
    public void setVirtualIP(String value) { 
        this.virtualIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualIPRequired", readOnly = false)   
    public Boolean getVirtualIPRequired() {
       return virtualIPRequired;
    }

    @JsonIgnore
    public void setVirtualIPRequired(Boolean value) { 
        this.virtualIPRequired = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.EXTERNALAPPSERVICE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.EXTERNALAPPSERVICE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.EXTERNALAPPSERVICE, getId());
        }
    }
    
    @VsoMethod
    public void createGlobalMetadata(Session session, GlobalMetadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GLOBALMETADATAS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createMetadata(Session session, Metadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.METADATAS_FETCHER, getId());
        }
    }public String toString() {
        return "ExternalAppService [" + "associatedServiceEgressGroupID=" + associatedServiceEgressGroupID + ", associatedServiceEgressRedirectID=" + associatedServiceEgressRedirectID + ", associatedServiceIngressGroupID=" + associatedServiceIngressGroupID + ", associatedServiceIngressRedirectID=" + associatedServiceIngressRedirectID + ", description=" + description + ", destinationNATAddress=" + destinationNATAddress + ", destinationNATEnabled=" + destinationNATEnabled + ", destinationNATMask=" + destinationNATMask + ", egressType=" + egressType + ", entityScope=" + entityScope + ", externalID=" + externalID + ", ingressType=" + ingressType + ", lastUpdatedBy=" + lastUpdatedBy + ", metadata=" + metadata + ", name=" + name + ", sourceNATAddress=" + sourceNATAddress + ", sourceNATEnabled=" + sourceNATEnabled + ", virtualIP=" + virtualIP + ", virtualIPRequired=" + virtualIPRequired + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}