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

import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.AvatarsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BGPProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DSCPForwardingClassTablesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressQOSPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterpriseNetworksFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterpriseSecuritiesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ExternalAppServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ExternalServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupKeyEncryptionProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKECertificatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEEncryptionprofilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewayProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEPSKsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.KeyServerMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L7applicationsignaturesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LDAPConfigurationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadataTagsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiCastListsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkMacroGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkPerformanceMeasurementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewayTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSRedundantGatewayGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PerformanceMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PublicNetworkMacrosFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RateLimitersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedundancyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RoutingPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SharedNetworkResourcesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UsersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ZFBRequestsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseAllowedForwardingClasses;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseAvatarType;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseEncryptionManagementMode;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseEntityScope;
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

        @VsoRelation(inventoryChildren = true, name = Constants.APPLICATIONSERVICES_FETCHER, type = Constants.APPLICATIONSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.AVATARS_FETCHER, type = Constants.AVATARS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.BGPPROFILES_FETCHER, type = Constants.BGPPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINS_FETCHER, type = Constants.DOMAINS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DOMAINTEMPLATES_FETCHER, type = Constants.DOMAINTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, type = Constants.DSCPFORWARDINGCLASSTABLES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSQOSPOLICIES_FETCHER, type = Constants.EGRESSQOSPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISENETWORKS_FETCHER, type = Constants.ENTERPRISENETWORKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EXTERNALAPPSERVICES_FETCHER, type = Constants.EXTERNALAPPSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYS_FETCHER, type = Constants.GATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GATEWAYTEMPLATES_FETCHER, type = Constants.GATEWAYTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.GROUPS_FETCHER, type = Constants.GROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKECERTIFICATES_FETCHER, type = Constants.IKECERTIFICATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEENCRYPTIONPROFILES_FETCHER, type = Constants.IKEENCRYPTIONPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEGATEWAYS_FETCHER, type = Constants.IKEGATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEGATEWAYPROFILES_FETCHER, type = Constants.IKEGATEWAYPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEPSKS_FETCHER, type = Constants.IKEPSKS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L2DOMAINS_FETCHER, type = Constants.L2DOMAINS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.L2DOMAINTEMPLATES_FETCHER, type = Constants.L2DOMAINTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATATAGS_FETCHER, type = Constants.METADATATAGS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETWORKMACROGROUPS_FETCHER, type = Constants.NETWORKMACROGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, type = Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSGATEWAYS_FETCHER, type = Constants.NSGATEWAYS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, type = Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERFORMANCEMONITORS_FETCHER, type = Constants.PERFORMANCEMONITORS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PUBLICNETWORKMACROS_FETCHER, type = Constants.PUBLICNETWORKMACROS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.RATELIMITERS_FETCHER, type = Constants.RATELIMITERS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDUNDANCYGROUPS_FETCHER, type = Constants.REDUNDANCYGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ROUTINGPOLICIES_FETCHER, type = Constants.ROUTINGPOLICIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.USERS_FETCHER, type = Constants.USERS_FETCHER), 

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
    
    @JsonProperty(value = "allowAdvancedQOSConfiguration")
    protected Boolean allowAdvancedQOSConfiguration;
    
    @JsonProperty(value = "allowGatewayManagement")
    protected Boolean allowGatewayManagement;
    
    @JsonProperty(value = "allowTrustedForwardingClass")
    protected Boolean allowTrustedForwardingClass;
    
    @JsonProperty(value = "allowedForwardingClasses")
    protected java.util.List<EnterpriseAllowedForwardingClasses> allowedForwardingClasses;
    
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
    
    @JsonProperty(value = "customerID")
    protected Long customerID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "dictionaryVersion")
    protected Long dictionaryVersion;
    
    @JsonProperty(value = "enableApplicationPerformanceManagement")
    protected Boolean enableApplicationPerformanceManagement;
    
    @JsonProperty(value = "encryptionManagementMode")
    protected EnterpriseEncryptionManagementMode encryptionManagementMode;
    
    @JsonProperty(value = "enterpriseProfileID")
    protected String enterpriseProfileID;
    
    @JsonProperty(value = "entityScope")
    protected EnterpriseEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "floatingIPsQuota")
    protected Long floatingIPsQuota;
    
    @JsonProperty(value = "floatingIPsUsed")
    protected Long floatingIPsUsed;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "localAS")
    protected Long localAS;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "receiveMultiCastListID")
    protected String receiveMultiCastListID;
    
    @JsonProperty(value = "sendMultiCastListID")
    protected String sendMultiCastListID;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private AllAlarmsFetcher allAlarms;
    
    @JsonIgnore
    private ApplicationsFetcher applications;
    
    @JsonIgnore
    private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
    
    @JsonIgnore
    private ApplicationServicesFetcher applicationServices;
    
    @JsonIgnore
    private AvatarsFetcher avatars;
    
    @JsonIgnore
    private BGPProfilesFetcher bGPProfiles;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private DomainTemplatesFetcher domainTemplates;
    
    @JsonIgnore
    private DSCPForwardingClassTablesFetcher dSCPForwardingClassTables;
    
    @JsonIgnore
    private EgressQOSPoliciesFetcher egressQOSPolicies;
    
    @JsonIgnore
    private EnterpriseNetworksFetcher enterpriseNetworks;
    
    @JsonIgnore
    private EnterpriseSecuritiesFetcher enterpriseSecurities;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private ExternalAppServicesFetcher externalAppServices;
    
    @JsonIgnore
    private ExternalServicesFetcher externalServices;
    
    @JsonIgnore
    private GatewaysFetcher gateways;
    
    @JsonIgnore
    private GatewayTemplatesFetcher gatewayTemplates;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private GroupsFetcher groups;
    
    @JsonIgnore
    private GroupKeyEncryptionProfilesFetcher groupKeyEncryptionProfiles;
    
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
    private JobsFetcher jobs;
    
    @JsonIgnore
    private KeyServerMonitorsFetcher keyServerMonitors;
    
    @JsonIgnore
    private L2DomainsFetcher l2Domains;
    
    @JsonIgnore
    private L2DomainTemplatesFetcher l2DomainTemplates;
    
    @JsonIgnore
    private L7applicationsignaturesFetcher l7applicationsignatures;
    
    @JsonIgnore
    private LDAPConfigurationsFetcher lDAPConfigurations;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MetadataTagsFetcher metadataTags;
    
    @JsonIgnore
    private MultiCastListsFetcher multiCastLists;
    
    @JsonIgnore
    private NetworkMacroGroupsFetcher networkMacroGroups;
    
    @JsonIgnore
    private NetworkPerformanceMeasurementsFetcher networkPerformanceMeasurements;
    
    @JsonIgnore
    private NSGatewaysFetcher nSGateways;
    
    @JsonIgnore
    private NSGatewayTemplatesFetcher nSGatewayTemplates;
    
    @JsonIgnore
    private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PerformanceMonitorsFetcher performanceMonitors;
    
    @JsonIgnore
    private PublicNetworkMacrosFetcher publicNetworkMacros;
    
    @JsonIgnore
    private RateLimitersFetcher rateLimiters;
    
    @JsonIgnore
    private RedundancyGroupsFetcher redundancyGroups;
    
    @JsonIgnore
    private RoutingPoliciesFetcher routingPolicies;
    
    @JsonIgnore
    private SharedNetworkResourcesFetcher sharedNetworkResources;
    
    @JsonIgnore
    private UsersFetcher users;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private ZFBRequestsFetcher zFBRequests;
    
    @VsoConstructor
    public Enterprise() {
        alarms = new AlarmsFetcher(this);
        
        allAlarms = new AllAlarmsFetcher(this);
        
        applications = new ApplicationsFetcher(this);
        
        applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
        
        applicationServices = new ApplicationServicesFetcher(this);
        
        avatars = new AvatarsFetcher(this);
        
        bGPProfiles = new BGPProfilesFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        domainTemplates = new DomainTemplatesFetcher(this);
        
        dSCPForwardingClassTables = new DSCPForwardingClassTablesFetcher(this);
        
        egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
        
        enterpriseNetworks = new EnterpriseNetworksFetcher(this);
        
        enterpriseSecurities = new EnterpriseSecuritiesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        externalAppServices = new ExternalAppServicesFetcher(this);
        
        externalServices = new ExternalServicesFetcher(this);
        
        gateways = new GatewaysFetcher(this);
        
        gatewayTemplates = new GatewayTemplatesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        groups = new GroupsFetcher(this);
        
        groupKeyEncryptionProfiles = new GroupKeyEncryptionProfilesFetcher(this);
        
        iKECertificates = new IKECertificatesFetcher(this);
        
        iKEEncryptionprofiles = new IKEEncryptionprofilesFetcher(this);
        
        iKEGateways = new IKEGatewaysFetcher(this);
        
        iKEGatewayProfiles = new IKEGatewayProfilesFetcher(this);
        
        iKEPSKs = new IKEPSKsFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        keyServerMonitors = new KeyServerMonitorsFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        l2DomainTemplates = new L2DomainTemplatesFetcher(this);
        
        l7applicationsignatures = new L7applicationsignaturesFetcher(this);
        
        lDAPConfigurations = new LDAPConfigurationsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        metadataTags = new MetadataTagsFetcher(this);
        
        multiCastLists = new MultiCastListsFetcher(this);
        
        networkMacroGroups = new NetworkMacroGroupsFetcher(this);
        
        networkPerformanceMeasurements = new NetworkPerformanceMeasurementsFetcher(this);
        
        nSGateways = new NSGatewaysFetcher(this);
        
        nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
        
        nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        performanceMonitors = new PerformanceMonitorsFetcher(this);
        
        publicNetworkMacros = new PublicNetworkMacrosFetcher(this);
        
        rateLimiters = new RateLimitersFetcher(this);
        
        redundancyGroups = new RedundancyGroupsFetcher(this);
        
        routingPolicies = new RoutingPoliciesFetcher(this);
        
        sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
        
        users = new UsersFetcher(this);
        
        vMs = new VMsFetcher(this);
        
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
    @VsoProperty(displayName = "LastUpdatedBy", readOnly = false)   
    public String getLastUpdatedBy() {
       return lastUpdatedBy;
    }

    @JsonIgnore
    public void setLastUpdatedBy(String value) { 
        this.lastUpdatedBy = value;
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
    @VsoProperty(displayName = "ApplicationServices", readOnly = true)   
    public ApplicationServicesFetcher getApplicationServices() {
        return applicationServices;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Avatars", readOnly = true)   
    public AvatarsFetcher getAvatars() {
        return avatars;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPProfiles", readOnly = true)   
    public BGPProfilesFetcher getBGPProfiles() {
        return bGPProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Containers", readOnly = true)   
    public ContainersFetcher getContainers() {
        return containers;
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
    @VsoProperty(displayName = "DSCPForwardingClassTables", readOnly = true)   
    public DSCPForwardingClassTablesFetcher getDSCPForwardingClassTables() {
        return dSCPForwardingClassTables;
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
    @VsoProperty(displayName = "MetadataTags", readOnly = true)   
    public MetadataTagsFetcher getMetadataTags() {
        return metadataTags;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MultiCastLists", readOnly = true)   
    public MultiCastListsFetcher getMultiCastLists() {
        return multiCastLists;
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
    public void createApplicationService(Session session, ApplicationService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.APPLICATIONSERVICES_FETCHER, getId());
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
    public void createBGPProfile(Session session, BGPProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BGPPROFILES_FETCHER, getId());
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
    public void createExternalAppService(Session session, ExternalAppService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EXTERNALAPPSERVICES_FETCHER, getId());
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
    public void createGroup(Session session, Group childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GROUPS_FETCHER, getId());
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
    public void createNSRedundantGatewayGroup(Session session, NSRedundantGatewayGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, getId());
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
    public void createUser(Session session, User childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.USERS_FETCHER, getId());
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
        return "Enterprise [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", LDAPAuthorizationEnabled=" + LDAPAuthorizationEnabled + ", LDAPEnabled=" + LDAPEnabled + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", associatedEnterpriseSecurityID=" + associatedEnterpriseSecurityID + ", associatedGroupKeyEncryptionProfileID=" + associatedGroupKeyEncryptionProfileID + ", associatedKeyServerMonitorID=" + associatedKeyServerMonitorID + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", customerID=" + customerID + ", description=" + description + ", dictionaryVersion=" + dictionaryVersion + ", enableApplicationPerformanceManagement=" + enableApplicationPerformanceManagement + ", encryptionManagementMode=" + encryptionManagementMode + ", enterpriseProfileID=" + enterpriseProfileID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", floatingIPsUsed=" + floatingIPsUsed + ", lastUpdatedBy=" + lastUpdatedBy + ", localAS=" + localAS + ", name=" + name + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}