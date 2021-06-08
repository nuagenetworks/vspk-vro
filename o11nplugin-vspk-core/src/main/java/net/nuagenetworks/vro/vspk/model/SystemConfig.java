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
import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigCsprootAuthenticationMethod;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigDomainTunnelType;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigLastExecutedMigrationPhase;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigSystemAvatarType;

import net.nuagenetworks.vro.vspk.model.enums.SystemConfigWebFilteringType;
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

@VsoFinder(name = Constants.SYSTEMCONFIG, datasource = Constants.DATASOURCE, image = Constants.SYSTEMCONFIG_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "systemconfig", resourceName = "systemconfigs")
public class SystemConfig extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "AARFlowStatsInterval")
    protected Long AARFlowStatsInterval;
    
    @JsonProperty(value = "AARProbeStatsInterval")
    protected Long AARProbeStatsInterval;
    
    @JsonProperty(value = "ACLAllowOrigin")
    protected String ACLAllowOrigin;
    
    @JsonProperty(value = "ADGatewayPurgeTime")
    protected Long ADGatewayPurgeTime;
    
    @JsonProperty(value = "APIKeyRenewalInterval")
    protected Long APIKeyRenewalInterval;
    
    @JsonProperty(value = "APIKeyValidity")
    protected Long APIKeyValidity;
    
    @JsonProperty(value = "ASNumber")
    protected Long ASNumber;
    
    @JsonProperty(value = "DHCPOptionSize")
    protected Long DHCPOptionSize;
    
    @JsonProperty(value = "ECMPCount")
    protected Long ECMPCount;
    
    @JsonProperty(value = "EVPNBGPCommunityTagASNumber")
    protected Long EVPNBGPCommunityTagASNumber;
    
    @JsonProperty(value = "EVPNBGPCommunityTagLowerLimit")
    protected Long EVPNBGPCommunityTagLowerLimit;
    
    @JsonProperty(value = "EVPNBGPCommunityTagUpperLimit")
    protected Long EVPNBGPCommunityTagUpperLimit;
    
    @JsonProperty(value = "IPv6ExtendedPrefixesEnabled")
    protected Boolean IPv6ExtendedPrefixesEnabled;
    
    @JsonProperty(value = "LDAPSyncInterval")
    protected Long LDAPSyncInterval;
    
    @JsonProperty(value = "LDAPTrustStoreCertifcate")
    protected String LDAPTrustStoreCertifcate;
    
    @JsonProperty(value = "LDAPTrustStorePassword")
    protected String LDAPTrustStorePassword;
    
    @JsonProperty(value = "LRUCacheSizePerSubnet")
    protected Long LRUCacheSizePerSubnet;
    
    @JsonProperty(value = "NSGUplinkHoldDownTimer")
    protected Long NSGUplinkHoldDownTimer;
    
    @JsonProperty(value = "PGIDLowerLimit")
    protected Long PGIDLowerLimit;
    
    @JsonProperty(value = "PGIDUpperLimit")
    protected Long PGIDUpperLimit;
    
    @JsonProperty(value = "RDLowerLimit")
    protected Long RDLowerLimit;
    
    @JsonProperty(value = "RDPublicNetworkLowerLimit")
    protected Long RDPublicNetworkLowerLimit;
    
    @JsonProperty(value = "RDPublicNetworkUpperLimit")
    protected Long RDPublicNetworkUpperLimit;
    
    @JsonProperty(value = "RDUpperLimit")
    protected Long RDUpperLimit;
    
    @JsonProperty(value = "RTLowerLimit")
    protected Long RTLowerLimit;
    
    @JsonProperty(value = "RTPublicNetworkLowerLimit")
    protected Long RTPublicNetworkLowerLimit;
    
    @JsonProperty(value = "RTPublicNetworkUpperLimit")
    protected Long RTPublicNetworkUpperLimit;
    
    @JsonProperty(value = "RTUpperLimit")
    protected Long RTUpperLimit;
    
    @JsonProperty(value = "SaaSApplicationsPublishDate")
    protected String SaaSApplicationsPublishDate;
    
    @JsonProperty(value = "VLANIDLowerLimit")
    protected Long VLANIDLowerLimit;
    
    @JsonProperty(value = "VLANIDUpperLimit")
    protected Long VLANIDUpperLimit;
    
    @JsonProperty(value = "VMCacheSize")
    protected Long VMCacheSize;
    
    @JsonProperty(value = "VMPurgeTime")
    protected Long VMPurgeTime;
    
    @JsonProperty(value = "VMResyncDeletionWaitTime")
    protected Long VMResyncDeletionWaitTime;
    
    @JsonProperty(value = "VMResyncOutstandingInterval")
    protected Long VMResyncOutstandingInterval;
    
    @JsonProperty(value = "VMUnreachableCleanupTime")
    protected Long VMUnreachableCleanupTime;
    
    @JsonProperty(value = "VMUnreachableTime")
    protected Long VMUnreachableTime;
    
    @JsonProperty(value = "VNFTaskTimeout")
    protected Long VNFTaskTimeout;
    
    @JsonProperty(value = "VNIDLowerLimit")
    protected Long VNIDLowerLimit;
    
    @JsonProperty(value = "VNIDPublicNetworkLowerLimit")
    protected Long VNIDPublicNetworkLowerLimit;
    
    @JsonProperty(value = "VNIDPublicNetworkUpperLimit")
    protected Long VNIDPublicNetworkUpperLimit;
    
    @JsonProperty(value = "VNIDUpperLimit")
    protected Long VNIDUpperLimit;
    
    @JsonProperty(value = "VPortInitStatefulTimer")
    protected Long VPortInitStatefulTimer;
    
    @JsonProperty(value = "VSCOnSameVersionAsVSD")
    protected Boolean VSCOnSameVersionAsVSD;
    
    @JsonProperty(value = "VSDAARApplicationVersion")
    protected String VSDAARApplicationVersion;
    
    @JsonProperty(value = "VSDAARApplicationVersionPublishDate")
    protected String VSDAARApplicationVersionPublishDate;
    
    @JsonProperty(value = "VSDReadOnlyMode")
    protected Boolean VSDReadOnlyMode;
    
    @JsonProperty(value = "VSDUpgradeIsComplete")
    protected Boolean VSDUpgradeIsComplete;
    
    @JsonProperty(value = "VSSStatsInterval")
    protected Long VSSStatsInterval;
    
    @JsonProperty(value = "ZFBBootstrapEnabled")
    protected Boolean ZFBBootstrapEnabled;
    
    @JsonProperty(value = "ZFBRequestRetryTimer")
    protected Long ZFBRequestRetryTimer;
    
    @JsonProperty(value = "ZFBSchedulerStaleRequestTimeout")
    protected Long ZFBSchedulerStaleRequestTimeout;
    
    @JsonProperty(value = "accumulateLicensesEnabled")
    protected Boolean accumulateLicensesEnabled;
    
    @JsonProperty(value = "alarmsMaxPerObject")
    protected Long alarmsMaxPerObject;
    
    @JsonProperty(value = "allowEnterpriseAvatarOnNSG")
    protected Boolean allowEnterpriseAvatarOnNSG;
    
    @JsonProperty(value = "attachProbeToIPsecNPM")
    protected Boolean attachProbeToIPsecNPM;
    
    @JsonProperty(value = "attachProbeToVXLANNPM")
    protected Boolean attachProbeToVXLANNPM;
    
    @JsonProperty(value = "avatarBasePath")
    protected String avatarBasePath;
    
    @JsonProperty(value = "avatarBaseURL")
    protected String avatarBaseURL;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "csprootAuthenticationMethod")
    protected SystemConfigCsprootAuthenticationMethod csprootAuthenticationMethod;
    
    @JsonProperty(value = "customerIDUpperLimit")
    protected Long customerIDUpperLimit;
    
    @JsonProperty(value = "customerKey")
    protected String customerKey;
    
    @JsonProperty(value = "deniedFlowCollectionEnabled")
    protected Boolean deniedFlowCollectionEnabled;
    
    @JsonProperty(value = "domainTunnelType")
    protected SystemConfigDomainTunnelType domainTunnelType;
    
    @JsonProperty(value = "dynamicWANServiceDiffTime")
    protected Long dynamicWANServiceDiffTime;
    
    @JsonProperty(value = "ejbcaNSGCertificateProfile")
    protected String ejbcaNSGCertificateProfile;
    
    @JsonProperty(value = "ejbcaNSGEndEntityProfile")
    protected String ejbcaNSGEndEntityProfile;
    
    @JsonProperty(value = "ejbcaOCSPResponderCN")
    protected String ejbcaOCSPResponderCN;
    
    @JsonProperty(value = "ejbcaOCSPResponderURI")
    protected String ejbcaOCSPResponderURI;
    
    @JsonProperty(value = "ejbcaVspRootCa")
    protected String ejbcaVspRootCa;
    
    @JsonProperty(value = "elasticClusterName")
    protected String elasticClusterName;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "embeddedMetadataSize")
    protected Long embeddedMetadataSize;
    
    @JsonProperty(value = "entityScope")
    protected SystemConfigEntityScope entityScope;
    
    @JsonProperty(value = "esiID")
    protected Long esiID;
    
    @JsonProperty(value = "eventLogCleanupInterval")
    protected Long eventLogCleanupInterval;
    
    @JsonProperty(value = "eventLogEntryMaxAge")
    protected Long eventLogEntryMaxAge;
    
    @JsonProperty(value = "eventProcessorInterval")
    protected Long eventProcessorInterval;
    
    @JsonProperty(value = "eventProcessorMaxEventsCount")
    protected Long eventProcessorMaxEventsCount;
    
    @JsonProperty(value = "eventProcessorTimeout")
    protected Long eventProcessorTimeout;
    
    @JsonProperty(value = "explicitACLMatchingEnabled")
    protected Boolean explicitACLMatchingEnabled;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "fecFeedbackTimer")
    protected Long fecFeedbackTimer;
    
    @JsonProperty(value = "flowCollectionEnabled")
    protected Boolean flowCollectionEnabled;
    
    @JsonProperty(value = "flowDropTimeout")
    protected Long flowDropTimeout;
    
    @JsonProperty(value = "gatewayProbeInterval")
    protected Long gatewayProbeInterval;
    
    @JsonProperty(value = "gatewayProbeWindow")
    protected Long gatewayProbeWindow;
    
    @JsonProperty(value = "gatewayRebalancingInterval")
    protected Long gatewayRebalancingInterval;
    
    @JsonProperty(value = "globalMACAddress")
    protected String globalMACAddress;
    
    @JsonProperty(value = "googleMapsAPIKey")
    protected String googleMapsAPIKey;
    
    @JsonProperty(value = "groupKeyDefaultSEKGenerationInterval")
    protected Long groupKeyDefaultSEKGenerationInterval;
    
    @JsonProperty(value = "groupKeyDefaultSEKLifetime")
    protected Long groupKeyDefaultSEKLifetime;
    
    @JsonProperty(value = "groupKeyDefaultSEKPayloadEncryptionAlgorithm")
    protected SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm groupKeyDefaultSEKPayloadEncryptionAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultSEKPayloadSigningAlgorithm")
    protected SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm groupKeyDefaultSEKPayloadSigningAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultSeedGenerationInterval")
    protected Long groupKeyDefaultSeedGenerationInterval;
    
    @JsonProperty(value = "groupKeyDefaultSeedLifetime")
    protected Long groupKeyDefaultSeedLifetime;
    
    @JsonProperty(value = "groupKeyDefaultSeedPayloadAuthenticationAlgorithm")
    protected SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm groupKeyDefaultSeedPayloadAuthenticationAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultSeedPayloadEncryptionAlgorithm")
    protected SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm groupKeyDefaultSeedPayloadEncryptionAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultSeedPayloadSigningAlgorithm")
    protected SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm groupKeyDefaultSeedPayloadSigningAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultTrafficAuthenticationAlgorithm")
    protected SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm groupKeyDefaultTrafficAuthenticationAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultTrafficEncryptionAlgorithm")
    protected SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm groupKeyDefaultTrafficEncryptionAlgorithm;
    
    @JsonProperty(value = "groupKeyDefaultTrafficEncryptionKeyLifetime")
    protected Long groupKeyDefaultTrafficEncryptionKeyLifetime;
    
    @JsonProperty(value = "groupKeyGenerationIntervalOnForcedReKey")
    protected Long groupKeyGenerationIntervalOnForcedReKey;
    
    @JsonProperty(value = "groupKeyGenerationIntervalOnRevoke")
    protected Long groupKeyGenerationIntervalOnRevoke;
    
    @JsonProperty(value = "groupKeyMinimumSEKGenerationInterval")
    protected Long groupKeyMinimumSEKGenerationInterval;
    
    @JsonProperty(value = "groupKeyMinimumSEKLifetime")
    protected Long groupKeyMinimumSEKLifetime;
    
    @JsonProperty(value = "groupKeyMinimumSeedGenerationInterval")
    protected Long groupKeyMinimumSeedGenerationInterval;
    
    @JsonProperty(value = "groupKeyMinimumSeedLifetime")
    protected Long groupKeyMinimumSeedLifetime;
    
    @JsonProperty(value = "groupKeyMinimumTrafficEncryptionKeyLifetime")
    protected Long groupKeyMinimumTrafficEncryptionKeyLifetime;
    
    @JsonProperty(value = "importedSaaSApplicationsVersion")
    protected String importedSaaSApplicationsVersion;
    
    @JsonProperty(value = "inactiveTimeout")
    protected Long inactiveTimeout;
    
    @JsonProperty(value = "infrastructureBGPASNumber")
    protected Long infrastructureBGPASNumber;
    
    @JsonProperty(value = "interfaceIdLowerLimit")
    protected Long interfaceIdLowerLimit;
    
    @JsonProperty(value = "interfaceIdUpperLimit")
    protected Long interfaceIdUpperLimit;
    
    @JsonProperty(value = "keyServerMonitorEnabled")
    protected Boolean keyServerMonitorEnabled;
    
    @JsonProperty(value = "keyServerVSDDataSynchronizationInterval")
    protected Long keyServerVSDDataSynchronizationInterval;
    
    @JsonProperty(value = "lastExecutedMigrationPhase")
    protected SystemConfigLastExecutedMigrationPhase lastExecutedMigrationPhase;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "maintenanceModeEnabled")
    protected Boolean maintenanceModeEnabled;
    
    @JsonProperty(value = "maxFailedLogins")
    protected Long maxFailedLogins;
    
    @JsonProperty(value = "maxResponse")
    protected Long maxResponse;
    
    @JsonProperty(value = "nsgBootstrapEndpoint")
    protected String nsgBootstrapEndpoint;
    
    @JsonProperty(value = "nsgConfigEndpoint")
    protected String nsgConfigEndpoint;
    
    @JsonProperty(value = "nsgLocalUiUrl")
    protected String nsgLocalUiUrl;
    
    @JsonProperty(value = "offsetCustomerID")
    protected Long offsetCustomerID;
    
    @JsonProperty(value = "offsetServiceID")
    protected Long offsetServiceID;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "pageMaxSize")
    protected Long pageMaxSize;
    
    @JsonProperty(value = "pageSize")
    protected Long pageSize;
    
    @JsonProperty(value = "perDomainVlanIdEnabled")
    protected Boolean perDomainVlanIdEnabled;
    
    @JsonProperty(value = "postProcessorThreadsCount")
    protected Long postProcessorThreadsCount;
    
    @JsonProperty(value = "rbacEnabled")
    protected Boolean rbacEnabled;
    
    @JsonProperty(value = "secondaryASNumber")
    protected Long secondaryASNumber;
    
    @JsonProperty(value = "secondaryRTLowerLimit")
    protected Long secondaryRTLowerLimit;
    
    @JsonProperty(value = "secondaryRTUpperLimit")
    protected Long secondaryRTUpperLimit;
    
    @JsonProperty(value = "serviceIDUpperLimit")
    protected Long serviceIDUpperLimit;
    
    @JsonProperty(value = "stackTraceEnabled")
    protected Boolean stackTraceEnabled;
    
    @JsonProperty(value = "statefulACLNonTCPTimeout")
    protected Long statefulACLNonTCPTimeout;
    
    @JsonProperty(value = "statefulACLTCPTimeout")
    protected Long statefulACLTCPTimeout;
    
    @JsonProperty(value = "staticWANServicePurgeTime")
    protected Long staticWANServicePurgeTime;
    
    @JsonProperty(value = "statisticsEnabled")
    protected Boolean statisticsEnabled;
    
    @JsonProperty(value = "statsCollectorAddress")
    protected String statsCollectorAddress;
    
    @JsonProperty(value = "statsCollectorPort")
    protected String statsCollectorPort;
    
    @JsonProperty(value = "statsCollectorProtoBufPort")
    protected String statsCollectorProtoBufPort;
    
    @JsonProperty(value = "statsDatabaseProxy")
    protected String statsDatabaseProxy;
    
    @JsonProperty(value = "statsMaxDataPoints")
    protected Long statsMaxDataPoints;
    
    @JsonProperty(value = "statsMinDuration")
    protected Long statsMinDuration;
    
    @JsonProperty(value = "statsNumberOfDataPoints")
    protected Long statsNumberOfDataPoints;
    
    @JsonProperty(value = "statsTSDBServerAddress")
    protected String statsTSDBServerAddress;
    
    @JsonProperty(value = "stickyECMPIdleTimeout")
    protected Long stickyECMPIdleTimeout;
    
    @JsonProperty(value = "subnetResyncInterval")
    protected Long subnetResyncInterval;
    
    @JsonProperty(value = "subnetResyncOutstandingInterval")
    protected Long subnetResyncOutstandingInterval;
    
    @JsonProperty(value = "syslogDestinationHost")
    protected String syslogDestinationHost;
    
    @JsonProperty(value = "syslogDestinationPort")
    protected Long syslogDestinationPort;
    
    @JsonProperty(value = "sysmonCleanupTaskInterval")
    protected Long sysmonCleanupTaskInterval;
    
    @JsonProperty(value = "sysmonNodePresenceTimeout")
    protected Long sysmonNodePresenceTimeout;
    
    @JsonProperty(value = "sysmonProbeResponseTimeout")
    protected Long sysmonProbeResponseTimeout;
    
    @JsonProperty(value = "sysmonPurgeInterval")
    protected Long sysmonPurgeInterval;
    
    @JsonProperty(value = "systemAvatarData")
    protected String systemAvatarData;
    
    @JsonProperty(value = "systemAvatarType")
    protected SystemConfigSystemAvatarType systemAvatarType;
    
    @JsonProperty(value = "systemBlockedPageText")
    protected String systemBlockedPageText;
    
    @JsonProperty(value = "threatIntelligenceEnabled")
    protected Boolean threatIntelligenceEnabled;
    
    @JsonProperty(value = "threatPreventionFeedServerProxyPort")
    protected Long threatPreventionFeedServerProxyPort;
    
    @JsonProperty(value = "threatPreventionServer")
    protected String threatPreventionServer;
    
    @JsonProperty(value = "threatPreventionServerPassword")
    protected String threatPreventionServerPassword;
    
    @JsonProperty(value = "threatPreventionServerProxyPort")
    protected Long threatPreventionServerProxyPort;
    
    @JsonProperty(value = "threatPreventionServerUsername")
    protected String threatPreventionServerUsername;
    
    @JsonProperty(value = "threatPreventionSyslogProxyPort")
    protected Long threatPreventionSyslogProxyPort;
    
    @JsonProperty(value = "twoFactorCodeExpiry")
    protected Long twoFactorCodeExpiry;
    
    @JsonProperty(value = "twoFactorCodeLength")
    protected Long twoFactorCodeLength;
    
    @JsonProperty(value = "twoFactorCodeSeedLength")
    protected Long twoFactorCodeSeedLength;
    
    @JsonProperty(value = "vcinLoadBalancerIP")
    protected String vcinLoadBalancerIP;
    
    @JsonProperty(value = "virtualFirewallRulesEnabled")
    protected Boolean virtualFirewallRulesEnabled;
    
    @JsonProperty(value = "webCatSrvUrl")
    protected String webCatSrvUrl;
    
    @JsonProperty(value = "webFilteringType")
    protected SystemConfigWebFilteringType webFilteringType;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public SystemConfig() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "Name", readOnly = false)
    public String getName() {
        return getId();
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
    @VsoProperty(displayName = "ACLAllowOrigin", readOnly = false)   
    public String getACLAllowOrigin() {
       return ACLAllowOrigin;
    }

    @JsonIgnore
    public void setACLAllowOrigin(String value) { 
        this.ACLAllowOrigin = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ADGatewayPurgeTime", readOnly = false)   
    public Long getADGatewayPurgeTime() {
       return ADGatewayPurgeTime;
    }

    @JsonIgnore
    public void setADGatewayPurgeTime(Long value) { 
        this.ADGatewayPurgeTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "APIKeyRenewalInterval", readOnly = false)   
    public Long getAPIKeyRenewalInterval() {
       return APIKeyRenewalInterval;
    }

    @JsonIgnore
    public void setAPIKeyRenewalInterval(Long value) { 
        this.APIKeyRenewalInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "APIKeyValidity", readOnly = false)   
    public Long getAPIKeyValidity() {
       return APIKeyValidity;
    }

    @JsonIgnore
    public void setAPIKeyValidity(Long value) { 
        this.APIKeyValidity = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ASNumber", readOnly = false)   
    public Long getASNumber() {
       return ASNumber;
    }

    @JsonIgnore
    public void setASNumber(Long value) { 
        this.ASNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPOptionSize", readOnly = false)   
    public Long getDHCPOptionSize() {
       return DHCPOptionSize;
    }

    @JsonIgnore
    public void setDHCPOptionSize(Long value) { 
        this.DHCPOptionSize = value;
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
    @VsoProperty(displayName = "EVPNBGPCommunityTagASNumber", readOnly = false)   
    public Long getEVPNBGPCommunityTagASNumber() {
       return EVPNBGPCommunityTagASNumber;
    }

    @JsonIgnore
    public void setEVPNBGPCommunityTagASNumber(Long value) { 
        this.EVPNBGPCommunityTagASNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EVPNBGPCommunityTagLowerLimit", readOnly = false)   
    public Long getEVPNBGPCommunityTagLowerLimit() {
       return EVPNBGPCommunityTagLowerLimit;
    }

    @JsonIgnore
    public void setEVPNBGPCommunityTagLowerLimit(Long value) { 
        this.EVPNBGPCommunityTagLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EVPNBGPCommunityTagUpperLimit", readOnly = false)   
    public Long getEVPNBGPCommunityTagUpperLimit() {
       return EVPNBGPCommunityTagUpperLimit;
    }

    @JsonIgnore
    public void setEVPNBGPCommunityTagUpperLimit(Long value) { 
        this.EVPNBGPCommunityTagUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6ExtendedPrefixesEnabled", readOnly = false)   
    public Boolean getIPv6ExtendedPrefixesEnabled() {
       return IPv6ExtendedPrefixesEnabled;
    }

    @JsonIgnore
    public void setIPv6ExtendedPrefixesEnabled(Boolean value) { 
        this.IPv6ExtendedPrefixesEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LDAPSyncInterval", readOnly = false)   
    public Long getLDAPSyncInterval() {
       return LDAPSyncInterval;
    }

    @JsonIgnore
    public void setLDAPSyncInterval(Long value) { 
        this.LDAPSyncInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LDAPTrustStoreCertifcate", readOnly = false)   
    public String getLDAPTrustStoreCertifcate() {
       return LDAPTrustStoreCertifcate;
    }

    @JsonIgnore
    public void setLDAPTrustStoreCertifcate(String value) { 
        this.LDAPTrustStoreCertifcate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LDAPTrustStorePassword", readOnly = false)   
    public String getLDAPTrustStorePassword() {
       return LDAPTrustStorePassword;
    }

    @JsonIgnore
    public void setLDAPTrustStorePassword(String value) { 
        this.LDAPTrustStorePassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LRUCacheSizePerSubnet", readOnly = false)   
    public Long getLRUCacheSizePerSubnet() {
       return LRUCacheSizePerSubnet;
    }

    @JsonIgnore
    public void setLRUCacheSizePerSubnet(Long value) { 
        this.LRUCacheSizePerSubnet = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGUplinkHoldDownTimer", readOnly = false)   
    public Long getNSGUplinkHoldDownTimer() {
       return NSGUplinkHoldDownTimer;
    }

    @JsonIgnore
    public void setNSGUplinkHoldDownTimer(Long value) { 
        this.NSGUplinkHoldDownTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PGIDLowerLimit", readOnly = false)   
    public Long getPGIDLowerLimit() {
       return PGIDLowerLimit;
    }

    @JsonIgnore
    public void setPGIDLowerLimit(Long value) { 
        this.PGIDLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PGIDUpperLimit", readOnly = false)   
    public Long getPGIDUpperLimit() {
       return PGIDUpperLimit;
    }

    @JsonIgnore
    public void setPGIDUpperLimit(Long value) { 
        this.PGIDUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RDLowerLimit", readOnly = false)   
    public Long getRDLowerLimit() {
       return RDLowerLimit;
    }

    @JsonIgnore
    public void setRDLowerLimit(Long value) { 
        this.RDLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RDPublicNetworkLowerLimit", readOnly = false)   
    public Long getRDPublicNetworkLowerLimit() {
       return RDPublicNetworkLowerLimit;
    }

    @JsonIgnore
    public void setRDPublicNetworkLowerLimit(Long value) { 
        this.RDPublicNetworkLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RDPublicNetworkUpperLimit", readOnly = false)   
    public Long getRDPublicNetworkUpperLimit() {
       return RDPublicNetworkUpperLimit;
    }

    @JsonIgnore
    public void setRDPublicNetworkUpperLimit(Long value) { 
        this.RDPublicNetworkUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RDUpperLimit", readOnly = false)   
    public Long getRDUpperLimit() {
       return RDUpperLimit;
    }

    @JsonIgnore
    public void setRDUpperLimit(Long value) { 
        this.RDUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RTLowerLimit", readOnly = false)   
    public Long getRTLowerLimit() {
       return RTLowerLimit;
    }

    @JsonIgnore
    public void setRTLowerLimit(Long value) { 
        this.RTLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RTPublicNetworkLowerLimit", readOnly = false)   
    public Long getRTPublicNetworkLowerLimit() {
       return RTPublicNetworkLowerLimit;
    }

    @JsonIgnore
    public void setRTPublicNetworkLowerLimit(Long value) { 
        this.RTPublicNetworkLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RTPublicNetworkUpperLimit", readOnly = false)   
    public Long getRTPublicNetworkUpperLimit() {
       return RTPublicNetworkUpperLimit;
    }

    @JsonIgnore
    public void setRTPublicNetworkUpperLimit(Long value) { 
        this.RTPublicNetworkUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RTUpperLimit", readOnly = false)   
    public Long getRTUpperLimit() {
       return RTUpperLimit;
    }

    @JsonIgnore
    public void setRTUpperLimit(Long value) { 
        this.RTUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SaaSApplicationsPublishDate", readOnly = false)   
    public String getSaaSApplicationsPublishDate() {
       return SaaSApplicationsPublishDate;
    }

    @JsonIgnore
    public void setSaaSApplicationsPublishDate(String value) { 
        this.SaaSApplicationsPublishDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VLANIDLowerLimit", readOnly = false)   
    public Long getVLANIDLowerLimit() {
       return VLANIDLowerLimit;
    }

    @JsonIgnore
    public void setVLANIDLowerLimit(Long value) { 
        this.VLANIDLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VLANIDUpperLimit", readOnly = false)   
    public Long getVLANIDUpperLimit() {
       return VLANIDUpperLimit;
    }

    @JsonIgnore
    public void setVLANIDUpperLimit(Long value) { 
        this.VLANIDUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMCacheSize", readOnly = false)   
    public Long getVMCacheSize() {
       return VMCacheSize;
    }

    @JsonIgnore
    public void setVMCacheSize(Long value) { 
        this.VMCacheSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMPurgeTime", readOnly = false)   
    public Long getVMPurgeTime() {
       return VMPurgeTime;
    }

    @JsonIgnore
    public void setVMPurgeTime(Long value) { 
        this.VMPurgeTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMResyncDeletionWaitTime", readOnly = false)   
    public Long getVMResyncDeletionWaitTime() {
       return VMResyncDeletionWaitTime;
    }

    @JsonIgnore
    public void setVMResyncDeletionWaitTime(Long value) { 
        this.VMResyncDeletionWaitTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMResyncOutstandingInterval", readOnly = false)   
    public Long getVMResyncOutstandingInterval() {
       return VMResyncOutstandingInterval;
    }

    @JsonIgnore
    public void setVMResyncOutstandingInterval(Long value) { 
        this.VMResyncOutstandingInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMUnreachableCleanupTime", readOnly = false)   
    public Long getVMUnreachableCleanupTime() {
       return VMUnreachableCleanupTime;
    }

    @JsonIgnore
    public void setVMUnreachableCleanupTime(Long value) { 
        this.VMUnreachableCleanupTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMUnreachableTime", readOnly = false)   
    public Long getVMUnreachableTime() {
       return VMUnreachableTime;
    }

    @JsonIgnore
    public void setVMUnreachableTime(Long value) { 
        this.VMUnreachableTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFTaskTimeout", readOnly = false)   
    public Long getVNFTaskTimeout() {
       return VNFTaskTimeout;
    }

    @JsonIgnore
    public void setVNFTaskTimeout(Long value) { 
        this.VNFTaskTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNIDLowerLimit", readOnly = false)   
    public Long getVNIDLowerLimit() {
       return VNIDLowerLimit;
    }

    @JsonIgnore
    public void setVNIDLowerLimit(Long value) { 
        this.VNIDLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNIDPublicNetworkLowerLimit", readOnly = false)   
    public Long getVNIDPublicNetworkLowerLimit() {
       return VNIDPublicNetworkLowerLimit;
    }

    @JsonIgnore
    public void setVNIDPublicNetworkLowerLimit(Long value) { 
        this.VNIDPublicNetworkLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNIDPublicNetworkUpperLimit", readOnly = false)   
    public Long getVNIDPublicNetworkUpperLimit() {
       return VNIDPublicNetworkUpperLimit;
    }

    @JsonIgnore
    public void setVNIDPublicNetworkUpperLimit(Long value) { 
        this.VNIDPublicNetworkUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNIDUpperLimit", readOnly = false)   
    public Long getVNIDUpperLimit() {
       return VNIDUpperLimit;
    }

    @JsonIgnore
    public void setVNIDUpperLimit(Long value) { 
        this.VNIDUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPortInitStatefulTimer", readOnly = false)   
    public Long getVPortInitStatefulTimer() {
       return VPortInitStatefulTimer;
    }

    @JsonIgnore
    public void setVPortInitStatefulTimer(Long value) { 
        this.VPortInitStatefulTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSCOnSameVersionAsVSD", readOnly = false)   
    public Boolean getVSCOnSameVersionAsVSD() {
       return VSCOnSameVersionAsVSD;
    }

    @JsonIgnore
    public void setVSCOnSameVersionAsVSD(Boolean value) { 
        this.VSCOnSameVersionAsVSD = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSDAARApplicationVersion", readOnly = false)   
    public String getVSDAARApplicationVersion() {
       return VSDAARApplicationVersion;
    }

    @JsonIgnore
    public void setVSDAARApplicationVersion(String value) { 
        this.VSDAARApplicationVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSDAARApplicationVersionPublishDate", readOnly = false)   
    public String getVSDAARApplicationVersionPublishDate() {
       return VSDAARApplicationVersionPublishDate;
    }

    @JsonIgnore
    public void setVSDAARApplicationVersionPublishDate(String value) { 
        this.VSDAARApplicationVersionPublishDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSDReadOnlyMode", readOnly = false)   
    public Boolean getVSDReadOnlyMode() {
       return VSDReadOnlyMode;
    }

    @JsonIgnore
    public void setVSDReadOnlyMode(Boolean value) { 
        this.VSDReadOnlyMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSDUpgradeIsComplete", readOnly = false)   
    public Boolean getVSDUpgradeIsComplete() {
       return VSDUpgradeIsComplete;
    }

    @JsonIgnore
    public void setVSDUpgradeIsComplete(Boolean value) { 
        this.VSDUpgradeIsComplete = value;
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
    @VsoProperty(displayName = "ZFBBootstrapEnabled", readOnly = false)   
    public Boolean getZFBBootstrapEnabled() {
       return ZFBBootstrapEnabled;
    }

    @JsonIgnore
    public void setZFBBootstrapEnabled(Boolean value) { 
        this.ZFBBootstrapEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBRequestRetryTimer", readOnly = false)   
    public Long getZFBRequestRetryTimer() {
       return ZFBRequestRetryTimer;
    }

    @JsonIgnore
    public void setZFBRequestRetryTimer(Long value) { 
        this.ZFBRequestRetryTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBSchedulerStaleRequestTimeout", readOnly = false)   
    public Long getZFBSchedulerStaleRequestTimeout() {
       return ZFBSchedulerStaleRequestTimeout;
    }

    @JsonIgnore
    public void setZFBSchedulerStaleRequestTimeout(Long value) { 
        this.ZFBSchedulerStaleRequestTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AccumulateLicensesEnabled", readOnly = false)   
    public Boolean getAccumulateLicensesEnabled() {
       return accumulateLicensesEnabled;
    }

    @JsonIgnore
    public void setAccumulateLicensesEnabled(Boolean value) { 
        this.accumulateLicensesEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AlarmsMaxPerObject", readOnly = false)   
    public Long getAlarmsMaxPerObject() {
       return alarmsMaxPerObject;
    }

    @JsonIgnore
    public void setAlarmsMaxPerObject(Long value) { 
        this.alarmsMaxPerObject = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowEnterpriseAvatarOnNSG", readOnly = false)   
    public Boolean getAllowEnterpriseAvatarOnNSG() {
       return allowEnterpriseAvatarOnNSG;
    }

    @JsonIgnore
    public void setAllowEnterpriseAvatarOnNSG(Boolean value) { 
        this.allowEnterpriseAvatarOnNSG = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AttachProbeToIPsecNPM", readOnly = false)   
    public Boolean getAttachProbeToIPsecNPM() {
       return attachProbeToIPsecNPM;
    }

    @JsonIgnore
    public void setAttachProbeToIPsecNPM(Boolean value) { 
        this.attachProbeToIPsecNPM = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AttachProbeToVXLANNPM", readOnly = false)   
    public Boolean getAttachProbeToVXLANNPM() {
       return attachProbeToVXLANNPM;
    }

    @JsonIgnore
    public void setAttachProbeToVXLANNPM(Boolean value) { 
        this.attachProbeToVXLANNPM = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AvatarBasePath", readOnly = false)   
    public String getAvatarBasePath() {
       return avatarBasePath;
    }

    @JsonIgnore
    public void setAvatarBasePath(String value) { 
        this.avatarBasePath = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AvatarBaseURL", readOnly = false)   
    public String getAvatarBaseURL() {
       return avatarBaseURL;
    }

    @JsonIgnore
    public void setAvatarBaseURL(String value) { 
        this.avatarBaseURL = value;
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
    @VsoProperty(displayName = "CsprootAuthenticationMethod", readOnly = false)   
    public SystemConfigCsprootAuthenticationMethod getCsprootAuthenticationMethod() {
       return csprootAuthenticationMethod;
    }

    @JsonIgnore
    public void setCsprootAuthenticationMethod(SystemConfigCsprootAuthenticationMethod value) { 
        this.csprootAuthenticationMethod = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CustomerIDUpperLimit", readOnly = false)   
    public Long getCustomerIDUpperLimit() {
       return customerIDUpperLimit;
    }

    @JsonIgnore
    public void setCustomerIDUpperLimit(Long value) { 
        this.customerIDUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CustomerKey", readOnly = false)   
    public String getCustomerKey() {
       return customerKey;
    }

    @JsonIgnore
    public void setCustomerKey(String value) { 
        this.customerKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeniedFlowCollectionEnabled", readOnly = false)   
    public Boolean getDeniedFlowCollectionEnabled() {
       return deniedFlowCollectionEnabled;
    }

    @JsonIgnore
    public void setDeniedFlowCollectionEnabled(Boolean value) { 
        this.deniedFlowCollectionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainTunnelType", readOnly = false)   
    public SystemConfigDomainTunnelType getDomainTunnelType() {
       return domainTunnelType;
    }

    @JsonIgnore
    public void setDomainTunnelType(SystemConfigDomainTunnelType value) { 
        this.domainTunnelType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DynamicWANServiceDiffTime", readOnly = false)   
    public Long getDynamicWANServiceDiffTime() {
       return dynamicWANServiceDiffTime;
    }

    @JsonIgnore
    public void setDynamicWANServiceDiffTime(Long value) { 
        this.dynamicWANServiceDiffTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EjbcaNSGCertificateProfile", readOnly = false)   
    public String getEjbcaNSGCertificateProfile() {
       return ejbcaNSGCertificateProfile;
    }

    @JsonIgnore
    public void setEjbcaNSGCertificateProfile(String value) { 
        this.ejbcaNSGCertificateProfile = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EjbcaNSGEndEntityProfile", readOnly = false)   
    public String getEjbcaNSGEndEntityProfile() {
       return ejbcaNSGEndEntityProfile;
    }

    @JsonIgnore
    public void setEjbcaNSGEndEntityProfile(String value) { 
        this.ejbcaNSGEndEntityProfile = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EjbcaOCSPResponderCN", readOnly = false)   
    public String getEjbcaOCSPResponderCN() {
       return ejbcaOCSPResponderCN;
    }

    @JsonIgnore
    public void setEjbcaOCSPResponderCN(String value) { 
        this.ejbcaOCSPResponderCN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EjbcaOCSPResponderURI", readOnly = false)   
    public String getEjbcaOCSPResponderURI() {
       return ejbcaOCSPResponderURI;
    }

    @JsonIgnore
    public void setEjbcaOCSPResponderURI(String value) { 
        this.ejbcaOCSPResponderURI = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EjbcaVspRootCa", readOnly = false)   
    public String getEjbcaVspRootCa() {
       return ejbcaVspRootCa;
    }

    @JsonIgnore
    public void setEjbcaVspRootCa(String value) { 
        this.ejbcaVspRootCa = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ElasticClusterName", readOnly = false)   
    public String getElasticClusterName() {
       return elasticClusterName;
    }

    @JsonIgnore
    public void setElasticClusterName(String value) { 
        this.elasticClusterName = value;
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
    @VsoProperty(displayName = "EmbeddedMetadataSize", readOnly = false)   
    public Long getEmbeddedMetadataSize() {
       return embeddedMetadataSize;
    }

    @JsonIgnore
    public void setEmbeddedMetadataSize(Long value) { 
        this.embeddedMetadataSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public SystemConfigEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(SystemConfigEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EsiID", readOnly = false)   
    public Long getEsiID() {
       return esiID;
    }

    @JsonIgnore
    public void setEsiID(Long value) { 
        this.esiID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogCleanupInterval", readOnly = false)   
    public Long getEventLogCleanupInterval() {
       return eventLogCleanupInterval;
    }

    @JsonIgnore
    public void setEventLogCleanupInterval(Long value) { 
        this.eventLogCleanupInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogEntryMaxAge", readOnly = false)   
    public Long getEventLogEntryMaxAge() {
       return eventLogEntryMaxAge;
    }

    @JsonIgnore
    public void setEventLogEntryMaxAge(Long value) { 
        this.eventLogEntryMaxAge = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventProcessorInterval", readOnly = false)   
    public Long getEventProcessorInterval() {
       return eventProcessorInterval;
    }

    @JsonIgnore
    public void setEventProcessorInterval(Long value) { 
        this.eventProcessorInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventProcessorMaxEventsCount", readOnly = false)   
    public Long getEventProcessorMaxEventsCount() {
       return eventProcessorMaxEventsCount;
    }

    @JsonIgnore
    public void setEventProcessorMaxEventsCount(Long value) { 
        this.eventProcessorMaxEventsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventProcessorTimeout", readOnly = false)   
    public Long getEventProcessorTimeout() {
       return eventProcessorTimeout;
    }

    @JsonIgnore
    public void setEventProcessorTimeout(Long value) { 
        this.eventProcessorTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExplicitACLMatchingEnabled", readOnly = false)   
    public Boolean getExplicitACLMatchingEnabled() {
       return explicitACLMatchingEnabled;
    }

    @JsonIgnore
    public void setExplicitACLMatchingEnabled(Boolean value) { 
        this.explicitACLMatchingEnabled = value;
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
    @VsoProperty(displayName = "FecFeedbackTimer", readOnly = false)   
    public Long getFecFeedbackTimer() {
       return fecFeedbackTimer;
    }

    @JsonIgnore
    public void setFecFeedbackTimer(Long value) { 
        this.fecFeedbackTimer = value;
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
    @VsoProperty(displayName = "FlowDropTimeout", readOnly = false)   
    public Long getFlowDropTimeout() {
       return flowDropTimeout;
    }

    @JsonIgnore
    public void setFlowDropTimeout(Long value) { 
        this.flowDropTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayProbeInterval", readOnly = false)   
    public Long getGatewayProbeInterval() {
       return gatewayProbeInterval;
    }

    @JsonIgnore
    public void setGatewayProbeInterval(Long value) { 
        this.gatewayProbeInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayProbeWindow", readOnly = false)   
    public Long getGatewayProbeWindow() {
       return gatewayProbeWindow;
    }

    @JsonIgnore
    public void setGatewayProbeWindow(Long value) { 
        this.gatewayProbeWindow = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayRebalancingInterval", readOnly = false)   
    public Long getGatewayRebalancingInterval() {
       return gatewayRebalancingInterval;
    }

    @JsonIgnore
    public void setGatewayRebalancingInterval(Long value) { 
        this.gatewayRebalancingInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMACAddress", readOnly = false)   
    public String getGlobalMACAddress() {
       return globalMACAddress;
    }

    @JsonIgnore
    public void setGlobalMACAddress(String value) { 
        this.globalMACAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GoogleMapsAPIKey", readOnly = false)   
    public String getGoogleMapsAPIKey() {
       return googleMapsAPIKey;
    }

    @JsonIgnore
    public void setGoogleMapsAPIKey(String value) { 
        this.googleMapsAPIKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSEKGenerationInterval", readOnly = false)   
    public Long getGroupKeyDefaultSEKGenerationInterval() {
       return groupKeyDefaultSEKGenerationInterval;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSEKGenerationInterval(Long value) { 
        this.groupKeyDefaultSEKGenerationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSEKLifetime", readOnly = false)   
    public Long getGroupKeyDefaultSEKLifetime() {
       return groupKeyDefaultSEKLifetime;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSEKLifetime(Long value) { 
        this.groupKeyDefaultSEKLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSEKPayloadEncryptionAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm getGroupKeyDefaultSEKPayloadEncryptionAlgorithm() {
       return groupKeyDefaultSEKPayloadEncryptionAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSEKPayloadEncryptionAlgorithm(SystemConfigGroupKeyDefaultSEKPayloadEncryptionAlgorithm value) { 
        this.groupKeyDefaultSEKPayloadEncryptionAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSEKPayloadSigningAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm getGroupKeyDefaultSEKPayloadSigningAlgorithm() {
       return groupKeyDefaultSEKPayloadSigningAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSEKPayloadSigningAlgorithm(SystemConfigGroupKeyDefaultSEKPayloadSigningAlgorithm value) { 
        this.groupKeyDefaultSEKPayloadSigningAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSeedGenerationInterval", readOnly = false)   
    public Long getGroupKeyDefaultSeedGenerationInterval() {
       return groupKeyDefaultSeedGenerationInterval;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSeedGenerationInterval(Long value) { 
        this.groupKeyDefaultSeedGenerationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSeedLifetime", readOnly = false)   
    public Long getGroupKeyDefaultSeedLifetime() {
       return groupKeyDefaultSeedLifetime;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSeedLifetime(Long value) { 
        this.groupKeyDefaultSeedLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSeedPayloadAuthenticationAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm getGroupKeyDefaultSeedPayloadAuthenticationAlgorithm() {
       return groupKeyDefaultSeedPayloadAuthenticationAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSeedPayloadAuthenticationAlgorithm(SystemConfigGroupKeyDefaultSeedPayloadAuthenticationAlgorithm value) { 
        this.groupKeyDefaultSeedPayloadAuthenticationAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSeedPayloadEncryptionAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm getGroupKeyDefaultSeedPayloadEncryptionAlgorithm() {
       return groupKeyDefaultSeedPayloadEncryptionAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSeedPayloadEncryptionAlgorithm(SystemConfigGroupKeyDefaultSeedPayloadEncryptionAlgorithm value) { 
        this.groupKeyDefaultSeedPayloadEncryptionAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultSeedPayloadSigningAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm getGroupKeyDefaultSeedPayloadSigningAlgorithm() {
       return groupKeyDefaultSeedPayloadSigningAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultSeedPayloadSigningAlgorithm(SystemConfigGroupKeyDefaultSeedPayloadSigningAlgorithm value) { 
        this.groupKeyDefaultSeedPayloadSigningAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultTrafficAuthenticationAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm getGroupKeyDefaultTrafficAuthenticationAlgorithm() {
       return groupKeyDefaultTrafficAuthenticationAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultTrafficAuthenticationAlgorithm(SystemConfigGroupKeyDefaultTrafficAuthenticationAlgorithm value) { 
        this.groupKeyDefaultTrafficAuthenticationAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultTrafficEncryptionAlgorithm", readOnly = false)   
    public SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm getGroupKeyDefaultTrafficEncryptionAlgorithm() {
       return groupKeyDefaultTrafficEncryptionAlgorithm;
    }

    @JsonIgnore
    public void setGroupKeyDefaultTrafficEncryptionAlgorithm(SystemConfigGroupKeyDefaultTrafficEncryptionAlgorithm value) { 
        this.groupKeyDefaultTrafficEncryptionAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyDefaultTrafficEncryptionKeyLifetime", readOnly = false)   
    public Long getGroupKeyDefaultTrafficEncryptionKeyLifetime() {
       return groupKeyDefaultTrafficEncryptionKeyLifetime;
    }

    @JsonIgnore
    public void setGroupKeyDefaultTrafficEncryptionKeyLifetime(Long value) { 
        this.groupKeyDefaultTrafficEncryptionKeyLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyGenerationIntervalOnForcedReKey", readOnly = false)   
    public Long getGroupKeyGenerationIntervalOnForcedReKey() {
       return groupKeyGenerationIntervalOnForcedReKey;
    }

    @JsonIgnore
    public void setGroupKeyGenerationIntervalOnForcedReKey(Long value) { 
        this.groupKeyGenerationIntervalOnForcedReKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyGenerationIntervalOnRevoke", readOnly = false)   
    public Long getGroupKeyGenerationIntervalOnRevoke() {
       return groupKeyGenerationIntervalOnRevoke;
    }

    @JsonIgnore
    public void setGroupKeyGenerationIntervalOnRevoke(Long value) { 
        this.groupKeyGenerationIntervalOnRevoke = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyMinimumSEKGenerationInterval", readOnly = false)   
    public Long getGroupKeyMinimumSEKGenerationInterval() {
       return groupKeyMinimumSEKGenerationInterval;
    }

    @JsonIgnore
    public void setGroupKeyMinimumSEKGenerationInterval(Long value) { 
        this.groupKeyMinimumSEKGenerationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyMinimumSEKLifetime", readOnly = false)   
    public Long getGroupKeyMinimumSEKLifetime() {
       return groupKeyMinimumSEKLifetime;
    }

    @JsonIgnore
    public void setGroupKeyMinimumSEKLifetime(Long value) { 
        this.groupKeyMinimumSEKLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyMinimumSeedGenerationInterval", readOnly = false)   
    public Long getGroupKeyMinimumSeedGenerationInterval() {
       return groupKeyMinimumSeedGenerationInterval;
    }

    @JsonIgnore
    public void setGroupKeyMinimumSeedGenerationInterval(Long value) { 
        this.groupKeyMinimumSeedGenerationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyMinimumSeedLifetime", readOnly = false)   
    public Long getGroupKeyMinimumSeedLifetime() {
       return groupKeyMinimumSeedLifetime;
    }

    @JsonIgnore
    public void setGroupKeyMinimumSeedLifetime(Long value) { 
        this.groupKeyMinimumSeedLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GroupKeyMinimumTrafficEncryptionKeyLifetime", readOnly = false)   
    public Long getGroupKeyMinimumTrafficEncryptionKeyLifetime() {
       return groupKeyMinimumTrafficEncryptionKeyLifetime;
    }

    @JsonIgnore
    public void setGroupKeyMinimumTrafficEncryptionKeyLifetime(Long value) { 
        this.groupKeyMinimumTrafficEncryptionKeyLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ImportedSaaSApplicationsVersion", readOnly = false)   
    public String getImportedSaaSApplicationsVersion() {
       return importedSaaSApplicationsVersion;
    }

    @JsonIgnore
    public void setImportedSaaSApplicationsVersion(String value) { 
        this.importedSaaSApplicationsVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InactiveTimeout", readOnly = false)   
    public Long getInactiveTimeout() {
       return inactiveTimeout;
    }

    @JsonIgnore
    public void setInactiveTimeout(Long value) { 
        this.inactiveTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfrastructureBGPASNumber", readOnly = false)   
    public Long getInfrastructureBGPASNumber() {
       return infrastructureBGPASNumber;
    }

    @JsonIgnore
    public void setInfrastructureBGPASNumber(Long value) { 
        this.infrastructureBGPASNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InterfaceIdLowerLimit", readOnly = false)   
    public Long getInterfaceIdLowerLimit() {
       return interfaceIdLowerLimit;
    }

    @JsonIgnore
    public void setInterfaceIdLowerLimit(Long value) { 
        this.interfaceIdLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InterfaceIdUpperLimit", readOnly = false)   
    public Long getInterfaceIdUpperLimit() {
       return interfaceIdUpperLimit;
    }

    @JsonIgnore
    public void setInterfaceIdUpperLimit(Long value) { 
        this.interfaceIdUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerMonitorEnabled", readOnly = false)   
    public Boolean getKeyServerMonitorEnabled() {
       return keyServerMonitorEnabled;
    }

    @JsonIgnore
    public void setKeyServerMonitorEnabled(Boolean value) { 
        this.keyServerMonitorEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "KeyServerVSDDataSynchronizationInterval", readOnly = false)   
    public Long getKeyServerVSDDataSynchronizationInterval() {
       return keyServerVSDDataSynchronizationInterval;
    }

    @JsonIgnore
    public void setKeyServerVSDDataSynchronizationInterval(Long value) { 
        this.keyServerVSDDataSynchronizationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastExecutedMigrationPhase", readOnly = false)   
    public SystemConfigLastExecutedMigrationPhase getLastExecutedMigrationPhase() {
       return lastExecutedMigrationPhase;
    }

    @JsonIgnore
    public void setLastExecutedMigrationPhase(SystemConfigLastExecutedMigrationPhase value) { 
        this.lastExecutedMigrationPhase = value;
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
    @VsoProperty(displayName = "MaintenanceModeEnabled", readOnly = false)   
    public Boolean getMaintenanceModeEnabled() {
       return maintenanceModeEnabled;
    }

    @JsonIgnore
    public void setMaintenanceModeEnabled(Boolean value) { 
        this.maintenanceModeEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MaxFailedLogins", readOnly = false)   
    public Long getMaxFailedLogins() {
       return maxFailedLogins;
    }

    @JsonIgnore
    public void setMaxFailedLogins(Long value) { 
        this.maxFailedLogins = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MaxResponse", readOnly = false)   
    public Long getMaxResponse() {
       return maxResponse;
    }

    @JsonIgnore
    public void setMaxResponse(Long value) { 
        this.maxResponse = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NsgBootstrapEndpoint", readOnly = false)   
    public String getNsgBootstrapEndpoint() {
       return nsgBootstrapEndpoint;
    }

    @JsonIgnore
    public void setNsgBootstrapEndpoint(String value) { 
        this.nsgBootstrapEndpoint = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NsgConfigEndpoint", readOnly = false)   
    public String getNsgConfigEndpoint() {
       return nsgConfigEndpoint;
    }

    @JsonIgnore
    public void setNsgConfigEndpoint(String value) { 
        this.nsgConfigEndpoint = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NsgLocalUiUrl", readOnly = false)   
    public String getNsgLocalUiUrl() {
       return nsgLocalUiUrl;
    }

    @JsonIgnore
    public void setNsgLocalUiUrl(String value) { 
        this.nsgLocalUiUrl = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OffsetCustomerID", readOnly = false)   
    public Long getOffsetCustomerID() {
       return offsetCustomerID;
    }

    @JsonIgnore
    public void setOffsetCustomerID(Long value) { 
        this.offsetCustomerID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OffsetServiceID", readOnly = false)   
    public Long getOffsetServiceID() {
       return offsetServiceID;
    }

    @JsonIgnore
    public void setOffsetServiceID(Long value) { 
        this.offsetServiceID = value;
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
    @VsoProperty(displayName = "PageMaxSize", readOnly = false)   
    public Long getPageMaxSize() {
       return pageMaxSize;
    }

    @JsonIgnore
    public void setPageMaxSize(Long value) { 
        this.pageMaxSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PageSize", readOnly = false)   
    public Long getPageSize() {
       return pageSize;
    }

    @JsonIgnore
    public void setPageSize(Long value) { 
        this.pageSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PerDomainVlanIdEnabled", readOnly = false)   
    public Boolean getPerDomainVlanIdEnabled() {
       return perDomainVlanIdEnabled;
    }

    @JsonIgnore
    public void setPerDomainVlanIdEnabled(Boolean value) { 
        this.perDomainVlanIdEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PostProcessorThreadsCount", readOnly = false)   
    public Long getPostProcessorThreadsCount() {
       return postProcessorThreadsCount;
    }

    @JsonIgnore
    public void setPostProcessorThreadsCount(Long value) { 
        this.postProcessorThreadsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RbacEnabled", readOnly = false)   
    public Boolean getRbacEnabled() {
       return rbacEnabled;
    }

    @JsonIgnore
    public void setRbacEnabled(Boolean value) { 
        this.rbacEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryASNumber", readOnly = false)   
    public Long getSecondaryASNumber() {
       return secondaryASNumber;
    }

    @JsonIgnore
    public void setSecondaryASNumber(Long value) { 
        this.secondaryASNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryRTLowerLimit", readOnly = false)   
    public Long getSecondaryRTLowerLimit() {
       return secondaryRTLowerLimit;
    }

    @JsonIgnore
    public void setSecondaryRTLowerLimit(Long value) { 
        this.secondaryRTLowerLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryRTUpperLimit", readOnly = false)   
    public Long getSecondaryRTUpperLimit() {
       return secondaryRTUpperLimit;
    }

    @JsonIgnore
    public void setSecondaryRTUpperLimit(Long value) { 
        this.secondaryRTUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ServiceIDUpperLimit", readOnly = false)   
    public Long getServiceIDUpperLimit() {
       return serviceIDUpperLimit;
    }

    @JsonIgnore
    public void setServiceIDUpperLimit(Long value) { 
        this.serviceIDUpperLimit = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StackTraceEnabled", readOnly = false)   
    public Boolean getStackTraceEnabled() {
       return stackTraceEnabled;
    }

    @JsonIgnore
    public void setStackTraceEnabled(Boolean value) { 
        this.stackTraceEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatefulACLNonTCPTimeout", readOnly = false)   
    public Long getStatefulACLNonTCPTimeout() {
       return statefulACLNonTCPTimeout;
    }

    @JsonIgnore
    public void setStatefulACLNonTCPTimeout(Long value) { 
        this.statefulACLNonTCPTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatefulACLTCPTimeout", readOnly = false)   
    public Long getStatefulACLTCPTimeout() {
       return statefulACLTCPTimeout;
    }

    @JsonIgnore
    public void setStatefulACLTCPTimeout(Long value) { 
        this.statefulACLTCPTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticWANServicePurgeTime", readOnly = false)   
    public Long getStaticWANServicePurgeTime() {
       return staticWANServicePurgeTime;
    }

    @JsonIgnore
    public void setStaticWANServicePurgeTime(Long value) { 
        this.staticWANServicePurgeTime = value;
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
    @VsoProperty(displayName = "StatsCollectorAddress", readOnly = false)   
    public String getStatsCollectorAddress() {
       return statsCollectorAddress;
    }

    @JsonIgnore
    public void setStatsCollectorAddress(String value) { 
        this.statsCollectorAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsCollectorPort", readOnly = false)   
    public String getStatsCollectorPort() {
       return statsCollectorPort;
    }

    @JsonIgnore
    public void setStatsCollectorPort(String value) { 
        this.statsCollectorPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsCollectorProtoBufPort", readOnly = false)   
    public String getStatsCollectorProtoBufPort() {
       return statsCollectorProtoBufPort;
    }

    @JsonIgnore
    public void setStatsCollectorProtoBufPort(String value) { 
        this.statsCollectorProtoBufPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsDatabaseProxy", readOnly = false)   
    public String getStatsDatabaseProxy() {
       return statsDatabaseProxy;
    }

    @JsonIgnore
    public void setStatsDatabaseProxy(String value) { 
        this.statsDatabaseProxy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsMaxDataPoints", readOnly = false)   
    public Long getStatsMaxDataPoints() {
       return statsMaxDataPoints;
    }

    @JsonIgnore
    public void setStatsMaxDataPoints(Long value) { 
        this.statsMaxDataPoints = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsMinDuration", readOnly = false)   
    public Long getStatsMinDuration() {
       return statsMinDuration;
    }

    @JsonIgnore
    public void setStatsMinDuration(Long value) { 
        this.statsMinDuration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsNumberOfDataPoints", readOnly = false)   
    public Long getStatsNumberOfDataPoints() {
       return statsNumberOfDataPoints;
    }

    @JsonIgnore
    public void setStatsNumberOfDataPoints(Long value) { 
        this.statsNumberOfDataPoints = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsTSDBServerAddress", readOnly = false)   
    public String getStatsTSDBServerAddress() {
       return statsTSDBServerAddress;
    }

    @JsonIgnore
    public void setStatsTSDBServerAddress(String value) { 
        this.statsTSDBServerAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StickyECMPIdleTimeout", readOnly = false)   
    public Long getStickyECMPIdleTimeout() {
       return stickyECMPIdleTimeout;
    }

    @JsonIgnore
    public void setStickyECMPIdleTimeout(Long value) { 
        this.stickyECMPIdleTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubnetResyncInterval", readOnly = false)   
    public Long getSubnetResyncInterval() {
       return subnetResyncInterval;
    }

    @JsonIgnore
    public void setSubnetResyncInterval(Long value) { 
        this.subnetResyncInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubnetResyncOutstandingInterval", readOnly = false)   
    public Long getSubnetResyncOutstandingInterval() {
       return subnetResyncOutstandingInterval;
    }

    @JsonIgnore
    public void setSubnetResyncOutstandingInterval(Long value) { 
        this.subnetResyncOutstandingInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SyslogDestinationHost", readOnly = false)   
    public String getSyslogDestinationHost() {
       return syslogDestinationHost;
    }

    @JsonIgnore
    public void setSyslogDestinationHost(String value) { 
        this.syslogDestinationHost = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SyslogDestinationPort", readOnly = false)   
    public Long getSyslogDestinationPort() {
       return syslogDestinationPort;
    }

    @JsonIgnore
    public void setSyslogDestinationPort(Long value) { 
        this.syslogDestinationPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SysmonCleanupTaskInterval", readOnly = false)   
    public Long getSysmonCleanupTaskInterval() {
       return sysmonCleanupTaskInterval;
    }

    @JsonIgnore
    public void setSysmonCleanupTaskInterval(Long value) { 
        this.sysmonCleanupTaskInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SysmonNodePresenceTimeout", readOnly = false)   
    public Long getSysmonNodePresenceTimeout() {
       return sysmonNodePresenceTimeout;
    }

    @JsonIgnore
    public void setSysmonNodePresenceTimeout(Long value) { 
        this.sysmonNodePresenceTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SysmonProbeResponseTimeout", readOnly = false)   
    public Long getSysmonProbeResponseTimeout() {
       return sysmonProbeResponseTimeout;
    }

    @JsonIgnore
    public void setSysmonProbeResponseTimeout(Long value) { 
        this.sysmonProbeResponseTimeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SysmonPurgeInterval", readOnly = false)   
    public Long getSysmonPurgeInterval() {
       return sysmonPurgeInterval;
    }

    @JsonIgnore
    public void setSysmonPurgeInterval(Long value) { 
        this.sysmonPurgeInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemAvatarData", readOnly = false)   
    public String getSystemAvatarData() {
       return systemAvatarData;
    }

    @JsonIgnore
    public void setSystemAvatarData(String value) { 
        this.systemAvatarData = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemAvatarType", readOnly = false)   
    public SystemConfigSystemAvatarType getSystemAvatarType() {
       return systemAvatarType;
    }

    @JsonIgnore
    public void setSystemAvatarType(SystemConfigSystemAvatarType value) { 
        this.systemAvatarType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemBlockedPageText", readOnly = false)   
    public String getSystemBlockedPageText() {
       return systemBlockedPageText;
    }

    @JsonIgnore
    public void setSystemBlockedPageText(String value) { 
        this.systemBlockedPageText = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatIntelligenceEnabled", readOnly = false)   
    public Boolean getThreatIntelligenceEnabled() {
       return threatIntelligenceEnabled;
    }

    @JsonIgnore
    public void setThreatIntelligenceEnabled(Boolean value) { 
        this.threatIntelligenceEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionFeedServerProxyPort", readOnly = false)   
    public Long getThreatPreventionFeedServerProxyPort() {
       return threatPreventionFeedServerProxyPort;
    }

    @JsonIgnore
    public void setThreatPreventionFeedServerProxyPort(Long value) { 
        this.threatPreventionFeedServerProxyPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionServer", readOnly = false)   
    public String getThreatPreventionServer() {
       return threatPreventionServer;
    }

    @JsonIgnore
    public void setThreatPreventionServer(String value) { 
        this.threatPreventionServer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionServerPassword", readOnly = false)   
    public String getThreatPreventionServerPassword() {
       return threatPreventionServerPassword;
    }

    @JsonIgnore
    public void setThreatPreventionServerPassword(String value) { 
        this.threatPreventionServerPassword = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionServerProxyPort", readOnly = false)   
    public Long getThreatPreventionServerProxyPort() {
       return threatPreventionServerProxyPort;
    }

    @JsonIgnore
    public void setThreatPreventionServerProxyPort(Long value) { 
        this.threatPreventionServerProxyPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionServerUsername", readOnly = false)   
    public String getThreatPreventionServerUsername() {
       return threatPreventionServerUsername;
    }

    @JsonIgnore
    public void setThreatPreventionServerUsername(String value) { 
        this.threatPreventionServerUsername = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ThreatPreventionSyslogProxyPort", readOnly = false)   
    public Long getThreatPreventionSyslogProxyPort() {
       return threatPreventionSyslogProxyPort;
    }

    @JsonIgnore
    public void setThreatPreventionSyslogProxyPort(Long value) { 
        this.threatPreventionSyslogProxyPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TwoFactorCodeExpiry", readOnly = false)   
    public Long getTwoFactorCodeExpiry() {
       return twoFactorCodeExpiry;
    }

    @JsonIgnore
    public void setTwoFactorCodeExpiry(Long value) { 
        this.twoFactorCodeExpiry = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TwoFactorCodeLength", readOnly = false)   
    public Long getTwoFactorCodeLength() {
       return twoFactorCodeLength;
    }

    @JsonIgnore
    public void setTwoFactorCodeLength(Long value) { 
        this.twoFactorCodeLength = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TwoFactorCodeSeedLength", readOnly = false)   
    public Long getTwoFactorCodeSeedLength() {
       return twoFactorCodeSeedLength;
    }

    @JsonIgnore
    public void setTwoFactorCodeSeedLength(Long value) { 
        this.twoFactorCodeSeedLength = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VcinLoadBalancerIP", readOnly = false)   
    public String getVcinLoadBalancerIP() {
       return vcinLoadBalancerIP;
    }

    @JsonIgnore
    public void setVcinLoadBalancerIP(String value) { 
        this.vcinLoadBalancerIP = value;
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
    @VsoProperty(displayName = "WebCatSrvUrl", readOnly = false)   
    public String getWebCatSrvUrl() {
       return webCatSrvUrl;
    }

    @JsonIgnore
    public void setWebCatSrvUrl(String value) { 
        this.webCatSrvUrl = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebFilteringType", readOnly = false)   
    public SystemConfigWebFilteringType getWebFilteringType() {
       return webFilteringType;
    }

    @JsonIgnore
    public void setWebFilteringType(SystemConfigWebFilteringType value) { 
        this.webFilteringType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.SYSTEMCONFIG, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.SYSTEMCONFIG, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SYSTEMCONFIG, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SYSTEMCONFIG, getId());
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
    }public String toString() {
        return "SystemConfig [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", ACLAllowOrigin=" + ACLAllowOrigin + ", ADGatewayPurgeTime=" + ADGatewayPurgeTime + ", APIKeyRenewalInterval=" + APIKeyRenewalInterval + ", APIKeyValidity=" + APIKeyValidity + ", ASNumber=" + ASNumber + ", DHCPOptionSize=" + DHCPOptionSize + ", ECMPCount=" + ECMPCount + ", EVPNBGPCommunityTagASNumber=" + EVPNBGPCommunityTagASNumber + ", EVPNBGPCommunityTagLowerLimit=" + EVPNBGPCommunityTagLowerLimit + ", EVPNBGPCommunityTagUpperLimit=" + EVPNBGPCommunityTagUpperLimit + ", IPv6ExtendedPrefixesEnabled=" + IPv6ExtendedPrefixesEnabled + ", LDAPSyncInterval=" + LDAPSyncInterval + ", LDAPTrustStoreCertifcate=" + LDAPTrustStoreCertifcate + ", LDAPTrustStorePassword=" + LDAPTrustStorePassword + ", LRUCacheSizePerSubnet=" + LRUCacheSizePerSubnet + ", NSGUplinkHoldDownTimer=" + NSGUplinkHoldDownTimer + ", PGIDLowerLimit=" + PGIDLowerLimit + ", PGIDUpperLimit=" + PGIDUpperLimit + ", RDLowerLimit=" + RDLowerLimit + ", RDPublicNetworkLowerLimit=" + RDPublicNetworkLowerLimit + ", RDPublicNetworkUpperLimit=" + RDPublicNetworkUpperLimit + ", RDUpperLimit=" + RDUpperLimit + ", RTLowerLimit=" + RTLowerLimit + ", RTPublicNetworkLowerLimit=" + RTPublicNetworkLowerLimit + ", RTPublicNetworkUpperLimit=" + RTPublicNetworkUpperLimit + ", RTUpperLimit=" + RTUpperLimit + ", SaaSApplicationsPublishDate=" + SaaSApplicationsPublishDate + ", VLANIDLowerLimit=" + VLANIDLowerLimit + ", VLANIDUpperLimit=" + VLANIDUpperLimit + ", VMCacheSize=" + VMCacheSize + ", VMPurgeTime=" + VMPurgeTime + ", VMResyncDeletionWaitTime=" + VMResyncDeletionWaitTime + ", VMResyncOutstandingInterval=" + VMResyncOutstandingInterval + ", VMUnreachableCleanupTime=" + VMUnreachableCleanupTime + ", VMUnreachableTime=" + VMUnreachableTime + ", VNFTaskTimeout=" + VNFTaskTimeout + ", VNIDLowerLimit=" + VNIDLowerLimit + ", VNIDPublicNetworkLowerLimit=" + VNIDPublicNetworkLowerLimit + ", VNIDPublicNetworkUpperLimit=" + VNIDPublicNetworkUpperLimit + ", VNIDUpperLimit=" + VNIDUpperLimit + ", VPortInitStatefulTimer=" + VPortInitStatefulTimer + ", VSCOnSameVersionAsVSD=" + VSCOnSameVersionAsVSD + ", VSDAARApplicationVersion=" + VSDAARApplicationVersion + ", VSDAARApplicationVersionPublishDate=" + VSDAARApplicationVersionPublishDate + ", VSDReadOnlyMode=" + VSDReadOnlyMode + ", VSDUpgradeIsComplete=" + VSDUpgradeIsComplete + ", VSSStatsInterval=" + VSSStatsInterval + ", ZFBBootstrapEnabled=" + ZFBBootstrapEnabled + ", ZFBRequestRetryTimer=" + ZFBRequestRetryTimer + ", ZFBSchedulerStaleRequestTimeout=" + ZFBSchedulerStaleRequestTimeout + ", accumulateLicensesEnabled=" + accumulateLicensesEnabled + ", alarmsMaxPerObject=" + alarmsMaxPerObject + ", allowEnterpriseAvatarOnNSG=" + allowEnterpriseAvatarOnNSG + ", attachProbeToIPsecNPM=" + attachProbeToIPsecNPM + ", attachProbeToVXLANNPM=" + attachProbeToVXLANNPM + ", avatarBasePath=" + avatarBasePath + ", avatarBaseURL=" + avatarBaseURL + ", creationDate=" + creationDate + ", csprootAuthenticationMethod=" + csprootAuthenticationMethod + ", customerIDUpperLimit=" + customerIDUpperLimit + ", customerKey=" + customerKey + ", deniedFlowCollectionEnabled=" + deniedFlowCollectionEnabled + ", domainTunnelType=" + domainTunnelType + ", dynamicWANServiceDiffTime=" + dynamicWANServiceDiffTime + ", ejbcaNSGCertificateProfile=" + ejbcaNSGCertificateProfile + ", ejbcaNSGEndEntityProfile=" + ejbcaNSGEndEntityProfile + ", ejbcaOCSPResponderCN=" + ejbcaOCSPResponderCN + ", ejbcaOCSPResponderURI=" + ejbcaOCSPResponderURI + ", ejbcaVspRootCa=" + ejbcaVspRootCa + ", elasticClusterName=" + elasticClusterName + ", embeddedMetadata=" + embeddedMetadata + ", embeddedMetadataSize=" + embeddedMetadataSize + ", entityScope=" + entityScope + ", esiID=" + esiID + ", eventLogCleanupInterval=" + eventLogCleanupInterval + ", eventLogEntryMaxAge=" + eventLogEntryMaxAge + ", eventProcessorInterval=" + eventProcessorInterval + ", eventProcessorMaxEventsCount=" + eventProcessorMaxEventsCount + ", eventProcessorTimeout=" + eventProcessorTimeout + ", explicitACLMatchingEnabled=" + explicitACLMatchingEnabled + ", externalID=" + externalID + ", fecFeedbackTimer=" + fecFeedbackTimer + ", flowCollectionEnabled=" + flowCollectionEnabled + ", flowDropTimeout=" + flowDropTimeout + ", gatewayProbeInterval=" + gatewayProbeInterval + ", gatewayProbeWindow=" + gatewayProbeWindow + ", gatewayRebalancingInterval=" + gatewayRebalancingInterval + ", globalMACAddress=" + globalMACAddress + ", googleMapsAPIKey=" + googleMapsAPIKey + ", groupKeyDefaultSEKGenerationInterval=" + groupKeyDefaultSEKGenerationInterval + ", groupKeyDefaultSEKLifetime=" + groupKeyDefaultSEKLifetime + ", groupKeyDefaultSEKPayloadEncryptionAlgorithm=" + groupKeyDefaultSEKPayloadEncryptionAlgorithm + ", groupKeyDefaultSEKPayloadSigningAlgorithm=" + groupKeyDefaultSEKPayloadSigningAlgorithm + ", groupKeyDefaultSeedGenerationInterval=" + groupKeyDefaultSeedGenerationInterval + ", groupKeyDefaultSeedLifetime=" + groupKeyDefaultSeedLifetime + ", groupKeyDefaultSeedPayloadAuthenticationAlgorithm=" + groupKeyDefaultSeedPayloadAuthenticationAlgorithm + ", groupKeyDefaultSeedPayloadEncryptionAlgorithm=" + groupKeyDefaultSeedPayloadEncryptionAlgorithm + ", groupKeyDefaultSeedPayloadSigningAlgorithm=" + groupKeyDefaultSeedPayloadSigningAlgorithm + ", groupKeyDefaultTrafficAuthenticationAlgorithm=" + groupKeyDefaultTrafficAuthenticationAlgorithm + ", groupKeyDefaultTrafficEncryptionAlgorithm=" + groupKeyDefaultTrafficEncryptionAlgorithm + ", groupKeyDefaultTrafficEncryptionKeyLifetime=" + groupKeyDefaultTrafficEncryptionKeyLifetime + ", groupKeyGenerationIntervalOnForcedReKey=" + groupKeyGenerationIntervalOnForcedReKey + ", groupKeyGenerationIntervalOnRevoke=" + groupKeyGenerationIntervalOnRevoke + ", groupKeyMinimumSEKGenerationInterval=" + groupKeyMinimumSEKGenerationInterval + ", groupKeyMinimumSEKLifetime=" + groupKeyMinimumSEKLifetime + ", groupKeyMinimumSeedGenerationInterval=" + groupKeyMinimumSeedGenerationInterval + ", groupKeyMinimumSeedLifetime=" + groupKeyMinimumSeedLifetime + ", groupKeyMinimumTrafficEncryptionKeyLifetime=" + groupKeyMinimumTrafficEncryptionKeyLifetime + ", importedSaaSApplicationsVersion=" + importedSaaSApplicationsVersion + ", inactiveTimeout=" + inactiveTimeout + ", infrastructureBGPASNumber=" + infrastructureBGPASNumber + ", interfaceIdLowerLimit=" + interfaceIdLowerLimit + ", interfaceIdUpperLimit=" + interfaceIdUpperLimit + ", keyServerMonitorEnabled=" + keyServerMonitorEnabled + ", keyServerVSDDataSynchronizationInterval=" + keyServerVSDDataSynchronizationInterval + ", lastExecutedMigrationPhase=" + lastExecutedMigrationPhase + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", maintenanceModeEnabled=" + maintenanceModeEnabled + ", maxFailedLogins=" + maxFailedLogins + ", maxResponse=" + maxResponse + ", nsgBootstrapEndpoint=" + nsgBootstrapEndpoint + ", nsgConfigEndpoint=" + nsgConfigEndpoint + ", nsgLocalUiUrl=" + nsgLocalUiUrl + ", offsetCustomerID=" + offsetCustomerID + ", offsetServiceID=" + offsetServiceID + ", owner=" + owner + ", pageMaxSize=" + pageMaxSize + ", pageSize=" + pageSize + ", perDomainVlanIdEnabled=" + perDomainVlanIdEnabled + ", postProcessorThreadsCount=" + postProcessorThreadsCount + ", rbacEnabled=" + rbacEnabled + ", secondaryASNumber=" + secondaryASNumber + ", secondaryRTLowerLimit=" + secondaryRTLowerLimit + ", secondaryRTUpperLimit=" + secondaryRTUpperLimit + ", serviceIDUpperLimit=" + serviceIDUpperLimit + ", stackTraceEnabled=" + stackTraceEnabled + ", statefulACLNonTCPTimeout=" + statefulACLNonTCPTimeout + ", statefulACLTCPTimeout=" + statefulACLTCPTimeout + ", staticWANServicePurgeTime=" + staticWANServicePurgeTime + ", statisticsEnabled=" + statisticsEnabled + ", statsCollectorAddress=" + statsCollectorAddress + ", statsCollectorPort=" + statsCollectorPort + ", statsCollectorProtoBufPort=" + statsCollectorProtoBufPort + ", statsDatabaseProxy=" + statsDatabaseProxy + ", statsMaxDataPoints=" + statsMaxDataPoints + ", statsMinDuration=" + statsMinDuration + ", statsNumberOfDataPoints=" + statsNumberOfDataPoints + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", stickyECMPIdleTimeout=" + stickyECMPIdleTimeout + ", subnetResyncInterval=" + subnetResyncInterval + ", subnetResyncOutstandingInterval=" + subnetResyncOutstandingInterval + ", syslogDestinationHost=" + syslogDestinationHost + ", syslogDestinationPort=" + syslogDestinationPort + ", sysmonCleanupTaskInterval=" + sysmonCleanupTaskInterval + ", sysmonNodePresenceTimeout=" + sysmonNodePresenceTimeout + ", sysmonProbeResponseTimeout=" + sysmonProbeResponseTimeout + ", sysmonPurgeInterval=" + sysmonPurgeInterval + ", systemAvatarData=" + systemAvatarData + ", systemAvatarType=" + systemAvatarType + ", systemBlockedPageText=" + systemBlockedPageText + ", threatIntelligenceEnabled=" + threatIntelligenceEnabled + ", threatPreventionFeedServerProxyPort=" + threatPreventionFeedServerProxyPort + ", threatPreventionServer=" + threatPreventionServer + ", threatPreventionServerPassword=" + threatPreventionServerPassword + ", threatPreventionServerProxyPort=" + threatPreventionServerProxyPort + ", threatPreventionServerUsername=" + threatPreventionServerUsername + ", threatPreventionSyslogProxyPort=" + threatPreventionSyslogProxyPort + ", twoFactorCodeExpiry=" + twoFactorCodeExpiry + ", twoFactorCodeLength=" + twoFactorCodeLength + ", twoFactorCodeSeedLength=" + twoFactorCodeSeedLength + ", vcinLoadBalancerIP=" + vcinLoadBalancerIP + ", virtualFirewallRulesEnabled=" + virtualFirewallRulesEnabled + ", webCatSrvUrl=" + webCatSrvUrl + ", webFilteringType=" + webFilteringType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}