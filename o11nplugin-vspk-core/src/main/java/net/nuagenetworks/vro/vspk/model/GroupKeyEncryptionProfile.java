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

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm;

import net.nuagenetworks.vro.vspk.model.enums.GroupKeyEncryptionProfileTrafficEncryptionAlgorithm;
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

@VsoFinder(name = Constants.GROUPKEYENCRYPTIONPROFILE, datasource = Constants.DATASOURCE, image = Constants.GROUPKEYENCRYPTIONPROFILE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "groupkeyencryptionprofile", resourceName = "groupkeyencryptionprofiles")
public class GroupKeyEncryptionProfile extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "SEKGenerationInterval")
    protected Long SEKGenerationInterval;
    
    @JsonProperty(value = "SEKLifetime")
    protected Long SEKLifetime;
    
    @JsonProperty(value = "SEKPayloadEncryptionAlgorithm")
    protected GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm SEKPayloadEncryptionAlgorithm;
    
    @JsonProperty(value = "SEKPayloadEncryptionBCAlgorithm")
    protected String SEKPayloadEncryptionBCAlgorithm;
    
    @JsonProperty(value = "SEKPayloadEncryptionKeyLength")
    protected Long SEKPayloadEncryptionKeyLength;
    
    @JsonProperty(value = "SEKPayloadSigningAlgorithm")
    protected GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm SEKPayloadSigningAlgorithm;
    
    @JsonProperty(value = "associatedEnterpriseID")
    protected String associatedEnterpriseID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "entityScope")
    protected GroupKeyEncryptionProfileEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "seedGenerationInterval")
    protected Long seedGenerationInterval;
    
    @JsonProperty(value = "seedLifetime")
    protected Long seedLifetime;
    
    @JsonProperty(value = "seedPayloadAuthenticationAlgorithm")
    protected GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm seedPayloadAuthenticationAlgorithm;
    
    @JsonProperty(value = "seedPayloadAuthenticationBCAlgorithm")
    protected String seedPayloadAuthenticationBCAlgorithm;
    
    @JsonProperty(value = "seedPayloadAuthenticationKeyLength")
    protected Long seedPayloadAuthenticationKeyLength;
    
    @JsonProperty(value = "seedPayloadEncryptionAlgorithm")
    protected GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm seedPayloadEncryptionAlgorithm;
    
    @JsonProperty(value = "seedPayloadEncryptionBCAlgorithm")
    protected String seedPayloadEncryptionBCAlgorithm;
    
    @JsonProperty(value = "seedPayloadEncryptionKeyLength")
    protected Long seedPayloadEncryptionKeyLength;
    
    @JsonProperty(value = "seedPayloadSigningAlgorithm")
    protected GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm seedPayloadSigningAlgorithm;
    
    @JsonProperty(value = "trafficAuthenticationAlgorithm")
    protected GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm trafficAuthenticationAlgorithm;
    
    @JsonProperty(value = "trafficEncryptionAlgorithm")
    protected GroupKeyEncryptionProfileTrafficEncryptionAlgorithm trafficEncryptionAlgorithm;
    
    @JsonProperty(value = "trafficEncryptionKeyLifetime")
    protected Long trafficEncryptionKeyLifetime;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public GroupKeyEncryptionProfile() {
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
    @VsoProperty(displayName = "SEKGenerationInterval", readOnly = false)   
    public Long getSEKGenerationInterval() {
       return SEKGenerationInterval;
    }

    @JsonIgnore
    public void setSEKGenerationInterval(Long value) { 
        this.SEKGenerationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SEKLifetime", readOnly = false)   
    public Long getSEKLifetime() {
       return SEKLifetime;
    }

    @JsonIgnore
    public void setSEKLifetime(Long value) { 
        this.SEKLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SEKPayloadEncryptionAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm getSEKPayloadEncryptionAlgorithm() {
       return SEKPayloadEncryptionAlgorithm;
    }

    @JsonIgnore
    public void setSEKPayloadEncryptionAlgorithm(GroupKeyEncryptionProfileSEKPayloadEncryptionAlgorithm value) { 
        this.SEKPayloadEncryptionAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SEKPayloadEncryptionBCAlgorithm", readOnly = false)   
    public String getSEKPayloadEncryptionBCAlgorithm() {
       return SEKPayloadEncryptionBCAlgorithm;
    }

    @JsonIgnore
    public void setSEKPayloadEncryptionBCAlgorithm(String value) { 
        this.SEKPayloadEncryptionBCAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SEKPayloadEncryptionKeyLength", readOnly = false)   
    public Long getSEKPayloadEncryptionKeyLength() {
       return SEKPayloadEncryptionKeyLength;
    }

    @JsonIgnore
    public void setSEKPayloadEncryptionKeyLength(Long value) { 
        this.SEKPayloadEncryptionKeyLength = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SEKPayloadSigningAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm getSEKPayloadSigningAlgorithm() {
       return SEKPayloadSigningAlgorithm;
    }

    @JsonIgnore
    public void setSEKPayloadSigningAlgorithm(GroupKeyEncryptionProfileSEKPayloadSigningAlgorithm value) { 
        this.SEKPayloadSigningAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedEnterpriseID", readOnly = false)   
    public String getAssociatedEnterpriseID() {
       return associatedEnterpriseID;
    }

    @JsonIgnore
    public void setAssociatedEnterpriseID(String value) { 
        this.associatedEnterpriseID = value;
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
    public GroupKeyEncryptionProfileEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(GroupKeyEncryptionProfileEntityScope value) { 
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedGenerationInterval", readOnly = false)   
    public Long getSeedGenerationInterval() {
       return seedGenerationInterval;
    }

    @JsonIgnore
    public void setSeedGenerationInterval(Long value) { 
        this.seedGenerationInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedLifetime", readOnly = false)   
    public Long getSeedLifetime() {
       return seedLifetime;
    }

    @JsonIgnore
    public void setSeedLifetime(Long value) { 
        this.seedLifetime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadAuthenticationAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm getSeedPayloadAuthenticationAlgorithm() {
       return seedPayloadAuthenticationAlgorithm;
    }

    @JsonIgnore
    public void setSeedPayloadAuthenticationAlgorithm(GroupKeyEncryptionProfileSeedPayloadAuthenticationAlgorithm value) { 
        this.seedPayloadAuthenticationAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadAuthenticationBCAlgorithm", readOnly = false)   
    public String getSeedPayloadAuthenticationBCAlgorithm() {
       return seedPayloadAuthenticationBCAlgorithm;
    }

    @JsonIgnore
    public void setSeedPayloadAuthenticationBCAlgorithm(String value) { 
        this.seedPayloadAuthenticationBCAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadAuthenticationKeyLength", readOnly = false)   
    public Long getSeedPayloadAuthenticationKeyLength() {
       return seedPayloadAuthenticationKeyLength;
    }

    @JsonIgnore
    public void setSeedPayloadAuthenticationKeyLength(Long value) { 
        this.seedPayloadAuthenticationKeyLength = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadEncryptionAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm getSeedPayloadEncryptionAlgorithm() {
       return seedPayloadEncryptionAlgorithm;
    }

    @JsonIgnore
    public void setSeedPayloadEncryptionAlgorithm(GroupKeyEncryptionProfileSeedPayloadEncryptionAlgorithm value) { 
        this.seedPayloadEncryptionAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadEncryptionBCAlgorithm", readOnly = false)   
    public String getSeedPayloadEncryptionBCAlgorithm() {
       return seedPayloadEncryptionBCAlgorithm;
    }

    @JsonIgnore
    public void setSeedPayloadEncryptionBCAlgorithm(String value) { 
        this.seedPayloadEncryptionBCAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadEncryptionKeyLength", readOnly = false)   
    public Long getSeedPayloadEncryptionKeyLength() {
       return seedPayloadEncryptionKeyLength;
    }

    @JsonIgnore
    public void setSeedPayloadEncryptionKeyLength(Long value) { 
        this.seedPayloadEncryptionKeyLength = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SeedPayloadSigningAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm getSeedPayloadSigningAlgorithm() {
       return seedPayloadSigningAlgorithm;
    }

    @JsonIgnore
    public void setSeedPayloadSigningAlgorithm(GroupKeyEncryptionProfileSeedPayloadSigningAlgorithm value) { 
        this.seedPayloadSigningAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrafficAuthenticationAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm getTrafficAuthenticationAlgorithm() {
       return trafficAuthenticationAlgorithm;
    }

    @JsonIgnore
    public void setTrafficAuthenticationAlgorithm(GroupKeyEncryptionProfileTrafficAuthenticationAlgorithm value) { 
        this.trafficAuthenticationAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrafficEncryptionAlgorithm", readOnly = false)   
    public GroupKeyEncryptionProfileTrafficEncryptionAlgorithm getTrafficEncryptionAlgorithm() {
       return trafficEncryptionAlgorithm;
    }

    @JsonIgnore
    public void setTrafficEncryptionAlgorithm(GroupKeyEncryptionProfileTrafficEncryptionAlgorithm value) { 
        this.trafficEncryptionAlgorithm = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrafficEncryptionKeyLifetime", readOnly = false)   
    public Long getTrafficEncryptionKeyLifetime() {
       return trafficEncryptionKeyLifetime;
    }

    @JsonIgnore
    public void setTrafficEncryptionKeyLifetime(Long value) { 
        this.trafficEncryptionKeyLifetime = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.GROUPKEYENCRYPTIONPROFILE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.GROUPKEYENCRYPTIONPROFILE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.GROUPKEYENCRYPTIONPROFILE, getId());
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
        return "GroupKeyEncryptionProfile [" + "SEKGenerationInterval=" + SEKGenerationInterval + ", SEKLifetime=" + SEKLifetime + ", SEKPayloadEncryptionAlgorithm=" + SEKPayloadEncryptionAlgorithm + ", SEKPayloadEncryptionBCAlgorithm=" + SEKPayloadEncryptionBCAlgorithm + ", SEKPayloadEncryptionKeyLength=" + SEKPayloadEncryptionKeyLength + ", SEKPayloadSigningAlgorithm=" + SEKPayloadSigningAlgorithm + ", associatedEnterpriseID=" + associatedEnterpriseID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", seedGenerationInterval=" + seedGenerationInterval + ", seedLifetime=" + seedLifetime + ", seedPayloadAuthenticationAlgorithm=" + seedPayloadAuthenticationAlgorithm + ", seedPayloadAuthenticationBCAlgorithm=" + seedPayloadAuthenticationBCAlgorithm + ", seedPayloadAuthenticationKeyLength=" + seedPayloadAuthenticationKeyLength + ", seedPayloadEncryptionAlgorithm=" + seedPayloadEncryptionAlgorithm + ", seedPayloadEncryptionBCAlgorithm=" + seedPayloadEncryptionBCAlgorithm + ", seedPayloadEncryptionKeyLength=" + seedPayloadEncryptionKeyLength + ", seedPayloadSigningAlgorithm=" + seedPayloadSigningAlgorithm + ", trafficAuthenticationAlgorithm=" + trafficAuthenticationAlgorithm + ", trafficEncryptionAlgorithm=" + trafficEncryptionAlgorithm + ", trafficEncryptionKeyLifetime=" + trafficEncryptionKeyLifetime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}