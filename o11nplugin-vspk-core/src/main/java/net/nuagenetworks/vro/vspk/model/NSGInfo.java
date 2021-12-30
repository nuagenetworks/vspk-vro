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
import net.nuagenetworks.vro.vspk.model.enums.NSGInfoBootstrapStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoCmdStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoCmdType;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoFamily;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoPersonality;
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

@VsoFinder(name = Constants.NSGINFO, datasource = Constants.DATASOURCE, image = Constants.NSGINFO_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsginfo", resourceName = "nsginfos")
public class NSGInfo extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "AARApplicationReleaseDate")
    protected String AARApplicationReleaseDate;
    
    @JsonProperty(value = "AARApplicationVersion")
    protected String AARApplicationVersion;
    
    @JsonProperty(value = "BIOSReleaseDate")
    protected String BIOSReleaseDate;
    
    @JsonProperty(value = "BIOSVersion")
    protected String BIOSVersion;
    
    @JsonProperty(value = "CACertificate")
    protected Object CACertificate;
    
    @JsonProperty(value = "CPUCoreAllocation")
    protected String CPUCoreAllocation;
    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "NSGVersion")
    protected String NSGVersion;
    
    @JsonProperty(value = "SKU")
    protected String SKU;
    
    @JsonProperty(value = "TPMStatus")
    protected Long TPMStatus;
    
    @JsonProperty(value = "TPMVersion")
    protected String TPMVersion;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "associatedEntityType")
    protected String associatedEntityType;
    
    @JsonProperty(value = "associatedNSGatewayID")
    protected String associatedNSGatewayID;
    
    @JsonProperty(value = "bootstrapStatus")
    protected NSGInfoBootstrapStatus bootstrapStatus;
    
    @JsonProperty(value = "certificate")
    protected Object certificate;
    
    @JsonProperty(value = "cmdDetailedStatus")
    protected String cmdDetailedStatus;
    
    @JsonProperty(value = "cmdDetailedStatusCode")
    protected Long cmdDetailedStatusCode;
    
    @JsonProperty(value = "cmdDownloadProgress")
    protected Object cmdDownloadProgress;
    
    @JsonProperty(value = "cmdID")
    protected String cmdID;
    
    @JsonProperty(value = "cmdLastUpdatedDate")
    protected Float cmdLastUpdatedDate;
    
    @JsonProperty(value = "cmdStatus")
    protected NSGInfoCmdStatus cmdStatus;
    
    @JsonProperty(value = "cmdType")
    protected NSGInfoCmdType cmdType;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected NSGInfoEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected NSGInfoFamily family;
    
    @JsonProperty(value = "hugePageSetting")
    protected String hugePageSetting;
    
    @JsonProperty(value = "libraries")
    protected String libraries;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "patchesDetail")
    protected String patchesDetail;
    
    @JsonProperty(value = "personality")
    protected NSGInfoPersonality personality;
    
    @JsonProperty(value = "productName")
    protected String productName;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @VsoConstructor
    public NSGInfo() {}

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
    @VsoProperty(displayName = "AARApplicationReleaseDate", readOnly = false)   
    public String getAARApplicationReleaseDate() {
       return AARApplicationReleaseDate;
    }

    @JsonIgnore
    public void setAARApplicationReleaseDate(String value) { 
        this.AARApplicationReleaseDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AARApplicationVersion", readOnly = false)   
    public String getAARApplicationVersion() {
       return AARApplicationVersion;
    }

    @JsonIgnore
    public void setAARApplicationVersion(String value) { 
        this.AARApplicationVersion = value;
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
    @VsoProperty(displayName = "CACertificate", readOnly = false)   
    public Object getCACertificate() {
       return CACertificate;
    }

    @JsonIgnore
    public void setCACertificate(Object value) { 
        this.CACertificate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUCoreAllocation", readOnly = false)   
    public String getCPUCoreAllocation() {
       return CPUCoreAllocation;
    }

    @JsonIgnore
    public void setCPUCoreAllocation(String value) { 
        this.CPUCoreAllocation = value;
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
    @VsoProperty(displayName = "NSGVersion", readOnly = false)   
    public String getNSGVersion() {
       return NSGVersion;
    }

    @JsonIgnore
    public void setNSGVersion(String value) { 
        this.NSGVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SKU", readOnly = false)   
    public String getSKU() {
       return SKU;
    }

    @JsonIgnore
    public void setSKU(String value) { 
        this.SKU = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TPMStatus", readOnly = false)   
    public Long getTPMStatus() {
       return TPMStatus;
    }

    @JsonIgnore
    public void setTPMStatus(Long value) { 
        this.TPMStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TPMVersion", readOnly = false)   
    public String getTPMVersion() {
       return TPMVersion;
    }

    @JsonIgnore
    public void setTPMVersion(String value) { 
        this.TPMVersion = value;
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
    @VsoProperty(displayName = "AssociatedEntityType", readOnly = false)   
    public String getAssociatedEntityType() {
       return associatedEntityType;
    }

    @JsonIgnore
    public void setAssociatedEntityType(String value) { 
        this.associatedEntityType = value;
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
    @VsoProperty(displayName = "BootstrapStatus", readOnly = false)   
    public NSGInfoBootstrapStatus getBootstrapStatus() {
       return bootstrapStatus;
    }

    @JsonIgnore
    public void setBootstrapStatus(NSGInfoBootstrapStatus value) { 
        this.bootstrapStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Certificate", readOnly = false)   
    public Object getCertificate() {
       return certificate;
    }

    @JsonIgnore
    public void setCertificate(Object value) { 
        this.certificate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdDetailedStatus", readOnly = false)   
    public String getCmdDetailedStatus() {
       return cmdDetailedStatus;
    }

    @JsonIgnore
    public void setCmdDetailedStatus(String value) { 
        this.cmdDetailedStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdDetailedStatusCode", readOnly = false)   
    public Long getCmdDetailedStatusCode() {
       return cmdDetailedStatusCode;
    }

    @JsonIgnore
    public void setCmdDetailedStatusCode(Long value) { 
        this.cmdDetailedStatusCode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdDownloadProgress", readOnly = false)   
    public Object getCmdDownloadProgress() {
       return cmdDownloadProgress;
    }

    @JsonIgnore
    public void setCmdDownloadProgress(Object value) { 
        this.cmdDownloadProgress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdID", readOnly = false)   
    public String getCmdID() {
       return cmdID;
    }

    @JsonIgnore
    public void setCmdID(String value) { 
        this.cmdID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdLastUpdatedDate", readOnly = false)   
    public Float getCmdLastUpdatedDate() {
       return cmdLastUpdatedDate;
    }

    @JsonIgnore
    public void setCmdLastUpdatedDate(Float value) { 
        this.cmdLastUpdatedDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdStatus", readOnly = false)   
    public NSGInfoCmdStatus getCmdStatus() {
       return cmdStatus;
    }

    @JsonIgnore
    public void setCmdStatus(NSGInfoCmdStatus value) { 
        this.cmdStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CmdType", readOnly = false)   
    public NSGInfoCmdType getCmdType() {
       return cmdType;
    }

    @JsonIgnore
    public void setCmdType(NSGInfoCmdType value) { 
        this.cmdType = value;
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
    @VsoProperty(displayName = "EnterpriseName", readOnly = false)   
    public String getEnterpriseName() {
       return enterpriseName;
    }

    @JsonIgnore
    public void setEnterpriseName(String value) { 
        this.enterpriseName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public NSGInfoEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(NSGInfoEntityScope value) { 
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
    public NSGInfoFamily getFamily() {
       return family;
    }

    @JsonIgnore
    public void setFamily(NSGInfoFamily value) { 
        this.family = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "HugePageSetting", readOnly = false)   
    public String getHugePageSetting() {
       return hugePageSetting;
    }

    @JsonIgnore
    public void setHugePageSetting(String value) { 
        this.hugePageSetting = value;
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PatchesDetail", readOnly = false)   
    public String getPatchesDetail() {
       return patchesDetail;
    }

    @JsonIgnore
    public void setPatchesDetail(String value) { 
        this.patchesDetail = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public NSGInfoPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(NSGInfoPersonality value) { 
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.NSGINFO, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.NSGINFO, getId());
        }
    }public String toString() {
        return "NSGInfo [" + "AARApplicationReleaseDate=" + AARApplicationReleaseDate + ", AARApplicationVersion=" + AARApplicationVersion + ", BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CACertificate=" + CACertificate + ", CPUCoreAllocation=" + CPUCoreAllocation + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", TPMStatus=" + TPMStatus + ", TPMVersion=" + TPMVersion + ", UUID=" + UUID + ", associatedEntityType=" + associatedEntityType + ", associatedNSGatewayID=" + associatedNSGatewayID + ", bootstrapStatus=" + bootstrapStatus + ", certificate=" + certificate + ", cmdDetailedStatus=" + cmdDetailedStatus + ", cmdDetailedStatusCode=" + cmdDetailedStatusCode + ", cmdDownloadProgress=" + cmdDownloadProgress + ", cmdID=" + cmdID + ", cmdLastUpdatedDate=" + cmdLastUpdatedDate + ", cmdStatus=" + cmdStatus + ", cmdType=" + cmdType + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", hugePageSetting=" + hugePageSetting + ", libraries=" + libraries + ", name=" + name + ", patchesDetail=" + patchesDetail + ", personality=" + personality + ", productName=" + productName + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}