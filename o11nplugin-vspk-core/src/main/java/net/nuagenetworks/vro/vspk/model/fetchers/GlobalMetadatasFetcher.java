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

package net.nuagenetworks.vro.vspk.model.fetchers;

import net.nuagenetworks.vro.vspk.model.GlobalMetadata;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.ContainerInterface;

import net.nuagenetworks.vro.vspk.model.GroupKeyEncryptionProfile;

import net.nuagenetworks.vro.vspk.model.QOS;

import net.nuagenetworks.vro.vspk.model.Infrastructureaccessprofile;

import net.nuagenetworks.vro.vspk.model.BGPPeer;

import net.nuagenetworks.vro.vspk.model.SharedNetworkResource;

import net.nuagenetworks.vro.vspk.model.VirtualIP;

import net.nuagenetworks.vro.vspk.model.DSCPForwardingClassTable;

import net.nuagenetworks.vro.vspk.model.MultiCastChannelMap;

import net.nuagenetworks.vro.vspk.model.RedundancyGroup;

import net.nuagenetworks.vro.vspk.model.TCA;

import net.nuagenetworks.vro.vspk.model.Group;

import net.nuagenetworks.vro.vspk.model.VsgRedundantPort;

import net.nuagenetworks.vro.vspk.model.Zone;

import net.nuagenetworks.vro.vspk.model.IKEGatewayProfile;

import net.nuagenetworks.vro.vspk.model.IKESubnet;

import net.nuagenetworks.vro.vspk.model.InfrastructureGatewayProfile;

import net.nuagenetworks.vro.vspk.model.PolicyGroupTemplate;

import net.nuagenetworks.vro.vspk.model.FlowSecurityPolicy;

import net.nuagenetworks.vro.vspk.model.VCenterEAMConfig;

import net.nuagenetworks.vro.vspk.model.Location;

import net.nuagenetworks.vro.vspk.model.EnterpriseSecurity;

import net.nuagenetworks.vro.vspk.model.VCenterVRSConfig;

import net.nuagenetworks.vro.vspk.model.EnterpriseNetwork;

import net.nuagenetworks.vro.vspk.model.InfrastructureVscProfile;

import net.nuagenetworks.vro.vspk.model.Permission;

import net.nuagenetworks.vro.vspk.model.IPReservation;

import net.nuagenetworks.vro.vspk.model.RedirectionTargetTemplate;

import net.nuagenetworks.vro.vspk.model.SubnetTemplate;

import net.nuagenetworks.vro.vspk.model.MetadataTag;

import net.nuagenetworks.vro.vspk.model.FloatingIPACLTemplate;

import net.nuagenetworks.vro.vspk.model.IKEGatewayConnection;

import net.nuagenetworks.vro.vspk.model.RedirectionTarget;

import net.nuagenetworks.vro.vspk.model.EgressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressExternalServiceTemplateEntry;

import net.nuagenetworks.vro.vspk.model.Avatar;

import net.nuagenetworks.vro.vspk.model.BootstrapActivation;

import net.nuagenetworks.vro.vspk.model.CloudMgmtSystem;

import net.nuagenetworks.vro.vspk.model.VSP;

import net.nuagenetworks.vro.vspk.model.Domain;

import net.nuagenetworks.vro.vspk.model.RedundantPort;

import net.nuagenetworks.vro.vspk.model.DSCPForwardingClassMapping;

import net.nuagenetworks.vro.vspk.model.NetworkLayout;

import net.nuagenetworks.vro.vspk.model.WANService;

import net.nuagenetworks.vro.vspk.model.VSD;

import net.nuagenetworks.vro.vspk.model.VPort;

import net.nuagenetworks.vro.vspk.model.FlowForwardingPolicy;

import net.nuagenetworks.vro.vspk.model.Port;

import net.nuagenetworks.vro.vspk.model.StatisticsPolicy;

import net.nuagenetworks.vro.vspk.model.Subnet;

import net.nuagenetworks.vro.vspk.model.Container;

import net.nuagenetworks.vro.vspk.model.RateLimiter;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitorEncryptedSeed;

import net.nuagenetworks.vro.vspk.model.ZoneTemplate;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitorSeed;

import net.nuagenetworks.vro.vspk.model.GatewayTemplate;

