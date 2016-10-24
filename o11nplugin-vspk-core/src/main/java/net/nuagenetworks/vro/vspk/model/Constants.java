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

import net.nuagenetworks.vro.model.BaseConstants;

public interface Constants extends BaseConstants {
    String PLUGIN_NAME = "VSPK";
    String PLUGIN_DESCRIPTION = "VSPK Plug-in for vRealize Orchestrator";
    String PLUGIN_ROOT = "VSPK";
    String PLUGIN_CONFIG_FILENAME = "vspk";
    
    
    String CONTAINERINTERFACE = "ContainerInterface";
    String CONTAINERINTERFACES = "ContainerInterfaces";
    String GROUPKEYENCRYPTIONPROFILE = "GroupKeyEncryptionProfile";
    String GROUPKEYENCRYPTIONPROFILES = "GroupKeyEncryptionProfiles";
    String BRCONNECTION = "BRConnection";
    String BRCONNECTIONS = "BRConnections";
    String QOS = "QOS";
    String QOSS = "QOSs";
    String INFRASTRUCTUREACCESSPROFILE = "Infrastructureaccessprofile";
    String INFRASTRUCTUREACCESSPROFILES = "Infrastructureaccessprofiles";
    String BGPPEER = "BGPPeer";
    String BGPPEERS = "BGPPeers";
    String SHAREDNETWORKRESOURCE = "SharedNetworkResource";
    String SHAREDNETWORKRESOURCES = "SharedNetworkResources";
    String VIRTUALIP = "VirtualIP";
    String VIRTUALIPS = "VirtualIPs";
    String DSCPFORWARDINGCLASSTABLE = "DSCPForwardingClassTable";
    String DSCPFORWARDINGCLASSTABLES = "DSCPForwardingClassTables";
    String MULTICASTCHANNELMAP = "MultiCastChannelMap";
    String MULTICASTCHANNELMAPS = "MultiCastChannelMaps";
    String REDUNDANCYGROUP = "RedundancyGroup";
    String REDUNDANCYGROUPS = "RedundancyGroups";
    String TCA = "TCA";
    String TCAS = "TCAs";
    String GROUP = "Group";
    String GROUPS = "Groups";
    String VSGREDUNDANTPORT = "VsgRedundantPort";
    String VSGREDUNDANTPORTS = "VsgRedundantPorts";
    String ZONE = "Zone";
    String ZONES = "Zones";
    String APPLICATION = "Application";
    String APPLICATIONS = "Applications";
    String IKEGATEWAYPROFILE = "IKEGatewayProfile";
    String IKEGATEWAYPROFILES = "IKEGatewayProfiles";
    String IKESUBNET = "IKESubnet";
    String IKESUBNETS = "IKESubnets";
    String INFRASTRUCTUREGATEWAYPROFILE = "InfrastructureGatewayProfile";
    String INFRASTRUCTUREGATEWAYPROFILES = "InfrastructureGatewayProfiles";
    String DISKSTAT = "DiskStat";
    String DISKSTATS = "DiskStats";
    String POLICYGROUPTEMPLATE = "PolicyGroupTemplate";
    String POLICYGROUPTEMPLATES = "PolicyGroupTemplates";
    String FLOWSECURITYPOLICY = "FlowSecurityPolicy";
    String FLOWSECURITYPOLICIES = "FlowSecurityPolicies";
    String VCENTEREAMCONFIG = "VCenterEAMConfig";
    String VCENTEREAMCONFIGS = "VCenterEAMConfigs";
    String LOCATION = "Location";
    String LOCATIONS = "Locations";
    String ENTERPRISESECURITY = "EnterpriseSecurity";
    String ENTERPRISESECURITIES = "EnterpriseSecurities";
    String VCENTERVRSCONFIG = "VCenterVRSConfig";
    String VCENTERVRSCONFIGS = "VCenterVRSConfigs";
    String ENTERPRISENETWORK = "EnterpriseNetwork";
    String ENTERPRISENETWORKS = "EnterpriseNetworks";
    String INFRASTRUCTUREVSCPROFILE = "InfrastructureVscProfile";
    String INFRASTRUCTUREVSCPROFILES = "InfrastructureVscProfiles";
    String PERMISSION = "Permission";
    String PERMISSIONS = "Permissions";
    String IPRESERVATION = "IPReservation";
    String IPRESERVATIONS = "IPReservations";
    String REDIRECTIONTARGETTEMPLATE = "RedirectionTargetTemplate";
    String REDIRECTIONTARGETTEMPLATES = "RedirectionTargetTemplates";
    String SUBNETTEMPLATE = "SubnetTemplate";
    String SUBNETTEMPLATES = "SubnetTemplates";
    String METADATATAG = "MetadataTag";
    String METADATATAGS = "MetadataTags";
    String FLOATINGIPACLTEMPLATE = "FloatingIPACLTemplate";
    String FLOATINGIPACLTEMPLATES = "FloatingIPACLTemplates";
    String IKEGATEWAYCONNECTION = "IKEGatewayConnection";
    String IKEGATEWAYCONNECTIONS = "IKEGatewayConnections";
    String REDIRECTIONTARGET = "RedirectionTarget";
    String REDIRECTIONTARGETS = "RedirectionTargets";
    String PATIPENTRY = "PATIPEntry";
    String PATIPENTRIES = "PATIPEntries";
    String AGGREGATEMETADATA = "AggregateMetadata";
    String AGGREGATEMETADATAS = "AggregateMetadatas";
    String EGRESSACLENTRYTEMPLATE = "EgressACLEntryTemplate";
    String EGRESSACLENTRYTEMPLATES = "EgressACLEntryTemplates";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY = "IngressExternalServiceTemplateEntry";
    String INGRESSEXTERNALSERVICETEMPLATEENTRIES = "IngressExternalServiceTemplateEntries";
    String AVATAR = "Avatar";
    String AVATARS = "Avatars";
    String OVERLAYADDRESSPOOL = "OverlayAddressPool";
    String OVERLAYADDRESSPOOLS = "OverlayAddressPools";
    String BOOTSTRAPACTIVATION = "BootstrapActivation";
    String BOOTSTRAPACTIVATIONS = "BootstrapActivations";
    String LICENSESTATUS = "LicenseStatus";
    
    String METADATA = "Metadata";
    String METADATAS = "Metadatas";
    String CLOUDMGMTSYSTEM = "CloudMgmtSystem";
    String CLOUDMGMTSYSTEMS = "CloudMgmtSystems";
    String VSP = "VSP";
    String VSPS = "VSPs";
    String DOMAIN = "Domain";
    String DOMAINS = "Domains";
    String REDUNDANTPORT = "RedundantPort";
    String REDUNDANTPORTS = "RedundantPorts";
    String DSCPFORWARDINGCLASSMAPPING = "DSCPForwardingClassMapping";
    String DSCPFORWARDINGCLASSMAPPINGS = "DSCPForwardingClassMappings";
    String NETWORKLAYOUT = "NetworkLayout";
    String NETWORKLAYOUTS = "NetworkLayouts";
    String OVERLAYPATNATENTRY = "OverlayPATNATEntry";
    String OVERLAYPATNATENTRIES = "OverlayPATNATEntries";
    String WANSERVICE = "WANService";
    String WANSERVICES = "WANServices";
    String VSD = "VSD";
    String VSDS = "VSDs";
    String VPORT = "VPort";
    String VPORTS = "VPorts";
    String FLOWFORWARDINGPOLICY = "FlowForwardingPolicy";
    String FLOWFORWARDINGPOLICIES = "FlowForwardingPolicies";
    String PORT = "Port";
    String PORTS = "Ports";
    String STATISTICSPOLICY = "StatisticsPolicy";
    String STATISTICSPOLICIES = "StatisticsPolicies";
    String SUBNET = "Subnet";
    String SUBNETS = "Subnets";
    String CONTAINER = "Container";
    String CONTAINERS = "Containers";
    String RATELIMITER = "RateLimiter";
    String RATELIMITERS = "RateLimiters";
    String KEYSERVERMONITORENCRYPTEDSEED = "KeyServerMonitorEncryptedSeed";
    String KEYSERVERMONITORENCRYPTEDSEEDS = "KeyServerMonitorEncryptedSeeds";
    String ZONETEMPLATE = "ZoneTemplate";
    String ZONETEMPLATES = "ZoneTemplates";
    String KEYSERVERMONITORSEED = "KeyServerMonitorSeed";
    String KEYSERVERMONITORSEEDS = "KeyServerMonitorSeeds";
    String GATEWAYTEMPLATE = "GatewayTemplate";
    String GATEWAYTEMPLATES = "GatewayTemplates";
    String VRS = "VRS";
    String VRSS = "VRSs";
    String HSC = "HSC";
    String HSCS = "HSCs";
    String VLAN = "VLAN";
    String VLANS = "VLANs";
    String LDAPCONFIGURATION = "LDAPConfiguration";
    String LDAPCONFIGURATIONS = "LDAPConfigurations";
    String VSDCOMPONENT = "VSDComponent";
    String VSDCOMPONENTS = "VSDComponents";
    String ZFBREQUEST = "ZFBRequest";
    String ZFBREQUESTS = "ZFBRequests";
    String ENTERPRISEPERMISSION = "EnterprisePermission";
    String ENTERPRISEPERMISSIONS = "EnterprisePermissions";
    String STATICROUTE = "StaticRoute";
    String STATICROUTES = "StaticRoutes";
    String JOB = "Job";
    String JOBS = "Jobs";
    String VMINTERFACE = "VMInterface";
    String VMINTERFACES = "VMInterfaces";
    String GATEWAYSECUREDDATA = "GatewaySecuredData";
    String GATEWAYSECUREDDATAS = "GatewaySecuredDatas";
    String VCENTERHYPERVISOR = "VCenterHypervisor";
    String VCENTERHYPERVISORS = "VCenterHypervisors";
    String KEYSERVERMONITOR = "KeyServerMonitor";
    String KEYSERVERMONITORS = "KeyServerMonitors";
    String VRSMETRICS = "VRSMetrics";
    
    String EVENTLOG = "EventLog";
    String EVENTLOGS = "EventLogs";
    String LICENSE = "License";
    String LICENSES = "Licenses";
    String VIA = "Via";
    String VIAS = "Vias";
    String ENTERPRISEPROFILE = "EnterpriseProfile";
    String ENTERPRISEPROFILES = "EnterpriseProfiles";
    String PERFORMANCEMONITOR = "PerformanceMonitor";
    String PERFORMANCEMONITORS = "PerformanceMonitors";
    String NEXTHOPADDRESS = "NextHopAddress";
    
    String BRIDGEINTERFACE = "BridgeInterface";
    String BRIDGEINTERFACES = "BridgeInterfaces";
    String VCENTERCLUSTER = "VCenterCluster";
    String VCENTERCLUSTERS = "VCenterClusters";
    String MULTICASTRANGE = "MultiCastRange";
    String MULTICASTRANGES = "MultiCastRanges";
    String NETWORKMACROGROUP = "NetworkMacroGroup";
    String NETWORKMACROGROUPS = "NetworkMacroGroups";
    String INGRESSADVFWDENTRYTEMPLATE = "IngressAdvFwdEntryTemplate";
    String INGRESSADVFWDENTRYTEMPLATES = "IngressAdvFwdEntryTemplates";
    String APPLICATIONBINDING = "ApplicationBinding";
    String APPLICATIONBINDINGS = "ApplicationBindings";
    String AUTODISCOVEREDGATEWAY = "AutoDiscoveredGateway";
    String AUTODISCOVEREDGATEWAYS = "AutoDiscoveredGateways";
    String MULTICASTLIST = "MultiCastList";
    String MULTICASTLISTS = "MultiCastLists";
    String NEXTHOP = "NextHop";
    String NEXTHOPS = "NextHops";
    String KEYSERVERNOTIFICATION = "KeyServerNotification";
    String KEYSERVERNOTIFICATIONS = "KeyServerNotifications";
    String MIRRORDESTINATION = "MirrorDestination";
    String MIRRORDESTINATIONS = "MirrorDestinations";
    String TIER = "Tier";
    String TIERS = "Tiers";
    String DOMAINFIPACLTEMPLATE = "DomainFIPAclTemplate";
    String DOMAINFIPACLTEMPLATES = "DomainFIPAclTemplates";
    String ADDRESSMAP = "AddressMap";
    String ADDRESSMAPS = "AddressMaps";
    String GATEWAY = "Gateway";
    String GATEWAYS = "Gateways";
    String MULTINICVPORT = "MultiNICVPort";
    String MULTINICVPORTS = "MultiNICVPorts";
    String STATISTICS = "Statistics";
    
    String NSPORTTEMPLATE = "NSPortTemplate";
    String NSPORTTEMPLATES = "NSPortTemplates";
    String CERTIFICATE = "Certificate";
    String CERTIFICATES = "Certificates";
    String VCENTERDATACENTER = "VCenterDataCenter";
    String VCENTERDATACENTERS = "VCenterDataCenters";
    String L2DOMAINTEMPLATE = "L2DomainTemplate";
    String L2DOMAINTEMPLATES = "L2DomainTemplates";
    String VRSREDEPLOYMENTPOLICY = "VRSRedeploymentpolicy";
    String VRSREDEPLOYMENTPOLICIES = "VRSRedeploymentpolicies";
    String APPLICATIONSERVICE = "ApplicationService";
    String APPLICATIONSERVICES = "ApplicationServices";
    String IKEGATEWAY = "IKEGateway";
    String IKEGATEWAYS = "IKEGateways";
    String STATSCOLLECTORINFO = "StatsCollectorInfo";
    String STATSCOLLECTORINFOS = "StatsCollectorInfos";
    String VCENTER = "VCenter";
    String VCENTERS = "VCenters";
    String BULKSTATISTICS = "BulkStatistics";
    
