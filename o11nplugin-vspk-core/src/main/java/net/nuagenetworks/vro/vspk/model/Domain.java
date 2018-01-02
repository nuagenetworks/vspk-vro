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
import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationperformancemanagementbindingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BridgeInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPOptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressAdvFwdTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainFIPAclTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FloatingIPACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FirewallAclsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FloatingIpsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.HostInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAdvFwdTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressExternalServiceTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LinksFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkPerformanceBindingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGRoutingPolicyBindingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.OSPFInstancesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PGExpressionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QOSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RoutingPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SPATSourcesPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StaticRoutesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UplinkRDsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualFirewallPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFDomainMappingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPNConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ZonesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.DomainDHCPBehavior;

import net.nuagenetworks.vro.vspk.model.enums.DomainDPI;

import net.nuagenetworks.vro.vspk.model.enums.DomainPATEnabled;

import net.nuagenetworks.vro.vspk.model.enums.DomainAdvertiseCriteria;

import net.nuagenetworks.vro.vspk.model.enums.DomainEncryption;

import net.nuagenetworks.vro.vspk.model.enums.DomainEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.DomainMaintenanceMode;

import net.nuagenetworks.vro.vspk.model.enums.DomainMulticast;

import net.nuagenetworks.vro.vspk.model.enums.DomainPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.DomainPolicyChangeStatus;

import net.nuagenetworks.vro.vspk.model.enums.DomainTunnelType;

import net.nuagenetworks.vro.vspk.model.enums.DomainUnderlayEnabled;

import net.nuagenetworks.vro.vspk.model.enums.DomainUplinkPreference;
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

