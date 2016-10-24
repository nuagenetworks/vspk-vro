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
import net.nuagenetworks.vro.vspk.model.enums.VRSRedeploymentpolicyEntityScope;
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

@VsoFinder(name = Constants.VRSREDEPLOYMENTPOLICY, datasource = Constants.DATASOURCE, image = Constants.VRSREDEPLOYMENTPOLICY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrsredeploymentpolicy", resourceName = "vrsredeploymentpolicies")
public class VRSRedeploymentpolicy extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ALUbr0StatusRedeploymentEnabled")
    protected Boolean ALUbr0StatusRedeploymentEnabled;
    
    @JsonProperty(value = "CPUUtilizationRedeploymentEnabled")
    protected Boolean CPUUtilizationRedeploymentEnabled;
    
    @JsonProperty(value = "CPUUtilizationThreshold")
    protected Float CPUUtilizationThreshold;
    
    @JsonProperty(value = "VRSCorrectiveActionDelay")
    protected Long VRSCorrectiveActionDelay;
    
    @JsonProperty(value = "VRSProcessRedeploymentEnabled")
    protected Boolean VRSProcessRedeploymentEnabled;
    
    @JsonProperty(value = "VRSVSCStatusRedeploymentEnabled")
    protected Boolean VRSVSCStatusRedeploymentEnabled;
    
    @JsonProperty(value = "deploymentCountThreshold")
    protected Long deploymentCountThreshold;
    
    @JsonProperty(value = "entityScope")
    protected VRSRedeploymentpolicyEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "jesxmonProcessRedeploymentEnabled")
    protected Boolean jesxmonProcessRedeploymentEnabled;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "memoryUtilizationRedeploymentEnabled")
    protected Boolean memoryUtilizationRedeploymentEnabled;
    
    @JsonProperty(value = "memoryUtilizationThreshold")
    protected Float memoryUtilizationThreshold;
    
    @JsonProperty(value = "redeploymentDelay")
    protected Long redeploymentDelay;
    
    @VsoConstructor
    public VRSRedeploymentpolicy() {}

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
    @VsoProperty(displayName = "ALUbr0StatusRedeploymentEnabled", readOnly = false)   
    public Boolean getALUbr0StatusRedeploymentEnabled() {
       return ALUbr0StatusRedeploymentEnabled;
    }

    @JsonIgnore
    public void setALUbr0StatusRedeploymentEnabled(Boolean value) { 
        this.ALUbr0StatusRedeploymentEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUUtilizationRedeploymentEnabled", readOnly = false)   
    public Boolean getCPUUtilizationRedeploymentEnabled() {
       return CPUUtilizationRedeploymentEnabled;
    }

    @JsonIgnore
    public void setCPUUtilizationRedeploymentEnabled(Boolean value) { 
        this.CPUUtilizationRedeploymentEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUUtilizationThreshold", readOnly = false)   
    public Float getCPUUtilizationThreshold() {
       return CPUUtilizationThreshold;
    }

    @JsonIgnore
    public void setCPUUtilizationThreshold(Float value) { 
        this.CPUUtilizationThreshold = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSCorrectiveActionDelay", readOnly = false)   
    public Long getVRSCorrectiveActionDelay() {
       return VRSCorrectiveActionDelay;
    }

    @JsonIgnore
    public void setVRSCorrectiveActionDelay(Long value) { 
        this.VRSCorrectiveActionDelay = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSProcessRedeploymentEnabled", readOnly = false)   
    public Boolean getVRSProcessRedeploymentEnabled() {
       return VRSProcessRedeploymentEnabled;
    }

    @JsonIgnore
    public void setVRSProcessRedeploymentEnabled(Boolean value) { 
        this.VRSProcessRedeploymentEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSVSCStatusRedeploymentEnabled", readOnly = false)   
    public Boolean getVRSVSCStatusRedeploymentEnabled() {
       return VRSVSCStatusRedeploymentEnabled;
    }

    @JsonIgnore
    public void setVRSVSCStatusRedeploymentEnabled(Boolean value) { 
        this.VRSVSCStatusRedeploymentEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeploymentCountThreshold", readOnly = false)   
    public Long getDeploymentCountThreshold() {
       return deploymentCountThreshold;
    }

    @JsonIgnore
    public void setDeploymentCountThreshold(Long value) { 
        this.deploymentCountThreshold = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VRSRedeploymentpolicyEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VRSRedeploymentpolicyEntityScope value) { 
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
    @VsoProperty(displayName = "JesxmonProcessRedeploymentEnabled", readOnly = false)   
    public Boolean getJesxmonProcessRedeploymentEnabled() {
       return jesxmonProcessRedeploymentEnabled;
    }

    @JsonIgnore
    public void setJesxmonProcessRedeploymentEnabled(Boolean value) { 
        this.jesxmonProcessRedeploymentEnabled = value;
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
    @VsoProperty(displayName = "MemoryUtilizationRedeploymentEnabled", readOnly = false)   
    public Boolean getMemoryUtilizationRedeploymentEnabled() {
       return memoryUtilizationRedeploymentEnabled;
    }

    @JsonIgnore
    public void setMemoryUtilizationRedeploymentEnabled(Boolean value) { 
        this.memoryUtilizationRedeploymentEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MemoryUtilizationThreshold", readOnly = false)   
    public Float getMemoryUtilizationThreshold() {
       return memoryUtilizationThreshold;
    }

    @JsonIgnore
    public void setMemoryUtilizationThreshold(Float value) { 
        this.memoryUtilizationThreshold = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedeploymentDelay", readOnly = false)   
    public Long getRedeploymentDelay() {
       return redeploymentDelay;
    }

    @JsonIgnore
    public void setRedeploymentDelay(Long value) { 
        this.redeploymentDelay = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VRSREDEPLOYMENTPOLICY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VRSREDEPLOYMENTPOLICY, getId());
        }
    }public String toString() {
        return "VRSRedeploymentpolicy [" + "ALUbr0StatusRedeploymentEnabled=" + ALUbr0StatusRedeploymentEnabled + ", CPUUtilizationRedeploymentEnabled=" + CPUUtilizationRedeploymentEnabled + ", CPUUtilizationThreshold=" + CPUUtilizationThreshold + ", VRSCorrectiveActionDelay=" + VRSCorrectiveActionDelay + ", VRSProcessRedeploymentEnabled=" + VRSProcessRedeploymentEnabled + ", VRSVSCStatusRedeploymentEnabled=" + VRSVSCStatusRedeploymentEnabled + ", deploymentCountThreshold=" + deploymentCountThreshold + ", entityScope=" + entityScope + ", externalID=" + externalID + ", jesxmonProcessRedeploymentEnabled=" + jesxmonProcessRedeploymentEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", memoryUtilizationRedeploymentEnabled=" + memoryUtilizationRedeploymentEnabled + ", memoryUtilizationThreshold=" + memoryUtilizationThreshold + ", redeploymentDelay=" + redeploymentDelay + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}