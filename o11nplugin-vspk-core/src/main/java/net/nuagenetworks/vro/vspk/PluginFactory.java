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

package net.nuagenetworks.vro.vspk;

import net.nuagenetworks.vro.vspk.model.*;
import net.nuagenetworks.vro.vspk.model.fetchers.*;
import net.nuagenetworks.vro.vspk.model.enums.*;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.vro.BasePluginFactory;
import ch.dunes.vso.sdk.api.IPluginNotificationHandler;
import ch.dunes.vso.sdk.api.QueryResult;
import java.util.Arrays;

public final class PluginFactory extends BasePluginFactory {
    public PluginFactory(IPluginNotificationHandler pluginNotificationHandler) {
        super(pluginNotificationHandler);
    }

    @Override
    public final Object findImpl(String type, String id) throws RestException {
        if (type.equals(Constants.SESSION)) {
            return ModelHelper.getSessionById(id);
        }
        if (type.equals(Constants.CERTIFICATEMETADATA)) {
            return ModelHelper.getCertificateMetadataById(id);
        }
        if (type.equals(Constants.CERTIFICATEMETADATAS_FETCHER)) {
            return ModelHelper.getCertificateMetadatasFetcherById(id);
        }
        if (type.equals(Constants.DOWNLOADPROGRESS)) {
            return ModelHelper.getDownloadProgressById(id);
        }
        if (type.equals(Constants.DOWNLOADPROGRESS_FETCHER)) {
            return ModelHelper.getDownloadProgressFetcherById(id);
        }
        if (type.equals(Constants.TCPCONNECTTESTRESULT)) {
            return ModelHelper.getTCPConnectTestResultById(id);
        }
        if (type.equals(Constants.TCPCONNECTTESTRESULTS_FETCHER)) {
            return ModelHelper.getTCPConnectTestResultsFetcherById(id);
        }
        if (type.equals(Constants.THREATPREVENTIONNODEINFO)) {
            return ModelHelper.getThreatPreventionNodeInfoById(id);
        }
        if (type.equals(Constants.THREATPREVENTIONNODEINFOS_FETCHER)) {
            return ModelHelper.getThreatPreventionNodeInfosFetcherById(id);
        }
        if (type.equals(Constants.VPORTINFO)) {
            return ModelHelper.getVPortInfoById(id);
        }
        if (type.equals(Constants.VPORTINFOS_FETCHER)) {
            return ModelHelper.getVPortInfosFetcherById(id);
        }
        if (type.equals(Constants.VPORTINFO_VPORTOPERATIONALSTATE_ENUM)) {
            return VPortInfoVPortOperationalState.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGCLASS)) {
            return ModelHelper.getForwardingClassById(id);
        }
        if (type.equals(Constants.FORWARDINGCLASS_FETCHER)) {
            return ModelHelper.getForwardingClassFetcherById(id);
        }
        if (type.equals(Constants.FORWARDINGCLASS_FORWARDINGCLASS_ENUM)) {
            return ForwardingClassForwardingClass.getEnumById(id);
        }
        
        if (type.equals(Constants.BANDWIDTHTESTRESULT)) {
            return ModelHelper.getBandwidthTestResultById(id);
        }
        if (type.equals(Constants.BANDWIDTHTESTRESULTS_FETCHER)) {
            return ModelHelper.getBandwidthTestResultsFetcherById(id);
        }
        if (type.equals(Constants.MTUDISCOVERYTESTRESULT)) {
            return ModelHelper.getMTUDiscoveryTestResultById(id);
        }
        if (type.equals(Constants.MTUDISCOVERYTESTRESULTS_FETCHER)) {
            return ModelHelper.getMTUDiscoveryTestResultsFetcherById(id);
        }
        if (type.equals(Constants.SYSMONUPLINKCONNECTION)) {
            return ModelHelper.getSysmonUplinkConnectionById(id);
        }
        if (type.equals(Constants.SYSMONUPLINKCONNECTIONS_FETCHER)) {
            return ModelHelper.getSysmonUplinkConnectionsFetcherById(id);
        }
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_IPSECDTLSSTATE_ENUM)) {
            return SysmonUplinkConnectionIpsecDtlsState.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_JSONSTATE_ENUM)) {
            return SysmonUplinkConnectionJsonState.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_OPENFLOWSTATE_ENUM)) {
            return SysmonUplinkConnectionOpenflowState.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_VXLANDTLSSTATE_ENUM)) {
            return SysmonUplinkConnectionVxlanDtlsState.getEnumById(id);
        }
        
        if (type.equals(Constants.UDPPROBETESTRESULT)) {
            return ModelHelper.getUDPProbeTestResultById(id);
        }
        if (type.equals(Constants.UDPPROBETESTRESULTS_FETCHER)) {
            return ModelHelper.getUDPProbeTestResultsFetcherById(id);
        }
        if (type.equals(Constants.ALLOCATIONPOOL)) {
            return ModelHelper.getAllocationPoolById(id);
        }
        if (type.equals(Constants.ALLOCATIONPOOLS_FETCHER)) {
            return ModelHelper.getAllocationPoolsFetcherById(id);
        }
        if (type.equals(Constants.ADDRESSMAP)) {
            return ModelHelper.getAddressMapById(id);
        }
        if (type.equals(Constants.ADDRESSMAPS_FETCHER)) {
            return ModelHelper.getAddressMapsFetcherById(id);
        }
        if (type.equals(Constants.ADDRESSMAP_ENTITYSCOPE_ENUM)) {
            return AddressMapEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ADDRESSMAP_TYPE_ENUM)) {
            return AddressMapType.getEnumById(id);
        }
        
        if (type.equals(Constants.ADDRESSRANGE)) {
            return ModelHelper.getAddressRangeById(id);
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return ModelHelper.getAddressRangesFetcherById(id);
        }
        if (type.equals(Constants.ADDRESSRANGE_DHCPPOOLTYPE_ENUM)) {
            return AddressRangeDHCPPoolType.getEnumById(id);
        }
        
        if (type.equals(Constants.ADDRESSRANGE_IPTYPE_ENUM)) {
            return AddressRangeIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.ADDRESSRANGE_ENTITYSCOPE_ENUM)) {
            return AddressRangeEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN)) {
            return ModelHelper.getAggregatedDomainById(id);
        }
        if (type.equals(Constants.AGGREGATEDDOMAINS_FETCHER)) {
            return ModelHelper.getAggregatedDomainsFetcherById(id);
        }
        if (type.equals(Constants.AGGREGATEDDOMAIN_DHCPBEHAVIOR_ENUM)) {
            return AggregatedDomainDHCPBehavior.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_DPI_ENUM)) {
            return AggregatedDomainDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_FIPIGNOREDEFAULTROUTE_ENUM)) {
            return AggregatedDomainFIPIgnoreDefaultRoute.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_PATENABLED_ENUM)) {
            return AggregatedDomainPATEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_ADVERTISECRITERIA_ENUM)) {
            return AggregatedDomainAdvertiseCriteria.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_ENCRYPTION_ENUM)) {
            return AggregatedDomainEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_ENTITYSCOPE_ENUM)) {
            return AggregatedDomainEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_FLOWCOLLECTIONENABLED_ENUM)) {
            return AggregatedDomainFlowCollectionEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_MAINTENANCEMODE_ENUM)) {
            return AggregatedDomainMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_MULTICAST_ENUM)) {
            return AggregatedDomainMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_PERMITTEDACTION_ENUM)) {
            return AggregatedDomainPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return AggregatedDomainPolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_TUNNELTYPE_ENUM)) {
            return AggregatedDomainTunnelType.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_UNDERLAYENABLED_ENUM)) {
            return AggregatedDomainUnderlayEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_UPLINKPREFERENCE_ENUM)) {
            return AggregatedDomainUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.AGGREGATEMETADATA)) {
            return ModelHelper.getAggregateMetadataById(id);
        }
        if (type.equals(Constants.AGGREGATEMETADATAS_FETCHER)) {
            return ModelHelper.getAggregateMetadatasFetcherById(id);
        }
        if (type.equals(Constants.AGGREGATEMETADATA_ENTITYSCOPE_ENUM)) {
            return AggregateMetadataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ALARM)) {
            return ModelHelper.getAlarmById(id);
        }
        if (type.equals(Constants.ALARMS_FETCHER)) {
            return ModelHelper.getAlarmsFetcherById(id);
        }
        if (type.equals(Constants.ALARM_ENTITYSCOPE_ENUM)) {
            return AlarmEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ALARM_SEVERITY_ENUM)) {
            return AlarmSeverity.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLALARM)) {
            return ModelHelper.getAllAlarmById(id);
        }
        if (type.equals(Constants.ALLALARMS_FETCHER)) {
            return ModelHelper.getAllAlarmsFetcherById(id);
        }
        if (type.equals(Constants.ALLALARM_ENTITYSCOPE_ENUM)) {
            return AllAlarmEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLALARM_SEVERITY_ENUM)) {
            return AllAlarmSeverity.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLGATEWAY)) {
            return ModelHelper.getAllGatewayById(id);
        }
        if (type.equals(Constants.ALLGATEWAYS_FETCHER)) {
            return ModelHelper.getAllGatewaysFetcherById(id);
        }
        if (type.equals(Constants.ALLGATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return AllGatewayZFBMatchAttribute.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return AllGatewayBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLGATEWAY_ENTITYSCOPE_ENUM)) {
            return AllGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLGATEWAY_FAMILY_ENUM)) {
            return AllGatewayFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLGATEWAY_PERMITTEDACTION_ENUM)) {
            return AllGatewayPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLGATEWAY_PERSONALITY_ENUM)) {
            return AllGatewayPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP)) {
            return ModelHelper.getAllRedundancyGroupById(id);
        }
        if (type.equals(Constants.ALLREDUNDANCYGROUPS_FETCHER)) {
            return ModelHelper.getAllRedundancyGroupsFetcherById(id);
        }
        if (type.equals(Constants.ALLREDUNDANCYGROUP_ENTITYSCOPE_ENUM)) {
            return AllRedundancyGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP_PERMITTEDACTION_ENUM)) {
            return AllRedundancyGroupPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP_PERSONALITY_ENUM)) {
            return AllRedundancyGroupPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP_REDUNDANTGATEWAYSTATUS_ENUM)) {
            return AllRedundancyGroupRedundantGatewayStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATION)) {
            return ModelHelper.getApplicationById(id);
        }
        if (type.equals(Constants.APPLICATIONS_FETCHER)) {
            return ModelHelper.getApplicationsFetcherById(id);
        }
        if (type.equals(Constants.APPLICATION_ENTITYSCOPE_ENUM)) {
            return ApplicationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATION_OPTIMIZEPATHSELECTION_ENUM)) {
            return ApplicationOptimizePathSelection.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATION_PERFORMANCEMONITORTYPE_ENUM)) {
            return ApplicationPerformanceMonitorType.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATION_POSTCLASSIFICATIONPATH_ENUM)) {
            return ApplicationPostClassificationPath.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATION_PRECLASSIFICATIONPATH_ENUM)) {
            return ApplicationPreClassificationPath.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATION_PROTOCOL_ENUM)) {
            return ApplicationProtocol.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATIONBINDING)) {
            return ModelHelper.getApplicationBindingById(id);
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            return ModelHelper.getApplicationBindingsFetcherById(id);
        }
        if (type.equals(Constants.APPLICATIONBINDING_ENTITYSCOPE_ENUM)) {
            return ApplicationBindingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT)) {
            return ModelHelper.getApplicationperformancemanagementById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return ModelHelper.getApplicationperformancemanagementsFetcherById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_ENTITYSCOPE_ENUM)) {
            return ApplicationperformancemanagementEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING)) {
            return ModelHelper.getApplicationperformancemanagementbindingById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return ModelHelper.getApplicationperformancemanagementbindingsFetcherById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITYSCOPE_ENUM)) {
            return ApplicationperformancemanagementbindingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AUTODISCOVERCLUSTER)) {
            return ModelHelper.getAutoDiscoverClusterById(id);
        }
        if (type.equals(Constants.AUTODISCOVERCLUSTERS_FETCHER)) {
            return ModelHelper.getAutoDiscoverClustersFetcherById(id);
        }
        if (type.equals(Constants.AUTODISCOVERCLUSTER_ENTITYSCOPE_ENUM)) {
            return AutoDiscoverClusterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDDATACENTER)) {
            return ModelHelper.getAutodiscovereddatacenterById(id);
        }
        if (type.equals(Constants.AUTODISCOVEREDDATACENTERS_FETCHER)) {
            return ModelHelper.getAutodiscovereddatacentersFetcherById(id);
        }
        if (type.equals(Constants.AUTODISCOVEREDDATACENTER_ENTITYSCOPE_ENUM)) {
            return AutodiscovereddatacenterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY)) {
            return ModelHelper.getAutoDiscoveredGatewayById(id);
        }
        if (type.equals(Constants.AUTODISCOVEREDGATEWAYS_FETCHER)) {
            return ModelHelper.getAutoDiscoveredGatewaysFetcherById(id);
        }
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY_ENTITYSCOPE_ENUM)) {
            return AutoDiscoveredGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY_PERSONALITY_ENUM)) {
            return AutoDiscoveredGatewayPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER)) {
            return ModelHelper.getAutoDiscoverHypervisorFromClusterById(id);
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER)) {
            return ModelHelper.getAutoDiscoverHypervisorFromClustersFetcherById(id);
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITYSCOPE_ENUM)) {
            return AutoDiscoverHypervisorFromClusterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AVATAR)) {
            return ModelHelper.getAvatarById(id);
        }
        if (type.equals(Constants.AVATARS_FETCHER)) {
            return ModelHelper.getAvatarsFetcherById(id);
        }
        if (type.equals(Constants.AVATAR_ENTITYSCOPE_ENUM)) {
            return AvatarEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.AZURECLOUD)) {
            return ModelHelper.getAzureCloudById(id);
        }
        if (type.equals(Constants.AZURECLOUDS_FETCHER)) {
            return ModelHelper.getAzureCloudsFetcherById(id);
        }
        if (type.equals(Constants.AZURECLOUD_ENTITYSCOPE_ENUM)) {
            return AzureCloudEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BFDSESSION)) {
            return ModelHelper.getBFDSessionById(id);
        }
        if (type.equals(Constants.BFDSESSIONS_FETCHER)) {
            return ModelHelper.getBFDSessionsFetcherById(id);
        }
        if (type.equals(Constants.BFDSESSION_BFDDESTINATIONIPTYPE_ENUM)) {
            return BFDSessionBFDDestinationIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.BFDSESSION_ENTITYSCOPE_ENUM)) {
            return BFDSessionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BGPNEIGHBOR)) {
            return ModelHelper.getBGPNeighborById(id);
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return ModelHelper.getBGPNeighborsFetcherById(id);
        }
        if (type.equals(Constants.BGPNEIGHBOR_IPTYPE_ENUM)) {
            return BGPNeighborIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.BGPNEIGHBOR_ENTITYSCOPE_ENUM)) {
            return BGPNeighborEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BGPPEER)) {
            return ModelHelper.getBGPPeerById(id);
        }
        if (type.equals(Constants.BGPPEERS_FETCHER)) {
            return ModelHelper.getBGPPeersFetcherById(id);
        }
        if (type.equals(Constants.BGPPEER_ENTITYSCOPE_ENUM)) {
            return BGPPeerEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BGPPEER_STATUS_ENUM)) {
            return BGPPeerStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.BGPPROFILE)) {
            return ModelHelper.getBGPProfileById(id);
        }
        if (type.equals(Constants.BGPPROFILES_FETCHER)) {
            return ModelHelper.getBGPProfilesFetcherById(id);
        }
        if (type.equals(Constants.BGPPROFILE_ENTITYSCOPE_ENUM)) {
            return BGPProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BOOTSTRAP)) {
            return ModelHelper.getBootstrapById(id);
        }
        if (type.equals(Constants.BOOTSTRAPS_FETCHER)) {
            return ModelHelper.getBootstrapsFetcherById(id);
        }
        if (type.equals(Constants.BOOTSTRAP_ZFBMATCHATTRIBUTE_ENUM)) {
            return BootstrapZFBMatchAttribute.getEnumById(id);
        }
        
        if (type.equals(Constants.BOOTSTRAP_ENTITYSCOPE_ENUM)) {
            return BootstrapEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BOOTSTRAP_STATUS_ENUM)) {
            return BootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION)) {
            return ModelHelper.getBootstrapActivationById(id);
        }
        if (type.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER)) {
            return ModelHelper.getBootstrapActivationsFetcherById(id);
        }
        if (type.equals(Constants.BOOTSTRAPACTIVATION_ACTION_ENUM)) {
            return BootstrapActivationAction.getEnumById(id);
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION_ENTITYSCOPE_ENUM)) {
            return BootstrapActivationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BRCONNECTION)) {
            return ModelHelper.getBRConnectionById(id);
        }
        if (type.equals(Constants.BRCONNECTIONS_FETCHER)) {
            return ModelHelper.getBRConnectionsFetcherById(id);
        }
        if (type.equals(Constants.BRCONNECTION_ADDRESSFAMILY_ENUM)) {
            return BRConnectionAddressFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.BRCONNECTION_ADVERTISEMENTCRITERIA_ENUM)) {
            return BRConnectionAdvertisementCriteria.getEnumById(id);
        }
        
        if (type.equals(Constants.BRCONNECTION_ENTITYSCOPE_ENUM)) {
            return BRConnectionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BRCONNECTION_MODE_ENUM)) {
            return BRConnectionMode.getEnumById(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE)) {
            return ModelHelper.getBridgeInterfaceById(id);
        }
        if (type.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return ModelHelper.getBridgeInterfacesFetcherById(id);
        }
        if (type.equals(Constants.BRIDGEINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return BridgeInterfaceAttachedNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE_ENTITYSCOPE_ENUM)) {
            return BridgeInterfaceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BULKSTATISTICS)) {
            return ModelHelper.getBulkStatisticsById(id);
        }
        if (type.equals(Constants.BULKSTATISTICS_FETCHER)) {
            return ModelHelper.getBulkStatisticsFetcherById(id);
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILE)) {
            return ModelHelper.getCaptivePortalProfileById(id);
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILES_FETCHER)) {
            return ModelHelper.getCaptivePortalProfilesFetcherById(id);
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILE_ENTITYSCOPE_ENUM)) {
            return CaptivePortalProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CAPTIVEPORTALPROFILE_PORTALTYPE_ENUM)) {
            return CaptivePortalProfilePortalType.getEnumById(id);
        }
        
        if (type.equals(Constants.CERTIFICATE)) {
            return ModelHelper.getCertificateById(id);
        }
        if (type.equals(Constants.CERTIFICATES_FETCHER)) {
            return ModelHelper.getCertificatesFetcherById(id);
        }
        if (type.equals(Constants.CERTIFICATE_ENTITYSCOPE_ENUM)) {
            return CertificateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM)) {
            return ModelHelper.getCloudMgmtSystemById(id);
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEMS_FETCHER)) {
            return ModelHelper.getCloudMgmtSystemsFetcherById(id);
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEM_ENTITYSCOPE_ENUM)) {
            return CloudMgmtSystemEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.COMMAND)) {
            return ModelHelper.getCommandById(id);
        }
        if (type.equals(Constants.COMMANDS_FETCHER)) {
            return ModelHelper.getCommandsFetcherById(id);
        }
        if (type.equals(Constants.COMMAND_COMMAND_ENUM)) {
            return CommandCommand.getEnumById(id);
        }
        
        if (type.equals(Constants.COMMAND_ENTITYSCOPE_ENUM)) {
            return CommandEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.COMMAND_OVERRIDE_ENUM)) {
            return CommandOverride.getEnumById(id);
        }
        
        if (type.equals(Constants.COMMAND_STATUS_ENUM)) {
            return CommandStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VSDCOMPONENT)) {
            return ModelHelper.getVSDComponentById(id);
        }
        if (type.equals(Constants.VSDCOMPONENTS_FETCHER)) {
            return ModelHelper.getVSDComponentsFetcherById(id);
        }
        if (type.equals(Constants.VSDCOMPONENT_ENTITYSCOPE_ENUM)) {
            return VSDComponentEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VSDCOMPONENT_STATUS_ENUM)) {
            return VSDComponentStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VSDCOMPONENT_TYPE_ENUM)) {
            return VSDComponentType.getEnumById(id);
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT)) {
            return ModelHelper.getConnectionendpointById(id);
        }
        if (type.equals(Constants.CONNECTIONENDPOINTS_FETCHER)) {
            return ModelHelper.getConnectionendpointsFetcherById(id);
        }
        if (type.equals(Constants.CONNECTIONENDPOINT_IPTYPE_ENUM)) {
            return ConnectionendpointIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT_ENDPOINTTYPE_ENUM)) {
            return ConnectionendpointEndPointType.getEnumById(id);
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT_ENTITYSCOPE_ENUM)) {
            return ConnectionendpointEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINER)) {
            return ModelHelper.getContainerById(id);
        }
        if (type.equals(Constants.CONTAINERS_FETCHER)) {
            return ModelHelper.getContainersFetcherById(id);
        }
        if (type.equals(Constants.CONTAINER_DELETEMODE_ENUM)) {
            return ContainerDeleteMode.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINER_ENTITYSCOPE_ENUM)) {
            return ContainerEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINER_REASONTYPE_ENUM)) {
            return ContainerReasonType.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINER_STATUS_ENUM)) {
            return ContainerStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE)) {
            return ModelHelper.getContainerInterfaceById(id);
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return ModelHelper.getContainerInterfacesFetcherById(id);
        }
        if (type.equals(Constants.CONTAINERINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return ContainerInterfaceAttachedNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE_ENTITYSCOPE_ENUM)) {
            return ContainerInterfaceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINERRESYNC)) {
            return ModelHelper.getContainerResyncById(id);
        }
        if (type.equals(Constants.CONTAINERRESYNCS_FETCHER)) {
            return ModelHelper.getContainerResyncsFetcherById(id);
        }
        if (type.equals(Constants.CONTAINERRESYNC_ENTITYSCOPE_ENUM)) {
            return ContainerResyncEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTAINERRESYNC_STATUS_ENUM)) {
            return ContainerResyncStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK)) {
            return ModelHelper.getControllerVRSLinkById(id);
        }
        if (type.equals(Constants.CONTROLLERVRSLINKS_FETCHER)) {
            return ModelHelper.getControllerVRSLinksFetcherById(id);
        }
        if (type.equals(Constants.CONTROLLERVRSLINK_JSONRPCCONNECTIONSTATE_ENUM)) {
            return ControllerVRSLinkJSONRPCConnectionState.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_VRSPERSONALITY_ENUM)) {
            return ControllerVRSLinkVRSPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_VSCCONFIGSTATE_ENUM)) {
            return ControllerVRSLinkVSCConfigState.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_VSCCURRENTSTATE_ENUM)) {
            return ControllerVRSLinkVSCCurrentState.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_CLUSTERNODEROLE_ENUM)) {
            return ControllerVRSLinkClusterNodeRole.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_CONTROLLERTYPE_ENUM)) {
            return ControllerVRSLinkControllerType.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_ENTITYSCOPE_ENUM)) {
            return ControllerVRSLinkEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_ROLE_ENUM)) {
            return ControllerVRSLinkRole.getEnumById(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_STATUS_ENUM)) {
            return ControllerVRSLinkStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY)) {
            return ModelHelper.getCOSRemarkingPolicyById(id);
        }
        if (type.equals(Constants.COSREMARKINGPOLICIES_FETCHER)) {
            return ModelHelper.getCOSRemarkingPoliciesFetcherById(id);
        }
        if (type.equals(Constants.COSREMARKINGPOLICY_ENTITYSCOPE_ENUM)) {
            return COSRemarkingPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY_FORWARDINGCLASS_ENUM)) {
            return COSRemarkingPolicyForwardingClass.getEnumById(id);
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE)) {
            return ModelHelper.getCOSRemarkingPolicyTableById(id);
        }
        if (type.equals(Constants.COSREMARKINGPOLICYTABLES_FETCHER)) {
            return ModelHelper.getCOSRemarkingPolicyTablesFetcherById(id);
        }
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE_ENTITYSCOPE_ENUM)) {
            return COSRemarkingPolicyTableEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CSNATPOOL)) {
            return ModelHelper.getCSNATPoolById(id);
        }
        if (type.equals(Constants.CSNATPOOLS_FETCHER)) {
            return ModelHelper.getCSNATPoolsFetcherById(id);
        }
        if (type.equals(Constants.CSNATPOOL_IPTYPE_ENUM)) {
            return CSNATPoolIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.CSNATPOOL_ENTITYSCOPE_ENUM)) {
            return CSNATPoolEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP)) {
            return ModelHelper.getCTranslationMapById(id);
        }
        if (type.equals(Constants.CTRANSLATIONMAPS_FETCHER)) {
            return ModelHelper.getCTranslationMapsFetcherById(id);
        }
        if (type.equals(Constants.CTRANSLATIONMAP_ENTITYSCOPE_ENUM)) {
            return CTranslationMapEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP_MAPPINGTYPE_ENUM)) {
            return CTranslationMapMappingType.getEnumById(id);
        }
        
        if (type.equals(Constants.CUSTOMPROPERTY)) {
            return ModelHelper.getCustomPropertyById(id);
        }
        if (type.equals(Constants.CUSTOMPROPERTIES_FETCHER)) {
            return ModelHelper.getCustomPropertiesFetcherById(id);
        }
        if (type.equals(Constants.CUSTOMPROPERTY_ENTITYSCOPE_ENUM)) {
            return CustomPropertyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DEFAULTGATEWAY)) {
            return ModelHelper.getDefaultGatewayById(id);
        }
        if (type.equals(Constants.DEFAULTGATEWAYS_FETCHER)) {
            return ModelHelper.getDefaultGatewaysFetcherById(id);
        }
        if (type.equals(Constants.DEFAULTGATEWAY_ENTITYSCOPE_ENUM)) {
            return DefaultGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE)) {
            return ModelHelper.getDemarcationServiceById(id);
        }
        if (type.equals(Constants.DEMARCATIONSERVICES_FETCHER)) {
            return ModelHelper.getDemarcationServicesFetcherById(id);
        }
        if (type.equals(Constants.DEMARCATIONSERVICE_ENTITYSCOPE_ENUM)) {
            return DemarcationServiceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE_TYPE_ENUM)) {
            return DemarcationServiceType.getEnumById(id);
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE)) {
            return ModelHelper.getDeploymentFailureById(id);
        }
        if (type.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return ModelHelper.getDeploymentFailuresFetcherById(id);
        }
        if (type.equals(Constants.DEPLOYMENTFAILURE_ENTITYSCOPE_ENUM)) {
            return DeploymentFailureEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE_EVENTTYPE_ENUM)) {
            return DeploymentFailureEventType.getEnumById(id);
        }
        
        if (type.equals(Constants.DESTINATIONURL)) {
            return ModelHelper.getDestinationurlById(id);
        }
        if (type.equals(Constants.DESTINATIONURLS_FETCHER)) {
            return ModelHelper.getDestinationurlsFetcherById(id);
        }
        if (type.equals(Constants.DESTINATIONURL_HTTPMETHOD_ENUM)) {
            return DestinationurlHTTPMethod.getEnumById(id);
        }
        
        if (type.equals(Constants.DESTINATIONURL_ENTITYSCOPE_ENUM)) {
            return DestinationurlEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DHCPOPTION)) {
            return ModelHelper.getDHCPOptionById(id);
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return ModelHelper.getDHCPOptionsFetcherById(id);
        }
        if (type.equals(Constants.DHCPOPTION_ENTITYSCOPE_ENUM)) {
            return DHCPOptionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DHCPV6OPTION)) {
            return ModelHelper.getDHCPv6OptionById(id);
        }
        if (type.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return ModelHelper.getDHCPv6OptionsFetcherById(id);
        }
        if (type.equals(Constants.DHCPV6OPTION_ENTITYSCOPE_ENUM)) {
            return DHCPv6OptionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DISKSTAT)) {
            return ModelHelper.getDiskStatById(id);
        }
        if (type.equals(Constants.DISKSTATS_FETCHER)) {
            return ModelHelper.getDiskStatsFetcherById(id);
        }
        if (type.equals(Constants.DISKSTAT_ENTITYSCOPE_ENUM)) {
            return DiskStatEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DISKSTAT_UNIT_ENUM)) {
            return DiskStatUnit.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN)) {
            return ModelHelper.getDomainById(id);
        }
        if (type.equals(Constants.DOMAINS_FETCHER)) {
            return ModelHelper.getDomainsFetcherById(id);
        }
        if (type.equals(Constants.DOMAIN_DHCPBEHAVIOR_ENUM)) {
            return DomainDHCPBehavior.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_DPI_ENUM)) {
            return DomainDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_EVPNRT5TYPE_ENUM)) {
            return DomainEVPNRT5Type.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_FIPIGNOREDEFAULTROUTE_ENUM)) {
            return DomainFIPIgnoreDefaultRoute.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_PATENABLED_ENUM)) {
            return DomainPATEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_ADVERTISECRITERIA_ENUM)) {
            return DomainAdvertiseCriteria.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_AGGREGATIONFLOWTYPE_ENUM)) {
            return DomainAggregationFlowType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_ENCRYPTION_ENUM)) {
            return DomainEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_ENTITYSCOPE_ENUM)) {
            return DomainEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_FLOWCOLLECTIONENABLED_ENUM)) {
            return DomainFlowCollectionEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_FLOWLIMITENABLED_ENUM)) {
            return DomainFlowLimitEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_FLOWSETUPRATELIMITENABLED_ENUM)) {
            return DomainFlowSetupRateLimitEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_MAINTENANCEMODE_ENUM)) {
            return DomainMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_MULTICAST_ENUM)) {
            return DomainMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_PERMITTEDACTION_ENUM)) {
            return DomainPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return DomainPolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_THREATINTELLIGENCEENABLED_ENUM)) {
            return DomainThreatIntelligenceEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_TUNNELTYPE_ENUM)) {
            return DomainTunnelType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_UNDERLAYENABLED_ENUM)) {
            return DomainUnderlayEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return DomainUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINKINDSUMMARY)) {
            return ModelHelper.getDomainKindSummaryById(id);
        }
        if (type.equals(Constants.DOMAINKINDSUMMARIES_FETCHER)) {
            return ModelHelper.getDomainKindSummariesFetcherById(id);
        }
        if (type.equals(Constants.DOMAINKINDSUMMARY_ENTITYSCOPE_ENUM)) {
            return DomainKindSummaryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE)) {
            return ModelHelper.getDomainTemplateById(id);
        }
        if (type.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            return ModelHelper.getDomainTemplatesFetcherById(id);
        }
        if (type.equals(Constants.DOMAINTEMPLATE_DPI_ENUM)) {
            return DomainTemplateDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_ENCRYPTION_ENUM)) {
            return DomainTemplateEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_ENTITYSCOPE_ENUM)) {
            return DomainTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_MULTICAST_ENUM)) {
            return DomainTemplateMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM)) {
            return DomainTemplatePolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING)) {
            return ModelHelper.getDSCPForwardingClassMappingById(id);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER)) {
            return ModelHelper.getDSCPForwardingClassMappingsFetcherById(id);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING_ENTITYSCOPE_ENUM)) {
            return DSCPForwardingClassMappingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING_FORWARDINGCLASS_ENUM)) {
            return DSCPForwardingClassMappingForwardingClass.getEnumById(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE)) {
            return ModelHelper.getDSCPForwardingClassTableById(id);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER)) {
            return ModelHelper.getDSCPForwardingClassTablesFetcherById(id);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE_ENTITYSCOPE_ENUM)) {
            return DSCPForwardingClassTableEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY)) {
            return ModelHelper.getDSCPRemarkingPolicyById(id);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICIES_FETCHER)) {
            return ModelHelper.getDSCPRemarkingPoliciesFetcherById(id);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICY_ENTITYSCOPE_ENUM)) {
            return DSCPRemarkingPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY_FORWARDINGCLASS_ENUM)) {
            return DSCPRemarkingPolicyForwardingClass.getEnumById(id);
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE)) {
            return ModelHelper.getDSCPRemarkingPolicyTableById(id);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLES_FETCHER)) {
            return ModelHelper.getDSCPRemarkingPolicyTablesFetcherById(id);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE_ENTITYSCOPE_ENUM)) {
            return DSCPRemarkingPolicyTableEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DUCGROUP)) {
            return ModelHelper.getDUCGroupById(id);
        }
        if (type.equals(Constants.DUCGROUPS_FETCHER)) {
            return ModelHelper.getDUCGroupsFetcherById(id);
        }
        if (type.equals(Constants.DUCGROUP_ENTITYSCOPE_ENUM)) {
            return DUCGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DUCGROUP_FUNCTION_ENUM)) {
            return DUCGroupFunction.getEnumById(id);
        }
        
        if (type.equals(Constants.DUCGROUPBINDING)) {
            return ModelHelper.getDUCGroupBindingById(id);
        }
        if (type.equals(Constants.DUCGROUPBINDINGS_FETCHER)) {
            return ModelHelper.getDUCGroupBindingsFetcherById(id);
        }
        if (type.equals(Constants.DUCGROUPBINDING_ASSOCIATEDUBRGROUPFUNCTION_ENUM)) {
            return DUCGroupBindingAssociatedUBRGroupFunction.getEnumById(id);
        }
        
        if (type.equals(Constants.DUCGROUPBINDING_ENTITYSCOPE_ENUM)) {
            return DUCGroupBindingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG)) {
            return ModelHelper.getVCenterEAMConfigById(id);
        }
        if (type.equals(Constants.VCENTEREAMCONFIGS_FETCHER)) {
            return ModelHelper.getVCenterEAMConfigsFetcherById(id);
        }
        if (type.equals(Constants.VCENTEREAMCONFIG_ENTITYSCOPE_ENUM)) {
            return VCenterEAMConfigEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE)) {
            return ModelHelper.getEgressACLEntryTemplateById(id);
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return ModelHelper.getEgressACLEntryTemplatesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ACTION_ENUM)) {
            return EgressACLEntryTemplateAction.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return EgressACLEntryTemplateAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressACLEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return EgressACLEntryTemplateLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return EgressACLEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return EgressACLEntryTemplateNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return EgressACLEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressACLEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return EgressACLEntryTemplateWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE)) {
            return ModelHelper.getEgressACLTemplateById(id);
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return ModelHelper.getEgressACLTemplatesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressACLTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressACLTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return EgressACLTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE)) {
            return ModelHelper.getEgressAdvFwdEntryTemplateById(id);
        }
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return ModelHelper.getEgressAdvFwdEntryTemplatesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM)) {
            return EgressAdvFwdEntryTemplateFCOverride.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM)) {
            return EgressAdvFwdEntryTemplateAction.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressAdvFwdEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_FAILSAFEDATAPATH_ENUM)) {
            return EgressAdvFwdEntryTemplateFailsafeDatapath.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressAdvFwdEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_REDIRECTIONTARGETENTITYTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateRedirectionTargetEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM)) {
            return EgressAdvFwdEntryTemplateUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return EgressAdvFwdEntryTemplateWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE)) {
            return ModelHelper.getEgressAdvFwdTemplateById(id);
        }
        if (type.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            return ModelHelper.getEgressAdvFwdTemplatesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressAdvFwdTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressAdvFwdTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM)) {
            return EgressAdvFwdTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE)) {
            return ModelHelper.getEgressAuditACLEntryTemplateById(id);
        }
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return ModelHelper.getEgressAuditACLEntryTemplatesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ACTION_ENUM)) {
            return EgressAuditACLEntryTemplateAction.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return EgressAuditACLEntryTemplateAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressAuditACLEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return EgressAuditACLEntryTemplateLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return EgressAuditACLEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return EgressAuditACLEntryTemplateNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return EgressAuditACLEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressAuditACLEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return EgressAuditACLEntryTemplateWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE)) {
            return ModelHelper.getEgressAuditACLTemplateById(id);
        }
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATES_FETCHER)) {
            return ModelHelper.getEgressAuditACLTemplatesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressAuditACLTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressAuditACLTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return EgressAuditACLTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY)) {
            return ModelHelper.getDomainFIPAclTemplateEntryById(id);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER)) {
            return ModelHelper.getDomainFIPAclTemplateEntriesFetcherById(id);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ACTION_ENUM)) {
            return DomainFIPAclTemplateEntryAction.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return DomainFIPAclTemplateEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_LOCATIONENTITYTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKENTITYTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return DomainFIPAclTemplateEntryPolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_WEBFILTERTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE)) {
            return ModelHelper.getDomainFIPAclTemplateById(id);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return ModelHelper.getDomainFIPAclTemplatesFetcherById(id);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return DomainFIPAclTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE_POLICYSTATE_ENUM)) {
            return DomainFIPAclTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return DomainFIPAclTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSPROFILE)) {
            return ModelHelper.getEgressProfileById(id);
        }
        if (type.equals(Constants.EGRESSPROFILES_FETCHER)) {
            return ModelHelper.getEgressProfilesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSPROFILE_ENTITYSCOPE_ENUM)) {
            return EgressProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY)) {
            return ModelHelper.getEgressQOSPolicyById(id);
        }
        if (type.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            return ModelHelper.getEgressQOSPoliciesFetcherById(id);
        }
        if (type.equals(Constants.EGRESSQOSPOLICY_DEFAULTSERVICECLASS_ENUM)) {
            return EgressQOSPolicyDefaultServiceClass.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_ENTITYSCOPE_ENUM)) {
            return EgressQOSPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM)) {
            return EgressQOSPolicyQueue1ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM)) {
            return EgressQOSPolicyQueue2ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM)) {
            return EgressQOSPolicyQueue3ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM)) {
            return EgressQOSPolicyQueue4ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE)) {
            return ModelHelper.getEnterpriseById(id);
        }
        if (type.equals(Constants.ENTERPRISES_FETCHER)) {
            return ModelHelper.getEnterprisesFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISE_ALLOWEDFORWARDINGCLASSES_ENUM)) {
            return EnterpriseAllowedForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_ALLOWEDFORWARDINGMODE_ENUM)) {
            return EnterpriseAllowedForwardingMode.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_AVATARTYPE_ENUM)) {
            return EnterpriseAvatarType.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_ENCRYPTIONMANAGEMENTMODE_ENUM)) {
            return EnterpriseEncryptionManagementMode.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_ENTERPRISETYPE_ENUM)) {
            return EnterpriseEnterpriseType.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_ENTITYSCOPE_ENUM)) {
            return EnterpriseEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_FLOWCOLLECTIONENABLED_ENUM)) {
            return EnterpriseFlowCollectionEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_THREATINTELLIGENCEENABLED_ENUM)) {
            return EnterpriseThreatIntelligenceEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK)) {
            return ModelHelper.getEnterpriseNetworkById(id);
        }
        if (type.equals(Constants.ENTERPRISENETWORKS_FETCHER)) {
            return ModelHelper.getEnterpriseNetworksFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISENETWORK_IPTYPE_ENUM)) {
            return EnterpriseNetworkIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK_ENTITYSCOPE_ENUM)) {
            return EnterpriseNetworkEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION)) {
            return ModelHelper.getEnterprisePermissionById(id);
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return ModelHelper.getEnterprisePermissionsFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISEPERMISSION_ENTITYSCOPE_ENUM)) {
            return EnterprisePermissionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION_PERMITTEDACTION_ENUM)) {
            return EnterprisePermissionPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE)) {
            return ModelHelper.getEnterpriseProfileById(id);
        }
        if (type.equals(Constants.ENTERPRISEPROFILES_FETCHER)) {
            return ModelHelper.getEnterpriseProfilesFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISEPROFILE_ALLOWEDFORWARDINGCLASSES_ENUM)) {
            return EnterpriseProfileAllowedForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE_ENCRYPTIONMANAGEMENTMODE_ENUM)) {
            return EnterpriseProfileEncryptionManagementMode.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE_ENTITYSCOPE_ENUM)) {
            return EnterpriseProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA)) {
            return ModelHelper.getEnterpriseSecuredDataById(id);
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATAS_FETCHER)) {
            return ModelHelper.getEnterpriseSecuredDatasFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATA_ENTITYSCOPE_ENUM)) {
            return EnterpriseSecuredDataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA_SEEDTYPE_ENUM)) {
            return EnterpriseSecuredDataSeedType.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY)) {
            return ModelHelper.getEnterpriseSecurityById(id);
        }
        if (type.equals(Constants.ENTERPRISESECURITIES_FETCHER)) {
            return ModelHelper.getEnterpriseSecuritiesFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISESECURITY_ENTITYSCOPE_ENUM)) {
            return EnterpriseSecurityEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ESILMPOLICY)) {
            return ModelHelper.getEsIlmPolicyById(id);
        }
        if (type.equals(Constants.ESILMPOLICIES_FETCHER)) {
            return ModelHelper.getEsIlmPoliciesFetcherById(id);
        }
        if (type.equals(Constants.ESILMPOLICY_ENTITYSCOPE_ENUM)) {
            return EsIlmPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ESILMPOLICY_ESILMPOLICYTYPE_ENUM)) {
            return EsIlmPolicyEsIlmPolicyType.getEnumById(id);
        }
        
        if (type.equals(Constants.ESINDEXCONFIG)) {
            return ModelHelper.getEsIndexConfigById(id);
        }
        if (type.equals(Constants.ESINDEXCONFIGS_FETCHER)) {
            return ModelHelper.getEsIndexConfigsFetcherById(id);
        }
        if (type.equals(Constants.ESINDEXCONFIG_CONFIGSTATUS_ENUM)) {
            return EsIndexConfigConfigStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.ESINDEXCONFIG_ENTITYSCOPE_ENUM)) {
            return EsIndexConfigEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ESINDEXCONFIG_ILMSTATUS_ENUM)) {
            return EsIndexConfigIlmStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.ESINDEXCONFIG_INDEXTYPE_ENUM)) {
            return EsIndexConfigIndexType.getEnumById(id);
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGROUP)) {
            return ModelHelper.getEthernetSegmentGroupById(id);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGROUPS_FETCHER)) {
            return ModelHelper.getEthernetSegmentGroupsFetcherById(id);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGROUP_PORTTYPE_ENUM)) {
            return EthernetSegmentGroupPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP)) {
            return ModelHelper.getEthernetSegmentGWGroupById(id);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUPS_FETCHER)) {
            return ModelHelper.getEthernetSegmentGWGroupsFetcherById(id);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP_PERSONALITY_ENUM)) {
            return EthernetSegmentGWGroupPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.EVENTLOG)) {
            return ModelHelper.getEventLogById(id);
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER)) {
            return ModelHelper.getEventLogsFetcherById(id);
        }
        if (type.equals(Constants.EVENTLOG_ENTITYSCOPE_ENUM)) {
            return EventLogEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLACL)) {
            return ModelHelper.getFirewallAclById(id);
        }
        if (type.equals(Constants.FIREWALLACLS_FETCHER)) {
            return ModelHelper.getFirewallAclsFetcherById(id);
        }
        if (type.equals(Constants.FIREWALLACL_ENTITYSCOPE_ENUM)) {
            return FirewallAclEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE)) {
            return ModelHelper.getFirewallRuleById(id);
        }
        if (type.equals(Constants.FIREWALLRULES_FETCHER)) {
            return ModelHelper.getFirewallRulesFetcherById(id);
        }
        if (type.equals(Constants.FIREWALLRULE_ACTION_ENUM)) {
            return FirewallRuleAction.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return FirewallRuleAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_ENTITYSCOPE_ENUM)) {
            return FirewallRuleEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_LOCATIONENTITYTYPE_ENUM)) {
            return FirewallRuleLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_LOCATIONTYPE_ENUM)) {
            return FirewallRuleLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_NETWORKENTITYTYPE_ENUM)) {
            return FirewallRuleNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_NETWORKTYPE_ENUM)) {
            return FirewallRuleNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.FIREWALLRULE_WEBFILTERTYPE_ENUM)) {
            return FirewallRuleWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIP)) {
            return ModelHelper.getFloatingIpById(id);
        }
        if (type.equals(Constants.FLOATINGIPS_FETCHER)) {
            return ModelHelper.getFloatingIpsFetcherById(id);
        }
        if (type.equals(Constants.FLOATINGIP_ENTITYSCOPE_ENUM)) {
            return FloatingIpEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLIST)) {
            return ModelHelper.getForwardingPathListById(id);
        }
        if (type.equals(Constants.FORWARDINGPATHLISTS_FETCHER)) {
            return ModelHelper.getForwardingPathListsFetcherById(id);
        }
        if (type.equals(Constants.FORWARDINGPATHLIST_ENTITYSCOPE_ENUM)) {
            return ForwardingPathListEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY)) {
            return ModelHelper.getForwardingPathListEntryById(id);
        }
        if (type.equals(Constants.FORWARDINGPATHLISTENTRIES_FETCHER)) {
            return ModelHelper.getForwardingPathListEntriesFetcherById(id);
        }
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_FCOVERRIDE_ENUM)) {
            return ForwardingPathListEntryFCOverride.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_ENTITYSCOPE_ENUM)) {
            return ForwardingPathListEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_FORWARDINGACTION_ENUM)) {
            return ForwardingPathListEntryForwardingAction.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_REMOTEUPLINKPREFERENCE_ENUM)) {
            return ForwardingPathListEntryRemoteUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_UPLINKPREFERENCE_ENUM)) {
            return ForwardingPathListEntryUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY)) {
            return ModelHelper.getGatewayById(id);
        }
        if (type.equals(Constants.GATEWAYS_FETCHER)) {
            return ModelHelper.getGatewaysFetcherById(id);
        }
        if (type.equals(Constants.GATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return GatewayZFBMatchAttribute.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return GatewayBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_ENTITYSCOPE_ENUM)) {
            return GatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_FAMILY_ENUM)) {
            return GatewayFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_PERMITTEDACTION_ENUM)) {
            return GatewayPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_PERSONALITY_ENUM)) {
            return GatewayPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_VENDOR_ENUM)) {
            return GatewayVendor.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT)) {
            return ModelHelper.getGatewayRedundantPortById(id);
        }
        if (type.equals(Constants.GATEWAYREDUNDANTPORTS_FETCHER)) {
            return ModelHelper.getGatewayRedundantPortsFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return GatewayRedundantPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return GatewayRedundantPortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_PORTTYPE_ENUM)) {
            return GatewayRedundantPortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_STATUS_ENUM)) {
            return GatewayRedundantPortStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA)) {
            return ModelHelper.getGatewaySecuredDataById(id);
        }
        if (type.equals(Constants.GATEWAYSECUREDDATAS_FETCHER)) {
            return ModelHelper.getGatewaySecuredDatasFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYSECUREDDATA_ENTITYSCOPE_ENUM)) {
            return GatewaySecuredDataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYSECURITY)) {
            return ModelHelper.getGatewaySecurityById(id);
        }
        if (type.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            return ModelHelper.getGatewaySecuritiesFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYSECURITY_ENTITYSCOPE_ENUM)) {
            return GatewaySecurityEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYSLOCATION)) {
            return ModelHelper.getGatewaysLocationById(id);
        }
        if (type.equals(Constants.GATEWAYSLOCATIONS_FETCHER)) {
            return ModelHelper.getGatewaysLocationsFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYSLOCATION_ENTITYSCOPE_ENUM)) {
            return GatewaysLocationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE)) {
            return ModelHelper.getGatewayTemplateById(id);
        }
        if (type.equals(Constants.GATEWAYTEMPLATES_FETCHER)) {
            return ModelHelper.getGatewayTemplatesFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return GatewayTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE_PERSONALITY_ENUM)) {
            return GatewayTemplatePersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.GLOBALMETADATA)) {
            return ModelHelper.getGlobalMetadataById(id);
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return ModelHelper.getGlobalMetadatasFetcherById(id);
        }
        if (type.equals(Constants.GLOBALMETADATA_ENTITYSCOPE_ENUM)) {
            return GlobalMetadataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GNMIPROFILE)) {
            return ModelHelper.getGNMIProfileById(id);
        }
        if (type.equals(Constants.GNMIPROFILES_FETCHER)) {
            return ModelHelper.getGNMIProfilesFetcherById(id);
        }
        if (type.equals(Constants.GNMIPROFILE_ENTITYSCOPE_ENUM)) {
            return GNMIProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GNMISESSION)) {
            return ModelHelper.getGNMISessionById(id);
        }
        if (type.equals(Constants.GNMISESSIONS_FETCHER)) {
            return ModelHelper.getGNMISessionsFetcherById(id);
        }
        if (type.equals(Constants.GNMISESSION_ENTITYSCOPE_ENUM)) {
            return GNMISessionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GNMISESSION_GATEWAYVENDOR_ENUM)) {
            return GNMISessionGatewayVendor.getEnumById(id);
        }
        
        if (type.equals(Constants.GNMISESSION_STATUS_ENUM)) {
            return GNMISessionStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.GNMISESSION_SUBSCRIPTIONSTATE_ENUM)) {
            return GNMISessionSubscriptionState.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUP)) {
            return ModelHelper.getGroupById(id);
        }
        if (type.equals(Constants.GROUPS_FETCHER)) {
            return ModelHelper.getGroupsFetcherById(id);
        }
        if (type.equals(Constants.GROUP_ENTITYSCOPE_ENUM)) {
            return GroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUP_MANAGEMENTMODE_ENUM)) {
            return GroupManagementMode.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUP_ROLE_ENUM)) {
            return GroupRole.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE)) {
            return ModelHelper.getGroupKeyEncryptionProfileById(id);
        }
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER)) {
            return ModelHelper.getGroupKeyEncryptionProfilesFetcherById(id);
        }
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADSIGNINGALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_ENTITYSCOPE_ENUM)) {
            return GroupKeyEncryptionProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADSIGNINGALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_TRAFFICAUTHENTICATIONALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_TRAFFICENCRYPTIONALGORITHM_ENUM)) {
            return GroupKeyEncryptionProfileTrafficEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE)) {
            return ModelHelper.getHostInterfaceById(id);
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return ModelHelper.getHostInterfacesFetcherById(id);
        }
        if (type.equals(Constants.HOSTINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return HostInterfaceAttachedNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE_ENTITYSCOPE_ENUM)) {
            return HostInterfaceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.HSC)) {
            return ModelHelper.getHSCById(id);
        }
        if (type.equals(Constants.HSCS_FETCHER)) {
            return ModelHelper.getHSCsFetcherById(id);
        }
        if (type.equals(Constants.HSC_ENTITYSCOPE_ENUM)) {
            return HSCEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.HSC_STATUS_ENUM)) {
            return HSCStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.HSC_TYPE_ENUM)) {
            return HSCType.getEnumById(id);
        }
        
        if (type.equals(Constants.ICMPECHOTESTDEFINITION)) {
            return ModelHelper.getICMPEchoTestDefinitionById(id);
        }
        if (type.equals(Constants.ICMPECHOTESTDEFINITIONS_FETCHER)) {
            return ModelHelper.getICMPEchoTestDefinitionsFetcherById(id);
        }
        if (type.equals(Constants.IDPPROFILE)) {
            return ModelHelper.getIDPProfileById(id);
        }
        if (type.equals(Constants.IDPPROFILES_FETCHER)) {
            return ModelHelper.getIDPProfilesFetcherById(id);
        }
        if (type.equals(Constants.IDPPROFILEACTION)) {
            return ModelHelper.getIDPProfileActionById(id);
        }
        if (type.equals(Constants.IDPPROFILEACTIONS_FETCHER)) {
            return ModelHelper.getIDPProfileActionsFetcherById(id);
        }
        if (type.equals(Constants.IDPPROFILEACTION_ACTION_ENUM)) {
            return IDPProfileActionAction.getEnumById(id);
        }
        
        if (type.equals(Constants.IDPSIGNATURE)) {
            return ModelHelper.getIDPSignatureById(id);
        }
        if (type.equals(Constants.IDPSIGNATURES_FETCHER)) {
            return ModelHelper.getIDPSignaturesFetcherById(id);
        }
        if (type.equals(Constants.IKECERTIFICATE)) {
            return ModelHelper.getIKECertificateById(id);
        }
        if (type.equals(Constants.IKECERTIFICATES_FETCHER)) {
            return ModelHelper.getIKECertificatesFetcherById(id);
        }
        if (type.equals(Constants.IKECERTIFICATE_ENTITYSCOPE_ENUM)) {
            return IKECertificateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE)) {
            return ModelHelper.getIKEEncryptionprofileById(id);
        }
        if (type.equals(Constants.IKEENCRYPTIONPROFILES_FETCHER)) {
            return ModelHelper.getIKEEncryptionprofilesFetcherById(id);
        }
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_DPDMODE_ENUM)) {
            return IKEEncryptionprofileDPDMode.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_IPSECAUTHENTICATIONALGORITHM_ENUM)) {
            return IKEEncryptionprofileIPsecAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_IPSECENCRYPTIONALGORITHM_ENUM)) {
            return IKEEncryptionprofileIPsecEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_IPSECSAREPLAYWINDOWSIZE_ENUM)) {
            return IKEEncryptionprofileIPsecSAReplayWindowSize.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPAUTHENTICATIONMODE_ENUM)) {
            return IKEEncryptionprofileISAKMPAuthenticationMode.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPDIFFIEHELMANGROUPIDENTIFIER_ENUM)) {
            return IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPENCRYPTIONALGORITHM_ENUM)) {
            return IKEEncryptionprofileISAKMPEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPHASHALGORITHM_ENUM)) {
            return IKEEncryptionprofileISAKMPHashAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ENTITYSCOPE_ENUM)) {
            return IKEEncryptionprofileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY)) {
            return ModelHelper.getIKEGatewayById(id);
        }
        if (type.equals(Constants.IKEGATEWAYS_FETCHER)) {
            return ModelHelper.getIKEGatewaysFetcherById(id);
        }
        if (type.equals(Constants.IKEGATEWAY_IKEVERSION_ENUM)) {
            return IKEGatewayIKEVersion.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY_IKEV1MODE_ENUM)) {
            return IKEGatewayIKEv1Mode.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY_ASSOCIATEDCLOUDTYPE_ENUM)) {
            return IKEGatewayAssociatedCloudType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY_CONFIGURATIONSTATUS_ENUM)) {
            return IKEGatewayConfigurationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY_ENTITYSCOPE_ENUM)) {
            return IKEGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG)) {
            return ModelHelper.getIKEGatewayConfigById(id);
        }
        if (type.equals(Constants.IKEGATEWAYCONFIGS_FETCHER)) {
            return ModelHelper.getIKEGatewayConfigsFetcherById(id);
        }
        if (type.equals(Constants.IKEGATEWAYCONFIG_ENTITYSCOPE_ENUM)) {
            return IKEGatewayConfigEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION)) {
            return ModelHelper.getIKEGatewayConnectionById(id);
        }
        if (type.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER)) {
            return ModelHelper.getIKEGatewayConnectionsFetcherById(id);
        }
        if (type.equals(Constants.IKEGATEWAYCONNECTION_NSGIDENTIFIERTYPE_ENUM)) {
            return IKEGatewayConnectionNSGIdentifierType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_NSGROLE_ENUM)) {
            return IKEGatewayConnectionNSGRole.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ASSOCIATEDCLOUDTYPE_ENUM)) {
            return IKEGatewayConnectionAssociatedCloudType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return IKEGatewayConnectionAssociatedIKEAuthenticationType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_CONFIGURATIONSTATUS_ENUM)) {
            return IKEGatewayConnectionConfigurationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ENTITYSCOPE_ENUM)) {
            return IKEGatewayConnectionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE)) {
            return ModelHelper.getIKEGatewayProfileById(id);
        }
        if (type.equals(Constants.IKEGATEWAYPROFILES_FETCHER)) {
            return ModelHelper.getIKEGatewayProfilesFetcherById(id);
        }
        if (type.equals(Constants.IKEGATEWAYPROFILE_IKEGATEWAYIDENTIFIERTYPE_ENUM)) {
            return IKEGatewayProfileIKEGatewayIdentifierType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ASSOCIATEDCLOUDTYPE_ENUM)) {
            return IKEGatewayProfileAssociatedCloudType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return IKEGatewayProfileAssociatedIKEAuthenticationType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_CONFIGURATIONSTATUS_ENUM)) {
            return IKEGatewayProfileConfigurationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ENTITYSCOPE_ENUM)) {
            return IKEGatewayProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_SERVICECLASS_ENUM)) {
            return IKEGatewayProfileServiceClass.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEPSK)) {
            return ModelHelper.getIKEPSKById(id);
        }
        if (type.equals(Constants.IKEPSKS_FETCHER)) {
            return ModelHelper.getIKEPSKsFetcherById(id);
        }
        if (type.equals(Constants.IKEPSK_ENTITYSCOPE_ENUM)) {
            return IKEPSKEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKESUBNET)) {
            return ModelHelper.getIKESubnetById(id);
        }
        if (type.equals(Constants.IKESUBNETS_FETCHER)) {
            return ModelHelper.getIKESubnetsFetcherById(id);
        }
        if (type.equals(Constants.IKESUBNET_ENTITYSCOPE_ENUM)) {
            return IKESubnetEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG)) {
            return ModelHelper.getInfrastructureConfigById(id);
        }
        if (type.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER)) {
            return ModelHelper.getInfrastructureConfigsFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTURECONFIG_CONFIGSTATUS_ENUM)) {
            return InfrastructureConfigConfigStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG_ENTITYSCOPE_ENUM)) {
            return InfrastructureConfigEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE)) {
            return ModelHelper.getInfrastructureAccessProfileById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER)) {
            return ModelHelper.getInfrastructureAccessProfilesFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_SSHAUTHMODE_ENUM)) {
            return InfrastructureAccessProfileSSHAuthMode.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITYSCOPE_ENUM)) {
            return InfrastructureAccessProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_SOURCEIPFILTER_ENUM)) {
            return InfrastructureAccessProfileSourceIPFilter.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE)) {
            return ModelHelper.getInfrastructureEVDFProfileById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER)) {
            return ModelHelper.getInfrastructureEVDFProfilesFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE_ENTITYSCOPE_ENUM)) {
            return InfrastructureEVDFProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE_NUAGEPLATFORM_ENUM)) {
            return InfrastructureEVDFProfileNuagePlatform.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE)) {
            return ModelHelper.getInfrastructureGatewayProfileById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER)) {
            return ModelHelper.getInfrastructureGatewayProfilesFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_CONTROLLERLESSFORWARDINGMODE_ENUM)) {
            return InfrastructureGatewayProfileControllerLessForwardingMode.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_ENTITYSCOPE_ENUM)) {
            return InfrastructureGatewayProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_REMOTELOGMODE_ENUM)) {
            return InfrastructureGatewayProfileRemoteLogMode.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_UNDERLAYTESTUPLINKMODE_ENUM)) {
            return InfrastructureGatewayProfileUnderlayTestUplinkMode.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_UPGRADEACTION_ENUM)) {
            return InfrastructureGatewayProfileUpgradeAction.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE)) {
            return ModelHelper.getInfrastructureVscProfileById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER)) {
            return ModelHelper.getInfrastructureVscProfilesFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE_ADDRESSFAMILY_ENUM)) {
            return InfrastructureVscProfileAddressFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITYSCOPE_ENUM)) {
            return InfrastructureVscProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE)) {
            return ModelHelper.getIngressACLEntryTemplateById(id);
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return ModelHelper.getIngressACLEntryTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ACTION_ENUM)) {
            return IngressACLEntryTemplateAction.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return IngressACLEntryTemplateAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressACLEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return IngressACLEntryTemplateLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return IngressACLEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return IngressACLEntryTemplateNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return IngressACLEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressACLEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_REPUTATIONSCORE_ENUM)) {
            return IngressACLEntryTemplateReputationScore.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return IngressACLEntryTemplateWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE)) {
            return ModelHelper.getIngressACLTemplateById(id);
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return ModelHelper.getIngressACLTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressACLTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressACLTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return IngressACLTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE)) {
            return ModelHelper.getIngressAdvFwdEntryTemplateById(id);
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return ModelHelper.getIngressAdvFwdEntryTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM)) {
            return IngressAdvFwdEntryTemplateFCOverride.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM)) {
            return IngressAdvFwdEntryTemplateAction.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ADDRESSOVERRIDETYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateAddressOverrideType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_APPTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateAppType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressAdvFwdEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_FAILSAFEDATAPATH_ENUM)) {
            return IngressAdvFwdEntryTemplateFailsafeDatapath.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressAdvFwdEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_REDIRECTREWRITETYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateRedirectRewriteType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_REDIRECTIONTARGETENTITYTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateRedirectionTargetEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_REMOTEUPLINKPREFERENCE_ENUM)) {
            return IngressAdvFwdEntryTemplateRemoteUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM)) {
            return IngressAdvFwdEntryTemplateUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE)) {
            return ModelHelper.getIngressAdvFwdTemplateById(id);
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return ModelHelper.getIngressAdvFwdTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressAdvFwdTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressAdvFwdTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM)) {
            return IngressAdvFwdTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE)) {
            return ModelHelper.getIngressAuditACLEntryTemplateById(id);
        }
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return ModelHelper.getIngressAuditACLEntryTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ACTION_ENUM)) {
            return IngressAuditACLEntryTemplateAction.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return IngressAuditACLEntryTemplateAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressAuditACLEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return IngressAuditACLEntryTemplateLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return IngressAuditACLEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return IngressAuditACLEntryTemplateNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return IngressAuditACLEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressAuditACLEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_REPUTATIONSCORE_ENUM)) {
            return IngressAuditACLEntryTemplateReputationScore.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return IngressAuditACLEntryTemplateWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE)) {
            return ModelHelper.getIngressAuditACLTemplateById(id);
        }
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATES_FETCHER)) {
            return ModelHelper.getIngressAuditACLTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressAuditACLTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressAuditACLTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return IngressAuditACLTemplatePriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSPROFILE)) {
            return ModelHelper.getIngressProfileById(id);
        }
        if (type.equals(Constants.INGRESSPROFILES_FETCHER)) {
            return ModelHelper.getIngressProfilesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSPROFILE_ENTITYSCOPE_ENUM)) {
            return IngressProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY)) {
            return ModelHelper.getIngressQOSPolicyById(id);
        }
        if (type.equals(Constants.INGRESSQOSPOLICIES_FETCHER)) {
            return ModelHelper.getIngressQOSPoliciesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSQOSPOLICY_ENTITYSCOPE_ENUM)) {
            return IngressQOSPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM)) {
            return IngressQOSPolicyQueue1ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM)) {
            return IngressQOSPolicyQueue2ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM)) {
            return IngressQOSPolicyQueue3ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM)) {
            return IngressQOSPolicyQueue4ForwardingClasses.getEnumById(id);
        }
        
        if (type.equals(Constants.IPFILTERPROFILE)) {
            return ModelHelper.getIPFilterProfileById(id);
        }
        if (type.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            return ModelHelper.getIPFilterProfilesFetcherById(id);
        }
        if (type.equals(Constants.IPFILTERPROFILE_BLOBTYPE_ENUM)) {
            return IPFilterProfileBlobType.getEnumById(id);
        }
        
        if (type.equals(Constants.IPFILTERPROFILE_ENTITYSCOPE_ENUM)) {
            return IPFilterProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IPRESERVATION)) {
            return ModelHelper.getIPReservationById(id);
        }
        if (type.equals(Constants.IPRESERVATIONS_FETCHER)) {
            return ModelHelper.getIPReservationsFetcherById(id);
        }
        if (type.equals(Constants.IPRESERVATION_ENTITYSCOPE_ENUM)) {
            return IPReservationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE)) {
            return ModelHelper.getIPv6FilterProfileById(id);
        }
        if (type.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            return ModelHelper.getIPv6FilterProfilesFetcherById(id);
        }
        if (type.equals(Constants.IPV6FILTERPROFILE_BLOBTYPE_ENUM)) {
            return IPv6FilterProfileBlobType.getEnumById(id);
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE_ENTITYSCOPE_ENUM)) {
            return IPv6FilterProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.JOB)) {
            return ModelHelper.getJobById(id);
        }
        if (type.equals(Constants.JOBS_FETCHER)) {
            return ModelHelper.getJobsFetcherById(id);
        }
        if (type.equals(Constants.JOB_COMMAND_ENUM)) {
            return JobCommand.getEnumById(id);
        }
        
        if (type.equals(Constants.JOB_ENTITYSCOPE_ENUM)) {
            return JobEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.JOB_STATUS_ENUM)) {
            return JobStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER)) {
            return ModelHelper.getKeyServerMemberById(id);
        }
        if (type.equals(Constants.KEYSERVERMEMBERS_FETCHER)) {
            return ModelHelper.getKeyServerMembersFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERMEMBER_ENTITYSCOPE_ENUM)) {
            return KeyServerMemberEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR)) {
            return ModelHelper.getKeyServerMonitorById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORS_FETCHER)) {
            return ModelHelper.getKeyServerMonitorsFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITOR_ENTITYSCOPE_ENUM)) {
            return KeyServerMonitorEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED)) {
            return ModelHelper.getKeyServerMonitorEncryptedSeedById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER)) {
            return ModelHelper.getKeyServerMonitorEncryptedSeedsFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_ENTITYSCOPE_ENUM)) {
            return KeyServerMonitorEncryptedSeedEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_SEEDTYPE_ENUM)) {
            return KeyServerMonitorEncryptedSeedSeedType.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED)) {
            return ModelHelper.getKeyServerMonitorSeedById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEEDS_FETCHER)) {
            return ModelHelper.getKeyServerMonitorSeedsFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEED_ENTITYSCOPE_ENUM)) {
            return KeyServerMonitorSeedEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED_SEEDTRAFFICAUTHENTICATIONALGORITHM_ENUM)) {
            return KeyServerMonitorSeedSeedTrafficAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED_SEEDTRAFFICENCRYPTIONALGORITHM_ENUM)) {
            return KeyServerMonitorSeedSeedTrafficEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED_SEEDTYPE_ENUM)) {
            return KeyServerMonitorSeedSeedType.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK)) {
            return ModelHelper.getKeyServerMonitorSEKById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEKS_FETCHER)) {
            return ModelHelper.getKeyServerMonitorSEKsFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEK_ENTITYSCOPE_ENUM)) {
            return KeyServerMonitorSEKEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM)) {
            return KeyServerMonitorSEKSeedPayloadAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return KeyServerMonitorSEKSeedPayloadEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN)) {
            return ModelHelper.getL2DomainById(id);
        }
        if (type.equals(Constants.L2DOMAINS_FETCHER)) {
            return ModelHelper.getL2DomainsFetcherById(id);
        }
        if (type.equals(Constants.L2DOMAIN_DPI_ENUM)) {
            return L2DomainDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_IPTYPE_ENUM)) {
            return L2DomainIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_ENCRYPTION_ENUM)) {
            return L2DomainEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_ENTITYSCOPE_ENUM)) {
            return L2DomainEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_ENTITYSTATE_ENUM)) {
            return L2DomainEntityState.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_FLOWCOLLECTIONENABLED_ENUM)) {
            return L2DomainFlowCollectionEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_FLOWLIMITENABLED_ENUM)) {
            return L2DomainFlowLimitEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_L2ENCAPTYPE_ENUM)) {
            return L2DomainL2EncapType.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_MAINTENANCEMODE_ENUM)) {
            return L2DomainMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_MULTICAST_ENUM)) {
            return L2DomainMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return L2DomainPolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_THREATINTELLIGENCEENABLED_ENUM)) {
            return L2DomainThreatIntelligenceEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return L2DomainUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_USEGLOBALMAC_ENUM)) {
            return L2DomainUseGlobalMAC.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE)) {
            return ModelHelper.getL2DomainTemplateById(id);
        }
        if (type.equals(Constants.L2DOMAINTEMPLATES_FETCHER)) {
            return ModelHelper.getL2DomainTemplatesFetcherById(id);
        }
        if (type.equals(Constants.L2DOMAINTEMPLATE_DPI_ENUM)) {
            return L2DomainTemplateDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_IPTYPE_ENUM)) {
            return L2DomainTemplateIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_ENCRYPTION_ENUM)) {
            return L2DomainTemplateEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_ENTITYSCOPE_ENUM)) {
            return L2DomainTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_ENTITYSTATE_ENUM)) {
            return L2DomainTemplateEntityState.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_MULTICAST_ENUM)) {
            return L2DomainTemplateMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM)) {
            return L2DomainTemplatePolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_USEGLOBALMAC_ENUM)) {
            return L2DomainTemplateUseGlobalMAC.getEnumById(id);
        }
        
        if (type.equals(Constants.L4SERVICE)) {
            return ModelHelper.getL4ServiceById(id);
        }
        if (type.equals(Constants.L4SERVICES_FETCHER)) {
            return ModelHelper.getL4ServicesFetcherById(id);
        }
        if (type.equals(Constants.L4SERVICE_ENTITYSCOPE_ENUM)) {
            return L4ServiceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.L4SERVICEGROUP)) {
            return ModelHelper.getL4ServiceGroupById(id);
        }
        if (type.equals(Constants.L4SERVICEGROUPS_FETCHER)) {
            return ModelHelper.getL4ServiceGroupsFetcherById(id);
        }
        if (type.equals(Constants.L4SERVICEGROUP_ENTITYSCOPE_ENUM)) {
            return L4ServiceGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE)) {
            return ModelHelper.getL7applicationsignatureById(id);
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER)) {
            return ModelHelper.getL7applicationsignaturesFetcherById(id);
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURE_ENTITYSCOPE_ENUM)) {
            return L7applicationsignatureEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION)) {
            return ModelHelper.getLDAPConfigurationById(id);
        }
        if (type.equals(Constants.LDAPCONFIGURATIONS_FETCHER)) {
            return ModelHelper.getLDAPConfigurationsFetcherById(id);
        }
        if (type.equals(Constants.LDAPCONFIGURATION_ENTITYSCOPE_ENUM)) {
            return LDAPConfigurationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LICENSE)) {
            return ModelHelper.getLicenseById(id);
        }
        if (type.equals(Constants.LICENSES_FETCHER)) {
            return ModelHelper.getLicensesFetcherById(id);
        }
        if (type.equals(Constants.LICENSE_ENTITYSCOPE_ENUM)) {
            return LicenseEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LICENSE_LICENSEENCRYPTION_ENUM)) {
            return LicenseLicenseEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.LICENSE_LICENSETYPE_ENUM)) {
            return LicenseLicenseType.getEnumById(id);
        }
        
        if (type.equals(Constants.LICENSESTATUS)) {
            return ModelHelper.getLicenseStatusById(id);
        }
        if (type.equals(Constants.LICENSESTATUS_FETCHER)) {
            return ModelHelper.getLicenseStatusFetcherById(id);
        }
        if (type.equals(Constants.LICENSESTATUS_ENTITYSCOPE_ENUM)) {
            return LicenseStatusEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LINK)) {
            return ModelHelper.getLinkById(id);
        }
        if (type.equals(Constants.LINKS_FETCHER)) {
            return ModelHelper.getLinksFetcherById(id);
        }
        if (type.equals(Constants.LINK_ACCEPTANCECRITERIA_ENUM)) {
            return LinkAcceptanceCriteria.getEnumById(id);
        }
        
        if (type.equals(Constants.LINK_ASSOCIATEDDESTINATIONTYPE_ENUM)) {
            return LinkAssociatedDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.LINK_ENTITYSCOPE_ENUM)) {
            return LinkEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LINK_TYPE_ENUM)) {
            return LinkType.getEnumById(id);
        }
        
        if (type.equals(Constants.LOCATION)) {
            return ModelHelper.getLocationById(id);
        }
        if (type.equals(Constants.LOCATIONS_FETCHER)) {
            return ModelHelper.getLocationsFetcherById(id);
        }
        if (type.equals(Constants.LOCATION_ENTITYSCOPE_ENUM)) {
            return LocationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LTEINFORMATION)) {
            return ModelHelper.getLTEInformationById(id);
        }
        if (type.equals(Constants.LTEINFORMATIONS_FETCHER)) {
            return ModelHelper.getLTEInformationsFetcherById(id);
        }
        if (type.equals(Constants.LTEINFORMATION_ENTITYSCOPE_ENUM)) {
            return LTEInformationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.LTESTATISTICS)) {
            return ModelHelper.getLtestatisticsById(id);
        }
        if (type.equals(Constants.LTESTATISTICS_FETCHER)) {
            return ModelHelper.getLtestatisticsFetcherById(id);
        }
        if (type.equals(Constants.MACFILTERPROFILE)) {
            return ModelHelper.getMACFilterProfileById(id);
        }
        if (type.equals(Constants.MACFILTERPROFILES_FETCHER)) {
            return ModelHelper.getMACFilterProfilesFetcherById(id);
        }
        if (type.equals(Constants.MACFILTERPROFILE_ENTITYSCOPE_ENUM)) {
            return MACFilterProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ME)) {
            return ModelHelper.getMeById(id);
        }
        if (type.equals(Constants.MES_FETCHER)) {
            return ModelHelper.getMesFetcherById(id);
        }
        if (type.equals(Constants.ME_AVATARTYPE_ENUM)) {
            return MeAvatarType.getEnumById(id);
        }
        
        if (type.equals(Constants.ME_ENTITYSCOPE_ENUM)) {
            return MeEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.METADATA)) {
            return ModelHelper.getMetadataById(id);
        }
        if (type.equals(Constants.METADATAS_FETCHER)) {
            return ModelHelper.getMetadatasFetcherById(id);
        }
        if (type.equals(Constants.METADATA_ENTITYSCOPE_ENUM)) {
            return MetadataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION)) {
            return ModelHelper.getMirrorDestinationById(id);
        }
        if (type.equals(Constants.MIRRORDESTINATIONS_FETCHER)) {
            return ModelHelper.getMirrorDestinationsFetcherById(id);
        }
        if (type.equals(Constants.MIRRORDESTINATION_ENTITYSCOPE_ENUM)) {
            return MirrorDestinationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP)) {
            return ModelHelper.getMirrorDestinationGroupById(id);
        }
        if (type.equals(Constants.MIRRORDESTINATIONGROUPS_FETCHER)) {
            return ModelHelper.getMirrorDestinationGroupsFetcherById(id);
        }
        if (type.equals(Constants.MIRRORDESTINATIONGROUP_ENTITYSCOPE_ENUM)) {
            return MirrorDestinationGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MONITORINGPORT)) {
            return ModelHelper.getMonitoringPortById(id);
        }
        if (type.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return ModelHelper.getMonitoringPortsFetcherById(id);
        }
        if (type.equals(Constants.MONITORINGPORT_ENTITYSCOPE_ENUM)) {
            return MonitoringPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MONITORINGPORT_RESILIENCYSTATE_ENUM)) {
            return MonitoringPortResiliencyState.getEnumById(id);
        }
        
        if (type.equals(Constants.MONITORINGPORT_STATE_ENUM)) {
            return MonitoringPortState.getEnumById(id);
        }
        
        if (type.equals(Constants.MONITORSCOPE)) {
            return ModelHelper.getMonitorscopeById(id);
        }
        if (type.equals(Constants.MONITORSCOPES_FETCHER)) {
            return ModelHelper.getMonitorscopesFetcherById(id);
        }
        if (type.equals(Constants.MONITORSCOPE_ENTITYSCOPE_ENUM)) {
            return MonitorscopeEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP)) {
            return ModelHelper.getMultiCastChannelMapById(id);
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return ModelHelper.getMultiCastChannelMapsFetcherById(id);
        }
        if (type.equals(Constants.MULTICASTCHANNELMAP_ENTITYSCOPE_ENUM)) {
            return MultiCastChannelMapEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTICASTLIST)) {
            return ModelHelper.getMultiCastListById(id);
        }
        if (type.equals(Constants.MULTICASTLISTS_FETCHER)) {
            return ModelHelper.getMultiCastListsFetcherById(id);
        }
        if (type.equals(Constants.MULTICASTLIST_ENTITYSCOPE_ENUM)) {
            return MultiCastListEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTICASTLIST_MCASTTYPE_ENUM)) {
            return MultiCastListMcastType.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTICASTRANGE)) {
            return ModelHelper.getMultiCastRangeById(id);
        }
        if (type.equals(Constants.MULTICASTRANGES_FETCHER)) {
            return ModelHelper.getMultiCastRangesFetcherById(id);
        }
        if (type.equals(Constants.MULTICASTRANGE_IPTYPE_ENUM)) {
            return MultiCastRangeIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTICASTRANGE_ENTITYSCOPE_ENUM)) {
            return MultiCastRangeEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTINICVPORT)) {
            return ModelHelper.getMultiNICVPortById(id);
        }
        if (type.equals(Constants.MULTINICVPORTS_FETCHER)) {
            return ModelHelper.getMultiNICVPortsFetcherById(id);
        }
        if (type.equals(Constants.MULTINICVPORT_ENTITYSCOPE_ENUM)) {
            return MultiNICVPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NATMAPENTRY)) {
            return ModelHelper.getNATMapEntryById(id);
        }
        if (type.equals(Constants.NATMAPENTRIES_FETCHER)) {
            return ModelHelper.getNATMapEntriesFetcherById(id);
        }
        if (type.equals(Constants.NATMAPENTRY_ENTITYSCOPE_ENUM)) {
            return NATMapEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NATMAPENTRY_TYPE_ENUM)) {
            return NATMapEntryType.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY)) {
            return ModelHelper.getNetconfGatewayById(id);
        }
        if (type.equals(Constants.NETCONFGATEWAYS_FETCHER)) {
            return ModelHelper.getNetconfGatewaysFetcherById(id);
        }
        if (type.equals(Constants.NETCONFGATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return NetconfGatewayZFBMatchAttribute.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return NetconfGatewayBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_ENTITYSCOPE_ENUM)) {
            return NetconfGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_FAMILY_ENUM)) {
            return NetconfGatewayFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_PERMITTEDACTION_ENUM)) {
            return NetconfGatewayPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_PERSONALITY_ENUM)) {
            return NetconfGatewayPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_VENDOR_ENUM)) {
            return NetconfGatewayVendor.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFMANAGER)) {
            return ModelHelper.getNetconfManagerById(id);
        }
        if (type.equals(Constants.NETCONFMANAGERS_FETCHER)) {
            return ModelHelper.getNetconfManagersFetcherById(id);
        }
        if (type.equals(Constants.NETCONFMANAGER_ENTITYSCOPE_ENUM)) {
            return NetconfManagerEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFMANAGER_STATUS_ENUM)) {
            return NetconfManagerStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFPROFILE)) {
            return ModelHelper.getNetconfProfileById(id);
        }
        if (type.equals(Constants.NETCONFPROFILES_FETCHER)) {
            return ModelHelper.getNetconfProfilesFetcherById(id);
        }
        if (type.equals(Constants.NETCONFPROFILE_ENTITYSCOPE_ENUM)) {
            return NetconfProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFSESSION)) {
            return ModelHelper.getNetconfSessionById(id);
        }
        if (type.equals(Constants.NETCONFSESSIONS_FETCHER)) {
            return ModelHelper.getNetconfSessionsFetcherById(id);
        }
        if (type.equals(Constants.NETCONFSESSION_ENTITYSCOPE_ENUM)) {
            return NetconfSessionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFSESSION_GATEWAYVENDOR_ENUM)) {
            return NetconfSessionGatewayVendor.getEnumById(id);
        }
        
        if (type.equals(Constants.NETCONFSESSION_STATUS_ENUM)) {
            return NetconfSessionStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKLAYOUT)) {
            return ModelHelper.getNetworkLayoutById(id);
        }
        if (type.equals(Constants.NETWORKLAYOUTS_FETCHER)) {
            return ModelHelper.getNetworkLayoutsFetcherById(id);
        }
        if (type.equals(Constants.NETWORKLAYOUT_ENTITYSCOPE_ENUM)) {
            return NetworkLayoutEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKLAYOUT_SERVICETYPE_ENUM)) {
            return NetworkLayoutServiceType.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP)) {
            return ModelHelper.getNetworkMacroGroupById(id);
        }
        if (type.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            return ModelHelper.getNetworkMacroGroupsFetcherById(id);
        }
        if (type.equals(Constants.NETWORKMACROGROUP_ENTITYSCOPE_ENUM)) {
            return NetworkMacroGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP_MACROGROUPTYPE_ENUM)) {
            return NetworkMacroGroupMacroGroupType.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING)) {
            return ModelHelper.getNetworkPerformanceBindingById(id);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return ModelHelper.getNetworkPerformanceBindingsFetcherById(id);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING_ENTITYSCOPE_ENUM)) {
            return NetworkPerformanceBindingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT)) {
            return ModelHelper.getNetworkPerformanceMeasurementById(id);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER)) {
            return ModelHelper.getNetworkPerformanceMeasurementsFetcherById(id);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_NPMTYPE_ENUM)) {
            return NetworkPerformanceMeasurementNPMType.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_ENTITYSCOPE_ENUM)) {
            return NetworkPerformanceMeasurementEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NEXTHOP)) {
            return ModelHelper.getNextHopById(id);
        }
        if (type.equals(Constants.NEXTHOPS_FETCHER)) {
            return ModelHelper.getNextHopsFetcherById(id);
        }
        if (type.equals(Constants.NEXTHOP_IPTYPE_ENUM)) {
            return NextHopIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.NEXTHOP_ENTITYSCOPE_ENUM)) {
            return NextHopEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NEXTHOP_TYPE_ENUM)) {
            return NextHopType.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY)) {
            return ModelHelper.getNSGatewayById(id);
        }
        if (type.equals(Constants.NSGATEWAYS_FETCHER)) {
            return ModelHelper.getNSGatewaysFetcherById(id);
        }
        if (type.equals(Constants.NSGATEWAY_SSHSERVICE_ENUM)) {
            return NSGatewaySSHService.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_TPMSTATUS_ENUM)) {
            return NSGatewayTPMStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return NSGatewayZFBMatchAttribute.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return NSGatewayBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONRELOADSTATE_ENUM)) {
            return NSGatewayConfigurationReloadState.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONSTATUS_ENUM)) {
            return NSGatewayConfigurationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURELOADBALANCING_ENUM)) {
            return NSGatewayConfigureLoadBalancing.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_DERIVEDSSHSERVICESTATE_ENUM)) {
            return NSGatewayDerivedSSHServiceState.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_ENTITYSCOPE_ENUM)) {
            return NSGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_FAMILY_ENUM)) {
            return NSGatewayFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_FUNCTIONS_ENUM)) {
            return NSGatewayFunctions.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_INHERITEDSSHSERVICESTATE_ENUM)) {
            return NSGatewayInheritedSSHServiceState.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_NETWORKACCELERATION_ENUM)) {
            return NSGatewayNetworkAcceleration.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_PERMITTEDACTION_ENUM)) {
            return NSGatewayPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_PERSONALITY_ENUM)) {
            return NSGatewayPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_SYSLOGLEVEL_ENUM)) {
            return NSGatewaySyslogLevel.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_TUNNELSHAPING_ENUM)) {
            return NSGatewayTunnelShaping.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYSCOUNT)) {
            return ModelHelper.getNSGatewaysCountById(id);
        }
        if (type.equals(Constants.NSGATEWAYSCOUNTS_FETCHER)) {
            return ModelHelper.getNSGatewaysCountsFetcherById(id);
        }
        if (type.equals(Constants.NSGATEWAYSCOUNT_ENTITYSCOPE_ENUM)) {
            return NSGatewaysCountEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYMONITOR)) {
            return ModelHelper.getNSGatewayMonitorById(id);
        }
        if (type.equals(Constants.NSGATEWAYMONITORS_FETCHER)) {
            return ModelHelper.getNSGatewayMonitorsFetcherById(id);
        }
        if (type.equals(Constants.NSGATEWAYSUMMARY)) {
            return ModelHelper.getNSGatewaySummaryById(id);
        }
        if (type.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            return ModelHelper.getNSGatewaySummariesFetcherById(id);
        }
        if (type.equals(Constants.NSGATEWAYSUMMARY_BOOTSTRAPSTATUS_ENUM)) {
            return NSGatewaySummaryBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY_ENTITYSCOPE_ENUM)) {
            return NSGatewaySummaryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY_PERSONALITY_ENUM)) {
            return NSGatewaySummaryPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE)) {
            return ModelHelper.getNSGatewayTemplateById(id);
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            return ModelHelper.getNSGatewayTemplatesFetcherById(id);
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATE_SSHSERVICE_ENUM)) {
            return NSGatewayTemplateSSHService.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return NSGatewayTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE_INSTANCESSHOVERRIDE_ENUM)) {
            return NSGatewayTemplateInstanceSSHOverride.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE_PERSONALITY_ENUM)) {
            return NSGatewayTemplatePersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGGROUP)) {
            return ModelHelper.getNSGGroupById(id);
        }
        if (type.equals(Constants.NSGGROUPS_FETCHER)) {
            return ModelHelper.getNSGGroupsFetcherById(id);
        }
        if (type.equals(Constants.NSGGROUP_ENTITYSCOPE_ENUM)) {
            return NSGGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO)) {
            return ModelHelper.getNSGInfoById(id);
        }
        if (type.equals(Constants.NSGINFOS_FETCHER)) {
            return ModelHelper.getNSGInfosFetcherById(id);
        }
        if (type.equals(Constants.NSGINFO_BOOTSTRAPSTATUS_ENUM)) {
            return NSGInfoBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_CMDSTATUS_ENUM)) {
            return NSGInfoCmdStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_CMDTYPE_ENUM)) {
            return NSGInfoCmdType.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_ENTITYSCOPE_ENUM)) {
            return NSGInfoEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_FAMILY_ENUM)) {
            return NSGInfoFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_PERSONALITY_ENUM)) {
            return NSGInfoPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGMIGRATIONPROFILE)) {
            return ModelHelper.getNSGMigrationProfileById(id);
        }
        if (type.equals(Constants.NSGMIGRATIONPROFILES_FETCHER)) {
            return ModelHelper.getNSGMigrationProfilesFetcherById(id);
        }
        if (type.equals(Constants.NSGMIGRATIONPROFILE_ENTITYSCOPE_ENUM)) {
            return NSGMigrationProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGPATCHPROFILE)) {
            return ModelHelper.getNSGPatchProfileById(id);
        }
        if (type.equals(Constants.NSGPATCHPROFILES_FETCHER)) {
            return ModelHelper.getNSGPatchProfilesFetcherById(id);
        }
        if (type.equals(Constants.NSGPATCHPROFILE_ENTITYSCOPE_ENUM)) {
            return NSGPatchProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP)) {
            return ModelHelper.getNSRedundantGatewayGroupById(id);
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER)) {
            return ModelHelper.getNSRedundantGatewayGroupsFetcherById(id);
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_ENTITYSCOPE_ENUM)) {
            return NSRedundantGatewayGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_PERMITTEDACTION_ENUM)) {
            return NSRedundantGatewayGroupPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_PERSONALITY_ENUM)) {
            return NSRedundantGatewayGroupPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_REDUNDANTGATEWAYSTATUS_ENUM)) {
            return NSRedundantGatewayGroupRedundantGatewayStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING)) {
            return ModelHelper.getNSGRoutingPolicyBindingById(id);
        }
        if (type.equals(Constants.NSGROUTINGPOLICYBINDINGS_FETCHER)) {
            return ModelHelper.getNSGRoutingPolicyBindingsFetcherById(id);
        }
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING_ENTITYSCOPE_ENUM)) {
            return NSGRoutingPolicyBindingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING_EXPORTTOOVERLAY_ENUM)) {
            return NSGRoutingPolicyBindingExportToOverlay.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGUPGRADEPROFILE)) {
            return ModelHelper.getNSGUpgradeProfileById(id);
        }
        if (type.equals(Constants.NSGUPGRADEPROFILES_FETCHER)) {
            return ModelHelper.getNSGUpgradeProfilesFetcherById(id);
        }
        if (type.equals(Constants.NSGUPGRADEPROFILE_ENTITYSCOPE_ENUM)) {
            return NSGUpgradeProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORT)) {
            return ModelHelper.getNSPortById(id);
        }
        if (type.equals(Constants.NSPORTS_FETCHER)) {
            return ModelHelper.getNSPortsFetcherById(id);
        }
        if (type.equals(Constants.NSPORT_NATTRAVERSAL_ENUM)) {
            return NSPortNATTraversal.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORT_ENTITYSCOPE_ENUM)) {
            return NSPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORT_PERMITTEDACTION_ENUM)) {
            return NSPortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORT_PORTTYPE_ENUM)) {
            return NSPortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORT_SPEED_ENUM)) {
            return NSPortSpeed.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORT_STATUS_ENUM)) {
            return NSPortStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE)) {
            return ModelHelper.getNSPortTemplateById(id);
        }
        if (type.equals(Constants.NSPORTTEMPLATES_FETCHER)) {
            return ModelHelper.getNSPortTemplatesFetcherById(id);
        }
        if (type.equals(Constants.NSPORTTEMPLATE_ENTITYSCOPE_ENUM)) {
            return NSPortTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE_PORTTYPE_ENUM)) {
            return NSPortTemplatePortType.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE_SPEED_ENUM)) {
            return NSPortTemplateSpeed.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT)) {
            return ModelHelper.getRedundantPortById(id);
        }
        if (type.equals(Constants.REDUNDANTPORTS_FETCHER)) {
            return ModelHelper.getRedundantPortsFetcherById(id);
        }
        if (type.equals(Constants.REDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return RedundantPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return RedundantPortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT_PORTTYPE_ENUM)) {
            return RedundantPortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT_SPEED_ENUM)) {
            return RedundantPortSpeed.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT_STATUS_ENUM)) {
            return RedundantPortStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFAREA)) {
            return ModelHelper.getOSPFAreaById(id);
        }
        if (type.equals(Constants.OSPFAREAS_FETCHER)) {
            return ModelHelper.getOSPFAreasFetcherById(id);
        }
        if (type.equals(Constants.OSPFAREA_AREATYPE_ENUM)) {
            return OSPFAreaAreaType.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFAREA_DEFAULTORIGINATEOPTION_ENUM)) {
            return OSPFAreaDefaultOriginateOption.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFAREA_ENTITYSCOPE_ENUM)) {
            return OSPFAreaEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINSTANCE)) {
            return ModelHelper.getOSPFInstanceById(id);
        }
        if (type.equals(Constants.OSPFINSTANCES_FETCHER)) {
            return ModelHelper.getOSPFInstancesFetcherById(id);
        }
        if (type.equals(Constants.OSPFINSTANCE_IPTYPE_ENUM)) {
            return OSPFInstanceIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINSTANCE_OSPFTYPE_ENUM)) {
            return OSPFInstanceOSPFType.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINSTANCE_ENTITYSCOPE_ENUM)) {
            return OSPFInstanceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINTERFACE)) {
            return ModelHelper.getOSPFInterfaceById(id);
        }
        if (type.equals(Constants.OSPFINTERFACES_FETCHER)) {
            return ModelHelper.getOSPFInterfacesFetcherById(id);
        }
        if (type.equals(Constants.OSPFINTERFACE_ADMINSTATE_ENUM)) {
            return OSPFInterfaceAdminState.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINTERFACE_AUTHENTICATIONTYPE_ENUM)) {
            return OSPFInterfaceAuthenticationType.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINTERFACE_ENTITYSCOPE_ENUM)) {
            return OSPFInterfaceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.OSPFINTERFACE_INTERFACETYPE_ENUM)) {
            return OSPFInterfaceInterfaceType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL)) {
            return ModelHelper.getOverlayAddressPoolById(id);
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER)) {
            return ModelHelper.getOverlayAddressPoolsFetcherById(id);
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOL_IPTYPE_ENUM)) {
            return OverlayAddressPoolIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL_ENTITYSCOPE_ENUM)) {
            return OverlayAddressPoolEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMANAGEMENTPROFILE)) {
            return ModelHelper.getOverlayManagementProfileById(id);
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTPROFILES_FETCHER)) {
            return ModelHelper.getOverlayManagementProfilesFetcherById(id);
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILE)) {
            return ModelHelper.getOverlayManagementSubnetProfileById(id);
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILES_FETCHER)) {
            return ModelHelper.getOverlayManagementSubnetProfilesFetcherById(id);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION)) {
            return ModelHelper.getOverlayMirrorDestinationById(id);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER)) {
            return ModelHelper.getOverlayMirrorDestinationsFetcherById(id);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_DESTINATIONTYPE_ENUM)) {
            return OverlayMirrorDestinationDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_ENDPOINTTYPE_ENUM)) {
            return OverlayMirrorDestinationEndPointType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_ENTITYSCOPE_ENUM)) {
            return OverlayMirrorDestinationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_TRIGGERTYPE_ENUM)) {
            return OverlayMirrorDestinationTriggerType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE)) {
            return ModelHelper.getOverlayMirrorDestinationTemplateById(id);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATES_FETCHER)) {
            return ModelHelper.getOverlayMirrorDestinationTemplatesFetcherById(id);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_DESTINATIONTYPE_ENUM)) {
            return OverlayMirrorDestinationTemplateDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENDPOINTTYPE_ENUM)) {
            return OverlayMirrorDestinationTemplateEndPointType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITYSCOPE_ENUM)) {
            return OverlayMirrorDestinationTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_TRIGGERTYPE_ENUM)) {
            return OverlayMirrorDestinationTemplateTriggerType.getEnumById(id);
        }
        
        if (type.equals(Constants.OVERLAYPATNATENTRY)) {
            return ModelHelper.getOverlayPATNATEntryById(id);
        }
        if (type.equals(Constants.OVERLAYPATNATENTRIES_FETCHER)) {
            return ModelHelper.getOverlayPATNATEntriesFetcherById(id);
        }
        if (type.equals(Constants.OVERLAYPATNATENTRY_ENTITYSCOPE_ENUM)) {
            return OverlayPATNATEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PATCH)) {
            return ModelHelper.getPatchById(id);
        }
        if (type.equals(Constants.PATCHS_FETCHER)) {
            return ModelHelper.getPatchsFetcherById(id);
        }
        if (type.equals(Constants.PATCH_ENTITYSCOPE_ENUM)) {
            return PatchEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PATIPENTRY)) {
            return ModelHelper.getPATIPEntryById(id);
        }
        if (type.equals(Constants.PATIPENTRIES_FETCHER)) {
            return ModelHelper.getPATIPEntriesFetcherById(id);
        }
        if (type.equals(Constants.PATIPENTRY_IPTYPE_ENUM)) {
            return PATIPEntryIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.PATIPENTRY_ENTITYSCOPE_ENUM)) {
            return PATIPEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PATMAPPER)) {
            return ModelHelper.getPATMapperById(id);
        }
        if (type.equals(Constants.PATMAPPERS_FETCHER)) {
            return ModelHelper.getPATMappersFetcherById(id);
        }
        if (type.equals(Constants.PATMAPPER_ENTITYSCOPE_ENUM)) {
            return PATMapperEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PATNATPOOL)) {
            return ModelHelper.getPATNATPoolById(id);
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER)) {
            return ModelHelper.getPATNATPoolsFetcherById(id);
        }
        if (type.equals(Constants.PATNATPOOL_IPTYPE_ENUM)) {
            return PATNATPoolIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.PATNATPOOL_ASSOCIATEDGATEWAYTYPE_ENUM)) {
            return PATNATPoolAssociatedGatewayType.getEnumById(id);
        }
        
        if (type.equals(Constants.PATNATPOOL_ENTITYSCOPE_ENUM)) {
            return PATNATPoolEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PATNATPOOL_PERMITTEDACTION_ENUM)) {
            return PATNATPoolPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR)) {
            return ModelHelper.getPerformanceMonitorById(id);
        }
        if (type.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            return ModelHelper.getPerformanceMonitorsFetcherById(id);
        }
        if (type.equals(Constants.PERFORMANCEMONITOR_ENTITYSCOPE_ENUM)) {
            return PerformanceMonitorEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR_PROBETYPE_ENUM)) {
            return PerformanceMonitorProbeType.getEnumById(id);
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR_SERVICECLASS_ENUM)) {
            return PerformanceMonitorServiceClass.getEnumById(id);
        }
        
        if (type.equals(Constants.PERMISSION)) {
            return ModelHelper.getPermissionById(id);
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER)) {
            return ModelHelper.getPermissionsFetcherById(id);
        }
        if (type.equals(Constants.PERMISSION_ENTITYSCOPE_ENUM)) {
            return PermissionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PERMISSION_PERMITTEDACTION_ENUM)) {
            return PermissionPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.PGEXPRESSION)) {
            return ModelHelper.getPGExpressionById(id);
        }
        if (type.equals(Constants.PGEXPRESSIONS_FETCHER)) {
            return ModelHelper.getPGExpressionsFetcherById(id);
        }
        if (type.equals(Constants.PGEXPRESSION_ENTITYSCOPE_ENUM)) {
            return PGExpressionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PGEXPRESSIONTEMPLATE)) {
            return ModelHelper.getPGExpressionTemplateById(id);
        }
        if (type.equals(Constants.PGEXPRESSIONTEMPLATES_FETCHER)) {
            return ModelHelper.getPGExpressionTemplatesFetcherById(id);
        }
        if (type.equals(Constants.PGEXPRESSIONTEMPLATE_ENTITYSCOPE_ENUM)) {
            return PGExpressionTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYDECISION)) {
            return ModelHelper.getPolicyDecisionById(id);
        }
        if (type.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return ModelHelper.getPolicyDecisionsFetcherById(id);
        }
        if (type.equals(Constants.POLICYDECISION_ENTITYSCOPE_ENUM)) {
            return PolicyDecisionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYENTRY)) {
            return ModelHelper.getPolicyEntryById(id);
        }
        if (type.equals(Constants.POLICYENTRIES_FETCHER)) {
            return ModelHelper.getPolicyEntriesFetcherById(id);
        }
        if (type.equals(Constants.POLICYENTRY_ENTITYSCOPE_ENUM)) {
            return PolicyEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUP)) {
            return ModelHelper.getPolicyGroupById(id);
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER)) {
            return ModelHelper.getPolicyGroupsFetcherById(id);
        }
        if (type.equals(Constants.POLICYGROUP_ENTITYSCOPE_ENUM)) {
            return PolicyGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUP_ENTITYSTATE_ENUM)) {
            return PolicyGroupEntityState.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUP_TYPE_ENUM)) {
            return PolicyGroupType.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUPCATEGORY)) {
            return ModelHelper.getPolicyGroupCategoryById(id);
        }
        if (type.equals(Constants.POLICYGROUPCATEGORIES_FETCHER)) {
            return ModelHelper.getPolicyGroupCategoriesFetcherById(id);
        }
        if (type.equals(Constants.POLICYGROUPCATEGORY_ENTITYSCOPE_ENUM)) {
            return PolicyGroupCategoryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE)) {
            return ModelHelper.getPolicyGroupTemplateById(id);
        }
        if (type.equals(Constants.POLICYGROUPTEMPLATES_FETCHER)) {
            return ModelHelper.getPolicyGroupTemplatesFetcherById(id);
        }
        if (type.equals(Constants.POLICYGROUPTEMPLATE_ENTITYSCOPE_ENUM)) {
            return PolicyGroupTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE_TYPE_ENUM)) {
            return PolicyGroupTemplateType.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP)) {
            return ModelHelper.getPolicyObjectGroupById(id);
        }
        if (type.equals(Constants.POLICYOBJECTGROUPS_FETCHER)) {
            return ModelHelper.getPolicyObjectGroupsFetcherById(id);
        }
        if (type.equals(Constants.POLICYOBJECTGROUP_ENTITYSCOPE_ENUM)) {
            return PolicyObjectGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP_TYPE_ENUM)) {
            return PolicyObjectGroupType.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYSTATEMENT)) {
            return ModelHelper.getPolicyStatementById(id);
        }
        if (type.equals(Constants.POLICYSTATEMENTS_FETCHER)) {
            return ModelHelper.getPolicyStatementsFetcherById(id);
        }
        if (type.equals(Constants.POLICYSTATEMENT_ENTITYSCOPE_ENUM)) {
            return PolicyStatementEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT)) {
            return ModelHelper.getPortById(id);
        }
        if (type.equals(Constants.PORTS_FETCHER)) {
            return ModelHelper.getPortsFetcherById(id);
        }
        if (type.equals(Constants.PORT_ENTITYSCOPE_ENUM)) {
            return PortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT_OPERATIONALSTATE_ENUM)) {
            return PortOperationalState.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT_PERMITTEDACTION_ENUM)) {
            return PortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT_PORTTYPE_ENUM)) {
            return PortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT_STATUS_ENUM)) {
            return PortStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSPORTINFO)) {
            return ModelHelper.getNSPortInfoById(id);
        }
        if (type.equals(Constants.NSPORTINFOS_FETCHER)) {
            return ModelHelper.getNSPortInfosFetcherById(id);
        }
        if (type.equals(Constants.PORTMAPPING)) {
            return ModelHelper.getPortMappingById(id);
        }
        if (type.equals(Constants.PORTMAPPINGS_FETCHER)) {
            return ModelHelper.getPortMappingsFetcherById(id);
        }
        if (type.equals(Constants.PORTMAPPING_ENTITYSCOPE_ENUM)) {
            return PortMappingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PORTTEMPLATE)) {
            return ModelHelper.getPortTemplateById(id);
        }
        if (type.equals(Constants.PORTTEMPLATES_FETCHER)) {
            return ModelHelper.getPortTemplatesFetcherById(id);
        }
        if (type.equals(Constants.PORTTEMPLATE_ENTITYSCOPE_ENUM)) {
            return PortTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PORTTEMPLATE_PORTTYPE_ENUM)) {
            return PortTemplatePortType.getEnumById(id);
        }
        
        if (type.equals(Constants.PROXYARPFILTER)) {
            return ModelHelper.getProxyARPFilterById(id);
        }
        if (type.equals(Constants.PROXYARPFILTERS_FETCHER)) {
            return ModelHelper.getProxyARPFiltersFetcherById(id);
        }
        if (type.equals(Constants.PROXYARPFILTER_IPTYPE_ENUM)) {
            return ProxyARPFilterIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.PROXYARPFILTER_ENTITYSCOPE_ENUM)) {
            return ProxyARPFilterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PSNATPOOL)) {
            return ModelHelper.getPSNATPoolById(id);
        }
        if (type.equals(Constants.PSNATPOOLS_FETCHER)) {
            return ModelHelper.getPSNATPoolsFetcherById(id);
        }
        if (type.equals(Constants.PSNATPOOL_IPTYPE_ENUM)) {
            return PSNATPoolIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.PSNATPOOL_ENTITYSCOPE_ENUM)) {
            return PSNATPoolEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PSPATMAP)) {
            return ModelHelper.getPSPATMapById(id);
        }
        if (type.equals(Constants.PSPATMAPS_FETCHER)) {
            return ModelHelper.getPSPATMapsFetcherById(id);
        }
        if (type.equals(Constants.PSPATMAP_ENTITYSCOPE_ENUM)) {
            return PSPATMapEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PSPATMAP_FAMILY_ENUM)) {
            return PSPATMapFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP)) {
            return ModelHelper.getPTranslationMapById(id);
        }
        if (type.equals(Constants.PTRANSLATIONMAPS_FETCHER)) {
            return ModelHelper.getPTranslationMapsFetcherById(id);
        }
        if (type.equals(Constants.PTRANSLATIONMAP_ENTITYSCOPE_ENUM)) {
            return PTranslationMapEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP_MAPPINGTYPE_ENUM)) {
            return PTranslationMapMappingType.getEnumById(id);
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO)) {
            return ModelHelper.getPublicNetworkMacroById(id);
        }
        if (type.equals(Constants.PUBLICNETWORKMACROS_FETCHER)) {
            return ModelHelper.getPublicNetworkMacrosFetcherById(id);
        }
        if (type.equals(Constants.PUBLICNETWORKMACRO_IPTYPE_ENUM)) {
            return PublicNetworkMacroIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO_ENTITYSCOPE_ENUM)) {
            return PublicNetworkMacroEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.QOS)) {
            return ModelHelper.getQOSById(id);
        }
        if (type.equals(Constants.QOSS_FETCHER)) {
            return ModelHelper.getQOSsFetcherById(id);
        }
        if (type.equals(Constants.QOS_ENTITYSCOPE_ENUM)) {
            return QOSEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.QOS_SERVICECLASS_ENUM)) {
            return QOSServiceClass.getEnumById(id);
        }
        
        if (type.equals(Constants.QOSPOLICER)) {
            return ModelHelper.getQosPolicerById(id);
        }
        if (type.equals(Constants.QOSPOLICERS_FETCHER)) {
            return ModelHelper.getQosPolicersFetcherById(id);
        }
        if (type.equals(Constants.QOSPOLICER_ENTITYSCOPE_ENUM)) {
            return QosPolicerEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.RATELIMITER)) {
            return ModelHelper.getRateLimiterById(id);
        }
        if (type.equals(Constants.RATELIMITERS_FETCHER)) {
            return ModelHelper.getRateLimitersFetcherById(id);
        }
        if (type.equals(Constants.RATELIMITER_ENTITYSCOPE_ENUM)) {
            return RateLimiterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET)) {
            return ModelHelper.getRedirectionTargetById(id);
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return ModelHelper.getRedirectionTargetsFetcherById(id);
        }
        if (type.equals(Constants.REDIRECTIONTARGET_DESTINATIONTYPE_ENUM)) {
            return RedirectionTargetDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET_ENDPOINTTYPE_ENUM)) {
            return RedirectionTargetEndPointType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET_ENTITYSCOPE_ENUM)) {
            return RedirectionTargetEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET_TRIGGERTYPE_ENUM)) {
            return RedirectionTargetTriggerType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE)) {
            return ModelHelper.getRedirectionTargetTemplateById(id);
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            return ModelHelper.getRedirectionTargetTemplatesFetcherById(id);
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_DESTINATIONTYPE_ENUM)) {
            return RedirectionTargetTemplateDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENDPOINTTYPE_ENUM)) {
            return RedirectionTargetTemplateEndPointType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENTITYSCOPE_ENUM)) {
            return RedirectionTargetTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_TRIGGERTYPE_ENUM)) {
            return RedirectionTargetTemplateTriggerType.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP)) {
            return ModelHelper.getRedundancyGroupById(id);
        }
        if (type.equals(Constants.REDUNDANCYGROUPS_FETCHER)) {
            return ModelHelper.getRedundancyGroupsFetcherById(id);
        }
        if (type.equals(Constants.REDUNDANCYGROUP_ENTITYSCOPE_ENUM)) {
            return RedundancyGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP_PERMITTEDACTION_ENUM)) {
            return RedundancyGroupPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP_PERSONALITY_ENUM)) {
            return RedundancyGroupPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP_REDUNDANTGATEWAYSTATUS_ENUM)) {
            return RedundancyGroupRedundantGatewayStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.REMOTEVRSINFO)) {
            return ModelHelper.getRemoteVrsInfoById(id);
        }
        if (type.equals(Constants.REMOTEVRSINFOS_FETCHER)) {
            return ModelHelper.getRemoteVrsInfosFetcherById(id);
        }
        if (type.equals(Constants.REMOTEVRSINFO_ENTITYSCOPE_ENUM)) {
            return RemoteVrsInfoEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VMRESYNC)) {
            return ModelHelper.getVMResyncById(id);
        }
        if (type.equals(Constants.VMRESYNCS_FETCHER)) {
            return ModelHelper.getVMResyncsFetcherById(id);
        }
        if (type.equals(Constants.VMRESYNC_ENTITYSCOPE_ENUM)) {
            return VMResyncEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VMRESYNC_STATUS_ENUM)) {
            return VMResyncStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.ROLE)) {
            return ModelHelper.getRoleById(id);
        }
        if (type.equals(Constants.ROLES_FETCHER)) {
            return ModelHelper.getRolesFetcherById(id);
        }
        if (type.equals(Constants.ROLE_ENTITYSCOPE_ENUM)) {
            return RoleEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ROLEENTRY)) {
            return ModelHelper.getRoleentryById(id);
        }
        if (type.equals(Constants.ROLEENTRIES_FETCHER)) {
            return ModelHelper.getRoleentriesFetcherById(id);
        }
        if (type.equals(Constants.ROLEENTRY_ENTITYSCOPE_ENUM)) {
            return RoleentryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ROLEENTRY_ROLEACCESSTYPELIST_ENUM)) {
            return RoleentryRoleAccessTypeList.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY)) {
            return ModelHelper.getRoutingPolicyById(id);
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return ModelHelper.getRoutingPoliciesFetcherById(id);
        }
        if (type.equals(Constants.ROUTINGPOLICY_CONTENTTYPE_ENUM)) {
            return RoutingPolicyContentType.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_DEFAULTACTION_ENUM)) {
            return RoutingPolicyDefaultAction.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_ENTITYSCOPE_ENUM)) {
            return RoutingPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_ROUTINGPROTOCOL_ENUM)) {
            return RoutingPolicyRoutingProtocol.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING)) {
            return ModelHelper.getRoutingPolicyBindingById(id);
        }
        if (type.equals(Constants.ROUTINGPOLICYBINDINGS_FETCHER)) {
            return ModelHelper.getRoutingPolicyBindingsFetcherById(id);
        }
        if (type.equals(Constants.ROUTINGPOLICYBINDING_OSPFTYPE_ENUM)) {
            return RoutingPolicyBindingOSPFType.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING_ENTITYSCOPE_ENUM)) {
            return RoutingPolicyBindingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING_EXPORTTOOVERLAY_ENUM)) {
            return RoutingPolicyBindingExportToOverlay.getEnumById(id);
        }
        
        if (type.equals(Constants.SAASAPPLICATIONGROUP)) {
            return ModelHelper.getSaaSApplicationGroupById(id);
        }
        if (type.equals(Constants.SAASAPPLICATIONGROUPS_FETCHER)) {
            return ModelHelper.getSaaSApplicationGroupsFetcherById(id);
        }
        if (type.equals(Constants.SAASAPPLICATIONGROUP_ENTITYSCOPE_ENUM)) {
            return SaaSApplicationGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SAASAPPLICATIONTYPE)) {
            return ModelHelper.getSaaSApplicationTypeById(id);
        }
        if (type.equals(Constants.SAASAPPLICATIONTYPES_FETCHER)) {
            return ModelHelper.getSaaSApplicationTypesFetcherById(id);
        }
        if (type.equals(Constants.SAASAPPLICATIONTYPE_ENTITYSCOPE_ENUM)) {
            return SaaSApplicationTypeEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE)) {
            return ModelHelper.getSAPEgressQoSProfileById(id);
        }
        if (type.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            return ModelHelper.getSAPEgressQoSProfilesFetcherById(id);
        }
        if (type.equals(Constants.SAPEGRESSQOSPROFILE_BLOBTYPE_ENUM)) {
            return SAPEgressQoSProfileBlobType.getEnumById(id);
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE_ENTITYSCOPE_ENUM)) {
            return SAPEgressQoSProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE)) {
            return ModelHelper.getSAPIngressQoSProfileById(id);
        }
        if (type.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            return ModelHelper.getSAPIngressQoSProfilesFetcherById(id);
        }
        if (type.equals(Constants.SAPINGRESSQOSPROFILE_BLOBTYPE_ENUM)) {
            return SAPIngressQoSProfileBlobType.getEnumById(id);
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE_ENTITYSCOPE_ENUM)) {
            return SAPIngressQoSProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITE)) {
            return ModelHelper.getScheduledTestSuiteById(id);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITES_FETCHER)) {
            return ModelHelper.getScheduledTestSuitesFetcherById(id);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITE_SCHEDULEINTERVALUNITS_ENUM)) {
            return ScheduledTestSuiteScheduleIntervalUnits.getEnumById(id);
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITERUN)) {
            return ModelHelper.getScheduledtestsuiterunById(id);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITERUNS_FETCHER)) {
            return ModelHelper.getScheduledtestsuiterunsFetcherById(id);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITERUN_OPERATIONSTATUS_ENUM)) {
            return ScheduledtestsuiterunOperationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.WANSERVICE)) {
            return ModelHelper.getWANServiceById(id);
        }
        if (type.equals(Constants.WANSERVICES_FETCHER)) {
            return ModelHelper.getWANServicesFetcherById(id);
        }
        if (type.equals(Constants.WANSERVICE_CONFIGTYPE_ENUM)) {
            return WANServiceConfigType.getEnumById(id);
        }
        
        if (type.equals(Constants.WANSERVICE_ENTITYSCOPE_ENUM)) {
            return WANServiceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.WANSERVICE_PERMITTEDACTION_ENUM)) {
            return WANServicePermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.WANSERVICE_SERVICETYPE_ENUM)) {
            return WANServiceServiceType.getEnumById(id);
        }
        
        if (type.equals(Constants.WANSERVICE_TUNNELTYPE_ENUM)) {
            return WANServiceTunnelType.getEnumById(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE)) {
            return ModelHelper.getSharedNetworkResourceById(id);
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return ModelHelper.getSharedNetworkResourcesFetcherById(id);
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_ENTITYSCOPE_ENUM)) {
            return SharedNetworkResourceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_PERMITTEDACTIONTYPE_ENUM)) {
            return SharedNetworkResourcePermittedActionType.getEnumById(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_TYPE_ENUM)) {
            return SharedNetworkResourceType.getEnumById(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_USEGLOBALMAC_ENUM)) {
            return SharedNetworkResourceUseGlobalMAC.getEnumById(id);
        }
        
        if (type.equals(Constants.SHUNTLINK)) {
            return ModelHelper.getShuntLinkById(id);
        }
        if (type.equals(Constants.SHUNTLINKS_FETCHER)) {
            return ModelHelper.getShuntLinksFetcherById(id);
        }
        if (type.equals(Constants.SHUNTLINK_ENTITYSCOPE_ENUM)) {
            return ShuntLinkEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SHUNTLINK_PERMITTEDACTION_ENUM)) {
            return ShuntLinkPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.SITEINFO)) {
            return ModelHelper.getSiteInfoById(id);
        }
        if (type.equals(Constants.SITEINFOS_FETCHER)) {
            return ModelHelper.getSiteInfosFetcherById(id);
        }
        if (type.equals(Constants.SITEINFO_ENTITYSCOPE_ENUM)) {
            return SiteInfoEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL)) {
            return ModelHelper.getSPATSourcesPoolById(id);
        }
        if (type.equals(Constants.SPATSOURCESPOOLS_FETCHER)) {
            return ModelHelper.getSPATSourcesPoolsFetcherById(id);
        }
        if (type.equals(Constants.SPATSOURCESPOOL_ENTITYSCOPE_ENUM)) {
            return SPATSourcesPoolEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL_FAMILY_ENUM)) {
            return SPATSourcesPoolFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.SSHKEY)) {
            return ModelHelper.getSSHKeyById(id);
        }
        if (type.equals(Constants.SSHKEYS_FETCHER)) {
            return ModelHelper.getSSHKeysFetcherById(id);
        }
        if (type.equals(Constants.SSHKEY_ENTITYSCOPE_ENUM)) {
            return SSHKeyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SSHKEY_KEYTYPE_ENUM)) {
            return SSHKeyKeyType.getEnumById(id);
        }
        
        if (type.equals(Constants.SSIDCONNECTION)) {
            return ModelHelper.getSSIDConnectionById(id);
        }
        if (type.equals(Constants.SSIDCONNECTIONS_FETCHER)) {
            return ModelHelper.getSSIDConnectionsFetcherById(id);
        }
        if (type.equals(Constants.SSIDCONNECTION_AUTHENTICATIONMODE_ENUM)) {
            return SSIDConnectionAuthenticationMode.getEnumById(id);
        }
        
        if (type.equals(Constants.SSIDCONNECTION_ENTITYSCOPE_ENUM)) {
            return SSIDConnectionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SSIDCONNECTION_PERMITTEDACTION_ENUM)) {
            return SSIDConnectionPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.SSIDCONNECTION_REDIRECTOPTION_ENUM)) {
            return SSIDConnectionRedirectOption.getEnumById(id);
        }
        
        if (type.equals(Constants.SSIDCONNECTION_STATUS_ENUM)) {
            return SSIDConnectionStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.STATICROUTE)) {
            return ModelHelper.getStaticRouteById(id);
        }
        if (type.equals(Constants.STATICROUTES_FETCHER)) {
            return ModelHelper.getStaticRoutesFetcherById(id);
        }
        if (type.equals(Constants.STATICROUTE_IPTYPE_ENUM)) {
            return StaticRouteIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.STATICROUTE_ENTITYSCOPE_ENUM)) {
            return StaticRouteEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.STATICROUTE_TYPE_ENUM)) {
            return StaticRouteType.getEnumById(id);
        }
        
        if (type.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsById(id);
        }
        if (type.equals(Constants.STATISTICS_FETCHER)) {
            return ModelHelper.getStatisticsFetcherById(id);
        }
        if (type.equals(Constants.STATSCOLLECTORINFO)) {
            return ModelHelper.getStatsCollectorInfoById(id);
        }
        if (type.equals(Constants.STATSCOLLECTORINFOS_FETCHER)) {
            return ModelHelper.getStatsCollectorInfosFetcherById(id);
        }
        if (type.equals(Constants.STATSCOLLECTORINFO_ADDRESSTYPE_ENUM)) {
            return StatsCollectorInfoAddressType.getEnumById(id);
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO_ENTITYSCOPE_ENUM)) {
            return StatsCollectorInfoEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.STATISTICSPOLICY)) {
            return ModelHelper.getStatisticsPolicyById(id);
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return ModelHelper.getStatisticsPoliciesFetcherById(id);
        }
        if (type.equals(Constants.STATISTICSPOLICY_ENTITYSCOPE_ENUM)) {
            return StatisticsPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET)) {
            return ModelHelper.getSubnetById(id);
        }
        if (type.equals(Constants.SUBNETS_FETCHER)) {
            return ModelHelper.getSubnetsFetcherById(id);
        }
        if (type.equals(Constants.SUBNET_DHCPRELAYSTATUS_ENUM)) {
            return SubnetDHCPRelayStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_DPI_ENUM)) {
            return SubnetDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_IPTYPE_ENUM)) {
            return SubnetIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_PATENABLED_ENUM)) {
            return SubnetPATEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_ENCRYPTION_ENUM)) {
            return SubnetEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_ENTITYSCOPE_ENUM)) {
            return SubnetEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_ENTITYSTATE_ENUM)) {
            return SubnetEntityState.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_L2ENCAPTYPE_ENUM)) {
            return SubnetL2EncapType.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_MAINTENANCEMODE_ENUM)) {
            return SubnetMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_MULTICAST_ENUM)) {
            return SubnetMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_RESOURCETYPE_ENUM)) {
            return SubnetResourceType.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_UNDERLAYENABLED_ENUM)) {
            return SubnetUnderlayEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_USEGLOBALMAC_ENUM)) {
            return SubnetUseGlobalMAC.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE)) {
            return ModelHelper.getSubnetTemplateById(id);
        }
        if (type.equals(Constants.SUBNETTEMPLATES_FETCHER)) {
            return ModelHelper.getSubnetTemplatesFetcherById(id);
        }
        if (type.equals(Constants.SUBNETTEMPLATE_DPI_ENUM)) {
            return SubnetTemplateDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_IPTYPE_ENUM)) {
            return SubnetTemplateIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_ENCRYPTION_ENUM)) {
            return SubnetTemplateEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_ENTITYSCOPE_ENUM)) {
            return SubnetTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_MULTICAST_ENUM)) {
            return SubnetTemplateMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_USEGLOBALMAC_ENUM)) {
            return SubnetTemplateUseGlobalMAC.getEnumById(id);
        }
        
        if (type.equals(Constants.SUPPLEMENTALINFRACONFIG)) {
            return ModelHelper.getSupplementalInfraConfigById(id);
        }
        if (type.equals(Constants.SUPPLEMENTALINFRACONFIGS_FETCHER)) {
            return ModelHelper.getSupplementalInfraConfigsFetcherById(id);
        }
        if (type.equals(Constants.SYSLOGDESTINATION)) {
            return ModelHelper.getSyslogDestinationById(id);
        }
        if (type.equals(Constants.SYSLOGDESTINATIONS_FETCHER)) {
            return ModelHelper.getSyslogDestinationsFetcherById(id);
        }
        if (type.equals(Constants.SYSLOGDESTINATION_IPTYPE_ENUM)) {
            return SyslogDestinationIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSLOGDESTINATION_TYPE_ENUM)) {
            return SyslogDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG)) {
            return ModelHelper.getSystemConfigById(id);
        }
        if (type.equals(Constants.SYSTEMCONFIGS_FETCHER)) {
            return ModelHelper.getSystemConfigsFetcherById(id);
        }
        if (type.equals(Constants.SYSTEMCONFIG_CSPROOTAUTHENTICATIONMETHOD_ENUM)) {
            return SystemConfigCsprootAuthenticationMethod.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_DOMAINTUNNELTYPE_ENUM)) {
            return SystemConfigDomainTunnelType.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_ENTITYSCOPE_ENUM)) {
            return SystemConfigEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEKPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEKPAYLOADSIGNINGALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADSIGNINGALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTTRAFFICAUTHENTICATIONALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTTRAFFICENCRYPTIONALGORITHM_ENUM)) {
            return SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_LASTEXECUTEDMIGRATIONPHASE_ENUM)) {
            return SystemConfigLastExecutedMigrationPhase.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_SYSTEMAVATARTYPE_ENUM)) {
            return SystemConfigSystemAvatarType.getEnumById(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_WEBFILTERINGTYPE_ENUM)) {
            return SystemConfigWebFilteringType.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA)) {
            return ModelHelper.getTCAById(id);
        }
        if (type.equals(Constants.TCAS_FETCHER)) {
            return ModelHelper.getTCAsFetcherById(id);
        }
        if (type.equals(Constants.TCA_ACTION_ENUM)) {
            return TCAAction.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_ENTITYSCOPE_ENUM)) {
            return TCAEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_METRIC_ENUM)) {
            return TCAMetric.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_PROTOCOL_ENUM)) {
            return TCAProtocol.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_TYPE_ENUM)) {
            return TCAType.getEnumById(id);
        }
        
        if (type.equals(Constants.TEST)) {
            return ModelHelper.getTestById(id);
        }
        if (type.equals(Constants.TESTS_FETCHER)) {
            return ModelHelper.getTestsFetcherById(id);
        }
        if (type.equals(Constants.TEST_ASSOCIATEDTESTDEFINITIONTYPE_ENUM)) {
            return TestAssociatedTestDefinitionType.getEnumById(id);
        }
        
        if (type.equals(Constants.TEST_ENTITYSCOPE_ENUM)) {
            return TestEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTDEFINITION)) {
            return ModelHelper.getTestDefinitionById(id);
        }
        if (type.equals(Constants.TESTDEFINITIONS_FETCHER)) {
            return ModelHelper.getTestDefinitionsFetcherById(id);
        }
        if (type.equals(Constants.TESTDEFINITION_ENTITYSCOPE_ENUM)) {
            return TestDefinitionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTRUN)) {
            return ModelHelper.getTestRunById(id);
        }
        if (type.equals(Constants.TESTRUNS_FETCHER)) {
            return ModelHelper.getTestRunsFetcherById(id);
        }
        if (type.equals(Constants.TESTRUN_ASSOCIATEDTESTSUITERUNTYPE_ENUM)) {
            return TestRunAssociatedTestSuiteRunType.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTRUN_ENTITYSCOPE_ENUM)) {
            return TestRunEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTRUN_OPERATIONSTATUS_ENUM)) {
            return TestRunOperationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTRUN_TESTRESULT_ENUM)) {
            return TestRunTestResult.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTRUN_TESTRESULTDATATYPE_ENUM)) {
            return TestRunTestResultDataType.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTRUN_UNDERLAYTESTCATEGORY_ENUM)) {
            return TestRunUnderlayTestCategory.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTSUITE)) {
            return ModelHelper.getTestSuiteById(id);
        }
        if (type.equals(Constants.TESTSUITES_FETCHER)) {
            return ModelHelper.getTestSuitesFetcherById(id);
        }
        if (type.equals(Constants.TESTSUITE_ENTITYSCOPE_ENUM)) {
            return TestSuiteEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTSUITERUN)) {
            return ModelHelper.getTestSuiteRunById(id);
        }
        if (type.equals(Constants.TESTSUITERUNS_FETCHER)) {
            return ModelHelper.getTestSuiteRunsFetcherById(id);
        }
        if (type.equals(Constants.TESTSUITERUN_ENTITYSCOPE_ENUM)) {
            return TestSuiteRunEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TESTSUITERUN_OPERATIONSTATUS_ENUM)) {
            return TestSuiteRunOperationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.THREATPREVENTIONINFO)) {
            return ModelHelper.getThreatPreventionInfoById(id);
        }
        if (type.equals(Constants.THREATPREVENTIONINFOS_FETCHER)) {
            return ModelHelper.getThreatPreventionInfosFetcherById(id);
        }
        if (type.equals(Constants.THREATPREVENTIONINFO_CONFIGURATIONSTATUS_ENUM)) {
            return ThreatPreventionInfoConfigurationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.THREATPREVENTIONINFO_MANAGEMENTSERVERCONNECTIONSTATUS_ENUM)) {
            return ThreatPreventionInfoManagementServerConnectionStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.THREATPREVENTIONINFO_SERVICESTATUS_ENUM)) {
            return ThreatPreventionInfoServiceStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTION)) {
            return ModelHelper.getThreatPreventionServerConnectionById(id);
        }
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTIONS_FETCHER)) {
            return ModelHelper.getThreatPreventionServerConnectionsFetcherById(id);
        }
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTION_STATUS_ENUM)) {
            return ThreatPreventionServerConnectionStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.TIER)) {
            return ModelHelper.getTierById(id);
        }
        if (type.equals(Constants.TIERS_FETCHER)) {
            return ModelHelper.getTiersFetcherById(id);
        }
        if (type.equals(Constants.TIER_ENTITYSCOPE_ENUM)) {
            return TierEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TIER_TIERTYPE_ENUM)) {
            return TierTierType.getEnumById(id);
        }
        
        if (type.equals(Constants.TRUNK)) {
            return ModelHelper.getTrunkById(id);
        }
        if (type.equals(Constants.TRUNKS_FETCHER)) {
            return ModelHelper.getTrunksFetcherById(id);
        }
        if (type.equals(Constants.TRUNK_ENTITYSCOPE_ENUM)) {
            return TrunkEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.UNDERLAY)) {
            return ModelHelper.getUnderlayById(id);
        }
        if (type.equals(Constants.UNDERLAYS_FETCHER)) {
            return ModelHelper.getUnderlaysFetcherById(id);
        }
        if (type.equals(Constants.UNDERLAY_ENTITYSCOPE_ENUM)) {
            return UnderlayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.UNDERLAYTEST)) {
            return ModelHelper.getUnderlayTestById(id);
        }
        if (type.equals(Constants.UNDERLAYTESTS_FETCHER)) {
            return ModelHelper.getUnderlayTestsFetcherById(id);
        }
        if (type.equals(Constants.UNDERLAYTEST_TESTRESULT_ENUM)) {
            return UnderlayTestTestResult.getEnumById(id);
        }
        
        if (type.equals(Constants.UNDERLAYTEST_UNDERLAYTESTTYPE_ENUM)) {
            return UnderlayTestUnderlayTestType.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION)) {
            return ModelHelper.getUplinkConnectionById(id);
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return ModelHelper.getUplinkConnectionsFetcherById(id);
        }
        if (type.equals(Constants.UPLINKCONNECTION_ADDRESSFAMILY_ENUM)) {
            return UplinkConnectionAddressFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ADVERTISEMENTCRITERIA_ENUM)) {
            return UplinkConnectionAdvertisementCriteria.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_AUXMODE_ENUM)) {
            return UplinkConnectionAuxMode.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ENTITYSCOPE_ENUM)) {
            return UplinkConnectionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_FECENABLED_ENUM)) {
            return UplinkConnectionFecEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_INTERFACECONNECTIONTYPE_ENUM)) {
            return UplinkConnectionInterfaceConnectionType.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_MODE_ENUM)) {
            return UplinkConnectionMode.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ROLE_ENUM)) {
            return UplinkConnectionRole.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_UPLINKTYPE_ENUM)) {
            return UplinkConnectionUplinkType.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKRD)) {
            return ModelHelper.getUplinkRDById(id);
        }
        if (type.equals(Constants.UPLINKRDS_FETCHER)) {
            return ModelHelper.getUplinkRDsFetcherById(id);
        }
        if (type.equals(Constants.UPLINKRD_ENTITYSCOPE_ENUM)) {
            return UplinkRDEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKRD_UPLINKTYPE_ENUM)) {
            return UplinkRDUplinkType.getEnumById(id);
        }
        
        if (type.equals(Constants.USER)) {
            return ModelHelper.getUserById(id);
        }
        if (type.equals(Constants.USERS_FETCHER)) {
            return ModelHelper.getUsersFetcherById(id);
        }
        if (type.equals(Constants.USER_AVATARTYPE_ENUM)) {
            return UserAvatarType.getEnumById(id);
        }
        
        if (type.equals(Constants.USER_ENTITYSCOPE_ENUM)) {
            return UserEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.USER_MANAGEMENTMODE_ENUM)) {
            return UserManagementMode.getEnumById(id);
        }
        
        if (type.equals(Constants.USERCONTEXT)) {
            return ModelHelper.getUserContextById(id);
        }
        if (type.equals(Constants.USERCONTEXTS_FETCHER)) {
            return ModelHelper.getUserContextsFetcherById(id);
        }
        if (type.equals(Constants.USERCONTEXT_ENTITYSCOPE_ENUM)) {
            return UserContextEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.USERCONTEXT_SYSTEMAVATARTYPE_ENUM)) {
            return UserContextSystemAvatarType.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER)) {
            return ModelHelper.getVCenterById(id);
        }
        if (type.equals(Constants.VCENTERS_FETCHER)) {
            return ModelHelper.getVCentersFetcherById(id);
        }
        if (type.equals(Constants.VCENTER_AVRSPROFILE_ENUM)) {
            return VCenterAvrsProfile.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_CPUCOUNT_ENUM)) {
            return VCenterCpuCount.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_ENTITYSCOPE_ENUM)) {
            return VCenterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_MEMORYSIZEINGB_ENUM)) {
            return VCenterMemorySizeInGB.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_PERSONALITY_ENUM)) {
            return VCenterPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return VCenterRemoteSyslogServerType.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER)) {
            return ModelHelper.getVCenterClusterById(id);
        }
        if (type.equals(Constants.VCENTERCLUSTERS_FETCHER)) {
            return ModelHelper.getVCenterClustersFetcherById(id);
        }
        if (type.equals(Constants.VCENTERCLUSTER_AVRSPROFILE_ENUM)) {
            return VCenterClusterAvrsProfile.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_CPUCOUNT_ENUM)) {
            return VCenterClusterCpuCount.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterClusterDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_ENTITYSCOPE_ENUM)) {
            return VCenterClusterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_MEMORYSIZEINGB_ENUM)) {
            return VCenterClusterMemorySizeInGB.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_PERSONALITY_ENUM)) {
            return VCenterClusterPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return VCenterClusterRemoteSyslogServerType.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER)) {
            return ModelHelper.getVCenterDataCenterById(id);
        }
        if (type.equals(Constants.VCENTERDATACENTERS_FETCHER)) {
            return ModelHelper.getVCenterDataCentersFetcherById(id);
        }
        if (type.equals(Constants.VCENTERDATACENTER_AVRSPROFILE_ENUM)) {
            return VCenterDataCenterAvrsProfile.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_CPUCOUNT_ENUM)) {
            return VCenterDataCenterCpuCount.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterDataCenterDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_ENTITYSCOPE_ENUM)) {
            return VCenterDataCenterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_MEMORYSIZEINGB_ENUM)) {
            return VCenterDataCenterMemorySizeInGB.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_PERSONALITY_ENUM)) {
            return VCenterDataCenterPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return VCenterDataCenterRemoteSyslogServerType.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR)) {
            return ModelHelper.getVCenterHypervisorById(id);
        }
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            return ModelHelper.getVCenterHypervisorsFetcherById(id);
        }
        if (type.equals(Constants.VCENTERHYPERVISOR_VRSSTATE_ENUM)) {
            return VCenterHypervisorVRSState.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_AVRSPROFILE_ENUM)) {
            return VCenterHypervisorAvrsProfile.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_CPUCOUNT_ENUM)) {
            return VCenterHypervisorCpuCount.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterHypervisorDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_ENTITYSCOPE_ENUM)) {
            return VCenterHypervisorEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_MEMORYSIZEINGB_ENUM)) {
            return VCenterHypervisorMemorySizeInGB.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_PERSONALITY_ENUM)) {
            return VCenterHypervisorPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return VCenterHypervisorRemoteSyslogServerType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY)) {
            return ModelHelper.getVirtualFirewallPolicyById(id);
        }
        if (type.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return ModelHelper.getVirtualFirewallPoliciesFetcherById(id);
        }
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY_ENTITYSCOPE_ENUM)) {
            return VirtualFirewallPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY_POLICYSTATE_ENUM)) {
            return VirtualFirewallPolicyPolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY_PRIORITYTYPE_ENUM)) {
            return VirtualFirewallPolicyPriorityType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE)) {
            return ModelHelper.getVirtualFirewallRuleById(id);
        }
        if (type.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            return ModelHelper.getVirtualFirewallRulesFetcherById(id);
        }
        if (type.equals(Constants.VIRTUALFIREWALLRULE_ACTION_ENUM)) {
            return VirtualFirewallRuleAction.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_APPTYPE_ENUM)) {
            return VirtualFirewallRuleAppType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return VirtualFirewallRuleAssociatedTrafficType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_ENTITYSCOPE_ENUM)) {
            return VirtualFirewallRuleEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_FAILSAFEDATAPATH_ENUM)) {
            return VirtualFirewallRuleFailsafeDatapath.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_LOCATIONENTITYTYPE_ENUM)) {
            return VirtualFirewallRuleLocationEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_LOCATIONTYPE_ENUM)) {
            return VirtualFirewallRuleLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_NETWORKENTITYTYPE_ENUM)) {
            return VirtualFirewallRuleNetworkEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_NETWORKTYPE_ENUM)) {
            return VirtualFirewallRuleNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_POLICYSTATE_ENUM)) {
            return VirtualFirewallRulePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_REMOTEUPLINKPREFERENCE_ENUM)) {
            return VirtualFirewallRuleRemoteUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_REPUTATIONSCORE_ENUM)) {
            return VirtualFirewallRuleReputationScore.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_TYPE_ENUM)) {
            return VirtualFirewallRuleType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_UPLINKPREFERENCE_ENUM)) {
            return VirtualFirewallRuleUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_WEBFILTERTYPE_ENUM)) {
            return VirtualFirewallRuleWebFilterType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALIP)) {
            return ModelHelper.getVirtualIPById(id);
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER)) {
            return ModelHelper.getVirtualIPsFetcherById(id);
        }
        if (type.equals(Constants.VIRTUALIP_IPTYPE_ENUM)) {
            return VirtualIPIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALIP_ENTITYSCOPE_ENUM)) {
            return VirtualIPEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALUPLINK)) {
            return ModelHelper.getVirtualUplinkById(id);
        }
        if (type.equals(Constants.VIRTUALUPLINKS_FETCHER)) {
            return ModelHelper.getVirtualUplinksFetcherById(id);
        }
        if (type.equals(Constants.VIRTUALUPLINK_AUXMODE_ENUM)) {
            return VirtualUplinkAuxMode.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALUPLINK_FECENABLED_ENUM)) {
            return VirtualUplinkFecEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.VIRTUALUPLINK_ROLE_ENUM)) {
            return VirtualUplinkRole.getEnumById(id);
        }
        
        if (type.equals(Constants.VLAN)) {
            return ModelHelper.getVLANById(id);
        }
        if (type.equals(Constants.VLANS_FETCHER)) {
            return ModelHelper.getVLANsFetcherById(id);
        }
        if (type.equals(Constants.VLAN_ASSOCIATEDCONNECTIONTYPE_ENUM)) {
            return VLANAssociatedConnectionType.getEnumById(id);
        }
        
        if (type.equals(Constants.VLAN_ENTITYSCOPE_ENUM)) {
            return VLANEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VLAN_PERMITTEDACTION_ENUM)) {
            return VLANPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.VLAN_STATUS_ENUM)) {
            return VLANStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VLAN_TYPE_ENUM)) {
            return VLANType.getEnumById(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE)) {
            return ModelHelper.getVLANTemplateById(id);
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER)) {
            return ModelHelper.getVLANTemplatesFetcherById(id);
        }
        if (type.equals(Constants.VLANTEMPLATE_ASSOCIATEDCONNECTIONTYPE_ENUM)) {
            return VLANTemplateAssociatedConnectionType.getEnumById(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE_ENTITYSCOPE_ENUM)) {
            return VLANTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE_TYPE_ENUM)) {
            return VLANTemplateType.getEnumById(id);
        }
        
        if (type.equals(Constants.VM)) {
            return ModelHelper.getVMById(id);
        }
        if (type.equals(Constants.VMS_FETCHER)) {
            return ModelHelper.getVMsFetcherById(id);
        }
        if (type.equals(Constants.VM_DELETEMODE_ENUM)) {
            return VMDeleteMode.getEnumById(id);
        }
        
        if (type.equals(Constants.VM_ENTITYSCOPE_ENUM)) {
            return VMEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VM_REASONTYPE_ENUM)) {
            return VMReasonType.getEnumById(id);
        }
        
        if (type.equals(Constants.VM_STATUS_ENUM)) {
            return VMStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VMINTERFACE)) {
            return ModelHelper.getVMInterfaceById(id);
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER)) {
            return ModelHelper.getVMInterfacesFetcherById(id);
        }
        if (type.equals(Constants.VMINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return VMInterfaceAttachedNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.VMINTERFACE_ENTITYSCOPE_ENUM)) {
            return VMInterfaceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VMIPRESERVATION)) {
            return ModelHelper.getVMIPReservationById(id);
        }
        if (type.equals(Constants.VMIPRESERVATIONS_FETCHER)) {
            return ModelHelper.getVMIPReservationsFetcherById(id);
        }
        if (type.equals(Constants.VMIPRESERVATION_IPTYPE_ENUM)) {
            return VMIPReservationIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.VMIPRESERVATION_ENTITYSCOPE_ENUM)) {
            return VMIPReservationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VMIPRESERVATION_STATE_ENUM)) {
            return VMIPReservationState.getEnumById(id);
        }
        
        if (type.equals(Constants.VNF)) {
            return ModelHelper.getVNFById(id);
        }
        if (type.equals(Constants.VNFS_FETCHER)) {
            return ModelHelper.getVNFsFetcherById(id);
        }
        if (type.equals(Constants.VNF_ALLOWEDACTIONS_ENUM)) {
            return VNFAllowedActions.getEnumById(id);
        }
        
        if (type.equals(Constants.VNF_ENTITYSCOPE_ENUM)) {
            return VNFEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNF_LASTUSERACTION_ENUM)) {
            return VNFLastUserAction.getEnumById(id);
        }
        
        if (type.equals(Constants.VNF_STATUS_ENUM)) {
            return VNFStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VNF_TASKSTATE_ENUM)) {
            return VNFTaskState.getEnumById(id);
        }
        
        if (type.equals(Constants.VNF_TYPE_ENUM)) {
            return VNFType.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFCATALOG)) {
            return ModelHelper.getVNFCatalogById(id);
        }
        if (type.equals(Constants.VNFCATALOGS_FETCHER)) {
            return ModelHelper.getVNFCatalogsFetcherById(id);
        }
        if (type.equals(Constants.VNFCATALOG_ENTITYSCOPE_ENUM)) {
            return VNFCatalogEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR)) {
            return ModelHelper.getVNFDescriptorById(id);
        }
        if (type.equals(Constants.VNFDESCRIPTORS_FETCHER)) {
            return ModelHelper.getVNFDescriptorsFetcherById(id);
        }
        if (type.equals(Constants.VNFDESCRIPTOR_ENTITYSCOPE_ENUM)) {
            return VNFDescriptorEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR_TYPE_ENUM)) {
            return VNFDescriptorType.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING)) {
            return ModelHelper.getVNFDomainMappingById(id);
        }
        if (type.equals(Constants.VNFDOMAINMAPPINGS_FETCHER)) {
            return ModelHelper.getVNFDomainMappingsFetcherById(id);
        }
        if (type.equals(Constants.VNFDOMAINMAPPING_ENTITYSCOPE_ENUM)) {
            return VNFDomainMappingEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING_SEGMENTATIONTYPE_ENUM)) {
            return VNFDomainMappingSegmentationType.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFINTERFACE)) {
            return ModelHelper.getVNFInterfaceById(id);
        }
        if (type.equals(Constants.VNFINTERFACES_FETCHER)) {
            return ModelHelper.getVNFInterfacesFetcherById(id);
        }
        if (type.equals(Constants.VNFINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return VNFInterfaceAttachedNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFINTERFACE_ENTITYSCOPE_ENUM)) {
            return VNFInterfaceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFINTERFACE_TYPE_ENUM)) {
            return VNFInterfaceType.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR)) {
            return ModelHelper.getVNFInterfaceDescriptorById(id);
        }
        if (type.equals(Constants.VNFINTERFACEDESCRIPTORS_FETCHER)) {
            return ModelHelper.getVNFInterfaceDescriptorsFetcherById(id);
        }
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR_ENTITYSCOPE_ENUM)) {
            return VNFInterfaceDescriptorEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR_TYPE_ENUM)) {
            return VNFInterfaceDescriptorType.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFMETADATA)) {
            return ModelHelper.getVNFMetadataById(id);
        }
        if (type.equals(Constants.VNFMETADATAS_FETCHER)) {
            return ModelHelper.getVNFMetadatasFetcherById(id);
        }
        if (type.equals(Constants.VNFMETADATA_ENTITYSCOPE_ENUM)) {
            return VNFMetadataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY)) {
            return ModelHelper.getVNFThresholdPolicyById(id);
        }
        if (type.equals(Constants.VNFTHRESHOLDPOLICIES_FETCHER)) {
            return ModelHelper.getVNFThresholdPoliciesFetcherById(id);
        }
        if (type.equals(Constants.VNFTHRESHOLDPOLICY_ACTION_ENUM)) {
            return VNFThresholdPolicyAction.getEnumById(id);
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY_ENTITYSCOPE_ENUM)) {
            return VNFThresholdPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VPNCONNECTION)) {
            return ModelHelper.getVPNConnectionById(id);
        }
        if (type.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return ModelHelper.getVPNConnectionsFetcherById(id);
        }
        if (type.equals(Constants.VPNCONNECTION_ENTITYSCOPE_ENUM)) {
            return VPNConnectionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT)) {
            return ModelHelper.getVPortById(id);
        }
        if (type.equals(Constants.VPORTS_FETCHER)) {
            return ModelHelper.getVPortsFetcherById(id);
        }
        if (type.equals(Constants.VPORT_DPI_ENUM)) {
            return VPortDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_FIPIGNOREDEFAULTROUTE_ENUM)) {
            return VPortFIPIgnoreDefaultRoute.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_ADDRESSSPOOFING_ENUM)) {
            return VPortAddressSpoofing.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_ASSOCIATEDGATEWAYPERSONALITY_ENUM)) {
            return VPortAssociatedGatewayPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_ENTITYSCOPE_ENUM)) {
            return VPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_FLOWLIMITENABLED_ENUM)) {
            return VPortFlowLimitEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_FLOWSETUPRATELIMITENABLED_ENUM)) {
            return VPortFlowSetupRateLimitEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_GATEWAYMACMOVEROLE_ENUM)) {
            return VPortGatewayMACMoveRole.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_MULTICAST_ENUM)) {
            return VPortMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_OPERATIONALSTATE_ENUM)) {
            return VPortOperationalState.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_PEEROPERATIONALSTATE_ENUM)) {
            return VPortPeerOperationalState.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_SEGMENTATIONTYPE_ENUM)) {
            return VPortSegmentationType.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_SUBTYPE_ENUM)) {
            return VPortSubType.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_SYSTEMTYPE_ENUM)) {
            return VPortSystemType.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_TRUNKROLE_ENUM)) {
            return VPortTrunkRole.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_TYPE_ENUM)) {
            return VPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORTMIRROR)) {
            return ModelHelper.getVPortMirrorById(id);
        }
        if (type.equals(Constants.VPORTMIRRORS_FETCHER)) {
            return ModelHelper.getVPortMirrorsFetcherById(id);
        }
        if (type.equals(Constants.VPORTMIRROR_ENTITYSCOPE_ENUM)) {
            return VPortMirrorEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORTMIRROR_MIRRORDIRECTION_ENUM)) {
            return VPortMirrorMirrorDirection.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS)) {
            return ModelHelper.getVRSById(id);
        }
        if (type.equals(Constants.VRSS_FETCHER)) {
            return ModelHelper.getVRSsFetcherById(id);
        }
        if (type.equals(Constants.VRS_ENTITYSCOPE_ENUM)) {
            return VRSEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_HYPERVISORCONNECTIONSTATE_ENUM)) {
            return VRSHypervisorConnectionState.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_LICENSEDSTATE_ENUM)) {
            return VRSLicensedState.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_PERSONALITY_ENUM)) {
            return VRSPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_ROLE_ENUM)) {
            return VRSRole.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_STATUS_ENUM)) {
            return VRSStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE)) {
            return ModelHelper.getVRSAddressRangeById(id);
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return ModelHelper.getVRSAddressRangesFetcherById(id);
        }
        if (type.equals(Constants.VRSADDRESSRANGE_IPTYPE_ENUM)) {
            return VRSAddressRangeIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE_ENTITYSCOPE_ENUM)) {
            return VRSAddressRangeEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG)) {
            return ModelHelper.getVCenterVRSConfigById(id);
        }
        if (type.equals(Constants.VCENTERVRSCONFIGS_FETCHER)) {
            return ModelHelper.getVCenterVRSConfigsFetcherById(id);
        }
        if (type.equals(Constants.VCENTERVRSCONFIG_AVRSPROFILE_ENUM)) {
            return VCenterVRSConfigAvrsProfile.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_CPUCOUNT_ENUM)) {
            return VCenterVRSConfigCpuCount.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterVRSConfigDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_ENTITYSCOPE_ENUM)) {
            return VCenterVRSConfigEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_MEMORYSIZEINGB_ENUM)) {
            return VCenterVRSConfigMemorySizeInGB.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_PERSONALITY_ENUM)) {
            return VCenterVRSConfigPersonality.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return VCenterVRSConfigRemoteSyslogServerType.getEnumById(id);
        }
        
        if (type.equals(Constants.VRSINFO)) {
            return ModelHelper.getvrsInfoById(id);
        }
        if (type.equals(Constants.VRSINFOS_FETCHER)) {
            return ModelHelper.getvrsInfosFetcherById(id);
        }
        if (type.equals(Constants.VRSINFO_ENTITYSCOPE_ENUM)) {
            return vrsInfoEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VRSMETRICS)) {
            return ModelHelper.getVRSMetricsById(id);
        }
        if (type.equals(Constants.VRSMETRICS_FETCHER)) {
            return ModelHelper.getVRSMetricsFetcherById(id);
        }
        if (type.equals(Constants.VRSMETRICS_ENTITYSCOPE_ENUM)) {
            return VRSMetricsEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICY)) {
            return ModelHelper.getVRSRedeploymentpolicyById(id);
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return ModelHelper.getVRSRedeploymentpoliciesFetcherById(id);
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICY_ENTITYSCOPE_ENUM)) {
            return VRSRedeploymentpolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VSC)) {
            return ModelHelper.getVSCById(id);
        }
        if (type.equals(Constants.VSCS_FETCHER)) {
            return ModelHelper.getVSCsFetcherById(id);
        }
        if (type.equals(Constants.VSC_ENTITYSCOPE_ENUM)) {
            return VSCEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VSC_STATUS_ENUM)) {
            return VSCStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VSD)) {
            return ModelHelper.getVSDById(id);
        }
        if (type.equals(Constants.VSDS_FETCHER)) {
            return ModelHelper.getVSDsFetcherById(id);
        }
        if (type.equals(Constants.VSD_ENTITYSCOPE_ENUM)) {
            return VSDEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VSD_MODE_ENUM)) {
            return VSDMode.getEnumById(id);
        }
        
        if (type.equals(Constants.VSD_STATUS_ENUM)) {
            return VSDStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VSDCONFIG)) {
            return ModelHelper.getVSDConfigById(id);
        }
        if (type.equals(Constants.VSDCONFIGS_FETCHER)) {
            return ModelHelper.getVSDConfigsFetcherById(id);
        }
        if (type.equals(Constants.VSGREDUNDANTPORT)) {
            return ModelHelper.getVsgRedundantPortById(id);
        }
        if (type.equals(Constants.VSGREDUNDANTPORTS_FETCHER)) {
            return ModelHelper.getVsgRedundantPortsFetcherById(id);
        }
        if (type.equals(Constants.VSGREDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return VsgRedundantPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_OPERATIONALSTATE_ENUM)) {
            return VsgRedundantPortOperationalState.getEnumById(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return VsgRedundantPortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_PORTTYPE_ENUM)) {
            return VsgRedundantPortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_STATUS_ENUM)) {
            return VsgRedundantPortStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.VSP)) {
            return ModelHelper.getVSPById(id);
        }
        if (type.equals(Constants.VSPS_FETCHER)) {
            return ModelHelper.getVSPsFetcherById(id);
        }
        if (type.equals(Constants.VSP_ENTITYSCOPE_ENUM)) {
            return VSPEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.WEBCATEGORY)) {
            return ModelHelper.getWebCategoryById(id);
        }
        if (type.equals(Constants.WEBCATEGORIES_FETCHER)) {
            return ModelHelper.getWebCategoriesFetcherById(id);
        }
        if (type.equals(Constants.WEBCATEGORY_ENTITYSCOPE_ENUM)) {
            return WebCategoryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.WEBCATEGORY_TYPE_ENUM)) {
            return WebCategoryType.getEnumById(id);
        }
        
        if (type.equals(Constants.WEBDOMAINNAME)) {
            return ModelHelper.getWebDomainNameById(id);
        }
        if (type.equals(Constants.WEBDOMAINNAMES_FETCHER)) {
            return ModelHelper.getWebDomainNamesFetcherById(id);
        }
        if (type.equals(Constants.WEBDOMAINNAME_ENTITYSCOPE_ENUM)) {
            return WebDomainNameEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT)) {
            return ModelHelper.getWirelessPortById(id);
        }
        if (type.equals(Constants.WIRELESSPORTS_FETCHER)) {
            return ModelHelper.getWirelessPortsFetcherById(id);
        }
        if (type.equals(Constants.WIRELESSPORT_CHANNELWIDTH_ENUM)) {
            return WirelessPortChannelWidth.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_COUNTRYCODE_ENUM)) {
            return WirelessPortCountryCode.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_ENTITYSCOPE_ENUM)) {
            return WirelessPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_FREQUENCYCHANNEL_ENUM)) {
            return WirelessPortFrequencyChannel.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_PERMITTEDACTION_ENUM)) {
            return WirelessPortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_PORTTYPE_ENUM)) {
            return WirelessPortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_STATUS_ENUM)) {
            return WirelessPortStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_WIFIFREQUENCYBAND_ENUM)) {
            return WirelessPortWifiFrequencyBand.getEnumById(id);
        }
        
        if (type.equals(Constants.WIRELESSPORT_WIFIMODE_ENUM)) {
            return WirelessPortWifiMode.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBAUTOASSIGNMENT)) {
            return ModelHelper.getZFBAutoAssignmentById(id);
        }
        if (type.equals(Constants.ZFBAUTOASSIGNMENTS_FETCHER)) {
            return ModelHelper.getZFBAutoAssignmentsFetcherById(id);
        }
        if (type.equals(Constants.ZFBAUTOASSIGNMENT_ZFBMATCHATTRIBUTE_ENUM)) {
            return ZFBAutoAssignmentZFBMatchAttribute.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBAUTOASSIGNMENT_ENTITYSCOPE_ENUM)) {
            return ZFBAutoAssignmentEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST)) {
            return ModelHelper.getZFBRequestById(id);
        }
        if (type.equals(Constants.ZFBREQUESTS_FETCHER)) {
            return ModelHelper.getZFBRequestsFetcherById(id);
        }
        if (type.equals(Constants.ZFBREQUEST_ZFBAPPROVALSTATUS_ENUM)) {
            return ZFBRequestZFBApprovalStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST_ASSOCIATEDENTITYTYPE_ENUM)) {
            return ZFBRequestAssociatedEntityType.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST_ENTITYSCOPE_ENUM)) {
            return ZFBRequestEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST_REQUESTTYPE_ENUM)) {
            return ZFBRequestRequestType.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONE)) {
            return ModelHelper.getZoneById(id);
        }
        if (type.equals(Constants.ZONES_FETCHER)) {
            return ModelHelper.getZonesFetcherById(id);
        }
        if (type.equals(Constants.ZONE_DPI_ENUM)) {
            return ZoneDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONE_IPTYPE_ENUM)) {
            return ZoneIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONE_ENCRYPTION_ENUM)) {
            return ZoneEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONE_ENTITYSCOPE_ENUM)) {
            return ZoneEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONE_MAINTENANCEMODE_ENUM)) {
            return ZoneMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONE_MULTICAST_ENUM)) {
            return ZoneMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE)) {
            return ModelHelper.getZoneTemplateById(id);
        }
        if (type.equals(Constants.ZONETEMPLATES_FETCHER)) {
            return ModelHelper.getZoneTemplatesFetcherById(id);
        }
        if (type.equals(Constants.ZONETEMPLATE_DPI_ENUM)) {
            return ZoneTemplateDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE_IPTYPE_ENUM)) {
            return ZoneTemplateIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE_ENCRYPTION_ENUM)) {
            return ZoneTemplateEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE_ENTITYSCOPE_ENUM)) {
            return ZoneTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE_MULTICAST_ENUM)) {
            return ZoneTemplateMulticast.getEnumById(id);
        }
        throw new UnsupportedOperationException("implement findImpl(String type, String id) - type: " + type + ", " + id);
    }

    @Override
    public final java.util.List<?> findRelationImpl(String type, String id, String relationName) throws RestException {
        if (type.equals(Constants.PLUGIN_ROOT) && relationName.equals(Constants.SESSIONS)) {
            return ModelHelper.getAllSessions();
        }
        if (type.equals(Constants.ADDRESSMAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAddressMapId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSMAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAddressMapId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSMAP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAddressMapId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSMAP) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForAddressMapId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSMAP) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForAddressMapId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSRANGE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForAddressRangeId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSRANGE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAddressRangeId(id));
        }
        
        if (type.equals(Constants.ADDRESSRANGE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAddressRangeId(id));
        }
        
        if (type.equals(Constants.ADDRESSRANGE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAddressRangeId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.APPLICATIONS_FETCHER) && relationName.equals(Constants.APPLICATIONS)) {
            return ModelHelper.getApplicationsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementbindingsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS)) {
            return ModelHelper.getApplicationperformancemanagementbindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.BRIDGEINTERFACES_FETCHER) && relationName.equals(Constants.BRIDGEINTERFACES)) {
            return ModelHelper.getBridgeInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.DEPLOYMENTFAILURES_FETCHER) && relationName.equals(Constants.DEPLOYMENTFAILURES)) {
            return ModelHelper.getDeploymentFailuresForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.DOMAINS_FETCHER) && relationName.equals(Constants.DOMAINS)) {
            return ModelHelper.getDomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.DOMAINTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINTEMPLATES)) {
            return ModelHelper.getDomainTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLTEMPLATES)) {
            return ModelHelper.getEgressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSADVFWDTEMPLATES)) {
            return ModelHelper.getEgressAdvFwdTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES)) {
            return ModelHelper.getDomainFIPAclTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForAggregatedDomainId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.FIREWALLACLS_FETCHER)) {
            return toList(ModelHelper.getFirewallAclsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.FIREWALLACLS_FETCHER) && relationName.equals(Constants.FIREWALLACLS)) {
            return ModelHelper.getFirewallAclsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.FLOATINGIPS_FETCHER)) {
            return toList(ModelHelper.getFloatingIpsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.FLOATINGIPS_FETCHER) && relationName.equals(Constants.FLOATINGIPS)) {
            return ModelHelper.getFloatingIpsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.FORWARDINGPATHLISTS_FETCHER)) {
            return toList(ModelHelper.getForwardingPathListsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.FORWARDINGPATHLISTS_FETCHER) && relationName.equals(Constants.FORWARDINGPATHLISTS)) {
            return ModelHelper.getForwardingPathListsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.GATEWAYS_FETCHER) && relationName.equals(Constants.GATEWAYS)) {
            return ModelHelper.getGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAggregatedDomainId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER) && relationName.equals(Constants.HOSTINTERFACES)) {
            return ModelHelper.getHostInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLTEMPLATES)) {
            return ModelHelper.getIngressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.LINKS_FETCHER)) {
            return toList(ModelHelper.getLinksFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.LINKS_FETCHER) && relationName.equals(Constants.LINKS)) {
            return ModelHelper.getLinksForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAggregatedDomainId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceBindingsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS)) {
            return ModelHelper.getNetworkPerformanceBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            return toList(ModelHelper.getNSGatewaySummariesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.NSGATEWAYSUMMARIES_FETCHER) && relationName.equals(Constants.NSGATEWAYSUMMARIES)) {
            return ModelHelper.getNSGatewaySummariesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.NSGROUTINGPOLICYBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNSGRoutingPolicyBindingsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.NSGROUTINGPOLICYBINDINGS_FETCHER) && relationName.equals(Constants.NSGROUTINGPOLICYBINDINGS)) {
            return ModelHelper.getNSGRoutingPolicyBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.OSPFINSTANCES_FETCHER)) {
            return toList(ModelHelper.getOSPFInstancesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.OSPFINSTANCES_FETCHER) && relationName.equals(Constants.OSPFINSTANCES)) {
            return ModelHelper.getOSPFInstancesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAggregatedDomainId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.PGEXPRESSIONS_FETCHER)) {
            return toList(ModelHelper.getPGExpressionsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.PGEXPRESSIONS_FETCHER) && relationName.equals(Constants.PGEXPRESSIONS)) {
            return ModelHelper.getPGExpressionsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER) && relationName.equals(Constants.ROUTINGPOLICIES)) {
            return ModelHelper.getRoutingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.ROUTINGPOLICYBINDINGS_FETCHER)) {
            return toList(ModelHelper.getRoutingPolicyBindingsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.ROUTINGPOLICYBINDINGS_FETCHER) && relationName.equals(Constants.ROUTINGPOLICYBINDINGS)) {
            return ModelHelper.getRoutingPolicyBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.SPATSOURCESPOOLS_FETCHER)) {
            return toList(ModelHelper.getSPATSourcesPoolsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.SPATSOURCESPOOLS_FETCHER) && relationName.equals(Constants.SPATSOURCESPOOLS)) {
            return ModelHelper.getSPATSourcesPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForAggregatedDomainId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForAggregatedDomainId(id));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.UPLINKRDS_FETCHER) && relationName.equals(Constants.UPLINKRDS)) {
            return ModelHelper.getUplinkRDsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallPoliciesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES)) {
            return ModelHelper.getVirtualFirewallPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallRulesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VIRTUALFIREWALLRULES_FETCHER) && relationName.equals(Constants.VIRTUALFIREWALLRULES)) {
            return ModelHelper.getVirtualFirewallRulesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VNFDOMAINMAPPINGS_FETCHER)) {
            return toList(ModelHelper.getVNFDomainMappingsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VNFDOMAINMAPPINGS_FETCHER) && relationName.equals(Constants.VNFDOMAINMAPPINGS)) {
            return ModelHelper.getVNFDomainMappingsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VPNCONNECTIONS_FETCHER) && relationName.equals(Constants.VPNCONNECTIONS)) {
            return ModelHelper.getVPNConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN) && relationName.equals(Constants.ZONES_FETCHER)) {
            return toList(ModelHelper.getZonesFetcherForAggregatedDomainId(id));
        }
        if (type.equals(Constants.ZONES_FETCHER) && relationName.equals(Constants.ZONES)) {
            return ModelHelper.getZonesForFetcherId(id);
        }
        
        if (type.equals(Constants.ALARM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAlarmId(id));
        }
        
        if (type.equals(Constants.ALARM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAlarmId(id));
        }
        
        if (type.equals(Constants.ALARM) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAlarmId(id));
        }
        
        if (type.equals(Constants.ALLALARM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAllAlarmId(id));
        }
        
        if (type.equals(Constants.ALLALARM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAllAlarmId(id));
        }
        
        if (type.equals(Constants.ALLALARM) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAllAlarmId(id));
        }
        
        if (type.equals(Constants.ALLGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAllGatewayId(id));
        }
        
        if (type.equals(Constants.ALLGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAllGatewayId(id));
        }
        
        if (type.equals(Constants.ALLGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAllGatewayId(id));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAllRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAllRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAllRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationBindingsFetcherForApplicationId(id));
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER) && relationName.equals(Constants.APPLICATIONBINDINGS)) {
            return ModelHelper.getApplicationBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForApplicationId(id));
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForApplicationId(id));
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.MONITORSCOPES_FETCHER)) {
            return toList(ModelHelper.getMonitorscopesFetcherForApplicationId(id));
        }
        if (type.equals(Constants.MONITORSCOPES_FETCHER) && relationName.equals(Constants.MONITORSCOPES)) {
            return ModelHelper.getMonitorscopesForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForApplicationId(id));
        }
        
        if (type.equals(Constants.APPLICATIONBINDING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForApplicationBindingId(id));
        }
        
        if (type.equals(Constants.APPLICATIONBINDING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForApplicationBindingId(id));
        }
        
        if (type.equals(Constants.APPLICATIONBINDING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForApplicationBindingId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT) && relationName.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationBindingsFetcherForApplicationperformancemanagementId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementbindingsFetcherForApplicationperformancemanagementId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForApplicationperformancemanagementId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForApplicationperformancemanagementId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForApplicationperformancemanagementId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForApplicationperformancemanagementbindingId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForApplicationperformancemanagementbindingId(id));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForApplicationperformancemanagementbindingId(id));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForAutoDiscoveredGatewayId(id));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAutoDiscoveredGatewayId(id));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAutoDiscoveredGatewayId(id));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.NSPORTS_FETCHER)) {
            return toList(ModelHelper.getNSPortsFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.NSPORTS_FETCHER) && relationName.equals(Constants.NSPORTS)) {
            return ModelHelper.getNSPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAutoDiscoveredGatewayId(id));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.PORTS_FETCHER)) {
            return toList(ModelHelper.getPortsFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.PORTS_FETCHER) && relationName.equals(Constants.PORTS)) {
            return ModelHelper.getPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.WANSERVICES_FETCHER)) {
            return toList(ModelHelper.getWANServicesFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.WANSERVICES_FETCHER) && relationName.equals(Constants.WANSERVICES)) {
            return ModelHelper.getWANServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.WIRELESSPORTS_FETCHER)) {
            return toList(ModelHelper.getWirelessPortsFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.WIRELESSPORTS_FETCHER) && relationName.equals(Constants.WIRELESSPORTS)) {
            return ModelHelper.getWirelessPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.AVATAR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAvatarId(id));
        }
        
        if (type.equals(Constants.AVATAR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAvatarId(id));
        }
        
        if (type.equals(Constants.AVATAR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAvatarId(id));
        }
        
        if (type.equals(Constants.AZURECLOUD) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForAzureCloudId(id));
        }
        
        if (type.equals(Constants.AZURECLOUD) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAzureCloudId(id));
        }
        
        if (type.equals(Constants.AZURECLOUD) && relationName.equals(Constants.IKEGATEWAYPROFILES_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayProfilesFetcherForAzureCloudId(id));
        }
        if (type.equals(Constants.IKEGATEWAYPROFILES_FETCHER) && relationName.equals(Constants.IKEGATEWAYPROFILES)) {
            return ModelHelper.getIKEGatewayProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.AZURECLOUD) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForAzureCloudId(id));
        }
        
        if (type.equals(Constants.AZURECLOUD) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAzureCloudId(id));
        }
        
        if (type.equals(Constants.AZURECLOUD) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForAzureCloudId(id));
        }
        
        if (type.equals(Constants.BFDSESSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBFDSessionId(id));
        }
        
        if (type.equals(Constants.BFDSESSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBFDSessionId(id));
        }
        
        if (type.equals(Constants.BFDSESSION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBFDSessionId(id));
        }
        
        if (type.equals(Constants.BGPNEIGHBOR) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForBGPNeighborId(id));
        }
        
        if (type.equals(Constants.BGPNEIGHBOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBGPNeighborId(id));
        }
        
        if (type.equals(Constants.BGPNEIGHBOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBGPNeighborId(id));
        }
        
        if (type.equals(Constants.BGPNEIGHBOR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBGPNeighborId(id));
        }
        
        if (type.equals(Constants.BGPPEER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBGPPeerId(id));
        }
        
        if (type.equals(Constants.BGPPEER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBGPPeerId(id));
        }
        
        if (type.equals(Constants.BGPPEER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBGPPeerId(id));
        }
        
        if (type.equals(Constants.BGPPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBGPProfileId(id));
        }
        
        if (type.equals(Constants.BGPPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBGPProfileId(id));
        }
        
        if (type.equals(Constants.BGPPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBGPProfileId(id));
        }
        
        if (type.equals(Constants.BOOTSTRAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBootstrapId(id));
        }
        
        if (type.equals(Constants.BOOTSTRAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBootstrapId(id));
        }
        
        if (type.equals(Constants.BOOTSTRAP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBootstrapId(id));
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBootstrapActivationId(id));
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBootstrapActivationId(id));
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBootstrapActivationId(id));
        }
        
        if (type.equals(Constants.BRCONNECTION) && relationName.equals(Constants.BFDSESSIONS_FETCHER)) {
            return toList(ModelHelper.getBFDSessionsFetcherForBRConnectionId(id));
        }
        if (type.equals(Constants.BFDSESSIONS_FETCHER) && relationName.equals(Constants.BFDSESSIONS)) {
            return ModelHelper.getBFDSessionsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBRConnectionId(id));
        }
        
        if (type.equals(Constants.BRCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBRConnectionId(id));
        }
        
        if (type.equals(Constants.BRCONNECTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBRConnectionId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.DHCPV6OPTIONS_FETCHER) && relationName.equals(Constants.DHCPV6OPTIONS)) {
            return ModelHelper.getDHCPv6OptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.POLICYDECISIONS_FETCHER) && relationName.equals(Constants.POLICYDECISIONS)) {
            return ModelHelper.getPolicyDecisionsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForBridgeInterfaceId(id));
        }
        
        if (type.equals(Constants.BULKSTATISTICS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBulkStatisticsId(id));
        }
        
        if (type.equals(Constants.BULKSTATISTICS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBulkStatisticsId(id));
        }
        
        if (type.equals(Constants.BULKSTATISTICS) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForBulkStatisticsId(id));
        }
        
        if (type.equals(Constants.CERTIFICATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCertificateId(id));
        }
        
        if (type.equals(Constants.CERTIFICATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCertificateId(id));
        }
        
        if (type.equals(Constants.CERTIFICATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCertificateId(id));
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCloudMgmtSystemId(id));
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCloudMgmtSystemId(id));
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCloudMgmtSystemId(id));
        }
        
        if (type.equals(Constants.VSDCOMPONENT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSDComponentId(id));
        }
        
        if (type.equals(Constants.VSDCOMPONENT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSDComponentId(id));
        }
        
        if (type.equals(Constants.VSDCOMPONENT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVSDComponentId(id));
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForConnectionendpointId(id));
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForConnectionendpointId(id));
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForConnectionendpointId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForContainerId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForContainerId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.CONTAINERRESYNCS_FETCHER)) {
            return toList(ModelHelper.getContainerResyncsFetcherForContainerId(id));
        }
        if (type.equals(Constants.CONTAINERRESYNCS_FETCHER) && relationName.equals(Constants.CONTAINERRESYNCS)) {
            return ModelHelper.getContainerResyncsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForContainerId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForContainerId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForContainerId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForContainerId(id));
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForContainerId(id));
        }
        if (type.equals(Constants.VRSS_FETCHER) && relationName.equals(Constants.VRSS)) {
            return ModelHelper.getVRSsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER) && relationName.equals(Constants.MULTICASTCHANNELMAPS)) {
            return ModelHelper.getMultiCastChannelMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForContainerInterfaceId(id));
        }
        
        if (type.equals(Constants.CONTAINERRESYNC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForContainerResyncId(id));
        }
        
        if (type.equals(Constants.CONTAINERRESYNC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForContainerResyncId(id));
        }
        
        if (type.equals(Constants.CONTAINERRESYNC) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForContainerResyncId(id));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForControllerVRSLinkId(id));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK) && relationName.equals(Constants.HSCS_FETCHER)) {
            return toList(ModelHelper.getHSCsFetcherForControllerVRSLinkId(id));
        }
        if (type.equals(Constants.HSCS_FETCHER) && relationName.equals(Constants.HSCS)) {
            return ModelHelper.getHSCsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForControllerVRSLinkId(id));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForControllerVRSLinkId(id));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForControllerVRSLinkId(id));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK) && relationName.equals(Constants.VSCS_FETCHER)) {
            return toList(ModelHelper.getVSCsFetcherForControllerVRSLinkId(id));
        }
        if (type.equals(Constants.VSCS_FETCHER) && relationName.equals(Constants.VSCS)) {
            return ModelHelper.getVSCsForFetcherId(id);
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCOSRemarkingPolicyId(id));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCOSRemarkingPolicyId(id));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCOSRemarkingPolicyId(id));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE) && relationName.equals(Constants.COSREMARKINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getCOSRemarkingPoliciesFetcherForCOSRemarkingPolicyTableId(id));
        }
        if (type.equals(Constants.COSREMARKINGPOLICIES_FETCHER) && relationName.equals(Constants.COSREMARKINGPOLICIES)) {
            return ModelHelper.getCOSRemarkingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCOSRemarkingPolicyTableId(id));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCOSRemarkingPolicyTableId(id));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCOSRemarkingPolicyTableId(id));
        }
        
        if (type.equals(Constants.CSNATPOOL) && relationName.equals(Constants.CTRANSLATIONMAPS_FETCHER)) {
            return toList(ModelHelper.getCTranslationMapsFetcherForCSNATPoolId(id));
        }
        if (type.equals(Constants.CTRANSLATIONMAPS_FETCHER) && relationName.equals(Constants.CTRANSLATIONMAPS)) {
            return ModelHelper.getCTranslationMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.CSNATPOOL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCSNATPoolId(id));
        }
        
        if (type.equals(Constants.CSNATPOOL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCSNATPoolId(id));
        }
        
        if (type.equals(Constants.CSNATPOOL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCSNATPoolId(id));
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCTranslationMapId(id));
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCTranslationMapId(id));
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCTranslationMapId(id));
        }
        
        if (type.equals(Constants.CUSTOMPROPERTY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCustomPropertyId(id));
        }
        
        if (type.equals(Constants.CUSTOMPROPERTY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCustomPropertyId(id));
        }
        
        if (type.equals(Constants.CUSTOMPROPERTY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForCustomPropertyId(id));
        }
        
        if (type.equals(Constants.DEFAULTGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDefaultGatewayId(id));
        }
        
        if (type.equals(Constants.DEFAULTGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDefaultGatewayId(id));
        }
        
        if (type.equals(Constants.DEFAULTGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDefaultGatewayId(id));
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDemarcationServiceId(id));
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDemarcationServiceId(id));
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDemarcationServiceId(id));
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDeploymentFailureId(id));
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDeploymentFailureId(id));
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDeploymentFailureId(id));
        }
        
        if (type.equals(Constants.DESTINATIONURL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDestinationurlId(id));
        }
        
        if (type.equals(Constants.DESTINATIONURL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDestinationurlId(id));
        }
        
        if (type.equals(Constants.DESTINATIONURL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDestinationurlId(id));
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDHCPOptionId(id));
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDHCPOptionId(id));
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDHCPOptionId(id));
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDHCPOptionId(id));
        }
        
        if (type.equals(Constants.DHCPV6OPTION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDHCPv6OptionId(id));
        }
        
        if (type.equals(Constants.DHCPV6OPTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDHCPv6OptionId(id));
        }
        
        if (type.equals(Constants.DHCPV6OPTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDHCPv6OptionId(id));
        }
        
        if (type.equals(Constants.DHCPV6OPTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDHCPv6OptionId(id));
        }
        
        if (type.equals(Constants.DISKSTAT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDiskStatId(id));
        }
        
        if (type.equals(Constants.DISKSTAT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDiskStatId(id));
        }
        
        if (type.equals(Constants.DISKSTAT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDiskStatId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.AGGREGATEDDOMAINS_FETCHER)) {
            return toList(ModelHelper.getAggregatedDomainsFetcherForDomainId(id));
        }
        if (type.equals(Constants.AGGREGATEDDOMAINS_FETCHER) && relationName.equals(Constants.AGGREGATEDDOMAINS)) {
            return ModelHelper.getAggregatedDomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementbindingsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAuditACLEntryTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressAuditACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSAUDITACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAuditACLTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSAUDITACLTEMPLATES)) {
            return ModelHelper.getEgressAuditACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.FIREWALLACLS_FETCHER)) {
            return toList(ModelHelper.getFirewallAclsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.FLOATINGIPS_FETCHER)) {
            return toList(ModelHelper.getFloatingIpsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.FORWARDINGPATHLISTS_FETCHER)) {
            return toList(ModelHelper.getForwardingPathListsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAuditACLEntryTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressAuditACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSAUDITACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAuditACLTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSAUDITACLTEMPLATES)) {
            return ModelHelper.getIngressAuditACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.LINKS_FETCHER)) {
            return toList(ModelHelper.getLinksFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.MIRRORDESTINATIONGROUPS_FETCHER)) {
            return toList(ModelHelper.getMirrorDestinationGroupsFetcherForDomainId(id));
        }
        if (type.equals(Constants.MIRRORDESTINATIONGROUPS_FETCHER) && relationName.equals(Constants.MIRRORDESTINATIONGROUPS)) {
            return ModelHelper.getMirrorDestinationGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.NETCONFGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNetconfGatewaysFetcherForDomainId(id));
        }
        if (type.equals(Constants.NETCONFGATEWAYS_FETCHER) && relationName.equals(Constants.NETCONFGATEWAYS)) {
            return ModelHelper.getNetconfGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            return toList(ModelHelper.getNetworkMacroGroupsFetcherForDomainId(id));
        }
        if (type.equals(Constants.NETWORKMACROGROUPS_FETCHER) && relationName.equals(Constants.NETWORKMACROGROUPS)) {
            return ModelHelper.getNetworkMacroGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceBindingsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            return toList(ModelHelper.getNSGatewaySummariesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.NSGROUTINGPOLICYBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNSGRoutingPolicyBindingsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.OSPFINSTANCES_FETCHER)) {
            return toList(ModelHelper.getOSPFInstancesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.PGEXPRESSIONS_FETCHER)) {
            return toList(ModelHelper.getPGExpressionsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.ROUTINGPOLICYBINDINGS_FETCHER)) {
            return toList(ModelHelper.getRoutingPolicyBindingsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.SPATSOURCESPOOLS_FETCHER)) {
            return toList(ModelHelper.getSPATSourcesPoolsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallPoliciesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallRulesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VNFDOMAINMAPPINGS_FETCHER)) {
            return toList(ModelHelper.getVNFDomainMappingsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.ZONES_FETCHER)) {
            return toList(ModelHelper.getZonesFetcherForDomainId(id));
        }
        
        if (type.equals(Constants.DOMAINKINDSUMMARY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainKindSummaryId(id));
        }
        
        if (type.equals(Constants.DOMAINKINDSUMMARY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainKindSummaryId(id));
        }
        
        if (type.equals(Constants.DOMAINKINDSUMMARY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainKindSummaryId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdTemplatesFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.PGEXPRESSIONTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPGExpressionTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.PGEXPRESSIONTEMPLATES_FETCHER) && relationName.equals(Constants.PGEXPRESSIONTEMPLATES)) {
            return ModelHelper.getPGExpressionTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.POLICYGROUPTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.POLICYGROUPTEMPLATES_FETCHER) && relationName.equals(Constants.POLICYGROUPTEMPLATES)) {
            return ModelHelper.getPolicyGroupTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETTEMPLATES)) {
            return ModelHelper.getRedirectionTargetTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.SUBNETTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getSubnetTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.SUBNETTEMPLATES_FETCHER) && relationName.equals(Constants.SUBNETTEMPLATES)) {
            return ModelHelper.getSubnetTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallPoliciesFetcherForDomainTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.ZONETEMPLATES_FETCHER)) {
            return toList(ModelHelper.getZoneTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.ZONETEMPLATES_FETCHER) && relationName.equals(Constants.ZONETEMPLATES)) {
            return ModelHelper.getZoneTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDSCPForwardingClassMappingId(id));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDSCPForwardingClassMappingId(id));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDSCPForwardingClassMappingId(id));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE) && relationName.equals(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER)) {
            return toList(ModelHelper.getDSCPForwardingClassMappingsFetcherForDSCPForwardingClassTableId(id));
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER) && relationName.equals(Constants.DSCPFORWARDINGCLASSMAPPINGS)) {
            return ModelHelper.getDSCPForwardingClassMappingsForFetcherId(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDSCPForwardingClassTableId(id));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDSCPForwardingClassTableId(id));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDSCPForwardingClassTableId(id));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDSCPRemarkingPolicyId(id));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDSCPRemarkingPolicyId(id));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDSCPRemarkingPolicyId(id));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE) && relationName.equals(Constants.DSCPREMARKINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getDSCPRemarkingPoliciesFetcherForDSCPRemarkingPolicyTableId(id));
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICIES_FETCHER) && relationName.equals(Constants.DSCPREMARKINGPOLICIES)) {
            return ModelHelper.getDSCPRemarkingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDSCPRemarkingPolicyTableId(id));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDSCPRemarkingPolicyTableId(id));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDSCPRemarkingPolicyTableId(id));
        }
        
        if (type.equals(Constants.DUCGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDUCGroupId(id));
        }
        
        if (type.equals(Constants.DUCGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDUCGroupId(id));
        }
        
        if (type.equals(Constants.DUCGROUP) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForDUCGroupId(id));
        }
        if (type.equals(Constants.NSGATEWAYS_FETCHER) && relationName.equals(Constants.NSGATEWAYS)) {
            return ModelHelper.getNSGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.DUCGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDUCGroupId(id));
        }
        
        if (type.equals(Constants.DUCGROUPBINDING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDUCGroupBindingId(id));
        }
        
        if (type.equals(Constants.DUCGROUPBINDING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDUCGroupBindingId(id));
        }
        
        if (type.equals(Constants.DUCGROUPBINDING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDUCGroupBindingId(id));
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterEAMConfigId(id));
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterEAMConfigId(id));
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVCenterEAMConfigId(id));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForEgressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForEgressACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE) && relationName.equals(Constants.EGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdEntryTemplatesFetcherForEgressAdvFwdTemplateId(id));
        }
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSADVFWDENTRYTEMPLATES)) {
            return ModelHelper.getEgressAdvFwdEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAuditACLEntryTemplatesFetcherForEgressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainFIPAclTemplateEntryId(id));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainFIPAclTemplateEntryId(id));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainFIPAclTemplateEntryId(id));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE) && relationName.equals(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplateEntriesFetcherForDomainFIPAclTemplateId(id));
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER) && relationName.equals(Constants.DOMAINFIPACLTEMPLATEENTRIES)) {
            return ModelHelper.getDomainFIPAclTemplateEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainFIPAclTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainFIPAclTemplateId(id));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainFIPAclTemplateId(id));
        }
        
        if (type.equals(Constants.EGRESSPROFILE) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForEgressProfileId(id));
        }
        
        if (type.equals(Constants.EGRESSPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressProfileId(id));
        }
        
        if (type.equals(Constants.EGRESSPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressProfileId(id));
        }
        
        if (type.equals(Constants.EGRESSPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressProfileId(id));
        }
        
        if (type.equals(Constants.EGRESSPROFILE) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForEgressProfileId(id));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressQOSPolicyId(id));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressQOSPolicyId(id));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEgressQOSPolicyId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ALLALARMS_FETCHER)) {
            return toList(ModelHelper.getAllAlarmsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ALLALARMS_FETCHER) && relationName.equals(Constants.ALLALARMS)) {
            return ModelHelper.getAllAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS)) {
            return ModelHelper.getApplicationperformancemanagementsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.AVATARS_FETCHER)) {
            return toList(ModelHelper.getAvatarsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.AVATARS_FETCHER) && relationName.equals(Constants.AVATARS)) {
            return ModelHelper.getAvatarsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.AZURECLOUDS_FETCHER)) {
            return toList(ModelHelper.getAzureCloudsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.AZURECLOUDS_FETCHER) && relationName.equals(Constants.AZURECLOUDS)) {
            return ModelHelper.getAzureCloudsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.BGPPROFILES_FETCHER)) {
            return toList(ModelHelper.getBGPProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.BGPPROFILES_FETCHER) && relationName.equals(Constants.BGPPROFILES)) {
            return ModelHelper.getBGPProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.CAPTIVEPORTALPROFILES_FETCHER)) {
            return toList(ModelHelper.getCaptivePortalProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILES_FETCHER) && relationName.equals(Constants.CAPTIVEPORTALPROFILES)) {
            return ModelHelper.getCaptivePortalProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.COSREMARKINGPOLICYTABLES_FETCHER)) {
            return toList(ModelHelper.getCOSRemarkingPolicyTablesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.COSREMARKINGPOLICYTABLES_FETCHER) && relationName.equals(Constants.COSREMARKINGPOLICYTABLES)) {
            return ModelHelper.getCOSRemarkingPolicyTablesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DOMAINKINDSUMMARIES_FETCHER)) {
            return toList(ModelHelper.getDomainKindSummariesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.DOMAINKINDSUMMARIES_FETCHER) && relationName.equals(Constants.DOMAINKINDSUMMARIES)) {
            return ModelHelper.getDomainKindSummariesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainTemplatesFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER)) {
            return toList(ModelHelper.getDSCPForwardingClassTablesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER) && relationName.equals(Constants.DSCPFORWARDINGCLASSTABLES)) {
            return ModelHelper.getDSCPForwardingClassTablesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DSCPREMARKINGPOLICYTABLES_FETCHER)) {
            return toList(ModelHelper.getDSCPRemarkingPolicyTablesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLES_FETCHER) && relationName.equals(Constants.DSCPREMARKINGPOLICYTABLES)) {
            return ModelHelper.getDSCPRemarkingPolicyTablesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.EGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getEgressProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.EGRESSPROFILES_FETCHER) && relationName.equals(Constants.EGRESSPROFILES)) {
            return ModelHelper.getEgressProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getEgressQOSPoliciesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.EGRESSQOSPOLICIES_FETCHER) && relationName.equals(Constants.EGRESSQOSPOLICIES)) {
            return ModelHelper.getEgressQOSPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ENTERPRISENETWORKS_FETCHER)) {
            return toList(ModelHelper.getEnterpriseNetworksFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ENTERPRISENETWORKS_FETCHER) && relationName.equals(Constants.ENTERPRISENETWORKS)) {
            return ModelHelper.getEnterpriseNetworksForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ENTERPRISESECURITIES_FETCHER)) {
            return toList(ModelHelper.getEnterpriseSecuritiesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ENTERPRISESECURITIES_FETCHER) && relationName.equals(Constants.ENTERPRISESECURITIES)) {
            return ModelHelper.getEnterpriseSecuritiesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.FIREWALLACLS_FETCHER)) {
            return toList(ModelHelper.getFirewallAclsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.FIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getFirewallRulesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.FIREWALLRULES_FETCHER) && relationName.equals(Constants.FIREWALLRULES)) {
            return ModelHelper.getFirewallRulesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GATEWAYSLOCATIONS_FETCHER)) {
            return toList(ModelHelper.getGatewaysLocationsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GATEWAYSLOCATIONS_FETCHER) && relationName.equals(Constants.GATEWAYSLOCATIONS)) {
            return ModelHelper.getGatewaysLocationsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getGatewayTemplatesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GATEWAYTEMPLATES_FETCHER) && relationName.equals(Constants.GATEWAYTEMPLATES)) {
            return ModelHelper.getGatewayTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GNMIPROFILES_FETCHER)) {
            return toList(ModelHelper.getGNMIProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GNMIPROFILES_FETCHER) && relationName.equals(Constants.GNMIPROFILES)) {
            return ModelHelper.getGNMIProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER)) {
            return toList(ModelHelper.getGroupKeyEncryptionProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER) && relationName.equals(Constants.GROUPKEYENCRYPTIONPROFILES)) {
            return ModelHelper.getGroupKeyEncryptionProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ICMPECHOTESTDEFINITIONS_FETCHER)) {
            return toList(ModelHelper.getICMPEchoTestDefinitionsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ICMPECHOTESTDEFINITIONS_FETCHER) && relationName.equals(Constants.ICMPECHOTESTDEFINITIONS)) {
            return ModelHelper.getICMPEchoTestDefinitionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IDPPROFILES_FETCHER)) {
            return toList(ModelHelper.getIDPProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IDPPROFILES_FETCHER) && relationName.equals(Constants.IDPPROFILES)) {
            return ModelHelper.getIDPProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IKECERTIFICATES_FETCHER)) {
            return toList(ModelHelper.getIKECertificatesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IKECERTIFICATES_FETCHER) && relationName.equals(Constants.IKECERTIFICATES)) {
            return ModelHelper.getIKECertificatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IKEENCRYPTIONPROFILES_FETCHER)) {
            return toList(ModelHelper.getIKEEncryptionprofilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IKEENCRYPTIONPROFILES_FETCHER) && relationName.equals(Constants.IKEENCRYPTIONPROFILES)) {
            return ModelHelper.getIKEEncryptionprofilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IKEGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getIKEGatewaysFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IKEGATEWAYS_FETCHER) && relationName.equals(Constants.IKEGATEWAYS)) {
            return ModelHelper.getIKEGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IKEGATEWAYPROFILES_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayProfilesFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IKEPSKS_FETCHER)) {
            return toList(ModelHelper.getIKEPSKsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IKEPSKS_FETCHER) && relationName.equals(Constants.IKEPSKS)) {
            return ModelHelper.getIKEPSKsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.INGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getIngressProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.INGRESSPROFILES_FETCHER) && relationName.equals(Constants.INGRESSPROFILES)) {
            return ModelHelper.getIngressProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.INGRESSQOSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getIngressQOSPoliciesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.INGRESSQOSPOLICIES_FETCHER) && relationName.equals(Constants.INGRESSQOSPOLICIES)) {
            return ModelHelper.getIngressQOSPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPFilterProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IPFILTERPROFILES_FETCHER) && relationName.equals(Constants.IPFILTERPROFILES)) {
            return ModelHelper.getIPFilterProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPv6FilterProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IPV6FILTERPROFILES_FETCHER) && relationName.equals(Constants.IPV6FILTERPROFILES)) {
            return ModelHelper.getIPv6FilterProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.KEYSERVERMONITORS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMonitorsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.KEYSERVERMONITORS_FETCHER) && relationName.equals(Constants.KEYSERVERMONITORS)) {
            return ModelHelper.getKeyServerMonitorsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.L2DOMAINS_FETCHER) && relationName.equals(Constants.L2DOMAINS)) {
            return ModelHelper.getL2DomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.L2DOMAINTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getL2DomainTemplatesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.L2DOMAINTEMPLATES_FETCHER) && relationName.equals(Constants.L2DOMAINTEMPLATES)) {
            return ModelHelper.getL2DomainTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.L4SERVICES_FETCHER)) {
            return toList(ModelHelper.getL4ServicesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.L4SERVICES_FETCHER) && relationName.equals(Constants.L4SERVICES)) {
            return ModelHelper.getL4ServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.L4SERVICEGROUPS_FETCHER)) {
            return toList(ModelHelper.getL4ServiceGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.L4SERVICEGROUPS_FETCHER) && relationName.equals(Constants.L4SERVICEGROUPS)) {
            return ModelHelper.getL4ServiceGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER)) {
            return toList(ModelHelper.getL7applicationsignaturesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER) && relationName.equals(Constants.L7APPLICATIONSIGNATURES)) {
            return ModelHelper.getL7applicationsignaturesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.LDAPCONFIGURATIONS_FETCHER)) {
            return toList(ModelHelper.getLDAPConfigurationsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.LDAPCONFIGURATIONS_FETCHER) && relationName.equals(Constants.LDAPCONFIGURATIONS)) {
            return ModelHelper.getLDAPConfigurationsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.MULTICASTLISTS_FETCHER)) {
            return toList(ModelHelper.getMultiCastListsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.MULTICASTLISTS_FETCHER) && relationName.equals(Constants.MULTICASTLISTS)) {
            return ModelHelper.getMultiCastListsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NETCONFPROFILES_FETCHER)) {
            return toList(ModelHelper.getNetconfProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NETCONFPROFILES_FETCHER) && relationName.equals(Constants.NETCONFPROFILES)) {
            return ModelHelper.getNetconfProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            return toList(ModelHelper.getNetworkMacroGroupsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceMeasurementsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER) && relationName.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS)) {
            return ModelHelper.getNetworkPerformanceMeasurementsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSGATEWAYSCOUNTS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysCountsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NSGATEWAYSCOUNTS_FETCHER) && relationName.equals(Constants.NSGATEWAYSCOUNTS)) {
            return ModelHelper.getNSGatewaysCountsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            return toList(ModelHelper.getNSGatewaySummariesFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSGatewayTemplatesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATES_FETCHER) && relationName.equals(Constants.NSGATEWAYTEMPLATES)) {
            return ModelHelper.getNSGatewayTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSGGROUPS_FETCHER)) {
            return toList(ModelHelper.getNSGGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NSGGROUPS_FETCHER) && relationName.equals(Constants.NSGGROUPS)) {
            return ModelHelper.getNSGGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER)) {
            return toList(ModelHelper.getNSRedundantGatewayGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS)) {
            return ModelHelper.getNSRedundantGatewayGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.OVERLAYMANAGEMENTPROFILES_FETCHER)) {
            return toList(ModelHelper.getOverlayManagementProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTPROFILES_FETCHER) && relationName.equals(Constants.OVERLAYMANAGEMENTPROFILES)) {
            return ModelHelper.getOverlayManagementProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER) && relationName.equals(Constants.PATNATPOOLS)) {
            return ModelHelper.getPATNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            return toList(ModelHelper.getPerformanceMonitorsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.PERFORMANCEMONITORS_FETCHER) && relationName.equals(Constants.PERFORMANCEMONITORS)) {
            return ModelHelper.getPerformanceMonitorsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.POLICYGROUPCATEGORIES_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupCategoriesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.POLICYGROUPCATEGORIES_FETCHER) && relationName.equals(Constants.POLICYGROUPCATEGORIES)) {
            return ModelHelper.getPolicyGroupCategoriesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.POLICYOBJECTGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyObjectGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.POLICYOBJECTGROUPS_FETCHER) && relationName.equals(Constants.POLICYOBJECTGROUPS)) {
            return ModelHelper.getPolicyObjectGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.PUBLICNETWORKMACROS_FETCHER)) {
            return toList(ModelHelper.getPublicNetworkMacrosFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.PUBLICNETWORKMACROS_FETCHER) && relationName.equals(Constants.PUBLICNETWORKMACROS)) {
            return ModelHelper.getPublicNetworkMacrosForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.RATELIMITERS_FETCHER)) {
            return toList(ModelHelper.getRateLimitersFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.RATELIMITERS_FETCHER) && relationName.equals(Constants.RATELIMITERS)) {
            return ModelHelper.getRateLimitersForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.REDUNDANCYGROUPS_FETCHER)) {
            return toList(ModelHelper.getRedundancyGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.REDUNDANCYGROUPS_FETCHER) && relationName.equals(Constants.REDUNDANCYGROUPS)) {
            return ModelHelper.getRedundancyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ROLES_FETCHER)) {
            return toList(ModelHelper.getRolesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ROLES_FETCHER) && relationName.equals(Constants.ROLES)) {
            return ModelHelper.getRolesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SAASAPPLICATIONGROUPS_FETCHER)) {
            return toList(ModelHelper.getSaaSApplicationGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SAASAPPLICATIONGROUPS_FETCHER) && relationName.equals(Constants.SAASAPPLICATIONGROUPS)) {
            return ModelHelper.getSaaSApplicationGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SAASAPPLICATIONTYPES_FETCHER)) {
            return toList(ModelHelper.getSaaSApplicationTypesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SAASAPPLICATIONTYPES_FETCHER) && relationName.equals(Constants.SAASAPPLICATIONTYPES)) {
            return ModelHelper.getSaaSApplicationTypesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPEgressQoSProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER) && relationName.equals(Constants.SAPEGRESSQOSPROFILES)) {
            return ModelHelper.getSAPEgressQoSProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPIngressQoSProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER) && relationName.equals(Constants.SAPINGRESSQOSPROFILES)) {
            return ModelHelper.getSAPIngressQoSProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SCHEDULEDTESTSUITES_FETCHER)) {
            return toList(ModelHelper.getScheduledTestSuitesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITES_FETCHER) && relationName.equals(Constants.SCHEDULEDTESTSUITES)) {
            return ModelHelper.getScheduledTestSuitesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return toList(ModelHelper.getSharedNetworkResourcesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER) && relationName.equals(Constants.SHAREDNETWORKRESOURCES)) {
            return ModelHelper.getSharedNetworkResourcesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SYSLOGDESTINATIONS_FETCHER)) {
            return toList(ModelHelper.getSyslogDestinationsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SYSLOGDESTINATIONS_FETCHER) && relationName.equals(Constants.SYSLOGDESTINATIONS)) {
            return ModelHelper.getSyslogDestinationsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.TESTDEFINITIONS_FETCHER)) {
            return toList(ModelHelper.getTestDefinitionsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.TESTDEFINITIONS_FETCHER) && relationName.equals(Constants.TESTDEFINITIONS)) {
            return ModelHelper.getTestDefinitionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.TESTSUITES_FETCHER)) {
            return toList(ModelHelper.getTestSuitesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.TESTSUITES_FETCHER) && relationName.equals(Constants.TESTSUITES)) {
            return ModelHelper.getTestSuitesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.TRUNKS_FETCHER)) {
            return toList(ModelHelper.getTrunksFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.TRUNKS_FETCHER) && relationName.equals(Constants.TRUNKS)) {
            return ModelHelper.getTrunksForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.USERS_FETCHER)) {
            return toList(ModelHelper.getUsersFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.USERS_FETCHER) && relationName.equals(Constants.USERS)) {
            return ModelHelper.getUsersForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForEnterpriseId(id));
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.VNFS_FETCHER)) {
            return toList(ModelHelper.getVNFsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.VNFS_FETCHER) && relationName.equals(Constants.VNFS)) {
            return ModelHelper.getVNFsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.VNFMETADATAS_FETCHER)) {
            return toList(ModelHelper.getVNFMetadatasFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.VNFMETADATAS_FETCHER) && relationName.equals(Constants.VNFMETADATAS)) {
            return ModelHelper.getVNFMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.VNFTHRESHOLDPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVNFThresholdPoliciesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.VNFTHRESHOLDPOLICIES_FETCHER) && relationName.equals(Constants.VNFTHRESHOLDPOLICIES)) {
            return ModelHelper.getVNFThresholdPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.WEBCATEGORIES_FETCHER)) {
            return toList(ModelHelper.getWebCategoriesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.WEBCATEGORIES_FETCHER) && relationName.equals(Constants.WEBCATEGORIES)) {
            return ModelHelper.getWebCategoriesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.WEBDOMAINNAMES_FETCHER)) {
            return toList(ModelHelper.getWebDomainNamesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.WEBDOMAINNAMES_FETCHER) && relationName.equals(Constants.WEBDOMAINNAMES)) {
            return ModelHelper.getWebDomainNamesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ZFBREQUESTS_FETCHER)) {
            return toList(ModelHelper.getZFBRequestsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ZFBREQUESTS_FETCHER) && relationName.equals(Constants.ZFBREQUESTS)) {
            return ModelHelper.getZFBRequestsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEnterpriseNetworkId(id));
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseNetworkId(id));
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseNetworkId(id));
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            return toList(ModelHelper.getNetworkMacroGroupsFetcherForEnterpriseNetworkId(id));
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEnterpriseNetworkId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterprisePermissionId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterprisePermissionId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEnterprisePermissionId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.ENTERPRISES_FETCHER)) {
            return toList(ModelHelper.getEnterprisesFetcherForEnterpriseProfileId(id));
        }
        if (type.equals(Constants.ENTERPRISES_FETCHER) && relationName.equals(Constants.ENTERPRISES)) {
            return ModelHelper.getEnterprisesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEnterpriseProfileId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseProfileId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseProfileId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.MULTICASTLISTS_FETCHER)) {
            return toList(ModelHelper.getMultiCastListsFetcherForEnterpriseProfileId(id));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEnterpriseProfileId(id));
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseSecuredDataId(id));
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseSecuredDataId(id));
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEnterpriseSecuredDataId(id));
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY) && relationName.equals(Constants.ENTERPRISESECUREDDATAS_FETCHER)) {
            return toList(ModelHelper.getEnterpriseSecuredDatasFetcherForEnterpriseSecurityId(id));
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATAS_FETCHER) && relationName.equals(Constants.ENTERPRISESECUREDDATAS)) {
            return ModelHelper.getEnterpriseSecuredDatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseSecurityId(id));
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseSecurityId(id));
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEnterpriseSecurityId(id));
        }
        
        if (type.equals(Constants.ESILMPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEsIlmPolicyId(id));
        }
        
        if (type.equals(Constants.ESILMPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEsIlmPolicyId(id));
        }
        
        if (type.equals(Constants.ESILMPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEsIlmPolicyId(id));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEsIndexConfigId(id));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEsIndexConfigId(id));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEsIndexConfigId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGROUP) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForEthernetSegmentGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGROUP) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForEthernetSegmentGroupId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEthernetSegmentGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGROUP) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForEthernetSegmentGroupId(id));
        }
        if (type.equals(Constants.VLANS_FETCHER) && relationName.equals(Constants.VLANS)) {
            return ModelHelper.getVLANsForFetcherId(id);
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.EGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getEgressProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.ETHERNETSEGMENTGROUPS_FETCHER)) {
            return toList(ModelHelper.getEthernetSegmentGroupsFetcherForEthernetSegmentGWGroupId(id));
        }
        if (type.equals(Constants.ETHERNETSEGMENTGROUPS_FETCHER) && relationName.equals(Constants.ETHERNETSEGMENTGROUPS)) {
            return ModelHelper.getEthernetSegmentGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.INGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getIngressProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPFilterProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPv6FilterProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.MACFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getMACFilterProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        if (type.equals(Constants.MACFILTERPROFILES_FETCHER) && relationName.equals(Constants.MACFILTERPROFILES)) {
            return ModelHelper.getMACFilterProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPEgressQoSProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP) && relationName.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPIngressQoSProfilesFetcherForEthernetSegmentGWGroupId(id));
        }
        
        if (type.equals(Constants.EVENTLOG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEventLogId(id));
        }
        
        if (type.equals(Constants.EVENTLOG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEventLogId(id));
        }
        
        if (type.equals(Constants.EVENTLOG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForEventLogId(id));
        }
        
        if (type.equals(Constants.FIREWALLACL) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForFirewallAclId(id));
        }
        
        if (type.equals(Constants.FIREWALLACL) && relationName.equals(Constants.FIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getFirewallRulesFetcherForFirewallAclId(id));
        }
        
        if (type.equals(Constants.FIREWALLACL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFirewallAclId(id));
        }
        
        if (type.equals(Constants.FIREWALLACL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFirewallAclId(id));
        }
        
        if (type.equals(Constants.FIREWALLACL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForFirewallAclId(id));
        }
        
        if (type.equals(Constants.FIREWALLRULE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFirewallRuleId(id));
        }
        
        if (type.equals(Constants.FIREWALLRULE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFirewallRuleId(id));
        }
        
        if (type.equals(Constants.FIREWALLRULE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForFirewallRuleId(id));
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForFloatingIpId(id));
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFloatingIpId(id));
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFloatingIpId(id));
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForFloatingIpId(id));
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForFloatingIpId(id));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLIST) && relationName.equals(Constants.FORWARDINGPATHLISTENTRIES_FETCHER)) {
            return toList(ModelHelper.getForwardingPathListEntriesFetcherForForwardingPathListId(id));
        }
        if (type.equals(Constants.FORWARDINGPATHLISTENTRIES_FETCHER) && relationName.equals(Constants.FORWARDINGPATHLISTENTRIES)) {
            return ModelHelper.getForwardingPathListEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.FORWARDINGPATHLIST) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForForwardingPathListId(id));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLIST) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForForwardingPathListId(id));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLIST) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForForwardingPathListId(id));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForForwardingPathListEntryId(id));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForForwardingPathListEntryId(id));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForForwardingPathListEntryId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.BOOTSTRAPS_FETCHER)) {
            return toList(ModelHelper.getBootstrapsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.BOOTSTRAPS_FETCHER) && relationName.equals(Constants.BOOTSTRAPS)) {
            return ModelHelper.getBootstrapsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER)) {
            return toList(ModelHelper.getBootstrapActivationsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER) && relationName.equals(Constants.BOOTSTRAPACTIVATIONS)) {
            return ModelHelper.getBootstrapActivationsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.EGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getEgressProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            return toList(ModelHelper.getGatewaySecuritiesFetcherForGatewayId(id));
        }
        if (type.equals(Constants.GATEWAYSECURITIES_FETCHER) && relationName.equals(Constants.GATEWAYSECURITIES)) {
            return ModelHelper.getGatewaySecuritiesForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER)) {
            return toList(ModelHelper.getInfrastructureConfigsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER) && relationName.equals(Constants.INFRASTRUCTURECONFIGS)) {
            return ModelHelper.getInfrastructureConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.INGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getIngressProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPFilterProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPv6FilterProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.LOCATIONS_FETCHER)) {
            return toList(ModelHelper.getLocationsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.LOCATIONS_FETCHER) && relationName.equals(Constants.LOCATIONS)) {
            return ModelHelper.getLocationsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.MACFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getMACFilterProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.PORTS_FETCHER)) {
            return toList(ModelHelper.getPortsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPEgressQoSProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPIngressQoSProfilesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.WANSERVICES_FETCHER)) {
            return toList(ModelHelper.getWANServicesFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForGatewayId(id));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForGatewayRedundantPortId(id));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForGatewayRedundantPortId(id));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewayRedundantPortId(id));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewayRedundantPortId(id));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewayRedundantPortId(id));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForGatewayRedundantPortId(id));
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewaySecuredDataId(id));
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewaySecuredDataId(id));
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewaySecuredDataId(id));
        }
        
        if (type.equals(Constants.GATEWAYSECURITY) && relationName.equals(Constants.GATEWAYSECUREDDATAS_FETCHER)) {
            return toList(ModelHelper.getGatewaySecuredDatasFetcherForGatewaySecurityId(id));
        }
        if (type.equals(Constants.GATEWAYSECUREDDATAS_FETCHER) && relationName.equals(Constants.GATEWAYSECUREDDATAS)) {
            return ModelHelper.getGatewaySecuredDatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYSECURITY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewaySecurityId(id));
        }
        
        if (type.equals(Constants.GATEWAYSECURITY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewaySecurityId(id));
        }
        
        if (type.equals(Constants.GATEWAYSECURITY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewaySecurityId(id));
        }
        
        if (type.equals(Constants.GATEWAYSLOCATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewaysLocationId(id));
        }
        
        if (type.equals(Constants.GATEWAYSLOCATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewaysLocationId(id));
        }
        
        if (type.equals(Constants.GATEWAYSLOCATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewaysLocationId(id));
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewayTemplateId(id));
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewayTemplateId(id));
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewayTemplateId(id));
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.PORTTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPortTemplatesFetcherForGatewayTemplateId(id));
        }
        if (type.equals(Constants.PORTTEMPLATES_FETCHER) && relationName.equals(Constants.PORTTEMPLATES)) {
            return ModelHelper.getPortTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.GLOBALMETADATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGlobalMetadataId(id));
        }
        
        if (type.equals(Constants.GLOBALMETADATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGlobalMetadataId(id));
        }
        
        if (type.equals(Constants.GLOBALMETADATA) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGlobalMetadataId(id));
        }
        
        if (type.equals(Constants.GNMIPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGNMIProfileId(id));
        }
        
        if (type.equals(Constants.GNMIPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGNMIProfileId(id));
        }
        
        if (type.equals(Constants.GNMISESSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGNMISessionId(id));
        }
        
        if (type.equals(Constants.GNMISESSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGNMISessionId(id));
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForGroupId(id));
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGroupId(id));
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGroupId(id));
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGroupId(id));
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.USERS_FETCHER)) {
            return toList(ModelHelper.getUsersFetcherForGroupId(id));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGroupKeyEncryptionProfileId(id));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGroupKeyEncryptionProfileId(id));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGroupKeyEncryptionProfileId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForHostInterfaceId(id));
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForHSCId(id));
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.BGPPEERS_FETCHER)) {
            return toList(ModelHelper.getBGPPeersFetcherForHSCId(id));
        }
        if (type.equals(Constants.BGPPEERS_FETCHER) && relationName.equals(Constants.BGPPEERS)) {
            return ModelHelper.getBGPPeersForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.CONTROLLERVRSLINKS_FETCHER)) {
            return toList(ModelHelper.getControllerVRSLinksFetcherForHSCId(id));
        }
        if (type.equals(Constants.CONTROLLERVRSLINKS_FETCHER) && relationName.equals(Constants.CONTROLLERVRSLINKS)) {
            return ModelHelper.getControllerVRSLinksForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForHSCId(id));
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForHSCId(id));
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForHSCId(id));
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForHSCId(id));
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return toList(ModelHelper.getMonitoringPortsFetcherForHSCId(id));
        }
        if (type.equals(Constants.MONITORINGPORTS_FETCHER) && relationName.equals(Constants.MONITORINGPORTS)) {
            return ModelHelper.getMonitoringPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForHSCId(id));
        }
        
        if (type.equals(Constants.IDPPROFILE) && relationName.equals(Constants.IDPPROFILEACTIONS_FETCHER)) {
            return toList(ModelHelper.getIDPProfileActionsFetcherForIDPProfileId(id));
        }
        if (type.equals(Constants.IDPPROFILEACTIONS_FETCHER) && relationName.equals(Constants.IDPPROFILEACTIONS)) {
            return ModelHelper.getIDPProfileActionsForFetcherId(id);
        }
        
        if (type.equals(Constants.IKECERTIFICATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKECertificateId(id));
        }
        
        if (type.equals(Constants.IKECERTIFICATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKECertificateId(id));
        }
        
        if (type.equals(Constants.IKECERTIFICATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKECertificateId(id));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEEncryptionprofileId(id));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEEncryptionprofileId(id));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKEEncryptionprofileId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAY) && relationName.equals(Constants.IKEGATEWAYCONFIGS_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayConfigsFetcherForIKEGatewayId(id));
        }
        if (type.equals(Constants.IKEGATEWAYCONFIGS_FETCHER) && relationName.equals(Constants.IKEGATEWAYCONFIGS)) {
            return ModelHelper.getIKEGatewayConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY) && relationName.equals(Constants.IKESUBNETS_FETCHER)) {
            return toList(ModelHelper.getIKESubnetsFetcherForIKEGatewayId(id));
        }
        if (type.equals(Constants.IKESUBNETS_FETCHER) && relationName.equals(Constants.IKESUBNETS)) {
            return ModelHelper.getIKESubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKEGatewayId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayConfigId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayConfigId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKEGatewayConfigId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            return toList(ModelHelper.getPerformanceMonitorsFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForIKEGatewayConnectionId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayProfileId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayProfileId(id));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKEGatewayProfileId(id));
        }
        
        if (type.equals(Constants.IKEPSK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEPSKId(id));
        }
        
        if (type.equals(Constants.IKEPSK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEPSKId(id));
        }
        
        if (type.equals(Constants.IKEPSK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKEPSKId(id));
        }
        
        if (type.equals(Constants.IKESUBNET) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKESubnetId(id));
        }
        
        if (type.equals(Constants.IKESUBNET) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKESubnetId(id));
        }
        
        if (type.equals(Constants.IKESUBNET) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIKESubnetId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureConfigId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureConfigId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForInfrastructureConfigId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.CONNECTIONENDPOINTS_FETCHER)) {
            return toList(ModelHelper.getConnectionendpointsFetcherForInfrastructureAccessProfileId(id));
        }
        if (type.equals(Constants.CONNECTIONENDPOINTS_FETCHER) && relationName.equals(Constants.CONNECTIONENDPOINTS)) {
            return ModelHelper.getConnectionendpointsForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureAccessProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureAccessProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSGatewayTemplatesFetcherForInfrastructureAccessProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForInfrastructureAccessProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.SSHKEYS_FETCHER)) {
            return toList(ModelHelper.getSSHKeysFetcherForInfrastructureAccessProfileId(id));
        }
        if (type.equals(Constants.SSHKEYS_FETCHER) && relationName.equals(Constants.SSHKEYS)) {
            return ModelHelper.getSSHKeysForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureEVDFProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureEVDFProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForInfrastructureEVDFProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureGatewayProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureGatewayProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForInfrastructureGatewayProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureVscProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureVscProfileId(id));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForInfrastructureVscProfileId(id));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForIngressACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForIngressACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdEntryTemplatesFetcherForIngressAdvFwdTemplateId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressAdvFwdTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForIngressAuditACLEntryTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAuditACLEntryTemplatesFetcherForIngressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressAuditACLTemplateId(id));
        }
        
        if (type.equals(Constants.INGRESSPROFILE) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForIngressProfileId(id));
        }
        
        if (type.equals(Constants.INGRESSPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressProfileId(id));
        }
        
        if (type.equals(Constants.INGRESSPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressProfileId(id));
        }
        
        if (type.equals(Constants.INGRESSPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressProfileId(id));
        }
        
        if (type.equals(Constants.INGRESSPROFILE) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForIngressProfileId(id));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressQOSPolicyId(id));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressQOSPolicyId(id));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIngressQOSPolicyId(id));
        }
        
        if (type.equals(Constants.IPFILTERPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIPFilterProfileId(id));
        }
        
        if (type.equals(Constants.IPFILTERPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIPFilterProfileId(id));
        }
        
        if (type.equals(Constants.IPFILTERPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIPFilterProfileId(id));
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForIPReservationId(id));
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIPReservationId(id));
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIPReservationId(id));
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIPReservationId(id));
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIPv6FilterProfileId(id));
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIPv6FilterProfileId(id));
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForIPv6FilterProfileId(id));
        }
        
        if (type.equals(Constants.JOB) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForJobId(id));
        }
        
        if (type.equals(Constants.JOB) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForJobId(id));
        }
        
        if (type.equals(Constants.JOB) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForJobId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMemberId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMemberId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForKeyServerMemberId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorId(id));
        }
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER) && relationName.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS)) {
            return ModelHelper.getKeyServerMonitorEncryptedSeedsForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.KEYSERVERMONITORSEEDS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMonitorSeedsFetcherForKeyServerMonitorId(id));
        }
        if (type.equals(Constants.KEYSERVERMONITORSEEDS_FETCHER) && relationName.equals(Constants.KEYSERVERMONITORSEEDS)) {
            return ModelHelper.getKeyServerMonitorSeedsForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.KEYSERVERMONITORSEKS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMonitorSEKsFetcherForKeyServerMonitorId(id));
        }
        if (type.equals(Constants.KEYSERVERMONITORSEKS_FETCHER) && relationName.equals(Constants.KEYSERVERMONITORSEKS)) {
            return ModelHelper.getKeyServerMonitorSEKsForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForKeyServerMonitorId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorEncryptedSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorEncryptedSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForKeyServerMonitorEncryptedSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForKeyServerMonitorSeedId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorSEKId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorSEKId(id));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForKeyServerMonitorSEKId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER) && relationName.equals(Constants.ADDRESSRANGES)) {
            return ModelHelper.getAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementbindingsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAuditACLEntryTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSAUDITACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAuditACLTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAuditACLEntryTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSAUDITACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAuditACLTemplatesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.MIRRORDESTINATIONGROUPS_FETCHER)) {
            return toList(ModelHelper.getMirrorDestinationGroupsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceBindingsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            return toList(ModelHelper.getNSGatewaySummariesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER)) {
            return toList(ModelHelper.getOverlayMirrorDestinationsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER) && relationName.equals(Constants.OVERLAYMIRRORDESTINATIONS)) {
            return ModelHelper.getOverlayMirrorDestinationsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.PGEXPRESSIONS_FETCHER)) {
            return toList(ModelHelper.getPGExpressionsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.PROXYARPFILTERS_FETCHER)) {
            return toList(ModelHelper.getProxyARPFiltersFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.PROXYARPFILTERS_FETCHER) && relationName.equals(Constants.PROXYARPFILTERS)) {
            return ModelHelper.getProxyARPFiltersForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.REDUNDANCYGROUPS_FETCHER)) {
            return toList(ModelHelper.getRedundancyGroupsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallPoliciesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallRulesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VMIPRESERVATIONS_FETCHER)) {
            return toList(ModelHelper.getVMIPReservationsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.VMIPRESERVATIONS_FETCHER) && relationName.equals(Constants.VMIPRESERVATIONS)) {
            return ModelHelper.getVMIPReservationsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForL2DomainId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getOverlayMirrorDestinationTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATES_FETCHER) && relationName.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATES)) {
            return ModelHelper.getOverlayMirrorDestinationTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.PGEXPRESSIONTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPGExpressionTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.POLICYGROUPTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetTemplatesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallPoliciesFetcherForL2DomainTemplateId(id));
        }
        
        if (type.equals(Constants.L4SERVICE) && relationName.equals(Constants.L4SERVICEGROUPS_FETCHER)) {
            return toList(ModelHelper.getL4ServiceGroupsFetcherForL4ServiceId(id));
        }
        
        if (type.equals(Constants.L4SERVICEGROUP) && relationName.equals(Constants.L4SERVICES_FETCHER)) {
            return toList(ModelHelper.getL4ServicesFetcherForL4ServiceGroupId(id));
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForL7applicationsignatureId(id));
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForL7applicationsignatureId(id));
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForL7applicationsignatureId(id));
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForL7applicationsignatureId(id));
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLDAPConfigurationId(id));
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLDAPConfigurationId(id));
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLDAPConfigurationId(id));
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForLicenseId(id));
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLicenseId(id));
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLicenseId(id));
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLicenseId(id));
        }
        
        if (type.equals(Constants.LICENSESTATUS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLicenseStatusId(id));
        }
        
        if (type.equals(Constants.LICENSESTATUS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLicenseStatusId(id));
        }
        
        if (type.equals(Constants.LICENSESTATUS) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLicenseStatusId(id));
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.CSNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getCSNATPoolsFetcherForLinkId(id));
        }
        if (type.equals(Constants.CSNATPOOLS_FETCHER) && relationName.equals(Constants.CSNATPOOLS)) {
            return ModelHelper.getCSNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.DEMARCATIONSERVICES_FETCHER)) {
            return toList(ModelHelper.getDemarcationServicesFetcherForLinkId(id));
        }
        if (type.equals(Constants.DEMARCATIONSERVICES_FETCHER) && relationName.equals(Constants.DEMARCATIONSERVICES)) {
            return ModelHelper.getDemarcationServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLinkId(id));
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLinkId(id));
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.NEXTHOPS_FETCHER)) {
            return toList(ModelHelper.getNextHopsFetcherForLinkId(id));
        }
        if (type.equals(Constants.NEXTHOPS_FETCHER) && relationName.equals(Constants.NEXTHOPS)) {
            return ModelHelper.getNextHopsForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER)) {
            return toList(ModelHelper.getOverlayAddressPoolsFetcherForLinkId(id));
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER) && relationName.equals(Constants.OVERLAYADDRESSPOOLS)) {
            return ModelHelper.getOverlayAddressPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLinkId(id));
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.POLICYSTATEMENTS_FETCHER)) {
            return toList(ModelHelper.getPolicyStatementsFetcherForLinkId(id));
        }
        if (type.equals(Constants.POLICYSTATEMENTS_FETCHER) && relationName.equals(Constants.POLICYSTATEMENTS)) {
            return ModelHelper.getPolicyStatementsForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.PSNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPSNATPoolsFetcherForLinkId(id));
        }
        if (type.equals(Constants.PSNATPOOLS_FETCHER) && relationName.equals(Constants.PSNATPOOLS)) {
            return ModelHelper.getPSNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.LOCATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLocationId(id));
        }
        
        if (type.equals(Constants.LOCATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLocationId(id));
        }
        
        if (type.equals(Constants.LOCATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLocationId(id));
        }
        
        if (type.equals(Constants.LTEINFORMATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLTEInformationId(id));
        }
        
        if (type.equals(Constants.LTEINFORMATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLTEInformationId(id));
        }
        
        if (type.equals(Constants.LTEINFORMATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLTEInformationId(id));
        }
        
        if (type.equals(Constants.LTESTATISTICS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLtestatisticsId(id));
        }
        
        if (type.equals(Constants.LTESTATISTICS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLtestatisticsId(id));
        }
        
        if (type.equals(Constants.LTESTATISTICS) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForLtestatisticsId(id));
        }
        
        if (type.equals(Constants.MACFILTERPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMACFilterProfileId(id));
        }
        
        if (type.equals(Constants.MACFILTERPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMACFilterProfileId(id));
        }
        
        if (type.equals(Constants.MACFILTERPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMACFilterProfileId(id));
        }
        
        if (type.equals(Constants.SESSION) && relationName.equals(Constants.MES)) {
            return toList(ModelHelper.getMeById(id));
        }
        if (type.equals(Constants.ME) && relationName.equals(Constants.ALLGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getAllGatewaysFetcherForMeId(id));
        }
        if (type.equals(Constants.ALLGATEWAYS_FETCHER) && relationName.equals(Constants.ALLGATEWAYS)) {
            return ModelHelper.getAllGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ALLREDUNDANCYGROUPS_FETCHER)) {
            return toList(ModelHelper.getAllRedundancyGroupsFetcherForMeId(id));
        }
        if (type.equals(Constants.ALLREDUNDANCYGROUPS_FETCHER) && relationName.equals(Constants.ALLREDUNDANCYGROUPS)) {
            return ModelHelper.getAllRedundancyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.AUTODISCOVEREDGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getAutoDiscoveredGatewaysFetcherForMeId(id));
        }
        if (type.equals(Constants.AUTODISCOVEREDGATEWAYS_FETCHER) && relationName.equals(Constants.AUTODISCOVEREDGATEWAYS)) {
            return ModelHelper.getAutoDiscoveredGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return toList(ModelHelper.getBGPNeighborsFetcherForMeId(id));
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER) && relationName.equals(Constants.BGPNEIGHBORS)) {
            return ModelHelper.getBGPNeighborsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.BGPPROFILES_FETCHER)) {
            return toList(ModelHelper.getBGPProfilesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.CERTIFICATES_FETCHER)) {
            return toList(ModelHelper.getCertificatesFetcherForMeId(id));
        }
        if (type.equals(Constants.CERTIFICATES_FETCHER) && relationName.equals(Constants.CERTIFICATES)) {
            return ModelHelper.getCertificatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.CLOUDMGMTSYSTEMS_FETCHER)) {
            return toList(ModelHelper.getCloudMgmtSystemsFetcherForMeId(id));
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEMS_FETCHER) && relationName.equals(Constants.CLOUDMGMTSYSTEMS)) {
            return ModelHelper.getCloudMgmtSystemsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.COMMANDS_FETCHER)) {
            return toList(ModelHelper.getCommandsFetcherForMeId(id));
        }
        if (type.equals(Constants.COMMANDS_FETCHER) && relationName.equals(Constants.COMMANDS)) {
            return ModelHelper.getCommandsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.COSREMARKINGPOLICYTABLES_FETCHER)) {
            return toList(ModelHelper.getCOSRemarkingPolicyTablesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.DSCPREMARKINGPOLICYTABLES_FETCHER)) {
            return toList(ModelHelper.getDSCPRemarkingPolicyTablesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.DUCGROUPS_FETCHER)) {
            return toList(ModelHelper.getDUCGroupsFetcherForMeId(id));
        }
        if (type.equals(Constants.DUCGROUPS_FETCHER) && relationName.equals(Constants.DUCGROUPS)) {
            return ModelHelper.getDUCGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VCENTEREAMCONFIGS_FETCHER)) {
            return toList(ModelHelper.getVCenterEAMConfigsFetcherForMeId(id));
        }
        if (type.equals(Constants.VCENTEREAMCONFIGS_FETCHER) && relationName.equals(Constants.VCENTEREAMCONFIGS)) {
            return ModelHelper.getVCenterEAMConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressAdvFwdEntryTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getEgressQOSPoliciesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ENTERPRISES_FETCHER)) {
            return toList(ModelHelper.getEnterprisesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ENTERPRISEPROFILES_FETCHER)) {
            return toList(ModelHelper.getEnterpriseProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.ENTERPRISEPROFILES_FETCHER) && relationName.equals(Constants.ENTERPRISEPROFILES)) {
            return ModelHelper.getEnterpriseProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ESILMPOLICIES_FETCHER)) {
            return toList(ModelHelper.getEsIlmPoliciesFetcherForMeId(id));
        }
        if (type.equals(Constants.ESILMPOLICIES_FETCHER) && relationName.equals(Constants.ESILMPOLICIES)) {
            return ModelHelper.getEsIlmPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ESINDEXCONFIGS_FETCHER)) {
            return toList(ModelHelper.getEsIndexConfigsFetcherForMeId(id));
        }
        if (type.equals(Constants.ESINDEXCONFIGS_FETCHER) && relationName.equals(Constants.ESINDEXCONFIGS)) {
            return ModelHelper.getEsIndexConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ETHERNETSEGMENTGWGROUPS_FETCHER)) {
            return toList(ModelHelper.getEthernetSegmentGWGroupsFetcherForMeId(id));
        }
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUPS_FETCHER) && relationName.equals(Constants.ETHERNETSEGMENTGWGROUPS)) {
            return ModelHelper.getEthernetSegmentGWGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.FLOATINGIPS_FETCHER)) {
            return toList(ModelHelper.getFloatingIpsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.GATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getGatewayTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getInfrastructureAccessProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER) && relationName.equals(Constants.INFRASTRUCTUREACCESSPROFILES)) {
            return ModelHelper.getInfrastructureAccessProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER)) {
            return toList(ModelHelper.getInfrastructureEVDFProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER) && relationName.equals(Constants.INFRASTRUCTUREEVDFPROFILES)) {
            return ModelHelper.getInfrastructureEVDFProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER)) {
            return toList(ModelHelper.getInfrastructureGatewayProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER) && relationName.equals(Constants.INFRASTRUCTUREGATEWAYPROFILES)) {
            return ModelHelper.getInfrastructureGatewayProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER)) {
            return toList(ModelHelper.getInfrastructureVscProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER) && relationName.equals(Constants.INFRASTRUCTUREVSCPROFILES)) {
            return ModelHelper.getInfrastructureVscProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdEntryTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INGRESSQOSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getIngressQOSPoliciesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.KEYSERVERMEMBERS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMembersFetcherForMeId(id));
        }
        if (type.equals(Constants.KEYSERVERMEMBERS_FETCHER) && relationName.equals(Constants.KEYSERVERMEMBERS)) {
            return ModelHelper.getKeyServerMembersForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.L4SERVICES_FETCHER)) {
            return toList(ModelHelper.getL4ServicesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER)) {
            return toList(ModelHelper.getL7applicationsignaturesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.LICENSES_FETCHER)) {
            return toList(ModelHelper.getLicensesFetcherForMeId(id));
        }
        if (type.equals(Constants.LICENSES_FETCHER) && relationName.equals(Constants.LICENSES)) {
            return ModelHelper.getLicensesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.LICENSESTATUS_FETCHER)) {
            return toList(ModelHelper.getLicenseStatusFetcherForMeId(id));
        }
        if (type.equals(Constants.LICENSESTATUS_FETCHER) && relationName.equals(Constants.LICENSESTATUS)) {
            return ModelHelper.getLicenseStatusForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.MIRRORDESTINATIONS_FETCHER)) {
            return toList(ModelHelper.getMirrorDestinationsFetcherForMeId(id));
        }
        if (type.equals(Constants.MIRRORDESTINATIONS_FETCHER) && relationName.equals(Constants.MIRRORDESTINATIONS)) {
            return ModelHelper.getMirrorDestinationsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NETCONFPROFILES_FETCHER)) {
            return toList(ModelHelper.getNetconfProfilesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NETWORKLAYOUTS_FETCHER)) {
            return toList(ModelHelper.getNetworkLayoutsFetcherForMeId(id));
        }
        if (type.equals(Constants.NETWORKLAYOUTS_FETCHER) && relationName.equals(Constants.NETWORKLAYOUTS)) {
            return ModelHelper.getNetworkLayoutsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceMeasurementsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSGatewayTemplatesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGGROUPS_FETCHER)) {
            return toList(ModelHelper.getNSGGroupsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGINFOS_FETCHER)) {
            return toList(ModelHelper.getNSGInfosFetcherForMeId(id));
        }
        if (type.equals(Constants.NSGINFOS_FETCHER) && relationName.equals(Constants.NSGINFOS)) {
            return ModelHelper.getNSGInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGMIGRATIONPROFILES_FETCHER)) {
            return toList(ModelHelper.getNSGMigrationProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.NSGMIGRATIONPROFILES_FETCHER) && relationName.equals(Constants.NSGMIGRATIONPROFILES)) {
            return ModelHelper.getNSGMigrationProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGPATCHPROFILES_FETCHER)) {
            return toList(ModelHelper.getNSGPatchProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.NSGPATCHPROFILES_FETCHER) && relationName.equals(Constants.NSGPATCHPROFILES)) {
            return ModelHelper.getNSGPatchProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER)) {
            return toList(ModelHelper.getNSRedundantGatewayGroupsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGUPGRADEPROFILES_FETCHER)) {
            return toList(ModelHelper.getNSGUpgradeProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.NSGUPGRADEPROFILES_FETCHER) && relationName.equals(Constants.NSGUPGRADEPROFILES)) {
            return ModelHelper.getNSGUpgradeProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER)) {
            return toList(ModelHelper.getOverlayMirrorDestinationsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.PATMAPPERS_FETCHER)) {
            return toList(ModelHelper.getPATMappersFetcherForMeId(id));
        }
        if (type.equals(Constants.PATMAPPERS_FETCHER) && relationName.equals(Constants.PATMAPPERS)) {
            return ModelHelper.getPATMappersForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            return toList(ModelHelper.getPerformanceMonitorsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.POLICYOBJECTGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyObjectGroupsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.QOSPOLICERS_FETCHER)) {
            return toList(ModelHelper.getQosPolicersFetcherForMeId(id));
        }
        if (type.equals(Constants.QOSPOLICERS_FETCHER) && relationName.equals(Constants.QOSPOLICERS)) {
            return ModelHelper.getQosPolicersForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.RATELIMITERS_FETCHER)) {
            return toList(ModelHelper.getRateLimitersFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.REDUNDANCYGROUPS_FETCHER)) {
            return toList(ModelHelper.getRedundancyGroupsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.REMOTEVRSINFOS_FETCHER)) {
            return toList(ModelHelper.getRemoteVrsInfosFetcherForMeId(id));
        }
        if (type.equals(Constants.REMOTEVRSINFOS_FETCHER) && relationName.equals(Constants.REMOTEVRSINFOS)) {
            return ModelHelper.getRemoteVrsInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ROLES_FETCHER)) {
            return toList(ModelHelper.getRolesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.SAASAPPLICATIONTYPES_FETCHER)) {
            return toList(ModelHelper.getSaaSApplicationTypesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return toList(ModelHelper.getSharedNetworkResourcesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.SITEINFOS_FETCHER)) {
            return toList(ModelHelper.getSiteInfosFetcherForMeId(id));
        }
        if (type.equals(Constants.SITEINFOS_FETCHER) && relationName.equals(Constants.SITEINFOS)) {
            return ModelHelper.getSiteInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.STATSCOLLECTORINFOS_FETCHER)) {
            return toList(ModelHelper.getStatsCollectorInfosFetcherForMeId(id));
        }
        if (type.equals(Constants.STATSCOLLECTORINFOS_FETCHER) && relationName.equals(Constants.STATSCOLLECTORINFOS)) {
            return ModelHelper.getStatsCollectorInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.SYSTEMCONFIGS_FETCHER)) {
            return toList(ModelHelper.getSystemConfigsFetcherForMeId(id));
        }
        if (type.equals(Constants.SYSTEMCONFIGS_FETCHER) && relationName.equals(Constants.SYSTEMCONFIGS)) {
            return ModelHelper.getSystemConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.TESTDEFINITIONS_FETCHER)) {
            return toList(ModelHelper.getTestDefinitionsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.UNDERLAYS_FETCHER)) {
            return toList(ModelHelper.getUnderlaysFetcherForMeId(id));
        }
        if (type.equals(Constants.UNDERLAYS_FETCHER) && relationName.equals(Constants.UNDERLAYS)) {
            return ModelHelper.getUnderlaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.USERS_FETCHER)) {
            return toList(ModelHelper.getUsersFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.USERCONTEXTS_FETCHER)) {
            return toList(ModelHelper.getUserContextsFetcherForMeId(id));
        }
        if (type.equals(Constants.USERCONTEXTS_FETCHER) && relationName.equals(Constants.USERCONTEXTS)) {
            return ModelHelper.getUserContextsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VCENTERS_FETCHER)) {
            return toList(ModelHelper.getVCentersFetcherForMeId(id));
        }
        if (type.equals(Constants.VCENTERS_FETCHER) && relationName.equals(Constants.VCENTERS)) {
            return ModelHelper.getVCentersForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            return toList(ModelHelper.getVCenterHypervisorsFetcherForMeId(id));
        }
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER) && relationName.equals(Constants.VCENTERHYPERVISORS)) {
            return ModelHelper.getVCenterHypervisorsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallPoliciesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallRulesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VNFCATALOGS_FETCHER)) {
            return toList(ModelHelper.getVNFCatalogsFetcherForMeId(id));
        }
        if (type.equals(Constants.VNFCATALOGS_FETCHER) && relationName.equals(Constants.VNFCATALOGS)) {
            return ModelHelper.getVNFCatalogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VNFMETADATAS_FETCHER)) {
            return toList(ModelHelper.getVNFMetadatasFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VNFTHRESHOLDPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVNFThresholdPoliciesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VCENTERVRSCONFIGS_FETCHER)) {
            return toList(ModelHelper.getVCenterVRSConfigsFetcherForMeId(id));
        }
        if (type.equals(Constants.VCENTERVRSCONFIGS_FETCHER) && relationName.equals(Constants.VCENTERVRSCONFIGS)) {
            return ModelHelper.getVCenterVRSConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VRSINFOS_FETCHER)) {
            return toList(ModelHelper.getvrsInfosFetcherForMeId(id));
        }
        if (type.equals(Constants.VRSINFOS_FETCHER) && relationName.equals(Constants.VRSINFOS)) {
            return ModelHelper.getvrsInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VSDCONFIGS_FETCHER)) {
            return toList(ModelHelper.getVSDConfigsFetcherForMeId(id));
        }
        if (type.equals(Constants.VSDCONFIGS_FETCHER) && relationName.equals(Constants.VSDCONFIGS)) {
            return ModelHelper.getVSDConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VSPS_FETCHER)) {
            return toList(ModelHelper.getVSPsFetcherForMeId(id));
        }
        if (type.equals(Constants.VSPS_FETCHER) && relationName.equals(Constants.VSPS)) {
            return ModelHelper.getVSPsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ZFBAUTOASSIGNMENTS_FETCHER)) {
            return toList(ModelHelper.getZFBAutoAssignmentsFetcherForMeId(id));
        }
        if (type.equals(Constants.ZFBAUTOASSIGNMENTS_FETCHER) && relationName.equals(Constants.ZFBAUTOASSIGNMENTS)) {
            return ModelHelper.getZFBAutoAssignmentsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ZFBREQUESTS_FETCHER)) {
            return toList(ModelHelper.getZFBRequestsFetcherForMeId(id));
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ZONES_FETCHER)) {
            return toList(ModelHelper.getZonesFetcherForMeId(id));
        }
        
        if (type.equals(Constants.METADATA) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMetadataId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdEntryTemplatesFetcherForMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.VPORTMIRRORS_FETCHER)) {
            return toList(ModelHelper.getVPortMirrorsFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.VPORTMIRRORS_FETCHER) && relationName.equals(Constants.VPORTMIRRORS)) {
            return ModelHelper.getVPortMirrorsForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMirrorDestinationGroupId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMirrorDestinationGroupId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP) && relationName.equals(Constants.MIRRORDESTINATIONS_FETCHER)) {
            return toList(ModelHelper.getMirrorDestinationsFetcherForMirrorDestinationGroupId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP) && relationName.equals(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER)) {
            return toList(ModelHelper.getOverlayMirrorDestinationsFetcherForMirrorDestinationGroupId(id));
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMirrorDestinationGroupId(id));
        }
        
        if (type.equals(Constants.MONITORINGPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMonitoringPortId(id));
        }
        
        if (type.equals(Constants.MONITORINGPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMonitoringPortId(id));
        }
        
        if (type.equals(Constants.MONITORINGPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMonitoringPortId(id));
        }
        
        if (type.equals(Constants.MONITORSCOPE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMonitorscopeId(id));
        }
        
        if (type.equals(Constants.MONITORSCOPE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMonitorscopeId(id));
        }
        
        if (type.equals(Constants.MONITORSCOPE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMonitorscopeId(id));
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMultiCastChannelMapId(id));
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiCastChannelMapId(id));
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiCastChannelMapId(id));
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.MULTICASTRANGES_FETCHER)) {
            return toList(ModelHelper.getMultiCastRangesFetcherForMultiCastChannelMapId(id));
        }
        if (type.equals(Constants.MULTICASTRANGES_FETCHER) && relationName.equals(Constants.MULTICASTRANGES)) {
            return ModelHelper.getMultiCastRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMultiCastChannelMapId(id));
        }
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiCastListId(id));
        }
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiCastListId(id));
        }
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForMultiCastListId(id));
        }
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMultiCastListId(id));
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMultiCastRangeId(id));
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiCastRangeId(id));
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiCastRangeId(id));
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMultiCastRangeId(id));
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiNICVPortId(id));
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiNICVPortId(id));
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForMultiNICVPortId(id));
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForMultiNICVPortId(id));
        }
        
        if (type.equals(Constants.NATMAPENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNATMapEntryId(id));
        }
        
        if (type.equals(Constants.NATMAPENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNATMapEntryId(id));
        }
        
        if (type.equals(Constants.NATMAPENTRY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNATMapEntryId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.BOOTSTRAPS_FETCHER)) {
            return toList(ModelHelper.getBootstrapsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER)) {
            return toList(ModelHelper.getBootstrapActivationsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.EGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getEgressProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            return toList(ModelHelper.getGatewaySecuritiesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER)) {
            return toList(ModelHelper.getInfrastructureConfigsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.INGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getIngressProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPFilterProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPv6FilterProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.LOCATIONS_FETCHER)) {
            return toList(ModelHelper.getLocationsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.MACFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getMACFilterProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.PORTS_FETCHER)) {
            return toList(ModelHelper.getPortsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPEgressQoSProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPIngressQoSProfilesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.WANSERVICES_FETCHER)) {
            return toList(ModelHelper.getWANServicesFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForNetconfGatewayId(id));
        }
        
        if (type.equals(Constants.NETCONFMANAGER) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNetconfManagerId(id));
        }
        
        if (type.equals(Constants.NETCONFMANAGER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetconfManagerId(id));
        }
        
        if (type.equals(Constants.NETCONFMANAGER) && relationName.equals(Constants.GNMISESSIONS_FETCHER)) {
            return toList(ModelHelper.getGNMISessionsFetcherForNetconfManagerId(id));
        }
        if (type.equals(Constants.GNMISESSIONS_FETCHER) && relationName.equals(Constants.GNMISESSIONS)) {
            return ModelHelper.getGNMISessionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NETCONFMANAGER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetconfManagerId(id));
        }
        
        if (type.equals(Constants.NETCONFMANAGER) && relationName.equals(Constants.NETCONFSESSIONS_FETCHER)) {
            return toList(ModelHelper.getNetconfSessionsFetcherForNetconfManagerId(id));
        }
        if (type.equals(Constants.NETCONFSESSIONS_FETCHER) && relationName.equals(Constants.NETCONFSESSIONS)) {
            return ModelHelper.getNetconfSessionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NETCONFMANAGER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetconfManagerId(id));
        }
        
        if (type.equals(Constants.NETCONFPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetconfProfileId(id));
        }
        
        if (type.equals(Constants.NETCONFPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetconfProfileId(id));
        }
        
        if (type.equals(Constants.NETCONFPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetconfProfileId(id));
        }
        
        if (type.equals(Constants.NETCONFSESSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetconfSessionId(id));
        }
        
        if (type.equals(Constants.NETCONFSESSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetconfSessionId(id));
        }
        
        if (type.equals(Constants.NETCONFSESSION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetconfSessionId(id));
        }
        
        if (type.equals(Constants.NETWORKLAYOUT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetworkLayoutId(id));
        }
        
        if (type.equals(Constants.NETWORKLAYOUT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetworkLayoutId(id));
        }
        
        if (type.equals(Constants.NETWORKLAYOUT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetworkLayoutId(id));
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.ENTERPRISENETWORKS_FETCHER)) {
            return toList(ModelHelper.getEnterpriseNetworksFetcherForNetworkMacroGroupId(id));
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetworkMacroGroupId(id));
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetworkMacroGroupId(id));
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetworkMacroGroupId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetworkPerformanceBindingId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetworkPerformanceBindingId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetworkPerformanceBindingId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetworkPerformanceMeasurementId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetworkPerformanceMeasurementId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.MONITORSCOPES_FETCHER)) {
            return toList(ModelHelper.getMonitorscopesFetcherForNetworkPerformanceMeasurementId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceBindingsFetcherForNetworkPerformanceMeasurementId(id));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNetworkPerformanceMeasurementId(id));
        }
        
        if (type.equals(Constants.NEXTHOP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNextHopId(id));
        }
        
        if (type.equals(Constants.NEXTHOP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNextHopId(id));
        }
        
        if (type.equals(Constants.NEXTHOP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNextHopId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.BOOTSTRAPS_FETCHER)) {
            return toList(ModelHelper.getBootstrapsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER)) {
            return toList(ModelHelper.getBootstrapActivationsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.COMMANDS_FETCHER)) {
            return toList(ModelHelper.getCommandsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            return toList(ModelHelper.getGatewaySecuritiesFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER)) {
            return toList(ModelHelper.getInfrastructureConfigsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.LOCATIONS_FETCHER)) {
            return toList(ModelHelper.getLocationsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSGATEWAYMONITORS_FETCHER)) {
            return toList(ModelHelper.getNSGatewayMonitorsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.NSGATEWAYMONITORS_FETCHER) && relationName.equals(Constants.NSGATEWAYMONITORS)) {
            return ModelHelper.getNSGatewayMonitorsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            return toList(ModelHelper.getNSGatewaySummariesFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSGINFOS_FETCHER)) {
            return toList(ModelHelper.getNSGInfosFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSPORTS_FETCHER)) {
            return toList(ModelHelper.getNSPortsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.PATCHS_FETCHER)) {
            return toList(ModelHelper.getPatchsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.PATCHS_FETCHER) && relationName.equals(Constants.PATCHS)) {
            return ModelHelper.getPatchsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSPORTINFOS_FETCHER)) {
            return toList(ModelHelper.getNSPortInfosFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.NSPORTINFOS_FETCHER) && relationName.equals(Constants.NSPORTINFOS)) {
            return ModelHelper.getNSPortInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.SUPPLEMENTALINFRACONFIGS_FETCHER)) {
            return toList(ModelHelper.getSupplementalInfraConfigsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.SUPPLEMENTALINFRACONFIGS_FETCHER) && relationName.equals(Constants.SUPPLEMENTALINFRACONFIGS)) {
            return ModelHelper.getSupplementalInfraConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.THREATPREVENTIONINFOS_FETCHER)) {
            return toList(ModelHelper.getThreatPreventionInfosFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.THREATPREVENTIONINFOS_FETCHER) && relationName.equals(Constants.THREATPREVENTIONINFOS)) {
            return ModelHelper.getThreatPreventionInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.UNDERLAYTESTS_FETCHER)) {
            return toList(ModelHelper.getUnderlayTestsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.UNDERLAYTESTS_FETCHER) && relationName.equals(Constants.UNDERLAYTESTS)) {
            return ModelHelper.getUnderlayTestsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getUplinkConnectionsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER) && relationName.equals(Constants.UPLINKCONNECTIONS)) {
            return ModelHelper.getUplinkConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.VIRTUALUPLINKS_FETCHER)) {
            return toList(ModelHelper.getVirtualUplinksFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.VIRTUALUPLINKS_FETCHER) && relationName.equals(Constants.VIRTUALUPLINKS)) {
            return ModelHelper.getVirtualUplinksForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.VNFS_FETCHER)) {
            return toList(ModelHelper.getVNFsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.WIRELESSPORTS_FETCHER)) {
            return toList(ModelHelper.getWirelessPortsFetcherForNSGatewayId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYSCOUNT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGatewaysCountId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYSCOUNT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGatewaysCountId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYSCOUNT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGatewaysCountId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGatewaySummaryId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGatewaySummaryId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGatewaySummaryId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGatewayTemplateId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGatewayTemplateId(id));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.NSPORTTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSPortTemplatesFetcherForNSGatewayTemplateId(id));
        }
        if (type.equals(Constants.NSPORTTEMPLATES_FETCHER) && relationName.equals(Constants.NSPORTTEMPLATES)) {
            return ModelHelper.getNSPortTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGatewayTemplateId(id));
        }
        
        if (type.equals(Constants.NSGGROUP) && relationName.equals(Constants.DUCGROUPBINDINGS_FETCHER)) {
            return toList(ModelHelper.getDUCGroupBindingsFetcherForNSGGroupId(id));
        }
        if (type.equals(Constants.DUCGROUPBINDINGS_FETCHER) && relationName.equals(Constants.DUCGROUPBINDINGS)) {
            return ModelHelper.getDUCGroupBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGGroupId(id));
        }
        
        if (type.equals(Constants.NSGGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGGroupId(id));
        }
        
        if (type.equals(Constants.NSGGROUP) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForNSGGroupId(id));
        }
        
        if (type.equals(Constants.NSGGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGGroupId(id));
        }
        
        if (type.equals(Constants.NSGMIGRATIONPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGMigrationProfileId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.REDUNDANTPORTS_FETCHER)) {
            return toList(ModelHelper.getRedundantPortsFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.REDUNDANTPORTS_FETCHER) && relationName.equals(Constants.REDUNDANTPORTS)) {
            return ModelHelper.getRedundantPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSRedundantGatewayGroupId(id));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.SHUNTLINKS_FETCHER)) {
            return toList(ModelHelper.getShuntLinksFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.SHUNTLINKS_FETCHER) && relationName.equals(Constants.SHUNTLINKS)) {
            return ModelHelper.getShuntLinksForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGRoutingPolicyBindingId(id));
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGRoutingPolicyBindingId(id));
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGRoutingPolicyBindingId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.LTEINFORMATIONS_FETCHER)) {
            return toList(ModelHelper.getLTEInformationsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.LTEINFORMATIONS_FETCHER) && relationName.equals(Constants.LTEINFORMATIONS)) {
            return ModelHelper.getLTEInformationsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForNSPortId(id));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSPortTemplateId(id));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSPortTemplateId(id));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSPortTemplateId(id));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.VLANTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getVLANTemplatesFetcherForNSPortTemplateId(id));
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER) && relationName.equals(Constants.VLANTEMPLATES)) {
            return ModelHelper.getVLANTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForRedundantPortId(id));
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedundantPortId(id));
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedundantPortId(id));
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.NSPORTS_FETCHER)) {
            return toList(ModelHelper.getNSPortsFetcherForRedundantPortId(id));
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRedundantPortId(id));
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForRedundantPortId(id));
        }
        
        if (type.equals(Constants.OSPFAREA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOSPFAreaId(id));
        }
        
        if (type.equals(Constants.OSPFAREA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOSPFAreaId(id));
        }
        
        if (type.equals(Constants.OSPFAREA) && relationName.equals(Constants.OSPFINTERFACES_FETCHER)) {
            return toList(ModelHelper.getOSPFInterfacesFetcherForOSPFAreaId(id));
        }
        if (type.equals(Constants.OSPFINTERFACES_FETCHER) && relationName.equals(Constants.OSPFINTERFACES)) {
            return ModelHelper.getOSPFInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.OSPFAREA) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOSPFAreaId(id));
        }
        
        if (type.equals(Constants.OSPFINSTANCE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOSPFInstanceId(id));
        }
        
        if (type.equals(Constants.OSPFINSTANCE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOSPFInstanceId(id));
        }
        
        if (type.equals(Constants.OSPFINSTANCE) && relationName.equals(Constants.OSPFAREAS_FETCHER)) {
            return toList(ModelHelper.getOSPFAreasFetcherForOSPFInstanceId(id));
        }
        if (type.equals(Constants.OSPFAREAS_FETCHER) && relationName.equals(Constants.OSPFAREAS)) {
            return ModelHelper.getOSPFAreasForFetcherId(id);
        }
        
        if (type.equals(Constants.OSPFINSTANCE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOSPFInstanceId(id));
        }
        
        if (type.equals(Constants.OSPFINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOSPFInterfaceId(id));
        }
        
        if (type.equals(Constants.OSPFINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOSPFInterfaceId(id));
        }
        
        if (type.equals(Constants.OSPFINTERFACE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOSPFInterfaceId(id));
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOverlayAddressPoolId(id));
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOverlayAddressPoolId(id));
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL) && relationName.equals(Constants.OVERLAYPATNATENTRIES_FETCHER)) {
            return toList(ModelHelper.getOverlayPATNATEntriesFetcherForOverlayAddressPoolId(id));
        }
        if (type.equals(Constants.OVERLAYPATNATENTRIES_FETCHER) && relationName.equals(Constants.OVERLAYPATNATENTRIES)) {
            return ModelHelper.getOverlayPATNATEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOverlayAddressPoolId(id));
        }
        
        if (type.equals(Constants.OVERLAYMANAGEMENTPROFILE) && relationName.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILES_FETCHER)) {
            return toList(ModelHelper.getOverlayManagementSubnetProfilesFetcherForOverlayManagementProfileId(id));
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILES_FETCHER) && relationName.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILES)) {
            return ModelHelper.getOverlayManagementSubnetProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOverlayMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOverlayMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOverlayMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForOverlayMirrorDestinationId(id));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOverlayMirrorDestinationTemplateId(id));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOverlayMirrorDestinationTemplateId(id));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOverlayMirrorDestinationTemplateId(id));
        }
        
        if (type.equals(Constants.OVERLAYPATNATENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForOverlayPATNATEntryId(id));
        }
        
        if (type.equals(Constants.OVERLAYPATNATENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForOverlayPATNATEntryId(id));
        }
        
        if (type.equals(Constants.OVERLAYPATNATENTRY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForOverlayPATNATEntryId(id));
        }
        
        if (type.equals(Constants.PATCH) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPatchId(id));
        }
        
        if (type.equals(Constants.PATCH) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPatchId(id));
        }
        
        if (type.equals(Constants.PATCH) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPatchId(id));
        }
        
        if (type.equals(Constants.PATMAPPER) && relationName.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return toList(ModelHelper.getSharedNetworkResourcesFetcherForPATMapperId(id));
        }
        
        if (type.equals(Constants.PATMAPPER) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForPATMapperId(id));
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.ADDRESSMAPS_FETCHER)) {
            return toList(ModelHelper.getAddressMapsFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.ADDRESSMAPS_FETCHER) && relationName.equals(Constants.ADDRESSMAPS)) {
            return ModelHelper.getAddressMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.BULKSTATISTICS_FETCHER)) {
            return toList(ModelHelper.getBulkStatisticsFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.BULKSTATISTICS_FETCHER) && relationName.equals(Constants.BULKSTATISTICS)) {
            return ModelHelper.getBulkStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForPATNATPoolId(id));
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPATNATPoolId(id));
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPATNATPoolId(id));
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.NATMAPENTRIES_FETCHER)) {
            return toList(ModelHelper.getNATMapEntriesFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.NATMAPENTRIES_FETCHER) && relationName.equals(Constants.NATMAPENTRIES)) {
            return ModelHelper.getNATMapEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPATNATPoolId(id));
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForPATNATPoolId(id));
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForPATNATPoolId(id));
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementsFetcherForPerformanceMonitorId(id));
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR) && relationName.equals(Constants.TIERS_FETCHER)) {
            return toList(ModelHelper.getTiersFetcherForPerformanceMonitorId(id));
        }
        if (type.equals(Constants.TIERS_FETCHER) && relationName.equals(Constants.TIERS)) {
            return ModelHelper.getTiersForFetcherId(id);
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPermissionId(id));
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPermissionId(id));
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPermissionId(id));
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPermissionId(id));
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyDecisionId(id));
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyDecisionId(id));
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyDecisionId(id));
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForPolicyDecisionId(id));
        }
        
        if (type.equals(Constants.POLICYENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyEntryId(id));
        }
        
        if (type.equals(Constants.POLICYENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyEntryId(id));
        }
        
        if (type.equals(Constants.POLICYENTRY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyEntryId(id));
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPolicyGroupId(id));
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyGroupId(id));
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyGroupId(id));
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyGroupId(id));
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.POLICYGROUPCATEGORIES_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupCategoriesFetcherForPolicyGroupId(id));
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForPolicyGroupId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPCATEGORY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyGroupCategoryId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPCATEGORY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyGroupCategoryId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPCATEGORY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyGroupCategoryId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPCATEGORY) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForPolicyGroupCategoryId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPolicyGroupTemplateId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyGroupTemplateId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyGroupTemplateId(id));
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyGroupTemplateId(id));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForPolicyObjectGroupId(id));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyObjectGroupId(id));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyObjectGroupId(id));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForPolicyObjectGroupId(id));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyObjectGroupId(id));
        }
        
        if (type.equals(Constants.POLICYSTATEMENT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyStatementId(id));
        }
        
        if (type.equals(Constants.POLICYSTATEMENT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyStatementId(id));
        }
        
        if (type.equals(Constants.POLICYSTATEMENT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPolicyStatementId(id));
        }
        
        if (type.equals(Constants.POLICYSTATEMENT) && relationName.equals(Constants.POLICYENTRIES_FETCHER)) {
            return toList(ModelHelper.getPolicyEntriesFetcherForPolicyStatementId(id));
        }
        if (type.equals(Constants.POLICYENTRIES_FETCHER) && relationName.equals(Constants.POLICYENTRIES)) {
            return ModelHelper.getPolicyEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForPortId(id));
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPortTemplateId(id));
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPortTemplateId(id));
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPortTemplateId(id));
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.VLANTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getVLANTemplatesFetcherForPortTemplateId(id));
        }
        
        if (type.equals(Constants.PSNATPOOL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPSNATPoolId(id));
        }
        
        if (type.equals(Constants.PSNATPOOL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPSNATPoolId(id));
        }
        
        if (type.equals(Constants.PSNATPOOL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPSNATPoolId(id));
        }
        
        if (type.equals(Constants.PSNATPOOL) && relationName.equals(Constants.PSPATMAPS_FETCHER)) {
            return toList(ModelHelper.getPSPATMapsFetcherForPSNATPoolId(id));
        }
        if (type.equals(Constants.PSPATMAPS_FETCHER) && relationName.equals(Constants.PSPATMAPS)) {
            return ModelHelper.getPSPATMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.PSNATPOOL) && relationName.equals(Constants.PTRANSLATIONMAPS_FETCHER)) {
            return toList(ModelHelper.getPTranslationMapsFetcherForPSNATPoolId(id));
        }
        if (type.equals(Constants.PTRANSLATIONMAPS_FETCHER) && relationName.equals(Constants.PTRANSLATIONMAPS)) {
            return ModelHelper.getPTranslationMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.PSPATMAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPSPATMapId(id));
        }
        
        if (type.equals(Constants.PSPATMAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPSPATMapId(id));
        }
        
        if (type.equals(Constants.PSPATMAP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPSPATMapId(id));
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPTranslationMapId(id));
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPTranslationMapId(id));
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPTranslationMapId(id));
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPublicNetworkMacroId(id));
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPublicNetworkMacroId(id));
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPublicNetworkMacroId(id));
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPublicNetworkMacroId(id));
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForQOSId(id));
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForQOSId(id));
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForQOSId(id));
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForQOSId(id));
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForQOSId(id));
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForQOSId(id));
        }
        
        if (type.equals(Constants.QOSPOLICER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForQosPolicerId(id));
        }
        
        if (type.equals(Constants.QOSPOLICER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForQosPolicerId(id));
        }
        
        if (type.equals(Constants.QOSPOLICER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForQosPolicerId(id));
        }
        
        if (type.equals(Constants.RATELIMITER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRateLimiterId(id));
        }
        
        if (type.equals(Constants.RATELIMITER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRateLimiterId(id));
        }
        
        if (type.equals(Constants.RATELIMITER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRateLimiterId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForRedirectionTargetId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedirectionTargetId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedirectionTargetId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRedirectionTargetId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.VIRTUALIPS_FETCHER)) {
            return toList(ModelHelper.getVirtualIPsFetcherForRedirectionTargetId(id));
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER) && relationName.equals(Constants.VIRTUALIPS)) {
            return ModelHelper.getVirtualIPsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForRedirectionTargetId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForRedirectionTargetTemplateId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedirectionTargetTemplateId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedirectionTargetTemplateId(id));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRedirectionTargetTemplateId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.EGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getEgressProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.GATEWAYREDUNDANTPORTS_FETCHER)) {
            return toList(ModelHelper.getGatewayRedundantPortsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.GATEWAYREDUNDANTPORTS_FETCHER) && relationName.equals(Constants.GATEWAYREDUNDANTPORTS)) {
            return ModelHelper.getGatewayRedundantPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.INGRESSPROFILES_FETCHER)) {
            return toList(ModelHelper.getIngressProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPFilterProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getIPv6FilterProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.MACFILTERPROFILES_FETCHER)) {
            return toList(ModelHelper.getMACFilterProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.PORTS_FETCHER)) {
            return toList(ModelHelper.getPortsFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPEgressQoSProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            return toList(ModelHelper.getSAPIngressQoSProfilesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.WANSERVICES_FETCHER)) {
            return toList(ModelHelper.getWANServicesFetcherForRedundancyGroupId(id));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.VSGREDUNDANTPORTS_FETCHER)) {
            return toList(ModelHelper.getVsgRedundantPortsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.VSGREDUNDANTPORTS_FETCHER) && relationName.equals(Constants.VSGREDUNDANTPORTS)) {
            return ModelHelper.getVsgRedundantPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.REMOTEVRSINFO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRemoteVrsInfoId(id));
        }
        
        if (type.equals(Constants.REMOTEVRSINFO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRemoteVrsInfoId(id));
        }
        
        if (type.equals(Constants.REMOTEVRSINFO) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRemoteVrsInfoId(id));
        }
        
        if (type.equals(Constants.VMRESYNC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMResyncId(id));
        }
        
        if (type.equals(Constants.VMRESYNC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMResyncId(id));
        }
        
        if (type.equals(Constants.VMRESYNC) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVMResyncId(id));
        }
        
        if (type.equals(Constants.ROLE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRoleId(id));
        }
        
        if (type.equals(Constants.ROLE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRoleId(id));
        }
        
        if (type.equals(Constants.ROLE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRoleId(id));
        }
        
        if (type.equals(Constants.ROLE) && relationName.equals(Constants.ROLEENTRIES_FETCHER)) {
            return toList(ModelHelper.getRoleentriesFetcherForRoleId(id));
        }
        if (type.equals(Constants.ROLEENTRIES_FETCHER) && relationName.equals(Constants.ROLEENTRIES)) {
            return ModelHelper.getRoleentriesForFetcherId(id);
        }
        
        if (type.equals(Constants.ROLEENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRoleentryId(id));
        }
        
        if (type.equals(Constants.ROLEENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRoleentryId(id));
        }
        
        if (type.equals(Constants.ROLEENTRY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRoleentryId(id));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRoutingPolicyId(id));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRoutingPolicyId(id));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRoutingPolicyId(id));
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRoutingPolicyBindingId(id));
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRoutingPolicyBindingId(id));
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRoutingPolicyBindingId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSaaSApplicationGroupId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSaaSApplicationGroupId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSaaSApplicationGroupId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONGROUP) && relationName.equals(Constants.SAASAPPLICATIONTYPES_FETCHER)) {
            return toList(ModelHelper.getSaaSApplicationTypesFetcherForSaaSApplicationGroupId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONTYPE) && relationName.equals(Constants.ENTERPRISENETWORKS_FETCHER)) {
            return toList(ModelHelper.getEnterpriseNetworksFetcherForSaaSApplicationTypeId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONTYPE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSaaSApplicationTypeId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONTYPE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSaaSApplicationTypeId(id));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONTYPE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSaaSApplicationTypeId(id));
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSAPEgressQoSProfileId(id));
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSAPEgressQoSProfileId(id));
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSAPEgressQoSProfileId(id));
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSAPIngressQoSProfileId(id));
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSAPIngressQoSProfileId(id));
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSAPIngressQoSProfileId(id));
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITE) && relationName.equals(Constants.SCHEDULEDTESTSUITERUNS_FETCHER)) {
            return toList(ModelHelper.getScheduledtestsuiterunsFetcherForScheduledTestSuiteId(id));
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITERUNS_FETCHER) && relationName.equals(Constants.SCHEDULEDTESTSUITERUNS)) {
            return ModelHelper.getScheduledtestsuiterunsForFetcherId(id);
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITE) && relationName.equals(Constants.TESTS_FETCHER)) {
            return toList(ModelHelper.getTestsFetcherForScheduledTestSuiteId(id));
        }
        if (type.equals(Constants.TESTS_FETCHER) && relationName.equals(Constants.TESTS)) {
            return ModelHelper.getTestsForFetcherId(id);
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITERUN) && relationName.equals(Constants.TESTRUNS_FETCHER)) {
            return toList(ModelHelper.getTestRunsFetcherForScheduledtestsuiterunId(id));
        }
        if (type.equals(Constants.TESTRUNS_FETCHER) && relationName.equals(Constants.TESTRUNS)) {
            return ModelHelper.getTestRunsForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForWANServiceId(id));
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForWANServiceId(id));
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForWANServiceId(id));
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForWANServiceId(id));
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForWANServiceId(id));
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForWANServiceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.PATIPENTRIES_FETCHER)) {
            return toList(ModelHelper.getPATIPEntriesFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.PATIPENTRIES_FETCHER) && relationName.equals(Constants.PATIPENTRIES)) {
            return ModelHelper.getPATIPEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForSharedNetworkResourceId(id));
        }
        
        if (type.equals(Constants.SHUNTLINK) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForShuntLinkId(id));
        }
        
        if (type.equals(Constants.SHUNTLINK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForShuntLinkId(id));
        }
        
        if (type.equals(Constants.SHUNTLINK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForShuntLinkId(id));
        }
        
        if (type.equals(Constants.SHUNTLINK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForShuntLinkId(id));
        }
        
        if (type.equals(Constants.SHUNTLINK) && relationName.equals(Constants.VIRTUALUPLINKS_FETCHER)) {
            return toList(ModelHelper.getVirtualUplinksFetcherForShuntLinkId(id));
        }
        
        if (type.equals(Constants.SITEINFO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSiteInfoId(id));
        }
        
        if (type.equals(Constants.SITEINFO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSiteInfoId(id));
        }
        
        if (type.equals(Constants.SITEINFO) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSiteInfoId(id));
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSPATSourcesPoolId(id));
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSPATSourcesPoolId(id));
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSPATSourcesPoolId(id));
        }
        
        if (type.equals(Constants.SSHKEY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSSHKeyId(id));
        }
        
        if (type.equals(Constants.SSHKEY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSSHKeyId(id));
        }
        
        if (type.equals(Constants.SSHKEY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSSHKeyId(id));
        }
        
        if (type.equals(Constants.SSIDCONNECTION) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForSSIDConnectionId(id));
        }
        
        if (type.equals(Constants.SSIDCONNECTION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForSSIDConnectionId(id));
        }
        
        if (type.equals(Constants.SSIDCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSSIDConnectionId(id));
        }
        
        if (type.equals(Constants.SSIDCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSSIDConnectionId(id));
        }
        
        if (type.equals(Constants.SSIDCONNECTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSSIDConnectionId(id));
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForStaticRouteId(id));
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForStaticRouteId(id));
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStaticRouteId(id));
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStaticRouteId(id));
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForStaticRouteId(id));
        }
        
        if (type.equals(Constants.STATISTICS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStatisticsId(id));
        }
        
        if (type.equals(Constants.STATISTICS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStatisticsId(id));
        }
        
        if (type.equals(Constants.STATISTICS) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForStatisticsId(id));
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStatsCollectorInfoId(id));
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStatsCollectorInfoId(id));
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForStatsCollectorInfoId(id));
        }
        
        if (type.equals(Constants.STATISTICSPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStatisticsPolicyId(id));
        }
        
        if (type.equals(Constants.STATISTICSPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStatisticsPolicyId(id));
        }
        
        if (type.equals(Constants.STATISTICSPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForStatisticsPolicyId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return toList(ModelHelper.getBGPNeighborsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.CONTAINERRESYNCS_FETCHER)) {
            return toList(ModelHelper.getContainerResyncsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.DEFAULTGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getDefaultGatewaysFetcherForSubnetId(id));
        }
        if (type.equals(Constants.DEFAULTGATEWAYS_FETCHER) && relationName.equals(Constants.DEFAULTGATEWAYS)) {
            return ModelHelper.getDefaultGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayConnectionsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER) && relationName.equals(Constants.IKEGATEWAYCONNECTIONS)) {
            return ModelHelper.getIKEGatewayConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.IPRESERVATIONS_FETCHER)) {
            return toList(ModelHelper.getIPReservationsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.IPRESERVATIONS_FETCHER) && relationName.equals(Constants.IPRESERVATIONS)) {
            return ModelHelper.getIPReservationsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.PATIPENTRIES_FETCHER)) {
            return toList(ModelHelper.getPATIPEntriesFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.PROXYARPFILTERS_FETCHER)) {
            return toList(ModelHelper.getProxyARPFiltersFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VMRESYNCS_FETCHER)) {
            return toList(ModelHelper.getVMResyncsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.VMRESYNCS_FETCHER) && relationName.equals(Constants.VMRESYNCS)) {
            return ModelHelper.getVMResyncsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VIRTUALIPS_FETCHER)) {
            return toList(ModelHelper.getVirtualIPsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VMIPRESERVATIONS_FETCHER)) {
            return toList(ModelHelper.getVMIPReservationsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForSubnetId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForSubnetTemplateId(id));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSystemConfigId(id));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSystemConfigId(id));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForSystemConfigId(id));
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForTCAId(id));
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForTCAId(id));
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTCAId(id));
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTCAId(id));
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTCAId(id));
        }
        
        if (type.equals(Constants.TEST) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTestId(id));
        }
        
        if (type.equals(Constants.TEST) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTestId(id));
        }
        
        if (type.equals(Constants.TEST) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTestId(id));
        }
        
        if (type.equals(Constants.TESTDEFINITION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTestDefinitionId(id));
        }
        
        if (type.equals(Constants.TESTDEFINITION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTestDefinitionId(id));
        }
        
        if (type.equals(Constants.TESTDEFINITION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTestDefinitionId(id));
        }
        
        if (type.equals(Constants.TESTRUN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTestRunId(id));
        }
        
        if (type.equals(Constants.TESTRUN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTestRunId(id));
        }
        
        if (type.equals(Constants.TESTRUN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTestRunId(id));
        }
        
        if (type.equals(Constants.TESTSUITE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTestSuiteId(id));
        }
        
        if (type.equals(Constants.TESTSUITE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTestSuiteId(id));
        }
        
        if (type.equals(Constants.TESTSUITE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTestSuiteId(id));
        }
        
        if (type.equals(Constants.TESTSUITE) && relationName.equals(Constants.TESTS_FETCHER)) {
            return toList(ModelHelper.getTestsFetcherForTestSuiteId(id));
        }
        
        if (type.equals(Constants.TESTSUITE) && relationName.equals(Constants.TESTSUITERUNS_FETCHER)) {
            return toList(ModelHelper.getTestSuiteRunsFetcherForTestSuiteId(id));
        }
        if (type.equals(Constants.TESTSUITERUNS_FETCHER) && relationName.equals(Constants.TESTSUITERUNS)) {
            return ModelHelper.getTestSuiteRunsForFetcherId(id);
        }
        
        if (type.equals(Constants.TESTSUITERUN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTestSuiteRunId(id));
        }
        
        if (type.equals(Constants.TESTSUITERUN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTestSuiteRunId(id));
        }
        
        if (type.equals(Constants.TESTSUITERUN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTestSuiteRunId(id));
        }
        
        if (type.equals(Constants.TESTSUITERUN) && relationName.equals(Constants.TESTRUNS_FETCHER)) {
            return toList(ModelHelper.getTestRunsFetcherForTestSuiteRunId(id));
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.DESTINATIONURLS_FETCHER)) {
            return toList(ModelHelper.getDestinationurlsFetcherForTierId(id));
        }
        if (type.equals(Constants.DESTINATIONURLS_FETCHER) && relationName.equals(Constants.DESTINATIONURLS)) {
            return ModelHelper.getDestinationurlsForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTierId(id));
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTierId(id));
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTierId(id));
        }
        
        if (type.equals(Constants.TRUNK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTrunkId(id));
        }
        
        if (type.equals(Constants.TRUNK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTrunkId(id));
        }
        
        if (type.equals(Constants.TRUNK) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForTrunkId(id));
        }
        
        if (type.equals(Constants.TRUNK) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForTrunkId(id));
        }
        
        if (type.equals(Constants.UNDERLAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUnderlayId(id));
        }
        
        if (type.equals(Constants.UNDERLAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUnderlayId(id));
        }
        
        if (type.equals(Constants.UNDERLAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForUnderlayId(id));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION) && relationName.equals(Constants.BFDSESSIONS_FETCHER)) {
            return toList(ModelHelper.getBFDSessionsFetcherForUplinkConnectionId(id));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION) && relationName.equals(Constants.CUSTOMPROPERTIES_FETCHER)) {
            return toList(ModelHelper.getCustomPropertiesFetcherForUplinkConnectionId(id));
        }
        if (type.equals(Constants.CUSTOMPROPERTIES_FETCHER) && relationName.equals(Constants.CUSTOMPROPERTIES)) {
            return ModelHelper.getCustomPropertiesForFetcherId(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUplinkConnectionId(id));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUplinkConnectionId(id));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForUplinkConnectionId(id));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION) && relationName.equals(Constants.UNDERLAYTESTS_FETCHER)) {
            return toList(ModelHelper.getUnderlayTestsFetcherForUplinkConnectionId(id));
        }
        
        if (type.equals(Constants.UPLINKRD) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUplinkRDId(id));
        }
        
        if (type.equals(Constants.UPLINKRD) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUplinkRDId(id));
        }
        
        if (type.equals(Constants.UPLINKRD) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForUplinkRDId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.AVATARS_FETCHER)) {
            return toList(ModelHelper.getAvatarsFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForUserId(id));
        }
        
        if (type.equals(Constants.USERCONTEXT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUserContextId(id));
        }
        
        if (type.equals(Constants.USERCONTEXT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUserContextId(id));
        }
        
        if (type.equals(Constants.USERCONTEXT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForUserContextId(id));
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.AUTODISCOVEREDDATACENTERS_FETCHER)) {
            return toList(ModelHelper.getAutodiscovereddatacentersFetcherForVCenterId(id));
        }
        if (type.equals(Constants.AUTODISCOVEREDDATACENTERS_FETCHER) && relationName.equals(Constants.AUTODISCOVEREDDATACENTERS)) {
            return ModelHelper.getAutodiscovereddatacentersForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterId(id));
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVCenterId(id));
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterId(id));
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVCenterId(id));
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.VCENTERDATACENTERS_FETCHER)) {
            return toList(ModelHelper.getVCenterDataCentersFetcherForVCenterId(id));
        }
        if (type.equals(Constants.VCENTERDATACENTERS_FETCHER) && relationName.equals(Constants.VCENTERDATACENTERS)) {
            return ModelHelper.getVCenterDataCentersForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterId(id));
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER) && relationName.equals(Constants.VRSADDRESSRANGES)) {
            return ModelHelper.getVRSAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterId(id));
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES)) {
            return ModelHelper.getVRSRedeploymentpoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER)) {
            return toList(ModelHelper.getAutoDiscoverHypervisorFromClustersFetcherForVCenterClusterId(id));
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER) && relationName.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS)) {
            return ModelHelper.getAutoDiscoverHypervisorFromClustersForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            return toList(ModelHelper.getVCenterHypervisorsFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterClusterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.AUTODISCOVERCLUSTERS_FETCHER)) {
            return toList(ModelHelper.getAutoDiscoverClustersFetcherForVCenterDataCenterId(id));
        }
        if (type.equals(Constants.AUTODISCOVERCLUSTERS_FETCHER) && relationName.equals(Constants.AUTODISCOVERCLUSTERS)) {
            return ModelHelper.getAutoDiscoverClustersForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER)) {
            return toList(ModelHelper.getAutoDiscoverHypervisorFromClustersFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.VCENTERCLUSTERS_FETCHER)) {
            return toList(ModelHelper.getVCenterClustersFetcherForVCenterDataCenterId(id));
        }
        if (type.equals(Constants.VCENTERCLUSTERS_FETCHER) && relationName.equals(Constants.VCENTERCLUSTERS)) {
            return ModelHelper.getVCenterClustersForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            return toList(ModelHelper.getVCenterHypervisorsFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterDataCenterId(id));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterHypervisorId(id));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVCenterHypervisorId(id));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterHypervisorId(id));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVCenterHypervisorId(id));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterHypervisorId(id));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.VRSMETRICS_FETCHER)) {
            return toList(ModelHelper.getVRSMetricsFetcherForVCenterHypervisorId(id));
        }
        if (type.equals(Constants.VRSMETRICS_FETCHER) && relationName.equals(Constants.VRSMETRICS)) {
            return ModelHelper.getVRSMetricsForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterHypervisorId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVirtualFirewallPolicyId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVirtualFirewallPolicyId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVirtualFirewallPolicyId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY) && relationName.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            return toList(ModelHelper.getVirtualFirewallRulesFetcherForVirtualFirewallPolicyId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVirtualFirewallRuleId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVirtualFirewallRuleId(id));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVirtualFirewallRuleId(id));
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVirtualIPId(id));
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVirtualIPId(id));
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVirtualIPId(id));
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVirtualIPId(id));
        }
        
        if (type.equals(Constants.VIRTUALUPLINK) && relationName.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayConnectionsFetcherForVirtualUplinkId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return toList(ModelHelper.getBGPNeighborsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.BRCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getBRConnectionsFetcherForVLANId(id));
        }
        if (type.equals(Constants.BRCONNECTIONS_FETCHER) && relationName.equals(Constants.BRCONNECTIONS)) {
            return ModelHelper.getBRConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayConnectionsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.LTESTATISTICS_FETCHER)) {
            return toList(ModelHelper.getLtestatisticsFetcherForVLANId(id));
        }
        if (type.equals(Constants.LTESTATISTICS_FETCHER) && relationName.equals(Constants.LTESTATISTICS)) {
            return ModelHelper.getLtestatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getUplinkConnectionsFetcherForVLANId(id));
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.BRCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getBRConnectionsFetcherForVLANTemplateId(id));
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVLANTemplateId(id));
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVLANTemplateId(id));
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVLANTemplateId(id));
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getUplinkConnectionsFetcherForVLANTemplateId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.VMRESYNCS_FETCHER)) {
            return toList(ModelHelper.getVMResyncsFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForVMId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForVMInterfaceId(id));
        }
        
        if (type.equals(Constants.VMIPRESERVATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMIPReservationId(id));
        }
        
        if (type.equals(Constants.VMIPRESERVATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMIPReservationId(id));
        }
        
        if (type.equals(Constants.VMIPRESERVATION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVMIPReservationId(id));
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFId(id));
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVNFId(id));
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFId(id));
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFId(id));
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.VNFINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVNFInterfacesFetcherForVNFId(id));
        }
        if (type.equals(Constants.VNFINTERFACES_FETCHER) && relationName.equals(Constants.VNFINTERFACES)) {
            return ModelHelper.getVNFInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.VNFMETADATAS_FETCHER)) {
            return toList(ModelHelper.getVNFMetadatasFetcherForVNFId(id));
        }
        
        if (type.equals(Constants.VNF) && relationName.equals(Constants.VNFTHRESHOLDPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVNFThresholdPoliciesFetcherForVNFId(id));
        }
        
        if (type.equals(Constants.VNFCATALOG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFCatalogId(id));
        }
        
        if (type.equals(Constants.VNFCATALOG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFCatalogId(id));
        }
        
        if (type.equals(Constants.VNFCATALOG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFCatalogId(id));
        }
        
        if (type.equals(Constants.VNFCATALOG) && relationName.equals(Constants.VNFDESCRIPTORS_FETCHER)) {
            return toList(ModelHelper.getVNFDescriptorsFetcherForVNFCatalogId(id));
        }
        if (type.equals(Constants.VNFDESCRIPTORS_FETCHER) && relationName.equals(Constants.VNFDESCRIPTORS)) {
            return ModelHelper.getVNFDescriptorsForFetcherId(id);
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFDescriptorId(id));
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFDescriptorId(id));
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFDescriptorId(id));
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR) && relationName.equals(Constants.VNFINTERFACEDESCRIPTORS_FETCHER)) {
            return toList(ModelHelper.getVNFInterfaceDescriptorsFetcherForVNFDescriptorId(id));
        }
        if (type.equals(Constants.VNFINTERFACEDESCRIPTORS_FETCHER) && relationName.equals(Constants.VNFINTERFACEDESCRIPTORS)) {
            return ModelHelper.getVNFInterfaceDescriptorsForFetcherId(id);
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFDomainMappingId(id));
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFDomainMappingId(id));
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFDomainMappingId(id));
        }
        
        if (type.equals(Constants.VNFINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFInterfaceId(id));
        }
        
        if (type.equals(Constants.VNFINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFInterfaceId(id));
        }
        
        if (type.equals(Constants.VNFINTERFACE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFInterfaceId(id));
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFInterfaceDescriptorId(id));
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFInterfaceDescriptorId(id));
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFInterfaceDescriptorId(id));
        }
        
        if (type.equals(Constants.VNFMETADATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFMetadataId(id));
        }
        
        if (type.equals(Constants.VNFMETADATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFMetadataId(id));
        }
        
        if (type.equals(Constants.VNFMETADATA) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFMetadataId(id));
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVNFThresholdPolicyId(id));
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVNFThresholdPolicyId(id));
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVNFThresholdPolicyId(id));
        }
        
        if (type.equals(Constants.VPNCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVPNConnectionId(id));
        }
        
        if (type.equals(Constants.VPNCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVPNConnectionId(id));
        }
        
        if (type.equals(Constants.VPNCONNECTION) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVPNConnectionId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.AGGREGATEMETADATAS_FETCHER)) {
            return toList(ModelHelper.getAggregateMetadatasFetcherForVPortId(id));
        }
        if (type.equals(Constants.AGGREGATEMETADATAS_FETCHER) && relationName.equals(Constants.AGGREGATEMETADATAS)) {
            return ModelHelper.getAggregateMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return toList(ModelHelper.getBGPNeighborsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            return toList(ModelHelper.getDeploymentFailuresFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdEntryTemplatesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.PORTMAPPINGS_FETCHER)) {
            return toList(ModelHelper.getPortMappingsFetcherForVPortId(id));
        }
        if (type.equals(Constants.PORTMAPPINGS_FETCHER) && relationName.equals(Constants.PORTMAPPINGS)) {
            return ModelHelper.getPortMappingsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.SCHEDULEDTESTSUITERUNS_FETCHER)) {
            return toList(ModelHelper.getScheduledtestsuiterunsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.TESTSUITERUNS_FETCHER)) {
            return toList(ModelHelper.getTestSuiteRunsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.TRUNKS_FETCHER)) {
            return toList(ModelHelper.getTrunksFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VIRTUALIPS_FETCHER)) {
            return toList(ModelHelper.getVirtualIPsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VNFINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVNFInterfacesFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VPORTMIRRORS_FETCHER)) {
            return toList(ModelHelper.getVPortMirrorsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForVPortId(id));
        }
        
        if (type.equals(Constants.VPORTMIRROR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVPortMirrorId(id));
        }
        
        if (type.equals(Constants.VPORTMIRROR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVPortMirrorId(id));
        }
        
        if (type.equals(Constants.VPORTMIRROR) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVPortMirrorId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.CONTROLLERVRSLINKS_FETCHER)) {
            return toList(ModelHelper.getControllerVRSLinksFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.HSCS_FETCHER)) {
            return toList(ModelHelper.getHSCsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return toList(ModelHelper.getMonitoringPortsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.MULTINICVPORTS_FETCHER)) {
            return toList(ModelHelper.getMultiNICVPortsFetcherForVRSId(id));
        }
        if (type.equals(Constants.MULTINICVPORTS_FETCHER) && relationName.equals(Constants.MULTINICVPORTS)) {
            return ModelHelper.getMultiNICVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.VSCS_FETCHER)) {
            return toList(ModelHelper.getVSCsFetcherForVRSId(id));
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVRSAddressRangeId(id));
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVRSAddressRangeId(id));
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVRSAddressRangeId(id));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterVRSConfigId(id));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterVRSConfigId(id));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVCenterVRSConfigId(id));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterVRSConfigId(id));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterVRSConfigId(id));
        }
        
        if (type.equals(Constants.VRSINFO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForvrsInfoId(id));
        }
        
        if (type.equals(Constants.VRSINFO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForvrsInfoId(id));
        }
        
        if (type.equals(Constants.VRSINFO) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForvrsInfoId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.BGPPEERS_FETCHER)) {
            return toList(ModelHelper.getBGPPeersFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.CONTROLLERVRSLINKS_FETCHER)) {
            return toList(ModelHelper.getControllerVRSLinksFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return toList(ModelHelper.getMonitoringPortsFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVSCId(id));
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVSDId(id));
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.VSDCOMPONENTS_FETCHER)) {
            return toList(ModelHelper.getVSDComponentsFetcherForVSDId(id));
        }
        if (type.equals(Constants.VSDCOMPONENTS_FETCHER) && relationName.equals(Constants.VSDCOMPONENTS)) {
            return ModelHelper.getVSDComponentsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVSDId(id));
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSDId(id));
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVSDId(id));
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSDId(id));
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVSDId(id));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVsgRedundantPortId(id));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForVsgRedundantPortId(id));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVsgRedundantPortId(id));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVsgRedundantPortId(id));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVsgRedundantPortId(id));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForVsgRedundantPortId(id));
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVSPId(id));
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSPId(id));
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.HSCS_FETCHER)) {
            return toList(ModelHelper.getHSCsFetcherForVSPId(id));
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSPId(id));
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.NETCONFMANAGERS_FETCHER)) {
            return toList(ModelHelper.getNetconfManagersFetcherForVSPId(id));
        }
        if (type.equals(Constants.NETCONFMANAGERS_FETCHER) && relationName.equals(Constants.NETCONFMANAGERS)) {
            return ModelHelper.getNetconfManagersForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVSPId(id));
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.THREATPREVENTIONSERVERCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getThreatPreventionServerConnectionsFetcherForVSPId(id));
        }
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTIONS_FETCHER) && relationName.equals(Constants.THREATPREVENTIONSERVERCONNECTIONS)) {
            return ModelHelper.getThreatPreventionServerConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.VSCS_FETCHER)) {
            return toList(ModelHelper.getVSCsFetcherForVSPId(id));
        }
        
        if (type.equals(Constants.WEBCATEGORY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForWebCategoryId(id));
        }
        
        if (type.equals(Constants.WEBCATEGORY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForWebCategoryId(id));
        }
        
        if (type.equals(Constants.WEBCATEGORY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForWebCategoryId(id));
        }
        
        if (type.equals(Constants.WEBCATEGORY) && relationName.equals(Constants.WEBDOMAINNAMES_FETCHER)) {
            return toList(ModelHelper.getWebDomainNamesFetcherForWebCategoryId(id));
        }
        
        if (type.equals(Constants.WEBDOMAINNAME) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForWebDomainNameId(id));
        }
        
        if (type.equals(Constants.WEBDOMAINNAME) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForWebDomainNameId(id));
        }
        
        if (type.equals(Constants.WEBDOMAINNAME) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForWebDomainNameId(id));
        }
        
        if (type.equals(Constants.WEBDOMAINNAME) && relationName.equals(Constants.WEBCATEGORIES_FETCHER)) {
            return toList(ModelHelper.getWebCategoriesFetcherForWebDomainNameId(id));
        }
        
        if (type.equals(Constants.WIRELESSPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForWirelessPortId(id));
        }
        
        if (type.equals(Constants.WIRELESSPORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForWirelessPortId(id));
        }
        
        if (type.equals(Constants.WIRELESSPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForWirelessPortId(id));
        }
        
        if (type.equals(Constants.WIRELESSPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForWirelessPortId(id));
        }
        
        if (type.equals(Constants.WIRELESSPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForWirelessPortId(id));
        }
        
        if (type.equals(Constants.WIRELESSPORT) && relationName.equals(Constants.SSIDCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getSSIDConnectionsFetcherForWirelessPortId(id));
        }
        if (type.equals(Constants.SSIDCONNECTIONS_FETCHER) && relationName.equals(Constants.SSIDCONNECTIONS)) {
            return ModelHelper.getSSIDConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForZFBRequestId(id));
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForZFBRequestId(id));
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForZFBRequestId(id));
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForZFBRequestId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPv6OptionsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForZoneId(id));
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForZoneTemplateId(id));
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForZoneTemplateId(id));
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForZoneTemplateId(id));
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForZoneTemplateId(id));
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForZoneTemplateId(id));
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.SUBNETTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getSubnetTemplatesFetcherForZoneTemplateId(id));
        }
        throw new UnsupportedOperationException("implement findRelationImpl(String type, String id, String relationName) - type: " + type + ", id: " + id + ", relationName: " + relationName);
    }

    @Override
    public QueryResult findAllImpl(String type, String query) throws RestException {
        if (type.equals(Constants.SESSION)) {
            java.util.List<Session> allSessions = ModelHelper.getAllSessions();
            return new QueryResult(allSessions);
        }
        if (type.equals(Constants.CERTIFICATEMETADATA)) {
            java.util.List<CertificateMetadata> allObjs = ModelHelper.getAllCertificateMetadatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CERTIFICATEMETADATAS_FETCHER)) {
            java.util.List<CertificateMetadatasFetcher> allObjs = ModelHelper.getAllCertificateMetadatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOWNLOADPROGRESS)) {
            java.util.List<DownloadProgress> allObjs = ModelHelper.getAllDownloadProgress();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOWNLOADPROGRESS_FETCHER)) {
            java.util.List<DownloadProgressFetcher> allObjs = ModelHelper.getAllDownloadProgressFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TCPCONNECTTESTRESULT)) {
            java.util.List<TCPConnectTestResult> allObjs = ModelHelper.getAllTCPConnectTestResults();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TCPCONNECTTESTRESULTS_FETCHER)) {
            java.util.List<TCPConnectTestResultsFetcher> allObjs = ModelHelper.getAllTCPConnectTestResultsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.THREATPREVENTIONNODEINFO)) {
            java.util.List<ThreatPreventionNodeInfo> allObjs = ModelHelper.getAllThreatPreventionNodeInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.THREATPREVENTIONNODEINFOS_FETCHER)) {
            java.util.List<ThreatPreventionNodeInfosFetcher> allObjs = ModelHelper.getAllThreatPreventionNodeInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORTINFO)) {
            java.util.List<VPortInfo> allObjs = ModelHelper.getAllVPortInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORTINFOS_FETCHER)) {
            java.util.List<VPortInfosFetcher> allObjs = ModelHelper.getAllVPortInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORTINFO_VPORTOPERATIONALSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortInfoVPortOperationalState.values()));
        }
        
        if (type.equals(Constants.FORWARDINGCLASS)) {
            java.util.List<ForwardingClass> allObjs = ModelHelper.getAllForwardingClass();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FORWARDINGCLASS_FETCHER)) {
            java.util.List<ForwardingClassFetcher> allObjs = ModelHelper.getAllForwardingClassFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FORWARDINGCLASS_FORWARDINGCLASS_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingClassForwardingClass.values()));
        }
        
        if (type.equals(Constants.BANDWIDTHTESTRESULT)) {
            java.util.List<BandwidthTestResult> allObjs = ModelHelper.getAllBandwidthTestResults();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BANDWIDTHTESTRESULTS_FETCHER)) {
            java.util.List<BandwidthTestResultsFetcher> allObjs = ModelHelper.getAllBandwidthTestResultsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MTUDISCOVERYTESTRESULT)) {
            java.util.List<MTUDiscoveryTestResult> allObjs = ModelHelper.getAllMTUDiscoveryTestResults();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MTUDISCOVERYTESTRESULTS_FETCHER)) {
            java.util.List<MTUDiscoveryTestResultsFetcher> allObjs = ModelHelper.getAllMTUDiscoveryTestResultsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSMONUPLINKCONNECTION)) {
            java.util.List<SysmonUplinkConnection> allObjs = ModelHelper.getAllSysmonUplinkConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSMONUPLINKCONNECTIONS_FETCHER)) {
            java.util.List<SysmonUplinkConnectionsFetcher> allObjs = ModelHelper.getAllSysmonUplinkConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_IPSECDTLSSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(SysmonUplinkConnectionIpsecDtlsState.values()));
        }
        
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_JSONSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(SysmonUplinkConnectionJsonState.values()));
        }
        
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_OPENFLOWSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(SysmonUplinkConnectionOpenflowState.values()));
        }
        
        if (type.equals(Constants.SYSMONUPLINKCONNECTION_VXLANDTLSSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(SysmonUplinkConnectionVxlanDtlsState.values()));
        }
        
        if (type.equals(Constants.UDPPROBETESTRESULT)) {
            java.util.List<UDPProbeTestResult> allObjs = ModelHelper.getAllUDPProbeTestResults();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UDPPROBETESTRESULTS_FETCHER)) {
            java.util.List<UDPProbeTestResultsFetcher> allObjs = ModelHelper.getAllUDPProbeTestResultsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLOCATIONPOOL)) {
            java.util.List<AllocationPool> allObjs = ModelHelper.getAllAllocationPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLOCATIONPOOLS_FETCHER)) {
            java.util.List<AllocationPoolsFetcher> allObjs = ModelHelper.getAllAllocationPoolsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ADDRESSMAP)) {
            java.util.List<AddressMap> allObjs = ModelHelper.getAllAddressMaps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ADDRESSMAPS_FETCHER)) {
            java.util.List<AddressMapsFetcher> allObjs = ModelHelper.getAllAddressMapsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ADDRESSMAP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AddressMapEntityScope.values()));
        }
        
        if (type.equals(Constants.ADDRESSMAP_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(AddressMapType.values()));
        }
        
        if (type.equals(Constants.ADDRESSRANGE)) {
            java.util.List<AddressRange> allObjs = ModelHelper.getAllAddressRanges();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER)) {
            java.util.List<AddressRangesFetcher> allObjs = ModelHelper.getAllAddressRangesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ADDRESSRANGE_DHCPPOOLTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(AddressRangeDHCPPoolType.values()));
        }
        
        if (type.equals(Constants.ADDRESSRANGE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(AddressRangeIPType.values()));
        }
        
        if (type.equals(Constants.ADDRESSRANGE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AddressRangeEntityScope.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN)) {
            java.util.List<AggregatedDomain> allObjs = ModelHelper.getAllAggregatedDomains();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AGGREGATEDDOMAINS_FETCHER)) {
            java.util.List<AggregatedDomainsFetcher> allObjs = ModelHelper.getAllAggregatedDomainsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AGGREGATEDDOMAIN_DHCPBEHAVIOR_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainDHCPBehavior.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainDPI.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_FIPIGNOREDEFAULTROUTE_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainFIPIgnoreDefaultRoute.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_PATENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainPATEnabled.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_ADVERTISECRITERIA_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainAdvertiseCriteria.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainEncryption.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainEntityScope.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_FLOWCOLLECTIONENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainFlowCollectionEnabled.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainMulticast.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainPermittedAction.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainPolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_TUNNELTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainTunnelType.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_UNDERLAYENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainUnderlayEnabled.values()));
        }
        
        if (type.equals(Constants.AGGREGATEDDOMAIN_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(AggregatedDomainUplinkPreference.values()));
        }
        
        if (type.equals(Constants.AGGREGATEMETADATA)) {
            java.util.List<AggregateMetadata> allObjs = ModelHelper.getAllAggregateMetadatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AGGREGATEMETADATAS_FETCHER)) {
            java.util.List<AggregateMetadatasFetcher> allObjs = ModelHelper.getAllAggregateMetadatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AGGREGATEMETADATA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AggregateMetadataEntityScope.values()));
        }
        
        if (type.equals(Constants.ALARM)) {
            java.util.List<Alarm> allObjs = ModelHelper.getAllAlarms();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALARMS_FETCHER)) {
            java.util.List<AlarmsFetcher> allObjs = ModelHelper.getAllAlarmsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALARM_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AlarmEntityScope.values()));
        }
        
        if (type.equals(Constants.ALARM_SEVERITY_ENUM)) {
            return new QueryResult(Arrays.asList(AlarmSeverity.values()));
        }
        
        if (type.equals(Constants.ALLALARM)) {
            java.util.List<AllAlarm> allObjs = ModelHelper.getAllAllAlarms();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLALARMS_FETCHER)) {
            java.util.List<AllAlarmsFetcher> allObjs = ModelHelper.getAllAllAlarmsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLALARM_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AllAlarmEntityScope.values()));
        }
        
        if (type.equals(Constants.ALLALARM_SEVERITY_ENUM)) {
            return new QueryResult(Arrays.asList(AllAlarmSeverity.values()));
        }
        
        if (type.equals(Constants.ALLGATEWAY)) {
            java.util.List<AllGateway> allObjs = ModelHelper.getAllAllGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLGATEWAYS_FETCHER)) {
            java.util.List<AllGatewaysFetcher> allObjs = ModelHelper.getAllAllGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLGATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return new QueryResult(Arrays.asList(AllGatewayZFBMatchAttribute.values()));
        }
        
        if (type.equals(Constants.ALLGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(AllGatewayBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.ALLGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AllGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.ALLGATEWAY_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(AllGatewayFamily.values()));
        }
        
        if (type.equals(Constants.ALLGATEWAY_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(AllGatewayPermittedAction.values()));
        }
        
        if (type.equals(Constants.ALLGATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(AllGatewayPersonality.values()));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP)) {
            java.util.List<AllRedundancyGroup> allObjs = ModelHelper.getAllAllRedundancyGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLREDUNDANCYGROUPS_FETCHER)) {
            java.util.List<AllRedundancyGroupsFetcher> allObjs = ModelHelper.getAllAllRedundancyGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ALLREDUNDANCYGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AllRedundancyGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(AllRedundancyGroupPermittedAction.values()));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(AllRedundancyGroupPersonality.values()));
        }
        
        if (type.equals(Constants.ALLREDUNDANCYGROUP_REDUNDANTGATEWAYSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(AllRedundancyGroupRedundantGatewayStatus.values()));
        }
        
        if (type.equals(Constants.APPLICATION)) {
            java.util.List<Application> allObjs = ModelHelper.getAllApplications();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONS_FETCHER)) {
            java.util.List<ApplicationsFetcher> allObjs = ModelHelper.getAllApplicationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationEntityScope.values()));
        }
        
        if (type.equals(Constants.APPLICATION_OPTIMIZEPATHSELECTION_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationOptimizePathSelection.values()));
        }
        
        if (type.equals(Constants.APPLICATION_PERFORMANCEMONITORTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationPerformanceMonitorType.values()));
        }
        
        if (type.equals(Constants.APPLICATION_POSTCLASSIFICATIONPATH_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationPostClassificationPath.values()));
        }
        
        if (type.equals(Constants.APPLICATION_PRECLASSIFICATIONPATH_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationPreClassificationPath.values()));
        }
        
        if (type.equals(Constants.APPLICATION_PROTOCOL_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationProtocol.values()));
        }
        
        if (type.equals(Constants.APPLICATIONBINDING)) {
            java.util.List<ApplicationBinding> allObjs = ModelHelper.getAllApplicationBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            java.util.List<ApplicationBindingsFetcher> allObjs = ModelHelper.getAllApplicationBindingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONBINDING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationBindingEntityScope.values()));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT)) {
            java.util.List<Applicationperformancemanagement> allObjs = ModelHelper.getAllApplicationperformancemanagements();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            java.util.List<ApplicationperformancemanagementsFetcher> allObjs = ModelHelper.getAllApplicationperformancemanagementsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationperformancemanagementEntityScope.values()));
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING)) {
            java.util.List<Applicationperformancemanagementbinding> allObjs = ModelHelper.getAllApplicationperformancemanagementbindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            java.util.List<ApplicationperformancemanagementbindingsFetcher> allObjs = ModelHelper.getAllApplicationperformancemanagementbindingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationperformancemanagementbindingEntityScope.values()));
        }
        
        if (type.equals(Constants.AUTODISCOVERCLUSTER)) {
            java.util.List<AutoDiscoverCluster> allObjs = ModelHelper.getAllAutoDiscoverClusters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVERCLUSTERS_FETCHER)) {
            java.util.List<AutoDiscoverClustersFetcher> allObjs = ModelHelper.getAllAutoDiscoverClustersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVERCLUSTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AutoDiscoverClusterEntityScope.values()));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDDATACENTER)) {
            java.util.List<Autodiscovereddatacenter> allObjs = ModelHelper.getAllAutodiscovereddatacenters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVEREDDATACENTERS_FETCHER)) {
            java.util.List<AutodiscovereddatacentersFetcher> allObjs = ModelHelper.getAllAutodiscovereddatacentersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVEREDDATACENTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AutodiscovereddatacenterEntityScope.values()));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY)) {
            java.util.List<AutoDiscoveredGateway> allObjs = ModelHelper.getAllAutoDiscoveredGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVEREDGATEWAYS_FETCHER)) {
            java.util.List<AutoDiscoveredGatewaysFetcher> allObjs = ModelHelper.getAllAutoDiscoveredGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AutoDiscoveredGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(AutoDiscoveredGatewayPersonality.values()));
        }
        
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER)) {
            java.util.List<AutoDiscoverHypervisorFromCluster> allObjs = ModelHelper.getAllAutoDiscoverHypervisorFromClusters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER)) {
            java.util.List<AutoDiscoverHypervisorFromClustersFetcher> allObjs = ModelHelper.getAllAutoDiscoverHypervisorFromClustersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AutoDiscoverHypervisorFromClusterEntityScope.values()));
        }
        
        if (type.equals(Constants.AVATAR)) {
            java.util.List<Avatar> allObjs = ModelHelper.getAllAvatars();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AVATARS_FETCHER)) {
            java.util.List<AvatarsFetcher> allObjs = ModelHelper.getAllAvatarsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AVATAR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AvatarEntityScope.values()));
        }
        
        if (type.equals(Constants.AZURECLOUD)) {
            java.util.List<AzureCloud> allObjs = ModelHelper.getAllAzureClouds();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AZURECLOUDS_FETCHER)) {
            java.util.List<AzureCloudsFetcher> allObjs = ModelHelper.getAllAzureCloudsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.AZURECLOUD_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(AzureCloudEntityScope.values()));
        }
        
        if (type.equals(Constants.BFDSESSION)) {
            java.util.List<BFDSession> allObjs = ModelHelper.getAllBFDSessions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BFDSESSIONS_FETCHER)) {
            java.util.List<BFDSessionsFetcher> allObjs = ModelHelper.getAllBFDSessionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BFDSESSION_BFDDESTINATIONIPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(BFDSessionBFDDestinationIPType.values()));
        }
        
        if (type.equals(Constants.BFDSESSION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BFDSessionEntityScope.values()));
        }
        
        if (type.equals(Constants.BGPNEIGHBOR)) {
            java.util.List<BGPNeighbor> allObjs = ModelHelper.getAllBGPNeighbors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            java.util.List<BGPNeighborsFetcher> allObjs = ModelHelper.getAllBGPNeighborsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPNEIGHBOR_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(BGPNeighborIPType.values()));
        }
        
        if (type.equals(Constants.BGPNEIGHBOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BGPNeighborEntityScope.values()));
        }
        
        if (type.equals(Constants.BGPPEER)) {
            java.util.List<BGPPeer> allObjs = ModelHelper.getAllBGPPeers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPPEERS_FETCHER)) {
            java.util.List<BGPPeersFetcher> allObjs = ModelHelper.getAllBGPPeersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPPEER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BGPPeerEntityScope.values()));
        }
        
        if (type.equals(Constants.BGPPEER_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(BGPPeerStatus.values()));
        }
        
        if (type.equals(Constants.BGPPROFILE)) {
            java.util.List<BGPProfile> allObjs = ModelHelper.getAllBGPProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPPROFILES_FETCHER)) {
            java.util.List<BGPProfilesFetcher> allObjs = ModelHelper.getAllBGPProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BGPProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.BOOTSTRAP)) {
            java.util.List<Bootstrap> allObjs = ModelHelper.getAllBootstraps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BOOTSTRAPS_FETCHER)) {
            java.util.List<BootstrapsFetcher> allObjs = ModelHelper.getAllBootstrapsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BOOTSTRAP_ZFBMATCHATTRIBUTE_ENUM)) {
            return new QueryResult(Arrays.asList(BootstrapZFBMatchAttribute.values()));
        }
        
        if (type.equals(Constants.BOOTSTRAP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BootstrapEntityScope.values()));
        }
        
        if (type.equals(Constants.BOOTSTRAP_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(BootstrapStatus.values()));
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION)) {
            java.util.List<BootstrapActivation> allObjs = ModelHelper.getAllBootstrapActivations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER)) {
            java.util.List<BootstrapActivationsFetcher> allObjs = ModelHelper.getAllBootstrapActivationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BOOTSTRAPACTIVATION_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(BootstrapActivationAction.values()));
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BootstrapActivationEntityScope.values()));
        }
        
        if (type.equals(Constants.BRCONNECTION)) {
            java.util.List<BRConnection> allObjs = ModelHelper.getAllBRConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BRCONNECTIONS_FETCHER)) {
            java.util.List<BRConnectionsFetcher> allObjs = ModelHelper.getAllBRConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BRCONNECTION_ADDRESSFAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(BRConnectionAddressFamily.values()));
        }
        
        if (type.equals(Constants.BRCONNECTION_ADVERTISEMENTCRITERIA_ENUM)) {
            return new QueryResult(Arrays.asList(BRConnectionAdvertisementCriteria.values()));
        }
        
        if (type.equals(Constants.BRCONNECTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BRConnectionEntityScope.values()));
        }
        
        if (type.equals(Constants.BRCONNECTION_MODE_ENUM)) {
            return new QueryResult(Arrays.asList(BRConnectionMode.values()));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE)) {
            java.util.List<BridgeInterface> allObjs = ModelHelper.getAllBridgeInterfaces();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            java.util.List<BridgeInterfacesFetcher> allObjs = ModelHelper.getAllBridgeInterfacesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BRIDGEINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(BridgeInterfaceAttachedNetworkType.values()));
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BridgeInterfaceEntityScope.values()));
        }
        
        if (type.equals(Constants.BULKSTATISTICS)) {
            java.util.List<BulkStatistics> allObjs = ModelHelper.getAllBulkStatistics();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BULKSTATISTICS_FETCHER)) {
            java.util.List<BulkStatisticsFetcher> allObjs = ModelHelper.getAllBulkStatisticsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILE)) {
            java.util.List<CaptivePortalProfile> allObjs = ModelHelper.getAllCaptivePortalProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILES_FETCHER)) {
            java.util.List<CaptivePortalProfilesFetcher> allObjs = ModelHelper.getAllCaptivePortalProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CAPTIVEPORTALPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CaptivePortalProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.CAPTIVEPORTALPROFILE_PORTALTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(CaptivePortalProfilePortalType.values()));
        }
        
        if (type.equals(Constants.CERTIFICATE)) {
            java.util.List<Certificate> allObjs = ModelHelper.getAllCertificates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CERTIFICATES_FETCHER)) {
            java.util.List<CertificatesFetcher> allObjs = ModelHelper.getAllCertificatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CERTIFICATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CertificateEntityScope.values()));
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM)) {
            java.util.List<CloudMgmtSystem> allObjs = ModelHelper.getAllCloudMgmtSystems();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEMS_FETCHER)) {
            java.util.List<CloudMgmtSystemsFetcher> allObjs = ModelHelper.getAllCloudMgmtSystemsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEM_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CloudMgmtSystemEntityScope.values()));
        }
        
        if (type.equals(Constants.COMMAND)) {
            java.util.List<Command> allObjs = ModelHelper.getAllCommands();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.COMMANDS_FETCHER)) {
            java.util.List<CommandsFetcher> allObjs = ModelHelper.getAllCommandsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.COMMAND_COMMAND_ENUM)) {
            return new QueryResult(Arrays.asList(CommandCommand.values()));
        }
        
        if (type.equals(Constants.COMMAND_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CommandEntityScope.values()));
        }
        
        if (type.equals(Constants.COMMAND_OVERRIDE_ENUM)) {
            return new QueryResult(Arrays.asList(CommandOverride.values()));
        }
        
        if (type.equals(Constants.COMMAND_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(CommandStatus.values()));
        }
        
        if (type.equals(Constants.VSDCOMPONENT)) {
            java.util.List<VSDComponent> allObjs = ModelHelper.getAllVSDComponents();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSDCOMPONENTS_FETCHER)) {
            java.util.List<VSDComponentsFetcher> allObjs = ModelHelper.getAllVSDComponentsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSDCOMPONENT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VSDComponentEntityScope.values()));
        }
        
        if (type.equals(Constants.VSDCOMPONENT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VSDComponentStatus.values()));
        }
        
        if (type.equals(Constants.VSDCOMPONENT_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VSDComponentType.values()));
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT)) {
            java.util.List<Connectionendpoint> allObjs = ModelHelper.getAllConnectionendpoints();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONNECTIONENDPOINTS_FETCHER)) {
            java.util.List<ConnectionendpointsFetcher> allObjs = ModelHelper.getAllConnectionendpointsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONNECTIONENDPOINT_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ConnectionendpointIPType.values()));
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT_ENDPOINTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ConnectionendpointEndPointType.values()));
        }
        
        if (type.equals(Constants.CONNECTIONENDPOINT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ConnectionendpointEntityScope.values()));
        }
        
        if (type.equals(Constants.CONTAINER)) {
            java.util.List<Container> allObjs = ModelHelper.getAllContainers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTAINERS_FETCHER)) {
            java.util.List<ContainersFetcher> allObjs = ModelHelper.getAllContainersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTAINER_DELETEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerDeleteMode.values()));
        }
        
        if (type.equals(Constants.CONTAINER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerEntityScope.values()));
        }
        
        if (type.equals(Constants.CONTAINER_REASONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerReasonType.values()));
        }
        
        if (type.equals(Constants.CONTAINER_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerStatus.values()));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE)) {
            java.util.List<ContainerInterface> allObjs = ModelHelper.getAllContainerInterfaces();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            java.util.List<ContainerInterfacesFetcher> allObjs = ModelHelper.getAllContainerInterfacesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTAINERINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerInterfaceAttachedNetworkType.values()));
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerInterfaceEntityScope.values()));
        }
        
        if (type.equals(Constants.CONTAINERRESYNC)) {
            java.util.List<ContainerResync> allObjs = ModelHelper.getAllContainerResyncs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTAINERRESYNCS_FETCHER)) {
            java.util.List<ContainerResyncsFetcher> allObjs = ModelHelper.getAllContainerResyncsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTAINERRESYNC_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerResyncEntityScope.values()));
        }
        
        if (type.equals(Constants.CONTAINERRESYNC_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ContainerResyncStatus.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK)) {
            java.util.List<ControllerVRSLink> allObjs = ModelHelper.getAllControllerVRSLinks();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTROLLERVRSLINKS_FETCHER)) {
            java.util.List<ControllerVRSLinksFetcher> allObjs = ModelHelper.getAllControllerVRSLinksFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CONTROLLERVRSLINK_JSONRPCCONNECTIONSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkJSONRPCConnectionState.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_VRSPERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkVRSPersonality.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_VSCCONFIGSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkVSCConfigState.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_VSCCURRENTSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkVSCCurrentState.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_CLUSTERNODEROLE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkClusterNodeRole.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_CONTROLLERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkControllerType.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkEntityScope.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_ROLE_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkRole.values()));
        }
        
        if (type.equals(Constants.CONTROLLERVRSLINK_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ControllerVRSLinkStatus.values()));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY)) {
            java.util.List<COSRemarkingPolicy> allObjs = ModelHelper.getAllCOSRemarkingPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.COSREMARKINGPOLICIES_FETCHER)) {
            java.util.List<COSRemarkingPoliciesFetcher> allObjs = ModelHelper.getAllCOSRemarkingPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.COSREMARKINGPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(COSRemarkingPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICY_FORWARDINGCLASS_ENUM)) {
            return new QueryResult(Arrays.asList(COSRemarkingPolicyForwardingClass.values()));
        }
        
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE)) {
            java.util.List<COSRemarkingPolicyTable> allObjs = ModelHelper.getAllCOSRemarkingPolicyTables();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.COSREMARKINGPOLICYTABLES_FETCHER)) {
            java.util.List<COSRemarkingPolicyTablesFetcher> allObjs = ModelHelper.getAllCOSRemarkingPolicyTablesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.COSREMARKINGPOLICYTABLE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(COSRemarkingPolicyTableEntityScope.values()));
        }
        
        if (type.equals(Constants.CSNATPOOL)) {
            java.util.List<CSNATPool> allObjs = ModelHelper.getAllCSNATPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CSNATPOOLS_FETCHER)) {
            java.util.List<CSNATPoolsFetcher> allObjs = ModelHelper.getAllCSNATPoolsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CSNATPOOL_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(CSNATPoolIPType.values()));
        }
        
        if (type.equals(Constants.CSNATPOOL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CSNATPoolEntityScope.values()));
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP)) {
            java.util.List<CTranslationMap> allObjs = ModelHelper.getAllCTranslationMaps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CTRANSLATIONMAPS_FETCHER)) {
            java.util.List<CTranslationMapsFetcher> allObjs = ModelHelper.getAllCTranslationMapsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CTRANSLATIONMAP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CTranslationMapEntityScope.values()));
        }
        
        if (type.equals(Constants.CTRANSLATIONMAP_MAPPINGTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(CTranslationMapMappingType.values()));
        }
        
        if (type.equals(Constants.CUSTOMPROPERTY)) {
            java.util.List<CustomProperty> allObjs = ModelHelper.getAllCustomProperties();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CUSTOMPROPERTIES_FETCHER)) {
            java.util.List<CustomPropertiesFetcher> allObjs = ModelHelper.getAllCustomPropertiesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.CUSTOMPROPERTY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(CustomPropertyEntityScope.values()));
        }
        
        if (type.equals(Constants.DEFAULTGATEWAY)) {
            java.util.List<DefaultGateway> allObjs = ModelHelper.getAllDefaultGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEFAULTGATEWAYS_FETCHER)) {
            java.util.List<DefaultGatewaysFetcher> allObjs = ModelHelper.getAllDefaultGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEFAULTGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DefaultGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE)) {
            java.util.List<DemarcationService> allObjs = ModelHelper.getAllDemarcationServices();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEMARCATIONSERVICES_FETCHER)) {
            java.util.List<DemarcationServicesFetcher> allObjs = ModelHelper.getAllDemarcationServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEMARCATIONSERVICE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DemarcationServiceEntityScope.values()));
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DemarcationServiceType.values()));
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE)) {
            java.util.List<DeploymentFailure> allObjs = ModelHelper.getAllDeploymentFailures();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEPLOYMENTFAILURES_FETCHER)) {
            java.util.List<DeploymentFailuresFetcher> allObjs = ModelHelper.getAllDeploymentFailuresFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEPLOYMENTFAILURE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DeploymentFailureEntityScope.values()));
        }
        
        if (type.equals(Constants.DEPLOYMENTFAILURE_EVENTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DeploymentFailureEventType.values()));
        }
        
        if (type.equals(Constants.DESTINATIONURL)) {
            java.util.List<Destinationurl> allObjs = ModelHelper.getAllDestinationurls();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DESTINATIONURLS_FETCHER)) {
            java.util.List<DestinationurlsFetcher> allObjs = ModelHelper.getAllDestinationurlsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DESTINATIONURL_HTTPMETHOD_ENUM)) {
            return new QueryResult(Arrays.asList(DestinationurlHTTPMethod.values()));
        }
        
        if (type.equals(Constants.DESTINATIONURL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DestinationurlEntityScope.values()));
        }
        
        if (type.equals(Constants.DHCPOPTION)) {
            java.util.List<DHCPOption> allObjs = ModelHelper.getAllDHCPOptions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER)) {
            java.util.List<DHCPOptionsFetcher> allObjs = ModelHelper.getAllDHCPOptionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DHCPOPTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DHCPOptionEntityScope.values()));
        }
        
        if (type.equals(Constants.DHCPV6OPTION)) {
            java.util.List<DHCPv6Option> allObjs = ModelHelper.getAllDHCPv6Options();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DHCPV6OPTIONS_FETCHER)) {
            java.util.List<DHCPv6OptionsFetcher> allObjs = ModelHelper.getAllDHCPv6OptionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DHCPV6OPTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DHCPv6OptionEntityScope.values()));
        }
        
        if (type.equals(Constants.DISKSTAT)) {
            java.util.List<DiskStat> allObjs = ModelHelper.getAllDiskStats();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DISKSTATS_FETCHER)) {
            java.util.List<DiskStatsFetcher> allObjs = ModelHelper.getAllDiskStatsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DISKSTAT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DiskStatEntityScope.values()));
        }
        
        if (type.equals(Constants.DISKSTAT_UNIT_ENUM)) {
            return new QueryResult(Arrays.asList(DiskStatUnit.values()));
        }
        
        if (type.equals(Constants.DOMAIN)) {
            java.util.List<Domain> allObjs = ModelHelper.getAllDomains();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINS_FETCHER)) {
            java.util.List<DomainsFetcher> allObjs = ModelHelper.getAllDomainsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAIN_DHCPBEHAVIOR_ENUM)) {
            return new QueryResult(Arrays.asList(DomainDHCPBehavior.values()));
        }
        
        if (type.equals(Constants.DOMAIN_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(DomainDPI.values()));
        }
        
        if (type.equals(Constants.DOMAIN_EVPNRT5TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainEVPNRT5Type.values()));
        }
        
        if (type.equals(Constants.DOMAIN_FIPIGNOREDEFAULTROUTE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPIgnoreDefaultRoute.values()));
        }
        
        if (type.equals(Constants.DOMAIN_PATENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainPATEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_ADVERTISECRITERIA_ENUM)) {
            return new QueryResult(Arrays.asList(DomainAdvertiseCriteria.values()));
        }
        
        if (type.equals(Constants.DOMAIN_AGGREGATIONFLOWTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainAggregationFlowType.values()));
        }
        
        if (type.equals(Constants.DOMAIN_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(DomainEncryption.values()));
        }
        
        if (type.equals(Constants.DOMAIN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainEntityScope.values()));
        }
        
        if (type.equals(Constants.DOMAIN_FLOWCOLLECTIONENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFlowCollectionEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_FLOWLIMITENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFlowLimitEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_FLOWSETUPRATELIMITENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFlowSetupRateLimitEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.DOMAIN_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(DomainMulticast.values()));
        }
        
        if (type.equals(Constants.DOMAIN_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(DomainPermittedAction.values()));
        }
        
        if (type.equals(Constants.DOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(DomainPolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.DOMAIN_THREATINTELLIGENCEENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainThreatIntelligenceEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_TUNNELTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTunnelType.values()));
        }
        
        if (type.equals(Constants.DOMAIN_UNDERLAYENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainUnderlayEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainUplinkPreference.values()));
        }
        
        if (type.equals(Constants.DOMAINKINDSUMMARY)) {
            java.util.List<DomainKindSummary> allObjs = ModelHelper.getAllDomainKindSummaries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINKINDSUMMARIES_FETCHER)) {
            java.util.List<DomainKindSummariesFetcher> allObjs = ModelHelper.getAllDomainKindSummariesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINKINDSUMMARY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainKindSummaryEntityScope.values()));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE)) {
            java.util.List<DomainTemplate> allObjs = ModelHelper.getAllDomainTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            java.util.List<DomainTemplatesFetcher> allObjs = ModelHelper.getAllDomainTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINTEMPLATE_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTemplateDPI.values()));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTemplateEncryption.values()));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTemplateMulticast.values()));
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTemplatePolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING)) {
            java.util.List<DSCPForwardingClassMapping> allObjs = ModelHelper.getAllDSCPForwardingClassMappings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER)) {
            java.util.List<DSCPForwardingClassMappingsFetcher> allObjs = ModelHelper.getAllDSCPForwardingClassMappingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DSCPForwardingClassMappingEntityScope.values()));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING_FORWARDINGCLASS_ENUM)) {
            return new QueryResult(Arrays.asList(DSCPForwardingClassMappingForwardingClass.values()));
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE)) {
            java.util.List<DSCPForwardingClassTable> allObjs = ModelHelper.getAllDSCPForwardingClassTables();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER)) {
            java.util.List<DSCPForwardingClassTablesFetcher> allObjs = ModelHelper.getAllDSCPForwardingClassTablesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DSCPForwardingClassTableEntityScope.values()));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY)) {
            java.util.List<DSCPRemarkingPolicy> allObjs = ModelHelper.getAllDSCPRemarkingPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICIES_FETCHER)) {
            java.util.List<DSCPRemarkingPoliciesFetcher> allObjs = ModelHelper.getAllDSCPRemarkingPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DSCPRemarkingPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICY_FORWARDINGCLASS_ENUM)) {
            return new QueryResult(Arrays.asList(DSCPRemarkingPolicyForwardingClass.values()));
        }
        
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE)) {
            java.util.List<DSCPRemarkingPolicyTable> allObjs = ModelHelper.getAllDSCPRemarkingPolicyTables();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLES_FETCHER)) {
            java.util.List<DSCPRemarkingPolicyTablesFetcher> allObjs = ModelHelper.getAllDSCPRemarkingPolicyTablesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DSCPREMARKINGPOLICYTABLE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DSCPRemarkingPolicyTableEntityScope.values()));
        }
        
        if (type.equals(Constants.DUCGROUP)) {
            java.util.List<DUCGroup> allObjs = ModelHelper.getAllDUCGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DUCGROUPS_FETCHER)) {
            java.util.List<DUCGroupsFetcher> allObjs = ModelHelper.getAllDUCGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DUCGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DUCGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.DUCGROUP_FUNCTION_ENUM)) {
            return new QueryResult(Arrays.asList(DUCGroupFunction.values()));
        }
        
        if (type.equals(Constants.DUCGROUPBINDING)) {
            java.util.List<DUCGroupBinding> allObjs = ModelHelper.getAllDUCGroupBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DUCGROUPBINDINGS_FETCHER)) {
            java.util.List<DUCGroupBindingsFetcher> allObjs = ModelHelper.getAllDUCGroupBindingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DUCGROUPBINDING_ASSOCIATEDUBRGROUPFUNCTION_ENUM)) {
            return new QueryResult(Arrays.asList(DUCGroupBindingAssociatedUBRGroupFunction.values()));
        }
        
        if (type.equals(Constants.DUCGROUPBINDING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DUCGroupBindingEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG)) {
            java.util.List<VCenterEAMConfig> allObjs = ModelHelper.getAllVCenterEAMConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTEREAMCONFIGS_FETCHER)) {
            java.util.List<VCenterEAMConfigsFetcher> allObjs = ModelHelper.getAllVCenterEAMConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTEREAMCONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterEAMConfigEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE)) {
            java.util.List<EgressACLEntryTemplate> allObjs = ModelHelper.getAllEgressACLEntryTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            java.util.List<EgressACLEntryTemplatesFetcher> allObjs = ModelHelper.getAllEgressACLEntryTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateAction.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateLocationEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateWebFilterType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE)) {
            java.util.List<EgressACLTemplate> allObjs = ModelHelper.getAllEgressACLTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            java.util.List<EgressACLTemplatesFetcher> allObjs = ModelHelper.getAllEgressACLTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE)) {
            java.util.List<EgressAdvFwdEntryTemplate> allObjs = ModelHelper.getAllEgressAdvFwdEntryTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            java.util.List<EgressAdvFwdEntryTemplatesFetcher> allObjs = ModelHelper.getAllEgressAdvFwdEntryTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateFCOverride.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateAction.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_FAILSAFEDATAPATH_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateFailsafeDatapath.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateLocationEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_REDIRECTIONTARGETENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateRedirectionTargetEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateUplinkPreference.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdEntryTemplateWebFilterType.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE)) {
            java.util.List<EgressAdvFwdTemplate> allObjs = ModelHelper.getAllEgressAdvFwdTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSADVFWDTEMPLATES_FETCHER)) {
            java.util.List<EgressAdvFwdTemplatesFetcher> allObjs = ModelHelper.getAllEgressAdvFwdTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.EGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAdvFwdTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE)) {
            java.util.List<EgressAuditACLEntryTemplate> allObjs = ModelHelper.getAllEgressAuditACLEntryTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            java.util.List<EgressAuditACLEntryTemplatesFetcher> allObjs = ModelHelper.getAllEgressAuditACLEntryTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateAction.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateLocationEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLEntryTemplateWebFilterType.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE)) {
            java.util.List<EgressAuditACLTemplate> allObjs = ModelHelper.getAllEgressAuditACLTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATES_FETCHER)) {
            java.util.List<EgressAuditACLTemplatesFetcher> allObjs = ModelHelper.getAllEgressAuditACLTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.EGRESSAUDITACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressAuditACLTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY)) {
            java.util.List<DomainFIPAclTemplateEntry> allObjs = ModelHelper.getAllDomainFIPAclTemplateEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER)) {
            java.util.List<DomainFIPAclTemplateEntriesFetcher> allObjs = ModelHelper.getAllDomainFIPAclTemplateEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryAction.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryLocationEntityType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryLocationType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryNetworkType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryPolicyState.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryWebFilterType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE)) {
            java.util.List<DomainFIPAclTemplate> allObjs = ModelHelper.getAllDomainFIPAclTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            java.util.List<DomainFIPAclTemplatesFetcher> allObjs = ModelHelper.getAllDomainFIPAclTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.EGRESSPROFILE)) {
            java.util.List<EgressProfile> allObjs = ModelHelper.getAllEgressProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSPROFILES_FETCHER)) {
            java.util.List<EgressProfilesFetcher> allObjs = ModelHelper.getAllEgressProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY)) {
            java.util.List<EgressQOSPolicy> allObjs = ModelHelper.getAllEgressQOSPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            java.util.List<EgressQOSPoliciesFetcher> allObjs = ModelHelper.getAllEgressQOSPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSQOSPOLICY_DEFAULTSERVICECLASS_ENUM)) {
            return new QueryResult(Arrays.asList(EgressQOSPolicyDefaultServiceClass.values()));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressQOSPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(EgressQOSPolicyQueue1ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(EgressQOSPolicyQueue2ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(EgressQOSPolicyQueue3ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(EgressQOSPolicyQueue4ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE)) {
            java.util.List<Enterprise> allObjs = ModelHelper.getAllEnterprises();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISES_FETCHER)) {
            java.util.List<EnterprisesFetcher> allObjs = ModelHelper.getAllEnterprisesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISE_ALLOWEDFORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseAllowedForwardingClasses.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_ALLOWEDFORWARDINGMODE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseAllowedForwardingMode.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_AVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseAvatarType.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_ENCRYPTIONMANAGEMENTMODE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseEncryptionManagementMode.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_ENTERPRISETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseEnterpriseType.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseEntityScope.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_FLOWCOLLECTIONENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseFlowCollectionEnabled.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_THREATINTELLIGENCEENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseThreatIntelligenceEnabled.values()));
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK)) {
            java.util.List<EnterpriseNetwork> allObjs = ModelHelper.getAllEnterpriseNetworks();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISENETWORKS_FETCHER)) {
            java.util.List<EnterpriseNetworksFetcher> allObjs = ModelHelper.getAllEnterpriseNetworksFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISENETWORK_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseNetworkIPType.values()));
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseNetworkEntityScope.values()));
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION)) {
            java.util.List<EnterprisePermission> allObjs = ModelHelper.getAllEnterprisePermissions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            java.util.List<EnterprisePermissionsFetcher> allObjs = ModelHelper.getAllEnterprisePermissionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISEPERMISSION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterprisePermissionEntityScope.values()));
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(EnterprisePermissionPermittedAction.values()));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE)) {
            java.util.List<EnterpriseProfile> allObjs = ModelHelper.getAllEnterpriseProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISEPROFILES_FETCHER)) {
            java.util.List<EnterpriseProfilesFetcher> allObjs = ModelHelper.getAllEnterpriseProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISEPROFILE_ALLOWEDFORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseProfileAllowedForwardingClasses.values()));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE_ENCRYPTIONMANAGEMENTMODE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseProfileEncryptionManagementMode.values()));
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA)) {
            java.util.List<EnterpriseSecuredData> allObjs = ModelHelper.getAllEnterpriseSecuredDatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATAS_FETCHER)) {
            java.util.List<EnterpriseSecuredDatasFetcher> allObjs = ModelHelper.getAllEnterpriseSecuredDatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseSecuredDataEntityScope.values()));
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA_SEEDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseSecuredDataSeedType.values()));
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY)) {
            java.util.List<EnterpriseSecurity> allObjs = ModelHelper.getAllEnterpriseSecurities();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISESECURITIES_FETCHER)) {
            java.util.List<EnterpriseSecuritiesFetcher> allObjs = ModelHelper.getAllEnterpriseSecuritiesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENTERPRISESECURITY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseSecurityEntityScope.values()));
        }
        
        if (type.equals(Constants.ESILMPOLICY)) {
            java.util.List<EsIlmPolicy> allObjs = ModelHelper.getAllEsIlmPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ESILMPOLICIES_FETCHER)) {
            java.util.List<EsIlmPoliciesFetcher> allObjs = ModelHelper.getAllEsIlmPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ESILMPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EsIlmPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.ESILMPOLICY_ESILMPOLICYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EsIlmPolicyEsIlmPolicyType.values()));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG)) {
            java.util.List<EsIndexConfig> allObjs = ModelHelper.getAllEsIndexConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ESINDEXCONFIGS_FETCHER)) {
            java.util.List<EsIndexConfigsFetcher> allObjs = ModelHelper.getAllEsIndexConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ESINDEXCONFIG_CONFIGSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(EsIndexConfigConfigStatus.values()));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EsIndexConfigEntityScope.values()));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG_ILMSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(EsIndexConfigIlmStatus.values()));
        }
        
        if (type.equals(Constants.ESINDEXCONFIG_INDEXTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EsIndexConfigIndexType.values()));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGROUP)) {
            java.util.List<EthernetSegmentGroup> allObjs = ModelHelper.getAllEthernetSegmentGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGROUPS_FETCHER)) {
            java.util.List<EthernetSegmentGroupsFetcher> allObjs = ModelHelper.getAllEthernetSegmentGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGROUP_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EthernetSegmentGroupPortType.values()));
        }
        
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP)) {
            java.util.List<EthernetSegmentGWGroup> allObjs = ModelHelper.getAllEthernetSegmentGWGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUPS_FETCHER)) {
            java.util.List<EthernetSegmentGWGroupsFetcher> allObjs = ModelHelper.getAllEthernetSegmentGWGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ETHERNETSEGMENTGWGROUP_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(EthernetSegmentGWGroupPersonality.values()));
        }
        
        if (type.equals(Constants.EVENTLOG)) {
            java.util.List<EventLog> allObjs = ModelHelper.getAllEventLogs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER)) {
            java.util.List<EventLogsFetcher> allObjs = ModelHelper.getAllEventLogsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EVENTLOG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EventLogEntityScope.values()));
        }
        
        if (type.equals(Constants.FIREWALLACL)) {
            java.util.List<FirewallAcl> allObjs = ModelHelper.getAllFirewallAcls();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FIREWALLACLS_FETCHER)) {
            java.util.List<FirewallAclsFetcher> allObjs = ModelHelper.getAllFirewallAclsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FIREWALLACL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallAclEntityScope.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE)) {
            java.util.List<FirewallRule> allObjs = ModelHelper.getAllFirewallRules();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FIREWALLRULES_FETCHER)) {
            java.util.List<FirewallRulesFetcher> allObjs = ModelHelper.getAllFirewallRulesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FIREWALLRULE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleAction.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleEntityScope.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleLocationEntityType.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleLocationType.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleNetworkType.values()));
        }
        
        if (type.equals(Constants.FIREWALLRULE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FirewallRuleWebFilterType.values()));
        }
        
        if (type.equals(Constants.FLOATINGIP)) {
            java.util.List<FloatingIp> allObjs = ModelHelper.getAllFloatingIps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOATINGIPS_FETCHER)) {
            java.util.List<FloatingIpsFetcher> allObjs = ModelHelper.getAllFloatingIpsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOATINGIP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIpEntityScope.values()));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLIST)) {
            java.util.List<ForwardingPathList> allObjs = ModelHelper.getAllForwardingPathLists();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FORWARDINGPATHLISTS_FETCHER)) {
            java.util.List<ForwardingPathListsFetcher> allObjs = ModelHelper.getAllForwardingPathListsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FORWARDINGPATHLIST_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingPathListEntityScope.values()));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY)) {
            java.util.List<ForwardingPathListEntry> allObjs = ModelHelper.getAllForwardingPathListEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FORWARDINGPATHLISTENTRIES_FETCHER)) {
            java.util.List<ForwardingPathListEntriesFetcher> allObjs = ModelHelper.getAllForwardingPathListEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_FCOVERRIDE_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingPathListEntryFCOverride.values()));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingPathListEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_FORWARDINGACTION_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingPathListEntryForwardingAction.values()));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_REMOTEUPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingPathListEntryRemoteUplinkPreference.values()));
        }
        
        if (type.equals(Constants.FORWARDINGPATHLISTENTRY_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(ForwardingPathListEntryUplinkPreference.values()));
        }
        
        if (type.equals(Constants.GATEWAY)) {
            java.util.List<Gateway> allObjs = ModelHelper.getAllGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYS_FETCHER)) {
            java.util.List<GatewaysFetcher> allObjs = ModelHelper.getAllGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayZFBMatchAttribute.values()));
        }
        
        if (type.equals(Constants.GATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.GATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAY_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayFamily.values()));
        }
        
        if (type.equals(Constants.GATEWAY_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayPermittedAction.values()));
        }
        
        if (type.equals(Constants.GATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayPersonality.values()));
        }
        
        if (type.equals(Constants.GATEWAY_VENDOR_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayVendor.values()));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT)) {
            java.util.List<GatewayRedundantPort> allObjs = ModelHelper.getAllGatewayRedundantPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYREDUNDANTPORTS_FETCHER)) {
            java.util.List<GatewayRedundantPortsFetcher> allObjs = ModelHelper.getAllGatewayRedundantPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayRedundantPortEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayRedundantPortPermittedAction.values()));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayRedundantPortPortType.values()));
        }
        
        if (type.equals(Constants.GATEWAYREDUNDANTPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayRedundantPortStatus.values()));
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA)) {
            java.util.List<GatewaySecuredData> allObjs = ModelHelper.getAllGatewaySecuredDatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYSECUREDDATAS_FETCHER)) {
            java.util.List<GatewaySecuredDatasFetcher> allObjs = ModelHelper.getAllGatewaySecuredDatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYSECUREDDATA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewaySecuredDataEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAYSECURITY)) {
            java.util.List<GatewaySecurity> allObjs = ModelHelper.getAllGatewaySecurities();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            java.util.List<GatewaySecuritiesFetcher> allObjs = ModelHelper.getAllGatewaySecuritiesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYSECURITY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewaySecurityEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAYSLOCATION)) {
            java.util.List<GatewaysLocation> allObjs = ModelHelper.getAllGatewaysLocations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYSLOCATIONS_FETCHER)) {
            java.util.List<GatewaysLocationsFetcher> allObjs = ModelHelper.getAllGatewaysLocationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYSLOCATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewaysLocationEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE)) {
            java.util.List<GatewayTemplate> allObjs = ModelHelper.getAllGatewayTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYTEMPLATES_FETCHER)) {
            java.util.List<GatewayTemplatesFetcher> allObjs = ModelHelper.getAllGatewayTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayTemplatePersonality.values()));
        }
        
        if (type.equals(Constants.GLOBALMETADATA)) {
            java.util.List<GlobalMetadata> allObjs = ModelHelper.getAllGlobalMetadatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            java.util.List<GlobalMetadatasFetcher> allObjs = ModelHelper.getAllGlobalMetadatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GLOBALMETADATA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GlobalMetadataEntityScope.values()));
        }
        
        if (type.equals(Constants.GNMIPROFILE)) {
            java.util.List<GNMIProfile> allObjs = ModelHelper.getAllGNMIProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GNMIPROFILES_FETCHER)) {
            java.util.List<GNMIProfilesFetcher> allObjs = ModelHelper.getAllGNMIProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GNMIPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GNMIProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.GNMISESSION)) {
            java.util.List<GNMISession> allObjs = ModelHelper.getAllGNMISessions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GNMISESSIONS_FETCHER)) {
            java.util.List<GNMISessionsFetcher> allObjs = ModelHelper.getAllGNMISessionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GNMISESSION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GNMISessionEntityScope.values()));
        }
        
        if (type.equals(Constants.GNMISESSION_GATEWAYVENDOR_ENUM)) {
            return new QueryResult(Arrays.asList(GNMISessionGatewayVendor.values()));
        }
        
        if (type.equals(Constants.GNMISESSION_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(GNMISessionStatus.values()));
        }
        
        if (type.equals(Constants.GNMISESSION_SUBSCRIPTIONSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(GNMISessionSubscriptionState.values()));
        }
        
        if (type.equals(Constants.GROUP)) {
            java.util.List<Group> allObjs = ModelHelper.getAllGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GROUPS_FETCHER)) {
            java.util.List<GroupsFetcher> allObjs = ModelHelper.getAllGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GroupEntityScope.values()));
        }
        
        if (type.equals(Constants.GROUP_MANAGEMENTMODE_ENUM)) {
            return new QueryResult(Arrays.asList(GroupManagementMode.values()));
        }
        
        if (type.equals(Constants.GROUP_ROLE_ENUM)) {
            return new QueryResult(Arrays.asList(GroupRole.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE)) {
            java.util.List<GroupKeyEncryptionProfile> allObjs = ModelHelper.getAllGroupKeyEncryptionProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER)) {
            java.util.List<GroupKeyEncryptionProfilesFetcher> allObjs = ModelHelper.getAllGroupKeyEncryptionProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEKPAYLOADSIGNINGALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_SEEDPAYLOADSIGNINGALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_TRAFFICAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE_TRAFFICENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(GroupKeyEncryptionProfileTrafficEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.HOSTINTERFACE)) {
            java.util.List<HostInterface> allObjs = ModelHelper.getAllHostInterfaces();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER)) {
            java.util.List<HostInterfacesFetcher> allObjs = ModelHelper.getAllHostInterfacesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.HOSTINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(HostInterfaceAttachedNetworkType.values()));
        }
        
        if (type.equals(Constants.HOSTINTERFACE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(HostInterfaceEntityScope.values()));
        }
        
        if (type.equals(Constants.HSC)) {
            java.util.List<HSC> allObjs = ModelHelper.getAllHSCs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.HSCS_FETCHER)) {
            java.util.List<HSCsFetcher> allObjs = ModelHelper.getAllHSCsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.HSC_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(HSCEntityScope.values()));
        }
        
        if (type.equals(Constants.HSC_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(HSCStatus.values()));
        }
        
        if (type.equals(Constants.HSC_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(HSCType.values()));
        }
        
        if (type.equals(Constants.ICMPECHOTESTDEFINITION)) {
            java.util.List<ICMPEchoTestDefinition> allObjs = ModelHelper.getAllICMPEchoTestDefinitions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ICMPECHOTESTDEFINITIONS_FETCHER)) {
            java.util.List<ICMPEchoTestDefinitionsFetcher> allObjs = ModelHelper.getAllICMPEchoTestDefinitionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IDPPROFILE)) {
            java.util.List<IDPProfile> allObjs = ModelHelper.getAllIDPProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IDPPROFILES_FETCHER)) {
            java.util.List<IDPProfilesFetcher> allObjs = ModelHelper.getAllIDPProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IDPPROFILEACTION)) {
            java.util.List<IDPProfileAction> allObjs = ModelHelper.getAllIDPProfileActions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IDPPROFILEACTIONS_FETCHER)) {
            java.util.List<IDPProfileActionsFetcher> allObjs = ModelHelper.getAllIDPProfileActionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IDPPROFILEACTION_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(IDPProfileActionAction.values()));
        }
        
        if (type.equals(Constants.IDPSIGNATURE)) {
            java.util.List<IDPSignature> allObjs = ModelHelper.getAllIDPSignatures();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IDPSIGNATURES_FETCHER)) {
            java.util.List<IDPSignaturesFetcher> allObjs = ModelHelper.getAllIDPSignaturesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKECERTIFICATE)) {
            java.util.List<IKECertificate> allObjs = ModelHelper.getAllIKECertificates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKECERTIFICATES_FETCHER)) {
            java.util.List<IKECertificatesFetcher> allObjs = ModelHelper.getAllIKECertificatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKECERTIFICATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKECertificateEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE)) {
            java.util.List<IKEEncryptionprofile> allObjs = ModelHelper.getAllIKEEncryptionprofiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEENCRYPTIONPROFILES_FETCHER)) {
            java.util.List<IKEEncryptionprofilesFetcher> allObjs = ModelHelper.getAllIKEEncryptionprofilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_DPDMODE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileDPDMode.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_IPSECAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileIPsecAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_IPSECENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileIPsecEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_IPSECSAREPLAYWINDOWSIZE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileIPsecSAReplayWindowSize.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPAUTHENTICATIONMODE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileISAKMPAuthenticationMode.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPDIFFIEHELMANGROUPIDENTIFIER_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileISAKMPEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ISAKMPHASHALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileISAKMPHashAlgorithm.values()));
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEEncryptionprofileEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAY)) {
            java.util.List<IKEGateway> allObjs = ModelHelper.getAllIKEGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYS_FETCHER)) {
            java.util.List<IKEGatewaysFetcher> allObjs = ModelHelper.getAllIKEGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAY_IKEVERSION_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayIKEVersion.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAY_IKEV1MODE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayIKEv1Mode.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAY_ASSOCIATEDCLOUDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayAssociatedCloudType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAY_CONFIGURATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConfigurationStatus.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG)) {
            java.util.List<IKEGatewayConfig> allObjs = ModelHelper.getAllIKEGatewayConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYCONFIGS_FETCHER)) {
            java.util.List<IKEGatewayConfigsFetcher> allObjs = ModelHelper.getAllIKEGatewayConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYCONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConfigEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION)) {
            java.util.List<IKEGatewayConnection> allObjs = ModelHelper.getAllIKEGatewayConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER)) {
            java.util.List<IKEGatewayConnectionsFetcher> allObjs = ModelHelper.getAllIKEGatewayConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYCONNECTION_NSGIDENTIFIERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionNSGIdentifierType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_NSGROLE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionNSGRole.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ASSOCIATEDCLOUDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionAssociatedCloudType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionAssociatedIKEAuthenticationType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_CONFIGURATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionConfigurationStatus.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE)) {
            java.util.List<IKEGatewayProfile> allObjs = ModelHelper.getAllIKEGatewayProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYPROFILES_FETCHER)) {
            java.util.List<IKEGatewayProfilesFetcher> allObjs = ModelHelper.getAllIKEGatewayProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEGATEWAYPROFILE_IKEGATEWAYIDENTIFIERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileIKEGatewayIdentifierType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ASSOCIATEDCLOUDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileAssociatedCloudType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileAssociatedIKEAuthenticationType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_CONFIGURATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileConfigurationStatus.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_SERVICECLASS_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileServiceClass.values()));
        }
        
        if (type.equals(Constants.IKEPSK)) {
            java.util.List<IKEPSK> allObjs = ModelHelper.getAllIKEPSKs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEPSKS_FETCHER)) {
            java.util.List<IKEPSKsFetcher> allObjs = ModelHelper.getAllIKEPSKsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKEPSK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEPSKEntityScope.values()));
        }
        
        if (type.equals(Constants.IKESUBNET)) {
            java.util.List<IKESubnet> allObjs = ModelHelper.getAllIKESubnets();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKESUBNETS_FETCHER)) {
            java.util.List<IKESubnetsFetcher> allObjs = ModelHelper.getAllIKESubnetsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IKESUBNET_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKESubnetEntityScope.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG)) {
            java.util.List<InfrastructureConfig> allObjs = ModelHelper.getAllInfrastructureConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER)) {
            java.util.List<InfrastructureConfigsFetcher> allObjs = ModelHelper.getAllInfrastructureConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTURECONFIG_CONFIGSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureConfigConfigStatus.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureConfigEntityScope.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE)) {
            java.util.List<InfrastructureAccessProfile> allObjs = ModelHelper.getAllInfrastructureAccessProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER)) {
            java.util.List<InfrastructureAccessProfilesFetcher> allObjs = ModelHelper.getAllInfrastructureAccessProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_SSHAUTHMODE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureAccessProfileSSHAuthMode.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureAccessProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_SOURCEIPFILTER_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureAccessProfileSourceIPFilter.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE)) {
            java.util.List<InfrastructureEVDFProfile> allObjs = ModelHelper.getAllInfrastructureEVDFProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER)) {
            java.util.List<InfrastructureEVDFProfilesFetcher> allObjs = ModelHelper.getAllInfrastructureEVDFProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureEVDFProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREEVDFPROFILE_NUAGEPLATFORM_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureEVDFProfileNuagePlatform.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE)) {
            java.util.List<InfrastructureGatewayProfile> allObjs = ModelHelper.getAllInfrastructureGatewayProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER)) {
            java.util.List<InfrastructureGatewayProfilesFetcher> allObjs = ModelHelper.getAllInfrastructureGatewayProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_CONTROLLERLESSFORWARDINGMODE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureGatewayProfileControllerLessForwardingMode.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureGatewayProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_REMOTELOGMODE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureGatewayProfileRemoteLogMode.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_UNDERLAYTESTUPLINKMODE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureGatewayProfileUnderlayTestUplinkMode.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_UPGRADEACTION_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureGatewayProfileUpgradeAction.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE)) {
            java.util.List<InfrastructureVscProfile> allObjs = ModelHelper.getAllInfrastructureVscProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER)) {
            java.util.List<InfrastructureVscProfilesFetcher> allObjs = ModelHelper.getAllInfrastructureVscProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE_ADDRESSFAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureVscProfileAddressFamily.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureVscProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE)) {
            java.util.List<IngressACLEntryTemplate> allObjs = ModelHelper.getAllIngressACLEntryTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            java.util.List<IngressACLEntryTemplatesFetcher> allObjs = ModelHelper.getAllIngressACLEntryTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateAction.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateLocationEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_REPUTATIONSCORE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateReputationScore.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateWebFilterType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE)) {
            java.util.List<IngressACLTemplate> allObjs = ModelHelper.getAllIngressACLTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            java.util.List<IngressACLTemplatesFetcher> allObjs = ModelHelper.getAllIngressACLTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE)) {
            java.util.List<IngressAdvFwdEntryTemplate> allObjs = ModelHelper.getAllIngressAdvFwdEntryTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            java.util.List<IngressAdvFwdEntryTemplatesFetcher> allObjs = ModelHelper.getAllIngressAdvFwdEntryTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_FCOVERRIDE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateFCOverride.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateAction.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ADDRESSOVERRIDETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateAddressOverrideType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_APPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateAppType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_FAILSAFEDATAPATH_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateFailsafeDatapath.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateLocationEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_REDIRECTREWRITETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateRedirectRewriteType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_REDIRECTIONTARGETENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateRedirectionTargetEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_REMOTEUPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateRemoteUplinkPreference.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateUplinkPreference.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateWebFilterType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE)) {
            java.util.List<IngressAdvFwdTemplate> allObjs = ModelHelper.getAllIngressAdvFwdTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            java.util.List<IngressAdvFwdTemplatesFetcher> allObjs = ModelHelper.getAllIngressAdvFwdTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE)) {
            java.util.List<IngressAuditACLEntryTemplate> allObjs = ModelHelper.getAllIngressAuditACLEntryTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER)) {
            java.util.List<IngressAuditACLEntryTemplatesFetcher> allObjs = ModelHelper.getAllIngressAuditACLEntryTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateAction.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateLocationEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_REPUTATIONSCORE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateReputationScore.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLEntryTemplateWebFilterType.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE)) {
            java.util.List<IngressAuditACLTemplate> allObjs = ModelHelper.getAllIngressAuditACLTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATES_FETCHER)) {
            java.util.List<IngressAuditACLTemplatesFetcher> allObjs = ModelHelper.getAllIngressAuditACLTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSAUDITACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAuditACLTemplatePriorityType.values()));
        }
        
        if (type.equals(Constants.INGRESSPROFILE)) {
            java.util.List<IngressProfile> allObjs = ModelHelper.getAllIngressProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSPROFILES_FETCHER)) {
            java.util.List<IngressProfilesFetcher> allObjs = ModelHelper.getAllIngressProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY)) {
            java.util.List<IngressQOSPolicy> allObjs = ModelHelper.getAllIngressQOSPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSQOSPOLICIES_FETCHER)) {
            java.util.List<IngressQOSPoliciesFetcher> allObjs = ModelHelper.getAllIngressQOSPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSQOSPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressQOSPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE1FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(IngressQOSPolicyQueue1ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE2FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(IngressQOSPolicyQueue2ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE3FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(IngressQOSPolicyQueue3ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.INGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM)) {
            return new QueryResult(Arrays.asList(IngressQOSPolicyQueue4ForwardingClasses.values()));
        }
        
        if (type.equals(Constants.IPFILTERPROFILE)) {
            java.util.List<IPFilterProfile> allObjs = ModelHelper.getAllIPFilterProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IPFILTERPROFILES_FETCHER)) {
            java.util.List<IPFilterProfilesFetcher> allObjs = ModelHelper.getAllIPFilterProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IPFILTERPROFILE_BLOBTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IPFilterProfileBlobType.values()));
        }
        
        if (type.equals(Constants.IPFILTERPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IPFilterProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.IPRESERVATION)) {
            java.util.List<IPReservation> allObjs = ModelHelper.getAllIPReservations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IPRESERVATIONS_FETCHER)) {
            java.util.List<IPReservationsFetcher> allObjs = ModelHelper.getAllIPReservationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IPRESERVATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IPReservationEntityScope.values()));
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE)) {
            java.util.List<IPv6FilterProfile> allObjs = ModelHelper.getAllIPv6FilterProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IPV6FILTERPROFILES_FETCHER)) {
            java.util.List<IPv6FilterProfilesFetcher> allObjs = ModelHelper.getAllIPv6FilterProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.IPV6FILTERPROFILE_BLOBTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IPv6FilterProfileBlobType.values()));
        }
        
        if (type.equals(Constants.IPV6FILTERPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IPv6FilterProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.JOB)) {
            java.util.List<Job> allObjs = ModelHelper.getAllJobs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.JOBS_FETCHER)) {
            java.util.List<JobsFetcher> allObjs = ModelHelper.getAllJobsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.JOB_COMMAND_ENUM)) {
            return new QueryResult(Arrays.asList(JobCommand.values()));
        }
        
        if (type.equals(Constants.JOB_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(JobEntityScope.values()));
        }
        
        if (type.equals(Constants.JOB_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(JobStatus.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER)) {
            java.util.List<KeyServerMember> allObjs = ModelHelper.getAllKeyServerMembers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMEMBERS_FETCHER)) {
            java.util.List<KeyServerMembersFetcher> allObjs = ModelHelper.getAllKeyServerMembersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMEMBER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMemberEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR)) {
            java.util.List<KeyServerMonitor> allObjs = ModelHelper.getAllKeyServerMonitors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORS_FETCHER)) {
            java.util.List<KeyServerMonitorsFetcher> allObjs = ModelHelper.getAllKeyServerMonitorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED)) {
            java.util.List<KeyServerMonitorEncryptedSeed> allObjs = ModelHelper.getAllKeyServerMonitorEncryptedSeeds();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER)) {
            java.util.List<KeyServerMonitorEncryptedSeedsFetcher> allObjs = ModelHelper.getAllKeyServerMonitorEncryptedSeedsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorEncryptedSeedEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_SEEDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorEncryptedSeedSeedType.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED)) {
            java.util.List<KeyServerMonitorSeed> allObjs = ModelHelper.getAllKeyServerMonitorSeeds();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEEDS_FETCHER)) {
            java.util.List<KeyServerMonitorSeedsFetcher> allObjs = ModelHelper.getAllKeyServerMonitorSeedsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEED_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSeedEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED_SEEDTRAFFICAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSeedSeedTrafficAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED_SEEDTRAFFICENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSeedSeedTrafficEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED_SEEDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSeedSeedType.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK)) {
            java.util.List<KeyServerMonitorSEK> allObjs = ModelHelper.getAllKeyServerMonitorSEKs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEKS_FETCHER)) {
            java.util.List<KeyServerMonitorSEKsFetcher> allObjs = ModelHelper.getAllKeyServerMonitorSEKsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERMONITORSEK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSEKEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK_SEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSEKSeedPayloadAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK_SEEDPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerMonitorSEKSeedPayloadEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN)) {
            java.util.List<L2Domain> allObjs = ModelHelper.getAllL2Domains();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L2DOMAINS_FETCHER)) {
            java.util.List<L2DomainsFetcher> allObjs = ModelHelper.getAllL2DomainsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L2DOMAIN_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainDPI.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainIPType.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainEncryption.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainEntityScope.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_ENTITYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainEntityState.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_FLOWCOLLECTIONENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainFlowCollectionEnabled.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_FLOWLIMITENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainFlowLimitEnabled.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_L2ENCAPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainL2EncapType.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainMulticast.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainPolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_THREATINTELLIGENCEENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainThreatIntelligenceEnabled.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainUplinkPreference.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainUseGlobalMAC.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE)) {
            java.util.List<L2DomainTemplate> allObjs = ModelHelper.getAllL2DomainTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L2DOMAINTEMPLATES_FETCHER)) {
            java.util.List<L2DomainTemplatesFetcher> allObjs = ModelHelper.getAllL2DomainTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L2DOMAINTEMPLATE_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateDPI.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateIPType.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateEncryption.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_ENTITYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateEntityState.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateMulticast.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplatePolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateUseGlobalMAC.values()));
        }
        
        if (type.equals(Constants.L4SERVICE)) {
            java.util.List<L4Service> allObjs = ModelHelper.getAllL4Services();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L4SERVICES_FETCHER)) {
            java.util.List<L4ServicesFetcher> allObjs = ModelHelper.getAllL4ServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L4SERVICE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(L4ServiceEntityScope.values()));
        }
        
        if (type.equals(Constants.L4SERVICEGROUP)) {
            java.util.List<L4ServiceGroup> allObjs = ModelHelper.getAllL4ServiceGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L4SERVICEGROUPS_FETCHER)) {
            java.util.List<L4ServiceGroupsFetcher> allObjs = ModelHelper.getAllL4ServiceGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L4SERVICEGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(L4ServiceGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE)) {
            java.util.List<L7applicationsignature> allObjs = ModelHelper.getAllL7applicationsignatures();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER)) {
            java.util.List<L7applicationsignaturesFetcher> allObjs = ModelHelper.getAllL7applicationsignaturesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(L7applicationsignatureEntityScope.values()));
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION)) {
            java.util.List<LDAPConfiguration> allObjs = ModelHelper.getAllLDAPConfigurations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LDAPCONFIGURATIONS_FETCHER)) {
            java.util.List<LDAPConfigurationsFetcher> allObjs = ModelHelper.getAllLDAPConfigurationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LDAPCONFIGURATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(LDAPConfigurationEntityScope.values()));
        }
        
        if (type.equals(Constants.LICENSE)) {
            java.util.List<License> allObjs = ModelHelper.getAllLicenses();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LICENSES_FETCHER)) {
            java.util.List<LicensesFetcher> allObjs = ModelHelper.getAllLicensesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LICENSE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(LicenseEntityScope.values()));
        }
        
        if (type.equals(Constants.LICENSE_LICENSEENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(LicenseLicenseEncryption.values()));
        }
        
        if (type.equals(Constants.LICENSE_LICENSETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(LicenseLicenseType.values()));
        }
        
        if (type.equals(Constants.LICENSESTATUS)) {
            java.util.List<LicenseStatus> allObjs = ModelHelper.getAllLicenseStatus();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LICENSESTATUS_FETCHER)) {
            java.util.List<LicenseStatusFetcher> allObjs = ModelHelper.getAllLicenseStatusFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LICENSESTATUS_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(LicenseStatusEntityScope.values()));
        }
        
        if (type.equals(Constants.LINK)) {
            java.util.List<Link> allObjs = ModelHelper.getAllLinks();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LINKS_FETCHER)) {
            java.util.List<LinksFetcher> allObjs = ModelHelper.getAllLinksFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LINK_ACCEPTANCECRITERIA_ENUM)) {
            return new QueryResult(Arrays.asList(LinkAcceptanceCriteria.values()));
        }
        
        if (type.equals(Constants.LINK_ASSOCIATEDDESTINATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(LinkAssociatedDestinationType.values()));
        }
        
        if (type.equals(Constants.LINK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(LinkEntityScope.values()));
        }
        
        if (type.equals(Constants.LINK_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(LinkType.values()));
        }
        
        if (type.equals(Constants.LOCATION)) {
            java.util.List<Location> allObjs = ModelHelper.getAllLocations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LOCATIONS_FETCHER)) {
            java.util.List<LocationsFetcher> allObjs = ModelHelper.getAllLocationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LOCATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(LocationEntityScope.values()));
        }
        
        if (type.equals(Constants.LTEINFORMATION)) {
            java.util.List<LTEInformation> allObjs = ModelHelper.getAllLTEInformations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LTEINFORMATIONS_FETCHER)) {
            java.util.List<LTEInformationsFetcher> allObjs = ModelHelper.getAllLTEInformationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LTEINFORMATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(LTEInformationEntityScope.values()));
        }
        
        if (type.equals(Constants.LTESTATISTICS)) {
            java.util.List<Ltestatistics> allObjs = ModelHelper.getAllLtestatistics();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LTESTATISTICS_FETCHER)) {
            java.util.List<LtestatisticsFetcher> allObjs = ModelHelper.getAllLtestatisticsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MACFILTERPROFILE)) {
            java.util.List<MACFilterProfile> allObjs = ModelHelper.getAllMACFilterProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MACFILTERPROFILES_FETCHER)) {
            java.util.List<MACFilterProfilesFetcher> allObjs = ModelHelper.getAllMACFilterProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MACFILTERPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MACFilterProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.ME)) {
            java.util.List<Me> allObjs = ModelHelper.getAllMes();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MES_FETCHER)) {
            java.util.List<MesFetcher> allObjs = ModelHelper.getAllMesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ME_AVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(MeAvatarType.values()));
        }
        
        if (type.equals(Constants.ME_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MeEntityScope.values()));
        }
        
        if (type.equals(Constants.METADATA)) {
            java.util.List<Metadata> allObjs = ModelHelper.getAllMetadatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.METADATAS_FETCHER)) {
            java.util.List<MetadatasFetcher> allObjs = ModelHelper.getAllMetadatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.METADATA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MetadataEntityScope.values()));
        }
        
        if (type.equals(Constants.MIRRORDESTINATION)) {
            java.util.List<MirrorDestination> allObjs = ModelHelper.getAllMirrorDestinations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MIRRORDESTINATIONS_FETCHER)) {
            java.util.List<MirrorDestinationsFetcher> allObjs = ModelHelper.getAllMirrorDestinationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MIRRORDESTINATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MirrorDestinationEntityScope.values()));
        }
        
        if (type.equals(Constants.MIRRORDESTINATIONGROUP)) {
            java.util.List<MirrorDestinationGroup> allObjs = ModelHelper.getAllMirrorDestinationGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MIRRORDESTINATIONGROUPS_FETCHER)) {
            java.util.List<MirrorDestinationGroupsFetcher> allObjs = ModelHelper.getAllMirrorDestinationGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MIRRORDESTINATIONGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MirrorDestinationGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.MONITORINGPORT)) {
            java.util.List<MonitoringPort> allObjs = ModelHelper.getAllMonitoringPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MONITORINGPORTS_FETCHER)) {
            java.util.List<MonitoringPortsFetcher> allObjs = ModelHelper.getAllMonitoringPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MONITORINGPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MonitoringPortEntityScope.values()));
        }
        
        if (type.equals(Constants.MONITORINGPORT_RESILIENCYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(MonitoringPortResiliencyState.values()));
        }
        
        if (type.equals(Constants.MONITORINGPORT_STATE_ENUM)) {
            return new QueryResult(Arrays.asList(MonitoringPortState.values()));
        }
        
        if (type.equals(Constants.MONITORSCOPE)) {
            java.util.List<Monitorscope> allObjs = ModelHelper.getAllMonitorscopes();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MONITORSCOPES_FETCHER)) {
            java.util.List<MonitorscopesFetcher> allObjs = ModelHelper.getAllMonitorscopesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MONITORSCOPE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MonitorscopeEntityScope.values()));
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP)) {
            java.util.List<MultiCastChannelMap> allObjs = ModelHelper.getAllMultiCastChannelMaps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            java.util.List<MultiCastChannelMapsFetcher> allObjs = ModelHelper.getAllMultiCastChannelMapsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTCHANNELMAP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiCastChannelMapEntityScope.values()));
        }
        
        if (type.equals(Constants.MULTICASTLIST)) {
            java.util.List<MultiCastList> allObjs = ModelHelper.getAllMultiCastLists();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTLISTS_FETCHER)) {
            java.util.List<MultiCastListsFetcher> allObjs = ModelHelper.getAllMultiCastListsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTLIST_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiCastListEntityScope.values()));
        }
        
        if (type.equals(Constants.MULTICASTLIST_MCASTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiCastListMcastType.values()));
        }
        
        if (type.equals(Constants.MULTICASTRANGE)) {
            java.util.List<MultiCastRange> allObjs = ModelHelper.getAllMultiCastRanges();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTRANGES_FETCHER)) {
            java.util.List<MultiCastRangesFetcher> allObjs = ModelHelper.getAllMultiCastRangesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTRANGE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiCastRangeIPType.values()));
        }
        
        if (type.equals(Constants.MULTICASTRANGE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiCastRangeEntityScope.values()));
        }
        
        if (type.equals(Constants.MULTINICVPORT)) {
            java.util.List<MultiNICVPort> allObjs = ModelHelper.getAllMultiNICVPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTINICVPORTS_FETCHER)) {
            java.util.List<MultiNICVPortsFetcher> allObjs = ModelHelper.getAllMultiNICVPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTINICVPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiNICVPortEntityScope.values()));
        }
        
        if (type.equals(Constants.NATMAPENTRY)) {
            java.util.List<NATMapEntry> allObjs = ModelHelper.getAllNATMapEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NATMAPENTRIES_FETCHER)) {
            java.util.List<NATMapEntriesFetcher> allObjs = ModelHelper.getAllNATMapEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NATMAPENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NATMapEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.NATMAPENTRY_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NATMapEntryType.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY)) {
            java.util.List<NetconfGateway> allObjs = ModelHelper.getAllNetconfGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFGATEWAYS_FETCHER)) {
            java.util.List<NetconfGatewaysFetcher> allObjs = ModelHelper.getAllNetconfGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFGATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayZFBMatchAttribute.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayFamily.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayPermittedAction.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayPersonality.values()));
        }
        
        if (type.equals(Constants.NETCONFGATEWAY_VENDOR_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfGatewayVendor.values()));
        }
        
        if (type.equals(Constants.NETCONFMANAGER)) {
            java.util.List<NetconfManager> allObjs = ModelHelper.getAllNetconfManagers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFMANAGERS_FETCHER)) {
            java.util.List<NetconfManagersFetcher> allObjs = ModelHelper.getAllNetconfManagersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFMANAGER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfManagerEntityScope.values()));
        }
        
        if (type.equals(Constants.NETCONFMANAGER_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfManagerStatus.values()));
        }
        
        if (type.equals(Constants.NETCONFPROFILE)) {
            java.util.List<NetconfProfile> allObjs = ModelHelper.getAllNetconfProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFPROFILES_FETCHER)) {
            java.util.List<NetconfProfilesFetcher> allObjs = ModelHelper.getAllNetconfProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.NETCONFSESSION)) {
            java.util.List<NetconfSession> allObjs = ModelHelper.getAllNetconfSessions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFSESSIONS_FETCHER)) {
            java.util.List<NetconfSessionsFetcher> allObjs = ModelHelper.getAllNetconfSessionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETCONFSESSION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfSessionEntityScope.values()));
        }
        
        if (type.equals(Constants.NETCONFSESSION_GATEWAYVENDOR_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfSessionGatewayVendor.values()));
        }
        
        if (type.equals(Constants.NETCONFSESSION_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NetconfSessionStatus.values()));
        }
        
        if (type.equals(Constants.NETWORKLAYOUT)) {
            java.util.List<NetworkLayout> allObjs = ModelHelper.getAllNetworkLayouts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKLAYOUTS_FETCHER)) {
            java.util.List<NetworkLayoutsFetcher> allObjs = ModelHelper.getAllNetworkLayoutsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKLAYOUT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkLayoutEntityScope.values()));
        }
        
        if (type.equals(Constants.NETWORKLAYOUT_SERVICETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkLayoutServiceType.values()));
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP)) {
            java.util.List<NetworkMacroGroup> allObjs = ModelHelper.getAllNetworkMacroGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            java.util.List<NetworkMacroGroupsFetcher> allObjs = ModelHelper.getAllNetworkMacroGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKMACROGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkMacroGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP_MACROGROUPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkMacroGroupMacroGroupType.values()));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING)) {
            java.util.List<NetworkPerformanceBinding> allObjs = ModelHelper.getAllNetworkPerformanceBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            java.util.List<NetworkPerformanceBindingsFetcher> allObjs = ModelHelper.getAllNetworkPerformanceBindingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkPerformanceBindingEntityScope.values()));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT)) {
            java.util.List<NetworkPerformanceMeasurement> allObjs = ModelHelper.getAllNetworkPerformanceMeasurements();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER)) {
            java.util.List<NetworkPerformanceMeasurementsFetcher> allObjs = ModelHelper.getAllNetworkPerformanceMeasurementsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_NPMTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkPerformanceMeasurementNPMType.values()));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NetworkPerformanceMeasurementEntityScope.values()));
        }
        
        if (type.equals(Constants.NEXTHOP)) {
            java.util.List<NextHop> allObjs = ModelHelper.getAllNextHops();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NEXTHOPS_FETCHER)) {
            java.util.List<NextHopsFetcher> allObjs = ModelHelper.getAllNextHopsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NEXTHOP_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NextHopIPType.values()));
        }
        
        if (type.equals(Constants.NEXTHOP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NextHopEntityScope.values()));
        }
        
        if (type.equals(Constants.NEXTHOP_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NextHopType.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY)) {
            java.util.List<NSGateway> allObjs = ModelHelper.getAllNSGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYS_FETCHER)) {
            java.util.List<NSGatewaysFetcher> allObjs = ModelHelper.getAllNSGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAY_SSHSERVICE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewaySSHService.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_TPMSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayTPMStatus.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_ZFBMATCHATTRIBUTE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayZFBMatchAttribute.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONRELOADSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayConfigurationReloadState.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayConfigurationStatus.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURELOADBALANCING_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayConfigureLoadBalancing.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_DERIVEDSSHSERVICESTATE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayDerivedSSHServiceState.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayFamily.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_FUNCTIONS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayFunctions.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_INHERITEDSSHSERVICESTATE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayInheritedSSHServiceState.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_NETWORKACCELERATION_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayNetworkAcceleration.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayPermittedAction.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayPersonality.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_SYSLOGLEVEL_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewaySyslogLevel.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_TUNNELSHAPING_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayTunnelShaping.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYSCOUNT)) {
            java.util.List<NSGatewaysCount> allObjs = ModelHelper.getAllNSGatewaysCounts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYSCOUNTS_FETCHER)) {
            java.util.List<NSGatewaysCountsFetcher> allObjs = ModelHelper.getAllNSGatewaysCountsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYSCOUNT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewaysCountEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYMONITOR)) {
            java.util.List<NSGatewayMonitor> allObjs = ModelHelper.getAllNSGatewayMonitors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYMONITORS_FETCHER)) {
            java.util.List<NSGatewayMonitorsFetcher> allObjs = ModelHelper.getAllNSGatewayMonitorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYSUMMARY)) {
            java.util.List<NSGatewaySummary> allObjs = ModelHelper.getAllNSGatewaySummaries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYSUMMARIES_FETCHER)) {
            java.util.List<NSGatewaySummariesFetcher> allObjs = ModelHelper.getAllNSGatewaySummariesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYSUMMARY_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewaySummaryBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewaySummaryEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYSUMMARY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewaySummaryPersonality.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE)) {
            java.util.List<NSGatewayTemplate> allObjs = ModelHelper.getAllNSGatewayTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            java.util.List<NSGatewayTemplatesFetcher> allObjs = ModelHelper.getAllNSGatewayTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATE_SSHSERVICE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayTemplateSSHService.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE_INSTANCESSHOVERRIDE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayTemplateInstanceSSHOverride.values()));
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayTemplatePersonality.values()));
        }
        
        if (type.equals(Constants.NSGGROUP)) {
            java.util.List<NSGGroup> allObjs = ModelHelper.getAllNSGGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGGROUPS_FETCHER)) {
            java.util.List<NSGGroupsFetcher> allObjs = ModelHelper.getAllNSGGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGINFO)) {
            java.util.List<NSGInfo> allObjs = ModelHelper.getAllNSGInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGINFOS_FETCHER)) {
            java.util.List<NSGInfosFetcher> allObjs = ModelHelper.getAllNSGInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGINFO_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.NSGINFO_CMDSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoCmdStatus.values()));
        }
        
        if (type.equals(Constants.NSGINFO_CMDTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoCmdType.values()));
        }
        
        if (type.equals(Constants.NSGINFO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGINFO_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoFamily.values()));
        }
        
        if (type.equals(Constants.NSGINFO_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoPersonality.values()));
        }
        
        if (type.equals(Constants.NSGMIGRATIONPROFILE)) {
            java.util.List<NSGMigrationProfile> allObjs = ModelHelper.getAllNSGMigrationProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGMIGRATIONPROFILES_FETCHER)) {
            java.util.List<NSGMigrationProfilesFetcher> allObjs = ModelHelper.getAllNSGMigrationProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGMIGRATIONPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGMigrationProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGPATCHPROFILE)) {
            java.util.List<NSGPatchProfile> allObjs = ModelHelper.getAllNSGPatchProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGPATCHPROFILES_FETCHER)) {
            java.util.List<NSGPatchProfilesFetcher> allObjs = ModelHelper.getAllNSGPatchProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGPATCHPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGPatchProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP)) {
            java.util.List<NSRedundantGatewayGroup> allObjs = ModelHelper.getAllNSRedundantGatewayGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER)) {
            java.util.List<NSRedundantGatewayGroupsFetcher> allObjs = ModelHelper.getAllNSRedundantGatewayGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSRedundantGatewayGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(NSRedundantGatewayGroupPermittedAction.values()));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NSRedundantGatewayGroupPersonality.values()));
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP_REDUNDANTGATEWAYSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSRedundantGatewayGroupRedundantGatewayStatus.values()));
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING)) {
            java.util.List<NSGRoutingPolicyBinding> allObjs = ModelHelper.getAllNSGRoutingPolicyBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGROUTINGPOLICYBINDINGS_FETCHER)) {
            java.util.List<NSGRoutingPolicyBindingsFetcher> allObjs = ModelHelper.getAllNSGRoutingPolicyBindingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGRoutingPolicyBindingEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGROUTINGPOLICYBINDING_EXPORTTOOVERLAY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGRoutingPolicyBindingExportToOverlay.values()));
        }
        
        if (type.equals(Constants.NSGUPGRADEPROFILE)) {
            java.util.List<NSGUpgradeProfile> allObjs = ModelHelper.getAllNSGUpgradeProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGUPGRADEPROFILES_FETCHER)) {
            java.util.List<NSGUpgradeProfilesFetcher> allObjs = ModelHelper.getAllNSGUpgradeProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGUPGRADEPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGUpgradeProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.NSPORT)) {
            java.util.List<NSPort> allObjs = ModelHelper.getAllNSPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSPORTS_FETCHER)) {
            java.util.List<NSPortsFetcher> allObjs = ModelHelper.getAllNSPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSPORT_NATTRAVERSAL_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortNATTraversal.values()));
        }
        
        if (type.equals(Constants.NSPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortEntityScope.values()));
        }
        
        if (type.equals(Constants.NSPORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortPermittedAction.values()));
        }
        
        if (type.equals(Constants.NSPORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortPortType.values()));
        }
        
        if (type.equals(Constants.NSPORT_SPEED_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortSpeed.values()));
        }
        
        if (type.equals(Constants.NSPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortStatus.values()));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE)) {
            java.util.List<NSPortTemplate> allObjs = ModelHelper.getAllNSPortTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSPORTTEMPLATES_FETCHER)) {
            java.util.List<NSPortTemplatesFetcher> allObjs = ModelHelper.getAllNSPortTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSPORTTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortTemplatePortType.values()));
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE_SPEED_ENUM)) {
            return new QueryResult(Arrays.asList(NSPortTemplateSpeed.values()));
        }
        
        if (type.equals(Constants.REDUNDANTPORT)) {
            java.util.List<RedundantPort> allObjs = ModelHelper.getAllRedundantPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDUNDANTPORTS_FETCHER)) {
            java.util.List<RedundantPortsFetcher> allObjs = ModelHelper.getAllRedundantPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedundantPortEntityScope.values()));
        }
        
        if (type.equals(Constants.REDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(RedundantPortPermittedAction.values()));
        }
        
        if (type.equals(Constants.REDUNDANTPORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedundantPortPortType.values()));
        }
        
        if (type.equals(Constants.REDUNDANTPORT_SPEED_ENUM)) {
            return new QueryResult(Arrays.asList(RedundantPortSpeed.values()));
        }
        
        if (type.equals(Constants.REDUNDANTPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(RedundantPortStatus.values()));
        }
        
        if (type.equals(Constants.OSPFAREA)) {
            java.util.List<OSPFArea> allObjs = ModelHelper.getAllOSPFAreas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OSPFAREAS_FETCHER)) {
            java.util.List<OSPFAreasFetcher> allObjs = ModelHelper.getAllOSPFAreasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OSPFAREA_AREATYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFAreaAreaType.values()));
        }
        
        if (type.equals(Constants.OSPFAREA_DEFAULTORIGINATEOPTION_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFAreaDefaultOriginateOption.values()));
        }
        
        if (type.equals(Constants.OSPFAREA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFAreaEntityScope.values()));
        }
        
        if (type.equals(Constants.OSPFINSTANCE)) {
            java.util.List<OSPFInstance> allObjs = ModelHelper.getAllOSPFInstances();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OSPFINSTANCES_FETCHER)) {
            java.util.List<OSPFInstancesFetcher> allObjs = ModelHelper.getAllOSPFInstancesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OSPFINSTANCE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInstanceIPType.values()));
        }
        
        if (type.equals(Constants.OSPFINSTANCE_OSPFTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInstanceOSPFType.values()));
        }
        
        if (type.equals(Constants.OSPFINSTANCE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInstanceEntityScope.values()));
        }
        
        if (type.equals(Constants.OSPFINTERFACE)) {
            java.util.List<OSPFInterface> allObjs = ModelHelper.getAllOSPFInterfaces();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OSPFINTERFACES_FETCHER)) {
            java.util.List<OSPFInterfacesFetcher> allObjs = ModelHelper.getAllOSPFInterfacesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OSPFINTERFACE_ADMINSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInterfaceAdminState.values()));
        }
        
        if (type.equals(Constants.OSPFINTERFACE_AUTHENTICATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInterfaceAuthenticationType.values()));
        }
        
        if (type.equals(Constants.OSPFINTERFACE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInterfaceEntityScope.values()));
        }
        
        if (type.equals(Constants.OSPFINTERFACE_INTERFACETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OSPFInterfaceInterfaceType.values()));
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL)) {
            java.util.List<OverlayAddressPool> allObjs = ModelHelper.getAllOverlayAddressPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER)) {
            java.util.List<OverlayAddressPoolsFetcher> allObjs = ModelHelper.getAllOverlayAddressPoolsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOL_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayAddressPoolIPType.values()));
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayAddressPoolEntityScope.values()));
        }
        
        if (type.equals(Constants.OVERLAYMANAGEMENTPROFILE)) {
            java.util.List<OverlayManagementProfile> allObjs = ModelHelper.getAllOverlayManagementProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTPROFILES_FETCHER)) {
            java.util.List<OverlayManagementProfilesFetcher> allObjs = ModelHelper.getAllOverlayManagementProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILE)) {
            java.util.List<OverlayManagementSubnetProfile> allObjs = ModelHelper.getAllOverlayManagementSubnetProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILES_FETCHER)) {
            java.util.List<OverlayManagementSubnetProfilesFetcher> allObjs = ModelHelper.getAllOverlayManagementSubnetProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION)) {
            java.util.List<OverlayMirrorDestination> allObjs = ModelHelper.getAllOverlayMirrorDestinations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONS_FETCHER)) {
            java.util.List<OverlayMirrorDestinationsFetcher> allObjs = ModelHelper.getAllOverlayMirrorDestinationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_DESTINATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationDestinationType.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_ENDPOINTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationEndPointType.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationEntityScope.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATION_TRIGGERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationTriggerType.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE)) {
            java.util.List<OverlayMirrorDestinationTemplate> allObjs = ModelHelper.getAllOverlayMirrorDestinationTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATES_FETCHER)) {
            java.util.List<OverlayMirrorDestinationTemplatesFetcher> allObjs = ModelHelper.getAllOverlayMirrorDestinationTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_DESTINATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationTemplateDestinationType.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENDPOINTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationTemplateEndPointType.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_TRIGGERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayMirrorDestinationTemplateTriggerType.values()));
        }
        
        if (type.equals(Constants.OVERLAYPATNATENTRY)) {
            java.util.List<OverlayPATNATEntry> allObjs = ModelHelper.getAllOverlayPATNATEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYPATNATENTRIES_FETCHER)) {
            java.util.List<OverlayPATNATEntriesFetcher> allObjs = ModelHelper.getAllOverlayPATNATEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYPATNATENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(OverlayPATNATEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.PATCH)) {
            java.util.List<Patch> allObjs = ModelHelper.getAllPatchs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATCHS_FETCHER)) {
            java.util.List<PatchsFetcher> allObjs = ModelHelper.getAllPatchsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATCH_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PatchEntityScope.values()));
        }
        
        if (type.equals(Constants.PATIPENTRY)) {
            java.util.List<PATIPEntry> allObjs = ModelHelper.getAllPATIPEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATIPENTRIES_FETCHER)) {
            java.util.List<PATIPEntriesFetcher> allObjs = ModelHelper.getAllPATIPEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATIPENTRY_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PATIPEntryIPType.values()));
        }
        
        if (type.equals(Constants.PATIPENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PATIPEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.PATMAPPER)) {
            java.util.List<PATMapper> allObjs = ModelHelper.getAllPATMappers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATMAPPERS_FETCHER)) {
            java.util.List<PATMappersFetcher> allObjs = ModelHelper.getAllPATMappersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATMAPPER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PATMapperEntityScope.values()));
        }
        
        if (type.equals(Constants.PATNATPOOL)) {
            java.util.List<PATNATPool> allObjs = ModelHelper.getAllPATNATPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER)) {
            java.util.List<PATNATPoolsFetcher> allObjs = ModelHelper.getAllPATNATPoolsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATNATPOOL_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PATNATPoolIPType.values()));
        }
        
        if (type.equals(Constants.PATNATPOOL_ASSOCIATEDGATEWAYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PATNATPoolAssociatedGatewayType.values()));
        }
        
        if (type.equals(Constants.PATNATPOOL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PATNATPoolEntityScope.values()));
        }
        
        if (type.equals(Constants.PATNATPOOL_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(PATNATPoolPermittedAction.values()));
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR)) {
            java.util.List<PerformanceMonitor> allObjs = ModelHelper.getAllPerformanceMonitors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            java.util.List<PerformanceMonitorsFetcher> allObjs = ModelHelper.getAllPerformanceMonitorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PERFORMANCEMONITOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PerformanceMonitorEntityScope.values()));
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR_PROBETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PerformanceMonitorProbeType.values()));
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR_SERVICECLASS_ENUM)) {
            return new QueryResult(Arrays.asList(PerformanceMonitorServiceClass.values()));
        }
        
        if (type.equals(Constants.PERMISSION)) {
            java.util.List<Permission> allObjs = ModelHelper.getAllPermissions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER)) {
            java.util.List<PermissionsFetcher> allObjs = ModelHelper.getAllPermissionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PERMISSION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PermissionEntityScope.values()));
        }
        
        if (type.equals(Constants.PERMISSION_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(PermissionPermittedAction.values()));
        }
        
        if (type.equals(Constants.PGEXPRESSION)) {
            java.util.List<PGExpression> allObjs = ModelHelper.getAllPGExpressions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PGEXPRESSIONS_FETCHER)) {
            java.util.List<PGExpressionsFetcher> allObjs = ModelHelper.getAllPGExpressionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PGEXPRESSION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PGExpressionEntityScope.values()));
        }
        
        if (type.equals(Constants.PGEXPRESSIONTEMPLATE)) {
            java.util.List<PGExpressionTemplate> allObjs = ModelHelper.getAllPGExpressionTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PGEXPRESSIONTEMPLATES_FETCHER)) {
            java.util.List<PGExpressionTemplatesFetcher> allObjs = ModelHelper.getAllPGExpressionTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PGEXPRESSIONTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PGExpressionTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYDECISION)) {
            java.util.List<PolicyDecision> allObjs = ModelHelper.getAllPolicyDecisions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYDECISIONS_FETCHER)) {
            java.util.List<PolicyDecisionsFetcher> allObjs = ModelHelper.getAllPolicyDecisionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYDECISION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyDecisionEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYENTRY)) {
            java.util.List<PolicyEntry> allObjs = ModelHelper.getAllPolicyEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYENTRIES_FETCHER)) {
            java.util.List<PolicyEntriesFetcher> allObjs = ModelHelper.getAllPolicyEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYGROUP)) {
            java.util.List<PolicyGroup> allObjs = ModelHelper.getAllPolicyGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER)) {
            java.util.List<PolicyGroupsFetcher> allObjs = ModelHelper.getAllPolicyGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYGROUP_ENTITYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupEntityState.values()));
        }
        
        if (type.equals(Constants.POLICYGROUP_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupType.values()));
        }
        
        if (type.equals(Constants.POLICYGROUPCATEGORY)) {
            java.util.List<PolicyGroupCategory> allObjs = ModelHelper.getAllPolicyGroupCategories();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYGROUPCATEGORIES_FETCHER)) {
            java.util.List<PolicyGroupCategoriesFetcher> allObjs = ModelHelper.getAllPolicyGroupCategoriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYGROUPCATEGORY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupCategoryEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE)) {
            java.util.List<PolicyGroupTemplate> allObjs = ModelHelper.getAllPolicyGroupTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYGROUPTEMPLATES_FETCHER)) {
            java.util.List<PolicyGroupTemplatesFetcher> allObjs = ModelHelper.getAllPolicyGroupTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYGROUPTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupTemplateType.values()));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP)) {
            java.util.List<PolicyObjectGroup> allObjs = ModelHelper.getAllPolicyObjectGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYOBJECTGROUPS_FETCHER)) {
            java.util.List<PolicyObjectGroupsFetcher> allObjs = ModelHelper.getAllPolicyObjectGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYOBJECTGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyObjectGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.POLICYOBJECTGROUP_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyObjectGroupType.values()));
        }
        
        if (type.equals(Constants.POLICYSTATEMENT)) {
            java.util.List<PolicyStatement> allObjs = ModelHelper.getAllPolicyStatements();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYSTATEMENTS_FETCHER)) {
            java.util.List<PolicyStatementsFetcher> allObjs = ModelHelper.getAllPolicyStatementsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.POLICYSTATEMENT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyStatementEntityScope.values()));
        }
        
        if (type.equals(Constants.PORT)) {
            java.util.List<Port> allObjs = ModelHelper.getAllPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORTS_FETCHER)) {
            java.util.List<PortsFetcher> allObjs = ModelHelper.getAllPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PortEntityScope.values()));
        }
        
        if (type.equals(Constants.PORT_OPERATIONALSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(PortOperationalState.values()));
        }
        
        if (type.equals(Constants.PORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(PortPermittedAction.values()));
        }
        
        if (type.equals(Constants.PORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PortPortType.values()));
        }
        
        if (type.equals(Constants.PORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(PortStatus.values()));
        }
        
        if (type.equals(Constants.NSPORTINFO)) {
            java.util.List<NSPortInfo> allObjs = ModelHelper.getAllNSPortInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSPORTINFOS_FETCHER)) {
            java.util.List<NSPortInfosFetcher> allObjs = ModelHelper.getAllNSPortInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORTMAPPING)) {
            java.util.List<PortMapping> allObjs = ModelHelper.getAllPortMappings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORTMAPPINGS_FETCHER)) {
            java.util.List<PortMappingsFetcher> allObjs = ModelHelper.getAllPortMappingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORTMAPPING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PortMappingEntityScope.values()));
        }
        
        if (type.equals(Constants.PORTTEMPLATE)) {
            java.util.List<PortTemplate> allObjs = ModelHelper.getAllPortTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORTTEMPLATES_FETCHER)) {
            java.util.List<PortTemplatesFetcher> allObjs = ModelHelper.getAllPortTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PORTTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PortTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.PORTTEMPLATE_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PortTemplatePortType.values()));
        }
        
        if (type.equals(Constants.PROXYARPFILTER)) {
            java.util.List<ProxyARPFilter> allObjs = ModelHelper.getAllProxyARPFilters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PROXYARPFILTERS_FETCHER)) {
            java.util.List<ProxyARPFiltersFetcher> allObjs = ModelHelper.getAllProxyARPFiltersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PROXYARPFILTER_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ProxyARPFilterIPType.values()));
        }
        
        if (type.equals(Constants.PROXYARPFILTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ProxyARPFilterEntityScope.values()));
        }
        
        if (type.equals(Constants.PSNATPOOL)) {
            java.util.List<PSNATPool> allObjs = ModelHelper.getAllPSNATPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PSNATPOOLS_FETCHER)) {
            java.util.List<PSNATPoolsFetcher> allObjs = ModelHelper.getAllPSNATPoolsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PSNATPOOL_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PSNATPoolIPType.values()));
        }
        
        if (type.equals(Constants.PSNATPOOL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PSNATPoolEntityScope.values()));
        }
        
        if (type.equals(Constants.PSPATMAP)) {
            java.util.List<PSPATMap> allObjs = ModelHelper.getAllPSPATMaps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PSPATMAPS_FETCHER)) {
            java.util.List<PSPATMapsFetcher> allObjs = ModelHelper.getAllPSPATMapsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PSPATMAP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PSPATMapEntityScope.values()));
        }
        
        if (type.equals(Constants.PSPATMAP_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(PSPATMapFamily.values()));
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP)) {
            java.util.List<PTranslationMap> allObjs = ModelHelper.getAllPTranslationMaps();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PTRANSLATIONMAPS_FETCHER)) {
            java.util.List<PTranslationMapsFetcher> allObjs = ModelHelper.getAllPTranslationMapsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PTRANSLATIONMAP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PTranslationMapEntityScope.values()));
        }
        
        if (type.equals(Constants.PTRANSLATIONMAP_MAPPINGTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PTranslationMapMappingType.values()));
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO)) {
            java.util.List<PublicNetworkMacro> allObjs = ModelHelper.getAllPublicNetworkMacros();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PUBLICNETWORKMACROS_FETCHER)) {
            java.util.List<PublicNetworkMacrosFetcher> allObjs = ModelHelper.getAllPublicNetworkMacrosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PUBLICNETWORKMACRO_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PublicNetworkMacroIPType.values()));
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(PublicNetworkMacroEntityScope.values()));
        }
        
        if (type.equals(Constants.QOS)) {
            java.util.List<QOS> allObjs = ModelHelper.getAllQOSs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.QOSS_FETCHER)) {
            java.util.List<QOSsFetcher> allObjs = ModelHelper.getAllQOSsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.QOS_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(QOSEntityScope.values()));
        }
        
        if (type.equals(Constants.QOS_SERVICECLASS_ENUM)) {
            return new QueryResult(Arrays.asList(QOSServiceClass.values()));
        }
        
        if (type.equals(Constants.QOSPOLICER)) {
            java.util.List<QosPolicer> allObjs = ModelHelper.getAllQosPolicers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.QOSPOLICERS_FETCHER)) {
            java.util.List<QosPolicersFetcher> allObjs = ModelHelper.getAllQosPolicersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.QOSPOLICER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(QosPolicerEntityScope.values()));
        }
        
        if (type.equals(Constants.RATELIMITER)) {
            java.util.List<RateLimiter> allObjs = ModelHelper.getAllRateLimiters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.RATELIMITERS_FETCHER)) {
            java.util.List<RateLimitersFetcher> allObjs = ModelHelper.getAllRateLimitersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.RATELIMITER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RateLimiterEntityScope.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET)) {
            java.util.List<RedirectionTarget> allObjs = ModelHelper.getAllRedirectionTargets();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            java.util.List<RedirectionTargetsFetcher> allObjs = ModelHelper.getAllRedirectionTargetsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDIRECTIONTARGET_DESTINATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetDestinationType.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET_ENDPOINTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetEndPointType.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetEntityScope.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET_TRIGGERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetTriggerType.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE)) {
            java.util.List<RedirectionTargetTemplate> allObjs = ModelHelper.getAllRedirectionTargetTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            java.util.List<RedirectionTargetTemplatesFetcher> allObjs = ModelHelper.getAllRedirectionTargetTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_DESTINATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetTemplateDestinationType.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENDPOINTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetTemplateEndPointType.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE_TRIGGERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedirectionTargetTemplateTriggerType.values()));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP)) {
            java.util.List<RedundancyGroup> allObjs = ModelHelper.getAllRedundancyGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDUNDANCYGROUPS_FETCHER)) {
            java.util.List<RedundancyGroupsFetcher> allObjs = ModelHelper.getAllRedundancyGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDUNDANCYGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RedundancyGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(RedundancyGroupPermittedAction.values()));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(RedundancyGroupPersonality.values()));
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP_REDUNDANTGATEWAYSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(RedundancyGroupRedundantGatewayStatus.values()));
        }
        
        if (type.equals(Constants.REMOTEVRSINFO)) {
            java.util.List<RemoteVrsInfo> allObjs = ModelHelper.getAllRemoteVrsInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REMOTEVRSINFOS_FETCHER)) {
            java.util.List<RemoteVrsInfosFetcher> allObjs = ModelHelper.getAllRemoteVrsInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REMOTEVRSINFO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RemoteVrsInfoEntityScope.values()));
        }
        
        if (type.equals(Constants.VMRESYNC)) {
            java.util.List<VMResync> allObjs = ModelHelper.getAllVMResyncs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMRESYNCS_FETCHER)) {
            java.util.List<VMResyncsFetcher> allObjs = ModelHelper.getAllVMResyncsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMRESYNC_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMResyncEntityScope.values()));
        }
        
        if (type.equals(Constants.VMRESYNC_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VMResyncStatus.values()));
        }
        
        if (type.equals(Constants.ROLE)) {
            java.util.List<Role> allObjs = ModelHelper.getAllRoles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROLES_FETCHER)) {
            java.util.List<RolesFetcher> allObjs = ModelHelper.getAllRolesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROLE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoleEntityScope.values()));
        }
        
        if (type.equals(Constants.ROLEENTRY)) {
            java.util.List<Roleentry> allObjs = ModelHelper.getAllRoleentries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROLEENTRIES_FETCHER)) {
            java.util.List<RoleentriesFetcher> allObjs = ModelHelper.getAllRoleentriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROLEENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoleentryEntityScope.values()));
        }
        
        if (type.equals(Constants.ROLEENTRY_ROLEACCESSTYPELIST_ENUM)) {
            return new QueryResult(Arrays.asList(RoleentryRoleAccessTypeList.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY)) {
            java.util.List<RoutingPolicy> allObjs = ModelHelper.getAllRoutingPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            java.util.List<RoutingPoliciesFetcher> allObjs = ModelHelper.getAllRoutingPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROUTINGPOLICY_CONTENTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyContentType.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_DEFAULTACTION_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyDefaultAction.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_ROUTINGPROTOCOL_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyRoutingProtocol.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING)) {
            java.util.List<RoutingPolicyBinding> allObjs = ModelHelper.getAllRoutingPolicyBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROUTINGPOLICYBINDINGS_FETCHER)) {
            java.util.List<RoutingPolicyBindingsFetcher> allObjs = ModelHelper.getAllRoutingPolicyBindingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROUTINGPOLICYBINDING_OSPFTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyBindingOSPFType.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyBindingEntityScope.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICYBINDING_EXPORTTOOVERLAY_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyBindingExportToOverlay.values()));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONGROUP)) {
            java.util.List<SaaSApplicationGroup> allObjs = ModelHelper.getAllSaaSApplicationGroups();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAASAPPLICATIONGROUPS_FETCHER)) {
            java.util.List<SaaSApplicationGroupsFetcher> allObjs = ModelHelper.getAllSaaSApplicationGroupsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAASAPPLICATIONGROUP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SaaSApplicationGroupEntityScope.values()));
        }
        
        if (type.equals(Constants.SAASAPPLICATIONTYPE)) {
            java.util.List<SaaSApplicationType> allObjs = ModelHelper.getAllSaaSApplicationTypes();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAASAPPLICATIONTYPES_FETCHER)) {
            java.util.List<SaaSApplicationTypesFetcher> allObjs = ModelHelper.getAllSaaSApplicationTypesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAASAPPLICATIONTYPE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SaaSApplicationTypeEntityScope.values()));
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE)) {
            java.util.List<SAPEgressQoSProfile> allObjs = ModelHelper.getAllSAPEgressQoSProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAPEGRESSQOSPROFILES_FETCHER)) {
            java.util.List<SAPEgressQoSProfilesFetcher> allObjs = ModelHelper.getAllSAPEgressQoSProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAPEGRESSQOSPROFILE_BLOBTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SAPEgressQoSProfileBlobType.values()));
        }
        
        if (type.equals(Constants.SAPEGRESSQOSPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SAPEgressQoSProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE)) {
            java.util.List<SAPIngressQoSProfile> allObjs = ModelHelper.getAllSAPIngressQoSProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAPINGRESSQOSPROFILES_FETCHER)) {
            java.util.List<SAPIngressQoSProfilesFetcher> allObjs = ModelHelper.getAllSAPIngressQoSProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SAPINGRESSQOSPROFILE_BLOBTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SAPIngressQoSProfileBlobType.values()));
        }
        
        if (type.equals(Constants.SAPINGRESSQOSPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SAPIngressQoSProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITE)) {
            java.util.List<ScheduledTestSuite> allObjs = ModelHelper.getAllScheduledTestSuites();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITES_FETCHER)) {
            java.util.List<ScheduledTestSuitesFetcher> allObjs = ModelHelper.getAllScheduledTestSuitesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITE_SCHEDULEINTERVALUNITS_ENUM)) {
            return new QueryResult(Arrays.asList(ScheduledTestSuiteScheduleIntervalUnits.values()));
        }
        
        if (type.equals(Constants.SCHEDULEDTESTSUITERUN)) {
            java.util.List<Scheduledtestsuiterun> allObjs = ModelHelper.getAllScheduledtestsuiteruns();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITERUNS_FETCHER)) {
            java.util.List<ScheduledtestsuiterunsFetcher> allObjs = ModelHelper.getAllScheduledtestsuiterunsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SCHEDULEDTESTSUITERUN_OPERATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ScheduledtestsuiterunOperationStatus.values()));
        }
        
        if (type.equals(Constants.WANSERVICE)) {
            java.util.List<WANService> allObjs = ModelHelper.getAllWANServices();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WANSERVICES_FETCHER)) {
            java.util.List<WANServicesFetcher> allObjs = ModelHelper.getAllWANServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WANSERVICE_CONFIGTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(WANServiceConfigType.values()));
        }
        
        if (type.equals(Constants.WANSERVICE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(WANServiceEntityScope.values()));
        }
        
        if (type.equals(Constants.WANSERVICE_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(WANServicePermittedAction.values()));
        }
        
        if (type.equals(Constants.WANSERVICE_SERVICETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(WANServiceServiceType.values()));
        }
        
        if (type.equals(Constants.WANSERVICE_TUNNELTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(WANServiceTunnelType.values()));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE)) {
            java.util.List<SharedNetworkResource> allObjs = ModelHelper.getAllSharedNetworkResources();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            java.util.List<SharedNetworkResourcesFetcher> allObjs = ModelHelper.getAllSharedNetworkResourcesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SharedNetworkResourceEntityScope.values()));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_PERMITTEDACTIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SharedNetworkResourcePermittedActionType.values()));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SharedNetworkResourceType.values()));
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(SharedNetworkResourceUseGlobalMAC.values()));
        }
        
        if (type.equals(Constants.SHUNTLINK)) {
            java.util.List<ShuntLink> allObjs = ModelHelper.getAllShuntLinks();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SHUNTLINKS_FETCHER)) {
            java.util.List<ShuntLinksFetcher> allObjs = ModelHelper.getAllShuntLinksFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SHUNTLINK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ShuntLinkEntityScope.values()));
        }
        
        if (type.equals(Constants.SHUNTLINK_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(ShuntLinkPermittedAction.values()));
        }
        
        if (type.equals(Constants.SITEINFO)) {
            java.util.List<SiteInfo> allObjs = ModelHelper.getAllSiteInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SITEINFOS_FETCHER)) {
            java.util.List<SiteInfosFetcher> allObjs = ModelHelper.getAllSiteInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SITEINFO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SiteInfoEntityScope.values()));
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL)) {
            java.util.List<SPATSourcesPool> allObjs = ModelHelper.getAllSPATSourcesPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SPATSOURCESPOOLS_FETCHER)) {
            java.util.List<SPATSourcesPoolsFetcher> allObjs = ModelHelper.getAllSPATSourcesPoolsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SPATSOURCESPOOL_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SPATSourcesPoolEntityScope.values()));
        }
        
        if (type.equals(Constants.SPATSOURCESPOOL_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(SPATSourcesPoolFamily.values()));
        }
        
        if (type.equals(Constants.SSHKEY)) {
            java.util.List<SSHKey> allObjs = ModelHelper.getAllSSHKeys();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SSHKEYS_FETCHER)) {
            java.util.List<SSHKeysFetcher> allObjs = ModelHelper.getAllSSHKeysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SSHKEY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SSHKeyEntityScope.values()));
        }
        
        if (type.equals(Constants.SSHKEY_KEYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SSHKeyKeyType.values()));
        }
        
        if (type.equals(Constants.SSIDCONNECTION)) {
            java.util.List<SSIDConnection> allObjs = ModelHelper.getAllSSIDConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SSIDCONNECTIONS_FETCHER)) {
            java.util.List<SSIDConnectionsFetcher> allObjs = ModelHelper.getAllSSIDConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SSIDCONNECTION_AUTHENTICATIONMODE_ENUM)) {
            return new QueryResult(Arrays.asList(SSIDConnectionAuthenticationMode.values()));
        }
        
        if (type.equals(Constants.SSIDCONNECTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SSIDConnectionEntityScope.values()));
        }
        
        if (type.equals(Constants.SSIDCONNECTION_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(SSIDConnectionPermittedAction.values()));
        }
        
        if (type.equals(Constants.SSIDCONNECTION_REDIRECTOPTION_ENUM)) {
            return new QueryResult(Arrays.asList(SSIDConnectionRedirectOption.values()));
        }
        
        if (type.equals(Constants.SSIDCONNECTION_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(SSIDConnectionStatus.values()));
        }
        
        if (type.equals(Constants.STATICROUTE)) {
            java.util.List<StaticRoute> allObjs = ModelHelper.getAllStaticRoutes();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATICROUTES_FETCHER)) {
            java.util.List<StaticRoutesFetcher> allObjs = ModelHelper.getAllStaticRoutesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATICROUTE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(StaticRouteIPType.values()));
        }
        
        if (type.equals(Constants.STATICROUTE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(StaticRouteEntityScope.values()));
        }
        
        if (type.equals(Constants.STATICROUTE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(StaticRouteType.values()));
        }
        
        if (type.equals(Constants.STATISTICS)) {
            java.util.List<Statistics> allObjs = ModelHelper.getAllStatistics();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATISTICS_FETCHER)) {
            java.util.List<StatisticsFetcher> allObjs = ModelHelper.getAllStatisticsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATSCOLLECTORINFO)) {
            java.util.List<StatsCollectorInfo> allObjs = ModelHelper.getAllStatsCollectorInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATSCOLLECTORINFOS_FETCHER)) {
            java.util.List<StatsCollectorInfosFetcher> allObjs = ModelHelper.getAllStatsCollectorInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATSCOLLECTORINFO_ADDRESSTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(StatsCollectorInfoAddressType.values()));
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(StatsCollectorInfoEntityScope.values()));
        }
        
        if (type.equals(Constants.STATISTICSPOLICY)) {
            java.util.List<StatisticsPolicy> allObjs = ModelHelper.getAllStatisticsPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            java.util.List<StatisticsPoliciesFetcher> allObjs = ModelHelper.getAllStatisticsPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATISTICSPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(StatisticsPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.SUBNET)) {
            java.util.List<Subnet> allObjs = ModelHelper.getAllSubnets();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SUBNETS_FETCHER)) {
            java.util.List<SubnetsFetcher> allObjs = ModelHelper.getAllSubnetsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SUBNET_DHCPRELAYSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetDHCPRelayStatus.values()));
        }
        
        if (type.equals(Constants.SUBNET_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetDPI.values()));
        }
        
        if (type.equals(Constants.SUBNET_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetIPType.values()));
        }
        
        if (type.equals(Constants.SUBNET_PATENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetPATEnabled.values()));
        }
        
        if (type.equals(Constants.SUBNET_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetEncryption.values()));
        }
        
        if (type.equals(Constants.SUBNET_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetEntityScope.values()));
        }
        
        if (type.equals(Constants.SUBNET_ENTITYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetEntityState.values()));
        }
        
        if (type.equals(Constants.SUBNET_L2ENCAPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetL2EncapType.values()));
        }
        
        if (type.equals(Constants.SUBNET_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.SUBNET_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetMulticast.values()));
        }
        
        if (type.equals(Constants.SUBNET_RESOURCETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetResourceType.values()));
        }
        
        if (type.equals(Constants.SUBNET_UNDERLAYENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetUnderlayEnabled.values()));
        }
        
        if (type.equals(Constants.SUBNET_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetUseGlobalMAC.values()));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE)) {
            java.util.List<SubnetTemplate> allObjs = ModelHelper.getAllSubnetTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SUBNETTEMPLATES_FETCHER)) {
            java.util.List<SubnetTemplatesFetcher> allObjs = ModelHelper.getAllSubnetTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SUBNETTEMPLATE_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetTemplateDPI.values()));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetTemplateIPType.values()));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetTemplateEncryption.values()));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetTemplateMulticast.values()));
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetTemplateUseGlobalMAC.values()));
        }
        
        if (type.equals(Constants.SUPPLEMENTALINFRACONFIG)) {
            java.util.List<SupplementalInfraConfig> allObjs = ModelHelper.getAllSupplementalInfraConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SUPPLEMENTALINFRACONFIGS_FETCHER)) {
            java.util.List<SupplementalInfraConfigsFetcher> allObjs = ModelHelper.getAllSupplementalInfraConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSLOGDESTINATION)) {
            java.util.List<SyslogDestination> allObjs = ModelHelper.getAllSyslogDestinations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSLOGDESTINATIONS_FETCHER)) {
            java.util.List<SyslogDestinationsFetcher> allObjs = ModelHelper.getAllSyslogDestinationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSLOGDESTINATION_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SyslogDestinationIPType.values()));
        }
        
        if (type.equals(Constants.SYSLOGDESTINATION_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SyslogDestinationType.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG)) {
            java.util.List<SystemConfig> allObjs = ModelHelper.getAllSystemConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSTEMCONFIGS_FETCHER)) {
            java.util.List<SystemConfigsFetcher> allObjs = ModelHelper.getAllSystemConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.SYSTEMCONFIG_CSPROOTAUTHENTICATIONMETHOD_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigCsprootAuthenticationMethod.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_DOMAINTUNNELTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigDomainTunnelType.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigEntityScope.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEKPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEKPAYLOADSIGNINGALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTSEEDPAYLOADSIGNINGALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTTRAFFICAUTHENTICATIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_GROUPKEYDEFAULTTRAFFICENCRYPTIONALGORITHM_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_LASTEXECUTEDMIGRATIONPHASE_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigLastExecutedMigrationPhase.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_SYSTEMAVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigSystemAvatarType.values()));
        }
        
        if (type.equals(Constants.SYSTEMCONFIG_WEBFILTERINGTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigWebFilteringType.values()));
        }
        
        if (type.equals(Constants.TCA)) {
            java.util.List<TCA> allObjs = ModelHelper.getAllTCAs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TCAS_FETCHER)) {
            java.util.List<TCAsFetcher> allObjs = ModelHelper.getAllTCAsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TCA_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(TCAAction.values()));
        }
        
        if (type.equals(Constants.TCA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TCAEntityScope.values()));
        }
        
        if (type.equals(Constants.TCA_METRIC_ENUM)) {
            return new QueryResult(Arrays.asList(TCAMetric.values()));
        }
        
        if (type.equals(Constants.TCA_PROTOCOL_ENUM)) {
            return new QueryResult(Arrays.asList(TCAProtocol.values()));
        }
        
        if (type.equals(Constants.TCA_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TCAType.values()));
        }
        
        if (type.equals(Constants.TEST)) {
            java.util.List<Test> allObjs = ModelHelper.getAllTests();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTS_FETCHER)) {
            java.util.List<TestsFetcher> allObjs = ModelHelper.getAllTestsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TEST_ASSOCIATEDTESTDEFINITIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestAssociatedTestDefinitionType.values()));
        }
        
        if (type.equals(Constants.TEST_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestEntityScope.values()));
        }
        
        if (type.equals(Constants.TESTDEFINITION)) {
            java.util.List<TestDefinition> allObjs = ModelHelper.getAllTestDefinitions();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTDEFINITIONS_FETCHER)) {
            java.util.List<TestDefinitionsFetcher> allObjs = ModelHelper.getAllTestDefinitionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTDEFINITION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestDefinitionEntityScope.values()));
        }
        
        if (type.equals(Constants.TESTRUN)) {
            java.util.List<TestRun> allObjs = ModelHelper.getAllTestRuns();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTRUNS_FETCHER)) {
            java.util.List<TestRunsFetcher> allObjs = ModelHelper.getAllTestRunsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTRUN_ASSOCIATEDTESTSUITERUNTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestRunAssociatedTestSuiteRunType.values()));
        }
        
        if (type.equals(Constants.TESTRUN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestRunEntityScope.values()));
        }
        
        if (type.equals(Constants.TESTRUN_OPERATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(TestRunOperationStatus.values()));
        }
        
        if (type.equals(Constants.TESTRUN_TESTRESULT_ENUM)) {
            return new QueryResult(Arrays.asList(TestRunTestResult.values()));
        }
        
        if (type.equals(Constants.TESTRUN_TESTRESULTDATATYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestRunTestResultDataType.values()));
        }
        
        if (type.equals(Constants.TESTRUN_UNDERLAYTESTCATEGORY_ENUM)) {
            return new QueryResult(Arrays.asList(TestRunUnderlayTestCategory.values()));
        }
        
        if (type.equals(Constants.TESTSUITE)) {
            java.util.List<TestSuite> allObjs = ModelHelper.getAllTestSuites();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTSUITES_FETCHER)) {
            java.util.List<TestSuitesFetcher> allObjs = ModelHelper.getAllTestSuitesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTSUITE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestSuiteEntityScope.values()));
        }
        
        if (type.equals(Constants.TESTSUITERUN)) {
            java.util.List<TestSuiteRun> allObjs = ModelHelper.getAllTestSuiteRuns();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTSUITERUNS_FETCHER)) {
            java.util.List<TestSuiteRunsFetcher> allObjs = ModelHelper.getAllTestSuiteRunsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TESTSUITERUN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TestSuiteRunEntityScope.values()));
        }
        
        if (type.equals(Constants.TESTSUITERUN_OPERATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(TestSuiteRunOperationStatus.values()));
        }
        
        if (type.equals(Constants.THREATPREVENTIONINFO)) {
            java.util.List<ThreatPreventionInfo> allObjs = ModelHelper.getAllThreatPreventionInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.THREATPREVENTIONINFOS_FETCHER)) {
            java.util.List<ThreatPreventionInfosFetcher> allObjs = ModelHelper.getAllThreatPreventionInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.THREATPREVENTIONINFO_CONFIGURATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ThreatPreventionInfoConfigurationStatus.values()));
        }
        
        if (type.equals(Constants.THREATPREVENTIONINFO_MANAGEMENTSERVERCONNECTIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ThreatPreventionInfoManagementServerConnectionStatus.values()));
        }
        
        if (type.equals(Constants.THREATPREVENTIONINFO_SERVICESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ThreatPreventionInfoServiceStatus.values()));
        }
        
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTION)) {
            java.util.List<ThreatPreventionServerConnection> allObjs = ModelHelper.getAllThreatPreventionServerConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTIONS_FETCHER)) {
            java.util.List<ThreatPreventionServerConnectionsFetcher> allObjs = ModelHelper.getAllThreatPreventionServerConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.THREATPREVENTIONSERVERCONNECTION_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ThreatPreventionServerConnectionStatus.values()));
        }
        
        if (type.equals(Constants.TIER)) {
            java.util.List<Tier> allObjs = ModelHelper.getAllTiers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TIERS_FETCHER)) {
            java.util.List<TiersFetcher> allObjs = ModelHelper.getAllTiersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TIER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TierEntityScope.values()));
        }
        
        if (type.equals(Constants.TIER_TIERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TierTierType.values()));
        }
        
        if (type.equals(Constants.TRUNK)) {
            java.util.List<Trunk> allObjs = ModelHelper.getAllTrunks();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TRUNKS_FETCHER)) {
            java.util.List<TrunksFetcher> allObjs = ModelHelper.getAllTrunksFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TRUNK_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TrunkEntityScope.values()));
        }
        
        if (type.equals(Constants.UNDERLAY)) {
            java.util.List<Underlay> allObjs = ModelHelper.getAllUnderlays();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UNDERLAYS_FETCHER)) {
            java.util.List<UnderlaysFetcher> allObjs = ModelHelper.getAllUnderlaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UNDERLAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(UnderlayEntityScope.values()));
        }
        
        if (type.equals(Constants.UNDERLAYTEST)) {
            java.util.List<UnderlayTest> allObjs = ModelHelper.getAllUnderlayTests();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UNDERLAYTESTS_FETCHER)) {
            java.util.List<UnderlayTestsFetcher> allObjs = ModelHelper.getAllUnderlayTestsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UNDERLAYTEST_TESTRESULT_ENUM)) {
            return new QueryResult(Arrays.asList(UnderlayTestTestResult.values()));
        }
        
        if (type.equals(Constants.UNDERLAYTEST_UNDERLAYTESTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(UnderlayTestUnderlayTestType.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION)) {
            java.util.List<UplinkConnection> allObjs = ModelHelper.getAllUplinkConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            java.util.List<UplinkConnectionsFetcher> allObjs = ModelHelper.getAllUplinkConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UPLINKCONNECTION_ADDRESSFAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionAddressFamily.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ADVERTISEMENTCRITERIA_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionAdvertisementCriteria.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_AUXMODE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionAuxMode.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionEntityScope.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_FECENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionFecEnabled.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_INTERFACECONNECTIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionInterfaceConnectionType.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_MODE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionMode.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ROLE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionRole.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_UPLINKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionUplinkType.values()));
        }
        
        if (type.equals(Constants.UPLINKRD)) {
            java.util.List<UplinkRD> allObjs = ModelHelper.getAllUplinkRDs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UPLINKRDS_FETCHER)) {
            java.util.List<UplinkRDsFetcher> allObjs = ModelHelper.getAllUplinkRDsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UPLINKRD_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkRDEntityScope.values()));
        }
        
        if (type.equals(Constants.UPLINKRD_UPLINKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkRDUplinkType.values()));
        }
        
        if (type.equals(Constants.USER)) {
            java.util.List<User> allObjs = ModelHelper.getAllUsers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.USERS_FETCHER)) {
            java.util.List<UsersFetcher> allObjs = ModelHelper.getAllUsersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.USER_AVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(UserAvatarType.values()));
        }
        
        if (type.equals(Constants.USER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(UserEntityScope.values()));
        }
        
        if (type.equals(Constants.USER_MANAGEMENTMODE_ENUM)) {
            return new QueryResult(Arrays.asList(UserManagementMode.values()));
        }
        
        if (type.equals(Constants.USERCONTEXT)) {
            java.util.List<UserContext> allObjs = ModelHelper.getAllUserContexts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.USERCONTEXTS_FETCHER)) {
            java.util.List<UserContextsFetcher> allObjs = ModelHelper.getAllUserContextsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.USERCONTEXT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(UserContextEntityScope.values()));
        }
        
        if (type.equals(Constants.USERCONTEXT_SYSTEMAVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(UserContextSystemAvatarType.values()));
        }
        
        if (type.equals(Constants.VCENTER)) {
            java.util.List<VCenter> allObjs = ModelHelper.getAllVCenters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERS_FETCHER)) {
            java.util.List<VCentersFetcher> allObjs = ModelHelper.getAllVCentersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTER_AVRSPROFILE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterAvrsProfile.values()));
        }
        
        if (type.equals(Constants.VCENTER_CPUCOUNT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterCpuCount.values()));
        }
        
        if (type.equals(Constants.VCENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTER_MEMORYSIZEINGB_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterMemorySizeInGB.values()));
        }
        
        if (type.equals(Constants.VCENTER_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterPersonality.values()));
        }
        
        if (type.equals(Constants.VCENTER_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterRemoteSyslogServerType.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER)) {
            java.util.List<VCenterCluster> allObjs = ModelHelper.getAllVCenterClusters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERCLUSTERS_FETCHER)) {
            java.util.List<VCenterClustersFetcher> allObjs = ModelHelper.getAllVCenterClustersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERCLUSTER_AVRSPROFILE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterAvrsProfile.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_CPUCOUNT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterCpuCount.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_MEMORYSIZEINGB_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterMemorySizeInGB.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterPersonality.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterRemoteSyslogServerType.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER)) {
            java.util.List<VCenterDataCenter> allObjs = ModelHelper.getAllVCenterDataCenters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERDATACENTERS_FETCHER)) {
            java.util.List<VCenterDataCentersFetcher> allObjs = ModelHelper.getAllVCenterDataCentersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERDATACENTER_AVRSPROFILE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterAvrsProfile.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_CPUCOUNT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterCpuCount.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_MEMORYSIZEINGB_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterMemorySizeInGB.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterPersonality.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterRemoteSyslogServerType.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR)) {
            java.util.List<VCenterHypervisor> allObjs = ModelHelper.getAllVCenterHypervisors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            java.util.List<VCenterHypervisorsFetcher> allObjs = ModelHelper.getAllVCenterHypervisorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERHYPERVISOR_VRSSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorVRSState.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_AVRSPROFILE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorAvrsProfile.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_CPUCOUNT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorCpuCount.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_MEMORYSIZEINGB_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorMemorySizeInGB.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorPersonality.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorRemoteSyslogServerType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY)) {
            java.util.List<VirtualFirewallPolicy> allObjs = ModelHelper.getAllVirtualFirewallPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALFIREWALLPOLICIES_FETCHER)) {
            java.util.List<VirtualFirewallPoliciesFetcher> allObjs = ModelHelper.getAllVirtualFirewallPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallPolicyPolicyState.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLPOLICY_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallPolicyPriorityType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE)) {
            java.util.List<VirtualFirewallRule> allObjs = ModelHelper.getAllVirtualFirewallRules();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALFIREWALLRULES_FETCHER)) {
            java.util.List<VirtualFirewallRulesFetcher> allObjs = ModelHelper.getAllVirtualFirewallRulesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALFIREWALLRULE_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleAction.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_APPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleAppType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_ASSOCIATEDTRAFFICTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleAssociatedTrafficType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleEntityScope.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_FAILSAFEDATAPATH_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleFailsafeDatapath.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_LOCATIONENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleLocationEntityType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleLocationType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_NETWORKENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleNetworkEntityType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleNetworkType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRulePolicyState.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_REMOTEUPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleRemoteUplinkPreference.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_REPUTATIONSCORE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleReputationScore.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleType.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleUplinkPreference.values()));
        }
        
        if (type.equals(Constants.VIRTUALFIREWALLRULE_WEBFILTERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualFirewallRuleWebFilterType.values()));
        }
        
        if (type.equals(Constants.VIRTUALIP)) {
            java.util.List<VirtualIP> allObjs = ModelHelper.getAllVirtualIPs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER)) {
            java.util.List<VirtualIPsFetcher> allObjs = ModelHelper.getAllVirtualIPsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALIP_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualIPIPType.values()));
        }
        
        if (type.equals(Constants.VIRTUALIP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualIPEntityScope.values()));
        }
        
        if (type.equals(Constants.VIRTUALUPLINK)) {
            java.util.List<VirtualUplink> allObjs = ModelHelper.getAllVirtualUplinks();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALUPLINKS_FETCHER)) {
            java.util.List<VirtualUplinksFetcher> allObjs = ModelHelper.getAllVirtualUplinksFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALUPLINK_AUXMODE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualUplinkAuxMode.values()));
        }
        
        if (type.equals(Constants.VIRTUALUPLINK_FECENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualUplinkFecEnabled.values()));
        }
        
        if (type.equals(Constants.VIRTUALUPLINK_ROLE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualUplinkRole.values()));
        }
        
        if (type.equals(Constants.VLAN)) {
            java.util.List<VLAN> allObjs = ModelHelper.getAllVLANs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLANS_FETCHER)) {
            java.util.List<VLANsFetcher> allObjs = ModelHelper.getAllVLANsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLAN_ASSOCIATEDCONNECTIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANAssociatedConnectionType.values()));
        }
        
        if (type.equals(Constants.VLAN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANEntityScope.values()));
        }
        
        if (type.equals(Constants.VLAN_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(VLANPermittedAction.values()));
        }
        
        if (type.equals(Constants.VLAN_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VLANStatus.values()));
        }
        
        if (type.equals(Constants.VLAN_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANType.values()));
        }
        
        if (type.equals(Constants.VLANTEMPLATE)) {
            java.util.List<VLANTemplate> allObjs = ModelHelper.getAllVLANTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER)) {
            java.util.List<VLANTemplatesFetcher> allObjs = ModelHelper.getAllVLANTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLANTEMPLATE_ASSOCIATEDCONNECTIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANTemplateAssociatedConnectionType.values()));
        }
        
        if (type.equals(Constants.VLANTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.VLANTEMPLATE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANTemplateType.values()));
        }
        
        if (type.equals(Constants.VM)) {
            java.util.List<VM> allObjs = ModelHelper.getAllVMs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMS_FETCHER)) {
            java.util.List<VMsFetcher> allObjs = ModelHelper.getAllVMsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VM_DELETEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(VMDeleteMode.values()));
        }
        
        if (type.equals(Constants.VM_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMEntityScope.values()));
        }
        
        if (type.equals(Constants.VM_REASONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMReasonType.values()));
        }
        
        if (type.equals(Constants.VM_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VMStatus.values()));
        }
        
        if (type.equals(Constants.VMINTERFACE)) {
            java.util.List<VMInterface> allObjs = ModelHelper.getAllVMInterfaces();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER)) {
            java.util.List<VMInterfacesFetcher> allObjs = ModelHelper.getAllVMInterfacesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMInterfaceAttachedNetworkType.values()));
        }
        
        if (type.equals(Constants.VMINTERFACE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMInterfaceEntityScope.values()));
        }
        
        if (type.equals(Constants.VMIPRESERVATION)) {
            java.util.List<VMIPReservation> allObjs = ModelHelper.getAllVMIPReservations();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMIPRESERVATIONS_FETCHER)) {
            java.util.List<VMIPReservationsFetcher> allObjs = ModelHelper.getAllVMIPReservationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VMIPRESERVATION_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMIPReservationIPType.values()));
        }
        
        if (type.equals(Constants.VMIPRESERVATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VMIPReservationEntityScope.values()));
        }
        
        if (type.equals(Constants.VMIPRESERVATION_STATE_ENUM)) {
            return new QueryResult(Arrays.asList(VMIPReservationState.values()));
        }
        
        if (type.equals(Constants.VNF)) {
            java.util.List<VNF> allObjs = ModelHelper.getAllVNFs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFS_FETCHER)) {
            java.util.List<VNFsFetcher> allObjs = ModelHelper.getAllVNFsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNF_ALLOWEDACTIONS_ENUM)) {
            return new QueryResult(Arrays.asList(VNFAllowedActions.values()));
        }
        
        if (type.equals(Constants.VNF_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFEntityScope.values()));
        }
        
        if (type.equals(Constants.VNF_LASTUSERACTION_ENUM)) {
            return new QueryResult(Arrays.asList(VNFLastUserAction.values()));
        }
        
        if (type.equals(Constants.VNF_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VNFStatus.values()));
        }
        
        if (type.equals(Constants.VNF_TASKSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFTaskState.values()));
        }
        
        if (type.equals(Constants.VNF_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFType.values()));
        }
        
        if (type.equals(Constants.VNFCATALOG)) {
            java.util.List<VNFCatalog> allObjs = ModelHelper.getAllVNFCatalogs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFCATALOGS_FETCHER)) {
            java.util.List<VNFCatalogsFetcher> allObjs = ModelHelper.getAllVNFCatalogsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFCATALOG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFCatalogEntityScope.values()));
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR)) {
            java.util.List<VNFDescriptor> allObjs = ModelHelper.getAllVNFDescriptors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFDESCRIPTORS_FETCHER)) {
            java.util.List<VNFDescriptorsFetcher> allObjs = ModelHelper.getAllVNFDescriptorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFDESCRIPTOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFDescriptorEntityScope.values()));
        }
        
        if (type.equals(Constants.VNFDESCRIPTOR_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFDescriptorType.values()));
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING)) {
            java.util.List<VNFDomainMapping> allObjs = ModelHelper.getAllVNFDomainMappings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFDOMAINMAPPINGS_FETCHER)) {
            java.util.List<VNFDomainMappingsFetcher> allObjs = ModelHelper.getAllVNFDomainMappingsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFDOMAINMAPPING_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFDomainMappingEntityScope.values()));
        }
        
        if (type.equals(Constants.VNFDOMAINMAPPING_SEGMENTATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFDomainMappingSegmentationType.values()));
        }
        
        if (type.equals(Constants.VNFINTERFACE)) {
            java.util.List<VNFInterface> allObjs = ModelHelper.getAllVNFInterfaces();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFINTERFACES_FETCHER)) {
            java.util.List<VNFInterfacesFetcher> allObjs = ModelHelper.getAllVNFInterfacesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFINTERFACE_ATTACHEDNETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFInterfaceAttachedNetworkType.values()));
        }
        
        if (type.equals(Constants.VNFINTERFACE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFInterfaceEntityScope.values()));
        }
        
        if (type.equals(Constants.VNFINTERFACE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFInterfaceType.values()));
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR)) {
            java.util.List<VNFInterfaceDescriptor> allObjs = ModelHelper.getAllVNFInterfaceDescriptors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFINTERFACEDESCRIPTORS_FETCHER)) {
            java.util.List<VNFInterfaceDescriptorsFetcher> allObjs = ModelHelper.getAllVNFInterfaceDescriptorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFInterfaceDescriptorEntityScope.values()));
        }
        
        if (type.equals(Constants.VNFINTERFACEDESCRIPTOR_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFInterfaceDescriptorType.values()));
        }
        
        if (type.equals(Constants.VNFMETADATA)) {
            java.util.List<VNFMetadata> allObjs = ModelHelper.getAllVNFMetadatas();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFMETADATAS_FETCHER)) {
            java.util.List<VNFMetadatasFetcher> allObjs = ModelHelper.getAllVNFMetadatasFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFMETADATA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFMetadataEntityScope.values()));
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY)) {
            java.util.List<VNFThresholdPolicy> allObjs = ModelHelper.getAllVNFThresholdPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFTHRESHOLDPOLICIES_FETCHER)) {
            java.util.List<VNFThresholdPoliciesFetcher> allObjs = ModelHelper.getAllVNFThresholdPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VNFTHRESHOLDPOLICY_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(VNFThresholdPolicyAction.values()));
        }
        
        if (type.equals(Constants.VNFTHRESHOLDPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VNFThresholdPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.VPNCONNECTION)) {
            java.util.List<VPNConnection> allObjs = ModelHelper.getAllVPNConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            java.util.List<VPNConnectionsFetcher> allObjs = ModelHelper.getAllVPNConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPNCONNECTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPNConnectionEntityScope.values()));
        }
        
        if (type.equals(Constants.VPORT)) {
            java.util.List<VPort> allObjs = ModelHelper.getAllVPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORTS_FETCHER)) {
            java.util.List<VPortsFetcher> allObjs = ModelHelper.getAllVPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORT_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(VPortDPI.values()));
        }
        
        if (type.equals(Constants.VPORT_FIPIGNOREDEFAULTROUTE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortFIPIgnoreDefaultRoute.values()));
        }
        
        if (type.equals(Constants.VPORT_ADDRESSSPOOFING_ENUM)) {
            return new QueryResult(Arrays.asList(VPortAddressSpoofing.values()));
        }
        
        if (type.equals(Constants.VPORT_ASSOCIATEDGATEWAYPERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VPortAssociatedGatewayPersonality.values()));
        }
        
        if (type.equals(Constants.VPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortEntityScope.values()));
        }
        
        if (type.equals(Constants.VPORT_FLOWLIMITENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(VPortFlowLimitEnabled.values()));
        }
        
        if (type.equals(Constants.VPORT_FLOWSETUPRATELIMITENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(VPortFlowSetupRateLimitEnabled.values()));
        }
        
        if (type.equals(Constants.VPORT_GATEWAYMACMOVEROLE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortGatewayMACMoveRole.values()));
        }
        
        if (type.equals(Constants.VPORT_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(VPortMulticast.values()));
        }
        
        if (type.equals(Constants.VPORT_OPERATIONALSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortOperationalState.values()));
        }
        
        if (type.equals(Constants.VPORT_PEEROPERATIONALSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortPeerOperationalState.values()));
        }
        
        if (type.equals(Constants.VPORT_SEGMENTATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortSegmentationType.values()));
        }
        
        if (type.equals(Constants.VPORT_SUBTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortSubType.values()));
        }
        
        if (type.equals(Constants.VPORT_SYSTEMTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortSystemType.values()));
        }
        
        if (type.equals(Constants.VPORT_TRUNKROLE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortTrunkRole.values()));
        }
        
        if (type.equals(Constants.VPORT_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortType.values()));
        }
        
        if (type.equals(Constants.VPORTMIRROR)) {
            java.util.List<VPortMirror> allObjs = ModelHelper.getAllVPortMirrors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORTMIRRORS_FETCHER)) {
            java.util.List<VPortMirrorsFetcher> allObjs = ModelHelper.getAllVPortMirrorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VPORTMIRROR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortMirrorEntityScope.values()));
        }
        
        if (type.equals(Constants.VPORTMIRROR_MIRRORDIRECTION_ENUM)) {
            return new QueryResult(Arrays.asList(VPortMirrorMirrorDirection.values()));
        }
        
        if (type.equals(Constants.VRS)) {
            java.util.List<VRS> allObjs = ModelHelper.getAllVRSs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSS_FETCHER)) {
            java.util.List<VRSsFetcher> allObjs = ModelHelper.getAllVRSsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRS_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSEntityScope.values()));
        }
        
        if (type.equals(Constants.VRS_HYPERVISORCONNECTIONSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSHypervisorConnectionState.values()));
        }
        
        if (type.equals(Constants.VRS_LICENSEDSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSLicensedState.values()));
        }
        
        if (type.equals(Constants.VRS_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VRSPersonality.values()));
        }
        
        if (type.equals(Constants.VRS_ROLE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSRole.values()));
        }
        
        if (type.equals(Constants.VRS_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VRSStatus.values()));
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE)) {
            java.util.List<VRSAddressRange> allObjs = ModelHelper.getAllVRSAddressRanges();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            java.util.List<VRSAddressRangesFetcher> allObjs = ModelHelper.getAllVRSAddressRangesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSADDRESSRANGE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSAddressRangeIPType.values()));
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSAddressRangeEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG)) {
            java.util.List<VCenterVRSConfig> allObjs = ModelHelper.getAllVCenterVRSConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERVRSCONFIGS_FETCHER)) {
            java.util.List<VCenterVRSConfigsFetcher> allObjs = ModelHelper.getAllVCenterVRSConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERVRSCONFIG_AVRSPROFILE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigAvrsProfile.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_CPUCOUNT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigCpuCount.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigEntityScope.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_MEMORYSIZEINGB_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigMemorySizeInGB.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigPersonality.values()));
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG_REMOTESYSLOGSERVERTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigRemoteSyslogServerType.values()));
        }
        
        if (type.equals(Constants.VRSINFO)) {
            java.util.List<vrsInfo> allObjs = ModelHelper.getAllvrsInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSINFOS_FETCHER)) {
            java.util.List<vrsInfosFetcher> allObjs = ModelHelper.getAllvrsInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSINFO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(vrsInfoEntityScope.values()));
        }
        
        if (type.equals(Constants.VRSMETRICS)) {
            java.util.List<VRSMetrics> allObjs = ModelHelper.getAllVRSMetrics();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSMETRICS_FETCHER)) {
            java.util.List<VRSMetricsFetcher> allObjs = ModelHelper.getAllVRSMetricsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSMETRICS_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSMetricsEntityScope.values()));
        }
        
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICY)) {
            java.util.List<VRSRedeploymentpolicy> allObjs = ModelHelper.getAllVRSRedeploymentpolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            java.util.List<VRSRedeploymentpoliciesFetcher> allObjs = ModelHelper.getAllVRSRedeploymentpoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSRedeploymentpolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.VSC)) {
            java.util.List<VSC> allObjs = ModelHelper.getAllVSCs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSCS_FETCHER)) {
            java.util.List<VSCsFetcher> allObjs = ModelHelper.getAllVSCsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSC_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VSCEntityScope.values()));
        }
        
        if (type.equals(Constants.VSC_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VSCStatus.values()));
        }
        
        if (type.equals(Constants.VSD)) {
            java.util.List<VSD> allObjs = ModelHelper.getAllVSDs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSDS_FETCHER)) {
            java.util.List<VSDsFetcher> allObjs = ModelHelper.getAllVSDsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSD_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VSDEntityScope.values()));
        }
        
        if (type.equals(Constants.VSD_MODE_ENUM)) {
            return new QueryResult(Arrays.asList(VSDMode.values()));
        }
        
        if (type.equals(Constants.VSD_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VSDStatus.values()));
        }
        
        if (type.equals(Constants.VSDCONFIG)) {
            java.util.List<VSDConfig> allObjs = ModelHelper.getAllVSDConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSDCONFIGS_FETCHER)) {
            java.util.List<VSDConfigsFetcher> allObjs = ModelHelper.getAllVSDConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSGREDUNDANTPORT)) {
            java.util.List<VsgRedundantPort> allObjs = ModelHelper.getAllVsgRedundantPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSGREDUNDANTPORTS_FETCHER)) {
            java.util.List<VsgRedundantPortsFetcher> allObjs = ModelHelper.getAllVsgRedundantPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSGREDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortEntityScope.values()));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_OPERATIONALSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortOperationalState.values()));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortPermittedAction.values()));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortPortType.values()));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortStatus.values()));
        }
        
        if (type.equals(Constants.VSP)) {
            java.util.List<VSP> allObjs = ModelHelper.getAllVSPs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSPS_FETCHER)) {
            java.util.List<VSPsFetcher> allObjs = ModelHelper.getAllVSPsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VSP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VSPEntityScope.values()));
        }
        
        if (type.equals(Constants.WEBCATEGORY)) {
            java.util.List<WebCategory> allObjs = ModelHelper.getAllWebCategories();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WEBCATEGORIES_FETCHER)) {
            java.util.List<WebCategoriesFetcher> allObjs = ModelHelper.getAllWebCategoriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WEBCATEGORY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(WebCategoryEntityScope.values()));
        }
        
        if (type.equals(Constants.WEBCATEGORY_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(WebCategoryType.values()));
        }
        
        if (type.equals(Constants.WEBDOMAINNAME)) {
            java.util.List<WebDomainName> allObjs = ModelHelper.getAllWebDomainNames();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WEBDOMAINNAMES_FETCHER)) {
            java.util.List<WebDomainNamesFetcher> allObjs = ModelHelper.getAllWebDomainNamesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WEBDOMAINNAME_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(WebDomainNameEntityScope.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT)) {
            java.util.List<WirelessPort> allObjs = ModelHelper.getAllWirelessPorts();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WIRELESSPORTS_FETCHER)) {
            java.util.List<WirelessPortsFetcher> allObjs = ModelHelper.getAllWirelessPortsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.WIRELESSPORT_CHANNELWIDTH_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortChannelWidth.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_COUNTRYCODE_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortCountryCode.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortEntityScope.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_FREQUENCYCHANNEL_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortFrequencyChannel.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortPermittedAction.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortPortType.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortStatus.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_WIFIFREQUENCYBAND_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortWifiFrequencyBand.values()));
        }
        
        if (type.equals(Constants.WIRELESSPORT_WIFIMODE_ENUM)) {
            return new QueryResult(Arrays.asList(WirelessPortWifiMode.values()));
        }
        
        if (type.equals(Constants.ZFBAUTOASSIGNMENT)) {
            java.util.List<ZFBAutoAssignment> allObjs = ModelHelper.getAllZFBAutoAssignments();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZFBAUTOASSIGNMENTS_FETCHER)) {
            java.util.List<ZFBAutoAssignmentsFetcher> allObjs = ModelHelper.getAllZFBAutoAssignmentsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZFBAUTOASSIGNMENT_ZFBMATCHATTRIBUTE_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBAutoAssignmentZFBMatchAttribute.values()));
        }
        
        if (type.equals(Constants.ZFBAUTOASSIGNMENT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBAutoAssignmentEntityScope.values()));
        }
        
        if (type.equals(Constants.ZFBREQUEST)) {
            java.util.List<ZFBRequest> allObjs = ModelHelper.getAllZFBRequests();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZFBREQUESTS_FETCHER)) {
            java.util.List<ZFBRequestsFetcher> allObjs = ModelHelper.getAllZFBRequestsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZFBREQUEST_ZFBAPPROVALSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBRequestZFBApprovalStatus.values()));
        }
        
        if (type.equals(Constants.ZFBREQUEST_ASSOCIATEDENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBRequestAssociatedEntityType.values()));
        }
        
        if (type.equals(Constants.ZFBREQUEST_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBRequestEntityScope.values()));
        }
        
        if (type.equals(Constants.ZFBREQUEST_REQUESTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBRequestRequestType.values()));
        }
        
        if (type.equals(Constants.ZONE)) {
            java.util.List<Zone> allObjs = ModelHelper.getAllZones();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZONES_FETCHER)) {
            java.util.List<ZonesFetcher> allObjs = ModelHelper.getAllZonesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZONE_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneDPI.values()));
        }
        
        if (type.equals(Constants.ZONE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneIPType.values()));
        }
        
        if (type.equals(Constants.ZONE_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneEncryption.values()));
        }
        
        if (type.equals(Constants.ZONE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneEntityScope.values()));
        }
        
        if (type.equals(Constants.ZONE_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.ZONE_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneMulticast.values()));
        }
        
        if (type.equals(Constants.ZONETEMPLATE)) {
            java.util.List<ZoneTemplate> allObjs = ModelHelper.getAllZoneTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZONETEMPLATES_FETCHER)) {
            java.util.List<ZoneTemplatesFetcher> allObjs = ModelHelper.getAllZoneTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ZONETEMPLATE_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneTemplateDPI.values()));
        }
        
        if (type.equals(Constants.ZONETEMPLATE_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneTemplateIPType.values()));
        }
        
        if (type.equals(Constants.ZONETEMPLATE_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneTemplateEncryption.values()));
        }
        
        if (type.equals(Constants.ZONETEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.ZONETEMPLATE_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneTemplateMulticast.values()));
        }
        throw new UnsupportedOperationException("implement findAll(String type, String query) - type: " + type + ", query: " + query);
    }
}
