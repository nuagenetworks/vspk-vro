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

import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.spring.SpringConfig;
import net.nuagenetworks.vro.model.BaseSession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.SESSION, datasource = Constants.DATASOURCE, image = Constants.SESSION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
               @VsoRelation(inventoryChildren = true, name = Constants.MES, type = Constants.ME) })
@VsoObject(create = false, strict = true)
public class Session extends BaseSession<Me> {
    public final static double VERSION = 6;

    @VsoConstructor
    public Session() {
        super(Me.class);

        ClassLoader classLoader = getClass().getClassLoader();

        try (final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext()) {
            applicationContext.setClassLoader(classLoader);
            applicationContext.register(SpringConfig.class);
            applicationContext.refresh();
            applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
        }
    }

    @VsoConstructor
    public Session(String username, String password, String enterprise, String apiUrl) {
        this();
 
        setUsername(username);
        setPassword(password);
        setEnterprise(enterprise);
        setApiUrl(apiUrl);
        setApiPrefix("nuage/api");
        setVersion(VERSION);
        setCertificate(null);
        setPrivateKey(null);
    }

    @VsoConstructor
    public Session(String username, String enterprise, String apiUrl, String certificateContent, String privateKeyContent) {
        this();
 
        setUsername(username);
        setEnterprise(enterprise);
        setApiUrl(apiUrl);
        setApiPrefix("nuage/api");
        setVersion(VERSION);
        setCertificate(certificateContent);
        setPrivateKey(privateKeyContent);
    }

    @VsoProperty(displayName = "notificationsEnabled")
    public boolean getNotificationsEnabled() {
        return super.getNotificationsEnabled();
    }
    public void setNotificationsEnabled(boolean notificationsEnabled) {
        super.setNotificationsEnabled(notificationsEnabled);
    }

    @VsoProperty(displayName = "useJmsForNotifications")
    public boolean getUseJmsForNotifications() {
        return super.getUseJmsForNotifications();
    }
    public void setUseJmsForNotifications(boolean useJmsForNotifications) {
        super.setUseJmsForNotifications(useJmsForNotifications);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return getApiUrl();
    }

    @VsoProperty(displayName = "Version", readOnly = true)
    public double getVersion() {
        return VERSION;
    }

    @VsoMethod
    public Me getMe() {
        return super.getRootObject();
    }

    @VsoProperty(displayName = "Username", readOnly = false)
    public String getUsername() {
        return super.getUsername();
    }

    public String getPassword() {
        return super.getPassword();
    }

    @VsoProperty(displayName = "Enterprise", readOnly = false)
    public String getEnterprise() {
        return super.getEnterprise();
    }

    @VsoProperty(displayName = "ApiUrl", readOnly = false)
    public String getApiUrl() {
        return super.getApiUrl();
    }

    @VsoProperty(displayName = "ApiPrefix", readOnly = false)
    public String getApiPrefix() {
        return super.getApiPrefix();
    }

    @VsoProperty(displayName = "Certificate", readOnly = false)
    public String getCertificate() {
        return super.getCertificate();
    }

    @VsoProperty(displayName = "PrivateKey", readOnly = false)
    public String getPrivateKey() {
        return super.getPrivateKey();
    }

    @VsoMethod
    public void start() throws RestException {
        super.start();
    }

    @VsoMethod
    public void stop() {
        super.stop();
    }

