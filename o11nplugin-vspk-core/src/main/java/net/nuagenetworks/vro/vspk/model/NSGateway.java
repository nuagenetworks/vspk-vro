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

import net.nuagenetworks.vro.vspk.model.fetchers.BootstrapsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BootstrapActivationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaySecuritiesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LocationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MonitorscopesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewaySSHService;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayTPMStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayBootstrapStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayConfigurationReloadState;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayConfigurationStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayFamily;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayInheritedSSHServiceState;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayPersonality;
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

@VsoFinder(name = Constants.NSGATEWAY, datasource = Constants.DATASOURCE, image = Constants.NSGATEWAY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSPORTS_FETCHER, type = Constants.NSPORTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgateway", resourceName = "nsgateways")
public class NSGateway extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "NATTraversalEnabled")
    protected Boolean NATTraversalEnabled;
    
    @JsonProperty(value = "NSGVersion")
    protected String NSGVersion;
    
    @JsonProperty(value = "SKU")
    protected String SKU;
    
    @JsonProperty(value = "SSHService")
    protected NSGatewaySSHService SSHService;
    
    @JsonProperty(value = "TPMStatus")
    protected NSGatewayTPMStatus TPMStatus;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "associatedGatewaySecurityID")
    protected String associatedGatewaySecurityID;
    
    @JsonProperty(value = "associatedGatewaySecurityProfileID")
    protected String associatedGatewaySecurityProfileID;
    
    @JsonProperty(value = "associatedNSGInfoID")
    protected String associatedNSGInfoID;
    
    @JsonProperty(value = "autoDiscGatewayID")
    protected String autoDiscGatewayID;
    
    @JsonProperty(value = "bootstrapID")
    protected String bootstrapID;
    
    @JsonProperty(value = "bootstrapStatus")
    protected NSGatewayBootstrapStatus bootstrapStatus;
    
    @JsonProperty(value = "configurationReloadState")
    protected NSGatewayConfigurationReloadState configurationReloadState;
    
    @JsonProperty(value = "configurationStatus")
    protected NSGatewayConfigurationStatus configurationStatus;
    
    @JsonProperty(value = "datapathID")
    protected String datapathID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected NSGatewayEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected NSGatewayFamily family;
    
    @JsonProperty(value = "inheritedSSHServiceState")
    protected NSGatewayInheritedSSHServiceState inheritedSSHServiceState;
    
    @JsonProperty(value = "lastConfigurationReloadTimestamp")
    protected Long lastConfigurationReloadTimestamp;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "libraries")
    protected String libraries;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "pending")
    protected Boolean pending;
    
    @JsonProperty(value = "permittedAction")
    protected NSGatewayPermittedAction permittedAction;
    
    @JsonProperty(value = "personality")
    protected NSGatewayPersonality personality;
    
    @JsonProperty(value = "redundancyGroupID")
    protected String redundancyGroupID;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private BootstrapsFetcher bootstraps;
    
    @JsonIgnore
    private BootstrapActivationsFetcher bootstrapActivations;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GatewaySecuritiesFetcher gatewaySecurities;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private InfrastructureConfigsFetcher infrastructureConfigs;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private LocationsFetcher locations;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MonitorscopesFetcher monitorscopes;
    
    @JsonIgnore
    private NSGInfosFetcher nSGInfos;
    
    @JsonIgnore
    private NSPortsFetcher nSPorts;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private SubnetsFetcher subnets;
    
    @VsoConstructor
    public NSGateway() {
        alarms = new AlarmsFetcher(this);
        
        bootstraps = new BootstrapsFetcher(this);
        
        bootstrapActivations = new BootstrapActivationsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        gatewaySecurities = new GatewaySecuritiesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        infrastructureConfigs = new InfrastructureConfigsFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        locations = new LocationsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        monitorscopes = new MonitorscopesFetcher(this);
        
        nSGInfos = new NSGInfosFetcher(this);
        
        nSPorts = new NSPortsFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        subnets = new SubnetsFetcher(this);
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
    @VsoProperty(displayName = "CPUType", readOnly = false)   
    public String getCPUType() {
       return CPUType;
    }

    @JsonIgnore
    public void setCPUType(String value) { 
        this.CPUType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MACAddress", readOnly = false)   
    public String getMACAddress() {
       return MACAddress;
    }

    @JsonIgnore
    public void setMACAddress(String value) { 
        this.MACAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NATTraversalEnabled", readOnly = false)   
    public Boolean getNATTraversalEnabled() {
       return NATTraversalEnabled;
    }

    @JsonIgnore
    public void setNATTraversalEnabled(Boolean value) { 
        this.NATTraversalEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGVersion", readOnly = false)   
    public String getNSGVersion() {
       return NSGVersion;
    }

    @JsonIgnore
    public void setNSGVersion(String value) { 
        this.NSGVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SKU", readOnly = false)   
    public String getSKU() {
       return SKU;
    }

    @JsonIgnore
    public void setSKU(String value) { 
        this.SKU = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SSHService", readOnly = false)   
    public NSGatewaySSHService getSSHService() {
       return SSHService;
    }

    @JsonIgnore
    public void setSSHService(NSGatewaySSHService value) { 
        this.SSHService = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TPMStatus", readOnly = false)   
    public NSGatewayTPMStatus getTPMStatus() {
       return TPMStatus;
    }

    @JsonIgnore
    public void setTPMStatus(NSGatewayTPMStatus value) { 
        this.TPMStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UUID", readOnly = false)   
    public String getUUID() {
       return UUID;
    }

    @JsonIgnore
    public void setUUID(String value) { 
        this.UUID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewaySecurityID", readOnly = false)   
    public String getAssociatedGatewaySecurityID() {
       return associatedGatewaySecurityID;
    }

    @JsonIgnore
    public void setAssociatedGatewaySecurityID(String value) { 
        this.associatedGatewaySecurityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewaySecurityProfileID", readOnly = false)   
    public String getAssociatedGatewaySecurityProfileID() {
       return associatedGatewaySecurityProfileID;
    }

    @JsonIgnore
    public void setAssociatedGatewaySecurityProfileID(String value) { 
        this.associatedGatewaySecurityProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGInfoID", readOnly = false)   
    public String getAssociatedNSGInfoID() {
       return associatedNSGInfoID;
    }

    @JsonIgnore
    public void setAssociatedNSGInfoID(String value) { 
        this.associatedNSGInfoID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AutoDiscGatewayID", readOnly = false)   
    public String getAutoDiscGatewayID() {
       return autoDiscGatewayID;
    }

    @JsonIgnore
    public void setAutoDiscGatewayID(String value) { 
        this.autoDiscGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapID", readOnly = false)   
    public String getBootstrapID() {
       return bootstrapID;
    }

    @JsonIgnore
    public void setBootstrapID(String value) { 
        this.bootstrapID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapStatus", readOnly = false)   
    public NSGatewayBootstrapStatus getBootstrapStatus() {
       return bootstrapStatus;
    }

    @JsonIgnore
    public void setBootstrapStatus(NSGatewayBootstrapStatus value) { 
        this.bootstrapStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConfigurationReloadState", readOnly = false)   
    public NSGatewayConfigurationReloadState getConfigurationReloadState() {
       return configurationReloadState;
    }

    @JsonIgnore
    public void setConfigurationReloadState(NSGatewayConfigurationReloadState value) { 
        this.configurationReloadState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConfigurationStatus", readOnly = false)   
    public NSGatewayConfigurationStatus getConfigurationStatus() {
       return configurationStatus;
    }

    @JsonIgnore
    public void setConfigurationStatus(NSGatewayConfigurationStatus value) { 
        this.configurationStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DatapathID", readOnly = false)   
    public String getDatapathID() {
       return datapathID;
    }

    @JsonIgnore
    public void setDatapathID(String value) { 
        this.datapathID = value;
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
    public NSGatewayEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(NSGatewayEntityScope value) { 
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
    @VsoProperty(displayName = "Family", readOnly = false)   
    public NSGatewayFamily getFamily() {
       return family;
    }

    @JsonIgnore
    public void setFamily(NSGatewayFamily value) { 
        this.family = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InheritedSSHServiceState", readOnly = false)   
    public NSGatewayInheritedSSHServiceState getInheritedSSHServiceState() {
       return inheritedSSHServiceState;
    }

    @JsonIgnore
    public void setInheritedSSHServiceState(NSGatewayInheritedSSHServiceState value) { 
        this.inheritedSSHServiceState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastConfigurationReloadTimestamp", readOnly = false)   
    public Long getLastConfigurationReloadTimestamp() {
       return lastConfigurationReloadTimestamp;
    }

    @JsonIgnore
    public void setLastConfigurationReloadTimestamp(Long value) { 
        this.lastConfigurationReloadTimestamp = value;
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
    @VsoProperty(displayName = "Libraries", readOnly = false)   
    public String getLibraries() {
       return libraries;
    }

    @JsonIgnore
    public void setLibraries(String value) { 
        this.libraries = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocationID", readOnly = false)   
    public String getLocationID() {
       return locationID;
    }

    @JsonIgnore
    public void setLocationID(String value) { 
        this.locationID = value;
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
    @VsoProperty(displayName = "Pending", readOnly = false)   
    public Boolean getPending() {
       return pending;
    }

    @JsonIgnore
    public void setPending(Boolean value) { 
        this.pending = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public NSGatewayPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(NSGatewayPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public NSGatewayPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(NSGatewayPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedundancyGroupID", readOnly = false)   
    public String getRedundancyGroupID() {
       return redundancyGroupID;
    }

    @JsonIgnore
    public void setRedundancyGroupID(String value) { 
        this.redundancyGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SerialNumber", readOnly = false)   
    public String getSerialNumber() {
       return serialNumber;
    }

    @JsonIgnore
    public void setSerialNumber(String value) { 
        this.serialNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemID", readOnly = false)   
    public String getSystemID() {
       return systemID;
    }

    @JsonIgnore
    public void setSystemID(String value) { 
        this.systemID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TemplateID", readOnly = false)   
    public String getTemplateID() {
       return templateID;
    }

    @JsonIgnore
    public void setTemplateID(String value) { 
        this.templateID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Bootstraps", readOnly = true)   
    public BootstrapsFetcher getBootstraps() {
        return bootstraps;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapActivations", readOnly = true)   
    public BootstrapActivationsFetcher getBootstrapActivations() {
        return bootstrapActivations;
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
    @VsoProperty(displayName = "GatewaySecurities", readOnly = true)   
    public GatewaySecuritiesFetcher getGatewaySecurities() {
        return gatewaySecurities;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfrastructureConfigs", readOnly = true)   
    public InfrastructureConfigsFetcher getInfrastructureConfigs() {
        return infrastructureConfigs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Locations", readOnly = true)   
    public LocationsFetcher getLocations() {
        return locations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Monitorscopes", readOnly = true)   
    public MonitorscopesFetcher getMonitorscopes() {
        return monitorscopes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGInfos", readOnly = true)   
    public NSGInfosFetcher getNSGInfos() {
        return nSGInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSPorts", readOnly = true)   
    public NSPortsFetcher getNSPorts() {
        return nSPorts;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATNATPools", readOnly = true)   
    public PATNATPoolsFetcher getPATNATPools() {
        return pATNATPools;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Subnets", readOnly = true)   
    public SubnetsFetcher getSubnets() {
        return subnets;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.NSGATEWAY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAY, getId());
        }
    }
    
    @VsoMethod
    public void assignInfrastructureConfigs(Session session, InfrastructureConfig[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAY, getId());
        }
    }
    
    @VsoMethod
    public void assignNSPorts(Session session, NSPort[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAY, getId());
        }
    }
    
    @VsoMethod
    public void assignPATNATPools(Session session, PATNATPool[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAY, getId());
        }
    }
    
    @VsoMethod
    public void createBootstrapActivation(Session session, BootstrapActivation childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BOOTSTRAPACTIVATIONS_FETCHER, getId());
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
    public void createJob(Session session, Job childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.JOBS_FETCHER, getId());
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
    public void createNSPort(Session session, NSPort childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSPORTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateNSPort(Session session, NSPort childRestObj, NSPortTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSPORTS_FETCHER, getId());
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
        return "NSGateway [" + "CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NATTraversalEnabled=" + NATTraversalEnabled + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", SSHService=" + SSHService + ", TPMStatus=" + TPMStatus + ", UUID=" + UUID + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", configurationReloadState=" + configurationReloadState + ", configurationStatus=" + configurationStatus + ", datapathID=" + datapathID + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", inheritedSSHServiceState=" + inheritedSSHServiceState + ", lastConfigurationReloadTimestamp=" + lastConfigurationReloadTimestamp + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", name=" + name + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", templateID=" + templateID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}