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

@VsoFinder(name = Constants.GNMISESSION_SUBSCRIPTIONSTATE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum GNMISessionSubscriptionState {

    COMPLETED("COMPLETED", "COMPLETED"), FAILED("FAILED", "FAILED"), INIT("INIT", "INIT"), IN_PROGRESS("IN_PROGRESS", "IN_PROGRESS");

    private final String id;
    private final String name;
   
    GNMISessionSubscriptionState(String id, String name) {
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

    
    @VsoProperty(displayName = "COMPLETED", readOnly = true)
    public GNMISessionSubscriptionState getCOMPLETED() {
        return COMPLETED;
    }
    
    @VsoProperty(displayName = "FAILED", readOnly = true)
    public GNMISessionSubscriptionState getFAILED() {
        return FAILED;
    }
    
    @VsoProperty(displayName = "INIT", readOnly = true)
    public GNMISessionSubscriptionState getINIT() {
        return INIT;
    }
    
    @VsoProperty(displayName = "IN_PROGRESS", readOnly = true)
    public GNMISessionSubscriptionState getIN_PROGRESS() {
        return IN_PROGRESS;
    }
    

    public static GNMISessionSubscriptionState getEnumById(String id) {
        for (GNMISessionSubscriptionState item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};