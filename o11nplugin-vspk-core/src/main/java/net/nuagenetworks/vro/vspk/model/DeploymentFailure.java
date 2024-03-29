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

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.DeploymentFailureEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.DeploymentFailureEventType;
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

@VsoFinder(name = Constants.DEPLOYMENTFAILURE, datasource = Constants.DATASOURCE, image = Constants.DEPLOYMENTFAILURE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "deploymentfailure", resourceName = "deploymentfailures")
public class DeploymentFailure extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "affectedEntityID")
    protected String affectedEntityID;
    
    @JsonProperty(value = "affectedEntityType")
    protected String affectedEntityType;
    
    @JsonProperty(value = "assocEntityId")
    protected String assocEntityId;
    
    @JsonProperty(value = "assocEntityType")
    protected String assocEntityType;
    
    @JsonProperty(value = "associatedDomainID")
    protected String associatedDomainID;
    
    @JsonProperty(value = "associatedDomainType")
    protected String associatedDomainType;
    
    @JsonProperty(value = "associatedNetworkEntityID")
    protected String associatedNetworkEntityID;
    
    @JsonProperty(value = "associatedNetworkEntityType")
    protected String associatedNetworkEntityType;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "diffMap")
    protected String diffMap;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected DeploymentFailureEntityScope entityScope;
    
    @JsonProperty(value = "errorCondition")
    protected Long errorCondition;
    
    @JsonProperty(value = "eventType")
    protected DeploymentFailureEventType eventType;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastFailureReason")
    protected String lastFailureReason;
    
    @JsonProperty(value = "lastKnownError")
    protected String lastKnownError;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "numberOfOccurences")
    protected Long numberOfOccurences;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public DeploymentFailure() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
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
    @JsonIgnore
    @VsoProperty(displayName = "AffectedEntityID", readOnly = false)   
    public String getAffectedEntityID() {
       return affectedEntityID;
    }

    @JsonIgnore
    public void setAffectedEntityID(String value) { 
        this.affectedEntityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AffectedEntityType", readOnly = false)   
    public String getAffectedEntityType() {
       return affectedEntityType;
    }

    @JsonIgnore
    public void setAffectedEntityType(String value) { 
        this.affectedEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssocEntityId", readOnly = false)   
    public String getAssocEntityId() {
       return assocEntityId;
    }

    @JsonIgnore
    public void setAssocEntityId(String value) { 
        this.assocEntityId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssocEntityType", readOnly = false)   
    public String getAssocEntityType() {
       return assocEntityType;
    }

    @JsonIgnore
    public void setAssocEntityType(String value) { 
        this.assocEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDomainID", readOnly = false)   
    public String getAssociatedDomainID() {
       return associatedDomainID;
    }

    @JsonIgnore
    public void setAssociatedDomainID(String value) { 
        this.associatedDomainID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDomainType", readOnly = false)   
    public String getAssociatedDomainType() {
       return associatedDomainType;
    }

    @JsonIgnore
    public void setAssociatedDomainType(String value) { 
        this.associatedDomainType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNetworkEntityID", readOnly = false)   
    public String getAssociatedNetworkEntityID() {
       return associatedNetworkEntityID;
    }

    @JsonIgnore
    public void setAssociatedNetworkEntityID(String value) { 
        this.associatedNetworkEntityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNetworkEntityType", readOnly = false)   
    public String getAssociatedNetworkEntityType() {
       return associatedNetworkEntityType;
    }

    @JsonIgnore
    public void setAssociatedNetworkEntityType(String value) { 
        this.associatedNetworkEntityType = value;
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
    @VsoProperty(displayName = "DiffMap", readOnly = false)   
    public String getDiffMap() {
       return diffMap;
    }

    @JsonIgnore
    public void setDiffMap(String value) { 
        this.diffMap = value;
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
    public DeploymentFailureEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(DeploymentFailureEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ErrorCondition", readOnly = false)   
    public Long getErrorCondition() {
       return errorCondition;
    }

    @JsonIgnore
    public void setErrorCondition(Long value) { 
        this.errorCondition = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventType", readOnly = false)   
    public DeploymentFailureEventType getEventType() {
       return eventType;
    }

    @JsonIgnore
    public void setEventType(DeploymentFailureEventType value) { 
        this.eventType = value;
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
    @VsoProperty(displayName = "LastFailureReason", readOnly = false)   
    public String getLastFailureReason() {
       return lastFailureReason;
    }

    @JsonIgnore
    public void setLastFailureReason(String value) { 
        this.lastFailureReason = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastKnownError", readOnly = false)   
    public String getLastKnownError() {
       return lastKnownError;
    }

    @JsonIgnore
    public void setLastKnownError(String value) { 
        this.lastKnownError = value;
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
    @VsoProperty(displayName = "NumberOfOccurences", readOnly = false)   
    public Long getNumberOfOccurences() {
       return numberOfOccurences;
    }

    @JsonIgnore
    public void setNumberOfOccurences(Long value) { 
        this.numberOfOccurences = value;
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
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.DEPLOYMENTFAILURE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.DEPLOYMENTFAILURE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DEPLOYMENTFAILURE, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DEPLOYMENTFAILURE, getId());
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
    }
    @VsoMethod
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }public String toString() {
        return "DeploymentFailure [" + "affectedEntityID=" + affectedEntityID + ", affectedEntityType=" + affectedEntityType + ", assocEntityId=" + assocEntityId + ", assocEntityType=" + assocEntityType + ", associatedDomainID=" + associatedDomainID + ", associatedDomainType=" + associatedDomainType + ", associatedNetworkEntityID=" + associatedNetworkEntityID + ", associatedNetworkEntityType=" + associatedNetworkEntityType + ", creationDate=" + creationDate + ", diffMap=" + diffMap + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", errorCondition=" + errorCondition + ", eventType=" + eventType + ", externalID=" + externalID + ", lastFailureReason=" + lastFailureReason + ", lastKnownError=" + lastKnownError + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", numberOfOccurences=" + numberOfOccurences + ", owner=" + owner + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}