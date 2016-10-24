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
import net.nuagenetworks.vro.vspk.model.fetchers.AddressMapsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BulkStatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NATMapEntriesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsPoliciesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.PATNATPoolAssociatedGatewayType;

import net.nuagenetworks.vro.vspk.model.enums.PATNATPoolEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.PATNATPoolPermittedAction;
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

@VsoFinder(name = Constants.PATNATPOOL, datasource = Constants.DATASOURCE, image = Constants.PATNATPOOL_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ADDRESSMAPS_FETCHER, type = Constants.ADDRESSMAPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NATMAPENTRIES_FETCHER, type = Constants.NATMAPENTRIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.STATISTICSPOLICIES_FETCHER, type = Constants.STATISTICSPOLICIES_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "patnatpool", resourceName = "patnatpools")
public class PATNATPool extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "addressRange")
    protected String addressRange;
    
    @JsonProperty(value = "associatedGatewayId")
    protected String associatedGatewayId;
    
    @JsonProperty(value = "associatedGatewayType")
    protected PATNATPoolAssociatedGatewayType associatedGatewayType;
    
    @JsonProperty(value = "associatedSubnetId")
    protected String associatedSubnetId;
    
    @JsonProperty(value = "associatedVlanId")
    protected String associatedVlanId;
    
    @JsonProperty(value = "defaultPATIP")
    protected String defaultPATIP;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "dynamicSourceEnabled")
    protected Boolean dynamicSourceEnabled;
    
    @JsonProperty(value = "endAddressRange")
    protected String endAddressRange;
    
    @JsonProperty(value = "endSourceAddress")
    protected String endSourceAddress;
    
    @JsonProperty(value = "entityScope")
    protected PATNATPoolEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "permittedAction")
    protected PATNATPoolPermittedAction permittedAction;
    
    @JsonProperty(value = "startAddressRange")
    protected String startAddressRange;
    
    @JsonProperty(value = "startSourceAddress")
    protected String startSourceAddress;
    
    @JsonIgnore
    private AddressMapsFetcher addressMaps;
    
    @JsonIgnore
    private BulkStatisticsFetcher bulkStatistics;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private NATMapEntriesFetcher nATMapEntries;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @JsonIgnore
    private StatisticsPoliciesFetcher statisticsPolicies;
    
    @VsoConstructor
    public PATNATPool() {
        addressMaps = new AddressMapsFetcher(this);
        
        bulkStatistics = new BulkStatisticsFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        nATMapEntries = new NATMapEntriesFetcher(this);
        
        statistics = new StatisticsFetcher(this);
        
        statisticsPolicies = new StatisticsPoliciesFetcher(this);
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
    @VsoProperty(displayName = "AddressRange", readOnly = false)   
    public String getAddressRange() {
       return addressRange;
    }

    @JsonIgnore
    public void setAddressRange(String value) { 
        this.addressRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayId", readOnly = false)   
    public String getAssociatedGatewayId() {
       return associatedGatewayId;
    }

    @JsonIgnore
    public void setAssociatedGatewayId(String value) { 
        this.associatedGatewayId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayType", readOnly = false)   
    public PATNATPoolAssociatedGatewayType getAssociatedGatewayType() {
       return associatedGatewayType;
    }

    @JsonIgnore
    public void setAssociatedGatewayType(PATNATPoolAssociatedGatewayType value) { 
        this.associatedGatewayType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSubnetId", readOnly = false)   
    public String getAssociatedSubnetId() {
       return associatedSubnetId;
    }

    @JsonIgnore
    public void setAssociatedSubnetId(String value) { 
        this.associatedSubnetId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVlanId", readOnly = false)   
    public String getAssociatedVlanId() {
       return associatedVlanId;
    }

    @JsonIgnore
    public void setAssociatedVlanId(String value) { 
        this.associatedVlanId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DefaultPATIP", readOnly = false)   
    public String getDefaultPATIP() {
       return defaultPATIP;
    }

    @JsonIgnore
    public void setDefaultPATIP(String value) { 
        this.defaultPATIP = value;
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
    @VsoProperty(displayName = "DynamicSourceEnabled", readOnly = false)   
    public Boolean getDynamicSourceEnabled() {
       return dynamicSourceEnabled;
    }

    @JsonIgnore
    public void setDynamicSourceEnabled(Boolean value) { 
        this.dynamicSourceEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EndAddressRange", readOnly = false)   
    public String getEndAddressRange() {
       return endAddressRange;
    }

    @JsonIgnore
    public void setEndAddressRange(String value) { 
        this.endAddressRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EndSourceAddress", readOnly = false)   
    public String getEndSourceAddress() {
       return endSourceAddress;
    }

    @JsonIgnore
    public void setEndSourceAddress(String value) { 
        this.endSourceAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public PATNATPoolEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(PATNATPoolEntityScope value) { 
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
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public PATNATPoolPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(PATNATPoolPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StartAddressRange", readOnly = false)   
    public String getStartAddressRange() {
       return startAddressRange;
    }

    @JsonIgnore
    public void setStartAddressRange(String value) { 
        this.startAddressRange = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StartSourceAddress", readOnly = false)   
    public String getStartSourceAddress() {
       return startSourceAddress;
    }

    @JsonIgnore
    public void setStartSourceAddress(String value) { 
        this.startSourceAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressMaps", readOnly = true)   
    public AddressMapsFetcher getAddressMaps() {
        return addressMaps;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BulkStatistics", readOnly = true)   
    public BulkStatisticsFetcher getBulkStatistics() {
        return bulkStatistics;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterprisePermissions", readOnly = true)   
    public EnterprisePermissionsFetcher getEnterprisePermissions() {
        return enterprisePermissions;
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
    @VsoProperty(displayName = "NATMapEntries", readOnly = true)   
    public NATMapEntriesFetcher getNATMapEntries() {
        return nATMapEntries;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Statistics", readOnly = true)   
    public StatisticsFetcher getStatistics() {
        return statistics;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatisticsPolicies", readOnly = true)   
    public StatisticsPoliciesFetcher getStatisticsPolicies() {
        return statisticsPolicies;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.PATNATPOOL, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.PATNATPOOL, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.PATNATPOOL, getId());
        }
    }
    
    @VsoMethod
    public void createAddressMap(Session session, AddressMap childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ADDRESSMAPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEnterprisePermission(Session session, EnterprisePermission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISEPERMISSIONS_FETCHER, getId());
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
    public void createNATMapEntry(Session session, NATMapEntry childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NATMAPENTRIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createStatisticsPolicy(Session session, StatisticsPolicy childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.STATISTICSPOLICIES_FETCHER, getId());
        }
    }public String toString() {
        return "PATNATPool [" + "addressRange=" + addressRange + ", associatedGatewayId=" + associatedGatewayId + ", associatedGatewayType=" + associatedGatewayType + ", associatedSubnetId=" + associatedSubnetId + ", associatedVlanId=" + associatedVlanId + ", defaultPATIP=" + defaultPATIP + ", description=" + description + ", dynamicSourceEnabled=" + dynamicSourceEnabled + ", endAddressRange=" + endAddressRange + ", endSourceAddress=" + endSourceAddress + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", startAddressRange=" + startAddressRange + ", startSourceAddress=" + startSourceAddress + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}