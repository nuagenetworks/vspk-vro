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

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRuleAction;

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRuleAssociatedTrafficType;

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRuleEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRuleLocationType;

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRuleNetworkType;

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRulePolicyState;

import net.nuagenetworks.vro.vspk.model.enums.VirtualFirewallRuleWebFilterType;
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

@VsoFinder(name = Constants.VIRTUALFIREWALLRULE, datasource = Constants.DATASOURCE, image = Constants.VIRTUALFIREWALLRULE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "virtualfirewallrule", resourceName = "virtualfirewallrules")
public class VirtualFirewallRule extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ACLTemplateName")
    protected String ACLTemplateName;
    
    @JsonProperty(value = "DSCP")
    protected String DSCP;
    
    @JsonProperty(value = "ICMPCode")
    protected String ICMPCode;
    
    @JsonProperty(value = "ICMPType")
    protected String ICMPType;
    
    @JsonProperty(value = "IPv6AddressOverride")
    protected String IPv6AddressOverride;
    
    @JsonProperty(value = "action")
    protected VirtualFirewallRuleAction action;
    
    @JsonProperty(value = "addressOverride")
    protected String addressOverride;
    
    @JsonProperty(value = "associatedEgressEntryID")
    protected String associatedEgressEntryID;
    
    @JsonProperty(value = "associatedIngressEntryID")
    protected String associatedIngressEntryID;
    
    @JsonProperty(value = "associatedL7ApplicationSignatureID")
    protected String associatedL7ApplicationSignatureID;
    
    @JsonProperty(value = "associatedLiveEntityID")
    protected String associatedLiveEntityID;
    
    @JsonProperty(value = "associatedLiveTemplateID")
    protected String associatedLiveTemplateID;
    
    @JsonProperty(value = "associatedTrafficType")
    protected VirtualFirewallRuleAssociatedTrafficType associatedTrafficType;
    
    @JsonProperty(value = "associatedTrafficTypeID")
    protected String associatedTrafficTypeID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destinationPort")
    protected String destinationPort;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected VirtualFirewallRuleEntityScope entityScope;
    
    @JsonProperty(value = "etherType")
    protected String etherType;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowLoggingEnabled")
    protected Boolean flowLoggingEnabled;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "locationType")
    protected VirtualFirewallRuleLocationType locationType;
    
    @JsonProperty(value = "mirrorDestinationID")
    protected String mirrorDestinationID;
    
    @JsonProperty(value = "networkID")
    protected String networkID;
    
    @JsonProperty(value = "networkType")
    protected VirtualFirewallRuleNetworkType networkType;
    
    @JsonProperty(value = "overlayMirrorDestinationID")
    protected String overlayMirrorDestinationID;
    
    @JsonProperty(value = "policyState")
    protected VirtualFirewallRulePolicyState policyState;
    
    @JsonProperty(value = "priority")
    protected Long priority;
    
    @JsonProperty(value = "protocol")
    protected String protocol;
    
    @JsonProperty(value = "sourcePort")
    protected String sourcePort;
    
    @JsonProperty(value = "stateful")
    protected Boolean stateful;
    
    @JsonProperty(value = "statsID")
    protected String statsID;
    
    @JsonProperty(value = "statsLoggingEnabled")
    protected Boolean statsLoggingEnabled;
    
    @JsonProperty(value = "webFilterID")
    protected String webFilterID;
    
    @JsonProperty(value = "webFilterType")
    protected VirtualFirewallRuleWebFilterType webFilterType;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public VirtualFirewallRule() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
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
    public VirtualFirewallRuleAction getAction() {
       return action;
    }

    @JsonIgnore
    public void setAction(VirtualFirewallRuleAction value) { 
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
    @VsoProperty(displayName = "AssociatedEgressEntryID", readOnly = false)   
    public String getAssociatedEgressEntryID() {
       return associatedEgressEntryID;
    }

    @JsonIgnore
    public void setAssociatedEgressEntryID(String value) { 
        this.associatedEgressEntryID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressEntryID", readOnly = false)   
    public String getAssociatedIngressEntryID() {
       return associatedIngressEntryID;
    }

    @JsonIgnore
    public void setAssociatedIngressEntryID(String value) { 
        this.associatedIngressEntryID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedL7ApplicationSignatureID", readOnly = false)   
    public String getAssociatedL7ApplicationSignatureID() {
       return associatedL7ApplicationSignatureID;
    }

    @JsonIgnore
    public void setAssociatedL7ApplicationSignatureID(String value) { 
        this.associatedL7ApplicationSignatureID = value;
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
    public VirtualFirewallRuleAssociatedTrafficType getAssociatedTrafficType() {
       return associatedTrafficType;
    }

    @JsonIgnore
    public void setAssociatedTrafficType(VirtualFirewallRuleAssociatedTrafficType value) { 
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
    public VirtualFirewallRuleEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VirtualFirewallRuleEntityScope value) { 
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
    public VirtualFirewallRuleLocationType getLocationType() {
       return locationType;
    }

    @JsonIgnore
    public void setLocationType(VirtualFirewallRuleLocationType value) { 
        this.locationType = value;
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
    public VirtualFirewallRuleNetworkType getNetworkType() {
       return networkType;
    }

    @JsonIgnore
    public void setNetworkType(VirtualFirewallRuleNetworkType value) { 
        this.networkType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OverlayMirrorDestinationID", readOnly = false)   
    public String getOverlayMirrorDestinationID() {
       return overlayMirrorDestinationID;
    }

    @JsonIgnore
    public void setOverlayMirrorDestinationID(String value) { 
        this.overlayMirrorDestinationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyState", readOnly = false)   
    public VirtualFirewallRulePolicyState getPolicyState() {
       return policyState;
    }

    @JsonIgnore
    public void setPolicyState(VirtualFirewallRulePolicyState value) { 
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
    @VsoProperty(displayName = "SourcePort", readOnly = false)   
    public String getSourcePort() {
       return sourcePort;
    }

    @JsonIgnore
    public void setSourcePort(String value) { 
        this.sourcePort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Stateful", readOnly = false)   
    public Boolean getStateful() {
       return stateful;
    }

    @JsonIgnore
    public void setStateful(Boolean value) { 
        this.stateful = value;
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
    @VsoProperty(displayName = "WebFilterID", readOnly = false)   
    public String getWebFilterID() {
       return webFilterID;
    }

    @JsonIgnore
    public void setWebFilterID(String value) { 
        this.webFilterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WebFilterType", readOnly = false)   
    public VirtualFirewallRuleWebFilterType getWebFilterType() {
       return webFilterType;
    }

    @JsonIgnore
    public void setWebFilterType(VirtualFirewallRuleWebFilterType value) { 
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VIRTUALFIREWALLRULE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VIRTUALFIREWALLRULE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VIRTUALFIREWALLRULE, getId());
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
    }public String toString() {
        return "VirtualFirewallRule [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", IPv6AddressOverride=" + IPv6AddressOverride + ", action=" + action + ", addressOverride=" + addressOverride + ", associatedEgressEntryID=" + associatedEgressEntryID + ", associatedIngressEntryID=" + associatedIngressEntryID + ", associatedL7ApplicationSignatureID=" + associatedL7ApplicationSignatureID + ", associatedLiveEntityID=" + associatedLiveEntityID + ", associatedLiveTemplateID=" + associatedLiveTemplateID + ", associatedTrafficType=" + associatedTrafficType + ", associatedTrafficTypeID=" + associatedTrafficTypeID + ", description=" + description + ", destinationPort=" + destinationPort + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", flowLoggingEnabled=" + flowLoggingEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationID=" + mirrorDestinationID + ", networkID=" + networkID + ", networkType=" + networkType + ", overlayMirrorDestinationID=" + overlayMirrorDestinationID + ", policyState=" + policyState + ", priority=" + priority + ", protocol=" + protocol + ", sourcePort=" + sourcePort + ", stateful=" + stateful + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", webFilterID=" + webFilterID + ", webFilterType=" + webFilterType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}