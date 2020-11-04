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

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VNFThresholdPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VNFAllowedActions;

import net.nuagenetworks.vro.vspk.model.enums.VNFEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.VNFLastUserAction;

import net.nuagenetworks.vro.vspk.model.enums.VNFStatus;

import net.nuagenetworks.vro.vspk.model.enums.VNFTaskState;

import net.nuagenetworks.vro.vspk.model.enums.VNFType;
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

@VsoFinder(name = Constants.VNF, datasource = Constants.DATASOURCE, image = Constants.VNF_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vnf", resourceName = "vnfs")
public class VNF extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "CPUCount")
    protected Long CPUCount;
    
    @JsonProperty(value = "NSGName")
    protected String NSGName;
    
    @JsonProperty(value = "NSGSystemID")
    protected String NSGSystemID;
    
    @JsonProperty(value = "NSGatewayID")
    protected String NSGatewayID;
    
    @JsonProperty(value = "VNFDescriptorID")
    protected String VNFDescriptorID;
    
    @JsonProperty(value = "VNFDescriptorName")
    protected String VNFDescriptorName;
    
    @JsonProperty(value = "allowedActions")
    protected java.util.List<VNFAllowedActions> allowedActions;
    
    @JsonProperty(value = "associatedVNFMetadataID")
    protected String associatedVNFMetadataID;
    
    @JsonProperty(value = "associatedVNFThresholdPolicyID")
    protected String associatedVNFThresholdPolicyID;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected VNFEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "isAttachedToDescriptor")
    protected Boolean isAttachedToDescriptor;
    
    @JsonProperty(value = "lastKnownError")
    protected String lastKnownError;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "lastUserAction")
    protected VNFLastUserAction lastUserAction;
    
    @JsonProperty(value = "memoryMB")
    protected Long memoryMB;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "status")
    protected VNFStatus status;
    
    @JsonProperty(value = "storageGB")
    protected Long storageGB;
    
    @JsonProperty(value = "taskState")
    protected VNFTaskState taskState;
    
    @JsonProperty(value = "type")
    protected VNFType type;
    
    @JsonProperty(value = "vendor")
    protected String vendor;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private VNFInterfacesFetcher vNFInterfaces;
    
    @JsonIgnore
    private VNFMetadatasFetcher vNFMetadatas;
    
    @JsonIgnore
    private VNFThresholdPoliciesFetcher vNFThresholdPolicies;
    
    @VsoConstructor
    public VNF() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        vNFInterfaces = new VNFInterfacesFetcher(this);
        
        vNFMetadatas = new VNFMetadatasFetcher(this);
        
        vNFThresholdPolicies = new VNFThresholdPoliciesFetcher(this);
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
    @VsoProperty(displayName = "CPUCount", readOnly = false)   
    public Long getCPUCount() {
       return CPUCount;
    }

    @JsonIgnore
    public void setCPUCount(Long value) { 
        this.CPUCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGName", readOnly = false)   
    public String getNSGName() {
       return NSGName;
    }

    @JsonIgnore
    public void setNSGName(String value) { 
        this.NSGName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGSystemID", readOnly = false)   
    public String getNSGSystemID() {
       return NSGSystemID;
    }

    @JsonIgnore
    public void setNSGSystemID(String value) { 
        this.NSGSystemID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGatewayID", readOnly = false)   
    public String getNSGatewayID() {
       return NSGatewayID;
    }

    @JsonIgnore
    public void setNSGatewayID(String value) { 
        this.NSGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFDescriptorID", readOnly = false)   
    public String getVNFDescriptorID() {
       return VNFDescriptorID;
    }

    @JsonIgnore
    public void setVNFDescriptorID(String value) { 
        this.VNFDescriptorID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFDescriptorName", readOnly = false)   
    public String getVNFDescriptorName() {
       return VNFDescriptorName;
    }

    @JsonIgnore
    public void setVNFDescriptorName(String value) { 
        this.VNFDescriptorName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedActions", readOnly = false)   
    public java.util.List<VNFAllowedActions> getAllowedActions() {
       return allowedActions;
    }

    @JsonIgnore
    public void setAllowedActions(java.util.List<VNFAllowedActions> value) { 
        this.allowedActions = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVNFMetadataID", readOnly = false)   
    public String getAssociatedVNFMetadataID() {
       return associatedVNFMetadataID;
    }

    @JsonIgnore
    public void setAssociatedVNFMetadataID(String value) { 
        this.associatedVNFMetadataID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVNFThresholdPolicyID", readOnly = false)   
    public String getAssociatedVNFThresholdPolicyID() {
       return associatedVNFThresholdPolicyID;
    }

    @JsonIgnore
    public void setAssociatedVNFThresholdPolicyID(String value) { 
        this.associatedVNFThresholdPolicyID = value;
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
    public VNFEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VNFEntityScope value) { 
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
    @VsoProperty(displayName = "IsAttachedToDescriptor", readOnly = false)   
    public Boolean getIsAttachedToDescriptor() {
       return isAttachedToDescriptor;
    }

    @JsonIgnore
    public void setIsAttachedToDescriptor(Boolean value) { 
        this.isAttachedToDescriptor = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastKnownError", readOnly = false)   
    public String getLastKnownError() {
       return lastKnownError;
    }

    @JsonIgnore
    public void setLastKnownError(String value) { 
        this.lastKnownError = value;
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
    @VsoProperty(displayName = "LastUserAction", readOnly = false)   
    public VNFLastUserAction getLastUserAction() {
       return lastUserAction;
    }

    @JsonIgnore
    public void setLastUserAction(VNFLastUserAction value) { 
        this.lastUserAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MemoryMB", readOnly = false)   
    public Long getMemoryMB() {
       return memoryMB;
    }

    @JsonIgnore
    public void setMemoryMB(Long value) { 
        this.memoryMB = value;
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
    @VsoProperty(displayName = "Status", readOnly = false)   
    public VNFStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(VNFStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StorageGB", readOnly = false)   
    public Long getStorageGB() {
       return storageGB;
    }

    @JsonIgnore
    public void setStorageGB(Long value) { 
        this.storageGB = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TaskState", readOnly = false)   
    public VNFTaskState getTaskState() {
       return taskState;
    }

    @JsonIgnore
    public void setTaskState(VNFTaskState value) { 
        this.taskState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public VNFType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(VNFType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vendor", readOnly = false)   
    public String getVendor() {
       return vendor;
    }

    @JsonIgnore
    public void setVendor(String value) { 
        this.vendor = value;
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
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFInterfaces", readOnly = true)   
    public VNFInterfacesFetcher getVNFInterfaces() {
        return vNFInterfaces;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFMetadatas", readOnly = true)   
    public VNFMetadatasFetcher getVNFMetadatas() {
        return vNFMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VNFThresholdPolicies", readOnly = true)   
    public VNFThresholdPoliciesFetcher getVNFThresholdPolicies() {
        return vNFThresholdPolicies;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VNF, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VNF, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VNF, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.VNF, getId());
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
    }
    @VsoMethod
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }public String toString() {
        return "VNF [" + "CPUCount=" + CPUCount + ", NSGName=" + NSGName + ", NSGSystemID=" + NSGSystemID + ", NSGatewayID=" + NSGatewayID + ", VNFDescriptorID=" + VNFDescriptorID + ", VNFDescriptorName=" + VNFDescriptorName + ", allowedActions=" + allowedActions + ", associatedVNFMetadataID=" + associatedVNFMetadataID + ", associatedVNFThresholdPolicyID=" + associatedVNFThresholdPolicyID + ", creationDate=" + creationDate + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", isAttachedToDescriptor=" + isAttachedToDescriptor + ", lastKnownError=" + lastKnownError + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", lastUserAction=" + lastUserAction + ", memoryMB=" + memoryMB + ", name=" + name + ", owner=" + owner + ", status=" + status + ", storageGB=" + storageGB + ", taskState=" + taskState + ", type=" + type + ", vendor=" + vendor + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}