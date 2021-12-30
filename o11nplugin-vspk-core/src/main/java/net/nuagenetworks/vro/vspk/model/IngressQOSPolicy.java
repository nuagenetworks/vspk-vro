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

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.IngressQOSPolicyEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.IngressQOSPolicyQueue1ForwardingClasses;

import net.nuagenetworks.vro.vspk.model.enums.IngressQOSPolicyQueue2ForwardingClasses;

import net.nuagenetworks.vro.vspk.model.enums.IngressQOSPolicyQueue3ForwardingClasses;

import net.nuagenetworks.vro.vspk.model.enums.IngressQOSPolicyQueue4ForwardingClasses;
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

@VsoFinder(name = Constants.INGRESSQOSPOLICY, datasource = Constants.DATASOURCE, image = Constants.INGRESSQOSPOLICY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ingressqospolicy", resourceName = "ingressqospolicies")
public class IngressQOSPolicy extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "assocEgressQosId")
    protected String assocEgressQosId;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "customSpqDepth")
    protected Long customSpqDepth;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected IngressQOSPolicyEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "parentQueueAssociatedRateLimiterID")
    protected String parentQueueAssociatedRateLimiterID;
    
    @JsonProperty(value = "queue1AssociatedRateLimiterID")
    protected String queue1AssociatedRateLimiterID;
    
    @JsonProperty(value = "queue1ForwardingClasses")
    protected java.util.List<IngressQOSPolicyQueue1ForwardingClasses> queue1ForwardingClasses;
    
    @JsonProperty(value = "queue2AssociatedRateLimiterID")
    protected String queue2AssociatedRateLimiterID;
    
    @JsonProperty(value = "queue2ForwardingClasses")
    protected java.util.List<IngressQOSPolicyQueue2ForwardingClasses> queue2ForwardingClasses;
    
    @JsonProperty(value = "queue3AssociatedRateLimiterID")
    protected String queue3AssociatedRateLimiterID;
    
    @JsonProperty(value = "queue3ForwardingClasses")
    protected java.util.List<IngressQOSPolicyQueue3ForwardingClasses> queue3ForwardingClasses;
    
    @JsonProperty(value = "queue4AssociatedRateLimiterID")
    protected String queue4AssociatedRateLimiterID;
    
    @JsonProperty(value = "queue4ForwardingClasses")
    protected java.util.List<IngressQOSPolicyQueue4ForwardingClasses> queue4ForwardingClasses;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public IngressQOSPolicy() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
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
    @JsonIgnore
    @VsoProperty(displayName = "AssocEgressQosId", readOnly = false)   
    public String getAssocEgressQosId() {
       return assocEgressQosId;
    }

    @JsonIgnore
    public void setAssocEgressQosId(String value) { 
        this.assocEgressQosId = value;
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
    @VsoProperty(displayName = "CustomSpqDepth", readOnly = false)   
    public Long getCustomSpqDepth() {
       return customSpqDepth;
    }

    @JsonIgnore
    public void setCustomSpqDepth(Long value) { 
        this.customSpqDepth = value;
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
    public IngressQOSPolicyEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(IngressQOSPolicyEntityScope value) { 
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
    @VsoProperty(displayName = "ParentQueueAssociatedRateLimiterID", readOnly = false)   
    public String getParentQueueAssociatedRateLimiterID() {
       return parentQueueAssociatedRateLimiterID;
    }

    @JsonIgnore
    public void setParentQueueAssociatedRateLimiterID(String value) { 
        this.parentQueueAssociatedRateLimiterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue1AssociatedRateLimiterID", readOnly = false)   
    public String getQueue1AssociatedRateLimiterID() {
       return queue1AssociatedRateLimiterID;
    }

    @JsonIgnore
    public void setQueue1AssociatedRateLimiterID(String value) { 
        this.queue1AssociatedRateLimiterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue1ForwardingClasses", readOnly = false)   
    public java.util.List<IngressQOSPolicyQueue1ForwardingClasses> getQueue1ForwardingClasses() {
       return queue1ForwardingClasses;
    }

    @JsonIgnore
    public void setQueue1ForwardingClasses(java.util.List<IngressQOSPolicyQueue1ForwardingClasses> value) { 
        this.queue1ForwardingClasses = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue2AssociatedRateLimiterID", readOnly = false)   
    public String getQueue2AssociatedRateLimiterID() {
       return queue2AssociatedRateLimiterID;
    }

    @JsonIgnore
    public void setQueue2AssociatedRateLimiterID(String value) { 
        this.queue2AssociatedRateLimiterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue2ForwardingClasses", readOnly = false)   
    public java.util.List<IngressQOSPolicyQueue2ForwardingClasses> getQueue2ForwardingClasses() {
       return queue2ForwardingClasses;
    }

    @JsonIgnore
    public void setQueue2ForwardingClasses(java.util.List<IngressQOSPolicyQueue2ForwardingClasses> value) { 
        this.queue2ForwardingClasses = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue3AssociatedRateLimiterID", readOnly = false)   
    public String getQueue3AssociatedRateLimiterID() {
       return queue3AssociatedRateLimiterID;
    }

    @JsonIgnore
    public void setQueue3AssociatedRateLimiterID(String value) { 
        this.queue3AssociatedRateLimiterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue3ForwardingClasses", readOnly = false)   
    public java.util.List<IngressQOSPolicyQueue3ForwardingClasses> getQueue3ForwardingClasses() {
       return queue3ForwardingClasses;
    }

    @JsonIgnore
    public void setQueue3ForwardingClasses(java.util.List<IngressQOSPolicyQueue3ForwardingClasses> value) { 
        this.queue3ForwardingClasses = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue4AssociatedRateLimiterID", readOnly = false)   
    public String getQueue4AssociatedRateLimiterID() {
       return queue4AssociatedRateLimiterID;
    }

    @JsonIgnore
    public void setQueue4AssociatedRateLimiterID(String value) { 
        this.queue4AssociatedRateLimiterID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Queue4ForwardingClasses", readOnly = false)   
    public java.util.List<IngressQOSPolicyQueue4ForwardingClasses> getQueue4ForwardingClasses() {
       return queue4ForwardingClasses;
    }

    @JsonIgnore
    public void setQueue4ForwardingClasses(java.util.List<IngressQOSPolicyQueue4ForwardingClasses> value) { 
        this.queue4ForwardingClasses = value;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.INGRESSQOSPOLICY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.INGRESSQOSPOLICY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.INGRESSQOSPOLICY, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.INGRESSQOSPOLICY, getId());
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
    }
    @VsoMethod
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }public String toString() {
        return "IngressQOSPolicy [" + "assocEgressQosId=" + assocEgressQosId + ", creationDate=" + creationDate + ", customSpqDepth=" + customSpqDepth + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", name=" + name + ", owner=" + owner + ", parentQueueAssociatedRateLimiterID=" + parentQueueAssociatedRateLimiterID + ", queue1AssociatedRateLimiterID=" + queue1AssociatedRateLimiterID + ", queue1ForwardingClasses=" + queue1ForwardingClasses + ", queue2AssociatedRateLimiterID=" + queue2AssociatedRateLimiterID + ", queue2ForwardingClasses=" + queue2ForwardingClasses + ", queue3AssociatedRateLimiterID=" + queue3AssociatedRateLimiterID + ", queue3ForwardingClasses=" + queue3ForwardingClasses + ", queue4AssociatedRateLimiterID=" + queue4AssociatedRateLimiterID + ", queue4ForwardingClasses=" + queue4ForwardingClasses + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}