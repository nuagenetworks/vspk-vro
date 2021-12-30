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
import net.nuagenetworks.vro.vspk.model.fetchers.AlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AllAlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationperformancemanagementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AvatarsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AzureCloudsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CaptivePortalProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.COSRemarkingPolicyTablesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DeploymentFailuresFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainKindSummariesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DSCPForwardingClassTablesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DSCPRemarkingPolicyTablesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressQOSPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterpriseNetworksFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterpriseSecuritiesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FirewallAclsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.FirewallRulesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysLocationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GNMIProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupKeyEncryptionProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ICMPEchoTestDefinitionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IDPProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKECertificatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEEncryptionprofilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewayProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEPSKsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressQOSPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPFilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPv6FilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L4ServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L4ServiceGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L7applicationsignaturesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LDAPConfigurationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiCastListsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetconfProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkMacroGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkPerformanceMeasurementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaysCountsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaySummariesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSRedundantGatewayGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.OverlayManagementProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PerformanceMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupCategoriesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyObjectGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PublicNetworkMacrosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RateLimitersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedundancyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RolesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RoutingPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SaaSApplicationGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SaaSApplicationTypesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SAPEgressQoSProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SAPIngressQoSProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ScheduledTestSuitesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SharedNetworkResourcesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SyslogDestinationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TestDefinitionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TestSuitesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TrunksFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UsersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFThresholdPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.WebCategoriesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.WebDomainNamesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ZFBRequestsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseAllowedForwardingClasses;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseAllowedForwardingMode;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseAvatarType;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseEncryptionManagementMode;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseEnterpriseType;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseFlowCollectionEnabled;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseThreatIntelligenceEnabled;
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

