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

package net.nuagenetworks.vro.vspk.model;import net.nuagenetworks.bambou.RestException;
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

@VsoFinder(name = Constants.UDPPROBETESTRESULT, datasource = Constants.DATASOURCE, image = Constants.UDPPROBETESTRESULT_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "None", resourceName = "None")
public class UDPProbeTestResult extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "packetLossPercent")
    protected Float packetLossPercent;
    
    @JsonProperty(value = "packetsLost")
    protected Long packetsLost;
    
    @JsonProperty(value = "packetsReceived")
    protected Long packetsReceived;
    
    @JsonProperty(value = "packetsTransmitted")
    protected Long packetsTransmitted;
    
    @VsoConstructor
    public UDPProbeTestResult() {}

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
    @JsonIgnore
    @VsoProperty(displayName = "PacketLossPercent", readOnly = false)   
    public Float getPacketLossPercent() {
       return packetLossPercent;
    }

    @JsonIgnore
    public void setPacketLossPercent(Float value) { 
        this.packetLossPercent = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PacketsLost", readOnly = false)   
    public Long getPacketsLost() {
       return packetsLost;
    }

    @JsonIgnore
    public void setPacketsLost(Long value) { 
        this.packetsLost = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PacketsReceived", readOnly = false)   
    public Long getPacketsReceived() {
       return packetsReceived;
    }

    @JsonIgnore
    public void setPacketsReceived(Long value) { 
        this.packetsReceived = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PacketsTransmitted", readOnly = false)   
    public Long getPacketsTransmitted() {
       return packetsTransmitted;
    }

    @JsonIgnore
    public void setPacketsTransmitted(Long value) { 
        this.packetsTransmitted = value;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.UDPPROBETESTRESULT, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.UDPPROBETESTRESULT, getId());
        }
    }public String toString() {
        return "UDPProbeTestResult [" + "packetLossPercent=" + packetLossPercent + ", packetsLost=" + packetsLost + ", packetsReceived=" + packetsReceived + ", packetsTransmitted=" + packetsTransmitted + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
    }
}