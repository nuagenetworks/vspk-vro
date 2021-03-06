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

@VsoFinder(name = Constants.EGRESSQOSPOLICY_QUEUE4FORWARDINGCLASSES_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum EgressQOSPolicyQueue4ForwardingClasses {

    A("A", "A"), B("B", "B"), C("C", "C"), D("D", "D"), E("E", "E"), F("F", "F"), G("G", "G"), H("H", "H"), NONE("NONE", "NONE");

    private final String id;
    private final String name;
   
    EgressQOSPolicyQueue4ForwardingClasses(String id, String name) {
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

    
    @VsoProperty(displayName = "A", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getA() {
        return A;
    }
    
    @VsoProperty(displayName = "B", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getB() {
        return B;
    }
    
    @VsoProperty(displayName = "C", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getC() {
        return C;
    }
    
    @VsoProperty(displayName = "D", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getD() {
        return D;
    }
    
    @VsoProperty(displayName = "E", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getE() {
        return E;
    }
    
    @VsoProperty(displayName = "F", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getF() {
        return F;
    }
    
    @VsoProperty(displayName = "G", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getG() {
        return G;
    }
    
    @VsoProperty(displayName = "H", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getH() {
        return H;
    }
    
    @VsoProperty(displayName = "NONE", readOnly = true)
    public EgressQOSPolicyQueue4ForwardingClasses getNONE() {
        return NONE;
    }
    

    public static EgressQOSPolicyQueue4ForwardingClasses getEnumById(String id) {
        for (EgressQOSPolicyQueue4ForwardingClasses item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};