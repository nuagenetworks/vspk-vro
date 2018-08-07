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
import net.nuagenetworks.vro.vspk.model.fetchers.VPortsFetcher;
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

@VsoFinder(name = Constants.EGRESSPROFILE, datasource = Constants.DATASOURCE, image = Constants.EGRESSPROFILE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "egressprofile", resourceName = "egressprofiles")
public class EgressProfile extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedIPFilterProfileID")
    protected String associatedIPFilterProfileID;
    
    @JsonProperty(value = "associatedIPFilterProfileName")
    protected String associatedIPFilterProfileName;
    
    @JsonProperty(value = "associatedIPv6FilterProfileID")
    protected String associatedIPv6FilterProfileID;
    
    @JsonProperty(value = "associatedIPv6FilterProfileName")
    protected String associatedIPv6FilterProfileName;
    
    @JsonProperty(value = "associatedMACFilterProfileID")
    protected String associatedMACFilterProfileID;
    
    @JsonProperty(value = "associatedMACFilterProfileName")
    protected String associatedMACFilterProfileName;
    
    @JsonProperty(value = "associatedSAPEgressQoSProfileID")
    protected String associatedSAPEgressQoSProfileID;
    
    @JsonProperty(value = "associatedSAPEgressQoSProfileName")
    protected String associatedSAPEgressQoSProfileName;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonIgnore
    private VPortsFetcher vPorts;
    
    @VsoConstructor
    public EgressProfile() {
        vPorts = new VPortsFetcher(this);
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
    @VsoProperty(displayName = "AssociatedIPFilterProfileID", readOnly = false)   
    public String getAssociatedIPFilterProfileID() {
       return associatedIPFilterProfileID;
    }

    @JsonIgnore
    public void setAssociatedIPFilterProfileID(String value) { 
        this.associatedIPFilterProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIPFilterProfileName", readOnly = false)   
    public String getAssociatedIPFilterProfileName() {
       return associatedIPFilterProfileName;
    }

    @JsonIgnore
    public void setAssociatedIPFilterProfileName(String value) { 
        this.associatedIPFilterProfileName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIPv6FilterProfileID", readOnly = false)   
    public String getAssociatedIPv6FilterProfileID() {
       return associatedIPv6FilterProfileID;
    }

    @JsonIgnore
    public void setAssociatedIPv6FilterProfileID(String value) { 
        this.associatedIPv6FilterProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIPv6FilterProfileName", readOnly = false)   
    public String getAssociatedIPv6FilterProfileName() {
       return associatedIPv6FilterProfileName;
    }

    @JsonIgnore
    public void setAssociatedIPv6FilterProfileName(String value) { 
        this.associatedIPv6FilterProfileName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedMACFilterProfileID", readOnly = false)   
    public String getAssociatedMACFilterProfileID() {
       return associatedMACFilterProfileID;
    }

    @JsonIgnore
    public void setAssociatedMACFilterProfileID(String value) { 
        this.associatedMACFilterProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedMACFilterProfileName", readOnly = false)   
    public String getAssociatedMACFilterProfileName() {
       return associatedMACFilterProfileName;
    }

    @JsonIgnore
    public void setAssociatedMACFilterProfileName(String value) { 
        this.associatedMACFilterProfileName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSAPEgressQoSProfileID", readOnly = false)   
    public String getAssociatedSAPEgressQoSProfileID() {
       return associatedSAPEgressQoSProfileID;
    }

    @JsonIgnore
    public void setAssociatedSAPEgressQoSProfileID(String value) { 
        this.associatedSAPEgressQoSProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedSAPEgressQoSProfileName", readOnly = false)   
    public String getAssociatedSAPEgressQoSProfileName() {
       return associatedSAPEgressQoSProfileName;
    }

    @JsonIgnore
    public void setAssociatedSAPEgressQoSProfileName(String value) { 
        this.associatedSAPEgressQoSProfileName = value;
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
    @VsoProperty(displayName = "VPorts", readOnly = true)   
    public VPortsFetcher getVPorts() {
        return vPorts;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.EGRESSPROFILE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.EGRESSPROFILE, getId());
        }
    }public String toString() {
        return "EgressProfile [" + "associatedIPFilterProfileID=" + associatedIPFilterProfileID + ", associatedIPFilterProfileName=" + associatedIPFilterProfileName + ", associatedIPv6FilterProfileID=" + associatedIPv6FilterProfileID + ", associatedIPv6FilterProfileName=" + associatedIPv6FilterProfileName + ", associatedMACFilterProfileID=" + associatedMACFilterProfileID + ", associatedMACFilterProfileName=" + associatedMACFilterProfileName + ", associatedSAPEgressQoSProfileID=" + associatedSAPEgressQoSProfileID + ", associatedSAPEgressQoSProfileName=" + associatedSAPEgressQoSProfileName + ", description=" + description + ", name=" + name + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}