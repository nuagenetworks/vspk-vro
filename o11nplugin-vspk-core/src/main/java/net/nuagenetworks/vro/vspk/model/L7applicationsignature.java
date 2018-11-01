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
import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.L7applicationsignatureEntityScope;
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

@VsoFinder(name = Constants.L7APPLICATIONSIGNATURE, datasource = Constants.DATASOURCE, image = Constants.L7APPLICATIONSIGNATURE_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l7applicationsignature", resourceName = "l7applicationsignatures")
public class L7applicationsignature extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "category")
    protected String category;
    
    @JsonProperty(value = "deprecated")
    protected Boolean deprecated;
    
    @JsonProperty(value = "deprecatedVersion")
    protected String deprecatedVersion;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "dictionaryVersion")
    protected Long dictionaryVersion;
    
    @JsonProperty(value = "entityScope")
    protected L7applicationsignatureEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "guidstring")
    protected String guidstring;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "pluginName")
    protected String pluginName;
    
    @JsonProperty(value = "productivity")
    protected Long productivity;
    
    @JsonProperty(value = "readonly")
    protected Boolean readonly;
    
    @JsonProperty(value = "reference")
    protected String reference;
    
    @JsonProperty(value = "risk")
    protected Long risk;
    
    @JsonProperty(value = "signatureIndex")
    protected Long signatureIndex;
    
    @JsonProperty(value = "softwareFlags")
    protected String softwareFlags;
    
    @JsonIgnore
    private ApplicationsFetcher applications;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public L7applicationsignature() {
        applications = new ApplicationsFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
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
    @VsoProperty(displayName = "Category", readOnly = false)   
    public String getCategory() {
       return category;
    }

    @JsonIgnore
    public void setCategory(String value) { 
        this.category = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Deprecated", readOnly = false)   
    public Boolean getDeprecated() {
       return deprecated;
    }

    @JsonIgnore
    public void setDeprecated(Boolean value) { 
        this.deprecated = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeprecatedVersion", readOnly = false)   
    public String getDeprecatedVersion() {
       return deprecatedVersion;
    }

    @JsonIgnore
    public void setDeprecatedVersion(String value) { 
        this.deprecatedVersion = value;
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
    @VsoProperty(displayName = "DictionaryVersion", readOnly = false)   
    public Long getDictionaryVersion() {
       return dictionaryVersion;
    }

    @JsonIgnore
    public void setDictionaryVersion(Long value) { 
        this.dictionaryVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public L7applicationsignatureEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(L7applicationsignatureEntityScope value) { 
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
    @VsoProperty(displayName = "Guidstring", readOnly = false)   
    public String getGuidstring() {
       return guidstring;
    }

    @JsonIgnore
    public void setGuidstring(String value) { 
        this.guidstring = value;
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
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PluginName", readOnly = false)   
    public String getPluginName() {
       return pluginName;
    }

    @JsonIgnore
    public void setPluginName(String value) { 
        this.pluginName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Productivity", readOnly = false)   
    public Long getProductivity() {
       return productivity;
    }

    @JsonIgnore
    public void setProductivity(Long value) { 
        this.productivity = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Readonly", readOnly = false)   
    public Boolean getReadonly() {
       return readonly;
    }

    @JsonIgnore
    public void setReadonly(Boolean value) { 
        this.readonly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Reference", readOnly = false)   
    public String getReference() {
       return reference;
    }

    @JsonIgnore
    public void setReference(String value) { 
        this.reference = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Risk", readOnly = false)   
    public Long getRisk() {
       return risk;
    }

    @JsonIgnore
    public void setRisk(Long value) { 
        this.risk = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SignatureIndex", readOnly = false)   
    public Long getSignatureIndex() {
       return signatureIndex;
    }

    @JsonIgnore
    public void setSignatureIndex(Long value) { 
        this.signatureIndex = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SoftwareFlags", readOnly = false)   
    public String getSoftwareFlags() {
       return softwareFlags;
    }

    @JsonIgnore
    public void setSoftwareFlags(String value) { 
        this.softwareFlags = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Applications", readOnly = true)   
    public ApplicationsFetcher getApplications() {
        return applications;
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
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.L7APPLICATIONSIGNATURE, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.L7APPLICATIONSIGNATURE, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.L7APPLICATIONSIGNATURE, getId());
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
    }public String toString() {
        return "L7applicationsignature [" + "category=" + category + ", deprecated=" + deprecated + ", deprecatedVersion=" + deprecatedVersion + ", description=" + description + ", dictionaryVersion=" + dictionaryVersion + ", entityScope=" + entityScope + ", externalID=" + externalID + ", guidstring=" + guidstring + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", pluginName=" + pluginName + ", productivity=" + productivity + ", readonly=" + readonly + ", reference=" + reference + ", risk=" + risk + ", signatureIndex=" + signatureIndex + ", softwareFlags=" + softwareFlags + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}