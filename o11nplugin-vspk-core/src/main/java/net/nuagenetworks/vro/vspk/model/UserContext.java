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

import net.nuagenetworks.vro.vspk.model.enums.UserContextEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.UserContextSystemAvatarType;
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

@VsoFinder(name = Constants.USERCONTEXT, datasource = Constants.DATASOURCE, image = Constants.USERCONTEXT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "usercontext", resourceName = "usercontexts")
public class UserContext extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "AARFlowStatsInterval")
    protected Long AARFlowStatsInterval;
    
    @JsonProperty(value = "AARProbeStatsInterval")
    protected Long AARProbeStatsInterval;
    
    @JsonProperty(value = "VSSFeatureEnabled")
    protected Boolean VSSFeatureEnabled;
    
    @JsonProperty(value = "VSSStatsInterval")
    protected Long VSSStatsInterval;
    
    @JsonProperty(value = "allowEnterpriseAvatarOnNSG")
    protected Boolean allowEnterpriseAvatarOnNSG;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "deniedFlowCollectionEnabled")
    protected Boolean deniedFlowCollectionEnabled;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected UserContextEntityScope entityScope;
    
    @JsonProperty(value = "explicitACLMatchingEnabled")
    protected Boolean explicitACLMatchingEnabled;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowCollectionEnabled")
    protected Boolean flowCollectionEnabled;
    
    @JsonProperty(value = "googleMapsAPIKey")
    protected String googleMapsAPIKey;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "maintenanceModeEnabled")
    protected Boolean maintenanceModeEnabled;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "pageSize")
    protected Long pageSize;
    
    @JsonProperty(value = "rbacEnabled")
    protected Boolean rbacEnabled;
    
    @JsonProperty(value = "statisticsEnabled")
    protected Boolean statisticsEnabled;
    
    @JsonProperty(value = "statsDatabaseProxy")
    protected String statsDatabaseProxy;
    
    @JsonProperty(value = "statsTSDBServerAddress")
    protected String statsTSDBServerAddress;
    
    @JsonProperty(value = "systemAvatarData")
    protected String systemAvatarData;
    
    @JsonProperty(value = "systemAvatarType")
    protected UserContextSystemAvatarType systemAvatarType;
    
    @JsonProperty(value = "threatIntelligenceEnabled")
    protected Boolean threatIntelligenceEnabled;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public UserContext() {
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
    @VsoProperty(displayName = "AARFlowStatsInterval", readOnly = false)   
    public Long getAARFlowStatsInterval() {
       return AARFlowStatsInterval;
    }

    @JsonIgnore
    public void setAARFlowStatsInterval(Long value) { 
        this.AARFlowStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AARProbeStatsInterval", readOnly = false)   
    public Long getAARProbeStatsInterval() {
       return AARProbeStatsInterval;
    }

    @JsonIgnore
    public void setAARProbeStatsInterval(Long value) { 
        this.AARProbeStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSSFeatureEnabled", readOnly = false)   
    public Boolean getVSSFeatureEnabled() {
       return VSSFeatureEnabled;
    }

    @JsonIgnore
    public void setVSSFeatureEnabled(Boolean value) { 
        this.VSSFeatureEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSSStatsInterval", readOnly = false)   
    public Long getVSSStatsInterval() {
       return VSSStatsInterval;
    }

    @JsonIgnore
    public void setVSSStatsInterval(Long value) { 
        this.VSSStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowEnterpriseAvatarOnNSG", readOnly = false)   
    public Boolean getAllowEnterpriseAvatarOnNSG() {
       return allowEnterpriseAvatarOnNSG;
    }

    @JsonIgnore
    public void setAllowEnterpriseAvatarOnNSG(Boolean value) { 
        this.allowEnterpriseAvatarOnNSG = value;
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
    @VsoProperty(displayName = "DeniedFlowCollectionEnabled", readOnly = false)   
    public Boolean getDeniedFlowCollectionEnabled() {
       return deniedFlowCollectionEnabled;
    }

    @JsonIgnore
    public void setDeniedFlowCollectionEnabled(Boolean value) { 
        this.deniedFlowCollectionEnabled = value;
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
    public UserContextEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(UserContextEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExplicitACLMatchingEnabled", readOnly = false)   
    public Boolean getExplicitACLMatchingEnabled() {
       return explicitACLMatchingEnabled;
    }

    @JsonIgnore
    public void setExplicitACLMatchingEnabled(Boolean value) { 
        this.explicitACLMatchingEnabled = value;
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
    @VsoProperty(displayName = "FlowCollectionEnabled", readOnly = false)   
    public Boolean getFlowCollectionEnabled() {
       return flowCollectionEnabled;
    }

    @JsonIgnore
    public void setFlowCollectionEnabled(Boolean value) { 
        this.flowCollectionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GoogleMapsAPIKey", readOnly = false)   
    public String getGoogleMapsAPIKey() {
       return googleMapsAPIKey;
    }

    @JsonIgnore
    public void setGoogleMapsAPIKey(String value) { 
        this.googleMapsAPIKey = value;
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
    @VsoProperty(displayName = "MaintenanceModeEnabled", readOnly = false)   
    public Boolean getMaintenanceModeEnabled() {
       return maintenanceModeEnabled;
    }

    @JsonIgnore
    public void setMaintenanceModeEnabled(Boolean value) { 
        this.maintenanceModeEnabled = value;
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
    @VsoProperty(displayName = "PageSize", readOnly = false)   
    public Long getPageSize() {
       return pageSize;
    }

    @JsonIgnore
    public void setPageSize(Long value) { 
        this.pageSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RbacEnabled", readOnly = false)   
    public Boolean getRbacEnabled() {
       return rbacEnabled;
    }

    @JsonIgnore
    public void setRbacEnabled(Boolean value) { 
        this.rbacEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatisticsEnabled", readOnly = false)   
    public Boolean getStatisticsEnabled() {
       return statisticsEnabled;
    }

    @JsonIgnore
    public void setStatisticsEnabled(Boolean value) { 
        this.statisticsEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsDatabaseProxy", readOnly = false)   
    public String getStatsDatabaseProxy() {
       return statsDatabaseProxy;
    }

    @JsonIgnore
    public void setStatsDatabaseProxy(String value) { 
        this.statsDatabaseProxy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsTSDBServerAddress", readOnly = false)   
    public String getStatsTSDBServerAddress() {
       return statsTSDBServerAddress;
    }

    @JsonIgnore
    public void setStatsTSDBServerAddress(String value) { 
        this.statsTSDBServerAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemAvatarData", readOnly = false)   
    public String getSystemAvatarData() {
       return systemAvatarData;
    }

    @JsonIgnore
    public void setSystemAvatarData(String value) { 
        this.systemAvatarData = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemAvatarType", readOnly = false)   
    public UserContextSystemAvatarType getSystemAvatarType() {
       return systemAvatarType;
    }

    @JsonIgnore
    public void setSystemAvatarType(UserContextSystemAvatarType value) { 
        this.systemAvatarType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatIntelligenceEnabled", readOnly = false)   
    public Boolean getThreatIntelligenceEnabled() {
       return threatIntelligenceEnabled;
    }

    @JsonIgnore
    public void setThreatIntelligenceEnabled(Boolean value) { 
        this.threatIntelligenceEnabled = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.USERCONTEXT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.USERCONTEXT, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.USERCONTEXT, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.USERCONTEXT, getId());
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
        return "UserContext [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", VSSFeatureEnabled=" + VSSFeatureEnabled + ", VSSStatsInterval=" + VSSStatsInterval + ", allowEnterpriseAvatarOnNSG=" + allowEnterpriseAvatarOnNSG + ", creationDate=" + creationDate + ", deniedFlowCollectionEnabled=" + deniedFlowCollectionEnabled + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", explicitACLMatchingEnabled=" + explicitACLMatchingEnabled + ", externalID=" + externalID + ", flowCollectionEnabled=" + flowCollectionEnabled + ", googleMapsAPIKey=" + googleMapsAPIKey + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", maintenanceModeEnabled=" + maintenanceModeEnabled + ", owner=" + owner + ", pageSize=" + pageSize + ", rbacEnabled=" + rbacEnabled + ", statisticsEnabled=" + statisticsEnabled + ", statsDatabaseProxy=" + statsDatabaseProxy + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", systemAvatarData=" + systemAvatarData + ", systemAvatarType=" + systemAvatarType + ", threatIntelligenceEnabled=" + threatIntelligenceEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}