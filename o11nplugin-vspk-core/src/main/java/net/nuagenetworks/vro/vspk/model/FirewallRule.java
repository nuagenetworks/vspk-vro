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
import net.nuagenetworks.vro.vspk.model.enums.FirewallRuleAction;

import net.nuagenetworks.vro.vspk.model.enums.FirewallRuleDestinationType;

import net.nuagenetworks.vro.vspk.model.enums.FirewallRuleLocationType;

import net.nuagenetworks.vro.vspk.model.enums.FirewallRuleNetworkType;

import net.nuagenetworks.vro.vspk.model.enums.FirewallRuleSourceType;
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

@VsoFinder(name = Constants.FIREWALLRULE, datasource = Constants.DATASOURCE, image = Constants.FIREWALLRULE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "firewallrule", resourceName = "firewallrules")
public class FirewallRule extends BaseObject {

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
    protected FirewallRuleAction action;
    
    @JsonProperty(value = "addressOverride")
    protected String addressOverride;
    
    @JsonProperty(value = "associatedApplicationID")
    protected String associatedApplicationID;
    
    @JsonProperty(value = "associatedApplicationObjectID")
    protected String associatedApplicationObjectID;
    
    @JsonProperty(value = "associatedfirewallACLID")
    protected String associatedfirewallACLID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destNetwork")
    protected String destNetwork;
    
    @JsonProperty(value = "destPgId")
    protected String destPgId;
    
    @JsonProperty(value = "destPgType")
    protected String destPgType;
    
    @JsonProperty(value = "destinationIpv6Value")
    protected String destinationIpv6Value;
    
    @JsonProperty(value = "destinationPort")
    protected String destinationPort;
    
    @JsonProperty(value = "destinationType")
    protected FirewallRuleDestinationType destinationType;
    
