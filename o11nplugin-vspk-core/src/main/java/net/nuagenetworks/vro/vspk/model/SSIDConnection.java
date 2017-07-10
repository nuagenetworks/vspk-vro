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
import net.nuagenetworks.vro.vspk.model.fetchers.AlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.SSIDConnectionAuthenticationMode;
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

@VsoFinder(name = Constants.SSIDCONNECTION, datasource = Constants.DATASOURCE, image = Constants.SSIDCONNECTION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ssidconnection", resourceName = "ssidconnections")
public class SSIDConnection extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedEgressQOSPolicyID")
    protected String associatedEgressQOSPolicyID;
    
    @JsonProperty(value = "authenticationMode")
    protected SSIDConnectionAuthenticationMode authenticationMode;
    
    @JsonProperty(value = "blackList")
    protected java.util.List<String> blackList;
    
    @JsonProperty(value = "broadcastSSID")
    protected Boolean broadcastSSID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "genericConfig")
    protected String genericConfig;
    
    @JsonProperty(value = "interfaceName")
    protected String interfaceName;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "passphrase")
    protected String passphrase;
    
    @JsonProperty(value = "whiteList")
    protected java.util.List<String> whiteList;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @VsoConstructor
    public SSIDConnection() {
        alarms = new AlarmsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }@VsoProperty(displayName = "RestName", readOnly = true)
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
    @VsoProperty(displayName = "AssociatedEgressQOSPolicyID", readOnly = false)   
    public String getAssociatedEgressQOSPolicyID() {
       return associatedEgressQOSPolicyID;
    }

    @JsonIgnore
    public void setAssociatedEgressQOSPolicyID(String value) { 
        this.associatedEgressQOSPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuthenticationMode", readOnly = false)   
    public SSIDConnectionAuthenticationMode getAuthenticationMode() {
       return authenticationMode;
    }

    @JsonIgnore
    public void setAuthenticationMode(SSIDConnectionAuthenticationMode value) { 
        this.authenticationMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BlackList", readOnly = false)   
    public java.util.List<String> getBlackList() {
       return blackList;
    }

    @JsonIgnore
    public void setBlackList(java.util.List<String> value) { 
        this.blackList = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BroadcastSSID", readOnly = false)   
    public Boolean getBroadcastSSID() {
       return broadcastSSID;
    }

    @JsonIgnore
    public void setBroadcastSSID(Boolean value) { 
        this.broadcastSSID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GenericConfig", readOnly = false)   
    public String getGenericConfig() {
       return genericConfig;
    }

    @JsonIgnore
    public void setGenericConfig(String value) { 
        this.genericConfig = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InterfaceName", readOnly = false)   
    public String getInterfaceName() {
       return interfaceName;
    }

    @JsonIgnore
    public void setInterfaceName(String value) { 
        this.interfaceName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Passphrase", readOnly = false)   
    public String getPassphrase() {
       return passphrase;
    }

    @JsonIgnore
    public void setPassphrase(String value) { 
        this.passphrase = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WhiteList", readOnly = false)   
    public java.util.List<String> getWhiteList() {
       return whiteList;
    }

    @JsonIgnore
    public void setWhiteList(java.util.List<String> value) { 
        this.whiteList = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.SSIDCONNECTION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.SSIDCONNECTION, getId());
        }
    }public String toString() {
        return "SSIDConnection [" + "associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", authenticationMode=" + authenticationMode + ", blackList=" + blackList + ", broadcastSSID=" + broadcastSSID + ", description=" + description + ", genericConfig=" + genericConfig + ", interfaceName=" + interfaceName + ", name=" + name + ", passphrase=" + passphrase + ", whiteList=" + whiteList + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}