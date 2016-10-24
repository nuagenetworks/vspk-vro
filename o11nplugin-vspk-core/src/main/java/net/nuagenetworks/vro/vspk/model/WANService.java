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
import net.nuagenetworks.vro.vspk.model.fetchers.AlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.WANServiceConfigType;

import net.nuagenetworks.vro.vspk.model.enums.WANServiceEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.WANServicePermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.WANServiceServiceType;

import net.nuagenetworks.vro.vspk.model.enums.WANServiceTunnelType;
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

@VsoFinder(name = Constants.WANSERVICE, datasource = Constants.DATASOURCE, image = Constants.WANSERVICE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "service", resourceName = "services")
public class WANService extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "IRBEnabled")
    protected Boolean IRBEnabled;
    
    @JsonProperty(value = "WANServiceIdentifier")
    protected String WANServiceIdentifier;
    
    @JsonProperty(value = "associatedDomainID")
    protected String associatedDomainID;
    
    @JsonProperty(value = "associatedVPNConnectID")
    protected String associatedVPNConnectID;
    
    @JsonProperty(value = "configType")
    protected WANServiceConfigType configType;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected WANServiceEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "externalRouteTarget")
    protected String externalRouteTarget;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "orphan")
    protected Boolean orphan;
    
    @JsonProperty(value = "permittedAction")
    protected WANServicePermittedAction permittedAction;
    
    @JsonProperty(value = "servicePolicy")
    protected String servicePolicy;
    
    @JsonProperty(value = "serviceType")
    protected WANServiceServiceType serviceType;
    
    @JsonProperty(value = "tunnelType")
    protected WANServiceTunnelType tunnelType;
    
    @JsonProperty(value = "useUserMnemonic")
    protected Boolean useUserMnemonic;
    
    @JsonProperty(value = "userMnemonic")
    protected String userMnemonic;
    
    @JsonProperty(value = "vnId")
    protected Long vnId;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public WANService() {
        configType = WANServiceConfigType.STATIC;
        
        serviceType = WANServiceServiceType.L3;
        
        alarms = new AlarmsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
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
    @VsoProperty(displayName = "IRBEnabled", readOnly = false)   
    public Boolean getIRBEnabled() {
       return IRBEnabled;
    }

    @JsonIgnore
    public void setIRBEnabled(Boolean value) { 
        this.IRBEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WANServiceIdentifier", readOnly = false)   
    public String getWANServiceIdentifier() {
       return WANServiceIdentifier;
    }

    @JsonIgnore
    public void setWANServiceIdentifier(String value) { 
        this.WANServiceIdentifier = value;
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
    @VsoProperty(displayName = "AssociatedVPNConnectID", readOnly = false)   
    public String getAssociatedVPNConnectID() {
       return associatedVPNConnectID;
    }

    @JsonIgnore
    public void setAssociatedVPNConnectID(String value) { 
        this.associatedVPNConnectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConfigType", readOnly = false)   
    public WANServiceConfigType getConfigType() {
       return configType;
    }

    @JsonIgnore
    public void setConfigType(WANServiceConfigType value) { 
        this.configType = value;
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
    @VsoProperty(displayName = "DomainName", readOnly = false)   
    public String getDomainName() {
       return domainName;
    }

    @JsonIgnore
    public void setDomainName(String value) { 
        this.domainName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseName", readOnly = false)   
    public String getEnterpriseName() {
       return enterpriseName;
    }

    @JsonIgnore
    public void setEnterpriseName(String value) { 
        this.enterpriseName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public WANServiceEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(WANServiceEntityScope value) { 
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
    @VsoProperty(displayName = "ExternalRouteTarget", readOnly = false)   
    public String getExternalRouteTarget() {
       return externalRouteTarget;
    }

    @JsonIgnore
    public void setExternalRouteTarget(String value) { 
        this.externalRouteTarget = value;
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
    @VsoProperty(displayName = "Orphan", readOnly = false)   
    public Boolean getOrphan() {
       return orphan;
    }

    @JsonIgnore
    public void setOrphan(Boolean value) { 
        this.orphan = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public WANServicePermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(WANServicePermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ServicePolicy", readOnly = false)   
    public String getServicePolicy() {
       return servicePolicy;
    }

    @JsonIgnore
    public void setServicePolicy(String value) { 
        this.servicePolicy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ServiceType", readOnly = false)   
    public WANServiceServiceType getServiceType() {
       return serviceType;
    }

    @JsonIgnore
    public void setServiceType(WANServiceServiceType value) { 
        this.serviceType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TunnelType", readOnly = false)   
    public WANServiceTunnelType getTunnelType() {
       return tunnelType;
    }

    @JsonIgnore
    public void setTunnelType(WANServiceTunnelType value) { 
        this.tunnelType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseUserMnemonic", readOnly = false)   
    public Boolean getUseUserMnemonic() {
       return useUserMnemonic;
    }

    @JsonIgnore
    public void setUseUserMnemonic(Boolean value) { 
        this.useUserMnemonic = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserMnemonic", readOnly = false)   
    public String getUserMnemonic() {
       return userMnemonic;
    }

    @JsonIgnore
    public void setUserMnemonic(String value) { 
        this.userMnemonic = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VnId", readOnly = false)   
    public Long getVnId() {
       return vnId;
    }

    @JsonIgnore
    public void setVnId(Long value) { 
        this.vnId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterprisePermissions", readOnly = true)   
    public EnterprisePermissionsFetcher getEnterprisePermissions() {
        return enterprisePermissions;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.WANSERVICE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.WANSERVICE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.WANSERVICE, getId());
        }
    }
    
    @VsoMethod
    public void createEnterprisePermission(Session session, EnterprisePermission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISEPERMISSIONS_FETCHER, getId());
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
        return "WANService [" + "IRBEnabled=" + IRBEnabled + ", WANServiceIdentifier=" + WANServiceIdentifier + ", associatedDomainID=" + associatedDomainID + ", associatedVPNConnectID=" + associatedVPNConnectID + ", configType=" + configType + ", description=" + description + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", externalRouteTarget=" + externalRouteTarget + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", orphan=" + orphan + ", permittedAction=" + permittedAction + ", servicePolicy=" + servicePolicy + ", serviceType=" + serviceType + ", tunnelType=" + tunnelType + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}