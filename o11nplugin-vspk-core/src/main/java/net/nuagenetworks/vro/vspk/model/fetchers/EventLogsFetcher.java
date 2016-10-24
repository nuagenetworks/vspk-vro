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

import net.nuagenetworks.vro.vspk.model.EventLog;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.ContainerInterface;

import net.nuagenetworks.vro.vspk.model.QOS;

import net.nuagenetworks.vro.vspk.model.VirtualIP;

import net.nuagenetworks.vro.vspk.model.MultiCastChannelMap;

import net.nuagenetworks.vro.vspk.model.RedundancyGroup;

import net.nuagenetworks.vro.vspk.model.TCA;

import net.nuagenetworks.vro.vspk.model.Group;

import net.nuagenetworks.vro.vspk.model.Zone;

import net.nuagenetworks.vro.vspk.model.PolicyGroupTemplate;

import net.nuagenetworks.vro.vspk.model.FlowSecurityPolicy;

import net.nuagenetworks.vro.vspk.model.EnterpriseNetwork;

import net.nuagenetworks.vro.vspk.model.Permission;

import net.nuagenetworks.vro.vspk.model.IPReservation;

import net.nuagenetworks.vro.vspk.model.RedirectionTargetTemplate;

import net.nuagenetworks.vro.vspk.model.SubnetTemplate;

import net.nuagenetworks.vro.vspk.model.MetadataTag;

import net.nuagenetworks.vro.vspk.model.RedirectionTarget;

import net.nuagenetworks.vro.vspk.model.Metadata;

import net.nuagenetworks.vro.vspk.model.VSP;

import net.nuagenetworks.vro.vspk.model.Domain;

import net.nuagenetworks.vro.vspk.model.WANService;

import net.nuagenetworks.vro.vspk.model.VSD;

import net.nuagenetworks.vro.vspk.model.VPort;

import net.nuagenetworks.vro.vspk.model.FlowForwardingPolicy;

import net.nuagenetworks.vro.vspk.model.Port;

import net.nuagenetworks.vro.vspk.model.Subnet;

import net.nuagenetworks.vro.vspk.model.Container;

import net.nuagenetworks.vro.vspk.model.ZoneTemplate;

import net.nuagenetworks.vro.vspk.model.VRS;

import net.nuagenetworks.vro.vspk.model.HSC;

import net.nuagenetworks.vro.vspk.model.VLAN;

import net.nuagenetworks.vro.vspk.model.StaticRoute;

import net.nuagenetworks.vro.vspk.model.VMInterface;

import net.nuagenetworks.vro.vspk.model.License;

import net.nuagenetworks.vro.vspk.model.EnterpriseProfile;

import net.nuagenetworks.vro.vspk.model.BridgeInterface;

import net.nuagenetworks.vro.vspk.model.MultiCastRange;

import net.nuagenetworks.vro.vspk.model.AutoDiscoveredGateway;

import net.nuagenetworks.vro.vspk.model.Tier;

import net.nuagenetworks.vro.vspk.model.Gateway;

import net.nuagenetworks.vro.vspk.model.L2DomainTemplate;

import net.nuagenetworks.vro.vspk.model.ApplicationService;

import net.nuagenetworks.vro.vspk.model.L2Domain;

import net.nuagenetworks.vro.vspk.model.HostInterface;

import net.nuagenetworks.vro.vspk.model.EndPoint;

import net.nuagenetworks.vro.vspk.model.DHCPOption;

import net.nuagenetworks.vro.vspk.model.NSGateway;

import net.nuagenetworks.vro.vspk.model.VSC;

import net.nuagenetworks.vro.vspk.model.VM;

import net.nuagenetworks.vro.vspk.model.NSPort;

import net.nuagenetworks.vro.vspk.model.PublicNetworkMacro;

import net.nuagenetworks.vro.vspk.model.AddressRange;

import net.nuagenetworks.vro.vspk.model.DomainTemplate;