    String INGRESSACLENTRYTEMPLATE = "IngressACLEntryTemplate";
    String INGRESSACLENTRYTEMPLATES = "IngressACLEntryTemplates";
    String ROUTINGPOLICY = "RoutingPolicy";
    String ROUTINGPOLICIES = "RoutingPolicies";
    String NETWORKPERFORMANCEBINDING = "NetworkPerformanceBinding";
    String NETWORKPERFORMANCEBINDINGS = "NetworkPerformanceBindings";
    String L2DOMAIN = "L2Domain";
    String L2DOMAINS = "L2Domains";
    String IKEGATEWAYCONFIG = "IKEGatewayConfig";
    String IKEGATEWAYCONFIGS = "IKEGatewayConfigs";
    String HOSTINTERFACE = "HostInterface";
    String HOSTINTERFACES = "HostInterfaces";
    String ENTERPRISESECUREDDATA = "EnterpriseSecuredData";
    String ENTERPRISESECUREDDATAS = "EnterpriseSecuredDatas";
    String APPLICATIONPERFORMANCEMANAGEMENT = "Applicationperformancemanagement";
    String APPLICATIONPERFORMANCEMANAGEMENTS = "Applicationperformancemanagements";
    String IKECERTIFICATE = "IKECertificate";
    String IKECERTIFICATES = "IKECertificates";
    String INGRESSEXTERNALSERVICETEMPLATE = "IngressExternalServiceTemplate";
    String INGRESSEXTERNALSERVICETEMPLATES = "IngressExternalServiceTemplates";
    String PORTTEMPLATE = "PortTemplate";
    String PORTTEMPLATES = "PortTemplates";
    String ME = "Me";
    String MES = "Mes";
    String ENDPOINT = "EndPoint";
    String ENDPOINTS = "EndPoints";
    String L7APPLICATIONSIGNATURE = "L7applicationsignature";
    String L7APPLICATIONSIGNATURES = "L7applicationsignatures";
    String DHCPOPTION = "DHCPOption";
    String DHCPOPTIONS = "DHCPOptions";
    String KEYSERVERMEMBER = "KeyServerMember";
    String KEYSERVERMEMBERS = "KeyServerMembers";
    String NSGATEWAY = "NSGateway";
    String NSGATEWAYS = "NSGateways";
    String NSGATEWAYTEMPLATE = "NSGatewayTemplate";
    String NSGATEWAYTEMPLATES = "NSGatewayTemplates";
    String VSC = "VSC";
    String VSCS = "VSCs";
    String UPLINKRD = "UplinkRD";
    String UPLINKRDS = "UplinkRDs";
    String ZFBAUTOASSIGNMENT = "ZFBAutoAssignment";
    String ZFBAUTOASSIGNMENTS = "ZFBAutoAssignments";
    String VM = "VM";
    String VMS = "VMs";
    String NSPORT = "NSPort";
    String NSPORTS = "NSPorts";
    String VRSADDRESSRANGE = "VRSAddressRange";
    String VRSADDRESSRANGES = "VRSAddressRanges";
    String BGPPROFILE = "BGPProfile";
    String BGPPROFILES = "BGPProfiles";
    String EGRESSQOSPOLICY = "EgressQOSPolicy";
    String EGRESSQOSPOLICIES = "EgressQOSPolicies";
    String PUBLICNETWORKMACRO = "PublicNetworkMacro";
    String PUBLICNETWORKMACROS = "PublicNetworkMacros";
    String DOMAINFIPACLTEMPLATEENTRY = "DomainFIPAclTemplateEntry";
    String DOMAINFIPACLTEMPLATEENTRIES = "DomainFIPAclTemplateEntries";
    String AUTODISCOVERCLUSTER = "AutoDiscoverCluster";
    String AUTODISCOVERCLUSTERS = "AutoDiscoverClusters";
    String ADDRESSRANGE = "AddressRange";
    String ADDRESSRANGES = "AddressRanges";
    String DOMAINTEMPLATE = "DomainTemplate";
    String DOMAINTEMPLATES = "DomainTemplates";
    String SITEINFO = "SiteInfo";
    String SITEINFOS = "SiteInfos";
    String VMRESYNC = "VMResync";
    String VMRESYNCS = "VMResyncs";
    String UPLINKCONNECTION = "UplinkConnection";
    String UPLINKCONNECTIONS = "UplinkConnections";
    String POLICYDECISION = "PolicyDecision";
    String POLICYDECISIONS = "PolicyDecisions";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING = "Applicationperformancemanagementbinding";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDINGS = "Applicationperformancemanagementbindings";
    String AUTODISCOVEREDDATACENTER = "Autodiscovereddatacenter";
    String AUTODISCOVEREDDATACENTERS = "Autodiscovereddatacenters";
    String FLOATINGIP = "FloatingIp";
    String FLOATINGIPS = "FloatingIps";
    String EGRESSACLTEMPLATE = "EgressACLTemplate";
    String EGRESSACLTEMPLATES = "EgressACLTemplates";
    String MONITORINGPORT = "MonitoringPort";
    String MONITORINGPORTS = "MonitoringPorts";
    String MONITORSCOPE = "Monitorscope";
    String MONITORSCOPES = "Monitorscopes";
    String AUTODISCOVERHYPERVISORFROMCLUSTER = "AutoDiscoverHypervisorFromCluster";
    String AUTODISCOVERHYPERVISORFROMCLUSTERS = "AutoDiscoverHypervisorFromClusters";
    String VPNCONNECTION = "VPNConnection";
    String VPNCONNECTIONS = "VPNConnections";
    String NSREDUNDANTGATEWAYGROUP = "NSRedundantGatewayGroup";
    String NSREDUNDANTGATEWAYGROUPS = "NSRedundantGatewayGroups";
    String EXTERNALSERVICE = "ExternalService";
    String EXTERNALSERVICES = "ExternalServices";
    String KEYSERVERMONITORSEK = "KeyServerMonitorSEK";
    String KEYSERVERMONITORSEKS = "KeyServerMonitorSEKs";
    String INGRESSADVFWDTEMPLATE = "IngressAdvFwdTemplate";
    String INGRESSADVFWDTEMPLATES = "IngressAdvFwdTemplates";
    String VPORTMIRROR = "VPortMirror";
    String VPORTMIRRORS = "VPortMirrors";
    String PATNATPOOL = "PATNATPool";
    String PATNATPOOLS = "PATNATPools";
    String PATMAPPER = "PATMapper";
    String PATMAPPERS = "PATMappers";
    String BGPNEIGHBOR = "BGPNeighbor";
    String BGPNEIGHBORS = "BGPNeighbors";
    String CONTAINERRESYNC = "ContainerResync";
    String CONTAINERRESYNCS = "ContainerResyncs";
    String ALLALARM = "AllAlarm";
    String ALLALARMS = "AllAlarms";
    String IKEPSK = "IKEPSK";
    String IKEPSKS = "IKEPSKs";
    String SYSTEMCONFIG = "SystemConfig";
    String SYSTEMCONFIGS = "SystemConfigs";
    String IKEENCRYPTIONPROFILE = "IKEEncryptionprofile";
    String IKEENCRYPTIONPROFILES = "IKEEncryptionprofiles";
    String FLOATINGIPACLTEMPLATEENTRY = "FloatingIPACLTemplateEntry";
    String FLOATINGIPACLTEMPLATEENTRIES = "FloatingIPACLTemplateEntries";
    String INFRASTRUCTURECONFIG = "InfrastructureConfig";
    String INFRASTRUCTURECONFIGS = "InfrastructureConfigs";
    String USER = "User";
    String USERS = "Users";
    String NATMAPENTRY = "NATMapEntry";
    String NATMAPENTRIES = "NATMapEntries";
    String POLICYGROUP = "PolicyGroup";
    String POLICYGROUPS = "PolicyGroups";
    String DEMARCATIONSERVICE = "DemarcationService";
    String DEMARCATIONSERVICES = "DemarcationServices";
    String NSGINFO = "NSGInfo";
    String NSGINFOS = "NSGInfos";
    String EXTERNALAPPSERVICE = "ExternalAppService";
    String EXTERNALAPPSERVICES = "ExternalAppServices";
    String ALARM = "Alarm";
    String ALARMS = "Alarms";
    String BOOTSTRAP = "Bootstrap";
    String BOOTSTRAPS = "Bootstraps";
    String FLOW = "Flow";
    String FLOWS = "Flows";
    String VLANTEMPLATE = "VLANTemplate";
    String VLANTEMPLATES = "VLANTemplates";
    String PORTMAPPING = "PortMapping";
    String PORTMAPPINGS = "PortMappings";
    String GATEWAYSECURITY = "GatewaySecurity";
    String GATEWAYSECURITIES = "GatewaySecurities";
    String GLOBALMETADATA = "GlobalMetadata";
    String GLOBALMETADATAS = "GlobalMetadatas";
    String NETWORKPERFORMANCEMEASUREMENT = "NetworkPerformanceMeasurement";
    String NETWORKPERFORMANCEMEASUREMENTS = "NetworkPerformanceMeasurements";
    String ENTERPRISE = "Enterprise";
    String ENTERPRISES = "Enterprises";
    String LINK = "Link";
    String LINKS = "Links";
    String INGRESSACLTEMPLATE = "IngressACLTemplate";
    String INGRESSACLTEMPLATES = "IngressACLTemplates";

    
    String CONTAINERINTERFACES_FETCHER = "ContainerInterfacesFetcher";
    String GROUPKEYENCRYPTIONPROFILES_FETCHER = "GroupKeyEncryptionProfilesFetcher";
    String BRCONNECTIONS_FETCHER = "BRConnectionsFetcher";
    String QOSS_FETCHER = "QOSsFetcher";
    String INFRASTRUCTUREACCESSPROFILES_FETCHER = "InfrastructureaccessprofilesFetcher";
    String BGPPEERS_FETCHER = "BGPPeersFetcher";
    String SHAREDNETWORKRESOURCES_FETCHER = "SharedNetworkResourcesFetcher";
    String VIRTUALIPS_FETCHER = "VirtualIPsFetcher";
    String DSCPFORWARDINGCLASSTABLES_FETCHER = "DSCPForwardingClassTablesFetcher";
    String MULTICASTCHANNELMAPS_FETCHER = "MultiCastChannelMapsFetcher";
    String REDUNDANCYGROUPS_FETCHER = "RedundancyGroupsFetcher";
    String TCAS_FETCHER = "TCAsFetcher";
    String GROUPS_FETCHER = "GroupsFetcher";
    String VSGREDUNDANTPORTS_FETCHER = "VsgRedundantPortsFetcher";
    String ZONES_FETCHER = "ZonesFetcher";
    String APPLICATIONS_FETCHER = "ApplicationsFetcher";
    String IKEGATEWAYPROFILES_FETCHER = "IKEGatewayProfilesFetcher";
    String IKESUBNETS_FETCHER = "IKESubnetsFetcher";
    String INFRASTRUCTUREGATEWAYPROFILES_FETCHER = "InfrastructureGatewayProfilesFetcher";
    String DISKSTATS_FETCHER = "DiskStatsFetcher";
    String POLICYGROUPTEMPLATES_FETCHER = "PolicyGroupTemplatesFetcher";
    String FLOWSECURITYPOLICIES_FETCHER = "FlowSecurityPoliciesFetcher";
    String VCENTEREAMCONFIGS_FETCHER = "VCenterEAMConfigsFetcher";
    String LOCATIONS_FETCHER = "LocationsFetcher";
    String ENTERPRISESECURITIES_FETCHER = "EnterpriseSecuritiesFetcher";
    String VCENTERVRSCONFIGS_FETCHER = "VCenterVRSConfigsFetcher";
    String ENTERPRISENETWORKS_FETCHER = "EnterpriseNetworksFetcher";
    String INFRASTRUCTUREVSCPROFILES_FETCHER = "InfrastructureVscProfilesFetcher";
    String PERMISSIONS_FETCHER = "PermissionsFetcher";
    String IPRESERVATIONS_FETCHER = "IPReservationsFetcher";
    String REDIRECTIONTARGETTEMPLATES_FETCHER = "RedirectionTargetTemplatesFetcher";
    String SUBNETTEMPLATES_FETCHER = "SubnetTemplatesFetcher";
    String METADATATAGS_FETCHER = "MetadataTagsFetcher";
    String FLOATINGIPACLTEMPLATES_FETCHER = "FloatingIPACLTemplatesFetcher";
    String IKEGATEWAYCONNECTIONS_FETCHER = "IKEGatewayConnectionsFetcher";
    String REDIRECTIONTARGETS_FETCHER = "RedirectionTargetsFetcher";
    String PATIPENTRIES_FETCHER = "PATIPEntriesFetcher";
    String AGGREGATEMETADATAS_FETCHER = "AggregateMetadatasFetcher";
    String EGRESSACLENTRYTEMPLATES_FETCHER = "EgressACLEntryTemplatesFetcher";
    String INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER = "IngressExternalServiceTemplateEntriesFetcher";
    String AVATARS_FETCHER = "AvatarsFetcher";
    String OVERLAYADDRESSPOOLS_FETCHER = "OverlayAddressPoolsFetcher";
    String BOOTSTRAPACTIVATIONS_FETCHER = "BootstrapActivationsFetcher";
    String LICENSESTATUS_FETCHER = "LicenseStatusFetcher";
    String METADATAS_FETCHER = "MetadatasFetcher";
    String CLOUDMGMTSYSTEMS_FETCHER = "CloudMgmtSystemsFetcher";
    String VSPS_FETCHER = "VSPsFetcher";
    String DOMAINS_FETCHER = "DomainsFetcher";
    String REDUNDANTPORTS_FETCHER = "RedundantPortsFetcher";
    String DSCPFORWARDINGCLASSMAPPINGS_FETCHER = "DSCPForwardingClassMappingsFetcher";
    String NETWORKLAYOUTS_FETCHER = "NetworkLayoutsFetcher";
    String OVERLAYPATNATENTRIES_FETCHER = "OverlayPATNATEntriesFetcher";
    String WANSERVICES_FETCHER = "WANServicesFetcher";
    String VSDS_FETCHER = "VSDsFetcher";
    String VPORTS_FETCHER = "VPortsFetcher";
    String FLOWFORWARDINGPOLICIES_FETCHER = "FlowForwardingPoliciesFetcher";
    String PORTS_FETCHER = "PortsFetcher";
    String STATISTICSPOLICIES_FETCHER = "StatisticsPoliciesFetcher";
    String SUBNETS_FETCHER = "SubnetsFetcher";
    String CONTAINERS_FETCHER = "ContainersFetcher";
    String RATELIMITERS_FETCHER = "RateLimitersFetcher";
    String KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER = "KeyServerMonitorEncryptedSeedsFetcher";
    String ZONETEMPLATES_FETCHER = "ZoneTemplatesFetcher";
    String KEYSERVERMONITORSEEDS_FETCHER = "KeyServerMonitorSeedsFetcher";
    String GATEWAYTEMPLATES_FETCHER = "GatewayTemplatesFetcher";
    String VRSS_FETCHER = "VRSsFetcher";
    String HSCS_FETCHER = "HSCsFetcher";
    String VLANS_FETCHER = "VLANsFetcher";
    String LDAPCONFIGURATIONS_FETCHER = "LDAPConfigurationsFetcher";
    String VSDCOMPONENTS_FETCHER = "VSDComponentsFetcher";
    String ZFBREQUESTS_FETCHER = "ZFBRequestsFetcher";
    String ENTERPRISEPERMISSIONS_FETCHER = "EnterprisePermissionsFetcher";
    String STATICROUTES_FETCHER = "StaticRoutesFetcher";
    String JOBS_FETCHER = "JobsFetcher";
    String VMINTERFACES_FETCHER = "VMInterfacesFetcher";
    String GATEWAYSECUREDDATAS_FETCHER = "GatewaySecuredDatasFetcher";
    String VCENTERHYPERVISORS_FETCHER = "VCenterHypervisorsFetcher";
    String KEYSERVERMONITORS_FETCHER = "KeyServerMonitorsFetcher";
    String VRSMETRICS_FETCHER = "VRSMetricsFetcher";
    String EVENTLOGS_FETCHER = "EventLogsFetcher";
    String LICENSES_FETCHER = "LicensesFetcher";
    String VIAS_FETCHER = "ViasFetcher";
    String ENTERPRISEPROFILES_FETCHER = "EnterpriseProfilesFetcher";
    String PERFORMANCEMONITORS_FETCHER = "PerformanceMonitorsFetcher";
    String NEXTHOPADDRESS_FETCHER = "NextHopAddressFetcher";
    String BRIDGEINTERFACES_FETCHER = "BridgeInterfacesFetcher";
    String VCENTERCLUSTERS_FETCHER = "VCenterClustersFetcher";
    String MULTICASTRANGES_FETCHER = "MultiCastRangesFetcher";
    String NETWORKMACROGROUPS_FETCHER = "NetworkMacroGroupsFetcher";
    String INGRESSADVFWDENTRYTEMPLATES_FETCHER = "IngressAdvFwdEntryTemplatesFetcher";
    String APPLICATIONBINDINGS_FETCHER = "ApplicationBindingsFetcher";
    String AUTODISCOVEREDGATEWAYS_FETCHER = "AutoDiscoveredGatewaysFetcher";
    String MULTICASTLISTS_FETCHER = "MultiCastListsFetcher";
    String NEXTHOPS_FETCHER = "NextHopsFetcher";
    String KEYSERVERNOTIFICATIONS_FETCHER = "KeyServerNotificationsFetcher";
    String MIRRORDESTINATIONS_FETCHER = "MirrorDestinationsFetcher";
    String TIERS_FETCHER = "TiersFetcher";
    String DOMAINFIPACLTEMPLATES_FETCHER = "DomainFIPAclTemplatesFetcher";
    String ADDRESSMAPS_FETCHER = "AddressMapsFetcher";
    String GATEWAYS_FETCHER = "GatewaysFetcher";
    String MULTINICVPORTS_FETCHER = "MultiNICVPortsFetcher";
    String STATISTICS_FETCHER = "StatisticsFetcher";
    String NSPORTTEMPLATES_FETCHER = "NSPortTemplatesFetcher";
    String CERTIFICATES_FETCHER = "CertificatesFetcher";
    String VCENTERDATACENTERS_FETCHER = "VCenterDataCentersFetcher";
    String L2DOMAINTEMPLATES_FETCHER = "L2DomainTemplatesFetcher";
    String VRSREDEPLOYMENTPOLICIES_FETCHER = "VRSRedeploymentpoliciesFetcher";
    String APPLICATIONSERVICES_FETCHER = "ApplicationServicesFetcher";
    String IKEGATEWAYS_FETCHER = "IKEGatewaysFetcher";
    String STATSCOLLECTORINFOS_FETCHER = "StatsCollectorInfosFetcher";
    String VCENTERS_FETCHER = "VCentersFetcher";
    String BULKSTATISTICS_FETCHER = "BulkStatisticsFetcher";
    String INGRESSACLENTRYTEMPLATES_FETCHER = "IngressACLEntryTemplatesFetcher";
    String ROUTINGPOLICIES_FETCHER = "RoutingPoliciesFetcher";
    String NETWORKPERFORMANCEBINDINGS_FETCHER = "NetworkPerformanceBindingsFetcher";
    String L2DOMAINS_FETCHER = "L2DomainsFetcher";
    String IKEGATEWAYCONFIGS_FETCHER = "IKEGatewayConfigsFetcher";
    String HOSTINTERFACES_FETCHER = "HostInterfacesFetcher";
    String ENTERPRISESECUREDDATAS_FETCHER = "EnterpriseSecuredDatasFetcher";
    String APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER = "ApplicationperformancemanagementsFetcher";
    String IKECERTIFICATES_FETCHER = "IKECertificatesFetcher";
    String INGRESSEXTERNALSERVICETEMPLATES_FETCHER = "IngressExternalServiceTemplatesFetcher";
    String PORTTEMPLATES_FETCHER = "PortTemplatesFetcher";
    String MES_FETCHER = "MesFetcher";
    String ENDPOINTS_FETCHER = "EndPointsFetcher";
    String L7APPLICATIONSIGNATURES_FETCHER = "L7applicationsignaturesFetcher";
    String DHCPOPTIONS_FETCHER = "DHCPOptionsFetcher";
    String KEYSERVERMEMBERS_FETCHER = "KeyServerMembersFetcher";
    String NSGATEWAYS_FETCHER = "NSGatewaysFetcher";
    String NSGATEWAYTEMPLATES_FETCHER = "NSGatewayTemplatesFetcher";
    String VSCS_FETCHER = "VSCsFetcher";
    String UPLINKRDS_FETCHER = "UplinkRDsFetcher";
    String ZFBAUTOASSIGNMENTS_FETCHER = "ZFBAutoAssignmentsFetcher";
    String VMS_FETCHER = "VMsFetcher";
    String NSPORTS_FETCHER = "NSPortsFetcher";
    String VRSADDRESSRANGES_FETCHER = "VRSAddressRangesFetcher";
    String BGPPROFILES_FETCHER = "BGPProfilesFetcher";
    String EGRESSQOSPOLICIES_FETCHER = "EgressQOSPoliciesFetcher";
    String PUBLICNETWORKMACROS_FETCHER = "PublicNetworkMacrosFetcher";
    String DOMAINFIPACLTEMPLATEENTRIES_FETCHER = "DomainFIPAclTemplateEntriesFetcher";
    String AUTODISCOVERCLUSTERS_FETCHER = "AutoDiscoverClustersFetcher";
    String ADDRESSRANGES_FETCHER = "AddressRangesFetcher";
    String DOMAINTEMPLATES_FETCHER = "DomainTemplatesFetcher";
    String SITEINFOS_FETCHER = "SiteInfosFetcher";
    String VMRESYNCS_FETCHER = "VMResyncsFetcher";
    String UPLINKCONNECTIONS_FETCHER = "UplinkConnectionsFetcher";
    String POLICYDECISIONS_FETCHER = "PolicyDecisionsFetcher";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER = "ApplicationperformancemanagementbindingsFetcher";
    String AUTODISCOVEREDDATACENTERS_FETCHER = "AutodiscovereddatacentersFetcher";
    String FLOATINGIPS_FETCHER = "FloatingIpsFetcher";
    String EGRESSACLTEMPLATES_FETCHER = "EgressACLTemplatesFetcher";
    String MONITORINGPORTS_FETCHER = "MonitoringPortsFetcher";
    String MONITORSCOPES_FETCHER = "MonitorscopesFetcher";
    String AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER = "AutoDiscoverHypervisorFromClustersFetcher";
    String VPNCONNECTIONS_FETCHER = "VPNConnectionsFetcher";
    String NSREDUNDANTGATEWAYGROUPS_FETCHER = "NSRedundantGatewayGroupsFetcher";
    String EXTERNALSERVICES_FETCHER = "ExternalServicesFetcher";
    String KEYSERVERMONITORSEKS_FETCHER = "KeyServerMonitorSEKsFetcher";
    String INGRESSADVFWDTEMPLATES_FETCHER = "IngressAdvFwdTemplatesFetcher";
    String VPORTMIRRORS_FETCHER = "VPortMirrorsFetcher";
    String PATNATPOOLS_FETCHER = "PATNATPoolsFetcher";
    String PATMAPPERS_FETCHER = "PATMappersFetcher";
    String BGPNEIGHBORS_FETCHER = "BGPNeighborsFetcher";
    String CONTAINERRESYNCS_FETCHER = "ContainerResyncsFetcher";
    String ALLALARMS_FETCHER = "AllAlarmsFetcher";
    String IKEPSKS_FETCHER = "IKEPSKsFetcher";
    String SYSTEMCONFIGS_FETCHER = "SystemConfigsFetcher";
    String IKEENCRYPTIONPROFILES_FETCHER = "IKEEncryptionprofilesFetcher";
    String FLOATINGIPACLTEMPLATEENTRIES_FETCHER = "FloatingIPACLTemplateEntriesFetcher";
    String INFRASTRUCTURECONFIGS_FETCHER = "InfrastructureConfigsFetcher";
    String USERS_FETCHER = "UsersFetcher";
    String NATMAPENTRIES_FETCHER = "NATMapEntriesFetcher";
    String POLICYGROUPS_FETCHER = "PolicyGroupsFetcher";
    String DEMARCATIONSERVICES_FETCHER = "DemarcationServicesFetcher";
    String NSGINFOS_FETCHER = "NSGInfosFetcher";
    String EXTERNALAPPSERVICES_FETCHER = "ExternalAppServicesFetcher";
    String ALARMS_FETCHER = "AlarmsFetcher";
    String BOOTSTRAPS_FETCHER = "BootstrapsFetcher";
    String FLOWS_FETCHER = "FlowsFetcher";
    String VLANTEMPLATES_FETCHER = "VLANTemplatesFetcher";
    String PORTMAPPINGS_FETCHER = "PortMappingsFetcher";
    String GATEWAYSECURITIES_FETCHER = "GatewaySecuritiesFetcher";
    String GLOBALMETADATAS_FETCHER = "GlobalMetadatasFetcher";
    String NETWORKPERFORMANCEMEASUREMENTS_FETCHER = "NetworkPerformanceMeasurementsFetcher";
    String ENTERPRISES_FETCHER = "EnterprisesFetcher";
    String LINKS_FETCHER = "LinksFetcher";
    String INGRESSACLTEMPLATES_FETCHER = "IngressACLTemplatesFetcher";

    
    