import net.nuagenetworks.vro.vspk.model.VRS;

import net.nuagenetworks.vro.vspk.model.HSC;

import net.nuagenetworks.vro.vspk.model.VLAN;

import net.nuagenetworks.vro.vspk.model.LDAPConfiguration;

import net.nuagenetworks.vro.vspk.model.VSDComponent;

import net.nuagenetworks.vro.vspk.model.ZFBRequest;

import net.nuagenetworks.vro.vspk.model.EnterprisePermission;

import net.nuagenetworks.vro.vspk.model.StaticRoute;

import net.nuagenetworks.vro.vspk.model.Job;

import net.nuagenetworks.vro.vspk.model.VMInterface;

import net.nuagenetworks.vro.vspk.model.GatewaySecuredData;

import net.nuagenetworks.vro.vspk.model.VCenterHypervisor;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitor;

import net.nuagenetworks.vro.vspk.model.EventLog;

import net.nuagenetworks.vro.vspk.model.License;

import net.nuagenetworks.vro.vspk.model.EnterpriseProfile;

import net.nuagenetworks.vro.vspk.model.BridgeInterface;

import net.nuagenetworks.vro.vspk.model.VCenterCluster;

import net.nuagenetworks.vro.vspk.model.MultiCastRange;

import net.nuagenetworks.vro.vspk.model.NetworkMacroGroup;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdEntryTemplate;

import net.nuagenetworks.vro.vspk.model.AutoDiscoveredGateway;

import net.nuagenetworks.vro.vspk.model.MultiCastList;

import net.nuagenetworks.vro.vspk.model.NextHop;

import net.nuagenetworks.vro.vspk.model.KeyServerNotification;

import net.nuagenetworks.vro.vspk.model.MirrorDestination;

import net.nuagenetworks.vro.vspk.model.Tier;

import net.nuagenetworks.vro.vspk.model.DomainFIPAclTemplate;

import net.nuagenetworks.vro.vspk.model.AddressMap;

import net.nuagenetworks.vro.vspk.model.Gateway;

import net.nuagenetworks.vro.vspk.model.MultiNICVPort;

import net.nuagenetworks.vro.vspk.model.Statistics;

import net.nuagenetworks.vro.vspk.model.NSPortTemplate;

import net.nuagenetworks.vro.vspk.model.Certificate;

import net.nuagenetworks.vro.vspk.model.VCenterDataCenter;

import net.nuagenetworks.vro.vspk.model.L2DomainTemplate;

import net.nuagenetworks.vro.vspk.model.ApplicationService;

import net.nuagenetworks.vro.vspk.model.IKEGateway;

import net.nuagenetworks.vro.vspk.model.StatsCollectorInfo;

import net.nuagenetworks.vro.vspk.model.VCenter;

import net.nuagenetworks.vro.vspk.model.BulkStatistics;

import net.nuagenetworks.vro.vspk.model.IngressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.RoutingPolicy;

import net.nuagenetworks.vro.vspk.model.L2Domain;

import net.nuagenetworks.vro.vspk.model.IKEGatewayConfig;

import net.nuagenetworks.vro.vspk.model.HostInterface;

import net.nuagenetworks.vro.vspk.model.EnterpriseSecuredData;

import net.nuagenetworks.vro.vspk.model.IKECertificate;

import net.nuagenetworks.vro.vspk.model.IngressExternalServiceTemplate;

import net.nuagenetworks.vro.vspk.model.PortTemplate;

import net.nuagenetworks.vro.vspk.model.Me;

import net.nuagenetworks.vro.vspk.model.EndPoint;

import net.nuagenetworks.vro.vspk.model.DHCPOption;

import net.nuagenetworks.vro.vspk.model.KeyServerMember;

import net.nuagenetworks.vro.vspk.model.NSGateway;

import net.nuagenetworks.vro.vspk.model.NSGatewayTemplate;

import net.nuagenetworks.vro.vspk.model.VSC;

import net.nuagenetworks.vro.vspk.model.UplinkRD;

import net.nuagenetworks.vro.vspk.model.VM;

import net.nuagenetworks.vro.vspk.model.NSPort;

import net.nuagenetworks.vro.vspk.model.VRSAddressRange;

