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
import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.OSPFInterfaceAdminState;

import net.nuagenetworks.vro.vspk.model.enums.OSPFInterfaceAuthenticationType;

import net.nuagenetworks.vro.vspk.model.enums.OSPFInterfaceEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.OSPFInterfaceInterfaceType;
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

@VsoFinder(name = Constants.OSPFINTERFACE, datasource = Constants.DATASOURCE, image = Constants.OSPFINTERFACE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ospfinterface", resourceName = "ospfinterfaces")
public class OSPFInterface extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "adminState")
    protected OSPFInterfaceAdminState adminState;
    
    @JsonProperty(value = "associatedSubnetID")
    protected String associatedSubnetID;
    
    @JsonProperty(value = "authenticationKey")
    protected String authenticationKey;
    
    @JsonProperty(value = "authenticationType")
    protected OSPFInterfaceAuthenticationType authenticationType;
    
    @JsonProperty(value = "deadInterval")
    protected Long deadInterval;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "entityScope")
    protected OSPFInterfaceEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "helloInterval")
    protected Long helloInterval;
    
    @JsonProperty(value = "interfaceType")
    protected OSPFInterfaceInterfaceType interfaceType;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "messageDigestKeys")
    protected java.util.List<String> messageDigestKeys;
    
    @JsonProperty(value = "metric")
    protected Long metric;
    
    @JsonProperty(value = "mtu")
    protected Long mtu;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "passiveEnabled")
    protected Boolean passiveEnabled;
    
    @JsonProperty(value = "priority")
    protected Long priority;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public OSPFInterface() {
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
    @VsoProperty(displayName = "AdminState", readOnly = false)   
    public OSPFInterfaceAdminState getAdminState() {
       return adminState;
    }

    @JsonIgnore
    public void setAdminState(OSPFInterfaceAdminState value) { 
        this.adminState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSubnetID", readOnly = false)   
    public String getAssociatedSubnetID() {
       return associatedSubnetID;
    }

    @JsonIgnore
    public void setAssociatedSubnetID(String value) { 
        this.associatedSubnetID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuthenticationKey", readOnly = false)   
    public String getAuthenticationKey() {
       return authenticationKey;
    }

    @JsonIgnore
    public void setAuthenticationKey(String value) { 
        this.authenticationKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuthenticationType", readOnly = false)   
    public OSPFInterfaceAuthenticationType getAuthenticationType() {
       return authenticationType;
    }

    @JsonIgnore
    public void setAuthenticationType(OSPFInterfaceAuthenticationType value) { 
        this.authenticationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeadInterval", readOnly = false)   
    public Long getDeadInterval() {
       return deadInterval;
    }

    @JsonIgnore
    public void setDeadInterval(Long value) { 
        this.deadInterval = value;
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
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public OSPFInterfaceEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(OSPFInterfaceEntityScope value) { 
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
    @VsoProperty(displayName = "HelloInterval", readOnly = false)   
    public Long getHelloInterval() {
       return helloInterval;
    }

    @JsonIgnore
    public void setHelloInterval(Long value) { 
        this.helloInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InterfaceType", readOnly = false)   
    public OSPFInterfaceInterfaceType getInterfaceType() {
       return interfaceType;
    }

    @JsonIgnore
    public void setInterfaceType(OSPFInterfaceInterfaceType value) { 
        this.interfaceType = value;
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
    @VsoProperty(displayName = "MessageDigestKeys", readOnly = false)   
    public java.util.List<String> getMessageDigestKeys() {
       return messageDigestKeys;
    }

    @JsonIgnore
    public void setMessageDigestKeys(java.util.List<String> value) { 
        this.messageDigestKeys = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metric", readOnly = false)   
    public Long getMetric() {
       return metric;
    }

    @JsonIgnore
    public void setMetric(Long value) { 
        this.metric = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Mtu", readOnly = false)   
    public Long getMtu() {
       return mtu;
    }

    @JsonIgnore
    public void setMtu(Long value) { 
        this.mtu = value;
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
    @VsoProperty(displayName = "PassiveEnabled", readOnly = false)   
    public Boolean getPassiveEnabled() {
       return passiveEnabled;
    }

    @JsonIgnore
    public void setPassiveEnabled(Boolean value) { 
        this.passiveEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Priority", readOnly = false)   
    public Long getPriority() {
       return priority;
    }

    @JsonIgnore
    public void setPriority(Long value) { 
        this.priority = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.OSPFINTERFACE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.OSPFINTERFACE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.OSPFINTERFACE, getId());
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
        return "OSPFInterface [" + "adminState=" + adminState + ", associatedSubnetID=" + associatedSubnetID + ", authenticationKey=" + authenticationKey + ", authenticationType=" + authenticationType + ", deadInterval=" + deadInterval + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", helloInterval=" + helloInterval + ", interfaceType=" + interfaceType + ", lastUpdatedBy=" + lastUpdatedBy + ", messageDigestKeys=" + messageDigestKeys + ", metric=" + metric + ", mtu=" + mtu + ", name=" + name + ", passiveEnabled=" + passiveEnabled + ", priority=" + priority + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}