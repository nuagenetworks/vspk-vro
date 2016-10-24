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

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSAddressRangesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSMetricsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSRedeploymentpoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VCenterHypervisorDestinationMirrorPort;

import net.nuagenetworks.vro.vspk.model.enums.VCenterHypervisorEntityScope;
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

@VsoFinder(name = Constants.VCENTERHYPERVISOR, datasource = Constants.DATASOURCE, image = Constants.VCENTERHYPERVISOR_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VRSADDRESSRANGES_FETCHER, type = Constants.VRSADDRESSRANGES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, type = Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vcenterhypervisor", resourceName = "vcenterhypervisors")
public class VCenterHypervisor extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "VRSMetricsID")
    protected String VRSMetricsID;
    
    @JsonProperty(value = "allowDataDHCP")
    protected Boolean allowDataDHCP;
    
    @JsonProperty(value = "allowMgmtDHCP")
    protected Boolean allowMgmtDHCP;
    
    @JsonProperty(value = "availableNetworks")
    protected java.util.List<String> availableNetworks;
    
    @JsonProperty(value = "customizedScriptURL")
    protected String customizedScriptURL;
    
    @JsonProperty(value = "dataDNS1")
    protected String dataDNS1;
    
    @JsonProperty(value = "dataDNS2")
    protected String dataDNS2;
    
    @JsonProperty(value = "dataGateway")
    protected String dataGateway;
    
    @JsonProperty(value = "dataIPAddress")
    protected String dataIPAddress;
    
    @JsonProperty(value = "dataNetmask")
    protected String dataNetmask;
    
    @JsonProperty(value = "dataNetworkPortgroup")
    protected String dataNetworkPortgroup;
    
    @JsonProperty(value = "datapathSyncTimeout")
    protected Long datapathSyncTimeout;
    
    @JsonProperty(value = "deploymentCount")
    protected Long deploymentCount;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destinationMirrorPort")
    protected VCenterHypervisorDestinationMirrorPort destinationMirrorPort;
    
    @JsonProperty(value = "dhcpRelayServer")
    protected String dhcpRelayServer;
    
    @JsonProperty(value = "entityScope")
    protected VCenterHypervisorEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowEvictionThreshold")
    protected Long flowEvictionThreshold;
    
    @JsonProperty(value = "genericSplitActivation")
    protected Boolean genericSplitActivation;
    
    @JsonProperty(value = "hypervisorIP")
    protected String hypervisorIP;
    
    @JsonProperty(value = "hypervisorPassword")
    protected String hypervisorPassword;
    
    @JsonProperty(value = "hypervisorUser")
    protected String hypervisorUser;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastVRSDeployedDate")
    protected Float lastVRSDeployedDate;
    
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
    
    @JsonProperty(value = "mgmtIPAddress")
    protected String mgmtIPAddress;
    
    @JsonProperty(value = "mgmtNetmask")
    protected String mgmtNetmask;
    
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
    
    @JsonProperty(value = "name")
    protected String name;
    
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
    
    @JsonProperty(value = "novaRegionName")
    protected String novaRegionName;
    
    @JsonProperty(value = "ntpServer1")
    protected String ntpServer1;
    
    @JsonProperty(value = "ntpServer2")
    protected String ntpServer2;
    
    @JsonProperty(value = "personality")
    protected String personality;
    
    @JsonProperty(value = "portgroupMetadata")
    protected Boolean portgroupMetadata;
    
    @JsonProperty(value = "primaryNuageController")
    protected String primaryNuageController;
    
    @JsonProperty(value = "removedFromVCenterInventory")
    protected Boolean removedFromVCenterInventory;
    
    @JsonProperty(value = "scope")
    protected Boolean scope;
    
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
    
    @JsonProperty(value = "toolboxDeploymentMode")
    protected Boolean toolboxDeploymentMode;
    
    @JsonProperty(value = "toolboxGroup")
    protected String toolboxGroup;
    
    @JsonProperty(value = "toolboxIP")
    protected String toolboxIP;
    
    @JsonProperty(value = "toolboxPassword")
    protected String toolboxPassword;
    
    @JsonProperty(value = "toolboxUserName")
    protected String toolboxUserName;
    
    @JsonProperty(value = "vCenterIP")
    protected String vCenterIP;
    
    @JsonProperty(value = "vCenterPassword")
    protected String vCenterPassword;
    
    @JsonProperty(value = "vCenterUser")
    protected String vCenterUser;
    
    @JsonProperty(value = "vRequireNuageMetadata")
    protected Boolean vRequireNuageMetadata;
    
    @JsonProperty(value = "vmNetworkPortgroup")
    protected String vmNetworkPortgroup;
    
    @JsonProperty(value = "vrsId")
    protected String vrsId;
    
    @JsonProperty(value = "vrsPassword")
    protected String vrsPassword;
    
    @JsonProperty(value = "vrsUserName")
    protected String vrsUserName;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private VRSAddressRangesFetcher vRSAddressRanges;
    
    @JsonIgnore
    private VRSMetricsFetcher vRSMetrics;
    
    @JsonIgnore
    private VRSRedeploymentpoliciesFetcher vRSRedeploymentpolicies;
    
    @VsoConstructor
    public VCenterHypervisor() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        vRSAddressRanges = new VRSAddressRangesFetcher(this);
        
        vRSMetrics = new VRSMetricsFetcher(this);
        
        vRSRedeploymentpolicies = new VRSRedeploymentpoliciesFetcher(this);
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
    @VsoProperty(displayName = "VRSMetricsID", readOnly = false)   
    public String getVRSMetricsID() {
       return VRSMetricsID;
    }

    @JsonIgnore
    public void setVRSMetricsID(String value) { 
        this.VRSMetricsID = value;
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
    @VsoProperty(displayName = "AvailableNetworks", readOnly = false)   
    public java.util.List<String> getAvailableNetworks() {
       return availableNetworks;
    }

    @JsonIgnore
    public void setAvailableNetworks(java.util.List<String> value) { 
        this.availableNetworks = value;
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
    @VsoProperty(displayName = "DataIPAddress", readOnly = false)   
    public String getDataIPAddress() {
       return dataIPAddress;
    }

    @JsonIgnore
    public void setDataIPAddress(String value) { 
        this.dataIPAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DataNetmask", readOnly = false)   
    public String getDataNetmask() {
       return dataNetmask;
    }

    @JsonIgnore
    public void setDataNetmask(String value) { 
        this.dataNetmask = value;
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
    @VsoProperty(displayName = "DeploymentCount", readOnly = false)   
    public Long getDeploymentCount() {
       return deploymentCount;
    }

    @JsonIgnore
    public void setDeploymentCount(Long value) { 
        this.deploymentCount = value;
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
    @VsoProperty(displayName = "DestinationMirrorPort", readOnly = false)   
    public VCenterHypervisorDestinationMirrorPort getDestinationMirrorPort() {
       return destinationMirrorPort;
    }

    @JsonIgnore
    public void setDestinationMirrorPort(VCenterHypervisorDestinationMirrorPort value) { 
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
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VCenterHypervisorEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VCenterHypervisorEntityScope value) { 
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
    @VsoProperty(displayName = "HypervisorIP", readOnly = false)   
    public String getHypervisorIP() {
       return hypervisorIP;
    }

    @JsonIgnore
    public void setHypervisorIP(String value) { 
        this.hypervisorIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HypervisorPassword", readOnly = false)   
    public String getHypervisorPassword() {
       return hypervisorPassword;
    }

    @JsonIgnore
    public void setHypervisorPassword(String value) { 
        this.hypervisorPassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HypervisorUser", readOnly = false)   
    public String getHypervisorUser() {
       return hypervisorUser;
    }

    @JsonIgnore
    public void setHypervisorUser(String value) { 
        this.hypervisorUser = value;
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
    @VsoProperty(displayName = "LastVRSDeployedDate", readOnly = false)   
    public Float getLastVRSDeployedDate() {
       return lastVRSDeployedDate;
    }

    @JsonIgnore
    public void setLastVRSDeployedDate(Float value) { 
        this.lastVRSDeployedDate = value;
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
    @VsoProperty(displayName = "MgmtIPAddress", readOnly = false)   
    public String getMgmtIPAddress() {
       return mgmtIPAddress;
    }

    @JsonIgnore
    public void setMgmtIPAddress(String value) { 
        this.mgmtIPAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MgmtNetmask", readOnly = false)   
    public String getMgmtNetmask() {
       return mgmtNetmask;
    }

    @JsonIgnore
    public void setMgmtNetmask(String value) { 
        this.mgmtNetmask = value;
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
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
    @VsoProperty(displayName = "NovaRegionName", readOnly = false)   
    public String getNovaRegionName() {
       return novaRegionName;
    }

    @JsonIgnore
    public void setNovaRegionName(String value) { 
        this.novaRegionName = value;
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
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public String getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(String value) { 
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
    @VsoProperty(displayName = "PrimaryNuageController", readOnly = false)   
    public String getPrimaryNuageController() {
       return primaryNuageController;
    }

    @JsonIgnore
    public void setPrimaryNuageController(String value) { 
        this.primaryNuageController = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RemovedFromVCenterInventory", readOnly = false)   
    public Boolean getRemovedFromVCenterInventory() {
       return removedFromVCenterInventory;
    }

    @JsonIgnore
    public void setRemovedFromVCenterInventory(Boolean value) { 
        this.removedFromVCenterInventory = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Scope", readOnly = false)   
    public Boolean getScope() {
       return scope;
    }

    @JsonIgnore
    public void setScope(Boolean value) { 
        this.scope = value;
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
    @VsoProperty(displayName = "ToolboxDeploymentMode", readOnly = false)   
    public Boolean getToolboxDeploymentMode() {
       return toolboxDeploymentMode;
    }

    @JsonIgnore
    public void setToolboxDeploymentMode(Boolean value) { 
        this.toolboxDeploymentMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ToolboxGroup", readOnly = false)   
    public String getToolboxGroup() {
       return toolboxGroup;
    }

    @JsonIgnore
    public void setToolboxGroup(String value) { 
        this.toolboxGroup = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ToolboxIP", readOnly = false)   
    public String getToolboxIP() {
       return toolboxIP;
    }

    @JsonIgnore
    public void setToolboxIP(String value) { 
        this.toolboxIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ToolboxPassword", readOnly = false)   
    public String getToolboxPassword() {
       return toolboxPassword;
    }

    @JsonIgnore
    public void setToolboxPassword(String value) { 
        this.toolboxPassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ToolboxUserName", readOnly = false)   
    public String getToolboxUserName() {
       return toolboxUserName;
    }

    @JsonIgnore
    public void setToolboxUserName(String value) { 
        this.toolboxUserName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenterIP", readOnly = false)   
    public String getVCenterIP() {
       return vCenterIP;
    }

    @JsonIgnore
    public void setVCenterIP(String value) { 
        this.vCenterIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenterPassword", readOnly = false)   
    public String getVCenterPassword() {
       return vCenterPassword;
    }

    @JsonIgnore
    public void setVCenterPassword(String value) { 
        this.vCenterPassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenterUser", readOnly = false)   
    public String getVCenterUser() {
       return vCenterUser;
    }

    @JsonIgnore
    public void setVCenterUser(String value) { 
        this.vCenterUser = value;
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
    @VsoProperty(displayName = "VrsId", readOnly = false)   
    public String getVrsId() {
       return vrsId;
    }

    @JsonIgnore
    public void setVrsId(String value) { 
        this.vrsId = value;
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
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSAddressRanges", readOnly = true)   
    public VRSAddressRangesFetcher getVRSAddressRanges() {
        return vRSAddressRanges;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSMetrics", readOnly = true)   
    public VRSMetricsFetcher getVRSMetrics() {
        return vRSMetrics;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.VCENTERHYPERVISOR, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VCENTERHYPERVISOR, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VCENTERHYPERVISOR, getId());
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
        return "VCenterHypervisor [" + "VRSMetricsID=" + VRSMetricsID + ", allowDataDHCP=" + allowDataDHCP + ", allowMgmtDHCP=" + allowMgmtDHCP + ", availableNetworks=" + availableNetworks + ", customizedScriptURL=" + customizedScriptURL + ", dataDNS1=" + dataDNS1 + ", dataDNS2=" + dataDNS2 + ", dataGateway=" + dataGateway + ", dataIPAddress=" + dataIPAddress + ", dataNetmask=" + dataNetmask + ", dataNetworkPortgroup=" + dataNetworkPortgroup + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deploymentCount=" + deploymentCount + ", description=" + description + ", destinationMirrorPort=" + destinationMirrorPort + ", dhcpRelayServer=" + dhcpRelayServer + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowEvictionThreshold=" + flowEvictionThreshold + ", genericSplitActivation=" + genericSplitActivation + ", hypervisorIP=" + hypervisorIP + ", hypervisorPassword=" + hypervisorPassword + ", hypervisorUser=" + hypervisorUser + ", lastUpdatedBy=" + lastUpdatedBy + ", lastVRSDeployedDate=" + lastVRSDeployedDate + ", metadataServerIP=" + metadataServerIP + ", metadataServerListenPort=" + metadataServerListenPort + ", metadataServerPort=" + metadataServerPort + ", metadataServiceEnabled=" + metadataServiceEnabled + ", mgmtDNS1=" + mgmtDNS1 + ", mgmtDNS2=" + mgmtDNS2 + ", mgmtGateway=" + mgmtGateway + ", mgmtIPAddress=" + mgmtIPAddress + ", mgmtNetmask=" + mgmtNetmask + ", mgmtNetworkPortgroup=" + mgmtNetworkPortgroup + ", mirrorNetworkPortgroup=" + mirrorNetworkPortgroup + ", mtu=" + mtu + ", multiVMSsupport=" + multiVMSsupport + ", multicastReceiveInterface=" + multicastReceiveInterface + ", multicastReceiveInterfaceIP=" + multicastReceiveInterfaceIP + ", multicastReceiveInterfaceNetmask=" + multicastReceiveInterfaceNetmask + ", multicastReceiveRange=" + multicastReceiveRange + ", multicastSendInterface=" + multicastSendInterface + ", multicastSendInterfaceIP=" + multicastSendInterfaceIP + ", multicastSendInterfaceNetmask=" + multicastSendInterfaceNetmask + ", multicastSourcePortgroup=" + multicastSourcePortgroup + ", name=" + name + ", networkUplinkInterface=" + networkUplinkInterface + ", networkUplinkInterfaceGateway=" + networkUplinkInterfaceGateway + ", networkUplinkInterfaceIp=" + networkUplinkInterfaceIp + ", networkUplinkInterfaceNetmask=" + networkUplinkInterfaceNetmask + ", nfsLogServer=" + nfsLogServer + ", nfsMountPath=" + nfsMountPath + ", novaClientVersion=" + novaClientVersion + ", novaMetadataServiceAuthUrl=" + novaMetadataServiceAuthUrl + ", novaMetadataServiceEndpoint=" + novaMetadataServiceEndpoint + ", novaMetadataServicePassword=" + novaMetadataServicePassword + ", novaMetadataServiceTenant=" + novaMetadataServiceTenant + ", novaMetadataServiceUsername=" + novaMetadataServiceUsername + ", novaMetadataSharedSecret=" + novaMetadataSharedSecret + ", novaRegionName=" + novaRegionName + ", ntpServer1=" + ntpServer1 + ", ntpServer2=" + ntpServer2 + ", personality=" + personality + ", portgroupMetadata=" + portgroupMetadata + ", primaryNuageController=" + primaryNuageController + ", removedFromVCenterInventory=" + removedFromVCenterInventory + ", scope=" + scope + ", secondaryNuageController=" + secondaryNuageController + ", separateDataNetwork=" + separateDataNetwork + ", siteId=" + siteId + ", staticRoute=" + staticRoute + ", staticRouteGateway=" + staticRouteGateway + ", staticRouteNetmask=" + staticRouteNetmask + ", toolboxDeploymentMode=" + toolboxDeploymentMode + ", toolboxGroup=" + toolboxGroup + ", toolboxIP=" + toolboxIP + ", toolboxPassword=" + toolboxPassword + ", toolboxUserName=" + toolboxUserName + ", vCenterIP=" + vCenterIP + ", vCenterPassword=" + vCenterPassword + ", vCenterUser=" + vCenterUser + ", vRequireNuageMetadata=" + vRequireNuageMetadata + ", vmNetworkPortgroup=" + vmNetworkPortgroup + ", vrsId=" + vrsId + ", vrsPassword=" + vrsPassword + ", vrsUserName=" + vrsUserName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}