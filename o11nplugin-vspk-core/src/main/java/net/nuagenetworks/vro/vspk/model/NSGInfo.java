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
import net.nuagenetworks.vro.vspk.model.enums.NSGInfoTPMStatus;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.NSGInfoFamily;
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

    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "NSGVersion")
    protected String NSGVersion;
    
    @JsonProperty(value = "SKU")
    protected String SKU;
    
    @JsonProperty(value = "TPMStatus")
    protected NSGInfoTPMStatus TPMStatus;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "associatedNSGatewayID")
    protected String associatedNSGatewayID;
    
    @JsonProperty(value = "entityScope")
    protected NSGInfoEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected NSGInfoFamily family;
    
    @JsonProperty(value = "libraries")
    protected String libraries;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @VsoConstructor
    public NSGInfo() {}

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
    public NSGInfoTPMStatus getTPMStatus() {
       return TPMStatus;
    }

    @JsonIgnore
    public void setTPMStatus(NSGInfoTPMStatus value) { 
        this.TPMStatus = value;
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
    @VsoProperty(displayName = "AssociatedNSGatewayID", readOnly = false)   
    public String getAssociatedNSGatewayID() {
       return associatedNSGatewayID;
    }

    @JsonIgnore
    public void setAssociatedNSGatewayID(String value) { 
        this.associatedNSGatewayID = value;
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
    @VsoProperty(displayName = "Libraries", readOnly = false)   
    public String getLibraries() {
       return libraries;
    }

    @JsonIgnore
    public void setLibraries(String value) { 
        this.libraries = value;
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
        return "NSGInfo [" + "CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", TPMStatus=" + TPMStatus + ", UUID=" + UUID + ", associatedNSGatewayID=" + associatedNSGatewayID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", libraries=" + libraries + ", serialNumber=" + serialNumber + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}