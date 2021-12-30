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
import net.nuagenetworks.vro.vspk.model.enums.CommandCommand;

import net.nuagenetworks.vro.vspk.model.enums.CommandEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.CommandOverride;

import net.nuagenetworks.vro.vspk.model.enums.CommandStatus;
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

@VsoFinder(name = Constants.COMMAND, datasource = Constants.DATASOURCE, image = Constants.COMMAND_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "command", resourceName = "commands")
public class Command extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "assocEntityType")
    protected String assocEntityType;
    
    @JsonProperty(value = "associatedParam")
    protected String associatedParam;
    
    @JsonProperty(value = "associatedParamType")
    protected String associatedParamType;
    
    @JsonProperty(value = "command")
    protected CommandCommand command;
    
    @JsonProperty(value = "commandInformation")
    protected String commandInformation;
    
    @JsonProperty(value = "creationDate")
    protected String creationDate;
    
    @JsonProperty(value = "detail")
    protected String detail;
    
    @JsonProperty(value = "detailedStatus")
    protected String detailedStatus;
    
    @JsonProperty(value = "detailedStatusCode")
    protected Long detailedStatusCode;
    
    @JsonProperty(value = "entityScope")
    protected CommandEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "fullCommand")
    protected String fullCommand;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "lastUpdatedDate")
    protected String lastUpdatedDate;
    
    @JsonProperty(value = "override")
    protected CommandOverride override;
    
    @JsonProperty(value = "owner")
    protected String owner;
    
    @JsonProperty(value = "progress")
    protected String progress;
    
    @JsonProperty(value = "status")
    protected CommandStatus status;
    
    @JsonProperty(value = "summary")
    protected String summary;
    
    @VsoConstructor
    public Command() {}

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
    @VsoProperty(displayName = "AssociatedParam", readOnly = false)   
    public String getAssociatedParam() {
       return associatedParam;
    }

    @JsonIgnore
    public void setAssociatedParam(String value) { 
        this.associatedParam = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedParamType", readOnly = false)   
    public String getAssociatedParamType() {
       return associatedParamType;
    }

    @JsonIgnore
    public void setAssociatedParamType(String value) { 
        this.associatedParamType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Command", readOnly = false)   
    public CommandCommand getCommand() {
       return command;
    }

    @JsonIgnore
    public void setCommand(CommandCommand value) { 
        this.command = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CommandInformation", readOnly = false)   
    public String getCommandInformation() {
       return commandInformation;
    }

    @JsonIgnore
    public void setCommandInformation(String value) { 
        this.commandInformation = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CreationDate", readOnly = false)   
    public String getCreationDate() {
       return creationDate;
    }

    @JsonIgnore
    public void setCreationDate(String value) { 
        this.creationDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Detail", readOnly = false)   
    public String getDetail() {
       return detail;
    }

    @JsonIgnore
    public void setDetail(String value) { 
        this.detail = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DetailedStatus", readOnly = false)   
    public String getDetailedStatus() {
       return detailedStatus;
    }

    @JsonIgnore
    public void setDetailedStatus(String value) { 
        this.detailedStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DetailedStatusCode", readOnly = false)   
    public Long getDetailedStatusCode() {
       return detailedStatusCode;
    }

    @JsonIgnore
    public void setDetailedStatusCode(Long value) { 
        this.detailedStatusCode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public CommandEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(CommandEntityScope value) { 
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
    @VsoProperty(displayName = "FullCommand", readOnly = false)   
    public String getFullCommand() {
       return fullCommand;
    }

    @JsonIgnore
    public void setFullCommand(String value) { 
        this.fullCommand = value;
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
    @VsoProperty(displayName = "LastUpdatedDate", readOnly = false)   
    public String getLastUpdatedDate() {
       return lastUpdatedDate;
    }

    @JsonIgnore
    public void setLastUpdatedDate(String value) { 
        this.lastUpdatedDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Override", readOnly = false)   
    public CommandOverride getOverride() {
       return override;
    }

    @JsonIgnore
    public void setOverride(CommandOverride value) { 
        this.override = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Owner", readOnly = false)   
    public String getOwner() {
       return owner;
    }

    @JsonIgnore
    public void setOwner(String value) { 
        this.owner = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Progress", readOnly = false)   
    public String getProgress() {
       return progress;
    }

    @JsonIgnore
    public void setProgress(String value) { 
        this.progress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Status", readOnly = false)   
    public CommandStatus getStatus() {
       return status;
    }

    @JsonIgnore
    public void setStatus(CommandStatus value) { 
        this.status = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Summary", readOnly = false)   
    public String getSummary() {
       return summary;
    }

    @JsonIgnore
    public void setSummary(String value) { 
        this.summary = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.COMMAND, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.COMMAND, getId());
        }
    }public String toString() {
        return "Command [" + "assocEntityType=" + assocEntityType + ", associatedParam=" + associatedParam + ", associatedParamType=" + associatedParamType + ", command=" + command + ", commandInformation=" + commandInformation + ", creationDate=" + creationDate + ", detail=" + detail + ", detailedStatus=" + detailedStatus + ", detailedStatusCode=" + detailedStatusCode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", fullCommand=" + fullCommand + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", override=" + override + ", owner=" + owner + ", progress=" + progress + ", status=" + status + ", summary=" + summary + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}