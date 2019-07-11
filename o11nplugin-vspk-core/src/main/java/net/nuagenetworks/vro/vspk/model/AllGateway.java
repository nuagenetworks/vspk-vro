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

import net.nuagenetworks.vro.vspk.model.enums.AllGatewayZFBMatchAttribute;

import net.nuagenetworks.vro.vspk.model.enums.AllGatewayBootstrapStatus;

import net.nuagenetworks.vro.vspk.model.enums.AllGatewayEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.AllGatewayFamily;

import net.nuagenetworks.vro.vspk.model.enums.AllGatewayPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.AllGatewayPersonality;
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

@VsoFinder(name = Constants.ALLGATEWAY, datasource = Constants.DATASOURCE, image = Constants.ALLGATEWAY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "allgateway", resourceName = "allgateways")
public class AllGateway extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BIOSReleaseDate")
    protected String BIOSReleaseDate;
    
    @JsonProperty(value = "BIOSVersion")
    protected String BIOSVersion;
    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "ZFBMatchAttribute")
    protected AllGatewayZFBMatchAttribute ZFBMatchAttribute;
    
    @JsonProperty(value = "ZFBMatchValue")
    protected String ZFBMatchValue;
    
    @JsonProperty(value = "associatedGatewaySecurityID")
    protected String associatedGatewaySecurityID;
    
    @JsonProperty(value = "associatedGatewaySecurityProfileID")
    protected String associatedGatewaySecurityProfileID;
    
    @JsonProperty(value = "associatedNSGInfoID")
    protected String associatedNSGInfoID;
    
    @JsonProperty(value = "associatedNetconfProfileID")
    protected String associatedNetconfProfileID;
    
    @JsonProperty(value = "autoDiscGatewayID")
    protected String autoDiscGatewayID;
    
    @JsonProperty(value = "bootstrapID")
    protected String bootstrapID;
    
    @JsonProperty(value = "bootstrapStatus")
    protected AllGatewayBootstrapStatus bootstrapStatus;
    
    @JsonProperty(value = "datapathID")
    protected String datapathID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected AllGatewayEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected AllGatewayFamily family;
    
    @JsonProperty(value = "gatewayConnected")
    protected Boolean gatewayConnected;
    
    @JsonProperty(value = "gatewayVersion")
    protected String gatewayVersion;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "libraries")
    protected String libraries;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "managementID")
    protected String managementID;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "patches")
    protected String patches;
    
    @JsonProperty(value = "peer")
    protected String peer;
    
    @JsonProperty(value = "pending")
    protected Boolean pending;
    
    @JsonProperty(value = "permittedAction")
    protected AllGatewayPermittedAction permittedAction;
    
    @JsonProperty(value = "personality")
    protected AllGatewayPersonality personality;
    
    @JsonProperty(value = "productName")
    protected String productName;
    
    @JsonProperty(value = "redundancyGroupID")
    protected String redundancyGroupID;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "useGatewayVLANVNID")
    protected Boolean useGatewayVLANVNID;
    
    @JsonProperty(value = "vtep")
    protected String vtep;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public AllGateway() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
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
    @VsoProperty(displayName = "BIOSReleaseDate", readOnly = false)   
    public String getBIOSReleaseDate() {
       return BIOSReleaseDate;
    }

    @JsonIgnore
    public void setBIOSReleaseDate(String value) { 
        this.BIOSReleaseDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BIOSVersion", readOnly = false)   
    public String getBIOSVersion() {
       return BIOSVersion;
    }

    @JsonIgnore
    public void setBIOSVersion(String value) { 
        this.BIOSVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUType", readOnly = false)   
    public String getCPUType() {
       return CPUType;
    }

    @JsonIgnore
    public void setCPUType(String value) { 
        this.CPUType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MACAddress", readOnly = false)   
    public String getMACAddress() {
       return MACAddress;
    }

    @JsonIgnore
    public void setMACAddress(String value) { 
        this.MACAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UUID", readOnly = false)   
    public String getUUID() {
       return UUID;
    }

    @JsonIgnore
    public void setUUID(String value) { 
        this.UUID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBMatchAttribute", readOnly = false)   
    public AllGatewayZFBMatchAttribute getZFBMatchAttribute() {
       return ZFBMatchAttribute;
    }

    @JsonIgnore
    public void setZFBMatchAttribute(AllGatewayZFBMatchAttribute value) { 
        this.ZFBMatchAttribute = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBMatchValue", readOnly = false)   
    public String getZFBMatchValue() {
       return ZFBMatchValue;
    }

    @JsonIgnore
    public void setZFBMatchValue(String value) { 
        this.ZFBMatchValue = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewaySecurityID", readOnly = false)   
    public String getAssociatedGatewaySecurityID() {
       return associatedGatewaySecurityID;
    }

    @JsonIgnore
    public void setAssociatedGatewaySecurityID(String value) { 
        this.associatedGatewaySecurityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewaySecurityProfileID", readOnly = false)   
    public String getAssociatedGatewaySecurityProfileID() {
       return associatedGatewaySecurityProfileID;
    }

    @JsonIgnore
    public void setAssociatedGatewaySecurityProfileID(String value) { 
        this.associatedGatewaySecurityProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGInfoID", readOnly = false)   
    public String getAssociatedNSGInfoID() {
       return associatedNSGInfoID;
    }

    @JsonIgnore
    public void setAssociatedNSGInfoID(String value) { 
        this.associatedNSGInfoID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNetconfProfileID", readOnly = false)   
    public String getAssociatedNetconfProfileID() {
       return associatedNetconfProfileID;
    }

    @JsonIgnore
    public void setAssociatedNetconfProfileID(String value) { 
        this.associatedNetconfProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AutoDiscGatewayID", readOnly = false)   
    public String getAutoDiscGatewayID() {
       return autoDiscGatewayID;
    }

    @JsonIgnore
    public void setAutoDiscGatewayID(String value) { 
        this.autoDiscGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapID", readOnly = false)   
    public String getBootstrapID() {
       return bootstrapID;
    }

    @JsonIgnore
    public void setBootstrapID(String value) { 
        this.bootstrapID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapStatus", readOnly = false)   
    public AllGatewayBootstrapStatus getBootstrapStatus() {
       return bootstrapStatus;
    }

    @JsonIgnore
    public void setBootstrapStatus(AllGatewayBootstrapStatus value) { 
        this.bootstrapStatus = value;
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
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
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
    @VsoProperty(displayName = "EnterpriseID", readOnly = false)   
    public String getEnterpriseID() {
       return enterpriseID;
    }

    @JsonIgnore
    public void setEnterpriseID(String value) { 
        this.enterpriseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public AllGatewayEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(AllGatewayEntityScope value) { 
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
    @VsoProperty(displayName = "Family", readOnly = false)   
    public AllGatewayFamily getFamily() {
       return family;
    }

    @JsonIgnore
    public void setFamily(AllGatewayFamily value) { 
        this.family = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConnected", readOnly = false)   
    public Boolean getGatewayConnected() {
       return gatewayConnected;
    }

    @JsonIgnore
    public void setGatewayConnected(Boolean value) { 
        this.gatewayConnected = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayVersion", readOnly = false)   
    public String getGatewayVersion() {
       return gatewayVersion;
    }

    @JsonIgnore
    public void setGatewayVersion(String value) { 
        this.gatewayVersion = value;
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
    @VsoProperty(displayName = "Libraries", readOnly = false)   
    public String getLibraries() {
       return libraries;
    }

    @JsonIgnore
    public void setLibraries(String value) { 
        this.libraries = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocationID", readOnly = false)   
    public String getLocationID() {
       return locationID;
    }

    @JsonIgnore
    public void setLocationID(String value) { 
        this.locationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ManagementID", readOnly = false)   
    public String getManagementID() {
       return managementID;
    }

    @JsonIgnore
    public void setManagementID(String value) { 
        this.managementID = value;
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
    @VsoProperty(displayName = "Patches", readOnly = false)   
    public String getPatches() {
       return patches;
    }

    @JsonIgnore
    public void setPatches(String value) { 
        this.patches = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Peer", readOnly = false)   
    public String getPeer() {
       return peer;
    }

    @JsonIgnore
    public void setPeer(String value) { 
        this.peer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Pending", readOnly = false)   
    public Boolean getPending() {
       return pending;
    }

    @JsonIgnore
    public void setPending(Boolean value) { 
        this.pending = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public AllGatewayPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(AllGatewayPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public AllGatewayPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(AllGatewayPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProductName", readOnly = false)   
    public String getProductName() {
       return productName;
    }

    @JsonIgnore
    public void setProductName(String value) { 
        this.productName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedundancyGroupID", readOnly = false)   
    public String getRedundancyGroupID() {
       return redundancyGroupID;
    }

    @JsonIgnore
    public void setRedundancyGroupID(String value) { 
        this.redundancyGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SerialNumber", readOnly = false)   
    public String getSerialNumber() {
       return serialNumber;
    }

    @JsonIgnore
    public void setSerialNumber(String value) { 
        this.serialNumber = value;
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
    @VsoProperty(displayName = "TemplateID", readOnly = false)   
    public String getTemplateID() {
       return templateID;
    }

    @JsonIgnore
    public void setTemplateID(String value) { 
        this.templateID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UseGatewayVLANVNID", readOnly = false)   
    public Boolean getUseGatewayVLANVNID() {
       return useGatewayVLANVNID;
    }

    @JsonIgnore
    public void setUseGatewayVLANVNID(Boolean value) { 
        this.useGatewayVLANVNID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vtep", readOnly = false)   
    public String getVtep() {
       return vtep;
    }

    @JsonIgnore
    public void setVtep(String value) { 
        this.vtep = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.ALLGATEWAY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ALLGATEWAY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.ALLGATEWAY, getId());
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
        return "AllGateway [" + "BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", UUID=" + UUID + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNetconfProfileID=" + associatedNetconfProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", datapathID=" + datapathID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", gatewayConnected=" + gatewayConnected + ", gatewayVersion=" + gatewayVersion + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", managementID=" + managementID + ", name=" + name + ", patches=" + patches + ", peer=" + peer + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", templateID=" + templateID + ", useGatewayVLANVNID=" + useGatewayVLANVNID + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}