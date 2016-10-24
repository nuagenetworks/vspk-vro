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
        
        if (type.equals(Constants.BRCONNECTION)) {
            return ModelHelper.getBRConnectionById(id);
        }
        if (type.equals(Constants.BRCONNECTIONS_FETCHER)) {
            return ModelHelper.getBRConnectionsFetcherById(id);
        }
        if (type.equals(Constants.BRCONNECTION_MODE_ENUM)) {
            return BRConnectionMode.getEnumById(id);
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
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE)) {
            return ModelHelper.getInfrastructureaccessprofileById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER)) {
            return ModelHelper.getInfrastructureaccessprofilesFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_SSHAUTHMODE_ENUM)) {
            return InfrastructureaccessprofileSSHAuthMode.getEnumById(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITYSCOPE_ENUM)) {
            return InfrastructureaccessprofileEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.VIRTUALIP)) {
            return ModelHelper.getVirtualIPById(id);
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER)) {
            return ModelHelper.getVirtualIPsFetcherById(id);
        }
        if (type.equals(Constants.VIRTUALIP_ENTITYSCOPE_ENUM)) {
            return VirtualIPEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.MULTICASTCHANNELMAP)) {
            return ModelHelper.getMultiCastChannelMapById(id);
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return ModelHelper.getMultiCastChannelMapsFetcherById(id);
        }
        if (type.equals(Constants.MULTICASTCHANNELMAP_ENTITYSCOPE_ENUM)) {
            return MultiCastChannelMapEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.TCA)) {
            return ModelHelper.getTCAById(id);
        }
        if (type.equals(Constants.TCAS_FETCHER)) {
            return ModelHelper.getTCAsFetcherById(id);
        }
        if (type.equals(Constants.TCA_ENTITYSCOPE_ENUM)) {
            return TCAEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_METRIC_ENUM)) {
            return TCAMetric.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_SCOPE_ENUM)) {
            return TCAScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TCA_TYPE_ENUM)) {
            return TCAType.getEnumById(id);
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
        
        if (type.equals(Constants.VSGREDUNDANTPORT)) {
            return ModelHelper.getVsgRedundantPortById(id);
        }
        if (type.equals(Constants.VSGREDUNDANTPORTS_FETCHER)) {
            return ModelHelper.getVsgRedundantPortsFetcherById(id);
        }
        if (type.equals(Constants.VSGREDUNDANTPORT_ENTITYSCOPE_ENUM)) {
            return VsgRedundantPortEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.ZONE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return ZoneAssociatedApplicationObjectType.getEnumById(id);
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
        
        if (type.equals(Constants.APPLICATION)) {
            return ModelHelper.getApplicationById(id);
        }
        if (type.equals(Constants.APPLICATIONS_FETCHER)) {
            return ModelHelper.getApplicationsFetcherById(id);
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
        
        if (type.equals(Constants.IKEGATEWAYPROFILE)) {
            return ModelHelper.getIKEGatewayProfileById(id);
        }
        if (type.equals(Constants.IKEGATEWAYPROFILES_FETCHER)) {
            return ModelHelper.getIKEGatewayProfilesFetcherById(id);
        }
        if (type.equals(Constants.IKEGATEWAYPROFILE_IKEGATEWAYIDENTIFIERTYPE_ENUM)) {
            return IKEGatewayProfileIKEGatewayIdentifierType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return IKEGatewayProfileAssociatedIKEAuthenticationType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ENTITYSCOPE_ENUM)) {
            return IKEGatewayProfileEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_SERVICECLASS_ENUM)) {
            return IKEGatewayProfileServiceClass.getEnumById(id);
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
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_UPGRADEACTION_ENUM)) {
            return InfrastructureGatewayProfileUpgradeAction.getEnumById(id);
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
        
        if (type.equals(Constants.FLOWSECURITYPOLICY)) {
            return ModelHelper.getFlowSecurityPolicyById(id);
        }
        if (type.equals(Constants.FLOWSECURITYPOLICIES_FETCHER)) {
            return ModelHelper.getFlowSecurityPoliciesFetcherById(id);
        }
        if (type.equals(Constants.FLOWSECURITYPOLICY_ACTION_ENUM)) {
            return FlowSecurityPolicyAction.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY_ASSOCIATEDNETWORKOBJECTTYPE_ENUM)) {
            return FlowSecurityPolicyAssociatedNetworkObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY_ENTITYSCOPE_ENUM)) {
            return FlowSecurityPolicyEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.LOCATION)) {
            return ModelHelper.getLocationById(id);
        }
        if (type.equals(Constants.LOCATIONS_FETCHER)) {
            return ModelHelper.getLocationsFetcherById(id);
        }
        if (type.equals(Constants.LOCATION_ENTITYSCOPE_ENUM)) {
            return LocationEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.VCENTERVRSCONFIG)) {
            return ModelHelper.getVCenterVRSConfigById(id);
        }
        if (type.equals(Constants.VCENTERVRSCONFIGS_FETCHER)) {
            return ModelHelper.getVCenterVRSConfigsFetcherById(id);
        }
        if (type.equals(Constants.VCENTERVRSCONFIG_ENTITYSCOPE_ENUM)) {
            return VCenterVRSConfigEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE)) {
            return ModelHelper.getInfrastructureVscProfileById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER)) {
            return ModelHelper.getInfrastructureVscProfilesFetcherById(id);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITYSCOPE_ENUM)) {
            return InfrastructureVscProfileEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.IPRESERVATION)) {
            return ModelHelper.getIPReservationById(id);
        }
        if (type.equals(Constants.IPRESERVATIONS_FETCHER)) {
            return ModelHelper.getIPReservationsFetcherById(id);
        }
        if (type.equals(Constants.IPRESERVATION_ENTITYSCOPE_ENUM)) {
            return IPReservationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE)) {
            return ModelHelper.getRedirectionTargetTemplateById(id);
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            return ModelHelper.getRedirectionTargetTemplatesFetcherById(id);
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
        
        if (type.equals(Constants.METADATATAG)) {
            return ModelHelper.getMetadataTagById(id);
        }
        if (type.equals(Constants.METADATATAGS_FETCHER)) {
            return ModelHelper.getMetadataTagsFetcherById(id);
        }
        if (type.equals(Constants.METADATATAG_ENTITYSCOPE_ENUM)) {
            return MetadataTagEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE)) {
            return ModelHelper.getFloatingIPACLTemplateById(id);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER)) {
            return ModelHelper.getFloatingIPACLTemplatesFetcherById(id);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return FloatingIPACLTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE_POLICYSTATE_ENUM)) {
            return FloatingIPACLTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return FloatingIPACLTemplatePriorityType.getEnumById(id);
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
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return IKEGatewayConnectionAssociatedIKEAuthenticationType.getEnumById(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ENTITYSCOPE_ENUM)) {
            return IKEGatewayConnectionEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET)) {
            return ModelHelper.getRedirectionTargetById(id);
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return ModelHelper.getRedirectionTargetsFetcherById(id);
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
        
        if (type.equals(Constants.AGGREGATEMETADATA)) {
            return ModelHelper.getAggregateMetadataById(id);
        }
        if (type.equals(Constants.AGGREGATEMETADATAS_FETCHER)) {
            return ModelHelper.getAggregateMetadatasFetcherById(id);
        }
        if (type.equals(Constants.AGGREGATEMETADATA_ENTITYSCOPE_ENUM)) {
            return AggregateMetadataEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return EgressACLEntryTemplateAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return EgressACLEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return EgressACLEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return EgressACLEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return EgressACLEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY)) {
            return ModelHelper.getIngressExternalServiceTemplateEntryById(id);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER)) {
            return ModelHelper.getIngressExternalServiceTemplateEntriesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_ACTION_ENUM)) {
            return IngressExternalServiceTemplateEntryAction.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return IngressExternalServiceTemplateEntryAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return IngressExternalServiceTemplateEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return IngressExternalServiceTemplateEntryLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return IngressExternalServiceTemplateEntryNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return IngressExternalServiceTemplateEntryPolicyState.getEnumById(id);
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
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL)) {
            return ModelHelper.getOverlayAddressPoolById(id);
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER)) {
            return ModelHelper.getOverlayAddressPoolsFetcherById(id);
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
        
        if (type.equals(Constants.LICENSESTATUS)) {
            return ModelHelper.getLicenseStatusById(id);
        }
        if (type.equals(Constants.LICENSESTATUS_FETCHER)) {
            return ModelHelper.getLicenseStatusFetcherById(id);
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
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM)) {
            return ModelHelper.getCloudMgmtSystemById(id);
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEMS_FETCHER)) {
            return ModelHelper.getCloudMgmtSystemsFetcherById(id);
        }
        if (type.equals(Constants.CLOUDMGMTSYSTEM_ENTITYSCOPE_ENUM)) {
            return CloudMgmtSystemEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.DOMAIN_PATENABLED_ENUM)) {
            return DomainPATEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_APPLICATIONDEPLOYMENTPOLICY_ENUM)) {
            return DomainApplicationDeploymentPolicy.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_ENCRYPTION_ENUM)) {
            return DomainEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_ENTITYSCOPE_ENUM)) {
            return DomainEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.DOMAIN_TUNNELTYPE_ENUM)) {
            return DomainTunnelType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_UNDERLAYENABLED_ENUM)) {
            return DomainUnderlayEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return DomainUplinkPreference.getEnumById(id);
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
        
        if (type.equals(Constants.REDUNDANTPORT_STATUS_ENUM)) {
            return RedundantPortStatus.getEnumById(id);
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
        
        if (type.equals(Constants.OVERLAYPATNATENTRY)) {
            return ModelHelper.getOverlayPATNATEntryById(id);
        }
        if (type.equals(Constants.OVERLAYPATNATENTRIES_FETCHER)) {
            return ModelHelper.getOverlayPATNATEntriesFetcherById(id);
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
        
        if (type.equals(Constants.VPORT)) {
            return ModelHelper.getVPortById(id);
        }
        if (type.equals(Constants.VPORTS_FETCHER)) {
            return ModelHelper.getVPortsFetcherById(id);
        }
        if (type.equals(Constants.VPORT_DPI_ENUM)) {
            return VPortDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_ADDRESSSPOOFING_ENUM)) {
            return VPortAddressSpoofing.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_ENTITYSCOPE_ENUM)) {
            return VPortEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_MULTICAST_ENUM)) {
            return VPortMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_OPERATIONALSTATE_ENUM)) {
            return VPortOperationalState.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_SYSTEMTYPE_ENUM)) {
            return VPortSystemType.getEnumById(id);
        }
        
        if (type.equals(Constants.VPORT_TYPE_ENUM)) {
            return VPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY)) {
            return ModelHelper.getFlowForwardingPolicyById(id);
        }
        if (type.equals(Constants.FLOWFORWARDINGPOLICIES_FETCHER)) {
            return ModelHelper.getFlowForwardingPoliciesFetcherById(id);
        }
        if (type.equals(Constants.FLOWFORWARDINGPOLICY_ASSOCIATEDNETWORKOBJECTTYPE_ENUM)) {
            return FlowForwardingPolicyAssociatedNetworkObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY_ENTITYSCOPE_ENUM)) {
            return FlowForwardingPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY_TYPE_ENUM)) {
            return FlowForwardingPolicyType.getEnumById(id);
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
        
        if (type.equals(Constants.PORT_PERMITTEDACTION_ENUM)) {
            return PortPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT_PORTTYPE_ENUM)) {
            return PortPortType.getEnumById(id);
        }
        
        if (type.equals(Constants.PORT_STATUS_ENUM)) {
            return PortStatus.getEnumById(id);
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
        if (type.equals(Constants.SUBNET_DPI_ENUM)) {
            return SubnetDPI.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_IPTYPE_ENUM)) {
            return SubnetIPType.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_PATENABLED_ENUM)) {
            return SubnetPATEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return SubnetAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_DEFAULTACTION_ENUM)) {
            return SubnetDefaultAction.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_ENCRYPTION_ENUM)) {
            return SubnetEncryption.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_ENTITYSCOPE_ENUM)) {
            return SubnetEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_MAINTENANCEMODE_ENUM)) {
            return SubnetMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_MULTICAST_ENUM)) {
            return SubnetMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_UNDERLAYENABLED_ENUM)) {
            return SubnetUnderlayEnabled.getEnumById(id);
        }
        
        if (type.equals(Constants.SUBNET_USEGLOBALMAC_ENUM)) {
            return SubnetUseGlobalMAC.getEnumById(id);
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
        
        if (type.equals(Constants.RATELIMITER)) {
            return ModelHelper.getRateLimiterById(id);
        }
        if (type.equals(Constants.RATELIMITERS_FETCHER)) {
            return ModelHelper.getRateLimitersFetcherById(id);
        }
        if (type.equals(Constants.RATELIMITER_ENTITYSCOPE_ENUM)) {
            return RateLimiterEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.VRS)) {
            return ModelHelper.getVRSById(id);
        }
        if (type.equals(Constants.VRSS_FETCHER)) {
            return ModelHelper.getVRSsFetcherById(id);
        }
        if (type.equals(Constants.VRS_JSONRPCCONNECTIONSTATE_ENUM)) {
            return VRSJSONRPCConnectionState.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_CLUSTERNODEROLE_ENUM)) {
            return VRSClusterNodeRole.getEnumById(id);
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
        
        if (type.equals(Constants.VRS_VSCCONFIGSTATE_ENUM)) {
            return VRSVscConfigState.getEnumById(id);
        }
        
        if (type.equals(Constants.VRS_VSCCURRENTSTATE_ENUM)) {
            return VRSVscCurrentState.getEnumById(id);
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
        
        if (type.equals(Constants.VLAN)) {
            return ModelHelper.getVLANById(id);
        }
        if (type.equals(Constants.VLANS_FETCHER)) {
            return ModelHelper.getVLANsFetcherById(id);
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
        
        if (type.equals(Constants.LDAPCONFIGURATION)) {
            return ModelHelper.getLDAPConfigurationById(id);
        }
        if (type.equals(Constants.LDAPCONFIGURATIONS_FETCHER)) {
            return ModelHelper.getLDAPConfigurationsFetcherById(id);
        }
        if (type.equals(Constants.LDAPCONFIGURATION_ENTITYSCOPE_ENUM)) {
            return LDAPConfigurationEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.ZFBREQUEST)) {
            return ModelHelper.getZFBRequestById(id);
        }
        if (type.equals(Constants.ZFBREQUESTS_FETCHER)) {
            return ModelHelper.getZFBRequestsFetcherById(id);
        }
        if (type.equals(Constants.ZFBREQUEST_ZFBAPPROVALSTATUS_ENUM)) {
            return ZFBRequestZFBApprovalStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST_ENTITYSCOPE_ENUM)) {
            return ZFBRequestEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.JOB)) {
            return ModelHelper.getJobById(id);
        }
        if (type.equals(Constants.JOBS_FETCHER)) {
            return ModelHelper.getJobsFetcherById(id);
        }
        if (type.equals(Constants.JOB_ASSOCENTITYTYPE_ENUM)) {
            return JobAssocEntityType.getEnumById(id);
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
        
        if (type.equals(Constants.GATEWAYSECUREDDATA)) {
            return ModelHelper.getGatewaySecuredDataById(id);
        }
        if (type.equals(Constants.GATEWAYSECUREDDATAS_FETCHER)) {
            return ModelHelper.getGatewaySecuredDatasFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYSECUREDDATA_ENTITYSCOPE_ENUM)) {
            return GatewaySecuredDataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR)) {
            return ModelHelper.getVCenterHypervisorById(id);
        }
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            return ModelHelper.getVCenterHypervisorsFetcherById(id);
        }
        if (type.equals(Constants.VCENTERHYPERVISOR_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterHypervisorDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_ENTITYSCOPE_ENUM)) {
            return VCenterHypervisorEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.VRSMETRICS)) {
            return ModelHelper.getVRSMetricsById(id);
        }
        if (type.equals(Constants.VRSMETRICS_FETCHER)) {
            return ModelHelper.getVRSMetricsFetcherById(id);
        }
        if (type.equals(Constants.VRSMETRICS_ENTITYSCOPE_ENUM)) {
            return VRSMetricsEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.VIA)) {
            return ModelHelper.getViaById(id);
        }
        if (type.equals(Constants.VIAS_FETCHER)) {
            return ModelHelper.getViasFetcherById(id);
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
        
        if (type.equals(Constants.PERFORMANCEMONITOR)) {
            return ModelHelper.getPerformanceMonitorById(id);
        }
        if (type.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            return ModelHelper.getPerformanceMonitorsFetcherById(id);
        }
        if (type.equals(Constants.PERFORMANCEMONITOR_SERVICECLASS_ENUM)) {
            return PerformanceMonitorServiceClass.getEnumById(id);
        }
        
        if (type.equals(Constants.NEXTHOPADDRESS)) {
            return ModelHelper.getNextHopAddressById(id);
        }
        if (type.equals(Constants.NEXTHOPADDRESS_FETCHER)) {
            return ModelHelper.getNextHopAddressFetcherById(id);
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
        
        if (type.equals(Constants.VCENTERCLUSTER)) {
            return ModelHelper.getVCenterClusterById(id);
        }
        if (type.equals(Constants.VCENTERCLUSTERS_FETCHER)) {
            return ModelHelper.getVCenterClustersFetcherById(id);
        }
        if (type.equals(Constants.VCENTERCLUSTER_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterClusterDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_ENTITYSCOPE_ENUM)) {
            return VCenterClusterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.MULTICASTRANGE)) {
            return ModelHelper.getMultiCastRangeById(id);
        }
        if (type.equals(Constants.MULTICASTRANGES_FETCHER)) {
            return ModelHelper.getMultiCastRangesFetcherById(id);
        }
        if (type.equals(Constants.MULTICASTRANGE_ENTITYSCOPE_ENUM)) {
            return MultiCastRangeEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressAdvFwdEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return IngressAdvFwdEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressAdvFwdEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM)) {
            return IngressAdvFwdEntryTemplateUplinkPreference.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATIONBINDING)) {
            return ModelHelper.getApplicationBindingById(id);
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            return ModelHelper.getApplicationBindingsFetcherById(id);
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
        
        if (type.equals(Constants.NEXTHOP)) {
            return ModelHelper.getNextHopById(id);
        }
        if (type.equals(Constants.NEXTHOPS_FETCHER)) {
            return ModelHelper.getNextHopsFetcherById(id);
        }
        if (type.equals(Constants.NEXTHOP_ENTITYSCOPE_ENUM)) {
            return NextHopEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERNOTIFICATION)) {
            return ModelHelper.getKeyServerNotificationById(id);
        }
        if (type.equals(Constants.KEYSERVERNOTIFICATIONS_FETCHER)) {
            return ModelHelper.getKeyServerNotificationsFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERNOTIFICATION_ENTITYSCOPE_ENUM)) {
            return KeyServerNotificationEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.KEYSERVERNOTIFICATION_NOTIFICATIONTYPE_ENUM)) {
            return KeyServerNotificationNotificationType.getEnumById(id);
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
        
        if (type.equals(Constants.TIER)) {
            return ModelHelper.getTierById(id);
        }
        if (type.equals(Constants.TIERS_FETCHER)) {
            return ModelHelper.getTiersFetcherById(id);
        }
        if (type.equals(Constants.TIER_ASSOCIATEDNETWORKOBJECTTYPE_ENUM)) {
            return TierAssociatedNetworkObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.TIER_ENTITYSCOPE_ENUM)) {
            return TierEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.TIER_TYPE_ENUM)) {
            return TierType.getEnumById(id);
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
        
        if (type.equals(Constants.GATEWAY)) {
            return ModelHelper.getGatewayById(id);
        }
        if (type.equals(Constants.GATEWAYS_FETCHER)) {
            return ModelHelper.getGatewaysFetcherById(id);
        }
        if (type.equals(Constants.GATEWAY_ENTITYSCOPE_ENUM)) {
            return GatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_PERMITTEDACTION_ENUM)) {
            return GatewayPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.GATEWAY_PERSONALITY_ENUM)) {
            return GatewayPersonality.getEnumById(id);
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
        
        if (type.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsById(id);
        }
        if (type.equals(Constants.STATISTICS_FETCHER)) {
            return ModelHelper.getStatisticsFetcherById(id);
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
        
        if (type.equals(Constants.CERTIFICATE)) {
            return ModelHelper.getCertificateById(id);
        }
        if (type.equals(Constants.CERTIFICATES_FETCHER)) {
            return ModelHelper.getCertificatesFetcherById(id);
        }
        if (type.equals(Constants.CERTIFICATE_ENTITYSCOPE_ENUM)) {
            return CertificateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER)) {
            return ModelHelper.getVCenterDataCenterById(id);
        }
        if (type.equals(Constants.VCENTERDATACENTERS_FETCHER)) {
            return ModelHelper.getVCenterDataCentersFetcherById(id);
        }
        if (type.equals(Constants.VCENTERDATACENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterDataCenterDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_ENTITYSCOPE_ENUM)) {
            return VCenterDataCenterEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_MULTICAST_ENUM)) {
            return L2DomainTemplateMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM)) {
            return L2DomainTemplatePolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_USEGLOBALMAC_ENUM)) {
            return L2DomainTemplateUseGlobalMAC.getEnumById(id);
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
        
        if (type.equals(Constants.APPLICATIONSERVICE)) {
            return ModelHelper.getApplicationServiceById(id);
        }
        if (type.equals(Constants.APPLICATIONSERVICES_FETCHER)) {
            return ModelHelper.getApplicationServicesFetcherById(id);
        }
        if (type.equals(Constants.APPLICATIONSERVICE_DIRECTION_ENUM)) {
            return ApplicationServiceDirection.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATIONSERVICE_ENTITYSCOPE_ENUM)) {
            return ApplicationServiceEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.IKEGATEWAY_ENTITYSCOPE_ENUM)) {
            return IKEGatewayEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.VCENTER)) {
            return ModelHelper.getVCenterById(id);
        }
        if (type.equals(Constants.VCENTERS_FETCHER)) {
            return ModelHelper.getVCentersFetcherById(id);
        }
        if (type.equals(Constants.VCENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return VCenterDestinationMirrorPort.getEnumById(id);
        }
        
        if (type.equals(Constants.VCENTER_ENTITYSCOPE_ENUM)) {
            return VCenterEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BULKSTATISTICS)) {
            return ModelHelper.getBulkStatisticsById(id);
        }
        if (type.equals(Constants.BULKSTATISTICS_FETCHER)) {
            return ModelHelper.getBulkStatisticsFetcherById(id);
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
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return IngressACLEntryTemplateAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressACLEntryTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return IngressACLEntryTemplateLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return IngressACLEntryTemplateNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return IngressACLEntryTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY)) {
            return ModelHelper.getRoutingPolicyById(id);
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return ModelHelper.getRoutingPoliciesFetcherById(id);
        }
        if (type.equals(Constants.ROUTINGPOLICY_DEFAULTACTION_ENUM)) {
            return RoutingPolicyDefaultAction.getEnumById(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_ENTITYSCOPE_ENUM)) {
            return RoutingPolicyEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING)) {
            return ModelHelper.getNetworkPerformanceBindingById(id);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return ModelHelper.getNetworkPerformanceBindingsFetcherById(id);
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
        
        if (type.equals(Constants.L2DOMAIN_MAINTENANCEMODE_ENUM)) {
            return L2DomainMaintenanceMode.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_MULTICAST_ENUM)) {
            return L2DomainMulticast.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return L2DomainPolicyChangeStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.L2DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return L2DomainUplinkPreference.getEnumById(id);
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
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA)) {
            return ModelHelper.getEnterpriseSecuredDataById(id);
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATAS_FETCHER)) {
            return ModelHelper.getEnterpriseSecuredDatasFetcherById(id);
        }
        if (type.equals(Constants.ENTERPRISESECUREDDATA_ENTITYSCOPE_ENUM)) {
            return EnterpriseSecuredDataEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT)) {
            return ModelHelper.getApplicationperformancemanagementById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return ModelHelper.getApplicationperformancemanagementsFetcherById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_APPLICATIONGROUPTYPE_ENUM)) {
            return ApplicationperformancemanagementApplicationGroupType.getEnumById(id);
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
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE)) {
            return ModelHelper.getIngressExternalServiceTemplateById(id);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER)) {
            return ModelHelper.getIngressExternalServiceTemplatesFetcherById(id);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE_ENTITYSCOPE_ENUM)) {
            return IngressExternalServiceTemplateEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE_POLICYSTATE_ENUM)) {
            return IngressExternalServiceTemplatePolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE_PRIORITYTYPE_ENUM)) {
            return IngressExternalServiceTemplatePriorityType.getEnumById(id);
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
        
        if (type.equals(Constants.ENDPOINT)) {
            return ModelHelper.getEndPointById(id);
        }
        if (type.equals(Constants.ENDPOINTS_FETCHER)) {
            return ModelHelper.getEndPointsFetcherById(id);
        }
        if (type.equals(Constants.ENDPOINT_ENTITYSCOPE_ENUM)) {
            return EndPointEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE)) {
            return ModelHelper.getL7applicationsignatureById(id);
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER)) {
            return ModelHelper.getL7applicationsignaturesFetcherById(id);
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
        
        if (type.equals(Constants.KEYSERVERMEMBER)) {
            return ModelHelper.getKeyServerMemberById(id);
        }
        if (type.equals(Constants.KEYSERVERMEMBERS_FETCHER)) {
            return ModelHelper.getKeyServerMembersFetcherById(id);
        }
        if (type.equals(Constants.KEYSERVERMEMBER_ENTITYSCOPE_ENUM)) {
            return KeyServerMemberEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.NSGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return NSGatewayBootstrapStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONRELOADSTATE_ENUM)) {
            return NSGatewayConfigurationReloadState.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONSTATUS_ENUM)) {
            return NSGatewayConfigurationStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_ENTITYSCOPE_ENUM)) {
            return NSGatewayEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_FAMILY_ENUM)) {
            return NSGatewayFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_INHERITEDSSHSERVICESTATE_ENUM)) {
            return NSGatewayInheritedSSHServiceState.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_PERMITTEDACTION_ENUM)) {
            return NSGatewayPermittedAction.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGATEWAY_PERSONALITY_ENUM)) {
            return NSGatewayPersonality.getEnumById(id);
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
        
        if (type.equals(Constants.VRSADDRESSRANGE)) {
            return ModelHelper.getVRSAddressRangeById(id);
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return ModelHelper.getVRSAddressRangesFetcherById(id);
        }
        if (type.equals(Constants.VRSADDRESSRANGE_ENTITYSCOPE_ENUM)) {
            return VRSAddressRangeEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.EGRESSQOSPOLICY)) {
            return ModelHelper.getEgressQOSPolicyById(id);
        }
        if (type.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            return ModelHelper.getEgressQOSPoliciesFetcherById(id);
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
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY)) {
            return ModelHelper.getDomainFIPAclTemplateEntryById(id);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER)) {
            return ModelHelper.getDomainFIPAclTemplateEntriesFetcherById(id);
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ACTION_ENUM)) {
            return DomainFIPAclTemplateEntryAction.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_DESTINATIONTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryDestinationType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return DomainFIPAclTemplateEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return DomainFIPAclTemplateEntryNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return DomainFIPAclTemplateEntryPolicyState.getEnumById(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_SOURCETYPE_ENUM)) {
            return DomainFIPAclTemplateEntrySourceType.getEnumById(id);
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
        
        if (type.equals(Constants.SITEINFO)) {
            return ModelHelper.getSiteInfoById(id);
        }
        if (type.equals(Constants.SITEINFOS_FETCHER)) {
            return ModelHelper.getSiteInfosFetcherById(id);
        }
        if (type.equals(Constants.SITEINFO_ENTITYSCOPE_ENUM)) {
            return SiteInfoEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.UPLINKCONNECTION)) {
            return ModelHelper.getUplinkConnectionById(id);
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return ModelHelper.getUplinkConnectionsFetcherById(id);
        }
        if (type.equals(Constants.UPLINKCONNECTION_ADDRESS_ENUM)) {
            return UplinkConnectionAddress.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_MODE_ENUM)) {
            return UplinkConnectionMode.getEnumById(id);
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ROLE_ENUM)) {
            return UplinkConnectionRole.getEnumById(id);
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
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING)) {
            return ModelHelper.getApplicationperformancemanagementbindingById(id);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return ModelHelper.getApplicationperformancemanagementbindingsFetcherById(id);
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
        
        if (type.equals(Constants.FLOATINGIP)) {
            return ModelHelper.getFloatingIpById(id);
        }
        if (type.equals(Constants.FLOATINGIPS_FETCHER)) {
            return ModelHelper.getFloatingIpsFetcherById(id);
        }
        if (type.equals(Constants.FLOATINGIP_ENTITYSCOPE_ENUM)) {
            return FloatingIpEntityScope.getEnumById(id);
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
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER)) {
            return ModelHelper.getAutoDiscoverHypervisorFromClusterById(id);
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER)) {
            return ModelHelper.getAutoDiscoverHypervisorFromClustersFetcherById(id);
        }
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITYSCOPE_ENUM)) {
            return AutoDiscoverHypervisorFromClusterEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.EXTERNALSERVICE)) {
            return ModelHelper.getExternalServiceById(id);
        }
        if (type.equals(Constants.EXTERNALSERVICES_FETCHER)) {
            return ModelHelper.getExternalServicesFetcherById(id);
        }
        if (type.equals(Constants.EXTERNALSERVICE_DIRECTION_ENUM)) {
            return ExternalServiceDirection.getEnumById(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE_ENTITYSCOPE_ENUM)) {
            return ExternalServiceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE_SERVICETYPE_ENUM)) {
            return ExternalServiceServiceType.getEnumById(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE_STAGE_ENUM)) {
            return ExternalServiceStage.getEnumById(id);
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
        
        if (type.equals(Constants.PATNATPOOL)) {
            return ModelHelper.getPATNATPoolById(id);
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER)) {
            return ModelHelper.getPATNATPoolsFetcherById(id);
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
        
        if (type.equals(Constants.PATMAPPER)) {
            return ModelHelper.getPATMapperById(id);
        }
        if (type.equals(Constants.PATMAPPERS_FETCHER)) {
            return ModelHelper.getPATMappersFetcherById(id);
        }
        if (type.equals(Constants.PATMAPPER_ENTITYSCOPE_ENUM)) {
            return PATMapperEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.BGPNEIGHBOR)) {
            return ModelHelper.getBGPNeighborById(id);
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return ModelHelper.getBGPNeighborsFetcherById(id);
        }
        if (type.equals(Constants.BGPNEIGHBOR_ENTITYSCOPE_ENUM)) {
            return BGPNeighborEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.IKEPSK)) {
            return ModelHelper.getIKEPSKById(id);
        }
        if (type.equals(Constants.IKEPSKS_FETCHER)) {
            return ModelHelper.getIKEPSKsFetcherById(id);
        }
        if (type.equals(Constants.IKEPSK_ENTITYSCOPE_ENUM)) {
            return IKEPSKEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.SYSTEMCONFIG_SYSTEMAVATARTYPE_ENUM)) {
            return SystemConfigSystemAvatarType.getEnumById(id);
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
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY)) {
            return ModelHelper.getFloatingIPACLTemplateEntryById(id);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER)) {
            return ModelHelper.getFloatingIPACLTemplateEntriesFetcherById(id);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_ACTION_ENUM)) {
            return FloatingIPACLTemplateEntryAction.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return FloatingIPACLTemplateEntryAssociatedApplicationObjectType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return FloatingIPACLTemplateEntryEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return FloatingIPACLTemplateEntryLocationType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return FloatingIPACLTemplateEntryNetworkType.getEnumById(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return FloatingIPACLTemplateEntryPolicyState.getEnumById(id);
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
        
        if (type.equals(Constants.POLICYGROUP)) {
            return ModelHelper.getPolicyGroupById(id);
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER)) {
            return ModelHelper.getPolicyGroupsFetcherById(id);
        }
        if (type.equals(Constants.POLICYGROUP_ENTITYSCOPE_ENUM)) {
            return PolicyGroupEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.POLICYGROUP_TYPE_ENUM)) {
            return PolicyGroupType.getEnumById(id);
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE)) {
            return ModelHelper.getDemarcationServiceById(id);
        }
        if (type.equals(Constants.DEMARCATIONSERVICES_FETCHER)) {
            return ModelHelper.getDemarcationServicesFetcherById(id);
        }
        if (type.equals(Constants.DEMARCATIONSERVICE_TYPE_ENUM)) {
            return DemarcationServiceType.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO)) {
            return ModelHelper.getNSGInfoById(id);
        }
        if (type.equals(Constants.NSGINFOS_FETCHER)) {
            return ModelHelper.getNSGInfosFetcherById(id);
        }
        if (type.equals(Constants.NSGINFO_TPMSTATUS_ENUM)) {
            return NSGInfoTPMStatus.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_ENTITYSCOPE_ENUM)) {
            return NSGInfoEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.NSGINFO_FAMILY_ENUM)) {
            return NSGInfoFamily.getEnumById(id);
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE)) {
            return ModelHelper.getExternalAppServiceById(id);
        }
        if (type.equals(Constants.EXTERNALAPPSERVICES_FETCHER)) {
            return ModelHelper.getExternalAppServicesFetcherById(id);
        }
        if (type.equals(Constants.EXTERNALAPPSERVICE_EGRESSTYPE_ENUM)) {
            return ExternalAppServiceEgressType.getEnumById(id);
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE_ENTITYSCOPE_ENUM)) {
            return ExternalAppServiceEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE_INGRESSTYPE_ENUM)) {
            return ExternalAppServiceIngressType.getEnumById(id);
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
        
        if (type.equals(Constants.FLOW)) {
            return ModelHelper.getFlowById(id);
        }
        if (type.equals(Constants.FLOWS_FETCHER)) {
            return ModelHelper.getFlowsFetcherById(id);
        }
        if (type.equals(Constants.FLOW_ENTITYSCOPE_ENUM)) {
            return FlowEntityScope.getEnumById(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE)) {
            return ModelHelper.getVLANTemplateById(id);
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER)) {
            return ModelHelper.getVLANTemplatesFetcherById(id);
        }
        if (type.equals(Constants.VLANTEMPLATE_ENTITYSCOPE_ENUM)) {
            return VLANTemplateEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.GATEWAYSECURITY)) {
            return ModelHelper.getGatewaySecurityById(id);
        }
        if (type.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            return ModelHelper.getGatewaySecuritiesFetcherById(id);
        }
        if (type.equals(Constants.GATEWAYSECURITY_ENTITYSCOPE_ENUM)) {
            return GatewaySecurityEntityScope.getEnumById(id);
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
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT)) {
            return ModelHelper.getNetworkPerformanceMeasurementById(id);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER)) {
            return ModelHelper.getNetworkPerformanceMeasurementsFetcherById(id);
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
        
        if (type.equals(Constants.ENTERPRISE_AVATARTYPE_ENUM)) {
            return EnterpriseAvatarType.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_ENCRYPTIONMANAGEMENTMODE_ENUM)) {
            return EnterpriseEncryptionManagementMode.getEnumById(id);
        }
        
        if (type.equals(Constants.ENTERPRISE_ENTITYSCOPE_ENUM)) {
            return EnterpriseEntityScope.getEnumById(id);
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
        throw new UnsupportedOperationException("implement findImpl(String type, String id) - type: " + type + ", " + id);
    }

    @Override
    public final java.util.List<?> findRelationImpl(String type, String id, String relationName) throws RestException {
        if (type.equals(Constants.PLUGIN_ROOT) && relationName.equals(Constants.SESSIONS)) {
            return ModelHelper.getAllSessions();
        }
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER) && relationName.equals(Constants.MULTICASTCHANNELMAPS)) {
            return ModelHelper.getMultiCastChannelMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.POLICYDECISIONS_FETCHER) && relationName.equals(Constants.POLICYDECISIONS)) {
            return ModelHelper.getPolicyDecisionsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForContainerInterfaceId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGroupKeyEncryptionProfileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGroupKeyEncryptionProfileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForQOSId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForQOSId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForQOSId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForQOSId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.QOS) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForQOSId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureaccessprofileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureaccessprofileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BGPPEER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBGPPeerId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BGPPEER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBGPPeerId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER) && relationName.equals(Constants.ADDRESSRANGES)) {
            return ModelHelper.getAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.PATIPENTRIES_FETCHER)) {
            return toList(ModelHelper.getPATIPEntriesFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.PATIPENTRIES_FETCHER) && relationName.equals(Constants.PATIPENTRIES)) {
            return ModelHelper.getPATIPEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.SHAREDNETWORKRESOURCE) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForSharedNetworkResourceId(id));
        }
        if (type.equals(Constants.VPNCONNECTIONS_FETCHER) && relationName.equals(Constants.VPNCONNECTIONS)) {
            return ModelHelper.getVPNConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVirtualIPId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVirtualIPId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VIRTUALIP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVirtualIPId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDSCPForwardingClassTableId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMultiCastChannelMapId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiCastChannelMapId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiCastChannelMapId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTCHANNELMAP) && relationName.equals(Constants.MULTICASTRANGES_FETCHER)) {
            return toList(ModelHelper.getMultiCastRangesFetcherForMultiCastChannelMapId(id));
        }
        if (type.equals(Constants.MULTICASTRANGES_FETCHER) && relationName.equals(Constants.MULTICASTRANGES)) {
            return ModelHelper.getMultiCastRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.GATEWAYS_FETCHER) && relationName.equals(Constants.GATEWAYS)) {
            return ModelHelper.getGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.PORTS_FETCHER)) {
            return toList(ModelHelper.getPortsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.PORTS_FETCHER) && relationName.equals(Constants.PORTS)) {
            return ModelHelper.getPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.WANSERVICES_FETCHER)) {
            return toList(ModelHelper.getWANServicesFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.WANSERVICES_FETCHER) && relationName.equals(Constants.WANSERVICES)) {
            return ModelHelper.getWANServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANCYGROUP) && relationName.equals(Constants.VSGREDUNDANTPORTS_FETCHER)) {
            return toList(ModelHelper.getVsgRedundantPortsFetcherForRedundancyGroupId(id));
        }
        if (type.equals(Constants.VSGREDUNDANTPORTS_FETCHER) && relationName.equals(Constants.VSGREDUNDANTPORTS)) {
            return ModelHelper.getVsgRedundantPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForTCAId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForTCAId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTCAId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.TCA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTCAId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForGroupId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGroupId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGroupId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GROUP) && relationName.equals(Constants.USERS_FETCHER)) {
            return toList(ModelHelper.getUsersFetcherForGroupId(id));
        }
        if (type.equals(Constants.USERS_FETCHER) && relationName.equals(Constants.USERS)) {
            return ModelHelper.getUsersForFetcherId(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVsgRedundantPortId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForVsgRedundantPortId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVsgRedundantPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVsgRedundantPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVsgRedundantPortId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForVsgRedundantPortId(id));
        }
        if (type.equals(Constants.VLANS_FETCHER) && relationName.equals(Constants.VLANS)) {
            return ModelHelper.getVLANsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForZoneId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForZoneId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForZoneId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForZoneId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForZoneId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForZoneId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForZoneId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForZoneId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForZoneId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForZoneId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForZoneId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForZoneId(id));
        }
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForZoneId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForZoneId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForZoneId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONE) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForZoneId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationBindingsFetcherForApplicationId(id));
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER) && relationName.equals(Constants.APPLICATIONBINDINGS)) {
            return ModelHelper.getApplicationBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATION) && relationName.equals(Constants.MONITORSCOPES_FETCHER)) {
            return toList(ModelHelper.getMonitorscopesFetcherForApplicationId(id));
        }
        if (type.equals(Constants.MONITORSCOPES_FETCHER) && relationName.equals(Constants.MONITORSCOPES)) {
            return ModelHelper.getMonitorscopesForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayProfileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayProfileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKESUBNET) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKESubnetId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKESUBNET) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKESubnetId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureGatewayProfileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureGatewayProfileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPolicyGroupTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyGroupTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForPolicyGroupTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUPTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyGroupTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForFlowSecurityPolicyId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFlowSecurityPolicyId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFlowSecurityPolicyId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterEAMConfigId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTEREAMCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterEAMConfigId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LOCATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLocationId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LOCATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLocationId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECURITY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseSecurityId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterVRSConfigId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterVRSConfigId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterVRSConfigId(id));
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER) && relationName.equals(Constants.VRSADDRESSRANGES)) {
            return ModelHelper.getVRSAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERVRSCONFIG) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterVRSConfigId(id));
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES)) {
            return ModelHelper.getVRSRedeploymentpoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEnterpriseNetworkId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseNetworkId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseNetworkId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISENETWORK) && relationName.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            return toList(ModelHelper.getNetworkMacroGroupsFetcherForEnterpriseNetworkId(id));
        }
        if (type.equals(Constants.NETWORKMACROGROUPS_FETCHER) && relationName.equals(Constants.NETWORKMACROGROUPS)) {
            return ModelHelper.getNetworkMacroGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureVscProfileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureVscProfileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPermissionId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPermissionId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PERMISSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPermissionId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForIPReservationId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIPReservationId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IPRESERVATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIPReservationId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForRedirectionTargetTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedirectionTargetTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForRedirectionTargetTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedirectionTargetTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForSubnetTemplateId(id));
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER) && relationName.equals(Constants.ADDRESSRANGES)) {
            return ModelHelper.getAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForSubnetTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSubnetTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSubnetTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForSubnetTemplateId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNETTEMPLATE) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForSubnetTemplateId(id));
        }
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.METADATATAG) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMetadataTagId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.METADATATAG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMetadataTagId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.METADATATAG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMetadataTagId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE) && relationName.equals(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER)) {
            return toList(ModelHelper.getFloatingIPACLTemplateEntriesFetcherForFloatingIPACLTemplateId(id));
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER) && relationName.equals(Constants.FLOATINGIPACLTEMPLATEENTRIES)) {
            return ModelHelper.getFloatingIPACLTemplateEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFloatingIPACLTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFloatingIPACLTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayConnectionId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayConnectionId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForIKEGatewayConnectionId(id));
        }
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForRedirectionTargetId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedirectionTargetId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForRedirectionTargetId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedirectionTargetId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForEgressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForEgressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressExternalServiceTemplateEntryId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressExternalServiceTemplateEntryId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressExternalServiceTemplateEntryId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForIngressExternalServiceTemplateEntryId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.AVATAR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAvatarId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.AVATAR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAvatarId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL) && relationName.equals(Constants.OVERLAYPATNATENTRIES_FETCHER)) {
            return toList(ModelHelper.getOverlayPATNATEntriesFetcherForOverlayAddressPoolId(id));
        }
        if (type.equals(Constants.OVERLAYPATNATENTRIES_FETCHER) && relationName.equals(Constants.OVERLAYPATNATENTRIES)) {
            return ModelHelper.getOverlayPATNATEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBootstrapActivationId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BOOTSTRAPACTIVATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBootstrapActivationId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.METADATA) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMetadataId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.METADATA) && relationName.equals(Constants.METADATATAGS_FETCHER)) {
            return toList(ModelHelper.getMetadataTagsFetcherForMetadataId(id));
        }
        if (type.equals(Constants.METADATATAGS_FETCHER) && relationName.equals(Constants.METADATATAGS)) {
            return ModelHelper.getMetadataTagsForFetcherId(id);
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCloudMgmtSystemId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CLOUDMGMTSYSTEM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCloudMgmtSystemId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVSPId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSPId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.HSCS_FETCHER)) {
            return toList(ModelHelper.getHSCsFetcherForVSPId(id));
        }
        if (type.equals(Constants.HSCS_FETCHER) && relationName.equals(Constants.HSCS)) {
            return ModelHelper.getHSCsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSPId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.VSCS_FETCHER)) {
            return toList(ModelHelper.getVSCsFetcherForVSPId(id));
        }
        if (type.equals(Constants.VSCS_FETCHER) && relationName.equals(Constants.VSCS)) {
            return ModelHelper.getVSCsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSP) && relationName.equals(Constants.VSDS_FETCHER)) {
            return toList(ModelHelper.getVSDsFetcherForVSPId(id));
        }
        if (type.equals(Constants.VSDS_FETCHER) && relationName.equals(Constants.VSDS)) {
            return ModelHelper.getVSDsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementbindingsFetcherForDomainId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS)) {
            return ModelHelper.getApplicationperformancemanagementbindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForDomainId(id));
        }
        if (type.equals(Constants.BRIDGEINTERFACES_FETCHER) && relationName.equals(Constants.BRIDGEINTERFACES)) {
            return ModelHelper.getBridgeInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForDomainId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForDomainId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForDomainId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForDomainId(id));
        }
        if (type.equals(Constants.DOMAINS_FETCHER) && relationName.equals(Constants.DOMAINS)) {
            return ModelHelper.getDomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.DOMAINTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINTEMPLATES)) {
            return ModelHelper.getDomainTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLTEMPLATES)) {
            return ModelHelper.getEgressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES)) {
            return ModelHelper.getDomainFIPAclTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getFloatingIPACLTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.FLOATINGIPACLTEMPLATES)) {
            return ModelHelper.getFloatingIPACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDomainId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.EXTERNALAPPSERVICES_FETCHER)) {
            return toList(ModelHelper.getExternalAppServicesFetcherForDomainId(id));
        }
        if (type.equals(Constants.EXTERNALAPPSERVICES_FETCHER) && relationName.equals(Constants.EXTERNALAPPSERVICES)) {
            return ModelHelper.getExternalAppServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.FLOATINGIPS_FETCHER)) {
            return toList(ModelHelper.getFloatingIpsFetcherForDomainId(id));
        }
        if (type.equals(Constants.FLOATINGIPS_FETCHER) && relationName.equals(Constants.FLOATINGIPS)) {
            return ModelHelper.getFloatingIpsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForDomainId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForDomainId(id));
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER) && relationName.equals(Constants.HOSTINTERFACES)) {
            return ModelHelper.getHostInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLTEMPLATES)) {
            return ModelHelper.getIngressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressExternalServiceTemplatesFetcherForDomainId(id));
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES)) {
            return ModelHelper.getIngressExternalServiceTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForDomainId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.LINKS_FETCHER)) {
            return toList(ModelHelper.getLinksFetcherForDomainId(id));
        }
        if (type.equals(Constants.LINKS_FETCHER) && relationName.equals(Constants.LINKS)) {
            return ModelHelper.getLinksForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForDomainId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForDomainId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForDomainId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForDomainId(id));
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER) && relationName.equals(Constants.ROUTINGPOLICIES)) {
            return ModelHelper.getRoutingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForDomainId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForDomainId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForDomainId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForDomainId(id));
        }
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForDomainId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForDomainId(id));
        }
        if (type.equals(Constants.UPLINKRDS_FETCHER) && relationName.equals(Constants.UPLINKRDS)) {
            return ModelHelper.getUplinkRDsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForDomainId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForDomainId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForDomainId(id));
        }
        if (type.equals(Constants.VPNCONNECTIONS_FETCHER) && relationName.equals(Constants.VPNCONNECTIONS)) {
            return ModelHelper.getVPNConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForDomainId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAIN) && relationName.equals(Constants.ZONES_FETCHER)) {
            return toList(ModelHelper.getZonesFetcherForDomainId(id));
        }
        if (type.equals(Constants.ZONES_FETCHER) && relationName.equals(Constants.ZONES)) {
            return ModelHelper.getZonesForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRedundantPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRedundantPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.NSPORTS_FETCHER)) {
            return toList(ModelHelper.getNSPortsFetcherForRedundantPortId(id));
        }
        if (type.equals(Constants.NSPORTS_FETCHER) && relationName.equals(Constants.NSPORTS)) {
            return ModelHelper.getNSPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.REDUNDANTPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForRedundantPortId(id));
        }
        if (type.equals(Constants.VLANS_FETCHER) && relationName.equals(Constants.VLANS)) {
            return ModelHelper.getVLANsForFetcherId(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDSCPForwardingClassMappingId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DSCPFORWARDINGCLASSMAPPING) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDSCPForwardingClassMappingId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKLAYOUT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetworkLayoutId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKLAYOUT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetworkLayoutId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForWANServiceId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForWANServiceId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForWANServiceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForWANServiceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForWANServiceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.WANSERVICE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForWANServiceId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVSDId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
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
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSDId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVSDId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSD) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSDId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementsFetcherForVPortId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS)) {
            return ModelHelper.getApplicationperformancemanagementsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForVPortId(id));
        }
        if (type.equals(Constants.BRIDGEINTERFACES_FETCHER) && relationName.equals(Constants.BRIDGEINTERFACES)) {
            return ModelHelper.getBridgeInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForVPortId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForVPortId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForVPortId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVPortId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForVPortId(id));
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER) && relationName.equals(Constants.HOSTINTERFACES)) {
            return ModelHelper.getHostInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForVPortId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
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
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForVPortId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVPortId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForVPortId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForVPortId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VIRTUALIPS_FETCHER)) {
            return toList(ModelHelper.getVirtualIPsFetcherForVPortId(id));
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER) && relationName.equals(Constants.VIRTUALIPS)) {
            return ModelHelper.getVirtualIPsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForVPortId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForVPortId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VPORTMIRRORS_FETCHER)) {
            return toList(ModelHelper.getVPortMirrorsFetcherForVPortId(id));
        }
        if (type.equals(Constants.VPORTMIRRORS_FETCHER) && relationName.equals(Constants.VPORTMIRRORS)) {
            return ModelHelper.getVPortMirrorsForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORT) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForVPortId(id));
        }
        if (type.equals(Constants.VRSS_FETCHER) && relationName.equals(Constants.VRSS)) {
            return ModelHelper.getVRSsForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForFlowForwardingPolicyId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFlowForwardingPolicyId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFlowForwardingPolicyId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForPortId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForPortId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPortId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForPortId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.PORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForPortId(id));
        }
        if (type.equals(Constants.VLANS_FETCHER) && relationName.equals(Constants.VLANS)) {
            return ModelHelper.getVLANsForFetcherId(id);
        }
        
        if (type.equals(Constants.STATISTICSPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStatisticsPolicyId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.STATISTICSPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStatisticsPolicyId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForSubnetId(id));
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER) && relationName.equals(Constants.ADDRESSRANGES)) {
            return ModelHelper.getAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return toList(ModelHelper.getBGPNeighborsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER) && relationName.equals(Constants.BGPNEIGHBORS)) {
            return ModelHelper.getBGPNeighborsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForSubnetId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForSubnetId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.CONTAINERRESYNCS_FETCHER)) {
            return toList(ModelHelper.getContainerResyncsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.CONTAINERRESYNCS_FETCHER) && relationName.equals(Constants.CONTAINERRESYNCS)) {
            return ModelHelper.getContainerResyncsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSubnetId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
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
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
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
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForSubnetId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VIRTUALIPS_FETCHER)) {
            return toList(ModelHelper.getVirtualIPsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER) && relationName.equals(Constants.VIRTUALIPS)) {
            return ModelHelper.getVirtualIPsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForSubnetId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.SUBNET) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForSubnetId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForContainerId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForContainerId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
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
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForContainerId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForContainerId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINER) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForContainerId(id));
        }
        if (type.equals(Constants.VRSS_FETCHER) && relationName.equals(Constants.VRSS)) {
            return ModelHelper.getVRSsForFetcherId(id);
        }
        
        if (type.equals(Constants.RATELIMITER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRateLimiterId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.RATELIMITER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRateLimiterId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorEncryptedSeedId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorEncryptedSeedId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForZoneTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForZoneTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForZoneTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForZoneTemplateId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZONETEMPLATE) && relationName.equals(Constants.SUBNETTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getSubnetTemplatesFetcherForZoneTemplateId(id));
        }
        if (type.equals(Constants.SUBNETTEMPLATES_FETCHER) && relationName.equals(Constants.SUBNETTEMPLATES)) {
            return ModelHelper.getSubnetTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorSeedId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER)) {
            return toList(ModelHelper.getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorSeedId(id));
        }
        if (type.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER) && relationName.equals(Constants.KEYSERVERMONITORENCRYPTEDSEEDS)) {
            return ModelHelper.getKeyServerMonitorEncryptedSeedsForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEED) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorSeedId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewayTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewayTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYTEMPLATE) && relationName.equals(Constants.PORTTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPortTemplatesFetcherForGatewayTemplateId(id));
        }
        if (type.equals(Constants.PORTTEMPLATES_FETCHER) && relationName.equals(Constants.PORTTEMPLATES)) {
            return ModelHelper.getPortTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVRSId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForVRSId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVRSId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVRSId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.HSCS_FETCHER)) {
            return toList(ModelHelper.getHSCsFetcherForVRSId(id));
        }
        if (type.equals(Constants.HSCS_FETCHER) && relationName.equals(Constants.HSCS)) {
            return ModelHelper.getHSCsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVRSId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVRSId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return toList(ModelHelper.getMonitoringPortsFetcherForVRSId(id));
        }
        if (type.equals(Constants.MONITORINGPORTS_FETCHER) && relationName.equals(Constants.MONITORINGPORTS)) {
            return ModelHelper.getMonitoringPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.MULTINICVPORTS_FETCHER)) {
            return toList(ModelHelper.getMultiNICVPortsFetcherForVRSId(id));
        }
        if (type.equals(Constants.MULTINICVPORTS_FETCHER) && relationName.equals(Constants.MULTINICVPORTS)) {
            return ModelHelper.getMultiNICVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForVRSId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForVRSId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRS) && relationName.equals(Constants.VSCS_FETCHER)) {
            return toList(ModelHelper.getVSCsFetcherForVRSId(id));
        }
        if (type.equals(Constants.VSCS_FETCHER) && relationName.equals(Constants.VSCS)) {
            return ModelHelper.getVSCsForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForHSCId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.BGPPEERS_FETCHER)) {
            return toList(ModelHelper.getBGPPeersFetcherForHSCId(id));
        }
        if (type.equals(Constants.BGPPEERS_FETCHER) && relationName.equals(Constants.BGPPEERS)) {
            return ModelHelper.getBGPPeersForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForHSCId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForHSCId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForHSCId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForHSCId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return toList(ModelHelper.getMonitoringPortsFetcherForHSCId(id));
        }
        if (type.equals(Constants.MONITORINGPORTS_FETCHER) && relationName.equals(Constants.MONITORINGPORTS)) {
            return ModelHelper.getMonitoringPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.HSC) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForHSCId(id));
        }
        if (type.equals(Constants.VRSS_FETCHER) && relationName.equals(Constants.VRSS)) {
            return ModelHelper.getVRSsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVLANId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            return toList(ModelHelper.getBGPNeighborsFetcherForVLANId(id));
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER) && relationName.equals(Constants.BGPNEIGHBORS)) {
            return ModelHelper.getBGPNeighborsForFetcherId(id);
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
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVLANId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVLANId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getIKEGatewayConnectionsFetcherForVLANId(id));
        }
        if (type.equals(Constants.IKEGATEWAYCONNECTIONS_FETCHER) && relationName.equals(Constants.IKEGATEWAYCONNECTIONS)) {
            return ModelHelper.getIKEGatewayConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVLANId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForVLANId(id));
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER) && relationName.equals(Constants.PATNATPOOLS)) {
            return ModelHelper.getPATNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForVLANId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLAN) && relationName.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getUplinkConnectionsFetcherForVLANId(id));
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER) && relationName.equals(Constants.UPLINKCONNECTIONS)) {
            return ModelHelper.getUplinkConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLDAPConfigurationId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LDAPCONFIGURATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLDAPConfigurationId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSDCOMPONENT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSDComponentId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSDCOMPONENT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSDComponentId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForZFBRequestId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForZFBRequestId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.ZFBREQUEST) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForZFBRequestId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterprisePermissionId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPERMISSION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterprisePermissionId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForStaticRouteId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStaticRouteId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.STATICROUTE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStaticRouteId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.JOB) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForJobId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.JOB) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForJobId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER) && relationName.equals(Constants.MULTICASTCHANNELMAPS)) {
            return ModelHelper.getMultiCastChannelMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.POLICYDECISIONS_FETCHER) && relationName.equals(Constants.POLICYDECISIONS)) {
            return ModelHelper.getPolicyDecisionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.VMINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForVMInterfaceId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewaySecuredDataId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYSECUREDDATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewaySecuredDataId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterHypervisorId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVCenterHypervisorId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterHypervisorId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterHypervisorId(id));
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER) && relationName.equals(Constants.VRSADDRESSRANGES)) {
            return ModelHelper.getVRSAddressRangesForFetcherId(id);
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
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES)) {
            return ModelHelper.getVRSRedeploymentpoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
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
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EVENTLOG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEventLogId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EVENTLOG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEventLogId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForLicenseId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForLicenseId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LICENSE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLicenseId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.EXTERNALSERVICES_FETCHER)) {
            return toList(ModelHelper.getExternalServicesFetcherForEnterpriseProfileId(id));
        }
        if (type.equals(Constants.EXTERNALSERVICES_FETCHER) && relationName.equals(Constants.EXTERNALSERVICES)) {
            return ModelHelper.getExternalServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseProfileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseProfileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISEPROFILE) && relationName.equals(Constants.MULTICASTLISTS_FETCHER)) {
            return toList(ModelHelper.getMultiCastListsFetcherForEnterpriseProfileId(id));
        }
        if (type.equals(Constants.MULTICASTLISTS_FETCHER) && relationName.equals(Constants.MULTICASTLISTS)) {
            return ModelHelper.getMultiCastListsForFetcherId(id);
        }
        
        if (type.equals(Constants.PERFORMANCEMONITOR) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementsFetcherForPerformanceMonitorId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS)) {
            return ModelHelper.getApplicationperformancemanagementsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.BRIDGEINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForBridgeInterfaceId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVCenterClusterId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterClusterId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            return toList(ModelHelper.getVCenterHypervisorsFetcherForVCenterClusterId(id));
        }
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER) && relationName.equals(Constants.VCENTERHYPERVISORS)) {
            return ModelHelper.getVCenterHypervisorsForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterClusterId(id));
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER) && relationName.equals(Constants.VRSADDRESSRANGES)) {
            return ModelHelper.getVRSAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERCLUSTER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterClusterId(id));
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES)) {
            return ModelHelper.getVRSRedeploymentpoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForMultiCastRangeId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiCastRangeId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTRANGE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiCastRangeId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.ENTERPRISENETWORKS_FETCHER)) {
            return toList(ModelHelper.getEnterpriseNetworksFetcherForNetworkMacroGroupId(id));
        }
        if (type.equals(Constants.ENTERPRISENETWORKS_FETCHER) && relationName.equals(Constants.ENTERPRISENETWORKS)) {
            return ModelHelper.getEnterpriseNetworksForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNetworkMacroGroupId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKMACROGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNetworkMacroGroupId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForIngressAdvFwdEntryTemplateId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.AUTODISCOVEREDGATEWAY) && relationName.equals(Constants.NSPORTS_FETCHER)) {
            return toList(ModelHelper.getNSPortsFetcherForAutoDiscoveredGatewayId(id));
        }
        if (type.equals(Constants.NSPORTS_FETCHER) && relationName.equals(Constants.NSPORTS)) {
            return ModelHelper.getNSPortsForFetcherId(id);
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
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiCastListId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiCastListId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTICASTLIST) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForMultiCastListId(id));
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER) && relationName.equals(Constants.MULTICASTCHANNELMAPS)) {
            return ModelHelper.getMultiCastChannelMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.NEXTHOP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNextHopId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NEXTHOP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNextHopId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERNOTIFICATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerNotificationId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERNOTIFICATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerNotificationId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdEntryTemplatesFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MIRRORDESTINATION) && relationName.equals(Constants.VPORTMIRRORS_FETCHER)) {
            return toList(ModelHelper.getVPortMirrorsFetcherForMirrorDestinationId(id));
        }
        if (type.equals(Constants.VPORTMIRRORS_FETCHER) && relationName.equals(Constants.VPORTMIRRORS)) {
            return ModelHelper.getVPortMirrorsForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForTierId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForTierId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForTierId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForTierId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForTierId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForTierId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForTierId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForTierId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.TIER) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForTierId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainFIPAclTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGatewayId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewayId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER) && relationName.equals(Constants.PATNATPOOLS)) {
            return ModelHelper.getPATNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.PORTS_FETCHER)) {
            return toList(ModelHelper.getPortsFetcherForGatewayId(id));
        }
        if (type.equals(Constants.PORTS_FETCHER) && relationName.equals(Constants.PORTS)) {
            return ModelHelper.getPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAY) && relationName.equals(Constants.WANSERVICES_FETCHER)) {
            return toList(ModelHelper.getWANServicesFetcherForGatewayId(id));
        }
        if (type.equals(Constants.WANSERVICES_FETCHER) && relationName.equals(Constants.WANSERVICES)) {
            return ModelHelper.getWANServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMultiNICVPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMultiNICVPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MULTINICVPORT) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForMultiNICVPortId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.STATISTICS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStatisticsId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.STATISTICS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStatisticsId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSPortTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSPortTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORTTEMPLATE) && relationName.equals(Constants.VLANTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getVLANTemplatesFetcherForNSPortTemplateId(id));
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER) && relationName.equals(Constants.VLANTEMPLATES)) {
            return ModelHelper.getVLANTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.CERTIFICATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForCertificateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CERTIFICATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForCertificateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER) && relationName.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS)) {
            return ModelHelper.getAutoDiscoverHypervisorFromClustersForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVCenterDataCenterId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterDataCenterId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER) && relationName.equals(Constants.VCENTERHYPERVISORS)) {
            return ModelHelper.getVCenterHypervisorsForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getVRSAddressRangesFetcherForVCenterDataCenterId(id));
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER) && relationName.equals(Constants.VRSADDRESSRANGES)) {
            return ModelHelper.getVRSAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTERDATACENTER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER)) {
            return toList(ModelHelper.getVRSRedeploymentpoliciesFetcherForVCenterDataCenterId(id));
        }
        if (type.equals(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER) && relationName.equals(Constants.VRSREDEPLOYMENTPOLICIES)) {
            return ModelHelper.getVRSRedeploymentpoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER) && relationName.equals(Constants.ADDRESSRANGES)) {
            return ModelHelper.getAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLTEMPLATES)) {
            return ModelHelper.getEgressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLTEMPLATES)) {
            return ModelHelper.getIngressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressExternalServiceTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES)) {
            return ModelHelper.getIngressExternalServiceTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.L2DOMAINS_FETCHER)) {
            return toList(ModelHelper.getL2DomainsFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.L2DOMAINS_FETCHER) && relationName.equals(Constants.L2DOMAINS)) {
            return ModelHelper.getL2DomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.POLICYGROUPTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.POLICYGROUPTEMPLATES_FETCHER) && relationName.equals(Constants.POLICYGROUPTEMPLATES)) {
            return ModelHelper.getPolicyGroupTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE) && relationName.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetTemplatesFetcherForL2DomainTemplateId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETTEMPLATES)) {
            return ModelHelper.getRedirectionTargetTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATIONSERVICE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForApplicationServiceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATIONSERVICE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForApplicationServiceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATIONSERVICE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForApplicationServiceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
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
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForStatsCollectorInfoId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.STATSCOLLECTORINFO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForStatsCollectorInfoId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVCenterId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.VCENTER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVCenterId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        
        if (type.equals(Constants.BULKSTATISTICS) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBulkStatisticsId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BULKSTATISTICS) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBulkStatisticsId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForIngressACLEntryTemplateId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForRoutingPolicyId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ROUTINGPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForRoutingPolicyId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.ADDRESSRANGES_FETCHER)) {
            return toList(ModelHelper.getAddressRangesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.ADDRESSRANGES_FETCHER) && relationName.equals(Constants.ADDRESSRANGES)) {
            return ModelHelper.getAddressRangesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementbindingsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS)) {
            return ModelHelper.getApplicationperformancemanagementbindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.BRIDGEINTERFACES_FETCHER)) {
            return toList(ModelHelper.getBridgeInterfacesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.BRIDGEINTERFACES_FETCHER) && relationName.equals(Constants.BRIDGEINTERFACES)) {
            return ModelHelper.getBridgeInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLTEMPLATES)) {
            return ModelHelper.getEgressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER) && relationName.equals(Constants.HOSTINTERFACES)) {
            return ModelHelper.getHostInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLTEMPLATES)) {
            return ModelHelper.getIngressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressExternalServiceTemplatesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES)) {
            return ModelHelper.getIngressExternalServiceTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.UPLINKRDS_FETCHER) && relationName.equals(Constants.UPLINKRDS)) {
            return ModelHelper.getUplinkRDsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VPNCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getVPNConnectionsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.VPNCONNECTIONS_FETCHER) && relationName.equals(Constants.VPNCONNECTIONS)) {
            return ModelHelper.getVPNConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.L2DOMAIN) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForL2DomainId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEGatewayConfigId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEGATEWAYCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEGatewayConfigId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.DHCPOPTIONS_FETCHER)) {
            return toList(ModelHelper.getDHCPOptionsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.DHCPOPTIONS_FETCHER) && relationName.equals(Constants.DHCPOPTIONS)) {
            return ModelHelper.getDHCPOptionsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.MULTICASTCHANNELMAPS_FETCHER)) {
            return toList(ModelHelper.getMultiCastChannelMapsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER) && relationName.equals(Constants.MULTICASTCHANNELMAPS)) {
            return ModelHelper.getMultiCastChannelMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.POLICYDECISIONS_FETCHER)) {
            return toList(ModelHelper.getPolicyDecisionsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.POLICYDECISIONS_FETCHER) && relationName.equals(Constants.POLICYDECISIONS)) {
            return ModelHelper.getPolicyDecisionsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.STATICROUTES_FETCHER)) {
            return toList(ModelHelper.getStaticRoutesFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.HOSTINTERFACE) && relationName.equals(Constants.TCAS_FETCHER)) {
            return toList(ModelHelper.getTCAsFetcherForHostInterfaceId(id));
        }
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEnterpriseSecuredDataId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISESECUREDDATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEnterpriseSecuredDataId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT) && relationName.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            return toList(ModelHelper.getApplicationBindingsFetcherForApplicationperformancemanagementId(id));
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER) && relationName.equals(Constants.APPLICATIONBINDINGS)) {
            return ModelHelper.getApplicationBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.IKECERTIFICATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKECertificateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKECERTIFICATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKECertificateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressExternalServiceTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER)) {
            return toList(ModelHelper.getIngressExternalServiceTemplateEntriesFetcherForIngressExternalServiceTemplateId(id));
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES)) {
            return ModelHelper.getIngressExternalServiceTemplateEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressExternalServiceTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressExternalServiceTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPortTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPortTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PORTTEMPLATE) && relationName.equals(Constants.VLANTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getVLANTemplatesFetcherForPortTemplateId(id));
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER) && relationName.equals(Constants.VLANTEMPLATES)) {
            return ModelHelper.getVLANTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.SESSION) && relationName.equals(Constants.MES)) {
            return toList(ModelHelper.getMeById(id));
        }
        if (type.equals(Constants.ME) && relationName.equals(Constants.APPLICATIONSERVICES_FETCHER)) {
            return toList(ModelHelper.getApplicationServicesFetcherForMeId(id));
        }
        if (type.equals(Constants.APPLICATIONSERVICES_FETCHER) && relationName.equals(Constants.APPLICATIONSERVICES)) {
            return ModelHelper.getApplicationServicesForFetcherId(id);
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
        if (type.equals(Constants.BGPPROFILES_FETCHER) && relationName.equals(Constants.BGPPROFILES)) {
            return ModelHelper.getBGPProfilesForFetcherId(id);
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
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForMeId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.CONTAINERINTERFACES_FETCHER)) {
            return toList(ModelHelper.getContainerInterfacesFetcherForMeId(id));
        }
        if (type.equals(Constants.CONTAINERINTERFACES_FETCHER) && relationName.equals(Constants.CONTAINERINTERFACES)) {
            return ModelHelper.getContainerInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForMeId(id));
        }
        if (type.equals(Constants.DOMAINS_FETCHER) && relationName.equals(Constants.DOMAINS)) {
            return ModelHelper.getDomainsForFetcherId(id);
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
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLTEMPLATES)) {
            return ModelHelper.getEgressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES)) {
            return ModelHelper.getDomainFIPAclTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getFloatingIPACLTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.FLOATINGIPACLTEMPLATES)) {
            return ModelHelper.getFloatingIPACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getEgressQOSPoliciesFetcherForMeId(id));
        }
        if (type.equals(Constants.EGRESSQOSPOLICIES_FETCHER) && relationName.equals(Constants.EGRESSQOSPOLICIES)) {
            return ModelHelper.getEgressQOSPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ENTERPRISES_FETCHER)) {
            return toList(ModelHelper.getEnterprisesFetcherForMeId(id));
        }
        if (type.equals(Constants.ENTERPRISES_FETCHER) && relationName.equals(Constants.ENTERPRISES)) {
            return ModelHelper.getEnterprisesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ENTERPRISEPROFILES_FETCHER)) {
            return toList(ModelHelper.getEnterpriseProfilesFetcherForMeId(id));
        }
        if (type.equals(Constants.ENTERPRISEPROFILES_FETCHER) && relationName.equals(Constants.ENTERPRISEPROFILES)) {
            return ModelHelper.getEnterpriseProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EXTERNALAPPSERVICES_FETCHER)) {
            return toList(ModelHelper.getExternalAppServicesFetcherForMeId(id));
        }
        if (type.equals(Constants.EXTERNALAPPSERVICES_FETCHER) && relationName.equals(Constants.EXTERNALAPPSERVICES)) {
            return ModelHelper.getExternalAppServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.EXTERNALSERVICES_FETCHER)) {
            return toList(ModelHelper.getExternalServicesFetcherForMeId(id));
        }
        if (type.equals(Constants.EXTERNALSERVICES_FETCHER) && relationName.equals(Constants.EXTERNALSERVICES)) {
            return ModelHelper.getExternalServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.FLOATINGIPS_FETCHER)) {
            return toList(ModelHelper.getFloatingIpsFetcherForMeId(id));
        }
        if (type.equals(Constants.FLOATINGIPS_FETCHER) && relationName.equals(Constants.FLOATINGIPS)) {
            return ModelHelper.getFloatingIpsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForMeId(id));
        }
        if (type.equals(Constants.GATEWAYS_FETCHER) && relationName.equals(Constants.GATEWAYS)) {
            return ModelHelper.getGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.GATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getGatewayTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.GATEWAYTEMPLATES_FETCHER) && relationName.equals(Constants.GATEWAYTEMPLATES)) {
            return ModelHelper.getGatewayTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMeId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.HOSTINTERFACES_FETCHER)) {
            return toList(ModelHelper.getHostInterfacesFetcherForMeId(id));
        }
        if (type.equals(Constants.HOSTINTERFACES_FETCHER) && relationName.equals(Constants.HOSTINTERFACES)) {
            return ModelHelper.getHostInterfacesForFetcherId(id);
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
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLTEMPLATES)) {
            return ModelHelper.getIngressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdEntryTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDENTRYTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForMeId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
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
        if (type.equals(Constants.L2DOMAINS_FETCHER) && relationName.equals(Constants.L2DOMAINS)) {
            return ModelHelper.getL2DomainsForFetcherId(id);
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
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.METADATATAGS_FETCHER)) {
            return toList(ModelHelper.getMetadataTagsFetcherForMeId(id));
        }
        if (type.equals(Constants.METADATATAGS_FETCHER) && relationName.equals(Constants.METADATATAGS)) {
            return ModelHelper.getMetadataTagsForFetcherId(id);
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
        if (type.equals(Constants.MULTICASTCHANNELMAPS_FETCHER) && relationName.equals(Constants.MULTICASTCHANNELMAPS)) {
            return ModelHelper.getMultiCastChannelMapsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NETWORKLAYOUTS_FETCHER)) {
            return toList(ModelHelper.getNetworkLayoutsFetcherForMeId(id));
        }
        if (type.equals(Constants.NETWORKLAYOUTS_FETCHER) && relationName.equals(Constants.NETWORKLAYOUTS)) {
            return ModelHelper.getNetworkLayoutsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForMeId(id));
        }
        if (type.equals(Constants.NSGATEWAYS_FETCHER) && relationName.equals(Constants.NSGATEWAYS)) {
            return ModelHelper.getNSGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSGatewayTemplatesFetcherForMeId(id));
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATES_FETCHER) && relationName.equals(Constants.NSGATEWAYTEMPLATES)) {
            return ModelHelper.getNSGatewayTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER)) {
            return toList(ModelHelper.getNSRedundantGatewayGroupsFetcherForMeId(id));
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS)) {
            return ModelHelper.getNSRedundantGatewayGroupsForFetcherId(id);
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
        if (type.equals(Constants.PATNATPOOLS_FETCHER) && relationName.equals(Constants.PATNATPOOLS)) {
            return ModelHelper.getPATNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.POLICYGROUPS_FETCHER)) {
            return toList(ModelHelper.getPolicyGroupsFetcherForMeId(id));
        }
        if (type.equals(Constants.POLICYGROUPS_FETCHER) && relationName.equals(Constants.POLICYGROUPS)) {
            return ModelHelper.getPolicyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.RATELIMITERS_FETCHER)) {
            return toList(ModelHelper.getRateLimitersFetcherForMeId(id));
        }
        if (type.equals(Constants.RATELIMITERS_FETCHER) && relationName.equals(Constants.RATELIMITERS)) {
            return ModelHelper.getRateLimitersForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            return toList(ModelHelper.getRedirectionTargetsFetcherForMeId(id));
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER) && relationName.equals(Constants.REDIRECTIONTARGETS)) {
            return ModelHelper.getRedirectionTargetsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.REDUNDANCYGROUPS_FETCHER)) {
            return toList(ModelHelper.getRedundancyGroupsFetcherForMeId(id));
        }
        if (type.equals(Constants.REDUNDANCYGROUPS_FETCHER) && relationName.equals(Constants.REDUNDANCYGROUPS)) {
            return ModelHelper.getRedundancyGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForMeId(id));
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER) && relationName.equals(Constants.ROUTINGPOLICIES)) {
            return ModelHelper.getRoutingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return toList(ModelHelper.getSharedNetworkResourcesFetcherForMeId(id));
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER) && relationName.equals(Constants.SHAREDNETWORKRESOURCES)) {
            return ModelHelper.getSharedNetworkResourcesForFetcherId(id);
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
        if (type.equals(Constants.STATICROUTES_FETCHER) && relationName.equals(Constants.STATICROUTES)) {
            return ModelHelper.getStaticRoutesForFetcherId(id);
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
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
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
        if (type.equals(Constants.TCAS_FETCHER) && relationName.equals(Constants.TCAS)) {
            return ModelHelper.getTCAsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.UPLINKRDS_FETCHER)) {
            return toList(ModelHelper.getUplinkRDsFetcherForMeId(id));
        }
        if (type.equals(Constants.UPLINKRDS_FETCHER) && relationName.equals(Constants.UPLINKRDS)) {
            return ModelHelper.getUplinkRDsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.USERS_FETCHER)) {
            return toList(ModelHelper.getUsersFetcherForMeId(id));
        }
        if (type.equals(Constants.USERS_FETCHER) && relationName.equals(Constants.USERS)) {
            return ModelHelper.getUsersForFetcherId(id);
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
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForMeId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForMeId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.VCENTERVRSCONFIGS_FETCHER)) {
            return toList(ModelHelper.getVCenterVRSConfigsFetcherForMeId(id));
        }
        if (type.equals(Constants.VCENTERVRSCONFIGS_FETCHER) && relationName.equals(Constants.VCENTERVRSCONFIGS)) {
            return ModelHelper.getVCenterVRSConfigsForFetcherId(id);
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
        if (type.equals(Constants.ZFBREQUESTS_FETCHER) && relationName.equals(Constants.ZFBREQUESTS)) {
            return ModelHelper.getZFBRequestsForFetcherId(id);
        }
        
        if (type.equals(Constants.ME) && relationName.equals(Constants.ZONES_FETCHER)) {
            return toList(ModelHelper.getZonesFetcherForMeId(id));
        }
        if (type.equals(Constants.ZONES_FETCHER) && relationName.equals(Constants.ZONES)) {
            return ModelHelper.getZonesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENDPOINT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEndPointId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENDPOINT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEndPointId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENDPOINT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEndPointId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE) && relationName.equals(Constants.APPLICATIONS_FETCHER)) {
            return toList(ModelHelper.getApplicationsFetcherForL7applicationsignatureId(id));
        }
        if (type.equals(Constants.APPLICATIONS_FETCHER) && relationName.equals(Constants.APPLICATIONS)) {
            return ModelHelper.getApplicationsForFetcherId(id);
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDHCPOptionId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDHCPOptionId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DHCPOPTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDHCPOptionId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMemberId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMEMBER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMemberId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.BOOTSTRAPS_FETCHER)) {
            return toList(ModelHelper.getBootstrapsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.BOOTSTRAPS_FETCHER) && relationName.equals(Constants.BOOTSTRAPS)) {
            return ModelHelper.getBootstrapsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER)) {
            return toList(ModelHelper.getBootstrapActivationsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.BOOTSTRAPACTIVATIONS_FETCHER) && relationName.equals(Constants.BOOTSTRAPACTIVATIONS)) {
            return ModelHelper.getBootstrapActivationsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.GATEWAYSECURITIES_FETCHER)) {
            return toList(ModelHelper.getGatewaySecuritiesFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.GATEWAYSECURITIES_FETCHER) && relationName.equals(Constants.GATEWAYSECURITIES)) {
            return ModelHelper.getGatewaySecuritiesForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER)) {
            return toList(ModelHelper.getInfrastructureConfigsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.INFRASTRUCTURECONFIGS_FETCHER) && relationName.equals(Constants.INFRASTRUCTURECONFIGS)) {
            return ModelHelper.getInfrastructureConfigsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.LOCATIONS_FETCHER)) {
            return toList(ModelHelper.getLocationsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.LOCATIONS_FETCHER) && relationName.equals(Constants.LOCATIONS)) {
            return ModelHelper.getLocationsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.MONITORSCOPES_FETCHER)) {
            return toList(ModelHelper.getMonitorscopesFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.MONITORSCOPES_FETCHER) && relationName.equals(Constants.MONITORSCOPES)) {
            return ModelHelper.getMonitorscopesForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSGINFOS_FETCHER)) {
            return toList(ModelHelper.getNSGInfosFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.NSGINFOS_FETCHER) && relationName.equals(Constants.NSGINFOS)) {
            return ModelHelper.getNSGInfosForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.NSPORTS_FETCHER)) {
            return toList(ModelHelper.getNSPortsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.NSPORTS_FETCHER) && relationName.equals(Constants.NSPORTS)) {
            return ModelHelper.getNSPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.PATNATPOOLS_FETCHER)) {
            return toList(ModelHelper.getPATNATPoolsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER) && relationName.equals(Constants.PATNATPOOLS)) {
            return ModelHelper.getPATNATPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAY) && relationName.equals(Constants.SUBNETS_FETCHER)) {
            return toList(ModelHelper.getSubnetsFetcherForNSGatewayId(id));
        }
        if (type.equals(Constants.SUBNETS_FETCHER) && relationName.equals(Constants.SUBNETS)) {
            return ModelHelper.getSubnetsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSGatewayTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSGatewayTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSGATEWAYTEMPLATE) && relationName.equals(Constants.NSPORTTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSPortTemplatesFetcherForNSGatewayTemplateId(id));
        }
        if (type.equals(Constants.NSPORTTEMPLATES_FETCHER) && relationName.equals(Constants.NSPORTTEMPLATES)) {
            return ModelHelper.getNSPortTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVSCId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.BGPPEERS_FETCHER)) {
            return toList(ModelHelper.getBGPPeersFetcherForVSCId(id));
        }
        if (type.equals(Constants.BGPPEERS_FETCHER) && relationName.equals(Constants.BGPPEERS)) {
            return ModelHelper.getBGPPeersForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVSCId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVSCId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForVSCId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVSCId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.MONITORINGPORTS_FETCHER)) {
            return toList(ModelHelper.getMonitoringPortsFetcherForVSCId(id));
        }
        if (type.equals(Constants.MONITORINGPORTS_FETCHER) && relationName.equals(Constants.MONITORINGPORTS)) {
            return ModelHelper.getMonitoringPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.VSC) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForVSCId(id));
        }
        if (type.equals(Constants.VRSS_FETCHER) && relationName.equals(Constants.VRSS)) {
            return ModelHelper.getVRSsForFetcherId(id);
        }
        
        if (type.equals(Constants.UPLINKRD) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUplinkRDId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.UPLINKRD) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUplinkRDId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForVMId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForVMId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.VMRESYNCS_FETCHER)) {
            return toList(ModelHelper.getVMResyncsFetcherForVMId(id));
        }
        if (type.equals(Constants.VMRESYNCS_FETCHER) && relationName.equals(Constants.VMRESYNCS)) {
            return ModelHelper.getVMResyncsForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.VMINTERFACES_FETCHER)) {
            return toList(ModelHelper.getVMInterfacesFetcherForVMId(id));
        }
        if (type.equals(Constants.VMINTERFACES_FETCHER) && relationName.equals(Constants.VMINTERFACES)) {
            return ModelHelper.getVMInterfacesForFetcherId(id);
        }
        
        if (type.equals(Constants.VM) && relationName.equals(Constants.VRSS_FETCHER)) {
            return toList(ModelHelper.getVRSsFetcherForVMId(id));
        }
        if (type.equals(Constants.VRSS_FETCHER) && relationName.equals(Constants.VRSS)) {
            return ModelHelper.getVRSsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getEnterprisePermissionsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForNSPortId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.NSPORT) && relationName.equals(Constants.VLANS_FETCHER)) {
            return toList(ModelHelper.getVLANsFetcherForNSPortId(id));
        }
        if (type.equals(Constants.VLANS_FETCHER) && relationName.equals(Constants.VLANS)) {
            return ModelHelper.getVLANsForFetcherId(id);
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVRSAddressRangeId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VRSADDRESSRANGE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVRSAddressRangeId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BGPPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBGPProfileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BGPPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBGPProfileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressQOSPolicyId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSQOSPOLICY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressQOSPolicyId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPublicNetworkMacroId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPublicNetworkMacroId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PUBLICNETWORKMACRO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPublicNetworkMacroId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainFIPAclTemplateEntryId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainFIPAclTemplateEntryId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ADDRESSRANGE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAddressRangeId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.DOMAINS_FETCHER) && relationName.equals(Constants.DOMAINS)) {
            return ModelHelper.getDomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.EGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.EGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLTEMPLATES)) {
            return ModelHelper.getEgressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainFIPAclTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.DOMAINFIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINFIPACLTEMPLATES)) {
            return ModelHelper.getDomainFIPAclTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getFloatingIPACLTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER) && relationName.equals(Constants.FLOATINGIPACLTEMPLATES)) {
            return ModelHelper.getFloatingIPACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSACLTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.INGRESSACLTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLTEMPLATES)) {
            return ModelHelper.getIngressACLTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressAdvFwdTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.INGRESSADVFWDTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSADVFWDTEMPLATES)) {
            return ModelHelper.getIngressAdvFwdTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressExternalServiceTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES)) {
            return ModelHelper.getIngressExternalServiceTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.PERMISSIONS_FETCHER)) {
            return toList(ModelHelper.getPermissionsFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.PERMISSIONS_FETCHER) && relationName.equals(Constants.PERMISSIONS)) {
            return ModelHelper.getPermissionsForFetcherId(id);
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
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
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
        
        if (type.equals(Constants.DOMAINTEMPLATE) && relationName.equals(Constants.ZONETEMPLATES_FETCHER)) {
            return toList(ModelHelper.getZoneTemplatesFetcherForDomainTemplateId(id));
        }
        if (type.equals(Constants.ZONETEMPLATES_FETCHER) && relationName.equals(Constants.ZONETEMPLATES)) {
            return ModelHelper.getZoneTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.SITEINFO) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSiteInfoId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SITEINFO) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSiteInfoId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VMRESYNC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVMResyncId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VMRESYNC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVMResyncId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyDecisionId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyDecisionId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYDECISION) && relationName.equals(Constants.QOSS_FETCHER)) {
            return toList(ModelHelper.getQOSsFetcherForPolicyDecisionId(id));
        }
        if (type.equals(Constants.QOSS_FETCHER) && relationName.equals(Constants.QOSS)) {
            return ModelHelper.getQOSsForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForFloatingIpId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFloatingIpId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFloatingIpId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIP) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForFloatingIpId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getEgressACLEntryTemplatesFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.EGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getEgressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EGRESSACLTEMPLATE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForEgressACLTemplateId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.MONITORINGPORT) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForMonitoringPortId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.MONITORINGPORT) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForMonitoringPortId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPNCONNECTION) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVPNConnectionId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPNCONNECTION) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVPNConnectionId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.NSGATEWAYS_FETCHER)) {
            return toList(ModelHelper.getNSGatewaysFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.NSGATEWAYS_FETCHER) && relationName.equals(Constants.NSGATEWAYS)) {
            return ModelHelper.getNSGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUP) && relationName.equals(Constants.REDUNDANTPORTS_FETCHER)) {
            return toList(ModelHelper.getRedundantPortsFetcherForNSRedundantGatewayGroupId(id));
        }
        if (type.equals(Constants.REDUNDANTPORTS_FETCHER) && relationName.equals(Constants.REDUNDANTPORTS)) {
            return ModelHelper.getRedundantPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE) && relationName.equals(Constants.ENDPOINTS_FETCHER)) {
            return toList(ModelHelper.getEndPointsFetcherForExternalServiceId(id));
        }
        if (type.equals(Constants.ENDPOINTS_FETCHER) && relationName.equals(Constants.ENDPOINTS)) {
            return ModelHelper.getEndPointsForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForExternalServiceId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForExternalServiceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForExternalServiceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALSERVICE) && relationName.equals(Constants.METADATATAGS_FETCHER)) {
            return toList(ModelHelper.getMetadataTagsFetcherForExternalServiceId(id));
        }
        if (type.equals(Constants.METADATATAGS_FETCHER) && relationName.equals(Constants.METADATATAGS)) {
            return ModelHelper.getMetadataTagsForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForKeyServerMonitorSEKId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.KEYSERVERMONITORSEK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForKeyServerMonitorSEKId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressAdvFwdTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
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
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSADVFWDTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressAdvFwdTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORTMIRROR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVPortMirrorId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VPORTMIRROR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVPortMirrorId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
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
        if (type.equals(Constants.ENTERPRISEPERMISSIONS_FETCHER) && relationName.equals(Constants.ENTERPRISEPERMISSIONS)) {
            return ModelHelper.getEnterprisePermissionsForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.NATMAPENTRIES_FETCHER)) {
            return toList(ModelHelper.getNATMapEntriesFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.NATMAPENTRIES_FETCHER) && relationName.equals(Constants.NATMAPENTRIES)) {
            return ModelHelper.getNATMapEntriesForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.STATISTICS_FETCHER)) {
            return toList(ModelHelper.getStatisticsFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.STATISTICS_FETCHER) && relationName.equals(Constants.STATISTICS)) {
            return ModelHelper.getStatisticsForFetcherId(id);
        }
        
        if (type.equals(Constants.PATNATPOOL) && relationName.equals(Constants.STATISTICSPOLICIES_FETCHER)) {
            return toList(ModelHelper.getStatisticsPoliciesFetcherForPATNATPoolId(id));
        }
        if (type.equals(Constants.STATISTICSPOLICIES_FETCHER) && relationName.equals(Constants.STATISTICSPOLICIES)) {
            return ModelHelper.getStatisticsPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.PATMAPPER) && relationName.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return toList(ModelHelper.getSharedNetworkResourcesFetcherForPATMapperId(id));
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER) && relationName.equals(Constants.SHAREDNETWORKRESOURCES)) {
            return ModelHelper.getSharedNetworkResourcesForFetcherId(id);
        }
        
        if (type.equals(Constants.BGPNEIGHBOR) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBGPNeighborId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BGPNEIGHBOR) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBGPNeighborId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERRESYNC) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForContainerResyncId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.CONTAINERRESYNC) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForContainerResyncId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ALLALARM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAllAlarmId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ALLALARM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAllAlarmId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEPSK) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEPSKId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEPSK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEPSKId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForSystemConfigId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.SYSTEMCONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForSystemConfigId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIKEEncryptionprofileId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.IKEENCRYPTIONPROFILE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIKEEncryptionprofileId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFloatingIPACLTemplateEntryId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFloatingIPACLTemplateEntryId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForInfrastructureConfigId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INFRASTRUCTURECONFIG) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForInfrastructureConfigId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.AVATARS_FETCHER)) {
            return toList(ModelHelper.getAvatarsFetcherForUserId(id));
        }
        if (type.equals(Constants.AVATARS_FETCHER) && relationName.equals(Constants.AVATARS)) {
            return ModelHelper.getAvatarsForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForUserId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForUserId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForUserId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForUserId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForUserId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.USER) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForUserId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.NATMAPENTRY) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForNATMapEntryId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.NATMAPENTRY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForNATMapEntryId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForPolicyGroupId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForPolicyGroupId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForPolicyGroupId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForPolicyGroupId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.POLICYGROUP) && relationName.equals(Constants.VPORTS_FETCHER)) {
            return toList(ModelHelper.getVPortsFetcherForPolicyGroupId(id));
        }
        if (type.equals(Constants.VPORTS_FETCHER) && relationName.equals(Constants.VPORTS)) {
            return ModelHelper.getVPortsForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForExternalAppServiceId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForExternalAppServiceId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ALARM) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForAlarmId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ALARM) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForAlarmId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BOOTSTRAP) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForBootstrapId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.BOOTSTRAP) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForBootstrapId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOW) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForFlowId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOW) && relationName.equals(Constants.FLOWFORWARDINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getFlowForwardingPoliciesFetcherForFlowId(id));
        }
        if (type.equals(Constants.FLOWFORWARDINGPOLICIES_FETCHER) && relationName.equals(Constants.FLOWFORWARDINGPOLICIES)) {
            return ModelHelper.getFlowForwardingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOW) && relationName.equals(Constants.FLOWSECURITYPOLICIES_FETCHER)) {
            return toList(ModelHelper.getFlowSecurityPoliciesFetcherForFlowId(id));
        }
        if (type.equals(Constants.FLOWSECURITYPOLICIES_FETCHER) && relationName.equals(Constants.FLOWSECURITYPOLICIES)) {
            return ModelHelper.getFlowSecurityPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOW) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForFlowId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.FLOW) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForFlowId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.BRCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getBRConnectionsFetcherForVLANTemplateId(id));
        }
        if (type.equals(Constants.BRCONNECTIONS_FETCHER) && relationName.equals(Constants.BRCONNECTIONS)) {
            return ModelHelper.getBRConnectionsForFetcherId(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForVLANTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForVLANTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.VLANTEMPLATE) && relationName.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            return toList(ModelHelper.getUplinkConnectionsFetcherForVLANTemplateId(id));
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER) && relationName.equals(Constants.UPLINKCONNECTIONS)) {
            return ModelHelper.getUplinkConnectionsForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GATEWAYSECURITY) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGatewaySecurityId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GLOBALMETADATA) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForGlobalMetadataId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GLOBALMETADATA) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForGlobalMetadataId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.GLOBALMETADATA) && relationName.equals(Constants.METADATATAGS_FETCHER)) {
            return toList(ModelHelper.getMetadataTagsFetcherForGlobalMetadataId(id));
        }
        if (type.equals(Constants.METADATATAGS_FETCHER) && relationName.equals(Constants.METADATATAGS)) {
            return ModelHelper.getMetadataTagsForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.MONITORSCOPES_FETCHER)) {
            return toList(ModelHelper.getMonitorscopesFetcherForNetworkPerformanceMeasurementId(id));
        }
        if (type.equals(Constants.MONITORSCOPES_FETCHER) && relationName.equals(Constants.MONITORSCOPES)) {
            return ModelHelper.getMonitorscopesForFetcherId(id);
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            return toList(ModelHelper.getNetworkPerformanceBindingsFetcherForNetworkPerformanceMeasurementId(id));
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER) && relationName.equals(Constants.NETWORKPERFORMANCEBINDINGS)) {
            return ModelHelper.getNetworkPerformanceBindingsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ALARMS_FETCHER)) {
            return toList(ModelHelper.getAlarmsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ALARMS_FETCHER) && relationName.equals(Constants.ALARMS)) {
            return ModelHelper.getAlarmsForFetcherId(id);
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
        if (type.equals(Constants.APPLICATIONS_FETCHER) && relationName.equals(Constants.APPLICATIONS)) {
            return ModelHelper.getApplicationsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            return toList(ModelHelper.getApplicationperformancemanagementsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER) && relationName.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS)) {
            return ModelHelper.getApplicationperformancemanagementsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.APPLICATIONSERVICES_FETCHER)) {
            return toList(ModelHelper.getApplicationServicesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.APPLICATIONSERVICES_FETCHER) && relationName.equals(Constants.APPLICATIONSERVICES)) {
            return ModelHelper.getApplicationServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.AVATARS_FETCHER)) {
            return toList(ModelHelper.getAvatarsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.AVATARS_FETCHER) && relationName.equals(Constants.AVATARS)) {
            return ModelHelper.getAvatarsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.BGPPROFILES_FETCHER)) {
            return toList(ModelHelper.getBGPProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.BGPPROFILES_FETCHER) && relationName.equals(Constants.BGPPROFILES)) {
            return ModelHelper.getBGPProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DOMAINS_FETCHER)) {
            return toList(ModelHelper.getDomainsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.DOMAINS_FETCHER) && relationName.equals(Constants.DOMAINS)) {
            return ModelHelper.getDomainsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DOMAINTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getDomainTemplatesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.DOMAINTEMPLATES_FETCHER) && relationName.equals(Constants.DOMAINTEMPLATES)) {
            return ModelHelper.getDomainTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER)) {
            return toList(ModelHelper.getDSCPForwardingClassTablesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER) && relationName.equals(Constants.DSCPFORWARDINGCLASSTABLES)) {
            return ModelHelper.getDSCPForwardingClassTablesForFetcherId(id);
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
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.EXTERNALAPPSERVICES_FETCHER)) {
            return toList(ModelHelper.getExternalAppServicesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.EXTERNALAPPSERVICES_FETCHER) && relationName.equals(Constants.EXTERNALAPPSERVICES)) {
            return ModelHelper.getExternalAppServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.EXTERNALSERVICES_FETCHER)) {
            return toList(ModelHelper.getExternalServicesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.EXTERNALSERVICES_FETCHER) && relationName.equals(Constants.EXTERNALSERVICES)) {
            return ModelHelper.getExternalServicesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GATEWAYS_FETCHER)) {
            return toList(ModelHelper.getGatewaysFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GATEWAYS_FETCHER) && relationName.equals(Constants.GATEWAYS)) {
            return ModelHelper.getGatewaysForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GROUPS_FETCHER)) {
            return toList(ModelHelper.getGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GROUPS_FETCHER) && relationName.equals(Constants.GROUPS)) {
            return ModelHelper.getGroupsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER)) {
            return toList(ModelHelper.getGroupKeyEncryptionProfilesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER) && relationName.equals(Constants.GROUPKEYENCRYPTIONPROFILES)) {
            return ModelHelper.getGroupKeyEncryptionProfilesForFetcherId(id);
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
        if (type.equals(Constants.IKEGATEWAYPROFILES_FETCHER) && relationName.equals(Constants.IKEGATEWAYPROFILES)) {
            return ModelHelper.getIKEGatewayProfilesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.IKEPSKS_FETCHER)) {
            return toList(ModelHelper.getIKEPSKsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.IKEPSKS_FETCHER) && relationName.equals(Constants.IKEPSKS)) {
            return ModelHelper.getIKEPSKsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
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
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.METADATATAGS_FETCHER)) {
            return toList(ModelHelper.getMetadataTagsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.METADATATAGS_FETCHER) && relationName.equals(Constants.METADATATAGS)) {
            return ModelHelper.getMetadataTagsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.MULTICASTLISTS_FETCHER)) {
            return toList(ModelHelper.getMultiCastListsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.MULTICASTLISTS_FETCHER) && relationName.equals(Constants.MULTICASTLISTS)) {
            return ModelHelper.getMultiCastListsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NETWORKMACROGROUPS_FETCHER)) {
            return toList(ModelHelper.getNetworkMacroGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NETWORKMACROGROUPS_FETCHER) && relationName.equals(Constants.NETWORKMACROGROUPS)) {
            return ModelHelper.getNetworkMacroGroupsForFetcherId(id);
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
        if (type.equals(Constants.NSGATEWAYS_FETCHER) && relationName.equals(Constants.NSGATEWAYS)) {
            return ModelHelper.getNSGatewaysForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSGATEWAYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getNSGatewayTemplatesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NSGATEWAYTEMPLATES_FETCHER) && relationName.equals(Constants.NSGATEWAYTEMPLATES)) {
            return ModelHelper.getNSGatewayTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER)) {
            return toList(ModelHelper.getNSRedundantGatewayGroupsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER) && relationName.equals(Constants.NSREDUNDANTGATEWAYGROUPS)) {
            return ModelHelper.getNSRedundantGatewayGroupsForFetcherId(id);
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
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            return toList(ModelHelper.getRoutingPoliciesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER) && relationName.equals(Constants.ROUTINGPOLICIES)) {
            return ModelHelper.getRoutingPoliciesForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER)) {
            return toList(ModelHelper.getSharedNetworkResourcesFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.SHAREDNETWORKRESOURCES_FETCHER) && relationName.equals(Constants.SHAREDNETWORKRESOURCES)) {
            return ModelHelper.getSharedNetworkResourcesForFetcherId(id);
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
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        
        if (type.equals(Constants.ENTERPRISE) && relationName.equals(Constants.ZFBREQUESTS_FETCHER)) {
            return toList(ModelHelper.getZFBRequestsFetcherForEnterpriseId(id));
        }
        if (type.equals(Constants.ZFBREQUESTS_FETCHER) && relationName.equals(Constants.ZFBREQUESTS)) {
            return ModelHelper.getZFBRequestsForFetcherId(id);
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
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForLinkId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.NEXTHOPADDRESS_FETCHER)) {
            return toList(ModelHelper.getNextHopAddressFetcherForLinkId(id));
        }
        if (type.equals(Constants.NEXTHOPADDRESS_FETCHER) && relationName.equals(Constants.NEXTHOPADDRESS)) {
            return ModelHelper.getNextHopAddressForFetcherId(id);
        }
        
        if (type.equals(Constants.LINK) && relationName.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER)) {
            return toList(ModelHelper.getOverlayAddressPoolsFetcherForLinkId(id));
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER) && relationName.equals(Constants.OVERLAYADDRESSPOOLS)) {
            return ModelHelper.getOverlayAddressPoolsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.CONTAINERS_FETCHER)) {
            return toList(ModelHelper.getContainersFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.CONTAINERS_FETCHER) && relationName.equals(Constants.CONTAINERS)) {
            return ModelHelper.getContainersForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.EVENTLOGS_FETCHER)) {
            return toList(ModelHelper.getEventLogsFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.EVENTLOGS_FETCHER) && relationName.equals(Constants.EVENTLOGS)) {
            return ModelHelper.getEventLogsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.GLOBALMETADATAS_FETCHER)) {
            return toList(ModelHelper.getGlobalMetadatasFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.GLOBALMETADATAS_FETCHER) && relationName.equals(Constants.GLOBALMETADATAS)) {
            return ModelHelper.getGlobalMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER)) {
            return toList(ModelHelper.getIngressACLEntryTemplatesFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATES_FETCHER) && relationName.equals(Constants.INGRESSACLENTRYTEMPLATES)) {
            return ModelHelper.getIngressACLEntryTemplatesForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.JOBS_FETCHER)) {
            return toList(ModelHelper.getJobsFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.JOBS_FETCHER) && relationName.equals(Constants.JOBS)) {
            return ModelHelper.getJobsForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.METADATAS_FETCHER)) {
            return toList(ModelHelper.getMetadatasFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.METADATAS_FETCHER) && relationName.equals(Constants.METADATAS)) {
            return ModelHelper.getMetadatasForFetcherId(id);
        }
        
        if (type.equals(Constants.INGRESSACLTEMPLATE) && relationName.equals(Constants.VMS_FETCHER)) {
            return toList(ModelHelper.getVMsFetcherForIngressACLTemplateId(id));
        }
        if (type.equals(Constants.VMS_FETCHER) && relationName.equals(Constants.VMS)) {
            return ModelHelper.getVMsForFetcherId(id);
        }
        throw new UnsupportedOperationException("implement findRelationImpl(String type, String id, String relationName) - type: " + type + ", id: " + id + ", relationName: " + relationName);
    }

    @Override
    public QueryResult findAllImpl(String type, String query) throws RestException {
        if (type.equals(Constants.SESSION)) {
            java.util.List<Session> allSessions = ModelHelper.getAllSessions();
            return new QueryResult(allSessions);
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
        
        if (type.equals(Constants.BRCONNECTION)) {
            java.util.List<BRConnection> allObjs = ModelHelper.getAllBRConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BRCONNECTIONS_FETCHER)) {
            java.util.List<BRConnectionsFetcher> allObjs = ModelHelper.getAllBRConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BRCONNECTION_MODE_ENUM)) {
            return new QueryResult(Arrays.asList(BRConnectionMode.values()));
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
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE)) {
            java.util.List<Infrastructureaccessprofile> allObjs = ModelHelper.getAllInfrastructureaccessprofiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER)) {
            java.util.List<InfrastructureaccessprofilesFetcher> allObjs = ModelHelper.getAllInfrastructureaccessprofilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_SSHAUTHMODE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureaccessprofileSSHAuthMode.values()));
        }
        
        if (type.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureaccessprofileEntityScope.values()));
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
        
        if (type.equals(Constants.VIRTUALIP)) {
            java.util.List<VirtualIP> allObjs = ModelHelper.getAllVirtualIPs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALIPS_FETCHER)) {
            java.util.List<VirtualIPsFetcher> allObjs = ModelHelper.getAllVirtualIPsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIRTUALIP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VirtualIPEntityScope.values()));
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
        
        if (type.equals(Constants.TCA)) {
            java.util.List<TCA> allObjs = ModelHelper.getAllTCAs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TCAS_FETCHER)) {
            java.util.List<TCAsFetcher> allObjs = ModelHelper.getAllTCAsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TCA_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TCAEntityScope.values()));
        }
        
        if (type.equals(Constants.TCA_METRIC_ENUM)) {
            return new QueryResult(Arrays.asList(TCAMetric.values()));
        }
        
        if (type.equals(Constants.TCA_SCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TCAScope.values()));
        }
        
        if (type.equals(Constants.TCA_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TCAType.values()));
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
        
        if (type.equals(Constants.VSGREDUNDANTPORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortPermittedAction.values()));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortPortType.values()));
        }
        
        if (type.equals(Constants.VSGREDUNDANTPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(VsgRedundantPortStatus.values()));
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
        
        if (type.equals(Constants.ZONE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZoneAssociatedApplicationObjectType.values()));
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
        
        if (type.equals(Constants.APPLICATION)) {
            java.util.List<Application> allObjs = ModelHelper.getAllApplications();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONS_FETCHER)) {
            java.util.List<ApplicationsFetcher> allObjs = ModelHelper.getAllApplicationsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileAssociatedIKEAuthenticationType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileEntityScope.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYPROFILE_SERVICECLASS_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayProfileServiceClass.values()));
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
        
        if (type.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_UPGRADEACTION_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureGatewayProfileUpgradeAction.values()));
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
        
        if (type.equals(Constants.FLOWSECURITYPOLICY)) {
            java.util.List<FlowSecurityPolicy> allObjs = ModelHelper.getAllFlowSecurityPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOWSECURITYPOLICIES_FETCHER)) {
            java.util.List<FlowSecurityPoliciesFetcher> allObjs = ModelHelper.getAllFlowSecurityPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOWSECURITYPOLICY_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(FlowSecurityPolicyAction.values()));
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY_ASSOCIATEDNETWORKOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FlowSecurityPolicyAssociatedNetworkObjectType.values()));
        }
        
        if (type.equals(Constants.FLOWSECURITYPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FlowSecurityPolicyEntityScope.values()));
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
        
        if (type.equals(Constants.VCENTERVRSCONFIG)) {
            java.util.List<VCenterVRSConfig> allObjs = ModelHelper.getAllVCenterVRSConfigs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERVRSCONFIGS_FETCHER)) {
            java.util.List<VCenterVRSConfigsFetcher> allObjs = ModelHelper.getAllVCenterVRSConfigsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERVRSCONFIG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterVRSConfigEntityScope.values()));
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
        
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE)) {
            java.util.List<InfrastructureVscProfile> allObjs = ModelHelper.getAllInfrastructureVscProfiles();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER)) {
            java.util.List<InfrastructureVscProfilesFetcher> allObjs = ModelHelper.getAllInfrastructureVscProfilesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(InfrastructureVscProfileEntityScope.values()));
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
        
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATE)) {
            java.util.List<RedirectionTargetTemplate> allObjs = ModelHelper.getAllRedirectionTargetTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)) {
            java.util.List<RedirectionTargetTemplatesFetcher> allObjs = ModelHelper.getAllRedirectionTargetTemplatesFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.METADATATAG)) {
            java.util.List<MetadataTag> allObjs = ModelHelper.getAllMetadataTags();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.METADATATAGS_FETCHER)) {
            java.util.List<MetadataTagsFetcher> allObjs = ModelHelper.getAllMetadataTagsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.METADATATAG_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MetadataTagEntityScope.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE)) {
            java.util.List<FloatingIPACLTemplate> allObjs = ModelHelper.getAllFloatingIPACLTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATES_FETCHER)) {
            java.util.List<FloatingIPACLTemplatesFetcher> allObjs = ModelHelper.getAllFloatingIPACLTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplatePriorityType.values()));
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
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ASSOCIATEDIKEAUTHENTICATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionAssociatedIKEAuthenticationType.values()));
        }
        
        if (type.equals(Constants.IKEGATEWAYCONNECTION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayConnectionEntityScope.values()));
        }
        
        if (type.equals(Constants.REDIRECTIONTARGET)) {
            java.util.List<RedirectionTarget> allObjs = ModelHelper.getAllRedirectionTargets();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.REDIRECTIONTARGETS_FETCHER)) {
            java.util.List<RedirectionTargetsFetcher> allObjs = ModelHelper.getAllRedirectionTargetsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.EGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(EgressACLEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY)) {
            java.util.List<IngressExternalServiceTemplateEntry> allObjs = ModelHelper.getAllIngressExternalServiceTemplateEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER)) {
            java.util.List<IngressExternalServiceTemplateEntriesFetcher> allObjs = ModelHelper.getAllIngressExternalServiceTemplateEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntryAction.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntryAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntryLocationType.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntryNetworkType.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntryPolicyState.values()));
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
        
        if (type.equals(Constants.OVERLAYADDRESSPOOL)) {
            java.util.List<OverlayAddressPool> allObjs = ModelHelper.getAllOverlayAddressPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYADDRESSPOOLS_FETCHER)) {
            java.util.List<OverlayAddressPoolsFetcher> allObjs = ModelHelper.getAllOverlayAddressPoolsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.LICENSESTATUS)) {
            java.util.List<LicenseStatus> allObjs = ModelHelper.getAllLicenseStatus();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.LICENSESTATUS_FETCHER)) {
            java.util.List<LicenseStatusFetcher> allObjs = ModelHelper.getAllLicenseStatusFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.DOMAIN_PATENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainPATEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_APPLICATIONDEPLOYMENTPOLICY_ENUM)) {
            return new QueryResult(Arrays.asList(DomainApplicationDeploymentPolicy.values()));
        }
        
        if (type.equals(Constants.DOMAIN_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(DomainEncryption.values()));
        }
        
        if (type.equals(Constants.DOMAIN_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainEntityScope.values()));
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
        
        if (type.equals(Constants.DOMAIN_TUNNELTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainTunnelType.values()));
        }
        
        if (type.equals(Constants.DOMAIN_UNDERLAYENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(DomainUnderlayEnabled.values()));
        }
        
        if (type.equals(Constants.DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainUplinkPreference.values()));
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
        
        if (type.equals(Constants.REDUNDANTPORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(RedundantPortStatus.values()));
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
        
        if (type.equals(Constants.OVERLAYPATNATENTRY)) {
            java.util.List<OverlayPATNATEntry> allObjs = ModelHelper.getAllOverlayPATNATEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.OVERLAYPATNATENTRIES_FETCHER)) {
            java.util.List<OverlayPATNATEntriesFetcher> allObjs = ModelHelper.getAllOverlayPATNATEntriesFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.VPORT_ADDRESSSPOOFING_ENUM)) {
            return new QueryResult(Arrays.asList(VPortAddressSpoofing.values()));
        }
        
        if (type.equals(Constants.VPORT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortEntityScope.values()));
        }
        
        if (type.equals(Constants.VPORT_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(VPortMulticast.values()));
        }
        
        if (type.equals(Constants.VPORT_OPERATIONALSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortOperationalState.values()));
        }
        
        if (type.equals(Constants.VPORT_SYSTEMTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortSystemType.values()));
        }
        
        if (type.equals(Constants.VPORT_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(VPortType.values()));
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY)) {
            java.util.List<FlowForwardingPolicy> allObjs = ModelHelper.getAllFlowForwardingPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOWFORWARDINGPOLICIES_FETCHER)) {
            java.util.List<FlowForwardingPoliciesFetcher> allObjs = ModelHelper.getAllFlowForwardingPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOWFORWARDINGPOLICY_ASSOCIATEDNETWORKOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FlowForwardingPolicyAssociatedNetworkObjectType.values()));
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FlowForwardingPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.FLOWFORWARDINGPOLICY_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FlowForwardingPolicyType.values()));
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
        
        if (type.equals(Constants.PORT_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(PortPermittedAction.values()));
        }
        
        if (type.equals(Constants.PORT_PORTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PortPortType.values()));
        }
        
        if (type.equals(Constants.PORT_STATUS_ENUM)) {
            return new QueryResult(Arrays.asList(PortStatus.values()));
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
        if (type.equals(Constants.SUBNET_DPI_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetDPI.values()));
        }
        
        if (type.equals(Constants.SUBNET_IPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetIPType.values()));
        }
        
        if (type.equals(Constants.SUBNET_PATENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetPATEnabled.values()));
        }
        
        if (type.equals(Constants.SUBNET_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.SUBNET_DEFAULTACTION_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetDefaultAction.values()));
        }
        
        if (type.equals(Constants.SUBNET_ENCRYPTION_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetEncryption.values()));
        }
        
        if (type.equals(Constants.SUBNET_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetEntityScope.values()));
        }
        
        if (type.equals(Constants.SUBNET_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.SUBNET_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetMulticast.values()));
        }
        
        if (type.equals(Constants.SUBNET_UNDERLAYENABLED_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetUnderlayEnabled.values()));
        }
        
        if (type.equals(Constants.SUBNET_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(SubnetUseGlobalMAC.values()));
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
        
        if (type.equals(Constants.VRS)) {
            java.util.List<VRS> allObjs = ModelHelper.getAllVRSs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSS_FETCHER)) {
            java.util.List<VRSsFetcher> allObjs = ModelHelper.getAllVRSsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRS_JSONRPCCONNECTIONSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSJSONRPCConnectionState.values()));
        }
        
        if (type.equals(Constants.VRS_CLUSTERNODEROLE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSClusterNodeRole.values()));
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
        
        if (type.equals(Constants.VRS_VSCCONFIGSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSVscConfigState.values()));
        }
        
        if (type.equals(Constants.VRS_VSCCURRENTSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSVscCurrentState.values()));
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
        
        if (type.equals(Constants.VLAN)) {
            java.util.List<VLAN> allObjs = ModelHelper.getAllVLANs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLANS_FETCHER)) {
            java.util.List<VLANsFetcher> allObjs = ModelHelper.getAllVLANsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.ZFBREQUEST_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ZFBRequestEntityScope.values()));
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
        
        if (type.equals(Constants.JOB)) {
            java.util.List<Job> allObjs = ModelHelper.getAllJobs();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.JOBS_FETCHER)) {
            java.util.List<JobsFetcher> allObjs = ModelHelper.getAllJobsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.JOB_ASSOCENTITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(JobAssocEntityType.values()));
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
        
        if (type.equals(Constants.VCENTERHYPERVISOR)) {
            java.util.List<VCenterHypervisor> allObjs = ModelHelper.getAllVCenterHypervisors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERHYPERVISORS_FETCHER)) {
            java.util.List<VCenterHypervisorsFetcher> allObjs = ModelHelper.getAllVCenterHypervisorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERHYPERVISOR_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERHYPERVISOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterHypervisorEntityScope.values()));
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
        
        if (type.equals(Constants.VIA)) {
            java.util.List<Via> allObjs = ModelHelper.getAllVias();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VIAS_FETCHER)) {
            java.util.List<ViasFetcher> allObjs = ModelHelper.getAllViasFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.PERFORMANCEMONITOR)) {
            java.util.List<PerformanceMonitor> allObjs = ModelHelper.getAllPerformanceMonitors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PERFORMANCEMONITORS_FETCHER)) {
            java.util.List<PerformanceMonitorsFetcher> allObjs = ModelHelper.getAllPerformanceMonitorsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PERFORMANCEMONITOR_SERVICECLASS_ENUM)) {
            return new QueryResult(Arrays.asList(PerformanceMonitorServiceClass.values()));
        }
        
        if (type.equals(Constants.NEXTHOPADDRESS)) {
            java.util.List<NextHopAddress> allObjs = ModelHelper.getAllNextHopAddress();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NEXTHOPADDRESS_FETCHER)) {
            java.util.List<NextHopAddressFetcher> allObjs = ModelHelper.getAllNextHopAddressFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.VCENTERCLUSTER)) {
            java.util.List<VCenterCluster> allObjs = ModelHelper.getAllVCenterClusters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERCLUSTERS_FETCHER)) {
            java.util.List<VCenterClustersFetcher> allObjs = ModelHelper.getAllVCenterClustersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERCLUSTER_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERCLUSTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterClusterEntityScope.values()));
        }
        
        if (type.equals(Constants.MULTICASTRANGE)) {
            java.util.List<MultiCastRange> allObjs = ModelHelper.getAllMultiCastRanges();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTRANGES_FETCHER)) {
            java.util.List<MultiCastRangesFetcher> allObjs = ModelHelper.getAllMultiCastRangesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.MULTICASTRANGE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(MultiCastRangeEntityScope.values()));
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
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressAdvFwdEntryTemplateUplinkPreference.values()));
        }
        
        if (type.equals(Constants.APPLICATIONBINDING)) {
            java.util.List<ApplicationBinding> allObjs = ModelHelper.getAllApplicationBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONBINDINGS_FETCHER)) {
            java.util.List<ApplicationBindingsFetcher> allObjs = ModelHelper.getAllApplicationBindingsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.NEXTHOP)) {
            java.util.List<NextHop> allObjs = ModelHelper.getAllNextHops();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NEXTHOPS_FETCHER)) {
            java.util.List<NextHopsFetcher> allObjs = ModelHelper.getAllNextHopsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NEXTHOP_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NextHopEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERNOTIFICATION)) {
            java.util.List<KeyServerNotification> allObjs = ModelHelper.getAllKeyServerNotifications();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERNOTIFICATIONS_FETCHER)) {
            java.util.List<KeyServerNotificationsFetcher> allObjs = ModelHelper.getAllKeyServerNotificationsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.KEYSERVERNOTIFICATION_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerNotificationEntityScope.values()));
        }
        
        if (type.equals(Constants.KEYSERVERNOTIFICATION_NOTIFICATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(KeyServerNotificationNotificationType.values()));
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
        
        if (type.equals(Constants.TIER)) {
            java.util.List<Tier> allObjs = ModelHelper.getAllTiers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TIERS_FETCHER)) {
            java.util.List<TiersFetcher> allObjs = ModelHelper.getAllTiersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.TIER_ASSOCIATEDNETWORKOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TierAssociatedNetworkObjectType.values()));
        }
        
        if (type.equals(Constants.TIER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(TierEntityScope.values()));
        }
        
        if (type.equals(Constants.TIER_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(TierType.values()));
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
        
        if (type.equals(Constants.GATEWAY)) {
            java.util.List<Gateway> allObjs = ModelHelper.getAllGateways();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAYS_FETCHER)) {
            java.util.List<GatewaysFetcher> allObjs = ModelHelper.getAllGatewaysFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.GATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.GATEWAY_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayPermittedAction.values()));
        }
        
        if (type.equals(Constants.GATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(GatewayPersonality.values()));
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
        
        if (type.equals(Constants.STATISTICS)) {
            java.util.List<Statistics> allObjs = ModelHelper.getAllStatistics();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.STATISTICS_FETCHER)) {
            java.util.List<StatisticsFetcher> allObjs = ModelHelper.getAllStatisticsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.VCENTERDATACENTER)) {
            java.util.List<VCenterDataCenter> allObjs = ModelHelper.getAllVCenterDataCenters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERDATACENTERS_FETCHER)) {
            java.util.List<VCenterDataCentersFetcher> allObjs = ModelHelper.getAllVCenterDataCentersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERDATACENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTERDATACENTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDataCenterEntityScope.values()));
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
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateMulticast.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplatePolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.L2DOMAINTEMPLATE_USEGLOBALMAC_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainTemplateUseGlobalMAC.values()));
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
        
        if (type.equals(Constants.APPLICATIONSERVICE)) {
            java.util.List<ApplicationService> allObjs = ModelHelper.getAllApplicationServices();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONSERVICES_FETCHER)) {
            java.util.List<ApplicationServicesFetcher> allObjs = ModelHelper.getAllApplicationServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONSERVICE_DIRECTION_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationServiceDirection.values()));
        }
        
        if (type.equals(Constants.APPLICATIONSERVICE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationServiceEntityScope.values()));
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
        
        if (type.equals(Constants.IKEGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IKEGatewayEntityScope.values()));
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
        
        if (type.equals(Constants.VCENTER)) {
            java.util.List<VCenter> allObjs = ModelHelper.getAllVCenters();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTERS_FETCHER)) {
            java.util.List<VCentersFetcher> allObjs = ModelHelper.getAllVCentersFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VCENTER_DESTINATIONMIRRORPORT_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterDestinationMirrorPort.values()));
        }
        
        if (type.equals(Constants.VCENTER_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VCenterEntityScope.values()));
        }
        
        if (type.equals(Constants.BULKSTATISTICS)) {
            java.util.List<BulkStatistics> allObjs = ModelHelper.getAllBulkStatistics();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BULKSTATISTICS_FETCHER)) {
            java.util.List<BulkStatisticsFetcher> allObjs = ModelHelper.getAllBulkStatisticsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateLocationType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplateNetworkType.values()));
        }
        
        if (type.equals(Constants.INGRESSACLENTRYTEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressACLEntryTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY)) {
            java.util.List<RoutingPolicy> allObjs = ModelHelper.getAllRoutingPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROUTINGPOLICIES_FETCHER)) {
            java.util.List<RoutingPoliciesFetcher> allObjs = ModelHelper.getAllRoutingPoliciesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ROUTINGPOLICY_DEFAULTACTION_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyDefaultAction.values()));
        }
        
        if (type.equals(Constants.ROUTINGPOLICY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(RoutingPolicyEntityScope.values()));
        }
        
        if (type.equals(Constants.NETWORKPERFORMANCEBINDING)) {
            java.util.List<NetworkPerformanceBinding> allObjs = ModelHelper.getAllNetworkPerformanceBindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER)) {
            java.util.List<NetworkPerformanceBindingsFetcher> allObjs = ModelHelper.getAllNetworkPerformanceBindingsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.L2DOMAIN_MAINTENANCEMODE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainMaintenanceMode.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_MULTICAST_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainMulticast.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_POLICYCHANGESTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainPolicyChangeStatus.values()));
        }
        
        if (type.equals(Constants.L2DOMAIN_UPLINKPREFERENCE_ENUM)) {
            return new QueryResult(Arrays.asList(L2DomainUplinkPreference.values()));
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
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT)) {
            java.util.List<Applicationperformancemanagement> allObjs = ModelHelper.getAllApplicationperformancemanagements();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER)) {
            java.util.List<ApplicationperformancemanagementsFetcher> allObjs = ModelHelper.getAllApplicationperformancemanagementsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_APPLICATIONGROUPTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ApplicationperformancemanagementApplicationGroupType.values()));
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
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE)) {
            java.util.List<IngressExternalServiceTemplate> allObjs = ModelHelper.getAllIngressExternalServiceTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER)) {
            java.util.List<IngressExternalServiceTemplatesFetcher> allObjs = ModelHelper.getAllIngressExternalServiceTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplateEntityScope.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplatePolicyState.values()));
        }
        
        if (type.equals(Constants.INGRESSEXTERNALSERVICETEMPLATE_PRIORITYTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(IngressExternalServiceTemplatePriorityType.values()));
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
        
        if (type.equals(Constants.ENDPOINT)) {
            java.util.List<EndPoint> allObjs = ModelHelper.getAllEndPoints();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENDPOINTS_FETCHER)) {
            java.util.List<EndPointsFetcher> allObjs = ModelHelper.getAllEndPointsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.ENDPOINT_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EndPointEntityScope.values()));
        }
        
        if (type.equals(Constants.L7APPLICATIONSIGNATURE)) {
            java.util.List<L7applicationsignature> allObjs = ModelHelper.getAllL7applicationsignatures();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.L7APPLICATIONSIGNATURES_FETCHER)) {
            java.util.List<L7applicationsignaturesFetcher> allObjs = ModelHelper.getAllL7applicationsignaturesFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.NSGATEWAY_BOOTSTRAPSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayBootstrapStatus.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONRELOADSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayConfigurationReloadState.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_CONFIGURATIONSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayConfigurationStatus.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayFamily.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_INHERITEDSSHSERVICESTATE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayInheritedSSHServiceState.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_PERMITTEDACTION_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayPermittedAction.values()));
        }
        
        if (type.equals(Constants.NSGATEWAY_PERSONALITY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGatewayPersonality.values()));
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
        
        if (type.equals(Constants.VRSADDRESSRANGE)) {
            java.util.List<VRSAddressRange> allObjs = ModelHelper.getAllVRSAddressRanges();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSADDRESSRANGES_FETCHER)) {
            java.util.List<VRSAddressRangesFetcher> allObjs = ModelHelper.getAllVRSAddressRangesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VRSADDRESSRANGE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VRSAddressRangeEntityScope.values()));
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
        
        if (type.equals(Constants.EGRESSQOSPOLICY)) {
            java.util.List<EgressQOSPolicy> allObjs = ModelHelper.getAllEgressQOSPolicies();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EGRESSQOSPOLICIES_FETCHER)) {
            java.util.List<EgressQOSPoliciesFetcher> allObjs = ModelHelper.getAllEgressQOSPoliciesFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_DESTINATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryDestinationType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryLocationType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryNetworkType.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntryPolicyState.values()));
        }
        
        if (type.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_SOURCETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DomainFIPAclTemplateEntrySourceType.values()));
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
        
        if (type.equals(Constants.UPLINKCONNECTION)) {
            java.util.List<UplinkConnection> allObjs = ModelHelper.getAllUplinkConnections();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UPLINKCONNECTIONS_FETCHER)) {
            java.util.List<UplinkConnectionsFetcher> allObjs = ModelHelper.getAllUplinkConnectionsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.UPLINKCONNECTION_ADDRESS_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionAddress.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_MODE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionMode.values()));
        }
        
        if (type.equals(Constants.UPLINKCONNECTION_ROLE_ENUM)) {
            return new QueryResult(Arrays.asList(UplinkConnectionRole.values()));
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
        
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING)) {
            java.util.List<Applicationperformancemanagementbinding> allObjs = ModelHelper.getAllApplicationperformancemanagementbindings();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER)) {
            java.util.List<ApplicationperformancemanagementbindingsFetcher> allObjs = ModelHelper.getAllApplicationperformancemanagementbindingsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.EXTERNALSERVICE)) {
            java.util.List<ExternalService> allObjs = ModelHelper.getAllExternalServices();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EXTERNALSERVICES_FETCHER)) {
            java.util.List<ExternalServicesFetcher> allObjs = ModelHelper.getAllExternalServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EXTERNALSERVICE_DIRECTION_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalServiceDirection.values()));
        }
        
        if (type.equals(Constants.EXTERNALSERVICE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalServiceEntityScope.values()));
        }
        
        if (type.equals(Constants.EXTERNALSERVICE_SERVICETYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalServiceServiceType.values()));
        }
        
        if (type.equals(Constants.EXTERNALSERVICE_STAGE_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalServiceStage.values()));
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
        
        if (type.equals(Constants.PATNATPOOL)) {
            java.util.List<PATNATPool> allObjs = ModelHelper.getAllPATNATPools();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.PATNATPOOLS_FETCHER)) {
            java.util.List<PATNATPoolsFetcher> allObjs = ModelHelper.getAllPATNATPoolsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.BGPNEIGHBOR)) {
            java.util.List<BGPNeighbor> allObjs = ModelHelper.getAllBGPNeighbors();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPNEIGHBORS_FETCHER)) {
            java.util.List<BGPNeighborsFetcher> allObjs = ModelHelper.getAllBGPNeighborsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.BGPNEIGHBOR_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(BGPNeighborEntityScope.values()));
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
        
        if (type.equals(Constants.SYSTEMCONFIG_SYSTEMAVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(SystemConfigSystemAvatarType.values()));
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
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY)) {
            java.util.List<FloatingIPACLTemplateEntry> allObjs = ModelHelper.getAllFloatingIPACLTemplateEntries();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER)) {
            java.util.List<FloatingIPACLTemplateEntriesFetcher> allObjs = ModelHelper.getAllFloatingIPACLTemplateEntriesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_ACTION_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntryAction.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_ASSOCIATEDAPPLICATIONOBJECTTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntryAssociatedApplicationObjectType.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntryEntityScope.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_LOCATIONTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntryLocationType.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntryNetworkType.values()));
        }
        
        if (type.equals(Constants.FLOATINGIPACLTEMPLATEENTRY_POLICYSTATE_ENUM)) {
            return new QueryResult(Arrays.asList(FloatingIPACLTemplateEntryPolicyState.values()));
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
        
        if (type.equals(Constants.POLICYGROUP_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(PolicyGroupType.values()));
        }
        
        if (type.equals(Constants.DEMARCATIONSERVICE)) {
            java.util.List<DemarcationService> allObjs = ModelHelper.getAllDemarcationServices();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEMARCATIONSERVICES_FETCHER)) {
            java.util.List<DemarcationServicesFetcher> allObjs = ModelHelper.getAllDemarcationServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.DEMARCATIONSERVICE_TYPE_ENUM)) {
            return new QueryResult(Arrays.asList(DemarcationServiceType.values()));
        }
        
        if (type.equals(Constants.NSGINFO)) {
            java.util.List<NSGInfo> allObjs = ModelHelper.getAllNSGInfos();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGINFOS_FETCHER)) {
            java.util.List<NSGInfosFetcher> allObjs = ModelHelper.getAllNSGInfosFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NSGINFO_TPMSTATUS_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoTPMStatus.values()));
        }
        
        if (type.equals(Constants.NSGINFO_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoEntityScope.values()));
        }
        
        if (type.equals(Constants.NSGINFO_FAMILY_ENUM)) {
            return new QueryResult(Arrays.asList(NSGInfoFamily.values()));
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE)) {
            java.util.List<ExternalAppService> allObjs = ModelHelper.getAllExternalAppServices();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EXTERNALAPPSERVICES_FETCHER)) {
            java.util.List<ExternalAppServicesFetcher> allObjs = ModelHelper.getAllExternalAppServicesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.EXTERNALAPPSERVICE_EGRESSTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalAppServiceEgressType.values()));
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalAppServiceEntityScope.values()));
        }
        
        if (type.equals(Constants.EXTERNALAPPSERVICE_INGRESSTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(ExternalAppServiceIngressType.values()));
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
        
        if (type.equals(Constants.FLOW)) {
            java.util.List<Flow> allObjs = ModelHelper.getAllFlows();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOWS_FETCHER)) {
            java.util.List<FlowsFetcher> allObjs = ModelHelper.getAllFlowsFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.FLOW_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(FlowEntityScope.values()));
        }
        
        if (type.equals(Constants.VLANTEMPLATE)) {
            java.util.List<VLANTemplate> allObjs = ModelHelper.getAllVLANTemplates();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLANTEMPLATES_FETCHER)) {
            java.util.List<VLANTemplatesFetcher> allObjs = ModelHelper.getAllVLANTemplatesFetchers();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.VLANTEMPLATE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(VLANTemplateEntityScope.values()));
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
        
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENT)) {
            java.util.List<NetworkPerformanceMeasurement> allObjs = ModelHelper.getAllNetworkPerformanceMeasurements();
            return new QueryResult(allObjs);
        }
        if (type.equals(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER)) {
            java.util.List<NetworkPerformanceMeasurementsFetcher> allObjs = ModelHelper.getAllNetworkPerformanceMeasurementsFetchers();
            return new QueryResult(allObjs);
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
        
        if (type.equals(Constants.ENTERPRISE_AVATARTYPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseAvatarType.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_ENCRYPTIONMANAGEMENTMODE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseEncryptionManagementMode.values()));
        }
        
        if (type.equals(Constants.ENTERPRISE_ENTITYSCOPE_ENUM)) {
            return new QueryResult(Arrays.asList(EnterpriseEntityScope.values()));
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
        throw new UnsupportedOperationException("implement findAll(String type, String query) - type: " + type + ", query: " + query);
    }
}
