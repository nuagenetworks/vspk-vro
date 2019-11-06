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

@VsoFinder(name = Constants.NSGATEWAYMONITOR, datasource = Constants.DATASOURCE, image = Constants.NSGATEWAYMONITOR_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgatewaysmonitor", resourceName = "nsgatewaysmonitors")
public class NSGatewayMonitor extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "controllervrslinks")
    protected java.util.List<String> controllervrslinks;
    
    @JsonProperty(value = "nsginfo")
    protected Object nsginfo;
    
    @JsonProperty(value = "nsgstate")
    protected Object nsgstate;
    
    @JsonProperty(value = "nsgsummary")
    protected Object nsgsummary;
    
    @JsonProperty(value = "vrsinfo")
    protected Object vrsinfo;
    
    @JsonProperty(value = "vscs")
    protected java.util.List<String> vscs;
    
    @VsoConstructor
    public NSGatewayMonitor() {}

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
    @VsoProperty(displayName = "Controllervrslinks", readOnly = false)   
    public java.util.List<String> getControllervrslinks() {
       return controllervrslinks;
    }

    @JsonIgnore
    public void setControllervrslinks(java.util.List<String> value) { 
        this.controllervrslinks = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Nsginfo", readOnly = false)   
    public Object getNsginfo() {
       return nsginfo;
    }

    @JsonIgnore
    public void setNsginfo(Object value) { 
        this.nsginfo = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Nsgstate", readOnly = false)   
    public Object getNsgstate() {
       return nsgstate;
    }

    @JsonIgnore
    public void setNsgstate(Object value) { 
        this.nsgstate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Nsgsummary", readOnly = false)   
    public Object getNsgsummary() {
       return nsgsummary;
    }

    @JsonIgnore
    public void setNsgsummary(Object value) { 
        this.nsgsummary = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vrsinfo", readOnly = false)   
    public Object getVrsinfo() {
       return vrsinfo;
    }

    @JsonIgnore
    public void setVrsinfo(Object value) { 
        this.vrsinfo = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vscs", readOnly = false)   
    public java.util.List<String> getVscs() {
       return vscs;
    }

    @JsonIgnore
    public void setVscs(java.util.List<String> value) { 
        this.vscs = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGATEWAYMONITOR, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.NSGATEWAYMONITOR, getId());
        }
    }public String toString() {
        return "NSGatewayMonitor [" + "controllervrslinks=" + controllervrslinks + ", nsginfo=" + nsginfo + ", nsgstate=" + nsgstate + ", nsgsummary=" + nsgsummary + ", vrsinfo=" + vrsinfo + ", vscs=" + vscs + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}