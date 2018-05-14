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
    
    
    String ADDRESSMAP = "AddressMap";
    String ADDRESSMAPS = "AddressMaps";
    String ADDRESSRANGE = "AddressRange";
    String ADDRESSRANGES = "AddressRanges";
    String AGGREGATEMETADATA = "AggregateMetadata";
    String AGGREGATEMETADATAS = "AggregateMetadatas";
    String ALARM = "Alarm";
    String ALARMS = "Alarms";
    String ALLALARM = "AllAlarm";
    String ALLALARMS = "AllAlarms";
    String APPLICATION = "Application";
    String APPLICATIONS = "Applications";
    String APPLICATIONBINDING = "ApplicationBinding";
    String APPLICATIONBINDINGS = "ApplicationBindings";
    String APPLICATIONPERFORMANCEMANAGEMENT = "Applicationperformancemanagement";
    String APPLICATIONPERFORMANCEMANAGEMENTS = "Applicationperformancemanagements";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING = "Applicationperformancemanagementbinding";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDINGS = "Applicationperformancemanagementbindings";
    String AUTODISCOVERCLUSTER = "AutoDiscoverCluster";
    String AUTODISCOVERCLUSTERS = "AutoDiscoverClusters";
    String AUTODISCOVEREDDATACENTER = "Autodiscovereddatacenter";
    String AUTODISCOVEREDDATACENTERS = "Autodiscovereddatacenters";
    String AUTODISCOVEREDGATEWAY = "AutoDiscoveredGateway";
    String AUTODISCOVEREDGATEWAYS = "AutoDiscoveredGateways";
    String AUTODISCOVERHYPERVISORFROMCLUSTER = "AutoDiscoverHypervisorFromCluster";
    String AUTODISCOVERHYPERVISORFROMCLUSTERS = "AutoDiscoverHypervisorFromClusters";
    String AVATAR = "Avatar";
    String AVATARS = "Avatars";
    String BFDSESSION = "BFDSession";
    String BFDSESSIONS = "BFDSessions";
    String BGPNEIGHBOR = "BGPNeighbor";
    String BGPNEIGHBORS = "BGPNeighbors";
    String BGPPEER = "BGPPeer";
    String BGPPEERS = "BGPPeers";
    String BGPPROFILE = "BGPProfile";
    String BGPPROFILES = "BGPProfiles";
    String BOOTSTRAP = "Bootstrap";
    String BOOTSTRAPS = "Bootstraps";
    String BOOTSTRAPACTIVATION = "BootstrapActivation";
    String BOOTSTRAPACTIVATIONS = "BootstrapActivations";
    String BRCONNECTION = "BRConnection";
    String BRCONNECTIONS = "BRConnections";
    String BRIDGEINTERFACE = "BridgeInterface";
    String BRIDGEINTERFACES = "BridgeInterfaces";
    String BULKSTATISTICS = "BulkStatistics";
    
    String CAPTIVEPORTALPROFILE = "CaptivePortalProfile";
    String CAPTIVEPORTALPROFILES = "CaptivePortalProfiles";
    String CERTIFICATE = "Certificate";
    String CERTIFICATES = "Certificates";
    String CLOUDMGMTSYSTEM = "CloudMgmtSystem";
    String CLOUDMGMTSYSTEMS = "CloudMgmtSystems";
    String COMMAND = "Command";
    String COMMANDS = "Commands";
    String VSDCOMPONENT = "VSDComponent";
    String VSDCOMPONENTS = "VSDComponents";
    String CONNECTIONENDPOINT = "Connectionendpoint";
    String CONNECTIONENDPOINTS = "Connectionendpoints";
    String CONTAINER = "Container";
    String CONTAINERS = "Containers";
    String CONTAINERINTERFACE = "ContainerInterface";
    String CONTAINERINTERFACES = "ContainerInterfaces";
    String CONTAINERRESYNC = "ContainerResync";
    String CONTAINERRESYNCS = "ContainerResyncs";
    String COSREMARKINGPOLICY = "COSRemarkingPolicy";
    String COSREMARKINGPOLICIES = "COSRemarkingPolicies";
    String COSREMARKINGPOLICYTABLE = "COSRemarkingPolicyTable";
    String COSREMARKINGPOLICYTABLES = "COSRemarkingPolicyTables";
    String CSNATPOOL = "CSNATPool";
    String CSNATPOOLS = "CSNATPools";
    String CTRANSLATIONMAP = "CTranslationMap";
    String CTRANSLATIONMAPS = "CTranslationMaps";
    String CUSTOMPROPERTY = "CustomProperty";
    String CUSTOMPROPERTIES = "CustomProperties";
    String DEFAULTGATEWAY = "DefaultGateway";
    String DEFAULTGATEWAYS = "DefaultGateways";
    String DEMARCATIONSERVICE = "DemarcationService";
    String DEMARCATIONSERVICES = "DemarcationServices";
    String DESTINATIONURL = "Destinationurl";
    String DESTINATIONURLS = "Destinationurls";
    String DHCPOPTION = "DHCPOption";
    String DHCPOPTIONS = "DHCPOptions";
    String DISKSTAT = "DiskStat";
    String DISKSTATS = "DiskStats";
    String DOMAIN = "Domain";
    String DOMAINS = "Domains";
    String DOMAINTEMPLATE = "DomainTemplate";
    String DOMAINTEMPLATES = "DomainTemplates";
    String DSCPFORWARDINGCLASSMAPPING = "DSCPForwardingClassMapping";
    String DSCPFORWARDINGCLASSMAPPINGS = "DSCPForwardingClassMappings";
    String DSCPFORWARDINGCLASSTABLE = "DSCPForwardingClassTable";
    String DSCPFORWARDINGCLASSTABLES = "DSCPForwardingClassTables";
    String DSCPREMARKINGPOLICY = "DSCPRemarkingPolicy";
    String DSCPREMARKINGPOLICIES = "DSCPRemarkingPolicies";
    String DSCPREMARKINGPOLICYTABLE = "DSCPRemarkingPolicyTable";
    String DSCPREMARKINGPOLICYTABLES = "DSCPRemarkingPolicyTables";
    String DUCGROUP = "DUCGroup";
    String DUCGROUPS = "DUCGroups";
    String DUCGROUPBINDING = "DUCGroupBinding";
    String DUCGROUPBINDINGS = "DUCGroupBindings";
    String VCENTEREAMCONFIG = "VCenterEAMConfig";
    String VCENTEREAMCONFIGS = "VCenterEAMConfigs";
    String EGRESSACLENTRYTEMPLATE = "EgressACLEntryTemplate";
    String EGRESSACLENTRYTEMPLATES = "EgressACLEntryTemplates";
    String EGRESSACLTEMPLATE = "EgressACLTemplate";
    String EGRESSACLTEMPLATES = "EgressACLTemplates";
    String EGRESSADVFWDENTRYTEMPLATE = "EgressAdvFwdEntryTemplate";
    String EGRESSADVFWDENTRYTEMPLATES = "EgressAdvFwdEntryTemplates";
    String EGRESSADVFWDTEMPLATE = "EgressAdvFwdTemplate";
    String EGRESSADVFWDTEMPLATES = "EgressAdvFwdTemplates";
    String DOMAINFIPACLTEMPLATEENTRY = "DomainFIPAclTemplateEntry";
    String DOMAINFIPACLTEMPLATEENTRIES = "DomainFIPAclTemplateEntries";
    String DOMAINFIPACLTEMPLATE = "DomainFIPAclTemplate";
    String DOMAINFIPACLTEMPLATES = "DomainFIPAclTemplates";
    String FLOATINGIPACLTEMPLATEENTRY = "FloatingIPACLTemplateEntry";
    String FLOATINGIPACLTEMPLATEENTRIES = "FloatingIPACLTemplateEntries";
    String FLOATINGIPACLTEMPLATE = "FloatingIPACLTemplate";
    String FLOATINGIPACLTEMPLATES = "FloatingIPACLTemplates";
    String EGRESSQOSPOLICY = "EgressQOSPolicy";
    String EGRESSQOSPOLICIES = "EgressQOSPolicies";
    String ENTERPRISE = "Enterprise";
    String ENTERPRISES = "Enterprises";
    String ENTERPRISENETWORK = "EnterpriseNetwork";
    String ENTERPRISENETWORKS = "EnterpriseNetworks";
    String ENTERPRISEPERMISSION = "EnterprisePermission";
    String ENTERPRISEPERMISSIONS = "EnterprisePermissions";
    String ENTERPRISEPROFILE = "EnterpriseProfile";
    String ENTERPRISEPROFILES = "EnterpriseProfiles";
    String ENTERPRISESECUREDDATA = "EnterpriseSecuredData";
    String ENTERPRISESECUREDDATAS = "EnterpriseSecuredDatas";
    String ENTERPRISESECURITY = "EnterpriseSecurity";
    String ENTERPRISESECURITIES = "EnterpriseSecurities";
    String EVENTLOG = "EventLog";
    String EVENTLOGS = "EventLogs";
    String FIREWALLACL = "FirewallAcl";
    String FIREWALLACLS = "FirewallAcls";
    String FIREWALLRULE = "FirewallRule";
    String FIREWALLRULES = "FirewallRules";
    String FLOATINGIP = "FloatingIp";
    String FLOATINGIPS = "FloatingIps";
    String FORWARDINGPATHLIST = "ForwardingPathList";
    String FORWARDINGPATHLISTS = "ForwardingPathLists";
    String FORWARDINGPATHLISTENTRY = "ForwardingPathListEntry";
    String FORWARDINGPATHLISTENTRIES = "ForwardingPathListEntries";
    String GATEWAY = "Gateway";
    String GATEWAYS = "Gateways";
    String GATEWAYSECUREDDATA = "GatewaySecuredData";
    String GATEWAYSECUREDDATAS = "GatewaySecuredDatas";
    String GATEWAYSECURITY = "GatewaySecurity";
    String GATEWAYSECURITIES = "GatewaySecurities";
    String GATEWAYTEMPLATE = "GatewayTemplate";
    String GATEWAYTEMPLATES = "GatewayTemplates";
    String GLOBALMETADATA = "GlobalMetadata";
    String GLOBALMETADATAS = "GlobalMetadatas";
    String GROUP = "Group";
    String GROUPS = "Groups";
    String GROUPKEYENCRYPTIONPROFILE = "GroupKeyEncryptionProfile";
    String GROUPKEYENCRYPTIONPROFILES = "GroupKeyEncryptionProfiles";
    String HOSTINTERFACE = "HostInterface";
    String HOSTINTERFACES = "HostInterfaces";
    String HSC = "HSC";
    String HSCS = "HSCs";
    String IKECERTIFICATE = "IKECertificate";
    String IKECERTIFICATES = "IKECertificates";
    String IKEENCRYPTIONPROFILE = "IKEEncryptionprofile";
    String IKEENCRYPTIONPROFILES = "IKEEncryptionprofiles";
    String IKEGATEWAY = "IKEGateway";
    String IKEGATEWAYS = "IKEGateways";
    String IKEGATEWAYCONFIG = "IKEGatewayConfig";
    String IKEGATEWAYCONFIGS = "IKEGatewayConfigs";
    String IKEGATEWAYCONNECTION = "IKEGatewayConnection";
    String IKEGATEWAYCONNECTIONS = "IKEGatewayConnections";
    String IKEGATEWAYPROFILE = "IKEGatewayProfile";
    String IKEGATEWAYPROFILES = "IKEGatewayProfiles";
    String IKEPSK = "IKEPSK";
    String IKEPSKS = "IKEPSKs";
    String IKESUBNET = "IKESubnet";
    String IKESUBNETS = "IKESubnets";
    String INFRASTRUCTURECONFIG = "InfrastructureConfig";
    String INFRASTRUCTURECONFIGS = "InfrastructureConfigs";
    String INFRASTRUCTUREACCESSPROFILE = "InfrastructureAccessProfile";
    String INFRASTRUCTUREACCESSPROFILES = "InfrastructureAccessProfiles";
    String INFRASTRUCTUREGATEWAYPROFILE = "InfrastructureGatewayProfile";
    String INFRASTRUCTUREGATEWAYPROFILES = "InfrastructureGatewayProfiles";
    String INFRASTRUCTUREVSCPROFILE = "InfrastructureVscProfile";
    String INFRASTRUCTUREVSCPROFILES = "InfrastructureVscProfiles";
    String INGRESSACLENTRYTEMPLATE = "IngressACLEntryTemplate";
    String INGRESSACLENTRYTEMPLATES = "IngressACLEntryTemplates";
    String INGRESSACLTEMPLATE = "IngressACLTemplate";
    String INGRESSACLTEMPLATES = "IngressACLTemplates";
    String INGRESSADVFWDENTRYTEMPLATE = "IngressAdvFwdEntryTemplate";
    String INGRESSADVFWDENTRYTEMPLATES = "IngressAdvFwdEntryTemplates";
    String INGRESSADVFWDTEMPLATE = "IngressAdvFwdTemplate";
    String INGRESSADVFWDTEMPLATES = "IngressAdvFwdTemplates";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY = "IngressExternalServiceTemplateEntry";
    String INGRESSEXTERNALSERVICETEMPLATEENTRIES = "IngressExternalServiceTemplateEntries";
    String INGRESSEXTERNALSERVICETEMPLATE = "IngressExternalServiceTemplate";
    String INGRESSEXTERNALSERVICETEMPLATES = "IngressExternalServiceTemplates";
    String INGRESSQOSPOLICY = "IngressQOSPolicy";
    String INGRESSQOSPOLICIES = "IngressQOSPolicies";
    String IPRESERVATION = "IPReservation";
    String IPRESERVATIONS = "IPReservations";
    String JOB = "Job";
    String JOBS = "Jobs";
    String KEYSERVERMEMBER = "KeyServerMember";
    String KEYSERVERMEMBERS = "KeyServerMembers";
    String KEYSERVERMONITOR = "KeyServerMonitor";
    String KEYSERVERMONITORS = "KeyServerMonitors";
    String KEYSERVERMONITORENCRYPTEDSEED = "KeyServerMonitorEncryptedSeed";
    String KEYSERVERMONITORENCRYPTEDSEEDS = "KeyServerMonitorEncryptedSeeds";
    String KEYSERVERMONITORSEED = "KeyServerMonitorSeed";
    String KEYSERVERMONITORSEEDS = "KeyServerMonitorSeeds";
    String KEYSERVERMONITORSEK = "KeyServerMonitorSEK";
    String KEYSERVERMONITORSEKS = "KeyServerMonitorSEKs";
    String L2DOMAIN = "L2Domain";
    String L2DOMAINS = "L2Domains";
    String L2DOMAINTEMPLATE = "L2DomainTemplate";
    String L2DOMAINTEMPLATES = "L2DomainTemplates";
    String L4SERVICE = "L4Service";
    String L4SERVICES = "L4Services";
    String L4SERVICEGROUP = "L4ServiceGroup";
    String L4SERVICEGROUPS = "L4ServiceGroups";
    String L7APPLICATIONSIGNATURE = "L7applicationsignature";
    String L7APPLICATIONSIGNATURES = "L7applicationsignatures";
    String LDAPCONFIGURATION = "LDAPConfiguration";
    String LDAPCONFIGURATIONS = "LDAPConfigurations";
    String LICENSE = "License";
    String LICENSES = "Licenses";
    String LICENSESTATUS = "LicenseStatus";
    
    String LINK = "Link";
    String LINKS = "Links";
    String LOCATION = "Location";
    String LOCATIONS = "Locations";
    String LTEINFORMATION = "LTEInformation";
    String LTEINFORMATIONS = "LTEInformations";
    String LTESTATISTICS = "Ltestatistics";
    
    String ME = "Me";
    String MES = "Mes";
    String METADATA = "Metadata";
    String METADATAS = "Metadatas";
    String MIRRORDESTINATION = "MirrorDestination";
    String MIRRORDESTINATIONS = "MirrorDestinations";
    String MONITORINGPORT = "MonitoringPort";
    String MONITORINGPORTS = "MonitoringPorts";
    String MONITORSCOPE = "Monitorscope";
    String MONITORSCOPES = "Monitorscopes";
    String MULTICASTCHANNELMAP = "MultiCastChannelMap";
    String MULTICASTCHANNELMAPS = "MultiCastChannelMaps";
    String MULTICASTLIST = "MultiCastList";
    String MULTICASTLISTS = "MultiCastLists";
    String MULTICASTRANGE = "MultiCastRange";
    String MULTICASTRANGES = "MultiCastRanges";
    String MULTINICVPORT = "MultiNICVPort";
    String MULTINICVPORTS = "MultiNICVPorts";
    String NATMAPENTRY = "NATMapEntry";
    String NATMAPENTRIES = "NATMapEntries";
    String NETWORKLAYOUT = "NetworkLayout";
    String NETWORKLAYOUTS = "NetworkLayouts";
    String NETWORKMACROGROUP = "NetworkMacroGroup";
    String NETWORKMACROGROUPS = "NetworkMacroGroups";
    String NETWORKPERFORMANCEBINDING = "NetworkPerformanceBinding";
    String NETWORKPERFORMANCEBINDINGS = "NetworkPerformanceBindings";
    String NETWORKPERFORMANCEMEASUREMENT = "NetworkPerformanceMeasurement";
    String NETWORKPERFORMANCEMEASUREMENTS = "NetworkPerformanceMeasurements";
    String NEXTHOP = "NextHop";
    String NEXTHOPS = "NextHops";
    String NSGATEWAY = "NSGateway";
    String NSGATEWAYS = "NSGateways";
    String NSGATEWAYTEMPLATE = "NSGatewayTemplate";
    String NSGATEWAYTEMPLATES = "NSGatewayTemplates";
    String NSGGROUP = "NSGGroup";
    String NSGGROUPS = "NSGGroups";
    String NSGINFO = "NSGInfo";
    String NSGINFOS = "NSGInfos";
    String NSGPATCHPROFILE = "NSGPatchProfile";
    String NSGPATCHPROFILES = "NSGPatchProfiles";
    String NSREDUNDANTGATEWAYGROUP = "NSRedundantGatewayGroup";
    String NSREDUNDANTGATEWAYGROUPS = "NSRedundantGatewayGroups";
    String NSGROUTINGPOLICYBINDING = "NSGRoutingPolicyBinding";
    String NSGROUTINGPOLICYBINDINGS = "NSGRoutingPolicyBindings";
    String NSGUPGRADEPROFILE = "NSGUpgradeProfile";
    String NSGUPGRADEPROFILES = "NSGUpgradeProfiles";
    String NSPORT = "NSPort";
    String NSPORTS = "NSPorts";
    String NSPORTTEMPLATE = "NSPortTemplate";
    String NSPORTTEMPLATES = "NSPortTemplates";
    String REDUNDANTPORT = "RedundantPort";
    String REDUNDANTPORTS = "RedundantPorts";
    String OSPFAREA = "OSPFArea";
    String OSPFAREAS = "OSPFAreas";
    String OSPFINSTANCE = "OSPFInstance";
    String OSPFINSTANCES = "OSPFInstances";
    String OSPFINTERFACE = "OSPFInterface";
    String OSPFINTERFACES = "OSPFInterfaces";
    String OVERLAYADDRESSPOOL = "OverlayAddressPool";
    String OVERLAYADDRESSPOOLS = "OverlayAddressPools";
    String OVERLAYMIRRORDESTINATION = "OverlayMirrorDestination";
    String OVERLAYMIRRORDESTINATIONS = "OverlayMirrorDestinations";
    String OVERLAYMIRRORDESTINATIONTEMPLATE = "OverlayMirrorDestinationTemplate";
    String OVERLAYMIRRORDESTINATIONTEMPLATES = "OverlayMirrorDestinationTemplates";
    String OVERLAYPATNATENTRY = "OverlayPATNATEntry";
    String OVERLAYPATNATENTRIES = "OverlayPATNATEntries";
    String PATIPENTRY = "PATIPEntry";
    String PATIPENTRIES = "PATIPEntries";
    String PATMAPPER = "PATMapper";
    String PATMAPPERS = "PATMappers";
    String PATNATPOOL = "PATNATPool";
    String PATNATPOOLS = "PATNATPools";
    String PERFORMANCEMONITOR = "PerformanceMonitor";
    String PERFORMANCEMONITORS = "PerformanceMonitors";
    String PERMISSION = "Permission";
    String PERMISSIONS = "Permissions";
    String PGEXPRESSION = "PGExpression";
    String PGEXPRESSIONS = "PGExpressions";
    String PGEXPRESSIONTEMPLATE = "PGExpressionTemplate";
    String PGEXPRESSIONTEMPLATES = "PGExpressionTemplates";
    String POLICYDECISION = "PolicyDecision";
    String POLICYDECISIONS = "PolicyDecisions";
    String POLICYENTRY = "PolicyEntry";
    String POLICYENTRIES = "PolicyEntries";
    String POLICYGROUP = "PolicyGroup";
    String POLICYGROUPS = "PolicyGroups";
    String POLICYGROUPTEMPLATE = "PolicyGroupTemplate";
    String POLICYGROUPTEMPLATES = "PolicyGroupTemplates";
    String POLICYOBJECTGROUP = "PolicyObjectGroup";
    String POLICYOBJECTGROUPS = "PolicyObjectGroups";
    String POLICYSTATEMENT = "PolicyStatement";
    String POLICYSTATEMENTS = "PolicyStatements";
    String PORT = "Port";
    String PORTS = "Ports";
    String PORTMAPPING = "PortMapping";
    String PORTMAPPINGS = "PortMappings";
    String PORTTEMPLATE = "PortTemplate";
    String PORTTEMPLATES = "PortTemplates";
    String PROXYARPFILTER = "ProxyARPFilter";
    String PROXYARPFILTERS = "ProxyARPFilters";
    String PSNATPOOL = "PSNATPool";
    String PSNATPOOLS = "PSNATPools";
    String PSPATMAP = "PSPATMap";
    String PSPATMAPS = "PSPATMaps";
    String PTRANSLATIONMAP = "PTranslationMap";
    String PTRANSLATIONMAPS = "PTranslationMaps";
    String PUBLICNETWORKMACRO = "PublicNetworkMacro";
    String PUBLICNETWORKMACROS = "PublicNetworkMacros";
    String QOS = "QOS";
    String QOSS = "QOSs";
    String QOSPOLICER = "QosPolicer";
    String QOSPOLICERS = "QosPolicers";
    String RATELIMITER = "RateLimiter";
    String RATELIMITERS = "RateLimiters";
    String REDIRECTIONTARGET = "RedirectionTarget";
    String REDIRECTIONTARGETS = "RedirectionTargets";
    String REDIRECTIONTARGETTEMPLATE = "RedirectionTargetTemplate";
    String REDIRECTIONTARGETTEMPLATES = "RedirectionTargetTemplates";
    String REDUNDANCYGROUP = "RedundancyGroup";
    String REDUNDANCYGROUPS = "RedundancyGroups";
    String VMRESYNC = "VMResync";
    String VMRESYNCS = "VMResyncs";
    String ROUTINGPOLICY = "RoutingPolicy";
    String ROUTINGPOLICIES = "RoutingPolicies";
    String WANSERVICE = "WANService";
    String WANSERVICES = "WANServices";
    String SHAREDNETWORKRESOURCE = "SharedNetworkResource";
    String SHAREDNETWORKRESOURCES = "SharedNetworkResources";
    String SITEINFO = "SiteInfo";
    String SITEINFOS = "SiteInfos";
    String SPATSOURCESPOOL = "SPATSourcesPool";
    String SPATSOURCESPOOLS = "SPATSourcesPools";
    String SSHKEY = "SSHKey";
    String SSHKEYS = "SSHKeys";
    String SSIDCONNECTION = "SSIDConnection";
    String SSIDCONNECTIONS = "SSIDConnections";
    String STATICROUTE = "StaticRoute";
    String STATICROUTES = "StaticRoutes";
    String STATISTICS = "Statistics";
    
    String STATSCOLLECTORINFO = "StatsCollectorInfo";
    String STATSCOLLECTORINFOS = "StatsCollectorInfos";
    String STATISTICSPOLICY = "StatisticsPolicy";
    String STATISTICSPOLICIES = "StatisticsPolicies";
    String SUBNET = "Subnet";
    String SUBNETS = "Subnets";
    String SUBNETTEMPLATE = "SubnetTemplate";
    String SUBNETTEMPLATES = "SubnetTemplates";
    String SYSTEMCONFIG = "SystemConfig";
    String SYSTEMCONFIGS = "SystemConfigs";
    String TCA = "TCA";
    String TCAS = "TCAs";
    String TIER = "Tier";
    String TIERS = "Tiers";
    String TRUNK = "Trunk";
    String TRUNKS = "Trunks";
    String UNDERLAY = "Underlay";
    String UNDERLAYS = "Underlays";
    String UPLINKCONNECTION = "UplinkConnection";
    String UPLINKCONNECTIONS = "UplinkConnections";
    String UPLINKRD = "UplinkRD";
    String UPLINKRDS = "UplinkRDs";
    String USER = "User";
    String USERS = "Users";
    String USERCONTEXT = "UserContext";
    String USERCONTEXTS = "UserContexts";
    String VCENTER = "VCenter";
    String VCENTERS = "VCenters";
    String VCENTERCLUSTER = "VCenterCluster";
    String VCENTERCLUSTERS = "VCenterClusters";
    String VCENTERDATACENTER = "VCenterDataCenter";
    String VCENTERDATACENTERS = "VCenterDataCenters";
    String VCENTERHYPERVISOR = "VCenterHypervisor";
    String VCENTERHYPERVISORS = "VCenterHypervisors";
    String VIRTUALFIREWALLPOLICY = "VirtualFirewallPolicy";
    String VIRTUALFIREWALLPOLICIES = "VirtualFirewallPolicies";
    String VIRTUALFIREWALLRULE = "VirtualFirewallRule";
    String VIRTUALFIREWALLRULES = "VirtualFirewallRules";
    String VIRTUALIP = "VirtualIP";
    String VIRTUALIPS = "VirtualIPs";
    String VLAN = "VLAN";
    String VLANS = "VLANs";
    String VLANTEMPLATE = "VLANTemplate";
    String VLANTEMPLATES = "VLANTemplates";
    String VM = "VM";
    String VMS = "VMs";
    String VMINTERFACE = "VMInterface";
    String VMINTERFACES = "VMInterfaces";
    String VNF = "VNF";
    String VNFS = "VNFs";
    String VNFCATALOG = "VNFCatalog";
    String VNFCATALOGS = "VNFCatalogs";
    String VNFDESCRIPTOR = "VNFDescriptor";
    String VNFDESCRIPTORS = "VNFDescriptors";
    String VNFDOMAINMAPPING = "VNFDomainMapping";
    String VNFDOMAINMAPPINGS = "VNFDomainMappings";
    String VNFINTERFACE = "VNFInterface";
    String VNFINTERFACES = "VNFInterfaces";
    String VNFINTERFACEDESCRIPTOR = "VNFInterfaceDescriptor";
    String VNFINTERFACEDESCRIPTORS = "VNFInterfaceDescriptors";
    String VNFMETADATA = "VNFMetadata";
    String VNFMETADATAS = "VNFMetadatas";
    String VNFTHRESHOLDPOLICY = "VNFThresholdPolicy";
    String VNFTHRESHOLDPOLICIES = "VNFThresholdPolicies";
    String VPNCONNECTION = "VPNConnection";
    String VPNCONNECTIONS = "VPNConnections";
    String VPORT = "VPort";
    String VPORTS = "VPorts";
    String VPORTMIRROR = "VPortMirror";
    String VPORTMIRRORS = "VPortMirrors";
    String VRS = "VRS";
    String VRSS = "VRSs";
    String VRSADDRESSRANGE = "VRSAddressRange";
    String VRSADDRESSRANGES = "VRSAddressRanges";
    String VCENTERVRSCONFIG = "VCenterVRSConfig";
    String VCENTERVRSCONFIGS = "VCenterVRSConfigs";
    String VRSMETRICS = "VRSMetrics";
    
    String VRSREDEPLOYMENTPOLICY = "VRSRedeploymentpolicy";
    String VRSREDEPLOYMENTPOLICIES = "VRSRedeploymentpolicies";
    String VSC = "VSC";
    String VSCS = "VSCs";
    String VSD = "VSD";
    String VSDS = "VSDs";
    String VSGREDUNDANTPORT = "VsgRedundantPort";
    String VSGREDUNDANTPORTS = "VsgRedundantPorts";
    String VSP = "VSP";
    String VSPS = "VSPs";
    String WIRELESSPORT = "WirelessPort";
    String WIRELESSPORTS = "WirelessPorts";
    String ZFBAUTOASSIGNMENT = "ZFBAutoAssignment";
    String ZFBAUTOASSIGNMENTS = "ZFBAutoAssignments";
    String ZFBREQUEST = "ZFBRequest";
    String ZFBREQUESTS = "ZFBRequests";
    String ZONE = "Zone";
    String ZONES = "Zones";
    String ZONETEMPLATE = "ZoneTemplate";
    String ZONETEMPLATES = "ZoneTemplates";

    
    String ADDRESSMAPS_FETCHER = "AddressMapsFetcher";
    String ADDRESSRANGES_FETCHER = "AddressRangesFetcher";
    String AGGREGATEMETADATAS_FETCHER = "AggregateMetadatasFetcher";
    String ALARMS_FETCHER = "AlarmsFetcher";
    String ALLALARMS_FETCHER = "AllAlarmsFetcher";
    String APPLICATIONS_FETCHER = "ApplicationsFetcher";
    String APPLICATIONBINDINGS_FETCHER = "ApplicationBindingsFetcher";
    String APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER = "ApplicationperformancemanagementsFetcher";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER = "ApplicationperformancemanagementbindingsFetcher";
    String AUTODISCOVERCLUSTERS_FETCHER = "AutoDiscoverClustersFetcher";
    String AUTODISCOVEREDDATACENTERS_FETCHER = "AutodiscovereddatacentersFetcher";
    String AUTODISCOVEREDGATEWAYS_FETCHER = "AutoDiscoveredGatewaysFetcher";
    String AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER = "AutoDiscoverHypervisorFromClustersFetcher";
    String AVATARS_FETCHER = "AvatarsFetcher";
    String BFDSESSIONS_FETCHER = "BFDSessionsFetcher";
    String BGPNEIGHBORS_FETCHER = "BGPNeighborsFetcher";
    String BGPPEERS_FETCHER = "BGPPeersFetcher";
    String BGPPROFILES_FETCHER = "BGPProfilesFetcher";
    String BOOTSTRAPS_FETCHER = "BootstrapsFetcher";
    String BOOTSTRAPACTIVATIONS_FETCHER = "BootstrapActivationsFetcher";
    String BRCONNECTIONS_FETCHER = "BRConnectionsFetcher";
    String BRIDGEINTERFACES_FETCHER = "BridgeInterfacesFetcher";
    String BULKSTATISTICS_FETCHER = "BulkStatisticsFetcher";
    String CAPTIVEPORTALPROFILES_FETCHER = "CaptivePortalProfilesFetcher";
    String CERTIFICATES_FETCHER = "CertificatesFetcher";
    String CLOUDMGMTSYSTEMS_FETCHER = "CloudMgmtSystemsFetcher";
    String COMMANDS_FETCHER = "CommandsFetcher";
    String VSDCOMPONENTS_FETCHER = "VSDComponentsFetcher";
    String CONNECTIONENDPOINTS_FETCHER = "ConnectionendpointsFetcher";
    String CONTAINERS_FETCHER = "ContainersFetcher";
    String CONTAINERINTERFACES_FETCHER = "ContainerInterfacesFetcher";
    String CONTAINERRESYNCS_FETCHER = "ContainerResyncsFetcher";
    String COSREMARKINGPOLICIES_FETCHER = "COSRemarkingPoliciesFetcher";
    String COSREMARKINGPOLICYTABLES_FETCHER = "COSRemarkingPolicyTablesFetcher";
    String CSNATPOOLS_FETCHER = "CSNATPoolsFetcher";
    String CTRANSLATIONMAPS_FETCHER = "CTranslationMapsFetcher";
    String CUSTOMPROPERTIES_FETCHER = "CustomPropertiesFetcher";
    String DEFAULTGATEWAYS_FETCHER = "DefaultGatewaysFetcher";
    String DEMARCATIONSERVICES_FETCHER = "DemarcationServicesFetcher";
    String DESTINATIONURLS_FETCHER = "DestinationurlsFetcher";
    String DHCPOPTIONS_FETCHER = "DHCPOptionsFetcher";
    String DISKSTATS_FETCHER = "DiskStatsFetcher";
    String DOMAINS_FETCHER = "DomainsFetcher";
    String DOMAINTEMPLATES_FETCHER = "DomainTemplatesFetcher";
    String DSCPFORWARDINGCLASSMAPPINGS_FETCHER = "DSCPForwardingClassMappingsFetcher";
    String DSCPFORWARDINGCLASSTABLES_FETCHER = "DSCPForwardingClassTablesFetcher";
    String DSCPREMARKINGPOLICIES_FETCHER = "DSCPRemarkingPoliciesFetcher";
    String DSCPREMARKINGPOLICYTABLES_FETCHER = "DSCPRemarkingPolicyTablesFetcher";
    String DUCGROUPS_FETCHER = "DUCGroupsFetcher";
    String DUCGROUPBINDINGS_FETCHER = "DUCGroupBindingsFetcher";
    String VCENTEREAMCONFIGS_FETCHER = "VCenterEAMConfigsFetcher";
    String EGRESSACLENTRYTEMPLATES_FETCHER = "EgressACLEntryTemplatesFetcher";
    String EGRESSACLTEMPLATES_FETCHER = "EgressACLTemplatesFetcher";
    String EGRESSADVFWDENTRYTEMPLATES_FETCHER = "EgressAdvFwdEntryTemplatesFetcher";
    String EGRESSADVFWDTEMPLATES_FETCHER = "EgressAdvFwdTemplatesFetcher";
    String DOMAINFIPACLTEMPLATEENTRIES_FETCHER = "DomainFIPAclTemplateEntriesFetcher";
    String DOMAINFIPACLTEMPLATES_FETCHER = "DomainFIPAclTemplatesFetcher";
    String FLOATINGIPACLTEMPLATEENTRIES_FETCHER = "FloatingIPACLTemplateEntriesFetcher";
    String FLOATINGIPACLTEMPLATES_FETCHER = "FloatingIPACLTemplatesFetcher";
    String EGRESSQOSPOLICIES_FETCHER = "EgressQOSPoliciesFetcher";
    String ENTERPRISES_FETCHER = "EnterprisesFetcher";
    String ENTERPRISENETWORKS_FETCHER = "EnterpriseNetworksFetcher";
    String ENTERPRISEPERMISSIONS_FETCHER = "EnterprisePermissionsFetcher";
    String ENTERPRISEPROFILES_FETCHER = "EnterpriseProfilesFetcher";
    String ENTERPRISESECUREDDATAS_FETCHER = "EnterpriseSecuredDatasFetcher";
    String ENTERPRISESECURITIES_FETCHER = "EnterpriseSecuritiesFetcher";
    String EVENTLOGS_FETCHER = "EventLogsFetcher";
    String FIREWALLACLS_FETCHER = "FirewallAclsFetcher";
    String FIREWALLRULES_FETCHER = "FirewallRulesFetcher";
    String FLOATINGIPS_FETCHER = "FloatingIpsFetcher";
    String FORWARDINGPATHLISTS_FETCHER = "ForwardingPathListsFetcher";
    String FORWARDINGPATHLISTENTRIES_FETCHER = "ForwardingPathListEntriesFetcher";
    String GATEWAYS_FETCHER = "GatewaysFetcher";
    String GATEWAYSECUREDDATAS_FETCHER = "GatewaySecuredDatasFetcher";
    String GATEWAYSECURITIES_FETCHER = "GatewaySecuritiesFetcher";
    String GATEWAYTEMPLATES_FETCHER = "GatewayTemplatesFetcher";
    String GLOBALMETADATAS_FETCHER = "GlobalMetadatasFetcher";
    String GROUPS_FETCHER = "GroupsFetcher";
    String GROUPKEYENCRYPTIONPROFILES_FETCHER = "GroupKeyEncryptionProfilesFetcher";
    String HOSTINTERFACES_FETCHER = "HostInterfacesFetcher";
    String HSCS_FETCHER = "HSCsFetcher";
    String IKECERTIFICATES_FETCHER = "IKECertificatesFetcher";
    String IKEENCRYPTIONPROFILES_FETCHER = "IKEEncryptionprofilesFetcher";
    String IKEGATEWAYS_FETCHER = "IKEGatewaysFetcher";
    String IKEGATEWAYCONFIGS_FETCHER = "IKEGatewayConfigsFetcher";
    String IKEGATEWAYCONNECTIONS_FETCHER = "IKEGatewayConnectionsFetcher";
    String IKEGATEWAYPROFILES_FETCHER = "IKEGatewayProfilesFetcher";
    String IKEPSKS_FETCHER = "IKEPSKsFetcher";
    String IKESUBNETS_FETCHER = "IKESubnetsFetcher";
    String INFRASTRUCTURECONFIGS_FETCHER = "InfrastructureConfigsFetcher";
    String INFRASTRUCTUREACCESSPROFILES_FETCHER = "InfrastructureAccessProfilesFetcher";
    String INFRASTRUCTUREGATEWAYPROFILES_FETCHER = "InfrastructureGatewayProfilesFetcher";
    String INFRASTRUCTUREVSCPROFILES_FETCHER = "InfrastructureVscProfilesFetcher";
    String INGRESSACLENTRYTEMPLATES_FETCHER = "IngressACLEntryTemplatesFetcher";
    String INGRESSACLTEMPLATES_FETCHER = "IngressACLTemplatesFetcher";
    String INGRESSADVFWDENTRYTEMPLATES_FETCHER = "IngressAdvFwdEntryTemplatesFetcher";
    String INGRESSADVFWDTEMPLATES_FETCHER = "IngressAdvFwdTemplatesFetcher";
    String INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER = "IngressExternalServiceTemplateEntriesFetcher";
    String INGRESSEXTERNALSERVICETEMPLATES_FETCHER = "IngressExternalServiceTemplatesFetcher";
    String INGRESSQOSPOLICIES_FETCHER = "IngressQOSPoliciesFetcher";
    String IPRESERVATIONS_FETCHER = "IPReservationsFetcher";
    String JOBS_FETCHER = "JobsFetcher";
    String KEYSERVERMEMBERS_FETCHER = "KeyServerMembersFetcher";
    String KEYSERVERMONITORS_FETCHER = "KeyServerMonitorsFetcher";
    String KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER = "KeyServerMonitorEncryptedSeedsFetcher";
    String KEYSERVERMONITORSEEDS_FETCHER = "KeyServerMonitorSeedsFetcher";
    String KEYSERVERMONITORSEKS_FETCHER = "KeyServerMonitorSEKsFetcher";
    String L2DOMAINS_FETCHER = "L2DomainsFetcher";
    String L2DOMAINTEMPLATES_FETCHER = "L2DomainTemplatesFetcher";
    String L4SERVICES_FETCHER = "L4ServicesFetcher";
    String L4SERVICEGROUPS_FETCHER = "L4ServiceGroupsFetcher";
    String L7APPLICATIONSIGNATURES_FETCHER = "L7applicationsignaturesFetcher";
    String LDAPCONFIGURATIONS_FETCHER = "LDAPConfigurationsFetcher";
    String LICENSES_FETCHER = "LicensesFetcher";
    String LICENSESTATUS_FETCHER = "LicenseStatusFetcher";
    String LINKS_FETCHER = "LinksFetcher";
    String LOCATIONS_FETCHER = "LocationsFetcher";
    String LTEINFORMATIONS_FETCHER = "LTEInformationsFetcher";
    String LTESTATISTICS_FETCHER = "LtestatisticsFetcher";
    String MES_FETCHER = "MesFetcher";
    String METADATAS_FETCHER = "MetadatasFetcher";
    String MIRRORDESTINATIONS_FETCHER = "MirrorDestinationsFetcher";
    String MONITORINGPORTS_FETCHER = "MonitoringPortsFetcher";
    String MONITORSCOPES_FETCHER = "MonitorscopesFetcher";
    String MULTICASTCHANNELMAPS_FETCHER = "MultiCastChannelMapsFetcher";
    String MULTICASTLISTS_FETCHER = "MultiCastListsFetcher";
    String MULTICASTRANGES_FETCHER = "MultiCastRangesFetcher";
    String MULTINICVPORTS_FETCHER = "MultiNICVPortsFetcher";
    String NATMAPENTRIES_FETCHER = "NATMapEntriesFetcher";
    String NETWORKLAYOUTS_FETCHER = "NetworkLayoutsFetcher";
    String NETWORKMACROGROUPS_FETCHER = "NetworkMacroGroupsFetcher";
    String NETWORKPERFORMANCEBINDINGS_FETCHER = "NetworkPerformanceBindingsFetcher";
    String NETWORKPERFORMANCEMEASUREMENTS_FETCHER = "NetworkPerformanceMeasurementsFetcher";
    String NEXTHOPS_FETCHER = "NextHopsFetcher";
    String NSGATEWAYS_FETCHER = "NSGatewaysFetcher";
    String NSGATEWAYTEMPLATES_FETCHER = "NSGatewayTemplatesFetcher";
    String NSGGROUPS_FETCHER = "NSGGroupsFetcher";
    String NSGINFOS_FETCHER = "NSGInfosFetcher";
    String NSGPATCHPROFILES_FETCHER = "NSGPatchProfilesFetcher";
    String NSREDUNDANTGATEWAYGROUPS_FETCHER = "NSRedundantGatewayGroupsFetcher";
    String NSGROUTINGPOLICYBINDINGS_FETCHER = "NSGRoutingPolicyBindingsFetcher";
    String NSGUPGRADEPROFILES_FETCHER = "NSGUpgradeProfilesFetcher";
    String NSPORTS_FETCHER = "NSPortsFetcher";
    String NSPORTTEMPLATES_FETCHER = "NSPortTemplatesFetcher";
    String REDUNDANTPORTS_FETCHER = "RedundantPortsFetcher";
    String OSPFAREAS_FETCHER = "OSPFAreasFetcher";
    String OSPFINSTANCES_FETCHER = "OSPFInstancesFetcher";
    String OSPFINTERFACES_FETCHER = "OSPFInterfacesFetcher";
    String OVERLAYADDRESSPOOLS_FETCHER = "OverlayAddressPoolsFetcher";
    String OVERLAYMIRRORDESTINATIONS_FETCHER = "OverlayMirrorDestinationsFetcher";
    String OVERLAYMIRRORDESTINATIONTEMPLATES_FETCHER = "OverlayMirrorDestinationTemplatesFetcher";
    String OVERLAYPATNATENTRIES_FETCHER = "OverlayPATNATEntriesFetcher";
    String PATIPENTRIES_FETCHER = "PATIPEntriesFetcher";
    String PATMAPPERS_FETCHER = "PATMappersFetcher";
    String PATNATPOOLS_FETCHER = "PATNATPoolsFetcher";
    String PERFORMANCEMONITORS_FETCHER = "PerformanceMonitorsFetcher";
    String PERMISSIONS_FETCHER = "PermissionsFetcher";
    String PGEXPRESSIONS_FETCHER = "PGExpressionsFetcher";
    String PGEXPRESSIONTEMPLATES_FETCHER = "PGExpressionTemplatesFetcher";
    String POLICYDECISIONS_FETCHER = "PolicyDecisionsFetcher";
    String POLICYENTRIES_FETCHER = "PolicyEntriesFetcher";
    String POLICYGROUPS_FETCHER = "PolicyGroupsFetcher";
    String POLICYGROUPTEMPLATES_FETCHER = "PolicyGroupTemplatesFetcher";
    String POLICYOBJECTGROUPS_FETCHER = "PolicyObjectGroupsFetcher";
    String POLICYSTATEMENTS_FETCHER = "PolicyStatementsFetcher";
    String PORTS_FETCHER = "PortsFetcher";
    String PORTMAPPINGS_FETCHER = "PortMappingsFetcher";
    String PORTTEMPLATES_FETCHER = "PortTemplatesFetcher";
    String PROXYARPFILTERS_FETCHER = "ProxyARPFiltersFetcher";
    String PSNATPOOLS_FETCHER = "PSNATPoolsFetcher";
    String PSPATMAPS_FETCHER = "PSPATMapsFetcher";
    String PTRANSLATIONMAPS_FETCHER = "PTranslationMapsFetcher";
    String PUBLICNETWORKMACROS_FETCHER = "PublicNetworkMacrosFetcher";
    String QOSS_FETCHER = "QOSsFetcher";
    String QOSPOLICERS_FETCHER = "QosPolicersFetcher";
    String RATELIMITERS_FETCHER = "RateLimitersFetcher";
    String REDIRECTIONTARGETS_FETCHER = "RedirectionTargetsFetcher";
    String REDIRECTIONTARGETTEMPLATES_FETCHER = "RedirectionTargetTemplatesFetcher";
    String REDUNDANCYGROUPS_FETCHER = "RedundancyGroupsFetcher";
    String VMRESYNCS_FETCHER = "VMResyncsFetcher";
    String ROUTINGPOLICIES_FETCHER = "RoutingPoliciesFetcher";
    String WANSERVICES_FETCHER = "WANServicesFetcher";
    String SHAREDNETWORKRESOURCES_FETCHER = "SharedNetworkResourcesFetcher";
    String SITEINFOS_FETCHER = "SiteInfosFetcher";
    String SPATSOURCESPOOLS_FETCHER = "SPATSourcesPoolsFetcher";
    String SSHKEYS_FETCHER = "SSHKeysFetcher";
    String SSIDCONNECTIONS_FETCHER = "SSIDConnectionsFetcher";
    String STATICROUTES_FETCHER = "StaticRoutesFetcher";
    String STATISTICS_FETCHER = "StatisticsFetcher";
    String STATSCOLLECTORINFOS_FETCHER = "StatsCollectorInfosFetcher";
    String STATISTICSPOLICIES_FETCHER = "StatisticsPoliciesFetcher";
    String SUBNETS_FETCHER = "SubnetsFetcher";
    String SUBNETTEMPLATES_FETCHER = "SubnetTemplatesFetcher";
    String SYSTEMCONFIGS_FETCHER = "SystemConfigsFetcher";
    String TCAS_FETCHER = "TCAsFetcher";
    String TIERS_FETCHER = "TiersFetcher";
    String TRUNKS_FETCHER = "TrunksFetcher";
    String UNDERLAYS_FETCHER = "UnderlaysFetcher";
    String UPLINKCONNECTIONS_FETCHER = "UplinkConnectionsFetcher";
    String UPLINKRDS_FETCHER = "UplinkRDsFetcher";
    String USERS_FETCHER = "UsersFetcher";
    String USERCONTEXTS_FETCHER = "UserContextsFetcher";
    String VCENTERS_FETCHER = "VCentersFetcher";
    String VCENTERCLUSTERS_FETCHER = "VCenterClustersFetcher";
    String VCENTERDATACENTERS_FETCHER = "VCenterDataCentersFetcher";
    String VCENTERHYPERVISORS_FETCHER = "VCenterHypervisorsFetcher";
    String VIRTUALFIREWALLPOLICIES_FETCHER = "VirtualFirewallPoliciesFetcher";
    String VIRTUALFIREWALLRULES_FETCHER = "VirtualFirewallRulesFetcher";
    String VIRTUALIPS_FETCHER = "VirtualIPsFetcher";
    String VLANS_FETCHER = "VLANsFetcher";
    String VLANTEMPLATES_FETCHER = "VLANTemplatesFetcher";
    String VMS_FETCHER = "VMsFetcher";
    String VMINTERFACES_FETCHER = "VMInterfacesFetcher";
    String VNFS_FETCHER = "VNFsFetcher";
    String VNFCATALOGS_FETCHER = "VNFCatalogsFetcher";
    String VNFDESCRIPTORS_FETCHER = "VNFDescriptorsFetcher";
    String VNFDOMAINMAPPINGS_FETCHER = "VNFDomainMappingsFetcher";
    String VNFINTERFACES_FETCHER = "VNFInterfacesFetcher";
    String VNFINTERFACEDESCRIPTORS_FETCHER = "VNFInterfaceDescriptorsFetcher";
    String VNFMETADATAS_FETCHER = "VNFMetadatasFetcher";
    String VNFTHRESHOLDPOLICIES_FETCHER = "VNFThresholdPoliciesFetcher";
    String VPNCONNECTIONS_FETCHER = "VPNConnectionsFetcher";
    String VPORTS_FETCHER = "VPortsFetcher";
    String VPORTMIRRORS_FETCHER = "VPortMirrorsFetcher";
    String VRSS_FETCHER = "VRSsFetcher";
    String VRSADDRESSRANGES_FETCHER = "VRSAddressRangesFetcher";
    String VCENTERVRSCONFIGS_FETCHER = "VCenterVRSConfigsFetcher";
    String VRSMETRICS_FETCHER = "VRSMetricsFetcher";
    String VRSREDEPLOYMENTPOLICIES_FETCHER = "VRSRedeploymentpoliciesFetcher";
    String VSCS_FETCHER = "VSCsFetcher";
    String VSDS_FETCHER = "VSDsFetcher";
    String VSGREDUNDANTPORTS_FETCHER = "VsgRedundantPortsFetcher";
    String VSPS_FETCHER = "VSPsFetcher";
    String WIRELESSPORTS_FETCHER = "WirelessPortsFetcher";
    String ZFBAUTOASSIGNMENTS_FETCHER = "ZFBAutoAssignmentsFetcher";
    String ZFBREQUESTS_FETCHER = "ZFBRequestsFetcher";
    String ZONES_FETCHER = "ZonesFetcher";
    String ZONETEMPLATES_FETCHER = "ZoneTemplatesFetcher";

    
    
    String ADDRESSMAP_ENTITYSCOPE_ENUM = "AddressMapEntityScope";
    String ADDRESSMAP_TYPE_ENUM = "AddressMapType";
    
    String ADDRESSRANGE_DHCPPOOLTYPE_ENUM = "AddressRangeDHCPPoolType";
    String ADDRESSRANGE_IPTYPE_ENUM = "AddressRangeIPType";
    String ADDRESSRANGE_ENTITYSCOPE_ENUM = "AddressRangeEntityScope";
    
    String AGGREGATEMETADATA_ENTITYSCOPE_ENUM = "AggregateMetadataEntityScope";
    
    String ALARM_ENTITYSCOPE_ENUM = "AlarmEntityScope";
    String ALARM_SEVERITY_ENUM = "AlarmSeverity";
    
    String ALLALARM_ENTITYSCOPE_ENUM = "AllAlarmEntityScope";
    String ALLALARM_SEVERITY_ENUM = "AllAlarmSeverity";
    
    String APPLICATION_ENTITYSCOPE_ENUM = "ApplicationEntityScope";
    String APPLICATION_OPTIMIZEPATHSELECTION_ENUM = "ApplicationOptimizePathSelection";
    String APPLICATION_PERFORMANCEMONITORTYPE_ENUM = "ApplicationPerformanceMonitorType";
    String APPLICATION_POSTCLASSIFICATIONPATH_ENUM = "ApplicationPostClassificationPath";
    String APPLICATION_PRECLASSIFICATIONPATH_ENUM = "ApplicationPreClassificationPath";
    String APPLICATION_PROTOCOL_ENUM = "ApplicationProtocol";
    
    String APPLICATIONBINDING_ENTITYSCOPE_ENUM = "ApplicationBindingEntityScope";
    
    String APPLICATIONPERFORMANCEMANAGEMENT_ENTITYSCOPE_ENUM = "ApplicationperformancemanagementEntityScope";
    
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITYSCOPE_ENUM = "ApplicationperformancemanagementbindingEntityScope";
    
    String AUTODISCOVERCLUSTER_ENTITYSCOPE_ENUM = "AutoDiscoverClusterEntityScope";
    
    String AUTODISCOVEREDDATACENTER_ENTITYSCOPE_ENUM = "AutodiscovereddatacenterEntityScope";
    
    String AUTODISCOVEREDGATEWAY_ENTITYSCOPE_ENUM = "AutoDiscoveredGatewayEntityScope";
    String AUTODISCOVEREDGATEWAY_PERSONALITY_ENUM = "AutoDiscoveredGatewayPersonality";
    
    String AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITYSCOPE_ENUM = "AutoDiscoverHypervisorFromClusterEntityScope";
    
    String AVATAR_ENTITYSCOPE_ENUM = "AvatarEntityScope";
    
    String BFDSESSION_ENTITYSCOPE_ENUM = "BFDSessionEntityScope";
    
    String BGPNEIGHBOR_ENTITYSCOPE_ENUM = "BGPNeighborEntityScope";
    
    String BGPPEER_ENTITYSCOPE_ENUM = "BGPPeerEntityScope";
    String BGPPEER_STATUS_ENUM = "BGPPeerStatus";
    
    String BGPPROFILE_ENTITYSCOPE_ENUM = "BGPProfileEntityScope";
    
    String BOOTSTRAP_ZFBMATCHATTRIBUTE_ENUM = "BootstrapZFBMatchAttribute";
    String BOOTSTRAP_ENTITYSCOPE_ENUM = "BootstrapEntityScope";
    String BOOTSTRAP_STATUS_ENUM = "BootstrapStatus";
    
    String BOOTSTRAPACTIVATION_ACTION_ENUM = "BootstrapActivationAction";
    String BOOTSTRAPACTIVATION_ENTITYSCOPE_ENUM = "BootstrapActivationEntityScope";
    
    String BRCONNECTION_ADVERTISEMENTCRITERIA_ENUM = "BRConnectionAdvertisementCriteria";
    String BRCONNECTION_MODE_ENUM = "BRConnectionMode";
    
    String BRIDGEINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "BridgeInterfaceAttachedNetworkType";
    String BRIDGEINTERFACE_ENTITYSCOPE_ENUM = "BridgeInterfaceEntityScope";
    
    
    String CAPTIVEPORTALPROFILE_ENTITYSCOPE_ENUM = "CaptivePortalProfileEntityScope";
    String CAPTIVEPORTALPROFILE_PORTALTYPE_ENUM = "CaptivePortalProfilePortalType";
    
    String CERTIFICATE_ENTITYSCOPE_ENUM = "CertificateEntityScope";
    
    String CLOUDMGMTSYSTEM_ENTITYSCOPE_ENUM = "CloudMgmtSystemEntityScope";
    
    String COMMAND_COMMAND_ENUM = "CommandCommand";
    String COMMAND_ENTITYSCOPE_ENUM = "CommandEntityScope";
    String COMMAND_OVERRIDE_ENUM = "CommandOverride";
    String COMMAND_STATUS_ENUM = "CommandStatus";
    
    String VSDCOMPONENT_ENTITYSCOPE_ENUM = "VSDComponentEntityScope";
    String VSDCOMPONENT_STATUS_ENUM = "VSDComponentStatus";
    String VSDCOMPONENT_TYPE_ENUM = "VSDComponentType";
    
    String CONNECTIONENDPOINT_IPTYPE_ENUM = "ConnectionendpointIPType";
    String CONNECTIONENDPOINT_ENDPOINTTYPE_ENUM = "ConnectionendpointEndPointType";
    
    String CONTAINER_DELETEMODE_ENUM = "ContainerDeleteMode";
    String CONTAINER_ENTITYSCOPE_ENUM = "ContainerEntityScope";
    String CONTAINER_REASONTYPE_ENUM = "ContainerReasonType";
    String CONTAINER_STATUS_ENUM = "ContainerStatus";
    
    String CONTAINERINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "ContainerInterfaceAttachedNetworkType";
    String CONTAINERINTERFACE_ENTITYSCOPE_ENUM = "ContainerInterfaceEntityScope";
    
    String CONTAINERRESYNC_ENTITYSCOPE_ENUM = "ContainerResyncEntityScope";
    String CONTAINERRESYNC_STATUS_ENUM = "ContainerResyncStatus";
    
    String COSREMARKINGPOLICY_ENTITYSCOPE_ENUM = "COSRemarkingPolicyEntityScope";
    String COSREMARKINGPOLICY_FORWARDINGCLASS_ENUM = "COSRemarkingPolicyForwardingClass";
    
    String COSREMARKINGPOLICYTABLE_ENTITYSCOPE_ENUM = "COSRemarkingPolicyTableEntityScope";
    
    
    String CTRANSLATIONMAP_MAPPINGTYPE_ENUM = "CTranslationMapMappingType";
    
    
    
    String DEMARCATIONSERVICE_TYPE_ENUM = "DemarcationServiceType";
    
    String DESTINATIONURL_HTTPMETHOD_ENUM = "DestinationurlHTTPMethod";
    String DESTINATIONURL_ENTITYSCOPE_ENUM = "DestinationurlEntityScope";
    
    String DHCPOPTION_ENTITYSCOPE_ENUM = "DHCPOptionEntityScope";
    
    String DISKSTAT_ENTITYSCOPE_ENUM = "DiskStatEntityScope";
    String DISKSTAT_UNIT_ENUM = "DiskStatUnit";
    
    String DOMAIN_DHCPBEHAVIOR_ENUM = "DomainDHCPBehavior";
    String DOMAIN_DPI_ENUM = "DomainDPI";
    String DOMAIN_PATENABLED_ENUM = "DomainPATEnabled";
    String DOMAIN_ADVERTISECRITERIA_ENUM = "DomainAdvertiseCriteria";
    String DOMAIN_ENCRYPTION_ENUM = "DomainEncryption";
    String DOMAIN_ENTITYSCOPE_ENUM = "DomainEntityScope";
    String DOMAIN_FLOWCOLLECTIONENABLED_ENUM = "DomainFlowCollectionEnabled";
    String DOMAIN_MAINTENANCEMODE_ENUM = "DomainMaintenanceMode";
    String DOMAIN_MULTICAST_ENUM = "DomainMulticast";
    String DOMAIN_PERMITTEDACTION_ENUM = "DomainPermittedAction";
    String DOMAIN_POLICYCHANGESTATUS_ENUM = "DomainPolicyChangeStatus";
    String DOMAIN_TUNNELTYPE_ENUM = "DomainTunnelType";
    String DOMAIN_UNDERLAYENABLED_ENUM = "DomainUnderlayEnabled";
    String DOMAIN_UPLINKPREFERENCE_ENUM = "DomainUplinkPreference";
    
    String DOMAINTEMPLATE_DPI_ENUM = "DomainTemplateDPI";
    String DOMAINTEMPLATE_ENCRYPTION_ENUM = "DomainTemplateEncryption";
    String DOMAINTEMPLATE_ENTITYSCOPE_ENUM = "DomainTemplateEntityScope";
    String DOMAINTEMPLATE_MULTICAST_ENUM = "DomainTemplateMulticast";
    String DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM = "DomainTemplatePolicyChangeStatus";
    
    String DSCPFORWARDINGCLASSMAPPING_ENTITYSCOPE_ENUM = "DSCPForwardingClassMappingEntityScope";
    String DSCPFORWARDINGCLASSMAPPING_FORWARDINGCLASS_ENUM = "DSCPForwardingClassMappingForwardingClass";
    
    String DSCPFORWARDINGCLASSTABLE_ENTITYSCOPE_ENUM = "DSCPForwardingClassTableEntityScope";
    
    String DSCPREMARKINGPOLICY_ENTITYSCOPE_ENUM = "DSCPRemarkingPolicyEntityScope";
    String DSCPREMARKINGPOLICY_FORWARDINGCLASS_ENUM = "DSCPRemarkingPolicyForwardingClass";
    
    String DSCPREMARKINGPOLICYTABLE_ENTITYSCOPE_ENUM = "DSCPRemarkingPolicyTableEntityScope";
    
    
    
    String VCENTEREAMCONFIG_ENTITYSCOPE_ENUM = "VCenterEAMConfigEntityScope";
    
    String EGRESSACLENTRYTEMPLATE_ACTION_ENUM = "EgressACLEntryTemplateAction";
    String EGRESSACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM = "EgressACLEntryTemplateAssociatedTrafficType";
    String EGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM = "EgressACLEntryTemplateEntityScope";
    String EGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM = "EgressACLEntryTemplateLocationType";
    String EGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM = "EgressACLEntryTemplateNetworkType";
    String EGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM = "EgressACLEntryTemplatePolicyState";
    
    String EGRESSACLTEMPLATE_ENTITYSCOPE_ENUM = "EgressACLTemplateEntityScope";
    String EGRESSACLTEMPLATE_POLICYSTATE_ENUM = "EgressACLTemplatePolicyState";
    String EGRESSACLTEMPLATE_PRIORITYTYPE_ENUM = "EgressACLTemplatePriorityType";
    
    String EGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM = "EgressAdvFwdEntryTemplateFCOverride";
    String EGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM = "EgressAdvFwdEntryTemplateAction";
    String EGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM = "EgressAdvFwdEntryTemplateEntityScope";
    String EGRESSADVFWDENTRYTEMPLATE_FAILSAFEDATAPATH_ENUM = "EgressAdvFwdEntryTemplateFailsafeDatapath";
    String EGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM = "EgressAdvFwdEntryTemplateLocationType";
    String EGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM = "EgressAdvFwdEntryTemplateNetworkType";
    String EGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM = "EgressAdvFwdEntryTemplatePolicyState";
    String EGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM = "EgressAdvFwdEntryTemplateUplinkPreference";
    
    String EGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM = "EgressAdvFwdTemplateEntityScope";
    String EGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM = "EgressAdvFwdTemplatePolicyState";
    String EGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM = "EgressAdvFwdTemplatePriorityType";
    
    String DOMAINFIPACLTEMPLATEENTRY_ACTION_ENUM = "DomainFIPAclTemplateEntryAction";
    String DOMAINFIPACLTEMPLATEENTRY_DESTINATIONTYPE_ENUM = "DomainFIPAclTemplateEntryDestinationType";
    String DOMAINFIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM = "DomainFIPAclTemplateEntryEntityScope";
    String DOMAINFIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM = "DomainFIPAclTemplateEntryLocationType";
    String DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM = "DomainFIPAclTemplateEntryNetworkType";
    String DOMAINFIPACLTEMPLATEENTRY_POLICYSTATE_ENUM = "DomainFIPAclTemplateEntryPolicyState";
    String DOMAINFIPACLTEMPLATEENTRY_SOURCETYPE_ENUM = "DomainFIPAclTemplateEntrySourceType";
    
    String DOMAINFIPACLTEMPLATE_ENTITYSCOPE_ENUM = "DomainFIPAclTemplateEntityScope";
    String DOMAINFIPACLTEMPLATE_POLICYSTATE_ENUM = "DomainFIPAclTemplatePolicyState";
    String DOMAINFIPACLTEMPLATE_PRIORITYTYPE_ENUM = "DomainFIPAclTemplatePriorityType";
    
    String FLOATINGIPACLTEMPLATEENTRY_ACTION_ENUM = "FloatingIPACLTemplateEntryAction";
    String FLOATINGIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM = "FloatingIPACLTemplateEntryEntityScope";
    String FLOATINGIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM = "FloatingIPACLTemplateEntryLocationType";
    String FLOATINGIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM = "FloatingIPACLTemplateEntryNetworkType";
    String FLOATINGIPACLTEMPLATEENTRY_POLICYSTATE_ENUM = "FloatingIPACLTemplateEntryPolicyState";
    
    String FLOATINGIPACLTEMPLATE_ENTITYSCOPE_ENUM = "FloatingIPACLTemplateEntityScope";
    String FLOATINGIPACLTEMPLATE_POLICYSTATE_ENUM = "FloatingIPACLTemplatePolicyState";
    String FLOATINGIPACLTEMPLATE_PRIORITYTYPE_ENUM = "FloatingIPACLTemplatePriorityType";
    
    String EGRESSQOSPOLICY_DEFAULTSERVICECLASS_ENUM = "EgressQOSPolicyDefaultServiceClass";
    String EGRESSQOSPOLICY_ENTITYSCOPE_ENUM = "EgressQOSPolicyEntityScope";
    String EGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue1ForwardingClasses";
    String EGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue2ForwardingClasses";
    String EGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue3ForwardingClasses";
    String EGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM = "EgressQOSPolicyQueue4ForwardingClasses";
    
    String ENTERPRISE_ALLOWEDFORWARDINGCLASSES_ENUM = "EnterpriseAllowedForwardingClasses";
    String ENTERPRISE_AVATARTYPE_ENUM = "EnterpriseAvatarType";
    String ENTERPRISE_ENCRYPTIONMANAGEMENTMODE_ENUM = "EnterpriseEncryptionManagementMode";
    String ENTERPRISE_ENTITYSCOPE_ENUM = "EnterpriseEntityScope";
    String ENTERPRISE_FLOWCOLLECTIONENABLED_ENUM = "EnterpriseFlowCollectionEnabled";
    
    String ENTERPRISENETWORK_IPTYPE_ENUM = "EnterpriseNetworkIPType";
    String ENTERPRISENETWORK_ENTITYSCOPE_ENUM = "EnterpriseNetworkEntityScope";
    
    String ENTERPRISEPERMISSION_ENTITYSCOPE_ENUM = "EnterprisePermissionEntityScope";
    String ENTERPRISEPERMISSION_PERMITTEDACTION_ENUM = "EnterprisePermissionPermittedAction";
    
    String ENTERPRISEPROFILE_ALLOWEDFORWARDINGCLASSES_ENUM = "EnterpriseProfileAllowedForwardingClasses";
    String ENTERPRISEPROFILE_ENCRYPTIONMANAGEMENTMODE_ENUM = "EnterpriseProfileEncryptionManagementMode";
    String ENTERPRISEPROFILE_ENTITYSCOPE_ENUM = "EnterpriseProfileEntityScope";
    
    String ENTERPRISESECUREDDATA_ENTITYSCOPE_ENUM = "EnterpriseSecuredDataEntityScope";
    
    String ENTERPRISESECURITY_ENTITYSCOPE_ENUM = "EnterpriseSecurityEntityScope";
    
    String EVENTLOG_ENTITYSCOPE_ENUM = "EventLogEntityScope";
    
    
    String FIREWALLRULE_ACTION_ENUM = "FirewallRuleAction";
    String FIREWALLRULE_DESTINATIONTYPE_ENUM = "FirewallRuleDestinationType";
    String FIREWALLRULE_LOCATIONTYPE_ENUM = "FirewallRuleLocationType";
    String FIREWALLRULE_NETWORKTYPE_ENUM = "FirewallRuleNetworkType";
    String FIREWALLRULE_SOURCETYPE_ENUM = "FirewallRuleSourceType";
    
    String FLOATINGIP_ENTITYSCOPE_ENUM = "FloatingIpEntityScope";
    
    String FORWARDINGPATHLIST_ENTITYSCOPE_ENUM = "ForwardingPathListEntityScope";
    
    String FORWARDINGPATHLISTENTRY_FCOVERRIDE_ENUM = "ForwardingPathListEntryFCOverride";
    String FORWARDINGPATHLISTENTRY_ENTITYSCOPE_ENUM = "ForwardingPathListEntryEntityScope";
    String FORWARDINGPATHLISTENTRY_FORWARDINGACTION_ENUM = "ForwardingPathListEntryForwardingAction";
    String FORWARDINGPATHLISTENTRY_UPLINKPREFERENCE_ENUM = "ForwardingPathListEntryUplinkPreference";
    
    String GATEWAY_ENTITYSCOPE_ENUM = "GatewayEntityScope";
    String GATEWAY_PERMITTEDACTION_ENUM = "GatewayPermittedAction";
    String GATEWAY_PERSONALITY_ENUM = "GatewayPersonality";
    
    String GATEWAYSECUREDDATA_ENTITYSCOPE_ENUM = "GatewaySecuredDataEntityScope";
    
    String GATEWAYSECURITY_ENTITYSCOPE_ENUM = "GatewaySecurityEntityScope";
    
    String GATEWAYTEMPLATE_ENTITYSCOPE_ENUM = "GatewayTemplateEntityScope";
    String GATEWAYTEMPLATE_PERSONALITY_ENUM = "GatewayTemplatePersonality";
    
    String GLOBALMETADATA_ENTITYSCOPE_ENUM = "GlobalMetadataEntityScope";
    
    String GROUP_ENTITYSCOPE_ENUM = "GroupEntityScope";
    String GROUP_MANAGEMENTMODE_ENUM = "GroupManagementMode";
    String GROUP_ROLE_ENUM = "GroupRole";
    
    String GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADENCRYPTIONALGORITHM_ENUM = "GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADSIGNINGALGORITHM_ENUM = "GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_ENTITYSCOPE_ENUM = "GroupKeyEncryptionProfileEntityScope";
    String GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM = "GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM = "GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADSIGNINGALGORITHM_ENUM = "GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_TRAFFICAUTHENTICATIONALGORITHM_ENUM = "GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm";
    String GROUPKEYENCRYPTIONPROFILE_TRAFFICENCRYPTIONALGORITHM_ENUM = "GroupKeyEncryptionProfileTrafficEncryptionAlgorithm";
    
    String HOSTINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "HostInterfaceAttachedNetworkType";
    String HOSTINTERFACE_ENTITYSCOPE_ENUM = "HostInterfaceEntityScope";
    
    String HSC_ENTITYSCOPE_ENUM = "HSCEntityScope";
    String HSC_STATUS_ENUM = "HSCStatus";
    String HSC_TYPE_ENUM = "HSCType";
    
    String IKECERTIFICATE_ENTITYSCOPE_ENUM = "IKECertificateEntityScope";
    
    String IKEENCRYPTIONPROFILE_DPDMODE_ENUM = "IKEEncryptionprofileDPDMode";
    String IKEENCRYPTIONPROFILE_IPSECAUTHENTICATIONALGORITHM_ENUM = "IKEEncryptionprofileIPsecAuthenticationAlgorithm";
    String IKEENCRYPTIONPROFILE_IPSECENCRYPTIONALGORITHM_ENUM = "IKEEncryptionprofileIPsecEncryptionAlgorithm";
    String IKEENCRYPTIONPROFILE_IPSECSAREPLAYWINDOWSIZE_ENUM = "IKEEncryptionprofileIPsecSAReplayWindowSize";
    String IKEENCRYPTIONPROFILE_ISAKMPAUTHENTICATIONMODE_ENUM = "IKEEncryptionprofileISAKMPAuthenticationMode";
    String IKEENCRYPTIONPROFILE_ISAKMPDIFFIEHELMANGROUPIDENTIFIER_ENUM = "IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier";
    String IKEENCRYPTIONPROFILE_ISAKMPENCRYPTIONALGORITHM_ENUM = "IKEEncryptionprofileISAKMPEncryptionAlgorithm";
    String IKEENCRYPTIONPROFILE_ISAKMPHASHALGORITHM_ENUM = "IKEEncryptionprofileISAKMPHashAlgorithm";
    String IKEENCRYPTIONPROFILE_ENTITYSCOPE_ENUM = "IKEEncryptionprofileEntityScope";
    
    String IKEGATEWAY_IKEVERSION_ENUM = "IKEGatewayIKEVersion";
    String IKEGATEWAY_IKEV1MODE_ENUM = "IKEGatewayIKEv1Mode";
    String IKEGATEWAY_ENTITYSCOPE_ENUM = "IKEGatewayEntityScope";
    
    String IKEGATEWAYCONFIG_ENTITYSCOPE_ENUM = "IKEGatewayConfigEntityScope";
    
    String IKEGATEWAYCONNECTION_NSGIDENTIFIERTYPE_ENUM = "IKEGatewayConnectionNSGIdentifierType";
    String IKEGATEWAYCONNECTION_NSGROLE_ENUM = "IKEGatewayConnectionNSGRole";
    String IKEGATEWAYCONNECTION_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM = "IKEGatewayConnectionAssociatedIKEAuthenticationType";
    String IKEGATEWAYCONNECTION_ENTITYSCOPE_ENUM = "IKEGatewayConnectionEntityScope";
    
    String IKEGATEWAYPROFILE_IKEGATEWAYIDENTIFIERTYPE_ENUM = "IKEGatewayProfileIKEGatewayIdentifierType";
    String IKEGATEWAYPROFILE_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM = "IKEGatewayProfileAssociatedIKEAuthenticationType";
    String IKEGATEWAYPROFILE_ENTITYSCOPE_ENUM = "IKEGatewayProfileEntityScope";
    String IKEGATEWAYPROFILE_SERVICECLASS_ENUM = "IKEGatewayProfileServiceClass";
    
    String IKEPSK_ENTITYSCOPE_ENUM = "IKEPSKEntityScope";
    
    String IKESUBNET_ENTITYSCOPE_ENUM = "IKESubnetEntityScope";
    
    String INFRASTRUCTURECONFIG_CONFIGSTATUS_ENUM = "InfrastructureConfigConfigStatus";
    String INFRASTRUCTURECONFIG_ENTITYSCOPE_ENUM = "InfrastructureConfigEntityScope";
    
    String INFRASTRUCTUREACCESSPROFILE_SSHAUTHMODE_ENUM = "InfrastructureAccessProfileSSHAuthMode";
    String INFRASTRUCTUREACCESSPROFILE_ENTITYSCOPE_ENUM = "InfrastructureAccessProfileEntityScope";
    String INFRASTRUCTUREACCESSPROFILE_SOURCEIPFILTER_ENUM = "InfrastructureAccessProfileSourceIPFilter";
    
    String INFRASTRUCTUREGATEWAYPROFILE_CONTROLLERLESSFORWARDINGMODE_ENUM = "InfrastructureGatewayProfileControllerLessForwardingMode";
    String INFRASTRUCTUREGATEWAYPROFILE_ENTITYSCOPE_ENUM = "InfrastructureGatewayProfileEntityScope";
    String INFRASTRUCTUREGATEWAYPROFILE_REMOTELOGMODE_ENUM = "InfrastructureGatewayProfileRemoteLogMode";
    String INFRASTRUCTUREGATEWAYPROFILE_UPGRADEACTION_ENUM = "InfrastructureGatewayProfileUpgradeAction";
    
    String INFRASTRUCTUREVSCPROFILE_ENTITYSCOPE_ENUM = "InfrastructureVscProfileEntityScope";
    
    String INGRESSACLENTRYTEMPLATE_ACTION_ENUM = "IngressACLEntryTemplateAction";
    String INGRESSACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM = "IngressACLEntryTemplateAssociatedTrafficType";
    String INGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM = "IngressACLEntryTemplateEntityScope";
    String INGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM = "IngressACLEntryTemplateLocationType";
    String INGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM = "IngressACLEntryTemplateNetworkType";
    String INGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM = "IngressACLEntryTemplatePolicyState";
    
    String INGRESSACLTEMPLATE_ENTITYSCOPE_ENUM = "IngressACLTemplateEntityScope";
    String INGRESSACLTEMPLATE_POLICYSTATE_ENUM = "IngressACLTemplatePolicyState";
    String INGRESSACLTEMPLATE_PRIORITYTYPE_ENUM = "IngressACLTemplatePriorityType";
    
    String INGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM = "IngressAdvFwdEntryTemplateFCOverride";
    String INGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM = "IngressAdvFwdEntryTemplateAction";
    String INGRESSADVFWDENTRYTEMPLATE_APPTYPE_ENUM = "IngressAdvFwdEntryTemplateAppType";
    String INGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM = "IngressAdvFwdEntryTemplateAssociatedTrafficType";
    String INGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM = "IngressAdvFwdEntryTemplateEntityScope";
    String INGRESSADVFWDENTRYTEMPLATE_FAILSAFEDATAPATH_ENUM = "IngressAdvFwdEntryTemplateFailsafeDatapath";
    String INGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM = "IngressAdvFwdEntryTemplateLocationType";
    String INGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM = "IngressAdvFwdEntryTemplateNetworkType";
    String INGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM = "IngressAdvFwdEntryTemplatePolicyState";
    String INGRESSADVFWDENTRYTEMPLATE_REDIRECTREWRITETYPE_ENUM = "IngressAdvFwdEntryTemplateRedirectRewriteType";
    String INGRESSADVFWDENTRYTEMPLATE_REMOTEUPLINKPREFERENCE_ENUM = "IngressAdvFwdEntryTemplateRemoteUplinkPreference";
    String INGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM = "IngressAdvFwdEntryTemplateUplinkPreference";
    
    String INGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM = "IngressAdvFwdTemplateEntityScope";
    String INGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM = "IngressAdvFwdTemplatePolicyState";
    String INGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM = "IngressAdvFwdTemplatePriorityType";
    
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ACTION_ENUM = "IngressExternalServiceTemplateEntryAction";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ENTITYSCOPE_ENUM = "IngressExternalServiceTemplateEntryEntityScope";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_LOCATIONTYPE_ENUM = "IngressExternalServiceTemplateEntryLocationType";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_NETWORKTYPE_ENUM = "IngressExternalServiceTemplateEntryNetworkType";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_POLICYSTATE_ENUM = "IngressExternalServiceTemplateEntryPolicyState";
    
    String INGRESSEXTERNALSERVICETEMPLATE_ENTITYSCOPE_ENUM = "IngressExternalServiceTemplateEntityScope";
    String INGRESSEXTERNALSERVICETEMPLATE_POLICYSTATE_ENUM = "IngressExternalServiceTemplatePolicyState";
    String INGRESSEXTERNALSERVICETEMPLATE_PRIORITYTYPE_ENUM = "IngressExternalServiceTemplatePriorityType";
    
    String INGRESSQOSPOLICY_ENTITYSCOPE_ENUM = "IngressQOSPolicyEntityScope";
    String INGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM = "IngressQOSPolicyQueue1ForwardingClasses";
    String INGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM = "IngressQOSPolicyQueue2ForwardingClasses";
    String INGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM = "IngressQOSPolicyQueue3ForwardingClasses";
    String INGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM = "IngressQOSPolicyQueue4ForwardingClasses";
    
    String IPRESERVATION_ENTITYSCOPE_ENUM = "IPReservationEntityScope";
    
    String JOB_ASSOCENTITYTYPE_ENUM = "JobAssocEntityType";
    String JOB_COMMAND_ENUM = "JobCommand";
    String JOB_ENTITYSCOPE_ENUM = "JobEntityScope";
    String JOB_STATUS_ENUM = "JobStatus";
    
    String KEYSERVERMEMBER_ENTITYSCOPE_ENUM = "KeyServerMemberEntityScope";
    
    String KEYSERVERMONITOR_ENTITYSCOPE_ENUM = "KeyServerMonitorEntityScope";
    
    String KEYSERVERMONITORENCRYPTEDSEED_ENTITYSCOPE_ENUM = "KeyServerMonitorEncryptedSeedEntityScope";
    
    String KEYSERVERMONITORSEED_ENTITYSCOPE_ENUM = "KeyServerMonitorSeedEntityScope";
    String KEYSERVERMONITORSEED_SEEDTRAFFICAUTHENTICATIONALGORITHM_ENUM = "KeyServerMonitorSeedSeedTrafficAuthenticationAlgorithm";
    String KEYSERVERMONITORSEED_SEEDTRAFFICENCRYPTIONALGORITHM_ENUM = "KeyServerMonitorSeedSeedTrafficEncryptionAlgorithm";
    
    String KEYSERVERMONITORSEK_ENTITYSCOPE_ENUM = "KeyServerMonitorSEKEntityScope";
    String KEYSERVERMONITORSEK_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM = "KeyServerMonitorSEKSeedPayloadAuthenticationAlgorithm";
    String KEYSERVERMONITORSEK_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM = "KeyServerMonitorSEKSeedPayloadEncryptionAlgorithm";
    
    String L2DOMAIN_DPI_ENUM = "L2DomainDPI";
    String L2DOMAIN_IPTYPE_ENUM = "L2DomainIPType";
    String L2DOMAIN_ENCRYPTION_ENUM = "L2DomainEncryption";
    String L2DOMAIN_ENTITYSCOPE_ENUM = "L2DomainEntityScope";
    String L2DOMAIN_ENTITYSTATE_ENUM = "L2DomainEntityState";
    String L2DOMAIN_FLOWCOLLECTIONENABLED_ENUM = "L2DomainFlowCollectionEnabled";
    String L2DOMAIN_MAINTENANCEMODE_ENUM = "L2DomainMaintenanceMode";
    String L2DOMAIN_MULTICAST_ENUM = "L2DomainMulticast";
    String L2DOMAIN_POLICYCHANGESTATUS_ENUM = "L2DomainPolicyChangeStatus";
    String L2DOMAIN_UPLINKPREFERENCE_ENUM = "L2DomainUplinkPreference";
    String L2DOMAIN_USEGLOBALMAC_ENUM = "L2DomainUseGlobalMAC";
    
    String L2DOMAINTEMPLATE_DPI_ENUM = "L2DomainTemplateDPI";
    String L2DOMAINTEMPLATE_IPTYPE_ENUM = "L2DomainTemplateIPType";
    String L2DOMAINTEMPLATE_ENCRYPTION_ENUM = "L2DomainTemplateEncryption";
    String L2DOMAINTEMPLATE_ENTITYSCOPE_ENUM = "L2DomainTemplateEntityScope";
    String L2DOMAINTEMPLATE_ENTITYSTATE_ENUM = "L2DomainTemplateEntityState";
    String L2DOMAINTEMPLATE_MULTICAST_ENUM = "L2DomainTemplateMulticast";
    String L2DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM = "L2DomainTemplatePolicyChangeStatus";
    String L2DOMAINTEMPLATE_USEGLOBALMAC_ENUM = "L2DomainTemplateUseGlobalMAC";
    
    String L4SERVICE_ENTITYSCOPE_ENUM = "L4ServiceEntityScope";
    
    String L4SERVICEGROUP_ENTITYSCOPE_ENUM = "L4ServiceGroupEntityScope";
    
    
    String LDAPCONFIGURATION_ENTITYSCOPE_ENUM = "LDAPConfigurationEntityScope";
    
    String LICENSE_ENTITYSCOPE_ENUM = "LicenseEntityScope";
    String LICENSE_LICENSEENCRYPTION_ENUM = "LicenseLicenseEncryption";
    String LICENSE_LICENSETYPE_ENUM = "LicenseLicenseType";
    
    
    String LINK_ACCEPTANCECRITERIA_ENUM = "LinkAcceptanceCriteria";
    String LINK_ASSOCIATEDDESTINATIONTYPE_ENUM = "LinkAssociatedDestinationType";
    String LINK_ENTITYSCOPE_ENUM = "LinkEntityScope";
    String LINK_TYPE_ENUM = "LinkType";
    
    String LOCATION_ENTITYSCOPE_ENUM = "LocationEntityScope";
    
    
    
    String ME_AVATARTYPE_ENUM = "MeAvatarType";
    String ME_ENTITYSCOPE_ENUM = "MeEntityScope";
    
    String METADATA_ENTITYSCOPE_ENUM = "MetadataEntityScope";
    
    String MIRRORDESTINATION_ENTITYSCOPE_ENUM = "MirrorDestinationEntityScope";
    
    String MONITORINGPORT_ENTITYSCOPE_ENUM = "MonitoringPortEntityScope";
    String MONITORINGPORT_RESILIENCYSTATE_ENUM = "MonitoringPortResiliencyState";
    String MONITORINGPORT_STATE_ENUM = "MonitoringPortState";
    
    
    String MULTICASTCHANNELMAP_ENTITYSCOPE_ENUM = "MultiCastChannelMapEntityScope";
    
    String MULTICASTLIST_ENTITYSCOPE_ENUM = "MultiCastListEntityScope";
    String MULTICASTLIST_MCASTTYPE_ENUM = "MultiCastListMcastType";
    
    String MULTICASTRANGE_ENTITYSCOPE_ENUM = "MultiCastRangeEntityScope";
    
    String MULTINICVPORT_ENTITYSCOPE_ENUM = "MultiNICVPortEntityScope";
    
    String NATMAPENTRY_ENTITYSCOPE_ENUM = "NATMapEntryEntityScope";
    String NATMAPENTRY_TYPE_ENUM = "NATMapEntryType";
    
    String NETWORKLAYOUT_ENTITYSCOPE_ENUM = "NetworkLayoutEntityScope";
    String NETWORKLAYOUT_SERVICETYPE_ENUM = "NetworkLayoutServiceType";
    
    String NETWORKMACROGROUP_ENTITYSCOPE_ENUM = "NetworkMacroGroupEntityScope";
    
    
    String NETWORKPERFORMANCEMEASUREMENT_NPMTYPE_ENUM = "NetworkPerformanceMeasurementNPMType";
    
    String NEXTHOP_ENTITYSCOPE_ENUM = "NextHopEntityScope";
    
    String NSGATEWAY_SSHSERVICE_ENUM = "NSGatewaySSHService";
    String NSGATEWAY_TPMSTATUS_ENUM = "NSGatewayTPMStatus";
    String NSGATEWAY_BOOTSTRAPSTATUS_ENUM = "NSGatewayBootstrapStatus";
    String NSGATEWAY_CONFIGURATIONRELOADSTATE_ENUM = "NSGatewayConfigurationReloadState";
    String NSGATEWAY_CONFIGURATIONSTATUS_ENUM = "NSGatewayConfigurationStatus";
    String NSGATEWAY_DERIVEDSSHSERVICESTATE_ENUM = "NSGatewayDerivedSSHServiceState";
    String NSGATEWAY_ENTITYSCOPE_ENUM = "NSGatewayEntityScope";
    String NSGATEWAY_FAMILY_ENUM = "NSGatewayFamily";
    String NSGATEWAY_INHERITEDSSHSERVICESTATE_ENUM = "NSGatewayInheritedSSHServiceState";
    String NSGATEWAY_NETWORKACCELERATION_ENUM = "NSGatewayNetworkAcceleration";
    String NSGATEWAY_PERMITTEDACTION_ENUM = "NSGatewayPermittedAction";
    String NSGATEWAY_PERSONALITY_ENUM = "NSGatewayPersonality";
    
    String NSGATEWAYTEMPLATE_SSHSERVICE_ENUM = "NSGatewayTemplateSSHService";
    String NSGATEWAYTEMPLATE_ENTITYSCOPE_ENUM = "NSGatewayTemplateEntityScope";
    String NSGATEWAYTEMPLATE_INSTANCESSHOVERRIDE_ENUM = "NSGatewayTemplateInstanceSSHOverride";
    String NSGATEWAYTEMPLATE_PERSONALITY_ENUM = "NSGatewayTemplatePersonality";
    
    
    String NSGINFO_TPMSTATUS_ENUM = "NSGInfoTPMStatus";
    String NSGINFO_ENTITYSCOPE_ENUM = "NSGInfoEntityScope";
    String NSGINFO_FAMILY_ENUM = "NSGInfoFamily";
    
    String NSGPATCHPROFILE_ENTITYSCOPE_ENUM = "NSGPatchProfileEntityScope";
    
    String NSREDUNDANTGATEWAYGROUP_ENTITYSCOPE_ENUM = "NSRedundantGatewayGroupEntityScope";
    String NSREDUNDANTGATEWAYGROUP_PERMITTEDACTION_ENUM = "NSRedundantGatewayGroupPermittedAction";
    String NSREDUNDANTGATEWAYGROUP_PERSONALITY_ENUM = "NSRedundantGatewayGroupPersonality";
    String NSREDUNDANTGATEWAYGROUP_REDUNDANTGATEWAYSTATUS_ENUM = "NSRedundantGatewayGroupRedundantGatewayStatus";
    
    String NSGROUTINGPOLICYBINDING_ENTITYSCOPE_ENUM = "NSGRoutingPolicyBindingEntityScope";
    String NSGROUTINGPOLICYBINDING_EXPORTTOOVERLAY_ENUM = "NSGRoutingPolicyBindingExportToOverlay";
    
    String NSGUPGRADEPROFILE_ENTITYSCOPE_ENUM = "NSGUpgradeProfileEntityScope";
    
    String NSPORT_NATTRAVERSAL_ENUM = "NSPortNATTraversal";
    String NSPORT_ENTITYSCOPE_ENUM = "NSPortEntityScope";
    String NSPORT_PERMITTEDACTION_ENUM = "NSPortPermittedAction";
    String NSPORT_PORTTYPE_ENUM = "NSPortPortType";
    String NSPORT_SPEED_ENUM = "NSPortSpeed";
    String NSPORT_STATUS_ENUM = "NSPortStatus";
    
    String NSPORTTEMPLATE_ENTITYSCOPE_ENUM = "NSPortTemplateEntityScope";
    String NSPORTTEMPLATE_PORTTYPE_ENUM = "NSPortTemplatePortType";
    String NSPORTTEMPLATE_SPEED_ENUM = "NSPortTemplateSpeed";
    
    String REDUNDANTPORT_ENTITYSCOPE_ENUM = "RedundantPortEntityScope";
    String REDUNDANTPORT_PERMITTEDACTION_ENUM = "RedundantPortPermittedAction";
    String REDUNDANTPORT_PORTTYPE_ENUM = "RedundantPortPortType";
    String REDUNDANTPORT_SPEED_ENUM = "RedundantPortSpeed";
    String REDUNDANTPORT_STATUS_ENUM = "RedundantPortStatus";
    
    String OSPFAREA_AREATYPE_ENUM = "OSPFAreaAreaType";
    String OSPFAREA_DEFAULTORIGINATEOPTION_ENUM = "OSPFAreaDefaultOriginateOption";
    String OSPFAREA_ENTITYSCOPE_ENUM = "OSPFAreaEntityScope";
    
    String OSPFINSTANCE_ENTITYSCOPE_ENUM = "OSPFInstanceEntityScope";
    
    String OSPFINTERFACE_ADMINSTATE_ENUM = "OSPFInterfaceAdminState";
    String OSPFINTERFACE_AUTHENTICATIONTYPE_ENUM = "OSPFInterfaceAuthenticationType";
    String OSPFINTERFACE_ENTITYSCOPE_ENUM = "OSPFInterfaceEntityScope";
    String OSPFINTERFACE_INTERFACETYPE_ENUM = "OSPFInterfaceInterfaceType";
    
    
    String OVERLAYMIRRORDESTINATION_ENDPOINTTYPE_ENUM = "OverlayMirrorDestinationEndPointType";
    String OVERLAYMIRRORDESTINATION_ENTITYSCOPE_ENUM = "OverlayMirrorDestinationEntityScope";
    String OVERLAYMIRRORDESTINATION_TRIGGERTYPE_ENUM = "OverlayMirrorDestinationTriggerType";
    
    String OVERLAYMIRRORDESTINATIONTEMPLATE_ENDPOINTTYPE_ENUM = "OverlayMirrorDestinationTemplateEndPointType";
    String OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITYSCOPE_ENUM = "OverlayMirrorDestinationTemplateEntityScope";
    String OVERLAYMIRRORDESTINATIONTEMPLATE_TRIGGERTYPE_ENUM = "OverlayMirrorDestinationTemplateTriggerType";
    
    
    String PATIPENTRY_IPTYPE_ENUM = "PATIPEntryIPType";
    String PATIPENTRY_ENTITYSCOPE_ENUM = "PATIPEntryEntityScope";
    
    String PATMAPPER_ENTITYSCOPE_ENUM = "PATMapperEntityScope";
    
    String PATNATPOOL_ASSOCIATEDGATEWAYTYPE_ENUM = "PATNATPoolAssociatedGatewayType";
    String PATNATPOOL_ENTITYSCOPE_ENUM = "PATNATPoolEntityScope";
    String PATNATPOOL_PERMITTEDACTION_ENUM = "PATNATPoolPermittedAction";
    
    String PERFORMANCEMONITOR_ENTITYSCOPE_ENUM = "PerformanceMonitorEntityScope";
    String PERFORMANCEMONITOR_PROBETYPE_ENUM = "PerformanceMonitorProbeType";
    String PERFORMANCEMONITOR_SERVICECLASS_ENUM = "PerformanceMonitorServiceClass";
    
    String PERMISSION_ENTITYSCOPE_ENUM = "PermissionEntityScope";
    String PERMISSION_PERMITTEDACTION_ENUM = "PermissionPermittedAction";
    
    String PGEXPRESSION_ENTITYSCOPE_ENUM = "PGExpressionEntityScope";
    
    String PGEXPRESSIONTEMPLATE_ENTITYSCOPE_ENUM = "PGExpressionTemplateEntityScope";
    
    String POLICYDECISION_ENTITYSCOPE_ENUM = "PolicyDecisionEntityScope";
    
    
    String POLICYGROUP_ENTITYSCOPE_ENUM = "PolicyGroupEntityScope";
    String POLICYGROUP_TYPE_ENUM = "PolicyGroupType";
    
    String POLICYGROUPTEMPLATE_ENTITYSCOPE_ENUM = "PolicyGroupTemplateEntityScope";
    String POLICYGROUPTEMPLATE_TYPE_ENUM = "PolicyGroupTemplateType";
    
    String POLICYOBJECTGROUP_TYPE_ENUM = "PolicyObjectGroupType";
    
    
    String PORT_ENTITYSCOPE_ENUM = "PortEntityScope";
    String PORT_PERMITTEDACTION_ENUM = "PortPermittedAction";
    String PORT_PORTTYPE_ENUM = "PortPortType";
    String PORT_STATUS_ENUM = "PortStatus";
    
    String PORTMAPPING_ENTITYSCOPE_ENUM = "PortMappingEntityScope";
    
    String PORTTEMPLATE_ENTITYSCOPE_ENUM = "PortTemplateEntityScope";
    String PORTTEMPLATE_PORTTYPE_ENUM = "PortTemplatePortType";
    
    String PROXYARPFILTER_IPTYPE_ENUM = "ProxyARPFilterIPType";
    String PROXYARPFILTER_ENTITYSCOPE_ENUM = "ProxyARPFilterEntityScope";
    
    
    
    String PTRANSLATIONMAP_MAPPINGTYPE_ENUM = "PTranslationMapMappingType";
    
    String PUBLICNETWORKMACRO_IPTYPE_ENUM = "PublicNetworkMacroIPType";
    String PUBLICNETWORKMACRO_ENTITYSCOPE_ENUM = "PublicNetworkMacroEntityScope";
    
    String QOS_ENTITYSCOPE_ENUM = "QOSEntityScope";
    String QOS_SERVICECLASS_ENUM = "QOSServiceClass";
    
    String QOSPOLICER_ENTITYSCOPE_ENUM = "QosPolicerEntityScope";
    
    String RATELIMITER_ENTITYSCOPE_ENUM = "RateLimiterEntityScope";
    
    String REDIRECTIONTARGET_ENDPOINTTYPE_ENUM = "RedirectionTargetEndPointType";
    String REDIRECTIONTARGET_ENTITYSCOPE_ENUM = "RedirectionTargetEntityScope";
    String REDIRECTIONTARGET_TRIGGERTYPE_ENUM = "RedirectionTargetTriggerType";
    
    String REDIRECTIONTARGETTEMPLATE_ENDPOINTTYPE_ENUM = "RedirectionTargetTemplateEndPointType";
    String REDIRECTIONTARGETTEMPLATE_ENTITYSCOPE_ENUM = "RedirectionTargetTemplateEntityScope";
    String REDIRECTIONTARGETTEMPLATE_TRIGGERTYPE_ENUM = "RedirectionTargetTemplateTriggerType";
    
    String REDUNDANCYGROUP_ENTITYSCOPE_ENUM = "RedundancyGroupEntityScope";
    String REDUNDANCYGROUP_PERMITTEDACTION_ENUM = "RedundancyGroupPermittedAction";
    String REDUNDANCYGROUP_PERSONALITY_ENUM = "RedundancyGroupPersonality";
    String REDUNDANCYGROUP_REDUNDANTGATEWAYSTATUS_ENUM = "RedundancyGroupRedundantGatewayStatus";
    
    String VMRESYNC_ENTITYSCOPE_ENUM = "VMResyncEntityScope";
    String VMRESYNC_STATUS_ENUM = "VMResyncStatus";
    
    String ROUTINGPOLICY_DEFAULTACTION_ENUM = "RoutingPolicyDefaultAction";
    String ROUTINGPOLICY_ENTITYSCOPE_ENUM = "RoutingPolicyEntityScope";
    
    String WANSERVICE_CONFIGTYPE_ENUM = "WANServiceConfigType";
    String WANSERVICE_ENTITYSCOPE_ENUM = "WANServiceEntityScope";
    String WANSERVICE_PERMITTEDACTION_ENUM = "WANServicePermittedAction";
    String WANSERVICE_SERVICETYPE_ENUM = "WANServiceServiceType";
    String WANSERVICE_TUNNELTYPE_ENUM = "WANServiceTunnelType";
    
    String SHAREDNETWORKRESOURCE_ENTITYSCOPE_ENUM = "SharedNetworkResourceEntityScope";
    String SHAREDNETWORKRESOURCE_PERMITTEDACTIONTYPE_ENUM = "SharedNetworkResourcePermittedActionType";
    String SHAREDNETWORKRESOURCE_TYPE_ENUM = "SharedNetworkResourceType";
    String SHAREDNETWORKRESOURCE_USEGLOBALMAC_ENUM = "SharedNetworkResourceUseGlobalMAC";
    
    String SITEINFO_ENTITYSCOPE_ENUM = "SiteInfoEntityScope";
    
    String SPATSOURCESPOOL_FAMILY_ENUM = "SPATSourcesPoolFamily";
    
    String SSHKEY_KEYTYPE_ENUM = "SSHKeyKeyType";
    
    String SSIDCONNECTION_AUTHENTICATIONMODE_ENUM = "SSIDConnectionAuthenticationMode";
    String SSIDCONNECTION_REDIRECTOPTION_ENUM = "SSIDConnectionRedirectOption";
    
    String STATICROUTE_IPTYPE_ENUM = "StaticRouteIPType";
    String STATICROUTE_ENTITYSCOPE_ENUM = "StaticRouteEntityScope";
    String STATICROUTE_TYPE_ENUM = "StaticRouteType";
    
    
    String STATSCOLLECTORINFO_ADDRESSTYPE_ENUM = "StatsCollectorInfoAddressType";
    String STATSCOLLECTORINFO_ENTITYSCOPE_ENUM = "StatsCollectorInfoEntityScope";
    
    String STATISTICSPOLICY_ENTITYSCOPE_ENUM = "StatisticsPolicyEntityScope";
    
    String SUBNET_DHCPRELAYSTATUS_ENUM = "SubnetDHCPRelayStatus";
    String SUBNET_DPI_ENUM = "SubnetDPI";
    String SUBNET_IPTYPE_ENUM = "SubnetIPType";
    String SUBNET_PATENABLED_ENUM = "SubnetPATEnabled";
    String SUBNET_DEFAULTACTION_ENUM = "SubnetDefaultAction";
    String SUBNET_ENCRYPTION_ENUM = "SubnetEncryption";
    String SUBNET_ENTITYSCOPE_ENUM = "SubnetEntityScope";
    String SUBNET_ENTITYSTATE_ENUM = "SubnetEntityState";
    String SUBNET_FLOWCOLLECTIONENABLED_ENUM = "SubnetFlowCollectionEnabled";
    String SUBNET_MAINTENANCEMODE_ENUM = "SubnetMaintenanceMode";
    String SUBNET_MULTICAST_ENUM = "SubnetMulticast";
    String SUBNET_RESOURCETYPE_ENUM = "SubnetResourceType";
    String SUBNET_UNDERLAYENABLED_ENUM = "SubnetUnderlayEnabled";
    String SUBNET_USEGLOBALMAC_ENUM = "SubnetUseGlobalMAC";
    
    String SUBNETTEMPLATE_DPI_ENUM = "SubnetTemplateDPI";
    String SUBNETTEMPLATE_IPTYPE_ENUM = "SubnetTemplateIPType";
    String SUBNETTEMPLATE_ENCRYPTION_ENUM = "SubnetTemplateEncryption";
    String SUBNETTEMPLATE_ENTITYSCOPE_ENUM = "SubnetTemplateEntityScope";
    String SUBNETTEMPLATE_MULTICAST_ENUM = "SubnetTemplateMulticast";
    String SUBNETTEMPLATE_USEGLOBALMAC_ENUM = "SubnetTemplateUseGlobalMAC";
    
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
    
    String TCA_ACTION_ENUM = "TCAAction";
    String TCA_ENTITYSCOPE_ENUM = "TCAEntityScope";
    String TCA_METRIC_ENUM = "TCAMetric";
    String TCA_TYPE_ENUM = "TCAType";
    
    String TIER_ENTITYSCOPE_ENUM = "TierEntityScope";
    String TIER_TIERTYPE_ENUM = "TierTierType";
    
    
    String UNDERLAY_ENTITYSCOPE_ENUM = "UnderlayEntityScope";
    
    String UPLINKCONNECTION_ADVERTISEMENTCRITERIA_ENUM = "UplinkConnectionAdvertisementCriteria";
    String UPLINKCONNECTION_INTERFACECONNECTIONTYPE_ENUM = "UplinkConnectionInterfaceConnectionType";
    String UPLINKCONNECTION_MODE_ENUM = "UplinkConnectionMode";
    String UPLINKCONNECTION_ROLE_ENUM = "UplinkConnectionRole";
    
    String UPLINKRD_ENTITYSCOPE_ENUM = "UplinkRDEntityScope";
    String UPLINKRD_UPLINKTYPE_ENUM = "UplinkRDUplinkType";
    
    String USER_AVATARTYPE_ENUM = "UserAvatarType";
    String USER_ENTITYSCOPE_ENUM = "UserEntityScope";
    String USER_MANAGEMENTMODE_ENUM = "UserManagementMode";
    
    
    String VCENTER_AVRSPROFILE_ENUM = "VCenterAvrsProfile";
    String VCENTER_CPUCOUNT_ENUM = "VCenterCpuCount";
    String VCENTER_DESTINATIONMIRRORPORT_ENUM = "VCenterDestinationMirrorPort";
    String VCENTER_ENTITYSCOPE_ENUM = "VCenterEntityScope";
    String VCENTER_MEMORYSIZEINGB_ENUM = "VCenterMemorySizeInGB";
    String VCENTER_REMOTESYSLOGSERVERTYPE_ENUM = "VCenterRemoteSyslogServerType";
    
    String VCENTERCLUSTER_AVRSPROFILE_ENUM = "VCenterClusterAvrsProfile";
    String VCENTERCLUSTER_CPUCOUNT_ENUM = "VCenterClusterCpuCount";
    String VCENTERCLUSTER_DESTINATIONMIRRORPORT_ENUM = "VCenterClusterDestinationMirrorPort";
    String VCENTERCLUSTER_ENTITYSCOPE_ENUM = "VCenterClusterEntityScope";
    String VCENTERCLUSTER_MEMORYSIZEINGB_ENUM = "VCenterClusterMemorySizeInGB";
    String VCENTERCLUSTER_REMOTESYSLOGSERVERTYPE_ENUM = "VCenterClusterRemoteSyslogServerType";
    
    String VCENTERDATACENTER_AVRSPROFILE_ENUM = "VCenterDataCenterAvrsProfile";
    String VCENTERDATACENTER_CPUCOUNT_ENUM = "VCenterDataCenterCpuCount";
    String VCENTERDATACENTER_DESTINATIONMIRRORPORT_ENUM = "VCenterDataCenterDestinationMirrorPort";
    String VCENTERDATACENTER_ENTITYSCOPE_ENUM = "VCenterDataCenterEntityScope";
    String VCENTERDATACENTER_MEMORYSIZEINGB_ENUM = "VCenterDataCenterMemorySizeInGB";
    String VCENTERDATACENTER_REMOTESYSLOGSERVERTYPE_ENUM = "VCenterDataCenterRemoteSyslogServerType";
    
    String VCENTERHYPERVISOR_VRSSTATE_ENUM = "VCenterHypervisorVRSState";
    String VCENTERHYPERVISOR_AVRSPROFILE_ENUM = "VCenterHypervisorAvrsProfile";
    String VCENTERHYPERVISOR_CPUCOUNT_ENUM = "VCenterHypervisorCpuCount";
    String VCENTERHYPERVISOR_DESTINATIONMIRRORPORT_ENUM = "VCenterHypervisorDestinationMirrorPort";
    String VCENTERHYPERVISOR_ENTITYSCOPE_ENUM = "VCenterHypervisorEntityScope";
    String VCENTERHYPERVISOR_MEMORYSIZEINGB_ENUM = "VCenterHypervisorMemorySizeInGB";
    String VCENTERHYPERVISOR_REMOTESYSLOGSERVERTYPE_ENUM = "VCenterHypervisorRemoteSyslogServerType";
    
    String VIRTUALFIREWALLPOLICY_ENTITYSCOPE_ENUM = "VirtualFirewallPolicyEntityScope";
    String VIRTUALFIREWALLPOLICY_POLICYSTATE_ENUM = "VirtualFirewallPolicyPolicyState";
    String VIRTUALFIREWALLPOLICY_PRIORITYTYPE_ENUM = "VirtualFirewallPolicyPriorityType";
    
    String VIRTUALFIREWALLRULE_ACTION_ENUM = "VirtualFirewallRuleAction";
    String VIRTUALFIREWALLRULE_ASSOCIATEDTRAFFICTYPE_ENUM = "VirtualFirewallRuleAssociatedTrafficType";
    String VIRTUALFIREWALLRULE_ENTITYSCOPE_ENUM = "VirtualFirewallRuleEntityScope";
    String VIRTUALFIREWALLRULE_LOCATIONTYPE_ENUM = "VirtualFirewallRuleLocationType";
    String VIRTUALFIREWALLRULE_NETWORKTYPE_ENUM = "VirtualFirewallRuleNetworkType";
    String VIRTUALFIREWALLRULE_POLICYSTATE_ENUM = "VirtualFirewallRulePolicyState";
    
    String VIRTUALIP_IPTYPE_ENUM = "VirtualIPIPType";
    String VIRTUALIP_ENTITYSCOPE_ENUM = "VirtualIPEntityScope";
    
    String VLAN_ASSOCIATEDCONNECTIONTYPE_ENUM = "VLANAssociatedConnectionType";
    String VLAN_ENTITYSCOPE_ENUM = "VLANEntityScope";
    String VLAN_PERMITTEDACTION_ENUM = "VLANPermittedAction";
    String VLAN_STATUS_ENUM = "VLANStatus";
    String VLAN_TYPE_ENUM = "VLANType";
    
    String VLANTEMPLATE_ASSOCIATEDCONNECTIONTYPE_ENUM = "VLANTemplateAssociatedConnectionType";
    String VLANTEMPLATE_ENTITYSCOPE_ENUM = "VLANTemplateEntityScope";
    String VLANTEMPLATE_TYPE_ENUM = "VLANTemplateType";
    
    String VM_DELETEMODE_ENUM = "VMDeleteMode";
    String VM_ENTITYSCOPE_ENUM = "VMEntityScope";
    String VM_REASONTYPE_ENUM = "VMReasonType";
    String VM_STATUS_ENUM = "VMStatus";
    
    String VMINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "VMInterfaceAttachedNetworkType";
    String VMINTERFACE_ENTITYSCOPE_ENUM = "VMInterfaceEntityScope";
    
    String VNF_ALLOWEDACTIONS_ENUM = "VNFAllowedActions";
    String VNF_STATUS_ENUM = "VNFStatus";
    String VNF_TASKSTATE_ENUM = "VNFTaskState";
    String VNF_TYPE_ENUM = "VNFType";
    
    
    String VNFDESCRIPTOR_TYPE_ENUM = "VNFDescriptorType";
    
    String VNFDOMAINMAPPING_SEGMENTATIONTYPE_ENUM = "VNFDomainMappingSegmentationType";
    
    String VNFINTERFACE_ATTACHEDNETWORKTYPE_ENUM = "VNFInterfaceAttachedNetworkType";
    String VNFINTERFACE_TYPE_ENUM = "VNFInterfaceType";
    
    String VNFINTERFACEDESCRIPTOR_TYPE_ENUM = "VNFInterfaceDescriptorType";
    
    
    String VNFTHRESHOLDPOLICY_ACTION_ENUM = "VNFThresholdPolicyAction";
    
    String VPNCONNECTION_ENTITYSCOPE_ENUM = "VPNConnectionEntityScope";
    
    String VPORT_DPI_ENUM = "VPortDPI";
    String VPORT_ADDRESSSPOOFING_ENUM = "VPortAddressSpoofing";
    String VPORT_ENTITYSCOPE_ENUM = "VPortEntityScope";
    String VPORT_FLOWCOLLECTIONENABLED_ENUM = "VPortFlowCollectionEnabled";
    String VPORT_GATEWAYMACMOVEROLE_ENUM = "VPortGatewayMACMoveRole";
    String VPORT_MULTICAST_ENUM = "VPortMulticast";
    String VPORT_OPERATIONALSTATE_ENUM = "VPortOperationalState";
    String VPORT_SEGMENTATIONTYPE_ENUM = "VPortSegmentationType";
    String VPORT_SUBTYPE_ENUM = "VPortSubType";
    String VPORT_SYSTEMTYPE_ENUM = "VPortSystemType";
    String VPORT_TRUNKROLE_ENUM = "VPortTrunkRole";
    String VPORT_TYPE_ENUM = "VPortType";
    
    String VPORTMIRROR_ENTITYSCOPE_ENUM = "VPortMirrorEntityScope";
    String VPORTMIRROR_MIRRORDIRECTION_ENUM = "VPortMirrorMirrorDirection";
    
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
    
    String VRSADDRESSRANGE_ENTITYSCOPE_ENUM = "VRSAddressRangeEntityScope";
    
    String VCENTERVRSCONFIG_ENTITYSCOPE_ENUM = "VCenterVRSConfigEntityScope";
    
    String VRSMETRICS_ENTITYSCOPE_ENUM = "VRSMetricsEntityScope";
    
    String VRSREDEPLOYMENTPOLICY_ENTITYSCOPE_ENUM = "VRSRedeploymentpolicyEntityScope";
    
    String VSC_ENTITYSCOPE_ENUM = "VSCEntityScope";
    String VSC_STATUS_ENUM = "VSCStatus";
    
    String VSD_ENTITYSCOPE_ENUM = "VSDEntityScope";
    String VSD_MODE_ENUM = "VSDMode";
    String VSD_STATUS_ENUM = "VSDStatus";
    
    String VSGREDUNDANTPORT_ENTITYSCOPE_ENUM = "VsgRedundantPortEntityScope";
    String VSGREDUNDANTPORT_PERMITTEDACTION_ENUM = "VsgRedundantPortPermittedAction";
    String VSGREDUNDANTPORT_PORTTYPE_ENUM = "VsgRedundantPortPortType";
    String VSGREDUNDANTPORT_STATUS_ENUM = "VsgRedundantPortStatus";
    
    String VSP_ENTITYSCOPE_ENUM = "VSPEntityScope";
    
    String WIRELESSPORT_COUNTRYCODE_ENUM = "WirelessPortCountryCode";
    String WIRELESSPORT_FREQUENCYCHANNEL_ENUM = "WirelessPortFrequencyChannel";
    String WIRELESSPORT_PORTTYPE_ENUM = "WirelessPortPortType";
    String WIRELESSPORT_WIFIFREQUENCYBAND_ENUM = "WirelessPortWifiFrequencyBand";
    String WIRELESSPORT_WIFIMODE_ENUM = "WirelessPortWifiMode";
    
    String ZFBAUTOASSIGNMENT_ZFBMATCHATTRIBUTE_ENUM = "ZFBAutoAssignmentZFBMatchAttribute";
    String ZFBAUTOASSIGNMENT_ENTITYSCOPE_ENUM = "ZFBAutoAssignmentEntityScope";
    
    String ZFBREQUEST_ZFBAPPROVALSTATUS_ENUM = "ZFBRequestZFBApprovalStatus";
    String ZFBREQUEST_ENTITYSCOPE_ENUM = "ZFBRequestEntityScope";
    
    String ZONE_DPI_ENUM = "ZoneDPI";
    String ZONE_IPTYPE_ENUM = "ZoneIPType";
    String ZONE_ENCRYPTION_ENUM = "ZoneEncryption";
    String ZONE_ENTITYSCOPE_ENUM = "ZoneEntityScope";
    String ZONE_FLOWCOLLECTIONENABLED_ENUM = "ZoneFlowCollectionEnabled";
    String ZONE_MAINTENANCEMODE_ENUM = "ZoneMaintenanceMode";
    String ZONE_MULTICAST_ENUM = "ZoneMulticast";
    
    String ZONETEMPLATE_DPI_ENUM = "ZoneTemplateDPI";
    String ZONETEMPLATE_IPTYPE_ENUM = "ZoneTemplateIPType";
    String ZONETEMPLATE_ENCRYPTION_ENUM = "ZoneTemplateEncryption";
    String ZONETEMPLATE_ENTITYSCOPE_ENUM = "ZoneTemplateEntityScope";
    String ZONETEMPLATE_MULTICAST_ENUM = "ZoneTemplateMulticast";
    
    
    String ADDRESSMAP_IMAGE_FILENAME = "images/icon-addressmap.png";
    String ADDRESSRANGE_IMAGE_FILENAME = "images/icon-addressrange.png";
    String AGGREGATEMETADATA_IMAGE_FILENAME = "images/icon-aggregatemetadata.png";
    String ALARM_IMAGE_FILENAME = "images/icon-alarm.png";
    String ALLALARM_IMAGE_FILENAME = "images/icon-allalarm.png";
    String APPLICATION_IMAGE_FILENAME = "images/icon-application.png";
    String APPLICATIONBINDING_IMAGE_FILENAME = "images/icon-applicationbinding.png";
    String APPLICATIONPERFORMANCEMANAGEMENT_IMAGE_FILENAME = "images/icon-applicationperformancemanagement.png";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING_IMAGE_FILENAME = "images/icon-applicationperformancemanagementbinding.png";
    String AUTODISCOVERCLUSTER_IMAGE_FILENAME = "images/icon-autodiscovercluster.png";
    String AUTODISCOVEREDDATACENTER_IMAGE_FILENAME = "images/icon-autodiscovereddatacenter.png";
    String AUTODISCOVEREDGATEWAY_IMAGE_FILENAME = "images/icon-autodiscoveredgateway.png";
    String AUTODISCOVERHYPERVISORFROMCLUSTER_IMAGE_FILENAME = "images/icon-autodiscoverhypervisorfromcluster.png";
    String AVATAR_IMAGE_FILENAME = "images/icon-avatar.png";
    String BFDSESSION_IMAGE_FILENAME = "images/icon-bfdsession.png";
    String BGPNEIGHBOR_IMAGE_FILENAME = "images/icon-bgpneighbor.png";
    String BGPPEER_IMAGE_FILENAME = "images/icon-bgppeer.png";
    String BGPPROFILE_IMAGE_FILENAME = "images/icon-bgpprofile.png";
    String BOOTSTRAP_IMAGE_FILENAME = "images/icon-bootstrap.png";
    String BOOTSTRAPACTIVATION_IMAGE_FILENAME = "images/icon-bootstrapactivation.png";
    String BRCONNECTION_IMAGE_FILENAME = "images/icon-brconnection.png";
    String BRIDGEINTERFACE_IMAGE_FILENAME = "images/icon-bridgeinterface.png";
    String BULKSTATISTICS_IMAGE_FILENAME = "images/icon-bulkstatistics.png";
    String CAPTIVEPORTALPROFILE_IMAGE_FILENAME = "images/icon-captiveportalprofile.png";
    String CERTIFICATE_IMAGE_FILENAME = "images/icon-certificate.png";
    String CLOUDMGMTSYSTEM_IMAGE_FILENAME = "images/icon-cloudmgmtsystem.png";
    String COMMAND_IMAGE_FILENAME = "images/icon-command.png";
    String VSDCOMPONENT_IMAGE_FILENAME = "images/icon-vsdcomponent.png";
    String CONNECTIONENDPOINT_IMAGE_FILENAME = "images/icon-connectionendpoint.png";
    String CONTAINER_IMAGE_FILENAME = "images/icon-container.png";
    String CONTAINERINTERFACE_IMAGE_FILENAME = "images/icon-containerinterface.png";
    String CONTAINERRESYNC_IMAGE_FILENAME = "images/icon-containerresync.png";
    String COSREMARKINGPOLICY_IMAGE_FILENAME = "images/icon-cosremarkingpolicy.png";
    String COSREMARKINGPOLICYTABLE_IMAGE_FILENAME = "images/icon-cosremarkingpolicytable.png";
    String CSNATPOOL_IMAGE_FILENAME = "images/icon-csnatpool.png";
    String CTRANSLATIONMAP_IMAGE_FILENAME = "images/icon-ctranslationmap.png";
    String CUSTOMPROPERTY_IMAGE_FILENAME = "images/icon-customproperty.png";
    String DEFAULTGATEWAY_IMAGE_FILENAME = "images/icon-defaultgateway.png";
    String DEMARCATIONSERVICE_IMAGE_FILENAME = "images/icon-demarcationservice.png";
    String DESTINATIONURL_IMAGE_FILENAME = "images/icon-destinationurl.png";
    String DHCPOPTION_IMAGE_FILENAME = "images/icon-dhcpoption.png";
    String DISKSTAT_IMAGE_FILENAME = "images/icon-diskstat.png";
    String DOMAIN_IMAGE_FILENAME = "images/icon-domain.png";
    String DOMAINTEMPLATE_IMAGE_FILENAME = "images/icon-domaintemplate.png";
    String DSCPFORWARDINGCLASSMAPPING_IMAGE_FILENAME = "images/icon-dscpforwardingclassmapping.png";
    String DSCPFORWARDINGCLASSTABLE_IMAGE_FILENAME = "images/icon-dscpforwardingclasstable.png";
    String DSCPREMARKINGPOLICY_IMAGE_FILENAME = "images/icon-dscpremarkingpolicy.png";
    String DSCPREMARKINGPOLICYTABLE_IMAGE_FILENAME = "images/icon-dscpremarkingpolicytable.png";
    String DUCGROUP_IMAGE_FILENAME = "images/icon-ducgroup.png";
    String DUCGROUPBINDING_IMAGE_FILENAME = "images/icon-ducgroupbinding.png";
    String VCENTEREAMCONFIG_IMAGE_FILENAME = "images/icon-vcentereamconfig.png";
    String EGRESSACLENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-egressaclentrytemplate.png";
    String EGRESSACLTEMPLATE_IMAGE_FILENAME = "images/icon-egressacltemplate.png";
    String EGRESSADVFWDENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-egressadvfwdentrytemplate.png";
    String EGRESSADVFWDTEMPLATE_IMAGE_FILENAME = "images/icon-egressadvfwdtemplate.png";
    String DOMAINFIPACLTEMPLATEENTRY_IMAGE_FILENAME = "images/icon-domainfipacltemplateentry.png";
    String DOMAINFIPACLTEMPLATE_IMAGE_FILENAME = "images/icon-domainfipacltemplate.png";
    String FLOATINGIPACLTEMPLATEENTRY_IMAGE_FILENAME = "images/icon-floatingipacltemplateentry.png";
    String FLOATINGIPACLTEMPLATE_IMAGE_FILENAME = "images/icon-floatingipacltemplate.png";
    String EGRESSQOSPOLICY_IMAGE_FILENAME = "images/icon-egressqospolicy.png";
    String ENTERPRISE_IMAGE_FILENAME = "images/icon-enterprise.png";
    String ENTERPRISENETWORK_IMAGE_FILENAME = "images/icon-enterprisenetwork.png";
    String ENTERPRISEPERMISSION_IMAGE_FILENAME = "images/icon-enterprisepermission.png";
    String ENTERPRISEPROFILE_IMAGE_FILENAME = "images/icon-enterpriseprofile.png";
    String ENTERPRISESECUREDDATA_IMAGE_FILENAME = "images/icon-enterprisesecureddata.png";
    String ENTERPRISESECURITY_IMAGE_FILENAME = "images/icon-enterprisesecurity.png";
    String EVENTLOG_IMAGE_FILENAME = "images/icon-eventlog.png";
    String FIREWALLACL_IMAGE_FILENAME = "images/icon-firewallacl.png";
    String FIREWALLRULE_IMAGE_FILENAME = "images/icon-firewallrule.png";
    String FLOATINGIP_IMAGE_FILENAME = "images/icon-floatingip.png";
    String FORWARDINGPATHLIST_IMAGE_FILENAME = "images/icon-forwardingpathlist.png";
    String FORWARDINGPATHLISTENTRY_IMAGE_FILENAME = "images/icon-forwardingpathlistentry.png";
    String GATEWAY_IMAGE_FILENAME = "images/icon-gateway.png";
    String GATEWAYSECUREDDATA_IMAGE_FILENAME = "images/icon-gatewaysecureddata.png";
    String GATEWAYSECURITY_IMAGE_FILENAME = "images/icon-gatewaysecurity.png";
    String GATEWAYTEMPLATE_IMAGE_FILENAME = "images/icon-gatewaytemplate.png";
    String GLOBALMETADATA_IMAGE_FILENAME = "images/icon-globalmetadata.png";
    String GROUP_IMAGE_FILENAME = "images/icon-group.png";
    String GROUPKEYENCRYPTIONPROFILE_IMAGE_FILENAME = "images/icon-groupkeyencryptionprofile.png";
    String HOSTINTERFACE_IMAGE_FILENAME = "images/icon-hostinterface.png";
    String HSC_IMAGE_FILENAME = "images/icon-hsc.png";
    String IKECERTIFICATE_IMAGE_FILENAME = "images/icon-ikecertificate.png";
    String IKEENCRYPTIONPROFILE_IMAGE_FILENAME = "images/icon-ikeencryptionprofile.png";
    String IKEGATEWAY_IMAGE_FILENAME = "images/icon-ikegateway.png";
    String IKEGATEWAYCONFIG_IMAGE_FILENAME = "images/icon-ikegatewayconfig.png";
    String IKEGATEWAYCONNECTION_IMAGE_FILENAME = "images/icon-ikegatewayconnection.png";
    String IKEGATEWAYPROFILE_IMAGE_FILENAME = "images/icon-ikegatewayprofile.png";
    String IKEPSK_IMAGE_FILENAME = "images/icon-ikepsk.png";
    String IKESUBNET_IMAGE_FILENAME = "images/icon-ikesubnet.png";
    String INFRASTRUCTURECONFIG_IMAGE_FILENAME = "images/icon-infrastructureconfig.png";
    String INFRASTRUCTUREACCESSPROFILE_IMAGE_FILENAME = "images/icon-infrastructureaccessprofile.png";
    String INFRASTRUCTUREGATEWAYPROFILE_IMAGE_FILENAME = "images/icon-infrastructuregatewayprofile.png";
    String INFRASTRUCTUREVSCPROFILE_IMAGE_FILENAME = "images/icon-infrastructurevscprofile.png";
    String INGRESSACLENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-ingressaclentrytemplate.png";
    String INGRESSACLTEMPLATE_IMAGE_FILENAME = "images/icon-ingressacltemplate.png";
    String INGRESSADVFWDENTRYTEMPLATE_IMAGE_FILENAME = "images/icon-ingressadvfwdentrytemplate.png";
    String INGRESSADVFWDTEMPLATE_IMAGE_FILENAME = "images/icon-ingressadvfwdtemplate.png";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_IMAGE_FILENAME = "images/icon-ingressexternalservicetemplateentry.png";
    String INGRESSEXTERNALSERVICETEMPLATE_IMAGE_FILENAME = "images/icon-ingressexternalservicetemplate.png";
    String INGRESSQOSPOLICY_IMAGE_FILENAME = "images/icon-ingressqospolicy.png";
    String IPRESERVATION_IMAGE_FILENAME = "images/icon-ipreservation.png";
    String JOB_IMAGE_FILENAME = "images/icon-job.png";
    String KEYSERVERMEMBER_IMAGE_FILENAME = "images/icon-keyservermember.png";
    String KEYSERVERMONITOR_IMAGE_FILENAME = "images/icon-keyservermonitor.png";
    String KEYSERVERMONITORENCRYPTEDSEED_IMAGE_FILENAME = "images/icon-keyservermonitorencryptedseed.png";
    String KEYSERVERMONITORSEED_IMAGE_FILENAME = "images/icon-keyservermonitorseed.png";
    String KEYSERVERMONITORSEK_IMAGE_FILENAME = "images/icon-keyservermonitorsek.png";
    String L2DOMAIN_IMAGE_FILENAME = "images/icon-l2domain.png";
    String L2DOMAINTEMPLATE_IMAGE_FILENAME = "images/icon-l2domaintemplate.png";
    String L4SERVICE_IMAGE_FILENAME = "images/icon-l4service.png";
    String L4SERVICEGROUP_IMAGE_FILENAME = "images/icon-l4servicegroup.png";
    String L7APPLICATIONSIGNATURE_IMAGE_FILENAME = "images/icon-l7applicationsignature.png";
    String LDAPCONFIGURATION_IMAGE_FILENAME = "images/icon-ldapconfiguration.png";
    String LICENSE_IMAGE_FILENAME = "images/icon-license.png";
    String LICENSESTATUS_IMAGE_FILENAME = "images/icon-licensestatus.png";
    String LINK_IMAGE_FILENAME = "images/icon-link.png";
    String LOCATION_IMAGE_FILENAME = "images/icon-location.png";
    String LTEINFORMATION_IMAGE_FILENAME = "images/icon-lteinformation.png";
    String LTESTATISTICS_IMAGE_FILENAME = "images/icon-ltestatistics.png";
    String ME_IMAGE_FILENAME = "images/icon-me.png";
    String METADATA_IMAGE_FILENAME = "images/icon-metadata.png";
    String MIRRORDESTINATION_IMAGE_FILENAME = "images/icon-mirrordestination.png";
    String MONITORINGPORT_IMAGE_FILENAME = "images/icon-monitoringport.png";
    String MONITORSCOPE_IMAGE_FILENAME = "images/icon-monitorscope.png";
    String MULTICASTCHANNELMAP_IMAGE_FILENAME = "images/icon-multicastchannelmap.png";
    String MULTICASTLIST_IMAGE_FILENAME = "images/icon-multicastlist.png";
    String MULTICASTRANGE_IMAGE_FILENAME = "images/icon-multicastrange.png";
    String MULTINICVPORT_IMAGE_FILENAME = "images/icon-multinicvport.png";
    String NATMAPENTRY_IMAGE_FILENAME = "images/icon-natmapentry.png";
    String NETWORKLAYOUT_IMAGE_FILENAME = "images/icon-networklayout.png";
    String NETWORKMACROGROUP_IMAGE_FILENAME = "images/icon-networkmacrogroup.png";
    String NETWORKPERFORMANCEBINDING_IMAGE_FILENAME = "images/icon-networkperformancebinding.png";
    String NETWORKPERFORMANCEMEASUREMENT_IMAGE_FILENAME = "images/icon-networkperformancemeasurement.png";
    String NEXTHOP_IMAGE_FILENAME = "images/icon-nexthop.png";
    String NSGATEWAY_IMAGE_FILENAME = "images/icon-nsgateway.png";
    String NSGATEWAYTEMPLATE_IMAGE_FILENAME = "images/icon-nsgatewaytemplate.png";
    String NSGGROUP_IMAGE_FILENAME = "images/icon-nsggroup.png";
    String NSGINFO_IMAGE_FILENAME = "images/icon-nsginfo.png";
    String NSGPATCHPROFILE_IMAGE_FILENAME = "images/icon-nsgpatchprofile.png";
    String NSREDUNDANTGATEWAYGROUP_IMAGE_FILENAME = "images/icon-nsredundantgatewaygroup.png";
    String NSGROUTINGPOLICYBINDING_IMAGE_FILENAME = "images/icon-nsgroutingpolicybinding.png";
    String NSGUPGRADEPROFILE_IMAGE_FILENAME = "images/icon-nsgupgradeprofile.png";
    String NSPORT_IMAGE_FILENAME = "images/icon-nsport.png";
    String NSPORTTEMPLATE_IMAGE_FILENAME = "images/icon-nsporttemplate.png";
    String REDUNDANTPORT_IMAGE_FILENAME = "images/icon-redundantport.png";
    String OSPFAREA_IMAGE_FILENAME = "images/icon-ospfarea.png";
    String OSPFINSTANCE_IMAGE_FILENAME = "images/icon-ospfinstance.png";
    String OSPFINTERFACE_IMAGE_FILENAME = "images/icon-ospfinterface.png";
    String OVERLAYADDRESSPOOL_IMAGE_FILENAME = "images/icon-overlayaddresspool.png";
    String OVERLAYMIRRORDESTINATION_IMAGE_FILENAME = "images/icon-overlaymirrordestination.png";
    String OVERLAYMIRRORDESTINATIONTEMPLATE_IMAGE_FILENAME = "images/icon-overlaymirrordestinationtemplate.png";
    String OVERLAYPATNATENTRY_IMAGE_FILENAME = "images/icon-overlaypatnatentry.png";
    String PATIPENTRY_IMAGE_FILENAME = "images/icon-patipentry.png";
    String PATMAPPER_IMAGE_FILENAME = "images/icon-patmapper.png";
    String PATNATPOOL_IMAGE_FILENAME = "images/icon-patnatpool.png";
    String PERFORMANCEMONITOR_IMAGE_FILENAME = "images/icon-performancemonitor.png";
    String PERMISSION_IMAGE_FILENAME = "images/icon-permission.png";
    String PGEXPRESSION_IMAGE_FILENAME = "images/icon-pgexpression.png";
    String PGEXPRESSIONTEMPLATE_IMAGE_FILENAME = "images/icon-pgexpressiontemplate.png";
    String POLICYDECISION_IMAGE_FILENAME = "images/icon-policydecision.png";
    String POLICYENTRY_IMAGE_FILENAME = "images/icon-policyentry.png";
    String POLICYGROUP_IMAGE_FILENAME = "images/icon-policygroup.png";
    String POLICYGROUPTEMPLATE_IMAGE_FILENAME = "images/icon-policygrouptemplate.png";
    String POLICYOBJECTGROUP_IMAGE_FILENAME = "images/icon-policyobjectgroup.png";
    String POLICYSTATEMENT_IMAGE_FILENAME = "images/icon-policystatement.png";
    String PORT_IMAGE_FILENAME = "images/icon-port.png";
    String PORTMAPPING_IMAGE_FILENAME = "images/icon-portmapping.png";
    String PORTTEMPLATE_IMAGE_FILENAME = "images/icon-porttemplate.png";
    String PROXYARPFILTER_IMAGE_FILENAME = "images/icon-proxyarpfilter.png";
    String PSNATPOOL_IMAGE_FILENAME = "images/icon-psnatpool.png";
    String PSPATMAP_IMAGE_FILENAME = "images/icon-pspatmap.png";
    String PTRANSLATIONMAP_IMAGE_FILENAME = "images/icon-ptranslationmap.png";
    String PUBLICNETWORKMACRO_IMAGE_FILENAME = "images/icon-publicnetworkmacro.png";
    String QOS_IMAGE_FILENAME = "images/icon-qos.png";
    String QOSPOLICER_IMAGE_FILENAME = "images/icon-qospolicer.png";
    String RATELIMITER_IMAGE_FILENAME = "images/icon-ratelimiter.png";
    String REDIRECTIONTARGET_IMAGE_FILENAME = "images/icon-redirectiontarget.png";
    String REDIRECTIONTARGETTEMPLATE_IMAGE_FILENAME = "images/icon-redirectiontargettemplate.png";
    String REDUNDANCYGROUP_IMAGE_FILENAME = "images/icon-redundancygroup.png";
    String VMRESYNC_IMAGE_FILENAME = "images/icon-vmresync.png";
    String ROUTINGPOLICY_IMAGE_FILENAME = "images/icon-routingpolicy.png";
    String WANSERVICE_IMAGE_FILENAME = "images/icon-wanservice.png";
    String SHAREDNETWORKRESOURCE_IMAGE_FILENAME = "images/icon-sharednetworkresource.png";
    String SITEINFO_IMAGE_FILENAME = "images/icon-siteinfo.png";
    String SPATSOURCESPOOL_IMAGE_FILENAME = "images/icon-spatsourcespool.png";
    String SSHKEY_IMAGE_FILENAME = "images/icon-sshkey.png";
    String SSIDCONNECTION_IMAGE_FILENAME = "images/icon-ssidconnection.png";
    String STATICROUTE_IMAGE_FILENAME = "images/icon-staticroute.png";
    String STATISTICS_IMAGE_FILENAME = "images/icon-statistics.png";
    String STATSCOLLECTORINFO_IMAGE_FILENAME = "images/icon-statscollectorinfo.png";
    String STATISTICSPOLICY_IMAGE_FILENAME = "images/icon-statisticspolicy.png";
    String SUBNET_IMAGE_FILENAME = "images/icon-subnet.png";
    String SUBNETTEMPLATE_IMAGE_FILENAME = "images/icon-subnettemplate.png";
    String SYSTEMCONFIG_IMAGE_FILENAME = "images/icon-systemconfig.png";
    String TCA_IMAGE_FILENAME = "images/icon-tca.png";
    String TIER_IMAGE_FILENAME = "images/icon-tier.png";
    String TRUNK_IMAGE_FILENAME = "images/icon-trunk.png";
    String UNDERLAY_IMAGE_FILENAME = "images/icon-underlay.png";
    String UPLINKCONNECTION_IMAGE_FILENAME = "images/icon-uplinkconnection.png";
    String UPLINKRD_IMAGE_FILENAME = "images/icon-uplinkrd.png";
    String USER_IMAGE_FILENAME = "images/icon-user.png";
    String USERCONTEXT_IMAGE_FILENAME = "images/icon-usercontext.png";
    String VCENTER_IMAGE_FILENAME = "images/icon-vcenter.png";
    String VCENTERCLUSTER_IMAGE_FILENAME = "images/icon-vcentercluster.png";
    String VCENTERDATACENTER_IMAGE_FILENAME = "images/icon-vcenterdatacenter.png";
    String VCENTERHYPERVISOR_IMAGE_FILENAME = "images/icon-vcenterhypervisor.png";
    String VIRTUALFIREWALLPOLICY_IMAGE_FILENAME = "images/icon-virtualfirewallpolicy.png";
    String VIRTUALFIREWALLRULE_IMAGE_FILENAME = "images/icon-virtualfirewallrule.png";
    String VIRTUALIP_IMAGE_FILENAME = "images/icon-virtualip.png";
    String VLAN_IMAGE_FILENAME = "images/icon-vlan.png";
    String VLANTEMPLATE_IMAGE_FILENAME = "images/icon-vlantemplate.png";
    String VM_IMAGE_FILENAME = "images/icon-vm.png";
    String VMINTERFACE_IMAGE_FILENAME = "images/icon-vminterface.png";
    String VNF_IMAGE_FILENAME = "images/icon-vnf.png";
    String VNFCATALOG_IMAGE_FILENAME = "images/icon-vnfcatalog.png";
    String VNFDESCRIPTOR_IMAGE_FILENAME = "images/icon-vnfdescriptor.png";
    String VNFDOMAINMAPPING_IMAGE_FILENAME = "images/icon-vnfdomainmapping.png";
    String VNFINTERFACE_IMAGE_FILENAME = "images/icon-vnfinterface.png";
    String VNFINTERFACEDESCRIPTOR_IMAGE_FILENAME = "images/icon-vnfinterfacedescriptor.png";
    String VNFMETADATA_IMAGE_FILENAME = "images/icon-vnfmetadata.png";
    String VNFTHRESHOLDPOLICY_IMAGE_FILENAME = "images/icon-vnfthresholdpolicy.png";
    String VPNCONNECTION_IMAGE_FILENAME = "images/icon-vpnconnection.png";
    String VPORT_IMAGE_FILENAME = "images/icon-vport.png";
    String VPORTMIRROR_IMAGE_FILENAME = "images/icon-vportmirror.png";
    String VRS_IMAGE_FILENAME = "images/icon-vrs.png";
    String VRSADDRESSRANGE_IMAGE_FILENAME = "images/icon-vrsaddressrange.png";
    String VCENTERVRSCONFIG_IMAGE_FILENAME = "images/icon-vcentervrsconfig.png";
    String VRSMETRICS_IMAGE_FILENAME = "images/icon-vrsmetrics.png";
    String VRSREDEPLOYMENTPOLICY_IMAGE_FILENAME = "images/icon-vrsredeploymentpolicy.png";
    String VSC_IMAGE_FILENAME = "images/icon-vsc.png";
    String VSD_IMAGE_FILENAME = "images/icon-vsd.png";
    String VSGREDUNDANTPORT_IMAGE_FILENAME = "images/icon-vsgredundantport.png";
    String VSP_IMAGE_FILENAME = "images/icon-vsp.png";
    String WIRELESSPORT_IMAGE_FILENAME = "images/icon-wirelessport.png";
    String ZFBAUTOASSIGNMENT_IMAGE_FILENAME = "images/icon-zfbautoassignment.png";
    String ZFBREQUEST_IMAGE_FILENAME = "images/icon-zfbrequest.png";
    String ZONE_IMAGE_FILENAME = "images/icon-zone.png";
    String ZONETEMPLATE_IMAGE_FILENAME = "images/icon-zonetemplate.png";
    String FOLDER_IMAGE_FILENAME = "images/icon-folder.png";

    
    String ADDRESSMAP_ENTITY_TYPE = "addressmap";
    String ADDRESSRANGE_ENTITY_TYPE = "addressrange";
    String AGGREGATEMETADATA_ENTITY_TYPE = "aggregatemetadata";
    String ALARM_ENTITY_TYPE = "alarm";
    String ALLALARM_ENTITY_TYPE = "allalarm";
    String APPLICATION_ENTITY_TYPE = "application";
    String APPLICATIONBINDING_ENTITY_TYPE = "applicationbinding";
    String APPLICATIONPERFORMANCEMANAGEMENT_ENTITY_TYPE = "applicationperformancemanagement";
    String APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITY_TYPE = "applicationperformancemanagementbinding";
    String AUTODISCOVERCLUSTER_ENTITY_TYPE = "autodiscoveredcluster";
    String AUTODISCOVEREDDATACENTER_ENTITY_TYPE = "autodiscovereddatacenter";
    String AUTODISCOVEREDGATEWAY_ENTITY_TYPE = "autodiscoveredgateway";
    String AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITY_TYPE = "autodiscoveredhypervisor";
    String AVATAR_ENTITY_TYPE = "avatar";
    String BFDSESSION_ENTITY_TYPE = "bfdsession";
    String BGPNEIGHBOR_ENTITY_TYPE = "bgpneighbor";
    String BGPPEER_ENTITY_TYPE = "bgppeer";
    String BGPPROFILE_ENTITY_TYPE = "bgpprofile";
    String BOOTSTRAP_ENTITY_TYPE = "bootstrap";
    String BOOTSTRAPACTIVATION_ENTITY_TYPE = "bootstrapactivation";
    String BRCONNECTION_ENTITY_TYPE = "brconnection";
    String BRIDGEINTERFACE_ENTITY_TYPE = "bridgeinterface";
    String BULKSTATISTICS_ENTITY_TYPE = "bulkstatistics";
    String CAPTIVEPORTALPROFILE_ENTITY_TYPE = "captiveportalprofile";
    String CERTIFICATE_ENTITY_TYPE = "certificate";
    String CLOUDMGMTSYSTEM_ENTITY_TYPE = "cms";
    String COMMAND_ENTITY_TYPE = "command";
    String VSDCOMPONENT_ENTITY_TYPE = "component";
    String CONNECTIONENDPOINT_ENTITY_TYPE = "connectionendpoint";
    String CONTAINER_ENTITY_TYPE = "container";
    String CONTAINERINTERFACE_ENTITY_TYPE = "containerinterface";
    String CONTAINERRESYNC_ENTITY_TYPE = "containerresync";
    String COSREMARKINGPOLICY_ENTITY_TYPE = "cosremarkingpolicy";
    String COSREMARKINGPOLICYTABLE_ENTITY_TYPE = "cosremarkingpolicytable";
    String CSNATPOOL_ENTITY_TYPE = "csnatpool";
    String CTRANSLATIONMAP_ENTITY_TYPE = "ctranslationmap";
    String CUSTOMPROPERTY_ENTITY_TYPE = "customproperty";
    String DEFAULTGATEWAY_ENTITY_TYPE = "defaultgateway";
    String DEMARCATIONSERVICE_ENTITY_TYPE = "demarcationservice";
    String DESTINATIONURL_ENTITY_TYPE = "destinationurl";
    String DHCPOPTION_ENTITY_TYPE = "dhcpoption";
    String DISKSTAT_ENTITY_TYPE = "diskstat";
    String DOMAIN_ENTITY_TYPE = "domain";
    String DOMAINTEMPLATE_ENTITY_TYPE = "domaintemplate";
    String DSCPFORWARDINGCLASSMAPPING_ENTITY_TYPE = "dscpforwardingclassmapping";
    String DSCPFORWARDINGCLASSTABLE_ENTITY_TYPE = "dscpforwardingclasstable";
    String DSCPREMARKINGPOLICY_ENTITY_TYPE = "dscpremarkingpolicy";
    String DSCPREMARKINGPOLICYTABLE_ENTITY_TYPE = "dscpremarkingpolicytable";
    String DUCGROUP_ENTITY_TYPE = "ducgroup";
    String DUCGROUPBINDING_ENTITY_TYPE = "ducgroupbinding";
    String VCENTEREAMCONFIG_ENTITY_TYPE = "eamconfig";
    String EGRESSACLENTRYTEMPLATE_ENTITY_TYPE = "egressaclentrytemplate";
    String EGRESSACLTEMPLATE_ENTITY_TYPE = "egressacltemplate";
    String EGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE = "egressadvfwdentrytemplate";
    String EGRESSADVFWDTEMPLATE_ENTITY_TYPE = "egressadvfwdtemplate";
    String DOMAINFIPACLTEMPLATEENTRY_ENTITY_TYPE = "egressdomainfloatingipaclentrytemplate";
    String DOMAINFIPACLTEMPLATE_ENTITY_TYPE = "egressdomainfloatingipacltemplate";
    String FLOATINGIPACLTEMPLATEENTRY_ENTITY_TYPE = "egressfloatingipaclentrytemplate";
    String FLOATINGIPACLTEMPLATE_ENTITY_TYPE = "egressfloatingipacltemplate";
    String EGRESSQOSPOLICY_ENTITY_TYPE = "egressqospolicy";
    String ENTERPRISE_ENTITY_TYPE = "enterprise";
    String ENTERPRISENETWORK_ENTITY_TYPE = "enterprisenetwork";
    String ENTERPRISEPERMISSION_ENTITY_TYPE = "enterprisepermission";
    String ENTERPRISEPROFILE_ENTITY_TYPE = "enterpriseprofile";
    String ENTERPRISESECUREDDATA_ENTITY_TYPE = "enterprisesecureddata";
    String ENTERPRISESECURITY_ENTITY_TYPE = "enterprisesecurity";
    String EVENTLOG_ENTITY_TYPE = "eventlog";
    String FIREWALLACL_ENTITY_TYPE = "firewallacl";
    String FIREWALLRULE_ENTITY_TYPE = "firewallrule";
    String FLOATINGIP_ENTITY_TYPE = "floatingip";
    String FORWARDINGPATHLIST_ENTITY_TYPE = "forwardingpathlist";
    String FORWARDINGPATHLISTENTRY_ENTITY_TYPE = "forwardingpathlistentry";
    String GATEWAY_ENTITY_TYPE = "gateway";
    String GATEWAYSECUREDDATA_ENTITY_TYPE = "gatewaysecureddata";
    String GATEWAYSECURITY_ENTITY_TYPE = "gatewaysecurity";
    String GATEWAYTEMPLATE_ENTITY_TYPE = "gatewaytemplate";
    String GLOBALMETADATA_ENTITY_TYPE = "globalmetadata";
    String GROUP_ENTITY_TYPE = "group";
    String GROUPKEYENCRYPTIONPROFILE_ENTITY_TYPE = "groupkeyencryptionprofile";
    String HOSTINTERFACE_ENTITY_TYPE = "hostinterface";
    String HSC_ENTITY_TYPE = "hsc";
    String IKECERTIFICATE_ENTITY_TYPE = "ikecertificate";
    String IKEENCRYPTIONPROFILE_ENTITY_TYPE = "ikeencryptionprofile";
    String IKEGATEWAY_ENTITY_TYPE = "ikegateway";
    String IKEGATEWAYCONFIG_ENTITY_TYPE = "ikegatewayconfig";
    String IKEGATEWAYCONNECTION_ENTITY_TYPE = "ikegatewayconnection";
    String IKEGATEWAYPROFILE_ENTITY_TYPE = "ikegatewayprofile";
    String IKEPSK_ENTITY_TYPE = "ikepsk";
    String IKESUBNET_ENTITY_TYPE = "ikesubnet";
    String INFRASTRUCTURECONFIG_ENTITY_TYPE = "infraconfig";
    String INFRASTRUCTUREACCESSPROFILE_ENTITY_TYPE = "infrastructureaccessprofile";
    String INFRASTRUCTUREGATEWAYPROFILE_ENTITY_TYPE = "infrastructuregatewayprofile";
    String INFRASTRUCTUREVSCPROFILE_ENTITY_TYPE = "infrastructurevscprofile";
    String INGRESSACLENTRYTEMPLATE_ENTITY_TYPE = "ingressaclentrytemplate";
    String INGRESSACLTEMPLATE_ENTITY_TYPE = "ingressacltemplate";
    String INGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE = "ingressadvfwdentrytemplate";
    String INGRESSADVFWDTEMPLATE_ENTITY_TYPE = "ingressadvfwdtemplate";
    String INGRESSEXTERNALSERVICETEMPLATEENTRY_ENTITY_TYPE = "ingressexternalserviceentrytemplate";
    String INGRESSEXTERNALSERVICETEMPLATE_ENTITY_TYPE = "ingressexternalservicetemplate";
    String INGRESSQOSPOLICY_ENTITY_TYPE = "ingressqospolicy";
    String IPRESERVATION_ENTITY_TYPE = "ipreservation";
    String JOB_ENTITY_TYPE = "job";
    String KEYSERVERMEMBER_ENTITY_TYPE = "keyservermember";
    String KEYSERVERMONITOR_ENTITY_TYPE = "keyservermonitor";
    String KEYSERVERMONITORENCRYPTEDSEED_ENTITY_TYPE = "keyservermonitorencryptedseed";
    String KEYSERVERMONITORSEED_ENTITY_TYPE = "keyservermonitorseed";
    String KEYSERVERMONITORSEK_ENTITY_TYPE = "keyservermonitorsek";
    String L2DOMAIN_ENTITY_TYPE = "l2domain";
    String L2DOMAINTEMPLATE_ENTITY_TYPE = "l2domaintemplate";
    String L4SERVICE_ENTITY_TYPE = "l4service";
    String L4SERVICEGROUP_ENTITY_TYPE = "l4servicegroup";
    String L7APPLICATIONSIGNATURE_ENTITY_TYPE = "l7applicationsignature";
    String LDAPCONFIGURATION_ENTITY_TYPE = "ldapconfiguration";
    String LICENSE_ENTITY_TYPE = "license";
    String LICENSESTATUS_ENTITY_TYPE = "licensestatus";
    String LINK_ENTITY_TYPE = "link";
    String LOCATION_ENTITY_TYPE = "location";
    String LTEINFORMATION_ENTITY_TYPE = "lteinformation";
    String LTESTATISTICS_ENTITY_TYPE = "ltestatistics";
    String ME_ENTITY_TYPE = "me";
    String METADATA_ENTITY_TYPE = "metadata";
    String MIRRORDESTINATION_ENTITY_TYPE = "mirrordestination";
    String MONITORINGPORT_ENTITY_TYPE = "monitoringport";
    String MONITORSCOPE_ENTITY_TYPE = "monitorscope";
    String MULTICASTCHANNELMAP_ENTITY_TYPE = "multicastchannelmap";
    String MULTICASTLIST_ENTITY_TYPE = "multicastlist";
    String MULTICASTRANGE_ENTITY_TYPE = "multicastrange";
    String MULTINICVPORT_ENTITY_TYPE = "multinicvport";
    String NATMAPENTRY_ENTITY_TYPE = "natmapentry";
    String NETWORKLAYOUT_ENTITY_TYPE = "networklayout";
    String NETWORKMACROGROUP_ENTITY_TYPE = "networkmacrogroup";
    String NETWORKPERFORMANCEBINDING_ENTITY_TYPE = "networkperformancebinding";
    String NETWORKPERFORMANCEMEASUREMENT_ENTITY_TYPE = "networkperformancemeasurement";
    String NEXTHOP_ENTITY_TYPE = "nexthop";
    String NSGATEWAY_ENTITY_TYPE = "nsgateway";
    String NSGATEWAYTEMPLATE_ENTITY_TYPE = "nsgatewaytemplate";
    String NSGGROUP_ENTITY_TYPE = "nsggroup";
    String NSGINFO_ENTITY_TYPE = "nsginfo";
    String NSGPATCHPROFILE_ENTITY_TYPE = "nsgpatchprofile";
    String NSREDUNDANTGATEWAYGROUP_ENTITY_TYPE = "nsgredundancygroup";
    String NSGROUTINGPOLICYBINDING_ENTITY_TYPE = "nsgroutingpolicybinding";
    String NSGUPGRADEPROFILE_ENTITY_TYPE = "nsgupgradeprofile";
    String NSPORT_ENTITY_TYPE = "nsport";
    String NSPORTTEMPLATE_ENTITY_TYPE = "nsporttemplate";
    String REDUNDANTPORT_ENTITY_TYPE = "nsredundantport";
    String OSPFAREA_ENTITY_TYPE = "ospfarea";
    String OSPFINSTANCE_ENTITY_TYPE = "ospfinstance";
    String OSPFINTERFACE_ENTITY_TYPE = "ospfinterface";
    String OVERLAYADDRESSPOOL_ENTITY_TYPE = "overlayaddresspool";
    String OVERLAYMIRRORDESTINATION_ENTITY_TYPE = "overlaymirrordestination";
    String OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITY_TYPE = "overlaymirrordestinationtemplate";
    String OVERLAYPATNATENTRY_ENTITY_TYPE = "overlaypatnatentry";
    String PATIPENTRY_ENTITY_TYPE = "patipentry";
    String PATMAPPER_ENTITY_TYPE = "patmapper";
    String PATNATPOOL_ENTITY_TYPE = "patnatpool";
    String PERFORMANCEMONITOR_ENTITY_TYPE = "performancemonitor";
    String PERMISSION_ENTITY_TYPE = "permission";
    String PGEXPRESSION_ENTITY_TYPE = "pgexpression";
    String PGEXPRESSIONTEMPLATE_ENTITY_TYPE = "pgexpressiontemplate";
    String POLICYDECISION_ENTITY_TYPE = "policydecision";
    String POLICYENTRY_ENTITY_TYPE = "policyentry";
    String POLICYGROUP_ENTITY_TYPE = "policygroup";
    String POLICYGROUPTEMPLATE_ENTITY_TYPE = "policygrouptemplate";
    String POLICYOBJECTGROUP_ENTITY_TYPE = "policyobjectgroup";
    String POLICYSTATEMENT_ENTITY_TYPE = "policystatement";
    String PORT_ENTITY_TYPE = "port";
    String PORTMAPPING_ENTITY_TYPE = "portmapping";
    String PORTTEMPLATE_ENTITY_TYPE = "porttemplate";
    String PROXYARPFILTER_ENTITY_TYPE = "proxyarpfilter";
    String PSNATPOOL_ENTITY_TYPE = "psnatpool";
    String PSPATMAP_ENTITY_TYPE = "pspatmap";
    String PTRANSLATIONMAP_ENTITY_TYPE = "ptranslationmap";
    String PUBLICNETWORKMACRO_ENTITY_TYPE = "publicnetwork";
    String QOS_ENTITY_TYPE = "qos";
    String QOSPOLICER_ENTITY_TYPE = "qospolicer";
    String RATELIMITER_ENTITY_TYPE = "ratelimiter";
    String REDIRECTIONTARGET_ENTITY_TYPE = "redirectiontarget";
    String REDIRECTIONTARGETTEMPLATE_ENTITY_TYPE = "redirectiontargettemplate";
    String REDUNDANCYGROUP_ENTITY_TYPE = "redundancygroup";
    String VMRESYNC_ENTITY_TYPE = "resync";
    String ROUTINGPOLICY_ENTITY_TYPE = "routingpolicy";
    String WANSERVICE_ENTITY_TYPE = "service";
    String SHAREDNETWORKRESOURCE_ENTITY_TYPE = "sharednetworkresource";
    String SITEINFO_ENTITY_TYPE = "site";
    String SPATSOURCESPOOL_ENTITY_TYPE = "spatsourcespool";
    String SSHKEY_ENTITY_TYPE = "sshkey";
    String SSIDCONNECTION_ENTITY_TYPE = "ssidconnection";
    String STATICROUTE_ENTITY_TYPE = "staticroute";
    String STATISTICS_ENTITY_TYPE = "statistics";
    String STATSCOLLECTORINFO_ENTITY_TYPE = "statisticscollector";
    String STATISTICSPOLICY_ENTITY_TYPE = "statisticspolicy";
    String SUBNET_ENTITY_TYPE = "subnet";
    String SUBNETTEMPLATE_ENTITY_TYPE = "subnettemplate";
    String SYSTEMCONFIG_ENTITY_TYPE = "systemconfig";
    String TCA_ENTITY_TYPE = "tca";
    String TIER_ENTITY_TYPE = "tier";
    String TRUNK_ENTITY_TYPE = "trunk";
    String UNDERLAY_ENTITY_TYPE = "underlay";
    String UPLINKCONNECTION_ENTITY_TYPE = "uplinkconnection";
    String UPLINKRD_ENTITY_TYPE = "uplinkroutedistinguisher";
    String USER_ENTITY_TYPE = "user";
    String USERCONTEXT_ENTITY_TYPE = "usercontext";
    String VCENTER_ENTITY_TYPE = "vcenter";
    String VCENTERCLUSTER_ENTITY_TYPE = "vcentercluster";
    String VCENTERDATACENTER_ENTITY_TYPE = "vcenterdatacenter";
    String VCENTERHYPERVISOR_ENTITY_TYPE = "vcenterhypervisor";
    String VIRTUALFIREWALLPOLICY_ENTITY_TYPE = "virtualfirewallpolicy";
    String VIRTUALFIREWALLRULE_ENTITY_TYPE = "virtualfirewallrule";
    String VIRTUALIP_ENTITY_TYPE = "virtualip";
    String VLAN_ENTITY_TYPE = "vlan";
    String VLANTEMPLATE_ENTITY_TYPE = "vlantemplate";
    String VM_ENTITY_TYPE = "vm";
    String VMINTERFACE_ENTITY_TYPE = "vminterface";
    String VNF_ENTITY_TYPE = "vnf";
    String VNFCATALOG_ENTITY_TYPE = "vnfcatalog";
    String VNFDESCRIPTOR_ENTITY_TYPE = "vnfdescriptor";
    String VNFDOMAINMAPPING_ENTITY_TYPE = "vnfdomainmapping";
    String VNFINTERFACE_ENTITY_TYPE = "vnfinterface";
    String VNFINTERFACEDESCRIPTOR_ENTITY_TYPE = "vnfinterfacedescriptor";
    String VNFMETADATA_ENTITY_TYPE = "vnfmetadata";
    String VNFTHRESHOLDPOLICY_ENTITY_TYPE = "vnfthresholdpolicy";
    String VPNCONNECTION_ENTITY_TYPE = "vpnconnection";
    String VPORT_ENTITY_TYPE = "vport";
    String VPORTMIRROR_ENTITY_TYPE = "vportmirror";
    String VRS_ENTITY_TYPE = "vrs";
    String VRSADDRESSRANGE_ENTITY_TYPE = "vrsaddressrange";
    String VCENTERVRSCONFIG_ENTITY_TYPE = "vrsconfig";
    String VRSMETRICS_ENTITY_TYPE = "vrsmetrics";
    String VRSREDEPLOYMENTPOLICY_ENTITY_TYPE = "vrsredeploymentpolicy";
    String VSC_ENTITY_TYPE = "vsc";
    String VSD_ENTITY_TYPE = "vsd";
    String VSGREDUNDANTPORT_ENTITY_TYPE = "vsgredundantport";
    String VSP_ENTITY_TYPE = "vsp";
    String WIRELESSPORT_ENTITY_TYPE = "wirelessport";
    String ZFBAUTOASSIGNMENT_ENTITY_TYPE = "zfbautoassignment";
    String ZFBREQUEST_ENTITY_TYPE = "zfbrequest";
    String ZONE_ENTITY_TYPE = "zone";
    String ZONETEMPLATE_ENTITY_TYPE = "zonetemplate";}