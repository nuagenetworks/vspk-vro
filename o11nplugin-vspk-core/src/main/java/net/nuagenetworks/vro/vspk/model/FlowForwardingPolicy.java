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
import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.FlowForwardingPolicyAssociatedNetworkObjectType;

import net.nuagenetworks.vro.vspk.model.enums.FlowForwardingPolicyEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.FlowForwardingPolicyType;
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

@VsoFinder(name = Constants.FLOWFORWARDINGPOLICY, datasource = Constants.DATASOURCE, image = Constants.FLOWFORWARDINGPOLICY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "flowforwardingpolicy", resourceName = "flowforwardingpolicies")
public class FlowForwardingPolicy extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedApplicationServiceID")
    protected String associatedApplicationServiceID;
    
    @JsonProperty(value = "associatedNetworkObjectID")
    protected String associatedNetworkObjectID;
    
    @JsonProperty(value = "associatedNetworkObjectType")
    protected FlowForwardingPolicyAssociatedNetworkObjectType associatedNetworkObjectType;
    
    @JsonProperty(value = "destinationAddressOverwrite")
    protected String destinationAddressOverwrite;
    
    @JsonProperty(value = "entityScope")
    protected FlowForwardingPolicyEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowID")
    protected String flowID;
    
    @JsonProperty(value = "redirectTargetID")
    protected String redirectTargetID;
    
    @JsonProperty(value = "sourceAddressOverwrite")
    protected String sourceAddressOverwrite;
    
    @JsonProperty(value = "type")
    protected FlowForwardingPolicyType type;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public FlowForwardingPolicy() {
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "Name", readOnly = false)
    public String getName() {
        return getId();
    }
    @VsoProperty(displayName = "RestName", readOnly = true)
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
    @VsoProperty(displayName = "AssociatedApplicationServiceID", readOnly = false)   
    public String getAssociatedApplicationServiceID() {
       return associatedApplicationServiceID;
    }

    @JsonIgnore
    public void setAssociatedApplicationServiceID(String value) { 
        this.associatedApplicationServiceID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNetworkObjectID", readOnly = false)   
    public String getAssociatedNetworkObjectID() {
       return associatedNetworkObjectID;
    }

    @JsonIgnore
    public void setAssociatedNetworkObjectID(String value) { 
        this.associatedNetworkObjectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNetworkObjectType", readOnly = false)   
    public FlowForwardingPolicyAssociatedNetworkObjectType getAssociatedNetworkObjectType() {
       return associatedNetworkObjectType;
    }

    @JsonIgnore
    public void setAssociatedNetworkObjectType(FlowForwardingPolicyAssociatedNetworkObjectType value) { 
        this.associatedNetworkObjectType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationAddressOverwrite", readOnly = false)   
    public String getDestinationAddressOverwrite() {
       return destinationAddressOverwrite;
    }

    @JsonIgnore
    public void setDestinationAddressOverwrite(String value) { 
        this.destinationAddressOverwrite = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public FlowForwardingPolicyEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(FlowForwardingPolicyEntityScope value) { 
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
    @VsoProperty(displayName = "FlowID", readOnly = false)   
    public String getFlowID() {
       return flowID;
    }

    @JsonIgnore
    public void setFlowID(String value) { 
        this.flowID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectTargetID", readOnly = false)   
    public String getRedirectTargetID() {
       return redirectTargetID;
    }

    @JsonIgnore
    public void setRedirectTargetID(String value) { 
        this.redirectTargetID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceAddressOverwrite", readOnly = false)   
    public String getSourceAddressOverwrite() {
       return sourceAddressOverwrite;
    }

    @JsonIgnore
    public void setSourceAddressOverwrite(String value) { 
        this.sourceAddressOverwrite = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public FlowForwardingPolicyType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(FlowForwardingPolicyType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.FLOWFORWARDINGPOLICY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.FLOWFORWARDINGPOLICY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.FLOWFORWARDINGPOLICY, getId());
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
        return "FlowForwardingPolicy [" + "associatedApplicationServiceID=" + associatedApplicationServiceID + ", associatedNetworkObjectID=" + associatedNetworkObjectID + ", associatedNetworkObjectType=" + associatedNetworkObjectType + ", destinationAddressOverwrite=" + destinationAddressOverwrite + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowID=" + flowID + ", redirectTargetID=" + redirectTargetID + ", sourceAddressOverwrite=" + sourceAddressOverwrite + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}