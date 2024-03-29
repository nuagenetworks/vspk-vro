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

import net.nuagenetworks.vro.vspk.model.enums.ZFBRequestZFBApprovalStatus;

import net.nuagenetworks.vro.vspk.model.enums.ZFBRequestAssociatedEntityType;

import net.nuagenetworks.vro.vspk.model.enums.ZFBRequestEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.ZFBRequestRequestType;
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

@VsoFinder(name = Constants.ZFBREQUEST, datasource = Constants.DATASOURCE, image = Constants.ZFBREQUEST_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zfbrequest", resourceName = "zfbrequests")
public class ZFBRequest extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "IPAddress")
    protected String IPAddress;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "NSGVersion")
    protected String NSGVersion;
    
    @JsonProperty(value = "SKU")
    protected String SKU;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "ZFBApprovalStatus")
    protected ZFBRequestZFBApprovalStatus ZFBApprovalStatus;
    
    @JsonProperty(value = "ZFBBootstrapEnabled")
    protected Boolean ZFBBootstrapEnabled;
    
    @JsonProperty(value = "ZFBInfo")
    protected String ZFBInfo;
    
    @JsonProperty(value = "ZFBRequestRetryTimer")
    protected Long ZFBRequestRetryTimer;
    
    @JsonProperty(value = "associatedEnterpriseID")
    protected String associatedEnterpriseID;
    
    @JsonProperty(value = "associatedEnterpriseName")
    protected String associatedEnterpriseName;
    
    @JsonProperty(value = "associatedEntityType")
    protected ZFBRequestAssociatedEntityType associatedEntityType;
    
    @JsonProperty(value = "associatedGatewayID")
    protected String associatedGatewayID;
    
    @JsonProperty(value = "associatedGatewayName")
    protected String associatedGatewayName;
    
    @JsonProperty(value = "associatedNSGatewayID")
    protected String associatedNSGatewayID;
    
    @JsonProperty(value = "associatedNSGatewayName")
    protected String associatedNSGatewayName;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected ZFBRequestEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected String family;
    
    @JsonProperty(value = "hostname")
    protected String hostname;
    
    @JsonProperty(value = "lastConnectedTime")
    protected Float lastConnectedTime;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "originalEnterpriseName")
    protected String originalEnterpriseName;
    
    @JsonProperty(value = "originalGatewayDatapathID")
    protected String originalGatewayDatapathID;
    
    @JsonProperty(value = "originalGatewayName")
    protected String originalGatewayName;
    
    @JsonProperty(value = "originalUplinkConnectionInfo")
    protected String originalUplinkConnectionInfo;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "registrationURL")
    protected String registrationURL;
    
    @JsonProperty(value = "requestType")
    protected ZFBRequestRequestType requestType;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @JsonProperty(value = "statusString")
    protected String statusString;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public ZFBRequest() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
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
    @VsoProperty(displayName = "CPUType", readOnly = false)   
    public String getCPUType() {
       return CPUType;
    }

    @JsonIgnore
    public void setCPUType(String value) { 
        this.CPUType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPAddress", readOnly = false)   
    public String getIPAddress() {
       return IPAddress;
    }

    @JsonIgnore
    public void setIPAddress(String value) { 
        this.IPAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MACAddress", readOnly = false)   
    public String getMACAddress() {
       return MACAddress;
    }

    @JsonIgnore
    public void setMACAddress(String value) { 
        this.MACAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGVersion", readOnly = false)   
    public String getNSGVersion() {
       return NSGVersion;
    }

    @JsonIgnore
    public void setNSGVersion(String value) { 
        this.NSGVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SKU", readOnly = false)   
    public String getSKU() {
       return SKU;
    }

    @JsonIgnore
    public void setSKU(String value) { 
        this.SKU = value;
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
    @VsoProperty(displayName = "ZFBApprovalStatus", readOnly = false)   
    public ZFBRequestZFBApprovalStatus getZFBApprovalStatus() {
       return ZFBApprovalStatus;
    }

    @JsonIgnore
    public void setZFBApprovalStatus(ZFBRequestZFBApprovalStatus value) { 
        this.ZFBApprovalStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBBootstrapEnabled", readOnly = false)   
    public Boolean getZFBBootstrapEnabled() {
       return ZFBBootstrapEnabled;
    }

    @JsonIgnore
    public void setZFBBootstrapEnabled(Boolean value) { 
        this.ZFBBootstrapEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBInfo", readOnly = false)   
    public String getZFBInfo() {
       return ZFBInfo;
    }

    @JsonIgnore
    public void setZFBInfo(String value) { 
        this.ZFBInfo = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBRequestRetryTimer", readOnly = false)   
    public Long getZFBRequestRetryTimer() {
       return ZFBRequestRetryTimer;
    }

    @JsonIgnore
    public void setZFBRequestRetryTimer(Long value) { 
        this.ZFBRequestRetryTimer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEnterpriseID", readOnly = false)   
    public String getAssociatedEnterpriseID() {
       return associatedEnterpriseID;
    }

    @JsonIgnore
    public void setAssociatedEnterpriseID(String value) { 
        this.associatedEnterpriseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEnterpriseName", readOnly = false)   
    public String getAssociatedEnterpriseName() {
       return associatedEnterpriseName;
    }

    @JsonIgnore
    public void setAssociatedEnterpriseName(String value) { 
        this.associatedEnterpriseName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEntityType", readOnly = false)   
    public ZFBRequestAssociatedEntityType getAssociatedEntityType() {
       return associatedEntityType;
    }

    @JsonIgnore
    public void setAssociatedEntityType(ZFBRequestAssociatedEntityType value) { 
        this.associatedEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayID", readOnly = false)   
    public String getAssociatedGatewayID() {
       return associatedGatewayID;
    }

    @JsonIgnore
    public void setAssociatedGatewayID(String value) { 
        this.associatedGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayName", readOnly = false)   
    public String getAssociatedGatewayName() {
       return associatedGatewayName;
    }

    @JsonIgnore
    public void setAssociatedGatewayName(String value) { 
        this.associatedGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGatewayID", readOnly = false)   
    public String getAssociatedNSGatewayID() {
       return associatedNSGatewayID;
    }

    @JsonIgnore
    public void setAssociatedNSGatewayID(String value) { 
        this.associatedNSGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGatewayName", readOnly = false)   
    public String getAssociatedNSGatewayName() {
       return associatedNSGatewayName;
    }

    @JsonIgnore
    public void setAssociatedNSGatewayName(String value) { 
        this.associatedNSGatewayName = value;
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
    public ZFBRequestEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(ZFBRequestEntityScope value) { 
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
    @VsoProperty(displayName = "Family", readOnly = false)   
    public String getFamily() {
       return family;
    }

    @JsonIgnore
    public void setFamily(String value) { 
        this.family = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Hostname", readOnly = false)   
    public String getHostname() {
       return hostname;
    }

    @JsonIgnore
    public void setHostname(String value) { 
        this.hostname = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastConnectedTime", readOnly = false)   
    public Float getLastConnectedTime() {
       return lastConnectedTime;
    }

    @JsonIgnore
    public void setLastConnectedTime(Float value) { 
        this.lastConnectedTime = value;
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
    @VsoProperty(displayName = "OriginalEnterpriseName", readOnly = false)   
    public String getOriginalEnterpriseName() {
       return originalEnterpriseName;
    }

    @JsonIgnore
    public void setOriginalEnterpriseName(String value) { 
        this.originalEnterpriseName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OriginalGatewayDatapathID", readOnly = false)   
    public String getOriginalGatewayDatapathID() {
       return originalGatewayDatapathID;
    }

    @JsonIgnore
    public void setOriginalGatewayDatapathID(String value) { 
        this.originalGatewayDatapathID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OriginalGatewayName", readOnly = false)   
    public String getOriginalGatewayName() {
       return originalGatewayName;
    }

    @JsonIgnore
    public void setOriginalGatewayName(String value) { 
        this.originalGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OriginalUplinkConnectionInfo", readOnly = false)   
    public String getOriginalUplinkConnectionInfo() {
       return originalUplinkConnectionInfo;
    }

    @JsonIgnore
    public void setOriginalUplinkConnectionInfo(String value) { 
        this.originalUplinkConnectionInfo = value;
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
    @VsoProperty(displayName = "RegistrationURL", readOnly = false)   
    public String getRegistrationURL() {
       return registrationURL;
    }

    @JsonIgnore
    public void setRegistrationURL(String value) { 
        this.registrationURL = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RequestType", readOnly = false)   
    public ZFBRequestRequestType getRequestType() {
       return requestType;
    }

    @JsonIgnore
    public void setRequestType(ZFBRequestRequestType value) { 
        this.requestType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SerialNumber", readOnly = false)   
    public String getSerialNumber() {
       return serialNumber;
    }

    @JsonIgnore
    public void setSerialNumber(String value) { 
        this.serialNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatusString", readOnly = false)   
    public String getStatusString() {
       return statusString;
    }

    @JsonIgnore
    public void setStatusString(String value) { 
        this.statusString = value;
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.ZFBREQUEST, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ZFBREQUEST, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ZFBREQUEST, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ZFBREQUEST, getId());
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
        return "ZFBRequest [" + "CPUType=" + CPUType + ", IPAddress=" + IPAddress + ", MACAddress=" + MACAddress + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", UUID=" + UUID + ", ZFBApprovalStatus=" + ZFBApprovalStatus + ", ZFBBootstrapEnabled=" + ZFBBootstrapEnabled + ", ZFBInfo=" + ZFBInfo + ", ZFBRequestRetryTimer=" + ZFBRequestRetryTimer + ", associatedEnterpriseID=" + associatedEnterpriseID + ", associatedEnterpriseName=" + associatedEnterpriseName + ", associatedEntityType=" + associatedEntityType + ", associatedGatewayID=" + associatedGatewayID + ", associatedGatewayName=" + associatedGatewayName + ", associatedNSGatewayID=" + associatedNSGatewayID + ", associatedNSGatewayName=" + associatedNSGatewayName + ", creationDate=" + creationDate + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", hostname=" + hostname + ", lastConnectedTime=" + lastConnectedTime + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", originalEnterpriseName=" + originalEnterpriseName + ", originalGatewayDatapathID=" + originalGatewayDatapathID + ", originalGatewayName=" + originalGatewayName + ", originalUplinkConnectionInfo=" + originalUplinkConnectionInfo + ", owner=" + owner + ", registrationURL=" + registrationURL + ", requestType=" + requestType + ", serialNumber=" + serialNumber + ", statusString=" + statusString + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}