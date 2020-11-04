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
import net.nuagenetworks.vro.vspk.model.fetchers.IKEGatewayConnectionsFetcher;

import net.nuagenetworks.vro.vspk.model.enums.VirtualUplinkAuxMode;

import net.nuagenetworks.vro.vspk.model.enums.VirtualUplinkRole;
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

@VsoFinder(name = Constants.VIRTUALUPLINK, datasource = Constants.DATASOURCE, image = Constants.VIRTUALUPLINK_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "virtualuplink", resourceName = "virtualuplinks")
public class VirtualUplink extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "associatedEgressQoSPolicyID")
    protected String associatedEgressQoSPolicyID;
    
    @JsonProperty(value = "associatedIngressOverlayQoSPolicerID")
    protected String associatedIngressOverlayQoSPolicerID;
    
    @JsonProperty(value = "associatedIngressQoSPolicyID")
    protected String associatedIngressQoSPolicyID;
    
    @JsonProperty(value = "associatedIngressUnderlayQoSPolicerID")
    protected String associatedIngressUnderlayQoSPolicerID;
    
    @JsonProperty(value = "associatedUplinkConnectionID")
    protected String associatedUplinkConnectionID;
    
    @JsonProperty(value = "associatedVSCProfileID")
    protected String associatedVSCProfileID;
    
    @JsonProperty(value = "auxMode")
    protected VirtualUplinkAuxMode auxMode;
    
    @JsonProperty(value = "enableNATProbes")
    protected Boolean enableNATProbes;
    
    @JsonProperty(value = "peerEndpoint")
    protected String peerEndpoint;
    
    @JsonProperty(value = "peerGatewayID")
    protected String peerGatewayID;
    
    @JsonProperty(value = "peerGatewayName")
    protected String peerGatewayName;
    
    @JsonProperty(value = "peerGatewaySystemID")
    protected String peerGatewaySystemID;
    
    @JsonProperty(value = "peerPortID")
    protected String peerPortID;
    
    @JsonProperty(value = "peerUplinkID")
    protected Long peerUplinkID;
    
    @JsonProperty(value = "peerVLANID")
    protected String peerVLANID;
    
    @JsonProperty(value = "role")
    protected VirtualUplinkRole role;
    
    @JsonProperty(value = "roleOrder")
    protected Long roleOrder;
    
    @JsonProperty(value = "shuntEndpoint")
    protected String shuntEndpoint;
    
    @JsonProperty(value = "shuntPortID")
    protected String shuntPortID;
    
    @JsonProperty(value = "shuntVLANID")
    protected String shuntVLANID;
    
    @JsonProperty(value = "trafficThroughUBROnly")
    protected Boolean trafficThroughUBROnly;
    
    @JsonProperty(value = "underlayID")
    protected Long underlayID;
    
    @JsonProperty(value = "underlayNAT")
    protected Boolean underlayNAT;
    
    @JsonProperty(value = "underlayName")
    protected String underlayName;
    
    @JsonProperty(value = "underlayRouting")
    protected Boolean underlayRouting;
    
    @JsonProperty(value = "virtualUplinkDatapathID")
    protected String virtualUplinkDatapathID;
    
    @JsonIgnore
    private IKEGatewayConnectionsFetcher iKEGatewayConnections;
    
    @VsoConstructor
    public VirtualUplink() {
        iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
        }

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
    @VsoProperty(displayName = "AssociatedEgressQoSPolicyID", readOnly = false)   
    public String getAssociatedEgressQoSPolicyID() {
       return associatedEgressQoSPolicyID;
    }

    @JsonIgnore
    public void setAssociatedEgressQoSPolicyID(String value) { 
        this.associatedEgressQoSPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressOverlayQoSPolicerID", readOnly = false)   
    public String getAssociatedIngressOverlayQoSPolicerID() {
       return associatedIngressOverlayQoSPolicerID;
    }

    @JsonIgnore
    public void setAssociatedIngressOverlayQoSPolicerID(String value) { 
        this.associatedIngressOverlayQoSPolicerID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressQoSPolicyID", readOnly = false)   
    public String getAssociatedIngressQoSPolicyID() {
       return associatedIngressQoSPolicyID;
    }

    @JsonIgnore
    public void setAssociatedIngressQoSPolicyID(String value) { 
        this.associatedIngressQoSPolicyID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedIngressUnderlayQoSPolicerID", readOnly = false)   
    public String getAssociatedIngressUnderlayQoSPolicerID() {
       return associatedIngressUnderlayQoSPolicerID;
    }

    @JsonIgnore
    public void setAssociatedIngressUnderlayQoSPolicerID(String value) { 
        this.associatedIngressUnderlayQoSPolicerID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedUplinkConnectionID", readOnly = false)   
    public String getAssociatedUplinkConnectionID() {
       return associatedUplinkConnectionID;
    }

    @JsonIgnore
    public void setAssociatedUplinkConnectionID(String value) { 
        this.associatedUplinkConnectionID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedVSCProfileID", readOnly = false)   
    public String getAssociatedVSCProfileID() {
       return associatedVSCProfileID;
    }

    @JsonIgnore
    public void setAssociatedVSCProfileID(String value) { 
        this.associatedVSCProfileID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AuxMode", readOnly = false)   
    public VirtualUplinkAuxMode getAuxMode() {
       return auxMode;
    }

    @JsonIgnore
    public void setAuxMode(VirtualUplinkAuxMode value) { 
        this.auxMode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnableNATProbes", readOnly = false)   
    public Boolean getEnableNATProbes() {
       return enableNATProbes;
    }

    @JsonIgnore
    public void setEnableNATProbes(Boolean value) { 
        this.enableNATProbes = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerEndpoint", readOnly = false)   
    public String getPeerEndpoint() {
       return peerEndpoint;
    }

    @JsonIgnore
    public void setPeerEndpoint(String value) { 
        this.peerEndpoint = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerGatewayID", readOnly = false)   
    public String getPeerGatewayID() {
       return peerGatewayID;
    }

    @JsonIgnore
    public void setPeerGatewayID(String value) { 
        this.peerGatewayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerGatewayName", readOnly = false)   
    public String getPeerGatewayName() {
       return peerGatewayName;
    }

    @JsonIgnore
    public void setPeerGatewayName(String value) { 
        this.peerGatewayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerGatewaySystemID", readOnly = false)   
    public String getPeerGatewaySystemID() {
       return peerGatewaySystemID;
    }

    @JsonIgnore
    public void setPeerGatewaySystemID(String value) { 
        this.peerGatewaySystemID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerPortID", readOnly = false)   
    public String getPeerPortID() {
       return peerPortID;
    }

    @JsonIgnore
    public void setPeerPortID(String value) { 
        this.peerPortID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerUplinkID", readOnly = false)   
    public Long getPeerUplinkID() {
       return peerUplinkID;
    }

    @JsonIgnore
    public void setPeerUplinkID(Long value) { 
        this.peerUplinkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PeerVLANID", readOnly = false)   
    public String getPeerVLANID() {
       return peerVLANID;
    }

    @JsonIgnore
    public void setPeerVLANID(String value) { 
        this.peerVLANID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Role", readOnly = false)   
    public VirtualUplinkRole getRole() {
       return role;
    }

    @JsonIgnore
    public void setRole(VirtualUplinkRole value) { 
        this.role = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "RoleOrder", readOnly = false)   
    public Long getRoleOrder() {
       return roleOrder;
    }

    @JsonIgnore
    public void setRoleOrder(Long value) { 
        this.roleOrder = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ShuntEndpoint", readOnly = false)   
    public String getShuntEndpoint() {
       return shuntEndpoint;
    }

    @JsonIgnore
    public void setShuntEndpoint(String value) { 
        this.shuntEndpoint = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ShuntPortID", readOnly = false)   
    public String getShuntPortID() {
       return shuntPortID;
    }

    @JsonIgnore
    public void setShuntPortID(String value) { 
        this.shuntPortID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ShuntVLANID", readOnly = false)   
    public String getShuntVLANID() {
       return shuntVLANID;
    }

    @JsonIgnore
    public void setShuntVLANID(String value) { 
        this.shuntVLANID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "TrafficThroughUBROnly", readOnly = false)   
    public Boolean getTrafficThroughUBROnly() {
       return trafficThroughUBROnly;
    }

    @JsonIgnore
    public void setTrafficThroughUBROnly(Boolean value) { 
        this.trafficThroughUBROnly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayID", readOnly = false)   
    public Long getUnderlayID() {
       return underlayID;
    }

    @JsonIgnore
    public void setUnderlayID(Long value) { 
        this.underlayID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayNAT", readOnly = false)   
    public Boolean getUnderlayNAT() {
       return underlayNAT;
    }

    @JsonIgnore
    public void setUnderlayNAT(Boolean value) { 
        this.underlayNAT = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayName", readOnly = false)   
    public String getUnderlayName() {
       return underlayName;
    }

    @JsonIgnore
    public void setUnderlayName(String value) { 
        this.underlayName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "UnderlayRouting", readOnly = false)   
    public Boolean getUnderlayRouting() {
       return underlayRouting;
    }

    @JsonIgnore
    public void setUnderlayRouting(Boolean value) { 
        this.underlayRouting = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "VirtualUplinkDatapathID", readOnly = false)   
    public String getVirtualUplinkDatapathID() {
       return virtualUplinkDatapathID;
    }

    @JsonIgnore
    public void setVirtualUplinkDatapathID(String value) { 
        this.virtualUplinkDatapathID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "IKEGatewayConnections", readOnly = true)   
    public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
        return iKEGatewayConnections;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.VIRTUALUPLINK, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.VIRTUALUPLINK, getId());
        }
    }public String toString() {
        return "VirtualUplink [" + "associatedEgressQoSPolicyID=" + associatedEgressQoSPolicyID + ", associatedIngressOverlayQoSPolicerID=" + associatedIngressOverlayQoSPolicerID + ", associatedIngressQoSPolicyID=" + associatedIngressQoSPolicyID + ", associatedIngressUnderlayQoSPolicerID=" + associatedIngressUnderlayQoSPolicerID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", auxMode=" + auxMode + ", enableNATProbes=" + enableNATProbes + ", peerEndpoint=" + peerEndpoint + ", peerGatewayID=" + peerGatewayID + ", peerGatewayName=" + peerGatewayName + ", peerGatewaySystemID=" + peerGatewaySystemID + ", peerPortID=" + peerPortID + ", peerUplinkID=" + peerUplinkID + ", peerVLANID=" + peerVLANID + ", role=" + role + ", roleOrder=" + roleOrder + ", shuntEndpoint=" + shuntEndpoint + ", shuntPortID=" + shuntPortID + ", shuntVLANID=" + shuntVLANID + ", trafficThroughUBROnly=" + trafficThroughUBROnly + ", underlayID=" + underlayID + ", underlayNAT=" + underlayNAT + ", underlayName=" + underlayName + ", underlayRouting=" + underlayRouting + ", virtualUplinkDatapathID=" + virtualUplinkDatapathID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}