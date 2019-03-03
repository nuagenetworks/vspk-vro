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

    ACL_DENY_EVENT_COUNT("ACL_DENY_EVENT_COUNT", "ACL_DENY_EVENT_COUNT"), ADDRESS_MAP_EGRESS_BYTE_CNT("ADDRESS_MAP_EGRESS_BYTE_CNT", "ADDRESS_MAP_EGRESS_BYTE_CNT"), ADDRESS_MAP_EGRESS_PKT_CNT("ADDRESS_MAP_EGRESS_PKT_CNT", "ADDRESS_MAP_EGRESS_PKT_CNT"), ADDRESS_MAP_INGRESS_BYTE_CNT("ADDRESS_MAP_INGRESS_BYTE_CNT", "ADDRESS_MAP_INGRESS_BYTE_CNT"), ADDRESS_MAP_INGRESS_PKT_CNT("ADDRESS_MAP_INGRESS_PKT_CNT", "ADDRESS_MAP_INGRESS_PKT_CNT"), ANTI_SPOOF_EVENT_COUNT("ANTI_SPOOF_EVENT_COUNT", "ANTI_SPOOF_EVENT_COUNT"), BYTES_IN("BYTES_IN", "BYTES_IN"), BYTES_OUT("BYTES_OUT", "BYTES_OUT"), CONNECTION_TYPE("CONNECTION_TYPE", "CONNECTION_TYPE"), EGRESS_BYTE_COUNT("EGRESS_BYTE_COUNT", "EGRESS_BYTE_COUNT"), EGRESS_PACKET_COUNT("EGRESS_PACKET_COUNT", "EGRESS_PACKET_COUNT"), FIP_PRE_RATE_LIMIT_BYTES("FIP_PRE_RATE_LIMIT_BYTES", "FIP_PRE_RATE_LIMIT_BYTES"), FIP_PRE_RATE_LIMIT_PACKETS("FIP_PRE_RATE_LIMIT_PACKETS", "FIP_PRE_RATE_LIMIT_PACKETS"), FIP_RATE_LIMIT_DROPPED_BYTES("FIP_RATE_LIMIT_DROPPED_BYTES", "FIP_RATE_LIMIT_DROPPED_BYTES"), FIP_RATE_LIMIT_DROPPED_PACKETS("FIP_RATE_LIMIT_DROPPED_PACKETS", "FIP_RATE_LIMIT_DROPPED_PACKETS"), INGRESS_BYTE_COUNT("INGRESS_BYTE_COUNT", "INGRESS_BYTE_COUNT"), INGRESS_PACKET_COUNT("INGRESS_PACKET_COUNT", "INGRESS_PACKET_COUNT"), L7_BYTES_IN("L7_BYTES_IN", "L7_BYTES_IN"), L7_BYTES_OUT("L7_BYTES_OUT", "L7_BYTES_OUT"), L7_PACKETS_IN("L7_PACKETS_IN", "L7_PACKETS_IN"), L7_PACKETS_OUT("L7_PACKETS_OUT", "L7_PACKETS_OUT"), PACKETS_DROPPED_BY_RATE_LIMIT("PACKETS_DROPPED_BY_RATE_LIMIT", "PACKETS_DROPPED_BY_RATE_LIMIT"), PACKETS_IN("PACKETS_IN", "PACKETS_IN"), PACKETS_IN_DROPPED("PACKETS_IN_DROPPED", "PACKETS_IN_DROPPED"), PACKETS_IN_ERROR("PACKETS_IN_ERROR", "PACKETS_IN_ERROR"), PACKETS_OUT("PACKETS_OUT", "PACKETS_OUT"), PACKETS_OUT_DROPPED("PACKETS_OUT_DROPPED", "PACKETS_OUT_DROPPED"), PACKETS_OUT_ERROR("PACKETS_OUT_ERROR", "PACKETS_OUT_ERROR"), Q0_BYTES("Q0_BYTES", "Q0_BYTES"), Q0_DROPPED("Q0_DROPPED", "Q0_DROPPED"), Q0_PKT_COUNT("Q0_PKT_COUNT", "Q0_PKT_COUNT"), Q10_BYTES("Q10_BYTES", "Q10_BYTES"), Q10_DROPPED("Q10_DROPPED", "Q10_DROPPED"), Q10_PKT_COUNT("Q10_PKT_COUNT", "Q10_PKT_COUNT"), Q1_BYTES("Q1_BYTES", "Q1_BYTES"), Q1_DROPPED("Q1_DROPPED", "Q1_DROPPED"), Q1_PKT_COUNT("Q1_PKT_COUNT", "Q1_PKT_COUNT"), Q2_BYTES("Q2_BYTES", "Q2_BYTES"), Q2_DROPPED("Q2_DROPPED", "Q2_DROPPED"), Q2_PKT_COUNT("Q2_PKT_COUNT", "Q2_PKT_COUNT"), Q3_BYTES("Q3_BYTES", "Q3_BYTES"), Q3_DROPPED("Q3_DROPPED", "Q3_DROPPED"), Q3_PKT_COUNT("Q3_PKT_COUNT", "Q3_PKT_COUNT"), Q4_BYTES("Q4_BYTES", "Q4_BYTES"), Q4_DROPPED("Q4_DROPPED", "Q4_DROPPED"), Q4_PKT_COUNT("Q4_PKT_COUNT", "Q4_PKT_COUNT"), RX_BYTES("RX_BYTES", "RX_BYTES"), RX_DROPPED("RX_DROPPED", "RX_DROPPED"), RX_ERRORS("RX_ERRORS", "RX_ERRORS"), RX_PKT_COUNT("RX_PKT_COUNT", "RX_PKT_COUNT"), TCP_FLAG_ACK_IN("TCP_FLAG_ACK_IN", "TCP_FLAG_ACK_IN"), TCP_FLAG_ACK_OUT("TCP_FLAG_ACK_OUT", "TCP_FLAG_ACK_OUT"), TCP_FLAG_NULL_IN("TCP_FLAG_NULL_IN", "TCP_FLAG_NULL_IN"), TCP_FLAG_NULL_OUT("TCP_FLAG_NULL_OUT", "TCP_FLAG_NULL_OUT"), TCP_FLAG_RST_IN("TCP_FLAG_RST_IN", "TCP_FLAG_RST_IN"), TCP_FLAG_RST_OUT("TCP_FLAG_RST_OUT", "TCP_FLAG_RST_OUT"), TCP_FLAG_SYN_IN("TCP_FLAG_SYN_IN", "TCP_FLAG_SYN_IN"), TCP_FLAG_SYN_OUT("TCP_FLAG_SYN_OUT", "TCP_FLAG_SYN_OUT"), TCP_SYN_EVENT_COUNT("TCP_SYN_EVENT_COUNT", "TCP_SYN_EVENT_COUNT"), TX_BYTES("TX_BYTES", "TX_BYTES"), TX_DROPPED("TX_DROPPED", "TX_DROPPED"), TX_ERRORS("TX_ERRORS", "TX_ERRORS"), TX_PKT_COUNT("TX_PKT_COUNT", "TX_PKT_COUNT");

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

    
    @VsoProperty(displayName = "ACL_DENY_EVENT_COUNT", readOnly = true)
    public TCAMetric getACL_DENY_EVENT_COUNT() {
        return ACL_DENY_EVENT_COUNT;
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
    
    @VsoProperty(displayName = "ANTI_SPOOF_EVENT_COUNT", readOnly = true)
    public TCAMetric getANTI_SPOOF_EVENT_COUNT() {
        return ANTI_SPOOF_EVENT_COUNT;
    }
    
    @VsoProperty(displayName = "BYTES_IN", readOnly = true)
    public TCAMetric getBYTES_IN() {
        return BYTES_IN;
    }
    
    @VsoProperty(displayName = "BYTES_OUT", readOnly = true)
    public TCAMetric getBYTES_OUT() {
        return BYTES_OUT;
    }
    
    @VsoProperty(displayName = "CONNECTION_TYPE", readOnly = true)
    public TCAMetric getCONNECTION_TYPE() {
        return CONNECTION_TYPE;
    }
    
    @VsoProperty(displayName = "EGRESS_BYTE_COUNT", readOnly = true)
    public TCAMetric getEGRESS_BYTE_COUNT() {
        return EGRESS_BYTE_COUNT;
    }
    
    @VsoProperty(displayName = "EGRESS_PACKET_COUNT", readOnly = true)
    public TCAMetric getEGRESS_PACKET_COUNT() {
        return EGRESS_PACKET_COUNT;
    }
    
    @VsoProperty(displayName = "FIP_PRE_RATE_LIMIT_BYTES", readOnly = true)
    public TCAMetric getFIP_PRE_RATE_LIMIT_BYTES() {
        return FIP_PRE_RATE_LIMIT_BYTES;
    }
    
    @VsoProperty(displayName = "FIP_PRE_RATE_LIMIT_PACKETS", readOnly = true)
    public TCAMetric getFIP_PRE_RATE_LIMIT_PACKETS() {
        return FIP_PRE_RATE_LIMIT_PACKETS;
    }
    
    @VsoProperty(displayName = "FIP_RATE_LIMIT_DROPPED_BYTES", readOnly = true)
    public TCAMetric getFIP_RATE_LIMIT_DROPPED_BYTES() {
        return FIP_RATE_LIMIT_DROPPED_BYTES;
    }
    
    @VsoProperty(displayName = "FIP_RATE_LIMIT_DROPPED_PACKETS", readOnly = true)
    public TCAMetric getFIP_RATE_LIMIT_DROPPED_PACKETS() {
        return FIP_RATE_LIMIT_DROPPED_PACKETS;
    }
    
    @VsoProperty(displayName = "INGRESS_BYTE_COUNT", readOnly = true)
    public TCAMetric getINGRESS_BYTE_COUNT() {
        return INGRESS_BYTE_COUNT;
    }
    
    @VsoProperty(displayName = "INGRESS_PACKET_COUNT", readOnly = true)
    public TCAMetric getINGRESS_PACKET_COUNT() {
        return INGRESS_PACKET_COUNT;
    }
    
    @VsoProperty(displayName = "L7_BYTES_IN", readOnly = true)
    public TCAMetric getL7_BYTES_IN() {
        return L7_BYTES_IN;
    }
    
    @VsoProperty(displayName = "L7_BYTES_OUT", readOnly = true)
    public TCAMetric getL7_BYTES_OUT() {
        return L7_BYTES_OUT;
    }
    
    @VsoProperty(displayName = "L7_PACKETS_IN", readOnly = true)
    public TCAMetric getL7_PACKETS_IN() {
        return L7_PACKETS_IN;
    }
    
    @VsoProperty(displayName = "L7_PACKETS_OUT", readOnly = true)
    public TCAMetric getL7_PACKETS_OUT() {
        return L7_PACKETS_OUT;
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
    
    @VsoProperty(displayName = "Q0_BYTES", readOnly = true)
    public TCAMetric getQ0_BYTES() {
        return Q0_BYTES;
    }
    
    @VsoProperty(displayName = "Q0_DROPPED", readOnly = true)
    public TCAMetric getQ0_DROPPED() {
        return Q0_DROPPED;
    }
    
    @VsoProperty(displayName = "Q0_PKT_COUNT", readOnly = true)
    public TCAMetric getQ0_PKT_COUNT() {
        return Q0_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "Q10_BYTES", readOnly = true)
    public TCAMetric getQ10_BYTES() {
        return Q10_BYTES;
    }
    
    @VsoProperty(displayName = "Q10_DROPPED", readOnly = true)
    public TCAMetric getQ10_DROPPED() {
        return Q10_DROPPED;
    }
    
    @VsoProperty(displayName = "Q10_PKT_COUNT", readOnly = true)
    public TCAMetric getQ10_PKT_COUNT() {
        return Q10_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "Q1_BYTES", readOnly = true)
    public TCAMetric getQ1_BYTES() {
        return Q1_BYTES;
    }
    
    @VsoProperty(displayName = "Q1_DROPPED", readOnly = true)
    public TCAMetric getQ1_DROPPED() {
        return Q1_DROPPED;
    }
    
    @VsoProperty(displayName = "Q1_PKT_COUNT", readOnly = true)
    public TCAMetric getQ1_PKT_COUNT() {
        return Q1_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "Q2_BYTES", readOnly = true)
    public TCAMetric getQ2_BYTES() {
        return Q2_BYTES;
    }
    
    @VsoProperty(displayName = "Q2_DROPPED", readOnly = true)
    public TCAMetric getQ2_DROPPED() {
        return Q2_DROPPED;
    }
    
    @VsoProperty(displayName = "Q2_PKT_COUNT", readOnly = true)
    public TCAMetric getQ2_PKT_COUNT() {
        return Q2_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "Q3_BYTES", readOnly = true)
    public TCAMetric getQ3_BYTES() {
        return Q3_BYTES;
    }
    
    @VsoProperty(displayName = "Q3_DROPPED", readOnly = true)
    public TCAMetric getQ3_DROPPED() {
        return Q3_DROPPED;
    }
    
    @VsoProperty(displayName = "Q3_PKT_COUNT", readOnly = true)
    public TCAMetric getQ3_PKT_COUNT() {
        return Q3_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "Q4_BYTES", readOnly = true)
    public TCAMetric getQ4_BYTES() {
        return Q4_BYTES;
    }
    
    @VsoProperty(displayName = "Q4_DROPPED", readOnly = true)
    public TCAMetric getQ4_DROPPED() {
        return Q4_DROPPED;
    }
    
    @VsoProperty(displayName = "Q4_PKT_COUNT", readOnly = true)
    public TCAMetric getQ4_PKT_COUNT() {
        return Q4_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "RX_BYTES", readOnly = true)
    public TCAMetric getRX_BYTES() {
        return RX_BYTES;
    }
    
    @VsoProperty(displayName = "RX_DROPPED", readOnly = true)
    public TCAMetric getRX_DROPPED() {
        return RX_DROPPED;
    }
    
    @VsoProperty(displayName = "RX_ERRORS", readOnly = true)
    public TCAMetric getRX_ERRORS() {
        return RX_ERRORS;
    }
    
    @VsoProperty(displayName = "RX_PKT_COUNT", readOnly = true)
    public TCAMetric getRX_PKT_COUNT() {
        return RX_PKT_COUNT;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_ACK_IN", readOnly = true)
    public TCAMetric getTCP_FLAG_ACK_IN() {
        return TCP_FLAG_ACK_IN;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_ACK_OUT", readOnly = true)
    public TCAMetric getTCP_FLAG_ACK_OUT() {
        return TCP_FLAG_ACK_OUT;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_NULL_IN", readOnly = true)
    public TCAMetric getTCP_FLAG_NULL_IN() {
        return TCP_FLAG_NULL_IN;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_NULL_OUT", readOnly = true)
    public TCAMetric getTCP_FLAG_NULL_OUT() {
        return TCP_FLAG_NULL_OUT;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_RST_IN", readOnly = true)
    public TCAMetric getTCP_FLAG_RST_IN() {
        return TCP_FLAG_RST_IN;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_RST_OUT", readOnly = true)
    public TCAMetric getTCP_FLAG_RST_OUT() {
        return TCP_FLAG_RST_OUT;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_SYN_IN", readOnly = true)
    public TCAMetric getTCP_FLAG_SYN_IN() {
        return TCP_FLAG_SYN_IN;
    }
    
    @VsoProperty(displayName = "TCP_FLAG_SYN_OUT", readOnly = true)
    public TCAMetric getTCP_FLAG_SYN_OUT() {
        return TCP_FLAG_SYN_OUT;
    }
    
    @VsoProperty(displayName = "TCP_SYN_EVENT_COUNT", readOnly = true)
    public TCAMetric getTCP_SYN_EVENT_COUNT() {
        return TCP_SYN_EVENT_COUNT;
    }
    
    @VsoProperty(displayName = "TX_BYTES", readOnly = true)
    public TCAMetric getTX_BYTES() {
        return TX_BYTES;
    }
    
    @VsoProperty(displayName = "TX_DROPPED", readOnly = true)
    public TCAMetric getTX_DROPPED() {
        return TX_DROPPED;
    }
    
    @VsoProperty(displayName = "TX_ERRORS", readOnly = true)
    public TCAMetric getTX_ERRORS() {
        return TX_ERRORS;
    }
    
    @VsoProperty(displayName = "TX_PKT_COUNT", readOnly = true)
    public TCAMetric getTX_PKT_COUNT() {
        return TX_PKT_COUNT;
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