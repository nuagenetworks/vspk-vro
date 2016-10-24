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

@VsoFinder(name = Constants.DOMAINFIPACLTEMPLATEENTRY_NETWORKTYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum DomainFIPAclTemplateEntryNetworkType {

    ANY("ANY", "ANY"), ENDPOINT_DOMAIN("ENDPOINT_DOMAIN", "ENDPOINT_DOMAIN"), ENDPOINT_SUBNET("ENDPOINT_SUBNET", "ENDPOINT_SUBNET"), ENDPOINT_ZONE("ENDPOINT_ZONE", "ENDPOINT_ZONE"), ENTERPRISE_NETWORK("ENTERPRISE_NETWORK", "ENTERPRISE_NETWORK"), INTERNET_POLICYGROUP("INTERNET_POLICYGROUP", "INTERNET_POLICYGROUP"), NETWORK_MACRO_GROUP("NETWORK_MACRO_GROUP", "NETWORK_MACRO_GROUP"), POLICYGROUP("POLICYGROUP", "POLICYGROUP"), PUBLIC_NETWORK("PUBLIC_NETWORK", "PUBLIC_NETWORK"), SUBNET("SUBNET", "SUBNET"), ZONE("ZONE", "ZONE");

    private final String id;
    private final String name;
   
    DomainFIPAclTemplateEntryNetworkType(String id, String name) {
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

    
    @VsoProperty(displayName = "ANY", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getANY() {
        return ANY;
    }
    
    @VsoProperty(displayName = "ENDPOINT_DOMAIN", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getENDPOINT_DOMAIN() {
        return ENDPOINT_DOMAIN;
    }
    
    @VsoProperty(displayName = "ENDPOINT_SUBNET", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getENDPOINT_SUBNET() {
        return ENDPOINT_SUBNET;
    }
    
    @VsoProperty(displayName = "ENDPOINT_ZONE", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getENDPOINT_ZONE() {
        return ENDPOINT_ZONE;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_NETWORK", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getENTERPRISE_NETWORK() {
        return ENTERPRISE_NETWORK;
    }
    
    @VsoProperty(displayName = "INTERNET_POLICYGROUP", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getINTERNET_POLICYGROUP() {
        return INTERNET_POLICYGROUP;
    }
    
    @VsoProperty(displayName = "NETWORK_MACRO_GROUP", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getNETWORK_MACRO_GROUP() {
        return NETWORK_MACRO_GROUP;
    }
    
    @VsoProperty(displayName = "POLICYGROUP", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getPOLICYGROUP() {
        return POLICYGROUP;
    }
    
    @VsoProperty(displayName = "PUBLIC_NETWORK", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getPUBLIC_NETWORK() {
        return PUBLIC_NETWORK;
    }
    
    @VsoProperty(displayName = "SUBNET", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getSUBNET() {
        return SUBNET;
    }
    
    @VsoProperty(displayName = "ZONE", readOnly = true)
    public DomainFIPAclTemplateEntryNetworkType getZONE() {
        return ZONE;
    }
    

    public static DomainFIPAclTemplateEntryNetworkType getEnumById(String id) {
        for (DomainFIPAclTemplateEntryNetworkType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};