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

import net.nuagenetworks.vro.vspk.model.fetchers.VRSAddressRangesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSRedeploymentpoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigAvrsProfile;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigCpuCount;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigDestinationMirrorPort;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigMemorySizeInGB;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigPersonality;

import net.nuagenetworks.vro.vspk.model.enums.VCenterVRSConfigRemoteSyslogServerType;
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

@VsoFinder(name = Constants.VCENTERVRSCONFIG, datasource = Constants.DATASOURCE, image = Constants.VCENTERVRSCONFIG_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VRSADDRESSRANGES_FETCHER, type = Constants.VRSADDRESSRANGES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, type = Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrsconfig", resourceName = "vrsconfigs")
public class VCenterVRSConfig extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ARPReply")
    protected Boolean ARPReply;
    
    @JsonProperty(value = "VRSConfigurationTimeLimit")
    protected Long VRSConfigurationTimeLimit;
    
    @JsonProperty(value = "allowDataDHCP")
    protected Boolean allowDataDHCP;
    
    @JsonProperty(value = "allowMgmtDHCP")
    protected Boolean allowMgmtDHCP;
    
    @JsonProperty(value = "avrsEnabled")
    protected Boolean avrsEnabled;
    
    @JsonProperty(value = "avrsProfile")
    protected VCenterVRSConfigAvrsProfile avrsProfile;
    
    @JsonProperty(value = "configuredMetricsPushInterval")
    protected Long configuredMetricsPushInterval;
    
    @JsonProperty(value = "cpuCount")
    protected VCenterVRSConfigCpuCount cpuCount;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "customizedScriptURL")
    protected String customizedScriptURL;
    
    @JsonProperty(value = "dataDNS1")
    protected String dataDNS1;
    
    @JsonProperty(value = "dataDNS2")
    protected String dataDNS2;
    
    @JsonProperty(value = "dataGateway")
    protected String dataGateway;
    
    @JsonProperty(value = "dataNetworkPortgroup")
    protected String dataNetworkPortgroup;
    
    @JsonProperty(value = "datapathSyncTimeout")
    protected Long datapathSyncTimeout;
    
    @JsonProperty(value = "destinationMirrorPort")
    protected VCenterVRSConfigDestinationMirrorPort destinationMirrorPort;
    
    @JsonProperty(value = "dhcpRelayServer")
    protected String dhcpRelayServer;
    
    @JsonProperty(value = "disableGROOnDatapath")
    protected Boolean disableGROOnDatapath;
    
    @JsonProperty(value = "disableLROOnDatapath")
    protected Boolean disableLROOnDatapath;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enableVRSResourceReservation")
    protected Boolean enableVRSResourceReservation;
    
    @JsonProperty(value = "entityScope")
    protected VCenterVRSConfigEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowEvictionThreshold")
    protected Long flowEvictionThreshold;
    
    @JsonProperty(value = "genericSplitActivation")
    protected Boolean genericSplitActivation;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "manageVRSAvailability")
    protected Boolean manageVRSAvailability;
    
    @JsonProperty(value = "memorySizeInGB")
    protected VCenterVRSConfigMemorySizeInGB memorySizeInGB;
    
    @JsonProperty(value = "metadataServerIP")
    protected String metadataServerIP;
    
    @JsonProperty(value = "metadataServerListenPort")
    protected Long metadataServerListenPort;
    
    @JsonProperty(value = "metadataServerPort")
    protected Long metadataServerPort;
    
    @JsonProperty(value = "metadataServiceEnabled")
    protected Boolean metadataServiceEnabled;
    
    @JsonProperty(value = "mgmtDNS1")
    protected String mgmtDNS1;
    
    @JsonProperty(value = "mgmtDNS2")
    protected String mgmtDNS2;
    
    @JsonProperty(value = "mgmtGateway")
    protected String mgmtGateway;
    
    @JsonProperty(value = "mgmtNetworkPortgroup")
    protected String mgmtNetworkPortgroup;
    
    @JsonProperty(value = "mirrorNetworkPortgroup")
    protected String mirrorNetworkPortgroup;
    
    @JsonProperty(value = "mtu")
    protected Long mtu;
    
    @JsonProperty(value = "multiVMSsupport")
    protected Boolean multiVMSsupport;
    
    @JsonProperty(value = "multicastReceiveInterface")
    protected String multicastReceiveInterface;
    
    @JsonProperty(value = "multicastReceiveInterfaceIP")
    protected String multicastReceiveInterfaceIP;
    
    @JsonProperty(value = "multicastReceiveInterfaceNetmask")
    protected String multicastReceiveInterfaceNetmask;
    
    @JsonProperty(value = "multicastReceiveRange")
    protected String multicastReceiveRange;
    
    @JsonProperty(value = "multicastSendInterface")
    protected String multicastSendInterface;
    
    @JsonProperty(value = "multicastSendInterfaceIP")
    protected String multicastSendInterfaceIP;
    
    @JsonProperty(value = "multicastSendInterfaceNetmask")
    protected String multicastSendInterfaceNetmask;
    
    @JsonProperty(value = "multicastSourcePortgroup")
    protected String multicastSourcePortgroup;
    
    @JsonProperty(value = "networkUplinkInterface")
    protected String networkUplinkInterface;
    
    @JsonProperty(value = "networkUplinkInterfaceGateway")
    protected String networkUplinkInterfaceGateway;
    
    @JsonProperty(value = "networkUplinkInterfaceIp")
    protected String networkUplinkInterfaceIp;
    
    @JsonProperty(value = "networkUplinkInterfaceNetmask")
    protected String networkUplinkInterfaceNetmask;
    
    @JsonProperty(value = "nfsLogServer")
    protected String nfsLogServer;
    
    @JsonProperty(value = "nfsMountPath")
    protected String nfsMountPath;
    
    @JsonProperty(value = "novaClientVersion")
    protected Long novaClientVersion;
    
    @JsonProperty(value = "novaIdentityURLVersion")
    protected String novaIdentityURLVersion;
    
    @JsonProperty(value = "novaMetadataServiceAuthUrl")
    protected String novaMetadataServiceAuthUrl;
    
    @JsonProperty(value = "novaMetadataServiceEndpoint")
    protected String novaMetadataServiceEndpoint;
    
    @JsonProperty(value = "novaMetadataServicePassword")
    protected String novaMetadataServicePassword;
    
    @JsonProperty(value = "novaMetadataServiceTenant")
    protected String novaMetadataServiceTenant;
    
    @JsonProperty(value = "novaMetadataServiceUsername")
    protected String novaMetadataServiceUsername;
    
    @JsonProperty(value = "novaMetadataSharedSecret")
    protected String novaMetadataSharedSecret;
    
    @JsonProperty(value = "novaOSKeystoneUsername")
    protected String novaOSKeystoneUsername;
    
    @JsonProperty(value = "novaProjectDomainName")
    protected String novaProjectDomainName;
    
    @JsonProperty(value = "novaProjectName")
    protected String novaProjectName;
    
    @JsonProperty(value = "novaRegionName")
    protected String novaRegionName;
    
    @JsonProperty(value = "novaUserDomainName")
    protected String novaUserDomainName;
    
    @JsonProperty(value = "ntpServer1")
    protected String ntpServer1;
    
    @JsonProperty(value = "ntpServer2")
    protected String ntpServer2;
    
    @JsonProperty(value = "ovfURL")
    protected String ovfURL;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "personality")
    protected VCenterVRSConfigPersonality personality;
    
    @JsonProperty(value = "portgroupMetadata")
    protected Boolean portgroupMetadata;
    
    @JsonProperty(value = "primaryDataUplinkUnderlayID")
    protected Long primaryDataUplinkUnderlayID;
    
    @JsonProperty(value = "primaryDataUplinkVDFControlVLAN")
    protected Long primaryDataUplinkVDFControlVLAN;
    
    @JsonProperty(value = "primaryNuageController")
    protected String primaryNuageController;
    
    @JsonProperty(value = "remoteSyslogServerIP")
    protected String remoteSyslogServerIP;
    
    @JsonProperty(value = "remoteSyslogServerPort")
    protected Long remoteSyslogServerPort;
    
    @JsonProperty(value = "remoteSyslogServerType")
    protected VCenterVRSConfigRemoteSyslogServerType remoteSyslogServerType;
    
    @JsonProperty(value = "revertiveControllerEnabled")
    protected Boolean revertiveControllerEnabled;
    
    @JsonProperty(value = "revertiveTimer")
    protected Long revertiveTimer;
    
    @JsonProperty(value = "secondaryDataUplinkDHCPEnabled")
    protected Boolean secondaryDataUplinkDHCPEnabled;
    
    @JsonProperty(value = "secondaryDataUplinkEnabled")
    protected Boolean secondaryDataUplinkEnabled;
    
    @JsonProperty(value = "secondaryDataUplinkInterface")
    protected String secondaryDataUplinkInterface;
    
    @JsonProperty(value = "secondaryDataUplinkMTU")
    protected Long secondaryDataUplinkMTU;
    
    @JsonProperty(value = "secondaryDataUplinkPrimaryController")
    protected String secondaryDataUplinkPrimaryController;
    
    @JsonProperty(value = "secondaryDataUplinkSecondaryController")
    protected String secondaryDataUplinkSecondaryController;
    
    @JsonProperty(value = "secondaryDataUplinkUnderlayID")
    protected Long secondaryDataUplinkUnderlayID;
    
    @JsonProperty(value = "secondaryDataUplinkVDFControlVLAN")
    protected Long secondaryDataUplinkVDFControlVLAN;
    
    @JsonProperty(value = "secondaryNuageController")
    protected String secondaryNuageController;
    
    @JsonProperty(value = "separateDataNetwork")
    protected Boolean separateDataNetwork;
    
    @JsonProperty(value = "siteId")
    protected String siteId;
    
    @JsonProperty(value = "staticRoute")
    protected String staticRoute;
    
    @JsonProperty(value = "staticRouteGateway")
    protected String staticRouteGateway;
    
    @JsonProperty(value = "staticRouteNetmask")
    protected String staticRouteNetmask;
    
    @JsonProperty(value = "upgradePackagePassword")
    protected String upgradePackagePassword;
    
    @JsonProperty(value = "upgradePackageURL")
    protected String upgradePackageURL;
    
    @JsonProperty(value = "upgradePackageUsername")
    protected String upgradePackageUsername;
    
    @JsonProperty(value = "upgradeScriptTimeLimit")
    protected Long upgradeScriptTimeLimit;
    
    @JsonProperty(value = "vRequireNuageMetadata")
    protected Boolean vRequireNuageMetadata;
    
    @JsonProperty(value = "vmNetworkPortgroup")
    protected String vmNetworkPortgroup;
    
    @JsonProperty(value = "vrsPassword")
    protected String vrsPassword;
    
    @JsonProperty(value = "vrsUserName")
    protected String vrsUserName;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private VRSAddressRangesFetcher vRSAddressRanges;
    
    @JsonIgnore
    private VRSRedeploymentpoliciesFetcher vRSRedeploymentpolicies;
    
    @VsoConstructor
    public VCenterVRSConfig() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        vRSAddressRanges = new VRSAddressRangesFetcher(this);
        
        vRSRedeploymentpolicies = new VRSRedeploymentpoliciesFetcher(this);
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
    @VsoProperty(displayName = "ARPReply", readOnly = false)   
    public Boolean getARPReply() {
       return ARPReply;
    }

    @JsonIgnore
    public void setARPReply(Boolean value) { 
        this.ARPReply = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSConfigurationTimeLimit", readOnly = false)   
    public Long getVRSConfigurationTimeLimit() {
       return VRSConfigurationTimeLimit;
    }

    @JsonIgnore
    public void setVRSConfigurationTimeLimit(Long value) { 
        this.VRSConfigurationTimeLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowDataDHCP", readOnly = false)   
    public Boolean getAllowDataDHCP() {
       return allowDataDHCP;
    }

    @JsonIgnore
    public void setAllowDataDHCP(Boolean value) { 
        this.allowDataDHCP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowMgmtDHCP", readOnly = false)   
    public Boolean getAllowMgmtDHCP() {
       return allowMgmtDHCP;
    }

    @JsonIgnore
    public void setAllowMgmtDHCP(Boolean value) { 
        this.allowMgmtDHCP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AvrsEnabled", readOnly = false)   
    public Boolean getAvrsEnabled() {
       return avrsEnabled;
    }

    @JsonIgnore
    public void setAvrsEnabled(Boolean value) { 
        this.avrsEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AvrsProfile", readOnly = false)   
    public VCenterVRSConfigAvrsProfile getAvrsProfile() {
       return avrsProfile;
    }

    @JsonIgnore
    public void setAvrsProfile(VCenterVRSConfigAvrsProfile value) { 
        this.avrsProfile = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConfiguredMetricsPushInterval", readOnly = false)   
    public Long getConfiguredMetricsPushInterval() {
       return configuredMetricsPushInterval;
    }

    @JsonIgnore
    public void setConfiguredMetricsPushInterval(Long value) { 
        this.configuredMetricsPushInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CpuCount", readOnly = false)   
    public VCenterVRSConfigCpuCount getCpuCount() {
       return cpuCount;
    }

    @JsonIgnore
    public void setCpuCount(VCenterVRSConfigCpuCount value) { 
        this.cpuCount = value;
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
    @VsoProperty(displayName = "CustomizedScriptURL", readOnly = false)   
    public String getCustomizedScriptURL() {
       return customizedScriptURL;
    }

    @JsonIgnore
    public void setCustomizedScriptURL(String value) { 
        this.customizedScriptURL = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DataDNS1", readOnly = false)   
    public String getDataDNS1() {
       return dataDNS1;
    }

    @JsonIgnore
    public void setDataDNS1(String value) { 
        this.dataDNS1 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DataDNS2", readOnly = false)   
    public String getDataDNS2() {
       return dataDNS2;
    }

    @JsonIgnore
    public void setDataDNS2(String value) { 
        this.dataDNS2 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DataGateway", readOnly = false)   
    public String getDataGateway() {
       return dataGateway;
    }

    @JsonIgnore
    public void setDataGateway(String value) { 
        this.dataGateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DataNetworkPortgroup", readOnly = false)   
    public String getDataNetworkPortgroup() {
       return dataNetworkPortgroup;
    }

    @JsonIgnore
    public void setDataNetworkPortgroup(String value) { 
        this.dataNetworkPortgroup = value;
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
    @VsoProperty(displayName = "DestinationMirrorPort", readOnly = false)   
    public VCenterVRSConfigDestinationMirrorPort getDestinationMirrorPort() {
       return destinationMirrorPort;
    }

    @JsonIgnore
    public void setDestinationMirrorPort(VCenterVRSConfigDestinationMirrorPort value) { 
        this.destinationMirrorPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DhcpRelayServer", readOnly = false)   
    public String getDhcpRelayServer() {
       return dhcpRelayServer;
    }

    @JsonIgnore
    public void setDhcpRelayServer(String value) { 
        this.dhcpRelayServer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DisableGROOnDatapath", readOnly = false)   
    public Boolean getDisableGROOnDatapath() {
       return disableGROOnDatapath;
    }

    @JsonIgnore
    public void setDisableGROOnDatapath(Boolean value) { 
        this.disableGROOnDatapath = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DisableLROOnDatapath", readOnly = false)   
    public Boolean getDisableLROOnDatapath() {
       return disableLROOnDatapath;
    }

    @JsonIgnore
    public void setDisableLROOnDatapath(Boolean value) { 
        this.disableLROOnDatapath = value;
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
    @VsoProperty(displayName = "EnableVRSResourceReservation", readOnly = false)   
    public Boolean getEnableVRSResourceReservation() {
       return enableVRSResourceReservation;
    }

    @JsonIgnore
    public void setEnableVRSResourceReservation(Boolean value) { 
        this.enableVRSResourceReservation = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VCenterVRSConfigEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VCenterVRSConfigEntityScope value) { 
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
    @VsoProperty(displayName = "FlowEvictionThreshold", readOnly = false)   
    public Long getFlowEvictionThreshold() {
       return flowEvictionThreshold;
    }

    @JsonIgnore
    public void setFlowEvictionThreshold(Long value) { 
        this.flowEvictionThreshold = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GenericSplitActivation", readOnly = false)   
    public Boolean getGenericSplitActivation() {
       return genericSplitActivation;
    }

    @JsonIgnore
    public void setGenericSplitActivation(Boolean value) { 
        this.genericSplitActivation = value;
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
    @VsoProperty(displayName = "ManageVRSAvailability", readOnly = false)   
    public Boolean getManageVRSAvailability() {
       return manageVRSAvailability;
    }

    @JsonIgnore
    public void setManageVRSAvailability(Boolean value) { 
        this.manageVRSAvailability = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MemorySizeInGB", readOnly = false)   
    public VCenterVRSConfigMemorySizeInGB getMemorySizeInGB() {
       return memorySizeInGB;
    }

    @JsonIgnore
    public void setMemorySizeInGB(VCenterVRSConfigMemorySizeInGB value) { 
        this.memorySizeInGB = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MetadataServerIP", readOnly = false)   
    public String getMetadataServerIP() {
       return metadataServerIP;
    }

    @JsonIgnore
    public void setMetadataServerIP(String value) { 
        this.metadataServerIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MetadataServerListenPort", readOnly = false)   
    public Long getMetadataServerListenPort() {
       return metadataServerListenPort;
    }

    @JsonIgnore
    public void setMetadataServerListenPort(Long value) { 
        this.metadataServerListenPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MetadataServerPort", readOnly = false)   
    public Long getMetadataServerPort() {
       return metadataServerPort;
    }

    @JsonIgnore
    public void setMetadataServerPort(Long value) { 
        this.metadataServerPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MetadataServiceEnabled", readOnly = false)   
    public Boolean getMetadataServiceEnabled() {
       return metadataServiceEnabled;
    }

    @JsonIgnore
    public void setMetadataServiceEnabled(Boolean value) { 
        this.metadataServiceEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MgmtDNS1", readOnly = false)   
    public String getMgmtDNS1() {
       return mgmtDNS1;
    }

    @JsonIgnore
    public void setMgmtDNS1(String value) { 
        this.mgmtDNS1 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MgmtDNS2", readOnly = false)   
    public String getMgmtDNS2() {
       return mgmtDNS2;
    }

    @JsonIgnore
    public void setMgmtDNS2(String value) { 
        this.mgmtDNS2 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MgmtGateway", readOnly = false)   
    public String getMgmtGateway() {
       return mgmtGateway;
    }

    @JsonIgnore
    public void setMgmtGateway(String value) { 
        this.mgmtGateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MgmtNetworkPortgroup", readOnly = false)   
    public String getMgmtNetworkPortgroup() {
       return mgmtNetworkPortgroup;
    }

    @JsonIgnore
    public void setMgmtNetworkPortgroup(String value) { 
        this.mgmtNetworkPortgroup = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MirrorNetworkPortgroup", readOnly = false)   
    public String getMirrorNetworkPortgroup() {
       return mirrorNetworkPortgroup;
    }

    @JsonIgnore
    public void setMirrorNetworkPortgroup(String value) { 
        this.mirrorNetworkPortgroup = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Mtu", readOnly = false)   
    public Long getMtu() {
       return mtu;
    }

    @JsonIgnore
    public void setMtu(Long value) { 
        this.mtu = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MultiVMSsupport", readOnly = false)   
    public Boolean getMultiVMSsupport() {
       return multiVMSsupport;
    }

    @JsonIgnore
    public void setMultiVMSsupport(Boolean value) { 
        this.multiVMSsupport = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastReceiveInterface", readOnly = false)   
    public String getMulticastReceiveInterface() {
       return multicastReceiveInterface;
    }

    @JsonIgnore
    public void setMulticastReceiveInterface(String value) { 
        this.multicastReceiveInterface = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastReceiveInterfaceIP", readOnly = false)   
    public String getMulticastReceiveInterfaceIP() {
       return multicastReceiveInterfaceIP;
    }

    @JsonIgnore
    public void setMulticastReceiveInterfaceIP(String value) { 
        this.multicastReceiveInterfaceIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastReceiveInterfaceNetmask", readOnly = false)   
    public String getMulticastReceiveInterfaceNetmask() {
       return multicastReceiveInterfaceNetmask;
    }

    @JsonIgnore
    public void setMulticastReceiveInterfaceNetmask(String value) { 
        this.multicastReceiveInterfaceNetmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastReceiveRange", readOnly = false)   
    public String getMulticastReceiveRange() {
       return multicastReceiveRange;
    }

    @JsonIgnore
    public void setMulticastReceiveRange(String value) { 
        this.multicastReceiveRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastSendInterface", readOnly = false)   
    public String getMulticastSendInterface() {
       return multicastSendInterface;
    }

    @JsonIgnore
    public void setMulticastSendInterface(String value) { 
        this.multicastSendInterface = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastSendInterfaceIP", readOnly = false)   
    public String getMulticastSendInterfaceIP() {
       return multicastSendInterfaceIP;
    }

    @JsonIgnore
    public void setMulticastSendInterfaceIP(String value) { 
        this.multicastSendInterfaceIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastSendInterfaceNetmask", readOnly = false)   
    public String getMulticastSendInterfaceNetmask() {
       return multicastSendInterfaceNetmask;
    }

    @JsonIgnore
    public void setMulticastSendInterfaceNetmask(String value) { 
        this.multicastSendInterfaceNetmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MulticastSourcePortgroup", readOnly = false)   
    public String getMulticastSourcePortgroup() {
       return multicastSourcePortgroup;
    }

    @JsonIgnore
    public void setMulticastSourcePortgroup(String value) { 
        this.multicastSourcePortgroup = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkUplinkInterface", readOnly = false)   
    public String getNetworkUplinkInterface() {
       return networkUplinkInterface;
    }

    @JsonIgnore
    public void setNetworkUplinkInterface(String value) { 
        this.networkUplinkInterface = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkUplinkInterfaceGateway", readOnly = false)   
    public String getNetworkUplinkInterfaceGateway() {
       return networkUplinkInterfaceGateway;
    }

    @JsonIgnore
    public void setNetworkUplinkInterfaceGateway(String value) { 
        this.networkUplinkInterfaceGateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkUplinkInterfaceIp", readOnly = false)   
    public String getNetworkUplinkInterfaceIp() {
       return networkUplinkInterfaceIp;
    }

    @JsonIgnore
    public void setNetworkUplinkInterfaceIp(String value) { 
        this.networkUplinkInterfaceIp = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkUplinkInterfaceNetmask", readOnly = false)   
    public String getNetworkUplinkInterfaceNetmask() {
       return networkUplinkInterfaceNetmask;
    }

    @JsonIgnore
    public void setNetworkUplinkInterfaceNetmask(String value) { 
        this.networkUplinkInterfaceNetmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NfsLogServer", readOnly = false)   
    public String getNfsLogServer() {
       return nfsLogServer;
    }

    @JsonIgnore
    public void setNfsLogServer(String value) { 
        this.nfsLogServer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NfsMountPath", readOnly = false)   
    public String getNfsMountPath() {
       return nfsMountPath;
    }

    @JsonIgnore
    public void setNfsMountPath(String value) { 
        this.nfsMountPath = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaClientVersion", readOnly = false)   
    public Long getNovaClientVersion() {
       return novaClientVersion;
    }

    @JsonIgnore
    public void setNovaClientVersion(Long value) { 
        this.novaClientVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaIdentityURLVersion", readOnly = false)   
    public String getNovaIdentityURLVersion() {
       return novaIdentityURLVersion;
    }

    @JsonIgnore
    public void setNovaIdentityURLVersion(String value) { 
        this.novaIdentityURLVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaMetadataServiceAuthUrl", readOnly = false)   
    public String getNovaMetadataServiceAuthUrl() {
       return novaMetadataServiceAuthUrl;
    }

    @JsonIgnore
    public void setNovaMetadataServiceAuthUrl(String value) { 
        this.novaMetadataServiceAuthUrl = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaMetadataServiceEndpoint", readOnly = false)   
    public String getNovaMetadataServiceEndpoint() {
       return novaMetadataServiceEndpoint;
    }

    @JsonIgnore
    public void setNovaMetadataServiceEndpoint(String value) { 
        this.novaMetadataServiceEndpoint = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaMetadataServicePassword", readOnly = false)   
    public String getNovaMetadataServicePassword() {
       return novaMetadataServicePassword;
    }

    @JsonIgnore
    public void setNovaMetadataServicePassword(String value) { 
        this.novaMetadataServicePassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaMetadataServiceTenant", readOnly = false)   
    public String getNovaMetadataServiceTenant() {
       return novaMetadataServiceTenant;
    }

    @JsonIgnore
    public void setNovaMetadataServiceTenant(String value) { 
        this.novaMetadataServiceTenant = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaMetadataServiceUsername", readOnly = false)   
    public String getNovaMetadataServiceUsername() {
       return novaMetadataServiceUsername;
    }

    @JsonIgnore
    public void setNovaMetadataServiceUsername(String value) { 
        this.novaMetadataServiceUsername = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaMetadataSharedSecret", readOnly = false)   
    public String getNovaMetadataSharedSecret() {
       return novaMetadataSharedSecret;
    }

    @JsonIgnore
    public void setNovaMetadataSharedSecret(String value) { 
        this.novaMetadataSharedSecret = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaOSKeystoneUsername", readOnly = false)   
    public String getNovaOSKeystoneUsername() {
       return novaOSKeystoneUsername;
    }

    @JsonIgnore
    public void setNovaOSKeystoneUsername(String value) { 
        this.novaOSKeystoneUsername = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaProjectDomainName", readOnly = false)   
    public String getNovaProjectDomainName() {
       return novaProjectDomainName;
    }

    @JsonIgnore
    public void setNovaProjectDomainName(String value) { 
        this.novaProjectDomainName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaProjectName", readOnly = false)   
    public String getNovaProjectName() {
       return novaProjectName;
    }

    @JsonIgnore
    public void setNovaProjectName(String value) { 
        this.novaProjectName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaRegionName", readOnly = false)   
    public String getNovaRegionName() {
       return novaRegionName;
    }

    @JsonIgnore
    public void setNovaRegionName(String value) { 
        this.novaRegionName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NovaUserDomainName", readOnly = false)   
    public String getNovaUserDomainName() {
       return novaUserDomainName;
    }

    @JsonIgnore
    public void setNovaUserDomainName(String value) { 
        this.novaUserDomainName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NtpServer1", readOnly = false)   
    public String getNtpServer1() {
       return ntpServer1;
    }

    @JsonIgnore
    public void setNtpServer1(String value) { 
        this.ntpServer1 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NtpServer2", readOnly = false)   
    public String getNtpServer2() {
       return ntpServer2;
    }

    @JsonIgnore
    public void setNtpServer2(String value) { 
        this.ntpServer2 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OvfURL", readOnly = false)   
    public String getOvfURL() {
       return ovfURL;
    }

    @JsonIgnore
    public void setOvfURL(String value) { 
        this.ovfURL = value;
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
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public VCenterVRSConfigPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(VCenterVRSConfigPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PortgroupMetadata", readOnly = false)   
    public Boolean getPortgroupMetadata() {
       return portgroupMetadata;
    }

    @JsonIgnore
    public void setPortgroupMetadata(Boolean value) { 
        this.portgroupMetadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PrimaryDataUplinkUnderlayID", readOnly = false)   
    public Long getPrimaryDataUplinkUnderlayID() {
       return primaryDataUplinkUnderlayID;
    }

    @JsonIgnore
    public void setPrimaryDataUplinkUnderlayID(Long value) { 
        this.primaryDataUplinkUnderlayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PrimaryDataUplinkVDFControlVLAN", readOnly = false)   
    public Long getPrimaryDataUplinkVDFControlVLAN() {
       return primaryDataUplinkVDFControlVLAN;
    }

    @JsonIgnore
    public void setPrimaryDataUplinkVDFControlVLAN(Long value) { 
        this.primaryDataUplinkVDFControlVLAN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PrimaryNuageController", readOnly = false)   
    public String getPrimaryNuageController() {
       return primaryNuageController;
    }

    @JsonIgnore
    public void setPrimaryNuageController(String value) { 
        this.primaryNuageController = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemoteSyslogServerIP", readOnly = false)   
    public String getRemoteSyslogServerIP() {
       return remoteSyslogServerIP;
    }

    @JsonIgnore
    public void setRemoteSyslogServerIP(String value) { 
        this.remoteSyslogServerIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemoteSyslogServerPort", readOnly = false)   
    public Long getRemoteSyslogServerPort() {
       return remoteSyslogServerPort;
    }

    @JsonIgnore
    public void setRemoteSyslogServerPort(Long value) { 
        this.remoteSyslogServerPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemoteSyslogServerType", readOnly = false)   
    public VCenterVRSConfigRemoteSyslogServerType getRemoteSyslogServerType() {
       return remoteSyslogServerType;
    }

    @JsonIgnore
    public void setRemoteSyslogServerType(VCenterVRSConfigRemoteSyslogServerType value) { 
        this.remoteSyslogServerType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RevertiveControllerEnabled", readOnly = false)   
    public Boolean getRevertiveControllerEnabled() {
       return revertiveControllerEnabled;
    }

    @JsonIgnore
    public void setRevertiveControllerEnabled(Boolean value) { 
        this.revertiveControllerEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RevertiveTimer", readOnly = false)   
    public Long getRevertiveTimer() {
       return revertiveTimer;
    }

    @JsonIgnore
    public void setRevertiveTimer(Long value) { 
        this.revertiveTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkDHCPEnabled", readOnly = false)   
    public Boolean getSecondaryDataUplinkDHCPEnabled() {
       return secondaryDataUplinkDHCPEnabled;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkDHCPEnabled(Boolean value) { 
        this.secondaryDataUplinkDHCPEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkEnabled", readOnly = false)   
    public Boolean getSecondaryDataUplinkEnabled() {
       return secondaryDataUplinkEnabled;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkEnabled(Boolean value) { 
        this.secondaryDataUplinkEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkInterface", readOnly = false)   
    public String getSecondaryDataUplinkInterface() {
       return secondaryDataUplinkInterface;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkInterface(String value) { 
        this.secondaryDataUplinkInterface = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkMTU", readOnly = false)   
    public Long getSecondaryDataUplinkMTU() {
       return secondaryDataUplinkMTU;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkMTU(Long value) { 
        this.secondaryDataUplinkMTU = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkPrimaryController", readOnly = false)   
    public String getSecondaryDataUplinkPrimaryController() {
       return secondaryDataUplinkPrimaryController;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkPrimaryController(String value) { 
        this.secondaryDataUplinkPrimaryController = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkSecondaryController", readOnly = false)   
    public String getSecondaryDataUplinkSecondaryController() {
       return secondaryDataUplinkSecondaryController;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkSecondaryController(String value) { 
        this.secondaryDataUplinkSecondaryController = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkUnderlayID", readOnly = false)   
    public Long getSecondaryDataUplinkUnderlayID() {
       return secondaryDataUplinkUnderlayID;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkUnderlayID(Long value) { 
        this.secondaryDataUplinkUnderlayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryDataUplinkVDFControlVLAN", readOnly = false)   
    public Long getSecondaryDataUplinkVDFControlVLAN() {
       return secondaryDataUplinkVDFControlVLAN;
    }

    @JsonIgnore
    public void setSecondaryDataUplinkVDFControlVLAN(Long value) { 
        this.secondaryDataUplinkVDFControlVLAN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryNuageController", readOnly = false)   
    public String getSecondaryNuageController() {
       return secondaryNuageController;
    }

    @JsonIgnore
    public void setSecondaryNuageController(String value) { 
        this.secondaryNuageController = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeparateDataNetwork", readOnly = false)   
    public Boolean getSeparateDataNetwork() {
       return separateDataNetwork;
    }

    @JsonIgnore
    public void setSeparateDataNetwork(Boolean value) { 
        this.separateDataNetwork = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SiteId", readOnly = false)   
    public String getSiteId() {
       return siteId;
    }

    @JsonIgnore
    public void setSiteId(String value) { 
        this.siteId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRoute", readOnly = false)   
    public String getStaticRoute() {
       return staticRoute;
    }

    @JsonIgnore
    public void setStaticRoute(String value) { 
        this.staticRoute = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRouteGateway", readOnly = false)   
    public String getStaticRouteGateway() {
       return staticRouteGateway;
    }

    @JsonIgnore
    public void setStaticRouteGateway(String value) { 
        this.staticRouteGateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRouteNetmask", readOnly = false)   
    public String getStaticRouteNetmask() {
       return staticRouteNetmask;
    }

    @JsonIgnore
    public void setStaticRouteNetmask(String value) { 
        this.staticRouteNetmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UpgradePackagePassword", readOnly = false)   
    public String getUpgradePackagePassword() {
       return upgradePackagePassword;
    }

    @JsonIgnore
    public void setUpgradePackagePassword(String value) { 
        this.upgradePackagePassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UpgradePackageURL", readOnly = false)   
    public String getUpgradePackageURL() {
       return upgradePackageURL;
    }

    @JsonIgnore
    public void setUpgradePackageURL(String value) { 
        this.upgradePackageURL = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UpgradePackageUsername", readOnly = false)   
    public String getUpgradePackageUsername() {
       return upgradePackageUsername;
    }

    @JsonIgnore
    public void setUpgradePackageUsername(String value) { 
        this.upgradePackageUsername = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UpgradeScriptTimeLimit", readOnly = false)   
    public Long getUpgradeScriptTimeLimit() {
       return upgradeScriptTimeLimit;
    }

    @JsonIgnore
    public void setUpgradeScriptTimeLimit(Long value) { 
        this.upgradeScriptTimeLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRequireNuageMetadata", readOnly = false)   
    public Boolean getVRequireNuageMetadata() {
       return vRequireNuageMetadata;
    }

    @JsonIgnore
    public void setVRequireNuageMetadata(Boolean value) { 
        this.vRequireNuageMetadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VmNetworkPortgroup", readOnly = false)   
    public String getVmNetworkPortgroup() {
       return vmNetworkPortgroup;
    }

    @JsonIgnore
    public void setVmNetworkPortgroup(String value) { 
        this.vmNetworkPortgroup = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VrsPassword", readOnly = false)   
    public String getVrsPassword() {
       return vrsPassword;
    }

    @JsonIgnore
    public void setVrsPassword(String value) { 
        this.vrsPassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VrsUserName", readOnly = false)   
    public String getVrsUserName() {
       return vrsUserName;
    }

    @JsonIgnore
    public void setVrsUserName(String value) { 
        this.vrsUserName = value;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSAddressRanges", readOnly = true)   
    public VRSAddressRangesFetcher getVRSAddressRanges() {
        return vRSAddressRanges;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSRedeploymentpolicies", readOnly = true)   
    public VRSRedeploymentpoliciesFetcher getVRSRedeploymentpolicies() {
        return vRSRedeploymentpolicies;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VCENTERVRSCONFIG, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VCENTERVRSCONFIG, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VCENTERVRSCONFIG, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VCENTERVRSCONFIG, getId());
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
    }
    @VsoMethod
    public void createVRSAddressRange(Session session, VRSAddressRange childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VRSADDRESSRANGES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVRSRedeploymentpolicy(Session session, VRSRedeploymentpolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, getId());
        }
    }public String toString() {
        return "VCenterVRSConfig [" + "ARPReply=" + ARPReply + ", VRSConfigurationTimeLimit=" + VRSConfigurationTimeLimit + ", allowDataDHCP=" + allowDataDHCP + ", allowMgmtDHCP=" + allowMgmtDHCP + ", avrsEnabled=" + avrsEnabled + ", avrsProfile=" + avrsProfile + ", configuredMetricsPushInterval=" + configuredMetricsPushInterval + ", cpuCount=" + cpuCount + ", creationDate=" + creationDate + ", customizedScriptURL=" + customizedScriptURL + ", dataDNS1=" + dataDNS1 + ", dataDNS2=" + dataDNS2 + ", dataGateway=" + dataGateway + ", dataNetworkPortgroup=" + dataNetworkPortgroup + ", datapathSyncTimeout=" + datapathSyncTimeout + ", destinationMirrorPort=" + destinationMirrorPort + ", dhcpRelayServer=" + dhcpRelayServer + ", disableGROOnDatapath=" + disableGROOnDatapath + ", disableLROOnDatapath=" + disableLROOnDatapath + ", embeddedMetadata=" + embeddedMetadata + ", enableVRSResourceReservation=" + enableVRSResourceReservation + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowEvictionThreshold=" + flowEvictionThreshold + ", genericSplitActivation=" + genericSplitActivation + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", manageVRSAvailability=" + manageVRSAvailability + ", memorySizeInGB=" + memorySizeInGB + ", metadataServerIP=" + metadataServerIP + ", metadataServerListenPort=" + metadataServerListenPort + ", metadataServerPort=" + metadataServerPort + ", metadataServiceEnabled=" + metadataServiceEnabled + ", mgmtDNS1=" + mgmtDNS1 + ", mgmtDNS2=" + mgmtDNS2 + ", mgmtGateway=" + mgmtGateway + ", mgmtNetworkPortgroup=" + mgmtNetworkPortgroup + ", mirrorNetworkPortgroup=" + mirrorNetworkPortgroup + ", mtu=" + mtu + ", multiVMSsupport=" + multiVMSsupport + ", multicastReceiveInterface=" + multicastReceiveInterface + ", multicastReceiveInterfaceIP=" + multicastReceiveInterfaceIP + ", multicastReceiveInterfaceNetmask=" + multicastReceiveInterfaceNetmask + ", multicastReceiveRange=" + multicastReceiveRange + ", multicastSendInterface=" + multicastSendInterface + ", multicastSendInterfaceIP=" + multicastSendInterfaceIP + ", multicastSendInterfaceNetmask=" + multicastSendInterfaceNetmask + ", multicastSourcePortgroup=" + multicastSourcePortgroup + ", networkUplinkInterface=" + networkUplinkInterface + ", networkUplinkInterfaceGateway=" + networkUplinkInterfaceGateway + ", networkUplinkInterfaceIp=" + networkUplinkInterfaceIp + ", networkUplinkInterfaceNetmask=" + networkUplinkInterfaceNetmask + ", nfsLogServer=" + nfsLogServer + ", nfsMountPath=" + nfsMountPath + ", novaClientVersion=" + novaClientVersion + ", novaIdentityURLVersion=" + novaIdentityURLVersion + ", novaMetadataServiceAuthUrl=" + novaMetadataServiceAuthUrl + ", novaMetadataServiceEndpoint=" + novaMetadataServiceEndpoint + ", novaMetadataServicePassword=" + novaMetadataServicePassword + ", novaMetadataServiceTenant=" + novaMetadataServiceTenant + ", novaMetadataServiceUsername=" + novaMetadataServiceUsername + ", novaMetadataSharedSecret=" + novaMetadataSharedSecret + ", novaOSKeystoneUsername=" + novaOSKeystoneUsername + ", novaProjectDomainName=" + novaProjectDomainName + ", novaProjectName=" + novaProjectName + ", novaRegionName=" + novaRegionName + ", novaUserDomainName=" + novaUserDomainName + ", ntpServer1=" + ntpServer1 + ", ntpServer2=" + ntpServer2 + ", ovfURL=" + ovfURL + ", owner=" + owner + ", personality=" + personality + ", portgroupMetadata=" + portgroupMetadata + ", primaryDataUplinkUnderlayID=" + primaryDataUplinkUnderlayID + ", primaryDataUplinkVDFControlVLAN=" + primaryDataUplinkVDFControlVLAN + ", primaryNuageController=" + primaryNuageController + ", remoteSyslogServerIP=" + remoteSyslogServerIP + ", remoteSyslogServerPort=" + remoteSyslogServerPort + ", remoteSyslogServerType=" + remoteSyslogServerType + ", revertiveControllerEnabled=" + revertiveControllerEnabled + ", revertiveTimer=" + revertiveTimer + ", secondaryDataUplinkDHCPEnabled=" + secondaryDataUplinkDHCPEnabled + ", secondaryDataUplinkEnabled=" + secondaryDataUplinkEnabled + ", secondaryDataUplinkInterface=" + secondaryDataUplinkInterface + ", secondaryDataUplinkMTU=" + secondaryDataUplinkMTU + ", secondaryDataUplinkPrimaryController=" + secondaryDataUplinkPrimaryController + ", secondaryDataUplinkSecondaryController=" + secondaryDataUplinkSecondaryController + ", secondaryDataUplinkUnderlayID=" + secondaryDataUplinkUnderlayID + ", secondaryDataUplinkVDFControlVLAN=" + secondaryDataUplinkVDFControlVLAN + ", secondaryNuageController=" + secondaryNuageController + ", separateDataNetwork=" + separateDataNetwork + ", siteId=" + siteId + ", staticRoute=" + staticRoute + ", staticRouteGateway=" + staticRouteGateway + ", staticRouteNetmask=" + staticRouteNetmask + ", upgradePackagePassword=" + upgradePackagePassword + ", upgradePackageURL=" + upgradePackageURL + ", upgradePackageUsername=" + upgradePackageUsername + ", upgradeScriptTimeLimit=" + upgradeScriptTimeLimit + ", vRequireNuageMetadata=" + vRequireNuageMetadata + ", vmNetworkPortgroup=" + vmNetworkPortgroup + ", vrsPassword=" + vrsPassword + ", vrsUserName=" + vrsUserName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}