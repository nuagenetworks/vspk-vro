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
import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationBindingsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MonitorscopesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.ApplicationEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.ApplicationOptimizePathSelection;

import net.nuagenetworks.vro.vspk.model.enums.ApplicationPerformanceMonitorType;

import net.nuagenetworks.vro.vspk.model.enums.ApplicationPostClassificationPath;

import net.nuagenetworks.vro.vspk.model.enums.ApplicationPreClassificationPath;

import net.nuagenetworks.vro.vspk.model.enums.ApplicationProtocol;
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

@VsoFinder(name = Constants.APPLICATION, datasource = Constants.DATASOURCE, image = Constants.APPLICATION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.MONITORSCOPES_FETCHER, type = Constants.MONITORSCOPES_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "application", resourceName = "applications")
public class Application extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DSCP")
    protected String DSCP;
    
    @JsonProperty(value = "appId")
    protected Long appId;
    
    @JsonProperty(value = "associatedL7ApplicationSignatureID")
    protected String associatedL7ApplicationSignatureID;
    
    @JsonProperty(value = "bandwidth")
    protected Long bandwidth;
    
    @JsonProperty(value = "certificateCommonName")
    protected String certificateCommonName;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destinationIP")
    protected String destinationIP;
    
    @JsonProperty(value = "destinationPort")
    protected String destinationPort;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enablePPS")
    protected Boolean enablePPS;
    
    @JsonProperty(value = "entityScope")
    protected ApplicationEntityScope entityScope;
    
    @JsonProperty(value = "etherType")
    protected String etherType;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "networkSymmetry")
    protected Boolean networkSymmetry;
    
    @JsonProperty(value = "oneWayDelay")
    protected Long oneWayDelay;
    
    @JsonProperty(value = "oneWayJitter")
    protected Long oneWayJitter;
    
    @JsonProperty(value = "oneWayLoss")
    protected Float oneWayLoss;
    
    @JsonProperty(value = "optimizePathSelection")
    protected ApplicationOptimizePathSelection optimizePathSelection;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "performanceMonitorType")
    protected ApplicationPerformanceMonitorType performanceMonitorType;
    
    @JsonProperty(value = "postClassificationPath")
    protected ApplicationPostClassificationPath postClassificationPath;
    
    @JsonProperty(value = "preClassificationPath")
    protected ApplicationPreClassificationPath preClassificationPath;
    
    @JsonProperty(value = "protocol")
    protected ApplicationProtocol protocol;
    
    @JsonProperty(value = "readOnly")
    protected Boolean readOnly;
    
    @JsonProperty(value = "sourceIP")
    protected String sourceIP;
    
    @JsonProperty(value = "sourcePort")
    protected String sourcePort;
    
    @JsonProperty(value = "symmetry")
    protected Boolean symmetry;
    
    @JsonIgnore
    private ApplicationBindingsFetcher applicationBindings;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MonitorscopesFetcher monitorscopes;
    
    @VsoConstructor
    public Application() {
        applicationBindings = new ApplicationBindingsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        monitorscopes = new MonitorscopesFetcher(this);
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
    @VsoProperty(displayName = "DSCP", readOnly = false)   
    public String getDSCP() {
       return DSCP;
    }

    @JsonIgnore
    public void setDSCP(String value) { 
        this.DSCP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AppId", readOnly = false)   
    public Long getAppId() {
       return appId;
    }

    @JsonIgnore
    public void setAppId(Long value) { 
        this.appId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedL7ApplicationSignatureID", readOnly = false)   
    public String getAssociatedL7ApplicationSignatureID() {
       return associatedL7ApplicationSignatureID;
    }

    @JsonIgnore
    public void setAssociatedL7ApplicationSignatureID(String value) { 
        this.associatedL7ApplicationSignatureID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Bandwidth", readOnly = false)   
    public Long getBandwidth() {
       return bandwidth;
    }

    @JsonIgnore
    public void setBandwidth(Long value) { 
        this.bandwidth = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CertificateCommonName", readOnly = false)   
    public String getCertificateCommonName() {
       return certificateCommonName;
    }

    @JsonIgnore
    public void setCertificateCommonName(String value) { 
        this.certificateCommonName = value;
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
    @VsoProperty(displayName = "DestinationIP", readOnly = false)   
    public String getDestinationIP() {
       return destinationIP;
    }

    @JsonIgnore
    public void setDestinationIP(String value) { 
        this.destinationIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationPort", readOnly = false)   
    public String getDestinationPort() {
       return destinationPort;
    }

    @JsonIgnore
    public void setDestinationPort(String value) { 
        this.destinationPort = value;
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
    @VsoProperty(displayName = "EnablePPS", readOnly = false)   
    public Boolean getEnablePPS() {
       return enablePPS;
    }

    @JsonIgnore
    public void setEnablePPS(Boolean value) { 
        this.enablePPS = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public ApplicationEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(ApplicationEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EtherType", readOnly = false)   
    public String getEtherType() {
       return etherType;
    }

    @JsonIgnore
    public void setEtherType(String value) { 
        this.etherType = value;
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
    @VsoProperty(displayName = "NetworkSymmetry", readOnly = false)   
    public Boolean getNetworkSymmetry() {
       return networkSymmetry;
    }

    @JsonIgnore
    public void setNetworkSymmetry(Boolean value) { 
        this.networkSymmetry = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OneWayDelay", readOnly = false)   
    public Long getOneWayDelay() {
       return oneWayDelay;
    }

    @JsonIgnore
    public void setOneWayDelay(Long value) { 
        this.oneWayDelay = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OneWayJitter", readOnly = false)   
    public Long getOneWayJitter() {
       return oneWayJitter;
    }

    @JsonIgnore
    public void setOneWayJitter(Long value) { 
        this.oneWayJitter = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OneWayLoss", readOnly = false)   
    public Float getOneWayLoss() {
       return oneWayLoss;
    }

    @JsonIgnore
    public void setOneWayLoss(Float value) { 
        this.oneWayLoss = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OptimizePathSelection", readOnly = false)   
    public ApplicationOptimizePathSelection getOptimizePathSelection() {
       return optimizePathSelection;
    }

    @JsonIgnore
    public void setOptimizePathSelection(ApplicationOptimizePathSelection value) { 
        this.optimizePathSelection = value;
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
    @VsoProperty(displayName = "PerformanceMonitorType", readOnly = false)   
    public ApplicationPerformanceMonitorType getPerformanceMonitorType() {
       return performanceMonitorType;
    }

    @JsonIgnore
    public void setPerformanceMonitorType(ApplicationPerformanceMonitorType value) { 
        this.performanceMonitorType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PostClassificationPath", readOnly = false)   
    public ApplicationPostClassificationPath getPostClassificationPath() {
       return postClassificationPath;
    }

    @JsonIgnore
    public void setPostClassificationPath(ApplicationPostClassificationPath value) { 
        this.postClassificationPath = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PreClassificationPath", readOnly = false)   
    public ApplicationPreClassificationPath getPreClassificationPath() {
       return preClassificationPath;
    }

    @JsonIgnore
    public void setPreClassificationPath(ApplicationPreClassificationPath value) { 
        this.preClassificationPath = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Protocol", readOnly = false)   
    public ApplicationProtocol getProtocol() {
       return protocol;
    }

    @JsonIgnore
    public void setProtocol(ApplicationProtocol value) { 
        this.protocol = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ReadOnly", readOnly = false)   
    public Boolean getReadOnly() {
       return readOnly;
    }

    @JsonIgnore
    public void setReadOnly(Boolean value) { 
        this.readOnly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceIP", readOnly = false)   
    public String getSourceIP() {
       return sourceIP;
    }

    @JsonIgnore
    public void setSourceIP(String value) { 
        this.sourceIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePort", readOnly = false)   
    public String getSourcePort() {
       return sourcePort;
    }

    @JsonIgnore
    public void setSourcePort(String value) { 
        this.sourcePort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Symmetry", readOnly = false)   
    public Boolean getSymmetry() {
       return symmetry;
    }

    @JsonIgnore
    public void setSymmetry(Boolean value) { 
        this.symmetry = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ApplicationBindings", readOnly = true)   
    public ApplicationBindingsFetcher getApplicationBindings() {
        return applicationBindings;
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
    @VsoProperty(displayName = "Monitorscopes", readOnly = true)   
    public MonitorscopesFetcher getMonitorscopes() {
        return monitorscopes;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.APPLICATION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.APPLICATION, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.APPLICATION, getId());
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
    public void createMonitorscope(Session session, Monitorscope childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.MONITORSCOPES_FETCHER, getId());
        }
    }public String toString() {
        return "Application [" + "DSCP=" + DSCP + ", appId=" + appId + ", associatedL7ApplicationSignatureID=" + associatedL7ApplicationSignatureID + ", bandwidth=" + bandwidth + ", certificateCommonName=" + certificateCommonName + ", creationDate=" + creationDate + ", description=" + description + ", destinationIP=" + destinationIP + ", destinationPort=" + destinationPort + ", embeddedMetadata=" + embeddedMetadata + ", enablePPS=" + enablePPS + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", name=" + name + ", networkSymmetry=" + networkSymmetry + ", oneWayDelay=" + oneWayDelay + ", oneWayJitter=" + oneWayJitter + ", oneWayLoss=" + oneWayLoss + ", optimizePathSelection=" + optimizePathSelection + ", owner=" + owner + ", performanceMonitorType=" + performanceMonitorType + ", postClassificationPath=" + postClassificationPath + ", preClassificationPath=" + preClassificationPath + ", protocol=" + protocol + ", readOnly=" + readOnly + ", sourceIP=" + sourceIP + ", sourcePort=" + sourcePort + ", symmetry=" + symmetry + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}