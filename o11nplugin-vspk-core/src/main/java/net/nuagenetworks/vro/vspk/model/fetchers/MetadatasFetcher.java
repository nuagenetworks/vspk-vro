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

import net.nuagenetworks.vro.vspk.model.Metadata;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.AddressMap;

import net.nuagenetworks.vro.vspk.model.AddressRange;

import net.nuagenetworks.vro.vspk.model.AggregatedDomain;

import net.nuagenetworks.vro.vspk.model.Alarm;

import net.nuagenetworks.vro.vspk.model.AllAlarm;

import net.nuagenetworks.vro.vspk.model.AllGateway;

import net.nuagenetworks.vro.vspk.model.AllRedundancyGroup;

import net.nuagenetworks.vro.vspk.model.Application;

import net.nuagenetworks.vro.vspk.model.ApplicationBinding;

import net.nuagenetworks.vro.vspk.model.Applicationperformancemanagement;

import net.nuagenetworks.vro.vspk.model.Applicationperformancemanagementbinding;

import net.nuagenetworks.vro.vspk.model.AutoDiscoveredGateway;

import net.nuagenetworks.vro.vspk.model.Avatar;

import net.nuagenetworks.vro.vspk.model.AzureCloud;

import net.nuagenetworks.vro.vspk.model.BFDSession;

import net.nuagenetworks.vro.vspk.model.BGPNeighbor;

import net.nuagenetworks.vro.vspk.model.BGPPeer;

import net.nuagenetworks.vro.vspk.model.BGPProfile;

import net.nuagenetworks.vro.vspk.model.Bootstrap;

import net.nuagenetworks.vro.vspk.model.BootstrapActivation;

import net.nuagenetworks.vro.vspk.model.BRConnection;

import net.nuagenetworks.vro.vspk.model.BridgeInterface;

import net.nuagenetworks.vro.vspk.model.BulkStatistics;

import net.nuagenetworks.vro.vspk.model.Certificate;

import net.nuagenetworks.vro.vspk.model.CloudMgmtSystem;

import net.nuagenetworks.vro.vspk.model.VSDComponent;

import net.nuagenetworks.vro.vspk.model.Connectionendpoint;

import net.nuagenetworks.vro.vspk.model.Container;

import net.nuagenetworks.vro.vspk.model.ContainerInterface;

import net.nuagenetworks.vro.vspk.model.ContainerResync;

import net.nuagenetworks.vro.vspk.model.ControllerVRSLink;

import net.nuagenetworks.vro.vspk.model.COSRemarkingPolicy;

import net.nuagenetworks.vro.vspk.model.COSRemarkingPolicyTable;

import net.nuagenetworks.vro.vspk.model.CSNATPool;

import net.nuagenetworks.vro.vspk.model.CTranslationMap;

import net.nuagenetworks.vro.vspk.model.CustomProperty;

import net.nuagenetworks.vro.vspk.model.DefaultGateway;

import net.nuagenetworks.vro.vspk.model.DemarcationService;

import net.nuagenetworks.vro.vspk.model.DeploymentFailure;

import net.nuagenetworks.vro.vspk.model.Destinationurl;

import net.nuagenetworks.vro.vspk.model.DHCPOption;

import net.nuagenetworks.vro.vspk.model.DHCPv6Option;

import net.nuagenetworks.vro.vspk.model.DiskStat;

import net.nuagenetworks.vro.vspk.model.Domain;

import net.nuagenetworks.vro.vspk.model.DomainKindSummary;

import net.nuagenetworks.vro.vspk.model.DomainTemplate;

import net.nuagenetworks.vro.vspk.model.DSCPForwardingClassMapping;

import net.nuagenetworks.vro.vspk.model.DSCPForwardingClassTable;

import net.nuagenetworks.vro.vspk.model.DSCPRemarkingPolicy;

import net.nuagenetworks.vro.vspk.model.DSCPRemarkingPolicyTable;

import net.nuagenetworks.vro.vspk.model.DUCGroup;

import net.nuagenetworks.vro.vspk.model.DUCGroupBinding;

import net.nuagenetworks.vro.vspk.model.VCenterEAMConfig;

import net.nuagenetworks.vro.vspk.model.EgressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.EgressACLTemplate;

import net.nuagenetworks.vro.vspk.model.EgressAdvFwdEntryTemplate;

import net.nuagenetworks.vro.vspk.model.EgressAdvFwdTemplate;

import net.nuagenetworks.vro.vspk.model.EgressAuditACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.EgressAuditACLTemplate;

import net.nuagenetworks.vro.vspk.model.DomainFIPAclTemplateEntry;

import net.nuagenetworks.vro.vspk.model.DomainFIPAclTemplate;

import net.nuagenetworks.vro.vspk.model.EgressProfile;

import net.nuagenetworks.vro.vspk.model.EgressQOSPolicy;

import net.nuagenetworks.vro.vspk.model.Enterprise;

import net.nuagenetworks.vro.vspk.model.EnterpriseNetwork;

import net.nuagenetworks.vro.vspk.model.EnterprisePermission;

import net.nuagenetworks.vro.vspk.model.EnterpriseProfile;

import net.nuagenetworks.vro.vspk.model.EnterpriseSecuredData;

import net.nuagenetworks.vro.vspk.model.EnterpriseSecurity;

import net.nuagenetworks.vro.vspk.model.EsIlmPolicy;

import net.nuagenetworks.vro.vspk.model.EsIndexConfig;

import net.nuagenetworks.vro.vspk.model.EventLog;

import net.nuagenetworks.vro.vspk.model.FirewallAcl;

import net.nuagenetworks.vro.vspk.model.FirewallRule;

import net.nuagenetworks.vro.vspk.model.FloatingIp;

import net.nuagenetworks.vro.vspk.model.ForwardingPathList;

import net.nuagenetworks.vro.vspk.model.ForwardingPathListEntry;

import net.nuagenetworks.vro.vspk.model.Gateway;

import net.nuagenetworks.vro.vspk.model.GatewayRedundantPort;

import net.nuagenetworks.vro.vspk.model.GatewaySecuredData;

import net.nuagenetworks.vro.vspk.model.GatewaySecurity;

import net.nuagenetworks.vro.vspk.model.GatewaysLocation;

