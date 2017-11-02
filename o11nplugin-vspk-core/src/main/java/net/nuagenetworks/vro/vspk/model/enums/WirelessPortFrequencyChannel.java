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

@VsoFinder(name = Constants.WIRELESSPORT_FREQUENCYCHANNEL_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum WirelessPortFrequencyChannel {

    CH_0("CH_0", "CH_0"), CH_1("CH_1", "CH_1"), CH_10("CH_10", "CH_10"), CH_100("CH_100", "CH_100"), CH_104("CH_104", "CH_104"), CH_108("CH_108", "CH_108"), CH_11("CH_11", "CH_11"), CH_112("CH_112", "CH_112"), CH_116("CH_116", "CH_116"), CH_12("CH_12", "CH_12"), CH_120("CH_120", "CH_120"), CH_124("CH_124", "CH_124"), CH_128("CH_128", "CH_128"), CH_13("CH_13", "CH_13"), CH_132("CH_132", "CH_132"), CH_136("CH_136", "CH_136"), CH_14("CH_14", "CH_14"), CH_140("CH_140", "CH_140"), CH_144("CH_144", "CH_144"), CH_149("CH_149", "CH_149"), CH_153("CH_153", "CH_153"), CH_157("CH_157", "CH_157"), CH_161("CH_161", "CH_161"), CH_165("CH_165", "CH_165"), CH_2("CH_2", "CH_2"), CH_3("CH_3", "CH_3"), CH_36("CH_36", "CH_36"), CH_4("CH_4", "CH_4"), CH_40("CH_40", "CH_40"), CH_44("CH_44", "CH_44"), CH_48("CH_48", "CH_48"), CH_5("CH_5", "CH_5"), CH_52("CH_52", "CH_52"), CH_56("CH_56", "CH_56"), CH_6("CH_6", "CH_6"), CH_60("CH_60", "CH_60"), CH_64("CH_64", "CH_64"), CH_7("CH_7", "CH_7"), CH_8("CH_8", "CH_8"), CH_9("CH_9", "CH_9");

    private final String id;
    private final String name;
   
    WirelessPortFrequencyChannel(String id, String name) {
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

    
    @VsoProperty(displayName = "CH_0", readOnly = true)
    public WirelessPortFrequencyChannel getCH_0() {
        return CH_0;
    }
    
    @VsoProperty(displayName = "CH_1", readOnly = true)
    public WirelessPortFrequencyChannel getCH_1() {
        return CH_1;
    }
    
    @VsoProperty(displayName = "CH_10", readOnly = true)
    public WirelessPortFrequencyChannel getCH_10() {
        return CH_10;
    }
    
    @VsoProperty(displayName = "CH_100", readOnly = true)
    public WirelessPortFrequencyChannel getCH_100() {
        return CH_100;
    }
    
    @VsoProperty(displayName = "CH_104", readOnly = true)
    public WirelessPortFrequencyChannel getCH_104() {
        return CH_104;
    }
    
    @VsoProperty(displayName = "CH_108", readOnly = true)
    public WirelessPortFrequencyChannel getCH_108() {
        return CH_108;
    }
    
    @VsoProperty(displayName = "CH_11", readOnly = true)
    public WirelessPortFrequencyChannel getCH_11() {
        return CH_11;
    }
    
    @VsoProperty(displayName = "CH_112", readOnly = true)
    public WirelessPortFrequencyChannel getCH_112() {
        return CH_112;
    }
    
    @VsoProperty(displayName = "CH_116", readOnly = true)
    public WirelessPortFrequencyChannel getCH_116() {
        return CH_116;
    }
    
    @VsoProperty(displayName = "CH_12", readOnly = true)
    public WirelessPortFrequencyChannel getCH_12() {
        return CH_12;
    }
    
    @VsoProperty(displayName = "CH_120", readOnly = true)
    public WirelessPortFrequencyChannel getCH_120() {
        return CH_120;
    }
    
    @VsoProperty(displayName = "CH_124", readOnly = true)
    public WirelessPortFrequencyChannel getCH_124() {
        return CH_124;
    }
    
    @VsoProperty(displayName = "CH_128", readOnly = true)
    public WirelessPortFrequencyChannel getCH_128() {
        return CH_128;
    }
    
    @VsoProperty(displayName = "CH_13", readOnly = true)
    public WirelessPortFrequencyChannel getCH_13() {
        return CH_13;
    }
    
    @VsoProperty(displayName = "CH_132", readOnly = true)
    public WirelessPortFrequencyChannel getCH_132() {
        return CH_132;
    }
    
    @VsoProperty(displayName = "CH_136", readOnly = true)
    public WirelessPortFrequencyChannel getCH_136() {
        return CH_136;
    }
    
    @VsoProperty(displayName = "CH_14", readOnly = true)
    public WirelessPortFrequencyChannel getCH_14() {
        return CH_14;
    }
    
    @VsoProperty(displayName = "CH_140", readOnly = true)
    public WirelessPortFrequencyChannel getCH_140() {
        return CH_140;
    }
    
    @VsoProperty(displayName = "CH_144", readOnly = true)
    public WirelessPortFrequencyChannel getCH_144() {
        return CH_144;
    }
    
    @VsoProperty(displayName = "CH_149", readOnly = true)
    public WirelessPortFrequencyChannel getCH_149() {
        return CH_149;
    }
    
    @VsoProperty(displayName = "CH_153", readOnly = true)
    public WirelessPortFrequencyChannel getCH_153() {
        return CH_153;
    }
    
    @VsoProperty(displayName = "CH_157", readOnly = true)
    public WirelessPortFrequencyChannel getCH_157() {
        return CH_157;
    }
    
    @VsoProperty(displayName = "CH_161", readOnly = true)
    public WirelessPortFrequencyChannel getCH_161() {
        return CH_161;
    }
    
    @VsoProperty(displayName = "CH_165", readOnly = true)
    public WirelessPortFrequencyChannel getCH_165() {
        return CH_165;
    }
    
    @VsoProperty(displayName = "CH_2", readOnly = true)
    public WirelessPortFrequencyChannel getCH_2() {
        return CH_2;
    }
    
    @VsoProperty(displayName = "CH_3", readOnly = true)
    public WirelessPortFrequencyChannel getCH_3() {
        return CH_3;
    }
    
    @VsoProperty(displayName = "CH_36", readOnly = true)
    public WirelessPortFrequencyChannel getCH_36() {
        return CH_36;
    }
    
    @VsoProperty(displayName = "CH_4", readOnly = true)
    public WirelessPortFrequencyChannel getCH_4() {
        return CH_4;
    }
    
    @VsoProperty(displayName = "CH_40", readOnly = true)
    public WirelessPortFrequencyChannel getCH_40() {
        return CH_40;
    }
    
    @VsoProperty(displayName = "CH_44", readOnly = true)
    public WirelessPortFrequencyChannel getCH_44() {
        return CH_44;
    }
    
    @VsoProperty(displayName = "CH_48", readOnly = true)
    public WirelessPortFrequencyChannel getCH_48() {
        return CH_48;
    }
    
    @VsoProperty(displayName = "CH_5", readOnly = true)
    public WirelessPortFrequencyChannel getCH_5() {
        return CH_5;
    }
    
    @VsoProperty(displayName = "CH_52", readOnly = true)
    public WirelessPortFrequencyChannel getCH_52() {
        return CH_52;
    }
    
    @VsoProperty(displayName = "CH_56", readOnly = true)
    public WirelessPortFrequencyChannel getCH_56() {
        return CH_56;
    }
    
    @VsoProperty(displayName = "CH_6", readOnly = true)
    public WirelessPortFrequencyChannel getCH_6() {
        return CH_6;
    }
    
    @VsoProperty(displayName = "CH_60", readOnly = true)
    public WirelessPortFrequencyChannel getCH_60() {
        return CH_60;
    }
    
    @VsoProperty(displayName = "CH_64", readOnly = true)
    public WirelessPortFrequencyChannel getCH_64() {
        return CH_64;
    }
    
    @VsoProperty(displayName = "CH_7", readOnly = true)
    public WirelessPortFrequencyChannel getCH_7() {
        return CH_7;
    }
    
    @VsoProperty(displayName = "CH_8", readOnly = true)
    public WirelessPortFrequencyChannel getCH_8() {
        return CH_8;
    }
    
    @VsoProperty(displayName = "CH_9", readOnly = true)
    public WirelessPortFrequencyChannel getCH_9() {
        return CH_9;
    }
    

    public static WirelessPortFrequencyChannel getEnumById(String id) {
        for (WirelessPortFrequencyChannel item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};