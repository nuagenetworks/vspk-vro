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
import net.nuagenetworks.vro.vspk.model.enums.OverlayMirrorDestinationEndPointType;

import net.nuagenetworks.vro.vspk.model.enums.OverlayMirrorDestinationTriggerType;
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

@VsoFinder(name = Constants.OVERLAYMIRRORDESTINATION, datasource = Constants.DATASOURCE, image = Constants.OVERLAYMIRRORDESTINATION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "overlaymirrordestination", resourceName = "overlaymirrordestinations")
public class OverlayMirrorDestination extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ESI")
    protected String ESI;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "endPointType")
    protected OverlayMirrorDestinationEndPointType endPointType;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "redundancyEnabled")
    protected Boolean redundancyEnabled;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "triggerType")
    protected OverlayMirrorDestinationTriggerType triggerType;
    
    @JsonProperty(value = "virtualNetworkID")
    protected String virtualNetworkID;
    
    @VsoConstructor
    public OverlayMirrorDestination() {}

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
    @VsoProperty(displayName = "ESI", readOnly = false)   
    public String getESI() {
       return ESI;
    }

    @JsonIgnore
    public void setESI(String value) { 
        this.ESI = value;
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
    @VsoProperty(displayName = "EndPointType", readOnly = false)   
    public OverlayMirrorDestinationEndPointType getEndPointType() {
       return endPointType;
    }

    @JsonIgnore
    public void setEndPointType(OverlayMirrorDestinationEndPointType value) { 
        this.endPointType = value;
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
    @VsoProperty(displayName = "RedundancyEnabled", readOnly = false)   
    public Boolean getRedundancyEnabled() {
       return redundancyEnabled;
    }

    @JsonIgnore
    public void setRedundancyEnabled(Boolean value) { 
        this.redundancyEnabled = value;
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
    @VsoProperty(displayName = "TriggerType", readOnly = false)   
    public OverlayMirrorDestinationTriggerType getTriggerType() {
       return triggerType;
    }

    @JsonIgnore
    public void setTriggerType(OverlayMirrorDestinationTriggerType value) { 
        this.triggerType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualNetworkID", readOnly = false)   
    public String getVirtualNetworkID() {
       return virtualNetworkID;
    }

    @JsonIgnore
    public void setVirtualNetworkID(String value) { 
        this.virtualNetworkID = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.OVERLAYMIRRORDESTINATION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.OVERLAYMIRRORDESTINATION, getId());
        }
    }public String toString() {
        return "OverlayMirrorDestination [" + "ESI=" + ESI + ", description=" + description + ", endPointType=" + endPointType + ", name=" + name + ", redundancyEnabled=" + redundancyEnabled + ", templateID=" + templateID + ", triggerType=" + triggerType + ", virtualNetworkID=" + virtualNetworkID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}