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
import net.nuagenetworks.vro.vspk.model.fetchers.AllGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AllRedundancyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationperformancemanagementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AutoDiscoveredGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPNeighborsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CertificatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CloudMgmtSystemsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CommandsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.COSRemarkingPolicyTablesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DSCPRemarkingPolicyTablesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DUCGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCenterEAMConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressAdvFwdEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainFIPAclTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressQOSPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterpriseProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EsIlmPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EsIndexConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EthernetSegmentGWGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FloatingIpsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.HostInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureAccessProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureEVDFProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureGatewayProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureVscProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAdvFwdEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressQOSPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMembersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L4ServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L7applicationsignaturesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LicensesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LicenseStatusFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MirrorDestinationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiCastChannelMapsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetconfGlobalConfigurationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetconfProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkLayoutsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkPerformanceMeasurementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGMigrationProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGPatchProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSRedundantGatewayGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGUpgradeProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.OverlayMirrorDestinationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATMappersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PerformanceMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyObjectGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QOSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QosPolicersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RateLimitersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedundancyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RemoteVrsInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RolesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RoutingPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SaaSApplicationTypesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SharedNetworkResourcesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SiteInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StaticRoutesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatsCollectorInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SystemConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TestDefinitionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UnderlaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UplinkRDsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UsersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UserContextsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCentersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCenterHypervisorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualFirewallPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VirtualFirewallRulesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFCatalogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFThresholdPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCenterVRSConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.vrsInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VSDConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VSPsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ZFBAutoAssignmentsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ZFBRequestsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ZonesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.MeAvatarType;