import net.nuagenetworks.vro.vspk.model.GatewayTemplate;

import net.nuagenetworks.vro.vspk.model.GlobalMetadata;

import net.nuagenetworks.vro.vspk.model.GNMIProfile;

import net.nuagenetworks.vro.vspk.model.GNMISession;

import net.nuagenetworks.vro.vspk.model.Group;

import net.nuagenetworks.vro.vspk.model.GroupKeyEncryptionProfile;

import net.nuagenetworks.vro.vspk.model.HostInterface;

import net.nuagenetworks.vro.vspk.model.HSC;

import net.nuagenetworks.vro.vspk.model.IKECertificate;

import net.nuagenetworks.vro.vspk.model.IKEEncryptionprofile;

import net.nuagenetworks.vro.vspk.model.IKEGateway;

import net.nuagenetworks.vro.vspk.model.IKEGatewayConfig;

import net.nuagenetworks.vro.vspk.model.IKEGatewayConnection;

import net.nuagenetworks.vro.vspk.model.IKEGatewayProfile;

import net.nuagenetworks.vro.vspk.model.IKEPSK;

import net.nuagenetworks.vro.vspk.model.IKESubnet;

import net.nuagenetworks.vro.vspk.model.InfrastructureConfig;

import net.nuagenetworks.vro.vspk.model.InfrastructureAccessProfile;

import net.nuagenetworks.vro.vspk.model.InfrastructureEVDFProfile;

import net.nuagenetworks.vro.vspk.model.InfrastructureGatewayProfile;

import net.nuagenetworks.vro.vspk.model.InfrastructureVscProfile;

import net.nuagenetworks.vro.vspk.model.IngressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressACLTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAuditACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAuditACLTemplate;

import net.nuagenetworks.vro.vspk.model.IngressProfile;

import net.nuagenetworks.vro.vspk.model.IngressQOSPolicy;

import net.nuagenetworks.vro.vspk.model.IPFilterProfile;

import net.nuagenetworks.vro.vspk.model.IPReservation;

import net.nuagenetworks.vro.vspk.model.IPv6FilterProfile;

import net.nuagenetworks.vro.vspk.model.Job;

import net.nuagenetworks.vro.vspk.model.KeyServerMember;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitor;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitorEncryptedSeed;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitorSeed;

import net.nuagenetworks.vro.vspk.model.KeyServerMonitorSEK;

import net.nuagenetworks.vro.vspk.model.L2Domain;

import net.nuagenetworks.vro.vspk.model.L2DomainTemplate;

import net.nuagenetworks.vro.vspk.model.L7applicationsignature;

import net.nuagenetworks.vro.vspk.model.LDAPConfiguration;

import net.nuagenetworks.vro.vspk.model.License;

import net.nuagenetworks.vro.vspk.model.LicenseStatus;

import net.nuagenetworks.vro.vspk.model.Link;

import net.nuagenetworks.vro.vspk.model.Location;

import net.nuagenetworks.vro.vspk.model.LTEInformation;

import net.nuagenetworks.vro.vspk.model.Ltestatistics;

import net.nuagenetworks.vro.vspk.model.MACFilterProfile;

import net.nuagenetworks.vro.vspk.model.Me;

import net.nuagenetworks.vro.vspk.model.MirrorDestination;

import net.nuagenetworks.vro.vspk.model.MirrorDestinationGroup;

import net.nuagenetworks.vro.vspk.model.MonitoringPort;

import net.nuagenetworks.vro.vspk.model.Monitorscope;

import net.nuagenetworks.vro.vspk.model.MultiCastChannelMap;

import net.nuagenetworks.vro.vspk.model.MultiCastList;

import net.nuagenetworks.vro.vspk.model.MultiCastRange;

import net.nuagenetworks.vro.vspk.model.MultiNICVPort;

import net.nuagenetworks.vro.vspk.model.NATMapEntry;

import net.nuagenetworks.vro.vspk.model.NetconfGateway;

import net.nuagenetworks.vro.vspk.model.NetconfManager;

import net.nuagenetworks.vro.vspk.model.NetconfProfile;

import net.nuagenetworks.vro.vspk.model.NetconfSession;

import net.nuagenetworks.vro.vspk.model.NetworkLayout;

import net.nuagenetworks.vro.vspk.model.NetworkMacroGroup;

import net.nuagenetworks.vro.vspk.model.NetworkPerformanceBinding;

import net.nuagenetworks.vro.vspk.model.NetworkPerformanceMeasurement;

import net.nuagenetworks.vro.vspk.model.NextHop;

import net.nuagenetworks.vro.vspk.model.NSGateway;

import net.nuagenetworks.vro.vspk.model.NSGatewaysCount;

import net.nuagenetworks.vro.vspk.model.NSGatewaySummary;

import net.nuagenetworks.vro.vspk.model.NSGatewayTemplate;

import net.nuagenetworks.vro.vspk.model.NSGGroup;

import net.nuagenetworks.vro.vspk.model.NSRedundantGatewayGroup;

import net.nuagenetworks.vro.vspk.model.NSGRoutingPolicyBinding;

import net.nuagenetworks.vro.vspk.model.NSPort;

import net.nuagenetworks.vro.vspk.model.NSPortTemplate;

import net.nuagenetworks.vro.vspk.model.RedundantPort;

import net.nuagenetworks.vro.vspk.model.OSPFArea;

import net.nuagenetworks.vro.vspk.model.OSPFInstance;

import net.nuagenetworks.vro.vspk.model.OSPFInterface;

import net.nuagenetworks.vro.vspk.model.OverlayAddressPool;

import net.nuagenetworks.vro.vspk.model.OverlayMirrorDestination;

import net.nuagenetworks.vro.vspk.model.OverlayMirrorDestinationTemplate;

import net.nuagenetworks.vro.vspk.model.OverlayPATNATEntry;

import net.nuagenetworks.vro.vspk.model.Patch;

import net.nuagenetworks.vro.vspk.model.PATNATPool;

import net.nuagenetworks.vro.vspk.model.Permission;

import net.nuagenetworks.vro.vspk.model.PolicyDecision;

import net.nuagenetworks.vro.vspk.model.PolicyEntry;