    String CONTAINERINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "ContainerInterfaceAttachedNetworkType";
    String CONTAINERINTERFACE_ENTITYSCOPE_ENUM = "ContainerInterfaceEntityScope";
    
    String GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADENCRYPTIONALGORITHM_ENUM = "GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADSIGNINGALGORITHM_ENUM = "GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_ENTITYSCOPE_ENUM = "GroupKeyEncryptionProfileEntityScope";
    String GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM = "GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM = "GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADSIGNINGALGORITHM_ENUM = "GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_TRAFFICAUTHENTICATIONALGORITHM_ENUM = "GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_TRAFFICENCRYPTIONALGORITHM_ENUM = "GroupKeyEncryptionProfileTrafficEncryptionAlgorithm";
    
    String BRCONNECTION_MODE_ENUM = "BRConnectionMode";
    
    String QOS_ENTITYSCOPE_ENUM = "QOSEntityScope";
    String QOS_SERVICECLASS_ENUM = "QOSServiceClass";
    
    String INFRASTRUCTUREACCESSPROFILE_SSHAUTHMODE_ENUM = "InfrastructureaccessprofileSSHAuthMode";
    String INFRASTRUCTUREACCESSPROFILE_ENTITYSCOPE_ENUM = "InfrastructureaccessprofileEntityScope";
    
    String BGPPEER_ENTITYSCOPE_ENUM = "BGPPeerEntityScope";
    String BGPPEER_STATUS_ENUM = "BGPPeerStatus";
    
    String SHAREDNETWORKRESOURCE_ENTITYSCOPE_ENUM = "SharedNetworkResourceEntityScope";
    String SHAREDNETWORKRESOURCE_PERMITTEDACTIONTYPE_ENUM = "SharedNetworkResourcePermittedActionType";
    String SHAREDNETWORKRESOURCE_TYPE_ENUM = "SharedNetworkResourceType";
    String SHAREDNETWORKRESOURCE_USEGLOBALMAC_ENUM = "SharedNetworkResourceUseGlobalMAC";
    
    String VIRTUALIP_ENTITYSCOPE_ENUM = "VirtualIPEntityScope";
    
    String DSCPFORWARDINGCLASSTABLE_ENTITYSCOPE_ENUM = "DSCPForwardingClassTableEntityScope";
    
    String MULTICASTCHANNELMAP_ENTITYSCOPE_ENUM = "MultiCastChannelMapEntityScope";
    
    String REDUNDANCYGROUP_ENTITYSCOPE_ENUM = "RedundancyGroupEntityScope";
    String REDUNDANCYGROUP_PERMITTEDACTION_ENUM = "RedundancyGroupPermittedAction";
    String REDUNDANCYGROUP_PERSONALITY_ENUM = "RedundancyGroupPersonality";
    String REDUNDANCYGROUP_REDUNDANTGATEWAYSTATUS_ENUM = "RedundancyGroupRedundantGatewayStatus";
    
    String TCA_ENTITYSCOPE_ENUM = "TCAEntityScope";
    String TCA_METRIC_ENUM = "TCAMetric";
    String TCA_SCOPE_ENUM = "TCAScope";
    String TCA_TYPE_ENUM = "TCAType";
    
    String GROUP_ENTITYSCOPE_ENUM = "GroupEntityScope";
    String GROUP_MANAGEMENTMODE_ENUM = "GroupManagementMode";
    String GROUP_ROLE_ENUM = "GroupRole";
    
    String VSGREDUNDANTPORT_ENTITYSCOPE_ENUM = "VsgRedundantPortEntityScope";
    String VSGREDUNDANTPORT_PERMITTEDACTION_ENUM = "VsgRedundantPortPermittedAction";
    String VSGREDUNDANTPORT_PORTTYPE_ENUM = "VsgRedundantPortPortType";
    String VSGREDUNDANTPORT_STATUS_ENUM = "VsgRedundantPortStatus";
    
    String ZONE_DPI_ENUM = "ZoneDPI";
    String ZONE_IPTYPE_ENUM = "ZoneIPType";
    String ZONE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "ZoneAssociatedApplicationObjectType";
    String ZONE_ENCRYPTION_ENUM = "ZoneEncryption";
    String ZONE_ENTITYSCOPE_ENUM = "ZoneEntityScope";
    String ZONE_MAINTENANCEMODE_ENUM = "ZoneMaintenanceMode";
    String ZONE_MULTICAST_ENUM = "ZoneMulticast";
    
    String APPLICATION_OPTIMIZEPATHSELECTION_ENUM = "ApplicationOptimizePathSelection";
    String APPLICATION_PERFORMANCEMONITORTYPE_ENUM = "ApplicationPerformanceMonitorType";
    String APPLICATION_POSTCLASSIFICATIONPATH_ENUM = "ApplicationPostClassificationPath";
    String APPLICATION_PRECLASSIFICATIONPATH_ENUM = "ApplicationPreClassificationPath";
    String APPLICATION_PROTOCOL_ENUM = "ApplicationProtocol";
    
    String IKEGATEWAYPROFILE_IKEGATEWAYIDENTIFIERTYPE_ENUM = "IKEGatewayProfileIKEGatewayIdentifierType";
    String IKEGATEWAYPROFILE_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM = "IKEGatewayProfileAssociatedIKEAuthenticationType";
    String IKEGATEWAYPROFILE_ENTITYSCOPE_ENUM = "IKEGatewayProfileEntityScope";
    String IKEGATEWAYPROFILE_SERVICECLASS_ENUM = "IKEGatewayProfileServiceClass";
    
    String IKESUBNET_ENTITYSCOPE_ENUM = "IKESubnetEntityScope";
    
    String INFRASTRUCTUREGATEWAYPROFILE_CONTROLLERLESSFORWARDINGMODE_ENUM = "InfrastructureGatewayProfileControllerLessForwardingMode";
    String INFRASTRUCTUREGATEWAYPROFILE_ENTITYSCOPE_ENUM = "InfrastructureGatewayProfileEntityScope";
    String INFRASTRUCTUREGATEWAYPROFILE_REMOTELOGMODE_ENUM = "InfrastructureGatewayProfileRemoteLogMode";
    String INFRASTRUCTUREGATEWAYPROFILE_UPGRADEACTION_ENUM = "InfrastructureGatewayProfileUpgradeAction";
    
    String DISKSTAT_ENTITYSCOPE_ENUM = "DiskStatEntityScope";
    String DISKSTAT_UNIT_ENUM = "DiskStatUnit";
    
    String POLICYGROUPTEMPLATE_ENTITYSCOPE_ENUM = "PolicyGroupTemplateEntityScope";
    String POLICYGROUPTEMPLATE_TYPE_ENUM = "PolicyGroupTemplateType";
    
    String FLOWSECURITYPOLICY_ACTION_ENUM = "FlowSecurityPolicyAction";
    String FLOWSECURITYPOLICY_ASSOCIATEDNETWORKOBJECTTYPE_ENUM = "FlowSecurityPolicyAssociatedNetworkObjectType";
    String FLOWSECURITYPOLICY_ENTITYSCOPE_ENUM = "FlowSecurityPolicyEntityScope";
    
    String VCENTEREAMCONFIG_ENTITYSCOPE_ENUM = "VCenterEAMConfigEntityScope";
    
    String LOCATION_ENTITYSCOPE_ENUM = "LocationEntityScope";
    
    String ENTERPRISESECURITY_ENTITYSCOPE_ENUM = "EnterpriseSecurityEntityScope";
    
    String VCENTERVRSCONFIG_ENTITYSCOPE_ENUM = "VCenterVRSConfigEntityScope";
    
