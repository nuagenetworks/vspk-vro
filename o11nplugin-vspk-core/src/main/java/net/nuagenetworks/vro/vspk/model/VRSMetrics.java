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
import net.nuagenetworks.vro.vspk.model.enums.VRSMetricsEntityScope;
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

@VsoFinder(name = Constants.VRSMETRICS, datasource = Constants.DATASOURCE, image = Constants.VRSMETRICS_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrsmetrics", resourceName = "vrsmetrics")
public class VRSMetrics extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ALUbr0Status")
    protected Boolean ALUbr0Status;
    
    @JsonProperty(value = "CPUUtilization")
    protected Float CPUUtilization;
    
    @JsonProperty(value = "VRSProcess")
    protected Boolean VRSProcess;
    
    @JsonProperty(value = "VRSVSCStatus")
    protected Boolean VRSVSCStatus;
    
    @JsonProperty(value = "agentName")
    protected String agentName;
    
    @JsonProperty(value = "associatedVCenterHypervisorID")
    protected String associatedVCenterHypervisorID;
    
    @JsonProperty(value = "entityScope")
    protected VRSMetricsEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "jesxmonProcess")
    protected Boolean jesxmonProcess;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "memoryUtilization")
    protected Float memoryUtilization;
    
    @JsonProperty(value = "reDeploy")
    protected Boolean reDeploy;
    
    @JsonProperty(value = "receivingMetrics")
    protected Boolean receivingMetrics;
    
    @VsoConstructor
    public VRSMetrics() {}

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
    @VsoProperty(displayName = "ALUbr0Status", readOnly = false)   
    public Boolean getALUbr0Status() {
       return ALUbr0Status;
    }

    @JsonIgnore
    public void setALUbr0Status(Boolean value) { 
        this.ALUbr0Status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUUtilization", readOnly = false)   
    public Float getCPUUtilization() {
       return CPUUtilization;
    }

    @JsonIgnore
    public void setCPUUtilization(Float value) { 
        this.CPUUtilization = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSProcess", readOnly = false)   
    public Boolean getVRSProcess() {
       return VRSProcess;
    }

    @JsonIgnore
    public void setVRSProcess(Boolean value) { 
        this.VRSProcess = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VRSVSCStatus", readOnly = false)   
    public Boolean getVRSVSCStatus() {
       return VRSVSCStatus;
    }

    @JsonIgnore
    public void setVRSVSCStatus(Boolean value) { 
        this.VRSVSCStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AgentName", readOnly = false)   
    public String getAgentName() {
       return agentName;
    }

    @JsonIgnore
    public void setAgentName(String value) { 
        this.agentName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVCenterHypervisorID", readOnly = false)   
    public String getAssociatedVCenterHypervisorID() {
       return associatedVCenterHypervisorID;
    }

    @JsonIgnore
    public void setAssociatedVCenterHypervisorID(String value) { 
        this.associatedVCenterHypervisorID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public VRSMetricsEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(VRSMetricsEntityScope value) { 
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
    @VsoProperty(displayName = "JesxmonProcess", readOnly = false)   
    public Boolean getJesxmonProcess() {
       return jesxmonProcess;
    }

    @JsonIgnore
    public void setJesxmonProcess(Boolean value) { 
        this.jesxmonProcess = value;
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
    @VsoProperty(displayName = "MemoryUtilization", readOnly = false)   
    public Float getMemoryUtilization() {
       return memoryUtilization;
    }

    @JsonIgnore
    public void setMemoryUtilization(Float value) { 
        this.memoryUtilization = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ReDeploy", readOnly = false)   
    public Boolean getReDeploy() {
       return reDeploy;
    }

    @JsonIgnore
    public void setReDeploy(Boolean value) { 
        this.reDeploy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ReceivingMetrics", readOnly = false)   
    public Boolean getReceivingMetrics() {
       return receivingMetrics;
    }

    @JsonIgnore
    public void setReceivingMetrics(Boolean value) { 
        this.receivingMetrics = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VRSMETRICS, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VRSMETRICS, getId());
        }
    }public String toString() {
        return "VRSMetrics [" + "ALUbr0Status=" + ALUbr0Status + ", CPUUtilization=" + CPUUtilization + ", VRSProcess=" + VRSProcess + ", VRSVSCStatus=" + VRSVSCStatus + ", agentName=" + agentName + ", associatedVCenterHypervisorID=" + associatedVCenterHypervisorID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", jesxmonProcess=" + jesxmonProcess + ", lastUpdatedBy=" + lastUpdatedBy + ", memoryUtilization=" + memoryUtilization + ", reDeploy=" + reDeploy + ", receivingMetrics=" + receivingMetrics + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}