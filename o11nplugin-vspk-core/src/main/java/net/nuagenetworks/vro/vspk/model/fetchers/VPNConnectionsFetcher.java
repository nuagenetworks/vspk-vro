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

import net.nuagenetworks.vro.vspk.model.VPNConnection;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.AggregatedDomain;

import net.nuagenetworks.vro.vspk.model.Domain;

import net.nuagenetworks.vro.vspk.model.L2Domain;

import net.nuagenetworks.vro.vspk.model.SharedNetworkResource;
import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.RestObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.VPNCONNECTIONS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.VPNCONNECTIONS, type = Constants.VPNCONNECTION) })
@VsoObject(create = false, strict = true)
public class VPNConnectionsFetcher extends BaseFetcher<VPNConnection> {
    private static final long serialVersionUID = 1L;

    public VPNConnectionsFetcher(RestObject parentRestObj) {
        super(parentRestObj, VPNConnection.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "VPNConnections";
    }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "AggregatedDomain", readOnly = true)
    public AggregatedDomain getAggregatedDomain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof AggregatedDomain) {
            return (AggregatedDomain) obj;
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
    
    @VsoProperty(displayName = "L2Domain", readOnly = true)
    public L2Domain getL2Domain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L2Domain) {
            return (L2Domain) obj;
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
    @VsoMethod
    public java.util.List<VPNConnection> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<VPNConnection> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public VPNConnection getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}