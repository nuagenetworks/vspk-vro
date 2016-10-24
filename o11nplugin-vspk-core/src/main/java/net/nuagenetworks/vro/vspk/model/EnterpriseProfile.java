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
import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.ExternalServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MultiCastListsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseProfileAllowedForwardingClasses;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseProfileEncryptionManagementMode;

import net.nuagenetworks.vro.vspk.model.enums.EnterpriseProfileEntityScope;
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

@VsoFinder(name = Constants.ENTERPRISEPROFILE, datasource = Constants.DATASOURCE, image = Constants.ENTERPRISEPROFILE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterpriseprofile", resourceName = "enterpriseprofiles")
public class EnterpriseProfile extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BGPEnabled")
    protected Boolean BGPEnabled;
    
    @JsonProperty(value = "DHCPLeaseInterval")
    protected Long DHCPLeaseInterval;
    
    @JsonProperty(value = "DPIEnabled")
    protected Boolean DPIEnabled;
    
    @JsonProperty(value = "allowAdvancedQOSConfiguration")
    protected Boolean allowAdvancedQOSConfiguration;
    
    @JsonProperty(value = "allowGatewayManagement")
    protected Boolean allowGatewayManagement;
    
    @JsonProperty(value = "allowTrustedForwardingClass")
    protected Boolean allowTrustedForwardingClass;
    
    @JsonProperty(value = "allowedForwardingClasses")
    protected java.util.List<EnterpriseProfileAllowedForwardingClasses> allowedForwardingClasses;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "enableApplicationPerformanceManagement")
    protected Boolean enableApplicationPerformanceManagement;
    
    @JsonProperty(value = "encryptionManagementMode")
    protected EnterpriseProfileEncryptionManagementMode encryptionManagementMode;
    
    @JsonProperty(value = "entityScope")
    protected EnterpriseProfileEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "floatingIPsQuota")
    protected Long floatingIPsQuota;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "receiveMultiCastListID")
    protected String receiveMultiCastListID;
    
    @JsonProperty(value = "sendMultiCastListID")
    protected String sendMultiCastListID;
    
    @JsonIgnore
    private EnterprisesFetcher enterprises;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private ExternalServicesFetcher externalServices;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private MultiCastListsFetcher multiCastLists;
    
    @VsoConstructor
    public EnterpriseProfile() {
        floatingIPsQuota = 100L;
        
        DHCPLeaseInterval = 24L;
        
        enterprises = new EnterprisesFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        externalServices = new ExternalServicesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        multiCastLists = new MultiCastListsFetcher(this);
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
    @VsoProperty(displayName = "BGPEnabled", readOnly = false)   
    public Boolean getBGPEnabled() {
       return BGPEnabled;
    }

    @JsonIgnore
    public void setBGPEnabled(Boolean value) { 
        this.BGPEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DHCPLeaseInterval", readOnly = false)   
    public Long getDHCPLeaseInterval() {
       return DHCPLeaseInterval;
    }

    @JsonIgnore
    public void setDHCPLeaseInterval(Long value) { 
        this.DHCPLeaseInterval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DPIEnabled", readOnly = false)   
    public Boolean getDPIEnabled() {
       return DPIEnabled;
    }

    @JsonIgnore
    public void setDPIEnabled(Boolean value) { 
        this.DPIEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowAdvancedQOSConfiguration", readOnly = false)   
    public Boolean getAllowAdvancedQOSConfiguration() {
       return allowAdvancedQOSConfiguration;
    }

    @JsonIgnore
    public void setAllowAdvancedQOSConfiguration(Boolean value) { 
        this.allowAdvancedQOSConfiguration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowGatewayManagement", readOnly = false)   
    public Boolean getAllowGatewayManagement() {
       return allowGatewayManagement;
    }

    @JsonIgnore
    public void setAllowGatewayManagement(Boolean value) { 
        this.allowGatewayManagement = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowTrustedForwardingClass", readOnly = false)   
    public Boolean getAllowTrustedForwardingClass() {
       return allowTrustedForwardingClass;
    }

    @JsonIgnore
    public void setAllowTrustedForwardingClass(Boolean value) { 
        this.allowTrustedForwardingClass = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedForwardingClasses", readOnly = false)   
    public java.util.List<EnterpriseProfileAllowedForwardingClasses> getAllowedForwardingClasses() {
       return allowedForwardingClasses;
    }

    @JsonIgnore
    public void setAllowedForwardingClasses(java.util.List<EnterpriseProfileAllowedForwardingClasses> value) { 
        this.allowedForwardingClasses = value;
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
    @VsoProperty(displayName = "EnableApplicationPerformanceManagement", readOnly = false)   
    public Boolean getEnableApplicationPerformanceManagement() {
       return enableApplicationPerformanceManagement;
    }

    @JsonIgnore
    public void setEnableApplicationPerformanceManagement(Boolean value) { 
        this.enableApplicationPerformanceManagement = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EncryptionManagementMode", readOnly = false)   
    public EnterpriseProfileEncryptionManagementMode getEncryptionManagementMode() {
       return encryptionManagementMode;
    }

    @JsonIgnore
    public void setEncryptionManagementMode(EnterpriseProfileEncryptionManagementMode value) { 
        this.encryptionManagementMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public EnterpriseProfileEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(EnterpriseProfileEntityScope value) { 
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
    @VsoProperty(displayName = "FloatingIPsQuota", readOnly = false)   
    public Long getFloatingIPsQuota() {
       return floatingIPsQuota;
    }

    @JsonIgnore
    public void setFloatingIPsQuota(Long value) { 
        this.floatingIPsQuota = value;
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
    @VsoProperty(displayName = "ReceiveMultiCastListID", readOnly = false)   
    public String getReceiveMultiCastListID() {
       return receiveMultiCastListID;
    }

    @JsonIgnore
    public void setReceiveMultiCastListID(String value) { 
        this.receiveMultiCastListID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SendMultiCastListID", readOnly = false)   
    public String getSendMultiCastListID() {
       return sendMultiCastListID;
    }

    @JsonIgnore
    public void setSendMultiCastListID(String value) { 
        this.sendMultiCastListID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Enterprises", readOnly = true)   
    public EnterprisesFetcher getEnterprises() {
        return enterprises;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExternalServices", readOnly = true)   
    public ExternalServicesFetcher getExternalServices() {
        return externalServices;
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
    @VsoProperty(displayName = "MultiCastLists", readOnly = true)   
    public MultiCastListsFetcher getMultiCastLists() {
        return multiCastLists;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.ENTERPRISEPROFILE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ENTERPRISEPROFILE, getId());
        }
    }
    @VsoMethod
    public void assignExternalServices(Session session, ExternalService[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ENTERPRISEPROFILE, getId());
        }
    }
    
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ENTERPRISEPROFILE, getId());
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
        return "EnterpriseProfile [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", DPIEnabled=" + DPIEnabled + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", description=" + description + ", enableApplicationPerformanceManagement=" + enableApplicationPerformanceManagement + ", encryptionManagementMode=" + encryptionManagementMode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}