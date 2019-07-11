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

import net.nuagenetworks.vro.vspk.model.fetchers.BootstrapsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.BootstrapActivationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DeploymentFailuresFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EgressProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EnterprisePermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.EventLogsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GatewaySecuritiesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.InfrastructureConfigsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IngressProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPFilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.IPv6FilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.JobsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.L2DomainsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.LocationsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MACFilterProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PATNATPoolsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PermissionsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.PortsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SAPEgressQoSProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SAPIngressQoSProfilesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.WANServicesFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.SubnetsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.GatewayZFBMatchAttribute;

import net.nuagenetworks.vro.vspk.model.enums.GatewayBootstrapStatus;

import net.nuagenetworks.vro.vspk.model.enums.GatewayEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.GatewayFamily;

import net.nuagenetworks.vro.vspk.model.enums.GatewayPermittedAction;

import net.nuagenetworks.vro.vspk.model.enums.GatewayPersonality;

import net.nuagenetworks.vro.vspk.model.enums.GatewayVendor;
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

@VsoFinder(name = Constants.GATEWAY, datasource = Constants.DATASOURCE, image = Constants.GATEWAY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.EGRESSPROFILES_FETCHER, type = Constants.EGRESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.ENTERPRISEPERMISSIONS_FETCHER, type = Constants.ENTERPRISEPERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.INGRESSPROFILES_FETCHER, type = Constants.INGRESSPROFILES_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PERMISSIONS_FETCHER, type = Constants.PERMISSIONS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.PORTS_FETCHER, type = Constants.PORTS_FETCHER), 

        @VsoRelation(inventoryChildren = true, name = Constants.WANSERVICES_FETCHER, type = Constants.WANSERVICES_FETCHER), 
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "gateway", resourceName = "gateways")
public class Gateway extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "BIOSReleaseDate")
    protected String BIOSReleaseDate;
    
    @JsonProperty(value = "BIOSVersion")
    protected String BIOSVersion;
    
    @JsonProperty(value = "CPUType")
    protected String CPUType;
    
    @JsonProperty(value = "MACAddress")
    protected String MACAddress;
    
    @JsonProperty(value = "UUID")
    protected String UUID;
    
    @JsonProperty(value = "ZFBMatchAttribute")
    protected GatewayZFBMatchAttribute ZFBMatchAttribute;
    
    @JsonProperty(value = "ZFBMatchValue")
    protected String ZFBMatchValue;
    
    @JsonProperty(value = "associatedGatewaySecurityID")
    protected String associatedGatewaySecurityID;
    
    @JsonProperty(value = "associatedGatewaySecurityProfileID")
    protected String associatedGatewaySecurityProfileID;
    
    @JsonProperty(value = "associatedNSGInfoID")
    protected String associatedNSGInfoID;
    
    @JsonProperty(value = "associatedNetconfProfileID")
    protected String associatedNetconfProfileID;
    
    @JsonProperty(value = "autoDiscGatewayID")
    protected String autoDiscGatewayID;
    
    @JsonProperty(value = "bootstrapID")
    protected String bootstrapID;
    
    @JsonProperty(value = "bootstrapStatus")
    protected GatewayBootstrapStatus bootstrapStatus;
    
    @JsonProperty(value = "datapathID")
    protected String datapathID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "embeddedMetadata")
    protected java.util.List<String> embeddedMetadata;
    
    @JsonProperty(value = "enterpriseID")
    protected String enterpriseID;
    
    @JsonProperty(value = "entityScope")
    protected GatewayEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "family")
    protected GatewayFamily family;
    
    @JsonProperty(value = "gatewayConfigRawVersion")
    protected String gatewayConfigRawVersion;
    
    @JsonProperty(value = "gatewayConfigVersion")
    protected String gatewayConfigVersion;
    
    @JsonProperty(value = "gatewayConnected")
    protected Boolean gatewayConnected;
    
    @JsonProperty(value = "gatewayModel")
    protected String gatewayModel;
    
    @JsonProperty(value = "gatewayVersion")
    protected String gatewayVersion;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "libraries")
    protected String libraries;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "managementID")
    protected String managementID;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "patches")
    protected String patches;
    
    @JsonProperty(value = "peer")
    protected String peer;
    
    @JsonProperty(value = "pending")
    protected Boolean pending;
    
    @JsonProperty(value = "permittedAction")
    protected GatewayPermittedAction permittedAction;
    
    @JsonProperty(value = "personality")
    protected GatewayPersonality personality;
    
    @JsonProperty(value = "productName")
    protected String productName;
    
    @JsonProperty(value = "redundancyGroupID")
    protected String redundancyGroupID;
    
    @JsonProperty(value = "serialNumber")
    protected String serialNumber;
    
    @JsonProperty(value = "systemID")
    protected String systemID;
    
    @JsonProperty(value = "templateID")
    protected String templateID;
    
    @JsonProperty(value = "useGatewayVLANVNID")
    protected Boolean useGatewayVLANVNID;
    
    @JsonProperty(value = "vendor")
    protected GatewayVendor vendor;
    
    @JsonProperty(value = "vtep")
    protected String vtep;
    
    @JsonIgnore
    private AlarmsFetcher alarms;
    
    @JsonIgnore
    private BootstrapsFetcher bootstraps;
    
    @JsonIgnore
    private BootstrapActivationsFetcher bootstrapActivations;
    
    @JsonIgnore
    private DeploymentFailuresFetcher deploymentFailures;
    
    @JsonIgnore
    private DomainsFetcher domains;
    
    @JsonIgnore
    private EgressProfilesFetcher egressProfiles;
    
    @JsonIgnore
    private EnterprisePermissionsFetcher enterprisePermissions;
    
    @JsonIgnore
    private EventLogsFetcher eventLogs;
    
    @JsonIgnore
    private GatewaySecuritiesFetcher gatewaySecurities;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private InfrastructureConfigsFetcher infrastructureConfigs;
    
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
    private LocationsFetcher locations;
    
    @JsonIgnore
    private MACFilterProfilesFetcher mACFilterProfiles;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @JsonIgnore
    private PATNATPoolsFetcher pATNATPools;
    
    @JsonIgnore
    private PermissionsFetcher permissions;
    
    @JsonIgnore
    private PortsFetcher ports;
    
    @JsonIgnore
    private SAPEgressQoSProfilesFetcher sAPEgressQoSProfiles;
    
    @JsonIgnore
    private SAPIngressQoSProfilesFetcher sAPIngressQoSProfiles;
    
    @JsonIgnore
    private WANServicesFetcher wANServices;
    
    @JsonIgnore
    private SubnetsFetcher subnets;
    
    @VsoConstructor
    public Gateway() {
        personality = GatewayPersonality.VRSG;
        
        alarms = new AlarmsFetcher(this);
        
        bootstraps = new BootstrapsFetcher(this);
        
        bootstrapActivations = new BootstrapActivationsFetcher(this);
        
        deploymentFailures = new DeploymentFailuresFetcher(this);
        
        domains = new DomainsFetcher(this);
        
        egressProfiles = new EgressProfilesFetcher(this);
        
        enterprisePermissions = new EnterprisePermissionsFetcher(this);
        
        eventLogs = new EventLogsFetcher(this);
        
        gatewaySecurities = new GatewaySecuritiesFetcher(this);
        
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        infrastructureConfigs = new InfrastructureConfigsFetcher(this);
        
        ingressProfiles = new IngressProfilesFetcher(this);
        
        iPFilterProfiles = new IPFilterProfilesFetcher(this);
        
        iPv6FilterProfiles = new IPv6FilterProfilesFetcher(this);
        
        jobs = new JobsFetcher(this);
        
        l2Domains = new L2DomainsFetcher(this);
        
        locations = new LocationsFetcher(this);
        
        mACFilterProfiles = new MACFilterProfilesFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        
        pATNATPools = new PATNATPoolsFetcher(this);
        
        permissions = new PermissionsFetcher(this);
        
        ports = new PortsFetcher(this);
        
        sAPEgressQoSProfiles = new SAPEgressQoSProfilesFetcher(this);
        
        sAPIngressQoSProfiles = new SAPIngressQoSProfilesFetcher(this);
        
        wANServices = new WANServicesFetcher(this);
        
        subnets = new SubnetsFetcher(this);
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
    @VsoProperty(displayName = "BIOSReleaseDate", readOnly = false)   
    public String getBIOSReleaseDate() {
       return BIOSReleaseDate;
    }

    @JsonIgnore
    public void setBIOSReleaseDate(String value) { 
        this.BIOSReleaseDate = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BIOSVersion", readOnly = false)   
    public String getBIOSVersion() {
       return BIOSVersion;
    }

    @JsonIgnore
    public void setBIOSVersion(String value) { 
        this.BIOSVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "CPUType", readOnly = false)   
    public String getCPUType() {
       return CPUType;
    }

    @JsonIgnore
    public void setCPUType(String value) { 
        this.CPUType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MACAddress", readOnly = false)   
    public String getMACAddress() {
       return MACAddress;
    }

    @JsonIgnore
    public void setMACAddress(String value) { 
        this.MACAddress = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UUID", readOnly = false)   
    public String getUUID() {
       return UUID;
    }

    @JsonIgnore
    public void setUUID(String value) { 
        this.UUID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBMatchAttribute", readOnly = false)   
    public GatewayZFBMatchAttribute getZFBMatchAttribute() {
       return ZFBMatchAttribute;
    }

    @JsonIgnore
    public void setZFBMatchAttribute(GatewayZFBMatchAttribute value) { 
        this.ZFBMatchAttribute = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ZFBMatchValue", readOnly = false)   
    public String getZFBMatchValue() {
       return ZFBMatchValue;
    }

    @JsonIgnore
    public void setZFBMatchValue(String value) { 
        this.ZFBMatchValue = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewaySecurityID", readOnly = false)   
    public String getAssociatedGatewaySecurityID() {
       return associatedGatewaySecurityID;
    }

    @JsonIgnore
    public void setAssociatedGatewaySecurityID(String value) { 
        this.associatedGatewaySecurityID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedGatewaySecurityProfileID", readOnly = false)   
    public String getAssociatedGatewaySecurityProfileID() {
       return associatedGatewaySecurityProfileID;
    }

    @JsonIgnore
    public void setAssociatedGatewaySecurityProfileID(String value) { 
        this.associatedGatewaySecurityProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNSGInfoID", readOnly = false)   
    public String getAssociatedNSGInfoID() {
       return associatedNSGInfoID;
    }

    @JsonIgnore
    public void setAssociatedNSGInfoID(String value) { 
        this.associatedNSGInfoID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedNetconfProfileID", readOnly = false)   
    public String getAssociatedNetconfProfileID() {
       return associatedNetconfProfileID;
    }

    @JsonIgnore
    public void setAssociatedNetconfProfileID(String value) { 
        this.associatedNetconfProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AutoDiscGatewayID", readOnly = false)   
    public String getAutoDiscGatewayID() {
       return autoDiscGatewayID;
    }

    @JsonIgnore
    public void setAutoDiscGatewayID(String value) { 
        this.autoDiscGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapID", readOnly = false)   
    public String getBootstrapID() {
       return bootstrapID;
    }

    @JsonIgnore
    public void setBootstrapID(String value) { 
        this.bootstrapID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapStatus", readOnly = false)   
    public GatewayBootstrapStatus getBootstrapStatus() {
       return bootstrapStatus;
    }

    @JsonIgnore
    public void setBootstrapStatus(GatewayBootstrapStatus value) { 
        this.bootstrapStatus = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DatapathID", readOnly = false)   
    public String getDatapathID() {
       return datapathID;
    }

    @JsonIgnore
    public void setDatapathID(String value) { 
        this.datapathID = value;
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
    @VsoProperty(displayName = "EmbeddedMetadata", readOnly = false)   
    public java.util.List<String> getEmbeddedMetadata() {
       return embeddedMetadata;
    }

    @JsonIgnore
    public void setEmbeddedMetadata(java.util.List<String> value) { 
        this.embeddedMetadata = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseID", readOnly = false)   
    public String getEnterpriseID() {
       return enterpriseID;
    }

    @JsonIgnore
    public void setEnterpriseID(String value) { 
        this.enterpriseID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public GatewayEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(GatewayEntityScope value) { 
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
    @VsoProperty(displayName = "Family", readOnly = false)   
    public GatewayFamily getFamily() {
       return family;
    }

    @JsonIgnore
    public void setFamily(GatewayFamily value) { 
        this.family = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConfigRawVersion", readOnly = false)   
    public String getGatewayConfigRawVersion() {
       return gatewayConfigRawVersion;
    }

    @JsonIgnore
    public void setGatewayConfigRawVersion(String value) { 
        this.gatewayConfigRawVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConfigVersion", readOnly = false)   
    public String getGatewayConfigVersion() {
       return gatewayConfigVersion;
    }

    @JsonIgnore
    public void setGatewayConfigVersion(String value) { 
        this.gatewayConfigVersion = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayConnected", readOnly = false)   
    public Boolean getGatewayConnected() {
       return gatewayConnected;
    }

    @JsonIgnore
    public void setGatewayConnected(Boolean value) { 
        this.gatewayConnected = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayModel", readOnly = false)   
    public String getGatewayModel() {
       return gatewayModel;
    }

    @JsonIgnore
    public void setGatewayModel(String value) { 
        this.gatewayModel = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewayVersion", readOnly = false)   
    public String getGatewayVersion() {
       return gatewayVersion;
    }

    @JsonIgnore
    public void setGatewayVersion(String value) { 
        this.gatewayVersion = value;
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
    @VsoProperty(displayName = "Libraries", readOnly = false)   
    public String getLibraries() {
       return libraries;
    }

    @JsonIgnore
    public void setLibraries(String value) { 
        this.libraries = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocationID", readOnly = false)   
    public String getLocationID() {
       return locationID;
    }

    @JsonIgnore
    public void setLocationID(String value) { 
        this.locationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ManagementID", readOnly = false)   
    public String getManagementID() {
       return managementID;
    }

    @JsonIgnore
    public void setManagementID(String value) { 
        this.managementID = value;
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
    @VsoProperty(displayName = "Patches", readOnly = false)   
    public String getPatches() {
       return patches;
    }

    @JsonIgnore
    public void setPatches(String value) { 
        this.patches = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Peer", readOnly = false)   
    public String getPeer() {
       return peer;
    }

    @JsonIgnore
    public void setPeer(String value) { 
        this.peer = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Pending", readOnly = false)   
    public Boolean getPending() {
       return pending;
    }

    @JsonIgnore
    public void setPending(Boolean value) { 
        this.pending = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PermittedAction", readOnly = false)   
    public GatewayPermittedAction getPermittedAction() {
       return permittedAction;
    }

    @JsonIgnore
    public void setPermittedAction(GatewayPermittedAction value) { 
        this.permittedAction = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Personality", readOnly = false)   
    public GatewayPersonality getPersonality() {
       return personality;
    }

    @JsonIgnore
    public void setPersonality(GatewayPersonality value) { 
        this.personality = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProductName", readOnly = false)   
    public String getProductName() {
       return productName;
    }

    @JsonIgnore
    public void setProductName(String value) { 
        this.productName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RedundancyGroupID", readOnly = false)   
    public String getRedundancyGroupID() {
       return redundancyGroupID;
    }

    @JsonIgnore
    public void setRedundancyGroupID(String value) { 
        this.redundancyGroupID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SerialNumber", readOnly = false)   
    public String getSerialNumber() {
       return serialNumber;
    }

    @JsonIgnore
    public void setSerialNumber(String value) { 
        this.serialNumber = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SystemID", readOnly = false)   
    public String getSystemID() {
       return systemID;
    }

    @JsonIgnore
    public void setSystemID(String value) { 
        this.systemID = value;
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
    @VsoProperty(displayName = "UseGatewayVLANVNID", readOnly = false)   
    public Boolean getUseGatewayVLANVNID() {
       return useGatewayVLANVNID;
    }

    @JsonIgnore
    public void setUseGatewayVLANVNID(Boolean value) { 
        this.useGatewayVLANVNID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vendor", readOnly = false)   
    public GatewayVendor getVendor() {
       return vendor;
    }

    @JsonIgnore
    public void setVendor(GatewayVendor value) { 
        this.vendor = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Vtep", readOnly = false)   
    public String getVtep() {
       return vtep;
    }

    @JsonIgnore
    public void setVtep(String value) { 
        this.vtep = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Alarms", readOnly = true)   
    public AlarmsFetcher getAlarms() {
        return alarms;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Bootstraps", readOnly = true)   
    public BootstrapsFetcher getBootstraps() {
        return bootstraps;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "BootstrapActivations", readOnly = true)   
    public BootstrapActivationsFetcher getBootstrapActivations() {
        return bootstrapActivations;
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
    @VsoProperty(displayName = "EventLogs", readOnly = true)   
    public EventLogsFetcher getEventLogs() {
        return eventLogs;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GatewaySecurities", readOnly = true)   
    public GatewaySecuritiesFetcher getGatewaySecurities() {
        return gatewaySecurities;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "InfrastructureConfigs", readOnly = true)   
    public InfrastructureConfigsFetcher getInfrastructureConfigs() {
        return infrastructureConfigs;
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
    @VsoProperty(displayName = "Locations", readOnly = true)   
    public LocationsFetcher getLocations() {
        return locations;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MACFilterProfiles", readOnly = true)   
    public MACFilterProfilesFetcher getMACFilterProfiles() {
        return mACFilterProfiles;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PATNATPools", readOnly = true)   
    public PATNATPoolsFetcher getPATNATPools() {
        return pATNATPools;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Permissions", readOnly = true)   
    public PermissionsFetcher getPermissions() {
        return permissions;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Ports", readOnly = true)   
    public PortsFetcher getPorts() {
        return ports;
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
    
    @JsonIgnore
    @VsoProperty(displayName = "WANServices", readOnly = true)   
    public WANServicesFetcher getWANServices() {
        return wANServices;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Subnets", readOnly = true)   
    public SubnetsFetcher getSubnets() {
        return subnets;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.GATEWAY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.GATEWAY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.GATEWAY, getId());
        }
    }
    
    @VsoMethod
    public void assignPATNATPools(Session session, PATNATPool[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.GATEWAY, getId());
        }
    }
    
    @VsoMethod
    public void createBootstrapActivation(Session session, BootstrapActivation childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.BOOTSTRAPACTIVATIONS_FETCHER, getId());
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
    public void createGlobalMetadata(Session session, GlobalMetadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GLOBALMETADATAS_FETCHER, getId());
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
    public void createMetadata(Session session, Metadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.METADATAS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPermission(Session session, Permission childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PERMISSIONS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createPort(Session session, Port childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PORTS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void instantiatePort(Session session, Port childRestObj, PortTemplate fromTemplate, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.instantiateChild(session, childRestObj, fromTemplate, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.PORTS_FETCHER, getId());
        }
    }
    
    @VsoMethod
    public void createWANService(Session session, WANService childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.WANSERVICES_FETCHER, getId());
        }
    }public String toString() {
        return "Gateway [" + "BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", UUID=" + UUID + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNetconfProfileID=" + associatedNetconfProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", datapathID=" + datapathID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", gatewayConfigRawVersion=" + gatewayConfigRawVersion + ", gatewayConfigVersion=" + gatewayConfigVersion + ", gatewayConnected=" + gatewayConnected + ", gatewayModel=" + gatewayModel + ", gatewayVersion=" + gatewayVersion + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", managementID=" + managementID + ", name=" + name + ", patches=" + patches + ", peer=" + peer + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", templateID=" + templateID + ", useGatewayVLANVNID=" + useGatewayVLANVNID + ", vendor=" + vendor + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}