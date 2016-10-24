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

import net.nuagenetworks.vro.vspk.model.fetchers.BGPPeersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MonitoringPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VRSsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.HSCEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.HSCStatus;

import net.nuagenetworks.vro.vspk.model.enums.HSCType;
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

@VsoFinder(name = Constants.HSC, datasource = Constants.DATASOURCE, image = Constants.HSC_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "hsc", resourceName = "hscs")
public class HSC extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "alreadyMarkedForUnavailable")
    protected Boolean alreadyMarkedForUnavailable;
    
    @JsonProperty(value = "averageCPUUsage")
    protected Float averageCPUUsage;
    
    @JsonProperty(value = "averageMemoryUsage")
    protected Float averageMemoryUsage;
    
    @JsonProperty(value = "currentCPUUsage")
    protected Float currentCPUUsage;
    
    @JsonProperty(value = "currentMemoryUsage")
    protected Float currentMemoryUsage;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "disks")
    protected java.util.List<DiskStat> disks;
    
    @JsonProperty(value = "entityScope")
    protected HSCEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastStateChange")
    protected Long lastStateChange;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "location")
    protected String location;
    
    @JsonProperty(value = "managementIP")
    protected String managementIP;
    
    @JsonProperty(value = "messages")
    protected java.util.List<String> messages;
    
    @JsonProperty(value = "model")
    protected String model;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "peakCPUUsage")
    protected Float peakCPUUsage;
    
    @JsonProperty(value = "peakMemoryUsage")
    protected Float peakMemoryUsage;
    
    @JsonProperty(value = "productVersion")
    protected String productVersion;
    
    @JsonProperty(value = "status")
    protected HSCStatus status;
    
    @JsonProperty(value = "type")
    protected HSCType type;
    
    @JsonProperty(value = "unavailableTimestamp")
    protected Long unavailableTimestamp;
    
    @JsonProperty(value = "vsds")
    protected java.util.List<String> vsds;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private BGPPeersFetcher bGPPeers;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MonitoringPortsFetcher monitoringPorts;
    
    @JsonIgnore
    private VRSsFetcher vRSs;
    
    @VsoConstructor
    public HSC() {
        alarms = new AlarmsFetcher(this);
        
        bGPPeers = new BGPPeersFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        monitoringPorts = new MonitoringPortsFetcher(this);
        
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
    @VsoProperty(displayName = "Address", readOnly = false)   
    public String getAddress() {
       return address;
    }

    @JsonIgnore
    public void setAddress(String value) { 
        this.address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AlreadyMarkedForUnavailable", readOnly = false)   
    public Boolean getAlreadyMarkedForUnavailable() {
       return alreadyMarkedForUnavailable;
    }

    @JsonIgnore
    public void setAlreadyMarkedForUnavailable(Boolean value) { 
        this.alreadyMarkedForUnavailable = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AverageCPUUsage", readOnly = false)   
    public Float getAverageCPUUsage() {
       return averageCPUUsage;
    }

    @JsonIgnore
    public void setAverageCPUUsage(Float value) { 
        this.averageCPUUsage = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AverageMemoryUsage", readOnly = false)   
    public Float getAverageMemoryUsage() {
       return averageMemoryUsage;
    }

    @JsonIgnore
    public void setAverageMemoryUsage(Float value) { 
        this.averageMemoryUsage = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CurrentCPUUsage", readOnly = false)   
    public Float getCurrentCPUUsage() {
       return currentCPUUsage;
    }

    @JsonIgnore
    public void setCurrentCPUUsage(Float value) { 
        this.currentCPUUsage = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CurrentMemoryUsage", readOnly = false)   
    public Float getCurrentMemoryUsage() {
       return currentMemoryUsage;
    }

    @JsonIgnore
    public void setCurrentMemoryUsage(Float value) { 
        this.currentMemoryUsage = value;
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
    @VsoProperty(displayName = "Disks", readOnly = false)   
    public java.util.List<DiskStat> getDisks() {
       return disks;
    }

    @JsonIgnore
    public void setDisks(java.util.List<DiskStat> value) { 
        this.disks = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public HSCEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(HSCEntityScope value) { 
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
    @VsoProperty(displayName = "LastStateChange", readOnly = false)   
    public Long getLastStateChange() {
       return lastStateChange;
    }

    @JsonIgnore
    public void setLastStateChange(Long value) { 
        this.lastStateChange = value;
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
    @VsoProperty(displayName = "Location", readOnly = false)   
    public String getLocation() {
       return location;
    }

    @JsonIgnore
    public void setLocation(String value) { 
        this.location = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ManagementIP", readOnly = false)   
    public String getManagementIP() {
       return managementIP;
    }

    @JsonIgnore
    public void setManagementIP(String value) { 
        this.managementIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Messages", readOnly = false)   
    public java.util.List<String> getMessages() {
       return messages;
    }

    @JsonIgnore
    public void setMessages(java.util.List<String> value) { 
        this.messages = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Model", readOnly = false)   
    public String getModel() {
       return model;
    }

    @JsonIgnore
    public void setModel(String value) { 
        this.model = value;
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
    @VsoProperty(displayName = "PeakCPUUsage", readOnly = false)   
    public Float getPeakCPUUsage() {
       return peakCPUUsage;
    }

    @JsonIgnore
    public void setPeakCPUUsage(Float value) { 
        this.peakCPUUsage = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeakMemoryUsage", readOnly = false)   
    public Float getPeakMemoryUsage() {
       return peakMemoryUsage;
    }

    @JsonIgnore
    public void setPeakMemoryUsage(Float value) { 
        this.peakMemoryUsage = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProductVersion", readOnly = false)   
    public String getProductVersion() {
       return productVersion;
    }

    @JsonIgnore
    public void setProductVersion(String value) { 
        this.productVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public HSCStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(HSCStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public HSCType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(HSCType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnavailableTimestamp", readOnly = false)   
    public Long getUnavailableTimestamp() {
       return unavailableTimestamp;
    }

    @JsonIgnore
    public void setUnavailableTimestamp(Long value) { 
        this.unavailableTimestamp = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vsds", readOnly = false)   
    public java.util.List<String> getVsds() {
       return vsds;
    }

    @JsonIgnore
    public void setVsds(java.util.List<String> value) { 
        this.vsds = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BGPPeers", readOnly = true)   
    public BGPPeersFetcher getBGPPeers() {
        return bGPPeers;
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
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MonitoringPorts", readOnly = true)   
    public MonitoringPortsFetcher getMonitoringPorts() {
        return monitoringPorts;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.HSC, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.HSC, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.HSC, getId());
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
    public void createJob(Session session, Job childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.JOBS_FETCHER, getId());
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
        return "HSC [" + "address=" + address + ", alreadyMarkedForUnavailable=" + alreadyMarkedForUnavailable + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", description=" + description + ", disks=" + disks + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", location=" + location + ", managementIP=" + managementIP + ", messages=" + messages + ", model=" + model + ", name=" + name + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", productVersion=" + productVersion + ", status=" + status + ", type=" + type + ", unavailableTimestamp=" + unavailableTimestamp + ", vsds=" + vsds + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}