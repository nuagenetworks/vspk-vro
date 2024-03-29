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
import net.nuagenetworks.vro.vspk.model.fetchers.DdnsconfigbindingsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.DdnsconfigConnectionStatus;

import net.nuagenetworks.vro.vspk.model.enums.DdnsconfigProviderName;
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

@VsoFinder(name = Constants.DDNSCONFIG, datasource = Constants.DATASOURCE, image = Constants.DDNSCONFIG_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.DDNSCONFIGBINDINGS_FETCHER, type = Constants.DDNSCONFIGBINDINGS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ddnsconfig", resourceName = "ddnsconfigs")
public class Ddnsconfig extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "assocGatewayId")
    protected String assocGatewayId;
    
    @JsonProperty(value = "connectionStatus")
    protected DdnsconfigConnectionStatus connectionStatus;
    
    @JsonProperty(value = "enableDDNSConfig")
    protected Boolean enableDDNSConfig;
    
    @JsonProperty(value = "hostname")
    protected String hostname;
    
    @JsonProperty(value = "password")
    protected String password;
    
    @JsonProperty(value = "providerName")
    protected DdnsconfigProviderName providerName;
    
    @JsonProperty(value = "username")
    protected String username;
    
    @JsonIgnore
    private DdnsconfigbindingsFetcher ddnsconfigbindings;
    
    @VsoConstructor
    public Ddnsconfig() {
        ddnsconfigbindings = new DdnsconfigbindingsFetcher(this);
        }

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
    @VsoProperty(displayName = "AssocGatewayId", readOnly = false)   
    public String getAssocGatewayId() {
       return assocGatewayId;
    }

    @JsonIgnore
    public void setAssocGatewayId(String value) { 
        this.assocGatewayId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ConnectionStatus", readOnly = false)   
    public DdnsconfigConnectionStatus getConnectionStatus() {
       return connectionStatus;
    }

    @JsonIgnore
    public void setConnectionStatus(DdnsconfigConnectionStatus value) { 
        this.connectionStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnableDDNSConfig", readOnly = false)   
    public Boolean getEnableDDNSConfig() {
       return enableDDNSConfig;
    }

    @JsonIgnore
    public void setEnableDDNSConfig(Boolean value) { 
        this.enableDDNSConfig = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Hostname", readOnly = false)   
    public String getHostname() {
       return hostname;
    }

    @JsonIgnore
    public void setHostname(String value) { 
        this.hostname = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Password", readOnly = false)   
    public String getPassword() {
       return password;
    }

    @JsonIgnore
    public void setPassword(String value) { 
        this.password = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProviderName", readOnly = false)   
    public DdnsconfigProviderName getProviderName() {
       return providerName;
    }

    @JsonIgnore
    public void setProviderName(DdnsconfigProviderName value) { 
        this.providerName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Username", readOnly = false)   
    public String getUsername() {
       return username;
    }

    @JsonIgnore
    public void setUsername(String value) { 
        this.username = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Ddnsconfigbindings", readOnly = true)   
    public DdnsconfigbindingsFetcher getDdnsconfigbindings() {
        return ddnsconfigbindings;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.DDNSCONFIG, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.DDNSCONFIG, getId());
        }
    }
    @VsoMethod
    public void createDdnsconfigbinding(Session session, Ddnsconfigbinding childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DDNSCONFIGBINDINGS_FETCHER, getId());
        }
    }public String toString() {
        return "Ddnsconfig [" + "assocGatewayId=" + assocGatewayId + ", connectionStatus=" + connectionStatus + ", enableDDNSConfig=" + enableDDNSConfig + ", hostname=" + hostname + ", password=" + password + ", providerName=" + providerName + ", username=" + username + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}