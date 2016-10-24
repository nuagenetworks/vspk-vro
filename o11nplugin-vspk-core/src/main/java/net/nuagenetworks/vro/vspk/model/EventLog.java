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

import net.nuagenetworks.vro.vspk.model.enums.EventLogEntityScope;
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

@VsoFinder(name = Constants.EVENTLOG, datasource = Constants.DATASOURCE, image = Constants.EVENTLOG_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "eventlog", resourceName = "eventlogs")
public class EventLog extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "diff")
    protected Object diff;
    
    @JsonProperty(value = "enterprise")
    protected String enterprise;
    
    @JsonProperty(value = "entities")
    protected java.util.List<com.fasterxml.jackson.databind.JsonNode> entities;
    
    @JsonProperty(value = "entityID")
    protected String entityID;
    
    @JsonProperty(value = "entityParentID")
    protected String entityParentID;
    
    @JsonProperty(value = "entityParentType")
    protected String entityParentType;
    
    @JsonProperty(value = "entityScope")
    protected EventLogEntityScope entityScope;
    
    @JsonProperty(value = "entityType")
    protected String entityType;
    
    @JsonProperty(value = "eventReceivedTime")
    protected Float eventReceivedTime;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "type")
    protected String type;
    
    @JsonProperty(value = "user")
    protected String user;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public EventLog() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
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
    @VsoProperty(displayName = "Diff", readOnly = false)   
    public Object getDiff() {
       return diff;
    }

    @JsonIgnore
    public void setDiff(Object value) { 
        this.diff = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Enterprise", readOnly = false)   
    public String getEnterprise() {
       return enterprise;
    }

    @JsonIgnore
    public void setEnterprise(String value) { 
        this.enterprise = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Entities", readOnly = false)   
    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getEntities() {
       return entities;
    }

    @JsonIgnore
    public void setEntities(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
        this.entities = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityID", readOnly = false)   
    public String getEntityID() {
       return entityID;
    }

    @JsonIgnore
    public void setEntityID(String value) { 
        this.entityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityParentID", readOnly = false)   
    public String getEntityParentID() {
       return entityParentID;
    }

    @JsonIgnore
    public void setEntityParentID(String value) { 
        this.entityParentID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityParentType", readOnly = false)   
    public String getEntityParentType() {
       return entityParentType;
    }

    @JsonIgnore
    public void setEntityParentType(String value) { 
        this.entityParentType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public EventLogEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(EventLogEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityType", readOnly = false)   
    public String getEntityType() {
       return entityType;
    }

    @JsonIgnore
    public void setEntityType(String value) { 
        this.entityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventReceivedTime", readOnly = false)   
    public Float getEventReceivedTime() {
       return eventReceivedTime;
    }

    @JsonIgnore
    public void setEventReceivedTime(Float value) { 
        this.eventReceivedTime = value;
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
    @VsoProperty(displayName = "Type", readOnly = false)   
    public String getType() {
       return type;
    }

    @JsonIgnore
    public void setType(String value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "User", readOnly = false)   
    public String getUser() {
       return user;
    }

    @JsonIgnore
    public void setUser(String value) { 
        this.user = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.EVENTLOG, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.EVENTLOG, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.EVENTLOG, getId());
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
        return "EventLog [" + "diff=" + diff + ", enterprise=" + enterprise + ", entities=" + entities + ", entityID=" + entityID + ", entityParentID=" + entityParentID + ", entityParentType=" + entityParentType + ", entityScope=" + entityScope + ", entityType=" + entityType + ", eventReceivedTime=" + eventReceivedTime + ", externalID=" + externalID + ", type=" + type + ", user=" + user + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}