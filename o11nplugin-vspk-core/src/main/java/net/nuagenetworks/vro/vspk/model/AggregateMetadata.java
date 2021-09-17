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
import net.nuagenetworks.vro.vspk.model.enums.AggregateMetadataEntityScope;
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

@VsoFinder(name = Constants.AGGREGATEMETADATA, datasource = Constants.DATASOURCE, image = Constants.AGGREGATEMETADATA_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "aggregatemetadata", resourceName = "aggregatemetadatas")
public class AggregateMetadata extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "assocEntityType")
    protected String assocEntityType;
    
    @JsonProperty(value = "blob")
    protected String blob;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "entityScope")
    protected AggregateMetadataEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "global")
    protected Boolean globalMetadata;
    
    @JsonProperty(value = "metadataTagIDs")
    protected java.util.List<String> metadataTagIDs;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "networkNotificationDisabled")
    protected Boolean networkNotificationDisabled;
    
    @VsoConstructor
    public AggregateMetadata() {}

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
    @VsoProperty(displayName = "AssocEntityType", readOnly = false)   
    public String getAssocEntityType() {
       return assocEntityType;
    }

    @JsonIgnore
    public void setAssocEntityType(String value) { 
        this.assocEntityType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Blob", readOnly = false)   
    public String getBlob() {
       return blob;
    }

    @JsonIgnore
    public void setBlob(String value) { 
        this.blob = value;
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
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public AggregateMetadataEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(AggregateMetadataEntityScope value) { 
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
    @VsoProperty(displayName = "GlobalMetadata", readOnly = false)   
    public Boolean getGlobalMetadata() {
       return globalMetadata;
    }

    @JsonIgnore
    public void setGlobalMetadata(Boolean value) { 
        this.globalMetadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MetadataTagIDs", readOnly = false)   
    public java.util.List<String> getMetadataTagIDs() {
       return metadataTagIDs;
    }

    @JsonIgnore
    public void setMetadataTagIDs(java.util.List<String> value) { 
        this.metadataTagIDs = value;
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
    @VsoProperty(displayName = "NetworkNotificationDisabled", readOnly = false)   
    public Boolean getNetworkNotificationDisabled() {
       return networkNotificationDisabled;
    }

    @JsonIgnore
    public void setNetworkNotificationDisabled(Boolean value) { 
        this.networkNotificationDisabled = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.AGGREGATEMETADATA, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.AGGREGATEMETADATA, getId());
        }
    }public String toString() {
        return "AggregateMetadata [" + "assocEntityType=" + assocEntityType + ", blob=" + blob + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", globalMetadata=" + globalMetadata + ", metadataTagIDs=" + metadataTagIDs + ", name=" + name + ", networkNotificationDisabled=" + networkNotificationDisabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}