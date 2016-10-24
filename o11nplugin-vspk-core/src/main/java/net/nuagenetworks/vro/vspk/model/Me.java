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
import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AutoDiscoveredGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPNeighborsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CertificatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CloudMgmtSystemsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCenterEAMConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainFIPAclTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FloatingIPACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressQOSPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterpriseProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ExternalAppServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ExternalServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FloatingIpsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.HostInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureGatewayProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureVscProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAdvFwdEntryTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMembersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LicensesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LicenseStatusFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadataTagsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MirrorDestinationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiCastChannelMapsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkLayoutsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSRedundantGatewayGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATMappersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RateLimitersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedundancyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RoutingPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SharedNetworkResourcesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SiteInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StaticRoutesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatsCollectorInfosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SystemConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UplinkRDsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UsersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCentersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCenterHypervisorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VCenterVRSConfigsFetcher;

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
        @VsoRelation(inventoryChildren = true, name = Constants.APPLICATIONSERVICES_FETCHER, type = Constants.APPLICATIONSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CLOUDMGMTSYSTEMS_FETCHER, type = Constants.CLOUDMGMTSYSTEMS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CONTAINERS_FETCHER, type = Constants.CONTAINERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINFIPACLTEMPLATES_FETCHER, type = Constants.DOMAINFIPACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.FLOATINGIPACLTEMPLATES_FETCHER, type = Constants.FLOATINGIPACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSQOSPOLICIES_FETCHER, type = Constants.EGRESSQOSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISES_FETCHER, type = Constants.ENTERPRISES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPROFILES_FETCHER, type = Constants.ENTERPRISEPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EXTERNALAPPSERVICES_FETCHER, type = Constants.EXTERNALAPPSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EXTERNALSERVICES_FETCHER, type = Constants.EXTERNALSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYS_FETCHER, type = Constants.GATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYTEMPLATES_FETCHER, type = Constants.GATEWAYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GLOBALMETADATAS_FETCHER, type = Constants.GLOBALMETADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, type = Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, type = Constants.INFRASTRUCTUREVSCPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.KEYSERVERMEMBERS_FETCHER, type = Constants.KEYSERVERMEMBERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.LICENSES_FETCHER, type = Constants.LICENSES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATATAGS_FETCHER, type = Constants.METADATATAGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.MIRRORDESTINATIONS_FETCHER, type = Constants.MIRRORDESTINATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.MULTICASTCHANNELMAPS_FETCHER, type = Constants.MULTICASTCHANNELMAPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGATEWAYTEMPLATES_FETCHER, type = Constants.NSGATEWAYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PATMAPPERS_FETCHER, type = Constants.PATMAPPERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PATNATPOOLS_FETCHER, type = Constants.PATNATPOOLS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.RATELIMITERS_FETCHER, type = Constants.RATELIMITERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDUNDANCYGROUPS_FETCHER, type = Constants.REDUNDANCYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SHAREDNETWORKRESOURCES_FETCHER, type = Constants.SHAREDNETWORKRESOURCES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SITEINFOS_FETCHER, type = Constants.SITEINFOS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SYSTEMCONFIGS_FETCHER, type = Constants.SYSTEMCONFIGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VCENTERS_FETCHER, type = Constants.VCENTERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VMS_FETCHER, type = Constants.VMS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ZFBAUTOASSIGNMENTS_FETCHER, type = Constants.ZFBAUTOASSIGNMENTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ZFBREQUESTS_FETCHER, type = Constants.ZFBREQUESTS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "me", resourceName = "me")
