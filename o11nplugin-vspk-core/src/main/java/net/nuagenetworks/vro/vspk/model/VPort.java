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
import net.nuagenetworks.vro.vspk.model.fetchers.AggregateMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPNeighborsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BridgeInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DeploymentFailuresFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPOptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPv6OptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.HostInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAdvFwdEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PortMappingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QOSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TestSuiteRunsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TrunksFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualIPsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPortMirrorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VPortDPI;

import net.nuagenetworks.vro.vspk.model.enums.VPortFIPIgnoreDefaultRoute;

import net.nuagenetworks.vro.vspk.model.enums.VPortAddressSpoofing;

import net.nuagenetworks.vro.vspk.model.enums.VPortAssociatedGatewayPersonality;

import net.nuagenetworks.vro.vspk.model.enums.VPortEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.VPortFlowLimitEnabled;

import net.nuagenetworks.vro.vspk.model.enums.VPortGatewayMACMoveRole;

import net.nuagenetworks.vro.vspk.model.enums.VPortMulticast;

import net.nuagenetworks.vro.vspk.model.enums.VPortOperationalState;

import net.nuagenetworks.vro.vspk.model.enums.VPortPeerOperationalState;

import net.nuagenetworks.vro.vspk.model.enums.VPortSegmentationType;

import net.nuagenetworks.vro.vspk.model.enums.VPortSubType;

import net.nuagenetworks.vro.vspk.model.enums.VPortSystemType;

import net.nuagenetworks.vro.vspk.model.enums.VPortTrunkRole;

import net.nuagenetworks.vro.vspk.model.enums.VPortType;
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

