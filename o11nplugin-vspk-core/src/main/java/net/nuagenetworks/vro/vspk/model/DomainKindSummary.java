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

import net.nuagenetworks.vro.vspk.model.enums.DomainKindSummaryEntityScope;
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

@VsoFinder(name = Constants.DOMAINKINDSUMMARY, datasource = Constants.DATASOURCE, image = Constants.DOMAINKINDSUMMARY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "domainkindsummary", resourceName = "domainkindsummaries")
public class DomainKindSummary extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "criticalAlarmsCount")
    protected Long criticalAlarmsCount;
    
    @JsonProperty(value = "domainKindDescription")
    protected String domainKindDescription;
    
    @JsonProperty(value = "domainKindName")
    protected String domainKindName;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected DomainKindSummaryEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "gatewayCount")
    protected Long gatewayCount;
    
    @JsonProperty(value = "infoAlarmsCount")
    protected Long infoAlarmsCount;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "majorAlarmsCount")
    protected Long majorAlarmsCount;
    
    @JsonProperty(value = "meshGroupCount")
    protected Long meshGroupCount;
    
    @JsonProperty(value = "minorAlarmsCount")
    protected Long minorAlarmsCount;
    
    @JsonProperty(value = "nsgCount")
    protected Long nsgCount;
    
    @JsonProperty(value = "subNetworkCount")
    protected Long subNetworkCount;
    
    @JsonProperty(value = "trafficVolume")
    protected Long trafficVolume;
    
    @JsonProperty(value = "zoneCount")
    protected Long zoneCount;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public DomainKindSummary() {
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
    @VsoProperty(displayName = "CriticalAlarmsCount", readOnly = false)   
    public Long getCriticalAlarmsCount() {
       return criticalAlarmsCount;
    }

    @JsonIgnore
    public void setCriticalAlarmsCount(Long value) { 
        this.criticalAlarmsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainKindDescription", readOnly = false)   
    public String getDomainKindDescription() {
       return domainKindDescription;
    }

    @JsonIgnore
    public void setDomainKindDescription(String value) { 
        this.domainKindDescription = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainKindName", readOnly = false)   
    public String getDomainKindName() {
       return domainKindName;
    }

    @JsonIgnore
    public void setDomainKindName(String value) { 
        this.domainKindName = value;
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
    public DomainKindSummaryEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(DomainKindSummaryEntityScope value) { 
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
    @VsoProperty(displayName = "GatewayCount", readOnly = false)   
    public Long getGatewayCount() {
       return gatewayCount;
    }

    @JsonIgnore
    public void setGatewayCount(Long value) { 
        this.gatewayCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfoAlarmsCount", readOnly = false)   
    public Long getInfoAlarmsCount() {
       return infoAlarmsCount;
    }

    @JsonIgnore
    public void setInfoAlarmsCount(Long value) { 
        this.infoAlarmsCount = value;
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
    @VsoProperty(displayName = "MajorAlarmsCount", readOnly = false)   
    public Long getMajorAlarmsCount() {
       return majorAlarmsCount;
    }

    @JsonIgnore
    public void setMajorAlarmsCount(Long value) { 
        this.majorAlarmsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MeshGroupCount", readOnly = false)   
    public Long getMeshGroupCount() {
       return meshGroupCount;
    }

    @JsonIgnore
    public void setMeshGroupCount(Long value) { 
        this.meshGroupCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MinorAlarmsCount", readOnly = false)   
    public Long getMinorAlarmsCount() {
       return minorAlarmsCount;
    }

    @JsonIgnore
    public void setMinorAlarmsCount(Long value) { 
        this.minorAlarmsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NsgCount", readOnly = false)   
    public Long getNsgCount() {
       return nsgCount;
    }

    @JsonIgnore
    public void setNsgCount(Long value) { 
        this.nsgCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SubNetworkCount", readOnly = false)   
    public Long getSubNetworkCount() {
       return subNetworkCount;
    }

    @JsonIgnore
    public void setSubNetworkCount(Long value) { 
        this.subNetworkCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrafficVolume", readOnly = false)   
    public Long getTrafficVolume() {
       return trafficVolume;
    }

    @JsonIgnore
    public void setTrafficVolume(Long value) { 
        this.trafficVolume = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZoneCount", readOnly = false)   
    public Long getZoneCount() {
       return zoneCount;
    }

    @JsonIgnore
    public void setZoneCount(Long value) { 
        this.zoneCount = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAINKINDSUMMARY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.DOMAINKINDSUMMARY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAINKINDSUMMARY, getId());
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
        return "DomainKindSummary [" + "criticalAlarmsCount=" + criticalAlarmsCount + ", domainKindDescription=" + domainKindDescription + ", domainKindName=" + domainKindName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayCount=" + gatewayCount + ", infoAlarmsCount=" + infoAlarmsCount + ", lastUpdatedBy=" + lastUpdatedBy + ", majorAlarmsCount=" + majorAlarmsCount + ", meshGroupCount=" + meshGroupCount + ", minorAlarmsCount=" + minorAlarmsCount + ", nsgCount=" + nsgCount + ", subNetworkCount=" + subNetworkCount + ", trafficVolume=" + trafficVolume + ", zoneCount=" + zoneCount + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}