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

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayProfileIKEGatewayIdentifierType;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayProfileAssociatedIKEAuthenticationType;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayProfileEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayProfileServiceClass;
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

@VsoFinder(name = Constants.IKEGATEWAYPROFILE, datasource = Constants.DATASOURCE, image = Constants.IKEGATEWAYPROFILE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikegatewayprofile", resourceName = "ikegatewayprofiles")
public class IKEGatewayProfile extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "IKEGatewayIdentifier")
    protected String IKEGatewayIdentifier;
    
    @JsonProperty(value = "IKEGatewayIdentifierType")
    protected IKEGatewayProfileIKEGatewayIdentifierType IKEGatewayIdentifierType;
    
    @JsonProperty(value = "antiReplayCheck")
    protected Boolean antiReplayCheck;
    
    @JsonProperty(value = "associatedEnterpriseID")
    protected String associatedEnterpriseID;
    
    @JsonProperty(value = "associatedIKEAuthenticationID")
    protected String associatedIKEAuthenticationID;
    
    @JsonProperty(value = "associatedIKEAuthenticationType")
    protected IKEGatewayProfileAssociatedIKEAuthenticationType associatedIKEAuthenticationType;
    
    @JsonProperty(value = "associatedIKEEncryptionProfileID")
    protected String associatedIKEEncryptionProfileID;
    
    @JsonProperty(value = "associatedIKEGatewayID")
    protected String associatedIKEGatewayID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "entityScope")
    protected IKEGatewayProfileEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "serviceClass")
    protected IKEGatewayProfileServiceClass serviceClass;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public IKEGatewayProfile() {
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
    @VsoProperty(displayName = "IKEGatewayIdentifier", readOnly = false)   
    public String getIKEGatewayIdentifier() {
       return IKEGatewayIdentifier;
    }

    @JsonIgnore
    public void setIKEGatewayIdentifier(String value) { 
        this.IKEGatewayIdentifier = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKEGatewayIdentifierType", readOnly = false)   
    public IKEGatewayProfileIKEGatewayIdentifierType getIKEGatewayIdentifierType() {
       return IKEGatewayIdentifierType;
    }

    @JsonIgnore
    public void setIKEGatewayIdentifierType(IKEGatewayProfileIKEGatewayIdentifierType value) { 
        this.IKEGatewayIdentifierType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AntiReplayCheck", readOnly = false)   
    public Boolean getAntiReplayCheck() {
       return antiReplayCheck;
    }

    @JsonIgnore
    public void setAntiReplayCheck(Boolean value) { 
        this.antiReplayCheck = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEnterpriseID", readOnly = false)   
    public String getAssociatedEnterpriseID() {
       return associatedEnterpriseID;
    }

    @JsonIgnore
    public void setAssociatedEnterpriseID(String value) { 
        this.associatedEnterpriseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEAuthenticationID", readOnly = false)   
    public String getAssociatedIKEAuthenticationID() {
       return associatedIKEAuthenticationID;
    }

    @JsonIgnore
    public void setAssociatedIKEAuthenticationID(String value) { 
        this.associatedIKEAuthenticationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEAuthenticationType", readOnly = false)   
    public IKEGatewayProfileAssociatedIKEAuthenticationType getAssociatedIKEAuthenticationType() {
       return associatedIKEAuthenticationType;
    }

    @JsonIgnore
    public void setAssociatedIKEAuthenticationType(IKEGatewayProfileAssociatedIKEAuthenticationType value) { 
        this.associatedIKEAuthenticationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEEncryptionProfileID", readOnly = false)   
    public String getAssociatedIKEEncryptionProfileID() {
       return associatedIKEEncryptionProfileID;
    }

    @JsonIgnore
    public void setAssociatedIKEEncryptionProfileID(String value) { 
        this.associatedIKEEncryptionProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEGatewayID", readOnly = false)   
    public String getAssociatedIKEGatewayID() {
       return associatedIKEGatewayID;
    }

    @JsonIgnore
    public void setAssociatedIKEGatewayID(String value) { 
        this.associatedIKEGatewayID = value;
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
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public IKEGatewayProfileEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(IKEGatewayProfileEntityScope value) { 
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
    @VsoProperty(displayName = "LastUpdatedBy", readOnly = false)   
    public String getLastUpdatedBy() {
       return lastUpdatedBy;
    }

    @JsonIgnore
    public void setLastUpdatedBy(String value) { 
        this.lastUpdatedBy = value;
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
    @VsoProperty(displayName = "ServiceClass", readOnly = false)   
    public IKEGatewayProfileServiceClass getServiceClass() {
       return serviceClass;
    }

    @JsonIgnore
    public void setServiceClass(IKEGatewayProfileServiceClass value) { 
        this.serviceClass = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYPROFILE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.IKEGATEWAYPROFILE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYPROFILE, getId());
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
        return "IKEGatewayProfile [" + "IKEGatewayIdentifier=" + IKEGatewayIdentifier + ", IKEGatewayIdentifierType=" + IKEGatewayIdentifierType + ", antiReplayCheck=" + antiReplayCheck + ", associatedEnterpriseID=" + associatedEnterpriseID + ", associatedIKEAuthenticationID=" + associatedIKEAuthenticationID + ", associatedIKEAuthenticationType=" + associatedIKEAuthenticationType + ", associatedIKEEncryptionProfileID=" + associatedIKEEncryptionProfileID + ", associatedIKEGatewayID=" + associatedIKEGatewayID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", serviceClass=" + serviceClass + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}