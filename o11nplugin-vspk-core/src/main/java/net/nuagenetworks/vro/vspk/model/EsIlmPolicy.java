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

import net.nuagenetworks.vro.vspk.model.enums.EsIlmPolicyEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.EsIlmPolicyEsIlmPolicyType;
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

@VsoFinder(name = Constants.ESILMPOLICY, datasource = Constants.DATASOURCE, image = Constants.ESILMPOLICY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "esilmpolicy", resourceName = "esilmpolicies")
public class EsIlmPolicy extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "coldPhaseEnabled")
    protected Boolean coldPhaseEnabled;
    
    @JsonProperty(value = "coldTimer")
    protected Long coldTimer;
    
    @JsonProperty(value = "deletePhaseEnabled")
    protected Boolean deletePhaseEnabled;
    
    @JsonProperty(value = "deleteTimer")
    protected Long deleteTimer;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected EsIlmPolicyEntityScope entityScope;
    
    @JsonProperty(value = "esIlmPolicyType")
    protected EsIlmPolicyEsIlmPolicyType esIlmPolicyType;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "forceMergeEnabled")
    protected Boolean forceMergeEnabled;
    
    @JsonProperty(value = "forceMergeMaxNumSegments")
    protected Long forceMergeMaxNumSegments;
    
    @JsonProperty(value = "indexFreeze")
    protected Boolean indexFreeze;
    
    @JsonProperty(value = "indexReadOnly")
    protected Boolean indexReadOnly;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "rolloverMaxAge")
    protected Long rolloverMaxAge;
    
    @JsonProperty(value = "rolloverMaxDocs")
    protected Long rolloverMaxDocs;
    
    @JsonProperty(value = "rolloverMaxSize")
    protected Long rolloverMaxSize;
    
    @JsonProperty(value = "warmPhaseEnabled")
    protected Boolean warmPhaseEnabled;
    
    @JsonProperty(value = "warmTimer")
    protected Long warmTimer;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public EsIlmPolicy() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
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
    @VsoProperty(displayName = "ColdPhaseEnabled", readOnly = false)   
    public Boolean getColdPhaseEnabled() {
       return coldPhaseEnabled;
    }

    @JsonIgnore
    public void setColdPhaseEnabled(Boolean value) { 
        this.coldPhaseEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ColdTimer", readOnly = false)   
    public Long getColdTimer() {
       return coldTimer;
    }

    @JsonIgnore
    public void setColdTimer(Long value) { 
        this.coldTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeletePhaseEnabled", readOnly = false)   
    public Boolean getDeletePhaseEnabled() {
       return deletePhaseEnabled;
    }

    @JsonIgnore
    public void setDeletePhaseEnabled(Boolean value) { 
        this.deletePhaseEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeleteTimer", readOnly = false)   
    public Long getDeleteTimer() {
       return deleteTimer;
    }

    @JsonIgnore
    public void setDeleteTimer(Long value) { 
        this.deleteTimer = value;
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
    public EsIlmPolicyEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(EsIlmPolicyEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EsIlmPolicyType", readOnly = false)   
    public EsIlmPolicyEsIlmPolicyType getEsIlmPolicyType() {
       return esIlmPolicyType;
    }

    @JsonIgnore
    public void setEsIlmPolicyType(EsIlmPolicyEsIlmPolicyType value) { 
        this.esIlmPolicyType = value;
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
    @VsoProperty(displayName = "ForceMergeEnabled", readOnly = false)   
    public Boolean getForceMergeEnabled() {
       return forceMergeEnabled;
    }

    @JsonIgnore
    public void setForceMergeEnabled(Boolean value) { 
        this.forceMergeEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ForceMergeMaxNumSegments", readOnly = false)   
    public Long getForceMergeMaxNumSegments() {
       return forceMergeMaxNumSegments;
    }

    @JsonIgnore
    public void setForceMergeMaxNumSegments(Long value) { 
        this.forceMergeMaxNumSegments = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IndexFreeze", readOnly = false)   
    public Boolean getIndexFreeze() {
       return indexFreeze;
    }

    @JsonIgnore
    public void setIndexFreeze(Boolean value) { 
        this.indexFreeze = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IndexReadOnly", readOnly = false)   
    public Boolean getIndexReadOnly() {
       return indexReadOnly;
    }

    @JsonIgnore
    public void setIndexReadOnly(Boolean value) { 
        this.indexReadOnly = value;
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
    @VsoProperty(displayName = "RolloverMaxAge", readOnly = false)   
    public Long getRolloverMaxAge() {
       return rolloverMaxAge;
    }

    @JsonIgnore
    public void setRolloverMaxAge(Long value) { 
        this.rolloverMaxAge = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RolloverMaxDocs", readOnly = false)   
    public Long getRolloverMaxDocs() {
       return rolloverMaxDocs;
    }

    @JsonIgnore
    public void setRolloverMaxDocs(Long value) { 
        this.rolloverMaxDocs = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RolloverMaxSize", readOnly = false)   
    public Long getRolloverMaxSize() {
       return rolloverMaxSize;
    }

    @JsonIgnore
    public void setRolloverMaxSize(Long value) { 
        this.rolloverMaxSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WarmPhaseEnabled", readOnly = false)   
    public Boolean getWarmPhaseEnabled() {
       return warmPhaseEnabled;
    }

    @JsonIgnore
    public void setWarmPhaseEnabled(Boolean value) { 
        this.warmPhaseEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WarmTimer", readOnly = false)   
    public Long getWarmTimer() {
       return warmTimer;
    }

    @JsonIgnore
    public void setWarmTimer(Long value) { 
        this.warmTimer = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.ESILMPOLICY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ESILMPOLICY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ESILMPOLICY, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ESILMPOLICY, getId());
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
        return "EsIlmPolicy [" + "coldPhaseEnabled=" + coldPhaseEnabled + ", coldTimer=" + coldTimer + ", deletePhaseEnabled=" + deletePhaseEnabled + ", deleteTimer=" + deleteTimer + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", esIlmPolicyType=" + esIlmPolicyType + ", externalID=" + externalID + ", forceMergeEnabled=" + forceMergeEnabled + ", forceMergeMaxNumSegments=" + forceMergeMaxNumSegments + ", indexFreeze=" + indexFreeze + ", indexReadOnly=" + indexReadOnly + ", name=" + name + ", rolloverMaxAge=" + rolloverMaxAge + ", rolloverMaxDocs=" + rolloverMaxDocs + ", rolloverMaxSize=" + rolloverMaxSize + ", warmPhaseEnabled=" + warmPhaseEnabled + ", warmTimer=" + warmTimer + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}