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

@VsoFinder(name = Constants.TCA_METRIC_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum TCAMetric {

    ADDRESS_MAP_EGRESS_BYTE_CNT("ADDRESS_MAP_EGRESS_BYTE_CNT", "ADDRESS_MAP_EGRESS_BYTE_CNT"), ADDRESS_MAP_EGRESS_PKT_CNT("ADDRESS_MAP_EGRESS_PKT_CNT", "ADDRESS_MAP_EGRESS_PKT_CNT"), ADDRESS_MAP_INGRESS_BYTE_CNT("ADDRESS_MAP_INGRESS_BYTE_CNT", "ADDRESS_MAP_INGRESS_BYTE_CNT"), ADDRESS_MAP_INGRESS_PKT_CNT("ADDRESS_MAP_INGRESS_PKT_CNT", "ADDRESS_MAP_INGRESS_PKT_CNT"), BYTES_IN("BYTES_IN", "BYTES_IN"), BYTES_OUT("BYTES_OUT", "BYTES_OUT"), EGRESS_BYTE_COUNT("EGRESS_BYTE_COUNT", "EGRESS_BYTE_COUNT"), EGRESS_PACKET_COUNT("EGRESS_PACKET_COUNT", "EGRESS_PACKET_COUNT"), INGRESS_BYTE_COUNT("INGRESS_BYTE_COUNT", "INGRESS_BYTE_COUNT"), INGRESS_PACKET_COUNT("INGRESS_PACKET_COUNT", "INGRESS_PACKET_COUNT"), PACKETS_DROPPED_BY_RATE_LIMIT("PACKETS_DROPPED_BY_RATE_LIMIT", "PACKETS_DROPPED_BY_RATE_LIMIT"), PACKETS_IN("PACKETS_IN", "PACKETS_IN"), PACKETS_IN_DROPPED("PACKETS_IN_DROPPED", "PACKETS_IN_DROPPED"), PACKETS_IN_ERROR("PACKETS_IN_ERROR", "PACKETS_IN_ERROR"), PACKETS_OUT("PACKETS_OUT", "PACKETS_OUT"), PACKETS_OUT_DROPPED("PACKETS_OUT_DROPPED", "PACKETS_OUT_DROPPED"), PACKETS_OUT_ERROR("PACKETS_OUT_ERROR", "PACKETS_OUT_ERROR");

    private final String id;
    private final String name;
   
    TCAMetric(String id, String name) {
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

    
    @VsoProperty(displayName = "ADDRESS_MAP_EGRESS_BYTE_CNT", readOnly = true)
    public TCAMetric getADDRESS_MAP_EGRESS_BYTE_CNT() {
        return ADDRESS_MAP_EGRESS_BYTE_CNT;
    }
    
    @VsoProperty(displayName = "ADDRESS_MAP_EGRESS_PKT_CNT", readOnly = true)
    public TCAMetric getADDRESS_MAP_EGRESS_PKT_CNT() {
        return ADDRESS_MAP_EGRESS_PKT_CNT;
    }
    
    @VsoProperty(displayName = "ADDRESS_MAP_INGRESS_BYTE_CNT", readOnly = true)
    public TCAMetric getADDRESS_MAP_INGRESS_BYTE_CNT() {
        return ADDRESS_MAP_INGRESS_BYTE_CNT;
    }
    
    @VsoProperty(displayName = "ADDRESS_MAP_INGRESS_PKT_CNT", readOnly = true)
    public TCAMetric getADDRESS_MAP_INGRESS_PKT_CNT() {
        return ADDRESS_MAP_INGRESS_PKT_CNT;
    }
    
    @VsoProperty(displayName = "BYTES_IN", readOnly = true)
    public TCAMetric getBYTES_IN() {
        return BYTES_IN;
    }
    
    @VsoProperty(displayName = "BYTES_OUT", readOnly = true)
    public TCAMetric getBYTES_OUT() {
        return BYTES_OUT;
    }
    
    @VsoProperty(displayName = "EGRESS_BYTE_COUNT", readOnly = true)
    public TCAMetric getEGRESS_BYTE_COUNT() {
        return EGRESS_BYTE_COUNT;
    }
    
    @VsoProperty(displayName = "EGRESS_PACKET_COUNT", readOnly = true)
    public TCAMetric getEGRESS_PACKET_COUNT() {
        return EGRESS_PACKET_COUNT;
    }
    
    @VsoProperty(displayName = "INGRESS_BYTE_COUNT", readOnly = true)
    public TCAMetric getINGRESS_BYTE_COUNT() {
        return INGRESS_BYTE_COUNT;
    }
    
    @VsoProperty(displayName = "INGRESS_PACKET_COUNT", readOnly = true)
    public TCAMetric getINGRESS_PACKET_COUNT() {
        return INGRESS_PACKET_COUNT;
    }
    
    @VsoProperty(displayName = "PACKETS_DROPPED_BY_RATE_LIMIT", readOnly = true)
    public TCAMetric getPACKETS_DROPPED_BY_RATE_LIMIT() {
        return PACKETS_DROPPED_BY_RATE_LIMIT;
    }
    
    @VsoProperty(displayName = "PACKETS_IN", readOnly = true)
    public TCAMetric getPACKETS_IN() {
        return PACKETS_IN;
    }
    
    @VsoProperty(displayName = "PACKETS_IN_DROPPED", readOnly = true)
    public TCAMetric getPACKETS_IN_DROPPED() {
        return PACKETS_IN_DROPPED;
    }
    
    @VsoProperty(displayName = "PACKETS_IN_ERROR", readOnly = true)
    public TCAMetric getPACKETS_IN_ERROR() {
        return PACKETS_IN_ERROR;
    }
    
    @VsoProperty(displayName = "PACKETS_OUT", readOnly = true)
    public TCAMetric getPACKETS_OUT() {
        return PACKETS_OUT;
    }
    
    @VsoProperty(displayName = "PACKETS_OUT_DROPPED", readOnly = true)
    public TCAMetric getPACKETS_OUT_DROPPED() {
        return PACKETS_OUT_DROPPED;
    }
    
    @VsoProperty(displayName = "PACKETS_OUT_ERROR", readOnly = true)
    public TCAMetric getPACKETS_OUT_ERROR() {
        return PACKETS_OUT_ERROR;
    }
    

    public static TCAMetric getEnumById(String id) {
        for (TCAMetric item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};