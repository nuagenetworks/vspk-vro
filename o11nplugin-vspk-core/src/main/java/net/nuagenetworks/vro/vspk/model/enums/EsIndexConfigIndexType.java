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

package net.nuagenetworks.vro.vspk.model.enums;

import net.nuagenetworks.vro.vspk.model.Constants;

import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;

@VsoFinder(name = Constants.ESINDEXCONFIG_INDEXTYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum EsIndexConfigIndexType {

    NUAGE_ACL("NUAGE_ACL", "NUAGE_ACL"), NUAGE_ADDRESSMAP("NUAGE_ADDRESSMAP", "NUAGE_ADDRESSMAP"), NUAGE_DPI_FLOWSTATS("NUAGE_DPI_FLOWSTATS", "NUAGE_DPI_FLOWSTATS"), NUAGE_DPI_PROBESTATS("NUAGE_DPI_PROBESTATS", "NUAGE_DPI_PROBESTATS"), NUAGE_DPI_SLASTATS("NUAGE_DPI_SLASTATS", "NUAGE_DPI_SLASTATS"), NUAGE_EVENT("NUAGE_EVENT", "NUAGE_EVENT"), NUAGE_FEC("NUAGE_FEC", "NUAGE_FEC"), NUAGE_FLOW("NUAGE_FLOW", "NUAGE_FLOW"), NUAGE_GW_SEL_STATS("NUAGE_GW_SEL_STATS", "NUAGE_GW_SEL_STATS"), NUAGE_IKE_PROBESTATS("NUAGE_IKE_PROBESTATS", "NUAGE_IKE_PROBESTATS"), NUAGE_IKE_PROBE_STATUS("NUAGE_IKE_PROBE_STATUS", "NUAGE_IKE_PROBE_STATUS"), NUAGE_IKE_STATS("NUAGE_IKE_STATS", "NUAGE_IKE_STATS"), NUAGE_LTE("NUAGE_LTE", "NUAGE_LTE"), NUAGE_NATT("NUAGE_NATT", "NUAGE_NATT"), NUAGE_OAM("NUAGE_OAM", "NUAGE_OAM"), NUAGE_SYSMON("NUAGE_SYSMON", "NUAGE_SYSMON"), NUAGE_VLAN("NUAGE_VLAN", "NUAGE_VLAN"), NUAGE_VNF("NUAGE_VNF", "NUAGE_VNF"), NUAGE_VPORT("NUAGE_VPORT", "NUAGE_VPORT"), NUAGE_VPORT_QOS("NUAGE_VPORT_QOS", "NUAGE_VPORT_QOS"), NUAGE_WIFI("NUAGE_WIFI", "NUAGE_WIFI");

    private final String id;
    private final String name;
   
    EsIndexConfigIndexType(String id, String name) {
        this.id = id;
        this.name = name;
    }
   
    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return id;
    }
   
    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return name;
    }

    
    @VsoProperty(displayName = "NUAGE_ACL", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_ACL() {
        return NUAGE_ACL;
    }
    
    @VsoProperty(displayName = "NUAGE_ADDRESSMAP", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_ADDRESSMAP() {
        return NUAGE_ADDRESSMAP;
    }
    
    @VsoProperty(displayName = "NUAGE_DPI_FLOWSTATS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_DPI_FLOWSTATS() {
        return NUAGE_DPI_FLOWSTATS;
    }
    
    @VsoProperty(displayName = "NUAGE_DPI_PROBESTATS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_DPI_PROBESTATS() {
        return NUAGE_DPI_PROBESTATS;
    }
    
    @VsoProperty(displayName = "NUAGE_DPI_SLASTATS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_DPI_SLASTATS() {
        return NUAGE_DPI_SLASTATS;
    }
    
    @VsoProperty(displayName = "NUAGE_EVENT", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_EVENT() {
        return NUAGE_EVENT;
    }
    
    @VsoProperty(displayName = "NUAGE_FEC", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_FEC() {
        return NUAGE_FEC;
    }
    
    @VsoProperty(displayName = "NUAGE_FLOW", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_FLOW() {
        return NUAGE_FLOW;
    }
    
    @VsoProperty(displayName = "NUAGE_GW_SEL_STATS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_GW_SEL_STATS() {
        return NUAGE_GW_SEL_STATS;
    }
    
    @VsoProperty(displayName = "NUAGE_IKE_PROBESTATS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_IKE_PROBESTATS() {
        return NUAGE_IKE_PROBESTATS;
    }
    
    @VsoProperty(displayName = "NUAGE_IKE_PROBE_STATUS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_IKE_PROBE_STATUS() {
        return NUAGE_IKE_PROBE_STATUS;
    }
    
    @VsoProperty(displayName = "NUAGE_IKE_STATS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_IKE_STATS() {
        return NUAGE_IKE_STATS;
    }
    
    @VsoProperty(displayName = "NUAGE_LTE", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_LTE() {
        return NUAGE_LTE;
    }
    
    @VsoProperty(displayName = "NUAGE_NATT", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_NATT() {
        return NUAGE_NATT;
    }
    
    @VsoProperty(displayName = "NUAGE_OAM", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_OAM() {
        return NUAGE_OAM;
    }
    
    @VsoProperty(displayName = "NUAGE_SYSMON", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_SYSMON() {
        return NUAGE_SYSMON;
    }
    
    @VsoProperty(displayName = "NUAGE_VLAN", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_VLAN() {
        return NUAGE_VLAN;
    }
    
    @VsoProperty(displayName = "NUAGE_VNF", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_VNF() {
        return NUAGE_VNF;
    }
    
    @VsoProperty(displayName = "NUAGE_VPORT", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_VPORT() {
        return NUAGE_VPORT;
    }
    
    @VsoProperty(displayName = "NUAGE_VPORT_QOS", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_VPORT_QOS() {
        return NUAGE_VPORT_QOS;
    }
    
    @VsoProperty(displayName = "NUAGE_WIFI", readOnly = true)
    public EsIndexConfigIndexType getNUAGE_WIFI() {
        return NUAGE_WIFI;
    }
    

    public static EsIndexConfigIndexType getEnumById(String id) {
        for (EsIndexConfigIndexType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};