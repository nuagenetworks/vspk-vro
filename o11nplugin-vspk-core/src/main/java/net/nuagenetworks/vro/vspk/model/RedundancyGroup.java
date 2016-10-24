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

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.WANServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VsgRedundantPortsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.RedundancyGroupEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.RedundancyGroupPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.RedundancyGroupPersonality;

import net.nuagenetworks.vro.vspk.model.enums.RedundancyGroupRedundantGatewayStatus;
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

@VsoFinder(name = Constants.REDUNDANCYGROUP, datasource = Constants.DATASOURCE, image = Constants.REDUNDANCYGROUP_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PORTS_FETCHER, type = Constants.PORTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.WANSERVICES_FETCHER, type = Constants.WANSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VSGREDUNDANTPORTS_FETCHER, type = Constants.VSGREDUNDANTPORTS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "redundancygroup", resourceName = "redundancygroups")
public class RedundancyGroup extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected RedundancyGroupEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gatewayPeer1AutodiscoveredGatewayID")
    protected String gatewayPeer1AutodiscoveredGatewayID;
    
    @JsonProperty(value = "gatewayPeer1ID")
    protected String gatewayPeer1ID;
    
    @JsonProperty(value = "gatewayPeer1Name")
    protected String gatewayPeer1Name;
    
    @JsonProperty(value = "gatewayPeer2AutodiscoveredGatewayID")
    protected String gatewayPeer2AutodiscoveredGatewayID;
    
    @JsonProperty(value = "gatewayPeer2ID")
    protected String gatewayPeer2ID;
    
    @JsonProperty(value = "gatewayPeer2Name")
    protected String gatewayPeer2Name;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "permittedAction")
    protected RedundancyGroupPermittedAction permittedAction;
    
    @JsonProperty(value = "personality")
    protected RedundancyGroupPersonality personality;
    
    @JsonProperty(value = "redundantGatewayStatus")
    protected RedundancyGroupRedundantGatewayStatus redundantGatewayStatus;
    
    @JsonProperty(value = "vtep")
    protected String vtep;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GatewaysFetcher gateways;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PortsFetcher ports;
    
    @JsonIgnore
    private WANServicesFetcher wANServices;
    
    @JsonIgnore
    private VsgRedundantPortsFetcher vsgRedundantPorts;
    
    @VsoConstructor
    public RedundancyGroup() {
        alarms = new AlarmsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        gateways = new GatewaysFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        ports = new PortsFetcher(this);
        
        wANServices = new WANServicesFetcher(this);
        
        vsgRedundantPorts = new VsgRedundantPortsFetcher(this);
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
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseID", readOnly = false)   
    public String getEnterpriseID() {
       return enterpriseID;
    }

    @JsonIgnore
    public void setEnterpriseID(String value) { 
        this.enterpriseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public RedundancyGroupEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(RedundancyGroupEntityScope value) { 
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
    @VsoProperty(displayName = "GatewayPeer1AutodiscoveredGatewayID", readOnly = false)   
    public String getGatewayPeer1AutodiscoveredGatewayID() {
       return gatewayPeer1AutodiscoveredGatewayID;
    }

    @JsonIgnore
    public void setGatewayPeer1AutodiscoveredGatewayID(String value) { 
        this.gatewayPeer1AutodiscoveredGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayPeer1ID", readOnly = false)   
    public String getGatewayPeer1ID() {
       return gatewayPeer1ID;
    }

    @JsonIgnore
    public void setGatewayPeer1ID(String value) { 
        this.gatewayPeer1ID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayPeer1Name", readOnly = false)   
    public String getGatewayPeer1Name() {
       return gatewayPeer1Name;
    }

    @JsonIgnore
    public void setGatewayPeer1Name(String value) { 
        this.gatewayPeer1Name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayPeer2AutodiscoveredGatewayID", readOnly = false)   
    public String getGatewayPeer2AutodiscoveredGatewayID() {
       return gatewayPeer2AutodiscoveredGatewayID;
    }

    @JsonIgnore
    public void setGatewayPeer2AutodiscoveredGatewayID(String value) { 
        this.gatewayPeer2AutodiscoveredGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayPeer2ID", readOnly = false)   
    public String getGatewayPeer2ID() {
       return gatewayPeer2ID;
    }

    @JsonIgnore
    public void setGatewayPeer2ID(String value) { 
        this.gatewayPeer2ID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayPeer2Name", readOnly = false)   
    public String getGatewayPeer2Name() {
       return gatewayPeer2Name;
    }

    @JsonIgnore
    public void setGatewayPeer2Name(String value) { 
        this.gatewayPeer2Name = value;
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
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public RedundancyGroupPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(RedundancyGroupPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public RedundancyGroupPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(RedundancyGroupPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedundantGatewayStatus", readOnly = false)   
    public RedundancyGroupRedundantGatewayStatus getRedundantGatewayStatus() {
       return redundantGatewayStatus;
    }

    @JsonIgnore
    public void setRedundantGatewayStatus(RedundancyGroupRedundantGatewayStatus value) { 
        this.redundantGatewayStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vtep", readOnly = false)   
    public String getVtep() {
       return vtep;
    }

    @JsonIgnore
    public void setVtep(String value) { 
        this.vtep = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
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
    @VsoProperty(displayName = "Gateways", readOnly = true)   
    public GatewaysFetcher getGateways() {
        return gateways;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "Ports", readOnly = true)   
    public PortsFetcher getPorts() {
        return ports;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WANServices", readOnly = true)   
    public WANServicesFetcher getWANServices() {
        return wANServices;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VsgRedundantPorts", readOnly = true)   
    public VsgRedundantPortsFetcher getVsgRedundantPorts() {
        return vsgRedundantPorts;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.REDUNDANCYGROUP, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.REDUNDANCYGROUP, getId());
        }
    }
    @VsoMethod
    public void assignGateways(Session session, Gateway[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.REDUNDANCYGROUP, getId());
        }
    }
    
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.REDUNDANCYGROUP, getId());
        }
    }
    
    @VsoMethod
    public void assignVsgRedundantPorts(Session session, VsgRedundantPort[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.REDUNDANCYGROUP, getId());
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
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPort(Session session, Port childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PORTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiatePort(Session session, Port childRestObj, PortTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PORTS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createWANService(Session session, WANService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.WANSERVICES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createVsgRedundantPort(Session session, VsgRedundantPort childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VSGREDUNDANTPORTS_FETCHER, getId());
        }
    }public String toString() {
        return "RedundancyGroup [" + "description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayPeer1AutodiscoveredGatewayID=" + gatewayPeer1AutodiscoveredGatewayID + ", gatewayPeer1ID=" + gatewayPeer1ID + ", gatewayPeer1Name=" + gatewayPeer1Name + ", gatewayPeer2AutodiscoveredGatewayID=" + gatewayPeer2AutodiscoveredGatewayID + ", gatewayPeer2ID=" + gatewayPeer2ID + ", gatewayPeer2Name=" + gatewayPeer2Name + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", personality=" + personality + ", redundantGatewayStatus=" + redundantGatewayStatus + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}