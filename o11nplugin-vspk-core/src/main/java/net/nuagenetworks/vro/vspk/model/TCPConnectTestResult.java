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

@VsoFinder(name = Constants.TCPCONNECTTESTRESULT, datasource = Constants.DATASOURCE, image = Constants.TCPCONNECTTESTRESULT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "None", resourceName = "None")
public class TCPConnectTestResult extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "averageRoundTripTime")
    protected Float averageRoundTripTime;
    
    @JsonProperty(value = "connectionAttempts")
    protected Long connectionAttempts;
    
    @JsonProperty(value = "failedAttempts")
    protected Long failedAttempts;
    
    @JsonProperty(value = "failedPercent")
    protected Float failedPercent;
    
    @JsonProperty(value = "maximumRoundTripTime")
    protected Float maximumRoundTripTime;
    
    @JsonProperty(value = "minimumRoundTripTime")
    protected Float minimumRoundTripTime;
    
    @JsonProperty(value = "successfulConnections")
    protected Long successfulConnections;
    
    @VsoConstructor
    public TCPConnectTestResult() {}

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
    @VsoProperty(displayName = "AverageRoundTripTime", readOnly = false)   
    public Float getAverageRoundTripTime() {
       return averageRoundTripTime;
    }

    @JsonIgnore
    public void setAverageRoundTripTime(Float value) { 
        this.averageRoundTripTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConnectionAttempts", readOnly = false)   
    public Long getConnectionAttempts() {
       return connectionAttempts;
    }

    @JsonIgnore
    public void setConnectionAttempts(Long value) { 
        this.connectionAttempts = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FailedAttempts", readOnly = false)   
    public Long getFailedAttempts() {
       return failedAttempts;
    }

    @JsonIgnore
    public void setFailedAttempts(Long value) { 
        this.failedAttempts = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FailedPercent", readOnly = false)   
    public Float getFailedPercent() {
       return failedPercent;
    }

    @JsonIgnore
    public void setFailedPercent(Float value) { 
        this.failedPercent = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MaximumRoundTripTime", readOnly = false)   
    public Float getMaximumRoundTripTime() {
       return maximumRoundTripTime;
    }

    @JsonIgnore
    public void setMaximumRoundTripTime(Float value) { 
        this.maximumRoundTripTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MinimumRoundTripTime", readOnly = false)   
    public Float getMinimumRoundTripTime() {
       return minimumRoundTripTime;
    }

    @JsonIgnore
    public void setMinimumRoundTripTime(Float value) { 
        this.minimumRoundTripTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SuccessfulConnections", readOnly = false)   
    public Long getSuccessfulConnections() {
       return successfulConnections;
    }

    @JsonIgnore
    public void setSuccessfulConnections(Long value) { 
        this.successfulConnections = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.TCPCONNECTTESTRESULT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.TCPCONNECTTESTRESULT, getId());
        }
    }public String toString() {
        return "TCPConnectTestResult [" + "averageRoundTripTime=" + averageRoundTripTime + ", connectionAttempts=" + connectionAttempts + ", failedAttempts=" + failedAttempts + ", failedPercent=" + failedPercent + ", maximumRoundTripTime=" + maximumRoundTripTime + ", minimumRoundTripTime=" + minimumRoundTripTime + ", successfulConnections=" + successfulConnections + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}