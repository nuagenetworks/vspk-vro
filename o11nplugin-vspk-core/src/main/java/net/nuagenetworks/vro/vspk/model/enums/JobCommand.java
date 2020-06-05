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

    APPLICATION_SIGNATURE_IMPORT("APPLICATION_SIGNATURE_IMPORT", "APPLICATION_SIGNATURE_IMPORT"), APPLY_POLICY_CHANGES("APPLY_POLICY_CHANGES", "APPLY_POLICY_CHANGES"), ASSIGN_SELF_REBOOTSTRAP_REQ("ASSIGN_SELF_REBOOTSTRAP_REQ", "ASSIGN_SELF_REBOOTSTRAP_REQ"), BATCH_CRUD_REQUEST("BATCH_CRUD_REQUEST", "BATCH_CRUD_REQUEST"), BEGIN_POLICY_CHANGES("BEGIN_POLICY_CHANGES", "BEGIN_POLICY_CHANGES"), CERTIFICATE_NSG_RENEW("CERTIFICATE_NSG_RENEW", "CERTIFICATE_NSG_RENEW"), CERTIFICATE_NSG_REVOKE("CERTIFICATE_NSG_REVOKE", "CERTIFICATE_NSG_REVOKE"), CLEAR_IPSEC_DATA("CLEAR_IPSEC_DATA", "CLEAR_IPSEC_DATA"), CLEAR_MAC_MOVE_ALARMS("CLEAR_MAC_MOVE_ALARMS", "CLEAR_MAC_MOVE_ALARMS"), CLOUD_FORCE_CONFIG("CLOUD_FORCE_CONFIG", "CLOUD_FORCE_CONFIG"), CLOUD_SYNC("CLOUD_SYNC", "CLOUD_SYNC"), DEPLOY("DEPLOY", "DEPLOY"), DISCARD_POLICY_CHANGES("DISCARD_POLICY_CHANGES", "DISCARD_POLICY_CHANGES"), EXPORT("EXPORT", "EXPORT"), FORCE_KEYSERVER_UPDATE("FORCE_KEYSERVER_UPDATE", "FORCE_KEYSERVER_UPDATE"), FORCE_KEYSERVER_UPDATE_ACK("FORCE_KEYSERVER_UPDATE_ACK", "FORCE_KEYSERVER_UPDATE_ACK"), FORCE_KEYSERVER_VSD_RESYNC("FORCE_KEYSERVER_VSD_RESYNC", "FORCE_KEYSERVER_VSD_RESYNC"), GATEWAY_AUDIT("GATEWAY_AUDIT", "GATEWAY_AUDIT"), GET_ZFB_INFO("GET_ZFB_INFO", "GET_ZFB_INFO"), IMPORT("IMPORT", "IMPORT"), KEYSERVER_NOTIFICATION_TEST("KEYSERVER_NOTIFICATION_TEST", "KEYSERVER_NOTIFICATION_TEST"), NETCONF_FORCE_DEPLOY("NETCONF_FORCE_DEPLOY", "NETCONF_FORCE_DEPLOY"), NETCONF_SYNC("NETCONF_SYNC", "NETCONF_SYNC"), NOTIFY_NSG_REGISTRATION("NOTIFY_NSG_REGISTRATION", "NOTIFY_NSG_REGISTRATION"), NOTIFY_NSG_REGISTRATION_ACK("NOTIFY_NSG_REGISTRATION_ACK", "NOTIFY_NSG_REGISTRATION_ACK"), NOTIFY_NSG_REGISTRATION_TEST("NOTIFY_NSG_REGISTRATION_TEST", "NOTIFY_NSG_REGISTRATION_TEST"), NSG_LIFT_QUARANTINE("NSG_LIFT_QUARANTINE", "NSG_LIFT_QUARANTINE"), NSG_NOTIFICATION_TEST("NSG_NOTIFICATION_TEST", "NSG_NOTIFICATION_TEST"), NSG_QUARANTINE("NSG_QUARANTINE", "NSG_QUARANTINE"), NSG_REGISTRATION_INFO("NSG_REGISTRATION_INFO", "NSG_REGISTRATION_INFO"), NSG_VALIDATE_CONFIGURATION("NSG_VALIDATE_CONFIGURATION", "NSG_VALIDATE_CONFIGURATION"), PUBSUBNODE_AUDIT("PUBSUBNODE_AUDIT", "PUBSUBNODE_AUDIT"), RECOVER_NSG("RECOVER_NSG", "RECOVER_NSG"), REDEPLOY("REDEPLOY", "REDEPLOY"), REJECT_ZFB_REQUEST("REJECT_ZFB_REQUEST", "REJECT_ZFB_REQUEST"), RELOAD("RELOAD", "RELOAD"), RELOAD_GEO_REDUNDANT_INFO("RELOAD_GEO_REDUNDANT_INFO", "RELOAD_GEO_REDUNDANT_INFO"), RELOAD_NSG_CONFIG("RELOAD_NSG_CONFIG", "RELOAD_NSG_CONFIG"), RESTART("RESTART", "RESTART"), RETRIEVE_ACTIVE_NSGS("RETRIEVE_ACTIVE_NSGS", "RETRIEVE_ACTIVE_NSGS"), SAAS_APPLICATION_TYPE("SAAS_APPLICATION_TYPE", "SAAS_APPLICATION_TYPE"), START("START", "START"), STATUS("STATUS", "STATUS"), STOP("STOP", "STOP"), SYNC("SYNC", "SYNC"), UNDEPLOY("UNDEPLOY", "UNDEPLOY"), VCENTER_ADD_COMPUTERESOURCE_INSCOPE("VCENTER_ADD_COMPUTERESOURCE_INSCOPE", "VCENTER_ADD_COMPUTERESOURCE_INSCOPE"), VCENTER_DELETE_AGENCY("VCENTER_DELETE_AGENCY", "VCENTER_DELETE_AGENCY"), VCENTER_MARK_AGENT_VM_AVAILABLE("VCENTER_MARK_AGENT_VM_AVAILABLE", "VCENTER_MARK_AGENT_VM_AVAILABLE"), VCENTER_RECONNECT("VCENTER_RECONNECT", "VCENTER_RECONNECT"), VCENTER_RELOAD("VCENTER_RELOAD", "VCENTER_RELOAD"), VCENTER_REMOVE_COMPUTERESOURCE_INSCOPE("VCENTER_REMOVE_COMPUTERESOURCE_INSCOPE", "VCENTER_REMOVE_COMPUTERESOURCE_INSCOPE"), VCENTER_SCRIPT_UPGRADE_VRS("VCENTER_SCRIPT_UPGRADE_VRS", "VCENTER_SCRIPT_UPGRADE_VRS"), VCENTER_SYNC("VCENTER_SYNC", "VCENTER_SYNC"), VCENTER_UPGRADE_VRS("VCENTER_UPGRADE_VRS", "VCENTER_UPGRADE_VRS");

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

    
    @VsoProperty(displayName = "APPLICATION_SIGNATURE_IMPORT", readOnly = true)
    public JobCommand getAPPLICATION_SIGNATURE_IMPORT() {
        return APPLICATION_SIGNATURE_IMPORT;
    }
    
    @VsoProperty(displayName = "APPLY_POLICY_CHANGES", readOnly = true)
    public JobCommand getAPPLY_POLICY_CHANGES() {
        return APPLY_POLICY_CHANGES;
    }
    
    @VsoProperty(displayName = "ASSIGN_SELF_REBOOTSTRAP_REQ", readOnly = true)
    public JobCommand getASSIGN_SELF_REBOOTSTRAP_REQ() {
        return ASSIGN_SELF_REBOOTSTRAP_REQ;
    }
    
    @VsoProperty(displayName = "BATCH_CRUD_REQUEST", readOnly = true)
    public JobCommand getBATCH_CRUD_REQUEST() {
        return BATCH_CRUD_REQUEST;
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
    
    @VsoProperty(displayName = "CLEAR_MAC_MOVE_ALARMS", readOnly = true)
    public JobCommand getCLEAR_MAC_MOVE_ALARMS() {
        return CLEAR_MAC_MOVE_ALARMS;
    }
    
    @VsoProperty(displayName = "CLOUD_FORCE_CONFIG", readOnly = true)
    public JobCommand getCLOUD_FORCE_CONFIG() {
        return CLOUD_FORCE_CONFIG;
    }
    
    @VsoProperty(displayName = "CLOUD_SYNC", readOnly = true)
    public JobCommand getCLOUD_SYNC() {
        return CLOUD_SYNC;
    }
    
    @VsoProperty(displayName = "DEPLOY", readOnly = true)
    public JobCommand getDEPLOY() {
        return DEPLOY;
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
    
    @VsoProperty(displayName = "NETCONF_FORCE_DEPLOY", readOnly = true)
    public JobCommand getNETCONF_FORCE_DEPLOY() {
        return NETCONF_FORCE_DEPLOY;
    }
    
    @VsoProperty(displayName = "NETCONF_SYNC", readOnly = true)
    public JobCommand getNETCONF_SYNC() {
        return NETCONF_SYNC;
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
    
    @VsoProperty(displayName = "NSG_LIFT_QUARANTINE", readOnly = true)
    public JobCommand getNSG_LIFT_QUARANTINE() {
        return NSG_LIFT_QUARANTINE;
    }
    
    @VsoProperty(displayName = "NSG_NOTIFICATION_TEST", readOnly = true)
    public JobCommand getNSG_NOTIFICATION_TEST() {
        return NSG_NOTIFICATION_TEST;
    }
    
    @VsoProperty(displayName = "NSG_QUARANTINE", readOnly = true)
    public JobCommand getNSG_QUARANTINE() {
        return NSG_QUARANTINE;
    }
    
    @VsoProperty(displayName = "NSG_REGISTRATION_INFO", readOnly = true)
    public JobCommand getNSG_REGISTRATION_INFO() {
        return NSG_REGISTRATION_INFO;
    }
    
    @VsoProperty(displayName = "NSG_VALIDATE_CONFIGURATION", readOnly = true)
    public JobCommand getNSG_VALIDATE_CONFIGURATION() {
        return NSG_VALIDATE_CONFIGURATION;
    }
    
    @VsoProperty(displayName = "PUBSUBNODE_AUDIT", readOnly = true)
    public JobCommand getPUBSUBNODE_AUDIT() {
        return PUBSUBNODE_AUDIT;
    }
    
    @VsoProperty(displayName = "RECOVER_NSG", readOnly = true)
    public JobCommand getRECOVER_NSG() {
        return RECOVER_NSG;
    }
    
    @VsoProperty(displayName = "REDEPLOY", readOnly = true)
    public JobCommand getREDEPLOY() {
        return REDEPLOY;
    }
    
    @VsoProperty(displayName = "REJECT_ZFB_REQUEST", readOnly = true)
    public JobCommand getREJECT_ZFB_REQUEST() {
        return REJECT_ZFB_REQUEST;
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
    
    @VsoProperty(displayName = "RESTART", readOnly = true)
    public JobCommand getRESTART() {
        return RESTART;
    }
    
    @VsoProperty(displayName = "RETRIEVE_ACTIVE_NSGS", readOnly = true)
    public JobCommand getRETRIEVE_ACTIVE_NSGS() {
        return RETRIEVE_ACTIVE_NSGS;
    }
    
    @VsoProperty(displayName = "SAAS_APPLICATION_TYPE", readOnly = true)
    public JobCommand getSAAS_APPLICATION_TYPE() {
        return SAAS_APPLICATION_TYPE;
    }
    
    @VsoProperty(displayName = "START", readOnly = true)
    public JobCommand getSTART() {
        return START;
    }
    
    @VsoProperty(displayName = "STATUS", readOnly = true)
    public JobCommand getSTATUS() {
        return STATUS;
    }
    
    @VsoProperty(displayName = "STOP", readOnly = true)
    public JobCommand getSTOP() {
        return STOP;
    }
    
    @VsoProperty(displayName = "SYNC", readOnly = true)
    public JobCommand getSYNC() {
        return SYNC;
    }
    
    @VsoProperty(displayName = "UNDEPLOY", readOnly = true)
    public JobCommand getUNDEPLOY() {
        return UNDEPLOY;
    }
    
    @VsoProperty(displayName = "VCENTER_ADD_COMPUTERESOURCE_INSCOPE", readOnly = true)
    public JobCommand getVCENTER_ADD_COMPUTERESOURCE_INSCOPE() {
        return VCENTER_ADD_COMPUTERESOURCE_INSCOPE;
    }
    
    @VsoProperty(displayName = "VCENTER_DELETE_AGENCY", readOnly = true)
    public JobCommand getVCENTER_DELETE_AGENCY() {
        return VCENTER_DELETE_AGENCY;
    }
    
    @VsoProperty(displayName = "VCENTER_MARK_AGENT_VM_AVAILABLE", readOnly = true)
    public JobCommand getVCENTER_MARK_AGENT_VM_AVAILABLE() {
        return VCENTER_MARK_AGENT_VM_AVAILABLE;
    }
    
    @VsoProperty(displayName = "VCENTER_RECONNECT", readOnly = true)
    public JobCommand getVCENTER_RECONNECT() {
        return VCENTER_RECONNECT;
    }
    
    @VsoProperty(displayName = "VCENTER_RELOAD", readOnly = true)
    public JobCommand getVCENTER_RELOAD() {
        return VCENTER_RELOAD;
    }
    
    @VsoProperty(displayName = "VCENTER_REMOVE_COMPUTERESOURCE_INSCOPE", readOnly = true)
    public JobCommand getVCENTER_REMOVE_COMPUTERESOURCE_INSCOPE() {
        return VCENTER_REMOVE_COMPUTERESOURCE_INSCOPE;
    }
    
    @VsoProperty(displayName = "VCENTER_SCRIPT_UPGRADE_VRS", readOnly = true)
    public JobCommand getVCENTER_SCRIPT_UPGRADE_VRS() {
        return VCENTER_SCRIPT_UPGRADE_VRS;
    }
    
    @VsoProperty(displayName = "VCENTER_SYNC", readOnly = true)
    public JobCommand getVCENTER_SYNC() {
        return VCENTER_SYNC;
    }
    
    @VsoProperty(displayName = "VCENTER_UPGRADE_VRS", readOnly = true)
    public JobCommand getVCENTER_UPGRADE_VRS() {
        return VCENTER_UPGRADE_VRS;
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