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
import net.nuagenetworks.vro.vspk.model.enums.SysmonUplinkConnectionIpsecDtlsState;

import net.nuagenetworks.vro.vspk.model.enums.SysmonUplinkConnectionJsonState;

import net.nuagenetworks.vro.vspk.model.enums.SysmonUplinkConnectionOpenflowState;

import net.nuagenetworks.vro.vspk.model.enums.SysmonUplinkConnectionVxlanDtlsState;
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

@VsoFinder(name = Constants.SYSMONUPLINKCONNECTION, datasource = Constants.DATASOURCE, image = Constants.SYSMONUPLINKCONNECTION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "None", resourceName = "None")
public class SysmonUplinkConnection extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "datapathUplinkId")
    protected String datapathUplinkId;
    
    @JsonProperty(value = "ipsecDtlsState")
    protected SysmonUplinkConnectionIpsecDtlsState ipsecDtlsState;
    
    @JsonProperty(value = "jsonState")
    protected SysmonUplinkConnectionJsonState jsonState;
    
    @JsonProperty(value = "openflowState")
    protected SysmonUplinkConnectionOpenflowState openflowState;
    
    @JsonProperty(value = "privateIP")
    protected String privateIP;
    
    @JsonProperty(value = "publicIP")
    protected String publicIP;
    
    @JsonProperty(value = "vxlanDtlsState")
    protected SysmonUplinkConnectionVxlanDtlsState vxlanDtlsState;
    
    @VsoConstructor
    public SysmonUplinkConnection() {}

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
    @VsoProperty(displayName = "DatapathUplinkId", readOnly = false)   
    public String getDatapathUplinkId() {
       return datapathUplinkId;
    }

    @JsonIgnore
    public void setDatapathUplinkId(String value) { 
        this.datapathUplinkId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IpsecDtlsState", readOnly = false)   
    public SysmonUplinkConnectionIpsecDtlsState getIpsecDtlsState() {
       return ipsecDtlsState;
    }

    @JsonIgnore
    public void setIpsecDtlsState(SysmonUplinkConnectionIpsecDtlsState value) { 
        this.ipsecDtlsState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "JsonState", readOnly = false)   
    public SysmonUplinkConnectionJsonState getJsonState() {
       return jsonState;
    }

    @JsonIgnore
    public void setJsonState(SysmonUplinkConnectionJsonState value) { 
        this.jsonState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OpenflowState", readOnly = false)   
    public SysmonUplinkConnectionOpenflowState getOpenflowState() {
       return openflowState;
    }

    @JsonIgnore
    public void setOpenflowState(SysmonUplinkConnectionOpenflowState value) { 
        this.openflowState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PrivateIP", readOnly = false)   
    public String getPrivateIP() {
       return privateIP;
    }

    @JsonIgnore
    public void setPrivateIP(String value) { 
        this.privateIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PublicIP", readOnly = false)   
    public String getPublicIP() {
       return publicIP;
    }

    @JsonIgnore
    public void setPublicIP(String value) { 
        this.publicIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VxlanDtlsState", readOnly = false)   
    public SysmonUplinkConnectionVxlanDtlsState getVxlanDtlsState() {
       return vxlanDtlsState;
    }

    @JsonIgnore
    public void setVxlanDtlsState(SysmonUplinkConnectionVxlanDtlsState value) { 
        this.vxlanDtlsState = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.SYSMONUPLINKCONNECTION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.SYSMONUPLINKCONNECTION, getId());
        }
    }public String toString() {
        return "SysmonUplinkConnection [" + "datapathUplinkId=" + datapathUplinkId + ", ipsecDtlsState=" + ipsecDtlsState + ", jsonState=" + jsonState + ", openflowState=" + openflowState + ", privateIP=" + privateIP + ", publicIP=" + publicIP + ", vxlanDtlsState=" + vxlanDtlsState + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}