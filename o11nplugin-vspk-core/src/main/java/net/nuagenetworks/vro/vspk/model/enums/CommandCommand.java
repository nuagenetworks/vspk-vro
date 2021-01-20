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

@VsoFinder(name = Constants.COMMAND_COMMAND_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum CommandCommand {

    NSG_APPLY_PATCH("NSG_APPLY_PATCH", "NSG_APPLY_PATCH"), NSG_CONTAINER_TEST_SUITE_RUN("NSG_CONTAINER_TEST_SUITE_RUN", "NSG_CONTAINER_TEST_SUITE_RUN"), NSG_DELETE_PATCH("NSG_DELETE_PATCH", "NSG_DELETE_PATCH"), NSG_DOWNLOAD_OS_IMAGE("NSG_DOWNLOAD_OS_IMAGE", "NSG_DOWNLOAD_OS_IMAGE"), NSG_OVERLAY_SYSLOG_CONTAINER_RESTART("NSG_OVERLAY_SYSLOG_CONTAINER_RESTART", "NSG_OVERLAY_SYSLOG_CONTAINER_RESTART"), NSG_OVERLAY_SYSLOG_CONTAINER_START("NSG_OVERLAY_SYSLOG_CONTAINER_START", "NSG_OVERLAY_SYSLOG_CONTAINER_START"), NSG_OVERLAY_SYSLOG_CONTAINER_STOP("NSG_OVERLAY_SYSLOG_CONTAINER_STOP", "NSG_OVERLAY_SYSLOG_CONTAINER_STOP"), NSG_REBOOT("NSG_REBOOT", "NSG_REBOOT"), NSG_RENEW_CERT("NSG_RENEW_CERT", "NSG_RENEW_CERT"), NSG_UPDATE_INFO("NSG_UPDATE_INFO", "NSG_UPDATE_INFO"), NSG_UPGRADE_TO_IMAGE("NSG_UPGRADE_TO_IMAGE", "NSG_UPGRADE_TO_IMAGE"), UNKNOWN("UNKNOWN", "UNKNOWN");

    private final String id;
    private final String name;
   
    CommandCommand(String id, String name) {
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

    
    @VsoProperty(displayName = "NSG_APPLY_PATCH", readOnly = true)
    public CommandCommand getNSG_APPLY_PATCH() {
        return NSG_APPLY_PATCH;
    }
    
    @VsoProperty(displayName = "NSG_CONTAINER_TEST_SUITE_RUN", readOnly = true)
    public CommandCommand getNSG_CONTAINER_TEST_SUITE_RUN() {
        return NSG_CONTAINER_TEST_SUITE_RUN;
    }
    
    @VsoProperty(displayName = "NSG_DELETE_PATCH", readOnly = true)
    public CommandCommand getNSG_DELETE_PATCH() {
        return NSG_DELETE_PATCH;
    }
    
    @VsoProperty(displayName = "NSG_DOWNLOAD_OS_IMAGE", readOnly = true)
    public CommandCommand getNSG_DOWNLOAD_OS_IMAGE() {
        return NSG_DOWNLOAD_OS_IMAGE;
    }
    
    @VsoProperty(displayName = "NSG_OVERLAY_SYSLOG_CONTAINER_RESTART", readOnly = true)
    public CommandCommand getNSG_OVERLAY_SYSLOG_CONTAINER_RESTART() {
        return NSG_OVERLAY_SYSLOG_CONTAINER_RESTART;
    }
    
    @VsoProperty(displayName = "NSG_OVERLAY_SYSLOG_CONTAINER_START", readOnly = true)
    public CommandCommand getNSG_OVERLAY_SYSLOG_CONTAINER_START() {
        return NSG_OVERLAY_SYSLOG_CONTAINER_START;
    }
    
    @VsoProperty(displayName = "NSG_OVERLAY_SYSLOG_CONTAINER_STOP", readOnly = true)
    public CommandCommand getNSG_OVERLAY_SYSLOG_CONTAINER_STOP() {
        return NSG_OVERLAY_SYSLOG_CONTAINER_STOP;
    }
    
    @VsoProperty(displayName = "NSG_REBOOT", readOnly = true)
    public CommandCommand getNSG_REBOOT() {
        return NSG_REBOOT;
    }
    
    @VsoProperty(displayName = "NSG_RENEW_CERT", readOnly = true)
    public CommandCommand getNSG_RENEW_CERT() {
        return NSG_RENEW_CERT;
    }
    
    @VsoProperty(displayName = "NSG_UPDATE_INFO", readOnly = true)
    public CommandCommand getNSG_UPDATE_INFO() {
        return NSG_UPDATE_INFO;
    }
    
    @VsoProperty(displayName = "NSG_UPGRADE_TO_IMAGE", readOnly = true)
    public CommandCommand getNSG_UPGRADE_TO_IMAGE() {
        return NSG_UPGRADE_TO_IMAGE;
    }
    
    @VsoProperty(displayName = "UNKNOWN", readOnly = true)
    public CommandCommand getUNKNOWN() {
        return UNKNOWN;
    }
    

    public static CommandCommand getEnumById(String id) {
        for (CommandCommand item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};