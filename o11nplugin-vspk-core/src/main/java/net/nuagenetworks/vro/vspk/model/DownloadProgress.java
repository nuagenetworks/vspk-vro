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

@VsoFinder(name = Constants.DOWNLOADPROGRESS, datasource = Constants.DATASOURCE, image = Constants.DOWNLOADPROGRESS_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "None", resourceName = "None")
public class DownloadProgress extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "averageSpeed")
    protected Long averageSpeed;
    
    @JsonProperty(value = "currentSpeed")
    protected Long currentSpeed;
    
    @JsonProperty(value = "imageFileName")
    protected String imageFileName;
    
    @JsonProperty(value = "imageVersion")
    protected String imageVersion;
    
    @JsonProperty(value = "percentage")
    protected Long percentage;
    
    @JsonProperty(value = "startTime")
    protected Long startTime;
    
    @JsonProperty(value = "timeLeft")
    protected String timeLeft;
    
    @JsonProperty(value = "timeSpent")
    protected String timeSpent;
    
    @VsoConstructor
    public DownloadProgress() {}

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
    @VsoProperty(displayName = "AverageSpeed", readOnly = false)   
    public Long getAverageSpeed() {
       return averageSpeed;
    }

    @JsonIgnore
    public void setAverageSpeed(Long value) { 
        this.averageSpeed = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CurrentSpeed", readOnly = false)   
    public Long getCurrentSpeed() {
       return currentSpeed;
    }

    @JsonIgnore
    public void setCurrentSpeed(Long value) { 
        this.currentSpeed = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ImageFileName", readOnly = false)   
    public String getImageFileName() {
       return imageFileName;
    }

    @JsonIgnore
    public void setImageFileName(String value) { 
        this.imageFileName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ImageVersion", readOnly = false)   
    public String getImageVersion() {
       return imageVersion;
    }

    @JsonIgnore
    public void setImageVersion(String value) { 
        this.imageVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Percentage", readOnly = false)   
    public Long getPercentage() {
       return percentage;
    }

    @JsonIgnore
    public void setPercentage(Long value) { 
        this.percentage = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StartTime", readOnly = false)   
    public Long getStartTime() {
       return startTime;
    }

    @JsonIgnore
    public void setStartTime(Long value) { 
        this.startTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TimeLeft", readOnly = false)   
    public String getTimeLeft() {
       return timeLeft;
    }

    @JsonIgnore
    public void setTimeLeft(String value) { 
        this.timeLeft = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TimeSpent", readOnly = false)   
    public String getTimeSpent() {
       return timeSpent;
    }

    @JsonIgnore
    public void setTimeSpent(String value) { 
        this.timeSpent = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.DOWNLOADPROGRESS, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.DOWNLOADPROGRESS, getId());
        }
    }public String toString() {
        return "DownloadProgress [" + "averageSpeed=" + averageSpeed + ", currentSpeed=" + currentSpeed + ", imageFileName=" + imageFileName + ", imageVersion=" + imageVersion + ", percentage=" + percentage + ", startTime=" + startTime + ", timeLeft=" + timeLeft + ", timeSpent=" + timeSpent + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}