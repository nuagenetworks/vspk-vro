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
import net.nuagenetworks.vro.vspk.model.fetchers.ContainersFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.VMsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.QOSEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.QOSServiceClass;
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

@VsoFinder(name = Constants.QOS, datasource = Constants.DATASOURCE, image = Constants.QOS_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "qos", resourceName = "qos")
public class QOS extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BUMCommittedBurstSize")
    protected String BUMCommittedBurstSize;
    
    @JsonProperty(value = "BUMCommittedInformationRate")
    protected String BUMCommittedInformationRate;
    
    @JsonProperty(value = "BUMPeakBurstSize")
    protected String BUMPeakBurstSize;
    
    @JsonProperty(value = "BUMPeakInformationRate")
    protected String BUMPeakInformationRate;
    
    @JsonProperty(value = "BUMRateLimitingActive")
    protected Boolean BUMRateLimitingActive;
    
    @JsonProperty(value = "FIPCommittedBurstSize")
    protected String FIPCommittedBurstSize;
    
    @JsonProperty(value = "FIPCommittedInformationRate")
    protected String FIPCommittedInformationRate;
    
    @JsonProperty(value = "FIPPeakBurstSize")
    protected String FIPPeakBurstSize;
    
    @JsonProperty(value = "FIPPeakInformationRate")
    protected String FIPPeakInformationRate;
    
    @JsonProperty(value = "FIPRateLimitingActive")
    protected Boolean FIPRateLimitingActive;
    
    @JsonProperty(value = "active")
    protected Boolean active;
    
    @JsonProperty(value = "assocQosId")
    protected String assocQosId;
    
    @JsonProperty(value = "associatedDSCPForwardingClassTableID")
    protected String associatedDSCPForwardingClassTableID;
    
    @JsonProperty(value = "associatedDSCPForwardingClassTableName")
    protected String associatedDSCPForwardingClassTableName;
    
    @JsonProperty(value = "burst")
    protected String burst;
    
    @JsonProperty(value = "committedBurstSize")
    protected String committedBurstSize;
    
    @JsonProperty(value = "committedInformationRate")
    protected String committedInformationRate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "entityScope")
    protected QOSEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "peak")
    protected String peak;
    
    @JsonProperty(value = "rateLimitingActive")
    protected Boolean rateLimitingActive;
    
    @JsonProperty(value = "rewriteForwardingClass")
    protected Boolean rewriteForwardingClass;
    
    @JsonProperty(value = "serviceClass")
    protected QOSServiceClass serviceClass;
    
    @JsonProperty(value = "trustedForwardingClass")
    protected Boolean trustedForwardingClass;
    
    @JsonIgnore
    private ContainersFetcher containers;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private VMsFetcher vMs;
    
    @VsoConstructor
    public QOS() {
        containers = new ContainersFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        vMs = new VMsFetcher(this);
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
    @VsoProperty(displayName = "BUMCommittedBurstSize", readOnly = false)   
    public String getBUMCommittedBurstSize() {
       return BUMCommittedBurstSize;
    }

    @JsonIgnore
    public void setBUMCommittedBurstSize(String value) { 
        this.BUMCommittedBurstSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BUMCommittedInformationRate", readOnly = false)   
    public String getBUMCommittedInformationRate() {
       return BUMCommittedInformationRate;
    }

    @JsonIgnore
    public void setBUMCommittedInformationRate(String value) { 
        this.BUMCommittedInformationRate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BUMPeakBurstSize", readOnly = false)   
    public String getBUMPeakBurstSize() {
       return BUMPeakBurstSize;
    }

    @JsonIgnore
    public void setBUMPeakBurstSize(String value) { 
        this.BUMPeakBurstSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BUMPeakInformationRate", readOnly = false)   
    public String getBUMPeakInformationRate() {
       return BUMPeakInformationRate;
    }

    @JsonIgnore
    public void setBUMPeakInformationRate(String value) { 
        this.BUMPeakInformationRate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BUMRateLimitingActive", readOnly = false)   
    public Boolean getBUMRateLimitingActive() {
       return BUMRateLimitingActive;
    }

    @JsonIgnore
    public void setBUMRateLimitingActive(Boolean value) { 
        this.BUMRateLimitingActive = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPCommittedBurstSize", readOnly = false)   
    public String getFIPCommittedBurstSize() {
       return FIPCommittedBurstSize;
    }

    @JsonIgnore
    public void setFIPCommittedBurstSize(String value) { 
        this.FIPCommittedBurstSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPCommittedInformationRate", readOnly = false)   
    public String getFIPCommittedInformationRate() {
       return FIPCommittedInformationRate;
    }

    @JsonIgnore
    public void setFIPCommittedInformationRate(String value) { 
        this.FIPCommittedInformationRate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPPeakBurstSize", readOnly = false)   
    public String getFIPPeakBurstSize() {
       return FIPPeakBurstSize;
    }

    @JsonIgnore
    public void setFIPPeakBurstSize(String value) { 
        this.FIPPeakBurstSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPPeakInformationRate", readOnly = false)   
    public String getFIPPeakInformationRate() {
       return FIPPeakInformationRate;
    }

    @JsonIgnore
    public void setFIPPeakInformationRate(String value) { 
        this.FIPPeakInformationRate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "FIPRateLimitingActive", readOnly = false)   
    public Boolean getFIPRateLimitingActive() {
       return FIPRateLimitingActive;
    }

    @JsonIgnore
    public void setFIPRateLimitingActive(Boolean value) { 
        this.FIPRateLimitingActive = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Active", readOnly = false)   
    public Boolean getActive() {
       return active;
    }

    @JsonIgnore
    public void setActive(Boolean value) { 
        this.active = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssocQosId", readOnly = false)   
    public String getAssocQosId() {
       return assocQosId;
    }

    @JsonIgnore
    public void setAssocQosId(String value) { 
        this.assocQosId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDSCPForwardingClassTableID", readOnly = false)   
    public String getAssociatedDSCPForwardingClassTableID() {
       return associatedDSCPForwardingClassTableID;
    }

    @JsonIgnore
    public void setAssociatedDSCPForwardingClassTableID(String value) { 
        this.associatedDSCPForwardingClassTableID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDSCPForwardingClassTableName", readOnly = false)   
    public String getAssociatedDSCPForwardingClassTableName() {
       return associatedDSCPForwardingClassTableName;
    }

    @JsonIgnore
    public void setAssociatedDSCPForwardingClassTableName(String value) { 
        this.associatedDSCPForwardingClassTableName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Burst", readOnly = false)   
    public String getBurst() {
       return burst;
    }

    @JsonIgnore
    public void setBurst(String value) { 
        this.burst = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CommittedBurstSize", readOnly = false)   
    public String getCommittedBurstSize() {
       return committedBurstSize;
    }

    @JsonIgnore
    public void setCommittedBurstSize(String value) { 
        this.committedBurstSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CommittedInformationRate", readOnly = false)   
    public String getCommittedInformationRate() {
       return committedInformationRate;
    }

    @JsonIgnore
    public void setCommittedInformationRate(String value) { 
        this.committedInformationRate = value;
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
    public QOSEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(QOSEntityScope value) { 
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
    @VsoProperty(displayName = "Peak", readOnly = false)   
    public String getPeak() {
       return peak;
    }

    @JsonIgnore
    public void setPeak(String value) { 
        this.peak = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RateLimitingActive", readOnly = false)   
    public Boolean getRateLimitingActive() {
       return rateLimitingActive;
    }

    @JsonIgnore
    public void setRateLimitingActive(Boolean value) { 
        this.rateLimitingActive = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RewriteForwardingClass", readOnly = false)   
    public Boolean getRewriteForwardingClass() {
       return rewriteForwardingClass;
    }

    @JsonIgnore
    public void setRewriteForwardingClass(Boolean value) { 
        this.rewriteForwardingClass = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ServiceClass", readOnly = false)   
    public QOSServiceClass getServiceClass() {
       return serviceClass;
    }

    @JsonIgnore
    public void setServiceClass(QOSServiceClass value) { 
        this.serviceClass = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrustedForwardingClass", readOnly = false)   
    public Boolean getTrustedForwardingClass() {
       return trustedForwardingClass;
    }

    @JsonIgnore
    public void setTrustedForwardingClass(Boolean value) { 
        this.trustedForwardingClass = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Containers", readOnly = true)   
    public ContainersFetcher getContainers() {
        return containers;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "VMs", readOnly = true)   
    public VMsFetcher getVMs() {
        return vMs;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.QOS, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.QOS, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.QOS, getId());
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
        return "QOS [" + "BUMCommittedBurstSize=" + BUMCommittedBurstSize + ", BUMCommittedInformationRate=" + BUMCommittedInformationRate + ", BUMPeakBurstSize=" + BUMPeakBurstSize + ", BUMPeakInformationRate=" + BUMPeakInformationRate + ", BUMRateLimitingActive=" + BUMRateLimitingActive + ", FIPCommittedBurstSize=" + FIPCommittedBurstSize + ", FIPCommittedInformationRate=" + FIPCommittedInformationRate + ", FIPPeakBurstSize=" + FIPPeakBurstSize + ", FIPPeakInformationRate=" + FIPPeakInformationRate + ", FIPRateLimitingActive=" + FIPRateLimitingActive + ", active=" + active + ", assocQosId=" + assocQosId + ", associatedDSCPForwardingClassTableID=" + associatedDSCPForwardingClassTableID + ", associatedDSCPForwardingClassTableName=" + associatedDSCPForwardingClassTableName + ", burst=" + burst + ", committedBurstSize=" + committedBurstSize + ", committedInformationRate=" + committedInformationRate + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peak=" + peak + ", rateLimitingActive=" + rateLimitingActive + ", rewriteForwardingClass=" + rewriteForwardingClass + ", serviceClass=" + serviceClass + ", trustedForwardingClass=" + trustedForwardingClass + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}