    String ENTERPRISENETWORK_IPTYPE_ENUM = "EnterpriseNetworkIPType";
    String ENTERPRISENETWORK_ENTITYSCOPE_ENUM = "EnterpriseNetworkEntityScope";
    
    String INFRASTRUCTUREVSCPROFILE_ENTITYSCOPE_ENUM = "InfrastructureVscProfileEntityScope";
    
    String PERMISSION_ENTITYSCOPE_ENUM = "PermissionEntityScope";
    String PERMISSION_PERMITTEDACTION_ENUM = "PermissionPermittedAction";
    
    String IPRESERVATION_ENTITYSCOPE_ENUM = "IPReservationEntityScope";
    
    String REDIRECTIONTARGETTEMPLATE_ENDPOINTTYPE_ENUM = "RedirectionTargetTemplateEndPointType";
    String REDIRECTIONTARGETTEMPLATE_ENTITYSCOPE_ENUM = "RedirectionTargetTemplateEntityScope";
    String REDIRECTIONTARGETTEMPLATE_TRIGGERTYPE_ENUM = "RedirectionTargetTemplateTriggerType";
    
    String SUBNETTEMPLATE_DPI_ENUM = "SubnetTemplateDPI";
    String SUBNETTEMPLATE_IPTYPE_ENUM = "SubnetTemplateIPType";
    String SUBNETTEMPLATE_ENCRYPTION_ENUM = "SubnetTemplateEncryption";
    String SUBNETTEMPLATE_ENTITYSCOPE_ENUM = "SubnetTemplateEntityScope";
    String SUBNETTEMPLATE_MULTICAST_ENUM = "SubnetTemplateMulticast";
    String SUBNETTEMPLATE_USEGLOBALMAC_ENUM = "SubnetTemplateUseGlobalMAC";
    
    String METADATATAG_ENTITYSCOPE_ENUM = "MetadataTagEntityScope";
    
    String FLOATINGIPACLTEMPLATE_ENTITYSCOPE_ENUM = "FloatingIPACLTemplateEntityScope";
    String FLOATINGIPACLTEMPLATE_POLICYSTATE_ENUM = "FloatingIPACLTemplatePolicyState";
    String FLOATINGIPACLTEMPLATE_PRIORITYTYPE_ENUM = "FloatingIPACLTemplatePriorityType";
    
    String IKEGATEWAYCONNECTION_NSGIDENTIFIERTYPE_ENUM = "IKEGatewayConnectionNSGIdentifierType";
    String IKEGATEWAYCONNECTION_NSGROLE_ENUM = "IKEGatewayConnectionNSGRole";
    String IKEGATEWAYCONNECTION_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM = "IKEGatewayConnectionAssociatedIKEAuthenticationType";
    String IKEGATEWAYCONNECTION_ENTITYSCOPE_ENUM = "IKEGatewayConnectionEntityScope";
    
    String REDIRECTIONTARGET_ENDPOINTTYPE_ENUM = "RedirectionTargetEndPointType";
    String REDIRECTIONTARGET_ENTITYSCOPE_ENUM = "RedirectionTargetEntityScope";
    String REDIRECTIONTARGET_TRIGGERTYPE_ENUM = "RedirectionTargetTriggerType";
    
    String PATIPENTRY_IPTYPE_ENUM = "PATIPEntryIPType";
    String PATIPENTRY_ENTITYSCOPE_ENUM = "PATIPEntryEntityScope";
    
    String AGGREGATEMETADATA_ENTITYSCOPE_ENUM = "AggregateMetadataEntityScope";
    
    String EGRESSACLENTRYTEMPLATE_ACTION_ENUM = "EgressACLEntryTemplateAction";
    String EGRESSACLENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "EgressACLEntryTemplateAssociatedApplicationObjectType";
    String EGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM = "EgressACLEntryTemplateEntityScope";
    String EGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM = "EgressACLEntryTemplateLocationType";
    String EGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM = "EgressACLEntryTemplateNetworkType";
    String EGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM = "EgressACLEntryTemplatePolicyState";
    
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ACTION_ENUM = "IngressExternalServiceTemplateEntryAction";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "IngressExternalServiceTemplateEntryAssociatedApplicationObjectType";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ENTITYSCOPE_ENUM = "IngressExternalServiceTemplateEntryEntityScope";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_LOCATIONTYPE_ENUM = "IngressExternalServiceTemplateEntryLocationType";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_NETWORKTYPE_ENUM = "IngressExternalServiceTemplateEntryNetworkType";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_POLICYSTATE_ENUM = "IngressExternalServiceTemplateEntryPolicyState";
    
    String AVATAR_ENTITYSCOPE_ENUM = "AvatarEntityScope";
    
    
    String BOOTSTRAPACTIVATION_ACTION_ENUM = "BootstrapActivationAction";
    String BOOTSTRAPACTIVATION_ENTITYSCOPE_ENUM = "BootstrapActivationEntityScope";
    
    
    String METADATA_ENTITYSCOPE_ENUM = "MetadataEntityScope";
    
    String CLOUDMGMTSYSTEM_ENTITYSCOPE_ENUM = "CloudMgmtSystemEntityScope";
    
    String VSP_ENTITYSCOPE_ENUM = "VSPEntityScope";
    
    String DOMAIN_DHCPBEHAVIOR_ENUM = "DomainDHCPBehavior";
    String DOMAIN_DPI_ENUM = "DomainDPI";
    String DOMAIN_PATENABLED_ENUM = "DomainPATEnabled";
    String DOMAIN_APPLICATIONDEPLOYMENTPOLICY_ENUM = "DomainApplicationDeploymentPolicy";
    String DOMAIN_ENCRYPTION_ENUM = "DomainEncryption";
    String DOMAIN_ENTITYSCOPE_ENUM = "DomainEntityScope";
    String DOMAIN_MAINTENANCEMODE_ENUM = "DomainMaintenanceMode";
    String DOMAIN_MULTICAST_ENUM = "DomainMulticast";
    String DOMAIN_PERMITTEDACTION_ENUM = "DomainPermittedAction";
    String DOMAIN_POLICYCHANGESTATUS_ENUM = "DomainPolicyChangeStatus";
    String DOMAIN_TUNNELTYPE_ENUM = "DomainTunnelType";
    String DOMAIN_UNDERLAYENABLED_ENUM = "DomainUnderlayEnabled";
    String DOMAIN_UPLINKPREFERENCE_ENUM = "DomainUplinkPreference";
    
    String REDUNDANTPORT_ENTITYSCOPE_ENUM = "RedundantPortEntityScope";
    String REDUNDANTPORT_PERMITTEDACTION_ENUM = "RedundantPortPermittedAction";
    String REDUNDANTPORT_PORTTYPE_ENUM = "RedundantPortPortType";
    String REDUNDANTPORT_STATUS_ENUM = "RedundantPortStatus";
    
    String DSCPFORWARDINGCLASSMAPPING_ENTITYSCOPE_ENUM = "DSCPForwardingClassMappingEntityScope";
    String DSCPFORWARDINGCLASSMAPPING_FORWARDINGCLASS_ENUM = "DSCPForwardingClassMappingForwardingClass";
    
    String NETWORKLAYOUT_ENTITYSCOPE_ENUM = "NetworkLayoutEntityScope";
    String NETWORKLAYOUT_SERVICETYPE_ENUM = "NetworkLayoutServiceType";
    
    
    String WANSERVICE_CONFIGTYPE_ENUM = "WANServiceConfigType";
    String WANSERVICE_ENTITYSCOPE_ENUM = "WANServiceEntityScope";
    String WANSERVICE_PERMITTEDACTION_ENUM = "WANServicePermittedAction";
    String WANSERVICE_SERVICETYPE_ENUM = "WANServiceServiceType";
    String WANSERVICE_TUNNELTYPE_ENUM = "WANServiceTunnelType";
    
    String VSD_ENTITYSCOPE_ENUM = "VSDEntityScope";
    String VSD_MODE_ENUM = "VSDMode";
    String VSD_STATUS_ENUM = "VSDStatus";
    
    String VPORT_DPI_ENUM = "VPortDPI";
    String VPORT_ADDRESSSPOOFING_ENUM = "VPortAddressSpoofing";
    String VPORT_ENTITYSCOPE_ENUM = "VPortEntityScope";
    String VPORT_MULTICAST_ENUM = "VPortMulticast";
    String VPORT_OPERATIONALSTATE_ENUM = "VPortOperationalState";
    String VPORT_SYSTEMTYPE_ENUM = "VPortSystemType";
    String VPORT_TYPE_ENUM = "VPortType";
    
    String FLOWFORWARDINGPOLICY_ASSOCIATEDNETWORKOBJECTTYPE_ENUM = "FlowForwardingPolicyAssociatedNetworkObjectType";
    String FLOWFORWARDINGPOLICY_ENTITYSCOPE_ENUM = "FlowForwardingPolicyEntityScope";
    String FLOWFORWARDINGPOLICY_TYPE_ENUM = "FlowForwardingPolicyType";
    
    String PORT_ENTITYSCOPE_ENUM = "PortEntityScope";
    String PORT_PERMITTEDACTION_ENUM = "PortPermittedAction";
    String PORT_PORTTYPE_ENUM = "PortPortType";
    String PORT_STATUS_ENUM = "PortStatus";
    
    String STATISTICSPOLICY_ENTITYSCOPE_ENUM = "StatisticsPolicyEntityScope";
    
    String SUBNET_DPI_ENUM = "SubnetDPI";
    String SUBNET_IPTYPE_ENUM = "SubnetIPType";
    String SUBNET_PATENABLED_ENUM = "SubnetPATEnabled";
    String SUBNET_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "SubnetAssociatedApplicationObjectType";
    String SUBNET_DEFAULTACTION_ENUM = "SubnetDefaultAction";
    String SUBNET_ENCRYPTION_ENUM = "SubnetEncryption";
    String SUBNET_ENTITYSCOPE_ENUM = "SubnetEntityScope";
    String SUBNET_MAINTENANCEMODE_ENUM = "SubnetMaintenanceMode";
    String SUBNET_MULTICAST_ENUM = "SubnetMulticast";
    String SUBNET_UNDERLAYENABLED_ENUM = "SubnetUnderlayEnabled";
    String SUBNET_USEGLOBALMAC_ENUM = "SubnetUseGlobalMAC";
    
    String CONTAINER_DELETEMODE_ENUM = "ContainerDeleteMode";
    String CONTAINER_ENTITYSCOPE_ENUM = "ContainerEntityScope";
    String CONTAINER_REASONTYPE_ENUM = "ContainerReasonType";
    String CONTAINER_STATUS_ENUM = "ContainerStatus";
    
    String RATELIMITER_ENTITYSCOPE_ENUM = "RateLimiterEntityScope";
    
    String KEYSERVERMONITORENCRYPTEDSEED_ENTITYSCOPE_ENUM = "KeyServerMonitorEncryptedSeedEntityScope";
    
    String ZONETEMPLATE_DPI_ENUM = "ZoneTemplateDPI";
    String ZONETEMPLATE_IPTYPE_ENUM = "ZoneTemplateIPType";
    String ZONETEMPLATE_ENCRYPTION_ENUM = "ZoneTemplateEncryption";
    String ZONETEMPLATE_ENTITYSCOPE_ENUM = "ZoneTemplateEntityScope";
    String ZONETEMPLATE_MULTICAST_ENUM = "ZoneTemplateMulticast";
    
    String KEYSERVERMONITORSEED_ENTITYSCOPE_ENUM = "KeyServerMonitorSeedEntityScope";
    String KEYSERVERMONITORSEED_SEEDTRAFFICAUTHENTICATIONALGORITHM_ENUM = "KeyServerMonitorSeedSeedTrafficAuthenticationAlgorithm";
    String KEYSERVERMONITORSEED_SEEDTRAFFICENCRYPTIONALGORITHM_ENUM = "KeyServerMonitorSeedSeedTrafficEncryptionAlgorithm";
    
    String GATEWAYTEMPLATE_ENTITYSCOPE_ENUM = "GatewayTemplateEntityScope";
    String GATEWAYTEMPLATE_PERSONALITY_ENUM = "GatewayTemplatePersonality";
    
    String VRS_JSONRPCCONNECTIONSTATE_ENUM = "VRSJSONRPCConnectionState";
    String VRS_CLUSTERNODEROLE_ENUM = "VRSClusterNodeRole";
    String VRS_ENTITYSCOPE_ENUM = "VRSEntityScope";
    String VRS_HYPERVISORCONNECTIONSTATE_ENUM = "VRSHypervisorConnectionState";
    String VRS_LICENSEDSTATE_ENUM = "VRSLicensedState";
    String VRS_PERSONALITY_ENUM = "VRSPersonality";
    String VRS_ROLE_ENUM = "VRSRole";
    String VRS_STATUS_ENUM = "VRSStatus";
    String VRS_VSCCONFIGSTATE_ENUM = "VRSVscConfigState";
    String VRS_VSCCURRENTSTATE_ENUM = "VRSVscCurrentState";
    
    String HSC_ENTITYSCOPE_ENUM = "HSCEntityScope";
    String HSC_STATUS_ENUM = "HSCStatus";
    String HSC_TYPE_ENUM = "HSCType";
    
    String VLAN_ENTITYSCOPE_ENUM = "VLANEntityScope";
    String VLAN_PERMITTEDACTION_ENUM = "VLANPermittedAction";
    String VLAN_STATUS_ENUM = "VLANStatus";
    
    String LDAPCONFIGURATION_ENTITYSCOPE_ENUM = "LDAPConfigurationEntityScope";
    
    String VSDCOMPONENT_ENTITYSCOPE_ENUM = "VSDComponentEntityScope";
    String VSDCOMPONENT_STATUS_ENUM = "VSDComponentStatus";
    String VSDCOMPONENT_TYPE_ENUM = "VSDComponentType";
    
    String ZFBREQUEST_ZFBAPPROVALSTATUS_ENUM = "ZFBRequestZFBApprovalStatus";
    String ZFBREQUEST_ENTITYSCOPE_ENUM = "ZFBRequestEntityScope";
    
    String ENTERPRISEPERMISSION_ENTITYSCOPE_ENUM = "EnterprisePermissionEntityScope";
    String ENTERPRISEPERMISSION_PERMITTEDACTION_ENUM = "EnterprisePermissionPermittedAction";
    
    String STATICROUTE_IPTYPE_ENUM = "StaticRouteIPType";
    String STATICROUTE_ENTITYSCOPE_ENUM = "StaticRouteEntityScope";
    String STATICROUTE_TYPE_ENUM = "StaticRouteType";
    
    String JOB_ASSOCENTITYTYPE_ENUM = "JobAssocEntityType";
    String JOB_COMMAND_ENUM = "JobCommand";
    String JOB_ENTITYSCOPE_ENUM = "JobEntityScope";
    String JOB_STATUS_ENUM = "JobStatus";
    
    String VMINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "VMInterfaceAttachedNetworkType";
    String VMINTERFACE_ENTITYSCOPE_ENUM = "VMInterfaceEntityScope";
    
    String GATEWAYSECUREDDATA_ENTITYSCOPE_ENUM = "GatewaySecuredDataEntityScope";
    
    String VCENTERHYPERVISOR_DESTINATIONMIRRORPORT_ENUM = "VCenterHypervisorDestinationMirrorPort";
    String VCENTERHYPERVISOR_ENTITYSCOPE_ENUM = "VCenterHypervisorEntityScope";
    
    String KEYSERVERMONITOR_ENTITYSCOPE_ENUM = "KeyServerMonitorEntityScope";
    
