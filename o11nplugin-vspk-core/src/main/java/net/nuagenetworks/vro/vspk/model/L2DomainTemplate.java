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
import net.nuagenetworks.vro.vspk.model.fetchers.AddressRangesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressACLTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressAdvFwdTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressExternalServiceTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.QOSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetTemplatesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplateDPI;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplateIPType;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplateEncryption;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplateEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplateMulticast;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplatePolicyChangeStatus;

import net.nuagenetworks.vro.vspk.model.enums.L2DomainTemplateUseGlobalMAC;
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

@VsoFinder(name = Constants.L2DOMAINTEMPLATE, datasource = Constants.DATASOURCE, image = Constants.L2DOMAINTEMPLATE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ADDRESSRANGES_FETCHER, type = Constants.ADDRESSRANGES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSACLTEMPLATES_FETCHER, type = Constants.EGRESSACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSACLTEMPLATES_FETCHER, type = Constants.INGRESSACLTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSADVFWDTEMPLATES_FETCHER, type = Constants.INGRESSADVFWDTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, type = Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.POLICYGROUPTEMPLATES_FETCHER, type = Constants.POLICYGROUPTEMPLATES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.QOSS_FETCHER, type = Constants.QOSS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, type = Constants.REDIRECTIONTARGETTEMPLATES_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l2domaintemplate", resourceName = "l2domaintemplates")
public class L2DomainTemplate extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DHCPManaged")
    protected Boolean DHCPManaged;
    
    @JsonProperty(value = "DPI")
    protected L2DomainTemplateDPI DPI;
    
    @JsonProperty(value = "IPType")
    protected L2DomainTemplateIPType IPType;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "associatedMulticastChannelMapID")
    protected String associatedMulticastChannelMapID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "encryption")
    protected L2DomainTemplateEncryption encryption;
    
    @JsonProperty(value = "entityScope")
    protected L2DomainTemplateEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "gatewayMACAddress")
    protected String gatewayMACAddress;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "multicast")
    protected L2DomainTemplateMulticast multicast;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "policyChangeStatus")
    protected L2DomainTemplatePolicyChangeStatus policyChangeStatus;
    
    @JsonProperty(value = "useGlobalMAC")
    protected L2DomainTemplateUseGlobalMAC useGlobalMAC;
    
    @JsonIgnore
    private AddressRangesFetcher addressRanges;
    
    @JsonIgnore
    private EgressACLTemplatesFetcher egressACLTemplates;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private GroupsFetcher groups;
    
    @JsonIgnore
    private IngressACLTemplatesFetcher ingressACLTemplates;
    
    @JsonIgnore
    private IngressAdvFwdTemplatesFetcher ingressAdvFwdTemplates;
    
    @JsonIgnore
    private IngressExternalServiceTemplatesFetcher ingressExternalServiceTemplates;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private L2DomainsFetcher l2Domains;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PolicyGroupTemplatesFetcher policyGroupTemplates;
    
    @JsonIgnore
    private QOSsFetcher qOSs;
    
    @JsonIgnore
    private RedirectionTargetTemplatesFetcher redirectionTargetTemplates;
    
    @VsoConstructor
    public L2DomainTemplate() {
        addressRanges = new AddressRangesFetcher(this);
        
        egressACLTemplates = new EgressACLTemplatesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        groups = new GroupsFetcher(this);
        
        ingressACLTemplates = new IngressACLTemplatesFetcher(this);
        
        ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
        
        ingressExternalServiceTemplates = new IngressExternalServiceTemplatesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        policyGroupTemplates = new PolicyGroupTemplatesFetcher(this);
        
        qOSs = new QOSsFetcher(this);
        
        redirectionTargetTemplates = new RedirectionTargetTemplatesFetcher(this);
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
    @VsoProperty(displayName = "DHCPManaged", readOnly = false)   
    public Boolean getDHCPManaged() {
       return DHCPManaged;
    }

    @JsonIgnore
    public void setDHCPManaged(Boolean value) { 
        this.DHCPManaged = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DPI", readOnly = false)   
    public L2DomainTemplateDPI getDPI() {
       return DPI;
    }

    @JsonIgnore
    public void setDPI(L2DomainTemplateDPI value) { 
        this.DPI = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPType", readOnly = false)   
    public L2DomainTemplateIPType getIPType() {
       return IPType;
    }

    @JsonIgnore
    public void setIPType(L2DomainTemplateIPType value) { 
        this.IPType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Address", readOnly = false)   
    public String getAddress() {
       return address;
    }

    @JsonIgnore
    public void setAddress(String value) { 
        this.address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedMulticastChannelMapID", readOnly = false)   
    public String getAssociatedMulticastChannelMapID() {
       return associatedMulticastChannelMapID;
    }

    @JsonIgnore
    public void setAssociatedMulticastChannelMapID(String value) { 
        this.associatedMulticastChannelMapID = value;
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
    @VsoProperty(displayName = "Encryption", readOnly = false)   
    public L2DomainTemplateEncryption getEncryption() {
       return encryption;
    }

    @JsonIgnore
    public void setEncryption(L2DomainTemplateEncryption value) { 
        this.encryption = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public L2DomainTemplateEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(L2DomainTemplateEntityScope value) { 
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
    @VsoProperty(displayName = "Gateway", readOnly = false)   
    public String getGateway() {
       return gateway;
    }

    @JsonIgnore
    public void setGateway(String value) { 
        this.gateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayMACAddress", readOnly = false)   
    public String getGatewayMACAddress() {
       return gatewayMACAddress;
    }

    @JsonIgnore
    public void setGatewayMACAddress(String value) { 
        this.gatewayMACAddress = value;
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
    @VsoProperty(displayName = "Multicast", readOnly = false)   
    public L2DomainTemplateMulticast getMulticast() {
       return multicast;
    }

    @JsonIgnore
    public void setMulticast(L2DomainTemplateMulticast value) { 
        this.multicast = value;
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
    @VsoProperty(displayName = "Netmask", readOnly = false)   
    public String getNetmask() {
       return netmask;
    }

    @JsonIgnore
    public void setNetmask(String value) { 
        this.netmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyChangeStatus", readOnly = false)   
    public L2DomainTemplatePolicyChangeStatus getPolicyChangeStatus() {
       return policyChangeStatus;
    }

    @JsonIgnore
    public void setPolicyChangeStatus(L2DomainTemplatePolicyChangeStatus value) { 
        this.policyChangeStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseGlobalMAC", readOnly = false)   
    public L2DomainTemplateUseGlobalMAC getUseGlobalMAC() {
       return useGlobalMAC;
    }

    @JsonIgnore
    public void setUseGlobalMAC(L2DomainTemplateUseGlobalMAC value) { 
        this.useGlobalMAC = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressRanges", readOnly = true)   
    public AddressRangesFetcher getAddressRanges() {
        return addressRanges;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressACLTemplates", readOnly = true)   
    public EgressACLTemplatesFetcher getEgressACLTemplates() {
        return egressACLTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
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
    @VsoProperty(displayName = "IngressACLTemplates", readOnly = true)   
    public IngressACLTemplatesFetcher getIngressACLTemplates() {
        return ingressACLTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressAdvFwdTemplates", readOnly = true)   
    public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
        return ingressAdvFwdTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressExternalServiceTemplates", readOnly = true)   
    public IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplates() {
        return ingressExternalServiceTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2Domains", readOnly = true)   
    public L2DomainsFetcher getL2Domains() {
        return l2Domains;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroupTemplates", readOnly = true)   
    public PolicyGroupTemplatesFetcher getPolicyGroupTemplates() {
        return policyGroupTemplates;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "QOSs", readOnly = true)   
    public QOSsFetcher getQOSs() {
        return qOSs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectionTargetTemplates", readOnly = true)   
    public RedirectionTargetTemplatesFetcher getRedirectionTargetTemplates() {
        return redirectionTargetTemplates;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAINTEMPLATE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.L2DOMAINTEMPLATE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAINTEMPLATE, getId());
        }
    }
    
    @VsoMethod
    public void assignGroups(Session session, Group[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.L2DOMAINTEMPLATE, getId());
        }
    }
    
    @VsoMethod
    public void createAddressRange(Session session, AddressRange childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ADDRESSRANGES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEgressACLTemplate(Session session, EgressACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSACLTEMPLATES_FETCHER, getId());
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
    public void createIngressACLTemplate(Session session, IngressACLTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSACLTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressAdvFwdTemplate(Session session, IngressAdvFwdTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSADVFWDTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressExternalServiceTemplate(Session session, IngressExternalServiceTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, getId());
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
    }
    @VsoMethod
    public void createPolicyGroupTemplate(Session session, PolicyGroupTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.POLICYGROUPTEMPLATES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createQOS(Session session, QOS childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.QOSS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createRedirectionTargetTemplate(Session session, RedirectionTargetTemplate childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, getId());
        }
    }public String toString() {
        return "L2DomainTemplate [" + "DHCPManaged=" + DHCPManaged + ", DPI=" + DPI + ", IPType=" + IPType + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", description=" + description + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyChangeStatus=" + policyChangeStatus + ", useGlobalMAC=" + useGlobalMAC + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}