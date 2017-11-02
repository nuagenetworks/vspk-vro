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

@VsoFinder(name = Constants.WIRELESSPORT_COUNTRYCODE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum WirelessPortCountryCode {

    AT("AT", "AT"), AU("AU", "AU"), BE("BE", "BE"), BR("BR", "BR"), CA("CA", "CA"), CH("CH", "CH"), CN("CN", "CN"), CY("CY", "CY"), CZ("CZ", "CZ"), DE("DE", "DE"), DK("DK", "DK"), EE("EE", "EE"), ES("ES", "ES"), FI("FI", "FI"), FR("FR", "FR"), GB("GB", "GB"), GR("GR", "GR"), HK("HK", "HK"), HU("HU", "HU"), ID("ID", "ID"), IE("IE", "IE"), IL("IL", "IL"), IN("IN", "IN"), IT("IT", "IT"), JP("JP", "JP"), KR("KR", "KR"), LT("LT", "LT"), LU("LU", "LU"), LV("LV", "LV"), MY("MY", "MY"), NL("NL", "NL"), NO("NO", "NO"), NZ("NZ", "NZ"), PH("PH", "PH"), PL("PL", "PL"), PT("PT", "PT"), SE("SE", "SE"), SG("SG", "SG"), SI("SI", "SI"), SK("SK", "SK"), TH("TH", "TH"), TW("TW", "TW"), US("US", "US"), ZA("ZA", "ZA");

    private final String id;
    private final String name;
   
    WirelessPortCountryCode(String id, String name) {
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

    
    @VsoProperty(displayName = "AT", readOnly = true)
    public WirelessPortCountryCode getAT() {
        return AT;
    }
    
    @VsoProperty(displayName = "AU", readOnly = true)
    public WirelessPortCountryCode getAU() {
        return AU;
    }
    
    @VsoProperty(displayName = "BE", readOnly = true)
    public WirelessPortCountryCode getBE() {
        return BE;
    }
    
    @VsoProperty(displayName = "BR", readOnly = true)
    public WirelessPortCountryCode getBR() {
        return BR;
    }
    
    @VsoProperty(displayName = "CA", readOnly = true)
    public WirelessPortCountryCode getCA() {
        return CA;
    }
    
    @VsoProperty(displayName = "CH", readOnly = true)
    public WirelessPortCountryCode getCH() {
        return CH;
    }
    
    @VsoProperty(displayName = "CN", readOnly = true)
    public WirelessPortCountryCode getCN() {
        return CN;
    }
    
    @VsoProperty(displayName = "CY", readOnly = true)
    public WirelessPortCountryCode getCY() {
        return CY;
    }
    
    @VsoProperty(displayName = "CZ", readOnly = true)
    public WirelessPortCountryCode getCZ() {
        return CZ;
    }
    
    @VsoProperty(displayName = "DE", readOnly = true)
    public WirelessPortCountryCode getDE() {
        return DE;
    }
    
    @VsoProperty(displayName = "DK", readOnly = true)
    public WirelessPortCountryCode getDK() {
        return DK;
    }
    
    @VsoProperty(displayName = "EE", readOnly = true)
    public WirelessPortCountryCode getEE() {
        return EE;
    }
    
    @VsoProperty(displayName = "ES", readOnly = true)
    public WirelessPortCountryCode getES() {
        return ES;
    }
    
    @VsoProperty(displayName = "FI", readOnly = true)
    public WirelessPortCountryCode getFI() {
        return FI;
    }
    
    @VsoProperty(displayName = "FR", readOnly = true)
    public WirelessPortCountryCode getFR() {
        return FR;
    }
    
    @VsoProperty(displayName = "GB", readOnly = true)
    public WirelessPortCountryCode getGB() {
        return GB;
    }
    
    @VsoProperty(displayName = "GR", readOnly = true)
    public WirelessPortCountryCode getGR() {
        return GR;
    }
    
    @VsoProperty(displayName = "HK", readOnly = true)
    public WirelessPortCountryCode getHK() {
        return HK;
    }
    
    @VsoProperty(displayName = "HU", readOnly = true)
    public WirelessPortCountryCode getHU() {
        return HU;
    }
    
    @VsoProperty(displayName = "ID", readOnly = true)
    public WirelessPortCountryCode getID() {
        return ID;
    }
    
    @VsoProperty(displayName = "IE", readOnly = true)
    public WirelessPortCountryCode getIE() {
        return IE;
    }
    
    @VsoProperty(displayName = "IL", readOnly = true)
    public WirelessPortCountryCode getIL() {
        return IL;
    }
    
    @VsoProperty(displayName = "IN", readOnly = true)
    public WirelessPortCountryCode getIN() {
        return IN;
    }
    
    @VsoProperty(displayName = "IT", readOnly = true)
    public WirelessPortCountryCode getIT() {
        return IT;
    }
    
    @VsoProperty(displayName = "JP", readOnly = true)
    public WirelessPortCountryCode getJP() {
        return JP;
    }
    
    @VsoProperty(displayName = "KR", readOnly = true)
    public WirelessPortCountryCode getKR() {
        return KR;
    }
    
    @VsoProperty(displayName = "LT", readOnly = true)
    public WirelessPortCountryCode getLT() {
        return LT;
    }
    
    @VsoProperty(displayName = "LU", readOnly = true)
    public WirelessPortCountryCode getLU() {
        return LU;
    }
    
    @VsoProperty(displayName = "LV", readOnly = true)
    public WirelessPortCountryCode getLV() {
        return LV;
    }
    
    @VsoProperty(displayName = "MY", readOnly = true)
    public WirelessPortCountryCode getMY() {
        return MY;
    }
    
    @VsoProperty(displayName = "NL", readOnly = true)
    public WirelessPortCountryCode getNL() {
        return NL;
    }
    
    @VsoProperty(displayName = "NO", readOnly = true)
    public WirelessPortCountryCode getNO() {
        return NO;
    }
    
    @VsoProperty(displayName = "NZ", readOnly = true)
    public WirelessPortCountryCode getNZ() {
        return NZ;
    }
    
    @VsoProperty(displayName = "PH", readOnly = true)
    public WirelessPortCountryCode getPH() {
        return PH;
    }
    
    @VsoProperty(displayName = "PL", readOnly = true)
    public WirelessPortCountryCode getPL() {
        return PL;
    }
    
    @VsoProperty(displayName = "PT", readOnly = true)
    public WirelessPortCountryCode getPT() {
        return PT;
    }
    
    @VsoProperty(displayName = "SE", readOnly = true)
    public WirelessPortCountryCode getSE() {
        return SE;
    }
    
    @VsoProperty(displayName = "SG", readOnly = true)
    public WirelessPortCountryCode getSG() {
        return SG;
    }
    
    @VsoProperty(displayName = "SI", readOnly = true)
    public WirelessPortCountryCode getSI() {
        return SI;
    }
    
    @VsoProperty(displayName = "SK", readOnly = true)
    public WirelessPortCountryCode getSK() {
        return SK;
    }
    
    @VsoProperty(displayName = "TH", readOnly = true)
    public WirelessPortCountryCode getTH() {
        return TH;
    }
    
    @VsoProperty(displayName = "TW", readOnly = true)
    public WirelessPortCountryCode getTW() {
        return TW;
    }
    
    @VsoProperty(displayName = "US", readOnly = true)
    public WirelessPortCountryCode getUS() {
        return US;
    }
    
    @VsoProperty(displayName = "ZA", readOnly = true)
    public WirelessPortCountryCode getZA() {
        return ZA;
    }
    

    public static WirelessPortCountryCode getEnumById(String id) {
        for (WirelessPortCountryCode item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};