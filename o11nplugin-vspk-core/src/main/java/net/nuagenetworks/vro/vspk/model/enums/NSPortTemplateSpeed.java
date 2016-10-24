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

@VsoFinder(name = Constants.NSPORTTEMPLATE_SPEED_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum NSPortTemplateSpeed {

    AUTONEGOTIATE("AUTONEGOTIATE", "AUTONEGOTIATE"), BASET10("BASET10", "BASET10"), BASET1000("BASET1000", "BASET1000"), BASETX100("BASETX100", "BASETX100"), BASEX10G("BASEX10G", "BASEX10G");

    private final String id;
    private final String name;
   
    NSPortTemplateSpeed(String id, String name) {
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

    
    @VsoProperty(displayName = "AUTONEGOTIATE", readOnly = true)
    public NSPortTemplateSpeed getAUTONEGOTIATE() {
        return AUTONEGOTIATE;
    }
    
    @VsoProperty(displayName = "BASET10", readOnly = true)
    public NSPortTemplateSpeed getBASET10() {
        return BASET10;
    }
    
    @VsoProperty(displayName = "BASET1000", readOnly = true)
    public NSPortTemplateSpeed getBASET1000() {
        return BASET1000;
    }
    
    @VsoProperty(displayName = "BASETX100", readOnly = true)
    public NSPortTemplateSpeed getBASETX100() {
        return BASETX100;
    }
    
    @VsoProperty(displayName = "BASEX10G", readOnly = true)
    public NSPortTemplateSpeed getBASEX10G() {
        return BASEX10G;
    }
    

    public static NSPortTemplateSpeed getEnumById(String id) {
        for (NSPortTemplateSpeed item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};