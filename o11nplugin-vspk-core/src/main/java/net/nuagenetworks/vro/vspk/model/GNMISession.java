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

import net.nuagenetworks.vro.vspk.model.enums.GNMISessionEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.GNMISessionGatewayVendor;

import net.nuagenetworks.vro.vspk.model.enums.GNMISessionStatus;

import net.nuagenetworks.vro.vspk.model.enums.GNMISessionSubscriptionState;
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

@VsoFinder(name = Constants.GNMISESSION, datasource = Constants.DATASOURCE, image = Constants.GNMISESSION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "gnmisession", resourceName = "gnmisessions")
public class GNMISession extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedGatewayID")
    protected String associatedGatewayID;
    
    @JsonProperty(value = "associatedGatewayName")
    protected String associatedGatewayName;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected GNMISessionEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gatewayModel")
    protected String gatewayModel;
    
    @JsonProperty(value = "gatewayVendor")
    protected GNMISessionGatewayVendor gatewayVendor;
    
    @JsonProperty(value = "gatewayVersion")
    protected String gatewayVersion;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "status")
    protected GNMISessionStatus status;
    
    @JsonProperty(value = "subscriptionError")
    protected String subscriptionError;
    
    @JsonProperty(value = "subscriptionFailureReason")
    protected String subscriptionFailureReason;
    
    @JsonProperty(value = "subscriptionFailureRetryCount")
    protected Long subscriptionFailureRetryCount;
    
    @JsonProperty(value = "subscriptionState")
    protected GNMISessionSubscriptionState subscriptionState;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public GNMISession() {
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
    @VsoProperty(displayName = "AssociatedGatewayID", readOnly = false)   
    public String getAssociatedGatewayID() {
       return associatedGatewayID;
    }

    @JsonIgnore
    public void setAssociatedGatewayID(String value) { 
        this.associatedGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayName", readOnly = false)   
    public String getAssociatedGatewayName() {
       return associatedGatewayName;
    }

    @JsonIgnore
    public void setAssociatedGatewayName(String value) { 
        this.associatedGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CreationDate", readOnly = false)   
    public String getCreationDate() {
       return creationDate;
    }

    @JsonIgnore
    public void setCreationDate(String value) { 
        this.creationDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EmbeddedMetadata", readOnly = false)   
    public java.util.List<String> getEmbeddedMetadata() {
       return embeddedMetadata;
    }

    @JsonIgnore
    public void setEmbeddedMetadata(java.util.List<String> value) { 
        this.embeddedMetadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public GNMISessionEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(GNMISessionEntityScope value) { 
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
    @VsoProperty(displayName = "GatewayModel", readOnly = false)   
    public String getGatewayModel() {
       return gatewayModel;
    }

    @JsonIgnore
    public void setGatewayModel(String value) { 
        this.gatewayModel = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayVendor", readOnly = false)   
    public GNMISessionGatewayVendor getGatewayVendor() {
       return gatewayVendor;
    }

    @JsonIgnore
    public void setGatewayVendor(GNMISessionGatewayVendor value) { 
        this.gatewayVendor = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayVersion", readOnly = false)   
    public String getGatewayVersion() {
       return gatewayVersion;
    }

    @JsonIgnore
    public void setGatewayVersion(String value) { 
        this.gatewayVersion = value;
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
    @VsoProperty(displayName = "LastUpdatedDate", readOnly = false)   
    public String getLastUpdatedDate() {
       return lastUpdatedDate;
    }

    @JsonIgnore
    public void setLastUpdatedDate(String value) { 
        this.lastUpdatedDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Owner", readOnly = false)   
    public String getOwner() {
       return owner;
    }

    @JsonIgnore
    public void setOwner(String value) { 
        this.owner = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public GNMISessionStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(GNMISessionStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubscriptionError", readOnly = false)   
    public String getSubscriptionError() {
       return subscriptionError;
    }

    @JsonIgnore
    public void setSubscriptionError(String value) { 
        this.subscriptionError = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubscriptionFailureReason", readOnly = false)   
    public String getSubscriptionFailureReason() {
       return subscriptionFailureReason;
    }

    @JsonIgnore
    public void setSubscriptionFailureReason(String value) { 
        this.subscriptionFailureReason = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubscriptionFailureRetryCount", readOnly = false)   
    public Long getSubscriptionFailureRetryCount() {
       return subscriptionFailureRetryCount;
    }

    @JsonIgnore
    public void setSubscriptionFailureRetryCount(Long value) { 
        this.subscriptionFailureRetryCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubscriptionState", readOnly = false)   
    public GNMISessionSubscriptionState getSubscriptionState() {
       return subscriptionState;
    }

    @JsonIgnore
    public void setSubscriptionState(GNMISessionSubscriptionState value) { 
        this.subscriptionState = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.GNMISESSION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.GNMISESSION, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.GNMISESSION, getId());
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
        return "GNMISession [" + "associatedGatewayID=" + associatedGatewayID + ", associatedGatewayName=" + associatedGatewayName + ", creationDate=" + creationDate + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayModel=" + gatewayModel + ", gatewayVendor=" + gatewayVendor + ", gatewayVersion=" + gatewayVersion + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", owner=" + owner + ", status=" + status + ", subscriptionError=" + subscriptionError + ", subscriptionFailureReason=" + subscriptionFailureReason + ", subscriptionFailureRetryCount=" + subscriptionFailureRetryCount + ", subscriptionState=" + subscriptionState + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}