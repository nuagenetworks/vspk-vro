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

@VsoFinder(name = Constants.WIRELESSPORT_WIFIMODE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum WirelessPortWifiMode {

    WIFI_A("WIFI_A", "WIFI_A"), WIFI_A_AC("WIFI_A_AC", "WIFI_A_AC"), WIFI_A_N("WIFI_A_N", "WIFI_A_N"), WIFI_A_N_AC("WIFI_A_N_AC", "WIFI_A_N_AC"), WIFI_B_G("WIFI_B_G", "WIFI_B_G"), WIFI_B_G_N("WIFI_B_G_N", "WIFI_B_G_N");

    private final String id;
    private final String name;
   
    WirelessPortWifiMode(String id, String name) {
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

    
    @VsoProperty(displayName = "WIFI_A", readOnly = true)
    public WirelessPortWifiMode getWIFI_A() {
        return WIFI_A;
    }
    
    @VsoProperty(displayName = "WIFI_A_AC", readOnly = true)
    public WirelessPortWifiMode getWIFI_A_AC() {
        return WIFI_A_AC;
    }
    
    @VsoProperty(displayName = "WIFI_A_N", readOnly = true)
    public WirelessPortWifiMode getWIFI_A_N() {
        return WIFI_A_N;
    }
    
    @VsoProperty(displayName = "WIFI_A_N_AC", readOnly = true)
    public WirelessPortWifiMode getWIFI_A_N_AC() {
        return WIFI_A_N_AC;
    }
    
    @VsoProperty(displayName = "WIFI_B_G", readOnly = true)
    public WirelessPortWifiMode getWIFI_B_G() {
        return WIFI_B_G;
    }
    
    @VsoProperty(displayName = "WIFI_B_G_N", readOnly = true)
    public WirelessPortWifiMode getWIFI_B_G_N() {
        return WIFI_B_G_N;
    }
    

    public static WirelessPortWifiMode getEnumById(String id) {
        for (WirelessPortWifiMode item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};