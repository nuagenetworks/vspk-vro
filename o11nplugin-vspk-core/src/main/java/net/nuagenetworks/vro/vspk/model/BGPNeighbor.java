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
import net.nuagenetworks.vro.vspk.model.fetchers.DeploymentFailuresFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.BGPNeighborIPType;

import net.nuagenetworks.vro.vspk.model.enums.BGPNeighborEntityScope;
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

@VsoFinder(name = Constants.BGPNEIGHBOR, datasource = Constants.DATASOURCE, image = Constants.BGPNEIGHBOR_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.DEPLOYMENTFAILURES_FETCHER, type = Constants.DEPLOYMENTFAILURES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "bgpneighbor", resourceName = "bgpneighbors")
public class BGPNeighbor extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BFDEnabled")
    protected Boolean BFDEnabled;
    
    @JsonProperty(value = "IPType")
    protected BGPNeighborIPType IPType;
    
    @JsonProperty(value = "IPv6Address")
    protected String IPv6Address;
    
    @JsonProperty(value = "associatedExportRoutingPolicyID")
    protected String associatedExportRoutingPolicyID;
    
    @JsonProperty(value = "associatedImportRoutingPolicyID")
    protected String associatedImportRoutingPolicyID;
    
    @JsonProperty(value = "dampeningEnabled")
    protected Boolean dampeningEnabled;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "domainServiceLabel")
    protected String domainServiceLabel;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "entityScope")
    protected BGPNeighborEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "peerAS")
    protected Long peerAS;
    
    @JsonProperty(value = "peerConfiguration")
    protected String peerConfiguration;
    
    @JsonProperty(value = "peerIP")
    protected String peerIP;
    
    @JsonProperty(value = "session")
    protected String session_;
    
    @JsonIgnore
    private DeploymentFailuresFetcher deploymentFailures;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public BGPNeighbor() {
        deploymentFailures = new DeploymentFailuresFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        permissions = new PermissionsFetcher(this);
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
    @JsonIgnore
    @VsoProperty(displayName = "BFDEnabled", readOnly = false)   
    public Boolean getBFDEnabled() {
       return BFDEnabled;
    }

    @JsonIgnore
    public void setBFDEnabled(Boolean value) { 
        this.BFDEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPType", readOnly = false)   
    public BGPNeighborIPType getIPType() {
       return IPType;
    }

    @JsonIgnore
    public void setIPType(BGPNeighborIPType value) { 
        this.IPType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6Address", readOnly = false)   
    public String getIPv6Address() {
       return IPv6Address;
    }

    @JsonIgnore
    public void setIPv6Address(String value) { 
        this.IPv6Address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedExportRoutingPolicyID", readOnly = false)   
    public String getAssociatedExportRoutingPolicyID() {
       return associatedExportRoutingPolicyID;
    }

    @JsonIgnore
    public void setAssociatedExportRoutingPolicyID(String value) { 
        this.associatedExportRoutingPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedImportRoutingPolicyID", readOnly = false)   
    public String getAssociatedImportRoutingPolicyID() {
       return associatedImportRoutingPolicyID;
    }

    @JsonIgnore
    public void setAssociatedImportRoutingPolicyID(String value) { 
        this.associatedImportRoutingPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DampeningEnabled", readOnly = false)   
    public Boolean getDampeningEnabled() {
       return dampeningEnabled;
    }

    @JsonIgnore
    public void setDampeningEnabled(Boolean value) { 
        this.dampeningEnabled = value;
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
    @VsoProperty(displayName = "DomainServiceLabel", readOnly = false)   
    public String getDomainServiceLabel() {
       return domainServiceLabel;
    }

    @JsonIgnore
    public void setDomainServiceLabel(String value) { 
        this.domainServiceLabel = value;
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
    public BGPNeighborEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(BGPNeighborEntityScope value) { 
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerAS", readOnly = false)   
    public Long getPeerAS() {
       return peerAS;
    }

    @JsonIgnore
    public void setPeerAS(Long value) { 
        this.peerAS = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerConfiguration", readOnly = false)   
    public String getPeerConfiguration() {
       return peerConfiguration;
    }

    @JsonIgnore
    public void setPeerConfiguration(String value) { 
        this.peerConfiguration = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerIP", readOnly = false)   
    public String getPeerIP() {
       return peerIP;
    }

    @JsonIgnore
    public void setPeerIP(String value) { 
        this.peerIP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Session_", readOnly = false)   
    public String getSession_() {
       return session_;
    }

    @JsonIgnore
    public void setSession_(String value) { 
        this.session_ = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeploymentFailures", readOnly = true)   
    public DeploymentFailuresFetcher getDeploymentFailures() {
        return deploymentFailures;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.BGPNEIGHBOR, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.BGPNEIGHBOR, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.BGPNEIGHBOR, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.BGPNEIGHBOR, getId());
        }
    }
    
    @VsoMethod
    public void createDeploymentFailure(Session session, DeploymentFailure childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.DEPLOYMENTFAILURES_FETCHER, getId());
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
        return "BGPNeighbor [" + "BFDEnabled=" + BFDEnabled + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", associatedExportRoutingPolicyID=" + associatedExportRoutingPolicyID + ", associatedImportRoutingPolicyID=" + associatedImportRoutingPolicyID + ", dampeningEnabled=" + dampeningEnabled + ", description=" + description + ", domainServiceLabel=" + domainServiceLabel + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", name=" + name + ", peerAS=" + peerAS + ", peerConfiguration=" + peerConfiguration + ", peerIP=" + peerIP + ", session_=" + session_ + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}