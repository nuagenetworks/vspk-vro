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

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.LicenseStatusEntityScope;
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

@VsoFinder(name = Constants.LICENSESTATUS, datasource = Constants.DATASOURCE, image = Constants.LICENSESTATUS_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "licensestatus", resourceName = "licensestatus")
public class LicenseStatus extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "accumulateLicensesEnabled")
    protected Boolean accumulateLicensesEnabled;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected LicenseStatusEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "totalLicensedAVRSGsCount")
    protected Long totalLicensedAVRSGsCount;
    
    @JsonProperty(value = "totalLicensedAVRSsCount")
    protected Long totalLicensedAVRSsCount;
    
    @JsonProperty(value = "totalLicensedGatewaysCount")
    protected Long totalLicensedGatewaysCount;
    
    @JsonProperty(value = "totalLicensedNICsCount")
    protected Long totalLicensedNICsCount;
    
    @JsonProperty(value = "totalLicensedNSGsCount")
    protected Long totalLicensedNSGsCount;
    
    @JsonProperty(value = "totalLicensedOVRSsCount")
    protected Long totalLicensedOVRSsCount;
    
    @JsonProperty(value = "totalLicensedUsedAVRSGsCount")
    protected Long totalLicensedUsedAVRSGsCount;
    
    @JsonProperty(value = "totalLicensedUsedAVRSsCount")
    protected Long totalLicensedUsedAVRSsCount;
    
    @JsonProperty(value = "totalLicensedUsedNICsCount")
    protected Long totalLicensedUsedNICsCount;
    
    @JsonProperty(value = "totalLicensedUsedNSGsCount")
    protected Long totalLicensedUsedNSGsCount;
    
    @JsonProperty(value = "totalLicensedUsedOVRSsCount")
    protected Long totalLicensedUsedOVRSsCount;
    
    @JsonProperty(value = "totalLicensedUsedVDFGsCount")
    protected Long totalLicensedUsedVDFGsCount;
    
    @JsonProperty(value = "totalLicensedUsedVDFsCount")
    protected Long totalLicensedUsedVDFsCount;
    
    @JsonProperty(value = "totalLicensedUsedVMsCount")
    protected Long totalLicensedUsedVMsCount;
    
    @JsonProperty(value = "totalLicensedUsedVRSGsCount")
    protected Long totalLicensedUsedVRSGsCount;
    
    @JsonProperty(value = "totalLicensedUsedVRSsCount")
    protected Long totalLicensedUsedVRSsCount;
    
    @JsonProperty(value = "totalLicensedVDFGsCount")
    protected Long totalLicensedVDFGsCount;
    
    @JsonProperty(value = "totalLicensedVDFsCount")
    protected Long totalLicensedVDFsCount;
    
    @JsonProperty(value = "totalLicensedVMsCount")
    protected Long totalLicensedVMsCount;
    
    @JsonProperty(value = "totalLicensedVRSGsCount")
    protected Long totalLicensedVRSGsCount;
    
    @JsonProperty(value = "totalLicensedVRSsCount")
    protected Long totalLicensedVRSsCount;
    
    @JsonProperty(value = "totalUsedGatewaysCount")
    protected Long totalUsedGatewaysCount;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public LicenseStatus() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
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
    @VsoProperty(displayName = "AccumulateLicensesEnabled", readOnly = false)   
    public Boolean getAccumulateLicensesEnabled() {
       return accumulateLicensesEnabled;
    }

    @JsonIgnore
    public void setAccumulateLicensesEnabled(Boolean value) { 
        this.accumulateLicensesEnabled = value;
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
    public LicenseStatusEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(LicenseStatusEntityScope value) { 
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
    @VsoProperty(displayName = "TotalLicensedAVRSGsCount", readOnly = false)   
    public Long getTotalLicensedAVRSGsCount() {
       return totalLicensedAVRSGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedAVRSGsCount(Long value) { 
        this.totalLicensedAVRSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedAVRSsCount", readOnly = false)   
    public Long getTotalLicensedAVRSsCount() {
       return totalLicensedAVRSsCount;
    }

    @JsonIgnore
    public void setTotalLicensedAVRSsCount(Long value) { 
        this.totalLicensedAVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedGatewaysCount", readOnly = false)   
    public Long getTotalLicensedGatewaysCount() {
       return totalLicensedGatewaysCount;
    }

    @JsonIgnore
    public void setTotalLicensedGatewaysCount(Long value) { 
        this.totalLicensedGatewaysCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedNICsCount", readOnly = false)   
    public Long getTotalLicensedNICsCount() {
       return totalLicensedNICsCount;
    }

    @JsonIgnore
    public void setTotalLicensedNICsCount(Long value) { 
        this.totalLicensedNICsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedNSGsCount", readOnly = false)   
    public Long getTotalLicensedNSGsCount() {
       return totalLicensedNSGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedNSGsCount(Long value) { 
        this.totalLicensedNSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedOVRSsCount", readOnly = false)   
    public Long getTotalLicensedOVRSsCount() {
       return totalLicensedOVRSsCount;
    }

    @JsonIgnore
    public void setTotalLicensedOVRSsCount(Long value) { 
        this.totalLicensedOVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedAVRSGsCount", readOnly = false)   
    public Long getTotalLicensedUsedAVRSGsCount() {
       return totalLicensedUsedAVRSGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedAVRSGsCount(Long value) { 
        this.totalLicensedUsedAVRSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedAVRSsCount", readOnly = false)   
    public Long getTotalLicensedUsedAVRSsCount() {
       return totalLicensedUsedAVRSsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedAVRSsCount(Long value) { 
        this.totalLicensedUsedAVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedNICsCount", readOnly = false)   
    public Long getTotalLicensedUsedNICsCount() {
       return totalLicensedUsedNICsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedNICsCount(Long value) { 
        this.totalLicensedUsedNICsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedNSGsCount", readOnly = false)   
    public Long getTotalLicensedUsedNSGsCount() {
       return totalLicensedUsedNSGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedNSGsCount(Long value) { 
        this.totalLicensedUsedNSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedOVRSsCount", readOnly = false)   
    public Long getTotalLicensedUsedOVRSsCount() {
       return totalLicensedUsedOVRSsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedOVRSsCount(Long value) { 
        this.totalLicensedUsedOVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedVDFGsCount", readOnly = false)   
    public Long getTotalLicensedUsedVDFGsCount() {
       return totalLicensedUsedVDFGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedVDFGsCount(Long value) { 
        this.totalLicensedUsedVDFGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedVDFsCount", readOnly = false)   
    public Long getTotalLicensedUsedVDFsCount() {
       return totalLicensedUsedVDFsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedVDFsCount(Long value) { 
        this.totalLicensedUsedVDFsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedVMsCount", readOnly = false)   
    public Long getTotalLicensedUsedVMsCount() {
       return totalLicensedUsedVMsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedVMsCount(Long value) { 
        this.totalLicensedUsedVMsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedVRSGsCount", readOnly = false)   
    public Long getTotalLicensedUsedVRSGsCount() {
       return totalLicensedUsedVRSGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedVRSGsCount(Long value) { 
        this.totalLicensedUsedVRSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedUsedVRSsCount", readOnly = false)   
    public Long getTotalLicensedUsedVRSsCount() {
       return totalLicensedUsedVRSsCount;
    }

    @JsonIgnore
    public void setTotalLicensedUsedVRSsCount(Long value) { 
        this.totalLicensedUsedVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedVDFGsCount", readOnly = false)   
    public Long getTotalLicensedVDFGsCount() {
       return totalLicensedVDFGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedVDFGsCount(Long value) { 
        this.totalLicensedVDFGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedVDFsCount", readOnly = false)   
    public Long getTotalLicensedVDFsCount() {
       return totalLicensedVDFsCount;
    }

    @JsonIgnore
    public void setTotalLicensedVDFsCount(Long value) { 
        this.totalLicensedVDFsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedVMsCount", readOnly = false)   
    public Long getTotalLicensedVMsCount() {
       return totalLicensedVMsCount;
    }

    @JsonIgnore
    public void setTotalLicensedVMsCount(Long value) { 
        this.totalLicensedVMsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedVRSGsCount", readOnly = false)   
    public Long getTotalLicensedVRSGsCount() {
       return totalLicensedVRSGsCount;
    }

    @JsonIgnore
    public void setTotalLicensedVRSGsCount(Long value) { 
        this.totalLicensedVRSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalLicensedVRSsCount", readOnly = false)   
    public Long getTotalLicensedVRSsCount() {
       return totalLicensedVRSsCount;
    }

    @JsonIgnore
    public void setTotalLicensedVRSsCount(Long value) { 
        this.totalLicensedVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TotalUsedGatewaysCount", readOnly = false)   
    public Long getTotalUsedGatewaysCount() {
       return totalUsedGatewaysCount;
    }

    @JsonIgnore
    public void setTotalUsedGatewaysCount(Long value) { 
        this.totalUsedGatewaysCount = value;
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.LICENSESTATUS, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.LICENSESTATUS, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LICENSESTATUS, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LICENSESTATUS, getId());
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
        return "LicenseStatus [" + "accumulateLicensesEnabled=" + accumulateLicensesEnabled + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", totalLicensedAVRSGsCount=" + totalLicensedAVRSGsCount + ", totalLicensedAVRSsCount=" + totalLicensedAVRSsCount + ", totalLicensedGatewaysCount=" + totalLicensedGatewaysCount + ", totalLicensedNICsCount=" + totalLicensedNICsCount + ", totalLicensedNSGsCount=" + totalLicensedNSGsCount + ", totalLicensedOVRSsCount=" + totalLicensedOVRSsCount + ", totalLicensedUsedAVRSGsCount=" + totalLicensedUsedAVRSGsCount + ", totalLicensedUsedAVRSsCount=" + totalLicensedUsedAVRSsCount + ", totalLicensedUsedNICsCount=" + totalLicensedUsedNICsCount + ", totalLicensedUsedNSGsCount=" + totalLicensedUsedNSGsCount + ", totalLicensedUsedOVRSsCount=" + totalLicensedUsedOVRSsCount + ", totalLicensedUsedVDFGsCount=" + totalLicensedUsedVDFGsCount + ", totalLicensedUsedVDFsCount=" + totalLicensedUsedVDFsCount + ", totalLicensedUsedVMsCount=" + totalLicensedUsedVMsCount + ", totalLicensedUsedVRSGsCount=" + totalLicensedUsedVRSGsCount + ", totalLicensedUsedVRSsCount=" + totalLicensedUsedVRSsCount + ", totalLicensedVDFGsCount=" + totalLicensedVDFGsCount + ", totalLicensedVDFsCount=" + totalLicensedVDFsCount + ", totalLicensedVMsCount=" + totalLicensedVMsCount + ", totalLicensedVRSGsCount=" + totalLicensedVRSGsCount + ", totalLicensedVRSsCount=" + totalLicensedVRSsCount + ", totalUsedGatewaysCount=" + totalUsedGatewaysCount + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}