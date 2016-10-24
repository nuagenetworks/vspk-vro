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

import net.nuagenetworks.vro.vspk.model.enums.InfrastructureGatewayProfileControllerLessForwardingMode;

import net.nuagenetworks.vro.vspk.model.enums.InfrastructureGatewayProfileEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.InfrastructureGatewayProfileRemoteLogMode;

import net.nuagenetworks.vro.vspk.model.enums.InfrastructureGatewayProfileUpgradeAction;
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

@VsoFinder(name = Constants.INFRASTRUCTUREGATEWAYPROFILE, datasource = Constants.DATASOURCE, image = Constants.INFRASTRUCTUREGATEWAYPROFILE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "infrastructuregatewayprofile", resourceName = "infrastructuregatewayprofiles")
public class InfrastructureGatewayProfile extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "NTPServerKey")
    protected String NTPServerKey;
    
    @JsonProperty(value = "NTPServerKeyID")
    protected Long NTPServerKeyID;
    
    @JsonProperty(value = "controllerLessDuration")
    protected String controllerLessDuration;
    
    @JsonProperty(value = "controllerLessEnabled")
    protected Boolean controllerLessEnabled;
    
    @JsonProperty(value = "controllerLessForwardingMode")
    protected InfrastructureGatewayProfileControllerLessForwardingMode controllerLessForwardingMode;
    
    @JsonProperty(value = "controllerLessRemoteDuration")
    protected String controllerLessRemoteDuration;
    
    @JsonProperty(value = "datapathSyncTimeout")
    protected Long datapathSyncTimeout;
    
    @JsonProperty(value = "deadTimer")
    protected String deadTimer;
    
    @JsonProperty(value = "deadTimerEnabled")
    protected Boolean deadTimerEnabled;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected InfrastructureGatewayProfileEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "forceImmediateSystemSync")
    protected Boolean forceImmediateSystemSync;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "metadataUpgradePath")
    protected String metadataUpgradePath;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "proxyDNSName")
    protected String proxyDNSName;
    
    @JsonProperty(value = "remoteLogMode")
    protected InfrastructureGatewayProfileRemoteLogMode remoteLogMode;
    
    @JsonProperty(value = "remoteLogServerAddress")
    protected String remoteLogServerAddress;
    
    @JsonProperty(value = "remoteLogServerPort")
    protected Long remoteLogServerPort;
    
    @JsonProperty(value = "statsCollectorPort")
    protected Long statsCollectorPort;
    
    @JsonProperty(value = "systemSyncScheduler")
    protected String systemSyncScheduler;
    
    @JsonProperty(value = "upgradeAction")
    protected InfrastructureGatewayProfileUpgradeAction upgradeAction;
    
    @JsonProperty(value = "useTwoFactor")
    protected Boolean useTwoFactor;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public InfrastructureGatewayProfile() {
        upgradeAction = InfrastructureGatewayProfileUpgradeAction.NONE;
        
        statsCollectorPort = 29090L;
        
        systemSyncScheduler = "0 0 * * 0";
        
        useTwoFactor = true;
        
        remoteLogMode = InfrastructureGatewayProfileRemoteLogMode.DISABLED;
        
        datapathSyncTimeout = 1000L;
        
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
    @VsoProperty(displayName = "NTPServerKey", readOnly = false)   
    public String getNTPServerKey() {
       return NTPServerKey;
    }

    @JsonIgnore
    public void setNTPServerKey(String value) { 
        this.NTPServerKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NTPServerKeyID", readOnly = false)   
    public Long getNTPServerKeyID() {
       return NTPServerKeyID;
    }

    @JsonIgnore
    public void setNTPServerKeyID(Long value) { 
        this.NTPServerKeyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControllerLessDuration", readOnly = false)   
    public String getControllerLessDuration() {
       return controllerLessDuration;
    }

    @JsonIgnore
    public void setControllerLessDuration(String value) { 
        this.controllerLessDuration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControllerLessEnabled", readOnly = false)   
    public Boolean getControllerLessEnabled() {
       return controllerLessEnabled;
    }

    @JsonIgnore
    public void setControllerLessEnabled(Boolean value) { 
        this.controllerLessEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControllerLessForwardingMode", readOnly = false)   
    public InfrastructureGatewayProfileControllerLessForwardingMode getControllerLessForwardingMode() {
       return controllerLessForwardingMode;
    }

    @JsonIgnore
    public void setControllerLessForwardingMode(InfrastructureGatewayProfileControllerLessForwardingMode value) { 
        this.controllerLessForwardingMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControllerLessRemoteDuration", readOnly = false)   
    public String getControllerLessRemoteDuration() {
       return controllerLessRemoteDuration;
    }

    @JsonIgnore
    public void setControllerLessRemoteDuration(String value) { 
        this.controllerLessRemoteDuration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DatapathSyncTimeout", readOnly = false)   
    public Long getDatapathSyncTimeout() {
       return datapathSyncTimeout;
    }

    @JsonIgnore
    public void setDatapathSyncTimeout(Long value) { 
        this.datapathSyncTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeadTimer", readOnly = false)   
    public String getDeadTimer() {
       return deadTimer;
    }

    @JsonIgnore
    public void setDeadTimer(String value) { 
        this.deadTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeadTimerEnabled", readOnly = false)   
    public Boolean getDeadTimerEnabled() {
       return deadTimerEnabled;
    }

    @JsonIgnore
    public void setDeadTimerEnabled(Boolean value) { 
        this.deadTimerEnabled = value;
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
    @VsoProperty(displayName = "EnterpriseID", readOnly = false)   
    public String getEnterpriseID() {
       return enterpriseID;
    }

    @JsonIgnore
    public void setEnterpriseID(String value) { 
        this.enterpriseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public InfrastructureGatewayProfileEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(InfrastructureGatewayProfileEntityScope value) { 
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
    @VsoProperty(displayName = "ForceImmediateSystemSync", readOnly = false)   
    public Boolean getForceImmediateSystemSync() {
       return forceImmediateSystemSync;
    }

    @JsonIgnore
    public void setForceImmediateSystemSync(Boolean value) { 
        this.forceImmediateSystemSync = value;
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
    @VsoProperty(displayName = "MetadataUpgradePath", readOnly = false)   
    public String getMetadataUpgradePath() {
       return metadataUpgradePath;
    }

    @JsonIgnore
    public void setMetadataUpgradePath(String value) { 
        this.metadataUpgradePath = value;
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
    @VsoProperty(displayName = "ProxyDNSName", readOnly = false)   
    public String getProxyDNSName() {
       return proxyDNSName;
    }

    @JsonIgnore
    public void setProxyDNSName(String value) { 
        this.proxyDNSName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemoteLogMode", readOnly = false)   
    public InfrastructureGatewayProfileRemoteLogMode getRemoteLogMode() {
       return remoteLogMode;
    }

    @JsonIgnore
    public void setRemoteLogMode(InfrastructureGatewayProfileRemoteLogMode value) { 
        this.remoteLogMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemoteLogServerAddress", readOnly = false)   
    public String getRemoteLogServerAddress() {
       return remoteLogServerAddress;
    }

    @JsonIgnore
    public void setRemoteLogServerAddress(String value) { 
        this.remoteLogServerAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemoteLogServerPort", readOnly = false)   
    public Long getRemoteLogServerPort() {
       return remoteLogServerPort;
    }

    @JsonIgnore
    public void setRemoteLogServerPort(Long value) { 
        this.remoteLogServerPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsCollectorPort", readOnly = false)   
    public Long getStatsCollectorPort() {
       return statsCollectorPort;
    }

    @JsonIgnore
    public void setStatsCollectorPort(Long value) { 
        this.statsCollectorPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemSyncScheduler", readOnly = false)   
    public String getSystemSyncScheduler() {
       return systemSyncScheduler;
    }

    @JsonIgnore
    public void setSystemSyncScheduler(String value) { 
        this.systemSyncScheduler = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UpgradeAction", readOnly = false)   
    public InfrastructureGatewayProfileUpgradeAction getUpgradeAction() {
       return upgradeAction;
    }

    @JsonIgnore
    public void setUpgradeAction(InfrastructureGatewayProfileUpgradeAction value) { 
        this.upgradeAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseTwoFactor", readOnly = false)   
    public Boolean getUseTwoFactor() {
       return useTwoFactor;
    }

    @JsonIgnore
    public void setUseTwoFactor(Boolean value) { 
        this.useTwoFactor = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.INFRASTRUCTUREGATEWAYPROFILE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.INFRASTRUCTUREGATEWAYPROFILE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.INFRASTRUCTUREGATEWAYPROFILE, getId());
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
        return "InfrastructureGatewayProfile [" + "NTPServerKey=" + NTPServerKey + ", NTPServerKeyID=" + NTPServerKeyID + ", controllerLessDuration=" + controllerLessDuration + ", controllerLessEnabled=" + controllerLessEnabled + ", controllerLessForwardingMode=" + controllerLessForwardingMode + ", controllerLessRemoteDuration=" + controllerLessRemoteDuration + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deadTimer=" + deadTimer + ", deadTimerEnabled=" + deadTimerEnabled + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", forceImmediateSystemSync=" + forceImmediateSystemSync + ", lastUpdatedBy=" + lastUpdatedBy + ", metadataUpgradePath=" + metadataUpgradePath + ", name=" + name + ", proxyDNSName=" + proxyDNSName + ", remoteLogMode=" + remoteLogMode + ", remoteLogServerAddress=" + remoteLogServerAddress + ", remoteLogServerPort=" + remoteLogServerPort + ", statsCollectorPort=" + statsCollectorPort + ", systemSyncScheduler=" + systemSyncScheduler + ", upgradeAction=" + upgradeAction + ", useTwoFactor=" + useTwoFactor + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}