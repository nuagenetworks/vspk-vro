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

import net.nuagenetworks.vro.vspk.model.fetchers.DHCPOptionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATIPEntriesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StaticRoutesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPNConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.SharedNetworkResourceEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.SharedNetworkResourcePermittedActionType;

import net.nuagenetworks.vro.vspk.model.enums.SharedNetworkResourceType;

import net.nuagenetworks.vro.vspk.model.enums.SharedNetworkResourceUseGlobalMAC;
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

@VsoFinder(name = Constants.SHAREDNETWORKRESOURCE, datasource = Constants.DATASOURCE, image = Constants.SHAREDNETWORKRESOURCE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ADDRESSRANGES_FETCHER, type = Constants.ADDRESSRANGES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DHCPOPTIONS_FETCHER, type = Constants.DHCPOPTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PATIPENTRIES_FETCHER, type = Constants.PATIPENTRIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATICROUTES_FETCHER, type = Constants.STATICROUTES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VPNCONNECTIONS_FETCHER, type = Constants.VPNCONNECTIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "sharednetworkresource", resourceName = "sharednetworkresources")
public class SharedNetworkResource extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DHCPManaged")
    protected Boolean DHCPManaged;
    
    @JsonProperty(value = "ECMPCount")
    protected Long ECMPCount;
    
    @JsonProperty(value = "accessRestrictionEnabled")
    protected Boolean accessRestrictionEnabled;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "associatedPATMapperID")
    protected String associatedPATMapperID;
    
    @JsonProperty(value = "backHaulRouteDistinguisher")
    protected String backHaulRouteDistinguisher;
    
    @JsonProperty(value = "backHaulRouteTarget")
    protected String backHaulRouteTarget;
    
    @JsonProperty(value = "backHaulVNID")
    protected Long backHaulVNID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "domainRouteDistinguisher")
    protected String domainRouteDistinguisher;
    
    @JsonProperty(value = "domainRouteTarget")
    protected String domainRouteTarget;
    
    @JsonProperty(value = "dynamicPATAllocationEnabled")
    protected Boolean dynamicPATAllocationEnabled;
    
    @JsonProperty(value = "entityScope")
    protected SharedNetworkResourceEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "gatewayMACAddress")
    protected String gatewayMACAddress;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "permittedActionType")
    protected SharedNetworkResourcePermittedActionType permittedActionType;
    
    @JsonProperty(value = "sharedResourceParentID")
    protected String sharedResourceParentID;
    
    @JsonProperty(value = "type")
    protected SharedNetworkResourceType type;
    
    @JsonProperty(value = "underlay")
    protected Boolean underlay;
    
    @JsonProperty(value = "uplinkGWVlanAttachmentID")
    protected String uplinkGWVlanAttachmentID;
    
    @JsonProperty(value = "uplinkInterfaceIP")
    protected String uplinkInterfaceIP;
    
    @JsonProperty(value = "uplinkInterfaceMAC")
    protected String uplinkInterfaceMAC;
    
    @JsonProperty(value = "uplinkVPortName")
    protected String uplinkVPortName;
    
    @JsonProperty(value = "useGlobalMAC")
    protected SharedNetworkResourceUseGlobalMAC useGlobalMAC;
    
    @JsonProperty(value = "vnID")
    protected Long vnID;
    
    @JsonIgnore
    private AddressRangesFetcher addressRanges;
    
    @JsonIgnore
    private DHCPOptionsFetcher dHCPOptions;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PATIPEntriesFetcher pATIPEntries;
    
    @JsonIgnore
    private StaticRoutesFetcher staticRoutes;
    
    @JsonIgnore
    private VPNConnectionsFetcher vPNConnections;
    
    @VsoConstructor
    public SharedNetworkResource() {
        type = SharedNetworkResourceType.PUBLIC;
        
        DHCPManaged = true;
        
        addressRanges = new AddressRangesFetcher(this);
        
        dHCPOptions = new DHCPOptionsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        pATIPEntries = new PATIPEntriesFetcher(this);
        
        staticRoutes = new StaticRoutesFetcher(this);
        
        vPNConnections = new VPNConnectionsFetcher(this);
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
    @VsoProperty(displayName = "ECMPCount", readOnly = false)   
    public Long getECMPCount() {
       return ECMPCount;
    }

    @JsonIgnore
    public void setECMPCount(Long value) { 
        this.ECMPCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AccessRestrictionEnabled", readOnly = false)   
    public Boolean getAccessRestrictionEnabled() {
       return accessRestrictionEnabled;
    }

    @JsonIgnore
    public void setAccessRestrictionEnabled(Boolean value) { 
        this.accessRestrictionEnabled = value;
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
    @VsoProperty(displayName = "AssociatedPATMapperID", readOnly = false)   
    public String getAssociatedPATMapperID() {
       return associatedPATMapperID;
    }

    @JsonIgnore
    public void setAssociatedPATMapperID(String value) { 
        this.associatedPATMapperID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulRouteDistinguisher", readOnly = false)   
    public String getBackHaulRouteDistinguisher() {
       return backHaulRouteDistinguisher;
    }

    @JsonIgnore
    public void setBackHaulRouteDistinguisher(String value) { 
        this.backHaulRouteDistinguisher = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulRouteTarget", readOnly = false)   
    public String getBackHaulRouteTarget() {
       return backHaulRouteTarget;
    }

    @JsonIgnore
    public void setBackHaulRouteTarget(String value) { 
        this.backHaulRouteTarget = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BackHaulVNID", readOnly = false)   
    public Long getBackHaulVNID() {
       return backHaulVNID;
    }

    @JsonIgnore
    public void setBackHaulVNID(Long value) { 
        this.backHaulVNID = value;
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
    @VsoProperty(displayName = "DomainRouteDistinguisher", readOnly = false)   
    public String getDomainRouteDistinguisher() {
       return domainRouteDistinguisher;
    }

    @JsonIgnore
    public void setDomainRouteDistinguisher(String value) { 
        this.domainRouteDistinguisher = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainRouteTarget", readOnly = false)   
    public String getDomainRouteTarget() {
       return domainRouteTarget;
    }

    @JsonIgnore
    public void setDomainRouteTarget(String value) { 
        this.domainRouteTarget = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DynamicPATAllocationEnabled", readOnly = false)   
    public Boolean getDynamicPATAllocationEnabled() {
       return dynamicPATAllocationEnabled;
    }

    @JsonIgnore
    public void setDynamicPATAllocationEnabled(Boolean value) { 
        this.dynamicPATAllocationEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public SharedNetworkResourceEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(SharedNetworkResourceEntityScope value) { 
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
    @VsoProperty(displayName = "PermittedActionType", readOnly = false)   
    public SharedNetworkResourcePermittedActionType getPermittedActionType() {
       return permittedActionType;
    }

    @JsonIgnore
    public void setPermittedActionType(SharedNetworkResourcePermittedActionType value) { 
        this.permittedActionType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SharedResourceParentID", readOnly = false)   
    public String getSharedResourceParentID() {
       return sharedResourceParentID;
    }

    @JsonIgnore
    public void setSharedResourceParentID(String value) { 
        this.sharedResourceParentID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public SharedNetworkResourceType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(SharedNetworkResourceType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Underlay", readOnly = false)   
    public Boolean getUnderlay() {
       return underlay;
    }

    @JsonIgnore
    public void setUnderlay(Boolean value) { 
        this.underlay = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkGWVlanAttachmentID", readOnly = false)   
    public String getUplinkGWVlanAttachmentID() {
       return uplinkGWVlanAttachmentID;
    }

    @JsonIgnore
    public void setUplinkGWVlanAttachmentID(String value) { 
        this.uplinkGWVlanAttachmentID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkInterfaceIP", readOnly = false)   
    public String getUplinkInterfaceIP() {
       return uplinkInterfaceIP;
    }

    @JsonIgnore
    public void setUplinkInterfaceIP(String value) { 
        this.uplinkInterfaceIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkInterfaceMAC", readOnly = false)   
    public String getUplinkInterfaceMAC() {
       return uplinkInterfaceMAC;
    }

    @JsonIgnore
    public void setUplinkInterfaceMAC(String value) { 
        this.uplinkInterfaceMAC = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkVPortName", readOnly = false)   
    public String getUplinkVPortName() {
       return uplinkVPortName;
    }

    @JsonIgnore
    public void setUplinkVPortName(String value) { 
        this.uplinkVPortName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseGlobalMAC", readOnly = false)   
    public SharedNetworkResourceUseGlobalMAC getUseGlobalMAC() {
       return useGlobalMAC;
    }

    @JsonIgnore
    public void setUseGlobalMAC(SharedNetworkResourceUseGlobalMAC value) { 
        this.useGlobalMAC = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VnID", readOnly = false)   
    public Long getVnID() {
       return vnID;
    }

    @JsonIgnore
    public void setVnID(Long value) { 
        this.vnID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressRanges", readOnly = true)   
    public AddressRangesFetcher getAddressRanges() {
        return addressRanges;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPOptions", readOnly = true)   
    public DHCPOptionsFetcher getDHCPOptions() {
        return dHCPOptions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterprisePermissions", readOnly = true)   
    public EnterprisePermissionsFetcher getEnterprisePermissions() {
        return enterprisePermissions;
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
    @VsoProperty(displayName = "PATIPEntries", readOnly = true)   
    public PATIPEntriesFetcher getPATIPEntries() {
        return pATIPEntries;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StaticRoutes", readOnly = true)   
    public StaticRoutesFetcher getStaticRoutes() {
        return staticRoutes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPNConnections", readOnly = true)   
    public VPNConnectionsFetcher getVPNConnections() {
        return vPNConnections;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.SHAREDNETWORKRESOURCE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.SHAREDNETWORKRESOURCE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SHAREDNETWORKRESOURCE, getId());
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
    public void createDHCPOption(Session session, DHCPOption childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DHCPOPTIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEnterprisePermission(Session session, EnterprisePermission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISEPERMISSIONS_FETCHER, getId());
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
    public void createPATIPEntry(Session session, PATIPEntry childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PATIPENTRIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createStaticRoute(Session session, StaticRoute childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.STATICROUTES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVPNConnection(Session session, VPNConnection childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VPNCONNECTIONS_FETCHER, getId());
        }
    }public String toString() {
        return "SharedNetworkResource [" + "DHCPManaged=" + DHCPManaged + ", ECMPCount=" + ECMPCount + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", associatedPATMapperID=" + associatedPATMapperID + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulVNID=" + backHaulVNID + ", description=" + description + ", domainRouteDistinguisher=" + domainRouteDistinguisher + ", domainRouteTarget=" + domainRouteTarget + ", dynamicPATAllocationEnabled=" + dynamicPATAllocationEnabled + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", netmask=" + netmask + ", permittedActionType=" + permittedActionType + ", sharedResourceParentID=" + sharedResourceParentID + ", type=" + type + ", underlay=" + underlay + ", uplinkGWVlanAttachmentID=" + uplinkGWVlanAttachmentID + ", uplinkInterfaceIP=" + uplinkInterfaceIP + ", uplinkInterfaceMAC=" + uplinkInterfaceMAC + ", uplinkVPortName=" + uplinkVPortName + ", useGlobalMAC=" + useGlobalMAC + ", vnID=" + vnID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}