    @Override
    protected void onEntityCreated(String entityType, String entityId, String entityParentType, String entityParentId) {
        SessionManager sessionManager = SessionManager.getInstance();
        if (entityType.equals(Constants.CERTIFICATEMETADATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CERTIFICATEMETADATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DOWNLOADPROGRESS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DOWNLOADPROGRESS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TCPCONNECTTESTRESULT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TCPCONNECTTESTRESULTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONNODEINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.THREATPREVENTIONNODEINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VPORTINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VPORTINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGCLASS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.FORWARDINGCLASS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BANDWIDTHTESTRESULT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BANDWIDTHTESTRESULTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MTUDISCOVERYTESTRESULT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MTUDISCOVERYTESTRESULTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SYSMONUPLINKCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SYSMONUPLINKCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.UDPPROBETESTRESULT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.UDPPROBETESTRESULTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ALLOCATIONPOOL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ALLOCATIONPOOLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ADDRESSMAP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ADDRESSMAPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ADDRESSRANGE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ADDRESSRANGES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AGGREGATEDDOMAIN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AGGREGATEDDOMAINS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AGGREGATEMETADATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AGGREGATEMETADATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ALARM_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ALARMS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ALLALARM_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ALLALARMS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ALLGATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ALLGATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ALLREDUNDANCYGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ALLREDUNDANCYGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.APPLICATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.APPLICATIONBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVERCLUSTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AUTODISCOVERCLUSTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVEREDDATACENTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AUTODISCOVEREDDATACENTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVEREDGATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AUTODISCOVEREDGATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AVATAR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AVATARS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.AZURECLOUD_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.AZURECLOUDS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BFDSESSION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BFDSESSIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BGPNEIGHBOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BGPNEIGHBORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BGPPEER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BGPPEERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BGPPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BGPPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BOOTSTRAP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BOOTSTRAPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BOOTSTRAPACTIVATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BOOTSTRAPACTIVATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BRCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BRCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BRIDGEINTERFACE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BRIDGEINTERFACES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.BULKSTATISTICS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.BULKSTATISTICS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CAPTIVEPORTALPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CAPTIVEPORTALPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CERTIFICATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CERTIFICATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CLOUDMGMTSYSTEM_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CLOUDMGMTSYSTEMS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.COMMAND_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.COMMANDS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VSDCOMPONENT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VSDCOMPONENTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CONNECTIONENDPOINT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CONNECTIONENDPOINTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CONTAINERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINERINTERFACE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CONTAINERINTERFACES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINERRESYNC_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CONTAINERRESYNCS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CONTROLLERVRSLINK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CONTROLLERVRSLINKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.COSREMARKINGPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.COSREMARKINGPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.COSREMARKINGPOLICYTABLE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.COSREMARKINGPOLICYTABLES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CSNATPOOL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CSNATPOOLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CTRANSLATIONMAP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CTRANSLATIONMAPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.CUSTOMPROPERTY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.CUSTOMPROPERTIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DDNSCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DDNSCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DDNSCONFIGBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DDNSCONFIGBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DEFAULTGATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DEFAULTGATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DEMARCATIONSERVICE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DEMARCATIONSERVICES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DEPLOYMENTFAILURE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DEPLOYMENTFAILURES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DESTINATIONURL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DESTINATIONURLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DHCPOPTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DHCPOPTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DHCPV6OPTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DHCPV6OPTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DISKSTAT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DISKSTATS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAIN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DOMAINS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINKINDSUMMARY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DOMAINKINDSUMMARIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DOMAINTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPFORWARDINGCLASSMAPPING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPFORWARDINGCLASSTABLE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPREMARKINGPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DSCPREMARKINGPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPREMARKINGPOLICYTABLE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DSCPREMARKINGPOLICYTABLES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DUCGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DUCGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DUCGROUPBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DUCGROUPBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTEREAMCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VCENTEREAMCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSACLENTRYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSACLTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSACLTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSADVFWDENTRYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSADVFWDTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSADVFWDTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSAUDITACLENTRYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSAUDITACLTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSAUDITACLTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINFIPACLTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.DOMAINFIPACLTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSQOSPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EGRESSQOSPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ENTERPRISES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISENETWORK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ENTERPRISENETWORKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISEPERMISSION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ENTERPRISEPERMISSIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISEPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ENTERPRISEPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISESECUREDDATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ENTERPRISESECUREDDATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISESECURITY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ENTERPRISESECURITIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ESILMPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ESILMPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ESINDEXCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ESINDEXCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ETHERNETSEGMENTGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ETHERNETSEGMENTGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ETHERNETSEGMENTGWGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ETHERNETSEGMENTGWGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.EVENTLOG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.EVENTLOGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.FIREWALLACL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.FIREWALLACLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.FIREWALLRULE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.FIREWALLRULES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.FLOATINGIP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.FLOATINGIPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGPATHLIST_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.FORWARDINGPATHLISTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGPATHLISTENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.FORWARDINGPATHLISTENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYREDUNDANTPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GATEWAYREDUNDANTPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSECUREDDATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GATEWAYSECUREDDATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSECURITY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GATEWAYSECURITIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSLOCATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GATEWAYSLOCATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GATEWAYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GLOBALMETADATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GLOBALMETADATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GNMIPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GNMIPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GNMISESSION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GNMISESSIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.GROUPKEYENCRYPTIONPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.HOSTINTERFACE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.HOSTINTERFACES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.HSC_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.HSCS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ICMPECHOTESTDEFINITION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ICMPECHOTESTDEFINITIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IDPPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IDPPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IDPPROFILEACTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IDPPROFILEACTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IDPSIGNATURE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IDPSIGNATURES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKECERTIFICATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKECERTIFICATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKEENCRYPTIONPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKEENCRYPTIONPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKEGATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKEGATEWAYCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKEGATEWAYCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKEGATEWAYPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKEPSK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKEPSKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IKESUBNET_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IKESUBNETS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTURECONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INFRASTRUCTURECONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREEVDFPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INFRASTRUCTUREEVDFPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSACLENTRYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSACLTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSACLTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSADVFWDTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSADVFWDTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSAUDITACLENTRYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSAUDITACLTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSAUDITACLTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSQOSPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.INGRESSQOSPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IPFILTERPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IPFILTERPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IPRESERVATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IPRESERVATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.IPV6FILTERPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.IPV6FILTERPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.JOB_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.JOBS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMEMBER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.KEYSERVERMEMBERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.KEYSERVERMONITORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORSEED_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.KEYSERVERMONITORSEEDS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORSEK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.KEYSERVERMONITORSEKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.L2DOMAIN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.L2DOMAINS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.L2DOMAINTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.L2DOMAINTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.L4SERVICE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.L4SERVICES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.L4SERVICEGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.L4SERVICEGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.L7APPLICATIONSIGNATURE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.L7APPLICATIONSIGNATURES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LDAPCONFIGURATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LDAPCONFIGURATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LICENSE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LICENSES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LICENSESTATUS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LICENSESTATUS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LINK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LINKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LOCATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LOCATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LTEINFORMATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LTEINFORMATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.LTESTATISTICS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.LTESTATISTICS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MACFILTERPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MACFILTERPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ME_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.METADATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.METADATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MIRRORDESTINATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MIRRORDESTINATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MIRRORDESTINATIONGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MIRRORDESTINATIONGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MONITORINGPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MONITORINGPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MONITORSCOPE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MONITORSCOPES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTCHANNELMAP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MULTICASTCHANNELMAPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTLIST_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MULTICASTLISTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTRANGE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MULTICASTRANGES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.MULTINICVPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.MULTINICVPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NATMAPENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NATMAPENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFGATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETCONFGATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFGLOBALCONFIGURATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETCONFGLOBALCONFIGURATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFMANAGER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETCONFMANAGERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETCONFPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFSESSION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETCONFSESSIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKLAYOUT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETWORKLAYOUTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKMACROGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETWORKMACROGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKPERFORMANCEBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NEXTHOP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NEXTHOPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGATEWAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYSCOUNT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGATEWAYSCOUNTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYMONITOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGATEWAYMONITORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYSUMMARY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGATEWAYSUMMARIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGATEWAYTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGMIGRATIONPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGMIGRATIONPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGPATCHPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGPATCHPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSREDUNDANTGATEWAYGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGROUTINGPOLICYBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGROUTINGPOLICYBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSGUPGRADEPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSGUPGRADEPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORTTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSPORTTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.REDUNDANTPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.REDUNDANTPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFAREA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OSPFAREAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFINSTANCE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OSPFINSTANCES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFINTERFACE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OSPFINTERFACES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYADDRESSPOOL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OVERLAYADDRESSPOOLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMANAGEMENTPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OVERLAYMANAGEMENTPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OVERLAYMANAGEMENTSUBNETPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMIRRORDESTINATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OVERLAYMIRRORDESTINATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OVERLAYMIRRORDESTINATIONTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYPATNATENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.OVERLAYPATNATENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PATCH_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PATCHS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PATIPENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PATIPENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PATMAPPER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PATMAPPERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PATNATPOOL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PATNATPOOLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PERFORMANCEMONITOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PERFORMANCEMONITORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PERMISSION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PERMISSIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PGEXPRESSION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PGEXPRESSIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PGEXPRESSIONTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PGEXPRESSIONTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYDECISION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYDECISIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUPCATEGORY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYGROUPCATEGORIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUPTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYGROUPTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYOBJECTGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYOBJECTGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYSTATEMENT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.POLICYSTATEMENTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORTINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.NSPORTINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PORTMAPPING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PORTMAPPINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PORTTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PORTTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PROXYARPFILTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PROXYARPFILTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PSNATPOOL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PSNATPOOLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PSPATMAP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PSPATMAPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PTRANSLATIONMAP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PTRANSLATIONMAPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.PUBLICNETWORKMACRO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.PUBLICNETWORKMACROS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.QOS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.QOSS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.QOSPOLICER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.QOSPOLICERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.RATELIMITER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.RATELIMITERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.REDIRECTIONTARGET_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.REDIRECTIONTARGETS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.REDUNDANCYGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.REDUNDANCYGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.REMOTEVRSINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.REMOTEVRSINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VMRESYNC_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VMRESYNCS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ROLE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ROLES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ROLEENTRY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ROLEENTRIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ROUTINGPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICYASSOCIATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ROUTINGPOLICYASSOCIATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICYBINDING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ROUTINGPOLICYBINDINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SAASAPPLICATIONGROUP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SAASAPPLICATIONGROUPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SAASAPPLICATIONTYPE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SAASAPPLICATIONTYPES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SAPEGRESSQOSPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SAPEGRESSQOSPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SAPINGRESSQOSPROFILE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SAPINGRESSQOSPROFILES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SCHEDULEDTESTSUITE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SCHEDULEDTESTSUITES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SCHEDULEDTESTSUITERUN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SCHEDULEDTESTSUITERUNS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.WANSERVICE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.WANSERVICES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SHAREDNETWORKRESOURCE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SHAREDNETWORKRESOURCES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SHUNTLINK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SHUNTLINKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SITEINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SITEINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SPATSOURCESPOOL_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SPATSOURCESPOOLS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SSHKEY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SSHKEYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SSIDCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SSIDCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.STATICROUTE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.STATICROUTES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.STATISTICS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.STATISTICS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.STATSCOLLECTORINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.STATSCOLLECTORINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.STATISTICSPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.STATISTICSPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SUBNET_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SUBNETS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SUBNETTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SUBNETTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SUPPLEMENTALINFRACONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SUPPLEMENTALINFRACONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SYSLOGDESTINATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SYSLOGDESTINATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.SYSTEMCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.SYSTEMCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TCA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TCAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TEST_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TESTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TESTDEFINITION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TESTDEFINITIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TESTRUN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TESTRUNS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TESTSUITE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TESTSUITES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TESTSUITERUN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TESTSUITERUNS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.THREATPREVENTIONINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONSERVERCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.THREATPREVENTIONSERVERCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TIER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TIERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.TRUNK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.TRUNKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.UNDERLAY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.UNDERLAYS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.UNDERLAYTEST_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.UNDERLAYTESTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.UPLINKCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.UPLINKCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.UPLINKRD_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.UPLINKRDS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.USER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.USERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.USERCONTEXT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.USERCONTEXTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VCENTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERCLUSTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VCENTERCLUSTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERDATACENTER_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VCENTERDATACENTERS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERHYPERVISOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VCENTERHYPERVISORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALFIREWALLPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VIRTUALFIREWALLPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALFIREWALLRULE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VIRTUALFIREWALLRULES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALIP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VIRTUALIPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALUPLINK_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VIRTUALUPLINKS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VLAN_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VLANS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VLANTEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VLANTEMPLATES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VM_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VMS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VMINTERFACE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VMINTERFACES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VMIPRESERVATION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VMIPRESERVATIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNF_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFCATALOG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFCATALOGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFDESCRIPTOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFDESCRIPTORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFDOMAINMAPPING_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFDOMAINMAPPINGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFINTERFACE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFINTERFACES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFINTERFACEDESCRIPTOR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFINTERFACEDESCRIPTORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFMETADATA_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFMETADATAS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VNFTHRESHOLDPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VNFTHRESHOLDPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VPNCONNECTION_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VPNCONNECTIONS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VPORTMIRROR_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VPORTMIRRORS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VRS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VRSS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VRSADDRESSRANGE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VRSADDRESSRANGES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERVRSCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VCENTERVRSCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VRSINFO_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VRSINFOS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VRSMETRICS_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VRSMETRICS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VRSREDEPLOYMENTPOLICY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VSC_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VSCS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VSD_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VSDS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VSDCONFIG_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VSDCONFIGS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VSGREDUNDANTPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VSGREDUNDANTPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.VSP_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.VSPS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.WEBCATEGORY_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.WEBCATEGORIES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.WEBDOMAINNAME_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.WEBDOMAINNAMES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.WIRELESSPORT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.WIRELESSPORTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ZFBAUTOASSIGNMENT_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ZFBAUTOASSIGNMENTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ZFBREQUEST_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ZFBREQUESTS_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ZONE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ZONES_FETCHER, entityParentId);
            return;
        }
        
        if (entityType.equals(Constants.ZONETEMPLATE_ENTITY_TYPE)) {
            notifyElementInvalidate(sessionManager, Constants.ZONETEMPLATES_FETCHER, entityParentId);
            return;
        }
        }

