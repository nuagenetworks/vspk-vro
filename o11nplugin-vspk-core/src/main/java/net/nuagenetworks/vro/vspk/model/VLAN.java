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

import net.nuagenetworks.vro.vspk.model.fetchers.BGPNeighborsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BRConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewayConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LtestatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UplinkConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VLANAssociatedConnectionType;

import net.nuagenetworks.vro.vspk.model.enums.VLANEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.VLANPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.VLANStatus;

import net.nuagenetworks.vro.vspk.model.enums.VLANType;
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

@VsoFinder(name = Constants.VLAN, datasource = Constants.DATASOURCE, image = Constants.VLAN_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.BGPNEIGHBORS_FETCHER, type = Constants.BGPNEIGHBORS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.BRCONNECTIONS_FETCHER, type = Constants.BRCONNECTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.IKEGATEWAYCONNECTIONS_FETCHER, type = Constants.IKEGATEWAYCONNECTIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.UPLINKCONNECTIONS_FETCHER, type = Constants.UPLINKCONNECTIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vlan", resourceName = "vlans")
public class VLAN extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "TrafficThroughUBROnly")
    protected Boolean TrafficThroughUBROnly;
    
    @JsonProperty(value = "associatedBGPProfileID")
    protected String associatedBGPProfileID;
    
    @JsonProperty(value = "associatedConnectionType")
    protected VLANAssociatedConnectionType associatedConnectionType;
    
    @JsonProperty(value = "associatedEgressQOSPolicyID")
    protected String associatedEgressQOSPolicyID;
    
    @JsonProperty(value = "associatedIngressOverlayQoSPolicerID")
    protected String associatedIngressOverlayQoSPolicerID;
    
    @JsonProperty(value = "associatedIngressQOSPolicyID")
    protected String associatedIngressQOSPolicyID;
    
    @JsonProperty(value = "associatedIngressUnderlayQoSPolicerID")
    protected String associatedIngressUnderlayQoSPolicerID;
    
    @JsonProperty(value = "associatedUplinkConnectionID")
    protected String associatedUplinkConnectionID;
    
    @JsonProperty(value = "associatedVSCProfileID")
    protected String associatedVSCProfileID;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "ducVlan")
    protected Boolean ducVlan;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enableNATProbes")
    protected Boolean enableNATProbes;
    
    @JsonProperty(value = "entityScope")
    protected VLANEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gatewayID")
    protected String gatewayID;
    
    @JsonProperty(value = "inheritedPortPropertiesDiverged")
    protected Boolean inheritedPortPropertiesDiverged;
    
    @JsonProperty(value = "isUplink")
    protected Boolean isUplink;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "mtu")
    protected Long mtu;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "permittedAction")
    protected VLANPermittedAction permittedAction;
    
    @JsonProperty(value = "readonly")
    protected Boolean readonly;
    
    @JsonProperty(value = "restricted")
    protected Boolean restricted;
    
    @JsonProperty(value = "shuntVLAN")
    protected Boolean shuntVLAN;
    
    @JsonProperty(value = "status")
    protected VLANStatus status;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "type")
    protected VLANType type;
    
    @JsonProperty(value = "useUserMnemonic")
    protected Boolean useUserMnemonic;
    
    @JsonProperty(value = "userMnemonic")
    protected String userMnemonic;
    
    @JsonProperty(value = "value")
    protected Long value;
    
    @JsonProperty(value = "vportID")
    protected String vportID;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private BGPNeighborsFetcher bGPNeighbors;
    
    @JsonIgnore
    private BRConnectionsFetcher bRConnections;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private IKEGatewayConnectionsFetcher iKEGatewayConnections;
    
    @JsonIgnore
    private LtestatisticsFetcher ltestatistics;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private UplinkConnectionsFetcher uplinkConnections;
    
    @VsoConstructor
    public VLAN() {
        alarms = new AlarmsFetcher(this);
        
        bGPNeighbors = new BGPNeighborsFetcher(this);
        
        bRConnections = new BRConnectionsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
        
        ltestatistics = new LtestatisticsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        uplinkConnections = new UplinkConnectionsFetcher(this);
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
    @VsoProperty(displayName = "TrafficThroughUBROnly", readOnly = false)   
    public Boolean getTrafficThroughUBROnly() {
       return TrafficThroughUBROnly;
    }

    @JsonIgnore
    public void setTrafficThroughUBROnly(Boolean value) { 
        this.TrafficThroughUBROnly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedBGPProfileID", readOnly = false)   
    public String getAssociatedBGPProfileID() {
       return associatedBGPProfileID;
    }

    @JsonIgnore
    public void setAssociatedBGPProfileID(String value) { 
        this.associatedBGPProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedConnectionType", readOnly = false)   
    public VLANAssociatedConnectionType getAssociatedConnectionType() {
       return associatedConnectionType;
    }

    @JsonIgnore
    public void setAssociatedConnectionType(VLANAssociatedConnectionType value) { 
        this.associatedConnectionType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEgressQOSPolicyID", readOnly = false)   
    public String getAssociatedEgressQOSPolicyID() {
       return associatedEgressQOSPolicyID;
    }

    @JsonIgnore
    public void setAssociatedEgressQOSPolicyID(String value) { 
        this.associatedEgressQOSPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressOverlayQoSPolicerID", readOnly = false)   
    public String getAssociatedIngressOverlayQoSPolicerID() {
       return associatedIngressOverlayQoSPolicerID;
    }

    @JsonIgnore
    public void setAssociatedIngressOverlayQoSPolicerID(String value) { 
        this.associatedIngressOverlayQoSPolicerID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressQOSPolicyID", readOnly = false)   
    public String getAssociatedIngressQOSPolicyID() {
       return associatedIngressQOSPolicyID;
    }

    @JsonIgnore
    public void setAssociatedIngressQOSPolicyID(String value) { 
        this.associatedIngressQOSPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressUnderlayQoSPolicerID", readOnly = false)   
    public String getAssociatedIngressUnderlayQoSPolicerID() {
       return associatedIngressUnderlayQoSPolicerID;
    }

    @JsonIgnore
    public void setAssociatedIngressUnderlayQoSPolicerID(String value) { 
        this.associatedIngressUnderlayQoSPolicerID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedUplinkConnectionID", readOnly = false)   
    public String getAssociatedUplinkConnectionID() {
       return associatedUplinkConnectionID;
    }

    @JsonIgnore
    public void setAssociatedUplinkConnectionID(String value) { 
        this.associatedUplinkConnectionID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVSCProfileID", readOnly = false)   
    public String getAssociatedVSCProfileID() {
       return associatedVSCProfileID;
    }

    @JsonIgnore
    public void setAssociatedVSCProfileID(String value) { 
        this.associatedVSCProfileID = value;
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
    @VsoProperty(displayName = "DucVlan", readOnly = false)   
    public Boolean getDucVlan() {
       return ducVlan;
    }

    @JsonIgnore
    public void setDucVlan(Boolean value) { 
        this.ducVlan = value;
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
    @VsoProperty(displayName = "EnableNATProbes", readOnly = false)   
    public Boolean getEnableNATProbes() {
       return enableNATProbes;
    }

    @JsonIgnore
    public void setEnableNATProbes(Boolean value) { 
        this.enableNATProbes = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VLANEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VLANEntityScope value) { 
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
    @VsoProperty(displayName = "GatewayID", readOnly = false)   
    public String getGatewayID() {
       return gatewayID;
    }

    @JsonIgnore
    public void setGatewayID(String value) { 
        this.gatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InheritedPortPropertiesDiverged", readOnly = false)   
    public Boolean getInheritedPortPropertiesDiverged() {
       return inheritedPortPropertiesDiverged;
    }

    @JsonIgnore
    public void setInheritedPortPropertiesDiverged(Boolean value) { 
        this.inheritedPortPropertiesDiverged = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IsUplink", readOnly = false)   
    public Boolean getIsUplink() {
       return isUplink;
    }

    @JsonIgnore
    public void setIsUplink(Boolean value) { 
        this.isUplink = value;
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
    @VsoProperty(displayName = "Mtu", readOnly = false)   
    public Long getMtu() {
       return mtu;
    }

    @JsonIgnore
    public void setMtu(Long value) { 
        this.mtu = value;
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
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public VLANPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(VLANPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Readonly", readOnly = false)   
    public Boolean getReadonly() {
       return readonly;
    }

    @JsonIgnore
    public void setReadonly(Boolean value) { 
        this.readonly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Restricted", readOnly = false)   
    public Boolean getRestricted() {
       return restricted;
    }

    @JsonIgnore
    public void setRestricted(Boolean value) { 
        this.restricted = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ShuntVLAN", readOnly = false)   
    public Boolean getShuntVLAN() {
       return shuntVLAN;
    }

    @JsonIgnore
    public void setShuntVLAN(Boolean value) { 
        this.shuntVLAN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public VLANStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(VLANStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TemplateID", readOnly = false)   
    public String getTemplateID() {
       return templateID;
    }

    @JsonIgnore
    public void setTemplateID(String value) { 
        this.templateID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public VLANType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(VLANType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseUserMnemonic", readOnly = false)   
    public Boolean getUseUserMnemonic() {
       return useUserMnemonic;
    }

    @JsonIgnore
    public void setUseUserMnemonic(Boolean value) { 
        this.useUserMnemonic = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserMnemonic", readOnly = false)   
    public String getUserMnemonic() {
       return userMnemonic;
    }

    @JsonIgnore
    public void setUserMnemonic(String value) { 
        this.userMnemonic = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Value", readOnly = false)   
    public Long getValue() {
       return value;
    }

    @JsonIgnore
    public void setValue(Long value) { 
        this.value = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VportID", readOnly = false)   
    public String getVportID() {
       return vportID;
    }

    @JsonIgnore
    public void setVportID(String value) { 
        this.vportID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPNeighbors", readOnly = true)   
    public BGPNeighborsFetcher getBGPNeighbors() {
        return bGPNeighbors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BRConnections", readOnly = true)   
    public BRConnectionsFetcher getBRConnections() {
        return bRConnections;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterprisePermissions", readOnly = true)   
    public EnterprisePermissionsFetcher getEnterprisePermissions() {
        return enterprisePermissions;
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
    @VsoProperty(displayName = "IKEGatewayConnections", readOnly = true)   
    public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
        return iKEGatewayConnections;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Ltestatistics", readOnly = true)   
    public LtestatisticsFetcher getLtestatistics() {
        return ltestatistics;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATNATPools", readOnly = true)   
    public PATNATPoolsFetcher getPATNATPools() {
        return pATNATPools;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Statistics", readOnly = true)   
    public StatisticsFetcher getStatistics() {
        return statistics;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkConnections", readOnly = true)   
    public UplinkConnectionsFetcher getUplinkConnections() {
        return uplinkConnections;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VLAN, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VLAN, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VLAN, getId());
        }
    }
    
    @VsoMethod
    public void assignPATNATPools(Session session, PATNATPool[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VLAN, getId());
        }
    }
    
    @VsoMethod
    public void assignUplinkConnections(Session session, UplinkConnection[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VLAN, getId());
        }
    }
    
    @VsoMethod
    public void createBGPNeighbor(Session session, BGPNeighbor childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BGPNEIGHBORS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createBRConnection(Session session, BRConnection childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BRCONNECTIONS_FETCHER, getId());
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
    public void createIKEGatewayConnection(Session session, IKEGatewayConnection childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.IKEGATEWAYCONNECTIONS_FETCHER, getId());
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
    public void createUplinkConnection(Session session, UplinkConnection childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.UPLINKCONNECTIONS_FETCHER, getId());
        }
    }public String toString() {
        return "VLAN [" + "TrafficThroughUBROnly=" + TrafficThroughUBROnly + ", associatedBGPProfileID=" + associatedBGPProfileID + ", associatedConnectionType=" + associatedConnectionType + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedIngressOverlayQoSPolicerID=" + associatedIngressOverlayQoSPolicerID + ", associatedIngressQOSPolicyID=" + associatedIngressQOSPolicyID + ", associatedIngressUnderlayQoSPolicerID=" + associatedIngressUnderlayQoSPolicerID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", creationDate=" + creationDate + ", description=" + description + ", ducVlan=" + ducVlan + ", embeddedMetadata=" + embeddedMetadata + ", enableNATProbes=" + enableNATProbes + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", inheritedPortPropertiesDiverged=" + inheritedPortPropertiesDiverged + ", isUplink=" + isUplink + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", mtu=" + mtu + ", owner=" + owner + ", permittedAction=" + permittedAction + ", readonly=" + readonly + ", restricted=" + restricted + ", shuntVLAN=" + shuntVLAN + ", status=" + status + ", templateID=" + templateID + ", type=" + type + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", value=" + value + ", vportID=" + vportID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}