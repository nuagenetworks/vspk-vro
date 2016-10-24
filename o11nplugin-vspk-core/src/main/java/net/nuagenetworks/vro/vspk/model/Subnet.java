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
import net.nuagenetworks.vro.vspk.model.fetchers.AddressRangesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPNeighborsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerResyncsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPOptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewayConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPReservationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QOSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMResyncsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualIPsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPortsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.SubnetDPI;

import net.nuagenetworks.vro.vspk.model.enums.SubnetIPType;

import net.nuagenetworks.vro.vspk.model.enums.SubnetPATEnabled;

import net.nuagenetworks.vro.vspk.model.enums.SubnetAssociatedApplicationObjectType;

import net.nuagenetworks.vro.vspk.model.enums.SubnetDefaultAction;

import net.nuagenetworks.vro.vspk.model.enums.SubnetEncryption;

import net.nuagenetworks.vro.vspk.model.enums.SubnetEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.SubnetMaintenanceMode;

import net.nuagenetworks.vro.vspk.model.enums.SubnetMulticast;

import net.nuagenetworks.vro.vspk.model.enums.SubnetUnderlayEnabled;

import net.nuagenetworks.vro.vspk.model.enums.SubnetUseGlobalMAC;
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

@VsoFinder(name = Constants.SUBNET, datasource = Constants.DATASOURCE, image = Constants.SUBNET_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ADDRESSRANGES_FETCHER, type = Constants.ADDRESSRANGES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.BGPNEIGHBORS_FETCHER, type = Constants.BGPNEIGHBORS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CONTAINERRESYNCS_FETCHER, type = Constants.CONTAINERRESYNCS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPOPTIONS_FETCHER, type = Constants.DHCPOPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IPRESERVATIONS_FETCHER, type = Constants.IPRESERVATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.QOSS_FETCHER, type = Constants.QOSS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VMRESYNCS_FETCHER, type = Constants.VMRESYNCS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATISTICSPOLICIES_FETCHER, type = Constants.STATISTICSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TCAS_FETCHER, type = Constants.TCAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VPORTS_FETCHER, type = Constants.VPORTS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "subnet", resourceName = "subnets")
public class Subnet extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DPI")
    protected SubnetDPI DPI;
    
    @JsonProperty(value = "IPType")
    protected SubnetIPType IPType;
    
    @JsonProperty(value = "IPv6Address")
    protected String IPv6Address;
    
    @JsonProperty(value = "IPv6Gateway")
    protected String IPv6Gateway;
    
    @JsonProperty(value = "PATEnabled")
    protected SubnetPATEnabled PATEnabled;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "associatedApplicationID")
    protected String associatedApplicationID;
    
    @JsonProperty(value = "associatedApplicationObjectID")
    protected String associatedApplicationObjectID;
    
    @JsonProperty(value = "associatedApplicationObjectType")
    protected SubnetAssociatedApplicationObjectType associatedApplicationObjectType;
    
    @JsonProperty(value = "associatedMulticastChannelMapID")
    protected String associatedMulticastChannelMapID;
    
    @JsonProperty(value = "associatedSharedNetworkResourceID")
    protected String associatedSharedNetworkResourceID;
    
    @JsonProperty(value = "defaultAction")
    protected SubnetDefaultAction defaultAction;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "encryption")
    protected SubnetEncryption encryption;
    
    @JsonProperty(value = "entityScope")
    protected SubnetEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "gatewayMACAddress")
    protected String gatewayMACAddress;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "maintenanceMode")
    protected SubnetMaintenanceMode maintenanceMode;
    
    @JsonProperty(value = "multicast")
    protected SubnetMulticast multicast;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "policyGroupID")
    protected Long policyGroupID;
    
    @JsonProperty(value = "proxyARP")
    protected Boolean proxyARP;
    
    @JsonProperty(value = "public")
    protected Boolean public_;
    
    @JsonProperty(value = "routeDistinguisher")
    protected String routeDistinguisher;
    
    @JsonProperty(value = "routeTarget")
    protected String routeTarget;
    
    @JsonProperty(value = "serviceID")
    protected Long serviceID;
    
    @JsonProperty(value = "splitSubnet")
    protected Boolean splitSubnet;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "underlay")
    protected Boolean underlay;
    
    @JsonProperty(value = "underlayEnabled")
    protected SubnetUnderlayEnabled underlayEnabled;
    
    @JsonProperty(value = "useGlobalMAC")
    protected SubnetUseGlobalMAC useGlobalMAC;
    
    @JsonProperty(value = "vnId")
    protected Long vnId;
    
    @JsonIgnore
    private AddressRangesFetcher addressRanges;
    
    @JsonIgnore
    private BGPNeighborsFetcher bGPNeighbors;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private ContainerInterfacesFetcher containerInterfaces;
    
    @JsonIgnore
    private ContainerResyncsFetcher containerResyncs;
    
    @JsonIgnore
    private DHCPOptionsFetcher dHCPOptions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private IKEGatewayConnectionsFetcher iKEGatewayConnections;
    
    @JsonIgnore
    private IPReservationsFetcher iPReservations;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private QOSsFetcher qOSs;
    
    @JsonIgnore
    private VMResyncsFetcher vMResyncs;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private StatisticsPoliciesFetcher statisticsPolicies;
    
    @JsonIgnore
    private TCAsFetcher tCAs;
    
    @JsonIgnore
    private VirtualIPsFetcher virtualIPs;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VMInterfacesFetcher vMInterfaces;
    
    @JsonIgnore
    private VPortsFetcher vPorts;
    
    @VsoConstructor
    public Subnet() {
        PATEnabled = SubnetPATEnabled.INHERITED;
        
        multicast = SubnetMulticast.INHERITED;
        
        IPType = SubnetIPType.IPV4;
        
        maintenanceMode = SubnetMaintenanceMode.DISABLED;
        
        addressRanges = new AddressRangesFetcher(this);
        
        bGPNeighbors = new BGPNeighborsFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        containerResyncs = new ContainerResyncsFetcher(this);
        
        dHCPOptions = new DHCPOptionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
        
        iPReservations = new IPReservationsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        qOSs = new QOSsFetcher(this);
        
        vMResyncs = new VMResyncsFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        statisticsPolicies = new StatisticsPoliciesFetcher(this);
        
        tCAs = new TCAsFetcher(this);
        
        virtualIPs = new VirtualIPsFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vMInterfaces = new VMInterfacesFetcher(this);
        
        vPorts = new VPortsFetcher(this);
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
    @VsoProperty(displayName = "DPI", readOnly = false)   
    public SubnetDPI getDPI() {
       return DPI;
    }

    @JsonIgnore
    public void setDPI(SubnetDPI value) { 
        this.DPI = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPType", readOnly = false)   
    public SubnetIPType getIPType() {
       return IPType;
    }

    @JsonIgnore
    public void setIPType(SubnetIPType value) { 
        this.IPType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6Address", readOnly = false)   
    public String getIPv6Address() {
       return IPv6Address;
    }

    @JsonIgnore
    public void setIPv6Address(String value) { 
        this.IPv6Address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6Gateway", readOnly = false)   
    public String getIPv6Gateway() {
       return IPv6Gateway;
    }

    @JsonIgnore
    public void setIPv6Gateway(String value) { 
        this.IPv6Gateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATEnabled", readOnly = false)   
    public SubnetPATEnabled getPATEnabled() {
       return PATEnabled;
    }

    @JsonIgnore
    public void setPATEnabled(SubnetPATEnabled value) { 
        this.PATEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Address", readOnly = false)   
    public String getAddress() {
       return address;
    }

    @JsonIgnore
    public void setAddress(String value) { 
        this.address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationID", readOnly = false)   
    public String getAssociatedApplicationID() {
       return associatedApplicationID;
    }

    @JsonIgnore
    public void setAssociatedApplicationID(String value) { 
        this.associatedApplicationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationObjectID", readOnly = false)   
    public String getAssociatedApplicationObjectID() {
       return associatedApplicationObjectID;
    }

    @JsonIgnore
    public void setAssociatedApplicationObjectID(String value) { 
        this.associatedApplicationObjectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationObjectType", readOnly = false)   
    public SubnetAssociatedApplicationObjectType getAssociatedApplicationObjectType() {
       return associatedApplicationObjectType;
    }

    @JsonIgnore
    public void setAssociatedApplicationObjectType(SubnetAssociatedApplicationObjectType value) { 
        this.associatedApplicationObjectType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedMulticastChannelMapID", readOnly = false)   
    public String getAssociatedMulticastChannelMapID() {
       return associatedMulticastChannelMapID;
    }

    @JsonIgnore
    public void setAssociatedMulticastChannelMapID(String value) { 
        this.associatedMulticastChannelMapID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSharedNetworkResourceID", readOnly = false)   
    public String getAssociatedSharedNetworkResourceID() {
       return associatedSharedNetworkResourceID;
    }

    @JsonIgnore
    public void setAssociatedSharedNetworkResourceID(String value) { 
        this.associatedSharedNetworkResourceID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DefaultAction", readOnly = false)   
    public SubnetDefaultAction getDefaultAction() {
       return defaultAction;
    }

    @JsonIgnore
    public void setDefaultAction(SubnetDefaultAction value) { 
        this.defaultAction = value;
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
    @VsoProperty(displayName = "Encryption", readOnly = false)   
    public SubnetEncryption getEncryption() {
       return encryption;
    }

    @JsonIgnore
    public void setEncryption(SubnetEncryption value) { 
        this.encryption = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public SubnetEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(SubnetEntityScope value) { 
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
    @VsoProperty(displayName = "Gateway", readOnly = false)   
    public String getGateway() {
       return gateway;
    }

    @JsonIgnore
    public void setGateway(String value) { 
        this.gateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayMACAddress", readOnly = false)   
    public String getGatewayMACAddress() {
       return gatewayMACAddress;
    }

    @JsonIgnore
    public void setGatewayMACAddress(String value) { 
        this.gatewayMACAddress = value;
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
    @VsoProperty(displayName = "MaintenanceMode", readOnly = false)   
    public SubnetMaintenanceMode getMaintenanceMode() {
       return maintenanceMode;
    }

    @JsonIgnore
    public void setMaintenanceMode(SubnetMaintenanceMode value) { 
        this.maintenanceMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Multicast", readOnly = false)   
    public SubnetMulticast getMulticast() {
       return multicast;
    }

    @JsonIgnore
    public void setMulticast(SubnetMulticast value) { 
        this.multicast = value;
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
    @VsoProperty(displayName = "Netmask", readOnly = false)   
    public String getNetmask() {
       return netmask;
    }

    @JsonIgnore
    public void setNetmask(String value) { 
        this.netmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroupID", readOnly = false)   
    public Long getPolicyGroupID() {
       return policyGroupID;
    }

    @JsonIgnore
    public void setPolicyGroupID(Long value) { 
        this.policyGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProxyARP", readOnly = false)   
    public Boolean getProxyARP() {
       return proxyARP;
    }

    @JsonIgnore
    public void setProxyARP(Boolean value) { 
        this.proxyARP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Public_", readOnly = false)   
    public Boolean getPublic_() {
       return public_;
    }

    @JsonIgnore
    public void setPublic_(Boolean value) { 
        this.public_ = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RouteDistinguisher", readOnly = false)   
    public String getRouteDistinguisher() {
       return routeDistinguisher;
    }

    @JsonIgnore
    public void setRouteDistinguisher(String value) { 
        this.routeDistinguisher = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RouteTarget", readOnly = false)   
    public String getRouteTarget() {
       return routeTarget;
    }

    @JsonIgnore
    public void setRouteTarget(String value) { 
        this.routeTarget = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ServiceID", readOnly = false)   
    public Long getServiceID() {
       return serviceID;
    }

    @JsonIgnore
    public void setServiceID(Long value) { 
        this.serviceID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SplitSubnet", readOnly = false)   
    public Boolean getSplitSubnet() {
       return splitSubnet;
    }

    @JsonIgnore
    public void setSplitSubnet(Boolean value) { 
        this.splitSubnet = value;
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
    @VsoProperty(displayName = "Underlay", readOnly = false)   
    public Boolean getUnderlay() {
       return underlay;
    }

    @JsonIgnore
    public void setUnderlay(Boolean value) { 
        this.underlay = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayEnabled", readOnly = false)   
    public SubnetUnderlayEnabled getUnderlayEnabled() {
       return underlayEnabled;
    }

    @JsonIgnore
    public void setUnderlayEnabled(SubnetUnderlayEnabled value) { 
        this.underlayEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseGlobalMAC", readOnly = false)   
    public SubnetUseGlobalMAC getUseGlobalMAC() {
       return useGlobalMAC;
    }

    @JsonIgnore
    public void setUseGlobalMAC(SubnetUseGlobalMAC value) { 
        this.useGlobalMAC = value;
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
    @VsoProperty(displayName = "AddressRanges", readOnly = true)   
    public AddressRangesFetcher getAddressRanges() {
        return addressRanges;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPNeighbors", readOnly = true)   
    public BGPNeighborsFetcher getBGPNeighbors() {
        return bGPNeighbors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Containers", readOnly = true)   
    public ContainersFetcher getContainers() {
        return containers;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ContainerInterfaces", readOnly = true)   
    public ContainerInterfacesFetcher getContainerInterfaces() {
        return containerInterfaces;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ContainerResyncs", readOnly = true)   
    public ContainerResyncsFetcher getContainerResyncs() {
        return containerResyncs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPOptions", readOnly = true)   
    public DHCPOptionsFetcher getDHCPOptions() {
        return dHCPOptions;
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
    @VsoProperty(displayName = "IKEGatewayConnections", readOnly = true)   
    public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
        return iKEGatewayConnections;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPReservations", readOnly = true)   
    public IPReservationsFetcher getIPReservations() {
        return iPReservations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "QOSs", readOnly = true)   
    public QOSsFetcher getQOSs() {
        return qOSs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMResyncs", readOnly = true)   
    public VMResyncsFetcher getVMResyncs() {
        return vMResyncs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Statistics", readOnly = true)   
    public StatisticsFetcher getStatistics() {
        return statistics;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatisticsPolicies", readOnly = true)   
    public StatisticsPoliciesFetcher getStatisticsPolicies() {
        return statisticsPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TCAs", readOnly = true)   
    public TCAsFetcher getTCAs() {
        return tCAs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualIPs", readOnly = true)   
    public VirtualIPsFetcher getVirtualIPs() {
        return virtualIPs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMs", readOnly = true)   
    public VMsFetcher getVMs() {
        return vMs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMInterfaces", readOnly = true)   
    public VMInterfacesFetcher getVMInterfaces() {
        return vMInterfaces;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPorts", readOnly = true)   
    public VPortsFetcher getVPorts() {
        return vPorts;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.SUBNET, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.SUBNET, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SUBNET, getId());
        }
    }
    
    @VsoMethod
    public void assignIKEGatewayConnections(Session session, IKEGatewayConnection[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SUBNET, getId());
        }
    }
    
    @VsoMethod
    public void createAddressRange(Session session, AddressRange childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ADDRESSRANGES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createBGPNeighbor(Session session, BGPNeighbor childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BGPNEIGHBORS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createContainerResync(Session session, ContainerResync childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CONTAINERRESYNCS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDHCPOption(Session session, DHCPOption childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DHCPOPTIONS_FETCHER, getId());
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
    public void createIPReservation(Session session, IPReservation childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IPRESERVATIONS_FETCHER, getId());
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
    public void createQOS(Session session, QOS childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.QOSS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVMResync(Session session, VMResync childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VMRESYNCS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createStatisticsPolicy(Session session, StatisticsPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.STATISTICSPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createTCA(Session session, TCA childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.TCAS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVPort(Session session, VPort childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VPORTS_FETCHER, getId());
        }
    }public String toString() {
        return "Subnet [" + "DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", PATEnabled=" + PATEnabled + ", address=" + address + ", associatedApplicationID=" + associatedApplicationID + ", associatedApplicationObjectID=" + associatedApplicationObjectID + ", associatedApplicationObjectType=" + associatedApplicationObjectType + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", defaultAction=" + defaultAction + ", description=" + description + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyGroupID=" + policyGroupID + ", proxyARP=" + proxyARP + ", public_=" + public_ + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", serviceID=" + serviceID + ", splitSubnet=" + splitSubnet + ", templateID=" + templateID + ", underlay=" + underlay + ", underlayEnabled=" + underlayEnabled + ", useGlobalMAC=" + useGlobalMAC + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}