    @JsonProperty(value = "destinationValue")
    protected String destinationValue;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "etherType")
    protected String etherType;
    
    @JsonProperty(value = "flowLoggingEnabled")
    protected Boolean flowLoggingEnabled;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "locationType")
    protected FirewallRuleLocationType locationType;
    
    @JsonProperty(value = "mirrorDestinationID")
    protected String mirrorDestinationID;
    
    @JsonProperty(value = "networkID")
    protected String networkID;
    
    @JsonProperty(value = "networkType")
    protected FirewallRuleNetworkType networkType;
    
    @JsonProperty(value = "priority")
    protected String priority;
    
    @JsonProperty(value = "sourceIpv6Value")
    protected String sourceIpv6Value;
    
    @JsonProperty(value = "sourceNetwork")
    protected String sourceNetwork;
    
    @JsonProperty(value = "sourcePgId")
    protected String sourcePgId;
    
    @JsonProperty(value = "sourcePgType")
    protected String sourcePgType;
    
    @JsonProperty(value = "sourcePort")
    protected String sourcePort;
    
    @JsonProperty(value = "sourceType")
    protected FirewallRuleSourceType sourceType;
    
    @JsonProperty(value = "sourceValue")
    protected String sourceValue;
    
    @JsonProperty(value = "stateful")
    protected Boolean stateful;
    
    @JsonProperty(value = "statsID")
    protected String statsID;
    
    @JsonProperty(value = "statsLoggingEnabled")
    protected Boolean statsLoggingEnabled;
    
    @VsoConstructor
    public FirewallRule() {}

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
    public FirewallRuleAction getAction() {
       return action;
    }

    @JsonIgnore
    public void setAction(FirewallRuleAction value) { 
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
    @VsoProperty(displayName = "AssociatedApplicationID", readOnly = false)   
    public String getAssociatedApplicationID() {
       return associatedApplicationID;
    }

    @JsonIgnore
    public void setAssociatedApplicationID(String value) { 
        this.associatedApplicationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationObjectID", readOnly = false)   
    public String getAssociatedApplicationObjectID() {
       return associatedApplicationObjectID;
    }

    @JsonIgnore
    public void setAssociatedApplicationObjectID(String value) { 
        this.associatedApplicationObjectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedfirewallACLID", readOnly = false)   
    public String getAssociatedfirewallACLID() {
       return associatedfirewallACLID;
    }

    @JsonIgnore
    public void setAssociatedfirewallACLID(String value) { 
        this.associatedfirewallACLID = value;
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
    @VsoProperty(displayName = "DestNetwork", readOnly = false)   
    public String getDestNetwork() {
       return destNetwork;
    }

    @JsonIgnore
    public void setDestNetwork(String value) { 
        this.destNetwork = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestPgId", readOnly = false)   
    public String getDestPgId() {
       return destPgId;
    }

    @JsonIgnore
    public void setDestPgId(String value) { 
        this.destPgId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestPgType", readOnly = false)   
    public String getDestPgType() {
       return destPgType;
    }

    @JsonIgnore
    public void setDestPgType(String value) { 
        this.destPgType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationIpv6Value", readOnly = false)   
    public String getDestinationIpv6Value() {
       return destinationIpv6Value;
    }

    @JsonIgnore
    public void setDestinationIpv6Value(String value) { 
        this.destinationIpv6Value = value;
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
    @VsoProperty(displayName = "DestinationType", readOnly = false)   
    public FirewallRuleDestinationType getDestinationType() {
       return destinationType;
    }

    @JsonIgnore
    public void setDestinationType(FirewallRuleDestinationType value) { 
        this.destinationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationValue", readOnly = false)   
    public String getDestinationValue() {
       return destinationValue;
    }

    @JsonIgnore
    public void setDestinationValue(String value) { 
        this.destinationValue = value;
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
    @VsoProperty(displayName = "EtherType", readOnly = false)   
    public String getEtherType() {
       return etherType;
    }

    @JsonIgnore
    public void setEtherType(String value) { 
        this.etherType = value;
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
    public FirewallRuleLocationType getLocationType() {
       return locationType;
    }

    @JsonIgnore
    public void setLocationType(FirewallRuleLocationType value) { 
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
    public FirewallRuleNetworkType getNetworkType() {
       return networkType;
    }

    @JsonIgnore
    public void setNetworkType(FirewallRuleNetworkType value) { 
        this.networkType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Priority", readOnly = false)   
    public String getPriority() {
       return priority;
    }

    @JsonIgnore
    public void setPriority(String value) { 
        this.priority = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceIpv6Value", readOnly = false)   
    public String getSourceIpv6Value() {
       return sourceIpv6Value;
    }

    @JsonIgnore
    public void setSourceIpv6Value(String value) { 
        this.sourceIpv6Value = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceNetwork", readOnly = false)   
    public String getSourceNetwork() {
       return sourceNetwork;
    }

    @JsonIgnore
    public void setSourceNetwork(String value) { 
        this.sourceNetwork = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePgId", readOnly = false)   
    public String getSourcePgId() {
       return sourcePgId;
    }

    @JsonIgnore
    public void setSourcePgId(String value) { 
        this.sourcePgId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePgType", readOnly = false)   
    public String getSourcePgType() {
       return sourcePgType;
    }

    @JsonIgnore
    public void setSourcePgType(String value) { 
        this.sourcePgType = value;
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
    @VsoProperty(displayName = "SourceType", readOnly = false)   
    public FirewallRuleSourceType getSourceType() {
       return sourceType;
    }

    @JsonIgnore
    public void setSourceType(FirewallRuleSourceType value) { 
        this.sourceType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceValue", readOnly = false)   
    public String getSourceValue() {
       return sourceValue;
    }

    @JsonIgnore
    public void setSourceValue(String value) { 
        this.sourceValue = value;
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.FIREWALLRULE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.FIREWALLRULE, getId());
        }
    }public String toString() {
        return "FirewallRule [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", IPv6AddressOverride=" + IPv6AddressOverride + ", action=" + action + ", addressOverride=" + addressOverride + ", associatedApplicationID=" + associatedApplicationID + ", associatedApplicationObjectID=" + associatedApplicationObjectID + ", associatedfirewallACLID=" + associatedfirewallACLID + ", description=" + description + ", destNetwork=" + destNetwork + ", destPgId=" + destPgId + ", destPgType=" + destPgType + ", destinationIpv6Value=" + destinationIpv6Value + ", destinationPort=" + destinationPort + ", destinationType=" + destinationType + ", destinationValue=" + destinationValue + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", etherType=" + etherType + ", flowLoggingEnabled=" + flowLoggingEnabled + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationID=" + mirrorDestinationID + ", networkID=" + networkID + ", networkType=" + networkType + ", priority=" + priority + ", sourceIpv6Value=" + sourceIpv6Value + ", sourceNetwork=" + sourceNetwork + ", sourcePgId=" + sourcePgId + ", sourcePgType=" + sourcePgType + ", sourcePort=" + sourcePort + ", sourceType=" + sourceType + ", sourceValue=" + sourceValue + ", stateful=" + stateful + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}