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

@VsoFinder(name = Constants.USERCONTEXT, datasource = Constants.DATASOURCE, image = Constants.USERCONTEXT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "usercontext", resourceName = "usercontexts")
public class UserContext extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "AARFlowStatsInterval")
    protected Long AARFlowStatsInterval;
    
    @JsonProperty(value = "AARProbeStatsInterval")
    protected Long AARProbeStatsInterval;
    
    @JsonProperty(value = "VSSFeatureEnabled")
    protected Boolean VSSFeatureEnabled;
    
    @JsonProperty(value = "VSSStatsInterval")
    protected Long VSSStatsInterval;
    
    @JsonProperty(value = "flowCollectionEnabled")
    protected Boolean flowCollectionEnabled;
    
    @JsonProperty(value = "googleMapsAPIKey")
    protected String googleMapsAPIKey;
    
    @JsonProperty(value = "pageSize")
    protected String pageSize;
    
    @JsonProperty(value = "statisticsEnabled")
    protected Boolean statisticsEnabled;
    
    @JsonProperty(value = "statsTSDBServerAddress")
    protected String statsTSDBServerAddress;
    
    @VsoConstructor
    public UserContext() {}

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
    @VsoProperty(displayName = "AARFlowStatsInterval", readOnly = false)   
    public Long getAARFlowStatsInterval() {
       return AARFlowStatsInterval;
    }

    @JsonIgnore
    public void setAARFlowStatsInterval(Long value) { 
        this.AARFlowStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AARProbeStatsInterval", readOnly = false)   
    public Long getAARProbeStatsInterval() {
       return AARProbeStatsInterval;
    }

    @JsonIgnore
    public void setAARProbeStatsInterval(Long value) { 
        this.AARProbeStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSSFeatureEnabled", readOnly = false)   
    public Boolean getVSSFeatureEnabled() {
       return VSSFeatureEnabled;
    }

    @JsonIgnore
    public void setVSSFeatureEnabled(Boolean value) { 
        this.VSSFeatureEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VSSStatsInterval", readOnly = false)   
    public Long getVSSStatsInterval() {
       return VSSStatsInterval;
    }

    @JsonIgnore
    public void setVSSStatsInterval(Long value) { 
        this.VSSStatsInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FlowCollectionEnabled", readOnly = false)   
    public Boolean getFlowCollectionEnabled() {
       return flowCollectionEnabled;
    }

    @JsonIgnore
    public void setFlowCollectionEnabled(Boolean value) { 
        this.flowCollectionEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GoogleMapsAPIKey", readOnly = false)   
    public String getGoogleMapsAPIKey() {
       return googleMapsAPIKey;
    }

    @JsonIgnore
    public void setGoogleMapsAPIKey(String value) { 
        this.googleMapsAPIKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PageSize", readOnly = false)   
    public String getPageSize() {
       return pageSize;
    }

    @JsonIgnore
    public void setPageSize(String value) { 
        this.pageSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatisticsEnabled", readOnly = false)   
    public Boolean getStatisticsEnabled() {
       return statisticsEnabled;
    }

    @JsonIgnore
    public void setStatisticsEnabled(Boolean value) { 
        this.statisticsEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsTSDBServerAddress", readOnly = false)   
    public String getStatsTSDBServerAddress() {
       return statsTSDBServerAddress;
    }

    @JsonIgnore
    public void setStatsTSDBServerAddress(String value) { 
        this.statsTSDBServerAddress = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.USERCONTEXT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.USERCONTEXT, getId());
        }
    }public String toString() {
        return "UserContext [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", VSSFeatureEnabled=" + VSSFeatureEnabled + ", VSSStatsInterval=" + VSSStatsInterval + ", flowCollectionEnabled=" + flowCollectionEnabled + ", googleMapsAPIKey=" + googleMapsAPIKey + ", pageSize=" + pageSize + ", statisticsEnabled=" + statisticsEnabled + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}