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

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.SSIDConnectionAuthenticationMode;

import net.nuagenetworks.vro.vspk.model.enums.SSIDConnectionEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.SSIDConnectionPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.SSIDConnectionRedirectOption;

import net.nuagenetworks.vro.vspk.model.enums.SSIDConnectionStatus;
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

@VsoFinder(name = Constants.SSIDCONNECTION, datasource = Constants.DATASOURCE, image = Constants.SSIDCONNECTION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ssidconnection", resourceName = "ssidconnections")
public class SSIDConnection extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedCaptivePortalProfileID")
    protected String associatedCaptivePortalProfileID;
    
    @JsonProperty(value = "associatedEgressQOSPolicyID")
    protected String associatedEgressQOSPolicyID;
    
    @JsonProperty(value = "authenticationMode")
    protected SSIDConnectionAuthenticationMode authenticationMode;
    
    @JsonProperty(value = "blackList")
    protected java.util.List<String> blackList;
    
    @JsonProperty(value = "broadcastSSID")
    protected Boolean broadcastSSID;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected SSIDConnectionEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gatewayID")
    protected String gatewayID;
    
    @JsonProperty(value = "genericConfig")
    protected String genericConfig;
    
    @JsonProperty(value = "interfaceName")
    protected String interfaceName;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "passphrase")
    protected String passphrase;
    
    @JsonProperty(value = "permittedAction")
    protected SSIDConnectionPermittedAction permittedAction;
    
    @JsonProperty(value = "readonly")
    protected Boolean readonly;
    
    @JsonProperty(value = "redirectOption")
    protected SSIDConnectionRedirectOption redirectOption;
    
    @JsonProperty(value = "redirectURL")
    protected String redirectURL;
    
    @JsonProperty(value = "restricted")
    protected Boolean restricted;
    
    @JsonProperty(value = "status")
    protected SSIDConnectionStatus status;
    
    @JsonProperty(value = "vlanID")
    protected Long vlanID;
    
    @JsonProperty(value = "vportID")
    protected String vportID;
    
    @JsonProperty(value = "whiteList")
    protected java.util.List<String> whiteList;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public SSIDConnection() {
        alarms = new AlarmsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
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
    @VsoProperty(displayName = "AssociatedCaptivePortalProfileID", readOnly = false)   
    public String getAssociatedCaptivePortalProfileID() {
       return associatedCaptivePortalProfileID;
    }

    @JsonIgnore
    public void setAssociatedCaptivePortalProfileID(String value) { 
        this.associatedCaptivePortalProfileID = value;
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
    @VsoProperty(displayName = "CreationDate", readOnly = false)   
    public String getCreationDate() {
       return creationDate;
    }

    @JsonIgnore
    public void setCreationDate(String value) { 
        this.creationDate = value;
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
    @VsoProperty(displayName = "EmbeddedMetadata", readOnly = false)   
    public java.util.List<String> getEmbeddedMetadata() {
       return embeddedMetadata;
    }

    @JsonIgnore
    public void setEmbeddedMetadata(java.util.List<String> value) { 
        this.embeddedMetadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public SSIDConnectionEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(SSIDConnectionEntityScope value) { 
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
    @VsoProperty(displayName = "GatewayID", readOnly = false)   
    public String getGatewayID() {
       return gatewayID;
    }

    @JsonIgnore
    public void setGatewayID(String value) { 
        this.gatewayID = value;
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
    @VsoProperty(displayName = "LastUpdatedBy", readOnly = false)   
    public String getLastUpdatedBy() {
       return lastUpdatedBy;
    }

    @JsonIgnore
    public void setLastUpdatedBy(String value) { 
        this.lastUpdatedBy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastUpdatedDate", readOnly = false)   
    public String getLastUpdatedDate() {
       return lastUpdatedDate;
    }

    @JsonIgnore
    public void setLastUpdatedDate(String value) { 
        this.lastUpdatedDate = value;
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
    @VsoProperty(displayName = "Owner", readOnly = false)   
    public String getOwner() {
       return owner;
    }

    @JsonIgnore
    public void setOwner(String value) { 
        this.owner = value;
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
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public SSIDConnectionPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(SSIDConnectionPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Readonly", readOnly = false)   
    public Boolean getReadonly() {
       return readonly;
    }

    @JsonIgnore
    public void setReadonly(Boolean value) { 
        this.readonly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectOption", readOnly = false)   
    public SSIDConnectionRedirectOption getRedirectOption() {
       return redirectOption;
    }

    @JsonIgnore
    public void setRedirectOption(SSIDConnectionRedirectOption value) { 
        this.redirectOption = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedirectURL", readOnly = false)   
    public String getRedirectURL() {
       return redirectURL;
    }

    @JsonIgnore
    public void setRedirectURL(String value) { 
        this.redirectURL = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Restricted", readOnly = false)   
    public Boolean getRestricted() {
       return restricted;
    }

    @JsonIgnore
    public void setRestricted(Boolean value) { 
        this.restricted = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public SSIDConnectionStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(SSIDConnectionStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VlanID", readOnly = false)   
    public Long getVlanID() {
       return vlanID;
    }

    @JsonIgnore
    public void setVlanID(Long value) { 
        this.vlanID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VportID", readOnly = false)   
    public String getVportID() {
       return vportID;
    }

    @JsonIgnore
    public void setVportID(String value) { 
        this.vportID = value;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
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
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SSIDCONNECTION, getId());
        }
    }
    
    @VsoMethod
    public void createGlobalMetadata(Session session, GlobalMetadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GLOBALMETADATAS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createMetadata(Session session, Metadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.METADATAS_FETCHER, getId());
        }
    }public String toString() {
        return "SSIDConnection [" + "associatedCaptivePortalProfileID=" + associatedCaptivePortalProfileID + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", authenticationMode=" + authenticationMode + ", blackList=" + blackList + ", broadcastSSID=" + broadcastSSID + ", creationDate=" + creationDate + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", genericConfig=" + genericConfig + ", interfaceName=" + interfaceName + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", name=" + name + ", owner=" + owner + ", passphrase=" + passphrase + ", permittedAction=" + permittedAction + ", readonly=" + readonly + ", redirectOption=" + redirectOption + ", redirectURL=" + redirectURL + ", restricted=" + restricted + ", status=" + status + ", vlanID=" + vlanID + ", vportID=" + vportID + ", whiteList=" + whiteList + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}