@VsoFinder(name = Constants.VPORT, datasource = Constants.DATASOURCE, image = Constants.VPORT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.BGPNEIGHBORS_FETCHER, type = Constants.BGPNEIGHBORS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.BRIDGEINTERFACES_FETCHER, type = Constants.BRIDGEINTERFACES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DEPLOYMENTFAILURES_FETCHER, type = Constants.DEPLOYMENTFAILURES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPOPTIONS_FETCHER, type = Constants.DHCPOPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPV6OPTIONS_FETCHER, type = Constants.DHCPV6OPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.HOSTINTERFACES_FETCHER, type = Constants.HOSTINTERFACES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.QOSS_FETCHER, type = Constants.QOSS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATISTICSPOLICIES_FETCHER, type = Constants.STATISTICSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TCAS_FETCHER, type = Constants.TCAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TESTSUITERUNS_FETCHER, type = Constants.TESTSUITERUNS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VIRTUALIPS_FETCHER, type = Constants.VIRTUALIPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VMS_FETCHER, type = Constants.VMS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VMINTERFACES_FETCHER, type = Constants.VMINTERFACES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VPORTMIRRORS_FETCHER, type = Constants.VPORTMIRRORS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vport", resourceName = "vports")
public class VPort extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DPI")
    protected VPortDPI DPI;
    
    @JsonProperty(value = "FIPIgnoreDefaultRoute")
    protected VPortFIPIgnoreDefaultRoute FIPIgnoreDefaultRoute;
    
    @JsonProperty(value = "VLAN")
    protected Long VLAN;
    
    @JsonProperty(value = "VLANID")
    protected String VLANID;
    
    @JsonProperty(value = "accessRestrictionEnabled")
    protected Boolean accessRestrictionEnabled;
    
    @JsonProperty(value = "active")
    protected Boolean active;
    
    @JsonProperty(value = "addressSpoofing")
    protected VPortAddressSpoofing addressSpoofing;
    
    @JsonProperty(value = "assocEntityID")
    protected String assocEntityID;
    
    @JsonProperty(value = "associatedEgressProfileID")
    protected String associatedEgressProfileID;
    
    @JsonProperty(value = "associatedFloatingIPID")
    protected String associatedFloatingIPID;
    
    @JsonProperty(value = "associatedGatewayID")
    protected String associatedGatewayID;
    
    @JsonProperty(value = "associatedGatewayPersonality")
    protected VPortAssociatedGatewayPersonality associatedGatewayPersonality;
    
    @JsonProperty(value = "associatedGatewayType")
    protected String associatedGatewayType;
    
    @JsonProperty(value = "associatedIngressProfileID")
    protected String associatedIngressProfileID;
    
    @JsonProperty(value = "associatedMulticastChannelMapID")
    protected String associatedMulticastChannelMapID;
    
    @JsonProperty(value = "associatedSSID")
    protected String associatedSSID;
    
    @JsonProperty(value = "associatedSendMulticastChannelMapID")
    protected String associatedSendMulticastChannelMapID;
    
    @JsonProperty(value = "associatedTrunkID")
    protected String associatedTrunkID;
    
    @JsonProperty(value = "autoCreated")
    protected Boolean autoCreated;
    
    @JsonProperty(value = "backhaulSubnetVNID")
    protected Long backhaulSubnetVNID;
    
    @JsonProperty(value = "color")
    protected Long color;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "domainID")
    protected String domainID;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "domainServiceLabel")
    protected String domainServiceLabel;
    
    @JsonProperty(value = "domainVLANID")
    protected Long domainVLANID;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected VPortEntityScope entityScope;
    
    @JsonProperty(value = "esGroupVPortInfos")
    protected java.util.List<String> esGroupVPortInfos;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowCount")
    protected Long flowCount;
    
    @JsonProperty(value = "flowLimitEnabled")
    protected VPortFlowLimitEnabled flowLimitEnabled;
    
    @JsonProperty(value = "gatewayMACMoveRole")
    protected VPortGatewayMACMoveRole gatewayMACMoveRole;
    
    @JsonProperty(value = "gatewayPortName")
    protected String gatewayPortName;
    
    @JsonProperty(value = "gwEligible")
    protected Boolean gwEligible;
    
    @JsonProperty(value = "hasAttachedInterfaces")
    protected Boolean hasAttachedInterfaces;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "multiNICVPortID")
    protected String multiNICVPortID;
    
    @JsonProperty(value = "multicast")
    protected VPortMulticast multicast;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "operationalState")
    protected VPortOperationalState operationalState;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "peerOperationalState")
    protected VPortPeerOperationalState peerOperationalState;
    
    @JsonProperty(value = "routed")
    protected Boolean routed;
    
    @JsonProperty(value = "segmentationID")
    protected Long segmentationID;
    
    @JsonProperty(value = "segmentationType")
    protected VPortSegmentationType segmentationType;
    
    @JsonProperty(value = "serviceID")
    protected Long serviceID;
    
    @JsonProperty(value = "subType")
    protected VPortSubType subType;
    
    @JsonProperty(value = "subnetVNID")
    protected Long subnetVNID;
    
    @JsonProperty(value = "systemType")
    protected VPortSystemType systemType;
    
    @JsonProperty(value = "trunkRole")
    protected VPortTrunkRole trunkRole;
    
    @JsonProperty(value = "type")
    protected VPortType type;
    
    @JsonProperty(value = "zoneID")
    protected String zoneID;
    
    @JsonIgnore
    private AggregateMetadatasFetcher aggregateMetadatas;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private BGPNeighborsFetcher bGPNeighbors;
    
    @JsonIgnore
    private BridgeInterfacesFetcher bridgeInterfaces;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private ContainerInterfacesFetcher containerInterfaces;
    
    @JsonIgnore
    private DeploymentFailuresFetcher deploymentFailures;
    
    @JsonIgnore
    private DHCPOptionsFetcher dHCPOptions;
    
    @JsonIgnore
    private DHCPv6OptionsFetcher dHCPv6Options;
    
    @JsonIgnore
    private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private HostInterfacesFetcher hostInterfaces;
    
    @JsonIgnore
    private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
    
    @JsonIgnore
    private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PolicyGroupsFetcher policyGroups;
    
    @JsonIgnore
    private PortMappingsFetcher portMappings;
    
    @JsonIgnore
    private QOSsFetcher qOSs;
    
    @JsonIgnore
    private RedirectionTargetsFetcher redirectionTargets;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private StatisticsPoliciesFetcher statisticsPolicies;
    
    @JsonIgnore
    private TCAsFetcher tCAs;
    
    @JsonIgnore
    private TestSuiteRunsFetcher testSuiteRuns;
    
    @JsonIgnore
    private TrunksFetcher trunks;
    
    @JsonIgnore
    private VirtualIPsFetcher virtualIPs;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VMInterfacesFetcher vMInterfaces;
    
    @JsonIgnore
    private VNFInterfacesFetcher vNFInterfaces;
    
    @JsonIgnore
    private VPortMirrorsFetcher vPortMirrors;
    
    @JsonIgnore
    private VRSsFetcher vRSs;
    
    @VsoConstructor
    public VPort() {
        multicast = VPortMulticast.INHERITED;
        
        type = VPortType.VM;
        
        addressSpoofing = VPortAddressSpoofing.INHERITED;
        
        operationalState = VPortOperationalState.INIT;
        
        aggregateMetadatas = new AggregateMetadatasFetcher(this);
        
        alarms = new AlarmsFetcher(this);
        
        bGPNeighbors = new BGPNeighborsFetcher(this);
        
        bridgeInterfaces = new BridgeInterfacesFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        deploymentFailures = new DeploymentFailuresFetcher(this);
        
        dHCPOptions = new DHCPOptionsFetcher(this);
        
        dHCPv6Options = new DHCPv6OptionsFetcher(this);
        
        egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        hostInterfaces = new HostInterfacesFetcher(this);
        
        ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
        
        ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        policyGroups = new PolicyGroupsFetcher(this);
        
        portMappings = new PortMappingsFetcher(this);
        
        qOSs = new QOSsFetcher(this);
        
        redirectionTargets = new RedirectionTargetsFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        statisticsPolicies = new StatisticsPoliciesFetcher(this);
        
        tCAs = new TCAsFetcher(this);
        
        testSuiteRuns = new TestSuiteRunsFetcher(this);
        
        trunks = new TrunksFetcher(this);
        
        virtualIPs = new VirtualIPsFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vMInterfaces = new VMInterfacesFetcher(this);
        
        vNFInterfaces = new VNFInterfacesFetcher(this);
        
        vPortMirrors = new VPortMirrorsFetcher(this);
        
        vRSs = new VRSsFetcher(this);
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
    @VsoProperty(displayName = "DPI", readOnly = false)   
    public VPortDPI getDPI() {
       return DPI;
    }

    @JsonIgnore
    public void setDPI(VPortDPI value) { 
        this.DPI = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPIgnoreDefaultRoute", readOnly = false)   
    public VPortFIPIgnoreDefaultRoute getFIPIgnoreDefaultRoute() {
       return FIPIgnoreDefaultRoute;
    }

    @JsonIgnore
    public void setFIPIgnoreDefaultRoute(VPortFIPIgnoreDefaultRoute value) { 
        this.FIPIgnoreDefaultRoute = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VLAN", readOnly = false)   
    public Long getVLAN() {
       return VLAN;
    }

    @JsonIgnore
    public void setVLAN(Long value) { 
        this.VLAN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VLANID", readOnly = false)   
    public String getVLANID() {
       return VLANID;
    }

    @JsonIgnore
    public void setVLANID(String value) { 
        this.VLANID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AccessRestrictionEnabled", readOnly = false)   
    public Boolean getAccessRestrictionEnabled() {
       return accessRestrictionEnabled;
    }

    @JsonIgnore
    public void setAccessRestrictionEnabled(Boolean value) { 
        this.accessRestrictionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Active", readOnly = false)   
    public Boolean getActive() {
       return active;
    }

    @JsonIgnore
    public void setActive(Boolean value) { 
        this.active = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressSpoofing", readOnly = false)   
    public VPortAddressSpoofing getAddressSpoofing() {
       return addressSpoofing;
    }

    @JsonIgnore
    public void setAddressSpoofing(VPortAddressSpoofing value) { 
        this.addressSpoofing = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssocEntityID", readOnly = false)   
    public String getAssocEntityID() {
       return assocEntityID;
    }

    @JsonIgnore
    public void setAssocEntityID(String value) { 
        this.assocEntityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEgressProfileID", readOnly = false)   
    public String getAssociatedEgressProfileID() {
       return associatedEgressProfileID;
    }

    @JsonIgnore
    public void setAssociatedEgressProfileID(String value) { 
        this.associatedEgressProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedFloatingIPID", readOnly = false)   
    public String getAssociatedFloatingIPID() {
       return associatedFloatingIPID;
    }

    @JsonIgnore
    public void setAssociatedFloatingIPID(String value) { 
        this.associatedFloatingIPID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayID", readOnly = false)   
    public String getAssociatedGatewayID() {
       return associatedGatewayID;
    }

    @JsonIgnore
    public void setAssociatedGatewayID(String value) { 
        this.associatedGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayPersonality", readOnly = false)   
    public VPortAssociatedGatewayPersonality getAssociatedGatewayPersonality() {
       return associatedGatewayPersonality;
    }

    @JsonIgnore
    public void setAssociatedGatewayPersonality(VPortAssociatedGatewayPersonality value) { 
        this.associatedGatewayPersonality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayType", readOnly = false)   
    public String getAssociatedGatewayType() {
       return associatedGatewayType;
    }

    @JsonIgnore
    public void setAssociatedGatewayType(String value) { 
        this.associatedGatewayType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressProfileID", readOnly = false)   
    public String getAssociatedIngressProfileID() {
       return associatedIngressProfileID;
    }

    @JsonIgnore
    public void setAssociatedIngressProfileID(String value) { 
        this.associatedIngressProfileID = value;
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
    @VsoProperty(displayName = "AssociatedSSID", readOnly = false)   
    public String getAssociatedSSID() {
       return associatedSSID;
    }

    @JsonIgnore
    public void setAssociatedSSID(String value) { 
        this.associatedSSID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSendMulticastChannelMapID", readOnly = false)   
    public String getAssociatedSendMulticastChannelMapID() {
       return associatedSendMulticastChannelMapID;
    }

    @JsonIgnore
    public void setAssociatedSendMulticastChannelMapID(String value) { 
        this.associatedSendMulticastChannelMapID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedTrunkID", readOnly = false)   
    public String getAssociatedTrunkID() {
       return associatedTrunkID;
    }

    @JsonIgnore
    public void setAssociatedTrunkID(String value) { 
        this.associatedTrunkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AutoCreated", readOnly = false)   
    public Boolean getAutoCreated() {
       return autoCreated;
    }

    @JsonIgnore
    public void setAutoCreated(Boolean value) { 
        this.autoCreated = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackhaulSubnetVNID", readOnly = false)   
    public Long getBackhaulSubnetVNID() {
       return backhaulSubnetVNID;
    }

    @JsonIgnore
    public void setBackhaulSubnetVNID(Long value) { 
        this.backhaulSubnetVNID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Color", readOnly = false)   
    public Long getColor() {
       return color;
    }

    @JsonIgnore
    public void setColor(Long value) { 
        this.color = value;
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
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainID", readOnly = false)   
    public String getDomainID() {
       return domainID;
    }

    @JsonIgnore
    public void setDomainID(String value) { 
        this.domainID = value;
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
    @VsoProperty(displayName = "DomainServiceLabel", readOnly = false)   
    public String getDomainServiceLabel() {
       return domainServiceLabel;
    }

    @JsonIgnore
    public void setDomainServiceLabel(String value) { 
        this.domainServiceLabel = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainVLANID", readOnly = false)   
    public Long getDomainVLANID() {
       return domainVLANID;
    }

    @JsonIgnore
    public void setDomainVLANID(Long value) { 
        this.domainVLANID = value;
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
    public VPortEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VPortEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EsGroupVPortInfos", readOnly = false)   
    public java.util.List<String> getEsGroupVPortInfos() {
       return esGroupVPortInfos;
    }

    @JsonIgnore
    public void setEsGroupVPortInfos(java.util.List<String> value) { 
        this.esGroupVPortInfos = value;
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
    @VsoProperty(displayName = "FlowCount", readOnly = false)   
    public Long getFlowCount() {
       return flowCount;
    }

    @JsonIgnore
    public void setFlowCount(Long value) { 
        this.flowCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FlowLimitEnabled", readOnly = false)   
    public VPortFlowLimitEnabled getFlowLimitEnabled() {
       return flowLimitEnabled;
    }

    @JsonIgnore
    public void setFlowLimitEnabled(VPortFlowLimitEnabled value) { 
        this.flowLimitEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayMACMoveRole", readOnly = false)   
    public VPortGatewayMACMoveRole getGatewayMACMoveRole() {
       return gatewayMACMoveRole;
    }

    @JsonIgnore
    public void setGatewayMACMoveRole(VPortGatewayMACMoveRole value) { 
        this.gatewayMACMoveRole = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayPortName", readOnly = false)   
    public String getGatewayPortName() {
       return gatewayPortName;
    }

    @JsonIgnore
    public void setGatewayPortName(String value) { 
        this.gatewayPortName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GwEligible", readOnly = false)   
    public Boolean getGwEligible() {
       return gwEligible;
    }

    @JsonIgnore
    public void setGwEligible(Boolean value) { 
        this.gwEligible = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HasAttachedInterfaces", readOnly = false)   
    public Boolean getHasAttachedInterfaces() {
       return hasAttachedInterfaces;
    }

    @JsonIgnore
    public void setHasAttachedInterfaces(Boolean value) { 
        this.hasAttachedInterfaces = value;
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
    @VsoProperty(displayName = "MultiNICVPortID", readOnly = false)   
    public String getMultiNICVPortID() {
       return multiNICVPortID;
    }

    @JsonIgnore
    public void setMultiNICVPortID(String value) { 
        this.multiNICVPortID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Multicast", readOnly = false)   
    public VPortMulticast getMulticast() {
       return multicast;
    }

    @JsonIgnore
    public void setMulticast(VPortMulticast value) { 
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
    @VsoProperty(displayName = "OperationalState", readOnly = false)   
    public VPortOperationalState getOperationalState() {
       return operationalState;
    }

    @JsonIgnore
    public void setOperationalState(VPortOperationalState value) { 
        this.operationalState = value;
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
    @VsoProperty(displayName = "PeerOperationalState", readOnly = false)   
    public VPortPeerOperationalState getPeerOperationalState() {
       return peerOperationalState;
    }

    @JsonIgnore
    public void setPeerOperationalState(VPortPeerOperationalState value) { 
        this.peerOperationalState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Routed", readOnly = false)   
    public Boolean getRouted() {
       return routed;
    }

    @JsonIgnore
    public void setRouted(Boolean value) { 
        this.routed = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SegmentationID", readOnly = false)   
    public Long getSegmentationID() {
       return segmentationID;
    }

    @JsonIgnore
    public void setSegmentationID(Long value) { 
        this.segmentationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SegmentationType", readOnly = false)   
    public VPortSegmentationType getSegmentationType() {
       return segmentationType;
    }

    @JsonIgnore
    public void setSegmentationType(VPortSegmentationType value) { 
        this.segmentationType = value;
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
    @VsoProperty(displayName = "SubType", readOnly = false)   
    public VPortSubType getSubType() {
       return subType;
    }

    @JsonIgnore
    public void setSubType(VPortSubType value) { 
        this.subType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubnetVNID", readOnly = false)   
    public Long getSubnetVNID() {
       return subnetVNID;
    }

    @JsonIgnore
    public void setSubnetVNID(Long value) { 
        this.subnetVNID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemType", readOnly = false)   
    public VPortSystemType getSystemType() {
       return systemType;
    }

    @JsonIgnore
    public void setSystemType(VPortSystemType value) { 
        this.systemType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrunkRole", readOnly = false)   
    public VPortTrunkRole getTrunkRole() {
       return trunkRole;
    }

    @JsonIgnore
    public void setTrunkRole(VPortTrunkRole value) { 
        this.trunkRole = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public VPortType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(VPortType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZoneID", readOnly = false)   
    public String getZoneID() {
       return zoneID;
    }

    @JsonIgnore
    public void setZoneID(String value) { 
        this.zoneID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AggregateMetadatas", readOnly = true)   
    public AggregateMetadatasFetcher getAggregateMetadatas() {
        return aggregateMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPNeighbors", readOnly = true)   
    public BGPNeighborsFetcher getBGPNeighbors() {
        return bGPNeighbors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BridgeInterfaces", readOnly = true)   
    public BridgeInterfacesFetcher getBridgeInterfaces() {
        return bridgeInterfaces;
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
    @VsoProperty(displayName = "DeploymentFailures", readOnly = true)   
    public DeploymentFailuresFetcher getDeploymentFailures() {
        return deploymentFailures;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPOptions", readOnly = true)   
    public DHCPOptionsFetcher getDHCPOptions() {
        return dHCPOptions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPv6Options", readOnly = true)   
    public DHCPv6OptionsFetcher getDHCPv6Options() {
        return dHCPv6Options;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressACLEntryTemplates", readOnly = true)   
    public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
        return egressACLEntryTemplates;
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
    @VsoProperty(displayName = "HostInterfaces", readOnly = true)   
    public HostInterfacesFetcher getHostInterfaces() {
        return hostInterfaces;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressACLEntryTemplates", readOnly = true)   
    public IngressACLEntryTemplatesFetcher getIngressACLEntryTemplates() {
        return ingressACLEntryTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressAdvFwdEntryTemplates", readOnly = true)   
    public IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplates() {
        return ingressAdvFwdEntryTemplates;
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
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroups", readOnly = true)   
    public PolicyGroupsFetcher getPolicyGroups() {
        return policyGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PortMappings", readOnly = true)   
    public PortMappingsFetcher getPortMappings() {
        return portMappings;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "QOSs", readOnly = true)   
    public QOSsFetcher getQOSs() {
        return qOSs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectionTargets", readOnly = true)   
    public RedirectionTargetsFetcher getRedirectionTargets() {
        return redirectionTargets;
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
    @VsoProperty(displayName = "TestSuiteRuns", readOnly = true)   
    public TestSuiteRunsFetcher getTestSuiteRuns() {
        return testSuiteRuns;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Trunks", readOnly = true)   
    public TrunksFetcher getTrunks() {
        return trunks;
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
    @VsoProperty(displayName = "VNFInterfaces", readOnly = true)   
    public VNFInterfacesFetcher getVNFInterfaces() {
        return vNFInterfaces;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPortMirrors", readOnly = true)   
    public VPortMirrorsFetcher getVPortMirrors() {
        return vPortMirrors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSs", readOnly = true)   
    public VRSsFetcher getVRSs() {
        return vRSs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VPORT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VPORT, getId());
        }
    }
    @VsoMethod
    public void assignDeploymentFailures(Session session, DeploymentFailure[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VPORT, getId());
        }
    }
    
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VPORT, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VPORT, getId());
        }
    }
    
    @VsoMethod
    public void assignPolicyGroups(Session session, PolicyGroup[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VPORT, getId());
        }
    }
    
    @VsoMethod
    public void assignRedirectionTargets(Session session, RedirectionTarget[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VPORT, getId());
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
    public void createBridgeInterface(Session session, BridgeInterface childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BRIDGEINTERFACES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDeploymentFailure(Session session, DeploymentFailure childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DEPLOYMENTFAILURES_FETCHER, getId());
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
    public void createDHCPv6Option(Session session, DHCPv6Option childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DHCPV6OPTIONS_FETCHER, getId());
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
    public void createHostInterface(Session session, HostInterface childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.HOSTINTERFACES_FETCHER, getId());
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
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
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
    public void createTestSuiteRun(Session session, TestSuiteRun childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.TESTSUITERUNS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVirtualIP(Session session, VirtualIP childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VIRTUALIPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVMInterface(Session session, VMInterface childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VMINTERFACES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVPortMirror(Session session, VPortMirror childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VPORTMIRRORS_FETCHER, getId());
        }
    }public String toString() {
        return "VPort [" + "DPI=" + DPI + ", FIPIgnoreDefaultRoute=" + FIPIgnoreDefaultRoute + ", VLAN=" + VLAN + ", VLANID=" + VLANID + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", active=" + active + ", addressSpoofing=" + addressSpoofing + ", assocEntityID=" + assocEntityID + ", associatedEgressProfileID=" + associatedEgressProfileID + ", associatedFloatingIPID=" + associatedFloatingIPID + ", associatedGatewayID=" + associatedGatewayID + ", associatedGatewayPersonality=" + associatedGatewayPersonality + ", associatedGatewayType=" + associatedGatewayType + ", associatedIngressProfileID=" + associatedIngressProfileID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSSID=" + associatedSSID + ", associatedSendMulticastChannelMapID=" + associatedSendMulticastChannelMapID + ", associatedTrunkID=" + associatedTrunkID + ", autoCreated=" + autoCreated + ", backhaulSubnetVNID=" + backhaulSubnetVNID + ", color=" + color + ", creationDate=" + creationDate + ", description=" + description + ", domainID=" + domainID + ", domainName=" + domainName + ", domainServiceLabel=" + domainServiceLabel + ", domainVLANID=" + domainVLANID + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", esGroupVPortInfos=" + esGroupVPortInfos + ", externalID=" + externalID + ", flowCount=" + flowCount + ", flowLimitEnabled=" + flowLimitEnabled + ", gatewayMACMoveRole=" + gatewayMACMoveRole + ", gatewayPortName=" + gatewayPortName + ", gwEligible=" + gwEligible + ", hasAttachedInterfaces=" + hasAttachedInterfaces + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", multiNICVPortID=" + multiNICVPortID + ", multicast=" + multicast + ", name=" + name + ", operationalState=" + operationalState + ", owner=" + owner + ", peerOperationalState=" + peerOperationalState + ", routed=" + routed + ", segmentationID=" + segmentationID + ", segmentationType=" + segmentationType + ", serviceID=" + serviceID + ", subType=" + subType + ", subnetVNID=" + subnetVNID + ", systemType=" + systemType + ", trunkRole=" + trunkRole + ", type=" + type + ", zoneID=" + zoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}