@VsoFinder(name = Constants.DOMAIN, datasource = Constants.DATASOURCE, image = Constants.DOMAIN_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, type = Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPOPTIONS_FETCHER, type = Constants.DHCPOPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSACLTEMPLATES_FETCHER, type = Constants.EGRESSACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSADVFWDTEMPLATES_FETCHER, type = Constants.EGRESSADVFWDTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINFIPACLTEMPLATES_FETCHER, type = Constants.DOMAINFIPACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.FLOATINGIPACLTEMPLATES_FETCHER, type = Constants.FLOATINGIPACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.FLOATINGIPS_FETCHER, type = Constants.FLOATINGIPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSACLENTRYTEMPLATES_FETCHER, type = Constants.INGRESSACLENTRYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSACLTEMPLATES_FETCHER, type = Constants.INGRESSACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSADVFWDTEMPLATES_FETCHER, type = Constants.INGRESSADVFWDTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, type = Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.LINKS_FETCHER, type = Constants.LINKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, type = Constants.NETWORKPERFORMANCEBINDINGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGROUTINGPOLICYBINDINGS_FETCHER, type = Constants.NSGROUTINGPOLICYBINDINGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.OSPFINSTANCES_FETCHER, type = Constants.OSPFINSTANCES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PGEXPRESSIONS_FETCHER, type = Constants.PGEXPRESSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.POLICYGROUPS_FETCHER, type = Constants.POLICYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.QOSS_FETCHER, type = Constants.QOSS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDIRECTIONTARGETS_FETCHER, type = Constants.REDIRECTIONTARGETS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ROUTINGPOLICIES_FETCHER, type = Constants.ROUTINGPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SPATSOURCESPOOLS_FETCHER, type = Constants.SPATSOURCESPOOLS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATICROUTES_FETCHER, type = Constants.STATICROUTES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATISTICSPOLICIES_FETCHER, type = Constants.STATISTICSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TCAS_FETCHER, type = Constants.TCAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VIRTUALFIREWALLPOLICIES_FETCHER, type = Constants.VIRTUALFIREWALLPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VNFDOMAINMAPPINGS_FETCHER, type = Constants.VNFDOMAINMAPPINGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VPNCONNECTIONS_FETCHER, type = Constants.VPNCONNECTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ZONES_FETCHER, type = Constants.ZONES_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "domain", resourceName = "domains")
public class Domain extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BGPEnabled")
    protected Boolean BGPEnabled;
    
    @JsonProperty(value = "DHCPBehavior")
    protected DomainDHCPBehavior DHCPBehavior;
    
    @JsonProperty(value = "DHCPServerAddress")
    protected String DHCPServerAddress;
    
    @JsonProperty(value = "DPI")
    protected DomainDPI DPI;
    
    @JsonProperty(value = "ECMPCount")
    protected Long ECMPCount;
    
    @JsonProperty(value = "FIPUnderlay")
    protected Boolean FIPUnderlay;
    
    @JsonProperty(value = "PATEnabled")
    protected DomainPATEnabled PATEnabled;
    
    @JsonProperty(value = "advertiseCriteria")
    protected DomainAdvertiseCriteria advertiseCriteria;
    
    @JsonProperty(value = "associatedBGPProfileID")
    protected String associatedBGPProfileID;
    
    @JsonProperty(value = "associatedMulticastChannelMapID")
    protected String associatedMulticastChannelMapID;
    
    @JsonProperty(value = "associatedPATMapperID")
    protected String associatedPATMapperID;
    
    @JsonProperty(value = "associatedSharedPATMapperID")
    protected String associatedSharedPATMapperID;
    
    @JsonProperty(value = "associatedUnderlayID")
    protected String associatedUnderlayID;
    
    @JsonProperty(value = "backHaulRouteDistinguisher")
    protected String backHaulRouteDistinguisher;
    
    @JsonProperty(value = "backHaulRouteTarget")
    protected String backHaulRouteTarget;
    
    @JsonProperty(value = "backHaulServiceID")
    protected Long backHaulServiceID;
    
    @JsonProperty(value = "backHaulSubnetIPAddress")
    protected String backHaulSubnetIPAddress;
    
    @JsonProperty(value = "backHaulSubnetMask")
    protected String backHaulSubnetMask;
    
    @JsonProperty(value = "backHaulVNID")
    protected Long backHaulVNID;
    
    @JsonProperty(value = "customerID")
    protected Long customerID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "dhcpServerAddresses")
    protected java.util.List<String> dhcpServerAddresses;
    
    @JsonProperty(value = "domainID")
    protected Long domainID;
    
    @JsonProperty(value = "domainVLANID")
    protected Long domainVLANID;
    
    @JsonProperty(value = "encryption")
    protected DomainEncryption encryption;
    
    @JsonProperty(value = "entityScope")
    protected DomainEntityScope entityScope;
    
    @JsonProperty(value = "exportRouteTarget")
    protected String exportRouteTarget;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "globalRoutingEnabled")
    protected Boolean globalRoutingEnabled;
    
    @JsonProperty(value = "importRouteTarget")
    protected String importRouteTarget;
    
    @JsonProperty(value = "labelID")
    protected Long labelID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "leakingEnabled")
    protected Boolean leakingEnabled;
    
    @JsonProperty(value = "localAS")
    protected Long localAS;
    
    @JsonProperty(value = "maintenanceMode")
    protected DomainMaintenanceMode maintenanceMode;
    
    @JsonProperty(value = "multicast")
    protected DomainMulticast multicast;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "permittedAction")
    protected DomainPermittedAction permittedAction;
    
    @JsonProperty(value = "policyChangeStatus")
    protected DomainPolicyChangeStatus policyChangeStatus;
    
    @JsonProperty(value = "routeDistinguisher")
    protected String routeDistinguisher;
    
    @JsonProperty(value = "routeTarget")
    protected String routeTarget;
    
    @JsonProperty(value = "secondaryDHCPServerAddress")
    protected String secondaryDHCPServerAddress;
    
    @JsonProperty(value = "serviceID")
    protected Long serviceID;
    
    @JsonProperty(value = "stretched")
    protected Boolean stretched;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "tunnelType")
    protected DomainTunnelType tunnelType;
    
    @JsonProperty(value = "underlayEnabled")
    protected DomainUnderlayEnabled underlayEnabled;
    
    @JsonProperty(value = "uplinkPreference")
    protected DomainUplinkPreference uplinkPreference;
    
    @JsonIgnore
    private ApplicationperformancemanagementbindingsFetcher applicationperformancemanagementbindings;
    
    @JsonIgnore
    private BridgeInterfacesFetcher bridgeInterfaces;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private ContainerInterfacesFetcher containerInterfaces;
    
    @JsonIgnore
    private DHCPOptionsFetcher dHCPOptions;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private DomainTemplatesFetcher domainTemplates;
    
    @JsonIgnore
    private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
    
    @JsonIgnore
    private EgressACLTemplatesFetcher egressACLTemplates;
    
    @JsonIgnore
    private EgressAdvFwdTemplatesFetcher egressAdvFwdTemplates;
    
    @JsonIgnore
    private DomainFIPAclTemplatesFetcher domainFIPAclTemplates;
    
    @JsonIgnore
    private FloatingIPACLTemplatesFetcher floatingIPACLTemplates;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private FirewallAclsFetcher firewallAcls;
    
    @JsonIgnore
    private FloatingIpsFetcher floatingIps;
    
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
    private IngressExternalServiceTemplatesFetcher ingressExternalServiceTemplates;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private LinksFetcher links;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private NetworkPerformanceBindingsFetcher networkPerformanceBindings;
    
    @JsonIgnore
    private NSGRoutingPolicyBindingsFetcher nSGRoutingPolicyBindings;
    
    @JsonIgnore
    private OSPFInstancesFetcher oSPFInstances;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PGExpressionsFetcher pGExpressions;
    
    @JsonIgnore
    private PolicyGroupsFetcher policyGroups;
    
    @JsonIgnore
    private QOSsFetcher qOSs;
    
    @JsonIgnore
    private RedirectionTargetsFetcher redirectionTargets;
    
    @JsonIgnore
    private RoutingPoliciesFetcher routingPolicies;
    
    @JsonIgnore
    private SPATSourcesPoolsFetcher sPATSourcesPools;
    
    @JsonIgnore
    private StaticRoutesFetcher staticRoutes;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private StatisticsPoliciesFetcher statisticsPolicies;
    
    @JsonIgnore
    private SubnetsFetcher subnets;
    
    @JsonIgnore
    private TCAsFetcher tCAs;
    
    @JsonIgnore
    private UplinkRDsFetcher uplinkRDs;
    
    @JsonIgnore
    private VirtualFirewallPoliciesFetcher virtualFirewallPolicies;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VMInterfacesFetcher vMInterfaces;
    
    @JsonIgnore
    private VNFDomainMappingsFetcher vNFDomainMappings;
    
    @JsonIgnore
    private VPNConnectionsFetcher vPNConnections;
    
    @JsonIgnore
    private VPortsFetcher vPorts;
    
    @JsonIgnore
    private ZonesFetcher zones;
    
    @VsoConstructor
    public Domain() {
        PATEnabled = DomainPATEnabled.INHERITED;
        
        DHCPBehavior = DomainDHCPBehavior.CONSUME;
        
        tunnelType = DomainTunnelType.DC_DEFAULT;
        
        maintenanceMode = DomainMaintenanceMode.DISABLED;
        
        applicationperformancemanagementbindings = new ApplicationperformancemanagementbindingsFetcher(this);
        
        bridgeInterfaces = new BridgeInterfacesFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        dHCPOptions = new DHCPOptionsFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        domainTemplates = new DomainTemplatesFetcher(this);
        
        egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
        
        egressACLTemplates = new EgressACLTemplatesFetcher(this);
        
        egressAdvFwdTemplates = new EgressAdvFwdTemplatesFetcher(this);
        
        domainFIPAclTemplates = new DomainFIPAclTemplatesFetcher(this);
        
        floatingIPACLTemplates = new FloatingIPACLTemplatesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        firewallAcls = new FirewallAclsFetcher(this);
        
        floatingIps = new FloatingIpsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        groups = new GroupsFetcher(this);
        
        hostInterfaces = new HostInterfacesFetcher(this);
        
        ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
        
        ingressACLTemplates = new IngressACLTemplatesFetcher(this);
        
        ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
        
        ingressExternalServiceTemplates = new IngressExternalServiceTemplatesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        links = new LinksFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        networkPerformanceBindings = new NetworkPerformanceBindingsFetcher(this);
        
        nSGRoutingPolicyBindings = new NSGRoutingPolicyBindingsFetcher(this);
        
        oSPFInstances = new OSPFInstancesFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        pGExpressions = new PGExpressionsFetcher(this);
        
        policyGroups = new PolicyGroupsFetcher(this);
        
        qOSs = new QOSsFetcher(this);
        
        redirectionTargets = new RedirectionTargetsFetcher(this);
        
        routingPolicies = new RoutingPoliciesFetcher(this);
        
        sPATSourcesPools = new SPATSourcesPoolsFetcher(this);
        
        staticRoutes = new StaticRoutesFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        statisticsPolicies = new StatisticsPoliciesFetcher(this);
        
        subnets = new SubnetsFetcher(this);
        
        tCAs = new TCAsFetcher(this);
        
        uplinkRDs = new UplinkRDsFetcher(this);
        
        virtualFirewallPolicies = new VirtualFirewallPoliciesFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vMInterfaces = new VMInterfacesFetcher(this);
        
        vNFDomainMappings = new VNFDomainMappingsFetcher(this);
        
        vPNConnections = new VPNConnectionsFetcher(this);
        
        vPorts = new VPortsFetcher(this);
        
        zones = new ZonesFetcher(this);
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
    @VsoProperty(displayName = "BGPEnabled", readOnly = false)   
    public Boolean getBGPEnabled() {
       return BGPEnabled;
    }

    @JsonIgnore
    public void setBGPEnabled(Boolean value) { 
        this.BGPEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPBehavior", readOnly = false)   
    public DomainDHCPBehavior getDHCPBehavior() {
       return DHCPBehavior;
    }

    @JsonIgnore
    public void setDHCPBehavior(DomainDHCPBehavior value) { 
        this.DHCPBehavior = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPServerAddress", readOnly = false)   
    public String getDHCPServerAddress() {
       return DHCPServerAddress;
    }

    @JsonIgnore
    public void setDHCPServerAddress(String value) { 
        this.DHCPServerAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DPI", readOnly = false)   
    public DomainDPI getDPI() {
       return DPI;
    }

    @JsonIgnore
    public void setDPI(DomainDPI value) { 
        this.DPI = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ECMPCount", readOnly = false)   
    public Long getECMPCount() {
       return ECMPCount;
    }

    @JsonIgnore
    public void setECMPCount(Long value) { 
        this.ECMPCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPUnderlay", readOnly = false)   
    public Boolean getFIPUnderlay() {
       return FIPUnderlay;
    }

    @JsonIgnore
    public void setFIPUnderlay(Boolean value) { 
        this.FIPUnderlay = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATEnabled", readOnly = false)   
    public DomainPATEnabled getPATEnabled() {
       return PATEnabled;
    }

    @JsonIgnore
    public void setPATEnabled(DomainPATEnabled value) { 
        this.PATEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AdvertiseCriteria", readOnly = false)   
    public DomainAdvertiseCriteria getAdvertiseCriteria() {
       return advertiseCriteria;
    }

    @JsonIgnore
    public void setAdvertiseCriteria(DomainAdvertiseCriteria value) { 
        this.advertiseCriteria = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedBGPProfileID", readOnly = false)   
    public String getAssociatedBGPProfileID() {
       return associatedBGPProfileID;
    }

    @JsonIgnore
    public void setAssociatedBGPProfileID(String value) { 
        this.associatedBGPProfileID = value;
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
    @VsoProperty(displayName = "AssociatedPATMapperID", readOnly = false)   
    public String getAssociatedPATMapperID() {
       return associatedPATMapperID;
    }

    @JsonIgnore
    public void setAssociatedPATMapperID(String value) { 
        this.associatedPATMapperID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSharedPATMapperID", readOnly = false)   
    public String getAssociatedSharedPATMapperID() {
       return associatedSharedPATMapperID;
    }

    @JsonIgnore
    public void setAssociatedSharedPATMapperID(String value) { 
        this.associatedSharedPATMapperID = value;
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
    @VsoProperty(displayName = "BackHaulRouteDistinguisher", readOnly = false)   
    public String getBackHaulRouteDistinguisher() {
       return backHaulRouteDistinguisher;
    }

    @JsonIgnore
    public void setBackHaulRouteDistinguisher(String value) { 
        this.backHaulRouteDistinguisher = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulRouteTarget", readOnly = false)   
    public String getBackHaulRouteTarget() {
       return backHaulRouteTarget;
    }

    @JsonIgnore
    public void setBackHaulRouteTarget(String value) { 
        this.backHaulRouteTarget = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulServiceID", readOnly = false)   
    public Long getBackHaulServiceID() {
       return backHaulServiceID;
    }

    @JsonIgnore
    public void setBackHaulServiceID(Long value) { 
        this.backHaulServiceID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulSubnetIPAddress", readOnly = false)   
    public String getBackHaulSubnetIPAddress() {
       return backHaulSubnetIPAddress;
    }

    @JsonIgnore
    public void setBackHaulSubnetIPAddress(String value) { 
        this.backHaulSubnetIPAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulSubnetMask", readOnly = false)   
    public String getBackHaulSubnetMask() {
       return backHaulSubnetMask;
    }

    @JsonIgnore
    public void setBackHaulSubnetMask(String value) { 
        this.backHaulSubnetMask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulVNID", readOnly = false)   
    public Long getBackHaulVNID() {
       return backHaulVNID;
    }

    @JsonIgnore
    public void setBackHaulVNID(Long value) { 
        this.backHaulVNID = value;
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
    @VsoProperty(displayName = "DhcpServerAddresses", readOnly = false)   
    public java.util.List<String> getDhcpServerAddresses() {
       return dhcpServerAddresses;
    }

    @JsonIgnore
    public void setDhcpServerAddresses(java.util.List<String> value) { 
        this.dhcpServerAddresses = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainID", readOnly = false)   
    public Long getDomainID() {
       return domainID;
    }

    @JsonIgnore
    public void setDomainID(Long value) { 
        this.domainID = value;
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
    @VsoProperty(displayName = "Encryption", readOnly = false)   
    public DomainEncryption getEncryption() {
       return encryption;
    }

    @JsonIgnore
    public void setEncryption(DomainEncryption value) { 
        this.encryption = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public DomainEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(DomainEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExportRouteTarget", readOnly = false)   
    public String getExportRouteTarget() {
       return exportRouteTarget;
    }

    @JsonIgnore
    public void setExportRouteTarget(String value) { 
        this.exportRouteTarget = value;
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
    @VsoProperty(displayName = "GlobalRoutingEnabled", readOnly = false)   
    public Boolean getGlobalRoutingEnabled() {
       return globalRoutingEnabled;
    }

    @JsonIgnore
    public void setGlobalRoutingEnabled(Boolean value) { 
        this.globalRoutingEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ImportRouteTarget", readOnly = false)   
    public String getImportRouteTarget() {
       return importRouteTarget;
    }

    @JsonIgnore
    public void setImportRouteTarget(String value) { 
        this.importRouteTarget = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LabelID", readOnly = false)   
    public Long getLabelID() {
       return labelID;
    }

    @JsonIgnore
    public void setLabelID(Long value) { 
        this.labelID = value;
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
    @VsoProperty(displayName = "LeakingEnabled", readOnly = false)   
    public Boolean getLeakingEnabled() {
       return leakingEnabled;
    }

    @JsonIgnore
    public void setLeakingEnabled(Boolean value) { 
        this.leakingEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocalAS", readOnly = false)   
    public Long getLocalAS() {
       return localAS;
    }

    @JsonIgnore
    public void setLocalAS(Long value) { 
        this.localAS = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MaintenanceMode", readOnly = false)   
    public DomainMaintenanceMode getMaintenanceMode() {
       return maintenanceMode;
    }

    @JsonIgnore
    public void setMaintenanceMode(DomainMaintenanceMode value) { 
        this.maintenanceMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Multicast", readOnly = false)   
    public DomainMulticast getMulticast() {
       return multicast;
    }

    @JsonIgnore
    public void setMulticast(DomainMulticast value) { 
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
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public DomainPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(DomainPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyChangeStatus", readOnly = false)   
    public DomainPolicyChangeStatus getPolicyChangeStatus() {
       return policyChangeStatus;
    }

    @JsonIgnore
    public void setPolicyChangeStatus(DomainPolicyChangeStatus value) { 
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
    @VsoProperty(displayName = "SecondaryDHCPServerAddress", readOnly = false)   
    public String getSecondaryDHCPServerAddress() {
       return secondaryDHCPServerAddress;
    }

    @JsonIgnore
    public void setSecondaryDHCPServerAddress(String value) { 
        this.secondaryDHCPServerAddress = value;
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
    @VsoProperty(displayName = "TunnelType", readOnly = false)   
    public DomainTunnelType getTunnelType() {
       return tunnelType;
    }

    @JsonIgnore
    public void setTunnelType(DomainTunnelType value) { 
        this.tunnelType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayEnabled", readOnly = false)   
    public DomainUnderlayEnabled getUnderlayEnabled() {
       return underlayEnabled;
    }

    @JsonIgnore
    public void setUnderlayEnabled(DomainUnderlayEnabled value) { 
        this.underlayEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkPreference", readOnly = false)   
    public DomainUplinkPreference getUplinkPreference() {
       return uplinkPreference;
    }

    @JsonIgnore
    public void setUplinkPreference(DomainUplinkPreference value) { 
        this.uplinkPreference = value;
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
    @VsoProperty(displayName = "DHCPOptions", readOnly = true)   
    public DHCPOptionsFetcher getDHCPOptions() {
        return dHCPOptions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Domains", readOnly = true)   
    public DomainsFetcher getDomains() {
        return domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainTemplates", readOnly = true)   
    public DomainTemplatesFetcher getDomainTemplates() {
        return domainTemplates;
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
    @VsoProperty(displayName = "DomainFIPAclTemplates", readOnly = true)   
    public DomainFIPAclTemplatesFetcher getDomainFIPAclTemplates() {
        return domainFIPAclTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FloatingIPACLTemplates", readOnly = true)   
    public FloatingIPACLTemplatesFetcher getFloatingIPACLTemplates() {
        return floatingIPACLTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FirewallAcls", readOnly = true)   
    public FirewallAclsFetcher getFirewallAcls() {
        return firewallAcls;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FloatingIps", readOnly = true)   
    public FloatingIpsFetcher getFloatingIps() {
        return floatingIps;
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
    @VsoProperty(displayName = "IngressExternalServiceTemplates", readOnly = true)   
    public IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplates() {
        return ingressExternalServiceTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Links", readOnly = true)   
    public LinksFetcher getLinks() {
        return links;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkPerformanceBindings", readOnly = true)   
    public NetworkPerformanceBindingsFetcher getNetworkPerformanceBindings() {
        return networkPerformanceBindings;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGRoutingPolicyBindings", readOnly = true)   
    public NSGRoutingPolicyBindingsFetcher getNSGRoutingPolicyBindings() {
        return nSGRoutingPolicyBindings;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OSPFInstances", readOnly = true)   
    public OSPFInstancesFetcher getOSPFInstances() {
        return oSPFInstances;
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
    @VsoProperty(displayName = "RoutingPolicies", readOnly = true)   
    public RoutingPoliciesFetcher getRoutingPolicies() {
        return routingPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SPATSourcesPools", readOnly = true)   
    public SPATSourcesPoolsFetcher getSPATSourcesPools() {
        return sPATSourcesPools;
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
    @VsoProperty(displayName = "Subnets", readOnly = true)   
    public SubnetsFetcher getSubnets() {
        return subnets;
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
    @VsoProperty(displayName = "VNFDomainMappings", readOnly = true)   
    public VNFDomainMappingsFetcher getVNFDomainMappings() {
        return vNFDomainMappings;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "Zones", readOnly = true)   
    public ZonesFetcher getZones() {
        return zones;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAIN, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.DOMAIN, getId());
        }
    }
    @VsoMethod
    public void assignDomains(Session session, Domain[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void assignDomainTemplates(Session session, DomainTemplate[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void assignGroups(Session session, Group[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAIN, getId());
        }
    }
    
    @VsoMethod
    public void assignLinks(Session session, Link[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAIN, getId());
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
    public void createDHCPOption(Session session, DHCPOption childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DHCPOPTIONS_FETCHER, getId());
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
    public void createDomainFIPAclTemplate(Session session, DomainFIPAclTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DOMAINFIPACLTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createFloatingIPACLTemplate(Session session, FloatingIPACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.FLOATINGIPACLTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createFloatingIp(Session session, FloatingIp childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.FLOATINGIPS_FETCHER, getId());
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
    public void createIngressExternalServiceTemplate(Session session, IngressExternalServiceTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, getId());
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
    public void createLink(Session session, Link childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.LINKS_FETCHER, getId());
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
    public void createNetworkPerformanceBinding(Session session, NetworkPerformanceBinding childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSGRoutingPolicyBinding(Session session, NSGRoutingPolicyBinding childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGROUTINGPOLICYBINDINGS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createOSPFInstance(Session session, OSPFInstance childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.OSPFINSTANCES_FETCHER, getId());
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
    public void createRoutingPolicy(Session session, RoutingPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ROUTINGPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSPATSourcesPool(Session session, SPATSourcesPool childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SPATSOURCESPOOLS_FETCHER, getId());
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
    public void createVNFDomainMapping(Session session, VNFDomainMapping childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VNFDOMAINMAPPINGS_FETCHER, getId());
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
    public void createZone(Session session, Zone childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ZONES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateZone(Session session, Zone childRestObj, ZoneTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ZONES_FETCHER, getId());
        }
    }
    public String toString() {
        return "Domain [" + "BGPEnabled=" + BGPEnabled + ", DHCPBehavior=" + DHCPBehavior + ", DHCPServerAddress=" + DHCPServerAddress + ", DPI=" + DPI + ", ECMPCount=" + ECMPCount + ", FIPUnderlay=" + FIPUnderlay + ", PATEnabled=" + PATEnabled + ", advertiseCriteria=" + advertiseCriteria + ", associatedBGPProfileID=" + associatedBGPProfileID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedPATMapperID=" + associatedPATMapperID + ", associatedSharedPATMapperID=" + associatedSharedPATMapperID + ", associatedUnderlayID=" + associatedUnderlayID + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulServiceID=" + backHaulServiceID + ", backHaulSubnetIPAddress=" + backHaulSubnetIPAddress + ", backHaulSubnetMask=" + backHaulSubnetMask + ", backHaulVNID=" + backHaulVNID + ", customerID=" + customerID + ", description=" + description + ", dhcpServerAddresses=" + dhcpServerAddresses + ", domainID=" + domainID + ", domainVLANID=" + domainVLANID + ", encryption=" + encryption + ", entityScope=" + entityScope + ", exportRouteTarget=" + exportRouteTarget + ", externalID=" + externalID + ", globalRoutingEnabled=" + globalRoutingEnabled + ", importRouteTarget=" + importRouteTarget + ", labelID=" + labelID + ", lastUpdatedBy=" + lastUpdatedBy + ", leakingEnabled=" + leakingEnabled + ", localAS=" + localAS + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", permittedAction=" + permittedAction + ", policyChangeStatus=" + policyChangeStatus + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", secondaryDHCPServerAddress=" + secondaryDHCPServerAddress + ", serviceID=" + serviceID + ", stretched=" + stretched + ", templateID=" + templateID + ", tunnelType=" + tunnelType + ", underlayEnabled=" + underlayEnabled + ", uplinkPreference=" + uplinkPreference + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}