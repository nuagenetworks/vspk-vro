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
import net.nuagenetworks.vro.vspk.model.fetchers.DHCPOptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiCastChannelMapsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyDecisionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.RedirectionTargetsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StaticRoutesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.TCAsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VMInterfaceAttachedNetworkType;

import net.nuagenetworks.vro.vspk.model.enums.VMInterfaceEntityScope;
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

@VsoFinder(name = Constants.VMINTERFACE, datasource = Constants.DATASOURCE, image = Constants.VMINTERFACE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vminterface", resourceName = "vminterfaces")
public class VMInterface extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "IPAddress")
    protected String IPAddress;
    
    @JsonProperty(value = "MAC")
    protected String MAC;
    
    @JsonProperty(value = "VMUUID")
    protected String VMUUID;
    
    @JsonProperty(value = "VPortID")
    protected String VPortID;
    
    @JsonProperty(value = "VPortName")
    protected String VPortName;
    
    @JsonProperty(value = "associatedFloatingIPAddress")
    protected String associatedFloatingIPAddress;
    
    @JsonProperty(value = "attachedNetworkID")
    protected String attachedNetworkID;
    
    @JsonProperty(value = "attachedNetworkType")
    protected VMInterfaceAttachedNetworkType attachedNetworkType;
    
    @JsonProperty(value = "domainID")
    protected String domainID;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "entityScope")
    protected VMInterfaceEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "multiNICVPortName")
    protected String multiNICVPortName;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "networkName")
    protected String networkName;
    
    @JsonProperty(value = "policyDecisionID")
    protected String policyDecisionID;
    
    @JsonProperty(value = "tierID")
    protected String tierID;
    
    @JsonProperty(value = "zoneID")
    protected String zoneID;
    
    @JsonProperty(value = "zoneName")
    protected String zoneName;
    
    @JsonIgnore
    private DHCPOptionsFetcher dHCPOptions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MultiCastChannelMapsFetcher multiCastChannelMaps;
    
    @JsonIgnore
    private PolicyDecisionsFetcher policyDecisions;
    
    @JsonIgnore
    private PolicyGroupsFetcher policyGroups;
    
    @JsonIgnore
    private RedirectionTargetsFetcher redirectionTargets;
    
    @JsonIgnore
    private StaticRoutesFetcher staticRoutes;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private TCAsFetcher tCAs;
    
    @VsoConstructor
    public VMInterface() {
        dHCPOptions = new DHCPOptionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        multiCastChannelMaps = new MultiCastChannelMapsFetcher(this);
        
        policyDecisions = new PolicyDecisionsFetcher(this);
        
        policyGroups = new PolicyGroupsFetcher(this);
        
        redirectionTargets = new RedirectionTargetsFetcher(this);
        
        staticRoutes = new StaticRoutesFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        tCAs = new TCAsFetcher(this);
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
    @VsoProperty(displayName = "IPAddress", readOnly = false)   
    public String getIPAddress() {
       return IPAddress;
    }

    @JsonIgnore
    public void setIPAddress(String value) { 
        this.IPAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MAC", readOnly = false)   
    public String getMAC() {
       return MAC;
    }

    @JsonIgnore
    public void setMAC(String value) { 
        this.MAC = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMUUID", readOnly = false)   
    public String getVMUUID() {
       return VMUUID;
    }

    @JsonIgnore
    public void setVMUUID(String value) { 
        this.VMUUID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPortID", readOnly = false)   
    public String getVPortID() {
       return VPortID;
    }

    @JsonIgnore
    public void setVPortID(String value) { 
        this.VPortID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPortName", readOnly = false)   
    public String getVPortName() {
       return VPortName;
    }

    @JsonIgnore
    public void setVPortName(String value) { 
        this.VPortName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedFloatingIPAddress", readOnly = false)   
    public String getAssociatedFloatingIPAddress() {
       return associatedFloatingIPAddress;
    }

    @JsonIgnore
    public void setAssociatedFloatingIPAddress(String value) { 
        this.associatedFloatingIPAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AttachedNetworkID", readOnly = false)   
    public String getAttachedNetworkID() {
       return attachedNetworkID;
    }

    @JsonIgnore
    public void setAttachedNetworkID(String value) { 
        this.attachedNetworkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AttachedNetworkType", readOnly = false)   
    public VMInterfaceAttachedNetworkType getAttachedNetworkType() {
       return attachedNetworkType;
    }

    @JsonIgnore
    public void setAttachedNetworkType(VMInterfaceAttachedNetworkType value) { 
        this.attachedNetworkType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainID", readOnly = false)   
    public String getDomainID() {
       return domainID;
    }

    @JsonIgnore
    public void setDomainID(String value) { 
        this.domainID = value;
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
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VMInterfaceEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VMInterfaceEntityScope value) { 
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
    @VsoProperty(displayName = "LastUpdatedBy", readOnly = false)   
    public String getLastUpdatedBy() {
       return lastUpdatedBy;
    }

    @JsonIgnore
    public void setLastUpdatedBy(String value) { 
        this.lastUpdatedBy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MultiNICVPortName", readOnly = false)   
    public String getMultiNICVPortName() {
       return multiNICVPortName;
    }

    @JsonIgnore
    public void setMultiNICVPortName(String value) { 
        this.multiNICVPortName = value;
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
    @VsoProperty(displayName = "NetworkName", readOnly = false)   
    public String getNetworkName() {
       return networkName;
    }

    @JsonIgnore
    public void setNetworkName(String value) { 
        this.networkName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyDecisionID", readOnly = false)   
    public String getPolicyDecisionID() {
       return policyDecisionID;
    }

    @JsonIgnore
    public void setPolicyDecisionID(String value) { 
        this.policyDecisionID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TierID", readOnly = false)   
    public String getTierID() {
       return tierID;
    }

    @JsonIgnore
    public void setTierID(String value) { 
        this.tierID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZoneID", readOnly = false)   
    public String getZoneID() {
       return zoneID;
    }

    @JsonIgnore
    public void setZoneID(String value) { 
        this.zoneID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZoneName", readOnly = false)   
    public String getZoneName() {
       return zoneName;
    }

    @JsonIgnore
    public void setZoneName(String value) { 
        this.zoneName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPOptions", readOnly = true)   
    public DHCPOptionsFetcher getDHCPOptions() {
        return dHCPOptions;
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
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MultiCastChannelMaps", readOnly = true)   
    public MultiCastChannelMapsFetcher getMultiCastChannelMaps() {
        return multiCastChannelMaps;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyDecisions", readOnly = true)   
    public PolicyDecisionsFetcher getPolicyDecisions() {
        return policyDecisions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyGroups", readOnly = true)   
    public PolicyGroupsFetcher getPolicyGroups() {
        return policyGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectionTargets", readOnly = true)   
    public RedirectionTargetsFetcher getRedirectionTargets() {
        return redirectionTargets;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRoutes", readOnly = true)   
    public StaticRoutesFetcher getStaticRoutes() {
        return staticRoutes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Statistics", readOnly = true)   
    public StatisticsFetcher getStatistics() {
        return statistics;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TCAs", readOnly = true)   
    public TCAsFetcher getTCAs() {
        return tCAs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VMINTERFACE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VMINTERFACE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VMINTERFACE, getId());
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
        return "VMInterface [" + "IPAddress=" + IPAddress + ", MAC=" + MAC + ", VMUUID=" + VMUUID + ", VPortID=" + VPortID + ", VPortName=" + VPortName + ", associatedFloatingIPAddress=" + associatedFloatingIPAddress + ", attachedNetworkID=" + attachedNetworkID + ", attachedNetworkType=" + attachedNetworkType + ", domainID=" + domainID + ", domainName=" + domainName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", multiNICVPortName=" + multiNICVPortName + ", name=" + name + ", netmask=" + netmask + ", networkName=" + networkName + ", policyDecisionID=" + policyDecisionID + ", tierID=" + tierID + ", zoneID=" + zoneID + ", zoneName=" + zoneName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}