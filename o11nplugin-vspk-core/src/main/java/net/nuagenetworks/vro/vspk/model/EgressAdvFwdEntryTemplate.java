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

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateFCOverride;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateAction;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateAssociatedTrafficType;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateFailsafeDatapath;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateLocationEntityType;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateLocationType;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateNetworkEntityType;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateNetworkType;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplatePolicyState;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateRedirectionTargetEntityType;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateUplinkPreference;

import net.nuagenetworks.vro.vspk.model.enums.EgressAdvFwdEntryTemplateWebFilterType;
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

@VsoFinder(name = Constants.EGRESSADVFWDENTRYTEMPLATE, datasource = Constants.DATASOURCE, image = Constants.EGRESSADVFWDENTRYTEMPLATE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "egressadvfwdentrytemplate", resourceName = "egressadvfwdentrytemplates")
public class EgressAdvFwdEntryTemplate extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ACLTemplateName")
    protected String ACLTemplateName;
    
    @JsonProperty(value = "DSCP")
    protected String DSCP;
    
    @JsonProperty(value = "FCOverride")
    protected EgressAdvFwdEntryTemplateFCOverride FCOverride;
    
    @JsonProperty(value = "ICMPCode")
    protected String ICMPCode;
    
    @JsonProperty(value = "ICMPType")
    protected String ICMPType;
    
    @JsonProperty(value = "IPv6AddressOverride")
    protected String IPv6AddressOverride;
    
    @JsonProperty(value = "action")
    protected EgressAdvFwdEntryTemplateAction action;
    
    @JsonProperty(value = "addressOverride")
    protected String addressOverride;
    
    @JsonProperty(value = "associatedLiveEntityID")
    protected String associatedLiveEntityID;
    
    @JsonProperty(value = "associatedLiveTemplateID")
    protected String associatedLiveTemplateID;
    
    @JsonProperty(value = "associatedTrafficType")
    protected EgressAdvFwdEntryTemplateAssociatedTrafficType associatedTrafficType;
    
    @JsonProperty(value = "associatedTrafficTypeID")
    protected String associatedTrafficTypeID;
    
    @JsonProperty(value = "associatedVirtualFirewallRuleID")
    protected String associatedVirtualFirewallRuleID;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destinationPort")
    protected String destinationPort;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected EgressAdvFwdEntryTemplateEntityScope entityScope;
    
    @JsonProperty(value = "etherType")
    protected String etherType;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "failsafeDatapath")
    protected EgressAdvFwdEntryTemplateFailsafeDatapath failsafeDatapath;
    
    @JsonProperty(value = "flowLoggingEnabled")
    protected Boolean flowLoggingEnabled;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "locationEntityType")
    protected EgressAdvFwdEntryTemplateLocationEntityType locationEntityType;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "locationType")
    protected EgressAdvFwdEntryTemplateLocationType locationType;
    
    @JsonProperty(value = "mirrorDestinationGroupID")
    protected String mirrorDestinationGroupID;
    
    @JsonProperty(value = "mirrorDestinationID")
    protected String mirrorDestinationID;
    
    @JsonProperty(value = "networkEntityType")
    protected EgressAdvFwdEntryTemplateNetworkEntityType networkEntityType;
    
    @JsonProperty(value = "networkID")
    protected String networkID;
    
    @JsonProperty(value = "networkType")
    protected EgressAdvFwdEntryTemplateNetworkType networkType;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "policyState")
    protected EgressAdvFwdEntryTemplatePolicyState policyState;
    
    @JsonProperty(value = "priority")
    protected Long priority;
    
    @JsonProperty(value = "protocol")
    protected String protocol;
    
    @JsonProperty(value = "redirectVPortTagID")
    protected String redirectVPortTagID;
    
    @JsonProperty(value = "redirectionTargetEntityType")
    protected EgressAdvFwdEntryTemplateRedirectionTargetEntityType redirectionTargetEntityType;
    
    @JsonProperty(value = "sourcePort")
    protected String sourcePort;
    
    @JsonProperty(value = "statsID")
    protected String statsID;
    
    @JsonProperty(value = "statsLoggingEnabled")
    protected Boolean statsLoggingEnabled;
    
    @JsonProperty(value = "uplinkPreference")
    protected EgressAdvFwdEntryTemplateUplinkPreference uplinkPreference;
    
    @JsonProperty(value = "webFilterID")
    protected String webFilterID;
    
    @JsonProperty(value = "webFilterStatsLoggingEnabled")
    protected Boolean webFilterStatsLoggingEnabled;
    
    @JsonProperty(value = "webFilterType")
    protected EgressAdvFwdEntryTemplateWebFilterType webFilterType;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public EgressAdvFwdEntryTemplate() {
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
    @JsonIgnore
    @VsoProperty(displayName = "ACLTemplateName", readOnly = false)   
    public String getACLTemplateName() {
       return ACLTemplateName;
    }

    @JsonIgnore
    public void setACLTemplateName(String value) { 
        this.ACLTemplateName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DSCP", readOnly = false)   
    public String getDSCP() {
       return DSCP;
    }

    @JsonIgnore
    public void setDSCP(String value) { 
        this.DSCP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FCOverride", readOnly = false)   
    public EgressAdvFwdEntryTemplateFCOverride getFCOverride() {
       return FCOverride;
    }

    @JsonIgnore
    public void setFCOverride(EgressAdvFwdEntryTemplateFCOverride value) { 
        this.FCOverride = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ICMPCode", readOnly = false)   
    public String getICMPCode() {
       return ICMPCode;
    }

    @JsonIgnore
    public void setICMPCode(String value) { 
        this.ICMPCode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ICMPType", readOnly = false)   
    public String getICMPType() {
       return ICMPType;
    }

    @JsonIgnore
    public void setICMPType(String value) { 
        this.ICMPType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6AddressOverride", readOnly = false)   
    public String getIPv6AddressOverride() {
       return IPv6AddressOverride;
    }

    @JsonIgnore
    public void setIPv6AddressOverride(String value) { 
        this.IPv6AddressOverride = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Action", readOnly = false)   
    public EgressAdvFwdEntryTemplateAction getAction() {
       return action;
    }

    @JsonIgnore
    public void setAction(EgressAdvFwdEntryTemplateAction value) { 
        this.action = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressOverride", readOnly = false)   
    public String getAddressOverride() {
       return addressOverride;
    }

    @JsonIgnore
    public void setAddressOverride(String value) { 
        this.addressOverride = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedLiveEntityID", readOnly = false)   
    public String getAssociatedLiveEntityID() {
       return associatedLiveEntityID;
    }

    @JsonIgnore
    public void setAssociatedLiveEntityID(String value) { 
        this.associatedLiveEntityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedLiveTemplateID", readOnly = false)   
    public String getAssociatedLiveTemplateID() {
       return associatedLiveTemplateID;
    }

    @JsonIgnore
    public void setAssociatedLiveTemplateID(String value) { 
        this.associatedLiveTemplateID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedTrafficType", readOnly = false)   
    public EgressAdvFwdEntryTemplateAssociatedTrafficType getAssociatedTrafficType() {
       return associatedTrafficType;
    }

    @JsonIgnore
    public void setAssociatedTrafficType(EgressAdvFwdEntryTemplateAssociatedTrafficType value) { 
        this.associatedTrafficType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedTrafficTypeID", readOnly = false)   
    public String getAssociatedTrafficTypeID() {
       return associatedTrafficTypeID;
    }

    @JsonIgnore
    public void setAssociatedTrafficTypeID(String value) { 
        this.associatedTrafficTypeID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVirtualFirewallRuleID", readOnly = false)   
    public String getAssociatedVirtualFirewallRuleID() {
       return associatedVirtualFirewallRuleID;
    }

    @JsonIgnore
    public void setAssociatedVirtualFirewallRuleID(String value) { 
        this.associatedVirtualFirewallRuleID = value;
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
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationPort", readOnly = false)   
    public String getDestinationPort() {
       return destinationPort;
    }

    @JsonIgnore
    public void setDestinationPort(String value) { 
        this.destinationPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainName", readOnly = false)   
    public String getDomainName() {
       return domainName;
    }

    @JsonIgnore
    public void setDomainName(String value) { 
        this.domainName = value;
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
    public EgressAdvFwdEntryTemplateEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(EgressAdvFwdEntryTemplateEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EtherType", readOnly = false)   
    public String getEtherType() {
       return etherType;
    }

    @JsonIgnore
    public void setEtherType(String value) { 
        this.etherType = value;
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
    @VsoProperty(displayName = "FailsafeDatapath", readOnly = false)   
    public EgressAdvFwdEntryTemplateFailsafeDatapath getFailsafeDatapath() {
       return failsafeDatapath;
    }

    @JsonIgnore
    public void setFailsafeDatapath(EgressAdvFwdEntryTemplateFailsafeDatapath value) { 
        this.failsafeDatapath = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FlowLoggingEnabled", readOnly = false)   
    public Boolean getFlowLoggingEnabled() {
       return flowLoggingEnabled;
    }

    @JsonIgnore
    public void setFlowLoggingEnabled(Boolean value) { 
        this.flowLoggingEnabled = value;
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
    @VsoProperty(displayName = "LocationEntityType", readOnly = false)   
    public EgressAdvFwdEntryTemplateLocationEntityType getLocationEntityType() {
       return locationEntityType;
    }

    @JsonIgnore
    public void setLocationEntityType(EgressAdvFwdEntryTemplateLocationEntityType value) { 
        this.locationEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocationID", readOnly = false)   
    public String getLocationID() {
       return locationID;
    }

    @JsonIgnore
    public void setLocationID(String value) { 
        this.locationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocationType", readOnly = false)   
    public EgressAdvFwdEntryTemplateLocationType getLocationType() {
       return locationType;
    }

    @JsonIgnore
    public void setLocationType(EgressAdvFwdEntryTemplateLocationType value) { 
        this.locationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MirrorDestinationGroupID", readOnly = false)   
    public String getMirrorDestinationGroupID() {
       return mirrorDestinationGroupID;
    }

    @JsonIgnore
    public void setMirrorDestinationGroupID(String value) { 
        this.mirrorDestinationGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MirrorDestinationID", readOnly = false)   
    public String getMirrorDestinationID() {
       return mirrorDestinationID;
    }

    @JsonIgnore
    public void setMirrorDestinationID(String value) { 
        this.mirrorDestinationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkEntityType", readOnly = false)   
    public EgressAdvFwdEntryTemplateNetworkEntityType getNetworkEntityType() {
       return networkEntityType;
    }

    @JsonIgnore
    public void setNetworkEntityType(EgressAdvFwdEntryTemplateNetworkEntityType value) { 
        this.networkEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkID", readOnly = false)   
    public String getNetworkID() {
       return networkID;
    }

    @JsonIgnore
    public void setNetworkID(String value) { 
        this.networkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkType", readOnly = false)   
    public EgressAdvFwdEntryTemplateNetworkType getNetworkType() {
       return networkType;
    }

    @JsonIgnore
    public void setNetworkType(EgressAdvFwdEntryTemplateNetworkType value) { 
        this.networkType = value;
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
    @VsoProperty(displayName = "PolicyState", readOnly = false)   
    public EgressAdvFwdEntryTemplatePolicyState getPolicyState() {
       return policyState;
    }

    @JsonIgnore
    public void setPolicyState(EgressAdvFwdEntryTemplatePolicyState value) { 
        this.policyState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Priority", readOnly = false)   
    public Long getPriority() {
       return priority;
    }

    @JsonIgnore
    public void setPriority(Long value) { 
        this.priority = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Protocol", readOnly = false)   
    public String getProtocol() {
       return protocol;
    }

    @JsonIgnore
    public void setProtocol(String value) { 
        this.protocol = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectVPortTagID", readOnly = false)   
    public String getRedirectVPortTagID() {
       return redirectVPortTagID;
    }

    @JsonIgnore
    public void setRedirectVPortTagID(String value) { 
        this.redirectVPortTagID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectionTargetEntityType", readOnly = false)   
    public EgressAdvFwdEntryTemplateRedirectionTargetEntityType getRedirectionTargetEntityType() {
       return redirectionTargetEntityType;
    }

    @JsonIgnore
    public void setRedirectionTargetEntityType(EgressAdvFwdEntryTemplateRedirectionTargetEntityType value) { 
        this.redirectionTargetEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePort", readOnly = false)   
    public String getSourcePort() {
       return sourcePort;
    }

    @JsonIgnore
    public void setSourcePort(String value) { 
        this.sourcePort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsID", readOnly = false)   
    public String getStatsID() {
       return statsID;
    }

    @JsonIgnore
    public void setStatsID(String value) { 
        this.statsID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsLoggingEnabled", readOnly = false)   
    public Boolean getStatsLoggingEnabled() {
       return statsLoggingEnabled;
    }

    @JsonIgnore
    public void setStatsLoggingEnabled(Boolean value) { 
        this.statsLoggingEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkPreference", readOnly = false)   
    public EgressAdvFwdEntryTemplateUplinkPreference getUplinkPreference() {
       return uplinkPreference;
    }

    @JsonIgnore
    public void setUplinkPreference(EgressAdvFwdEntryTemplateUplinkPreference value) { 
        this.uplinkPreference = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebFilterID", readOnly = false)   
    public String getWebFilterID() {
       return webFilterID;
    }

    @JsonIgnore
    public void setWebFilterID(String value) { 
        this.webFilterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebFilterStatsLoggingEnabled", readOnly = false)   
    public Boolean getWebFilterStatsLoggingEnabled() {
       return webFilterStatsLoggingEnabled;
    }

    @JsonIgnore
    public void setWebFilterStatsLoggingEnabled(Boolean value) { 
        this.webFilterStatsLoggingEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebFilterType", readOnly = false)   
    public EgressAdvFwdEntryTemplateWebFilterType getWebFilterType() {
       return webFilterType;
    }

    @JsonIgnore
    public void setWebFilterType(EgressAdvFwdEntryTemplateWebFilterType value) { 
        this.webFilterType = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.EGRESSADVFWDENTRYTEMPLATE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.EGRESSADVFWDENTRYTEMPLATE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.EGRESSADVFWDENTRYTEMPLATE, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.EGRESSADVFWDENTRYTEMPLATE, getId());
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
        return "EgressAdvFwdEntryTemplate [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", FCOverride=" + FCOverride + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", IPv6AddressOverride=" + IPv6AddressOverride + ", action=" + action + ", addressOverride=" + addressOverride + ", associatedLiveEntityID=" + associatedLiveEntityID + ", associatedLiveTemplateID=" + associatedLiveTemplateID + ", associatedTrafficType=" + associatedTrafficType + ", associatedTrafficTypeID=" + associatedTrafficTypeID + ", associatedVirtualFirewallRuleID=" + associatedVirtualFirewallRuleID + ", creationDate=" + creationDate + ", description=" + description + ", destinationPort=" + destinationPort + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", failsafeDatapath=" + failsafeDatapath + ", flowLoggingEnabled=" + flowLoggingEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", locationEntityType=" + locationEntityType + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationGroupID=" + mirrorDestinationGroupID + ", mirrorDestinationID=" + mirrorDestinationID + ", networkEntityType=" + networkEntityType + ", networkID=" + networkID + ", networkType=" + networkType + ", owner=" + owner + ", policyState=" + policyState + ", priority=" + priority + ", protocol=" + protocol + ", redirectVPortTagID=" + redirectVPortTagID + ", redirectionTargetEntityType=" + redirectionTargetEntityType + ", sourcePort=" + sourcePort + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", uplinkPreference=" + uplinkPreference + ", webFilterID=" + webFilterID + ", webFilterStatsLoggingEnabled=" + webFilterStatsLoggingEnabled + ", webFilterType=" + webFilterType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}