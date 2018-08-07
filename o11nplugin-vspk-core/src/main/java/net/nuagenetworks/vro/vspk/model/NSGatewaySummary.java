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
import net.nuagenetworks.vro.vspk.model.enums.NSGatewaySummaryBootstrapStatus;
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

@VsoFinder(name = Constants.NSGATEWAYSUMMARY, datasource = Constants.DATASOURCE, image = Constants.NSGATEWAYSUMMARY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgatewayssummary", resourceName = "nsgatewayssummaries")
public class NSGatewaySummary extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "bootstrapStatus")
    protected NSGatewaySummaryBootstrapStatus bootstrapStatus;
    
    @JsonProperty(value = "country")
    protected String country;
    
    @JsonProperty(value = "criticalAlarmsCount")
    protected Long criticalAlarmsCount;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "gatewayID")
    protected String gatewayID;
    
    @JsonProperty(value = "gatewayName")
    protected String gatewayName;
    
    @JsonProperty(value = "infoAlarmsCount")
    protected String infoAlarmsCount;
    
    @JsonProperty(value = "latitude")
    protected Float latitude;
    
    @JsonProperty(value = "locality")
    protected String locality;
    
    @JsonProperty(value = "longitude")
    protected Float longitude;
    
    @JsonProperty(value = "majorAlarmsCount")
    protected Long majorAlarmsCount;
    
    @JsonProperty(value = "minorAlarmsCount")
    protected Long minorAlarmsCount;
    
    @JsonProperty(value = "nsgVersion")
    protected String nsgVersion;
    
    @JsonProperty(value = "state")
    protected String state;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @JsonProperty(value = "timeZoneID")
    protected String timeZoneID;
    
    @VsoConstructor
    public NSGatewaySummary() {}

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
    @VsoProperty(displayName = "Address", readOnly = false)   
    public String getAddress() {
       return address;
    }

    @JsonIgnore
    public void setAddress(String value) { 
        this.address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapStatus", readOnly = false)   
    public NSGatewaySummaryBootstrapStatus getBootstrapStatus() {
       return bootstrapStatus;
    }

    @JsonIgnore
    public void setBootstrapStatus(NSGatewaySummaryBootstrapStatus value) { 
        this.bootstrapStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Country", readOnly = false)   
    public String getCountry() {
       return country;
    }

    @JsonIgnore
    public void setCountry(String value) { 
        this.country = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CriticalAlarmsCount", readOnly = false)   
    public Long getCriticalAlarmsCount() {
       return criticalAlarmsCount;
    }

    @JsonIgnore
    public void setCriticalAlarmsCount(Long value) { 
        this.criticalAlarmsCount = value;
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
    @VsoProperty(displayName = "GatewayID", readOnly = false)   
    public String getGatewayID() {
       return gatewayID;
    }

    @JsonIgnore
    public void setGatewayID(String value) { 
        this.gatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayName", readOnly = false)   
    public String getGatewayName() {
       return gatewayName;
    }

    @JsonIgnore
    public void setGatewayName(String value) { 
        this.gatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfoAlarmsCount", readOnly = false)   
    public String getInfoAlarmsCount() {
       return infoAlarmsCount;
    }

    @JsonIgnore
    public void setInfoAlarmsCount(String value) { 
        this.infoAlarmsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Latitude", readOnly = false)   
    public Float getLatitude() {
       return latitude;
    }

    @JsonIgnore
    public void setLatitude(Float value) { 
        this.latitude = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Locality", readOnly = false)   
    public String getLocality() {
       return locality;
    }

    @JsonIgnore
    public void setLocality(String value) { 
        this.locality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Longitude", readOnly = false)   
    public Float getLongitude() {
       return longitude;
    }

    @JsonIgnore
    public void setLongitude(Float value) { 
        this.longitude = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MajorAlarmsCount", readOnly = false)   
    public Long getMajorAlarmsCount() {
       return majorAlarmsCount;
    }

    @JsonIgnore
    public void setMajorAlarmsCount(Long value) { 
        this.majorAlarmsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MinorAlarmsCount", readOnly = false)   
    public Long getMinorAlarmsCount() {
       return minorAlarmsCount;
    }

    @JsonIgnore
    public void setMinorAlarmsCount(Long value) { 
        this.minorAlarmsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NsgVersion", readOnly = false)   
    public String getNsgVersion() {
       return nsgVersion;
    }

    @JsonIgnore
    public void setNsgVersion(String value) { 
        this.nsgVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "State", readOnly = false)   
    public String getState() {
       return state;
    }

    @JsonIgnore
    public void setState(String value) { 
        this.state = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemID", readOnly = false)   
    public String getSystemID() {
       return systemID;
    }

    @JsonIgnore
    public void setSystemID(String value) { 
        this.systemID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TimeZoneID", readOnly = false)   
    public String getTimeZoneID() {
       return timeZoneID;
    }

    @JsonIgnore
    public void setTimeZoneID(String value) { 
        this.timeZoneID = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAYSUMMARY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.NSGATEWAYSUMMARY, getId());
        }
    }public String toString() {
        return "NSGatewaySummary [" + "address=" + address + ", bootstrapStatus=" + bootstrapStatus + ", country=" + country + ", criticalAlarmsCount=" + criticalAlarmsCount + ", enterpriseID=" + enterpriseID + ", gatewayID=" + gatewayID + ", gatewayName=" + gatewayName + ", infoAlarmsCount=" + infoAlarmsCount + ", latitude=" + latitude + ", locality=" + locality + ", longitude=" + longitude + ", majorAlarmsCount=" + majorAlarmsCount + ", minorAlarmsCount=" + minorAlarmsCount + ", nsgVersion=" + nsgVersion + ", state=" + state + ", systemID=" + systemID + ", timeZoneID=" + timeZoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}