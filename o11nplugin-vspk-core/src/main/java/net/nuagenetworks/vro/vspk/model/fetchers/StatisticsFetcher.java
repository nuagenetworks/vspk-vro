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

import net.nuagenetworks.vro.vspk.model.Statistics;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.AddressMap;

import net.nuagenetworks.vro.vspk.model.AggregatedDomain;

import net.nuagenetworks.vro.vspk.model.BridgeInterface;

import net.nuagenetworks.vro.vspk.model.ContainerInterface;

import net.nuagenetworks.vro.vspk.model.Domain;

import net.nuagenetworks.vro.vspk.model.EgressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.HostInterface;

import net.nuagenetworks.vro.vspk.model.IngressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAuditACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.L2Domain;

import net.nuagenetworks.vro.vspk.model.NSPort;

import net.nuagenetworks.vro.vspk.model.PATNATPool;

import net.nuagenetworks.vro.vspk.model.Subnet;

import net.nuagenetworks.vro.vspk.model.VLAN;

import net.nuagenetworks.vro.vspk.model.VMInterface;

import net.nuagenetworks.vro.vspk.model.VPort;

import net.nuagenetworks.vro.vspk.model.VRS;

import net.nuagenetworks.vro.vspk.model.VSC;

import net.nuagenetworks.vro.vspk.model.Zone;
import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.RestObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.STATISTICS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.STATISTICS, type = Constants.STATISTICS) })
@VsoObject(create = false, strict = true)
public class StatisticsFetcher extends BaseFetcher<Statistics> {
    private static final long serialVersionUID = 1L;

    public StatisticsFetcher(RestObject parentRestObj) {
        super(parentRestObj, Statistics.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "Statistics";
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
    
    @VsoProperty(displayName = "AggregatedDomain", readOnly = true)
    public AggregatedDomain getAggregatedDomain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AggregatedDomain) {
            return (AggregatedDomain) obj;
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
    
    @VsoProperty(displayName = "ContainerInterface", readOnly = true)
    public ContainerInterface getContainerInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ContainerInterface) {
            return (ContainerInterface) obj;
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
    
    @VsoProperty(displayName = "EgressACLEntryTemplate", readOnly = true)
    public EgressACLEntryTemplate getEgressACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof EgressACLEntryTemplate) {
            return (EgressACLEntryTemplate) obj;
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
    
    @VsoProperty(displayName = "IngressACLEntryTemplate", readOnly = true)
    public IngressACLEntryTemplate getIngressACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressACLEntryTemplate) {
            return (IngressACLEntryTemplate) obj;
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
    
    @VsoProperty(displayName = "IngressAuditACLEntryTemplate", readOnly = true)
    public IngressAuditACLEntryTemplate getIngressAuditACLEntryTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAuditACLEntryTemplate) {
            return (IngressAuditACLEntryTemplate) obj;
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
    
    @VsoProperty(displayName = "NSPort", readOnly = true)
    public NSPort getNSPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSPort) {
            return (NSPort) obj;
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
    
    @VsoProperty(displayName = "Subnet", readOnly = true)
    public Subnet getSubnet() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Subnet) {
            return (Subnet) obj;
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
    
    @VsoProperty(displayName = "VMInterface", readOnly = true)
    public VMInterface getVMInterface() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VMInterface) {
            return (VMInterface) obj;
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
    
    @VsoProperty(displayName = "VRS", readOnly = true)
    public VRS getVRS() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VRS) {
            return (VRS) obj;
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
    
    @VsoProperty(displayName = "Zone", readOnly = true)
    public Zone getZone() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Zone) {
            return (Zone) obj;
        }
        
        return null;
    }
    @VsoMethod
    public java.util.List<Statistics> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<Statistics> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public Statistics getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}