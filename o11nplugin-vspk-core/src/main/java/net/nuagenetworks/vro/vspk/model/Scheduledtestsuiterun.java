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

import net.nuagenetworks.vro.vspk.model.fetchers.TestRunsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.ScheduledtestsuiterunEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.ScheduledtestsuiterunOperationStatus;
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

@VsoFinder(name = Constants.SCHEDULEDTESTSUITERUN, datasource = Constants.DATASOURCE, image = Constants.SCHEDULEDTESTSUITERUN_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.TESTRUNS_FETCHER, type = Constants.TESTRUNS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "scheduledtestsuiterun", resourceName = "scheduledtestsuiteruns")
public class Scheduledtestsuiterun extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "NSGatewayName")
    protected String NSGatewayName;
    
    @JsonProperty(value = "VPortName")
    protected String VPortName;
    
    @JsonProperty(value = "associatedScheduledTestSuiteID")
    protected String associatedScheduledTestSuiteID;
    
    @JsonProperty(value = "associatedScheduledTestSuiteName")
    protected String associatedScheduledTestSuiteName;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "datapathID")
    protected String datapathID;
    
    @JsonProperty(value = "destination")
    protected String destination;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected ScheduledtestsuiterunEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "macAddress")
    protected String macAddress;
    
    @JsonProperty(value = "operationStatus")
    protected ScheduledtestsuiterunOperationStatus operationStatus;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "secondaryDatapathID")
    protected String secondaryDatapathID;
    
    @JsonProperty(value = "secondaryNSGatewayName")
    protected String secondaryNSGatewayName;
    
    @JsonProperty(value = "secondarySystemID")
    protected String secondarySystemID;
    
    @JsonProperty(value = "sourceIP")
    protected String sourceIP;
    
    @JsonProperty(value = "subnetName")
    protected String subnetName;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @JsonProperty(value = "vlanID")
    protected Long vlanID;
    
    @JsonProperty(value = "vportPortName")
    protected String vportPortName;
    
    @JsonProperty(value = "vportVlanID")
    protected Long vportVlanID;
    
    @JsonProperty(value = "zoneName")
    protected String zoneName;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private TestRunsFetcher testRuns;
    
    @VsoConstructor
    public Scheduledtestsuiterun() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        testRuns = new TestRunsFetcher(this);
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
    @VsoProperty(displayName = "NSGatewayName", readOnly = false)   
    public String getNSGatewayName() {
       return NSGatewayName;
    }

    @JsonIgnore
    public void setNSGatewayName(String value) { 
        this.NSGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VPortName", readOnly = false)   
    public String getVPortName() {
       return VPortName;
    }

    @JsonIgnore
    public void setVPortName(String value) { 
        this.VPortName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedScheduledTestSuiteID", readOnly = false)   
    public String getAssociatedScheduledTestSuiteID() {
       return associatedScheduledTestSuiteID;
    }

    @JsonIgnore
    public void setAssociatedScheduledTestSuiteID(String value) { 
        this.associatedScheduledTestSuiteID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedScheduledTestSuiteName", readOnly = false)   
    public String getAssociatedScheduledTestSuiteName() {
       return associatedScheduledTestSuiteName;
    }

    @JsonIgnore
    public void setAssociatedScheduledTestSuiteName(String value) { 
        this.associatedScheduledTestSuiteName = value;
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
    @VsoProperty(displayName = "DatapathID", readOnly = false)   
    public String getDatapathID() {
       return datapathID;
    }

    @JsonIgnore
    public void setDatapathID(String value) { 
        this.datapathID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Destination", readOnly = false)   
    public String getDestination() {
       return destination;
    }

    @JsonIgnore
    public void setDestination(String value) { 
        this.destination = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainName", readOnly = false)   
    public String getDomainName() {
       return domainName;
    }

    @JsonIgnore
    public void setDomainName(String value) { 
        this.domainName = value;
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
    public ScheduledtestsuiterunEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(ScheduledtestsuiterunEntityScope value) { 
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
    @VsoProperty(displayName = "MacAddress", readOnly = false)   
    public String getMacAddress() {
       return macAddress;
    }

    @JsonIgnore
    public void setMacAddress(String value) { 
        this.macAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OperationStatus", readOnly = false)   
    public ScheduledtestsuiterunOperationStatus getOperationStatus() {
       return operationStatus;
    }

    @JsonIgnore
    public void setOperationStatus(ScheduledtestsuiterunOperationStatus value) { 
        this.operationStatus = value;
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
    @VsoProperty(displayName = "SecondaryDatapathID", readOnly = false)   
    public String getSecondaryDatapathID() {
       return secondaryDatapathID;
    }

    @JsonIgnore
    public void setSecondaryDatapathID(String value) { 
        this.secondaryDatapathID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondaryNSGatewayName", readOnly = false)   
    public String getSecondaryNSGatewayName() {
       return secondaryNSGatewayName;
    }

    @JsonIgnore
    public void setSecondaryNSGatewayName(String value) { 
        this.secondaryNSGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SecondarySystemID", readOnly = false)   
    public String getSecondarySystemID() {
       return secondarySystemID;
    }

    @JsonIgnore
    public void setSecondarySystemID(String value) { 
        this.secondarySystemID = value;
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
    @VsoProperty(displayName = "SubnetName", readOnly = false)   
    public String getSubnetName() {
       return subnetName;
    }

    @JsonIgnore
    public void setSubnetName(String value) { 
        this.subnetName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemID", readOnly = false)   
    public String getSystemID() {
       return systemID;
    }

    @JsonIgnore
    public void setSystemID(String value) { 
        this.systemID = value;
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
    @VsoProperty(displayName = "VportPortName", readOnly = false)   
    public String getVportPortName() {
       return vportPortName;
    }

    @JsonIgnore
    public void setVportPortName(String value) { 
        this.vportPortName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VportVlanID", readOnly = false)   
    public Long getVportVlanID() {
       return vportVlanID;
    }

    @JsonIgnore
    public void setVportVlanID(Long value) { 
        this.vportVlanID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZoneName", readOnly = false)   
    public String getZoneName() {
       return zoneName;
    }

    @JsonIgnore
    public void setZoneName(String value) { 
        this.zoneName = value;
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
    @VsoProperty(displayName = "TestRuns", readOnly = true)   
    public TestRunsFetcher getTestRuns() {
        return testRuns;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.SCHEDULEDTESTSUITERUN, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.SCHEDULEDTESTSUITERUN, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.SCHEDULEDTESTSUITERUN, getId());
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
    public void createTestRun(Session session, TestRun childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.TESTRUNS_FETCHER, getId());
        }
    }public String toString() {
        return "Scheduledtestsuiterun [" + "NSGatewayName=" + NSGatewayName + ", VPortName=" + VPortName + ", associatedScheduledTestSuiteID=" + associatedScheduledTestSuiteID + ", associatedScheduledTestSuiteName=" + associatedScheduledTestSuiteName + ", creationDate=" + creationDate + ", datapathID=" + datapathID + ", destination=" + destination + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", macAddress=" + macAddress + ", operationStatus=" + operationStatus + ", owner=" + owner + ", secondaryDatapathID=" + secondaryDatapathID + ", secondaryNSGatewayName=" + secondaryNSGatewayName + ", secondarySystemID=" + secondarySystemID + ", sourceIP=" + sourceIP + ", subnetName=" + subnetName + ", systemID=" + systemID + ", vlanID=" + vlanID + ", vportPortName=" + vportPortName + ", vportVlanID=" + vportVlanID + ", zoneName=" + zoneName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}