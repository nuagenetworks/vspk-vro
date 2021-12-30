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

import net.nuagenetworks.vro.vspk.model.fetchers.AlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationperformancemanagementbindingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BridgeInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DeploymentFailuresFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPOptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPv6OptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressAdvFwdTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressAuditACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressAuditACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.HostInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAdvFwdTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAuditACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAuditACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MirrorDestinationGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkPerformanceBindingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaySummariesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.OverlayMirrorDestinationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PGExpressionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ProxyARPFiltersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QOSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedundancyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StaticRoutesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UplinkRDsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualFirewallPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualFirewallRulesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMIPReservationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPNConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPortsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainDPI;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainIPType;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainEncryption;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainEntityState;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainFlowCollectionEnabled;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainFlowLimitEnabled;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainL2EncapType;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainMaintenanceMode;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainMulticast;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainPolicyChangeStatus;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainThreatIntelligenceEnabled;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainUplinkPreference;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainUseGlobalMAC;
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

@VsoFinder(name = Constants.L2DOMAIN, datasource = Constants.DATASOURCE, image = Constants.L2DOMAIN_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, type = Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DEPLOYMENTFAILURES_FETCHER, type = Constants.DEPLOYMENTFAILURES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPOPTIONS_FETCHER, type = Constants.DHCPOPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPV6OPTIONS_FETCHER, type = Constants.DHCPV6OPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSACLTEMPLATES_FETCHER, type = Constants.EGRESSACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSADVFWDTEMPLATES_FETCHER, type = Constants.EGRESSADVFWDTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSAUDITACLTEMPLATES_FETCHER, type = Constants.EGRESSAUDITACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSACLENTRYTEMPLATES_FETCHER, type = Constants.INGRESSACLENTRYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSACLTEMPLATES_FETCHER, type = Constants.INGRESSACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSADVFWDTEMPLATES_FETCHER, type = Constants.INGRESSADVFWDTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSAUDITACLTEMPLATES_FETCHER, type = Constants.INGRESSAUDITACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.MIRRORDESTINATIONGROUPS_FETCHER, type = Constants.MIRRORDESTINATIONGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, type = Constants.NETWORKPERFORMANCEBINDINGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.OVERLAYMIRRORDESTINATIONS_FETCHER, type = Constants.OVERLAYMIRRORDESTINATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PGEXPRESSIONS_FETCHER, type = Constants.PGEXPRESSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.POLICYGROUPS_FETCHER, type = Constants.POLICYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.QOSS_FETCHER, type = Constants.QOSS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDIRECTIONTARGETS_FETCHER, type = Constants.REDIRECTIONTARGETS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATICROUTES_FETCHER, type = Constants.STATICROUTES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATISTICSPOLICIES_FETCHER, type = Constants.STATISTICSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TCAS_FETCHER, type = Constants.TCAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VIRTUALFIREWALLPOLICIES_FETCHER, type = Constants.VIRTUALFIREWALLPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VMIPRESERVATIONS_FETCHER, type = Constants.VMIPRESERVATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VPNCONNECTIONS_FETCHER, type = Constants.VPNCONNECTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VPORTS_FETCHER, type = Constants.VPORTS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l2domain", resourceName = "l2domains")
public class L2Domain extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DHCPManaged")
    protected Boolean DHCPManaged;
    
    @JsonProperty(value = "DPI")
    protected L2DomainDPI DPI;
    
    @JsonProperty(value = "IPType")
    protected L2DomainIPType IPType;
    
    @JsonProperty(value = "IPv6Address")
    protected String IPv6Address;
    
    @JsonProperty(value = "IPv6Gateway")
    protected String IPv6Gateway;
    
    @JsonProperty(value = "VXLANECMPEnabled")
    protected Boolean VXLANECMPEnabled;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "associatedMulticastChannelMapID")
    protected String associatedMulticastChannelMapID;
    
    @JsonProperty(value = "associatedSharedNetworkResourceID")
    protected String associatedSharedNetworkResourceID;
    
    @JsonProperty(value = "associatedUnderlayID")
    protected String associatedUnderlayID;
    
    @JsonProperty(value = "color")
    protected Long color;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "customerID")
    protected Long customerID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "dualStackDynamicIPAllocation")
    protected Boolean dualStackDynamicIPAllocation;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enableDHCPv4")
    protected Boolean enableDHCPv4;
    
    @JsonProperty(value = "enableDHCPv6")
    protected Boolean enableDHCPv6;
    
    @JsonProperty(value = "encryption")
    protected L2DomainEncryption encryption;
    
    @JsonProperty(value = "entityScope")
    protected L2DomainEntityScope entityScope;
    
    @JsonProperty(value = "entityState")
    protected L2DomainEntityState entityState;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowCollectionEnabled")
    protected L2DomainFlowCollectionEnabled flowCollectionEnabled;
    
    @JsonProperty(value = "flowCount")
    protected Long flowCount;
    
    @JsonProperty(value = "flowLimitEnabled")
    protected L2DomainFlowLimitEnabled flowLimitEnabled;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "gatewayMACAddress")
    protected String gatewayMACAddress;
    
    @JsonProperty(value = "ingressReplicationEnabled")
    protected Boolean ingressReplicationEnabled;
    
    @JsonProperty(value = "interfaceID")
    protected Long interfaceID;
    
    @JsonProperty(value = "l2EncapType")
    protected L2DomainL2EncapType l2EncapType;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "maintenanceMode")
    protected L2DomainMaintenanceMode maintenanceMode;
    
    @JsonProperty(value = "multicast")
    protected L2DomainMulticast multicast;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "policyChangeStatus")
    protected L2DomainPolicyChangeStatus policyChangeStatus;
    
    @JsonProperty(value = "routeDistinguisher")
    protected String routeDistinguisher;
    
    @JsonProperty(value = "routeTarget")
    protected String routeTarget;
    
    @JsonProperty(value = "routedVPLSEnabled")
    protected Boolean routedVPLSEnabled;
    
    @JsonProperty(value = "serviceID")
    protected Long serviceID;
    
    @JsonProperty(value = "stretched")
    protected Boolean stretched;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "threatIntelligenceEnabled")
    protected L2DomainThreatIntelligenceEnabled threatIntelligenceEnabled;
    
    @JsonProperty(value = "uplinkPreference")
    protected L2DomainUplinkPreference uplinkPreference;
    
    @JsonProperty(value = "useGlobalMAC")
    protected L2DomainUseGlobalMAC useGlobalMAC;
    
    @JsonProperty(value = "vnId")
    protected Long vnId;
    
    @JsonIgnore
    private AddressRangesFetcher addressRanges;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private ApplicationsFetcher applications;
    
    @JsonIgnore
    private ApplicationperformancemanagementbindingsFetcher applicationperformancemanagementbindings;
    
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
    private EgressACLTemplatesFetcher egressACLTemplates;
    
    @JsonIgnore
    private EgressAdvFwdTemplatesFetcher egressAdvFwdTemplates;
    
    @JsonIgnore
    private EgressAuditACLEntryTemplatesFetcher egressAuditACLEntryTemplates;
    
    @JsonIgnore
    private EgressAuditACLTemplatesFetcher egressAuditACLTemplates;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GatewaysFetcher gateways;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private GroupsFetcher groups;
    
    @JsonIgnore
    private HostInterfacesFetcher hostInterfaces;
    
    @JsonIgnore
    private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
    
    @JsonIgnore
    private IngressACLTemplatesFetcher ingressACLTemplates;
    
    @JsonIgnore
    private IngressAdvFwdTemplatesFetcher ingressAdvFwdTemplates;
    
    @JsonIgnore
    private IngressAuditACLEntryTemplatesFetcher ingressAuditACLEntryTemplates;
    
    @JsonIgnore
    private IngressAuditACLTemplatesFetcher ingressAuditACLTemplates;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MirrorDestinationGroupsFetcher mirrorDestinationGroups;
    
    @JsonIgnore
    private NetworkPerformanceBindingsFetcher networkPerformanceBindings;
    
    @JsonIgnore
    private NSGatewaySummariesFetcher nSGatewaySummaries;
    
    @JsonIgnore
    private OverlayMirrorDestinationsFetcher overlayMirrorDestinations;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PGExpressionsFetcher pGExpressions;
    
    @JsonIgnore
    private PolicyGroupsFetcher policyGroups;
    
    @JsonIgnore
    private ProxyARPFiltersFetcher proxyARPFilters;
    
    @JsonIgnore
    private QOSsFetcher qOSs;
    
    @JsonIgnore
    private RedirectionTargetsFetcher redirectionTargets;
    
    @JsonIgnore
    private RedundancyGroupsFetcher redundancyGroups;
    
    @JsonIgnore
    private StaticRoutesFetcher staticRoutes;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private StatisticsPoliciesFetcher statisticsPolicies;
    
    @JsonIgnore
    private TCAsFetcher tCAs;
    
    @JsonIgnore
    private UplinkRDsFetcher uplinkRDs;
    
    @JsonIgnore
    private VirtualFirewallPoliciesFetcher virtualFirewallPolicies;
    
    @JsonIgnore
    private VirtualFirewallRulesFetcher virtualFirewallRules;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VMInterfacesFetcher vMInterfaces;
    
    @JsonIgnore
    private VMIPReservationsFetcher vMIPReservations;
    
    @JsonIgnore
    private VPNConnectionsFetcher vPNConnections;
    
    @JsonIgnore
    private VPortsFetcher vPorts;
    
    @VsoConstructor
    public L2Domain() {
        maintenanceMode = L2DomainMaintenanceMode.DISABLED;
        
        addressRanges = new AddressRangesFetcher(this);
        
        alarms = new AlarmsFetcher(this);
        
        applications = new ApplicationsFetcher(this);
        
        applicationperformancemanagementbindings = new ApplicationperformancemanagementbindingsFetcher(this);
        
        bridgeInterfaces = new BridgeInterfacesFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        deploymentFailures = new DeploymentFailuresFetcher(this);
        
        dHCPOptions = new DHCPOptionsFetcher(this);
        
        dHCPv6Options = new DHCPv6OptionsFetcher(this);
        
        egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
        
        egressACLTemplates = new EgressACLTemplatesFetcher(this);
        
        egressAdvFwdTemplates = new EgressAdvFwdTemplatesFetcher(this);
        
        egressAuditACLEntryTemplates = new EgressAuditACLEntryTemplatesFetcher(this);
        
        egressAuditACLTemplates = new EgressAuditACLTemplatesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        gateways = new GatewaysFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        groups = new GroupsFetcher(this);
        
        hostInterfaces = new HostInterfacesFetcher(this);
        
        ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
        
        ingressACLTemplates = new IngressACLTemplatesFetcher(this);
        
        ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
        
        ingressAuditACLEntryTemplates = new IngressAuditACLEntryTemplatesFetcher(this);
        
        ingressAuditACLTemplates = new IngressAuditACLTemplatesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        mirrorDestinationGroups = new MirrorDestinationGroupsFetcher(this);
        
        networkPerformanceBindings = new NetworkPerformanceBindingsFetcher(this);
        
        nSGatewaySummaries = new NSGatewaySummariesFetcher(this);
        
        overlayMirrorDestinations = new OverlayMirrorDestinationsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        pGExpressions = new PGExpressionsFetcher(this);
        
        policyGroups = new PolicyGroupsFetcher(this);
        
        proxyARPFilters = new ProxyARPFiltersFetcher(this);
        
        qOSs = new QOSsFetcher(this);
        
        redirectionTargets = new RedirectionTargetsFetcher(this);
        
        redundancyGroups = new RedundancyGroupsFetcher(this);
        
        staticRoutes = new StaticRoutesFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        statisticsPolicies = new StatisticsPoliciesFetcher(this);
        
        tCAs = new TCAsFetcher(this);
        
        uplinkRDs = new UplinkRDsFetcher(this);
        
        virtualFirewallPolicies = new VirtualFirewallPoliciesFetcher(this);
        
        virtualFirewallRules = new VirtualFirewallRulesFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vMInterfaces = new VMInterfacesFetcher(this);
        
        vMIPReservations = new VMIPReservationsFetcher(this);
        
        vPNConnections = new VPNConnectionsFetcher(this);
        
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
    @JsonIgnore
    @VsoProperty(displayName = "DHCPManaged", readOnly = false)   
    public Boolean getDHCPManaged() {
       return DHCPManaged;
    }

    @JsonIgnore
    public void setDHCPManaged(Boolean value) { 
        this.DHCPManaged = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DPI", readOnly = false)   
    public L2DomainDPI getDPI() {
       return DPI;
    }

    @JsonIgnore
    public void setDPI(L2DomainDPI value) { 
        this.DPI = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPType", readOnly = false)   
    public L2DomainIPType getIPType() {
       return IPType;
    }

    @JsonIgnore
    public void setIPType(L2DomainIPType value) { 
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
    @VsoProperty(displayName = "VXLANECMPEnabled", readOnly = false)   
    public Boolean getVXLANECMPEnabled() {
       return VXLANECMPEnabled;
    }

    @JsonIgnore
    public void setVXLANECMPEnabled(Boolean value) { 
        this.VXLANECMPEnabled = value;
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
    @VsoProperty(displayName = "AssociatedUnderlayID", readOnly = false)   
    public String getAssociatedUnderlayID() {
       return associatedUnderlayID;
    }

    @JsonIgnore
    public void setAssociatedUnderlayID(String value) { 
        this.associatedUnderlayID = value;
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
    @VsoProperty(displayName = "CustomerID", readOnly = false)   
    public Long getCustomerID() {
       return customerID;
    }

    @JsonIgnore
    public void setCustomerID(Long value) { 
        this.customerID = value;
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
    @VsoProperty(displayName = "DualStackDynamicIPAllocation", readOnly = false)   
    public Boolean getDualStackDynamicIPAllocation() {
       return dualStackDynamicIPAllocation;
    }

    @JsonIgnore
    public void setDualStackDynamicIPAllocation(Boolean value) { 
        this.dualStackDynamicIPAllocation = value;
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
    @VsoProperty(displayName = "EnableDHCPv4", readOnly = false)   
    public Boolean getEnableDHCPv4() {
       return enableDHCPv4;
    }

    @JsonIgnore
    public void setEnableDHCPv4(Boolean value) { 
        this.enableDHCPv4 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnableDHCPv6", readOnly = false)   
    public Boolean getEnableDHCPv6() {
       return enableDHCPv6;
    }

    @JsonIgnore
    public void setEnableDHCPv6(Boolean value) { 
        this.enableDHCPv6 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Encryption", readOnly = false)   
    public L2DomainEncryption getEncryption() {
       return encryption;
    }

    @JsonIgnore
    public void setEncryption(L2DomainEncryption value) { 
        this.encryption = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public L2DomainEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(L2DomainEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityState", readOnly = false)   
    public L2DomainEntityState getEntityState() {
       return entityState;
    }

    @JsonIgnore
    public void setEntityState(L2DomainEntityState value) { 
        this.entityState = value;
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
    public L2DomainFlowCollectionEnabled getFlowCollectionEnabled() {
       return flowCollectionEnabled;
    }

    @JsonIgnore
    public void setFlowCollectionEnabled(L2DomainFlowCollectionEnabled value) { 
        this.flowCollectionEnabled = value;
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
    public L2DomainFlowLimitEnabled getFlowLimitEnabled() {
       return flowLimitEnabled;
    }

    @JsonIgnore
    public void setFlowLimitEnabled(L2DomainFlowLimitEnabled value) { 
        this.flowLimitEnabled = value;
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
    @VsoProperty(displayName = "IngressReplicationEnabled", readOnly = false)   
    public Boolean getIngressReplicationEnabled() {
       return ingressReplicationEnabled;
    }

    @JsonIgnore
    public void setIngressReplicationEnabled(Boolean value) { 
        this.ingressReplicationEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InterfaceID", readOnly = false)   
    public Long getInterfaceID() {
       return interfaceID;
    }

    @JsonIgnore
    public void setInterfaceID(Long value) { 
        this.interfaceID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2EncapType", readOnly = false)   
    public L2DomainL2EncapType getL2EncapType() {
       return l2EncapType;
    }

    @JsonIgnore
    public void setL2EncapType(L2DomainL2EncapType value) { 
        this.l2EncapType = value;
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
    @VsoProperty(displayName = "MaintenanceMode", readOnly = false)   
    public L2DomainMaintenanceMode getMaintenanceMode() {
       return maintenanceMode;
    }

    @JsonIgnore
    public void setMaintenanceMode(L2DomainMaintenanceMode value) { 
        this.maintenanceMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Multicast", readOnly = false)   
    public L2DomainMulticast getMulticast() {
       return multicast;
    }

    @JsonIgnore
    public void setMulticast(L2DomainMulticast value) { 
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
    @VsoProperty(displayName = "Owner", readOnly = false)   
    public String getOwner() {
       return owner;
    }

    @JsonIgnore
    public void setOwner(String value) { 
        this.owner = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyChangeStatus", readOnly = false)   
    public L2DomainPolicyChangeStatus getPolicyChangeStatus() {
       return policyChangeStatus;
    }

    @JsonIgnore
    public void setPolicyChangeStatus(L2DomainPolicyChangeStatus value) { 
        this.policyChangeStatus = value;
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
    @VsoProperty(displayName = "RoutedVPLSEnabled", readOnly = false)   
    public Boolean getRoutedVPLSEnabled() {
       return routedVPLSEnabled;
    }

    @JsonIgnore
    public void setRoutedVPLSEnabled(Boolean value) { 
        this.routedVPLSEnabled = value;
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
    @VsoProperty(displayName = "Stretched", readOnly = false)   
    public Boolean getStretched() {
       return stretched;
    }

    @JsonIgnore
    public void setStretched(Boolean value) { 
        this.stretched = value;
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
    @VsoProperty(displayName = "ThreatIntelligenceEnabled", readOnly = false)   
    public L2DomainThreatIntelligenceEnabled getThreatIntelligenceEnabled() {
       return threatIntelligenceEnabled;
    }

    @JsonIgnore
    public void setThreatIntelligenceEnabled(L2DomainThreatIntelligenceEnabled value) { 
        this.threatIntelligenceEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkPreference", readOnly = false)   
    public L2DomainUplinkPreference getUplinkPreference() {
       return uplinkPreference;
    }

    @JsonIgnore
    public void setUplinkPreference(L2DomainUplinkPreference value) { 
        this.uplinkPreference = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseGlobalMAC", readOnly = false)   
    public L2DomainUseGlobalMAC getUseGlobalMAC() {
       return useGlobalMAC;
    }

    @JsonIgnore
    public void setUseGlobalMAC(L2DomainUseGlobalMAC value) { 
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
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Applications", readOnly = true)   
    public ApplicationsFetcher getApplications() {
        return applications;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Applicationperformancemanagementbindings", readOnly = true)   
    public ApplicationperformancemanagementbindingsFetcher getApplicationperformancemanagementbindings() {
        return applicationperformancemanagementbindings;
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
    @VsoProperty(displayName = "EgressACLTemplates", readOnly = true)   
    public EgressACLTemplatesFetcher getEgressACLTemplates() {
        return egressACLTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressAdvFwdTemplates", readOnly = true)   
    public EgressAdvFwdTemplatesFetcher getEgressAdvFwdTemplates() {
        return egressAdvFwdTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressAuditACLEntryTemplates", readOnly = true)   
    public EgressAuditACLEntryTemplatesFetcher getEgressAuditACLEntryTemplates() {
        return egressAuditACLEntryTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressAuditACLTemplates", readOnly = true)   
    public EgressAuditACLTemplatesFetcher getEgressAuditACLTemplates() {
        return egressAuditACLTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Gateways", readOnly = true)   
    public GatewaysFetcher getGateways() {
        return gateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Groups", readOnly = true)   
    public GroupsFetcher getGroups() {
        return groups;
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
    @VsoProperty(displayName = "IngressACLTemplates", readOnly = true)   
    public IngressACLTemplatesFetcher getIngressACLTemplates() {
        return ingressACLTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressAdvFwdTemplates", readOnly = true)   
    public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
        return ingressAdvFwdTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressAuditACLEntryTemplates", readOnly = true)   
    public IngressAuditACLEntryTemplatesFetcher getIngressAuditACLEntryTemplates() {
        return ingressAuditACLEntryTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressAuditACLTemplates", readOnly = true)   
    public IngressAuditACLTemplatesFetcher getIngressAuditACLTemplates() {
        return ingressAuditACLTemplates;
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
    @VsoProperty(displayName = "MirrorDestinationGroups", readOnly = true)   
    public MirrorDestinationGroupsFetcher getMirrorDestinationGroups() {
        return mirrorDestinationGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkPerformanceBindings", readOnly = true)   
    public NetworkPerformanceBindingsFetcher getNetworkPerformanceBindings() {
        return networkPerformanceBindings;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGatewaySummaries", readOnly = true)   
    public NSGatewaySummariesFetcher getNSGatewaySummaries() {
        return nSGatewaySummaries;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OverlayMirrorDestinations", readOnly = true)   
    public OverlayMirrorDestinationsFetcher getOverlayMirrorDestinations() {
        return overlayMirrorDestinations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PGExpressions", readOnly = true)   
    public PGExpressionsFetcher getPGExpressions() {
        return pGExpressions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroups", readOnly = true)   
    public PolicyGroupsFetcher getPolicyGroups() {
        return policyGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProxyARPFilters", readOnly = true)   
    public ProxyARPFiltersFetcher getProxyARPFilters() {
        return proxyARPFilters;
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
    @VsoProperty(displayName = "RedundancyGroups", readOnly = true)   
    public RedundancyGroupsFetcher getRedundancyGroups() {
        return redundancyGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRoutes", readOnly = true)   
    public StaticRoutesFetcher getStaticRoutes() {
        return staticRoutes;
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
    @VsoProperty(displayName = "UplinkRDs", readOnly = true)   
    public UplinkRDsFetcher getUplinkRDs() {
        return uplinkRDs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualFirewallPolicies", readOnly = true)   
    public VirtualFirewallPoliciesFetcher getVirtualFirewallPolicies() {
        return virtualFirewallPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualFirewallRules", readOnly = true)   
    public VirtualFirewallRulesFetcher getVirtualFirewallRules() {
        return virtualFirewallRules;
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
    @VsoProperty(displayName = "VMIPReservations", readOnly = true)   
    public VMIPReservationsFetcher getVMIPReservations() {
        return vMIPReservations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPNConnections", readOnly = true)   
    public VPNConnectionsFetcher getVPNConnections() {
        return vPNConnections;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAIN, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.L2DOMAIN, getId());
        }
    }
    @VsoMethod
    public void assignDeploymentFailures(Session session, DeploymentFailure[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void assignGroups(Session session, Group[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void createApplicationperformancemanagementbinding(Session session, Applicationperformancemanagementbinding childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, getId());
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
    public void createEgressACLTemplate(Session session, EgressACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSACLTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEgressAdvFwdTemplate(Session session, EgressAdvFwdTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSADVFWDTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEgressAuditACLTemplate(Session session, EgressAuditACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSAUDITACLTEMPLATES_FETCHER, getId());
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
    public void createIngressACLEntryTemplate(Session session, IngressACLEntryTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressACLTemplate(Session session, IngressACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSACLTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressAdvFwdTemplate(Session session, IngressAdvFwdTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSADVFWDTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressAuditACLTemplate(Session session, IngressAuditACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSAUDITACLTEMPLATES_FETCHER, getId());
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
    public void createMirrorDestinationGroup(Session session, MirrorDestinationGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.MIRRORDESTINATIONGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNetworkPerformanceBinding(Session session, NetworkPerformanceBinding childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createOverlayMirrorDestination(Session session, OverlayMirrorDestination childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateOverlayMirrorDestination(Session session, OverlayMirrorDestination childRestObj, OverlayMirrorDestinationTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER, getId());
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
    public void createPGExpression(Session session, PGExpression childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PGEXPRESSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiatePGExpression(Session session, PGExpression childRestObj, PGExpressionTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PGEXPRESSIONS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createPolicyGroup(Session session, PolicyGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.POLICYGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiatePolicyGroup(Session session, PolicyGroup childRestObj, PolicyGroupTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.POLICYGROUPS_FETCHER, getId());
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
    public void createRedirectionTarget(Session session, RedirectionTarget childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.REDIRECTIONTARGETS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateRedirectionTarget(Session session, RedirectionTarget childRestObj, RedirectionTargetTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.REDIRECTIONTARGETS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createStaticRoute(Session session, StaticRoute childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.STATICROUTES_FETCHER, getId());
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
    public void createVirtualFirewallPolicy(Session session, VirtualFirewallPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VIRTUALFIREWALLPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVMIPReservation(Session session, VMIPReservation childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VMIPRESERVATIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVPNConnection(Session session, VPNConnection childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VPNCONNECTIONS_FETCHER, getId());
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
        return "L2Domain [" + "DHCPManaged=" + DHCPManaged + ", DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", VXLANECMPEnabled=" + VXLANECMPEnabled + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", associatedUnderlayID=" + associatedUnderlayID + ", color=" + color + ", creationDate=" + creationDate + ", customerID=" + customerID + ", description=" + description + ", dualStackDynamicIPAllocation=" + dualStackDynamicIPAllocation + ", embeddedMetadata=" + embeddedMetadata + ", enableDHCPv4=" + enableDHCPv4 + ", enableDHCPv6=" + enableDHCPv6 + ", encryption=" + encryption + ", entityScope=" + entityScope + ", entityState=" + entityState + ", externalID=" + externalID + ", flowCollectionEnabled=" + flowCollectionEnabled + ", flowCount=" + flowCount + ", flowLimitEnabled=" + flowLimitEnabled + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", ingressReplicationEnabled=" + ingressReplicationEnabled + ", interfaceID=" + interfaceID + ", l2EncapType=" + l2EncapType + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", owner=" + owner + ", policyChangeStatus=" + policyChangeStatus + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", routedVPLSEnabled=" + routedVPLSEnabled + ", serviceID=" + serviceID + ", stretched=" + stretched + ", templateID=" + templateID + ", threatIntelligenceEnabled=" + threatIntelligenceEnabled + ", uplinkPreference=" + uplinkPreference + ", useGlobalMAC=" + useGlobalMAC + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}