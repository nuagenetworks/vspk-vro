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

@VsoFinder(name = Constants.NETCONFGATEWAY_FAMILY_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum NetconfGatewayFamily {

    ANY("ANY", "ANY"), NSG_AMI("NSG_AMI", "NSG_AMI"), NSG_AZ("NSG_AZ", "NSG_AZ"), NSG_C("NSG_C", "NSG_C"), NSG_E("NSG_E", "NSG_E"), NSG_E200("NSG_E200", "NSG_E200"), NSG_E300("NSG_E300", "NSG_E300"), NSG_V("NSG_V", "NSG_V"), NSG_X("NSG_X", "NSG_X"), NSG_X200("NSG_X200", "NSG_X200"), VRS("VRS", "VRS");

    private final String id;
    private final String name;
   
    NetconfGatewayFamily(String id, String name) {
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
    public NetconfGatewayFamily getANY() {
        return ANY;
    }
    
    @VsoProperty(displayName = "NSG_AMI", readOnly = true)
    public NetconfGatewayFamily getNSG_AMI() {
        return NSG_AMI;
    }
    
    @VsoProperty(displayName = "NSG_AZ", readOnly = true)
    public NetconfGatewayFamily getNSG_AZ() {
        return NSG_AZ;
    }
    
    @VsoProperty(displayName = "NSG_C", readOnly = true)
    public NetconfGatewayFamily getNSG_C() {
        return NSG_C;
    }
    
    @VsoProperty(displayName = "NSG_E", readOnly = true)
    public NetconfGatewayFamily getNSG_E() {
        return NSG_E;
    }
    
    @VsoProperty(displayName = "NSG_E200", readOnly = true)
    public NetconfGatewayFamily getNSG_E200() {
        return NSG_E200;
    }
    
    @VsoProperty(displayName = "NSG_E300", readOnly = true)
    public NetconfGatewayFamily getNSG_E300() {
        return NSG_E300;
    }
    
    @VsoProperty(displayName = "NSG_V", readOnly = true)
    public NetconfGatewayFamily getNSG_V() {
        return NSG_V;
    }
    
    @VsoProperty(displayName = "NSG_X", readOnly = true)
    public NetconfGatewayFamily getNSG_X() {
        return NSG_X;
    }
    
    @VsoProperty(displayName = "NSG_X200", readOnly = true)
    public NetconfGatewayFamily getNSG_X200() {
        return NSG_X200;
    }
    
    @VsoProperty(displayName = "VRS", readOnly = true)
    public NetconfGatewayFamily getVRS() {
        return VRS;
    }
    

    public static NetconfGatewayFamily getEnumById(String id) {
        for (NetconfGatewayFamily item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};