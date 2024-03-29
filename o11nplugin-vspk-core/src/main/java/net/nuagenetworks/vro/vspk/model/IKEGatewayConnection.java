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

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PerformanceMonitorsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayConnectionNSGIdentifierType;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayConnectionNSGRole;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayConnectionAssociatedCloudType;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayConnectionAssociatedIKEAuthenticationType;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayConnectionConfigurationStatus;

import net.nuagenetworks.vro.vspk.model.enums.IKEGatewayConnectionEntityScope;
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

@VsoFinder(name = Constants.IKEGATEWAYCONNECTION, datasource = Constants.DATASOURCE, image = Constants.IKEGATEWAYCONNECTION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikegatewayconnection", resourceName = "ikegatewayconnections")
public class IKEGatewayConnection extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "NSGIdentifier")
    protected String NSGIdentifier;
    
    @JsonProperty(value = "NSGIdentifierType")
    protected IKEGatewayConnectionNSGIdentifierType NSGIdentifierType;
    
    @JsonProperty(value = "NSGRole")
    protected IKEGatewayConnectionNSGRole NSGRole;
    
    @JsonProperty(value = "allowAnySubnet")
    protected Boolean allowAnySubnet;
    
    @JsonProperty(value = "associatedCloudID")
    protected String associatedCloudID;
    
    @JsonProperty(value = "associatedCloudType")
    protected IKEGatewayConnectionAssociatedCloudType associatedCloudType;
    
    @JsonProperty(value = "associatedIKEAuthenticationID")
    protected String associatedIKEAuthenticationID;
    
    @JsonProperty(value = "associatedIKEAuthenticationType")
    protected IKEGatewayConnectionAssociatedIKEAuthenticationType associatedIKEAuthenticationType;
    
    @JsonProperty(value = "associatedIKEEncryptionProfileID")
    protected String associatedIKEEncryptionProfileID;
    
    @JsonProperty(value = "associatedIKEGatewayProfileID")
    protected String associatedIKEGatewayProfileID;
    
    @JsonProperty(value = "associatedVLANID")
    protected String associatedVLANID;
    
    @JsonProperty(value = "configurationStatus")
    protected IKEGatewayConnectionConfigurationStatus configurationStatus;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected IKEGatewayConnectionEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "mark")
    protected Long mark;
    
    @JsonProperty(value = "mirroredConnection")
    protected Boolean mirroredConnection;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "portVLANName")
    protected String portVLANName;
    
    @JsonProperty(value = "priority")
    protected Long priority;
    
    @JsonProperty(value = "sequence")
    protected Long sequence;
    
    @JsonProperty(value = "unencryptedPSK")
    protected String unencryptedPSK;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PerformanceMonitorsFetcher performanceMonitors;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private SubnetsFetcher subnets;
    
    @VsoConstructor
    public IKEGatewayConnection() {
        alarms = new AlarmsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        performanceMonitors = new PerformanceMonitorsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        subnets = new SubnetsFetcher(this);
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
    @VsoProperty(displayName = "NSGIdentifier", readOnly = false)   
    public String getNSGIdentifier() {
       return NSGIdentifier;
    }

    @JsonIgnore
    public void setNSGIdentifier(String value) { 
        this.NSGIdentifier = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGIdentifierType", readOnly = false)   
    public IKEGatewayConnectionNSGIdentifierType getNSGIdentifierType() {
       return NSGIdentifierType;
    }

    @JsonIgnore
    public void setNSGIdentifierType(IKEGatewayConnectionNSGIdentifierType value) { 
        this.NSGIdentifierType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGRole", readOnly = false)   
    public IKEGatewayConnectionNSGRole getNSGRole() {
       return NSGRole;
    }

    @JsonIgnore
    public void setNSGRole(IKEGatewayConnectionNSGRole value) { 
        this.NSGRole = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowAnySubnet", readOnly = false)   
    public Boolean getAllowAnySubnet() {
       return allowAnySubnet;
    }

    @JsonIgnore
    public void setAllowAnySubnet(Boolean value) { 
        this.allowAnySubnet = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedCloudID", readOnly = false)   
    public String getAssociatedCloudID() {
       return associatedCloudID;
    }

    @JsonIgnore
    public void setAssociatedCloudID(String value) { 
        this.associatedCloudID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedCloudType", readOnly = false)   
    public IKEGatewayConnectionAssociatedCloudType getAssociatedCloudType() {
       return associatedCloudType;
    }

    @JsonIgnore
    public void setAssociatedCloudType(IKEGatewayConnectionAssociatedCloudType value) { 
        this.associatedCloudType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEAuthenticationID", readOnly = false)   
    public String getAssociatedIKEAuthenticationID() {
       return associatedIKEAuthenticationID;
    }

    @JsonIgnore
    public void setAssociatedIKEAuthenticationID(String value) { 
        this.associatedIKEAuthenticationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEAuthenticationType", readOnly = false)   
    public IKEGatewayConnectionAssociatedIKEAuthenticationType getAssociatedIKEAuthenticationType() {
       return associatedIKEAuthenticationType;
    }

    @JsonIgnore
    public void setAssociatedIKEAuthenticationType(IKEGatewayConnectionAssociatedIKEAuthenticationType value) { 
        this.associatedIKEAuthenticationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEEncryptionProfileID", readOnly = false)   
    public String getAssociatedIKEEncryptionProfileID() {
       return associatedIKEEncryptionProfileID;
    }

    @JsonIgnore
    public void setAssociatedIKEEncryptionProfileID(String value) { 
        this.associatedIKEEncryptionProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIKEGatewayProfileID", readOnly = false)   
    public String getAssociatedIKEGatewayProfileID() {
       return associatedIKEGatewayProfileID;
    }

    @JsonIgnore
    public void setAssociatedIKEGatewayProfileID(String value) { 
        this.associatedIKEGatewayProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVLANID", readOnly = false)   
    public String getAssociatedVLANID() {
       return associatedVLANID;
    }

    @JsonIgnore
    public void setAssociatedVLANID(String value) { 
        this.associatedVLANID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConfigurationStatus", readOnly = false)   
    public IKEGatewayConnectionConfigurationStatus getConfigurationStatus() {
       return configurationStatus;
    }

    @JsonIgnore
    public void setConfigurationStatus(IKEGatewayConnectionConfigurationStatus value) { 
        this.configurationStatus = value;
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
    public IKEGatewayConnectionEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(IKEGatewayConnectionEntityScope value) { 
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
    @VsoProperty(displayName = "Mark", readOnly = false)   
    public Long getMark() {
       return mark;
    }

    @JsonIgnore
    public void setMark(Long value) { 
        this.mark = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MirroredConnection", readOnly = false)   
    public Boolean getMirroredConnection() {
       return mirroredConnection;
    }

    @JsonIgnore
    public void setMirroredConnection(Boolean value) { 
        this.mirroredConnection = value;
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
    @VsoProperty(displayName = "PortVLANName", readOnly = false)   
    public String getPortVLANName() {
       return portVLANName;
    }

    @JsonIgnore
    public void setPortVLANName(String value) { 
        this.portVLANName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Priority", readOnly = false)   
    public Long getPriority() {
       return priority;
    }

    @JsonIgnore
    public void setPriority(Long value) { 
        this.priority = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Sequence", readOnly = false)   
    public Long getSequence() {
       return sequence;
    }

    @JsonIgnore
    public void setSequence(Long value) { 
        this.sequence = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnencryptedPSK", readOnly = false)   
    public String getUnencryptedPSK() {
       return unencryptedPSK;
    }

    @JsonIgnore
    public void setUnencryptedPSK(String value) { 
        this.unencryptedPSK = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
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
    @VsoProperty(displayName = "PerformanceMonitors", readOnly = true)   
    public PerformanceMonitorsFetcher getPerformanceMonitors() {
        return performanceMonitors;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Subnets", readOnly = true)   
    public SubnetsFetcher getSubnets() {
        return subnets;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYCONNECTION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.IKEGATEWAYCONNECTION, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYCONNECTION, getId());
        }
    }
    
    @VsoMethod
    public void assignPerformanceMonitors(Session session, PerformanceMonitor[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYCONNECTION, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYCONNECTION, getId());
        }
    }
    
    @VsoMethod
    public void assignSubnets(Session session, Subnet[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.IKEGATEWAYCONNECTION, getId());
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
        return "IKEGatewayConnection [" + "NSGIdentifier=" + NSGIdentifier + ", NSGIdentifierType=" + NSGIdentifierType + ", NSGRole=" + NSGRole + ", allowAnySubnet=" + allowAnySubnet + ", associatedCloudID=" + associatedCloudID + ", associatedCloudType=" + associatedCloudType + ", associatedIKEAuthenticationID=" + associatedIKEAuthenticationID + ", associatedIKEAuthenticationType=" + associatedIKEAuthenticationType + ", associatedIKEEncryptionProfileID=" + associatedIKEEncryptionProfileID + ", associatedIKEGatewayProfileID=" + associatedIKEGatewayProfileID + ", associatedVLANID=" + associatedVLANID + ", configurationStatus=" + configurationStatus + ", creationDate=" + creationDate + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", mark=" + mark + ", mirroredConnection=" + mirroredConnection + ", name=" + name + ", owner=" + owner + ", portVLANName=" + portVLANName + ", priority=" + priority + ", sequence=" + sequence + ", unencryptedPSK=" + unencryptedPSK + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}