    String VRSMETRICS_ENTITYSCOPE_ENUM = "VRSMetricsEntityScope";
    
    String EVENTLOG_ENTITYSCOPE_ENUM = "EventLogEntityScope";
    
    String LICENSE_ENTITYSCOPE_ENUM = "LicenseEntityScope";
    String LICENSE_LICENSEENCRYPTION_ENUM = "LicenseLicenseEncryption";
    String LICENSE_LICENSETYPE_ENUM = "LicenseLicenseType";
    
    
    String ENTERPRISEPROFILE_ALLOWEDFORWARDINGCLASSES_ENUM = "EnterpriseProfileAllowedForwardingClasses";
    String ENTERPRISEPROFILE_ENCRYPTIONMANAGEMENTMODE_ENUM = "EnterpriseProfileEncryptionManagementMode";
    String ENTERPRISEPROFILE_ENTITYSCOPE_ENUM = "EnterpriseProfileEntityScope";
    
    String PERFORMANCEMONITOR_SERVICECLASS_ENUM = "PerformanceMonitorServiceClass";
    
    
    String BRIDGEINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "BridgeInterfaceAttachedNetworkType";
    String BRIDGEINTERFACE_ENTITYSCOPE_ENUM = "BridgeInterfaceEntityScope";
    
    String VCENTERCLUSTER_DESTINATIONMIRRORPORT_ENUM = "VCenterClusterDestinationMirrorPort";
    String VCENTERCLUSTER_ENTITYSCOPE_ENUM = "VCenterClusterEntityScope";
    
    String MULTICASTRANGE_ENTITYSCOPE_ENUM = "MultiCastRangeEntityScope";
    
    String NETWORKMACROGROUP_ENTITYSCOPE_ENUM = "NetworkMacroGroupEntityScope";
    
    String INGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM = "IngressAdvFwdEntryTemplateFCOverride";
    String INGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM = "IngressAdvFwdEntryTemplateAction";
    String INGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "IngressAdvFwdEntryTemplateAssociatedApplicationObjectType";
    String INGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM = "IngressAdvFwdEntryTemplateEntityScope";
    String INGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM = "IngressAdvFwdEntryTemplateLocationType";
    String INGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM = "IngressAdvFwdEntryTemplateNetworkType";
    String INGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM = "IngressAdvFwdEntryTemplatePolicyState";
    String INGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM = "IngressAdvFwdEntryTemplateUplinkPreference";
    
    
    String AUTODISCOVEREDGATEWAY_ENTITYSCOPE_ENUM = "AutoDiscoveredGatewayEntityScope";
    String AUTODISCOVEREDGATEWAY_PERSONALITY_ENUM = "AutoDiscoveredGatewayPersonality";
    
    String MULTICASTLIST_ENTITYSCOPE_ENUM = "MultiCastListEntityScope";
    String MULTICASTLIST_MCASTTYPE_ENUM = "MultiCastListMcastType";
    
    String NEXTHOP_ENTITYSCOPE_ENUM = "NextHopEntityScope";
    
    String KEYSERVERNOTIFICATION_ENTITYSCOPE_ENUM = "KeyServerNotificationEntityScope";
    String KEYSERVERNOTIFICATION_NOTIFICATIONTYPE_ENUM = "KeyServerNotificationNotificationType";
    
    String MIRRORDESTINATION_ENTITYSCOPE_ENUM = "MirrorDestinationEntityScope";
    
    String TIER_ASSOCIATEDNETWORKOBJECTTYPE_ENUM = "TierAssociatedNetworkObjectType";
    String TIER_ENTITYSCOPE_ENUM = "TierEntityScope";
    String TIER_TYPE_ENUM = "TierType";
    
    String DOMAINFIPACLTEMPLATE_ENTITYSCOPE_ENUM = "DomainFIPAclTemplateEntityScope";
    String DOMAINFIPACLTEMPLATE_POLICYSTATE_ENUM = "DomainFIPAclTemplatePolicyState";
    String DOMAINFIPACLTEMPLATE_PRIORITYTYPE_ENUM = "DomainFIPAclTemplatePriorityType";
    
    String ADDRESSMAP_ENTITYSCOPE_ENUM = "AddressMapEntityScope";
    String ADDRESSMAP_TYPE_ENUM = "AddressMapType";
    
    String GATEWAY_ENTITYSCOPE_ENUM = "GatewayEntityScope";
    String GATEWAY_PERMITTEDACTION_ENUM = "GatewayPermittedAction";
    String GATEWAY_PERSONALITY_ENUM = "GatewayPersonality";
    
    String MULTINICVPORT_ENTITYSCOPE_ENUM = "MultiNICVPortEntityScope";
    
    
    String NSPORTTEMPLATE_ENTITYSCOPE_ENUM = "NSPortTemplateEntityScope";
    String NSPORTTEMPLATE_PORTTYPE_ENUM = "NSPortTemplatePortType";
    String NSPORTTEMPLATE_SPEED_ENUM = "NSPortTemplateSpeed";
    
    String CERTIFICATE_ENTITYSCOPE_ENUM = "CertificateEntityScope";
    
    String VCENTERDATACENTER_DESTINATIONMIRRORPORT_ENUM = "VCenterDataCenterDestinationMirrorPort";
    String VCENTERDATACENTER_ENTITYSCOPE_ENUM = "VCenterDataCenterEntityScope";
    
    String L2DOMAINTEMPLATE_DPI_ENUM = "L2DomainTemplateDPI";
    String L2DOMAINTEMPLATE_IPTYPE_ENUM = "L2DomainTemplateIPType";
    String L2DOMAINTEMPLATE_ENCRYPTION_ENUM = "L2DomainTemplateEncryption";
    String L2DOMAINTEMPLATE_ENTITYSCOPE_ENUM = "L2DomainTemplateEntityScope";
    String L2DOMAINTEMPLATE_MULTICAST_ENUM = "L2DomainTemplateMulticast";
    String L2DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM = "L2DomainTemplatePolicyChangeStatus";
    String L2DOMAINTEMPLATE_USEGLOBALMAC_ENUM = "L2DomainTemplateUseGlobalMAC";
    
    String VRSREDEPLOYMENTPOLICY_ENTITYSCOPE_ENUM = "VRSRedeploymentpolicyEntityScope";
    
    String APPLICATIONSERVICE_DIRECTION_ENUM = "ApplicationServiceDirection";
    String APPLICATIONSERVICE_ENTITYSCOPE_ENUM = "ApplicationServiceEntityScope";
    
    String IKEGATEWAY_IKEVERSION_ENUM = "IKEGatewayIKEVersion";
    String IKEGATEWAY_IKEV1MODE_ENUM = "IKEGatewayIKEv1Mode";
    String IKEGATEWAY_ENTITYSCOPE_ENUM = "IKEGatewayEntityScope";
    
    String STATSCOLLECTORINFO_ADDRESSTYPE_ENUM = "StatsCollectorInfoAddressType";
    String STATSCOLLECTORINFO_ENTITYSCOPE_ENUM = "StatsCollectorInfoEntityScope";
    
    String VCENTER_DESTINATIONMIRRORPORT_ENUM = "VCenterDestinationMirrorPort";
    String VCENTER_ENTITYSCOPE_ENUM = "VCenterEntityScope";
    
    
    String INGRESSACLENTRYTEMPLATE_ACTION_ENUM = "IngressACLEntryTemplateAction";
    String INGRESSACLENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "IngressACLEntryTemplateAssociatedApplicationObjectType";
    String INGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM = "IngressACLEntryTemplateEntityScope";
    String INGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM = "IngressACLEntryTemplateLocationType";
    String INGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM = "IngressACLEntryTemplateNetworkType";
    String INGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM = "IngressACLEntryTemplatePolicyState";
    
    String ROUTINGPOLICY_DEFAULTACTION_ENUM = "RoutingPolicyDefaultAction";
    String ROUTINGPOLICY_ENTITYSCOPE_ENUM = "RoutingPolicyEntityScope";
    
    
    String L2DOMAIN_DPI_ENUM = "L2DomainDPI";
    String L2DOMAIN_IPTYPE_ENUM = "L2DomainIPType";
    String L2DOMAIN_ENCRYPTION_ENUM = "L2DomainEncryption";
    String L2DOMAIN_ENTITYSCOPE_ENUM = "L2DomainEntityScope";
    String L2DOMAIN_MAINTENANCEMODE_ENUM = "L2DomainMaintenanceMode";
    String L2DOMAIN_MULTICAST_ENUM = "L2DomainMulticast";
    String L2DOMAIN_POLICYCHANGESTATUS_ENUM = "L2DomainPolicyChangeStatus";
    String L2DOMAIN_UPLINKPREFERENCE_ENUM = "L2DomainUplinkPreference";
    
    String IKEGATEWAYCONFIG_ENTITYSCOPE_ENUM = "IKEGatewayConfigEntityScope";
    
    String HOSTINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "HostInterfaceAttachedNetworkType";
    String HOSTINTERFACE_ENTITYSCOPE_ENUM = "HostInterfaceEntityScope";
    
    String ENTERPRISESECUREDDATA_ENTITYSCOPE_ENUM = "EnterpriseSecuredDataEntityScope";
    
    String APPLICATIONPERFORMANCEMANAGEMENT_APPLICATIONGROUPTYPE_ENUM = "ApplicationperformancemanagementApplicationGroupType";
    
    String IKECERTIFICATE_ENTITYSCOPE_ENUM = "IKECertificateEntityScope";
    
    String INGRESSEXTERNALSERVICETEMPLATE_ENTITYSCOPE_ENUM = "IngressExternalServiceTemplateEntityScope";
    String INGRESSEXTERNALSERVICETEMPLATE_POLICYSTATE_ENUM = "IngressExternalServiceTemplatePolicyState";
    String INGRESSEXTERNALSERVICETEMPLATE_PRIORITYTYPE_ENUM = "IngressExternalServiceTemplatePriorityType";
    
    String PORTTEMPLATE_ENTITYSCOPE_ENUM = "PortTemplateEntityScope";
    String PORTTEMPLATE_PORTTYPE_ENUM = "PortTemplatePortType";
    
    String ME_AVATARTYPE_ENUM = "MeAvatarType";
    String ME_ENTITYSCOPE_ENUM = "MeEntityScope";
    
    String ENDPOINT_ENTITYSCOPE_ENUM = "EndPointEntityScope";
    
    
    String DHCPOPTION_ENTITYSCOPE_ENUM = "DHCPOptionEntityScope";
    
    String KEYSERVERMEMBER_ENTITYSCOPE_ENUM = "KeyServerMemberEntityScope";
    
    String NSGATEWAY_SSHSERVICE_ENUM = "NSGatewaySSHService";
    String NSGATEWAY_TPMSTATUS_ENUM = "NSGatewayTPMStatus";
    String NSGATEWAY_BOOTSTRAPSTATUS_ENUM = "NSGatewayBootstrapStatus";
    String NSGATEWAY_CONFIGURATIONRELOADSTATE_ENUM = "NSGatewayConfigurationReloadState";
    String NSGATEWAY_CONFIGURATIONSTATUS_ENUM = "NSGatewayConfigurationStatus";
    String NSGATEWAY_ENTITYSCOPE_ENUM = "NSGatewayEntityScope";
    String NSGATEWAY_FAMILY_ENUM = "NSGatewayFamily";
    String NSGATEWAY_INHERITEDSSHSERVICESTATE_ENUM = "NSGatewayInheritedSSHServiceState";
    String NSGATEWAY_PERMITTEDACTION_ENUM = "NSGatewayPermittedAction";
    String NSGATEWAY_PERSONALITY_ENUM = "NSGatewayPersonality";
    
    String NSGATEWAYTEMPLATE_SSHSERVICE_ENUM = "NSGatewayTemplateSSHService";
    String NSGATEWAYTEMPLATE_ENTITYSCOPE_ENUM = "NSGatewayTemplateEntityScope";
    String NSGATEWAYTEMPLATE_INSTANCESSHOVERRIDE_ENUM = "NSGatewayTemplateInstanceSSHOverride";
    
    String VSC_ENTITYSCOPE_ENUM = "VSCEntityScope";
    String VSC_STATUS_ENUM = "VSCStatus";
    
    String UPLINKRD_ENTITYSCOPE_ENUM = "UplinkRDEntityScope";
    String UPLINKRD_UPLINKTYPE_ENUM = "UplinkRDUplinkType";
    
    String ZFBAUTOASSIGNMENT_ZFBMATCHATTRIBUTE_ENUM = "ZFBAutoAssignmentZFBMatchAttribute";
    String ZFBAUTOASSIGNMENT_ENTITYSCOPE_ENUM = "ZFBAutoAssignmentEntityScope";
    
    String VM_DELETEMODE_ENUM = "VMDeleteMode";
    String VM_ENTITYSCOPE_ENUM = "VMEntityScope";
    String VM_REASONTYPE_ENUM = "VMReasonType";
    String VM_STATUS_ENUM = "VMStatus";
    
    String NSPORT_NATTRAVERSAL_ENUM = "NSPortNATTraversal";
    String NSPORT_ENTITYSCOPE_ENUM = "NSPortEntityScope";
    String NSPORT_PERMITTEDACTION_ENUM = "NSPortPermittedAction";
    String NSPORT_PORTTYPE_ENUM = "NSPortPortType";
    String NSPORT_SPEED_ENUM = "NSPortSpeed";
    String NSPORT_STATUS_ENUM = "NSPortStatus";
    
    String VRSADDRESSRANGE_ENTITYSCOPE_ENUM = "VRSAddressRangeEntityScope";
    
    String BGPPROFILE_ENTITYSCOPE_ENUM = "BGPProfileEntityScope";
    
    String EGRESSQOSPOLICY_ENTITYSCOPE_ENUM = "EgressQOSPolicyEntityScope";
    String EGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue1ForwardingClasses";
    String EGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue2ForwardingClasses";
    String EGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue3ForwardingClasses";
    String EGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue4ForwardingClasses";
    
    String PUBLICNETWORKMACRO_IPTYPE_ENUM = "PublicNetworkMacroIPType";
    String PUBLICNETWORKMACRO_ENTITYSCOPE_ENUM = "PublicNetworkMacroEntityScope";
    
    String DOMAINFIPACLTEMPLATEENTRY_ACTION_ENUM = "DomainFIPAclTemplateEntryAction";
    String DOMAINFIPACLTEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "DomainFIPAclTemplateEntryAssociatedApplicationObjectType";
    String DOMAINFIPACLTEMPLATEENTRY_DESTINATIONTYPE_ENUM = "DomainFIPAclTemplateEntryDestinationType";
    String DOMAINFIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM = "DomainFIPAclTemplateEntryEntityScope";
    String DOMAINFIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM = "DomainFIPAclTemplateEntryLocationType";
    String DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM = "DomainFIPAclTemplateEntryNetworkType";
    String DOMAINFIPACLTEMPLATEENTRY_POLICYSTATE_ENUM = "DomainFIPAclTemplateEntryPolicyState";
    String DOMAINFIPACLTEMPLATEENTRY_SOURCETYPE_ENUM = "DomainFIPAclTemplateEntrySourceType";
    
    String AUTODISCOVERCLUSTER_ENTITYSCOPE_ENUM = "AutoDiscoverClusterEntityScope";
    
    String ADDRESSRANGE_DHCPPOOLTYPE_ENUM = "AddressRangeDHCPPoolType";
    String ADDRESSRANGE_IPTYPE_ENUM = "AddressRangeIPType";
    String ADDRESSRANGE_ENTITYSCOPE_ENUM = "AddressRangeEntityScope";
    
