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
import net.nuagenetworks.vro.vspk.model.fetchers.AlarmsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SSIDConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.StatisticsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.WirelessPortCountryCode;

import net.nuagenetworks.vro.vspk.model.enums.WirelessPortFrequencyChannel;

import net.nuagenetworks.vro.vspk.model.enums.WirelessPortPortType;

import net.nuagenetworks.vro.vspk.model.enums.WirelessPortWifiFrequencyBand;

import net.nuagenetworks.vro.vspk.model.enums.WirelessPortWifiMode;
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

@VsoFinder(name = Constants.WIRELESSPORT, datasource = Constants.DATASOURCE, image = Constants.WIRELESSPORT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.SSIDCONNECTIONS_FETCHER, type = Constants.SSIDCONNECTIONS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "wirelessport", resourceName = "wirelessports")
public class WirelessPort extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "countryCode")
    protected WirelessPortCountryCode countryCode;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "frequencyChannel")
    protected WirelessPortFrequencyChannel frequencyChannel;
    
    @JsonProperty(value = "genericConfig")
    protected String genericConfig;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "physicalName")
    protected String physicalName;
    
    @JsonProperty(value = "portType")
    protected WirelessPortPortType portType;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "wifiFrequencyBand")
    protected WirelessPortWifiFrequencyBand wifiFrequencyBand;
    
    @JsonProperty(value = "wifiMode")
    protected WirelessPortWifiMode wifiMode;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private SSIDConnectionsFetcher sSIDConnections;
    
    @JsonIgnore
    private StatisticsFetcher statistics;
    
    @VsoConstructor
    public WirelessPort() {
        alarms = new AlarmsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        sSIDConnections = new SSIDConnectionsFetcher(this);
        
        statistics = new StatisticsFetcher(this);
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
    @VsoProperty(displayName = "CountryCode", readOnly = false)   
    public WirelessPortCountryCode getCountryCode() {
       return countryCode;
    }

    @JsonIgnore
    public void setCountryCode(WirelessPortCountryCode value) { 
        this.countryCode = value;
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
    @VsoProperty(displayName = "FrequencyChannel", readOnly = false)   
    public WirelessPortFrequencyChannel getFrequencyChannel() {
       return frequencyChannel;
    }

    @JsonIgnore
    public void setFrequencyChannel(WirelessPortFrequencyChannel value) { 
        this.frequencyChannel = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GenericConfig", readOnly = false)   
    public String getGenericConfig() {
       return genericConfig;
    }

    @JsonIgnore
    public void setGenericConfig(String value) { 
        this.genericConfig = value;
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
    @VsoProperty(displayName = "PhysicalName", readOnly = false)   
    public String getPhysicalName() {
       return physicalName;
    }

    @JsonIgnore
    public void setPhysicalName(String value) { 
        this.physicalName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PortType", readOnly = false)   
    public WirelessPortPortType getPortType() {
       return portType;
    }

    @JsonIgnore
    public void setPortType(WirelessPortPortType value) { 
        this.portType = value;
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
    @VsoProperty(displayName = "WifiFrequencyBand", readOnly = false)   
    public WirelessPortWifiFrequencyBand getWifiFrequencyBand() {
       return wifiFrequencyBand;
    }

    @JsonIgnore
    public void setWifiFrequencyBand(WirelessPortWifiFrequencyBand value) { 
        this.wifiFrequencyBand = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "WifiMode", readOnly = false)   
    public WirelessPortWifiMode getWifiMode() {
       return wifiMode;
    }

    @JsonIgnore
    public void setWifiMode(WirelessPortWifiMode value) { 
        this.wifiMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SSIDConnections", readOnly = true)   
    public SSIDConnectionsFetcher getSSIDConnections() {
        return sSIDConnections;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Statistics", readOnly = true)   
    public StatisticsFetcher getStatistics() {
        return statistics;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.WIRELESSPORT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.WIRELESSPORT, getId());
        }
    }
    @VsoMethod
    public void createSSIDConnection(Session session, SSIDConnection childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.SSIDCONNECTIONS_FETCHER, getId());
        }
    }public String toString() {
        return "WirelessPort [" + "countryCode=" + countryCode + ", description=" + description + ", frequencyChannel=" + frequencyChannel + ", genericConfig=" + genericConfig + ", name=" + name + ", physicalName=" + physicalName + ", portType=" + portType + ", templateID=" + templateID + ", wifiFrequencyBand=" + wifiFrequencyBand + ", wifiMode=" + wifiMode + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}