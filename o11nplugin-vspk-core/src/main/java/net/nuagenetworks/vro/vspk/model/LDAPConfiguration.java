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
import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.LDAPConfigurationEntityScope;
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

@VsoFinder(name = Constants.LDAPCONFIGURATION, datasource = Constants.DATASOURCE, image = Constants.LDAPCONFIGURATION_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ldapconfiguration", resourceName = "ldapconfigurations")
public class LDAPConfiguration extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "SSLEnabled")
    protected Boolean SSLEnabled;
    
    @JsonProperty(value = "acceptAllCertificates")
    protected Boolean acceptAllCertificates;
    
    @JsonProperty(value = "authorizationEnabled")
    protected Boolean authorizationEnabled;
    
    @JsonProperty(value = "authorizingUserDN")
    protected String authorizingUserDN;
    
    @JsonProperty(value = "certificate")
    protected String certificate;
    
    @JsonProperty(value = "enabled")
    protected Boolean enabled;
    
    @JsonProperty(value = "entityScope")
    protected LDAPConfigurationEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "groupDN")
    protected String groupDN;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "password")
    protected String password;
    
    @JsonProperty(value = "port")
    protected String port;
    
    @JsonProperty(value = "server")
    protected String server;
    
    @JsonProperty(value = "userDNTemplate")
    protected String userDNTemplate;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public LDAPConfiguration() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
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
    @VsoProperty(displayName = "SSLEnabled", readOnly = false)   
    public Boolean getSSLEnabled() {
       return SSLEnabled;
    }

    @JsonIgnore
    public void setSSLEnabled(Boolean value) { 
        this.SSLEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AcceptAllCertificates", readOnly = false)   
    public Boolean getAcceptAllCertificates() {
       return acceptAllCertificates;
    }

    @JsonIgnore
    public void setAcceptAllCertificates(Boolean value) { 
        this.acceptAllCertificates = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuthorizationEnabled", readOnly = false)   
    public Boolean getAuthorizationEnabled() {
       return authorizationEnabled;
    }

    @JsonIgnore
    public void setAuthorizationEnabled(Boolean value) { 
        this.authorizationEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuthorizingUserDN", readOnly = false)   
    public String getAuthorizingUserDN() {
       return authorizingUserDN;
    }

    @JsonIgnore
    public void setAuthorizingUserDN(String value) { 
        this.authorizingUserDN = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Certificate", readOnly = false)   
    public String getCertificate() {
       return certificate;
    }

    @JsonIgnore
    public void setCertificate(String value) { 
        this.certificate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Enabled", readOnly = false)   
    public Boolean getEnabled() {
       return enabled;
    }

    @JsonIgnore
    public void setEnabled(Boolean value) { 
        this.enabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public LDAPConfigurationEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(LDAPConfigurationEntityScope value) { 
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
    @VsoProperty(displayName = "GroupDN", readOnly = false)   
    public String getGroupDN() {
       return groupDN;
    }

    @JsonIgnore
    public void setGroupDN(String value) { 
        this.groupDN = value;
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
    @VsoProperty(displayName = "Password", readOnly = false)   
    public String getPassword() {
       return password;
    }

    @JsonIgnore
    public void setPassword(String value) { 
        this.password = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Port", readOnly = false)   
    public String getPort() {
       return port;
    }

    @JsonIgnore
    public void setPort(String value) { 
        this.port = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Server", readOnly = false)   
    public String getServer() {
       return server;
    }

    @JsonIgnore
    public void setServer(String value) { 
        this.server = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UserDNTemplate", readOnly = false)   
    public String getUserDNTemplate() {
       return userDNTemplate;
    }

    @JsonIgnore
    public void setUserDNTemplate(String value) { 
        this.userDNTemplate = value;
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
           SessionManager.getInstance().notifyElementUpdated(Constants.LDAPCONFIGURATION, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.LDAPCONFIGURATION, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.LDAPCONFIGURATION, getId());
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
        return "LDAPConfiguration [" + "SSLEnabled=" + SSLEnabled + ", acceptAllCertificates=" + acceptAllCertificates + ", authorizationEnabled=" + authorizationEnabled + ", authorizingUserDN=" + authorizingUserDN + ", certificate=" + certificate + ", enabled=" + enabled + ", entityScope=" + entityScope + ", externalID=" + externalID + ", groupDN=" + groupDN + ", lastUpdatedBy=" + lastUpdatedBy + ", password=" + password + ", port=" + port + ", server=" + server + ", userDNTemplate=" + userDNTemplate + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}