    String DOMAINTEMPLATE_DPI_ENUM = "DomainTemplateDPI";
    String DOMAINTEMPLATE_ENCRYPTION_ENUM = "DomainTemplateEncryption";
    String DOMAINTEMPLATE_ENTITYSCOPE_ENUM = "DomainTemplateEntityScope";
    String DOMAINTEMPLATE_MULTICAST_ENUM = "DomainTemplateMulticast";
    String DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM = "DomainTemplatePolicyChangeStatus";
    
    String SITEINFO_ENTITYSCOPE_ENUM = "SiteInfoEntityScope";
    
    String VMRESYNC_ENTITYSCOPE_ENUM = "VMResyncEntityScope";
    String VMRESYNC_STATUS_ENUM = "VMResyncStatus";
    
    String UPLINKCONNECTION_ADDRESS_ENUM = "UplinkConnectionAddress";
    String UPLINKCONNECTION_MODE_ENUM = "UplinkConnectionMode";
    String UPLINKCONNECTION_ROLE_ENUM = "UplinkConnectionRole";
    
    String POLICYDECISION_ENTITYSCOPE_ENUM = "PolicyDecisionEntityScope";
    
    
    String AUTODISCOVEREDDATACENTER_ENTITYSCOPE_ENUM = "AutodiscovereddatacenterEntityScope";
    
    String FLOATINGIP_ENTITYSCOPE_ENUM = "FloatingIpEntityScope";
    
    String EGRESSACLTEMPLATE_ENTITYSCOPE_ENUM = "EgressACLTemplateEntityScope";
    String EGRESSACLTEMPLATE_POLICYSTATE_ENUM = "EgressACLTemplatePolicyState";
    String EGRESSACLTEMPLATE_PRIORITYTYPE_ENUM = "EgressACLTemplatePriorityType";
    
    String MONITORINGPORT_ENTITYSCOPE_ENUM = "MonitoringPortEntityScope";
    String MONITORINGPORT_RESILIENCYSTATE_ENUM = "MonitoringPortResiliencyState";
    String MONITORINGPORT_STATE_ENUM = "MonitoringPortState";
    
    
    String AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITYSCOPE_ENUM = "AutoDiscoverHypervisorFromClusterEntityScope";
    
    String VPNCONNECTION_ENTITYSCOPE_ENUM = "VPNConnectionEntityScope";
    
    String NSREDUNDANTGATEWAYGROUP_ENTITYSCOPE_ENUM = "NSRedundantGatewayGroupEntityScope";
    String NSREDUNDANTGATEWAYGROUP_PERMITTEDACTION_ENUM = "NSRedundantGatewayGroupPermittedAction";
    String NSREDUNDANTGATEWAYGROUP_PERSONALITY_ENUM = "NSRedundantGatewayGroupPersonality";
    String NSREDUNDANTGATEWAYGROUP_REDUNDANTGATEWAYSTATUS_ENUM = "NSRedundantGatewayGroupRedundantGatewayStatus";
    
    String EXTERNALSERVICE_DIRECTION_ENUM = "ExternalServiceDirection";
    String EXTERNALSERVICE_ENTITYSCOPE_ENUM = "ExternalServiceEntityScope";
    String EXTERNALSERVICE_SERVICETYPE_ENUM = "ExternalServiceServiceType";
    String EXTERNALSERVICE_STAGE_ENUM = "ExternalServiceStage";
    
    String KEYSERVERMONITORSEK_ENTITYSCOPE_ENUM = "KeyServerMonitorSEKEntityScope";
    String KEYSERVERMONITORSEK_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM = "KeyServerMonitorSEKSeedPayloadAuthenticationAlgorithm";
    String KEYSERVERMONITORSEK_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM = "KeyServerMonitorSEKSeedPayloadEncryptionAlgorithm";
    
    String INGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM = "IngressAdvFwdTemplateEntityScope";
    String INGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM = "IngressAdvFwdTemplatePolicyState";
    String INGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM = "IngressAdvFwdTemplatePriorityType";
    
    String VPORTMIRROR_ENTITYSCOPE_ENUM = "VPortMirrorEntityScope";
    String VPORTMIRROR_MIRRORDIRECTION_ENUM = "VPortMirrorMirrorDirection";
    
    String PATNATPOOL_ASSOCIATEDGATEWAYTYPE_ENUM = "PATNATPoolAssociatedGatewayType";
    String PATNATPOOL_ENTITYSCOPE_ENUM = "PATNATPoolEntityScope";
    String PATNATPOOL_PERMITTEDACTION_ENUM = "PATNATPoolPermittedAction";
    
    String PATMAPPER_ENTITYSCOPE_ENUM = "PATMapperEntityScope";
    
    String BGPNEIGHBOR_ENTITYSCOPE_ENUM = "BGPNeighborEntityScope";
    
    String CONTAINERRESYNC_ENTITYSCOPE_ENUM = "ContainerResyncEntityScope";
    String CONTAINERRESYNC_STATUS_ENUM = "ContainerResyncStatus";
    
    String ALLALARM_ENTITYSCOPE_ENUM = "AllAlarmEntityScope";
    String ALLALARM_SEVERITY_ENUM = "AllAlarmSeverity";
    
    String IKEPSK_ENTITYSCOPE_ENUM = "IKEPSKEntityScope";
    
    String SYSTEMCONFIG_CSPROOTAUTHENTICATIONMETHOD_ENUM = "SystemConfigCsprootAuthenticationMethod";
    String SYSTEMCONFIG_DOMAINTUNNELTYPE_ENUM = "SystemConfigDomainTunnelType";
    String SYSTEMCONFIG_ENTITYSCOPE_ENUM = "SystemConfigEntityScope";
    String SYSTEMCONFIG_GROUPKEYDEFAULTSEKPAYLOADENCRYPTIONALGORITHM_ENUM = "SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm";
    String SYSTEMCONFIG_GROUPKEYDEFAULTSEKPAYLOADSIGNINGALGORITHM_ENUM = "SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm";
    String SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM = "SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm";
    String SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADENCRYPTIONALGORITHM_ENUM = "SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm";
    String SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADSIGNINGALGORITHM_ENUM = "SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm";
    String SYSTEMCONFIG_GROUPKEYDEFAULTTRAFFICAUTHENTICATIONALGORITHM_ENUM = "SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm";
    String SYSTEMCONFIG_GROUPKEYDEFAULTTRAFFICENCRYPTIONALGORITHM_ENUM = "SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm";
    String SYSTEMCONFIG_SYSTEMAVATARTYPE_ENUM = "SystemConfigSystemAvatarType";
    
    String IKEENCRYPTIONPROFILE_DPDMODE_ENUM = "IKEEncryptionprofileDPDMode";
    String IKEENCRYPTIONPROFILE_IPSECAUTHENTICATIONALGORITHM_ENUM = "IKEEncryptionprofileIPsecAuthenticationAlgorithm";
    String IKEENCRYPTIONPROFILE_IPSECENCRYPTIONALGORITHM_ENUM = "IKEEncryptionprofileIPsecEncryptionAlgorithm";
    String IKEENCRYPTIONPROFILE_IPSECSAREPLAYWINDOWSIZE_ENUM = "IKEEncryptionprofileIPsecSAReplayWindowSize";
    String IKEENCRYPTIONPROFILE_ISAKMPAUTHENTICATIONMODE_ENUM = "IKEEncryptionprofileISAKMPAuthenticationMode";
    String IKEENCRYPTIONPROFILE_ISAKMPDIFFIEHELMANGROUPIDENTIFIER_ENUM = "IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier";
    String IKEENCRYPTIONPROFILE_ISAKMPENCRYPTIONALGORITHM_ENUM = "IKEEncryptionprofileISAKMPEncryptionAlgorithm";
    String IKEENCRYPTIONPROFILE_ISAKMPHASHALGORITHM_ENUM = "IKEEncryptionprofileISAKMPHashAlgorithm";
    String IKEENCRYPTIONPROFILE_ENTITYSCOPE_ENUM = "IKEEncryptionprofileEntityScope";
    
    String FLOATINGIPACLTEMPLATEENTRY_ACTION_ENUM = "FloatingIPACLTemplateEntryAction";
    String FLOATINGIPACLTEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM = "FloatingIPACLTemplateEntryAssociatedApplicationObjectType";
    String FLOATINGIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM = "FloatingIPACLTemplateEntryEntityScope";
    String FLOATINGIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM = "FloatingIPACLTemplateEntryLocationType";
    String FLOATINGIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM = "FloatingIPACLTemplateEntryNetworkType";
    String FLOATINGIPACLTEMPLATEENTRY_POLICYSTATE_ENUM = "FloatingIPACLTemplateEntryPolicyState";
    
    String INFRASTRUCTURECONFIG_CONFIGSTATUS_ENUM = "InfrastructureConfigConfigStatus";
    String INFRASTRUCTURECONFIG_ENTITYSCOPE_ENUM = "InfrastructureConfigEntityScope";
    
    String USER_AVATARTYPE_ENUM = "UserAvatarType";
    String USER_ENTITYSCOPE_ENUM = "UserEntityScope";
    String USER_MANAGEMENTMODE_ENUM = "UserManagementMode";
    
    String NATMAPENTRY_ENTITYSCOPE_ENUM = "NATMapEntryEntityScope";
    String NATMAPENTRY_TYPE_ENUM = "NATMapEntryType";
    
    String POLICYGROUP_ENTITYSCOPE_ENUM = "PolicyGroupEntityScope";
    String POLICYGROUP_TYPE_ENUM = "PolicyGroupType";
    
    String DEMARCATIONSERVICE_TYPE_ENUM = "DemarcationServiceType";
    
    String NSGINFO_TPMSTATUS_ENUM = "NSGInfoTPMStatus";
    String NSGINFO_ENTITYSCOPE_ENUM = "NSGInfoEntityScope";
    String NSGINFO_FAMILY_ENUM = "NSGInfoFamily";
    
    String EXTERNALAPPSERVICE_EGRESSTYPE_ENUM = "ExternalAppServiceEgressType";
    String EXTERNALAPPSERVICE_ENTITYSCOPE_ENUM = "ExternalAppServiceEntityScope";
    String EXTERNALAPPSERVICE_INGRESSTYPE_ENUM = "ExternalAppServiceIngressType";
    
    String ALARM_ENTITYSCOPE_ENUM = "AlarmEntityScope";
    String ALARM_SEVERITY_ENUM = "AlarmSeverity";
    
    String BOOTSTRAP_ZFBMATCHATTRIBUTE_ENUM = "BootstrapZFBMatchAttribute";
    String BOOTSTRAP_ENTITYSCOPE_ENUM = "BootstrapEntityScope";
    String BOOTSTRAP_STATUS_ENUM = "BootstrapStatus";
    
    String FLOW_ENTITYSCOPE_ENUM = "FlowEntityScope";
    
    String VLANTEMPLATE_ENTITYSCOPE_ENUM = "VLANTemplateEntityScope";
    
    String PORTMAPPING_ENTITYSCOPE_ENUM = "PortMappingEntityScope";
    
    String GATEWAYSECURITY_ENTITYSCOPE_ENUM = "GatewaySecurityEntityScope";
    
    String GLOBALMETADATA_ENTITYSCOPE_ENUM = "GlobalMetadataEntityScope";
    
    
    String ENTERPRISE_ALLOWEDFORWARDINGCLASSES_ENUM = "EnterpriseAllowedForwardingClasses";
    String ENTERPRISE_AVATARTYPE_ENUM = "EnterpriseAvatarType";
    String ENTERPRISE_ENCRYPTIONMANAGEMENTMODE_ENUM = "EnterpriseEncryptionManagementMode";
    String ENTERPRISE_ENTITYSCOPE_ENUM = "EnterpriseEntityScope";
    
    String LINK_ACCEPTANCECRITERIA_ENUM = "LinkAcceptanceCriteria";
    String LINK_ASSOCIATEDDESTINATIONTYPE_ENUM = "LinkAssociatedDestinationType";
    String LINK_ENTITYSCOPE_ENUM = "LinkEntityScope";
    String LINK_TYPE_ENUM = "LinkType";
    
