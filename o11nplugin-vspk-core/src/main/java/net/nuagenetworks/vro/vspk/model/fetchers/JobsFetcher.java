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

import net.nuagenetworks.vro.vspk.model.Job;
import net.nuagenetworks.vro.vspk.model.Session;
import net.nuagenetworks.vro.vspk.model.Constants;
import net.nuagenetworks.vro.vspk.model.PolicyGroupTemplate;

import net.nuagenetworks.vro.vspk.model.RedirectionTargetTemplate;

import net.nuagenetworks.vro.vspk.model.RedirectionTarget;

import net.nuagenetworks.vro.vspk.model.EgressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.IngressExternalServiceTemplateEntry;

import net.nuagenetworks.vro.vspk.model.Domain;

import net.nuagenetworks.vro.vspk.model.VSD;

import net.nuagenetworks.vro.vspk.model.VRS;

import net.nuagenetworks.vro.vspk.model.HSC;

import net.nuagenetworks.vro.vspk.model.ZFBRequest;

import net.nuagenetworks.vro.vspk.model.VCenterHypervisor;

import net.nuagenetworks.vro.vspk.model.VCenterCluster;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdEntryTemplate;

import net.nuagenetworks.vro.vspk.model.Gateway;

import net.nuagenetworks.vro.vspk.model.L2DomainTemplate;

import net.nuagenetworks.vro.vspk.model.VCenter;

import net.nuagenetworks.vro.vspk.model.IngressACLEntryTemplate;

import net.nuagenetworks.vro.vspk.model.L2Domain;

import net.nuagenetworks.vro.vspk.model.IngressExternalServiceTemplate;

import net.nuagenetworks.vro.vspk.model.Me;

import net.nuagenetworks.vro.vspk.model.NSGateway;

import net.nuagenetworks.vro.vspk.model.VSC;

import net.nuagenetworks.vro.vspk.model.DomainTemplate;

import net.nuagenetworks.vro.vspk.model.EgressACLTemplate;

import net.nuagenetworks.vro.vspk.model.IngressAdvFwdTemplate;

import net.nuagenetworks.vro.vspk.model.PolicyGroup;

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

@VsoFinder(name = Constants.JOBS_FETCHER, datasource = Constants.DATASOURCE, image = Constants.FOLDER_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.JOBS, type = Constants.JOB) })
@VsoObject(create = false, strict = true)
public class JobsFetcher extends BaseFetcher<Job> {
    private static final long serialVersionUID = 1L;

    public JobsFetcher(RestObject parentRestObj) {
        super(parentRestObj, Job.class);
    }

    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return super.getParentRestObj().getId();
    }

    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return "Jobs";
    }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "PolicyGroupTemplate", readOnly = true)
    public PolicyGroupTemplate getPolicyGroupTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof PolicyGroupTemplate) {
            return (PolicyGroupTemplate) obj;
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
    
    @VsoProperty(displayName = "Domain", readOnly = true)
    public Domain getDomain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Domain) {
            return (Domain) obj;
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
    
    @VsoProperty(displayName = "ZFBRequest", readOnly = true)
    public ZFBRequest getZFBRequest() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof ZFBRequest) {
            return (ZFBRequest) obj;
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
    
    @VsoProperty(displayName = "VCenterCluster", readOnly = true)
    public VCenterCluster getVCenterCluster() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenterCluster) {
            return (VCenterCluster) obj;
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
    
    @VsoProperty(displayName = "VCenter", readOnly = true)
    public VCenter getVCenter() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof VCenter) {
            return (VCenter) obj;
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
    
    @VsoProperty(displayName = "L2Domain", readOnly = true)
    public L2Domain getL2Domain() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof L2Domain) {
            return (L2Domain) obj;
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
    
    @VsoProperty(displayName = "Me", readOnly = true)
    public Me getMe() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof Me) {
            return (Me) obj;
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
    
    @VsoProperty(displayName = "DomainTemplate", readOnly = true)
    public DomainTemplate getDomainTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof DomainTemplate) {
            return (DomainTemplate) obj;
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
    
    @VsoProperty(displayName = "IngressAdvFwdTemplate", readOnly = true)
    public IngressAdvFwdTemplate getIngressAdvFwdTemplate() {
        RestObject obj = super.getParentRestObj();
        if (obj instanceof IngressAdvFwdTemplate) {
            return (IngressAdvFwdTemplate) obj;
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
    public java.util.List<Job> fetch(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.fetch(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public java.util.List<Job> get(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.get(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public Job getFirst(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.getFirst(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }

    @VsoMethod
    public int count(Session session, String filter, String orderBy, String[] groupBy, Integer page, Integer pageSize, String queryParameters, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        return super.count(session, filter, orderBy, groupBy, page, pageSize, queryParameters, commit);
    }
}