import net.nuagenetworks.vro.vspk.model.BGPProfile;

import net.nuagenetworks.vro.vspk.model.EgressQOSPolicy;

import net.nuagenetworks.vro.vspk.model.PublicNetworkMacro;

import net.nuagenetworks.vro.vspk.model.DomainFIPAclTemplateEntry;

import net.nuagenetworks.vro.vspk.model.AddressRange;

import net.nuagenetworks.vro.vspk.model.DomainTemplate;

import net.nuagenetworks.vro.vspk.model.SiteInfo;

import net.nuagenetworks.vro.vspk.model.VMResync;

import net.nuagenetworks.vro.vspk.model.PolicyDecision;

import net.nuagenetworks.vro.vspk.model.FloatingIp;

import net.nuagenetworks.vro.vspk.model.EgressACLTemplate;

import net.nuagenetworks.vro.vspk.model.MonitoringPort;

import net.nuagenetworks.vro.vspk.model.VPNConnection;

import net.nuagenetworks.vro.vspk.model.NSRedundantGatewayGroup;

import net.nuagenetworks.vro.vspk.model.ExternalService;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitorSEK;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdTemplate;

import net.nuagenetworks.vro.vspk.model.VPortMirror;

import net.nuagenetworks.vro.vspk.model.PATNATPool;

import net.nuagenetworks.vro.vspk.model.BGPNeighbor;

import net.nuagenetworks.vro.vspk.model.ContainerResync;

import net.nuagenetworks.vro.vspk.model.AllAlarm;

import net.nuagenetworks.vro.vspk.model.IKEPSK;

import net.nuagenetworks.vro.vspk.model.SystemConfig;

import net.nuagenetworks.vro.vspk.model.IKEEncryptionprofile;

import net.nuagenetworks.vro.vspk.model.FloatingIPACLTemplateEntry;

import net.nuagenetworks.vro.vspk.model.InfrastructureConfig;

import net.nuagenetworks.vro.vspk.model.User;

import net.nuagenetworks.vro.vspk.model.NATMapEntry;

import net.nuagenetworks.vro.vspk.model.PolicyGroup;

import net.nuagenetworks.vro.vspk.model.ExternalAppService;

import net.nuagenetworks.vro.vspk.model.Alarm;

import net.nuagenetworks.vro.vspk.model.Bootstrap;

import net.nuagenetworks.vro.vspk.model.Flow;

import net.nuagenetworks.vro.vspk.model.VLANTemplate;

import net.nuagenetworks.vro.vspk.model.GatewaySecurity;

import net.nuagenetworks.vro.vspk.model.GlobalMetadata;

import net.nuagenetworks.vro.vspk.model.Enterprise;

import net.nuagenetworks.vro.vspk.model.Link;

import net.nuagenetworks.vro.vspk.model.IngressACLTemplate;
import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.RestObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.GLOBALMETADATAS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.GLOBALMETADATAS, type = Constants.GLOBALMETADATA) })
@VsoObject(create = false, strict = true)
public class GlobalMetadatasFetcher extends BaseFetcher<GlobalMetadata> {
    private static final long serialVersionUID = 1L;

