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

import net.nuagenetworks.vro.vspk.model.fetchers.DeploymentFailuresFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EthernetSegmentGroupsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPFilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPv6FilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MACFilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SAPEgressQoSProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SAPIngressQoSProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.enums.EthernetSegmentGWGroupPersonality;
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

@VsoFinder(name = Constants.ETHERNETSEGMENTGWGROUP, datasource = Constants.DATASOURCE, image = Constants.ETHERNETSEGMENTGWGROUP_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSPROFILES_FETCHER, type = Constants.EGRESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ETHERNETSEGMENTGROUPS_FETCHER, type = Constants.ETHERNETSEGMENTGROUPS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSPROFILES_FETCHER, type = Constants.INGRESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ethernetsegmentgwgroup", resourceName = "ethernetsegmentgwgroups")
public class EthernetSegmentGWGroup extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "assocGatewaysNames")
    protected java.util.List<String> assocGatewaysNames;
    
    @JsonProperty(value = "assocGatewaysStatus")
    protected java.util.List<String> assocGatewaysStatus;
    
    @JsonProperty(value = "associatedGatewayIDs")
    protected java.util.List<String> associatedGatewayIDs;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "personality")
    protected EthernetSegmentGWGroupPersonality personality;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private DeploymentFailuresFetcher deploymentFailures;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private EgressProfilesFetcher egressProfiles;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EthernetSegmentGroupsFetcher ethernetSegmentGroups;
    
    @JsonIgnore
    private IngressProfilesFetcher ingressProfiles;
    
    @JsonIgnore
    private IPFilterProfilesFetcher iPFilterProfiles;
    
    @JsonIgnore
    private IPv6FilterProfilesFetcher iPv6FilterProfiles;
    
    @JsonIgnore
    private JobsFetcher jobs;
    
    @JsonIgnore
    private L2DomainsFetcher l2Domains;
    
    @JsonIgnore
    private MACFilterProfilesFetcher mACFilterProfiles;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private SAPEgressQoSProfilesFetcher sAPEgressQoSProfiles;
    
    @JsonIgnore
    private SAPIngressQoSProfilesFetcher sAPIngressQoSProfiles;
    
    @VsoConstructor
    public EthernetSegmentGWGroup() {
        alarms = new AlarmsFetcher(this);
        
        deploymentFailures = new DeploymentFailuresFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        egressProfiles = new EgressProfilesFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        ethernetSegmentGroups = new EthernetSegmentGroupsFetcher(this);
        
        ingressProfiles = new IngressProfilesFetcher(this);
        
        iPFilterProfiles = new IPFilterProfilesFetcher(this);
        
        iPv6FilterProfiles = new IPv6FilterProfilesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        mACFilterProfiles = new MACFilterProfilesFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        sAPEgressQoSProfiles = new SAPEgressQoSProfilesFetcher(this);
        
        sAPIngressQoSProfiles = new SAPIngressQoSProfilesFetcher(this);
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
    @VsoProperty(displayName = "AssocGatewaysNames", readOnly = false)   
    public java.util.List<String> getAssocGatewaysNames() {
       return assocGatewaysNames;
    }

    @JsonIgnore
    public void setAssocGatewaysNames(java.util.List<String> value) { 
        this.assocGatewaysNames = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssocGatewaysStatus", readOnly = false)   
    public java.util.List<String> getAssocGatewaysStatus() {
       return assocGatewaysStatus;
    }

    @JsonIgnore
    public void setAssocGatewaysStatus(java.util.List<String> value) { 
        this.assocGatewaysStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewayIDs", readOnly = false)   
    public java.util.List<String> getAssociatedGatewayIDs() {
       return associatedGatewayIDs;
    }

    @JsonIgnore
    public void setAssociatedGatewayIDs(java.util.List<String> value) { 
        this.associatedGatewayIDs = value;
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
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public EthernetSegmentGWGroupPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(EthernetSegmentGWGroupPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DeploymentFailures", readOnly = true)   
    public DeploymentFailuresFetcher getDeploymentFailures() {
        return deploymentFailures;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Domains", readOnly = true)   
    public DomainsFetcher getDomains() {
        return domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EgressProfiles", readOnly = true)   
    public EgressProfilesFetcher getEgressProfiles() {
        return egressProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterprisePermissions", readOnly = true)   
    public EnterprisePermissionsFetcher getEnterprisePermissions() {
        return enterprisePermissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EthernetSegmentGroups", readOnly = true)   
    public EthernetSegmentGroupsFetcher getEthernetSegmentGroups() {
        return ethernetSegmentGroups;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IngressProfiles", readOnly = true)   
    public IngressProfilesFetcher getIngressProfiles() {
        return ingressProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPFilterProfiles", readOnly = true)   
    public IPFilterProfilesFetcher getIPFilterProfiles() {
        return iPFilterProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IPv6FilterProfiles", readOnly = true)   
    public IPv6FilterProfilesFetcher getIPv6FilterProfiles() {
        return iPv6FilterProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Jobs", readOnly = true)   
    public JobsFetcher getJobs() {
        return jobs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "L2Domains", readOnly = true)   
    public L2DomainsFetcher getL2Domains() {
        return l2Domains;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MACFilterProfiles", readOnly = true)   
    public MACFilterProfilesFetcher getMACFilterProfiles() {
        return mACFilterProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SAPEgressQoSProfiles", readOnly = true)   
    public SAPEgressQoSProfilesFetcher getSAPEgressQoSProfiles() {
        return sAPEgressQoSProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SAPIngressQoSProfiles", readOnly = true)   
    public SAPIngressQoSProfilesFetcher getSAPIngressQoSProfiles() {
        return sAPIngressQoSProfiles;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.ETHERNETSEGMENTGWGROUP, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.ETHERNETSEGMENTGWGROUP, getId());
        }
    }
    @VsoMethod
    public void createEgressProfile(Session session, EgressProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.EGRESSPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEnterprisePermission(Session session, EnterprisePermission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ENTERPRISEPERMISSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createEthernetSegmentGroup(Session session, EthernetSegmentGroup childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.ETHERNETSEGMENTGROUPS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createIngressProfile(Session session, IngressProfile childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.INGRESSPROFILES_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createJob(Session session, Job childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.JOBS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }public String toString() {
        return "EthernetSegmentGWGroup [" + "assocGatewaysNames=" + assocGatewaysNames + ", assocGatewaysStatus=" + assocGatewaysStatus + ", associatedGatewayIDs=" + associatedGatewayIDs + ", description=" + description + ", name=" + name + ", personality=" + personality + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}