    @Override
    protected void onEntityUpdated(String entityType, String entityId, String entityParentType, String entityParentId) {
        SessionManager sessionManager = SessionManager.getInstance();
        if (entityType.equals(Constants.CERTIFICATEMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CERTIFICATEMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOWNLOADPROGRESS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DOWNLOADPROGRESS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TCPCONNECTTESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TCPCONNECTTESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONNODEINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.THREATPREVENTIONNODEINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPORTINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VPORTINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGCLASS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.FORWARDINGCLASS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BANDWIDTHTESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BANDWIDTHTESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MTUDISCOVERYTESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MTUDISCOVERYTESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SYSMONUPLINKCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SYSMONUPLINKCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UDPPROBETESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.UDPPROBETESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLOCATIONPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ALLOCATIONPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ADDRESSMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ADDRESSMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ADDRESSRANGE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ADDRESSRANGE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AGGREGATEDDOMAIN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AGGREGATEDDOMAIN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AGGREGATEMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AGGREGATEMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALARM_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ALARM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLALARM_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ALLALARM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ALLGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLREDUNDANCYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ALLREDUNDANCYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.APPLICATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.APPLICATIONBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.APPLICATIONPERFORMANCEMANAGEMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVERCLUSTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AUTODISCOVERCLUSTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVEREDDATACENTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AUTODISCOVEREDDATACENTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVEREDGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AUTODISCOVEREDGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AVATAR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AVATAR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AZURECLOUD_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.AZURECLOUD, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BFDSESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BFDSESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BGPNEIGHBOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BGPNEIGHBOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BGPPEER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BGPPEER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BGPPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BGPPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BOOTSTRAP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BOOTSTRAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BOOTSTRAPACTIVATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BOOTSTRAPACTIVATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BRCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BRCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BRIDGEINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BRIDGEINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BULKSTATISTICS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.BULKSTATISTICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CAPTIVEPORTALPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CAPTIVEPORTALPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CERTIFICATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CERTIFICATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CLOUDMGMTSYSTEM_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CLOUDMGMTSYSTEM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.COMMAND_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.COMMAND, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSDCOMPONENT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VSDCOMPONENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONNECTIONENDPOINT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CONNECTIONENDPOINT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CONTAINER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINERINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CONTAINERINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINERRESYNC_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CONTAINERRESYNC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTROLLERVRSLINK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CONTROLLERVRSLINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.COSREMARKINGPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.COSREMARKINGPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.COSREMARKINGPOLICYTABLE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.COSREMARKINGPOLICYTABLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CSNATPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CSNATPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CTRANSLATIONMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CTRANSLATIONMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CUSTOMPROPERTY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.CUSTOMPROPERTY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DDNSCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DDNSCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DDNSCONFIGBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DDNSCONFIGBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DEFAULTGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DEFAULTGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DEMARCATIONSERVICE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DEMARCATIONSERVICE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DEPLOYMENTFAILURE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DEPLOYMENTFAILURE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DESTINATIONURL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DESTINATIONURL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DHCPOPTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DHCPOPTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DHCPV6OPTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DHCPV6OPTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DISKSTAT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DISKSTAT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAIN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DOMAIN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINKINDSUMMARY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DOMAINKINDSUMMARY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DOMAINTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPFORWARDINGCLASSMAPPING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DSCPFORWARDINGCLASSMAPPING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPFORWARDINGCLASSTABLE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DSCPFORWARDINGCLASSTABLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPREMARKINGPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DSCPREMARKINGPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPREMARKINGPOLICYTABLE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DSCPREMARKINGPOLICYTABLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DUCGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DUCGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DUCGROUPBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DUCGROUPBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTEREAMCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VCENTEREAMCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSADVFWDENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSADVFWDTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSADVFWDTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSAUDITACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSAUDITACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSAUDITACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DOMAINFIPACLTEMPLATEENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINFIPACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.DOMAINFIPACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSQOSPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EGRESSQOSPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ENTERPRISE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISENETWORK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ENTERPRISENETWORK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISEPERMISSION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ENTERPRISEPERMISSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISEPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ENTERPRISEPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISESECUREDDATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ENTERPRISESECUREDDATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISESECURITY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ENTERPRISESECURITY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ESILMPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ESILMPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ESINDEXCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ESINDEXCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ETHERNETSEGMENTGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ETHERNETSEGMENTGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ETHERNETSEGMENTGWGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ETHERNETSEGMENTGWGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EVENTLOG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.EVENTLOG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FIREWALLACL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.FIREWALLACL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FIREWALLRULE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.FIREWALLRULE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FLOATINGIP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.FLOATINGIP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGPATHLIST_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.FORWARDINGPATHLIST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGPATHLISTENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.FORWARDINGPATHLISTENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYREDUNDANTPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GATEWAYREDUNDANTPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSECUREDDATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GATEWAYSECUREDDATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSECURITY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GATEWAYSECURITY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSLOCATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GATEWAYSLOCATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GATEWAYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GLOBALMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GLOBALMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GNMIPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GNMIPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GNMISESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GNMISESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GROUPKEYENCRYPTIONPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.GROUPKEYENCRYPTIONPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.HOSTINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.HOSTINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.HSC_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.HSC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ICMPECHOTESTDEFINITION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ICMPECHOTESTDEFINITION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IDPPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IDPPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IDPPROFILEACTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IDPPROFILEACTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IDPSIGNATURE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IDPSIGNATURE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKECERTIFICATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKECERTIFICATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEENCRYPTIONPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKEENCRYPTIONPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKEGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKEGATEWAYCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKEGATEWAYCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKEGATEWAYPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEPSK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKEPSK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKESUBNET_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IKESUBNET, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTURECONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INFRASTRUCTURECONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INFRASTRUCTUREACCESSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREEVDFPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INFRASTRUCTUREEVDFPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INFRASTRUCTUREGATEWAYPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INFRASTRUCTUREVSCPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSADVFWDENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSADVFWDTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSADVFWDTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSAUDITACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSAUDITACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSAUDITACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSQOSPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.INGRESSQOSPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IPFILTERPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IPFILTERPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IPRESERVATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IPRESERVATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IPV6FILTERPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.IPV6FILTERPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.JOB_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.JOB, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMEMBER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.KEYSERVERMEMBER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.KEYSERVERMONITOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.KEYSERVERMONITORENCRYPTEDSEED, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORSEED_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.KEYSERVERMONITORSEED, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORSEK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.KEYSERVERMONITORSEK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L2DOMAIN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.L2DOMAIN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L2DOMAINTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.L2DOMAINTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L4SERVICE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.L4SERVICE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L4SERVICEGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.L4SERVICEGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L7APPLICATIONSIGNATURE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.L7APPLICATIONSIGNATURE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LDAPCONFIGURATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LDAPCONFIGURATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LICENSE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LICENSE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LICENSESTATUS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LICENSESTATUS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LINK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LOCATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LOCATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LTEINFORMATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LTEINFORMATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LTESTATISTICS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.LTESTATISTICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MACFILTERPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MACFILTERPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ME_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ME, entityId);
            return;
        }
        
        if (entityType.equals(Constants.METADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.METADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MIRRORDESTINATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MIRRORDESTINATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MIRRORDESTINATIONGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MIRRORDESTINATIONGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MONITORINGPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MONITORINGPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MONITORSCOPE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MONITORSCOPE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTCHANNELMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MULTICASTCHANNELMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTLIST_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MULTICASTLIST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTRANGE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MULTICASTRANGE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTINICVPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.MULTINICVPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NATMAPENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NATMAPENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETCONFGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFGLOBALCONFIGURATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETCONFGLOBALCONFIGURATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFMANAGER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETCONFMANAGER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETCONFPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFSESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETCONFSESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKLAYOUT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETWORKLAYOUT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKMACROGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETWORKMACROGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKPERFORMANCEBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETWORKPERFORMANCEBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NETWORKPERFORMANCEMEASUREMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NEXTHOP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NEXTHOP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYSCOUNT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGATEWAYSCOUNT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYMONITOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGATEWAYMONITOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYSUMMARY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGATEWAYSUMMARY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGATEWAYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGMIGRATIONPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGMIGRATIONPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGPATCHPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGPATCHPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSREDUNDANTGATEWAYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSREDUNDANTGATEWAYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGROUTINGPOLICYBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGROUTINGPOLICYBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGUPGRADEPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSGUPGRADEPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORTTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSPORTTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDUNDANTPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.REDUNDANTPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFAREA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OSPFAREA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFINSTANCE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OSPFINSTANCE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OSPFINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYADDRESSPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OVERLAYADDRESSPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMANAGEMENTPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OVERLAYMANAGEMENTPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OVERLAYMANAGEMENTSUBNETPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMIRRORDESTINATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OVERLAYMIRRORDESTINATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYPATNATENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.OVERLAYPATNATENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATCH_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PATCH, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATIPENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PATIPENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATMAPPER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PATMAPPER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATNATPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PATNATPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PERFORMANCEMONITOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PERFORMANCEMONITOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PERMISSION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PERMISSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PGEXPRESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PGEXPRESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PGEXPRESSIONTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PGEXPRESSIONTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYDECISION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYDECISION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUPCATEGORY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYGROUPCATEGORY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUPTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYGROUPTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYOBJECTGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYOBJECTGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYSTATEMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.POLICYSTATEMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORTINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.NSPORTINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PORTMAPPING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PORTMAPPING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PORTTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PORTTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PROXYARPFILTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PROXYARPFILTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PSNATPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PSNATPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PSPATMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PSPATMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PTRANSLATIONMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PTRANSLATIONMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PUBLICNETWORKMACRO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.PUBLICNETWORKMACRO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.QOS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.QOS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.QOSPOLICER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.QOSPOLICER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.RATELIMITER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.RATELIMITER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDIRECTIONTARGET_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.REDIRECTIONTARGET, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.REDIRECTIONTARGETTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDUNDANCYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.REDUNDANCYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REMOTEVRSINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.REMOTEVRSINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VMRESYNC_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VMRESYNC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROLE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ROLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROLEENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ROLEENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ROUTINGPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICYASSOCIATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ROUTINGPOLICYASSOCIATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICYBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ROUTINGPOLICYBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAASAPPLICATIONGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SAASAPPLICATIONGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAASAPPLICATIONTYPE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SAASAPPLICATIONTYPE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAPEGRESSQOSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SAPEGRESSQOSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAPINGRESSQOSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SAPINGRESSQOSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SCHEDULEDTESTSUITE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SCHEDULEDTESTSUITE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SCHEDULEDTESTSUITERUN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SCHEDULEDTESTSUITERUN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WANSERVICE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.WANSERVICE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SHAREDNETWORKRESOURCE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SHAREDNETWORKRESOURCE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SHUNTLINK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SHUNTLINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SITEINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SITEINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SPATSOURCESPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SPATSOURCESPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SSHKEY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SSHKEY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SSIDCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SSIDCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATICROUTE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.STATICROUTE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATISTICS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.STATISTICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATSCOLLECTORINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.STATSCOLLECTORINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATISTICSPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.STATISTICSPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SUBNET_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SUBNET, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SUBNETTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SUBNETTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SUPPLEMENTALINFRACONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SUPPLEMENTALINFRACONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SYSLOGDESTINATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SYSLOGDESTINATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SYSTEMCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.SYSTEMCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TCA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TCA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TEST_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TEST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTDEFINITION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TESTDEFINITION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTRUN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TESTRUN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTSUITE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TESTSUITE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTSUITERUN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TESTSUITERUN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.THREATPREVENTIONINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONSERVERCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.THREATPREVENTIONSERVERCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TIER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TIER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TRUNK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.TRUNK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UNDERLAY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.UNDERLAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UNDERLAYTEST_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.UNDERLAYTEST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UPLINKCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.UPLINKCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UPLINKRD_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.UPLINKRD, entityId);
            return;
        }
        
        if (entityType.equals(Constants.USER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.USER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.USERCONTEXT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.USERCONTEXT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VCENTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERCLUSTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VCENTERCLUSTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERDATACENTER_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VCENTERDATACENTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERHYPERVISOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VCENTERHYPERVISOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALFIREWALLPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VIRTUALFIREWALLPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALFIREWALLRULE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VIRTUALFIREWALLRULE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALIP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VIRTUALIP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALUPLINK_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VIRTUALUPLINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VLAN_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VLAN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VLANTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VLANTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VM_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VMINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VMINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VMIPRESERVATION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VMIPRESERVATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNF_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNF, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFCATALOG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFCATALOG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFDESCRIPTOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFDESCRIPTOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFDOMAINMAPPING_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFDOMAINMAPPING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFINTERFACEDESCRIPTOR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFINTERFACEDESCRIPTOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFTHRESHOLDPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VNFTHRESHOLDPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPNCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VPNCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPORTMIRROR_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VPORTMIRROR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VRS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSADDRESSRANGE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VRSADDRESSRANGE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERVRSCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VCENTERVRSCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VRSINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSMETRICS_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VRSMETRICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSREDEPLOYMENTPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VRSREDEPLOYMENTPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSC_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VSC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSD_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VSD, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSDCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VSDCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSGREDUNDANTPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VSGREDUNDANTPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSP_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.VSP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WEBCATEGORY_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.WEBCATEGORY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WEBDOMAINNAME_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.WEBDOMAINNAME, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WIRELESSPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.WIRELESSPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZFBAUTOASSIGNMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ZFBAUTOASSIGNMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZFBREQUEST_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ZFBREQUEST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZONE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ZONE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZONETEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementUpdated(Constants.ZONETEMPLATE, entityId);
            return;
        }
        }

    @Override
    protected void onEntityDeleted(String entityType, String entityId, String entityParentType, String entityParentId) {
        SessionManager sessionManager = SessionManager.getInstance();
        if (entityType.equals(Constants.CERTIFICATEMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CERTIFICATEMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOWNLOADPROGRESS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DOWNLOADPROGRESS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TCPCONNECTTESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TCPCONNECTTESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONNODEINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.THREATPREVENTIONNODEINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPORTINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VPORTINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGCLASS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.FORWARDINGCLASS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BANDWIDTHTESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BANDWIDTHTESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MTUDISCOVERYTESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MTUDISCOVERYTESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SYSMONUPLINKCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SYSMONUPLINKCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UDPPROBETESTRESULT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.UDPPROBETESTRESULT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLOCATIONPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ALLOCATIONPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ADDRESSMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ADDRESSMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ADDRESSRANGE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ADDRESSRANGE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AGGREGATEDDOMAIN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AGGREGATEDDOMAIN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AGGREGATEMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AGGREGATEMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALARM_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ALARM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLALARM_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ALLALARM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ALLGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ALLREDUNDANCYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ALLREDUNDANCYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.APPLICATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.APPLICATIONBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.APPLICATIONPERFORMANCEMANAGEMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVERCLUSTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AUTODISCOVERCLUSTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVEREDDATACENTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AUTODISCOVEREDDATACENTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVEREDGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AUTODISCOVEREDGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AVATAR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AVATAR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.AZURECLOUD_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.AZURECLOUD, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BFDSESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BFDSESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BGPNEIGHBOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BGPNEIGHBOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BGPPEER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BGPPEER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BGPPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BGPPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BOOTSTRAP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BOOTSTRAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BOOTSTRAPACTIVATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BOOTSTRAPACTIVATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BRCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BRCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BRIDGEINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BRIDGEINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.BULKSTATISTICS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.BULKSTATISTICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CAPTIVEPORTALPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CAPTIVEPORTALPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CERTIFICATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CERTIFICATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CLOUDMGMTSYSTEM_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CLOUDMGMTSYSTEM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.COMMAND_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.COMMAND, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSDCOMPONENT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VSDCOMPONENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONNECTIONENDPOINT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CONNECTIONENDPOINT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CONTAINER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINERINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CONTAINERINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTAINERRESYNC_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CONTAINERRESYNC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CONTROLLERVRSLINK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CONTROLLERVRSLINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.COSREMARKINGPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.COSREMARKINGPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.COSREMARKINGPOLICYTABLE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.COSREMARKINGPOLICYTABLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CSNATPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CSNATPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CTRANSLATIONMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CTRANSLATIONMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.CUSTOMPROPERTY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.CUSTOMPROPERTY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DDNSCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DDNSCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DDNSCONFIGBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DDNSCONFIGBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DEFAULTGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DEFAULTGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DEMARCATIONSERVICE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DEMARCATIONSERVICE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DEPLOYMENTFAILURE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DEPLOYMENTFAILURE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DESTINATIONURL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DESTINATIONURL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DHCPOPTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DHCPOPTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DHCPV6OPTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DHCPV6OPTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DISKSTAT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DISKSTAT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAIN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DOMAIN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINKINDSUMMARY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DOMAINKINDSUMMARY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DOMAINTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPFORWARDINGCLASSMAPPING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DSCPFORWARDINGCLASSMAPPING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPFORWARDINGCLASSTABLE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DSCPFORWARDINGCLASSTABLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPREMARKINGPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DSCPREMARKINGPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DSCPREMARKINGPOLICYTABLE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DSCPREMARKINGPOLICYTABLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DUCGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DUCGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DUCGROUPBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DUCGROUPBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTEREAMCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VCENTEREAMCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSADVFWDENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSADVFWDTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSADVFWDTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSAUDITACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSAUDITACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSAUDITACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSAUDITACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINFIPACLTEMPLATEENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DOMAINFIPACLTEMPLATEENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.DOMAINFIPACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.DOMAINFIPACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EGRESSQOSPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EGRESSQOSPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ENTERPRISE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISENETWORK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ENTERPRISENETWORK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISEPERMISSION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ENTERPRISEPERMISSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISEPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ENTERPRISEPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISESECUREDDATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ENTERPRISESECUREDDATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ENTERPRISESECURITY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ENTERPRISESECURITY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ESILMPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ESILMPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ESINDEXCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ESINDEXCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ETHERNETSEGMENTGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ETHERNETSEGMENTGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ETHERNETSEGMENTGWGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ETHERNETSEGMENTGWGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.EVENTLOG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.EVENTLOG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FIREWALLACL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.FIREWALLACL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FIREWALLRULE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.FIREWALLRULE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FLOATINGIP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.FLOATINGIP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGPATHLIST_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.FORWARDINGPATHLIST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.FORWARDINGPATHLISTENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.FORWARDINGPATHLISTENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYREDUNDANTPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GATEWAYREDUNDANTPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSECUREDDATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GATEWAYSECUREDDATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSECURITY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GATEWAYSECURITY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYSLOCATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GATEWAYSLOCATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GATEWAYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GATEWAYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GLOBALMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GLOBALMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GNMIPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GNMIPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GNMISESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GNMISESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.GROUPKEYENCRYPTIONPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.GROUPKEYENCRYPTIONPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.HOSTINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.HOSTINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.HSC_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.HSC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ICMPECHOTESTDEFINITION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ICMPECHOTESTDEFINITION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IDPPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IDPPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IDPPROFILEACTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IDPPROFILEACTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IDPSIGNATURE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IDPSIGNATURE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKECERTIFICATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKECERTIFICATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEENCRYPTIONPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKEENCRYPTIONPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKEGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKEGATEWAYCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKEGATEWAYCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEGATEWAYPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKEGATEWAYPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKEPSK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKEPSK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IKESUBNET_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IKESUBNET, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTURECONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INFRASTRUCTURECONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREACCESSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INFRASTRUCTUREACCESSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREEVDFPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INFRASTRUCTUREEVDFPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREGATEWAYPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INFRASTRUCTUREGATEWAYPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INFRASTRUCTUREVSCPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INFRASTRUCTUREVSCPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSADVFWDENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSADVFWDENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSADVFWDTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSADVFWDTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSAUDITACLENTRYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSAUDITACLENTRYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSAUDITACLTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSAUDITACLTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.INGRESSQOSPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.INGRESSQOSPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IPFILTERPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IPFILTERPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IPRESERVATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IPRESERVATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.IPV6FILTERPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.IPV6FILTERPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.JOB_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.JOB, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMEMBER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.KEYSERVERMEMBER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.KEYSERVERMONITOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORENCRYPTEDSEED_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.KEYSERVERMONITORENCRYPTEDSEED, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORSEED_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.KEYSERVERMONITORSEED, entityId);
            return;
        }
        
        if (entityType.equals(Constants.KEYSERVERMONITORSEK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.KEYSERVERMONITORSEK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L2DOMAIN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.L2DOMAIN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L2DOMAINTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.L2DOMAINTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L4SERVICE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.L4SERVICE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L4SERVICEGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.L4SERVICEGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.L7APPLICATIONSIGNATURE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.L7APPLICATIONSIGNATURE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LDAPCONFIGURATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LDAPCONFIGURATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LICENSE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LICENSE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LICENSESTATUS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LICENSESTATUS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LINK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LOCATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LOCATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LTEINFORMATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LTEINFORMATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.LTESTATISTICS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.LTESTATISTICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MACFILTERPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MACFILTERPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ME_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ME, entityId);
            return;
        }
        
        if (entityType.equals(Constants.METADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.METADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MIRRORDESTINATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MIRRORDESTINATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MIRRORDESTINATIONGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MIRRORDESTINATIONGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MONITORINGPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MONITORINGPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MONITORSCOPE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MONITORSCOPE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTCHANNELMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MULTICASTCHANNELMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTLIST_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MULTICASTLIST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTICASTRANGE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MULTICASTRANGE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.MULTINICVPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.MULTINICVPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NATMAPENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NATMAPENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETCONFGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFGLOBALCONFIGURATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETCONFGLOBALCONFIGURATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFMANAGER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETCONFMANAGER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETCONFPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETCONFSESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETCONFSESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKLAYOUT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETWORKLAYOUT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKMACROGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETWORKMACROGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKPERFORMANCEBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETWORKPERFORMANCEBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NETWORKPERFORMANCEMEASUREMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NETWORKPERFORMANCEMEASUREMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NEXTHOP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NEXTHOP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGATEWAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYSCOUNT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGATEWAYSCOUNT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYMONITOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGATEWAYMONITOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYSUMMARY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGATEWAYSUMMARY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGATEWAYTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGATEWAYTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGMIGRATIONPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGMIGRATIONPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGPATCHPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGPATCHPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSREDUNDANTGATEWAYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSREDUNDANTGATEWAYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGROUTINGPOLICYBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGROUTINGPOLICYBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSGUPGRADEPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSGUPGRADEPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORTTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSPORTTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDUNDANTPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.REDUNDANTPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFAREA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OSPFAREA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFINSTANCE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OSPFINSTANCE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OSPFINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OSPFINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYADDRESSPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OVERLAYADDRESSPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMANAGEMENTPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OVERLAYMANAGEMENTPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMANAGEMENTSUBNETPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OVERLAYMANAGEMENTSUBNETPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMIRRORDESTINATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OVERLAYMIRRORDESTINATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OVERLAYMIRRORDESTINATIONTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.OVERLAYPATNATENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.OVERLAYPATNATENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATCH_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PATCH, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATIPENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PATIPENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATMAPPER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PATMAPPER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PATNATPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PATNATPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PERFORMANCEMONITOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PERFORMANCEMONITOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PERMISSION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PERMISSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PGEXPRESSION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PGEXPRESSION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PGEXPRESSIONTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PGEXPRESSIONTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYDECISION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYDECISION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUPCATEGORY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYGROUPCATEGORY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYGROUPTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYGROUPTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYOBJECTGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYOBJECTGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.POLICYSTATEMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.POLICYSTATEMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.NSPORTINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.NSPORTINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PORTMAPPING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PORTMAPPING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PORTTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PORTTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PROXYARPFILTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PROXYARPFILTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PSNATPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PSNATPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PSPATMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PSPATMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PTRANSLATIONMAP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PTRANSLATIONMAP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.PUBLICNETWORKMACRO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.PUBLICNETWORKMACRO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.QOS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.QOS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.QOSPOLICER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.QOSPOLICER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.RATELIMITER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.RATELIMITER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDIRECTIONTARGET_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.REDIRECTIONTARGET, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDIRECTIONTARGETTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.REDIRECTIONTARGETTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REDUNDANCYGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.REDUNDANCYGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.REMOTEVRSINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.REMOTEVRSINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VMRESYNC_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VMRESYNC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROLE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ROLE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROLEENTRY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ROLEENTRY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ROUTINGPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICYASSOCIATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ROUTINGPOLICYASSOCIATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ROUTINGPOLICYBINDING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ROUTINGPOLICYBINDING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAASAPPLICATIONGROUP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SAASAPPLICATIONGROUP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAASAPPLICATIONTYPE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SAASAPPLICATIONTYPE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAPEGRESSQOSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SAPEGRESSQOSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SAPINGRESSQOSPROFILE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SAPINGRESSQOSPROFILE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SCHEDULEDTESTSUITE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SCHEDULEDTESTSUITE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SCHEDULEDTESTSUITERUN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SCHEDULEDTESTSUITERUN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WANSERVICE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.WANSERVICE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SHAREDNETWORKRESOURCE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SHAREDNETWORKRESOURCE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SHUNTLINK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SHUNTLINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SITEINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SITEINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SPATSOURCESPOOL_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SPATSOURCESPOOL, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SSHKEY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SSHKEY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SSIDCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SSIDCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATICROUTE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.STATICROUTE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATISTICS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.STATISTICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATSCOLLECTORINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.STATSCOLLECTORINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.STATISTICSPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.STATISTICSPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SUBNET_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SUBNET, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SUBNETTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SUBNETTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SUPPLEMENTALINFRACONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SUPPLEMENTALINFRACONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SYSLOGDESTINATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SYSLOGDESTINATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.SYSTEMCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.SYSTEMCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TCA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TCA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TEST_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TEST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTDEFINITION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TESTDEFINITION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTRUN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TESTRUN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTSUITE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TESTSUITE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TESTSUITERUN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TESTSUITERUN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.THREATPREVENTIONINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.THREATPREVENTIONSERVERCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.THREATPREVENTIONSERVERCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TIER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TIER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.TRUNK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.TRUNK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UNDERLAY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.UNDERLAY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UNDERLAYTEST_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.UNDERLAYTEST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UPLINKCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.UPLINKCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.UPLINKRD_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.UPLINKRD, entityId);
            return;
        }
        
        if (entityType.equals(Constants.USER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.USER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.USERCONTEXT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.USERCONTEXT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VCENTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERCLUSTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VCENTERCLUSTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERDATACENTER_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VCENTERDATACENTER, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERHYPERVISOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VCENTERHYPERVISOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALFIREWALLPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VIRTUALFIREWALLPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALFIREWALLRULE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VIRTUALFIREWALLRULE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALIP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VIRTUALIP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VIRTUALUPLINK_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VIRTUALUPLINK, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VLAN_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VLAN, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VLANTEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VLANTEMPLATE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VM_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VM, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VMINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VMINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VMIPRESERVATION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VMIPRESERVATION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNF_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNF, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFCATALOG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFCATALOG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFDESCRIPTOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFDESCRIPTOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFDOMAINMAPPING_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFDOMAINMAPPING, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFINTERFACE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFINTERFACE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFINTERFACEDESCRIPTOR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFINTERFACEDESCRIPTOR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFMETADATA_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFMETADATA, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VNFTHRESHOLDPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VNFTHRESHOLDPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPNCONNECTION_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VPNCONNECTION, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VPORTMIRROR_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VPORTMIRROR, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VRS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSADDRESSRANGE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VRSADDRESSRANGE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VCENTERVRSCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VCENTERVRSCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSINFO_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VRSINFO, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSMETRICS_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VRSMETRICS, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VRSREDEPLOYMENTPOLICY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VRSREDEPLOYMENTPOLICY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSC_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VSC, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSD_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VSD, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSDCONFIG_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VSDCONFIG, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSGREDUNDANTPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VSGREDUNDANTPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.VSP_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.VSP, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WEBCATEGORY_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.WEBCATEGORY, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WEBDOMAINNAME_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.WEBDOMAINNAME, entityId);
            return;
        }
        
        if (entityType.equals(Constants.WIRELESSPORT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.WIRELESSPORT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZFBAUTOASSIGNMENT_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ZFBAUTOASSIGNMENT, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZFBREQUEST_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ZFBREQUEST, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZONE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ZONE, entityId);
            return;
        }
        
        if (entityType.equals(Constants.ZONETEMPLATE_ENTITY_TYPE)) {
            sessionManager.notifyElementDeleted(Constants.ZONETEMPLATE, entityId);
            return;
        }
        }
}