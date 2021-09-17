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

import net.nuagenetworks.vro.vspk.model.fetchers.OSPFInterfacesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.OSPFAreaAreaType;

import net.nuagenetworks.vro.vspk.model.enums.OSPFAreaDefaultOriginateOption;

import net.nuagenetworks.vro.vspk.model.enums.OSPFAreaEntityScope;
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

@VsoFinder(name = Constants.OSPFAREA, datasource = Constants.DATASOURCE, image = Constants.OSPFAREA_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.OSPFINTERFACES_FETCHER, type = Constants.OSPFINTERFACES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ospfarea", resourceName = "ospfareas")
public class OSPFArea extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "aggregateAreaRange")
    protected java.util.List<String> aggregateAreaRange;
    
    @JsonProperty(value = "aggregateAreaRangeNSSA")
    protected java.util.List<String> aggregateAreaRangeNSSA;
    
    @JsonProperty(value = "areaID")
    protected Long areaID;
    
    @JsonProperty(value = "areaType")
    protected OSPFAreaAreaType areaType;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "defaultMetric")
    protected Long defaultMetric;
    
    @JsonProperty(value = "defaultOriginateOption")
    protected OSPFAreaDefaultOriginateOption defaultOriginateOption;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected OSPFAreaEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "redistributeExternalEnabled")
    protected Boolean redistributeExternalEnabled;
    
    @JsonProperty(value = "summariesEnabled")
    protected Boolean summariesEnabled;
    
    @JsonProperty(value = "suppressAreaRange")
    protected java.util.List<String> suppressAreaRange;
    
    @JsonProperty(value = "suppressAreaRangeNSSA")
    protected java.util.List<String> suppressAreaRangeNSSA;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private OSPFInterfacesFetcher oSPFInterfaces;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public OSPFArea() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        oSPFInterfaces = new OSPFInterfacesFetcher(this);
        
        permissions = new PermissionsFetcher(this);
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
    @VsoProperty(displayName = "AggregateAreaRange", readOnly = false)   
    public java.util.List<String> getAggregateAreaRange() {
       return aggregateAreaRange;
    }

    @JsonIgnore
    public void setAggregateAreaRange(java.util.List<String> value) { 
        this.aggregateAreaRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AggregateAreaRangeNSSA", readOnly = false)   
    public java.util.List<String> getAggregateAreaRangeNSSA() {
       return aggregateAreaRangeNSSA;
    }

    @JsonIgnore
    public void setAggregateAreaRangeNSSA(java.util.List<String> value) { 
        this.aggregateAreaRangeNSSA = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AreaID", readOnly = false)   
    public Long getAreaID() {
       return areaID;
    }

    @JsonIgnore
    public void setAreaID(Long value) { 
        this.areaID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AreaType", readOnly = false)   
    public OSPFAreaAreaType getAreaType() {
       return areaType;
    }

    @JsonIgnore
    public void setAreaType(OSPFAreaAreaType value) { 
        this.areaType = value;
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
    @VsoProperty(displayName = "DefaultMetric", readOnly = false)   
    public Long getDefaultMetric() {
       return defaultMetric;
    }

    @JsonIgnore
    public void setDefaultMetric(Long value) { 
        this.defaultMetric = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DefaultOriginateOption", readOnly = false)   
    public OSPFAreaDefaultOriginateOption getDefaultOriginateOption() {
       return defaultOriginateOption;
    }

    @JsonIgnore
    public void setDefaultOriginateOption(OSPFAreaDefaultOriginateOption value) { 
        this.defaultOriginateOption = value;
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
    public OSPFAreaEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(OSPFAreaEntityScope value) { 
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
    @VsoProperty(displayName = "Owner", readOnly = false)   
    public String getOwner() {
       return owner;
    }

    @JsonIgnore
    public void setOwner(String value) { 
        this.owner = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedistributeExternalEnabled", readOnly = false)   
    public Boolean getRedistributeExternalEnabled() {
       return redistributeExternalEnabled;
    }

    @JsonIgnore
    public void setRedistributeExternalEnabled(Boolean value) { 
        this.redistributeExternalEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SummariesEnabled", readOnly = false)   
    public Boolean getSummariesEnabled() {
       return summariesEnabled;
    }

    @JsonIgnore
    public void setSummariesEnabled(Boolean value) { 
        this.summariesEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SuppressAreaRange", readOnly = false)   
    public java.util.List<String> getSuppressAreaRange() {
       return suppressAreaRange;
    }

    @JsonIgnore
    public void setSuppressAreaRange(java.util.List<String> value) { 
        this.suppressAreaRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SuppressAreaRangeNSSA", readOnly = false)   
    public java.util.List<String> getSuppressAreaRangeNSSA() {
       return suppressAreaRangeNSSA;
    }

    @JsonIgnore
    public void setSuppressAreaRangeNSSA(java.util.List<String> value) { 
        this.suppressAreaRangeNSSA = value;
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
    @VsoProperty(displayName = "OSPFInterfaces", readOnly = true)   
    public OSPFInterfacesFetcher getOSPFInterfaces() {
        return oSPFInterfaces;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.OSPFAREA, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.OSPFAREA, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.OSPFAREA, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.OSPFAREA, getId());
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
    public void createOSPFInterface(Session session, OSPFInterface childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.OSPFINTERFACES_FETCHER, getId());
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
        return "OSPFArea [" + "aggregateAreaRange=" + aggregateAreaRange + ", aggregateAreaRangeNSSA=" + aggregateAreaRangeNSSA + ", areaID=" + areaID + ", areaType=" + areaType + ", creationDate=" + creationDate + ", defaultMetric=" + defaultMetric + ", defaultOriginateOption=" + defaultOriginateOption + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", owner=" + owner + ", redistributeExternalEnabled=" + redistributeExternalEnabled + ", summariesEnabled=" + summariesEnabled + ", suppressAreaRange=" + suppressAreaRange + ", suppressAreaRangeNSSA=" + suppressAreaRangeNSSA + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}