    public GlobalMetadatasFetcher(RestObject parentRestObj) {
        super(parentRestObj, GlobalMetadata.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "GlobalMetadatas";
    }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "ContainerInterface", readOnly = true)
    public ContainerInterface getContainerInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ContainerInterface) {
            return (ContainerInterface) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GroupKeyEncryptionProfile", readOnly = true)
    public GroupKeyEncryptionProfile getGroupKeyEncryptionProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GroupKeyEncryptionProfile) {
            return (GroupKeyEncryptionProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "QOS", readOnly = true)
    public QOS getQOS() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof QOS) {
            return (QOS) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Infrastructureaccessprofile", readOnly = true)
    public Infrastructureaccessprofile getInfrastructureaccessprofile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Infrastructureaccessprofile) {
            return (Infrastructureaccessprofile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BGPPeer", readOnly = true)
    public BGPPeer getBGPPeer() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BGPPeer) {
            return (BGPPeer) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SharedNetworkResource", readOnly = true)
    public SharedNetworkResource getSharedNetworkResource() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SharedNetworkResource) {
            return (SharedNetworkResource) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VirtualIP", readOnly = true)
    public VirtualIP getVirtualIP() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VirtualIP) {
            return (VirtualIP) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DSCPForwardingClassTable", readOnly = true)
    public DSCPForwardingClassTable getDSCPForwardingClassTable() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DSCPForwardingClassTable) {
            return (DSCPForwardingClassTable) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MultiCastChannelMap", readOnly = true)
    public MultiCastChannelMap getMultiCastChannelMap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiCastChannelMap) {
            return (MultiCastChannelMap) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RedundancyGroup", readOnly = true)
    public RedundancyGroup getRedundancyGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedundancyGroup) {
            return (RedundancyGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "TCA", readOnly = true)
    public TCA getTCA() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof TCA) {
            return (TCA) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Group", readOnly = true)
    public Group getGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Group) {
            return (Group) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VsgRedundantPort", readOnly = true)
    public VsgRedundantPort getVsgRedundantPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VsgRedundantPort) {
            return (VsgRedundantPort) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Zone", readOnly = true)
    public Zone getZone() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Zone) {
            return (Zone) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKEGatewayProfile", readOnly = true)
    public IKEGatewayProfile getIKEGatewayProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEGatewayProfile) {
            return (IKEGatewayProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKESubnet", readOnly = true)
    public IKESubnet getIKESubnet() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKESubnet) {
            return (IKESubnet) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "InfrastructureGatewayProfile", readOnly = true)
    public InfrastructureGatewayProfile getInfrastructureGatewayProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof InfrastructureGatewayProfile) {
            return (InfrastructureGatewayProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PolicyGroupTemplate", readOnly = true)
    public PolicyGroupTemplate getPolicyGroupTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyGroupTemplate) {
            return (PolicyGroupTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "FlowSecurityPolicy", readOnly = true)
    public FlowSecurityPolicy getFlowSecurityPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FlowSecurityPolicy) {
            return (FlowSecurityPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VCenterEAMConfig", readOnly = true)
    public VCenterEAMConfig getVCenterEAMConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterEAMConfig) {
            return (VCenterEAMConfig) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Location", readOnly = true)
    public Location getLocation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Location) {
            return (Location) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EnterpriseSecurity", readOnly = true)
    public EnterpriseSecurity getEnterpriseSecurity() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterpriseSecurity) {
            return (EnterpriseSecurity) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VCenterVRSConfig", readOnly = true)
    public VCenterVRSConfig getVCenterVRSConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterVRSConfig) {
            return (VCenterVRSConfig) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EnterpriseNetwork", readOnly = true)
    public EnterpriseNetwork getEnterpriseNetwork() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterpriseNetwork) {
            return (EnterpriseNetwork) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "InfrastructureVscProfile", readOnly = true)
    public InfrastructureVscProfile getInfrastructureVscProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof InfrastructureVscProfile) {
            return (InfrastructureVscProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Permission", readOnly = true)
    public Permission getPermission() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Permission) {
            return (Permission) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IPReservation", readOnly = true)
    public IPReservation getIPReservation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IPReservation) {
            return (IPReservation) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RedirectionTargetTemplate", readOnly = true)
    public RedirectionTargetTemplate getRedirectionTargetTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedirectionTargetTemplate) {
            return (RedirectionTargetTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SubnetTemplate", readOnly = true)
    public SubnetTemplate getSubnetTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SubnetTemplate) {
            return (SubnetTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MetadataTag", readOnly = true)
    public MetadataTag getMetadataTag() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MetadataTag) {
            return (MetadataTag) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "FloatingIPACLTemplate", readOnly = true)
    public FloatingIPACLTemplate getFloatingIPACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FloatingIPACLTemplate) {
            return (FloatingIPACLTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKEGatewayConnection", readOnly = true)
    public IKEGatewayConnection getIKEGatewayConnection() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEGatewayConnection) {
            return (IKEGatewayConnection) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RedirectionTarget", readOnly = true)
    public RedirectionTarget getRedirectionTarget() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedirectionTarget) {
            return (RedirectionTarget) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressACLEntryTemplate", readOnly = true)
    public EgressACLEntryTemplate getEgressACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressACLEntryTemplate) {
            return (EgressACLEntryTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressExternalServiceTemplateEntry", readOnly = true)
    public IngressExternalServiceTemplateEntry getIngressExternalServiceTemplateEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressExternalServiceTemplateEntry) {
            return (IngressExternalServiceTemplateEntry) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Avatar", readOnly = true)
    public Avatar getAvatar() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Avatar) {
            return (Avatar) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BootstrapActivation", readOnly = true)
    public BootstrapActivation getBootstrapActivation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BootstrapActivation) {
            return (BootstrapActivation) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "CloudMgmtSystem", readOnly = true)
    public CloudMgmtSystem getCloudMgmtSystem() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof CloudMgmtSystem) {
            return (CloudMgmtSystem) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VSP", readOnly = true)
    public VSP getVSP() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VSP) {
            return (VSP) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Domain", readOnly = true)
    public Domain getDomain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Domain) {
            return (Domain) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RedundantPort", readOnly = true)
    public RedundantPort getRedundantPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedundantPort) {
            return (RedundantPort) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DSCPForwardingClassMapping", readOnly = true)
    public DSCPForwardingClassMapping getDSCPForwardingClassMapping() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DSCPForwardingClassMapping) {
            return (DSCPForwardingClassMapping) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetworkLayout", readOnly = true)
    public NetworkLayout getNetworkLayout() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetworkLayout) {
            return (NetworkLayout) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "WANService", readOnly = true)
    public WANService getWANService() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof WANService) {
            return (WANService) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VSD", readOnly = true)
    public VSD getVSD() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VSD) {
            return (VSD) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VPort", readOnly = true)
    public VPort getVPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VPort) {
            return (VPort) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "FlowForwardingPolicy", readOnly = true)
    public FlowForwardingPolicy getFlowForwardingPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FlowForwardingPolicy) {
            return (FlowForwardingPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Port", readOnly = true)
    public Port getPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Port) {
            return (Port) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "StatisticsPolicy", readOnly = true)
    public StatisticsPolicy getStatisticsPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof StatisticsPolicy) {
            return (StatisticsPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Subnet", readOnly = true)
    public Subnet getSubnet() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Subnet) {
            return (Subnet) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Container", readOnly = true)
    public Container getContainer() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Container) {
            return (Container) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RateLimiter", readOnly = true)
    public RateLimiter getRateLimiter() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RateLimiter) {
            return (RateLimiter) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "KeyServerMonitorEncryptedSeed", readOnly = true)
    public KeyServerMonitorEncryptedSeed getKeyServerMonitorEncryptedSeed() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMonitorEncryptedSeed) {
            return (KeyServerMonitorEncryptedSeed) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ZoneTemplate", readOnly = true)
    public ZoneTemplate getZoneTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ZoneTemplate) {
            return (ZoneTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "KeyServerMonitorSeed", readOnly = true)
    public KeyServerMonitorSeed getKeyServerMonitorSeed() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMonitorSeed) {
            return (KeyServerMonitorSeed) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GatewayTemplate", readOnly = true)
    public GatewayTemplate getGatewayTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GatewayTemplate) {
            return (GatewayTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VRS", readOnly = true)
    public VRS getVRS() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VRS) {
            return (VRS) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "HSC", readOnly = true)
    public HSC getHSC() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof HSC) {
            return (HSC) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VLAN", readOnly = true)
    public VLAN getVLAN() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VLAN) {
            return (VLAN) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "LDAPConfiguration", readOnly = true)
    public LDAPConfiguration getLDAPConfiguration() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof LDAPConfiguration) {
            return (LDAPConfiguration) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VSDComponent", readOnly = true)
    public VSDComponent getVSDComponent() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VSDComponent) {
            return (VSDComponent) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ZFBRequest", readOnly = true)
    public ZFBRequest getZFBRequest() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ZFBRequest) {
            return (ZFBRequest) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EnterprisePermission", readOnly = true)
    public EnterprisePermission getEnterprisePermission() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterprisePermission) {
            return (EnterprisePermission) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "StaticRoute", readOnly = true)
    public StaticRoute getStaticRoute() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof StaticRoute) {
            return (StaticRoute) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Job", readOnly = true)
    public Job getJob() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Job) {
            return (Job) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VMInterface", readOnly = true)
    public VMInterface getVMInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VMInterface) {
            return (VMInterface) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GatewaySecuredData", readOnly = true)
    public GatewaySecuredData getGatewaySecuredData() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GatewaySecuredData) {
            return (GatewaySecuredData) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VCenterHypervisor", readOnly = true)
    public VCenterHypervisor getVCenterHypervisor() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterHypervisor) {
            return (VCenterHypervisor) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "KeyServerMonitor", readOnly = true)
    public KeyServerMonitor getKeyServerMonitor() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMonitor) {
            return (KeyServerMonitor) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EventLog", readOnly = true)
    public EventLog getEventLog() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EventLog) {
            return (EventLog) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "License", readOnly = true)
    public License getLicense() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof License) {
            return (License) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EnterpriseProfile", readOnly = true)
    public EnterpriseProfile getEnterpriseProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterpriseProfile) {
            return (EnterpriseProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BridgeInterface", readOnly = true)
    public BridgeInterface getBridgeInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BridgeInterface) {
            return (BridgeInterface) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VCenterCluster", readOnly = true)
    public VCenterCluster getVCenterCluster() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterCluster) {
            return (VCenterCluster) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MultiCastRange", readOnly = true)
    public MultiCastRange getMultiCastRange() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiCastRange) {
            return (MultiCastRange) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetworkMacroGroup", readOnly = true)
    public NetworkMacroGroup getNetworkMacroGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetworkMacroGroup) {
            return (NetworkMacroGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressAdvFwdEntryTemplate", readOnly = true)
    public IngressAdvFwdEntryTemplate getIngressAdvFwdEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAdvFwdEntryTemplate) {
            return (IngressAdvFwdEntryTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AutoDiscoveredGateway", readOnly = true)
    public AutoDiscoveredGateway getAutoDiscoveredGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AutoDiscoveredGateway) {
            return (AutoDiscoveredGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MultiCastList", readOnly = true)
    public MultiCastList getMultiCastList() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiCastList) {
            return (MultiCastList) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NextHop", readOnly = true)
    public NextHop getNextHop() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NextHop) {
            return (NextHop) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "KeyServerNotification", readOnly = true)
    public KeyServerNotification getKeyServerNotification() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerNotification) {
            return (KeyServerNotification) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MirrorDestination", readOnly = true)
    public MirrorDestination getMirrorDestination() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MirrorDestination) {
            return (MirrorDestination) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Tier", readOnly = true)
    public Tier getTier() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Tier) {
            return (Tier) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DomainFIPAclTemplate", readOnly = true)
    public DomainFIPAclTemplate getDomainFIPAclTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DomainFIPAclTemplate) {
            return (DomainFIPAclTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AddressMap", readOnly = true)
    public AddressMap getAddressMap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AddressMap) {
            return (AddressMap) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Gateway", readOnly = true)
    public Gateway getGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Gateway) {
            return (Gateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MultiNICVPort", readOnly = true)
    public MultiNICVPort getMultiNICVPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiNICVPort) {
            return (MultiNICVPort) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Statistics", readOnly = true)
    public Statistics getStatistics() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Statistics) {
            return (Statistics) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSPortTemplate", readOnly = true)
    public NSPortTemplate getNSPortTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSPortTemplate) {
            return (NSPortTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Certificate", readOnly = true)
    public Certificate getCertificate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Certificate) {
            return (Certificate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VCenterDataCenter", readOnly = true)
    public VCenterDataCenter getVCenterDataCenter() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterDataCenter) {
            return (VCenterDataCenter) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "L2DomainTemplate", readOnly = true)
    public L2DomainTemplate getL2DomainTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L2DomainTemplate) {
            return (L2DomainTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ApplicationService", readOnly = true)
    public ApplicationService getApplicationService() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ApplicationService) {
            return (ApplicationService) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKEGateway", readOnly = true)
    public IKEGateway getIKEGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEGateway) {
            return (IKEGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "StatsCollectorInfo", readOnly = true)
    public StatsCollectorInfo getStatsCollectorInfo() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof StatsCollectorInfo) {
            return (StatsCollectorInfo) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VCenter", readOnly = true)
    public VCenter getVCenter() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenter) {
            return (VCenter) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BulkStatistics", readOnly = true)
    public BulkStatistics getBulkStatistics() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BulkStatistics) {
            return (BulkStatistics) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressACLEntryTemplate", readOnly = true)
    public IngressACLEntryTemplate getIngressACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressACLEntryTemplate) {
            return (IngressACLEntryTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RoutingPolicy", readOnly = true)
    public RoutingPolicy getRoutingPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RoutingPolicy) {
            return (RoutingPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "L2Domain", readOnly = true)
    public L2Domain getL2Domain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L2Domain) {
            return (L2Domain) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKEGatewayConfig", readOnly = true)
    public IKEGatewayConfig getIKEGatewayConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEGatewayConfig) {
            return (IKEGatewayConfig) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "HostInterface", readOnly = true)
    public HostInterface getHostInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof HostInterface) {
            return (HostInterface) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EnterpriseSecuredData", readOnly = true)
    public EnterpriseSecuredData getEnterpriseSecuredData() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterpriseSecuredData) {
            return (EnterpriseSecuredData) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKECertificate", readOnly = true)
    public IKECertificate getIKECertificate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKECertificate) {
            return (IKECertificate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressExternalServiceTemplate", readOnly = true)
    public IngressExternalServiceTemplate getIngressExternalServiceTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressExternalServiceTemplate) {
            return (IngressExternalServiceTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PortTemplate", readOnly = true)
    public PortTemplate getPortTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PortTemplate) {
            return (PortTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Me", readOnly = true)
    public Me getMe() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Me) {
            return (Me) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EndPoint", readOnly = true)
    public EndPoint getEndPoint() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EndPoint) {
            return (EndPoint) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DHCPOption", readOnly = true)
    public DHCPOption getDHCPOption() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DHCPOption) {
            return (DHCPOption) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "KeyServerMember", readOnly = true)
    public KeyServerMember getKeyServerMember() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMember) {
            return (KeyServerMember) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSGateway", readOnly = true)
    public NSGateway getNSGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGateway) {
            return (NSGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSGatewayTemplate", readOnly = true)
    public NSGatewayTemplate getNSGatewayTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGatewayTemplate) {
            return (NSGatewayTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VSC", readOnly = true)
    public VSC getVSC() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VSC) {
            return (VSC) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "UplinkRD", readOnly = true)
    public UplinkRD getUplinkRD() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof UplinkRD) {
            return (UplinkRD) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VM", readOnly = true)
    public VM getVM() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VM) {
            return (VM) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSPort", readOnly = true)
    public NSPort getNSPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSPort) {
            return (NSPort) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VRSAddressRange", readOnly = true)
    public VRSAddressRange getVRSAddressRange() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VRSAddressRange) {
            return (VRSAddressRange) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BGPProfile", readOnly = true)
    public BGPProfile getBGPProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BGPProfile) {
            return (BGPProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressQOSPolicy", readOnly = true)
    public EgressQOSPolicy getEgressQOSPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressQOSPolicy) {
            return (EgressQOSPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PublicNetworkMacro", readOnly = true)
    public PublicNetworkMacro getPublicNetworkMacro() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PublicNetworkMacro) {
            return (PublicNetworkMacro) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DomainFIPAclTemplateEntry", readOnly = true)
    public DomainFIPAclTemplateEntry getDomainFIPAclTemplateEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DomainFIPAclTemplateEntry) {
            return (DomainFIPAclTemplateEntry) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AddressRange", readOnly = true)
    public AddressRange getAddressRange() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AddressRange) {
            return (AddressRange) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DomainTemplate", readOnly = true)
    public DomainTemplate getDomainTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DomainTemplate) {
            return (DomainTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SiteInfo", readOnly = true)
    public SiteInfo getSiteInfo() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SiteInfo) {
            return (SiteInfo) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VMResync", readOnly = true)
    public VMResync getVMResync() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VMResync) {
            return (VMResync) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PolicyDecision", readOnly = true)
    public PolicyDecision getPolicyDecision() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyDecision) {
            return (PolicyDecision) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "FloatingIp", readOnly = true)
    public FloatingIp getFloatingIp() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FloatingIp) {
            return (FloatingIp) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressACLTemplate", readOnly = true)
    public EgressACLTemplate getEgressACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressACLTemplate) {
            return (EgressACLTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MonitoringPort", readOnly = true)
    public MonitoringPort getMonitoringPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MonitoringPort) {
            return (MonitoringPort) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VPNConnection", readOnly = true)
    public VPNConnection getVPNConnection() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VPNConnection) {
            return (VPNConnection) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSRedundantGatewayGroup", readOnly = true)
    public NSRedundantGatewayGroup getNSRedundantGatewayGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSRedundantGatewayGroup) {
            return (NSRedundantGatewayGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ExternalService", readOnly = true)
    public ExternalService getExternalService() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ExternalService) {
            return (ExternalService) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "KeyServerMonitorSEK", readOnly = true)
    public KeyServerMonitorSEK getKeyServerMonitorSEK() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMonitorSEK) {
            return (KeyServerMonitorSEK) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressAdvFwdTemplate", readOnly = true)
    public IngressAdvFwdTemplate getIngressAdvFwdTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAdvFwdTemplate) {
            return (IngressAdvFwdTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VPortMirror", readOnly = true)
    public VPortMirror getVPortMirror() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VPortMirror) {
            return (VPortMirror) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PATNATPool", readOnly = true)
    public PATNATPool getPATNATPool() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PATNATPool) {
            return (PATNATPool) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BGPNeighbor", readOnly = true)
    public BGPNeighbor getBGPNeighbor() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BGPNeighbor) {
            return (BGPNeighbor) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ContainerResync", readOnly = true)
    public ContainerResync getContainerResync() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ContainerResync) {
            return (ContainerResync) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AllAlarm", readOnly = true)
    public AllAlarm getAllAlarm() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AllAlarm) {
            return (AllAlarm) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKEPSK", readOnly = true)
    public IKEPSK getIKEPSK() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEPSK) {
            return (IKEPSK) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SystemConfig", readOnly = true)
    public SystemConfig getSystemConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SystemConfig) {
            return (SystemConfig) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IKEEncryptionprofile", readOnly = true)
    public IKEEncryptionprofile getIKEEncryptionprofile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEEncryptionprofile) {
            return (IKEEncryptionprofile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "FloatingIPACLTemplateEntry", readOnly = true)
    public FloatingIPACLTemplateEntry getFloatingIPACLTemplateEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FloatingIPACLTemplateEntry) {
            return (FloatingIPACLTemplateEntry) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "InfrastructureConfig", readOnly = true)
    public InfrastructureConfig getInfrastructureConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof InfrastructureConfig) {
            return (InfrastructureConfig) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "User", readOnly = true)
    public User getUser() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof User) {
            return (User) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NATMapEntry", readOnly = true)
    public NATMapEntry getNATMapEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NATMapEntry) {
            return (NATMapEntry) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PolicyGroup", readOnly = true)
    public PolicyGroup getPolicyGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyGroup) {
            return (PolicyGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ExternalAppService", readOnly = true)
    public ExternalAppService getExternalAppService() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ExternalAppService) {
            return (ExternalAppService) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Alarm", readOnly = true)
    public Alarm getAlarm() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Alarm) {
            return (Alarm) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Bootstrap", readOnly = true)
    public Bootstrap getBootstrap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Bootstrap) {
            return (Bootstrap) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Flow", readOnly = true)
    public Flow getFlow() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Flow) {
            return (Flow) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VLANTemplate", readOnly = true)
    public VLANTemplate getVLANTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VLANTemplate) {
            return (VLANTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GatewaySecurity", readOnly = true)
    public GatewaySecurity getGatewaySecurity() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GatewaySecurity) {
            return (GatewaySecurity) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GlobalMetadata", readOnly = true)
    public GlobalMetadata getGlobalMetadata() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GlobalMetadata) {
            return (GlobalMetadata) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Enterprise", readOnly = true)
    public Enterprise getEnterprise() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Enterprise) {
            return (Enterprise) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Link", readOnly = true)
    public Link getLink() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Link) {
            return (Link) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressACLTemplate", readOnly = true)
    public IngressACLTemplate getIngressACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressACLTemplate) {
            return (IngressACLTemplate) obj;
        }
        
        return null;
    }
    @VsoMethod
    public java.util.List<GlobalMetadata> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<GlobalMetadata> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public GlobalMetadata getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}