    String INGRESSACLTEMPLATE_ENTITYSCOPE_ENUM = "IngressACLTemplateEntityScope";
    String INGRESSACLTEMPLATE_POLICYSTATE_ENUM = "IngressACLTemplatePolicyState";
    String INGRESSACLTEMPLATE_PRIORITYTYPE_ENUM = "IngressACLTemplatePriorityType";
    
    
    String CONTAINERINTERFACE_IMAGE_FILENAME = "images/icon-containerinterface.png";
    String GROUPKEYENCRYPTIONPROFILE_IMAGE_FILENAME = "images/icon-groupkeyencryptionprofile.png";
    String BRCONNECTION_IMAGE_FILENAME = "images/icon-brconnection.png";
    String QOS_IMAGE_FILENAME = "images/icon-qos.png";
    String INFRASTRUCTUREACCESSPROFILE_IMAGE_FILENAME = "images/icon-infrastructureaccessprofile.png";
    String BGPPEER_IMAGE_FILENAME = "images/icon-bgppeer.png";
    String SHAREDNETWORKRESOURCE_IMAGE_FILENAME = "images/icon-sharednetworkresource.png";
    String VIRTUALIP_IMAGE_FILENAME = "images/icon-virtualip.png";
    String DSCPFORWARDINGCLASSTABLE_IMAGE_FILENAME = "images/icon-dscpforwardingclasstable.png";
    String MULTICASTCHANNELMAP_IMAGE_FILENAME = "images/icon-multicastchannelmap.png";
    String REDUNDANCYGROUP_IMAGE_FILENAME = "images/icon-redundancygroup.png";
    String TCA_IMAGE_FILENAME = "images/icon-tca.png";
    String GROUP_IMAGE_FILENAME = "images/icon-group.png";
    String VSGREDUNDANTPORT_IMAGE_FILENAME = "images/icon-vsgredundantport.png";
    String ZONE_IMAGE_FILENAME = "images/icon-zone.png";
    String APPLICATION_IMAGE_FILENAME = "images/icon-application.png";
    String IKEGATEWAYPROFILE_IMAGE_FILENAME = "images/icon-ikegatewayprofile.png";
    String IKESUBNET_IMAGE_FILENAME = "images/icon-ikesubnet.png";
    String INFRASTRUCTUREGATEWAYPROFILE_IMAGE_FILENAME = "images/icon-infrastructuregatewayprofile.png";
    String DISKSTAT_IMAGE_FILENAME = "images/icon-diskstat.png";
    String POLICYGROUPTEMPLATE_IMAGE_FILENAME = "images/icon-policygrouptemplate.png";
    String FLOWSECURITYPOLICY_IMAGE_FILENAME = "images/icon-flowsecuritypolicy.png";
    String VCENTEREAMCONFIG_IMAGE_FILENAME = "images/icon-vcentereamconfig.png";
    String LOCATION_IMAGE_FILENAME = "images/icon-location.png";
    String ENTERPRISESECURITY_IMAGE_FILENAME = "images/icon-enterprisesecurity.png";
    String VCENTERVRSCONFIG_IMAGE_FILENAME = "images/icon-vcentervrsconfig.png";
    String ENTERPRISENETWORK_IMAGE_FILENAME = "images/icon-enterprisenetwork.png";
    String INFRASTRUCTUREVSCPROFILE_IMAGE_FILENAME = "images/icon-infrastructurevscprofile.png";
    String PERMISSION_IMAGE_FILENAME = "images/icon-permission.png";
    String IPRESERVATION_IMAGE_FILENAME = "images/icon-ipreservation.png";
    String REDIRECTIONTARGETTEMPLATE_IMAGE_FILENAME = "images/icon-redirectiontargettemplate.png";
    String SUBNETTEMPLATE_IMAGE_FILENAME = "images/icon-subnettemplate.png";
    String METADATATAG_IMAGE_FILENAME = "images/icon-metadatatag.png";
    String FLOATINGIPACLTEMPLATE_IMAGE_FILENAME = "images/icon-floatingipacltemplate.png";
    String IKEGATEWAYCONNECTION_IMAGE_FILENAME = "images/icon-ikegatewayconnection.png";
    String REDIRECTIONTARGET_IMAGE_FILENAME = "images/icon-redirectiontarget.png";
    String PATIPENTRY_IMAGE_FILENAME = "images/icon-patipentry.png";
    String AGGREGATEMETADATA_IMAGE_FILENAME = "images/icon-aggregatemetadata.png";
    String EGRESSACLENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-egressaclentrytemplate.png";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_IMAGE_FILENAME = "images/icon-ingressexternalservicetemplateentry.png";
    String AVATAR_IMAGE_FILENAME = "images/icon-avatar.png";
    String OVERLAYADDRESSPOOL_IMAGE_FILENAME = "images/icon-overlayaddresspool.png";
    String BOOTSTRAPACTIVATION_IMAGE_FILENAME = "images/icon-bootstrapactivation.png";
    String LICENSESTATUS_IMAGE_FILENAME = "images/icon-licensestatus.png";
    String METADATA_IMAGE_FILENAME = "images/icon-metadata.png";
    String CLOUDMGMTSYSTEM_IMAGE_FILENAME = "images/icon-cloudmgmtsystem.png";
    String VSP_IMAGE_FILENAME = "images/icon-vsp.png";
    String DOMAIN_IMAGE_FILENAME = "images/icon-domain.png";
    String REDUNDANTPORT_IMAGE_FILENAME = "images/icon-redundantport.png";
    String DSCPFORWARDINGCLASSMAPPING_IMAGE_FILENAME = "images/icon-dscpforwardingclassmapping.png";
    String NETWORKLAYOUT_IMAGE_FILENAME = "images/icon-networklayout.png";
    String OVERLAYPATNATENTRY_IMAGE_FILENAME = "images/icon-overlaypatnatentry.png";
    String WANSERVICE_IMAGE_FILENAME = "images/icon-wanservice.png";
    String VSD_IMAGE_FILENAME = "images/icon-vsd.png";
    String VPORT_IMAGE_FILENAME = "images/icon-vport.png";
    String FLOWFORWARDINGPOLICY_IMAGE_FILENAME = "images/icon-flowforwardingpolicy.png";
    String PORT_IMAGE_FILENAME = "images/icon-port.png";
    String STATISTICSPOLICY_IMAGE_FILENAME = "images/icon-statisticspolicy.png";
    String SUBNET_IMAGE_FILENAME = "images/icon-subnet.png";
    String CONTAINER_IMAGE_FILENAME = "images/icon-container.png";
    String RATELIMITER_IMAGE_FILENAME = "images/icon-ratelimiter.png";
    String KEYSERVERMONITORENCRYPTEDSEED_IMAGE_FILENAME = "images/icon-keyservermonitorencryptedseed.png";
    String ZONETEMPLATE_IMAGE_FILENAME = "images/icon-zonetemplate.png";
    String KEYSERVERMONITORSEED_IMAGE_FILENAME = "images/icon-keyservermonitorseed.png";
    String GATEWAYTEMPLATE_IMAGE_FILENAME = "images/icon-gatewaytemplate.png";
    String VRS_IMAGE_FILENAME = "images/icon-vrs.png";
    String HSC_IMAGE_FILENAME = "images/icon-hsc.png";
    String VLAN_IMAGE_FILENAME = "images/icon-vlan.png";
    String LDAPCONFIGURATION_IMAGE_FILENAME = "images/icon-ldapconfiguration.png";
    String VSDCOMPONENT_IMAGE_FILENAME = "images/icon-vsdcomponent.png";
    String ZFBREQUEST_IMAGE_FILENAME = "images/icon-zfbrequest.png";
    String ENTERPRISEPERMISSION_IMAGE_FILENAME = "images/icon-enterprisepermission.png";
    String STATICROUTE_IMAGE_FILENAME = "images/icon-staticroute.png";
    String JOB_IMAGE_FILENAME = "images/icon-job.png";
    String VMINTERFACE_IMAGE_FILENAME = "images/icon-vminterface.png";
    String GATEWAYSECUREDDATA_IMAGE_FILENAME = "images/icon-gatewaysecureddata.png";
    String VCENTERHYPERVISOR_IMAGE_FILENAME = "images/icon-vcenterhypervisor.png";
    String KEYSERVERMONITOR_IMAGE_FILENAME = "images/icon-keyservermonitor.png";
    String VRSMETRICS_IMAGE_FILENAME = "images/icon-vrsmetrics.png";
    String EVENTLOG_IMAGE_FILENAME = "images/icon-eventlog.png";
    String LICENSE_IMAGE_FILENAME = "images/icon-license.png";
    String VIA_IMAGE_FILENAME = "images/icon-via.png";
    String ENTERPRISEPROFILE_IMAGE_FILENAME = "images/icon-enterpriseprofile.png";
    String PERFORMANCEMONITOR_IMAGE_FILENAME = "images/icon-performancemonitor.png";
    String NEXTHOPADDRESS_IMAGE_FILENAME = "images/icon-nexthopaddress.png";
    String BRIDGEINTERFACE_IMAGE_FILENAME = "images/icon-bridgeinterface.png";
    String VCENTERCLUSTER_IMAGE_FILENAME = "images/icon-vcentercluster.png";
    String MULTICASTRANGE_IMAGE_FILENAME = "images/icon-multicastrange.png";
    String NETWORKMACROGROUP_IMAGE_FILENAME = "images/icon-networkmacrogroup.png";
    String INGRESSADVFWDENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-ingressadvfwdentrytemplate.png";
    String APPLICATIONBINDING_IMAGE_FILENAME = "images/icon-applicationbinding.png";
    String AUTODISCOVEREDGATEWAY_IMAGE_FILENAME = "images/icon-autodiscoveredgateway.png";
    String MULTICASTLIST_IMAGE_FILENAME = "images/icon-multicastlist.png";
    String NEXTHOP_IMAGE_FILENAME = "images/icon-nexthop.png";
    String KEYSERVERNOTIFICATION_IMAGE_FILENAME = "images/icon-keyservernotification.png";
    String MIRRORDESTINATION_IMAGE_FILENAME = "images/icon-mirrordestination.png";
    String TIER_IMAGE_FILENAME = "images/icon-tier.png";
    String DOMAINFIPACLTEMPLATE_IMAGE_FILENAME = "images/icon-domainfipacltemplate.png";
    String ADDRESSMAP_IMAGE_FILENAME = "images/icon-addressmap.png";
    String GATEWAY_IMAGE_FILENAME = "images/icon-gateway.png";
    String MULTINICVPORT_IMAGE_FILENAME = "images/icon-multinicvport.png";
    String STATISTICS_IMAGE_FILENAME = "images/icon-statistics.png";
    String NSPORTTEMPLATE_IMAGE_FILENAME = "images/icon-nsporttemplate.png";
    String CERTIFICATE_IMAGE_FILENAME = "images/icon-certificate.png";
    String VCENTERDATACENTER_IMAGE_FILENAME = "images/icon-vcenterdatacenter.png";
    String L2DOMAINTEMPLATE_IMAGE_FILENAME = "images/icon-l2domaintemplate.png";
    String VRSREDEPLOYMENTPOLICY_IMAGE_FILENAME = "images/icon-vrsredeploymentpolicy.png";
    String APPLICATIONSERVICE_IMAGE_FILENAME = "images/icon-applicationservice.png";
    String IKEGATEWAY_IMAGE_FILENAME = "images/icon-ikegateway.png";
    String STATSCOLLECTORINFO_IMAGE_FILENAME = "images/icon-statscollectorinfo.png";
    String VCENTER_IMAGE_FILENAME = "images/icon-vcenter.png";
    String BULKSTATISTICS_IMAGE_FILENAME = "images/icon-bulkstatistics.png";
    String INGRESSACLENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-ingressaclentrytemplate.png";
    String ROUTINGPOLICY_IMAGE_FILENAME = "images/icon-routingpolicy.png";
    String NETWORKPERFORMANCEBINDING_IMAGE_FILENAME = "images/icon-networkperformancebinding.png";
    String L2DOMAIN_IMAGE_FILENAME = "images/icon-l2domain.png";
    String IKEGATEWAYCONFIG_IMAGE_FILENAME = "images/icon-ikegatewayconfig.png";
    String HOSTINTERFACE_IMAGE_FILENAME = "images/icon-hostinterface.png";
    String ENTERPRISESECUREDDATA_IMAGE_FILENAME = "images/icon-enterprisesecureddata.png";
    String APPLICATIONPERFORMANCEMANAGEMENT_IMAGE_FILENAME = "images/icon-applicationperformancemanagement.png";
    String IKECERTIFICATE_IMAGE_FILENAME = "images/icon-ikecertificate.png";
    String INGRESSEXTERNALSERVICETEMPLATE_IMAGE_FILENAME = "images/icon-ingressexternalservicetemplate.png";
    String PORTTEMPLATE_IMAGE_FILENAME = "images/icon-porttemplate.png";
    String ME_IMAGE_FILENAME = "images/icon-me.png";
    String ENDPOINT_IMAGE_FILENAME = "images/icon-endpoint.png";
    String L7APPLICATIONSIGNATURE_IMAGE_FILENAME = "images/icon-l7applicationsignature.png";
    String DHCPOPTION_IMAGE_FILENAME = "images/icon-dhcpoption.png";
    String KEYSERVERMEMBER_IMAGE_FILENAME = "images/icon-keyservermember.png";
    String NSGATEWAY_IMAGE_FILENAME = "images/icon-nsgateway.png";
    String NSGATEWAYTEMPLATE_IMAGE_FILENAME = "images/icon-nsgatewaytemplate.png";
    String VSC_IMAGE_FILENAME = "images/icon-vsc.png";
    String UPLINKRD_IMAGE_FILENAME = "images/icon-uplinkrd.png";
    String ZFBAUTOASSIGNMENT_IMAGE_FILENAME = "images/icon-zfbautoassignment.png";
    String VM_IMAGE_FILENAME = "images/icon-vm.png";
    String NSPORT_IMAGE_FILENAME = "images/icon-nsport.png";
    String VRSADDRESSRANGE_IMAGE_FILENAME = "images/icon-vrsaddressrange.png";
    String BGPPROFILE_IMAGE_FILENAME = "images/icon-bgpprofile.png";
    String EGRESSQOSPOLICY_IMAGE_FILENAME = "images/icon-egressqospolicy.png";
    String PUBLICNETWORKMACRO_IMAGE_FILENAME = "images/icon-publicnetworkmacro.png";
    String DOMAINFIPACLTEMPLATEENTRY_IMAGE_FILENAME = "images/icon-domainfipacltemplateentry.png";
    String AUTODISCOVERCLUSTER_IMAGE_FILENAME = "images/icon-autodiscovercluster.png";
    String ADDRESSRANGE_IMAGE_FILENAME = "images/icon-addressrange.png";
    String DOMAINTEMPLATE_IMAGE_FILENAME = "images/icon-domaintemplate.png";
    String SITEINFO_IMAGE_FILENAME = "images/icon-siteinfo.png";
    String VMRESYNC_IMAGE_FILENAME = "images/icon-vmresync.png";
    String UPLINKCONNECTION_IMAGE_FILENAME = "images/icon-uplinkconnection.png";
    String POLICYDECISION_IMAGE_FILENAME = "images/icon-policydecision.png";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING_IMAGE_FILENAME = "images/icon-applicationperformancemanagementbinding.png";
    String AUTODISCOVEREDDATACENTER_IMAGE_FILENAME = "images/icon-autodiscovereddatacenter.png";
    String FLOATINGIP_IMAGE_FILENAME = "images/icon-floatingip.png";
    String EGRESSACLTEMPLATE_IMAGE_FILENAME = "images/icon-egressacltemplate.png";
    String MONITORINGPORT_IMAGE_FILENAME = "images/icon-monitoringport.png";
    String MONITORSCOPE_IMAGE_FILENAME = "images/icon-monitorscope.png";
    String AUTODISCOVERHYPERVISORFROMCLUSTER_IMAGE_FILENAME = "images/icon-autodiscoverhypervisorfromcluster.png";
    String VPNCONNECTION_IMAGE_FILENAME = "images/icon-vpnconnection.png";
    String NSREDUNDANTGATEWAYGROUP_IMAGE_FILENAME = "images/icon-nsredundantgatewaygroup.png";
    String EXTERNALSERVICE_IMAGE_FILENAME = "images/icon-externalservice.png";
    String KEYSERVERMONITORSEK_IMAGE_FILENAME = "images/icon-keyservermonitorsek.png";
    String INGRESSADVFWDTEMPLATE_IMAGE_FILENAME = "images/icon-ingressadvfwdtemplate.png";
    String VPORTMIRROR_IMAGE_FILENAME = "images/icon-vportmirror.png";
    String PATNATPOOL_IMAGE_FILENAME = "images/icon-patnatpool.png";
    String PATMAPPER_IMAGE_FILENAME = "images/icon-patmapper.png";
    String BGPNEIGHBOR_IMAGE_FILENAME = "images/icon-bgpneighbor.png";
    String CONTAINERRESYNC_IMAGE_FILENAME = "images/icon-containerresync.png";
    String ALLALARM_IMAGE_FILENAME = "images/icon-allalarm.png";
    String IKEPSK_IMAGE_FILENAME = "images/icon-ikepsk.png";
    String SYSTEMCONFIG_IMAGE_FILENAME = "images/icon-systemconfig.png";
    String IKEENCRYPTIONPROFILE_IMAGE_FILENAME = "images/icon-ikeencryptionprofile.png";
    String FLOATINGIPACLTEMPLATEENTRY_IMAGE_FILENAME = "images/icon-floatingipacltemplateentry.png";
    String INFRASTRUCTURECONFIG_IMAGE_FILENAME = "images/icon-infrastructureconfig.png";
    String USER_IMAGE_FILENAME = "images/icon-user.png";
    String NATMAPENTRY_IMAGE_FILENAME = "images/icon-natmapentry.png";
    String POLICYGROUP_IMAGE_FILENAME = "images/icon-policygroup.png";
    String DEMARCATIONSERVICE_IMAGE_FILENAME = "images/icon-demarcationservice.png";
    String NSGINFO_IMAGE_FILENAME = "images/icon-nsginfo.png";
    String EXTERNALAPPSERVICE_IMAGE_FILENAME = "images/icon-externalappservice.png";
    String ALARM_IMAGE_FILENAME = "images/icon-alarm.png";
    String BOOTSTRAP_IMAGE_FILENAME = "images/icon-bootstrap.png";
    String FLOW_IMAGE_FILENAME = "images/icon-flow.png";
    String VLANTEMPLATE_IMAGE_FILENAME = "images/icon-vlantemplate.png";
    String PORTMAPPING_IMAGE_FILENAME = "images/icon-portmapping.png";
    String GATEWAYSECURITY_IMAGE_FILENAME = "images/icon-gatewaysecurity.png";
    String GLOBALMETADATA_IMAGE_FILENAME = "images/icon-globalmetadata.png";
    String NETWORKPERFORMANCEMEASUREMENT_IMAGE_FILENAME = "images/icon-networkperformancemeasurement.png";
    String ENTERPRISE_IMAGE_FILENAME = "images/icon-enterprise.png";
    String LINK_IMAGE_FILENAME = "images/icon-link.png";
    String INGRESSACLTEMPLATE_IMAGE_FILENAME = "images/icon-ingressacltemplate.png";
    String FOLDER_IMAGE_FILENAME = "images/icon-folder.png";

    
    String CONTAINERINTERFACE_ENTITY_TYPE = "containerinterface";
    String GROUPKEYENCRYPTIONPROFILE_ENTITY_TYPE = "groupkeyencryptionprofile";
    String BRCONNECTION_ENTITY_TYPE = "brconnections";
    String QOS_ENTITY_TYPE = "qos";
    String INFRASTRUCTUREACCESSPROFILE_ENTITY_TYPE = "infrastructureaccessprofile";
    String BGPPEER_ENTITY_TYPE = "bgppeer";
    String SHAREDNETWORKRESOURCE_ENTITY_TYPE = "sharednetworkresource";
    String VIRTUALIP_ENTITY_TYPE = "virtualip";
    String DSCPFORWARDINGCLASSTABLE_ENTITY_TYPE = "dscpforwardingclasstable";
    String MULTICASTCHANNELMAP_ENTITY_TYPE = "multicastchannelmap";
    String REDUNDANCYGROUP_ENTITY_TYPE = "redundancygroup";
    String TCA_ENTITY_TYPE = "tca";
    String GROUP_ENTITY_TYPE = "group";
    String VSGREDUNDANTPORT_ENTITY_TYPE = "vsgredundantport";
    String ZONE_ENTITY_TYPE = "zone";
    String APPLICATION_ENTITY_TYPE = "application";
    String IKEGATEWAYPROFILE_ENTITY_TYPE = "ikegatewayprofile";
    String IKESUBNET_ENTITY_TYPE = "ikesubnet";
    String INFRASTRUCTUREGATEWAYPROFILE_ENTITY_TYPE = "infrastructuregatewayprofile";
    String DISKSTAT_ENTITY_TYPE = "diskstat";
    String POLICYGROUPTEMPLATE_ENTITY_TYPE = "policygrouptemplate";
    String FLOWSECURITYPOLICY_ENTITY_TYPE = "flowsecuritypolicy";
    String VCENTEREAMCONFIG_ENTITY_TYPE = "eamconfig";
    String LOCATION_ENTITY_TYPE = "location";
    String ENTERPRISESECURITY_ENTITY_TYPE = "enterprisesecurity";
    String VCENTERVRSCONFIG_ENTITY_TYPE = "vrsconfig";
    String ENTERPRISENETWORK_ENTITY_TYPE = "enterprisenetwork";
    String INFRASTRUCTUREVSCPROFILE_ENTITY_TYPE = "infrastructurevscprofile";
    String PERMISSION_ENTITY_TYPE = "permission";
    String IPRESERVATION_ENTITY_TYPE = "ipreservation";
    String REDIRECTIONTARGETTEMPLATE_ENTITY_TYPE = "redirectiontargettemplate";
    String SUBNETTEMPLATE_ENTITY_TYPE = "subnettemplate";
    String METADATATAG_ENTITY_TYPE = "metadatatag";
    String FLOATINGIPACLTEMPLATE_ENTITY_TYPE = "egressfloatingipacltemplate";
    String IKEGATEWAYCONNECTION_ENTITY_TYPE = "ikegatewayconnection";
    String REDIRECTIONTARGET_ENTITY_TYPE = "redirectiontarget";
    String PATIPENTRY_ENTITY_TYPE = "patipentry";
    String AGGREGATEMETADATA_ENTITY_TYPE = "aggregatemetadata";
    String EGRESSACLENTRYTEMPLATE_ENTITY_TYPE = "egressaclentrytemplate";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ENTITY_TYPE = "ingressexternalserviceentrytemplate";
    String AVATAR_ENTITY_TYPE = "avatar";
    String OVERLAYADDRESSPOOL_ENTITY_TYPE = "overlayaddresspool";
    String BOOTSTRAPACTIVATION_ENTITY_TYPE = "bootstrapactivation";
    String LICENSESTATUS_ENTITY_TYPE = "licensestatus";
    String METADATA_ENTITY_TYPE = "metadata";
    String CLOUDMGMTSYSTEM_ENTITY_TYPE = "cms";
    String VSP_ENTITY_TYPE = "vsp";
    String DOMAIN_ENTITY_TYPE = "domain";
    String REDUNDANTPORT_ENTITY_TYPE = "nsredundantport";
    String DSCPFORWARDINGCLASSMAPPING_ENTITY_TYPE = "dscpforwardingclassmapping";
    String NETWORKLAYOUT_ENTITY_TYPE = "networklayout";
    String OVERLAYPATNATENTRY_ENTITY_TYPE = "overlaypatnatentry";
    String WANSERVICE_ENTITY_TYPE = "service";
    String VSD_ENTITY_TYPE = "vsd";
    String VPORT_ENTITY_TYPE = "vport";
    String FLOWFORWARDINGPOLICY_ENTITY_TYPE = "flowforwardingpolicy";
    String PORT_ENTITY_TYPE = "port";
    String STATISTICSPOLICY_ENTITY_TYPE = "statisticspolicy";
    String SUBNET_ENTITY_TYPE = "subnet";
    String CONTAINER_ENTITY_TYPE = "container";
    String RATELIMITER_ENTITY_TYPE = "ratelimiter";
    String KEYSERVERMONITORENCRYPTEDSEED_ENTITY_TYPE = "keyservermonitorencryptedseed";
    String ZONETEMPLATE_ENTITY_TYPE = "zonetemplate";
    String KEYSERVERMONITORSEED_ENTITY_TYPE = "keyservermonitorseed";
    String GATEWAYTEMPLATE_ENTITY_TYPE = "gatewaytemplate";
    String VRS_ENTITY_TYPE = "vrs";
    String HSC_ENTITY_TYPE = "hsc";
    String VLAN_ENTITY_TYPE = "vlan";
    String LDAPCONFIGURATION_ENTITY_TYPE = "ldapconfiguration";
    String VSDCOMPONENT_ENTITY_TYPE = "component";
    String ZFBREQUEST_ENTITY_TYPE = "zfbrequest";
    String ENTERPRISEPERMISSION_ENTITY_TYPE = "enterprisepermission";
    String STATICROUTE_ENTITY_TYPE = "staticroute";
    String JOB_ENTITY_TYPE = "job";
    String VMINTERFACE_ENTITY_TYPE = "vminterface";
    String GATEWAYSECUREDDATA_ENTITY_TYPE = "gatewaysecureddata";
    String VCENTERHYPERVISOR_ENTITY_TYPE = "vcenterhypervisor";
    String KEYSERVERMONITOR_ENTITY_TYPE = "keyservermonitor";
    String VRSMETRICS_ENTITY_TYPE = "vrsmetrics";
    String EVENTLOG_ENTITY_TYPE = "eventlog";
    String LICENSE_ENTITY_TYPE = "license";
    String VIA_ENTITY_TYPE = "via";
    String ENTERPRISEPROFILE_ENTITY_TYPE = "enterpriseprofile";
    String PERFORMANCEMONITOR_ENTITY_TYPE = "performancemonitor";
    String NEXTHOPADDRESS_ENTITY_TYPE = "nexthopaddress";
    String BRIDGEINTERFACE_ENTITY_TYPE = "bridgeinterface";
    String VCENTERCLUSTER_ENTITY_TYPE = "vcentercluster";
    String MULTICASTRANGE_ENTITY_TYPE = "multicastrange";
    String NETWORKMACROGROUP_ENTITY_TYPE = "networkmacrogroup";
    String INGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE = "ingressadvfwdentrytemplate";
    String APPLICATIONBINDING_ENTITY_TYPE = "applicationbinding";
    String AUTODISCOVEREDGATEWAY_ENTITY_TYPE = "autodiscoveredgateway";
    String MULTICASTLIST_ENTITY_TYPE = "multicastlist";
    String NEXTHOP_ENTITY_TYPE = "nexthop";
    String KEYSERVERNOTIFICATION_ENTITY_TYPE = "keyservernotification";
    String MIRRORDESTINATION_ENTITY_TYPE = "mirrordestination";
    String TIER_ENTITY_TYPE = "tier";
    String DOMAINFIPACLTEMPLATE_ENTITY_TYPE = "egressdomainfloatingipacltemplate";
    String ADDRESSMAP_ENTITY_TYPE = "addressmap";
    String GATEWAY_ENTITY_TYPE = "gateway";
    String MULTINICVPORT_ENTITY_TYPE = "multinicvport";
    String STATISTICS_ENTITY_TYPE = "statistics";
    String NSPORTTEMPLATE_ENTITY_TYPE = "nsporttemplate";
    String CERTIFICATE_ENTITY_TYPE = "certificate";
    String VCENTERDATACENTER_ENTITY_TYPE = "vcenterdatacenter";
    String L2DOMAINTEMPLATE_ENTITY_TYPE = "l2domaintemplate";
    String VRSREDEPLOYMENTPOLICY_ENTITY_TYPE = "vrsredeploymentpolicy";
    String APPLICATIONSERVICE_ENTITY_TYPE = "applicationservice";
    String IKEGATEWAY_ENTITY_TYPE = "ikegateway";
    String STATSCOLLECTORINFO_ENTITY_TYPE = "statisticscollector";
    String VCENTER_ENTITY_TYPE = "vcenter";
    String BULKSTATISTICS_ENTITY_TYPE = "bulkstatistics";
    String INGRESSACLENTRYTEMPLATE_ENTITY_TYPE = "ingressaclentrytemplate";
    String ROUTINGPOLICY_ENTITY_TYPE = "routingpolicy";
    String NETWORKPERFORMANCEBINDING_ENTITY_TYPE = "networkperformancebinding";
    String L2DOMAIN_ENTITY_TYPE = "l2domain";
    String IKEGATEWAYCONFIG_ENTITY_TYPE = "ikegatewayconfig";
    String HOSTINTERFACE_ENTITY_TYPE = "hostinterface";
    String ENTERPRISESECUREDDATA_ENTITY_TYPE = "enterprisesecureddata";
    String APPLICATIONPERFORMANCEMANAGEMENT_ENTITY_TYPE = "applicationperformancemanagement";
    String IKECERTIFICATE_ENTITY_TYPE = "ikecertificate";
    String INGRESSEXTERNALSERVICETEMPLATE_ENTITY_TYPE = "ingressexternalservicetemplate";
    String PORTTEMPLATE_ENTITY_TYPE = "porttemplate";
    String ME_ENTITY_TYPE = "me";
    String ENDPOINT_ENTITY_TYPE = "endpoint";
    String L7APPLICATIONSIGNATURE_ENTITY_TYPE = "l7applicationsignature";
    String DHCPOPTION_ENTITY_TYPE = "dhcpoption";
    String KEYSERVERMEMBER_ENTITY_TYPE = "keyservermember";
    String NSGATEWAY_ENTITY_TYPE = "nsgateway";
    String NSGATEWAYTEMPLATE_ENTITY_TYPE = "nsgatewaytemplate";
    String VSC_ENTITY_TYPE = "vsc";
    String UPLINKRD_ENTITY_TYPE = "uplinkroutedistinguisher";
    String ZFBAUTOASSIGNMENT_ENTITY_TYPE = "zfbautoassignment";
    String VM_ENTITY_TYPE = "vm";
    String NSPORT_ENTITY_TYPE = "nsport";
    String VRSADDRESSRANGE_ENTITY_TYPE = "vrsaddressrange";
    String BGPPROFILE_ENTITY_TYPE = "bgpprofile";
    String EGRESSQOSPOLICY_ENTITY_TYPE = "egressqospolicy";
    String PUBLICNETWORKMACRO_ENTITY_TYPE = "publicnetwork";
    String DOMAINFIPACLTEMPLATEENTRY_ENTITY_TYPE = "egressdomainfloatingipaclentrytemplate";
    String AUTODISCOVERCLUSTER_ENTITY_TYPE = "autodiscoveredcluster";
    String ADDRESSRANGE_ENTITY_TYPE = "addressrange";
    String DOMAINTEMPLATE_ENTITY_TYPE = "domaintemplate";
    String SITEINFO_ENTITY_TYPE = "site";
    String VMRESYNC_ENTITY_TYPE = "resync";
    String UPLINKCONNECTION_ENTITY_TYPE = "uplinkconnection";
    String POLICYDECISION_ENTITY_TYPE = "policydecision";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITY_TYPE = "applicationperformancemanagementbinding";
    String AUTODISCOVEREDDATACENTER_ENTITY_TYPE = "autodiscovereddatacenter";
    String FLOATINGIP_ENTITY_TYPE = "floatingip";
    String EGRESSACLTEMPLATE_ENTITY_TYPE = "egressacltemplate";
    String MONITORINGPORT_ENTITY_TYPE = "monitoringport";
    String MONITORSCOPE_ENTITY_TYPE = "monitorscope";
    String AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITY_TYPE = "autodiscoveredhypervisor";
    String VPNCONNECTION_ENTITY_TYPE = "vpnconnection";
    String NSREDUNDANTGATEWAYGROUP_ENTITY_TYPE = "nsgredundancygroup";
    String EXTERNALSERVICE_ENTITY_TYPE = "externalservice";
    String KEYSERVERMONITORSEK_ENTITY_TYPE = "keyservermonitorsek";
    String INGRESSADVFWDTEMPLATE_ENTITY_TYPE = "ingressadvfwdtemplate";
    String VPORTMIRROR_ENTITY_TYPE = "vportmirror";
    String PATNATPOOL_ENTITY_TYPE = "patnatpool";
    String PATMAPPER_ENTITY_TYPE = "patmapper";
    String BGPNEIGHBOR_ENTITY_TYPE = "bgpneighbor";
    String CONTAINERRESYNC_ENTITY_TYPE = "containerresync";
    String ALLALARM_ENTITY_TYPE = "allalarm";
    String IKEPSK_ENTITY_TYPE = "ikepsk";
    String SYSTEMCONFIG_ENTITY_TYPE = "systemconfig";
    String IKEENCRYPTIONPROFILE_ENTITY_TYPE = "ikeencryptionprofile";
    String FLOATINGIPACLTEMPLATEENTRY_ENTITY_TYPE = "egressfloatingipaclentrytemplate";
    String INFRASTRUCTURECONFIG_ENTITY_TYPE = "infraconfig";
    String USER_ENTITY_TYPE = "user";
    String NATMAPENTRY_ENTITY_TYPE = "natmapentry";
    String POLICYGROUP_ENTITY_TYPE = "policygroup";
    String DEMARCATIONSERVICE_ENTITY_TYPE = "demarcationservice";
    String NSGINFO_ENTITY_TYPE = "nsginfo";
    String EXTERNALAPPSERVICE_ENTITY_TYPE = "externalappservice";
    String ALARM_ENTITY_TYPE = "alarm";
    String BOOTSTRAP_ENTITY_TYPE = "bootstrap";
    String FLOW_ENTITY_TYPE = "flow";
    String VLANTEMPLATE_ENTITY_TYPE = "vlantemplate";
    String PORTMAPPING_ENTITY_TYPE = "portmapping";
    String GATEWAYSECURITY_ENTITY_TYPE = "gatewaysecurity";
    String GLOBALMETADATA_ENTITY_TYPE = "globalmetadata";
    String NETWORKPERFORMANCEMEASUREMENT_ENTITY_TYPE = "networkperformancemeasurement";
    String ENTERPRISE_ENTITY_TYPE = "enterprise";
    String LINK_ENTITY_TYPE = "link";
    String INGRESSACLTEMPLATE_ENTITY_TYPE = "ingressacltemplate";}