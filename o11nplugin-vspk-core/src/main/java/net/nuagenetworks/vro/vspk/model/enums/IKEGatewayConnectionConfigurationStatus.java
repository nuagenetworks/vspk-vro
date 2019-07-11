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

@VsoFinder(name = Constants.IKEGATEWAYCONNECTION_CONFIGURATIONSTATUS_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum IKEGatewayConnectionConfigurationStatus {

    CANCELING("CANCELING", "CANCELING"), CANCELLED("CANCELLED", "CANCELLED"), CLOUD_CONFIGURATION_REMOVED("CLOUD_CONFIGURATION_REMOVED", "CLOUD_CONFIGURATION_REMOVED"), FAILED("FAILED", "FAILED"), IN_PROGRESS("IN_PROGRESS", "IN_PROGRESS"), NOT_APPLICABLE("NOT_APPLICABLE", "NOT_APPLICABLE"), PAUSING("PAUSING", "PAUSING"), SUCCESS("SUCCESS", "SUCCESS"), SYNCED_FROM_CLOUD("SYNCED_FROM_CLOUD", "SYNCED_FROM_CLOUD"), UNKNOWN("UNKNOWN", "UNKNOWN"), WAITING("WAITING", "WAITING"), WAITING_FOR_RESOURCES("WAITING_FOR_RESOURCES", "WAITING_FOR_RESOURCES");

    private final String id;
    private final String name;
   
    IKEGatewayConnectionConfigurationStatus(String id, String name) {
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

    
    @VsoProperty(displayName = "CANCELING", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getCANCELING() {
        return CANCELING;
    }
    
    @VsoProperty(displayName = "CANCELLED", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getCANCELLED() {
        return CANCELLED;
    }
    
    @VsoProperty(displayName = "CLOUD_CONFIGURATION_REMOVED", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getCLOUD_CONFIGURATION_REMOVED() {
        return CLOUD_CONFIGURATION_REMOVED;
    }
    
    @VsoProperty(displayName = "FAILED", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getFAILED() {
        return FAILED;
    }
    
    @VsoProperty(displayName = "IN_PROGRESS", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getIN_PROGRESS() {
        return IN_PROGRESS;
    }
    
    @VsoProperty(displayName = "NOT_APPLICABLE", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getNOT_APPLICABLE() {
        return NOT_APPLICABLE;
    }
    
    @VsoProperty(displayName = "PAUSING", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getPAUSING() {
        return PAUSING;
    }
    
    @VsoProperty(displayName = "SUCCESS", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getSUCCESS() {
        return SUCCESS;
    }
    
    @VsoProperty(displayName = "SYNCED_FROM_CLOUD", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getSYNCED_FROM_CLOUD() {
        return SYNCED_FROM_CLOUD;
    }
    
    @VsoProperty(displayName = "UNKNOWN", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getUNKNOWN() {
        return UNKNOWN;
    }
    
    @VsoProperty(displayName = "WAITING", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getWAITING() {
        return WAITING;
    }
    
    @VsoProperty(displayName = "WAITING_FOR_RESOURCES", readOnly = true)
    public IKEGatewayConnectionConfigurationStatus getWAITING_FOR_RESOURCES() {
        return WAITING_FOR_RESOURCES;
    }
    

    public static IKEGatewayConnectionConfigurationStatus getEnumById(String id) {
        for (IKEGatewayConnectionConfigurationStatus item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};