import net.nuagenetworks.vro.vspk.model.enums.MeEntityScope;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.annotation.RestEntity;
import net.nuagenetworks.vro.model.BaseRootObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.ME, datasource = Constants.DATASOURCE, image = Constants.ME_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ALLREDUNDANCYGROUPS_FETCHER, type = Constants.ALLREDUNDANCYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CLOUDMGMTSYSTEMS_FETCHER, type = Constants.CLOUDMGMTSYSTEMS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.COMMANDS_FETCHER, type = Constants.COMMANDS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CONTAINERS_FETCHER, type = Constants.CONTAINERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.COSREMARKINGPOLICYTABLES_FETCHER, type = Constants.COSREMARKINGPOLICYTABLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DSCPREMARKINGPOLICYTABLES_FETCHER, type = Constants.DSCPREMARKINGPOLICYTABLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DUCGROUPS_FETCHER, type = Constants.DUCGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINFIPACLTEMPLATES_FETCHER, type = Constants.DOMAINFIPACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSQOSPOLICIES_FETCHER, type = Constants.EGRESSQOSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISES_FETCHER, type = Constants.ENTERPRISES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPROFILES_FETCHER, type = Constants.ENTERPRISEPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ESILMPOLICIES_FETCHER, type = Constants.ESILMPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ETHERNETSEGMENTGWGROUPS_FETCHER, type = Constants.ETHERNETSEGMENTGWGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYS_FETCHER, type = Constants.GATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYTEMPLATES_FETCHER, type = Constants.GATEWAYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GLOBALMETADATAS_FETCHER, type = Constants.GLOBALMETADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER, type = Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER, type = Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, type = Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, type = Constants.INFRASTRUCTUREVSCPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSQOSPOLICIES_FETCHER, type = Constants.INGRESSQOSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.KEYSERVERMEMBERS_FETCHER, type = Constants.KEYSERVERMEMBERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L4SERVICES_FETCHER, type = Constants.L4SERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.LICENSES_FETCHER, type = Constants.LICENSES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.MIRRORDESTINATIONS_FETCHER, type = Constants.MIRRORDESTINATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.MULTICASTCHANNELMAPS_FETCHER, type = Constants.MULTICASTCHANNELMAPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETCONFGLOBALCONFIGURATIONS_FETCHER, type = Constants.NETCONFGLOBALCONFIGURATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETCONFPROFILES_FETCHER, type = Constants.NETCONFPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGATEWAYS_FETCHER, type = Constants.NSGATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGATEWAYTEMPLATES_FETCHER, type = Constants.NSGATEWAYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGGROUPS_FETCHER, type = Constants.NSGGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGMIGRATIONPROFILES_FETCHER, type = Constants.NSGMIGRATIONPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGPATCHPROFILES_FETCHER, type = Constants.NSGPATCHPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, type = Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGUPGRADEPROFILES_FETCHER, type = Constants.NSGUPGRADEPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PATMAPPERS_FETCHER, type = Constants.PATMAPPERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PATNATPOOLS_FETCHER, type = Constants.PATNATPOOLS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERFORMANCEMONITORS_FETCHER, type = Constants.PERFORMANCEMONITORS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.QOSPOLICERS_FETCHER, type = Constants.QOSPOLICERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.RATELIMITERS_FETCHER, type = Constants.RATELIMITERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDUNDANCYGROUPS_FETCHER, type = Constants.REDUNDANCYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REMOTEVRSINFOS_FETCHER, type = Constants.REMOTEVRSINFOS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ROLES_FETCHER, type = Constants.ROLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SHAREDNETWORKRESOURCES_FETCHER, type = Constants.SHAREDNETWORKRESOURCES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SITEINFOS_FETCHER, type = Constants.SITEINFOS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SYSTEMCONFIGS_FETCHER, type = Constants.SYSTEMCONFIGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TESTDEFINITIONS_FETCHER, type = Constants.TESTDEFINITIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.UNDERLAYS_FETCHER, type = Constants.UNDERLAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VCENTERS_FETCHER, type = Constants.VCENTERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VMS_FETCHER, type = Constants.VMS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VNFMETADATAS_FETCHER, type = Constants.VNFMETADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VNFTHRESHOLDPOLICIES_FETCHER, type = Constants.VNFTHRESHOLDPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ZFBAUTOASSIGNMENTS_FETCHER, type = Constants.ZFBAUTOASSIGNMENTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ZFBREQUESTS_FETCHER, type = Constants.ZFBREQUESTS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "me", resourceName = "me")
public class Me extends BaseRootObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "AARFlowStatsInterval")
    protected Long AARFlowStatsInterval;
    
    @JsonProperty(value = "AARProbeStatsInterval")
    protected Long AARProbeStatsInterval;
    
    @JsonProperty(value = "APIKeyExpiry")
    protected Long APIKeyExpiry;
    
    @JsonProperty(value = "VSSStatsInterval")
    protected Long VSSStatsInterval;
    
    @JsonProperty(value = "avatarData")
    protected String avatarData;
    
    @JsonProperty(value = "avatarType")
    protected MeAvatarType avatarType;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "disabled")
    protected Boolean disabled;
    
    @JsonProperty(value = "elasticSearchAddress")
    protected String elasticSearchAddress;
    
    @JsonProperty(value = "email")
    protected String email;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected MeEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "firstName")
    protected String firstName;
    
    @JsonProperty(value = "flowCollectionEnabled")
    protected Boolean flowCollectionEnabled;
    
    @JsonProperty(value = "lastName")
    protected String lastName;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "mobileNumber")
    protected String mobileNumber;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "password")
    protected String password;
    
    @JsonProperty(value = "role")
    protected String role;
    
    @JsonProperty(value = "statisticsEnabled")
    protected Boolean statisticsEnabled;
    
    @JsonProperty(value = "userName")
    protected String userName;
    
    @JsonIgnore
    private AllGatewaysFetcher allGateways;
    
    @JsonIgnore
    private AllRedundancyGroupsFetcher allRedundancyGroups;
    
    @JsonIgnore
    private ApplicationsFetcher applications;
    
    @JsonIgnore
    private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
    
    @JsonIgnore
    private AutoDiscoveredGatewaysFetcher autoDiscoveredGateways;
    
    @JsonIgnore
    private BGPNeighborsFetcher bGPNeighbors;
    
    @JsonIgnore
    private BGPProfilesFetcher bGPProfiles;
    
    @JsonIgnore
    private CertificatesFetcher certificates;
    
    @JsonIgnore
    private CloudMgmtSystemsFetcher cloudMgmtSystems;
    
    @JsonIgnore
    private CommandsFetcher commands;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private ContainerInterfacesFetcher containerInterfaces;
    
    @JsonIgnore
    private COSRemarkingPolicyTablesFetcher cOSRemarkingPolicyTables;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private DSCPRemarkingPolicyTablesFetcher dSCPRemarkingPolicyTables;
    
    @JsonIgnore
    private DUCGroupsFetcher dUCGroups;
    
    @JsonIgnore
    private VCenterEAMConfigsFetcher vCenterEAMConfigs;
    
    @JsonIgnore
    private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
    
    @JsonIgnore
    private EgressACLTemplatesFetcher egressACLTemplates;
    
    @JsonIgnore
    private EgressAdvFwdEntryTemplatesFetcher egressAdvFwdEntryTemplates;
    
    @JsonIgnore
    private DomainFIPAclTemplatesFetcher domainFIPAclTemplates;
    
    @JsonIgnore
    private EgressQOSPoliciesFetcher egressQOSPolicies;
    
    @JsonIgnore
    private EnterprisesFetcher enterprises;
    
    @JsonIgnore
    private EnterpriseProfilesFetcher enterpriseProfiles;
    
    @JsonIgnore
    private EsIlmPoliciesFetcher esIlmPolicies;
    
    @JsonIgnore
    private EsIndexConfigsFetcher esIndexConfigs;
    
    @JsonIgnore
    private EthernetSegmentGWGroupsFetcher ethernetSegmentGWGroups;
    
    @JsonIgnore
    private FloatingIpsFetcher floatingIps;
    
    @JsonIgnore
    private GatewaysFetcher gateways;
    
    @JsonIgnore
    private GatewayTemplatesFetcher gatewayTemplates;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private HostInterfacesFetcher hostInterfaces;
    
    @JsonIgnore
    private InfrastructureAccessProfilesFetcher infrastructureAccessProfiles;
    
    @JsonIgnore
    private InfrastructureEVDFProfilesFetcher infrastructureEVDFProfiles;
    
    @JsonIgnore
    private InfrastructureGatewayProfilesFetcher infrastructureGatewayProfiles;
    
    @JsonIgnore
    private InfrastructureVscProfilesFetcher infrastructureVscProfiles;
    
    @JsonIgnore
    private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
    
    @JsonIgnore
    private IngressACLTemplatesFetcher ingressACLTemplates;
    
    @JsonIgnore
    private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
    
    @JsonIgnore
    private IngressQOSPoliciesFetcher ingressQOSPolicies;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private KeyServerMembersFetcher keyServerMembers;
    
    @JsonIgnore
    private L2DomainsFetcher l2Domains;
    
    @JsonIgnore
    private L4ServicesFetcher l4Services;
    
    @JsonIgnore
    private L7applicationsignaturesFetcher l7applicationsignatures;
    
    @JsonIgnore
    private LicensesFetcher licenses;
    
    @JsonIgnore
    private LicenseStatusFetcher licenseStatus;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MirrorDestinationsFetcher mirrorDestinations;
    
    @JsonIgnore
    private MultiCastChannelMapsFetcher multiCastChannelMaps;
    
    @JsonIgnore
    private NetconfGlobalConfigurationsFetcher netconfGlobalConfigurations;
    
    @JsonIgnore
    private NetconfProfilesFetcher netconfProfiles;
    
    @JsonIgnore
    private NetworkLayoutsFetcher networkLayouts;
    
    @JsonIgnore
    private NetworkPerformanceMeasurementsFetcher networkPerformanceMeasurements;
    
    @JsonIgnore
    private NSGatewaysFetcher nSGateways;
    
    @JsonIgnore
    private NSGatewayTemplatesFetcher nSGatewayTemplates;
    
    @JsonIgnore
    private NSGGroupsFetcher nSGGroups;
    
    @JsonIgnore
    private NSGInfosFetcher nSGInfos;
    
    @JsonIgnore
    private NSGMigrationProfilesFetcher nSGMigrationProfiles;
    
    @JsonIgnore
    private NSGPatchProfilesFetcher nSGPatchProfiles;
    
    @JsonIgnore
    private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
    
    @JsonIgnore
    private NSGUpgradeProfilesFetcher nSGUpgradeProfiles;
    
    @JsonIgnore
    private OverlayMirrorDestinationsFetcher overlayMirrorDestinations;
    
    @JsonIgnore
    private PATMappersFetcher pATMappers;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PerformanceMonitorsFetcher performanceMonitors;
    
    @JsonIgnore
    private PolicyGroupsFetcher policyGroups;
    
    @JsonIgnore
    private PolicyObjectGroupsFetcher policyObjectGroups;
    
    @JsonIgnore
    private QOSsFetcher qOSs;
    
    @JsonIgnore
    private QosPolicersFetcher qosPolicers;
    
    @JsonIgnore
    private RateLimitersFetcher rateLimiters;
    
    @JsonIgnore
    private RedirectionTargetsFetcher redirectionTargets;
    
    @JsonIgnore
    private RedundancyGroupsFetcher redundancyGroups;
    
    @JsonIgnore
    private RemoteVrsInfosFetcher remoteVrsInfos;
    
    @JsonIgnore
    private RolesFetcher roles;
    
    @JsonIgnore
    private RoutingPoliciesFetcher routingPolicies;
    
    @JsonIgnore
    private SaaSApplicationTypesFetcher saaSApplicationTypes;
    
    @JsonIgnore
    private SharedNetworkResourcesFetcher sharedNetworkResources;
    
    @JsonIgnore
    private SiteInfosFetcher siteInfos;
    
    @JsonIgnore
    private StaticRoutesFetcher staticRoutes;
    
    @JsonIgnore
    private StatsCollectorInfosFetcher statsCollectorInfos;
    
    @JsonIgnore
    private SubnetsFetcher subnets;
    
    @JsonIgnore
    private SystemConfigsFetcher systemConfigs;
    
    @JsonIgnore
    private TCAsFetcher tCAs;
    
    @JsonIgnore
    private TestDefinitionsFetcher testDefinitions;
    
    @JsonIgnore
    private UnderlaysFetcher underlays;
    
    @JsonIgnore
    private UplinkRDsFetcher uplinkRDs;
    
    @JsonIgnore
    private UsersFetcher users;
    
    @JsonIgnore
    private UserContextsFetcher userContexts;
    
    @JsonIgnore
    private VCentersFetcher vCenters;
    
    @JsonIgnore
    private VCenterHypervisorsFetcher vCenterHypervisors;
    
    @JsonIgnore
    private VirtualFirewallPoliciesFetcher virtualFirewallPolicies;
    
    @JsonIgnore
    private VirtualFirewallRulesFetcher virtualFirewallRules;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VMInterfacesFetcher vMInterfaces;
    
    @JsonIgnore
    private VNFCatalogsFetcher vNFCatalogs;
    
    @JsonIgnore
    private VNFMetadatasFetcher vNFMetadatas;
    
    @JsonIgnore
    private VNFThresholdPoliciesFetcher vNFThresholdPolicies;
    
    @JsonIgnore
    private VRSsFetcher vRSs;
    
    @JsonIgnore
    private VCenterVRSConfigsFetcher vCenterVRSConfigs;
    
    @JsonIgnore
    private vrsInfosFetcher vrsInfos;
    
    @JsonIgnore
    private VSDConfigsFetcher vSDConfigs;
    
    @JsonIgnore
    private VSPsFetcher vSPs;
    
    @JsonIgnore
    private ZFBAutoAssignmentsFetcher zFBAutoAssignments;
    
    @JsonIgnore
    private ZFBRequestsFetcher zFBRequests;
    
    @JsonIgnore
    private ZonesFetcher zones;
    
    @VsoConstructor
    public Me() {
        allGateways = new AllGatewaysFetcher(this);
        
        allRedundancyGroups = new AllRedundancyGroupsFetcher(this);
        
        applications = new ApplicationsFetcher(this);
        
        applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
        
        autoDiscoveredGateways = new AutoDiscoveredGatewaysFetcher(this);
        
        bGPNeighbors = new BGPNeighborsFetcher(this);
        
        bGPProfiles = new BGPProfilesFetcher(this);
        
        certificates = new CertificatesFetcher(this);
        
        cloudMgmtSystems = new CloudMgmtSystemsFetcher(this);
        
        commands = new CommandsFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        cOSRemarkingPolicyTables = new COSRemarkingPolicyTablesFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        dSCPRemarkingPolicyTables = new DSCPRemarkingPolicyTablesFetcher(this);
        
        dUCGroups = new DUCGroupsFetcher(this);
        
        vCenterEAMConfigs = new VCenterEAMConfigsFetcher(this);
        
        egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
        
        egressACLTemplates = new EgressACLTemplatesFetcher(this);
        
        egressAdvFwdEntryTemplates = new EgressAdvFwdEntryTemplatesFetcher(this);
        
        domainFIPAclTemplates = new DomainFIPAclTemplatesFetcher(this);
        
        egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
        
        enterprises = new EnterprisesFetcher(this);
        
        enterpriseProfiles = new EnterpriseProfilesFetcher(this);
        
        esIlmPolicies = new EsIlmPoliciesFetcher(this);
        
        esIndexConfigs = new EsIndexConfigsFetcher(this);
        
        ethernetSegmentGWGroups = new EthernetSegmentGWGroupsFetcher(this);
        
        floatingIps = new FloatingIpsFetcher(this);
        
        gateways = new GatewaysFetcher(this);
        
        gatewayTemplates = new GatewayTemplatesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        hostInterfaces = new HostInterfacesFetcher(this);
        
        infrastructureAccessProfiles = new InfrastructureAccessProfilesFetcher(this);
        
        infrastructureEVDFProfiles = new InfrastructureEVDFProfilesFetcher(this);
        
        infrastructureGatewayProfiles = new InfrastructureGatewayProfilesFetcher(this);
        
        infrastructureVscProfiles = new InfrastructureVscProfilesFetcher(this);
        
        ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
        
        ingressACLTemplates = new IngressACLTemplatesFetcher(this);
        
        ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
        
        ingressQOSPolicies = new IngressQOSPoliciesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        keyServerMembers = new KeyServerMembersFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        l4Services = new L4ServicesFetcher(this);
        
        l7applicationsignatures = new L7applicationsignaturesFetcher(this);
        
        licenses = new LicensesFetcher(this);
        
        licenseStatus = new LicenseStatusFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        mirrorDestinations = new MirrorDestinationsFetcher(this);
        
        multiCastChannelMaps = new MultiCastChannelMapsFetcher(this);
        
        netconfGlobalConfigurations = new NetconfGlobalConfigurationsFetcher(this);
        
        netconfProfiles = new NetconfProfilesFetcher(this);
        
        networkLayouts = new NetworkLayoutsFetcher(this);
        
        networkPerformanceMeasurements = new NetworkPerformanceMeasurementsFetcher(this);
        
        nSGateways = new NSGatewaysFetcher(this);
        
        nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
        
        nSGGroups = new NSGGroupsFetcher(this);
        
        nSGInfos = new NSGInfosFetcher(this);
        
        nSGMigrationProfiles = new NSGMigrationProfilesFetcher(this);
        
        nSGPatchProfiles = new NSGPatchProfilesFetcher(this);
        
        nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
        
        nSGUpgradeProfiles = new NSGUpgradeProfilesFetcher(this);
        
        overlayMirrorDestinations = new OverlayMirrorDestinationsFetcher(this);
        
        pATMappers = new PATMappersFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        performanceMonitors = new PerformanceMonitorsFetcher(this);
        
        policyGroups = new PolicyGroupsFetcher(this);
        
        policyObjectGroups = new PolicyObjectGroupsFetcher(this);
        
        qOSs = new QOSsFetcher(this);
        
        qosPolicers = new QosPolicersFetcher(this);
        
        rateLimiters = new RateLimitersFetcher(this);
        
        redirectionTargets = new RedirectionTargetsFetcher(this);
        
        redundancyGroups = new RedundancyGroupsFetcher(this);
        
        remoteVrsInfos = new RemoteVrsInfosFetcher(this);
        
        roles = new RolesFetcher(this);
        
        routingPolicies = new RoutingPoliciesFetcher(this);
        
        saaSApplicationTypes = new SaaSApplicationTypesFetcher(this);
        
        sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
        
        siteInfos = new SiteInfosFetcher(this);
        
        staticRoutes = new StaticRoutesFetcher(this);
        
        statsCollectorInfos = new StatsCollectorInfosFetcher(this);
        
        subnets = new SubnetsFetcher(this);
        
        systemConfigs = new SystemConfigsFetcher(this);
        
        tCAs = new TCAsFetcher(this);
        
        testDefinitions = new TestDefinitionsFetcher(this);
        
        underlays = new UnderlaysFetcher(this);
        
        uplinkRDs = new UplinkRDsFetcher(this);
        
        users = new UsersFetcher(this);
        
        userContexts = new UserContextsFetcher(this);
        
        vCenters = new VCentersFetcher(this);
        
        vCenterHypervisors = new VCenterHypervisorsFetcher(this);
        
        virtualFirewallPolicies = new VirtualFirewallPoliciesFetcher(this);
        
        virtualFirewallRules = new VirtualFirewallRulesFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vMInterfaces = new VMInterfacesFetcher(this);
        
        vNFCatalogs = new VNFCatalogsFetcher(this);
        
        vNFMetadatas = new VNFMetadatasFetcher(this);
        
        vNFThresholdPolicies = new VNFThresholdPoliciesFetcher(this);
        
        vRSs = new VRSsFetcher(this);
        
        vCenterVRSConfigs = new VCenterVRSConfigsFetcher(this);
        
        vrsInfos = new vrsInfosFetcher(this);
        
        vSDConfigs = new VSDConfigsFetcher(this);
        
        vSPs = new VSPsFetcher(this);
        
        zFBAutoAssignments = new ZFBAutoAssignmentsFetcher(this);
        
        zFBRequests = new ZFBRequestsFetcher(this);
        
        zones = new ZonesFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "Name", readOnly = false)
    public String getName() {
        return "Me";
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
    @VsoProperty(displayName = "ApiKey", readOnly = false)
    public String getApiKey() {
        return super.getApiKey();
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AARFlowStatsInterval", readOnly = false)   
    public Long getAARFlowStatsInterval() {
       return AARFlowStatsInterval;
    }

    @JsonIgnore
    public void setAARFlowStatsInterval(Long value) { 
        this.AARFlowStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AARProbeStatsInterval", readOnly = false)   
    public Long getAARProbeStatsInterval() {
       return AARProbeStatsInterval;
    }

    @JsonIgnore
    public void setAARProbeStatsInterval(Long value) { 
        this.AARProbeStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "APIKeyExpiry", readOnly = false)   
    public Long getAPIKeyExpiry() {
       return APIKeyExpiry;
    }

    @JsonIgnore
    public void setAPIKeyExpiry(Long value) { 
        this.APIKeyExpiry = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSSStatsInterval", readOnly = false)   
    public Long getVSSStatsInterval() {
       return VSSStatsInterval;
    }

    @JsonIgnore
    public void setVSSStatsInterval(Long value) { 
        this.VSSStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AvatarData", readOnly = false)   
    public String getAvatarData() {
       return avatarData;
    }

    @JsonIgnore
    public void setAvatarData(String value) { 
        this.avatarData = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AvatarType", readOnly = false)   
    public MeAvatarType getAvatarType() {
       return avatarType;
    }

    @JsonIgnore
    public void setAvatarType(MeAvatarType value) { 
        this.avatarType = value;
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
    @VsoProperty(displayName = "Disabled", readOnly = false)   
    public Boolean getDisabled() {
       return disabled;
    }

    @JsonIgnore
    public void setDisabled(Boolean value) { 
        this.disabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ElasticSearchAddress", readOnly = false)   
    public String getElasticSearchAddress() {
       return elasticSearchAddress;
    }

    @JsonIgnore
    public void setElasticSearchAddress(String value) { 
        this.elasticSearchAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Email", readOnly = false)   
    public String getEmail() {
       return email;
    }

    @JsonIgnore
    public void setEmail(String value) { 
        this.email = value;
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
    public MeEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(MeEntityScope value) { 
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
    @VsoProperty(displayName = "FirstName", readOnly = false)   
    public String getFirstName() {
       return firstName;
    }

    @JsonIgnore
    public void setFirstName(String value) { 
        this.firstName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FlowCollectionEnabled", readOnly = false)   
    public Boolean getFlowCollectionEnabled() {
       return flowCollectionEnabled;
    }

    @JsonIgnore
    public void setFlowCollectionEnabled(Boolean value) { 
        this.flowCollectionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastName", readOnly = false)   
    public String getLastName() {
       return lastName;
    }

    @JsonIgnore
    public void setLastName(String value) { 
        this.lastName = value;
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
    @VsoProperty(displayName = "MobileNumber", readOnly = false)   
    public String getMobileNumber() {
       return mobileNumber;
    }

    @JsonIgnore
    public void setMobileNumber(String value) { 
        this.mobileNumber = value;
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
    @VsoProperty(displayName = "Password", readOnly = false)   
    public String getPassword() {
       return password;
    }

    @JsonIgnore
    public void setPassword(String value) { 
        this.password = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Role", readOnly = false)   
    public String getRole() {
       return role;
    }

    @JsonIgnore
    public void setRole(String value) { 
        this.role = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatisticsEnabled", readOnly = false)   
    public Boolean getStatisticsEnabled() {
       return statisticsEnabled;
    }

    @JsonIgnore
    public void setStatisticsEnabled(Boolean value) { 
        this.statisticsEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserName", readOnly = false)   
    public String getUserName() {
       return userName;
    }

    @JsonIgnore
    public void setUserName(String value) { 
        this.userName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllGateways", readOnly = true)   
    public AllGatewaysFetcher getAllGateways() {
        return allGateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllRedundancyGroups", readOnly = true)   
    public AllRedundancyGroupsFetcher getAllRedundancyGroups() {
        return allRedundancyGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Applications", readOnly = true)   
    public ApplicationsFetcher getApplications() {
        return applications;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Applicationperformancemanagements", readOnly = true)   
    public ApplicationperformancemanagementsFetcher getApplicationperformancemanagements() {
        return applicationperformancemanagements;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AutoDiscoveredGateways", readOnly = true)   
    public AutoDiscoveredGatewaysFetcher getAutoDiscoveredGateways() {
        return autoDiscoveredGateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPNeighbors", readOnly = true)   
    public BGPNeighborsFetcher getBGPNeighbors() {
        return bGPNeighbors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPProfiles", readOnly = true)   
    public BGPProfilesFetcher getBGPProfiles() {
        return bGPProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Certificates", readOnly = true)   
    public CertificatesFetcher getCertificates() {
        return certificates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CloudMgmtSystems", readOnly = true)   
    public CloudMgmtSystemsFetcher getCloudMgmtSystems() {
        return cloudMgmtSystems;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Commands", readOnly = true)   
    public CommandsFetcher getCommands() {
        return commands;
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
    @VsoProperty(displayName = "COSRemarkingPolicyTables", readOnly = true)   
    public COSRemarkingPolicyTablesFetcher getCOSRemarkingPolicyTables() {
        return cOSRemarkingPolicyTables;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Domains", readOnly = true)   
    public DomainsFetcher getDomains() {
        return domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DSCPRemarkingPolicyTables", readOnly = true)   
    public DSCPRemarkingPolicyTablesFetcher getDSCPRemarkingPolicyTables() {
        return dSCPRemarkingPolicyTables;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DUCGroups", readOnly = true)   
    public DUCGroupsFetcher getDUCGroups() {
        return dUCGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenterEAMConfigs", readOnly = true)   
    public VCenterEAMConfigsFetcher getVCenterEAMConfigs() {
        return vCenterEAMConfigs;
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
    @VsoProperty(displayName = "EgressAdvFwdEntryTemplates", readOnly = true)   
    public EgressAdvFwdEntryTemplatesFetcher getEgressAdvFwdEntryTemplates() {
        return egressAdvFwdEntryTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainFIPAclTemplates", readOnly = true)   
    public DomainFIPAclTemplatesFetcher getDomainFIPAclTemplates() {
        return domainFIPAclTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressQOSPolicies", readOnly = true)   
    public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
        return egressQOSPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Enterprises", readOnly = true)   
    public EnterprisesFetcher getEnterprises() {
        return enterprises;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseProfiles", readOnly = true)   
    public EnterpriseProfilesFetcher getEnterpriseProfiles() {
        return enterpriseProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EsIlmPolicies", readOnly = true)   
    public EsIlmPoliciesFetcher getEsIlmPolicies() {
        return esIlmPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EsIndexConfigs", readOnly = true)   
    public EsIndexConfigsFetcher getEsIndexConfigs() {
        return esIndexConfigs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EthernetSegmentGWGroups", readOnly = true)   
    public EthernetSegmentGWGroupsFetcher getEthernetSegmentGWGroups() {
        return ethernetSegmentGWGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FloatingIps", readOnly = true)   
    public FloatingIpsFetcher getFloatingIps() {
        return floatingIps;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Gateways", readOnly = true)   
    public GatewaysFetcher getGateways() {
        return gateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayTemplates", readOnly = true)   
    public GatewayTemplatesFetcher getGatewayTemplates() {
        return gatewayTemplates;
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
    @VsoProperty(displayName = "InfrastructureAccessProfiles", readOnly = true)   
    public InfrastructureAccessProfilesFetcher getInfrastructureAccessProfiles() {
        return infrastructureAccessProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfrastructureEVDFProfiles", readOnly = true)   
    public InfrastructureEVDFProfilesFetcher getInfrastructureEVDFProfiles() {
        return infrastructureEVDFProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfrastructureGatewayProfiles", readOnly = true)   
    public InfrastructureGatewayProfilesFetcher getInfrastructureGatewayProfiles() {
        return infrastructureGatewayProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfrastructureVscProfiles", readOnly = true)   
    public InfrastructureVscProfilesFetcher getInfrastructureVscProfiles() {
        return infrastructureVscProfiles;
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
    @VsoProperty(displayName = "IngressAdvFwdEntryTemplates", readOnly = true)   
    public IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplates() {
        return ingressAdvFwdEntryTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressQOSPolicies", readOnly = true)   
    public IngressQOSPoliciesFetcher getIngressQOSPolicies() {
        return ingressQOSPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerMembers", readOnly = true)   
    public KeyServerMembersFetcher getKeyServerMembers() {
        return keyServerMembers;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2Domains", readOnly = true)   
    public L2DomainsFetcher getL2Domains() {
        return l2Domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L4Services", readOnly = true)   
    public L4ServicesFetcher getL4Services() {
        return l4Services;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L7applicationsignatures", readOnly = true)   
    public L7applicationsignaturesFetcher getL7applicationsignatures() {
        return l7applicationsignatures;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Licenses", readOnly = true)   
    public LicensesFetcher getLicenses() {
        return licenses;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LicenseStatus", readOnly = true)   
    public LicenseStatusFetcher getLicenseStatus() {
        return licenseStatus;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MirrorDestinations", readOnly = true)   
    public MirrorDestinationsFetcher getMirrorDestinations() {
        return mirrorDestinations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MultiCastChannelMaps", readOnly = true)   
    public MultiCastChannelMapsFetcher getMultiCastChannelMaps() {
        return multiCastChannelMaps;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetconfGlobalConfigurations", readOnly = true)   
    public NetconfGlobalConfigurationsFetcher getNetconfGlobalConfigurations() {
        return netconfGlobalConfigurations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetconfProfiles", readOnly = true)   
    public NetconfProfilesFetcher getNetconfProfiles() {
        return netconfProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkLayouts", readOnly = true)   
    public NetworkLayoutsFetcher getNetworkLayouts() {
        return networkLayouts;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkPerformanceMeasurements", readOnly = true)   
    public NetworkPerformanceMeasurementsFetcher getNetworkPerformanceMeasurements() {
        return networkPerformanceMeasurements;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGateways", readOnly = true)   
    public NSGatewaysFetcher getNSGateways() {
        return nSGateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGatewayTemplates", readOnly = true)   
    public NSGatewayTemplatesFetcher getNSGatewayTemplates() {
        return nSGatewayTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGGroups", readOnly = true)   
    public NSGGroupsFetcher getNSGGroups() {
        return nSGGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGInfos", readOnly = true)   
    public NSGInfosFetcher getNSGInfos() {
        return nSGInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGMigrationProfiles", readOnly = true)   
    public NSGMigrationProfilesFetcher getNSGMigrationProfiles() {
        return nSGMigrationProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGPatchProfiles", readOnly = true)   
    public NSGPatchProfilesFetcher getNSGPatchProfiles() {
        return nSGPatchProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSRedundantGatewayGroups", readOnly = true)   
    public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
        return nSRedundantGatewayGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGUpgradeProfiles", readOnly = true)   
    public NSGUpgradeProfilesFetcher getNSGUpgradeProfiles() {
        return nSGUpgradeProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OverlayMirrorDestinations", readOnly = true)   
    public OverlayMirrorDestinationsFetcher getOverlayMirrorDestinations() {
        return overlayMirrorDestinations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATMappers", readOnly = true)   
    public PATMappersFetcher getPATMappers() {
        return pATMappers;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATNATPools", readOnly = true)   
    public PATNATPoolsFetcher getPATNATPools() {
        return pATNATPools;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PerformanceMonitors", readOnly = true)   
    public PerformanceMonitorsFetcher getPerformanceMonitors() {
        return performanceMonitors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroups", readOnly = true)   
    public PolicyGroupsFetcher getPolicyGroups() {
        return policyGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyObjectGroups", readOnly = true)   
    public PolicyObjectGroupsFetcher getPolicyObjectGroups() {
        return policyObjectGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "QOSs", readOnly = true)   
    public QOSsFetcher getQOSs() {
        return qOSs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "QosPolicers", readOnly = true)   
    public QosPolicersFetcher getQosPolicers() {
        return qosPolicers;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RateLimiters", readOnly = true)   
    public RateLimitersFetcher getRateLimiters() {
        return rateLimiters;
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
    @VsoProperty(displayName = "RemoteVrsInfos", readOnly = true)   
    public RemoteVrsInfosFetcher getRemoteVrsInfos() {
        return remoteVrsInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Roles", readOnly = true)   
    public RolesFetcher getRoles() {
        return roles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RoutingPolicies", readOnly = true)   
    public RoutingPoliciesFetcher getRoutingPolicies() {
        return routingPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SaaSApplicationTypes", readOnly = true)   
    public SaaSApplicationTypesFetcher getSaaSApplicationTypes() {
        return saaSApplicationTypes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SharedNetworkResources", readOnly = true)   
    public SharedNetworkResourcesFetcher getSharedNetworkResources() {
        return sharedNetworkResources;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SiteInfos", readOnly = true)   
    public SiteInfosFetcher getSiteInfos() {
        return siteInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRoutes", readOnly = true)   
    public StaticRoutesFetcher getStaticRoutes() {
        return staticRoutes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsCollectorInfos", readOnly = true)   
    public StatsCollectorInfosFetcher getStatsCollectorInfos() {
        return statsCollectorInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Subnets", readOnly = true)   
    public SubnetsFetcher getSubnets() {
        return subnets;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemConfigs", readOnly = true)   
    public SystemConfigsFetcher getSystemConfigs() {
        return systemConfigs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TCAs", readOnly = true)   
    public TCAsFetcher getTCAs() {
        return tCAs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestDefinitions", readOnly = true)   
    public TestDefinitionsFetcher getTestDefinitions() {
        return testDefinitions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Underlays", readOnly = true)   
    public UnderlaysFetcher getUnderlays() {
        return underlays;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkRDs", readOnly = true)   
    public UplinkRDsFetcher getUplinkRDs() {
        return uplinkRDs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Users", readOnly = true)   
    public UsersFetcher getUsers() {
        return users;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserContexts", readOnly = true)   
    public UserContextsFetcher getUserContexts() {
        return userContexts;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenters", readOnly = true)   
    public VCentersFetcher getVCenters() {
        return vCenters;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenterHypervisors", readOnly = true)   
    public VCenterHypervisorsFetcher getVCenterHypervisors() {
        return vCenterHypervisors;
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
    @VsoProperty(displayName = "VNFCatalogs", readOnly = true)   
    public VNFCatalogsFetcher getVNFCatalogs() {
        return vNFCatalogs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFMetadatas", readOnly = true)   
    public VNFMetadatasFetcher getVNFMetadatas() {
        return vNFMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFThresholdPolicies", readOnly = true)   
    public VNFThresholdPoliciesFetcher getVNFThresholdPolicies() {
        return vNFThresholdPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSs", readOnly = true)   
    public VRSsFetcher getVRSs() {
        return vRSs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VCenterVRSConfigs", readOnly = true)   
    public VCenterVRSConfigsFetcher getVCenterVRSConfigs() {
        return vCenterVRSConfigs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "vrsInfos", readOnly = true)   
    public vrsInfosFetcher getvrsInfos() {
        return vrsInfos;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSDConfigs", readOnly = true)   
    public VSDConfigsFetcher getVSDConfigs() {
        return vSDConfigs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSPs", readOnly = true)   
    public VSPsFetcher getVSPs() {
        return vSPs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBAutoAssignments", readOnly = true)   
    public ZFBAutoAssignmentsFetcher getZFBAutoAssignments() {
        return zFBAutoAssignments;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBRequests", readOnly = true)   
    public ZFBRequestsFetcher getZFBRequests() {
        return zFBRequests;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.ME, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ME, getId());
        }
    }
    @VsoMethod
    public void assignEsIlmPolicies(Session session, EsIlmPolicy[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ME, getId());
        }
    }
    
    @VsoMethod
    public void assignEsIndexConfigs(Session session, EsIndexConfig[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ME, getId());
        }
    }
    
    @VsoMethod
    public void assignTestDefinitions(Session session, TestDefinition[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ME, getId());
        }
    }
    
    @VsoMethod
    public void createAllRedundancyGroup(Session session, AllRedundancyGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ALLREDUNDANCYGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createCertificate(Session session, Certificate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CERTIFICATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createCloudMgmtSystem(Session session, CloudMgmtSystem childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CLOUDMGMTSYSTEMS_FETCHER, getId());
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
    public void createContainer(Session session, Container childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CONTAINERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createCOSRemarkingPolicyTable(Session session, COSRemarkingPolicyTable childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.COSREMARKINGPOLICYTABLES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDSCPRemarkingPolicyTable(Session session, DSCPRemarkingPolicyTable childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DSCPREMARKINGPOLICYTABLES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDUCGroup(Session session, DUCGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DUCGROUPS_FETCHER, getId());
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
    public void createEgressQOSPolicy(Session session, EgressQOSPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSQOSPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEnterprise(Session session, Enterprise childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEnterpriseProfile(Session session, EnterpriseProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISEPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEsIlmPolicy(Session session, EsIlmPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ESILMPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEthernetSegmentGWGroup(Session session, EthernetSegmentGWGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ETHERNETSEGMENTGWGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createGateway(Session session, Gateway childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GATEWAYS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateGateway(Session session, Gateway childRestObj, GatewayTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GATEWAYS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createGatewayTemplate(Session session, GatewayTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GATEWAYTEMPLATES_FETCHER, getId());
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
    public void createInfrastructureAccessProfile(Session session, InfrastructureAccessProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createInfrastructureEVDFProfile(Session session, InfrastructureEVDFProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createInfrastructureGatewayProfile(Session session, InfrastructureGatewayProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createInfrastructureVscProfile(Session session, InfrastructureVscProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressQOSPolicy(Session session, IngressQOSPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSQOSPOLICIES_FETCHER, getId());
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
    public void createKeyServerMember(Session session, KeyServerMember childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.KEYSERVERMEMBERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createL4Service(Session session, L4Service childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.L4SERVICES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createLicense(Session session, License childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.LICENSES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createMirrorDestination(Session session, MirrorDestination childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.MIRRORDESTINATIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createMultiCastChannelMap(Session session, MultiCastChannelMap childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.MULTICASTCHANNELMAPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNetconfGlobalConfiguration(Session session, NetconfGlobalConfiguration childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETCONFGLOBALCONFIGURATIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNetconfProfile(Session session, NetconfProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETCONFPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSGateway(Session session, NSGateway childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGATEWAYS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateNSGateway(Session session, NSGateway childRestObj, NSGatewayTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGATEWAYS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createNSGatewayTemplate(Session session, NSGatewayTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGATEWAYTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSGGroup(Session session, NSGGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSGMigrationProfile(Session session, NSGMigrationProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGMIGRATIONPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSGPatchProfile(Session session, NSGPatchProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGPATCHPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSRedundantGatewayGroup(Session session, NSRedundantGatewayGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNSGUpgradeProfile(Session session, NSGUpgradeProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGUPGRADEPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPATMapper(Session session, PATMapper childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PATMAPPERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPATNATPool(Session session, PATNATPool childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PATNATPOOLS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPerformanceMonitor(Session session, PerformanceMonitor childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERFORMANCEMONITORS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createQosPolicer(Session session, QosPolicer childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.QOSPOLICERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createRateLimiter(Session session, RateLimiter childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.RATELIMITERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createRedundancyGroup(Session session, RedundancyGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.REDUNDANCYGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createRemoteVrsInfo(Session session, RemoteVrsInfo childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.REMOTEVRSINFOS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createRole(Session session, Role childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ROLES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSharedNetworkResource(Session session, SharedNetworkResource childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SHAREDNETWORKRESOURCES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSiteInfo(Session session, SiteInfo childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SITEINFOS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createTestDefinition(Session session, TestDefinition childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.TESTDEFINITIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createUnderlay(Session session, Underlay childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.UNDERLAYS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createUser(Session session, User childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.USERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVCenter(Session session, VCenter childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VCENTERS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVM(Session session, VM childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VMS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVNFMetadata(Session session, VNFMetadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VNFMETADATAS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVNFThresholdPolicy(Session session, VNFThresholdPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VNFTHRESHOLDPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createZFBAutoAssignment(Session session, ZFBAutoAssignment childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ZFBAUTOASSIGNMENTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createZFBRequest(Session session, ZFBRequest childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ZFBREQUESTS_FETCHER, getId());
        }
    }public String toString() {
        return "Me [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", APIKeyExpiry=" + APIKeyExpiry + ", VSSStatsInterval=" + VSSStatsInterval + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", creationDate=" + creationDate + ", disabled=" + disabled + ", elasticSearchAddress=" + elasticSearchAddress + ", email=" + email + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", firstName=" + firstName + ", flowCollectionEnabled=" + flowCollectionEnabled + ", lastName=" + lastName + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", mobileNumber=" + mobileNumber + ", owner=" + owner + ", password=" + password + ", role=" + role + ", statisticsEnabled=" + statisticsEnabled + ", userName=" + userName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + ", apiKey=" + apiKey  + "]";
    }
}