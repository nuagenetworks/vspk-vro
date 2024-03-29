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

import net.nuagenetworks.vro.vspk.model.fetchers.CommandsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DdnsconfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaySecuritiesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LocationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewayMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaySummariesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PatchsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSPortInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SupplementalInfraConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ThreatPreventionInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UnderlayTestsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UplinkConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualUplinksFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.WirelessPortsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewaySSHService;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayTPMStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayZFBMatchAttribute;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayBootstrapStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayConfigurationReloadState;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayConfigurationStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayConfigureLoadBalancing;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayDerivedSSHServiceState;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayFamily;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayFunctions;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayInheritedSSHServiceState;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayNetworkAcceleration;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayPersonality;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewaySyslogLevel;

import net.nuagenetworks.vro.vspk.model.enums.NSGatewayTunnelShaping;
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
        @VsoRelation(inventoryChildren = true, name = Constants.COMMANDS_FETCHER, type = Constants.COMMANDS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DDNSCONFIGS_FETCHER, type = Constants.DDNSCONFIGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSPORTS_FETCHER, type = Constants.NSPORTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.UNDERLAYTESTS_FETCHER, type = Constants.UNDERLAYTESTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.WIRELESSPORTS_FETCHER, type = Constants.WIRELESSPORTS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgateway", resourceName = "nsgateways")
public class NSGateway extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "AARApplicationReleaseDate")
    protected String AARApplicationReleaseDate;
    
    @JsonProperty(value = "AARApplicationVersion")
    protected String AARApplicationVersion;
    
    @JsonProperty(value = "BIOSReleaseDate")
    protected String BIOSReleaseDate;
    
    @JsonProperty(value = "BIOSVersion")
    protected String BIOSVersion;
    
    @JsonProperty(value = "CPUCoreAllocation")
    protected String CPUCoreAllocation;
    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "NATTraversalEnabled")
    protected Boolean NATTraversalEnabled;
    
    @JsonProperty(value = "NSGVersion")
    protected String NSGVersion;
    
    @JsonProperty(value = "SGTPropagationEnabled")
    protected Boolean SGTPropagationEnabled;
    
    @JsonProperty(value = "SKU")
    protected String SKU;
    
    @JsonProperty(value = "SSHService")
    protected NSGatewaySSHService SSHService;
    
    @JsonProperty(value = "TCPMSSEnabled")
    protected Boolean TCPMSSEnabled;
    
    @JsonProperty(value = "TCPMaximumSegmentSize")
    protected Long TCPMaximumSegmentSize;
    
    @JsonProperty(value = "TPMStatus")
    protected NSGatewayTPMStatus TPMStatus;
    
    @JsonProperty(value = "TPMVersion")
    protected String TPMVersion;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "VSDAARApplicationVersion")
    protected String VSDAARApplicationVersion;
    
    @JsonProperty(value = "ZFBMatchAttribute")
    protected NSGatewayZFBMatchAttribute ZFBMatchAttribute;
    
    @JsonProperty(value = "ZFBMatchValue")
    protected String ZFBMatchValue;
    
    @JsonProperty(value = "associatedGatewaySecurityID")
    protected String associatedGatewaySecurityID;
    
    @JsonProperty(value = "associatedGatewaySecurityProfileID")
    protected String associatedGatewaySecurityProfileID;
    
    @JsonProperty(value = "associatedNSGInfoID")
    protected String associatedNSGInfoID;
    
    @JsonProperty(value = "associatedNSGMigrationProfileID")
    protected String associatedNSGMigrationProfileID;
    
    @JsonProperty(value = "associatedNSGUpgradeProfileID")
    protected String associatedNSGUpgradeProfileID;
    
    @JsonProperty(value = "associatedOverlayManagementProfileID")
    protected String associatedOverlayManagementProfileID;
    
    @JsonProperty(value = "autoDiscGatewayID")
    protected String autoDiscGatewayID;
    
    @JsonProperty(value = "bootstrapID")
    protected String bootstrapID;
    
    @JsonProperty(value = "bootstrapStatus")
    protected NSGatewayBootstrapStatus bootstrapStatus;
    
    @JsonProperty(value = "certValidityDays")
    protected Long certValidityDays;
    
    @JsonProperty(value = "configurationReloadState")
    protected NSGatewayConfigurationReloadState configurationReloadState;
    
    @JsonProperty(value = "configurationStatus")
    protected NSGatewayConfigurationStatus configurationStatus;
    
    @JsonProperty(value = "configureLoadBalancing")
    protected NSGatewayConfigureLoadBalancing configureLoadBalancing;
    
    @JsonProperty(value = "controlTrafficCOSValue")
    protected Long controlTrafficCOSValue;
    
    @JsonProperty(value = "controlTrafficDSCPValue")
    protected Long controlTrafficDSCPValue;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "datapathID")
    protected String datapathID;
    
    @JsonProperty(value = "derivedSSHServiceState")
    protected NSGatewayDerivedSSHServiceState derivedSSHServiceState;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected NSGatewayEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected NSGatewayFamily family;
    
    @JsonProperty(value = "functions")
    protected java.util.List<NSGatewayFunctions> functions;
    
    @JsonProperty(value = "gatewayConfigRawVersion")
    protected String gatewayConfigRawVersion;
    
    @JsonProperty(value = "gatewayConfigVersion")
    protected String gatewayConfigVersion;
    
    @JsonProperty(value = "gatewayConnected")
    protected Boolean gatewayConnected;
    
    @JsonProperty(value = "hugePageSetting")
    protected String hugePageSetting;
    
    @JsonProperty(value = "inheritedSSHServiceState")
    protected NSGatewayInheritedSSHServiceState inheritedSSHServiceState;
    
    @JsonProperty(value = "lastConfigurationReloadTimestamp")
    protected Long lastConfigurationReloadTimestamp;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "libraries")
    protected String libraries;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "networkAcceleration")
    protected NSGatewayNetworkAcceleration networkAcceleration;
    
    @JsonProperty(value = "operationMode")
    protected String operationMode;
    
    @JsonProperty(value = "operationStatus")
    protected String operationStatus;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "pending")
    protected Boolean pending;
    
    @JsonProperty(value = "permittedAction")
    protected NSGatewayPermittedAction permittedAction;
    
    @JsonProperty(value = "personality")
    protected NSGatewayPersonality personality;
    
    @JsonProperty(value = "productName")
    protected String productName;
    
    @JsonProperty(value = "redundancyGroupID")
    protected String redundancyGroupID;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @JsonProperty(value = "syslogLevel")
    protected NSGatewaySyslogLevel syslogLevel;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "threatPreventionEnabled")
    protected Boolean threatPreventionEnabled;
    
    @JsonProperty(value = "tunnelShaping")
    protected NSGatewayTunnelShaping tunnelShaping;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private BootstrapsFetcher bootstraps;
    
    @JsonIgnore
    private BootstrapActivationsFetcher bootstrapActivations;
    
    @JsonIgnore
    private CommandsFetcher commands;
    
    @JsonIgnore
    private DdnsconfigsFetcher ddnsconfigs;
    
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
    private NSGatewayMonitorsFetcher nSGatewayMonitors;
    
    @JsonIgnore
    private NSGatewaySummariesFetcher nSGatewaySummaries;
    
    @JsonIgnore
    private NSGInfosFetcher nSGInfos;
    
    @JsonIgnore
    private NSPortsFetcher nSPorts;
    
    @JsonIgnore
    private PatchsFetcher patchs;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private NSPortInfosFetcher nSPortInfos;
    
    @JsonIgnore
    private SubnetsFetcher subnets;
    
    @JsonIgnore
    private SupplementalInfraConfigsFetcher supplementalInfraConfigs;
    
    @JsonIgnore
    private ThreatPreventionInfosFetcher threatPreventionInfos;
    
    @JsonIgnore
    private UnderlayTestsFetcher underlayTests;
    
    @JsonIgnore
    private UplinkConnectionsFetcher uplinkConnections;
    
    @JsonIgnore
    private VirtualUplinksFetcher virtualUplinks;
    
    @JsonIgnore
    private VNFsFetcher vNFs;
    
    @JsonIgnore
    private WirelessPortsFetcher wirelessPorts;
    
    @VsoConstructor
    public NSGateway() {
        alarms = new AlarmsFetcher(this);
        
        bootstraps = new BootstrapsFetcher(this);
        
        bootstrapActivations = new BootstrapActivationsFetcher(this);
        
        commands = new CommandsFetcher(this);
        
        ddnsconfigs = new DdnsconfigsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        gatewaySecurities = new GatewaySecuritiesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        infrastructureConfigs = new InfrastructureConfigsFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        locations = new LocationsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        nSGatewayMonitors = new NSGatewayMonitorsFetcher(this);
        
        nSGatewaySummaries = new NSGatewaySummariesFetcher(this);
        
        nSGInfos = new NSGInfosFetcher(this);
        
        nSPorts = new NSPortsFetcher(this);
        
        patchs = new PatchsFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        nSPortInfos = new NSPortInfosFetcher(this);
        
        subnets = new SubnetsFetcher(this);
        
        supplementalInfraConfigs = new SupplementalInfraConfigsFetcher(this);
        
        threatPreventionInfos = new ThreatPreventionInfosFetcher(this);
        
        underlayTests = new UnderlayTestsFetcher(this);
        
        uplinkConnections = new UplinkConnectionsFetcher(this);
        
        virtualUplinks = new VirtualUplinksFetcher(this);
        
        vNFs = new VNFsFetcher(this);
        
        wirelessPorts = new WirelessPortsFetcher(this);
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
    @JsonIgnore
    @VsoProperty(displayName = "AARApplicationReleaseDate", readOnly = false)   
    public String getAARApplicationReleaseDate() {
       return AARApplicationReleaseDate;
    }

    @JsonIgnore
    public void setAARApplicationReleaseDate(String value) { 
        this.AARApplicationReleaseDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AARApplicationVersion", readOnly = false)   
    public String getAARApplicationVersion() {
       return AARApplicationVersion;
    }

    @JsonIgnore
    public void setAARApplicationVersion(String value) { 
        this.AARApplicationVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BIOSReleaseDate", readOnly = false)   
    public String getBIOSReleaseDate() {
       return BIOSReleaseDate;
    }

    @JsonIgnore
    public void setBIOSReleaseDate(String value) { 
        this.BIOSReleaseDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BIOSVersion", readOnly = false)   
    public String getBIOSVersion() {
       return BIOSVersion;
    }

    @JsonIgnore
    public void setBIOSVersion(String value) { 
        this.BIOSVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUCoreAllocation", readOnly = false)   
    public String getCPUCoreAllocation() {
       return CPUCoreAllocation;
    }

    @JsonIgnore
    public void setCPUCoreAllocation(String value) { 
        this.CPUCoreAllocation = value;
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
    @VsoProperty(displayName = "SGTPropagationEnabled", readOnly = false)   
    public Boolean getSGTPropagationEnabled() {
       return SGTPropagationEnabled;
    }

    @JsonIgnore
    public void setSGTPropagationEnabled(Boolean value) { 
        this.SGTPropagationEnabled = value;
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
    @VsoProperty(displayName = "TCPMSSEnabled", readOnly = false)   
    public Boolean getTCPMSSEnabled() {
       return TCPMSSEnabled;
    }

    @JsonIgnore
    public void setTCPMSSEnabled(Boolean value) { 
        this.TCPMSSEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TCPMaximumSegmentSize", readOnly = false)   
    public Long getTCPMaximumSegmentSize() {
       return TCPMaximumSegmentSize;
    }

    @JsonIgnore
    public void setTCPMaximumSegmentSize(Long value) { 
        this.TCPMaximumSegmentSize = value;
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
    @VsoProperty(displayName = "TPMVersion", readOnly = false)   
    public String getTPMVersion() {
       return TPMVersion;
    }

    @JsonIgnore
    public void setTPMVersion(String value) { 
        this.TPMVersion = value;
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
    @VsoProperty(displayName = "VSDAARApplicationVersion", readOnly = false)   
    public String getVSDAARApplicationVersion() {
       return VSDAARApplicationVersion;
    }

    @JsonIgnore
    public void setVSDAARApplicationVersion(String value) { 
        this.VSDAARApplicationVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBMatchAttribute", readOnly = false)   
    public NSGatewayZFBMatchAttribute getZFBMatchAttribute() {
       return ZFBMatchAttribute;
    }

    @JsonIgnore
    public void setZFBMatchAttribute(NSGatewayZFBMatchAttribute value) { 
        this.ZFBMatchAttribute = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBMatchValue", readOnly = false)   
    public String getZFBMatchValue() {
       return ZFBMatchValue;
    }

    @JsonIgnore
    public void setZFBMatchValue(String value) { 
        this.ZFBMatchValue = value;
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
    @VsoProperty(displayName = "AssociatedNSGMigrationProfileID", readOnly = false)   
    public String getAssociatedNSGMigrationProfileID() {
       return associatedNSGMigrationProfileID;
    }

    @JsonIgnore
    public void setAssociatedNSGMigrationProfileID(String value) { 
        this.associatedNSGMigrationProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGUpgradeProfileID", readOnly = false)   
    public String getAssociatedNSGUpgradeProfileID() {
       return associatedNSGUpgradeProfileID;
    }

    @JsonIgnore
    public void setAssociatedNSGUpgradeProfileID(String value) { 
        this.associatedNSGUpgradeProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedOverlayManagementProfileID", readOnly = false)   
    public String getAssociatedOverlayManagementProfileID() {
       return associatedOverlayManagementProfileID;
    }

    @JsonIgnore
    public void setAssociatedOverlayManagementProfileID(String value) { 
        this.associatedOverlayManagementProfileID = value;
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
    @VsoProperty(displayName = "CertValidityDays", readOnly = false)   
    public Long getCertValidityDays() {
       return certValidityDays;
    }

    @JsonIgnore
    public void setCertValidityDays(Long value) { 
        this.certValidityDays = value;
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
    @VsoProperty(displayName = "ConfigureLoadBalancing", readOnly = false)   
    public NSGatewayConfigureLoadBalancing getConfigureLoadBalancing() {
       return configureLoadBalancing;
    }

    @JsonIgnore
    public void setConfigureLoadBalancing(NSGatewayConfigureLoadBalancing value) { 
        this.configureLoadBalancing = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControlTrafficCOSValue", readOnly = false)   
    public Long getControlTrafficCOSValue() {
       return controlTrafficCOSValue;
    }

    @JsonIgnore
    public void setControlTrafficCOSValue(Long value) { 
        this.controlTrafficCOSValue = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControlTrafficDSCPValue", readOnly = false)   
    public Long getControlTrafficDSCPValue() {
       return controlTrafficDSCPValue;
    }

    @JsonIgnore
    public void setControlTrafficDSCPValue(Long value) { 
        this.controlTrafficDSCPValue = value;
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
    @VsoProperty(displayName = "DatapathID", readOnly = false)   
    public String getDatapathID() {
       return datapathID;
    }

    @JsonIgnore
    public void setDatapathID(String value) { 
        this.datapathID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DerivedSSHServiceState", readOnly = false)   
    public NSGatewayDerivedSSHServiceState getDerivedSSHServiceState() {
       return derivedSSHServiceState;
    }

    @JsonIgnore
    public void setDerivedSSHServiceState(NSGatewayDerivedSSHServiceState value) { 
        this.derivedSSHServiceState = value;
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
    @VsoProperty(displayName = "Functions", readOnly = false)   
    public java.util.List<NSGatewayFunctions> getFunctions() {
       return functions;
    }

    @JsonIgnore
    public void setFunctions(java.util.List<NSGatewayFunctions> value) { 
        this.functions = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConfigRawVersion", readOnly = false)   
    public String getGatewayConfigRawVersion() {
       return gatewayConfigRawVersion;
    }

    @JsonIgnore
    public void setGatewayConfigRawVersion(String value) { 
        this.gatewayConfigRawVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConfigVersion", readOnly = false)   
    public String getGatewayConfigVersion() {
       return gatewayConfigVersion;
    }

    @JsonIgnore
    public void setGatewayConfigVersion(String value) { 
        this.gatewayConfigVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConnected", readOnly = false)   
    public Boolean getGatewayConnected() {
       return gatewayConnected;
    }

    @JsonIgnore
    public void setGatewayConnected(Boolean value) { 
        this.gatewayConnected = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HugePageSetting", readOnly = false)   
    public String getHugePageSetting() {
       return hugePageSetting;
    }

    @JsonIgnore
    public void setHugePageSetting(String value) { 
        this.hugePageSetting = value;
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
    @VsoProperty(displayName = "LastUpdatedDate", readOnly = false)   
    public String getLastUpdatedDate() {
       return lastUpdatedDate;
    }

    @JsonIgnore
    public void setLastUpdatedDate(String value) { 
        this.lastUpdatedDate = value;
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
    @VsoProperty(displayName = "NetworkAcceleration", readOnly = false)   
    public NSGatewayNetworkAcceleration getNetworkAcceleration() {
       return networkAcceleration;
    }

    @JsonIgnore
    public void setNetworkAcceleration(NSGatewayNetworkAcceleration value) { 
        this.networkAcceleration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OperationMode", readOnly = false)   
    public String getOperationMode() {
       return operationMode;
    }

    @JsonIgnore
    public void setOperationMode(String value) { 
        this.operationMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OperationStatus", readOnly = false)   
    public String getOperationStatus() {
       return operationStatus;
    }

    @JsonIgnore
    public void setOperationStatus(String value) { 
        this.operationStatus = value;
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
    @VsoProperty(displayName = "ProductName", readOnly = false)   
    public String getProductName() {
       return productName;
    }

    @JsonIgnore
    public void setProductName(String value) { 
        this.productName = value;
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
    @VsoProperty(displayName = "SyslogLevel", readOnly = false)   
    public NSGatewaySyslogLevel getSyslogLevel() {
       return syslogLevel;
    }

    @JsonIgnore
    public void setSyslogLevel(NSGatewaySyslogLevel value) { 
        this.syslogLevel = value;
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
    @VsoProperty(displayName = "ThreatPreventionEnabled", readOnly = false)   
    public Boolean getThreatPreventionEnabled() {
       return threatPreventionEnabled;
    }

    @JsonIgnore
    public void setThreatPreventionEnabled(Boolean value) { 
        this.threatPreventionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TunnelShaping", readOnly = false)   
    public NSGatewayTunnelShaping getTunnelShaping() {
       return tunnelShaping;
    }

    @JsonIgnore
    public void setTunnelShaping(NSGatewayTunnelShaping value) { 
        this.tunnelShaping = value;
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
    @VsoProperty(displayName = "Commands", readOnly = true)   
    public CommandsFetcher getCommands() {
        return commands;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Ddnsconfigs", readOnly = true)   
    public DdnsconfigsFetcher getDdnsconfigs() {
        return ddnsconfigs;
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
    @VsoProperty(displayName = "NSGatewayMonitors", readOnly = true)   
    public NSGatewayMonitorsFetcher getNSGatewayMonitors() {
        return nSGatewayMonitors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGatewaySummaries", readOnly = true)   
    public NSGatewaySummariesFetcher getNSGatewaySummaries() {
        return nSGatewaySummaries;
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
    @VsoProperty(displayName = "Patchs", readOnly = true)   
    public PatchsFetcher getPatchs() {
        return patchs;
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
    @VsoProperty(displayName = "NSPortInfos", readOnly = true)   
    public NSPortInfosFetcher getNSPortInfos() {
        return nSPortInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Subnets", readOnly = true)   
    public SubnetsFetcher getSubnets() {
        return subnets;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SupplementalInfraConfigs", readOnly = true)   
    public SupplementalInfraConfigsFetcher getSupplementalInfraConfigs() {
        return supplementalInfraConfigs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionInfos", readOnly = true)   
    public ThreatPreventionInfosFetcher getThreatPreventionInfos() {
        return threatPreventionInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayTests", readOnly = true)   
    public UnderlayTestsFetcher getUnderlayTests() {
        return underlayTests;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkConnections", readOnly = true)   
    public UplinkConnectionsFetcher getUplinkConnections() {
        return uplinkConnections;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualUplinks", readOnly = true)   
    public VirtualUplinksFetcher getVirtualUplinks() {
        return virtualUplinks;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFs", readOnly = true)   
    public VNFsFetcher getVNFs() {
        return vNFs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WirelessPorts", readOnly = true)   
    public WirelessPortsFetcher getWirelessPorts() {
        return wirelessPorts;
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
    public void assignWirelessPorts(Session session, WirelessPort[] childRestObjs, Boolean commitObj) throws RestException {
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
    public void createCommand(Session session, Command childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.COMMANDS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDdnsconfig(Session session, Ddnsconfig childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DDNSCONFIGS_FETCHER, getId());
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
    }
    @VsoMethod
    public void createUnderlayTest(Session session, UnderlayTest childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.UNDERLAYTESTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createWirelessPort(Session session, WirelessPort childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.WIRELESSPORTS_FETCHER, getId());
        }
    }public String toString() {
        return "NSGateway [" + "AARApplicationReleaseDate=" + AARApplicationReleaseDate + ", AARApplicationVersion=" + AARApplicationVersion + ", BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUCoreAllocation=" + CPUCoreAllocation + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NATTraversalEnabled=" + NATTraversalEnabled + ", NSGVersion=" + NSGVersion + ", SGTPropagationEnabled=" + SGTPropagationEnabled + ", SKU=" + SKU + ", SSHService=" + SSHService + ", TCPMSSEnabled=" + TCPMSSEnabled + ", TCPMaximumSegmentSize=" + TCPMaximumSegmentSize + ", TPMStatus=" + TPMStatus + ", TPMVersion=" + TPMVersion + ", UUID=" + UUID + ", VSDAARApplicationVersion=" + VSDAARApplicationVersion + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNSGMigrationProfileID=" + associatedNSGMigrationProfileID + ", associatedNSGUpgradeProfileID=" + associatedNSGUpgradeProfileID + ", associatedOverlayManagementProfileID=" + associatedOverlayManagementProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", certValidityDays=" + certValidityDays + ", configurationReloadState=" + configurationReloadState + ", configurationStatus=" + configurationStatus + ", configureLoadBalancing=" + configureLoadBalancing + ", controlTrafficCOSValue=" + controlTrafficCOSValue + ", controlTrafficDSCPValue=" + controlTrafficDSCPValue + ", creationDate=" + creationDate + ", datapathID=" + datapathID + ", derivedSSHServiceState=" + derivedSSHServiceState + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", functions=" + functions + ", gatewayConfigRawVersion=" + gatewayConfigRawVersion + ", gatewayConfigVersion=" + gatewayConfigVersion + ", gatewayConnected=" + gatewayConnected + ", hugePageSetting=" + hugePageSetting + ", inheritedSSHServiceState=" + inheritedSSHServiceState + ", lastConfigurationReloadTimestamp=" + lastConfigurationReloadTimestamp + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", libraries=" + libraries + ", locationID=" + locationID + ", name=" + name + ", networkAcceleration=" + networkAcceleration + ", operationMode=" + operationMode + ", operationStatus=" + operationStatus + ", owner=" + owner + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", syslogLevel=" + syslogLevel + ", systemID=" + systemID + ", templateID=" + templateID + ", threatPreventionEnabled=" + threatPreventionEnabled + ", tunnelShaping=" + tunnelShaping + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}