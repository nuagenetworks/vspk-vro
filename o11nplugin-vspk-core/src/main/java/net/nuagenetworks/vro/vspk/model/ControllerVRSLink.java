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

import net.nuagenetworks.vro.vspk.model.fetchers.HSCsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VSCsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkJSONRPCConnectionState;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkVRSPersonality;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkVSCConfigState;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkVSCCurrentState;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkClusterNodeRole;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkControllerType;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkRole;

import net.nuagenetworks.vro.vspk.model.enums.ControllerVRSLinkStatus;
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

@VsoFinder(name = Constants.CONTROLLERVRSLINK, datasource = Constants.DATASOURCE, image = Constants.CONTROLLERVRSLINK_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "controllervrslink", resourceName = "controllervrslinks")
public class ControllerVRSLink extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "JSONRPCConnectionState")
    protected ControllerVRSLinkJSONRPCConnectionState JSONRPCConnectionState;
    
    @JsonProperty(value = "VRSID")
    protected String VRSID;
    
    @JsonProperty(value = "VRSPersonality")
    protected ControllerVRSLinkVRSPersonality VRSPersonality;
    
    @JsonProperty(value = "VRSSystemId")
    protected String VRSSystemId;
    
    @JsonProperty(value = "VSCConfigState")
    protected ControllerVRSLinkVSCConfigState VSCConfigState;
    
    @JsonProperty(value = "VSCCurrentState")
    protected ControllerVRSLinkVSCCurrentState VSCCurrentState;
    
    @JsonProperty(value = "clusterNodeRole")
    protected ControllerVRSLinkClusterNodeRole clusterNodeRole;
    
    @JsonProperty(value = "connections")
    protected java.util.List<String> connections;
    
    @JsonProperty(value = "controllerID")
    protected String controllerID;
    
    @JsonProperty(value = "controllerType")
    protected ControllerVRSLinkControllerType controllerType;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "dynamic")
    protected Boolean dynamic;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected ControllerVRSLinkEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "peer")
    protected String peer;
    
    @JsonProperty(value = "role")
    protected ControllerVRSLinkRole role;
    
    @JsonProperty(value = "status")
    protected ControllerVRSLinkStatus status;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private HSCsFetcher hSCs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private VRSsFetcher vRSs;
    
    @JsonIgnore
    private VSCsFetcher vSCs;
    
    @VsoConstructor
    public ControllerVRSLink() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        hSCs = new HSCsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        vRSs = new VRSsFetcher(this);
        
        vSCs = new VSCsFetcher(this);
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
    @VsoProperty(displayName = "JSONRPCConnectionState", readOnly = false)   
    public ControllerVRSLinkJSONRPCConnectionState getJSONRPCConnectionState() {
       return JSONRPCConnectionState;
    }

    @JsonIgnore
    public void setJSONRPCConnectionState(ControllerVRSLinkJSONRPCConnectionState value) { 
        this.JSONRPCConnectionState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSID", readOnly = false)   
    public String getVRSID() {
       return VRSID;
    }

    @JsonIgnore
    public void setVRSID(String value) { 
        this.VRSID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSPersonality", readOnly = false)   
    public ControllerVRSLinkVRSPersonality getVRSPersonality() {
       return VRSPersonality;
    }

    @JsonIgnore
    public void setVRSPersonality(ControllerVRSLinkVRSPersonality value) { 
        this.VRSPersonality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSSystemId", readOnly = false)   
    public String getVRSSystemId() {
       return VRSSystemId;
    }

    @JsonIgnore
    public void setVRSSystemId(String value) { 
        this.VRSSystemId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSCConfigState", readOnly = false)   
    public ControllerVRSLinkVSCConfigState getVSCConfigState() {
       return VSCConfigState;
    }

    @JsonIgnore
    public void setVSCConfigState(ControllerVRSLinkVSCConfigState value) { 
        this.VSCConfigState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSCCurrentState", readOnly = false)   
    public ControllerVRSLinkVSCCurrentState getVSCCurrentState() {
       return VSCCurrentState;
    }

    @JsonIgnore
    public void setVSCCurrentState(ControllerVRSLinkVSCCurrentState value) { 
        this.VSCCurrentState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ClusterNodeRole", readOnly = false)   
    public ControllerVRSLinkClusterNodeRole getClusterNodeRole() {
       return clusterNodeRole;
    }

    @JsonIgnore
    public void setClusterNodeRole(ControllerVRSLinkClusterNodeRole value) { 
        this.clusterNodeRole = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Connections", readOnly = false)   
    public java.util.List<String> getConnections() {
       return connections;
    }

    @JsonIgnore
    public void setConnections(java.util.List<String> value) { 
        this.connections = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControllerID", readOnly = false)   
    public String getControllerID() {
       return controllerID;
    }

    @JsonIgnore
    public void setControllerID(String value) { 
        this.controllerID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ControllerType", readOnly = false)   
    public ControllerVRSLinkControllerType getControllerType() {
       return controllerType;
    }

    @JsonIgnore
    public void setControllerType(ControllerVRSLinkControllerType value) { 
        this.controllerType = value;
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
    @VsoProperty(displayName = "Dynamic", readOnly = false)   
    public Boolean getDynamic() {
       return dynamic;
    }

    @JsonIgnore
    public void setDynamic(Boolean value) { 
        this.dynamic = value;
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
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public ControllerVRSLinkEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(ControllerVRSLinkEntityScope value) { 
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
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
    @VsoProperty(displayName = "Peer", readOnly = false)   
    public String getPeer() {
       return peer;
    }

    @JsonIgnore
    public void setPeer(String value) { 
        this.peer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Role", readOnly = false)   
    public ControllerVRSLinkRole getRole() {
       return role;
    }

    @JsonIgnore
    public void setRole(ControllerVRSLinkRole value) { 
        this.role = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public ControllerVRSLinkStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(ControllerVRSLinkStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HSCs", readOnly = true)   
    public HSCsFetcher getHSCs() {
        return hSCs;
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
    @VsoProperty(displayName = "VRSs", readOnly = true)   
    public VRSsFetcher getVRSs() {
        return vRSs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSCs", readOnly = true)   
    public VSCsFetcher getVSCs() {
        return vSCs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.CONTROLLERVRSLINK, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.CONTROLLERVRSLINK, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.CONTROLLERVRSLINK, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.CONTROLLERVRSLINK, getId());
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
        return "ControllerVRSLink [" + "JSONRPCConnectionState=" + JSONRPCConnectionState + ", VRSID=" + VRSID + ", VRSPersonality=" + VRSPersonality + ", VRSSystemId=" + VRSSystemId + ", VSCConfigState=" + VSCConfigState + ", VSCCurrentState=" + VSCCurrentState + ", clusterNodeRole=" + clusterNodeRole + ", connections=" + connections + ", controllerID=" + controllerID + ", controllerType=" + controllerType + ", creationDate=" + creationDate + ", dynamic=" + dynamic + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", name=" + name + ", owner=" + owner + ", peer=" + peer + ", role=" + role + ", status=" + status + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}