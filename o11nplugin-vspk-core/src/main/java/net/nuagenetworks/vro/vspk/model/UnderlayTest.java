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
import net.nuagenetworks.vro.vspk.model.enums.UnderlayTestTestResult;

import net.nuagenetworks.vro.vspk.model.enums.UnderlayTestUnderlayTestType;
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

@VsoFinder(name = Constants.UNDERLAYTEST, datasource = Constants.DATASOURCE, image = Constants.UNDERLAYTEST_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "underlaytest", resourceName = "underlaytests")
public class UnderlayTest extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedDataPathID")
    protected String associatedDataPathID;
    
    @JsonProperty(value = "associatedNSGatewayID")
    protected String associatedNSGatewayID;
    
    @JsonProperty(value = "associatedNSGatewayName")
    protected String associatedNSGatewayName;
    
    @JsonProperty(value = "associatedSystemID")
    protected String associatedSystemID;
    
    @JsonProperty(value = "associatedTestSuiteRunID")
    protected String associatedTestSuiteRunID;
    
    @JsonProperty(value = "associatedUplinkConnectionID")
    protected String associatedUplinkConnectionID;
    
    @JsonProperty(value = "associatedUplinkInterface")
    protected String associatedUplinkInterface;
    
    @JsonProperty(value = "createOnly")
    protected Boolean createOnly;
    
    @JsonProperty(value = "duration")
    protected Long duration;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "runBandwidthTest")
    protected Boolean runBandwidthTest;
    
    @JsonProperty(value = "runConnectivityTest")
    protected Boolean runConnectivityTest;
    
    @JsonProperty(value = "runMTUDiscoveryTest")
    protected Boolean runMTUDiscoveryTest;
    
    @JsonProperty(value = "startDateTime")
    protected Long startDateTime;
    
    @JsonProperty(value = "stopDateTime")
    protected Long stopDateTime;
    
    @JsonProperty(value = "testResult")
    protected UnderlayTestTestResult testResult;
    
    @JsonProperty(value = "underlayTestServer")
    protected String underlayTestServer;
    
    @JsonProperty(value = "underlayTestType")
    protected UnderlayTestUnderlayTestType underlayTestType;
    
    @VsoConstructor
    public UnderlayTest() {}

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
    @VsoProperty(displayName = "AssociatedDataPathID", readOnly = false)   
    public String getAssociatedDataPathID() {
       return associatedDataPathID;
    }

    @JsonIgnore
    public void setAssociatedDataPathID(String value) { 
        this.associatedDataPathID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGatewayID", readOnly = false)   
    public String getAssociatedNSGatewayID() {
       return associatedNSGatewayID;
    }

    @JsonIgnore
    public void setAssociatedNSGatewayID(String value) { 
        this.associatedNSGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGatewayName", readOnly = false)   
    public String getAssociatedNSGatewayName() {
       return associatedNSGatewayName;
    }

    @JsonIgnore
    public void setAssociatedNSGatewayName(String value) { 
        this.associatedNSGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSystemID", readOnly = false)   
    public String getAssociatedSystemID() {
       return associatedSystemID;
    }

    @JsonIgnore
    public void setAssociatedSystemID(String value) { 
        this.associatedSystemID = value;
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
    @VsoProperty(displayName = "AssociatedUplinkConnectionID", readOnly = false)   
    public String getAssociatedUplinkConnectionID() {
       return associatedUplinkConnectionID;
    }

    @JsonIgnore
    public void setAssociatedUplinkConnectionID(String value) { 
        this.associatedUplinkConnectionID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedUplinkInterface", readOnly = false)   
    public String getAssociatedUplinkInterface() {
       return associatedUplinkInterface;
    }

    @JsonIgnore
    public void setAssociatedUplinkInterface(String value) { 
        this.associatedUplinkInterface = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CreateOnly", readOnly = false)   
    public Boolean getCreateOnly() {
       return createOnly;
    }

    @JsonIgnore
    public void setCreateOnly(Boolean value) { 
        this.createOnly = value;
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RunBandwidthTest", readOnly = false)   
    public Boolean getRunBandwidthTest() {
       return runBandwidthTest;
    }

    @JsonIgnore
    public void setRunBandwidthTest(Boolean value) { 
        this.runBandwidthTest = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RunConnectivityTest", readOnly = false)   
    public Boolean getRunConnectivityTest() {
       return runConnectivityTest;
    }

    @JsonIgnore
    public void setRunConnectivityTest(Boolean value) { 
        this.runConnectivityTest = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RunMTUDiscoveryTest", readOnly = false)   
    public Boolean getRunMTUDiscoveryTest() {
       return runMTUDiscoveryTest;
    }

    @JsonIgnore
    public void setRunMTUDiscoveryTest(Boolean value) { 
        this.runMTUDiscoveryTest = value;
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
    public UnderlayTestTestResult getTestResult() {
       return testResult;
    }

    @JsonIgnore
    public void setTestResult(UnderlayTestTestResult value) { 
        this.testResult = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayTestServer", readOnly = false)   
    public String getUnderlayTestServer() {
       return underlayTestServer;
    }

    @JsonIgnore
    public void setUnderlayTestServer(String value) { 
        this.underlayTestServer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayTestType", readOnly = false)   
    public UnderlayTestUnderlayTestType getUnderlayTestType() {
       return underlayTestType;
    }

    @JsonIgnore
    public void setUnderlayTestType(UnderlayTestUnderlayTestType value) { 
        this.underlayTestType = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.UNDERLAYTEST, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.UNDERLAYTEST, getId());
        }
    }public String toString() {
        return "UnderlayTest [" + "associatedDataPathID=" + associatedDataPathID + ", associatedNSGatewayID=" + associatedNSGatewayID + ", associatedNSGatewayName=" + associatedNSGatewayName + ", associatedSystemID=" + associatedSystemID + ", associatedTestSuiteRunID=" + associatedTestSuiteRunID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedUplinkInterface=" + associatedUplinkInterface + ", createOnly=" + createOnly + ", duration=" + duration + ", name=" + name + ", runBandwidthTest=" + runBandwidthTest + ", runConnectivityTest=" + runConnectivityTest + ", runMTUDiscoveryTest=" + runMTUDiscoveryTest + ", startDateTime=" + startDateTime + ", stopDateTime=" + stopDateTime + ", testResult=" + testResult + ", underlayTestServer=" + underlayTestServer + ", underlayTestType=" + underlayTestType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}