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

import net.nuagenetworks.vro.vspk.model.enums.TestRunEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.TestRunOperationStatus;

import net.nuagenetworks.vro.vspk.model.enums.TestRunTestResult;

import net.nuagenetworks.vro.vspk.model.enums.TestRunTestResultDataType;

import net.nuagenetworks.vro.vspk.model.enums.TestRunUnderlayTestCategory;
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

@VsoFinder(name = Constants.TESTRUN, datasource = Constants.DATASOURCE, image = Constants.TESTRUN_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "testrun", resourceName = "testruns")
public class TestRun extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedTestID")
    protected String associatedTestID;
    
    @JsonProperty(value = "associatedTestSuiteRunID")
    protected String associatedTestSuiteRunID;
    
    @JsonProperty(value = "command")
    protected String command;
    
    @JsonProperty(value = "commandExitCode")
    protected Long commandExitCode;
    
    @JsonProperty(value = "commandOutput")
    protected String commandOutput;
    
    @JsonProperty(value = "commandOutputSummary")
    protected String commandOutputSummary;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "duration")
    protected Long duration;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected TestRunEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "operationStatus")
    protected TestRunOperationStatus operationStatus;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "startDateTime")
    protected Long startDateTime;
    
    @JsonProperty(value = "stopDateTime")
    protected Long stopDateTime;
    
    @JsonProperty(value = "testResult")
    protected TestRunTestResult testResult;
    
    @JsonProperty(value = "testResultData")
    protected Object testResultData;
    
    @JsonProperty(value = "testResultDataType")
    protected TestRunTestResultDataType testResultDataType;
    
    @JsonProperty(value = "testResultSpecificationEntityName")
    protected String testResultSpecificationEntityName;
    
    @JsonProperty(value = "underlayTestCategory")
    protected TestRunUnderlayTestCategory underlayTestCategory;
    
    @JsonProperty(value = "underlayTestDescription")
    protected String underlayTestDescription;
    
    @JsonProperty(value = "underlayTestName")
    protected String underlayTestName;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public TestRun() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
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
    @VsoProperty(displayName = "AssociatedTestID", readOnly = false)   
    public String getAssociatedTestID() {
       return associatedTestID;
    }

    @JsonIgnore
    public void setAssociatedTestID(String value) { 
        this.associatedTestID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedTestSuiteRunID", readOnly = false)   
    public String getAssociatedTestSuiteRunID() {
       return associatedTestSuiteRunID;
    }

    @JsonIgnore
    public void setAssociatedTestSuiteRunID(String value) { 
        this.associatedTestSuiteRunID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Command", readOnly = false)   
    public String getCommand() {
       return command;
    }

    @JsonIgnore
    public void setCommand(String value) { 
        this.command = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CommandExitCode", readOnly = false)   
    public Long getCommandExitCode() {
       return commandExitCode;
    }

    @JsonIgnore
    public void setCommandExitCode(Long value) { 
        this.commandExitCode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CommandOutput", readOnly = false)   
    public String getCommandOutput() {
       return commandOutput;
    }

    @JsonIgnore
    public void setCommandOutput(String value) { 
        this.commandOutput = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CommandOutputSummary", readOnly = false)   
    public String getCommandOutputSummary() {
       return commandOutputSummary;
    }

    @JsonIgnore
    public void setCommandOutputSummary(String value) { 
        this.commandOutputSummary = value;
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
    @VsoProperty(displayName = "Duration", readOnly = false)   
    public Long getDuration() {
       return duration;
    }

    @JsonIgnore
    public void setDuration(Long value) { 
        this.duration = value;
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
    public TestRunEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(TestRunEntityScope value) { 
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
    @VsoProperty(displayName = "OperationStatus", readOnly = false)   
    public TestRunOperationStatus getOperationStatus() {
       return operationStatus;
    }

    @JsonIgnore
    public void setOperationStatus(TestRunOperationStatus value) { 
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
    @VsoProperty(displayName = "StartDateTime", readOnly = false)   
    public Long getStartDateTime() {
       return startDateTime;
    }

    @JsonIgnore
    public void setStartDateTime(Long value) { 
        this.startDateTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StopDateTime", readOnly = false)   
    public Long getStopDateTime() {
       return stopDateTime;
    }

    @JsonIgnore
    public void setStopDateTime(Long value) { 
        this.stopDateTime = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestResult", readOnly = false)   
    public TestRunTestResult getTestResult() {
       return testResult;
    }

    @JsonIgnore
    public void setTestResult(TestRunTestResult value) { 
        this.testResult = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestResultData", readOnly = false)   
    public Object getTestResultData() {
       return testResultData;
    }

    @JsonIgnore
    public void setTestResultData(Object value) { 
        this.testResultData = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestResultDataType", readOnly = false)   
    public TestRunTestResultDataType getTestResultDataType() {
       return testResultDataType;
    }

    @JsonIgnore
    public void setTestResultDataType(TestRunTestResultDataType value) { 
        this.testResultDataType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TestResultSpecificationEntityName", readOnly = false)   
    public String getTestResultSpecificationEntityName() {
       return testResultSpecificationEntityName;
    }

    @JsonIgnore
    public void setTestResultSpecificationEntityName(String value) { 
        this.testResultSpecificationEntityName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayTestCategory", readOnly = false)   
    public TestRunUnderlayTestCategory getUnderlayTestCategory() {
       return underlayTestCategory;
    }

    @JsonIgnore
    public void setUnderlayTestCategory(TestRunUnderlayTestCategory value) { 
        this.underlayTestCategory = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayTestDescription", readOnly = false)   
    public String getUnderlayTestDescription() {
       return underlayTestDescription;
    }

    @JsonIgnore
    public void setUnderlayTestDescription(String value) { 
        this.underlayTestDescription = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayTestName", readOnly = false)   
    public String getUnderlayTestName() {
       return underlayTestName;
    }

    @JsonIgnore
    public void setUnderlayTestName(String value) { 
        this.underlayTestName = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.TESTRUN, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.TESTRUN, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.TESTRUN, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.TESTRUN, getId());
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
        return "TestRun [" + "associatedTestID=" + associatedTestID + ", associatedTestSuiteRunID=" + associatedTestSuiteRunID + ", command=" + command + ", commandExitCode=" + commandExitCode + ", commandOutput=" + commandOutput + ", commandOutputSummary=" + commandOutputSummary + ", creationDate=" + creationDate + ", duration=" + duration + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", operationStatus=" + operationStatus + ", owner=" + owner + ", startDateTime=" + startDateTime + ", stopDateTime=" + stopDateTime + ", testResult=" + testResult + ", testResultData=" + testResultData + ", testResultDataType=" + testResultDataType + ", testResultSpecificationEntityName=" + testResultSpecificationEntityName + ", underlayTestCategory=" + underlayTestCategory + ", underlayTestDescription=" + underlayTestDescription + ", underlayTestName=" + underlayTestName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}