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

@VsoFinder(name = Constants.VNF_STATUS_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum VNFStatus {

    BLOCKED("BLOCKED", "BLOCKED"), CRASHED("CRASHED", "CRASHED"), DYING("DYING", "DYING"), IDLE("IDLE", "IDLE"), INIT("INIT", "INIT"), LAST("LAST", "LAST"), PAUSED("PAUSED", "PAUSED"), PMSUSPENDED("PMSUSPENDED", "PMSUSPENDED"), RUNNING("RUNNING", "RUNNING"), SHUTDOWN("SHUTDOWN", "SHUTDOWN"), SHUTOFF("SHUTOFF", "SHUTOFF");

    private final String id;
    private final String name;
   
    VNFStatus(String id, String name) {
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

    
    @VsoProperty(displayName = "BLOCKED", readOnly = true)
    public VNFStatus getBLOCKED() {
        return BLOCKED;
    }
    
    @VsoProperty(displayName = "CRASHED", readOnly = true)
    public VNFStatus getCRASHED() {
        return CRASHED;
    }
    
    @VsoProperty(displayName = "DYING", readOnly = true)
    public VNFStatus getDYING() {
        return DYING;
    }
    
    @VsoProperty(displayName = "IDLE", readOnly = true)
    public VNFStatus getIDLE() {
        return IDLE;
    }
    
    @VsoProperty(displayName = "INIT", readOnly = true)
    public VNFStatus getINIT() {
        return INIT;
    }
    
    @VsoProperty(displayName = "LAST", readOnly = true)
    public VNFStatus getLAST() {
        return LAST;
    }
    
    @VsoProperty(displayName = "PAUSED", readOnly = true)
    public VNFStatus getPAUSED() {
        return PAUSED;
    }
    
    @VsoProperty(displayName = "PMSUSPENDED", readOnly = true)
    public VNFStatus getPMSUSPENDED() {
        return PMSUSPENDED;
    }
    
    @VsoProperty(displayName = "RUNNING", readOnly = true)
    public VNFStatus getRUNNING() {
        return RUNNING;
    }
    
    @VsoProperty(displayName = "SHUTDOWN", readOnly = true)
    public VNFStatus getSHUTDOWN() {
        return SHUTDOWN;
    }
    
    @VsoProperty(displayName = "SHUTOFF", readOnly = true)
    public VNFStatus getSHUTOFF() {
        return SHUTOFF;
    }
    

    public static VNFStatus getEnumById(String id) {
        for (VNFStatus item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};