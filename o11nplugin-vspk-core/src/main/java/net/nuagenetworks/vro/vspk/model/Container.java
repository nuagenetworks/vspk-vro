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

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ContainerResyncsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.ContainerDeleteMode;

import net.nuagenetworks.vro.vspk.model.enums.ContainerEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.ContainerReasonType;

import net.nuagenetworks.vro.vspk.model.enums.ContainerStatus;
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

@VsoFinder(name = Constants.CONTAINER, datasource = Constants.DATASOURCE, image = Constants.CONTAINER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.CONTAINERINTERFACES_FETCHER, type = Constants.CONTAINERINTERFACES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CONTAINERRESYNCS_FETCHER, type = Constants.CONTAINERRESYNCS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "container", resourceName = "containers")
public class Container extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "VRSID")
    protected String VRSID;
    
    @JsonProperty(value = "deleteExpiry")
    protected Long deleteExpiry;
    
    @JsonProperty(value = "deleteMode")
    protected ContainerDeleteMode deleteMode;
    
    @JsonProperty(value = "domainIDs")
    protected java.util.List<String> domainIDs;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected ContainerEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "hypervisorIP")
    protected String hypervisorIP;
    
    @JsonProperty(value = "imageID")
    protected String imageID;
    
    @JsonProperty(value = "imageName")
    protected String imageName;
    
    @JsonProperty(value = "interfaces")
    protected java.util.List<com.fasterxml.jackson.databind.JsonNode> interfaces;
    
    @JsonProperty(value = "l2DomainIDs")
    protected java.util.List<String> l2DomainIDs;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "orchestrationID")
    protected String orchestrationID;
    
    @JsonProperty(value = "reasonType")
    protected ContainerReasonType reasonType;
    
    @JsonProperty(value = "resyncInfo")
    protected Object resyncInfo;
    
    @JsonProperty(value = "siteIdentifier")
    protected String siteIdentifier;
    
    @JsonProperty(value = "status")
    protected ContainerStatus status;
    
    @JsonProperty(value = "subnetIDs")
    protected java.util.List<String> subnetIDs;
    
    @JsonProperty(value = "userID")
    protected String userID;
    
    @JsonProperty(value = "userName")
    protected String userName;
    
    @JsonProperty(value = "zoneIDs")
    protected java.util.List<String> zoneIDs;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private ContainerInterfacesFetcher containerInterfaces;
    
    @JsonIgnore
    private ContainerResyncsFetcher containerResyncs;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private VRSsFetcher vRSs;
    
    @VsoConstructor
    public Container() {
        alarms = new AlarmsFetcher(this);
        
        containerInterfaces = new ContainerInterfacesFetcher(this);
        
        containerResyncs = new ContainerResyncsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        vRSs = new VRSsFetcher(this);
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
    @VsoProperty(displayName = "UUID", readOnly = false)   
    public String getUUID() {
       return UUID;
    }

    @JsonIgnore
    public void setUUID(String value) { 
        this.UUID = value;
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
    @VsoProperty(displayName = "DeleteExpiry", readOnly = false)   
    public Long getDeleteExpiry() {
       return deleteExpiry;
    }

    @JsonIgnore
    public void setDeleteExpiry(Long value) { 
        this.deleteExpiry = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeleteMode", readOnly = false)   
    public ContainerDeleteMode getDeleteMode() {
       return deleteMode;
    }

    @JsonIgnore
    public void setDeleteMode(ContainerDeleteMode value) { 
        this.deleteMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainIDs", readOnly = false)   
    public java.util.List<String> getDomainIDs() {
       return domainIDs;
    }

    @JsonIgnore
    public void setDomainIDs(java.util.List<String> value) { 
        this.domainIDs = value;
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
    public ContainerEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(ContainerEntityScope value) { 
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
    @VsoProperty(displayName = "HypervisorIP", readOnly = false)   
    public String getHypervisorIP() {
       return hypervisorIP;
    }

    @JsonIgnore
    public void setHypervisorIP(String value) { 
        this.hypervisorIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ImageID", readOnly = false)   
    public String getImageID() {
       return imageID;
    }

    @JsonIgnore
    public void setImageID(String value) { 
        this.imageID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ImageName", readOnly = false)   
    public String getImageName() {
       return imageName;
    }

    @JsonIgnore
    public void setImageName(String value) { 
        this.imageName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Interfaces", readOnly = false)   
    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getInterfaces() {
       return interfaces;
    }

    @JsonIgnore
    public void setInterfaces(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
        this.interfaces = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2DomainIDs", readOnly = false)   
    public java.util.List<String> getL2DomainIDs() {
       return l2DomainIDs;
    }

    @JsonIgnore
    public void setL2DomainIDs(java.util.List<String> value) { 
        this.l2DomainIDs = value;
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
    @VsoProperty(displayName = "OrchestrationID", readOnly = false)   
    public String getOrchestrationID() {
       return orchestrationID;
    }

    @JsonIgnore
    public void setOrchestrationID(String value) { 
        this.orchestrationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ReasonType", readOnly = false)   
    public ContainerReasonType getReasonType() {
       return reasonType;
    }

    @JsonIgnore
    public void setReasonType(ContainerReasonType value) { 
        this.reasonType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ResyncInfo", readOnly = false)   
    public Object getResyncInfo() {
       return resyncInfo;
    }

    @JsonIgnore
    public void setResyncInfo(Object value) { 
        this.resyncInfo = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SiteIdentifier", readOnly = false)   
    public String getSiteIdentifier() {
       return siteIdentifier;
    }

    @JsonIgnore
    public void setSiteIdentifier(String value) { 
        this.siteIdentifier = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public ContainerStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(ContainerStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubnetIDs", readOnly = false)   
    public java.util.List<String> getSubnetIDs() {
       return subnetIDs;
    }

    @JsonIgnore
    public void setSubnetIDs(java.util.List<String> value) { 
        this.subnetIDs = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserID", readOnly = false)   
    public String getUserID() {
       return userID;
    }

    @JsonIgnore
    public void setUserID(String value) { 
        this.userID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserName", readOnly = false)   
    public String getUserName() {
       return userName;
    }

    @JsonIgnore
    public void setUserName(String value) { 
        this.userName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZoneIDs", readOnly = false)   
    public java.util.List<String> getZoneIDs() {
       return zoneIDs;
    }

    @JsonIgnore
    public void setZoneIDs(java.util.List<String> value) { 
        this.zoneIDs = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ContainerInterfaces", readOnly = true)   
    public ContainerInterfacesFetcher getContainerInterfaces() {
        return containerInterfaces;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ContainerResyncs", readOnly = true)   
    public ContainerResyncsFetcher getContainerResyncs() {
        return containerResyncs;
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
    @VsoProperty(displayName = "VRSs", readOnly = true)   
    public VRSsFetcher getVRSs() {
        return vRSs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.CONTAINER, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.CONTAINER, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.CONTAINER, getId());
        }
    }
    
    @VsoMethod
    public void createContainerInterface(Session session, ContainerInterface childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CONTAINERINTERFACES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createContainerResync(Session session, ContainerResync childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CONTAINERRESYNCS_FETCHER, getId());
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
        return "Container [" + "UUID=" + UUID + ", VRSID=" + VRSID + ", deleteExpiry=" + deleteExpiry + ", deleteMode=" + deleteMode + ", domainIDs=" + domainIDs + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hypervisorIP=" + hypervisorIP + ", imageID=" + imageID + ", imageName=" + imageName + ", interfaces=" + interfaces + ", l2DomainIDs=" + l2DomainIDs + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", orchestrationID=" + orchestrationID + ", reasonType=" + reasonType + ", resyncInfo=" + resyncInfo + ", siteIdentifier=" + siteIdentifier + ", status=" + status + ", subnetIDs=" + subnetIDs + ", userID=" + userID + ", userName=" + userName + ", zoneIDs=" + zoneIDs + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}