public class Me extends BaseRootObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "avatarData")
    protected String avatarData;
    
    @JsonProperty(value = "avatarType")
    protected MeAvatarType avatarType;
    
    @JsonProperty(value = "disabled")
    protected Boolean disabled;
    
    @JsonProperty(value = "elasticSearchUIAddress")
    protected String elasticSearchUIAddress;
    
    @JsonProperty(value = "email")
    protected String email;
    
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
    
    @JsonProperty(value = "lastName")
    protected String lastName;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "mobileNumber")
    protected String mobileNumber;
    
    @JsonProperty(value = "password")
    protected String password;
    
    @JsonProperty(value = "role")
    protected String role;
    
    @JsonProperty(value = "userName")
    protected String userName;
    
    @JsonIgnore
    private ApplicationServicesFetcher applicationServices;
    
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
    private ContainersFetcher containers;
    
    @JsonIgnore
    private ContainerInterfacesFetcher containerInterfaces;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private VCenterEAMConfigsFetcher vCenterEAMConfigs;
    
    @JsonIgnore
    private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
    
    @JsonIgnore
    private EgressACLTemplatesFetcher egressACLTemplates;
    
    @JsonIgnore
    private DomainFIPAclTemplatesFetcher domainFIPAclTemplates;
    
    @JsonIgnore
    private FloatingIPACLTemplatesFetcher floatingIPACLTemplates;
    
    @JsonIgnore
    private EgressQOSPoliciesFetcher egressQOSPolicies;
    
    @JsonIgnore
    private EnterprisesFetcher enterprises;
    
    @JsonIgnore
    private EnterpriseProfilesFetcher enterpriseProfiles;
    
    @JsonIgnore
    private ExternalAppServicesFetcher externalAppServices;
    
    @JsonIgnore
    private ExternalServicesFetcher externalServices;
    
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
    private JobsFetcher jobs;
    
    @JsonIgnore
    private KeyServerMembersFetcher keyServerMembers;
    
    @JsonIgnore
    private L2DomainsFetcher l2Domains;
    
    @JsonIgnore
    private LicensesFetcher licenses;
    
    @JsonIgnore
    private LicenseStatusFetcher licenseStatus;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MetadataTagsFetcher metadataTags;
    
    @JsonIgnore
    private MirrorDestinationsFetcher mirrorDestinations;
    
    @JsonIgnore
    private MultiCastChannelMapsFetcher multiCastChannelMaps;
    
    @JsonIgnore
    private NetworkLayoutsFetcher networkLayouts;
    
    @JsonIgnore
    private NSGatewaysFetcher nSGateways;
    
    @JsonIgnore
    private NSGatewayTemplatesFetcher nSGatewayTemplates;
    
    @JsonIgnore
    private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
    
    @JsonIgnore
    private PATMappersFetcher pATMappers;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PolicyGroupsFetcher policyGroups;
    
    @JsonIgnore
    private RateLimitersFetcher rateLimiters;
    
    @JsonIgnore
    private RedirectionTargetsFetcher redirectionTargets;
    
    @JsonIgnore
    private RedundancyGroupsFetcher redundancyGroups;
    
    @JsonIgnore
    private RoutingPoliciesFetcher routingPolicies;
    
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
    private UplinkRDsFetcher uplinkRDs;
    
    @JsonIgnore
    private UsersFetcher users;
    
    @JsonIgnore
    private VCentersFetcher vCenters;
    
    @JsonIgnore
    private VCenterHypervisorsFetcher vCenterHypervisors;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VMInterfacesFetcher vMInterfaces;
    
    @JsonIgnore
    private VCenterVRSConfigsFetcher vCenterVRSConfigs;
    
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
        applicationServices = new ApplicationServicesFetcher(this);
        
        autoDiscoveredGateways = new AutoDiscoveredGatewaysFetcher(this);
        
        bGPNeighbors = new BGPNeighborsFetcher(this);
        
        bGPProfiles = new BGPProfilesFetcher(this);
        
        certificates = new CertificatesFetcher(this);
        
        cloudMgmtSystems = new CloudMgmtSystemsFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        vCenterEAMConfigs = new VCenterEAMConfigsFetcher(this);
        
        egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
        
        egressACLTemplates = new EgressACLTemplatesFetcher(this);
        
        domainFIPAclTemplates = new DomainFIPAclTemplatesFetcher(this);
        
        floatingIPACLTemplates = new FloatingIPACLTemplatesFetcher(this);
        
        egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
        
        enterprises = new EnterprisesFetcher(this);
        
        enterpriseProfiles = new EnterpriseProfilesFetcher(this);
        
        externalAppServices = new ExternalAppServicesFetcher(this);
        
        externalServices = new ExternalServicesFetcher(this);
        
        floatingIps = new FloatingIpsFetcher(this);
        
        gateways = new GatewaysFetcher(this);
        
        gatewayTemplates = new GatewayTemplatesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        hostInterfaces = new HostInterfacesFetcher(this);
        
        infrastructureGatewayProfiles = new InfrastructureGatewayProfilesFetcher(this);
        
        infrastructureVscProfiles = new InfrastructureVscProfilesFetcher(this);
        
        ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
        
        ingressACLTemplates = new IngressACLTemplatesFetcher(this);
        
        ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        keyServerMembers = new KeyServerMembersFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        licenses = new LicensesFetcher(this);
        
        licenseStatus = new LicenseStatusFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        metadataTags = new MetadataTagsFetcher(this);
        
        mirrorDestinations = new MirrorDestinationsFetcher(this);
        
        multiCastChannelMaps = new MultiCastChannelMapsFetcher(this);
        
        networkLayouts = new NetworkLayoutsFetcher(this);
        
        nSGateways = new NSGatewaysFetcher(this);
        
        nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
        
        nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
        
        pATMappers = new PATMappersFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        policyGroups = new PolicyGroupsFetcher(this);
        
        rateLimiters = new RateLimitersFetcher(this);
        
        redirectionTargets = new RedirectionTargetsFetcher(this);
        
        redundancyGroups = new RedundancyGroupsFetcher(this);
        
        routingPolicies = new RoutingPoliciesFetcher(this);
        
        sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
        
        siteInfos = new SiteInfosFetcher(this);
        
        staticRoutes = new StaticRoutesFetcher(this);
        
        statsCollectorInfos = new StatsCollectorInfosFetcher(this);
        
        subnets = new SubnetsFetcher(this);
        
        systemConfigs = new SystemConfigsFetcher(this);
        
        tCAs = new TCAsFetcher(this);
        
        uplinkRDs = new UplinkRDsFetcher(this);
        
        users = new UsersFetcher(this);
        
        vCenters = new VCentersFetcher(this);
        
        vCenterHypervisors = new VCenterHypervisorsFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vMInterfaces = new VMInterfacesFetcher(this);
        
        vCenterVRSConfigs = new VCenterVRSConfigsFetcher(this);
        
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
    @VsoProperty(displayName = "ApiKey", readOnly = false)
    public String getApiKey() {
        return super.getApiKey();
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
    @VsoProperty(displayName = "Disabled", readOnly = false)   
    public Boolean getDisabled() {
       return disabled;
    }

    @JsonIgnore
    public void setDisabled(Boolean value) { 
        this.disabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ElasticSearchUIAddress", readOnly = false)   
    public String getElasticSearchUIAddress() {
       return elasticSearchUIAddress;
    }

    @JsonIgnore
    public void setElasticSearchUIAddress(String value) { 
        this.elasticSearchUIAddress = value;
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
    @VsoProperty(displayName = "MobileNumber", readOnly = false)   
    public String getMobileNumber() {
       return mobileNumber;
    }

    @JsonIgnore
    public void setMobileNumber(String value) { 
        this.mobileNumber = value;
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
    @VsoProperty(displayName = "UserName", readOnly = false)   
    public String getUserName() {
       return userName;
    }

    @JsonIgnore
    public void setUserName(String value) { 
        this.userName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ApplicationServices", readOnly = true)   
    public ApplicationServicesFetcher getApplicationServices() {
        return applicationServices;
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
    @VsoProperty(displayName = "Domains", readOnly = true)   
    public DomainsFetcher getDomains() {
        return domains;
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
    @VsoProperty(displayName = "ExternalAppServices", readOnly = true)   
    public ExternalAppServicesFetcher getExternalAppServices() {
        return externalAppServices;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExternalServices", readOnly = true)   
    public ExternalServicesFetcher getExternalServices() {
        return externalServices;
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
    @VsoProperty(displayName = "MetadataTags", readOnly = true)   
    public MetadataTagsFetcher getMetadataTags() {
        return metadataTags;
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
    @VsoProperty(displayName = "NetworkLayouts", readOnly = true)   
    public NetworkLayoutsFetcher getNetworkLayouts() {
        return networkLayouts;
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
    @VsoProperty(displayName = "NSRedundantGatewayGroups", readOnly = true)   
    public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
        return nSRedundantGatewayGroups;
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
    @VsoProperty(displayName = "PolicyGroups", readOnly = true)   
    public PolicyGroupsFetcher getPolicyGroups() {
        return policyGroups;
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
    @VsoProperty(displayName = "RoutingPolicies", readOnly = true)   
    public RoutingPoliciesFetcher getRoutingPolicies() {
        return routingPolicies;
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
    @VsoProperty(displayName = "VCenterVRSConfigs", readOnly = true)   
    public VCenterVRSConfigsFetcher getVCenterVRSConfigs() {
        return vCenterVRSConfigs;
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
    public void createApplicationService(Session session, ApplicationService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.APPLICATIONSERVICES_FETCHER, getId());
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
    public void createContainer(Session session, Container childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CONTAINERS_FETCHER, getId());
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
    public void createExternalAppService(Session session, ExternalAppService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EXTERNALAPPSERVICES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createExternalService(Session session, ExternalService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EXTERNALSERVICES_FETCHER, getId());
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
    public void createLicense(Session session, License childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.LICENSES_FETCHER, getId());
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
    public void createMetadataTag(Session session, MetadataTag childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.METADATATAGS_FETCHER, getId());
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
    public void createNSGatewayTemplate(Session session, NSGatewayTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGATEWAYTEMPLATES_FETCHER, getId());
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
        return "Me [" + "avatarData=" + avatarData + ", avatarType=" + avatarType + ", disabled=" + disabled + ", elasticSearchUIAddress=" + elasticSearchUIAddress + ", email=" + email + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdatedBy=" + lastUpdatedBy + ", mobileNumber=" + mobileNumber + ", password=" + password + ", role=" + role + ", userName=" + userName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + ", apiKey=" + apiKey  + "]";
    }
}