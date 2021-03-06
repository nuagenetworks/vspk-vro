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

@VsoFinder(name = Constants.THREATPREVENTIONSERVERCONNECTION_STATUS_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum ThreatPreventionServerConnectionStatus {

    AUTHENTICATION_FAILED("AUTHENTICATION_FAILED", "AUTHENTICATION_FAILED"), CONNECTED("CONNECTED", "CONNECTED"), DEGRADED("DEGRADED", "DEGRADED"), DISCONNECTED("DISCONNECTED", "DISCONNECTED"), UNREACHABLE("UNREACHABLE", "UNREACHABLE");

    private final String id;
    private final String name;
   
    ThreatPreventionServerConnectionStatus(String id, String name) {
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

    
    @VsoProperty(displayName = "AUTHENTICATION_FAILED", readOnly = true)
    public ThreatPreventionServerConnectionStatus getAUTHENTICATION_FAILED() {
        return AUTHENTICATION_FAILED;
    }
    
    @VsoProperty(displayName = "CONNECTED", readOnly = true)
    public ThreatPreventionServerConnectionStatus getCONNECTED() {
        return CONNECTED;
    }
    
    @VsoProperty(displayName = "DEGRADED", readOnly = true)
    public ThreatPreventionServerConnectionStatus getDEGRADED() {
        return DEGRADED;
    }
    
    @VsoProperty(displayName = "DISCONNECTED", readOnly = true)
    public ThreatPreventionServerConnectionStatus getDISCONNECTED() {
        return DISCONNECTED;
    }
    
    @VsoProperty(displayName = "UNREACHABLE", readOnly = true)
    public ThreatPreventionServerConnectionStatus getUNREACHABLE() {
        return UNREACHABLE;
    }
    

    public static ThreatPreventionServerConnectionStatus getEnumById(String id) {
        for (ThreatPreventionServerConnectionStatus item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};