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

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMonitorEncryptedSeedsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMonitorSeedsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMonitorSEKsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.KeyServerMonitorEntityScope;
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

@VsoFinder(name = Constants.KEYSERVERMONITOR, datasource = Constants.DATASOURCE, image = Constants.KEYSERVERMONITOR_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, type = Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.KEYSERVERMONITORSEEDS_FETCHER, type = Constants.KEYSERVERMONITORSEEDS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.KEYSERVERMONITORSEKS_FETCHER, type = Constants.KEYSERVERMONITORSEKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitor", resourceName = "keyservermonitors")
public class KeyServerMonitor extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "enterpriseSecuredDataRecordCount")
    protected Long enterpriseSecuredDataRecordCount;
    
    @JsonProperty(value = "entityScope")
    protected KeyServerMonitorEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gatewaySecuredDataRecordCount")
    protected Long gatewaySecuredDataRecordCount;
    
    @JsonProperty(value = "keyserverMonitorEncryptedSEKCount")
    protected Long keyserverMonitorEncryptedSEKCount;
    
    @JsonProperty(value = "keyserverMonitorEncryptedSeedCount")
    protected Long keyserverMonitorEncryptedSeedCount;
    
    @JsonProperty(value = "keyserverMonitorSEKCount")
    protected Long keyserverMonitorSEKCount;
    
    @JsonProperty(value = "keyserverMonitorSeedCount")
    protected Long keyserverMonitorSeedCount;
    
    @JsonProperty(value = "lastUpdateTime")
    protected Long lastUpdateTime;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private KeyServerMonitorEncryptedSeedsFetcher keyServerMonitorEncryptedSeeds;
    
    @JsonIgnore
    private KeyServerMonitorSeedsFetcher keyServerMonitorSeeds;
    
    @JsonIgnore
    private KeyServerMonitorSEKsFetcher keyServerMonitorSEKs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public KeyServerMonitor() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        keyServerMonitorEncryptedSeeds = new KeyServerMonitorEncryptedSeedsFetcher(this);
        
        keyServerMonitorSeeds = new KeyServerMonitorSeedsFetcher(this);
        
        keyServerMonitorSEKs = new KeyServerMonitorSEKsFetcher(this);
        
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
    @VsoProperty(displayName = "EnterpriseSecuredDataRecordCount", readOnly = false)   
    public Long getEnterpriseSecuredDataRecordCount() {
       return enterpriseSecuredDataRecordCount;
    }

    @JsonIgnore
    public void setEnterpriseSecuredDataRecordCount(Long value) { 
        this.enterpriseSecuredDataRecordCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public KeyServerMonitorEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(KeyServerMonitorEntityScope value) { 
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
    @VsoProperty(displayName = "GatewaySecuredDataRecordCount", readOnly = false)   
    public Long getGatewaySecuredDataRecordCount() {
       return gatewaySecuredDataRecordCount;
    }

    @JsonIgnore
    public void setGatewaySecuredDataRecordCount(Long value) { 
        this.gatewaySecuredDataRecordCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyserverMonitorEncryptedSEKCount", readOnly = false)   
    public Long getKeyserverMonitorEncryptedSEKCount() {
       return keyserverMonitorEncryptedSEKCount;
    }

    @JsonIgnore
    public void setKeyserverMonitorEncryptedSEKCount(Long value) { 
        this.keyserverMonitorEncryptedSEKCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyserverMonitorEncryptedSeedCount", readOnly = false)   
    public Long getKeyserverMonitorEncryptedSeedCount() {
       return keyserverMonitorEncryptedSeedCount;
    }

    @JsonIgnore
    public void setKeyserverMonitorEncryptedSeedCount(Long value) { 
        this.keyserverMonitorEncryptedSeedCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyserverMonitorSEKCount", readOnly = false)   
    public Long getKeyserverMonitorSEKCount() {
       return keyserverMonitorSEKCount;
    }

    @JsonIgnore
    public void setKeyserverMonitorSEKCount(Long value) { 
        this.keyserverMonitorSEKCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyserverMonitorSeedCount", readOnly = false)   
    public Long getKeyserverMonitorSeedCount() {
       return keyserverMonitorSeedCount;
    }

    @JsonIgnore
    public void setKeyserverMonitorSeedCount(Long value) { 
        this.keyserverMonitorSeedCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastUpdateTime", readOnly = false)   
    public Long getLastUpdateTime() {
       return lastUpdateTime;
    }

    @JsonIgnore
    public void setLastUpdateTime(Long value) { 
        this.lastUpdateTime = value;
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
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerMonitorEncryptedSeeds", readOnly = true)   
    public KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeeds() {
        return keyServerMonitorEncryptedSeeds;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerMonitorSeeds", readOnly = true)   
    public KeyServerMonitorSeedsFetcher getKeyServerMonitorSeeds() {
        return keyServerMonitorSeeds;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerMonitorSEKs", readOnly = true)   
    public KeyServerMonitorSEKsFetcher getKeyServerMonitorSEKs() {
        return keyServerMonitorSEKs;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.KEYSERVERMONITOR, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.KEYSERVERMONITOR, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.KEYSERVERMONITOR, getId());
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
    public void createKeyServerMonitorEncryptedSeed(Session session, KeyServerMonitorEncryptedSeed childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createKeyServerMonitorSeed(Session session, KeyServerMonitorSeed childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.KEYSERVERMONITORSEEDS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createKeyServerMonitorSEK(Session session, KeyServerMonitorSEK childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.KEYSERVERMONITORSEKS_FETCHER, getId());
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
        return "KeyServerMonitor [" + "enterpriseSecuredDataRecordCount=" + enterpriseSecuredDataRecordCount + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewaySecuredDataRecordCount=" + gatewaySecuredDataRecordCount + ", keyserverMonitorEncryptedSEKCount=" + keyserverMonitorEncryptedSEKCount + ", keyserverMonitorEncryptedSeedCount=" + keyserverMonitorEncryptedSeedCount + ", keyserverMonitorSEKCount=" + keyserverMonitorSEKCount + ", keyserverMonitorSeedCount=" + keyserverMonitorSeedCount + ", lastUpdateTime=" + lastUpdateTime + ", lastUpdatedBy=" + lastUpdatedBy + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}