@VsoFinder(name = Constants.ENTERPRISE, datasource = Constants.DATASOURCE, image = Constants.ENTERPRISE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.APPLICATIONS_FETCHER, type = Constants.APPLICATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, type = Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.AVATARS_FETCHER, type = Constants.AVATARS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.AZURECLOUDS_FETCHER, type = Constants.AZURECLOUDS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.BGPPROFILES_FETCHER, type = Constants.BGPPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CAPTIVEPORTALPROFILES_FETCHER, type = Constants.CAPTIVEPORTALPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.COSREMARKINGPOLICYTABLES_FETCHER, type = Constants.COSREMARKINGPOLICYTABLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINS_FETCHER, type = Constants.DOMAINS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINTEMPLATES_FETCHER, type = Constants.DOMAINTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, type = Constants.DSCPFORWARDINGCLASSTABLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DSCPREMARKINGPOLICYTABLES_FETCHER, type = Constants.DSCPREMARKINGPOLICYTABLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSPROFILES_FETCHER, type = Constants.EGRESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSQOSPOLICIES_FETCHER, type = Constants.EGRESSQOSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISENETWORKS_FETCHER, type = Constants.ENTERPRISENETWORKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.FIREWALLACLS_FETCHER, type = Constants.FIREWALLACLS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.FIREWALLRULES_FETCHER, type = Constants.FIREWALLRULES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYS_FETCHER, type = Constants.GATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYTEMPLATES_FETCHER, type = Constants.GATEWAYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GNMIPROFILES_FETCHER, type = Constants.GNMIPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GROUPS_FETCHER, type = Constants.GROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ICMPECHOTESTDEFINITIONS_FETCHER, type = Constants.ICMPECHOTESTDEFINITIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IDPPROFILES_FETCHER, type = Constants.IDPPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKECERTIFICATES_FETCHER, type = Constants.IKECERTIFICATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEENCRYPTIONPROFILES_FETCHER, type = Constants.IKEENCRYPTIONPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEGATEWAYS_FETCHER, type = Constants.IKEGATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEGATEWAYPROFILES_FETCHER, type = Constants.IKEGATEWAYPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEPSKS_FETCHER, type = Constants.IKEPSKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSPROFILES_FETCHER, type = Constants.INGRESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSQOSPOLICIES_FETCHER, type = Constants.INGRESSQOSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IPFILTERPROFILES_FETCHER, type = Constants.IPFILTERPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IPV6FILTERPROFILES_FETCHER, type = Constants.IPV6FILTERPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L2DOMAINS_FETCHER, type = Constants.L2DOMAINS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L2DOMAINTEMPLATES_FETCHER, type = Constants.L2DOMAINTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L4SERVICES_FETCHER, type = Constants.L4SERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L4SERVICEGROUPS_FETCHER, type = Constants.L4SERVICEGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETCONFPROFILES_FETCHER, type = Constants.NETCONFPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETWORKMACROGROUPS_FETCHER, type = Constants.NETWORKMACROGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, type = Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGATEWAYS_FETCHER, type = Constants.NSGATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGGROUPS_FETCHER, type = Constants.NSGGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, type = Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.OVERLAYMANAGEMENTPROFILES_FETCHER, type = Constants.OVERLAYMANAGEMENTPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERFORMANCEMONITORS_FETCHER, type = Constants.PERFORMANCEMONITORS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.POLICYGROUPCATEGORIES_FETCHER, type = Constants.POLICYGROUPCATEGORIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.POLICYOBJECTGROUPS_FETCHER, type = Constants.POLICYOBJECTGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PUBLICNETWORKMACROS_FETCHER, type = Constants.PUBLICNETWORKMACROS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.RATELIMITERS_FETCHER, type = Constants.RATELIMITERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDUNDANCYGROUPS_FETCHER, type = Constants.REDUNDANCYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ROUTINGPOLICIES_FETCHER, type = Constants.ROUTINGPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SAASAPPLICATIONGROUPS_FETCHER, type = Constants.SAASAPPLICATIONGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SAASAPPLICATIONTYPES_FETCHER, type = Constants.SAASAPPLICATIONTYPES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SAPEGRESSQOSPROFILES_FETCHER, type = Constants.SAPEGRESSQOSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SAPINGRESSQOSPROFILES_FETCHER, type = Constants.SAPINGRESSQOSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SCHEDULEDTESTSUITES_FETCHER, type = Constants.SCHEDULEDTESTSUITES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.SYSLOGDESTINATIONS_FETCHER, type = Constants.SYSLOGDESTINATIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TESTDEFINITIONS_FETCHER, type = Constants.TESTDEFINITIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TESTSUITES_FETCHER, type = Constants.TESTSUITES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TRUNKS_FETCHER, type = Constants.TRUNKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.USERS_FETCHER, type = Constants.USERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VNFS_FETCHER, type = Constants.VNFS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VNFMETADATAS_FETCHER, type = Constants.VNFMETADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VNFTHRESHOLDPOLICIES_FETCHER, type = Constants.VNFTHRESHOLDPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.WEBCATEGORIES_FETCHER, type = Constants.WEBCATEGORIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.WEBDOMAINNAMES_FETCHER, type = Constants.WEBDOMAINNAMES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ZFBREQUESTS_FETCHER, type = Constants.ZFBREQUESTS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterprise", resourceName = "enterprises")
public class Enterprise extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BGPEnabled")
    protected Boolean BGPEnabled;
    
    @JsonProperty(value = "DHCPLeaseInterval")
    protected Long DHCPLeaseInterval;
    
    @JsonProperty(value = "LDAPAuthorizationEnabled")
    protected Boolean LDAPAuthorizationEnabled;
    
    @JsonProperty(value = "LDAPEnabled")
    protected Boolean LDAPEnabled;
    
    @JsonProperty(value = "VNFManagementEnabled")
    protected Boolean VNFManagementEnabled;
    
    @JsonProperty(value = "allowAdvancedQOSConfiguration")
    protected Boolean allowAdvancedQOSConfiguration;
    
    @JsonProperty(value = "allowGatewayManagement")
    protected Boolean allowGatewayManagement;
    
    @JsonProperty(value = "allowTrustedForwardingClass")
    protected Boolean allowTrustedForwardingClass;
    
    @JsonProperty(value = "allowedForwardingClasses")
    protected java.util.List<EnterpriseAllowedForwardingClasses> allowedForwardingClasses;
    
    @JsonProperty(value = "allowedForwardingMode")
    protected EnterpriseAllowedForwardingMode allowedForwardingMode;
    
    @JsonProperty(value = "associatedEnterpriseSecurityID")
    protected String associatedEnterpriseSecurityID;
    
    @JsonProperty(value = "associatedGroupKeyEncryptionProfileID")
    protected String associatedGroupKeyEncryptionProfileID;
    
    @JsonProperty(value = "associatedKeyServerMonitorID")
    protected String associatedKeyServerMonitorID;
    
    @JsonProperty(value = "avatarData")
    protected String avatarData;
    
    @JsonProperty(value = "avatarType")
    protected EnterpriseAvatarType avatarType;
    
    @JsonProperty(value = "blockedPageText")
    protected String blockedPageText;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "customerID")
    protected Long customerID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "dictionaryVersion")
    protected Long dictionaryVersion;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enableApplicationPerformanceManagement")
    protected Boolean enableApplicationPerformanceManagement;
    
    @JsonProperty(value = "encryptionManagementMode")
    protected EnterpriseEncryptionManagementMode encryptionManagementMode;
    
    @JsonProperty(value = "enterpriseProfileID")
    protected String enterpriseProfileID;
    
    @JsonProperty(value = "enterpriseType")
    protected EnterpriseEnterpriseType enterpriseType;
    
    @JsonProperty(value = "entityScope")
    protected EnterpriseEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "floatingIPsQuota")
    protected Long floatingIPsQuota;
    
    @JsonProperty(value = "floatingIPsUsed")
    protected Long floatingIPsUsed;
    
    @JsonProperty(value = "flowCollectionEnabled")
    protected EnterpriseFlowCollectionEnabled flowCollectionEnabled;
    
    @JsonProperty(value = "forwardingClass")
    protected java.util.List<String> forwardingClass;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "localAS")
    protected Long localAS;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "receiveMultiCastListID")
    protected String receiveMultiCastListID;
    
    @JsonProperty(value = "sendMultiCastListID")
    protected String sendMultiCastListID;
    
    @JsonProperty(value = "sharedEnterprise")
    protected Boolean sharedEnterprise;
    
    @JsonProperty(value = "threatIntelligenceEnabled")
    protected EnterpriseThreatIntelligenceEnabled threatIntelligenceEnabled;
    
    @JsonProperty(value = "threatPreventionManagementEnabled")
    protected Boolean threatPreventionManagementEnabled;
    
    @JsonProperty(value = "useGlobalMAC")
    protected Boolean useGlobalMAC;
    
    @JsonProperty(value = "virtualFirewallRulesEnabled")
    protected Boolean virtualFirewallRulesEnabled;
    
    @JsonProperty(value = "webFilterEnabled")
    protected Boolean webFilterEnabled;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private AllAlarmsFetcher allAlarms;
    
    @JsonIgnore
    private ApplicationsFetcher applications;
    
    @JsonIgnore
    private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
    
    @JsonIgnore
    private AvatarsFetcher avatars;
    
    @JsonIgnore
    private AzureCloudsFetcher azureClouds;
    
    @JsonIgnore
    private BGPProfilesFetcher bGPProfiles;
    
    @JsonIgnore
    private CaptivePortalProfilesFetcher captivePortalProfiles;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private COSRemarkingPolicyTablesFetcher cOSRemarkingPolicyTables;
    
    @JsonIgnore
    private DeploymentFailuresFetcher deploymentFailures;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private DomainKindSummariesFetcher domainKindSummaries;
    
    @JsonIgnore
    private DomainTemplatesFetcher domainTemplates;
    
    @JsonIgnore
    private DSCPForwardingClassTablesFetcher dSCPForwardingClassTables;
    
    @JsonIgnore
    private DSCPRemarkingPolicyTablesFetcher dSCPRemarkingPolicyTables;
    
    @JsonIgnore
    private EgressProfilesFetcher egressProfiles;
    
    @JsonIgnore
    private EgressQOSPoliciesFetcher egressQOSPolicies;
    
    @JsonIgnore
    private EnterpriseNetworksFetcher enterpriseNetworks;
    
    @JsonIgnore
    private EnterpriseSecuritiesFetcher enterpriseSecurities;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private FirewallAclsFetcher firewallAcls;
    
    @JsonIgnore
    private FirewallRulesFetcher firewallRules;
    
    @JsonIgnore
    private GatewaysFetcher gateways;
    
    @JsonIgnore
    private GatewaysLocationsFetcher gatewaysLocations;
    
    @JsonIgnore
    private GatewayTemplatesFetcher gatewayTemplates;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private GNMIProfilesFetcher gNMIProfiles;
    
    @JsonIgnore
    private GroupsFetcher groups;
    
    @JsonIgnore
    private GroupKeyEncryptionProfilesFetcher groupKeyEncryptionProfiles;
    
    @JsonIgnore
    private ICMPEchoTestDefinitionsFetcher iCMPEchoTestDefinitions;
    
    @JsonIgnore
    private IDPProfilesFetcher iDPProfiles;
    
    @JsonIgnore
    private IKECertificatesFetcher iKECertificates;
    
    @JsonIgnore
    private IKEEncryptionprofilesFetcher iKEEncryptionprofiles;
    
    @JsonIgnore
    private IKEGatewaysFetcher iKEGateways;
    
    @JsonIgnore
    private IKEGatewayProfilesFetcher iKEGatewayProfiles;
    
    @JsonIgnore
    private IKEPSKsFetcher iKEPSKs;
    
    @JsonIgnore
    private IngressProfilesFetcher ingressProfiles;
    
    @JsonIgnore
    private IngressQOSPoliciesFetcher ingressQOSPolicies;
    
    @JsonIgnore
    private IPFilterProfilesFetcher iPFilterProfiles;
    
    @JsonIgnore
    private IPv6FilterProfilesFetcher iPv6FilterProfiles;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private KeyServerMonitorsFetcher keyServerMonitors;
    
    @JsonIgnore
    private L2DomainsFetcher l2Domains;
    
    @JsonIgnore
    private L2DomainTemplatesFetcher l2DomainTemplates;
    
    @JsonIgnore
    private L4ServicesFetcher l4Services;
    
    @JsonIgnore
    private L4ServiceGroupsFetcher l4ServiceGroups;
    
    @JsonIgnore
    private L7applicationsignaturesFetcher l7applicationsignatures;
    
    @JsonIgnore
    private LDAPConfigurationsFetcher lDAPConfigurations;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MultiCastListsFetcher multiCastLists;
    
    @JsonIgnore
    private NetconfProfilesFetcher netconfProfiles;
    
    @JsonIgnore
    private NetworkMacroGroupsFetcher networkMacroGroups;
    
    @JsonIgnore
    private NetworkPerformanceMeasurementsFetcher networkPerformanceMeasurements;
    
    @JsonIgnore
    private NSGatewaysFetcher nSGateways;
    
    @JsonIgnore
    private NSGatewaysCountsFetcher nSGatewaysCounts;
    
    @JsonIgnore
    private NSGatewaySummariesFetcher nSGatewaySummaries;
    
    @JsonIgnore
    private NSGatewayTemplatesFetcher nSGatewayTemplates;
    
    @JsonIgnore
    private NSGGroupsFetcher nSGGroups;
    
    @JsonIgnore
    private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
    
    @JsonIgnore
    private OverlayManagementProfilesFetcher overlayManagementProfiles;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PerformanceMonitorsFetcher performanceMonitors;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PolicyGroupCategoriesFetcher policyGroupCategories;
    
    @JsonIgnore
    private PolicyObjectGroupsFetcher policyObjectGroups;
    
    @JsonIgnore
    private PublicNetworkMacrosFetcher publicNetworkMacros;
    
    @JsonIgnore
    private RateLimitersFetcher rateLimiters;
    
    @JsonIgnore
    private RedundancyGroupsFetcher redundancyGroups;
    
    @JsonIgnore
    private RolesFetcher roles;
    
    @JsonIgnore
    private RoutingPoliciesFetcher routingPolicies;
    
    @JsonIgnore
    private SaaSApplicationGroupsFetcher saaSApplicationGroups;
    
    @JsonIgnore
    private SaaSApplicationTypesFetcher saaSApplicationTypes;
    
    @JsonIgnore
    private SAPEgressQoSProfilesFetcher sAPEgressQoSProfiles;
    
    @JsonIgnore
    private SAPIngressQoSProfilesFetcher sAPIngressQoSProfiles;
    
    @JsonIgnore
    private ScheduledTestSuitesFetcher scheduledTestSuites;
    
    @JsonIgnore
    private SharedNetworkResourcesFetcher sharedNetworkResources;
    
    @JsonIgnore
    private SyslogDestinationsFetcher syslogDestinations;
    
    @JsonIgnore
    private TestDefinitionsFetcher testDefinitions;
    
    @JsonIgnore
    private TestSuitesFetcher testSuites;
    
    @JsonIgnore
    private TrunksFetcher trunks;
    
    @JsonIgnore
    private UsersFetcher users;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VNFsFetcher vNFs;
    
    @JsonIgnore
    private VNFMetadatasFetcher vNFMetadatas;
    
    @JsonIgnore
    private VNFThresholdPoliciesFetcher vNFThresholdPolicies;
    
    @JsonIgnore
    private WebCategoriesFetcher webCategories;
    
    @JsonIgnore
    private WebDomainNamesFetcher webDomainNames;
    
    @JsonIgnore
    private ZFBRequestsFetcher zFBRequests;
    
    @VsoConstructor
    public Enterprise() {
        alarms = new AlarmsFetcher(this);
        
        allAlarms = new AllAlarmsFetcher(this);
        
        applications = new ApplicationsFetcher(this);
        
        applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
        
        avatars = new AvatarsFetcher(this);
        
        azureClouds = new AzureCloudsFetcher(this);
        
        bGPProfiles = new BGPProfilesFetcher(this);
        
        captivePortalProfiles = new CaptivePortalProfilesFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        cOSRemarkingPolicyTables = new COSRemarkingPolicyTablesFetcher(this);
        
        deploymentFailures = new DeploymentFailuresFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        domainKindSummaries = new DomainKindSummariesFetcher(this);
        
        domainTemplates = new DomainTemplatesFetcher(this);
        
        dSCPForwardingClassTables = new DSCPForwardingClassTablesFetcher(this);
        
        dSCPRemarkingPolicyTables = new DSCPRemarkingPolicyTablesFetcher(this);
        
        egressProfiles = new EgressProfilesFetcher(this);
        
        egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
        
        enterpriseNetworks = new EnterpriseNetworksFetcher(this);
        
        enterpriseSecurities = new EnterpriseSecuritiesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        firewallAcls = new FirewallAclsFetcher(this);
        
        firewallRules = new FirewallRulesFetcher(this);
        
        gateways = new GatewaysFetcher(this);
        
        gatewaysLocations = new GatewaysLocationsFetcher(this);
        
        gatewayTemplates = new GatewayTemplatesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        gNMIProfiles = new GNMIProfilesFetcher(this);
        
        groups = new GroupsFetcher(this);
        
        groupKeyEncryptionProfiles = new GroupKeyEncryptionProfilesFetcher(this);
        
        iCMPEchoTestDefinitions = new ICMPEchoTestDefinitionsFetcher(this);
        
        iDPProfiles = new IDPProfilesFetcher(this);
        
        iKECertificates = new IKECertificatesFetcher(this);
        
        iKEEncryptionprofiles = new IKEEncryptionprofilesFetcher(this);
        
        iKEGateways = new IKEGatewaysFetcher(this);
        
        iKEGatewayProfiles = new IKEGatewayProfilesFetcher(this);
        
        iKEPSKs = new IKEPSKsFetcher(this);
        
        ingressProfiles = new IngressProfilesFetcher(this);
        
        ingressQOSPolicies = new IngressQOSPoliciesFetcher(this);
        
        iPFilterProfiles = new IPFilterProfilesFetcher(this);
        
        iPv6FilterProfiles = new IPv6FilterProfilesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        keyServerMonitors = new KeyServerMonitorsFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        l2DomainTemplates = new L2DomainTemplatesFetcher(this);
        
        l4Services = new L4ServicesFetcher(this);
        
        l4ServiceGroups = new L4ServiceGroupsFetcher(this);
        
        l7applicationsignatures = new L7applicationsignaturesFetcher(this);
        
        lDAPConfigurations = new LDAPConfigurationsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        multiCastLists = new MultiCastListsFetcher(this);
        
        netconfProfiles = new NetconfProfilesFetcher(this);
        
        networkMacroGroups = new NetworkMacroGroupsFetcher(this);
        
        networkPerformanceMeasurements = new NetworkPerformanceMeasurementsFetcher(this);
        
        nSGateways = new NSGatewaysFetcher(this);
        
        nSGatewaysCounts = new NSGatewaysCountsFetcher(this);
        
        nSGatewaySummaries = new NSGatewaySummariesFetcher(this);
        
        nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
        
        nSGGroups = new NSGGroupsFetcher(this);
        
        nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
        
        overlayManagementProfiles = new OverlayManagementProfilesFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        performanceMonitors = new PerformanceMonitorsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        policyGroupCategories = new PolicyGroupCategoriesFetcher(this);
        
        policyObjectGroups = new PolicyObjectGroupsFetcher(this);
        
        publicNetworkMacros = new PublicNetworkMacrosFetcher(this);
        
        rateLimiters = new RateLimitersFetcher(this);
        
        redundancyGroups = new RedundancyGroupsFetcher(this);
        
        roles = new RolesFetcher(this);
        
        routingPolicies = new RoutingPoliciesFetcher(this);
        
        saaSApplicationGroups = new SaaSApplicationGroupsFetcher(this);
        
        saaSApplicationTypes = new SaaSApplicationTypesFetcher(this);
        
        sAPEgressQoSProfiles = new SAPEgressQoSProfilesFetcher(this);
        
        sAPIngressQoSProfiles = new SAPIngressQoSProfilesFetcher(this);
        
        scheduledTestSuites = new ScheduledTestSuitesFetcher(this);
        
        sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
        
        syslogDestinations = new SyslogDestinationsFetcher(this);
        
        testDefinitions = new TestDefinitionsFetcher(this);
        
        testSuites = new TestSuitesFetcher(this);
        
        trunks = new TrunksFetcher(this);
        
        users = new UsersFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vNFs = new VNFsFetcher(this);
        
        vNFMetadatas = new VNFMetadatasFetcher(this);
        
        vNFThresholdPolicies = new VNFThresholdPoliciesFetcher(this);
        
        webCategories = new WebCategoriesFetcher(this);
        
        webDomainNames = new WebDomainNamesFetcher(this);
        
        zFBRequests = new ZFBRequestsFetcher(this);
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
    @VsoProperty(displayName = "BGPEnabled", readOnly = false)   
    public Boolean getBGPEnabled() {
       return BGPEnabled;
    }

    @JsonIgnore
    public void setBGPEnabled(Boolean value) { 
        this.BGPEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPLeaseInterval", readOnly = false)   
    public Long getDHCPLeaseInterval() {
       return DHCPLeaseInterval;
    }

    @JsonIgnore
    public void setDHCPLeaseInterval(Long value) { 
        this.DHCPLeaseInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LDAPAuthorizationEnabled", readOnly = false)   
    public Boolean getLDAPAuthorizationEnabled() {
       return LDAPAuthorizationEnabled;
    }

    @JsonIgnore
    public void setLDAPAuthorizationEnabled(Boolean value) { 
        this.LDAPAuthorizationEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LDAPEnabled", readOnly = false)   
    public Boolean getLDAPEnabled() {
       return LDAPEnabled;
    }

    @JsonIgnore
    public void setLDAPEnabled(Boolean value) { 
        this.LDAPEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFManagementEnabled", readOnly = false)   
    public Boolean getVNFManagementEnabled() {
       return VNFManagementEnabled;
    }

    @JsonIgnore
    public void setVNFManagementEnabled(Boolean value) { 
        this.VNFManagementEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowAdvancedQOSConfiguration", readOnly = false)   
    public Boolean getAllowAdvancedQOSConfiguration() {
       return allowAdvancedQOSConfiguration;
    }

    @JsonIgnore
    public void setAllowAdvancedQOSConfiguration(Boolean value) { 
        this.allowAdvancedQOSConfiguration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowGatewayManagement", readOnly = false)   
    public Boolean getAllowGatewayManagement() {
       return allowGatewayManagement;
    }

    @JsonIgnore
    public void setAllowGatewayManagement(Boolean value) { 
        this.allowGatewayManagement = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowTrustedForwardingClass", readOnly = false)   
    public Boolean getAllowTrustedForwardingClass() {
       return allowTrustedForwardingClass;
    }

    @JsonIgnore
    public void setAllowTrustedForwardingClass(Boolean value) { 
        this.allowTrustedForwardingClass = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedForwardingClasses", readOnly = false)   
    public java.util.List<EnterpriseAllowedForwardingClasses> getAllowedForwardingClasses() {
       return allowedForwardingClasses;
    }

    @JsonIgnore
    public void setAllowedForwardingClasses(java.util.List<EnterpriseAllowedForwardingClasses> value) { 
        this.allowedForwardingClasses = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedForwardingMode", readOnly = false)   
    public EnterpriseAllowedForwardingMode getAllowedForwardingMode() {
       return allowedForwardingMode;
    }

    @JsonIgnore
    public void setAllowedForwardingMode(EnterpriseAllowedForwardingMode value) { 
        this.allowedForwardingMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEnterpriseSecurityID", readOnly = false)   
    public String getAssociatedEnterpriseSecurityID() {
       return associatedEnterpriseSecurityID;
    }

    @JsonIgnore
    public void setAssociatedEnterpriseSecurityID(String value) { 
        this.associatedEnterpriseSecurityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGroupKeyEncryptionProfileID", readOnly = false)   
    public String getAssociatedGroupKeyEncryptionProfileID() {
       return associatedGroupKeyEncryptionProfileID;
    }

    @JsonIgnore
    public void setAssociatedGroupKeyEncryptionProfileID(String value) { 
        this.associatedGroupKeyEncryptionProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedKeyServerMonitorID", readOnly = false)   
    public String getAssociatedKeyServerMonitorID() {
       return associatedKeyServerMonitorID;
    }

    @JsonIgnore
    public void setAssociatedKeyServerMonitorID(String value) { 
        this.associatedKeyServerMonitorID = value;
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
    public EnterpriseAvatarType getAvatarType() {
       return avatarType;
    }

    @JsonIgnore
    public void setAvatarType(EnterpriseAvatarType value) { 
        this.avatarType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BlockedPageText", readOnly = false)   
    public String getBlockedPageText() {
       return blockedPageText;
    }

    @JsonIgnore
    public void setBlockedPageText(String value) { 
        this.blockedPageText = value;
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
    @VsoProperty(displayName = "DictionaryVersion", readOnly = false)   
    public Long getDictionaryVersion() {
       return dictionaryVersion;
    }

    @JsonIgnore
    public void setDictionaryVersion(Long value) { 
        this.dictionaryVersion = value;
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
    @VsoProperty(displayName = "EnableApplicationPerformanceManagement", readOnly = false)   
    public Boolean getEnableApplicationPerformanceManagement() {
       return enableApplicationPerformanceManagement;
    }

    @JsonIgnore
    public void setEnableApplicationPerformanceManagement(Boolean value) { 
        this.enableApplicationPerformanceManagement = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EncryptionManagementMode", readOnly = false)   
    public EnterpriseEncryptionManagementMode getEncryptionManagementMode() {
       return encryptionManagementMode;
    }

    @JsonIgnore
    public void setEncryptionManagementMode(EnterpriseEncryptionManagementMode value) { 
        this.encryptionManagementMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseProfileID", readOnly = false)   
    public String getEnterpriseProfileID() {
       return enterpriseProfileID;
    }

    @JsonIgnore
    public void setEnterpriseProfileID(String value) { 
        this.enterpriseProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseType", readOnly = false)   
    public EnterpriseEnterpriseType getEnterpriseType() {
       return enterpriseType;
    }

    @JsonIgnore
    public void setEnterpriseType(EnterpriseEnterpriseType value) { 
        this.enterpriseType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public EnterpriseEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(EnterpriseEntityScope value) { 
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
    @VsoProperty(displayName = "FloatingIPsQuota", readOnly = false)   
    public Long getFloatingIPsQuota() {
       return floatingIPsQuota;
    }

    @JsonIgnore
    public void setFloatingIPsQuota(Long value) { 
        this.floatingIPsQuota = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FloatingIPsUsed", readOnly = false)   
    public Long getFloatingIPsUsed() {
       return floatingIPsUsed;
    }

    @JsonIgnore
    public void setFloatingIPsUsed(Long value) { 
        this.floatingIPsUsed = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FlowCollectionEnabled", readOnly = false)   
    public EnterpriseFlowCollectionEnabled getFlowCollectionEnabled() {
       return flowCollectionEnabled;
    }

    @JsonIgnore
    public void setFlowCollectionEnabled(EnterpriseFlowCollectionEnabled value) { 
        this.flowCollectionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ForwardingClass", readOnly = false)   
    public java.util.List<String> getForwardingClass() {
       return forwardingClass;
    }

    @JsonIgnore
    public void setForwardingClass(java.util.List<String> value) { 
        this.forwardingClass = value;
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
    @VsoProperty(displayName = "LocalAS", readOnly = false)   
    public Long getLocalAS() {
       return localAS;
    }

    @JsonIgnore
    public void setLocalAS(Long value) { 
        this.localAS = value;
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
    @VsoProperty(displayName = "Owner", readOnly = false)   
    public String getOwner() {
       return owner;
    }

    @JsonIgnore
    public void setOwner(String value) { 
        this.owner = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ReceiveMultiCastListID", readOnly = false)   
    public String getReceiveMultiCastListID() {
       return receiveMultiCastListID;
    }

    @JsonIgnore
    public void setReceiveMultiCastListID(String value) { 
        this.receiveMultiCastListID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SendMultiCastListID", readOnly = false)   
    public String getSendMultiCastListID() {
       return sendMultiCastListID;
    }

    @JsonIgnore
    public void setSendMultiCastListID(String value) { 
        this.sendMultiCastListID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SharedEnterprise", readOnly = false)   
    public Boolean getSharedEnterprise() {
       return sharedEnterprise;
    }

    @JsonIgnore
    public void setSharedEnterprise(Boolean value) { 
        this.sharedEnterprise = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatIntelligenceEnabled", readOnly = false)   
    public EnterpriseThreatIntelligenceEnabled getThreatIntelligenceEnabled() {
       return threatIntelligenceEnabled;
    }

    @JsonIgnore
    public void setThreatIntelligenceEnabled(EnterpriseThreatIntelligenceEnabled value) { 
        this.threatIntelligenceEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionManagementEnabled", readOnly = false)   
    public Boolean getThreatPreventionManagementEnabled() {
       return threatPreventionManagementEnabled;
    }

    @JsonIgnore
    public void setThreatPreventionManagementEnabled(Boolean value) { 
        this.threatPreventionManagementEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseGlobalMAC", readOnly = false)   
    public Boolean getUseGlobalMAC() {
       return useGlobalMAC;
    }

    @JsonIgnore
    public void setUseGlobalMAC(Boolean value) { 
        this.useGlobalMAC = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualFirewallRulesEnabled", readOnly = false)   
    public Boolean getVirtualFirewallRulesEnabled() {
       return virtualFirewallRulesEnabled;
    }

    @JsonIgnore
    public void setVirtualFirewallRulesEnabled(Boolean value) { 
        this.virtualFirewallRulesEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebFilterEnabled", readOnly = false)   
    public Boolean getWebFilterEnabled() {
       return webFilterEnabled;
    }

    @JsonIgnore
    public void setWebFilterEnabled(Boolean value) { 
        this.webFilterEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllAlarms", readOnly = true)   
    public AllAlarmsFetcher getAllAlarms() {
        return allAlarms;
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
    @VsoProperty(displayName = "Avatars", readOnly = true)   
    public AvatarsFetcher getAvatars() {
        return avatars;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AzureClouds", readOnly = true)   
    public AzureCloudsFetcher getAzureClouds() {
        return azureClouds;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPProfiles", readOnly = true)   
    public BGPProfilesFetcher getBGPProfiles() {
        return bGPProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CaptivePortalProfiles", readOnly = true)   
    public CaptivePortalProfilesFetcher getCaptivePortalProfiles() {
        return captivePortalProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Containers", readOnly = true)   
    public ContainersFetcher getContainers() {
        return containers;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "COSRemarkingPolicyTables", readOnly = true)   
    public COSRemarkingPolicyTablesFetcher getCOSRemarkingPolicyTables() {
        return cOSRemarkingPolicyTables;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeploymentFailures", readOnly = true)   
    public DeploymentFailuresFetcher getDeploymentFailures() {
        return deploymentFailures;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Domains", readOnly = true)   
    public DomainsFetcher getDomains() {
        return domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainKindSummaries", readOnly = true)   
    public DomainKindSummariesFetcher getDomainKindSummaries() {
        return domainKindSummaries;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainTemplates", readOnly = true)   
    public DomainTemplatesFetcher getDomainTemplates() {
        return domainTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DSCPForwardingClassTables", readOnly = true)   
    public DSCPForwardingClassTablesFetcher getDSCPForwardingClassTables() {
        return dSCPForwardingClassTables;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DSCPRemarkingPolicyTables", readOnly = true)   
    public DSCPRemarkingPolicyTablesFetcher getDSCPRemarkingPolicyTables() {
        return dSCPRemarkingPolicyTables;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressProfiles", readOnly = true)   
    public EgressProfilesFetcher getEgressProfiles() {
        return egressProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressQOSPolicies", readOnly = true)   
    public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
        return egressQOSPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseNetworks", readOnly = true)   
    public EnterpriseNetworksFetcher getEnterpriseNetworks() {
        return enterpriseNetworks;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseSecurities", readOnly = true)   
    public EnterpriseSecuritiesFetcher getEnterpriseSecurities() {
        return enterpriseSecurities;
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
    @VsoProperty(displayName = "FirewallRules", readOnly = true)   
    public FirewallRulesFetcher getFirewallRules() {
        return firewallRules;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Gateways", readOnly = true)   
    public GatewaysFetcher getGateways() {
        return gateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewaysLocations", readOnly = true)   
    public GatewaysLocationsFetcher getGatewaysLocations() {
        return gatewaysLocations;
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
    @VsoProperty(displayName = "GNMIProfiles", readOnly = true)   
    public GNMIProfilesFetcher getGNMIProfiles() {
        return gNMIProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Groups", readOnly = true)   
    public GroupsFetcher getGroups() {
        return groups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyEncryptionProfiles", readOnly = true)   
    public GroupKeyEncryptionProfilesFetcher getGroupKeyEncryptionProfiles() {
        return groupKeyEncryptionProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ICMPEchoTestDefinitions", readOnly = true)   
    public ICMPEchoTestDefinitionsFetcher getICMPEchoTestDefinitions() {
        return iCMPEchoTestDefinitions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IDPProfiles", readOnly = true)   
    public IDPProfilesFetcher getIDPProfiles() {
        return iDPProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKECertificates", readOnly = true)   
    public IKECertificatesFetcher getIKECertificates() {
        return iKECertificates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKEEncryptionprofiles", readOnly = true)   
    public IKEEncryptionprofilesFetcher getIKEEncryptionprofiles() {
        return iKEEncryptionprofiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKEGateways", readOnly = true)   
    public IKEGatewaysFetcher getIKEGateways() {
        return iKEGateways;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKEGatewayProfiles", readOnly = true)   
    public IKEGatewayProfilesFetcher getIKEGatewayProfiles() {
        return iKEGatewayProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKEPSKs", readOnly = true)   
    public IKEPSKsFetcher getIKEPSKs() {
        return iKEPSKs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressProfiles", readOnly = true)   
    public IngressProfilesFetcher getIngressProfiles() {
        return ingressProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressQOSPolicies", readOnly = true)   
    public IngressQOSPoliciesFetcher getIngressQOSPolicies() {
        return ingressQOSPolicies;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPFilterProfiles", readOnly = true)   
    public IPFilterProfilesFetcher getIPFilterProfiles() {
        return iPFilterProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6FilterProfiles", readOnly = true)   
    public IPv6FilterProfilesFetcher getIPv6FilterProfiles() {
        return iPv6FilterProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerMonitors", readOnly = true)   
    public KeyServerMonitorsFetcher getKeyServerMonitors() {
        return keyServerMonitors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2Domains", readOnly = true)   
    public L2DomainsFetcher getL2Domains() {
        return l2Domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2DomainTemplates", readOnly = true)   
    public L2DomainTemplatesFetcher getL2DomainTemplates() {
        return l2DomainTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L4Services", readOnly = true)   
    public L4ServicesFetcher getL4Services() {
        return l4Services;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L4ServiceGroups", readOnly = true)   
    public L4ServiceGroupsFetcher getL4ServiceGroups() {
        return l4ServiceGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L7applicationsignatures", readOnly = true)   
    public L7applicationsignaturesFetcher getL7applicationsignatures() {
        return l7applicationsignatures;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LDAPConfigurations", readOnly = true)   
    public LDAPConfigurationsFetcher getLDAPConfigurations() {
        return lDAPConfigurations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MultiCastLists", readOnly = true)   
    public MultiCastListsFetcher getMultiCastLists() {
        return multiCastLists;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetconfProfiles", readOnly = true)   
    public NetconfProfilesFetcher getNetconfProfiles() {
        return netconfProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkMacroGroups", readOnly = true)   
    public NetworkMacroGroupsFetcher getNetworkMacroGroups() {
        return networkMacroGroups;
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
    @VsoProperty(displayName = "NSGatewaysCounts", readOnly = true)   
    public NSGatewaysCountsFetcher getNSGatewaysCounts() {
        return nSGatewaysCounts;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGatewaySummaries", readOnly = true)   
    public NSGatewaySummariesFetcher getNSGatewaySummaries() {
        return nSGatewaySummaries;
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
    @VsoProperty(displayName = "NSRedundantGatewayGroups", readOnly = true)   
    public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
        return nSRedundantGatewayGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OverlayManagementProfiles", readOnly = true)   
    public OverlayManagementProfilesFetcher getOverlayManagementProfiles() {
        return overlayManagementProfiles;
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
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroupCategories", readOnly = true)   
    public PolicyGroupCategoriesFetcher getPolicyGroupCategories() {
        return policyGroupCategories;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyObjectGroups", readOnly = true)   
    public PolicyObjectGroupsFetcher getPolicyObjectGroups() {
        return policyObjectGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PublicNetworkMacros", readOnly = true)   
    public PublicNetworkMacrosFetcher getPublicNetworkMacros() {
        return publicNetworkMacros;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RateLimiters", readOnly = true)   
    public RateLimitersFetcher getRateLimiters() {
        return rateLimiters;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedundancyGroups", readOnly = true)   
    public RedundancyGroupsFetcher getRedundancyGroups() {
        return redundancyGroups;
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
    @VsoProperty(displayName = "SaaSApplicationGroups", readOnly = true)   
    public SaaSApplicationGroupsFetcher getSaaSApplicationGroups() {
        return saaSApplicationGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SaaSApplicationTypes", readOnly = true)   
    public SaaSApplicationTypesFetcher getSaaSApplicationTypes() {
        return saaSApplicationTypes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SAPEgressQoSProfiles", readOnly = true)   
    public SAPEgressQoSProfilesFetcher getSAPEgressQoSProfiles() {
        return sAPEgressQoSProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SAPIngressQoSProfiles", readOnly = true)   
    public SAPIngressQoSProfilesFetcher getSAPIngressQoSProfiles() {
        return sAPIngressQoSProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ScheduledTestSuites", readOnly = true)   
    public ScheduledTestSuitesFetcher getScheduledTestSuites() {
        return scheduledTestSuites;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SharedNetworkResources", readOnly = true)   
    public SharedNetworkResourcesFetcher getSharedNetworkResources() {
        return sharedNetworkResources;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SyslogDestinations", readOnly = true)   
    public SyslogDestinationsFetcher getSyslogDestinations() {
        return syslogDestinations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestDefinitions", readOnly = true)   
    public TestDefinitionsFetcher getTestDefinitions() {
        return testDefinitions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestSuites", readOnly = true)   
    public TestSuitesFetcher getTestSuites() {
        return testSuites;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Trunks", readOnly = true)   
    public TrunksFetcher getTrunks() {
        return trunks;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Users", readOnly = true)   
    public UsersFetcher getUsers() {
        return users;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMs", readOnly = true)   
    public VMsFetcher getVMs() {
        return vMs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFs", readOnly = true)   
    public VNFsFetcher getVNFs() {
        return vNFs;
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
    @VsoProperty(displayName = "WebCategories", readOnly = true)   
    public WebCategoriesFetcher getWebCategories() {
        return webCategories;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebDomainNames", readOnly = true)   
    public WebDomainNamesFetcher getWebDomainNames() {
        return webDomainNames;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBRequests", readOnly = true)   
    public ZFBRequestsFetcher getZFBRequests() {
        return zFBRequests;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.ENTERPRISE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ENTERPRISE, getId());
        }
    }
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ENTERPRISE, getId());
        }
    }
    
    @VsoMethod
    public void createApplication(Session session, Application childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.APPLICATIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createApplicationperformancemanagement(Session session, Applicationperformancemanagement childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createAvatar(Session session, Avatar childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.AVATARS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createAzureCloud(Session session, AzureCloud childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.AZURECLOUDS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createBGPProfile(Session session, BGPProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BGPPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createCaptivePortalProfile(Session session, CaptivePortalProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CAPTIVEPORTALPROFILES_FETCHER, getId());
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
    public void createDomain(Session session, Domain childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DOMAINS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateDomain(Session session, Domain childRestObj, DomainTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DOMAINS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createDomainTemplate(Session session, DomainTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DOMAINTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDSCPForwardingClassTable(Session session, DSCPForwardingClassTable childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, getId());
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
    public void createEgressProfile(Session session, EgressProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSPROFILES_FETCHER, getId());
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
    public void createEnterpriseNetwork(Session session, EnterpriseNetwork childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISENETWORKS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createFirewallAcl(Session session, FirewallAcl childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.FIREWALLACLS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createFirewallRule(Session session, FirewallRule childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.FIREWALLRULES_FETCHER, getId());
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
    public void createGNMIProfile(Session session, GNMIProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GNMIPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createGroup(Session session, Group childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createICMPEchoTestDefinition(Session session, ICMPEchoTestDefinition childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ICMPECHOTESTDEFINITIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIDPProfile(Session session, IDPProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IDPPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIKECertificate(Session session, IKECertificate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IKECERTIFICATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIKEEncryptionprofile(Session session, IKEEncryptionprofile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IKEENCRYPTIONPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIKEGateway(Session session, IKEGateway childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IKEGATEWAYS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIKEGatewayProfile(Session session, IKEGatewayProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IKEGATEWAYPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIKEPSK(Session session, IKEPSK childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IKEPSKS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressProfile(Session session, IngressProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSPROFILES_FETCHER, getId());
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
    public void createIPFilterProfile(Session session, IPFilterProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IPFILTERPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIPv6FilterProfile(Session session, IPv6FilterProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IPV6FILTERPROFILES_FETCHER, getId());
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
    public void createL2Domain(Session session, L2Domain childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.L2DOMAINS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateL2Domain(Session session, L2Domain childRestObj, L2DomainTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.L2DOMAINS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createL2DomainTemplate(Session session, L2DomainTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.L2DOMAINTEMPLATES_FETCHER, getId());
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
    public void createL4ServiceGroup(Session session, L4ServiceGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.L4SERVICEGROUPS_FETCHER, getId());
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
    public void createNetconfProfile(Session session, NetconfProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETCONFPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNetworkMacroGroup(Session session, NetworkMacroGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETWORKMACROGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createNetworkPerformanceMeasurement(Session session, NetworkPerformanceMeasurement childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, getId());
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
    public void createNSGGroup(Session session, NSGGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSGGROUPS_FETCHER, getId());
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
    public void createOverlayManagementProfile(Session session, OverlayManagementProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.OVERLAYMANAGEMENTPROFILES_FETCHER, getId());
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
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPolicyGroupCategory(Session session, PolicyGroupCategory childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.POLICYGROUPCATEGORIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPolicyObjectGroup(Session session, PolicyObjectGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.POLICYOBJECTGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPublicNetworkMacro(Session session, PublicNetworkMacro childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PUBLICNETWORKMACROS_FETCHER, getId());
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
    public void createRoutingPolicy(Session session, RoutingPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ROUTINGPOLICIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSaaSApplicationGroup(Session session, SaaSApplicationGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SAASAPPLICATIONGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSaaSApplicationType(Session session, SaaSApplicationType childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SAASAPPLICATIONTYPES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSAPEgressQoSProfile(Session session, SAPEgressQoSProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SAPEGRESSQOSPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSAPIngressQoSProfile(Session session, SAPIngressQoSProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SAPINGRESSQOSPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createScheduledTestSuite(Session session, ScheduledTestSuite childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SCHEDULEDTESTSUITES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createSyslogDestination(Session session, SyslogDestination childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SYSLOGDESTINATIONS_FETCHER, getId());
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
    public void createTestSuite(Session session, TestSuite childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.TESTSUITES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createTrunk(Session session, Trunk childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.TRUNKS_FETCHER, getId());
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
    public void createVNF(Session session, VNF childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VNFS_FETCHER, getId());
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
    public void createWebCategory(Session session, WebCategory childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.WEBCATEGORIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createWebDomainName(Session session, WebDomainName childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.WEBDOMAINNAMES_FETCHER, getId());
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
        return "Enterprise [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", LDAPAuthorizationEnabled=" + LDAPAuthorizationEnabled + ", LDAPEnabled=" + LDAPEnabled + ", VNFManagementEnabled=" + VNFManagementEnabled + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", allowedForwardingMode=" + allowedForwardingMode + ", associatedEnterpriseSecurityID=" + associatedEnterpriseSecurityID + ", associatedGroupKeyEncryptionProfileID=" + associatedGroupKeyEncryptionProfileID + ", associatedKeyServerMonitorID=" + associatedKeyServerMonitorID + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", blockedPageText=" + blockedPageText + ", creationDate=" + creationDate + ", customerID=" + customerID + ", description=" + description + ", dictionaryVersion=" + dictionaryVersion + ", embeddedMetadata=" + embeddedMetadata + ", enableApplicationPerformanceManagement=" + enableApplicationPerformanceManagement + ", encryptionManagementMode=" + encryptionManagementMode + ", enterpriseProfileID=" + enterpriseProfileID + ", enterpriseType=" + enterpriseType + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", floatingIPsUsed=" + floatingIPsUsed + ", flowCollectionEnabled=" + flowCollectionEnabled + ", forwardingClass=" + forwardingClass + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", localAS=" + localAS + ", name=" + name + ", owner=" + owner + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", sharedEnterprise=" + sharedEnterprise + ", threatIntelligenceEnabled=" + threatIntelligenceEnabled + ", threatPreventionManagementEnabled=" + threatPreventionManagementEnabled + ", useGlobalMAC=" + useGlobalMAC + ", virtualFirewallRulesEnabled=" + virtualFirewallRulesEnabled + ", webFilterEnabled=" + webFilterEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}