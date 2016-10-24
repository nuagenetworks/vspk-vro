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

@VsoFinder(name = Constants.VM_STATUS_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum VMStatus {

    BLOCKED("BLOCKED", "BLOCKED"), CRASHED("CRASHED", "CRASHED"), DELETE_PENDING("DELETE_PENDING", "DELETE_PENDING"), INIT("INIT", "INIT"), LAST("LAST", "LAST"), NOSTATE("NOSTATE", "NOSTATE"), PAUSED("PAUSED", "PAUSED"), RUNNING("RUNNING", "RUNNING"), SHUTDOWN("SHUTDOWN", "SHUTDOWN"), SHUTOFF("SHUTOFF", "SHUTOFF"), UNKNOWN("UNKNOWN", "UNKNOWN"), UNREACHABLE("UNREACHABLE", "UNREACHABLE");

    private final String id;
    private final String name;
   
    VMStatus(String id, String name) {
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
    public VMStatus getBLOCKED() {
        return BLOCKED;
    }
    
    @VsoProperty(displayName = "CRASHED", readOnly = true)
    public VMStatus getCRASHED() {
        return CRASHED;
    }
    
    @VsoProperty(displayName = "DELETE_PENDING", readOnly = true)
    public VMStatus getDELETE_PENDING() {
        return DELETE_PENDING;
    }
    
    @VsoProperty(displayName = "INIT", readOnly = true)
    public VMStatus getINIT() {
        return INIT;
    }
    
    @VsoProperty(displayName = "LAST", readOnly = true)
    public VMStatus getLAST() {
        return LAST;
    }
    
    @VsoProperty(displayName = "NOSTATE", readOnly = true)
    public VMStatus getNOSTATE() {
        return NOSTATE;
    }
    
    @VsoProperty(displayName = "PAUSED", readOnly = true)
    public VMStatus getPAUSED() {
        return PAUSED;
    }
    
    @VsoProperty(displayName = "RUNNING", readOnly = true)
    public VMStatus getRUNNING() {
        return RUNNING;
    }
    
    @VsoProperty(displayName = "SHUTDOWN", readOnly = true)
    public VMStatus getSHUTDOWN() {
        return SHUTDOWN;
    }
    
    @VsoProperty(displayName = "SHUTOFF", readOnly = true)
    public VMStatus getSHUTOFF() {
        return SHUTOFF;
    }
    
    @VsoProperty(displayName = "UNKNOWN", readOnly = true)
    public VMStatus getUNKNOWN() {
        return UNKNOWN;
    }
    
    @VsoProperty(displayName = "UNREACHABLE", readOnly = true)
    public VMStatus getUNREACHABLE() {
        return UNREACHABLE;
    }
    

    public static VMStatus getEnumById(String id) {
        for (VMStatus item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};