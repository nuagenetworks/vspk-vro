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
import net.nuagenetworks.vro.vspk.model.fetchers.CSNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DemarcationServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NextHopsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.OverlayAddressPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PolicyStatementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PSNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.LinkAcceptanceCriteria;

import net.nuagenetworks.vro.vspk.model.enums.LinkAssociatedDestinationType;

import net.nuagenetworks.vro.vspk.model.enums.LinkEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.LinkType;
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

@VsoFinder(name = Constants.LINK, datasource = Constants.DATASOURCE, image = Constants.LINK_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.CSNATPOOLS_FETCHER, type = Constants.CSNATPOOLS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.DEMARCATIONSERVICES_FETCHER, type = Constants.DEMARCATIONSERVICES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.NEXTHOPS_FETCHER, type = Constants.NEXTHOPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.OVERLAYADDRESSPOOLS_FETCHER, type = Constants.OVERLAYADDRESSPOOLS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.POLICYSTATEMENTS_FETCHER, type = Constants.POLICYSTATEMENTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PSNATPOOLS_FETCHER, type = Constants.PSNATPOOLS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "link", resourceName = "links")
public class Link extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "acceptanceCriteria")
    protected LinkAcceptanceCriteria acceptanceCriteria;
    
    @JsonProperty(value = "associatedDestinationID")
    protected String associatedDestinationID;
    
    @JsonProperty(value = "associatedDestinationName")
    protected String associatedDestinationName;
    
    @JsonProperty(value = "associatedDestinationType")
    protected LinkAssociatedDestinationType associatedDestinationType;
    
    @JsonProperty(value = "associatedSourceID")
    protected String associatedSourceID;
    
    @JsonProperty(value = "associatedSourceName")
    protected String associatedSourceName;
    
    @JsonProperty(value = "associatedSourceType")
    protected String associatedSourceType;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected LinkEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "readOnly")
    protected Boolean readOnly;
    
    @JsonProperty(value = "type")
    protected LinkType type;
    
    @JsonIgnore
    private CSNATPoolsFetcher cSNATPools;
    
    @JsonIgnore
    private DemarcationServicesFetcher demarcationServices;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private NextHopsFetcher nextHops;
    
    @JsonIgnore
    private OverlayAddressPoolsFetcher overlayAddressPools;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PolicyStatementsFetcher policyStatements;
    
    @JsonIgnore
    private PSNATPoolsFetcher pSNATPools;
    
    @VsoConstructor
    public Link() {
        cSNATPools = new CSNATPoolsFetcher(this);
        
        demarcationServices = new DemarcationServicesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        nextHops = new NextHopsFetcher(this);
        
        overlayAddressPools = new OverlayAddressPoolsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        policyStatements = new PolicyStatementsFetcher(this);
        
        pSNATPools = new PSNATPoolsFetcher(this);
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
    @VsoProperty(displayName = "AcceptanceCriteria", readOnly = false)   
    public LinkAcceptanceCriteria getAcceptanceCriteria() {
       return acceptanceCriteria;
    }

    @JsonIgnore
    public void setAcceptanceCriteria(LinkAcceptanceCriteria value) { 
        this.acceptanceCriteria = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDestinationID", readOnly = false)   
    public String getAssociatedDestinationID() {
       return associatedDestinationID;
    }

    @JsonIgnore
    public void setAssociatedDestinationID(String value) { 
        this.associatedDestinationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDestinationName", readOnly = false)   
    public String getAssociatedDestinationName() {
       return associatedDestinationName;
    }

    @JsonIgnore
    public void setAssociatedDestinationName(String value) { 
        this.associatedDestinationName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedDestinationType", readOnly = false)   
    public LinkAssociatedDestinationType getAssociatedDestinationType() {
       return associatedDestinationType;
    }

    @JsonIgnore
    public void setAssociatedDestinationType(LinkAssociatedDestinationType value) { 
        this.associatedDestinationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSourceID", readOnly = false)   
    public String getAssociatedSourceID() {
       return associatedSourceID;
    }

    @JsonIgnore
    public void setAssociatedSourceID(String value) { 
        this.associatedSourceID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSourceName", readOnly = false)   
    public String getAssociatedSourceName() {
       return associatedSourceName;
    }

    @JsonIgnore
    public void setAssociatedSourceName(String value) { 
        this.associatedSourceName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSourceType", readOnly = false)   
    public String getAssociatedSourceType() {
       return associatedSourceType;
    }

    @JsonIgnore
    public void setAssociatedSourceType(String value) { 
        this.associatedSourceType = value;
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
    public LinkEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(LinkEntityScope value) { 
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
    @VsoProperty(displayName = "ReadOnly", readOnly = false)   
    public Boolean getReadOnly() {
       return readOnly;
    }

    @JsonIgnore
    public void setReadOnly(Boolean value) { 
        this.readOnly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Type", readOnly = false)   
    public LinkType getType() {
       return type;
    }

    @JsonIgnore
    public void setType(LinkType value) { 
        this.type = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CSNATPools", readOnly = true)   
    public CSNATPoolsFetcher getCSNATPools() {
        return cSNATPools;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DemarcationServices", readOnly = true)   
    public DemarcationServicesFetcher getDemarcationServices() {
        return demarcationServices;
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
    @VsoProperty(displayName = "NextHops", readOnly = true)   
    public NextHopsFetcher getNextHops() {
        return nextHops;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "OverlayAddressPools", readOnly = true)   
    public OverlayAddressPoolsFetcher getOverlayAddressPools() {
        return overlayAddressPools;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyStatements", readOnly = true)   
    public PolicyStatementsFetcher getPolicyStatements() {
        return policyStatements;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PSNATPools", readOnly = true)   
    public PSNATPoolsFetcher getPSNATPools() {
        return pSNATPools;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.LINK, getId());
        }
    }
    @VsoMethod
    public void assignCSNATPools(Session session, CSNATPool[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void assignDemarcationServices(Session session, DemarcationService[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void assignNextHops(Session session, NextHop[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void assignPolicyStatements(Session session, PolicyStatement[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void assignPSNATPools(Session session, PSNATPool[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LINK, getId());
        }
    }
    
    @VsoMethod
    public void createCSNATPool(Session session, CSNATPool childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CSNATPOOLS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createDemarcationService(Session session, DemarcationService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DEMARCATIONSERVICES_FETCHER, getId());
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
    public void createNextHop(Session session, NextHop childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.NEXTHOPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createOverlayAddressPool(Session session, OverlayAddressPool childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.OVERLAYADDRESSPOOLS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPolicyStatement(Session session, PolicyStatement childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.POLICYSTATEMENTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPSNATPool(Session session, PSNATPool childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PSNATPOOLS_FETCHER, getId());
        }
    }public String toString() {
        return "Link [" + "acceptanceCriteria=" + acceptanceCriteria + ", associatedDestinationID=" + associatedDestinationID + ", associatedDestinationName=" + associatedDestinationName + ", associatedDestinationType=" + associatedDestinationType + ", associatedSourceID=" + associatedSourceID + ", associatedSourceName=" + associatedSourceName + ", associatedSourceType=" + associatedSourceType + ", creationDate=" + creationDate + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", owner=" + owner + ", readOnly=" + readOnly + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}