import net.nuagenetworks.vro.vspk.model.PolicyGroup;

import net.nuagenetworks.vro.vspk.model.PolicyGroupCategory;

import net.nuagenetworks.vro.vspk.model.PolicyGroupTemplate;

import net.nuagenetworks.vro.vspk.model.PolicyObjectGroup;

import net.nuagenetworks.vro.vspk.model.PolicyStatement;

import net.nuagenetworks.vro.vspk.model.Port;

import net.nuagenetworks.vro.vspk.model.PortTemplate;

import net.nuagenetworks.vro.vspk.model.PSNATPool;

import net.nuagenetworks.vro.vspk.model.PSPATMap;

import net.nuagenetworks.vro.vspk.model.PTranslationMap;

import net.nuagenetworks.vro.vspk.model.PublicNetworkMacro;

import net.nuagenetworks.vro.vspk.model.QOS;

import net.nuagenetworks.vro.vspk.model.QosPolicer;

import net.nuagenetworks.vro.vspk.model.RateLimiter;

import net.nuagenetworks.vro.vspk.model.RedirectionTarget;

import net.nuagenetworks.vro.vspk.model.RedirectionTargetTemplate;

import net.nuagenetworks.vro.vspk.model.RedundancyGroup;

import net.nuagenetworks.vro.vspk.model.RemoteVrsInfo;

import net.nuagenetworks.vro.vspk.model.VMResync;

import net.nuagenetworks.vro.vspk.model.RoutingPolicy;

import net.nuagenetworks.vro.vspk.model.RoutingPolicyBinding;

import net.nuagenetworks.vro.vspk.model.SaaSApplicationGroup;

import net.nuagenetworks.vro.vspk.model.SaaSApplicationType;

import net.nuagenetworks.vro.vspk.model.SAPEgressQoSProfile;

import net.nuagenetworks.vro.vspk.model.SAPIngressQoSProfile;

import net.nuagenetworks.vro.vspk.model.WANService;

import net.nuagenetworks.vro.vspk.model.SharedNetworkResource;

import net.nuagenetworks.vro.vspk.model.ShuntLink;

import net.nuagenetworks.vro.vspk.model.SiteInfo;

import net.nuagenetworks.vro.vspk.model.SPATSourcesPool;

import net.nuagenetworks.vro.vspk.model.SSHKey;

import net.nuagenetworks.vro.vspk.model.SSIDConnection;

import net.nuagenetworks.vro.vspk.model.StaticRoute;

import net.nuagenetworks.vro.vspk.model.Statistics;

import net.nuagenetworks.vro.vspk.model.StatsCollectorInfo;

import net.nuagenetworks.vro.vspk.model.StatisticsPolicy;

import net.nuagenetworks.vro.vspk.model.Subnet;

import net.nuagenetworks.vro.vspk.model.SubnetTemplate;

import net.nuagenetworks.vro.vspk.model.SystemConfig;

import net.nuagenetworks.vro.vspk.model.TCA;

import net.nuagenetworks.vro.vspk.model.Test;

import net.nuagenetworks.vro.vspk.model.TestDefinition;

import net.nuagenetworks.vro.vspk.model.TestRun;

import net.nuagenetworks.vro.vspk.model.TestSuite;

import net.nuagenetworks.vro.vspk.model.TestSuiteRun;

import net.nuagenetworks.vro.vspk.model.Tier;

import net.nuagenetworks.vro.vspk.model.Trunk;

import net.nuagenetworks.vro.vspk.model.Underlay;

import net.nuagenetworks.vro.vspk.model.UplinkConnection;

import net.nuagenetworks.vro.vspk.model.UplinkRD;

import net.nuagenetworks.vro.vspk.model.User;

import net.nuagenetworks.vro.vspk.model.UserContext;

import net.nuagenetworks.vro.vspk.model.VCenter;

import net.nuagenetworks.vro.vspk.model.VCenterCluster;

import net.nuagenetworks.vro.vspk.model.VCenterDataCenter;

import net.nuagenetworks.vro.vspk.model.VCenterHypervisor;

import net.nuagenetworks.vro.vspk.model.VirtualFirewallPolicy;

import net.nuagenetworks.vro.vspk.model.VirtualFirewallRule;

import net.nuagenetworks.vro.vspk.model.VirtualIP;

import net.nuagenetworks.vro.vspk.model.VLAN;

import net.nuagenetworks.vro.vspk.model.VLANTemplate;

import net.nuagenetworks.vro.vspk.model.VM;

import net.nuagenetworks.vro.vspk.model.VMInterface;

import net.nuagenetworks.vro.vspk.model.VMIPReservation;

import net.nuagenetworks.vro.vspk.model.VNF;

import net.nuagenetworks.vro.vspk.model.VNFCatalog;

import net.nuagenetworks.vro.vspk.model.VNFDescriptor;

import net.nuagenetworks.vro.vspk.model.VNFDomainMapping;

import net.nuagenetworks.vro.vspk.model.VNFInterface;

import net.nuagenetworks.vro.vspk.model.VNFInterfaceDescriptor;

import net.nuagenetworks.vro.vspk.model.VNFMetadata;

import net.nuagenetworks.vro.vspk.model.VNFThresholdPolicy;

import net.nuagenetworks.vro.vspk.model.VPNConnection;

import net.nuagenetworks.vro.vspk.model.VPort;

import net.nuagenetworks.vro.vspk.model.VPortMirror;

import net.nuagenetworks.vro.vspk.model.VRS;

import net.nuagenetworks.vro.vspk.model.VRSAddressRange;

import net.nuagenetworks.vro.vspk.model.VCenterVRSConfig;

import net.nuagenetworks.vro.vspk.model.vrsInfo;

import net.nuagenetworks.vro.vspk.model.VSC;

import net.nuagenetworks.vro.vspk.model.VSD;

import net.nuagenetworks.vro.vspk.model.VsgRedundantPort;

import net.nuagenetworks.vro.vspk.model.VSP;

import net.nuagenetworks.vro.vspk.model.WebCategory;

import net.nuagenetworks.vro.vspk.model.WebDomainName;

import net.nuagenetworks.vro.vspk.model.WirelessPort;

import net.nuagenetworks.vro.vspk.model.ZFBRequest;

