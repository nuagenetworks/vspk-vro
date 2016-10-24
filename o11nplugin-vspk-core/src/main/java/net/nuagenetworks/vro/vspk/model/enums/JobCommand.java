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

@VsoFinder(name = Constants.JOB_COMMAND_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum JobCommand {

    APPLY_POLICY_CHANGES("APPLY_POLICY_CHANGES", "APPLY_POLICY_CHANGES"), BATCH_CRUD_REQUEST("BATCH_CRUD_REQUEST", "BATCH_CRUD_REQUEST"), BATCH_GATEWAY_SECURED_DATAS("BATCH_GATEWAY_SECURED_DATAS", "BATCH_GATEWAY_SECURED_DATAS"), BEGIN_POLICY_CHANGES("BEGIN_POLICY_CHANGES", "BEGIN_POLICY_CHANGES"), CERTIFICATE_NSG_RENEW("CERTIFICATE_NSG_RENEW", "CERTIFICATE_NSG_RENEW"), CERTIFICATE_NSG_REVOKE("CERTIFICATE_NSG_REVOKE", "CERTIFICATE_NSG_REVOKE"), CLEAR_IPSEC_DATA("CLEAR_IPSEC_DATA", "CLEAR_IPSEC_DATA"), DISCARD_POLICY_CHANGES("DISCARD_POLICY_CHANGES", "DISCARD_POLICY_CHANGES"), EXPORT("EXPORT", "EXPORT"), FORCE_KEYSERVER_UPDATE("FORCE_KEYSERVER_UPDATE", "FORCE_KEYSERVER_UPDATE"), FORCE_KEYSERVER_UPDATE_ACK("FORCE_KEYSERVER_UPDATE_ACK", "FORCE_KEYSERVER_UPDATE_ACK"), FORCE_KEYSERVER_VSD_RESYNC("FORCE_KEYSERVER_VSD_RESYNC", "FORCE_KEYSERVER_VSD_RESYNC"), GATEWAY_AUDIT("GATEWAY_AUDIT", "GATEWAY_AUDIT"), GET_ZFB_INFO("GET_ZFB_INFO", "GET_ZFB_INFO"), IMPORT("IMPORT", "IMPORT"), KEYSERVER_NOTIFICATION_TEST("KEYSERVER_NOTIFICATION_TEST", "KEYSERVER_NOTIFICATION_TEST"), NOTIFY_NSG_REGISTRATION("NOTIFY_NSG_REGISTRATION", "NOTIFY_NSG_REGISTRATION"), NOTIFY_NSG_REGISTRATION_ACK("NOTIFY_NSG_REGISTRATION_ACK", "NOTIFY_NSG_REGISTRATION_ACK"), NOTIFY_NSG_REGISTRATION_TEST("NOTIFY_NSG_REGISTRATION_TEST", "NOTIFY_NSG_REGISTRATION_TEST"), NSG_NOTIFICATION_TEST("NSG_NOTIFICATION_TEST", "NSG_NOTIFICATION_TEST"), NSG_REGISTRATION_INFO("NSG_REGISTRATION_INFO", "NSG_REGISTRATION_INFO"), RELOAD("RELOAD", "RELOAD"), RELOAD_GEO_REDUNDANT_INFO("RELOAD_GEO_REDUNDANT_INFO", "RELOAD_GEO_REDUNDANT_INFO"), RELOAD_NSG_CONFIG("RELOAD_NSG_CONFIG", "RELOAD_NSG_CONFIG"), RETRIEVE_ACTIVE_NSGS("RETRIEVE_ACTIVE_NSGS", "RETRIEVE_ACTIVE_NSGS"), VCENTER_RECONNECT("VCENTER_RECONNECT", "VCENTER_RECONNECT"), VCENTER_RELOAD("VCENTER_RELOAD", "VCENTER_RELOAD");

    private final String id;
    private final String name;
   
    JobCommand(String id, String name) {
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

    
    @VsoProperty(displayName = "APPLY_POLICY_CHANGES", readOnly = true)
    public JobCommand getAPPLY_POLICY_CHANGES() {
        return APPLY_POLICY_CHANGES;
    }
    
    @VsoProperty(displayName = "BATCH_CRUD_REQUEST", readOnly = true)
    public JobCommand getBATCH_CRUD_REQUEST() {
        return BATCH_CRUD_REQUEST;
    }
    
    @VsoProperty(displayName = "BATCH_GATEWAY_SECURED_DATAS", readOnly = true)
    public JobCommand getBATCH_GATEWAY_SECURED_DATAS() {
        return BATCH_GATEWAY_SECURED_DATAS;
    }
    
    @VsoProperty(displayName = "BEGIN_POLICY_CHANGES", readOnly = true)
    public JobCommand getBEGIN_POLICY_CHANGES() {
        return BEGIN_POLICY_CHANGES;
    }
    
    @VsoProperty(displayName = "CERTIFICATE_NSG_RENEW", readOnly = true)
    public JobCommand getCERTIFICATE_NSG_RENEW() {
        return CERTIFICATE_NSG_RENEW;
    }
    
    @VsoProperty(displayName = "CERTIFICATE_NSG_REVOKE", readOnly = true)
    public JobCommand getCERTIFICATE_NSG_REVOKE() {
        return CERTIFICATE_NSG_REVOKE;
    }
    
    @VsoProperty(displayName = "CLEAR_IPSEC_DATA", readOnly = true)
    public JobCommand getCLEAR_IPSEC_DATA() {
        return CLEAR_IPSEC_DATA;
    }
    
    @VsoProperty(displayName = "DISCARD_POLICY_CHANGES", readOnly = true)
    public JobCommand getDISCARD_POLICY_CHANGES() {
        return DISCARD_POLICY_CHANGES;
    }
    
    @VsoProperty(displayName = "EXPORT", readOnly = true)
    public JobCommand getEXPORT() {
        return EXPORT;
    }
    
    @VsoProperty(displayName = "FORCE_KEYSERVER_UPDATE", readOnly = true)
    public JobCommand getFORCE_KEYSERVER_UPDATE() {
        return FORCE_KEYSERVER_UPDATE;
    }
    
    @VsoProperty(displayName = "FORCE_KEYSERVER_UPDATE_ACK", readOnly = true)
    public JobCommand getFORCE_KEYSERVER_UPDATE_ACK() {
        return FORCE_KEYSERVER_UPDATE_ACK;
    }
    
    @VsoProperty(displayName = "FORCE_KEYSERVER_VSD_RESYNC", readOnly = true)
    public JobCommand getFORCE_KEYSERVER_VSD_RESYNC() {
        return FORCE_KEYSERVER_VSD_RESYNC;
    }
    
    @VsoProperty(displayName = "GATEWAY_AUDIT", readOnly = true)
    public JobCommand getGATEWAY_AUDIT() {
        return GATEWAY_AUDIT;
    }
    
    @VsoProperty(displayName = "GET_ZFB_INFO", readOnly = true)
    public JobCommand getGET_ZFB_INFO() {
        return GET_ZFB_INFO;
    }
    
    @VsoProperty(displayName = "IMPORT", readOnly = true)
    public JobCommand getIMPORT() {
        return IMPORT;
    }
    
    @VsoProperty(displayName = "KEYSERVER_NOTIFICATION_TEST", readOnly = true)
    public JobCommand getKEYSERVER_NOTIFICATION_TEST() {
        return KEYSERVER_NOTIFICATION_TEST;
    }
    
    @VsoProperty(displayName = "NOTIFY_NSG_REGISTRATION", readOnly = true)
    public JobCommand getNOTIFY_NSG_REGISTRATION() {
        return NOTIFY_NSG_REGISTRATION;
    }
    
    @VsoProperty(displayName = "NOTIFY_NSG_REGISTRATION_ACK", readOnly = true)
    public JobCommand getNOTIFY_NSG_REGISTRATION_ACK() {
        return NOTIFY_NSG_REGISTRATION_ACK;
    }
    
    @VsoProperty(displayName = "NOTIFY_NSG_REGISTRATION_TEST", readOnly = true)
    public JobCommand getNOTIFY_NSG_REGISTRATION_TEST() {
        return NOTIFY_NSG_REGISTRATION_TEST;
    }
    
    @VsoProperty(displayName = "NSG_NOTIFICATION_TEST", readOnly = true)
    public JobCommand getNSG_NOTIFICATION_TEST() {
        return NSG_NOTIFICATION_TEST;
    }
    
    @VsoProperty(displayName = "NSG_REGISTRATION_INFO", readOnly = true)
    public JobCommand getNSG_REGISTRATION_INFO() {
        return NSG_REGISTRATION_INFO;
    }
    
    @VsoProperty(displayName = "RELOAD", readOnly = true)
    public JobCommand getRELOAD() {
        return RELOAD;
    }
    
    @VsoProperty(displayName = "RELOAD_GEO_REDUNDANT_INFO", readOnly = true)
    public JobCommand getRELOAD_GEO_REDUNDANT_INFO() {
        return RELOAD_GEO_REDUNDANT_INFO;
    }
    
    @VsoProperty(displayName = "RELOAD_NSG_CONFIG", readOnly = true)
    public JobCommand getRELOAD_NSG_CONFIG() {
        return RELOAD_NSG_CONFIG;
    }
    
    @VsoProperty(displayName = "RETRIEVE_ACTIVE_NSGS", readOnly = true)
    public JobCommand getRETRIEVE_ACTIVE_NSGS() {
        return RETRIEVE_ACTIVE_NSGS;
    }
    
    @VsoProperty(displayName = "VCENTER_RECONNECT", readOnly = true)
    public JobCommand getVCENTER_RECONNECT() {
        return VCENTER_RECONNECT;
    }
    
    @VsoProperty(displayName = "VCENTER_RELOAD", readOnly = true)
    public JobCommand getVCENTER_RELOAD() {
        return VCENTER_RELOAD;
    }
    

    public static JobCommand getEnumById(String id) {
        for (JobCommand item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};