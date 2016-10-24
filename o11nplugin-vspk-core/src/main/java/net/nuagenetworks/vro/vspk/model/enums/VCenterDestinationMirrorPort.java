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

@VsoFinder(name = Constants.VCENTER_DESTINATIONMIRRORPORT_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum VCenterDestinationMirrorPort {

    ens160("ens160", "ens160"), ens161("ens161", "ens161"), ens224("ens224", "ens224"), ens256("ens256", "ens256"), no_mirror("no_mirror", "no_mirror");

    private final String id;
    private final String name;
   
    VCenterDestinationMirrorPort(String id, String name) {
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

    
    @VsoProperty(displayName = "ens160", readOnly = true)
    public VCenterDestinationMirrorPort getens160() {
        return ens160;
    }
    
    @VsoProperty(displayName = "ens161", readOnly = true)
    public VCenterDestinationMirrorPort getens161() {
        return ens161;
    }
    
    @VsoProperty(displayName = "ens224", readOnly = true)
    public VCenterDestinationMirrorPort getens224() {
        return ens224;
    }
    
    @VsoProperty(displayName = "ens256", readOnly = true)
    public VCenterDestinationMirrorPort getens256() {
        return ens256;
    }
    
    @VsoProperty(displayName = "no_mirror", readOnly = true)
    public VCenterDestinationMirrorPort getno_mirror() {
        return no_mirror;
    }
    

    public static VCenterDestinationMirrorPort getEnumById(String id) {
        for (VCenterDestinationMirrorPort item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};