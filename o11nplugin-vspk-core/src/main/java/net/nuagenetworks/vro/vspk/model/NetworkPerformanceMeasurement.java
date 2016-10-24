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
import net.nuagenetworks.vro.vspk.model.fetchers.MonitorscopesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NetworkPerformanceBindingsFetcher;
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

@VsoFinder(name = Constants.NETWORKPERFORMANCEMEASUREMENT, datasource = Constants.DATASOURCE, image = Constants.NETWORKPERFORMANCEMEASUREMENT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.MONITORSCOPES_FETCHER, type = Constants.MONITORSCOPES_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "networkperformancemeasurement", resourceName = "networkperformancemeasurements")
public class NetworkPerformanceMeasurement extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedPerformanceMonitorID")
    protected String associatedPerformanceMonitorID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "readOnly")
    protected Boolean readOnly;
    
    @JsonIgnore
    private MonitorscopesFetcher monitorscopes;
    
    @JsonIgnore
    private NetworkPerformanceBindingsFetcher networkPerformanceBindings;
    
    @VsoConstructor
    public NetworkPerformanceMeasurement() {
        monitorscopes = new MonitorscopesFetcher(this);
        
        networkPerformanceBindings = new NetworkPerformanceBindingsFetcher(this);
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
    @VsoProperty(displayName = "AssociatedPerformanceMonitorID", readOnly = false)   
    public String getAssociatedPerformanceMonitorID() {
       return associatedPerformanceMonitorID;
    }

    @JsonIgnore
    public void setAssociatedPerformanceMonitorID(String value) { 
        this.associatedPerformanceMonitorID = value;
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
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
    @VsoProperty(displayName = "Monitorscopes", readOnly = true)   
    public MonitorscopesFetcher getMonitorscopes() {
        return monitorscopes;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkPerformanceBindings", readOnly = true)   
    public NetworkPerformanceBindingsFetcher getNetworkPerformanceBindings() {
        return networkPerformanceBindings;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.NETWORKPERFORMANCEMEASUREMENT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.NETWORKPERFORMANCEMEASUREMENT, getId());
        }
    }
    @VsoMethod
    public void assignNetworkPerformanceBindings(Session session, NetworkPerformanceBinding[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.NETWORKPERFORMANCEMEASUREMENT, getId());
        }
    }
    
    @VsoMethod
    public void createMonitorscope(Session session, Monitorscope childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.MONITORSCOPES_FETCHER, getId());
        }
    }public String toString() {
        return "NetworkPerformanceMeasurement [" + "associatedPerformanceMonitorID=" + associatedPerformanceMonitorID + ", description=" + description + ", name=" + name + ", readOnly=" + readOnly + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}