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

@VsoFinder(name = Constants.NETCONFGATEWAY_PERSONALITY_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum NetconfGatewayPersonality {

    DC7X50("DC7X50", "DC7X50"), EVDF("EVDF", "EVDF"), EVDFB("EVDFB", "EVDFB"), HARDWARE_VTEP("HARDWARE_VTEP", "HARDWARE_VTEP"), NETCONF_7X50("NETCONF_7X50", "NETCONF_7X50"), NETCONF_THIRDPARTY_HW_VTEP("NETCONF_THIRDPARTY_HW_VTEP", "NETCONF_THIRDPARTY_HW_VTEP"), NUAGE_210_WBX_32_Q("NUAGE_210_WBX_32_Q", "NUAGE_210_WBX_32_Q"), NUAGE_210_WBX_48_S("NUAGE_210_WBX_48_S", "NUAGE_210_WBX_48_S"), OTHER("OTHER", "OTHER"), UNMANAGED_GATEWAY("UNMANAGED_GATEWAY", "UNMANAGED_GATEWAY"), VDFG("VDFG", "VDFG"), VRSB("VRSB", "VRSB"), VRSG("VRSG", "VRSG"), VSA("VSA", "VSA"), VSG("VSG", "VSG");

    private final String id;
    private final String name;
   
    NetconfGatewayPersonality(String id, String name) {
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

    
    @VsoProperty(displayName = "DC7X50", readOnly = true)
    public NetconfGatewayPersonality getDC7X50() {
        return DC7X50;
    }
    
    @VsoProperty(displayName = "EVDF", readOnly = true)
    public NetconfGatewayPersonality getEVDF() {
        return EVDF;
    }
    
    @VsoProperty(displayName = "EVDFB", readOnly = true)
    public NetconfGatewayPersonality getEVDFB() {
        return EVDFB;
    }
    
    @VsoProperty(displayName = "HARDWARE_VTEP", readOnly = true)
    public NetconfGatewayPersonality getHARDWARE_VTEP() {
        return HARDWARE_VTEP;
    }
    
    @VsoProperty(displayName = "NETCONF_7X50", readOnly = true)
    public NetconfGatewayPersonality getNETCONF_7X50() {
        return NETCONF_7X50;
    }
    
    @VsoProperty(displayName = "NETCONF_THIRDPARTY_HW_VTEP", readOnly = true)
    public NetconfGatewayPersonality getNETCONF_THIRDPARTY_HW_VTEP() {
        return NETCONF_THIRDPARTY_HW_VTEP;
    }
    
    @VsoProperty(displayName = "NUAGE_210_WBX_32_Q", readOnly = true)
    public NetconfGatewayPersonality getNUAGE_210_WBX_32_Q() {
        return NUAGE_210_WBX_32_Q;
    }
    
    @VsoProperty(displayName = "NUAGE_210_WBX_48_S", readOnly = true)
    public NetconfGatewayPersonality getNUAGE_210_WBX_48_S() {
        return NUAGE_210_WBX_48_S;
    }
    
    @VsoProperty(displayName = "OTHER", readOnly = true)
    public NetconfGatewayPersonality getOTHER() {
        return OTHER;
    }
    
    @VsoProperty(displayName = "UNMANAGED_GATEWAY", readOnly = true)
    public NetconfGatewayPersonality getUNMANAGED_GATEWAY() {
        return UNMANAGED_GATEWAY;
    }
    
    @VsoProperty(displayName = "VDFG", readOnly = true)
    public NetconfGatewayPersonality getVDFG() {
        return VDFG;
    }
    
    @VsoProperty(displayName = "VRSB", readOnly = true)
    public NetconfGatewayPersonality getVRSB() {
        return VRSB;
    }
    
    @VsoProperty(displayName = "VRSG", readOnly = true)
    public NetconfGatewayPersonality getVRSG() {
        return VRSG;
    }
    
    @VsoProperty(displayName = "VSA", readOnly = true)
    public NetconfGatewayPersonality getVSA() {
        return VSA;
    }
    
    @VsoProperty(displayName = "VSG", readOnly = true)
    public NetconfGatewayPersonality getVSG() {
        return VSG;
    }
    

    public static NetconfGatewayPersonality getEnumById(String id) {
        for (NetconfGatewayPersonality item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};