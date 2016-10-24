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

import net.nuagenetworks.vro.vspk.model.Alarm;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.RedundancyGroup;

import net.nuagenetworks.vro.vspk.model.TCA;

import net.nuagenetworks.vro.vspk.model.VsgRedundantPort;

import net.nuagenetworks.vro.vspk.model.WANService;

import net.nuagenetworks.vro.vspk.model.VSD;

import net.nuagenetworks.vro.vspk.model.VPort;

import net.nuagenetworks.vro.vspk.model.Port;

import net.nuagenetworks.vro.vspk.model.Container;

import net.nuagenetworks.vro.vspk.model.VRS;

import net.nuagenetworks.vro.vspk.model.HSC;

import net.nuagenetworks.vro.vspk.model.VLAN;

import net.nuagenetworks.vro.vspk.model.Gateway;

import net.nuagenetworks.vro.vspk.model.NSGateway;

import net.nuagenetworks.vro.vspk.model.VSC;

import net.nuagenetworks.vro.vspk.model.VM;

import net.nuagenetworks.vro.vspk.model.NSPort;

import net.nuagenetworks.vro.vspk.model.NSRedundantGatewayGroup;

import net.nuagenetworks.vro.vspk.model.Enterprise;
import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.RestObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.ALARMS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.ALARMS, type = Constants.ALARM) })
@VsoObject(create = false, strict = true)
public class AlarmsFetcher extends BaseFetcher<Alarm> {
    private static final long serialVersionUID = 1L;

    public AlarmsFetcher(RestObject parentRestObj) {
        super(parentRestObj, Alarm.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "Alarms";
    }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
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
    
    @VsoProperty(displayName = "VsgRedundantPort", readOnly = true)
    public VsgRedundantPort getVsgRedundantPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VsgRedundantPort) {
            return (VsgRedundantPort) obj;
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
    
    @VsoProperty(displayName = "Port", readOnly = true)
    public Port getPort() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Port) {
            return (Port) obj;
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
    
    @VsoProperty(displayName = "Gateway", readOnly = true)
    public Gateway getGateway() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Gateway) {
            return (Gateway) obj;
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
    
    @VsoProperty(displayName = "NSRedundantGatewayGroup", readOnly = true)
    public NSRedundantGatewayGroup getNSRedundantGatewayGroup() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof NSRedundantGatewayGroup) {
            return (NSRedundantGatewayGroup) obj;
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
    @VsoMethod
    public java.util.List<Alarm> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<Alarm> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public Alarm getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}