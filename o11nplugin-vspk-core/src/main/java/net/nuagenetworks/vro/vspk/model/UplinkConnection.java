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
import net.nuagenetworks.vro.vspk.model.fetchers.BFDSessionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.CustomPropertiesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.UnderlaysFetcher;

import net.nuagenetworks.vro.vspk.model.enums.UplinkConnectionAdvertisementCriteria;

import net.nuagenetworks.vro.vspk.model.enums.UplinkConnectionInterfaceConnectionType;

import net.nuagenetworks.vro.vspk.model.enums.UplinkConnectionMode;

import net.nuagenetworks.vro.vspk.model.enums.UplinkConnectionRole;
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

@VsoFinder(name = Constants.UPLINKCONNECTION, datasource = Constants.DATASOURCE, image = Constants.UPLINKCONNECTION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.BFDSESSIONS_FETCHER, type = Constants.BFDSESSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.CUSTOMPROPERTIES_FETCHER, type = Constants.CUSTOMPROPERTIES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.UNDERLAYS_FETCHER, type = Constants.UNDERLAYS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "uplinkconnection", resourceName = "uplinkconnections")
public class UplinkConnection extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DNSAddress")
    protected String DNSAddress;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "advertisementCriteria")
    protected UplinkConnectionAdvertisementCriteria advertisementCriteria;
    
    @JsonProperty(value = "assocUnderlayID")
    protected String assocUnderlayID;
    
    @JsonProperty(value = "associatedUnderlayName")
    protected String associatedUnderlayName;
    
    @JsonProperty(value = "auxiliaryLink")
    protected Boolean auxiliaryLink;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "interfaceConnectionType")
    protected UplinkConnectionInterfaceConnectionType interfaceConnectionType;
    
    @JsonProperty(value = "mode")
    protected UplinkConnectionMode mode;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "password")
    protected String password;
    
    @JsonProperty(value = "role")
    protected UplinkConnectionRole role;
    
    @JsonProperty(value = "uplinkID")
    protected Long uplinkID;
    
    @JsonProperty(value = "username")
    protected String username;
    
    @JsonIgnore
    private BFDSessionsFetcher bFDSessions;
    
    @JsonIgnore
    private CustomPropertiesFetcher customProperties;
    
    @JsonIgnore
    private UnderlaysFetcher underlays;
    
    @VsoConstructor
    public UplinkConnection() {
        bFDSessions = new BFDSessionsFetcher(this);
        
        customProperties = new CustomPropertiesFetcher(this);
        
        underlays = new UnderlaysFetcher(this);
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
    @VsoProperty(displayName = "DNSAddress", readOnly = false)   
    public String getDNSAddress() {
       return DNSAddress;
    }

    @JsonIgnore
    public void setDNSAddress(String value) { 
        this.DNSAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Address", readOnly = false)   
    public String getAddress() {
       return address;
    }

    @JsonIgnore
    public void setAddress(String value) { 
        this.address = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AdvertisementCriteria", readOnly = false)   
    public UplinkConnectionAdvertisementCriteria getAdvertisementCriteria() {
       return advertisementCriteria;
    }

    @JsonIgnore
    public void setAdvertisementCriteria(UplinkConnectionAdvertisementCriteria value) { 
        this.advertisementCriteria = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssocUnderlayID", readOnly = false)   
    public String getAssocUnderlayID() {
       return assocUnderlayID;
    }

    @JsonIgnore
    public void setAssocUnderlayID(String value) { 
        this.assocUnderlayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedUnderlayName", readOnly = false)   
    public String getAssociatedUnderlayName() {
       return associatedUnderlayName;
    }

    @JsonIgnore
    public void setAssociatedUnderlayName(String value) { 
        this.associatedUnderlayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuxiliaryLink", readOnly = false)   
    public Boolean getAuxiliaryLink() {
       return auxiliaryLink;
    }

    @JsonIgnore
    public void setAuxiliaryLink(Boolean value) { 
        this.auxiliaryLink = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Gateway", readOnly = false)   
    public String getGateway() {
       return gateway;
    }

    @JsonIgnore
    public void setGateway(String value) { 
        this.gateway = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InterfaceConnectionType", readOnly = false)   
    public UplinkConnectionInterfaceConnectionType getInterfaceConnectionType() {
       return interfaceConnectionType;
    }

    @JsonIgnore
    public void setInterfaceConnectionType(UplinkConnectionInterfaceConnectionType value) { 
        this.interfaceConnectionType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Mode", readOnly = false)   
    public UplinkConnectionMode getMode() {
       return mode;
    }

    @JsonIgnore
    public void setMode(UplinkConnectionMode value) { 
        this.mode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Netmask", readOnly = false)   
    public String getNetmask() {
       return netmask;
    }

    @JsonIgnore
    public void setNetmask(String value) { 
        this.netmask = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Password", readOnly = false)   
    public String getPassword() {
       return password;
    }

    @JsonIgnore
    public void setPassword(String value) { 
        this.password = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Role", readOnly = false)   
    public UplinkConnectionRole getRole() {
       return role;
    }

    @JsonIgnore
    public void setRole(UplinkConnectionRole value) { 
        this.role = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UplinkID", readOnly = false)   
    public Long getUplinkID() {
       return uplinkID;
    }

    @JsonIgnore
    public void setUplinkID(Long value) { 
        this.uplinkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Username", readOnly = false)   
    public String getUsername() {
       return username;
    }

    @JsonIgnore
    public void setUsername(String value) { 
        this.username = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BFDSessions", readOnly = true)   
    public BFDSessionsFetcher getBFDSessions() {
        return bFDSessions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CustomProperties", readOnly = true)   
    public CustomPropertiesFetcher getCustomProperties() {
        return customProperties;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Underlays", readOnly = true)   
    public UnderlaysFetcher getUnderlays() {
        return underlays;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.UPLINKCONNECTION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.UPLINKCONNECTION, getId());
        }
    }
    @VsoMethod
    public void createBFDSession(Session session, BFDSession childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BFDSESSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createCustomProperty(Session session, CustomProperty childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.CUSTOMPROPERTIES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createUnderlay(Session session, Underlay childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.UNDERLAYS_FETCHER, getId());
        }
    }public String toString() {
        return "UplinkConnection [" + "DNSAddress=" + DNSAddress + ", address=" + address + ", advertisementCriteria=" + advertisementCriteria + ", assocUnderlayID=" + assocUnderlayID + ", associatedUnderlayName=" + associatedUnderlayName + ", auxiliaryLink=" + auxiliaryLink + ", gateway=" + gateway + ", interfaceConnectionType=" + interfaceConnectionType + ", mode=" + mode + ", netmask=" + netmask + ", password=" + password + ", role=" + role + ", uplinkID=" + uplinkID + ", username=" + username + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}