import net.nuagenetworks.vro.vspk.model.Zone;

import net.nuagenetworks.vro.vspk.model.ZoneTemplate;
import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.RestObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.METADATAS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS, type = Constants.METADATA) })
@VsoObject(create = false, strict = true)
public class MetadatasFetcher extends BaseFetcher<Metadata> {
    private static final long serialVersionUID = 1L;

    public MetadatasFetcher(RestObject parentRestObj) {
        super(parentRestObj, Metadata.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "Metadatas";
    }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "AddressMap", readOnly = true)
    public AddressMap getAddressMap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AddressMap) {
            return (AddressMap) obj;
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
    
    @VsoProperty(displayName = "AggregatedDomain", readOnly = true)
    public AggregatedDomain getAggregatedDomain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AggregatedDomain) {
            return (AggregatedDomain) obj;
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
    
    @VsoProperty(displayName = "AllAlarm", readOnly = true)
    public AllAlarm getAllAlarm() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AllAlarm) {
            return (AllAlarm) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AllGateway", readOnly = true)
    public AllGateway getAllGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AllGateway) {
            return (AllGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AllRedundancyGroup", readOnly = true)
    public AllRedundancyGroup getAllRedundancyGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AllRedundancyGroup) {
            return (AllRedundancyGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Application", readOnly = true)
    public Application getApplication() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Application) {
            return (Application) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ApplicationBinding", readOnly = true)
    public ApplicationBinding getApplicationBinding() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ApplicationBinding) {
            return (ApplicationBinding) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Applicationperformancemanagement", readOnly = true)
    public Applicationperformancemanagement getApplicationperformancemanagement() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Applicationperformancemanagement) {
            return (Applicationperformancemanagement) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Applicationperformancemanagementbinding", readOnly = true)
    public Applicationperformancemanagementbinding getApplicationperformancemanagementbinding() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Applicationperformancemanagementbinding) {
            return (Applicationperformancemanagementbinding) obj;
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
    
    @VsoProperty(displayName = "Avatar", readOnly = true)
    public Avatar getAvatar() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Avatar) {
            return (Avatar) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "AzureCloud", readOnly = true)
    public AzureCloud getAzureCloud() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AzureCloud) {
            return (AzureCloud) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "BFDSession", readOnly = true)
    public BFDSession getBFDSession() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BFDSession) {
            return (BFDSession) obj;
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
    
    @VsoProperty(displayName = "BGPPeer", readOnly = true)
    public BGPPeer getBGPPeer() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BGPPeer) {
            return (BGPPeer) obj;
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
    
    @VsoProperty(displayName = "Bootstrap", readOnly = true)
    public Bootstrap getBootstrap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Bootstrap) {
            return (Bootstrap) obj;
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
    
    @VsoProperty(displayName = "BRConnection", readOnly = true)
    public BRConnection getBRConnection() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BRConnection) {
            return (BRConnection) obj;
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
    
    @VsoProperty(displayName = "BulkStatistics", readOnly = true)
    public BulkStatistics getBulkStatistics() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof BulkStatistics) {
            return (BulkStatistics) obj;
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
    
    @VsoProperty(displayName = "CloudMgmtSystem", readOnly = true)
    public CloudMgmtSystem getCloudMgmtSystem() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof CloudMgmtSystem) {
            return (CloudMgmtSystem) obj;
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
    
    @VsoProperty(displayName = "Connectionendpoint", readOnly = true)
    public Connectionendpoint getConnectionendpoint() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Connectionendpoint) {
            return (Connectionendpoint) obj;
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
    
    @VsoProperty(displayName = "ContainerInterface", readOnly = true)
    public ContainerInterface getContainerInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ContainerInterface) {
            return (ContainerInterface) obj;
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
    
    @VsoProperty(displayName = "ControllerVRSLink", readOnly = true)
    public ControllerVRSLink getControllerVRSLink() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ControllerVRSLink) {
            return (ControllerVRSLink) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "COSRemarkingPolicy", readOnly = true)
    public COSRemarkingPolicy getCOSRemarkingPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof COSRemarkingPolicy) {
            return (COSRemarkingPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "COSRemarkingPolicyTable", readOnly = true)
    public COSRemarkingPolicyTable getCOSRemarkingPolicyTable() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof COSRemarkingPolicyTable) {
            return (COSRemarkingPolicyTable) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "CSNATPool", readOnly = true)
    public CSNATPool getCSNATPool() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof CSNATPool) {
            return (CSNATPool) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "CTranslationMap", readOnly = true)
    public CTranslationMap getCTranslationMap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof CTranslationMap) {
            return (CTranslationMap) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "CustomProperty", readOnly = true)
    public CustomProperty getCustomProperty() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof CustomProperty) {
            return (CustomProperty) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DefaultGateway", readOnly = true)
    public DefaultGateway getDefaultGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DefaultGateway) {
            return (DefaultGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DemarcationService", readOnly = true)
    public DemarcationService getDemarcationService() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DemarcationService) {
            return (DemarcationService) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DeploymentFailure", readOnly = true)
    public DeploymentFailure getDeploymentFailure() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DeploymentFailure) {
            return (DeploymentFailure) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Destinationurl", readOnly = true)
    public Destinationurl getDestinationurl() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Destinationurl) {
            return (Destinationurl) obj;
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
    
    @VsoProperty(displayName = "DHCPv6Option", readOnly = true)
    public DHCPv6Option getDHCPv6Option() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DHCPv6Option) {
            return (DHCPv6Option) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DiskStat", readOnly = true)
    public DiskStat getDiskStat() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DiskStat) {
            return (DiskStat) obj;
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
    
    @VsoProperty(displayName = "DomainKindSummary", readOnly = true)
    public DomainKindSummary getDomainKindSummary() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DomainKindSummary) {
            return (DomainKindSummary) obj;
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
    
    @VsoProperty(displayName = "DSCPForwardingClassMapping", readOnly = true)
    public DSCPForwardingClassMapping getDSCPForwardingClassMapping() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DSCPForwardingClassMapping) {
            return (DSCPForwardingClassMapping) obj;
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
    
    @VsoProperty(displayName = "DSCPRemarkingPolicy", readOnly = true)
    public DSCPRemarkingPolicy getDSCPRemarkingPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DSCPRemarkingPolicy) {
            return (DSCPRemarkingPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DSCPRemarkingPolicyTable", readOnly = true)
    public DSCPRemarkingPolicyTable getDSCPRemarkingPolicyTable() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DSCPRemarkingPolicyTable) {
            return (DSCPRemarkingPolicyTable) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DUCGroup", readOnly = true)
    public DUCGroup getDUCGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DUCGroup) {
            return (DUCGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "DUCGroupBinding", readOnly = true)
    public DUCGroupBinding getDUCGroupBinding() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DUCGroupBinding) {
            return (DUCGroupBinding) obj;
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
    
    @VsoProperty(displayName = "EgressACLEntryTemplate", readOnly = true)
    public EgressACLEntryTemplate getEgressACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressACLEntryTemplate) {
            return (EgressACLEntryTemplate) obj;
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
    
    @VsoProperty(displayName = "EgressAdvFwdEntryTemplate", readOnly = true)
    public EgressAdvFwdEntryTemplate getEgressAdvFwdEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressAdvFwdEntryTemplate) {
            return (EgressAdvFwdEntryTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressAdvFwdTemplate", readOnly = true)
    public EgressAdvFwdTemplate getEgressAdvFwdTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressAdvFwdTemplate) {
            return (EgressAdvFwdTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressAuditACLEntryTemplate", readOnly = true)
    public EgressAuditACLEntryTemplate getEgressAuditACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressAuditACLEntryTemplate) {
            return (EgressAuditACLEntryTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressAuditACLTemplate", readOnly = true)
    public EgressAuditACLTemplate getEgressAuditACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressAuditACLTemplate) {
            return (EgressAuditACLTemplate) obj;
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
    
    @VsoProperty(displayName = "DomainFIPAclTemplate", readOnly = true)
    public DomainFIPAclTemplate getDomainFIPAclTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DomainFIPAclTemplate) {
            return (DomainFIPAclTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EgressProfile", readOnly = true)
    public EgressProfile getEgressProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressProfile) {
            return (EgressProfile) obj;
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
    
    @VsoProperty(displayName = "Enterprise", readOnly = true)
    public Enterprise getEnterprise() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Enterprise) {
            return (Enterprise) obj;
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
    
    @VsoProperty(displayName = "EnterprisePermission", readOnly = true)
    public EnterprisePermission getEnterprisePermission() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterprisePermission) {
            return (EnterprisePermission) obj;
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
    
    @VsoProperty(displayName = "EnterpriseSecuredData", readOnly = true)
    public EnterpriseSecuredData getEnterpriseSecuredData() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterpriseSecuredData) {
            return (EnterpriseSecuredData) obj;
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
    
    @VsoProperty(displayName = "EsIlmPolicy", readOnly = true)
    public EsIlmPolicy getEsIlmPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EsIlmPolicy) {
            return (EsIlmPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "EsIndexConfig", readOnly = true)
    public EsIndexConfig getEsIndexConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EsIndexConfig) {
            return (EsIndexConfig) obj;
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
    
    @VsoProperty(displayName = "FirewallAcl", readOnly = true)
    public FirewallAcl getFirewallAcl() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FirewallAcl) {
            return (FirewallAcl) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "FirewallRule", readOnly = true)
    public FirewallRule getFirewallRule() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof FirewallRule) {
            return (FirewallRule) obj;
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
    
    @VsoProperty(displayName = "ForwardingPathList", readOnly = true)
    public ForwardingPathList getForwardingPathList() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ForwardingPathList) {
            return (ForwardingPathList) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ForwardingPathListEntry", readOnly = true)
    public ForwardingPathListEntry getForwardingPathListEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ForwardingPathListEntry) {
            return (ForwardingPathListEntry) obj;
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
    
    @VsoProperty(displayName = "GatewayRedundantPort", readOnly = true)
    public GatewayRedundantPort getGatewayRedundantPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GatewayRedundantPort) {
            return (GatewayRedundantPort) obj;
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
    
    @VsoProperty(displayName = "GatewaySecurity", readOnly = true)
    public GatewaySecurity getGatewaySecurity() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GatewaySecurity) {
            return (GatewaySecurity) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GatewaysLocation", readOnly = true)
    public GatewaysLocation getGatewaysLocation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GatewaysLocation) {
            return (GatewaysLocation) obj;
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
    
    @VsoProperty(displayName = "GlobalMetadata", readOnly = true)
    public GlobalMetadata getGlobalMetadata() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GlobalMetadata) {
            return (GlobalMetadata) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GNMIProfile", readOnly = true)
    public GNMIProfile getGNMIProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GNMIProfile) {
            return (GNMIProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "GNMISession", readOnly = true)
    public GNMISession getGNMISession() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GNMISession) {
            return (GNMISession) obj;
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
    
    @VsoProperty(displayName = "GroupKeyEncryptionProfile", readOnly = true)
    public GroupKeyEncryptionProfile getGroupKeyEncryptionProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof GroupKeyEncryptionProfile) {
            return (GroupKeyEncryptionProfile) obj;
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
    
    @VsoProperty(displayName = "HSC", readOnly = true)
    public HSC getHSC() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof HSC) {
            return (HSC) obj;
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
    
    @VsoProperty(displayName = "IKEEncryptionprofile", readOnly = true)
    public IKEEncryptionprofile getIKEEncryptionprofile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEEncryptionprofile) {
            return (IKEEncryptionprofile) obj;
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
    
    @VsoProperty(displayName = "IKEGatewayConfig", readOnly = true)
    public IKEGatewayConfig getIKEGatewayConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEGatewayConfig) {
            return (IKEGatewayConfig) obj;
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
    
    @VsoProperty(displayName = "IKEGatewayProfile", readOnly = true)
    public IKEGatewayProfile getIKEGatewayProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKEGatewayProfile) {
            return (IKEGatewayProfile) obj;
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
    
    @VsoProperty(displayName = "IKESubnet", readOnly = true)
    public IKESubnet getIKESubnet() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IKESubnet) {
            return (IKESubnet) obj;
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
    
    @VsoProperty(displayName = "InfrastructureAccessProfile", readOnly = true)
    public InfrastructureAccessProfile getInfrastructureAccessProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof InfrastructureAccessProfile) {
            return (InfrastructureAccessProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "InfrastructureEVDFProfile", readOnly = true)
    public InfrastructureEVDFProfile getInfrastructureEVDFProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof InfrastructureEVDFProfile) {
            return (InfrastructureEVDFProfile) obj;
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
    
    @VsoProperty(displayName = "InfrastructureVscProfile", readOnly = true)
    public InfrastructureVscProfile getInfrastructureVscProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof InfrastructureVscProfile) {
            return (InfrastructureVscProfile) obj;
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
    
    @VsoProperty(displayName = "IngressACLTemplate", readOnly = true)
    public IngressACLTemplate getIngressACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressACLTemplate) {
            return (IngressACLTemplate) obj;
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
    
    @VsoProperty(displayName = "IngressAdvFwdTemplate", readOnly = true)
    public IngressAdvFwdTemplate getIngressAdvFwdTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAdvFwdTemplate) {
            return (IngressAdvFwdTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressAuditACLEntryTemplate", readOnly = true)
    public IngressAuditACLEntryTemplate getIngressAuditACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAuditACLEntryTemplate) {
            return (IngressAuditACLEntryTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressAuditACLTemplate", readOnly = true)
    public IngressAuditACLTemplate getIngressAuditACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAuditACLTemplate) {
            return (IngressAuditACLTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressProfile", readOnly = true)
    public IngressProfile getIngressProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressProfile) {
            return (IngressProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IngressQOSPolicy", readOnly = true)
    public IngressQOSPolicy getIngressQOSPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressQOSPolicy) {
            return (IngressQOSPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "IPFilterProfile", readOnly = true)
    public IPFilterProfile getIPFilterProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IPFilterProfile) {
            return (IPFilterProfile) obj;
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
    
    @VsoProperty(displayName = "IPv6FilterProfile", readOnly = true)
    public IPv6FilterProfile getIPv6FilterProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IPv6FilterProfile) {
            return (IPv6FilterProfile) obj;
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
    
    @VsoProperty(displayName = "KeyServerMember", readOnly = true)
    public KeyServerMember getKeyServerMember() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMember) {
            return (KeyServerMember) obj;
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
    
    @VsoProperty(displayName = "KeyServerMonitorEncryptedSeed", readOnly = true)
    public KeyServerMonitorEncryptedSeed getKeyServerMonitorEncryptedSeed() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMonitorEncryptedSeed) {
            return (KeyServerMonitorEncryptedSeed) obj;
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
    
    @VsoProperty(displayName = "KeyServerMonitorSEK", readOnly = true)
    public KeyServerMonitorSEK getKeyServerMonitorSEK() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof KeyServerMonitorSEK) {
            return (KeyServerMonitorSEK) obj;
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
    
    @VsoProperty(displayName = "L2DomainTemplate", readOnly = true)
    public L2DomainTemplate getL2DomainTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L2DomainTemplate) {
            return (L2DomainTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "L7applicationsignature", readOnly = true)
    public L7applicationsignature getL7applicationsignature() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L7applicationsignature) {
            return (L7applicationsignature) obj;
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
    
    @VsoProperty(displayName = "License", readOnly = true)
    public License getLicense() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof License) {
            return (License) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "LicenseStatus", readOnly = true)
    public LicenseStatus getLicenseStatus() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof LicenseStatus) {
            return (LicenseStatus) obj;
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
    
    @VsoProperty(displayName = "Location", readOnly = true)
    public Location getLocation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Location) {
            return (Location) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "LTEInformation", readOnly = true)
    public LTEInformation getLTEInformation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof LTEInformation) {
            return (LTEInformation) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Ltestatistics", readOnly = true)
    public Ltestatistics getLtestatistics() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Ltestatistics) {
            return (Ltestatistics) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MACFilterProfile", readOnly = true)
    public MACFilterProfile getMACFilterProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MACFilterProfile) {
            return (MACFilterProfile) obj;
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
    
    @VsoProperty(displayName = "MirrorDestination", readOnly = true)
    public MirrorDestination getMirrorDestination() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MirrorDestination) {
            return (MirrorDestination) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "MirrorDestinationGroup", readOnly = true)
    public MirrorDestinationGroup getMirrorDestinationGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MirrorDestinationGroup) {
            return (MirrorDestinationGroup) obj;
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
    
    @VsoProperty(displayName = "Monitorscope", readOnly = true)
    public Monitorscope getMonitorscope() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Monitorscope) {
            return (Monitorscope) obj;
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
    
    @VsoProperty(displayName = "MultiCastList", readOnly = true)
    public MultiCastList getMultiCastList() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiCastList) {
            return (MultiCastList) obj;
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
    
    @VsoProperty(displayName = "MultiNICVPort", readOnly = true)
    public MultiNICVPort getMultiNICVPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiNICVPort) {
            return (MultiNICVPort) obj;
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
    
    @VsoProperty(displayName = "NetconfGateway", readOnly = true)
    public NetconfGateway getNetconfGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetconfGateway) {
            return (NetconfGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetconfManager", readOnly = true)
    public NetconfManager getNetconfManager() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetconfManager) {
            return (NetconfManager) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetconfProfile", readOnly = true)
    public NetconfProfile getNetconfProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetconfProfile) {
            return (NetconfProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetconfSession", readOnly = true)
    public NetconfSession getNetconfSession() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetconfSession) {
            return (NetconfSession) obj;
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
    
    @VsoProperty(displayName = "NetworkMacroGroup", readOnly = true)
    public NetworkMacroGroup getNetworkMacroGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetworkMacroGroup) {
            return (NetworkMacroGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetworkPerformanceBinding", readOnly = true)
    public NetworkPerformanceBinding getNetworkPerformanceBinding() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetworkPerformanceBinding) {
            return (NetworkPerformanceBinding) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NetworkPerformanceMeasurement", readOnly = true)
    public NetworkPerformanceMeasurement getNetworkPerformanceMeasurement() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NetworkPerformanceMeasurement) {
            return (NetworkPerformanceMeasurement) obj;
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
    
    @VsoProperty(displayName = "NSGateway", readOnly = true)
    public NSGateway getNSGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGateway) {
            return (NSGateway) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSGatewaysCount", readOnly = true)
    public NSGatewaysCount getNSGatewaysCount() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGatewaysCount) {
            return (NSGatewaysCount) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "NSGatewaySummary", readOnly = true)
    public NSGatewaySummary getNSGatewaySummary() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGatewaySummary) {
            return (NSGatewaySummary) obj;
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
    
    @VsoProperty(displayName = "NSGGroup", readOnly = true)
    public NSGGroup getNSGGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGGroup) {
            return (NSGGroup) obj;
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
    
    @VsoProperty(displayName = "NSGRoutingPolicyBinding", readOnly = true)
    public NSGRoutingPolicyBinding getNSGRoutingPolicyBinding() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGRoutingPolicyBinding) {
            return (NSGRoutingPolicyBinding) obj;
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
    
    @VsoProperty(displayName = "NSPortTemplate", readOnly = true)
    public NSPortTemplate getNSPortTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSPortTemplate) {
            return (NSPortTemplate) obj;
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
    
    @VsoProperty(displayName = "OSPFArea", readOnly = true)
    public OSPFArea getOSPFArea() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OSPFArea) {
            return (OSPFArea) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "OSPFInstance", readOnly = true)
    public OSPFInstance getOSPFInstance() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OSPFInstance) {
            return (OSPFInstance) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "OSPFInterface", readOnly = true)
    public OSPFInterface getOSPFInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OSPFInterface) {
            return (OSPFInterface) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "OverlayAddressPool", readOnly = true)
    public OverlayAddressPool getOverlayAddressPool() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OverlayAddressPool) {
            return (OverlayAddressPool) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "OverlayMirrorDestination", readOnly = true)
    public OverlayMirrorDestination getOverlayMirrorDestination() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OverlayMirrorDestination) {
            return (OverlayMirrorDestination) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "OverlayMirrorDestinationTemplate", readOnly = true)
    public OverlayMirrorDestinationTemplate getOverlayMirrorDestinationTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OverlayMirrorDestinationTemplate) {
            return (OverlayMirrorDestinationTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "OverlayPATNATEntry", readOnly = true)
    public OverlayPATNATEntry getOverlayPATNATEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof OverlayPATNATEntry) {
            return (OverlayPATNATEntry) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Patch", readOnly = true)
    public Patch getPatch() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Patch) {
            return (Patch) obj;
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
    
    @VsoProperty(displayName = "Permission", readOnly = true)
    public Permission getPermission() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Permission) {
            return (Permission) obj;
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
    
    @VsoProperty(displayName = "PolicyEntry", readOnly = true)
    public PolicyEntry getPolicyEntry() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyEntry) {
            return (PolicyEntry) obj;
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
    
    @VsoProperty(displayName = "PolicyGroupCategory", readOnly = true)
    public PolicyGroupCategory getPolicyGroupCategory() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyGroupCategory) {
            return (PolicyGroupCategory) obj;
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
    
    @VsoProperty(displayName = "PolicyObjectGroup", readOnly = true)
    public PolicyObjectGroup getPolicyObjectGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyObjectGroup) {
            return (PolicyObjectGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PolicyStatement", readOnly = true)
    public PolicyStatement getPolicyStatement() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyStatement) {
            return (PolicyStatement) obj;
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
    
    @VsoProperty(displayName = "PortTemplate", readOnly = true)
    public PortTemplate getPortTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PortTemplate) {
            return (PortTemplate) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PSNATPool", readOnly = true)
    public PSNATPool getPSNATPool() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PSNATPool) {
            return (PSNATPool) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PSPATMap", readOnly = true)
    public PSPATMap getPSPATMap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PSPATMap) {
            return (PSPATMap) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "PTranslationMap", readOnly = true)
    public PTranslationMap getPTranslationMap() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PTranslationMap) {
            return (PTranslationMap) obj;
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
    
    @VsoProperty(displayName = "QOS", readOnly = true)
    public QOS getQOS() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof QOS) {
            return (QOS) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "QosPolicer", readOnly = true)
    public QosPolicer getQosPolicer() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof QosPolicer) {
            return (QosPolicer) obj;
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
    
    @VsoProperty(displayName = "RedirectionTarget", readOnly = true)
    public RedirectionTarget getRedirectionTarget() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedirectionTarget) {
            return (RedirectionTarget) obj;
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
    
    @VsoProperty(displayName = "RedundancyGroup", readOnly = true)
    public RedundancyGroup getRedundancyGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedundancyGroup) {
            return (RedundancyGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RemoteVrsInfo", readOnly = true)
    public RemoteVrsInfo getRemoteVrsInfo() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RemoteVrsInfo) {
            return (RemoteVrsInfo) obj;
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
    
    @VsoProperty(displayName = "RoutingPolicy", readOnly = true)
    public RoutingPolicy getRoutingPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RoutingPolicy) {
            return (RoutingPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "RoutingPolicyBinding", readOnly = true)
    public RoutingPolicyBinding getRoutingPolicyBinding() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RoutingPolicyBinding) {
            return (RoutingPolicyBinding) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SaaSApplicationGroup", readOnly = true)
    public SaaSApplicationGroup getSaaSApplicationGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SaaSApplicationGroup) {
            return (SaaSApplicationGroup) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SaaSApplicationType", readOnly = true)
    public SaaSApplicationType getSaaSApplicationType() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SaaSApplicationType) {
            return (SaaSApplicationType) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SAPEgressQoSProfile", readOnly = true)
    public SAPEgressQoSProfile getSAPEgressQoSProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SAPEgressQoSProfile) {
            return (SAPEgressQoSProfile) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SAPIngressQoSProfile", readOnly = true)
    public SAPIngressQoSProfile getSAPIngressQoSProfile() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SAPIngressQoSProfile) {
            return (SAPIngressQoSProfile) obj;
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
    
    @VsoProperty(displayName = "SharedNetworkResource", readOnly = true)
    public SharedNetworkResource getSharedNetworkResource() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SharedNetworkResource) {
            return (SharedNetworkResource) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "ShuntLink", readOnly = true)
    public ShuntLink getShuntLink() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ShuntLink) {
            return (ShuntLink) obj;
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
    
    @VsoProperty(displayName = "SPATSourcesPool", readOnly = true)
    public SPATSourcesPool getSPATSourcesPool() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SPATSourcesPool) {
            return (SPATSourcesPool) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SSHKey", readOnly = true)
    public SSHKey getSSHKey() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SSHKey) {
            return (SSHKey) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "SSIDConnection", readOnly = true)
    public SSIDConnection getSSIDConnection() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SSIDConnection) {
            return (SSIDConnection) obj;
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
    
    @VsoProperty(displayName = "Statistics", readOnly = true)
    public Statistics getStatistics() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Statistics) {
            return (Statistics) obj;
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
    
    @VsoProperty(displayName = "SubnetTemplate", readOnly = true)
    public SubnetTemplate getSubnetTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof SubnetTemplate) {
            return (SubnetTemplate) obj;
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
    
    @VsoProperty(displayName = "TCA", readOnly = true)
    public TCA getTCA() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof TCA) {
            return (TCA) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Test", readOnly = true)
    public Test getTest() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Test) {
            return (Test) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "TestDefinition", readOnly = true)
    public TestDefinition getTestDefinition() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof TestDefinition) {
            return (TestDefinition) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "TestRun", readOnly = true)
    public TestRun getTestRun() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof TestRun) {
            return (TestRun) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "TestSuite", readOnly = true)
    public TestSuite getTestSuite() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof TestSuite) {
            return (TestSuite) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "TestSuiteRun", readOnly = true)
    public TestSuiteRun getTestSuiteRun() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof TestSuiteRun) {
            return (TestSuiteRun) obj;
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
    
    @VsoProperty(displayName = "Trunk", readOnly = true)
    public Trunk getTrunk() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Trunk) {
            return (Trunk) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Underlay", readOnly = true)
    public Underlay getUnderlay() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Underlay) {
            return (Underlay) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "UplinkConnection", readOnly = true)
    public UplinkConnection getUplinkConnection() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof UplinkConnection) {
            return (UplinkConnection) obj;
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
    
    @VsoProperty(displayName = "User", readOnly = true)
    public User getUser() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof User) {
            return (User) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "UserContext", readOnly = true)
    public UserContext getUserContext() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof UserContext) {
            return (UserContext) obj;
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
    
    @VsoProperty(displayName = "VCenterCluster", readOnly = true)
    public VCenterCluster getVCenterCluster() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterCluster) {
            return (VCenterCluster) obj;
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
    
    @VsoProperty(displayName = "VCenterHypervisor", readOnly = true)
    public VCenterHypervisor getVCenterHypervisor() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterHypervisor) {
            return (VCenterHypervisor) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VirtualFirewallPolicy", readOnly = true)
    public VirtualFirewallPolicy getVirtualFirewallPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VirtualFirewallPolicy) {
            return (VirtualFirewallPolicy) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VirtualFirewallRule", readOnly = true)
    public VirtualFirewallRule getVirtualFirewallRule() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VirtualFirewallRule) {
            return (VirtualFirewallRule) obj;
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
    
    @VsoProperty(displayName = "VLAN", readOnly = true)
    public VLAN getVLAN() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VLAN) {
            return (VLAN) obj;
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
    
    @VsoProperty(displayName = "VM", readOnly = true)
    public VM getVM() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VM) {
            return (VM) obj;
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
    
    @VsoProperty(displayName = "VMIPReservation", readOnly = true)
    public VMIPReservation getVMIPReservation() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VMIPReservation) {
            return (VMIPReservation) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNF", readOnly = true)
    public VNF getVNF() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNF) {
            return (VNF) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFCatalog", readOnly = true)
    public VNFCatalog getVNFCatalog() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFCatalog) {
            return (VNFCatalog) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFDescriptor", readOnly = true)
    public VNFDescriptor getVNFDescriptor() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFDescriptor) {
            return (VNFDescriptor) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFDomainMapping", readOnly = true)
    public VNFDomainMapping getVNFDomainMapping() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFDomainMapping) {
            return (VNFDomainMapping) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFInterface", readOnly = true)
    public VNFInterface getVNFInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFInterface) {
            return (VNFInterface) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFInterfaceDescriptor", readOnly = true)
    public VNFInterfaceDescriptor getVNFInterfaceDescriptor() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFInterfaceDescriptor) {
            return (VNFInterfaceDescriptor) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFMetadata", readOnly = true)
    public VNFMetadata getVNFMetadata() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFMetadata) {
            return (VNFMetadata) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "VNFThresholdPolicy", readOnly = true)
    public VNFThresholdPolicy getVNFThresholdPolicy() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VNFThresholdPolicy) {
            return (VNFThresholdPolicy) obj;
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
    
    @VsoProperty(displayName = "VPort", readOnly = true)
    public VPort getVPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VPort) {
            return (VPort) obj;
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
    
    @VsoProperty(displayName = "VRS", readOnly = true)
    public VRS getVRS() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VRS) {
            return (VRS) obj;
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
    
    @VsoProperty(displayName = "VCenterVRSConfig", readOnly = true)
    public VCenterVRSConfig getVCenterVRSConfig() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterVRSConfig) {
            return (VCenterVRSConfig) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "vrsInfo", readOnly = true)
    public vrsInfo getvrsInfo() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof vrsInfo) {
            return (vrsInfo) obj;
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
    
    @VsoProperty(displayName = "VSD", readOnly = true)
    public VSD getVSD() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VSD) {
            return (VSD) obj;
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
    
    @VsoProperty(displayName = "VSP", readOnly = true)
    public VSP getVSP() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VSP) {
            return (VSP) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "WebCategory", readOnly = true)
    public WebCategory getWebCategory() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof WebCategory) {
            return (WebCategory) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "WebDomainName", readOnly = true)
    public WebDomainName getWebDomainName() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof WebDomainName) {
            return (WebDomainName) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "WirelessPort", readOnly = true)
    public WirelessPort getWirelessPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof WirelessPort) {
            return (WirelessPort) obj;
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
    
    @VsoProperty(displayName = "Zone", readOnly = true)
    public Zone getZone() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Zone) {
            return (Zone) obj;
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
    @VsoMethod
    public java.util.List<Metadata> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<Metadata> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public Metadata getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}