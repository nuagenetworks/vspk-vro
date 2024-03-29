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

@VsoFinder(name = Constants.NSGATEWAYSUMMARY_BOOTSTRAPSTATUS_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum NSGatewaySummaryBootstrapStatus {

    ACTIVE("ACTIVE", "ACTIVE"), CERTIFICATE_SIGNED("CERTIFICATE_SIGNED", "CERTIFICATE_SIGNED"), INACTIVE("INACTIVE", "INACTIVE"), MIGRATING("MIGRATING", "MIGRATING"), NOTIFICATION_APP_REQ_ACK("NOTIFICATION_APP_REQ_ACK", "NOTIFICATION_APP_REQ_ACK"), NOTIFICATION_APP_REQ_SENT("NOTIFICATION_APP_REQ_SENT", "NOTIFICATION_APP_REQ_SENT"), QUARANTINED("QUARANTINED", "QUARANTINED"), REVOKED("REVOKED", "REVOKED");

    private final String id;
    private final String name;
   
    NSGatewaySummaryBootstrapStatus(String id, String name) {
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

    
    @VsoProperty(displayName = "ACTIVE", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getACTIVE() {
        return ACTIVE;
    }
    
    @VsoProperty(displayName = "CERTIFICATE_SIGNED", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getCERTIFICATE_SIGNED() {
        return CERTIFICATE_SIGNED;
    }
    
    @VsoProperty(displayName = "INACTIVE", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getINACTIVE() {
        return INACTIVE;
    }
    
    @VsoProperty(displayName = "MIGRATING", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getMIGRATING() {
        return MIGRATING;
    }
    
    @VsoProperty(displayName = "NOTIFICATION_APP_REQ_ACK", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getNOTIFICATION_APP_REQ_ACK() {
        return NOTIFICATION_APP_REQ_ACK;
    }
    
    @VsoProperty(displayName = "NOTIFICATION_APP_REQ_SENT", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getNOTIFICATION_APP_REQ_SENT() {
        return NOTIFICATION_APP_REQ_SENT;
    }
    
    @VsoProperty(displayName = "QUARANTINED", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getQUARANTINED() {
        return QUARANTINED;
    }
    
    @VsoProperty(displayName = "REVOKED", readOnly = true)
    public NSGatewaySummaryBootstrapStatus getREVOKED() {
        return REVOKED;
    }
    

    public static NSGatewaySummaryBootstrapStatus getEnumById(String id) {
        for (NSGatewaySummaryBootstrapStatus item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};