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

@VsoFinder(name = Constants.BOOTSTRAPACTIVATION_ACTION_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum BootstrapActivationAction {

    AUTHENTICATE("AUTHENTICATE", "AUTHENTICATE"), BOOTSTRAP_COMPLETE("BOOTSTRAP_COMPLETE", "BOOTSTRAP_COMPLETE"), CERTIFICATE_RENEW("CERTIFICATE_RENEW", "CERTIFICATE_RENEW"), CERTIFICATE_REVOKE("CERTIFICATE_REVOKE", "CERTIFICATE_REVOKE"), CERTIFICATE_SIGNED("CERTIFICATE_SIGNED", "CERTIFICATE_SIGNED"), CONFIRM("CONFIRM", "CONFIRM"), INITIATE("INITIATE", "INITIATE"), INITIATE_RENEW("INITIATE_RENEW", "INITIATE_RENEW"), NEW_NCPE_AUTH_REQUIRED("NEW_NCPE_AUTH_REQUIRED", "NEW_NCPE_AUTH_REQUIRED"), NO_AUTH_REQUIRED("NO_AUTH_REQUIRED", "NO_AUTH_REQUIRED"), ROLLBACK("ROLLBACK", "ROLLBACK"), ROLLED_BACK("ROLLED_BACK", "ROLLED_BACK"), UNSPECIFIED("UNSPECIFIED", "UNSPECIFIED");

    private final String id;
    private final String name;
   
    BootstrapActivationAction(String id, String name) {
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

    
    @VsoProperty(displayName = "AUTHENTICATE", readOnly = true)
    public BootstrapActivationAction getAUTHENTICATE() {
        return AUTHENTICATE;
    }
    
    @VsoProperty(displayName = "BOOTSTRAP_COMPLETE", readOnly = true)
    public BootstrapActivationAction getBOOTSTRAP_COMPLETE() {
        return BOOTSTRAP_COMPLETE;
    }
    
    @VsoProperty(displayName = "CERTIFICATE_RENEW", readOnly = true)
    public BootstrapActivationAction getCERTIFICATE_RENEW() {
        return CERTIFICATE_RENEW;
    }
    
    @VsoProperty(displayName = "CERTIFICATE_REVOKE", readOnly = true)
    public BootstrapActivationAction getCERTIFICATE_REVOKE() {
        return CERTIFICATE_REVOKE;
    }
    
    @VsoProperty(displayName = "CERTIFICATE_SIGNED", readOnly = true)
    public BootstrapActivationAction getCERTIFICATE_SIGNED() {
        return CERTIFICATE_SIGNED;
    }
    
    @VsoProperty(displayName = "CONFIRM", readOnly = true)
    public BootstrapActivationAction getCONFIRM() {
        return CONFIRM;
    }
    
    @VsoProperty(displayName = "INITIATE", readOnly = true)
    public BootstrapActivationAction getINITIATE() {
        return INITIATE;
    }
    
    @VsoProperty(displayName = "INITIATE_RENEW", readOnly = true)
    public BootstrapActivationAction getINITIATE_RENEW() {
        return INITIATE_RENEW;
    }
    
    @VsoProperty(displayName = "NEW_NCPE_AUTH_REQUIRED", readOnly = true)
    public BootstrapActivationAction getNEW_NCPE_AUTH_REQUIRED() {
        return NEW_NCPE_AUTH_REQUIRED;
    }
    
    @VsoProperty(displayName = "NO_AUTH_REQUIRED", readOnly = true)
    public BootstrapActivationAction getNO_AUTH_REQUIRED() {
        return NO_AUTH_REQUIRED;
    }
    
    @VsoProperty(displayName = "ROLLBACK", readOnly = true)
    public BootstrapActivationAction getROLLBACK() {
        return ROLLBACK;
    }
    
    @VsoProperty(displayName = "ROLLED_BACK", readOnly = true)
    public BootstrapActivationAction getROLLED_BACK() {
        return ROLLED_BACK;
    }
    
    @VsoProperty(displayName = "UNSPECIFIED", readOnly = true)
    public BootstrapActivationAction getUNSPECIFIED() {
        return UNSPECIFIED;
    }
    

    public static BootstrapActivationAction getEnumById(String id) {
        for (BootstrapActivationAction item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};