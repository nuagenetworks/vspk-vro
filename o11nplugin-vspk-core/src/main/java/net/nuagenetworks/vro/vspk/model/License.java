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
import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.LicenseEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.LicenseLicenseEncryption;

import net.nuagenetworks.vro.vspk.model.enums.LicenseLicenseType;
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

@VsoFinder(name = Constants.LICENSE, datasource = Constants.DATASOURCE, image = Constants.LICENSE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "license", resourceName = "licenses")
public class License extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "additionalSupportedVersions")
    protected String additionalSupportedVersions;
    
    @JsonProperty(value = "allowedAVRSGsCount")
    protected Long allowedAVRSGsCount;
    
    @JsonProperty(value = "allowedAVRSsCount")
    protected Long allowedAVRSsCount;
    
    @JsonProperty(value = "allowedCPEsCount")
    protected Long allowedCPEsCount;
    
    @JsonProperty(value = "allowedNICsCount")
    protected Long allowedNICsCount;
    
    @JsonProperty(value = "allowedVDFGsCount")
    protected Long allowedVDFGsCount;
    
    @JsonProperty(value = "allowedVDFsCount")
    protected Long allowedVDFsCount;
    
    @JsonProperty(value = "allowedVMsCount")
    protected Long allowedVMsCount;
    
    @JsonProperty(value = "allowedVRSGsCount")
    protected Long allowedVRSGsCount;
    
    @JsonProperty(value = "allowedVRSsCount")
    protected Long allowedVRSsCount;
    
    @JsonProperty(value = "city")
    protected String city;
    
    @JsonProperty(value = "company")
    protected String company;
    
    @JsonProperty(value = "country")
    protected String country;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "customerKey")
    protected String customerKey;
    
    @JsonProperty(value = "email")
    protected String email;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "encryptionMode")
    protected Boolean encryptionMode;
    
    @JsonProperty(value = "entityScope")
    protected LicenseEntityScope entityScope;
    
    @JsonProperty(value = "expirationDate")
    protected Float expirationDate;
    
    @JsonProperty(value = "expiryTimestamp")
    protected Long expiryTimestamp;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "isClusterLicense")
    protected Boolean isClusterLicense;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "license")
    protected String license;
    
    @JsonProperty(value = "licenseEncryption")
    protected LicenseLicenseEncryption licenseEncryption;
    
    @JsonProperty(value = "licenseEntities")
    protected String licenseEntities;
    
    @JsonProperty(value = "licenseID")
    protected Long licenseID;
    
    @JsonProperty(value = "licenseType")
    protected LicenseLicenseType licenseType;
    
    @JsonProperty(value = "licensedFeature")
    protected String licensedFeature;
    
    @JsonProperty(value = "majorRelease")
    protected Long majorRelease;
    
    @JsonProperty(value = "minorRelease")
    protected Long minorRelease;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "phone")
    protected String phone;
    
    @JsonProperty(value = "productVersion")
    protected String productVersion;
    
    @JsonProperty(value = "provider")
    protected String provider;
    
    @JsonProperty(value = "requestID")
    protected String requestID;
    
    @JsonProperty(value = "state")
    protected String state;
    
    @JsonProperty(value = "street")
    protected String street;
    
    @JsonProperty(value = "system")
    protected String system;
    
    @JsonProperty(value = "uniqueLicenseIdentifier")
    protected String uniqueLicenseIdentifier;
    
    @JsonProperty(value = "userName")
    protected String userName;
    
    @JsonProperty(value = "zip")
    protected String zip;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @VsoConstructor
    public License() {
        eventLogs = new EventLogsFetcher(this);
        
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
    @VsoProperty(displayName = "AdditionalSupportedVersions", readOnly = false)   
    public String getAdditionalSupportedVersions() {
       return additionalSupportedVersions;
    }

    @JsonIgnore
    public void setAdditionalSupportedVersions(String value) { 
        this.additionalSupportedVersions = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedAVRSGsCount", readOnly = false)   
    public Long getAllowedAVRSGsCount() {
       return allowedAVRSGsCount;
    }

    @JsonIgnore
    public void setAllowedAVRSGsCount(Long value) { 
        this.allowedAVRSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedAVRSsCount", readOnly = false)   
    public Long getAllowedAVRSsCount() {
       return allowedAVRSsCount;
    }

    @JsonIgnore
    public void setAllowedAVRSsCount(Long value) { 
        this.allowedAVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedCPEsCount", readOnly = false)   
    public Long getAllowedCPEsCount() {
       return allowedCPEsCount;
    }

    @JsonIgnore
    public void setAllowedCPEsCount(Long value) { 
        this.allowedCPEsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedNICsCount", readOnly = false)   
    public Long getAllowedNICsCount() {
       return allowedNICsCount;
    }

    @JsonIgnore
    public void setAllowedNICsCount(Long value) { 
        this.allowedNICsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedVDFGsCount", readOnly = false)   
    public Long getAllowedVDFGsCount() {
       return allowedVDFGsCount;
    }

    @JsonIgnore
    public void setAllowedVDFGsCount(Long value) { 
        this.allowedVDFGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedVDFsCount", readOnly = false)   
    public Long getAllowedVDFsCount() {
       return allowedVDFsCount;
    }

    @JsonIgnore
    public void setAllowedVDFsCount(Long value) { 
        this.allowedVDFsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedVMsCount", readOnly = false)   
    public Long getAllowedVMsCount() {
       return allowedVMsCount;
    }

    @JsonIgnore
    public void setAllowedVMsCount(Long value) { 
        this.allowedVMsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedVRSGsCount", readOnly = false)   
    public Long getAllowedVRSGsCount() {
       return allowedVRSGsCount;
    }

    @JsonIgnore
    public void setAllowedVRSGsCount(Long value) { 
        this.allowedVRSGsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AllowedVRSsCount", readOnly = false)   
    public Long getAllowedVRSsCount() {
       return allowedVRSsCount;
    }

    @JsonIgnore
    public void setAllowedVRSsCount(Long value) { 
        this.allowedVRSsCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "City", readOnly = false)   
    public String getCity() {
       return city;
    }

    @JsonIgnore
    public void setCity(String value) { 
        this.city = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Company", readOnly = false)   
    public String getCompany() {
       return company;
    }

    @JsonIgnore
    public void setCompany(String value) { 
        this.company = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Country", readOnly = false)   
    public String getCountry() {
       return country;
    }

    @JsonIgnore
    public void setCountry(String value) { 
        this.country = value;
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
    @VsoProperty(displayName = "CustomerKey", readOnly = false)   
    public String getCustomerKey() {
       return customerKey;
    }

    @JsonIgnore
    public void setCustomerKey(String value) { 
        this.customerKey = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Email", readOnly = false)   
    public String getEmail() {
       return email;
    }

    @JsonIgnore
    public void setEmail(String value) { 
        this.email = value;
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
    @VsoProperty(displayName = "EncryptionMode", readOnly = false)   
    public Boolean getEncryptionMode() {
       return encryptionMode;
    }

    @JsonIgnore
    public void setEncryptionMode(Boolean value) { 
        this.encryptionMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public LicenseEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(LicenseEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExpirationDate", readOnly = false)   
    public Float getExpirationDate() {
       return expirationDate;
    }

    @JsonIgnore
    public void setExpirationDate(Float value) { 
        this.expirationDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExpiryTimestamp", readOnly = false)   
    public Long getExpiryTimestamp() {
       return expiryTimestamp;
    }

    @JsonIgnore
    public void setExpiryTimestamp(Long value) { 
        this.expiryTimestamp = value;
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
    @VsoProperty(displayName = "IsClusterLicense", readOnly = false)   
    public Boolean getIsClusterLicense() {
       return isClusterLicense;
    }

    @JsonIgnore
    public void setIsClusterLicense(Boolean value) { 
        this.isClusterLicense = value;
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
    @VsoProperty(displayName = "License", readOnly = false)   
    public String getLicense() {
       return license;
    }

    @JsonIgnore
    public void setLicense(String value) { 
        this.license = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LicenseEncryption", readOnly = false)   
    public LicenseLicenseEncryption getLicenseEncryption() {
       return licenseEncryption;
    }

    @JsonIgnore
    public void setLicenseEncryption(LicenseLicenseEncryption value) { 
        this.licenseEncryption = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LicenseEntities", readOnly = false)   
    public String getLicenseEntities() {
       return licenseEntities;
    }

    @JsonIgnore
    public void setLicenseEntities(String value) { 
        this.licenseEntities = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LicenseID", readOnly = false)   
    public Long getLicenseID() {
       return licenseID;
    }

    @JsonIgnore
    public void setLicenseID(Long value) { 
        this.licenseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LicenseType", readOnly = false)   
    public LicenseLicenseType getLicenseType() {
       return licenseType;
    }

    @JsonIgnore
    public void setLicenseType(LicenseLicenseType value) { 
        this.licenseType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LicensedFeature", readOnly = false)   
    public String getLicensedFeature() {
       return licensedFeature;
    }

    @JsonIgnore
    public void setLicensedFeature(String value) { 
        this.licensedFeature = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MajorRelease", readOnly = false)   
    public Long getMajorRelease() {
       return majorRelease;
    }

    @JsonIgnore
    public void setMajorRelease(Long value) { 
        this.majorRelease = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MinorRelease", readOnly = false)   
    public Long getMinorRelease() {
       return minorRelease;
    }

    @JsonIgnore
    public void setMinorRelease(Long value) { 
        this.minorRelease = value;
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
    @VsoProperty(displayName = "Phone", readOnly = false)   
    public String getPhone() {
       return phone;
    }

    @JsonIgnore
    public void setPhone(String value) { 
        this.phone = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProductVersion", readOnly = false)   
    public String getProductVersion() {
       return productVersion;
    }

    @JsonIgnore
    public void setProductVersion(String value) { 
        this.productVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Provider", readOnly = false)   
    public String getProvider() {
       return provider;
    }

    @JsonIgnore
    public void setProvider(String value) { 
        this.provider = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RequestID", readOnly = false)   
    public String getRequestID() {
       return requestID;
    }

    @JsonIgnore
    public void setRequestID(String value) { 
        this.requestID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "State", readOnly = false)   
    public String getState() {
       return state;
    }

    @JsonIgnore
    public void setState(String value) { 
        this.state = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Street", readOnly = false)   
    public String getStreet() {
       return street;
    }

    @JsonIgnore
    public void setStreet(String value) { 
        this.street = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "System", readOnly = false)   
    public String getSystem() {
       return system;
    }

    @JsonIgnore
    public void setSystem(String value) { 
        this.system = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UniqueLicenseIdentifier", readOnly = false)   
    public String getUniqueLicenseIdentifier() {
       return uniqueLicenseIdentifier;
    }

    @JsonIgnore
    public void setUniqueLicenseIdentifier(String value) { 
        this.uniqueLicenseIdentifier = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserName", readOnly = false)   
    public String getUserName() {
       return userName;
    }

    @JsonIgnore
    public void setUserName(String value) { 
        this.userName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Zip", readOnly = false)   
    public String getZip() {
       return zip;
    }

    @JsonIgnore
    public void setZip(String value) { 
        this.zip = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.LICENSE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.LICENSE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LICENSE, getId());
        }
    }
    
    @VsoMethod
    public void assignPermissions(Session session, Permission[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LICENSE, getId());
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
        return "License [" + "additionalSupportedVersions=" + additionalSupportedVersions + ", allowedAVRSGsCount=" + allowedAVRSGsCount + ", allowedAVRSsCount=" + allowedAVRSsCount + ", allowedCPEsCount=" + allowedCPEsCount + ", allowedNICsCount=" + allowedNICsCount + ", allowedVDFGsCount=" + allowedVDFGsCount + ", allowedVDFsCount=" + allowedVDFsCount + ", allowedVMsCount=" + allowedVMsCount + ", allowedVRSGsCount=" + allowedVRSGsCount + ", allowedVRSsCount=" + allowedVRSsCount + ", city=" + city + ", company=" + company + ", country=" + country + ", creationDate=" + creationDate + ", customerKey=" + customerKey + ", email=" + email + ", embeddedMetadata=" + embeddedMetadata + ", encryptionMode=" + encryptionMode + ", entityScope=" + entityScope + ", expirationDate=" + expirationDate + ", expiryTimestamp=" + expiryTimestamp + ", externalID=" + externalID + ", isClusterLicense=" + isClusterLicense + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", license=" + license + ", licenseEncryption=" + licenseEncryption + ", licenseEntities=" + licenseEntities + ", licenseID=" + licenseID + ", licenseType=" + licenseType + ", licensedFeature=" + licensedFeature + ", majorRelease=" + majorRelease + ", minorRelease=" + minorRelease + ", owner=" + owner + ", phone=" + phone + ", productVersion=" + productVersion + ", provider=" + provider + ", requestID=" + requestID + ", state=" + state + ", street=" + street + ", system=" + system + ", uniqueLicenseIdentifier=" + uniqueLicenseIdentifier + ", userName=" + userName + ", zip=" + zip + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}