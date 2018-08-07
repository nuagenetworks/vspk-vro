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

import net.nuagenetworks.vro.vspk.model.enums.BRConnectionAddressFamily;

import net.nuagenetworks.vro.vspk.model.enums.BRConnectionAdvertisementCriteria;

import net.nuagenetworks.vro.vspk.model.enums.BRConnectionMode;
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

@VsoFinder(name = Constants.BRCONNECTION, datasource = Constants.DATASOURCE, image = Constants.BRCONNECTION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.BFDSESSIONS_FETCHER, type = Constants.BFDSESSIONS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "brconnection", resourceName = "brconnections")
public class BRConnection extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "DNSAddress")
    protected String DNSAddress;
    
    @JsonProperty(value = "DNSAddressV6")
    protected String DNSAddressV6;
    
    @JsonProperty(value = "address")
    protected String address;
    
    @JsonProperty(value = "addressFamily")
    protected BRConnectionAddressFamily addressFamily;
    
    @JsonProperty(value = "addressV6")
    protected String addressV6;
    
    @JsonProperty(value = "advertisementCriteria")
    protected BRConnectionAdvertisementCriteria advertisementCriteria;
    
    @JsonProperty(value = "gateway")
    protected String gateway;
    
    @JsonProperty(value = "gatewayV6")
    protected String gatewayV6;
    
    @JsonProperty(value = "inherited")
    protected Boolean inherited;
    
    @JsonProperty(value = "mode")
    protected BRConnectionMode mode;
    
    @JsonProperty(value = "netmask")
    protected String netmask;
    
    @JsonProperty(value = "uplinkID")
    protected Long uplinkID;
    
    @JsonIgnore
    private BFDSessionsFetcher bFDSessions;
    
    @VsoConstructor
    public BRConnection() {
        bFDSessions = new BFDSessionsFetcher(this);
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
    @VsoProperty(displayName = "DNSAddressV6", readOnly = false)   
    public String getDNSAddressV6() {
       return DNSAddressV6;
    }

    @JsonIgnore
    public void setDNSAddressV6(String value) { 
        this.DNSAddressV6 = value;
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
    @VsoProperty(displayName = "AddressFamily", readOnly = false)   
    public BRConnectionAddressFamily getAddressFamily() {
       return addressFamily;
    }

    @JsonIgnore
    public void setAddressFamily(BRConnectionAddressFamily value) { 
        this.addressFamily = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressV6", readOnly = false)   
    public String getAddressV6() {
       return addressV6;
    }

    @JsonIgnore
    public void setAddressV6(String value) { 
        this.addressV6 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AdvertisementCriteria", readOnly = false)   
    public BRConnectionAdvertisementCriteria getAdvertisementCriteria() {
       return advertisementCriteria;
    }

    @JsonIgnore
    public void setAdvertisementCriteria(BRConnectionAdvertisementCriteria value) { 
        this.advertisementCriteria = value;
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
    @VsoProperty(displayName = "GatewayV6", readOnly = false)   
    public String getGatewayV6() {
       return gatewayV6;
    }

    @JsonIgnore
    public void setGatewayV6(String value) { 
        this.gatewayV6 = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Inherited", readOnly = false)   
    public Boolean getInherited() {
       return inherited;
    }

    @JsonIgnore
    public void setInherited(Boolean value) { 
        this.inherited = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Mode", readOnly = false)   
    public BRConnectionMode getMode() {
       return mode;
    }

    @JsonIgnore
    public void setMode(BRConnectionMode value) { 
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
    @VsoProperty(displayName = "UplinkID", readOnly = false)   
    public Long getUplinkID() {
       return uplinkID;
    }

    @JsonIgnore
    public void setUplinkID(Long value) { 
        this.uplinkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BFDSessions", readOnly = true)   
    public BFDSessionsFetcher getBFDSessions() {
        return bFDSessions;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.BRCONNECTION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.BRCONNECTION, getId());
        }
    }
    @VsoMethod
    public void createBFDSession(Session session, BFDSession childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BFDSESSIONS_FETCHER, getId());
        }
    }public String toString() {
        return "BRConnection [" + "DNSAddress=" + DNSAddress + ", DNSAddressV6=" + DNSAddressV6 + ", address=" + address + ", addressFamily=" + addressFamily + ", addressV6=" + addressV6 + ", advertisementCriteria=" + advertisementCriteria + ", gateway=" + gateway + ", gatewayV6=" + gatewayV6 + ", inherited=" + inherited + ", mode=" + mode + ", netmask=" + netmask + ", uplinkID=" + uplinkID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}