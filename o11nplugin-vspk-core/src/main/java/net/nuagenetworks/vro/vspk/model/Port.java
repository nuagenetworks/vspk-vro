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

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VLANsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.PortEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.PortOperationalState;

import net.nuagenetworks.vro.vspk.model.enums.PortPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.PortPortType;

import net.nuagenetworks.vro.vspk.model.enums.PortStatus;
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

@VsoFinder(name = Constants.PORT, datasource = Constants.DATASOURCE, image = Constants.PORT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.VLANS_FETCHER, type = Constants.VLANS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "port", resourceName = "ports")
public class Port extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "VLANRange")
    protected String VLANRange;
    
    @JsonProperty(value = "associatedEgressQOSPolicyID")
    protected String associatedEgressQOSPolicyID;
    
    @JsonProperty(value = "associatedEthernetSegmentGroupID")
    protected String associatedEthernetSegmentGroupID;
    
    @JsonProperty(value = "associatedEthernetSegmentID")
    protected String associatedEthernetSegmentID;
    
    @JsonProperty(value = "associatedEthernetSegmentVLANRange")
    protected String associatedEthernetSegmentVLANRange;
    
    @JsonProperty(value = "associatedEthernetSegmentVirtual")
    protected Boolean associatedEthernetSegmentVirtual;
    
    @JsonProperty(value = "associatedRedundantPortID")
    protected String associatedRedundantPortID;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected PortEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "isResilient")
    protected Boolean isResilient;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "nativeVLAN")
    protected String nativeVLAN;
    
    @JsonProperty(value = "operationalState")
    protected PortOperationalState operationalState;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "permittedAction")
    protected PortPermittedAction permittedAction;
    
    @JsonProperty(value = "physicalName")
    protected String physicalName;
    
    @JsonProperty(value = "portType")
    protected PortPortType portType;
    
    @JsonProperty(value = "routed")
    protected Boolean routed;
    
    @JsonProperty(value = "status")
    protected PortStatus status;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "useUserMnemonic")
    protected Boolean useUserMnemonic;
    
    @JsonProperty(value = "userMnemonic")
    protected String userMnemonic;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private VLANsFetcher vLANs;
    
    @VsoConstructor
    public Port() {
        alarms = new AlarmsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        vLANs = new VLANsFetcher(this);
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
    @JsonIgnore
    @VsoProperty(displayName = "VLANRange", readOnly = false)   
    public String getVLANRange() {
       return VLANRange;
    }

    @JsonIgnore
    public void setVLANRange(String value) { 
        this.VLANRange = value;
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
    @VsoProperty(displayName = "AssociatedEthernetSegmentGroupID", readOnly = false)   
    public String getAssociatedEthernetSegmentGroupID() {
       return associatedEthernetSegmentGroupID;
    }

    @JsonIgnore
    public void setAssociatedEthernetSegmentGroupID(String value) { 
        this.associatedEthernetSegmentGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEthernetSegmentID", readOnly = false)   
    public String getAssociatedEthernetSegmentID() {
       return associatedEthernetSegmentID;
    }

    @JsonIgnore
    public void setAssociatedEthernetSegmentID(String value) { 
        this.associatedEthernetSegmentID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEthernetSegmentVLANRange", readOnly = false)   
    public String getAssociatedEthernetSegmentVLANRange() {
       return associatedEthernetSegmentVLANRange;
    }

    @JsonIgnore
    public void setAssociatedEthernetSegmentVLANRange(String value) { 
        this.associatedEthernetSegmentVLANRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEthernetSegmentVirtual", readOnly = false)   
    public Boolean getAssociatedEthernetSegmentVirtual() {
       return associatedEthernetSegmentVirtual;
    }

    @JsonIgnore
    public void setAssociatedEthernetSegmentVirtual(Boolean value) { 
        this.associatedEthernetSegmentVirtual = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedRedundantPortID", readOnly = false)   
    public String getAssociatedRedundantPortID() {
       return associatedRedundantPortID;
    }

    @JsonIgnore
    public void setAssociatedRedundantPortID(String value) { 
        this.associatedRedundantPortID = value;
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
    public PortEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(PortEntityScope value) { 
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
    @VsoProperty(displayName = "IsResilient", readOnly = false)   
    public Boolean getIsResilient() {
       return isResilient;
    }

    @JsonIgnore
    public void setIsResilient(Boolean value) { 
        this.isResilient = value;
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
    @VsoProperty(displayName = "NativeVLAN", readOnly = false)   
    public String getNativeVLAN() {
       return nativeVLAN;
    }

    @JsonIgnore
    public void setNativeVLAN(String value) { 
        this.nativeVLAN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OperationalState", readOnly = false)   
    public PortOperationalState getOperationalState() {
       return operationalState;
    }

    @JsonIgnore
    public void setOperationalState(PortOperationalState value) { 
        this.operationalState = value;
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
    public PortPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(PortPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PhysicalName", readOnly = false)   
    public String getPhysicalName() {
       return physicalName;
    }

    @JsonIgnore
    public void setPhysicalName(String value) { 
        this.physicalName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PortType", readOnly = false)   
    public PortPortType getPortType() {
       return portType;
    }

    @JsonIgnore
    public void setPortType(PortPortType value) { 
        this.portType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Routed", readOnly = false)   
    public Boolean getRouted() {
       return routed;
    }

    @JsonIgnore
    public void setRouted(Boolean value) { 
        this.routed = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public PortStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(PortStatus value) { 
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
    @VsoProperty(displayName = "VLANs", readOnly = true)   
    public VLANsFetcher getVLANs() {
        return vLANs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.PORT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.PORT, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.PORT, getId());
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
    public void createVLAN(Session session, VLAN childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VLANS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiateVLAN(Session session, VLAN childRestObj, VLANTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.VLANS_FETCHER, getId());
        }
    }
    public String toString() {
        return "Port [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedEthernetSegmentGroupID=" + associatedEthernetSegmentGroupID + ", associatedEthernetSegmentID=" + associatedEthernetSegmentID + ", associatedEthernetSegmentVLANRange=" + associatedEthernetSegmentVLANRange + ", associatedEthernetSegmentVirtual=" + associatedEthernetSegmentVirtual + ", associatedRedundantPortID=" + associatedRedundantPortID + ", creationDate=" + creationDate + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", isResilient=" + isResilient + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", name=" + name + ", nativeVLAN=" + nativeVLAN + ", operationalState=" + operationalState + ", owner=" + owner + ", permittedAction=" + permittedAction + ", physicalName=" + physicalName + ", portType=" + portType + ", routed=" + routed + ", status=" + status + ", templateID=" + templateID + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}