import net.nuagenetworks.vro.vspk.model.FloatingIp;

import net.nuagenetworks.vro.vspk.model.EgressACLTemplate;

import net.nuagenetworks.vro.vspk.model.NSRedundantGatewayGroup;

import net.nuagenetworks.vro.vspk.model.ExternalService;

import net.nuagenetworks.vro.vspk.model.User;

import net.nuagenetworks.vro.vspk.model.PolicyGroup;

import net.nuagenetworks.vro.vspk.model.Flow;

import net.nuagenetworks.vro.vspk.model.Enterprise;

import net.nuagenetworks.vro.vspk.model.IngressACLTemplate;
import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.RestObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.EVENTLOGS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.EVENTLOGS, type = Constants.EVENTLOG) })
@VsoObject(create = false, strict = true)
public class EventLogsFetcher extends BaseFetcher<EventLog> {
    private static final long serialVersionUID = 1L;

    public EventLogsFetcher(RestObject parentRestObj) {
        super(parentRestObj, EventLog.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "EventLogs";
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
    
    @VsoProperty(displayName = "QOS", readOnly = true)
    public QOS getQOS() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof QOS) {
            return (QOS) obj;
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
    
    @VsoProperty(displayName = "Zone", readOnly = true)
    public Zone getZone() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Zone) {
            return (Zone) obj;
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
    
    @VsoProperty(displayName = "EnterpriseNetwork", readOnly = true)
    public EnterpriseNetwork getEnterpriseNetwork() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EnterpriseNetwork) {
            return (EnterpriseNetwork) obj;
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
    
    @VsoProperty(displayName = "RedirectionTarget", readOnly = true)
    public RedirectionTarget getRedirectionTarget() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof RedirectionTarget) {
            return (RedirectionTarget) obj;
        }
        
        return null;
    }
    
    @VsoProperty(displayName = "Metadata", readOnly = true)
    public Metadata getMetadata() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Metadata) {
            return (Metadata) obj;
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
    
    @VsoProperty(displayName = "ZoneTemplate", readOnly = true)
    public ZoneTemplate getZoneTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ZoneTemplate) {
            return (ZoneTemplate) obj;
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
    
    @VsoProperty(displayName = "StaticRoute", readOnly = true)
    public StaticRoute getStaticRoute() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof StaticRoute) {
            return (StaticRoute) obj;
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
    
    @VsoProperty(displayName = "MultiCastRange", readOnly = true)
    public MultiCastRange getMultiCastRange() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof MultiCastRange) {
            return (MultiCastRange) obj;
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
    
    @VsoProperty(displayName = "Tier", readOnly = true)
    public Tier getTier() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Tier) {
            return (Tier) obj;
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
    
    @VsoProperty(displayName = "L2Domain", readOnly = true)
    public L2Domain getL2Domain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L2Domain) {
            return (L2Domain) obj;
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
    
    @VsoProperty(displayName = "NSGateway", readOnly = true)
    public NSGateway getNSGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSGateway) {
            return (NSGateway) obj;
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
    
    @VsoProperty(displayName = "PublicNetworkMacro", readOnly = true)
    public PublicNetworkMacro getPublicNetworkMacro() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PublicNetworkMacro) {
            return (PublicNetworkMacro) obj;
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
    
    @VsoProperty(displayName = "User", readOnly = true)
    public User getUser() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof User) {
            return (User) obj;
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
    
    @VsoProperty(displayName = "Flow", readOnly = true)
    public Flow getFlow() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Flow) {
            return (Flow) obj;
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
    
    @VsoProperty(displayName = "IngressACLTemplate", readOnly = true)
    public IngressACLTemplate getIngressACLTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressACLTemplate) {
            return (IngressACLTemplate) obj;
        }
        
        return null;
    }
    @VsoMethod
    public java.util.List<EventLog> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<EventLog> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public EventLog getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}