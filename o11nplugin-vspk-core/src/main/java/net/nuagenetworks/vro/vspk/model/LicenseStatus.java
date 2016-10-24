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

package net.nuagenetworks.vro.vspk.model;import net.nuagenetworks.bambou.RestException;
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

@VsoFinder(name = Constants.LICENSESTATUS, datasource = Constants.DATASOURCE, image = Constants.LICENSESTATUS_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "licensestatus", resourceName = "licensestatus")
public class LicenseStatus extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "totalLicensedNICsCount")
    protected Long totalLicensedNICsCount;
    
    @JsonProperty(value = "totalLicensedNSGsCount")
    protected Long totalLicensedNSGsCount;
    
    @JsonProperty(value = "totalLicensedUsedNICsCount")
    protected Long totalLicensedUsedNICsCount;
    
    @JsonProperty(value = "totalLicensedUsedNSGsCount")
    protected Long totalLicensedUsedNSGsCount;
    
    @JsonProperty(value = "totalLicensedUsedVMsCount")
    protected Long totalLicensedUsedVMsCount;
    
    @JsonProperty(value = "totalLicensedUsedVRSGsCount")
    protected Long totalLicensedUsedVRSGsCount;
    
    @JsonProperty(value = "totalLicensedUsedVRSsCount")
    protected Long totalLicensedUsedVRSsCount;
    
    @JsonProperty(value = "totalLicensedVMsCount")
    protected Long totalLicensedVMsCount;
    
    @JsonProperty(value = "totalLicensedVRSGsCount")
    protected Long totalLicensedVRSGsCount;
    
    @JsonProperty(value = "totalLicensedVRSsCount")
    protected Long totalLicensedVRSsCount;
    
    @VsoConstructor
    public LicenseStatus() {}

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
    }public String toString() {
        return "LicenseStatus [" + "totalLicensedNICsCount=" + totalLicensedNICsCount + ", totalLicensedNSGsCount=" + totalLicensedNSGsCount + ", totalLicensedUsedNICsCount=" + totalLicensedUsedNICsCount + ", totalLicensedUsedNSGsCount=" + totalLicensedUsedNSGsCount + ", totalLicensedUsedVMsCount=" + totalLicensedUsedVMsCount + ", totalLicensedUsedVRSGsCount=" + totalLicensedUsedVRSGsCount + ", totalLicensedUsedVRSsCount=" + totalLicensedUsedVRSsCount + ", totalLicensedVMsCount=" + totalLicensedVMsCount + ", totalLicensedVRSGsCount=" + totalLicensedVRSGsCount + ", totalLicensedVRSsCount=" + totalLicensedVRSsCount + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}