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

@VsoFinder(name = Constants.VM_REASONTYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum VMReasonType {

    BLOCKED_LAST("BLOCKED_LAST", "BLOCKED_LAST"), BLOCKED_UNKNOWN("BLOCKED_UNKNOWN", "BLOCKED_UNKNOWN"), CRASHED_LAST("CRASHED_LAST", "CRASHED_LAST"), CRASHED_UNKNOWN("CRASHED_UNKNOWN", "CRASHED_UNKNOWN"), NOSTATE_LAST("NOSTATE_LAST", "NOSTATE_LAST"), NOSTATE_UNKNOWN("NOSTATE_UNKNOWN", "NOSTATE_UNKNOWN"), PAUSED_DUMP("PAUSED_DUMP", "PAUSED_DUMP"), PAUSED_FROM_SNAPSHOT("PAUSED_FROM_SNAPSHOT", "PAUSED_FROM_SNAPSHOT"), PAUSED_IOERROR("PAUSED_IOERROR", "PAUSED_IOERROR"), PAUSED_LAST("PAUSED_LAST", "PAUSED_LAST"), PAUSED_MIGRATION("PAUSED_MIGRATION", "PAUSED_MIGRATION"), PAUSED_SAVE("PAUSED_SAVE", "PAUSED_SAVE"), PAUSED_SHUTTING_DOWN("PAUSED_SHUTTING_DOWN", "PAUSED_SHUTTING_DOWN"), PAUSED_UNKNOWN("PAUSED_UNKNOWN", "PAUSED_UNKNOWN"), PAUSED_USER("PAUSED_USER", "PAUSED_USER"), PAUSED_WATCHDOG("PAUSED_WATCHDOG", "PAUSED_WATCHDOG"), RUNNING_BOOTED("RUNNING_BOOTED", "RUNNING_BOOTED"), RUNNING_FROM_SNAPSHOT("RUNNING_FROM_SNAPSHOT", "RUNNING_FROM_SNAPSHOT"), RUNNING_LAST("RUNNING_LAST", "RUNNING_LAST"), RUNNING_MIGRATED("RUNNING_MIGRATED", "RUNNING_MIGRATED"), RUNNING_MIGRATION_CANCELED("RUNNING_MIGRATION_CANCELED", "RUNNING_MIGRATION_CANCELED"), RUNNING_RESTORED("RUNNING_RESTORED", "RUNNING_RESTORED"), RUNNING_SAVE_CANCELED("RUNNING_SAVE_CANCELED", "RUNNING_SAVE_CANCELED"), RUNNING_UNKNOWN("RUNNING_UNKNOWN", "RUNNING_UNKNOWN"), RUNNING_UNPAUSED("RUNNING_UNPAUSED", "RUNNING_UNPAUSED"), SHUTDOWN_LAST("SHUTDOWN_LAST", "SHUTDOWN_LAST"), SHUTDOWN_UNKNOWN("SHUTDOWN_UNKNOWN", "SHUTDOWN_UNKNOWN"), SHUTDOWN_USER("SHUTDOWN_USER", "SHUTDOWN_USER"), SHUTOFF_CRASHED("SHUTOFF_CRASHED", "SHUTOFF_CRASHED"), SHUTOFF_DESTROYED("SHUTOFF_DESTROYED", "SHUTOFF_DESTROYED"), SHUTOFF_FAILED("SHUTOFF_FAILED", "SHUTOFF_FAILED"), SHUTOFF_FROM_SNAPSHOT("SHUTOFF_FROM_SNAPSHOT", "SHUTOFF_FROM_SNAPSHOT"), SHUTOFF_LAST("SHUTOFF_LAST", "SHUTOFF_LAST"), SHUTOFF_MIGRATED("SHUTOFF_MIGRATED", "SHUTOFF_MIGRATED"), SHUTOFF_SAVED("SHUTOFF_SAVED", "SHUTOFF_SAVED"), SHUTOFF_SHUTDOWN("SHUTOFF_SHUTDOWN", "SHUTOFF_SHUTDOWN"), SHUTOFF_UNKNOWN("SHUTOFF_UNKNOWN", "SHUTOFF_UNKNOWN"), UNKNOWN("UNKNOWN", "UNKNOWN");

    private final String id;
    private final String name;
   
    VMReasonType(String id, String name) {
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

    
    @VsoProperty(displayName = "BLOCKED_LAST", readOnly = true)
    public VMReasonType getBLOCKED_LAST() {
        return BLOCKED_LAST;
    }
    
    @VsoProperty(displayName = "BLOCKED_UNKNOWN", readOnly = true)
    public VMReasonType getBLOCKED_UNKNOWN() {
        return BLOCKED_UNKNOWN;
    }
    
    @VsoProperty(displayName = "CRASHED_LAST", readOnly = true)
    public VMReasonType getCRASHED_LAST() {
        return CRASHED_LAST;
    }
    
    @VsoProperty(displayName = "CRASHED_UNKNOWN", readOnly = true)
    public VMReasonType getCRASHED_UNKNOWN() {
        return CRASHED_UNKNOWN;
    }
    
    @VsoProperty(displayName = "NOSTATE_LAST", readOnly = true)
    public VMReasonType getNOSTATE_LAST() {
        return NOSTATE_LAST;
    }
    
    @VsoProperty(displayName = "NOSTATE_UNKNOWN", readOnly = true)
    public VMReasonType getNOSTATE_UNKNOWN() {
        return NOSTATE_UNKNOWN;
    }
    
    @VsoProperty(displayName = "PAUSED_DUMP", readOnly = true)
    public VMReasonType getPAUSED_DUMP() {
        return PAUSED_DUMP;
    }
    
    @VsoProperty(displayName = "PAUSED_FROM_SNAPSHOT", readOnly = true)
    public VMReasonType getPAUSED_FROM_SNAPSHOT() {
        return PAUSED_FROM_SNAPSHOT;
    }
    
    @VsoProperty(displayName = "PAUSED_IOERROR", readOnly = true)
    public VMReasonType getPAUSED_IOERROR() {
        return PAUSED_IOERROR;
    }
    
    @VsoProperty(displayName = "PAUSED_LAST", readOnly = true)
    public VMReasonType getPAUSED_LAST() {
        return PAUSED_LAST;
    }
    
    @VsoProperty(displayName = "PAUSED_MIGRATION", readOnly = true)
    public VMReasonType getPAUSED_MIGRATION() {
        return PAUSED_MIGRATION;
    }
    
    @VsoProperty(displayName = "PAUSED_SAVE", readOnly = true)
    public VMReasonType getPAUSED_SAVE() {
        return PAUSED_SAVE;
    }
    
    @VsoProperty(displayName = "PAUSED_SHUTTING_DOWN", readOnly = true)
    public VMReasonType getPAUSED_SHUTTING_DOWN() {
        return PAUSED_SHUTTING_DOWN;
    }
    
    @VsoProperty(displayName = "PAUSED_UNKNOWN", readOnly = true)
    public VMReasonType getPAUSED_UNKNOWN() {
        return PAUSED_UNKNOWN;
    }
    
    @VsoProperty(displayName = "PAUSED_USER", readOnly = true)
    public VMReasonType getPAUSED_USER() {
        return PAUSED_USER;
    }
    
    @VsoProperty(displayName = "PAUSED_WATCHDOG", readOnly = true)
    public VMReasonType getPAUSED_WATCHDOG() {
        return PAUSED_WATCHDOG;
    }
    
    @VsoProperty(displayName = "RUNNING_BOOTED", readOnly = true)
    public VMReasonType getRUNNING_BOOTED() {
        return RUNNING_BOOTED;
    }
    
    @VsoProperty(displayName = "RUNNING_FROM_SNAPSHOT", readOnly = true)
    public VMReasonType getRUNNING_FROM_SNAPSHOT() {
        return RUNNING_FROM_SNAPSHOT;
    }
    
    @VsoProperty(displayName = "RUNNING_LAST", readOnly = true)
    public VMReasonType getRUNNING_LAST() {
        return RUNNING_LAST;
    }
    
    @VsoProperty(displayName = "RUNNING_MIGRATED", readOnly = true)
    public VMReasonType getRUNNING_MIGRATED() {
        return RUNNING_MIGRATED;
    }
    
    @VsoProperty(displayName = "RUNNING_MIGRATION_CANCELED", readOnly = true)
    public VMReasonType getRUNNING_MIGRATION_CANCELED() {
        return RUNNING_MIGRATION_CANCELED;
    }
    
    @VsoProperty(displayName = "RUNNING_RESTORED", readOnly = true)
    public VMReasonType getRUNNING_RESTORED() {
        return RUNNING_RESTORED;
    }
    
    @VsoProperty(displayName = "RUNNING_SAVE_CANCELED", readOnly = true)
    public VMReasonType getRUNNING_SAVE_CANCELED() {
        return RUNNING_SAVE_CANCELED;
    }
    
    @VsoProperty(displayName = "RUNNING_UNKNOWN", readOnly = true)
    public VMReasonType getRUNNING_UNKNOWN() {
        return RUNNING_UNKNOWN;
    }
    
    @VsoProperty(displayName = "RUNNING_UNPAUSED", readOnly = true)
    public VMReasonType getRUNNING_UNPAUSED() {
        return RUNNING_UNPAUSED;
    }
    
    @VsoProperty(displayName = "SHUTDOWN_LAST", readOnly = true)
    public VMReasonType getSHUTDOWN_LAST() {
        return SHUTDOWN_LAST;
    }
    
    @VsoProperty(displayName = "SHUTDOWN_UNKNOWN", readOnly = true)
    public VMReasonType getSHUTDOWN_UNKNOWN() {
        return SHUTDOWN_UNKNOWN;
    }
    
    @VsoProperty(displayName = "SHUTDOWN_USER", readOnly = true)
    public VMReasonType getSHUTDOWN_USER() {
        return SHUTDOWN_USER;
    }
    
    @VsoProperty(displayName = "SHUTOFF_CRASHED", readOnly = true)
    public VMReasonType getSHUTOFF_CRASHED() {
        return SHUTOFF_CRASHED;
    }
    
    @VsoProperty(displayName = "SHUTOFF_DESTROYED", readOnly = true)
    public VMReasonType getSHUTOFF_DESTROYED() {
        return SHUTOFF_DESTROYED;
    }
    
    @VsoProperty(displayName = "SHUTOFF_FAILED", readOnly = true)
    public VMReasonType getSHUTOFF_FAILED() {
        return SHUTOFF_FAILED;
    }
    
    @VsoProperty(displayName = "SHUTOFF_FROM_SNAPSHOT", readOnly = true)
    public VMReasonType getSHUTOFF_FROM_SNAPSHOT() {
        return SHUTOFF_FROM_SNAPSHOT;
    }
    
    @VsoProperty(displayName = "SHUTOFF_LAST", readOnly = true)
    public VMReasonType getSHUTOFF_LAST() {
        return SHUTOFF_LAST;
    }
    
    @VsoProperty(displayName = "SHUTOFF_MIGRATED", readOnly = true)
    public VMReasonType getSHUTOFF_MIGRATED() {
        return SHUTOFF_MIGRATED;
    }
    
    @VsoProperty(displayName = "SHUTOFF_SAVED", readOnly = true)
    public VMReasonType getSHUTOFF_SAVED() {
        return SHUTOFF_SAVED;
    }
    
    @VsoProperty(displayName = "SHUTOFF_SHUTDOWN", readOnly = true)
    public VMReasonType getSHUTOFF_SHUTDOWN() {
        return SHUTOFF_SHUTDOWN;
    }
    
    @VsoProperty(displayName = "SHUTOFF_UNKNOWN", readOnly = true)
    public VMReasonType getSHUTOFF_UNKNOWN() {
        return SHUTOFF_UNKNOWN;
    }
    
    @VsoProperty(displayName = "UNKNOWN", readOnly = true)
    public VMReasonType getUNKNOWN() {
        return UNKNOWN;
    }
    

    public static VMReasonType getEnumById(String id) {
        for (VMReasonType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};