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

@VsoFinder(name = Constants.INGRESSAUDITACLENTRYTEMPLATE_NETWORKENTITYTYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum IngressAuditACLEntryTemplateNetworkEntityType {

    ENTERPRISENETWORK("ENTERPRISENETWORK", "ENTERPRISENETWORK"), NETWORKMACROGROUP("NETWORKMACROGROUP", "NETWORKMACROGROUP"), PGEXPRESSION("PGEXPRESSION", "PGEXPRESSION"), PGEXPRESSIONTEMPLATE("PGEXPRESSIONTEMPLATE", "PGEXPRESSIONTEMPLATE"), POLICYGROUP("POLICYGROUP", "POLICYGROUP"), POLICYGROUPTEMPLATE("POLICYGROUPTEMPLATE", "POLICYGROUPTEMPLATE"), PUBLICNETWORK("PUBLICNETWORK", "PUBLICNETWORK"), SAASAPPLICATIONGROUP("SAASAPPLICATIONGROUP", "SAASAPPLICATIONGROUP"), SUBNET("SUBNET", "SUBNET"), SUBNETTEMPLATE("SUBNETTEMPLATE", "SUBNETTEMPLATE"), ZONE("ZONE", "ZONE"), ZONETEMPLATE("ZONETEMPLATE", "ZONETEMPLATE");

    private final String id;
    private final String name;
   
    IngressAuditACLEntryTemplateNetworkEntityType(String id, String name) {
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

    
    @VsoProperty(displayName = "ENTERPRISENETWORK", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getENTERPRISENETWORK() {
        return ENTERPRISENETWORK;
    }
    
    @VsoProperty(displayName = "NETWORKMACROGROUP", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getNETWORKMACROGROUP() {
        return NETWORKMACROGROUP;
    }
    
    @VsoProperty(displayName = "PGEXPRESSION", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getPGEXPRESSION() {
        return PGEXPRESSION;
    }
    
    @VsoProperty(displayName = "PGEXPRESSIONTEMPLATE", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getPGEXPRESSIONTEMPLATE() {
        return PGEXPRESSIONTEMPLATE;
    }
    
    @VsoProperty(displayName = "POLICYGROUP", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getPOLICYGROUP() {
        return POLICYGROUP;
    }
    
    @VsoProperty(displayName = "POLICYGROUPTEMPLATE", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getPOLICYGROUPTEMPLATE() {
        return POLICYGROUPTEMPLATE;
    }
    
    @VsoProperty(displayName = "PUBLICNETWORK", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getPUBLICNETWORK() {
        return PUBLICNETWORK;
    }
    
    @VsoProperty(displayName = "SAASAPPLICATIONGROUP", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getSAASAPPLICATIONGROUP() {
        return SAASAPPLICATIONGROUP;
    }
    
    @VsoProperty(displayName = "SUBNET", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getSUBNET() {
        return SUBNET;
    }
    
    @VsoProperty(displayName = "SUBNETTEMPLATE", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getSUBNETTEMPLATE() {
        return SUBNETTEMPLATE;
    }
    
    @VsoProperty(displayName = "ZONE", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getZONE() {
        return ZONE;
    }
    
    @VsoProperty(displayName = "ZONETEMPLATE", readOnly = true)
    public IngressAuditACLEntryTemplateNetworkEntityType getZONETEMPLATE() {
        return ZONETEMPLATE;
    }
    

    public static IngressAuditACLEntryTemplateNetworkEntityType getEnumById(String id) {
        for (IngressAuditACLEntryTemplateNetworkEntityType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};