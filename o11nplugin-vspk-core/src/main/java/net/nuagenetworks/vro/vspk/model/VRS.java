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

import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.HSCsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MonitoringPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiNICVPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VPortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VSCsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VRSJSONRPCConnectionState;

import net.nuagenetworks.vro.vspk.model.enums.VRSClusterNodeRole;

import net.nuagenetworks.vro.vspk.model.enums.VRSEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.VRSHypervisorConnectionState;

import net.nuagenetworks.vro.vspk.model.enums.VRSLicensedState;

import net.nuagenetworks.vro.vspk.model.enums.VRSPersonality;

import net.nuagenetworks.vro.vspk.model.enums.VRSRole;

import net.nuagenetworks.vro.vspk.model.enums.VRSStatus;

import net.nuagenetworks.vro.vspk.model.enums.VRSVscConfigState;

import net.nuagenetworks.vro.vspk.model.enums.VRSVscCurrentState;
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

@VsoFinder(name = Constants.VRS, datasource = Constants.DATASOURCE, image = Constants.VRS_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrs", resourceName = "vrss")
public class VRS extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "JSONRPCConnectionState")
    protected VRSJSONRPCConnectionState JSONRPCConnectionState;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "averageCPUUsage")
    protected Float averageCPUUsage;
    
    @JsonProperty(value = "averageMemoryUsage")
    protected Float averageMemoryUsage;
    
    @JsonProperty(value = "clusterNodeRole")
    protected VRSClusterNodeRole clusterNodeRole;
    
    @JsonProperty(value = "currentCPUUsage")
    protected Float currentCPUUsage;
    
    @JsonProperty(value = "currentMemoryUsage")
    protected Float currentMemoryUsage;
    
    @JsonProperty(value = "dbSynced")
    protected Boolean dbSynced;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "disks")
    protected java.util.List<DiskStat> disks;
    
    @JsonProperty(value = "dynamic")
    protected Boolean dynamic;
    
    @JsonProperty(value = "entityScope")
    protected VRSEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "hypervisorConnectionState")
    protected VRSHypervisorConnectionState hypervisorConnectionState;
    
    @JsonProperty(value = "hypervisorIdentifier")
    protected String hypervisorIdentifier;
    
    @JsonProperty(value = "hypervisorName")
    protected String hypervisorName;
    
    @JsonProperty(value = "hypervisorType")
    protected String hypervisorType;
    
    @JsonProperty(value = "isResilient")
    protected Boolean isResilient;
    
    @JsonProperty(value = "lastEventName")
    protected String lastEventName;
    
    @JsonProperty(value = "lastEventObject")
    protected String lastEventObject;
    
    @JsonProperty(value = "lastEventTimestamp")
    protected Long lastEventTimestamp;
    
    @JsonProperty(value = "lastStateChange")
    protected Long lastStateChange;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "licensedState")
    protected VRSLicensedState licensedState;
    
    @JsonProperty(value = "location")
    protected String location;
    
    @JsonProperty(value = "managementIP")
    protected String managementIP;
    
    @JsonProperty(value = "messages")
    protected java.util.List<String> messages;
    
    @JsonProperty(value = "multiNICVPortEnabled")
    protected Boolean multiNICVPortEnabled;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "numberOfBridgeInterfaces")
    protected Long numberOfBridgeInterfaces;
    
    @JsonProperty(value = "numberOfContainers")
    protected Long numberOfContainers;
    
    @JsonProperty(value = "numberOfHostInterfaces")
    protected Long numberOfHostInterfaces;
    
    @JsonProperty(value = "numberOfVirtualMachines")
    protected Long numberOfVirtualMachines;
    
    @JsonProperty(value = "parentIDs")
    protected java.util.List<String> parentIDs;
    
    @JsonProperty(value = "peakCPUUsage")
    protected Float peakCPUUsage;
    
    @JsonProperty(value = "peakMemoryUsage")
    protected Float peakMemoryUsage;
    
    @JsonProperty(value = "peer")
    protected String peer;
    
    @JsonProperty(value = "personality")
    protected VRSPersonality personality;
    
    @JsonProperty(value = "primaryVSCConnectionLost")
    protected Boolean primaryVSCConnectionLost;
    
    @JsonProperty(value = "productVersion")
    protected String productVersion;
    
    @JsonProperty(value = "revertBehaviorEnabled")
    protected Boolean revertBehaviorEnabled;
    
    @JsonProperty(value = "revertCompleted")
    protected Boolean revertCompleted;
    
    @JsonProperty(value = "revertCount")
    protected Long revertCount;
    
    @JsonProperty(value = "revertFailedCount")
    protected Long revertFailedCount;
    
    @JsonProperty(value = "role")
    protected VRSRole role;
    
    @JsonProperty(value = "status")
    protected VRSStatus status;
    
    @JsonProperty(value = "uptime")
    protected Long uptime;
    
    @JsonProperty(value = "vscConfigState")
    protected VRSVscConfigState vscConfigState;
    
    @JsonProperty(value = "vscCurrentState")
    protected VRSVscCurrentState vscCurrentState;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private HSCsFetcher hSCs;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MonitoringPortsFetcher monitoringPorts;
    
    @JsonIgnore
    private MultiNICVPortsFetcher multiNICVPorts;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @JsonIgnore
    private VPortsFetcher vPorts;
    
    @JsonIgnore
    private VSCsFetcher vSCs;
    
    @VsoConstructor
    public VRS() {
        alarms = new AlarmsFetcher(this);
        
        containers = new ContainersFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        hSCs = new HSCsFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        monitoringPorts = new MonitoringPortsFetcher(this);
        
        multiNICVPorts = new MultiNICVPortsFetcher(this);
        
        vMs = new VMsFetcher(this);
        
        vPorts = new VPortsFetcher(this);
        
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
    public VRSJSONRPCConnectionState getJSONRPCConnectionState() {
       return JSONRPCConnectionState;
    }

    @JsonIgnore
    public void setJSONRPCConnectionState(VRSJSONRPCConnectionState value) { 
        this.JSONRPCConnectionState = value;
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
    @VsoProperty(displayName = "ClusterNodeRole", readOnly = false)   
    public VRSClusterNodeRole getClusterNodeRole() {
       return clusterNodeRole;
    }

    @JsonIgnore
    public void setClusterNodeRole(VRSClusterNodeRole value) { 
        this.clusterNodeRole = value;
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
    @VsoProperty(displayName = "DbSynced", readOnly = false)   
    public Boolean getDbSynced() {
       return dbSynced;
    }

    @JsonIgnore
    public void setDbSynced(Boolean value) { 
        this.dbSynced = value;
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
    @VsoProperty(displayName = "Dynamic", readOnly = false)   
    public Boolean getDynamic() {
       return dynamic;
    }

    @JsonIgnore
    public void setDynamic(Boolean value) { 
        this.dynamic = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VRSEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VRSEntityScope value) { 
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
    @VsoProperty(displayName = "HypervisorConnectionState", readOnly = false)   
    public VRSHypervisorConnectionState getHypervisorConnectionState() {
       return hypervisorConnectionState;
    }

    @JsonIgnore
    public void setHypervisorConnectionState(VRSHypervisorConnectionState value) { 
        this.hypervisorConnectionState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HypervisorIdentifier", readOnly = false)   
    public String getHypervisorIdentifier() {
       return hypervisorIdentifier;
    }

    @JsonIgnore
    public void setHypervisorIdentifier(String value) { 
        this.hypervisorIdentifier = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HypervisorName", readOnly = false)   
    public String getHypervisorName() {
       return hypervisorName;
    }

    @JsonIgnore
    public void setHypervisorName(String value) { 
        this.hypervisorName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HypervisorType", readOnly = false)   
    public String getHypervisorType() {
       return hypervisorType;
    }

    @JsonIgnore
    public void setHypervisorType(String value) { 
        this.hypervisorType = value;
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
    @VsoProperty(displayName = "LastEventName", readOnly = false)   
    public String getLastEventName() {
       return lastEventName;
    }

    @JsonIgnore
    public void setLastEventName(String value) { 
        this.lastEventName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastEventObject", readOnly = false)   
    public String getLastEventObject() {
       return lastEventObject;
    }

    @JsonIgnore
    public void setLastEventObject(String value) { 
        this.lastEventObject = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastEventTimestamp", readOnly = false)   
    public Long getLastEventTimestamp() {
       return lastEventTimestamp;
    }

    @JsonIgnore
    public void setLastEventTimestamp(Long value) { 
        this.lastEventTimestamp = value;
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
    @VsoProperty(displayName = "LicensedState", readOnly = false)   
    public VRSLicensedState getLicensedState() {
       return licensedState;
    }

    @JsonIgnore
    public void setLicensedState(VRSLicensedState value) { 
        this.licensedState = value;
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
    @VsoProperty(displayName = "MultiNICVPortEnabled", readOnly = false)   
    public Boolean getMultiNICVPortEnabled() {
       return multiNICVPortEnabled;
    }

    @JsonIgnore
    public void setMultiNICVPortEnabled(Boolean value) { 
        this.multiNICVPortEnabled = value;
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
    @VsoProperty(displayName = "NumberOfBridgeInterfaces", readOnly = false)   
    public Long getNumberOfBridgeInterfaces() {
       return numberOfBridgeInterfaces;
    }

    @JsonIgnore
    public void setNumberOfBridgeInterfaces(Long value) { 
        this.numberOfBridgeInterfaces = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NumberOfContainers", readOnly = false)   
    public Long getNumberOfContainers() {
       return numberOfContainers;
    }

    @JsonIgnore
    public void setNumberOfContainers(Long value) { 
        this.numberOfContainers = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NumberOfHostInterfaces", readOnly = false)   
    public Long getNumberOfHostInterfaces() {
       return numberOfHostInterfaces;
    }

    @JsonIgnore
    public void setNumberOfHostInterfaces(Long value) { 
        this.numberOfHostInterfaces = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NumberOfVirtualMachines", readOnly = false)   
    public Long getNumberOfVirtualMachines() {
       return numberOfVirtualMachines;
    }

    @JsonIgnore
    public void setNumberOfVirtualMachines(Long value) { 
        this.numberOfVirtualMachines = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ParentIDs", readOnly = false)   
    public java.util.List<String> getParentIDs() {
       return parentIDs;
    }

    @JsonIgnore
    public void setParentIDs(java.util.List<String> value) { 
        this.parentIDs = value;
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
    @VsoProperty(displayName = "Peer", readOnly = false)   
    public String getPeer() {
       return peer;
    }

    @JsonIgnore
    public void setPeer(String value) { 
        this.peer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public VRSPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(VRSPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PrimaryVSCConnectionLost", readOnly = false)   
    public Boolean getPrimaryVSCConnectionLost() {
       return primaryVSCConnectionLost;
    }

    @JsonIgnore
    public void setPrimaryVSCConnectionLost(Boolean value) { 
        this.primaryVSCConnectionLost = value;
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
    @VsoProperty(displayName = "RevertBehaviorEnabled", readOnly = false)   
    public Boolean getRevertBehaviorEnabled() {
       return revertBehaviorEnabled;
    }

    @JsonIgnore
    public void setRevertBehaviorEnabled(Boolean value) { 
        this.revertBehaviorEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RevertCompleted", readOnly = false)   
    public Boolean getRevertCompleted() {
       return revertCompleted;
    }

    @JsonIgnore
    public void setRevertCompleted(Boolean value) { 
        this.revertCompleted = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RevertCount", readOnly = false)   
    public Long getRevertCount() {
       return revertCount;
    }

    @JsonIgnore
    public void setRevertCount(Long value) { 
        this.revertCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RevertFailedCount", readOnly = false)   
    public Long getRevertFailedCount() {
       return revertFailedCount;
    }

    @JsonIgnore
    public void setRevertFailedCount(Long value) { 
        this.revertFailedCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Role", readOnly = false)   
    public VRSRole getRole() {
       return role;
    }

    @JsonIgnore
    public void setRole(VRSRole value) { 
        this.role = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public VRSStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(VRSStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Uptime", readOnly = false)   
    public Long getUptime() {
       return uptime;
    }

    @JsonIgnore
    public void setUptime(Long value) { 
        this.uptime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VscConfigState", readOnly = false)   
    public VRSVscConfigState getVscConfigState() {
       return vscConfigState;
    }

    @JsonIgnore
    public void setVscConfigState(VRSVscConfigState value) { 
        this.vscConfigState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VscCurrentState", readOnly = false)   
    public VRSVscCurrentState getVscCurrentState() {
       return vscCurrentState;
    }

    @JsonIgnore
    public void setVscCurrentState(VRSVscCurrentState value) { 
        this.vscCurrentState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Containers", readOnly = true)   
    public ContainersFetcher getContainers() {
        return containers;
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
    @VsoProperty(displayName = "HSCs", readOnly = true)   
    public HSCsFetcher getHSCs() {
        return hSCs;
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
    @VsoProperty(displayName = "MultiNICVPorts", readOnly = true)   
    public MultiNICVPortsFetcher getMultiNICVPorts() {
        return multiNICVPorts;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VMs", readOnly = true)   
    public VMsFetcher getVMs() {
        return vMs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPorts", readOnly = true)   
    public VPortsFetcher getVPorts() {
        return vPorts;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.VRS, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VRS, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VRS, getId());
        }
    }
    
    @VsoMethod
    public void assignHSCs(Session session, HSC[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VRS, getId());
        }
    }
    
    @VsoMethod
    public void assignVSCs(Session session, VSC[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VRS, getId());
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
        return "VRS [" + "JSONRPCConnectionState=" + JSONRPCConnectionState + ", address=" + address + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", clusterNodeRole=" + clusterNodeRole + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", dbSynced=" + dbSynced + ", description=" + description + ", disks=" + disks + ", dynamic=" + dynamic + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hypervisorConnectionState=" + hypervisorConnectionState + ", hypervisorIdentifier=" + hypervisorIdentifier + ", hypervisorName=" + hypervisorName + ", hypervisorType=" + hypervisorType + ", isResilient=" + isResilient + ", lastEventName=" + lastEventName + ", lastEventObject=" + lastEventObject + ", lastEventTimestamp=" + lastEventTimestamp + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", licensedState=" + licensedState + ", location=" + location + ", managementIP=" + managementIP + ", messages=" + messages + ", multiNICVPortEnabled=" + multiNICVPortEnabled + ", name=" + name + ", numberOfBridgeInterfaces=" + numberOfBridgeInterfaces + ", numberOfContainers=" + numberOfContainers + ", numberOfHostInterfaces=" + numberOfHostInterfaces + ", numberOfVirtualMachines=" + numberOfVirtualMachines + ", parentIDs=" + parentIDs + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", peer=" + peer + ", personality=" + personality + ", primaryVSCConnectionLost=" + primaryVSCConnectionLost + ", productVersion=" + productVersion + ", revertBehaviorEnabled=" + revertBehaviorEnabled + ", revertCompleted=" + revertCompleted + ", revertCount=" + revertCount + ", revertFailedCount=" + revertFailedCount + ", role=" + role + ", status=" + status + ", uptime=" + uptime + ", vscConfigState=" + vscConfigState + ", vscCurrentState=" + vscCurrentState + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}