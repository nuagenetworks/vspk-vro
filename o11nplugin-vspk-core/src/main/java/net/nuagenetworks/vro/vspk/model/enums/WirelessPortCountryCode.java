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

    AF("AF", "AF"), AL("AL", "AL"), DZ("DZ", "DZ"), AS("AS", "AS"), AD("AD", "AD"), AO("AO", "AO"), AI("AI", "AI"), AQ("AQ", "AQ"), AG("AG", "AG"), AR("AR", "AR"), AM("AM", "AM"), AW("AW", "AW"), AU("AU", "AU"), AT("AT", "AT"), AZ("AZ", "AZ"), BS("BS", "BS"), BH("BH", "BH"), BD("BD", "BD"), BB("BB", "BB"), BY("BY", "BY"), BE("BE", "BE"), BZ("BZ", "BZ"), BJ("BJ", "BJ"), BM("BM", "BM"), BT("BT", "BT"), BO("BO", "BO"), BA("BA", "BA"), BW("BW", "BW"), BV("BV", "BV"), BR("BR", "BR"), IO("IO", "IO"), VG("VG", "VG"), BN("BN", "BN"), BG("BG", "BG"), BF("BF", "BF"), BI("BI", "BI"), KH("KH", "KH"), CM("CM", "CM"), CA("CA", "CA"), CV("CV", "CV"), KY("KY", "KY"), CF("CF", "CF"), TD("TD", "TD"), CL("CL", "CL"), CN("CN", "CN"), CX("CX", "CX"), CC("CC", "CC"), CO("CO", "CO"), KM("KM", "KM"), CD("CD", "CD"), CG("CG", "CG"), CK("CK", "CK"), CR("CR", "CR"), CI("CI", "CI"), CU("CU", "CU"), CY("CY", "CY"), CZ("CZ", "CZ"), DK("DK", "DK"), DJ("DJ", "DJ"), DM("DM", "DM"), DO("DO", "DO"), EC("EC", "EC"), EG("EG", "EG"), SV("SV", "SV"), GQ("GQ", "GQ"), ER("ER", "ER"), EE("EE", "EE"), ET("ET", "ET"), FO("FO", "FO"), FK("FK", "FK"), FJ("FJ", "FJ"), FI("FI", "FI"), FR("FR", "FR"), GF("GF", "GF"), PF("PF", "PF"), TF("TF", "TF"), GA("GA", "GA"), GM("GM", "GM"), GE("GE", "GE"), DE("DE", "DE"), GH("GH", "GH"), GI("GI", "GI"), GR("GR", "GR"), GL("GL", "GL"), GD("GD", "GD"), GP("GP", "GP"), GU("GU", "GU"), GT("GT", "GT"), GN("GN", "GN"), GW("GW", "GW"), GY("GY", "GY"), HT("HT", "HT"), HM("HM", "HM"), VA("VA", "VA"), HN("HN", "HN"), HK("HK", "HK"), HR("HR", "HR"), HU("HU", "HU"), IS("IS", "IS"), IN("IN", "IN"), ID("ID", "ID"), IR("IR", "IR"), IQ("IQ", "IQ"), IE("IE", "IE"), IL("IL", "IL"), IT("IT", "IT"), JM("JM", "JM"), JP("JP", "JP"), JO("JO", "JO"), KZ("KZ", "KZ"), KE("KE", "KE"), KI("KI", "KI"), KP("KP", "KP"), KR("KR", "KR"), KW("KW", "KW"), KG("KG", "KG"), LA("LA", "LA"), LV("LV", "LV"), LB("LB", "LB"), LS("LS", "LS"), LR("LR", "LR"), LY("LY", "LY"), LI("LI", "LI"), LT("LT", "LT"), LU("LU", "LU"), MO("MO", "MO"), MK("MK", "MK"), MG("MG", "MG"), MW("MW", "MW"), MY("MY", "MY"), MV("MV", "MV"), ML("ML", "ML"), MT("MT", "MT"), MH("MH", "MH"), MQ("MQ", "MQ"), MR("MR", "MR"), MU("MU", "MU"), YT("YT", "YT"), MX("MX", "MX"), FM("FM", "FM"), MD("MD", "MD"), MC("MC", "MC"), MN("MN", "MN"), MS("MS", "MS"), MA("MA", "MA"), MZ("MZ", "MZ"), MM("MM", "MM"), NA("NA", "NA"), NR("NR", "NR"), NP("NP", "NP"), AN("AN", "AN"), NL("NL", "NL"), NC("NC", "NC"), NZ("NZ", "NZ"), NI("NI", "NI"), NE("NE", "NE"), NG("NG", "NG"), NU("NU", "NU"), NF("NF", "NF"), MP("MP", "MP"), NO("NO", "NO"), OM("OM", "OM"), PK("PK", "PK"), PW("PW", "PW"), PS("PS", "PS"), PA("PA", "PA"), PG("PG", "PG"), PY("PY", "PY"), PE("PE", "PE"), PH("PH", "PH"), PN("PN", "PN"), PL("PL", "PL"), PT("PT", "PT"), PR("PR", "PR"), QA("QA", "QA"), RE("RE", "RE"), RO("RO", "RO"), RU("RU", "RU"), RW("RW", "RW"), SH("SH", "SH"), KN("KN", "KN"), LC("LC", "LC"), PM("PM", "PM"), VC("VC", "VC"), WS("WS", "WS"), SM("SM", "SM"), ST("ST", "ST"), SA("SA", "SA"), SN("SN", "SN"), CS("CS", "CS"), SC("SC", "SC"), SL("SL", "SL"), SG("SG", "SG"), SK("SK", "SK"), SI("SI", "SI"), SB("SB", "SB"), SO("SO", "SO"), ZA("ZA", "ZA"), GS("GS", "GS"), ES("ES", "ES"), LK("LK", "LK"), SD("SD", "SD"), SR("SR", "SR"), SJ("SJ", "SJ"), SZ("SZ", "SZ"), SE("SE", "SE"), CH("CH", "CH"), SY("SY", "SY"), TW("TW", "TW"), TJ("TJ", "TJ"), TZ("TZ", "TZ"), TH("TH", "TH"), TL("TL", "TL"), TG("TG", "TG"), TK("TK", "TK"), TO("TO", "TO"), TT("TT", "TT"), TN("TN", "TN"), TR("TR", "TR"), TM("TM", "TM"), TC("TC", "TC"), TV("TV", "TV"), VI("VI", "VI"), UG("UG", "UG"), UA("UA", "UA"), AE("AE", "AE"), GB("GB", "GB"), UM("UM", "UM"), US("US", "US"), UY("UY", "UY"), UZ("UZ", "UZ"), VU("VU", "VU"), VE("VE", "VE"), VN("VN", "VN"), WF("WF", "WF"), EH("EH", "EH"), YE("YE", "YE"), ZM("ZM", "ZM"), ZW("ZW", "ZW");

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

    
    @VsoProperty(displayName = "AF", readOnly = true)
    public WirelessPortCountryCode getAF() {
        return AF;
    }
    
    @VsoProperty(displayName = "AL", readOnly = true)
    public WirelessPortCountryCode getAL() {
        return AL;
    }
    
    @VsoProperty(displayName = "DZ", readOnly = true)
    public WirelessPortCountryCode getDZ() {
        return DZ;
    }
    
    @VsoProperty(displayName = "AS", readOnly = true)
    public WirelessPortCountryCode getAS() {
        return AS;
    }
    
    @VsoProperty(displayName = "AD", readOnly = true)
    public WirelessPortCountryCode getAD() {
        return AD;
    }
    
    @VsoProperty(displayName = "AO", readOnly = true)
    public WirelessPortCountryCode getAO() {
        return AO;
    }
    
    @VsoProperty(displayName = "AI", readOnly = true)
    public WirelessPortCountryCode getAI() {
        return AI;
    }
    
    @VsoProperty(displayName = "AQ", readOnly = true)
    public WirelessPortCountryCode getAQ() {
        return AQ;
    }
    
    @VsoProperty(displayName = "AG", readOnly = true)
    public WirelessPortCountryCode getAG() {
        return AG;
    }
    
    @VsoProperty(displayName = "AR", readOnly = true)
    public WirelessPortCountryCode getAR() {
        return AR;
    }
    
    @VsoProperty(displayName = "AM", readOnly = true)
    public WirelessPortCountryCode getAM() {
        return AM;
    }
    
    @VsoProperty(displayName = "AW", readOnly = true)
    public WirelessPortCountryCode getAW() {
        return AW;
    }
    
    @VsoProperty(displayName = "AU", readOnly = true)
    public WirelessPortCountryCode getAU() {
        return AU;
    }
    
    @VsoProperty(displayName = "AT", readOnly = true)
    public WirelessPortCountryCode getAT() {
        return AT;
    }
    
    @VsoProperty(displayName = "AZ", readOnly = true)
    public WirelessPortCountryCode getAZ() {
        return AZ;
    }
    
    @VsoProperty(displayName = "BS", readOnly = true)
    public WirelessPortCountryCode getBS() {
        return BS;
    }
    
    @VsoProperty(displayName = "BH", readOnly = true)
    public WirelessPortCountryCode getBH() {
        return BH;
    }
    
    @VsoProperty(displayName = "BD", readOnly = true)
    public WirelessPortCountryCode getBD() {
        return BD;
    }
    
    @VsoProperty(displayName = "BB", readOnly = true)
    public WirelessPortCountryCode getBB() {
        return BB;
    }
    
    @VsoProperty(displayName = "BY", readOnly = true)
    public WirelessPortCountryCode getBY() {
        return BY;
    }
    
    @VsoProperty(displayName = "BE", readOnly = true)
    public WirelessPortCountryCode getBE() {
        return BE;
    }
    
    @VsoProperty(displayName = "BZ", readOnly = true)
    public WirelessPortCountryCode getBZ() {
        return BZ;
    }
    
    @VsoProperty(displayName = "BJ", readOnly = true)
    public WirelessPortCountryCode getBJ() {
        return BJ;
    }
    
    @VsoProperty(displayName = "BM", readOnly = true)
    public WirelessPortCountryCode getBM() {
        return BM;
    }
    
    @VsoProperty(displayName = "BT", readOnly = true)
    public WirelessPortCountryCode getBT() {
        return BT;
    }
    
    @VsoProperty(displayName = "BO", readOnly = true)
    public WirelessPortCountryCode getBO() {
        return BO;
    }
    
    @VsoProperty(displayName = "BA", readOnly = true)
    public WirelessPortCountryCode getBA() {
        return BA;
    }
    
    @VsoProperty(displayName = "BW", readOnly = true)
    public WirelessPortCountryCode getBW() {
        return BW;
    }
    
    @VsoProperty(displayName = "BV", readOnly = true)
    public WirelessPortCountryCode getBV() {
        return BV;
    }
    
    @VsoProperty(displayName = "BR", readOnly = true)
    public WirelessPortCountryCode getBR() {
        return BR;
    }
    
    @VsoProperty(displayName = "IO", readOnly = true)
    public WirelessPortCountryCode getIO() {
        return IO;
    }
    
    @VsoProperty(displayName = "VG", readOnly = true)
    public WirelessPortCountryCode getVG() {
        return VG;
    }
    
    @VsoProperty(displayName = "BN", readOnly = true)
    public WirelessPortCountryCode getBN() {
        return BN;
    }
    
    @VsoProperty(displayName = "BG", readOnly = true)
    public WirelessPortCountryCode getBG() {
        return BG;
    }
    
    @VsoProperty(displayName = "BF", readOnly = true)
    public WirelessPortCountryCode getBF() {
        return BF;
    }
    
    @VsoProperty(displayName = "BI", readOnly = true)
    public WirelessPortCountryCode getBI() {
        return BI;
    }
    
    @VsoProperty(displayName = "KH", readOnly = true)
    public WirelessPortCountryCode getKH() {
        return KH;
    }
    
    @VsoProperty(displayName = "CM", readOnly = true)
    public WirelessPortCountryCode getCM() {
        return CM;
    }
    
    @VsoProperty(displayName = "CA", readOnly = true)
    public WirelessPortCountryCode getCA() {
        return CA;
    }
    
    @VsoProperty(displayName = "CV", readOnly = true)
    public WirelessPortCountryCode getCV() {
        return CV;
    }
    
    @VsoProperty(displayName = "KY", readOnly = true)
    public WirelessPortCountryCode getKY() {
        return KY;
    }
    
    @VsoProperty(displayName = "CF", readOnly = true)
    public WirelessPortCountryCode getCF() {
        return CF;
    }
    
    @VsoProperty(displayName = "TD", readOnly = true)
    public WirelessPortCountryCode getTD() {
        return TD;
    }
    
    @VsoProperty(displayName = "CL", readOnly = true)
    public WirelessPortCountryCode getCL() {
        return CL;
    }
    
    @VsoProperty(displayName = "CN", readOnly = true)
    public WirelessPortCountryCode getCN() {
        return CN;
    }
    
    @VsoProperty(displayName = "CX", readOnly = true)
    public WirelessPortCountryCode getCX() {
        return CX;
    }
    
    @VsoProperty(displayName = "CC", readOnly = true)
    public WirelessPortCountryCode getCC() {
        return CC;
    }
    
    @VsoProperty(displayName = "CO", readOnly = true)
    public WirelessPortCountryCode getCO() {
        return CO;
    }
    
    @VsoProperty(displayName = "KM", readOnly = true)
    public WirelessPortCountryCode getKM() {
        return KM;
    }
    
    @VsoProperty(displayName = "CD", readOnly = true)
    public WirelessPortCountryCode getCD() {
        return CD;
    }
    
    @VsoProperty(displayName = "CG", readOnly = true)
    public WirelessPortCountryCode getCG() {
        return CG;
    }
    
    @VsoProperty(displayName = "CK", readOnly = true)
    public WirelessPortCountryCode getCK() {
        return CK;
    }
    
    @VsoProperty(displayName = "CR", readOnly = true)
    public WirelessPortCountryCode getCR() {
        return CR;
    }
    
    @VsoProperty(displayName = "CI", readOnly = true)
    public WirelessPortCountryCode getCI() {
        return CI;
    }
    
    @VsoProperty(displayName = "CU", readOnly = true)
    public WirelessPortCountryCode getCU() {
        return CU;
    }
    
    @VsoProperty(displayName = "CY", readOnly = true)
    public WirelessPortCountryCode getCY() {
        return CY;
    }
    
    @VsoProperty(displayName = "CZ", readOnly = true)
    public WirelessPortCountryCode getCZ() {
        return CZ;
    }
    
    @VsoProperty(displayName = "DK", readOnly = true)
    public WirelessPortCountryCode getDK() {
        return DK;
    }
    
    @VsoProperty(displayName = "DJ", readOnly = true)
    public WirelessPortCountryCode getDJ() {
        return DJ;
    }
    
    @VsoProperty(displayName = "DM", readOnly = true)
    public WirelessPortCountryCode getDM() {
        return DM;
    }
    
    @VsoProperty(displayName = "DO", readOnly = true)
    public WirelessPortCountryCode getDO() {
        return DO;
    }
    
    @VsoProperty(displayName = "EC", readOnly = true)
    public WirelessPortCountryCode getEC() {
        return EC;
    }
    
    @VsoProperty(displayName = "EG", readOnly = true)
    public WirelessPortCountryCode getEG() {
        return EG;
    }
    
    @VsoProperty(displayName = "SV", readOnly = true)
    public WirelessPortCountryCode getSV() {
        return SV;
    }
    
    @VsoProperty(displayName = "GQ", readOnly = true)
    public WirelessPortCountryCode getGQ() {
        return GQ;
    }
    
    @VsoProperty(displayName = "ER", readOnly = true)
    public WirelessPortCountryCode getER() {
        return ER;
    }
    
    @VsoProperty(displayName = "EE", readOnly = true)
    public WirelessPortCountryCode getEE() {
        return EE;
    }
    
    @VsoProperty(displayName = "ET", readOnly = true)
    public WirelessPortCountryCode getET() {
        return ET;
    }
    
    @VsoProperty(displayName = "FO", readOnly = true)
    public WirelessPortCountryCode getFO() {
        return FO;
    }
    
    @VsoProperty(displayName = "FK", readOnly = true)
    public WirelessPortCountryCode getFK() {
        return FK;
    }
    
    @VsoProperty(displayName = "FJ", readOnly = true)
    public WirelessPortCountryCode getFJ() {
        return FJ;
    }
    
    @VsoProperty(displayName = "FI", readOnly = true)
    public WirelessPortCountryCode getFI() {
        return FI;
    }
    
    @VsoProperty(displayName = "FR", readOnly = true)
    public WirelessPortCountryCode getFR() {
        return FR;
    }
    
    @VsoProperty(displayName = "GF", readOnly = true)
    public WirelessPortCountryCode getGF() {
        return GF;
    }
    
    @VsoProperty(displayName = "PF", readOnly = true)
    public WirelessPortCountryCode getPF() {
        return PF;
    }
    
    @VsoProperty(displayName = "TF", readOnly = true)
    public WirelessPortCountryCode getTF() {
        return TF;
    }
    
    @VsoProperty(displayName = "GA", readOnly = true)
    public WirelessPortCountryCode getGA() {
        return GA;
    }
    
    @VsoProperty(displayName = "GM", readOnly = true)
    public WirelessPortCountryCode getGM() {
        return GM;
    }
    
    @VsoProperty(displayName = "GE", readOnly = true)
    public WirelessPortCountryCode getGE() {
        return GE;
    }
    
    @VsoProperty(displayName = "DE", readOnly = true)
    public WirelessPortCountryCode getDE() {
        return DE;
    }
    
    @VsoProperty(displayName = "GH", readOnly = true)
    public WirelessPortCountryCode getGH() {
        return GH;
    }
    
    @VsoProperty(displayName = "GI", readOnly = true)
    public WirelessPortCountryCode getGI() {
        return GI;
    }
    
    @VsoProperty(displayName = "GR", readOnly = true)
    public WirelessPortCountryCode getGR() {
        return GR;
    }
    
    @VsoProperty(displayName = "GL", readOnly = true)
    public WirelessPortCountryCode getGL() {
        return GL;
    }
    
    @VsoProperty(displayName = "GD", readOnly = true)
    public WirelessPortCountryCode getGD() {
        return GD;
    }
    
    @VsoProperty(displayName = "GP", readOnly = true)
    public WirelessPortCountryCode getGP() {
        return GP;
    }
    
    @VsoProperty(displayName = "GU", readOnly = true)
    public WirelessPortCountryCode getGU() {
        return GU;
    }
    
    @VsoProperty(displayName = "GT", readOnly = true)
    public WirelessPortCountryCode getGT() {
        return GT;
    }
    
    @VsoProperty(displayName = "GN", readOnly = true)
    public WirelessPortCountryCode getGN() {
        return GN;
    }
    
    @VsoProperty(displayName = "GW", readOnly = true)
    public WirelessPortCountryCode getGW() {
        return GW;
    }
    
    @VsoProperty(displayName = "GY", readOnly = true)
    public WirelessPortCountryCode getGY() {
        return GY;
    }
    
    @VsoProperty(displayName = "HT", readOnly = true)
    public WirelessPortCountryCode getHT() {
        return HT;
    }
    
    @VsoProperty(displayName = "HM", readOnly = true)
    public WirelessPortCountryCode getHM() {
        return HM;
    }
    
    @VsoProperty(displayName = "VA", readOnly = true)
    public WirelessPortCountryCode getVA() {
        return VA;
    }
    
    @VsoProperty(displayName = "HN", readOnly = true)
    public WirelessPortCountryCode getHN() {
        return HN;
    }
    
    @VsoProperty(displayName = "HK", readOnly = true)
    public WirelessPortCountryCode getHK() {
        return HK;
    }
    
    @VsoProperty(displayName = "HR", readOnly = true)
    public WirelessPortCountryCode getHR() {
        return HR;
    }
    
    @VsoProperty(displayName = "HU", readOnly = true)
    public WirelessPortCountryCode getHU() {
        return HU;
    }
    
    @VsoProperty(displayName = "IS", readOnly = true)
    public WirelessPortCountryCode getIS() {
        return IS;
    }
    
    @VsoProperty(displayName = "IN", readOnly = true)
    public WirelessPortCountryCode getIN() {
        return IN;
    }
    
    @VsoProperty(displayName = "ID", readOnly = true)
    public WirelessPortCountryCode getID() {
        return ID;
    }
    
    @VsoProperty(displayName = "IR", readOnly = true)
    public WirelessPortCountryCode getIR() {
        return IR;
    }
    
    @VsoProperty(displayName = "IQ", readOnly = true)
    public WirelessPortCountryCode getIQ() {
        return IQ;
    }
    
    @VsoProperty(displayName = "IE", readOnly = true)
    public WirelessPortCountryCode getIE() {
        return IE;
    }
    
    @VsoProperty(displayName = "IL", readOnly = true)
    public WirelessPortCountryCode getIL() {
        return IL;
    }
    
    @VsoProperty(displayName = "IT", readOnly = true)
    public WirelessPortCountryCode getIT() {
        return IT;
    }
    
    @VsoProperty(displayName = "JM", readOnly = true)
    public WirelessPortCountryCode getJM() {
        return JM;
    }
    
    @VsoProperty(displayName = "JP", readOnly = true)
    public WirelessPortCountryCode getJP() {
        return JP;
    }
    
    @VsoProperty(displayName = "JO", readOnly = true)
    public WirelessPortCountryCode getJO() {
        return JO;
    }
    
    @VsoProperty(displayName = "KZ", readOnly = true)
    public WirelessPortCountryCode getKZ() {
        return KZ;
    }
    
    @VsoProperty(displayName = "KE", readOnly = true)
    public WirelessPortCountryCode getKE() {
        return KE;
    }
    
    @VsoProperty(displayName = "KI", readOnly = true)
    public WirelessPortCountryCode getKI() {
        return KI;
    }
    
    @VsoProperty(displayName = "KP", readOnly = true)
    public WirelessPortCountryCode getKP() {
        return KP;
    }
    
    @VsoProperty(displayName = "KR", readOnly = true)
    public WirelessPortCountryCode getKR() {
        return KR;
    }
    
    @VsoProperty(displayName = "KW", readOnly = true)
    public WirelessPortCountryCode getKW() {
        return KW;
    }
    
    @VsoProperty(displayName = "KG", readOnly = true)
    public WirelessPortCountryCode getKG() {
        return KG;
    }
    
    @VsoProperty(displayName = "LA", readOnly = true)
    public WirelessPortCountryCode getLA() {
        return LA;
    }
    
    @VsoProperty(displayName = "LV", readOnly = true)
    public WirelessPortCountryCode getLV() {
        return LV;
    }
    
    @VsoProperty(displayName = "LB", readOnly = true)
    public WirelessPortCountryCode getLB() {
        return LB;
    }
    
    @VsoProperty(displayName = "LS", readOnly = true)
    public WirelessPortCountryCode getLS() {
        return LS;
    }
    
    @VsoProperty(displayName = "LR", readOnly = true)
    public WirelessPortCountryCode getLR() {
        return LR;
    }
    
    @VsoProperty(displayName = "LY", readOnly = true)
    public WirelessPortCountryCode getLY() {
        return LY;
    }
    
    @VsoProperty(displayName = "LI", readOnly = true)
    public WirelessPortCountryCode getLI() {
        return LI;
    }
    
    @VsoProperty(displayName = "LT", readOnly = true)
    public WirelessPortCountryCode getLT() {
        return LT;
    }
    
    @VsoProperty(displayName = "LU", readOnly = true)
    public WirelessPortCountryCode getLU() {
        return LU;
    }
    
    @VsoProperty(displayName = "MO", readOnly = true)
    public WirelessPortCountryCode getMO() {
        return MO;
    }
    
    @VsoProperty(displayName = "MK", readOnly = true)
    public WirelessPortCountryCode getMK() {
        return MK;
    }
    
    @VsoProperty(displayName = "MG", readOnly = true)
    public WirelessPortCountryCode getMG() {
        return MG;
    }
    
    @VsoProperty(displayName = "MW", readOnly = true)
    public WirelessPortCountryCode getMW() {
        return MW;
    }
    
    @VsoProperty(displayName = "MY", readOnly = true)
    public WirelessPortCountryCode getMY() {
        return MY;
    }
    
    @VsoProperty(displayName = "MV", readOnly = true)
    public WirelessPortCountryCode getMV() {
        return MV;
    }
    
    @VsoProperty(displayName = "ML", readOnly = true)
    public WirelessPortCountryCode getML() {
        return ML;
    }
    
    @VsoProperty(displayName = "MT", readOnly = true)
    public WirelessPortCountryCode getMT() {
        return MT;
    }
    
    @VsoProperty(displayName = "MH", readOnly = true)
    public WirelessPortCountryCode getMH() {
        return MH;
    }
    
    @VsoProperty(displayName = "MQ", readOnly = true)
    public WirelessPortCountryCode getMQ() {
        return MQ;
    }
    
    @VsoProperty(displayName = "MR", readOnly = true)
    public WirelessPortCountryCode getMR() {
        return MR;
    }
    
    @VsoProperty(displayName = "MU", readOnly = true)
    public WirelessPortCountryCode getMU() {
        return MU;
    }
    
    @VsoProperty(displayName = "YT", readOnly = true)
    public WirelessPortCountryCode getYT() {
        return YT;
    }
    
    @VsoProperty(displayName = "MX", readOnly = true)
    public WirelessPortCountryCode getMX() {
        return MX;
    }
    
    @VsoProperty(displayName = "FM", readOnly = true)
    public WirelessPortCountryCode getFM() {
        return FM;
    }
    
    @VsoProperty(displayName = "MD", readOnly = true)
    public WirelessPortCountryCode getMD() {
        return MD;
    }
    
    @VsoProperty(displayName = "MC", readOnly = true)
    public WirelessPortCountryCode getMC() {
        return MC;
    }
    
    @VsoProperty(displayName = "MN", readOnly = true)
    public WirelessPortCountryCode getMN() {
        return MN;
    }
    
    @VsoProperty(displayName = "MS", readOnly = true)
    public WirelessPortCountryCode getMS() {
        return MS;
    }
    
    @VsoProperty(displayName = "MA", readOnly = true)
    public WirelessPortCountryCode getMA() {
        return MA;
    }
    
    @VsoProperty(displayName = "MZ", readOnly = true)
    public WirelessPortCountryCode getMZ() {
        return MZ;
    }
    
    @VsoProperty(displayName = "MM", readOnly = true)
    public WirelessPortCountryCode getMM() {
        return MM;
    }
    
    @VsoProperty(displayName = "NA", readOnly = true)
    public WirelessPortCountryCode getNA() {
        return NA;
    }
    
    @VsoProperty(displayName = "NR", readOnly = true)
    public WirelessPortCountryCode getNR() {
        return NR;
    }
    
    @VsoProperty(displayName = "NP", readOnly = true)
    public WirelessPortCountryCode getNP() {
        return NP;
    }
    
    @VsoProperty(displayName = "AN", readOnly = true)
    public WirelessPortCountryCode getAN() {
        return AN;
    }
    
    @VsoProperty(displayName = "NL", readOnly = true)
    public WirelessPortCountryCode getNL() {
        return NL;
    }
    
    @VsoProperty(displayName = "NC", readOnly = true)
    public WirelessPortCountryCode getNC() {
        return NC;
    }
    
    @VsoProperty(displayName = "NZ", readOnly = true)
    public WirelessPortCountryCode getNZ() {
        return NZ;
    }
    
    @VsoProperty(displayName = "NI", readOnly = true)
    public WirelessPortCountryCode getNI() {
        return NI;
    }
    
    @VsoProperty(displayName = "NE", readOnly = true)
    public WirelessPortCountryCode getNE() {
        return NE;
    }
    
    @VsoProperty(displayName = "NG", readOnly = true)
    public WirelessPortCountryCode getNG() {
        return NG;
    }
    
    @VsoProperty(displayName = "NU", readOnly = true)
    public WirelessPortCountryCode getNU() {
        return NU;
    }
    
    @VsoProperty(displayName = "NF", readOnly = true)
    public WirelessPortCountryCode getNF() {
        return NF;
    }
    
    @VsoProperty(displayName = "MP", readOnly = true)
    public WirelessPortCountryCode getMP() {
        return MP;
    }
    
    @VsoProperty(displayName = "NO", readOnly = true)
    public WirelessPortCountryCode getNO() {
        return NO;
    }
    
    @VsoProperty(displayName = "OM", readOnly = true)
    public WirelessPortCountryCode getOM() {
        return OM;
    }
    
    @VsoProperty(displayName = "PK", readOnly = true)
    public WirelessPortCountryCode getPK() {
        return PK;
    }
    
    @VsoProperty(displayName = "PW", readOnly = true)
    public WirelessPortCountryCode getPW() {
        return PW;
    }
    
    @VsoProperty(displayName = "PS", readOnly = true)
    public WirelessPortCountryCode getPS() {
        return PS;
    }
    
    @VsoProperty(displayName = "PA", readOnly = true)
    public WirelessPortCountryCode getPA() {
        return PA;
    }
    
    @VsoProperty(displayName = "PG", readOnly = true)
    public WirelessPortCountryCode getPG() {
        return PG;
    }
    
    @VsoProperty(displayName = "PY", readOnly = true)
    public WirelessPortCountryCode getPY() {
        return PY;
    }
    
    @VsoProperty(displayName = "PE", readOnly = true)
    public WirelessPortCountryCode getPE() {
        return PE;
    }
    
    @VsoProperty(displayName = "PH", readOnly = true)
    public WirelessPortCountryCode getPH() {
        return PH;
    }
    
    @VsoProperty(displayName = "PN", readOnly = true)
    public WirelessPortCountryCode getPN() {
        return PN;
    }
    
    @VsoProperty(displayName = "PL", readOnly = true)
    public WirelessPortCountryCode getPL() {
        return PL;
    }
    
    @VsoProperty(displayName = "PT", readOnly = true)
    public WirelessPortCountryCode getPT() {
        return PT;
    }
    
    @VsoProperty(displayName = "PR", readOnly = true)
    public WirelessPortCountryCode getPR() {
        return PR;
    }
    
    @VsoProperty(displayName = "QA", readOnly = true)
    public WirelessPortCountryCode getQA() {
        return QA;
    }
    
    @VsoProperty(displayName = "RE", readOnly = true)
    public WirelessPortCountryCode getRE() {
        return RE;
    }
    
    @VsoProperty(displayName = "RO", readOnly = true)
    public WirelessPortCountryCode getRO() {
        return RO;
    }
    
    @VsoProperty(displayName = "RU", readOnly = true)
    public WirelessPortCountryCode getRU() {
        return RU;
    }
    
    @VsoProperty(displayName = "RW", readOnly = true)
    public WirelessPortCountryCode getRW() {
        return RW;
    }
    
    @VsoProperty(displayName = "SH", readOnly = true)
    public WirelessPortCountryCode getSH() {
        return SH;
    }
    
    @VsoProperty(displayName = "KN", readOnly = true)
    public WirelessPortCountryCode getKN() {
        return KN;
    }
    
    @VsoProperty(displayName = "LC", readOnly = true)
    public WirelessPortCountryCode getLC() {
        return LC;
    }
    
    @VsoProperty(displayName = "PM", readOnly = true)
    public WirelessPortCountryCode getPM() {
        return PM;
    }
    
    @VsoProperty(displayName = "VC", readOnly = true)
    public WirelessPortCountryCode getVC() {
        return VC;
    }
    
    @VsoProperty(displayName = "WS", readOnly = true)
    public WirelessPortCountryCode getWS() {
        return WS;
    }
    
    @VsoProperty(displayName = "SM", readOnly = true)
    public WirelessPortCountryCode getSM() {
        return SM;
    }
    
    @VsoProperty(displayName = "ST", readOnly = true)
    public WirelessPortCountryCode getST() {
        return ST;
    }
    
    @VsoProperty(displayName = "SA", readOnly = true)
    public WirelessPortCountryCode getSA() {
        return SA;
    }
    
    @VsoProperty(displayName = "SN", readOnly = true)
    public WirelessPortCountryCode getSN() {
        return SN;
    }
    
    @VsoProperty(displayName = "CS", readOnly = true)
    public WirelessPortCountryCode getCS() {
        return CS;
    }
    
    @VsoProperty(displayName = "SC", readOnly = true)
    public WirelessPortCountryCode getSC() {
        return SC;
    }
    
    @VsoProperty(displayName = "SL", readOnly = true)
    public WirelessPortCountryCode getSL() {
        return SL;
    }
    
    @VsoProperty(displayName = "SG", readOnly = true)
    public WirelessPortCountryCode getSG() {
        return SG;
    }
    
    @VsoProperty(displayName = "SK", readOnly = true)
    public WirelessPortCountryCode getSK() {
        return SK;
    }
    
    @VsoProperty(displayName = "SI", readOnly = true)
    public WirelessPortCountryCode getSI() {
        return SI;
    }
    
    @VsoProperty(displayName = "SB", readOnly = true)
    public WirelessPortCountryCode getSB() {
        return SB;
    }
    
    @VsoProperty(displayName = "SO", readOnly = true)
    public WirelessPortCountryCode getSO() {
        return SO;
    }
    
    @VsoProperty(displayName = "ZA", readOnly = true)
    public WirelessPortCountryCode getZA() {
        return ZA;
    }
    
    @VsoProperty(displayName = "GS", readOnly = true)
    public WirelessPortCountryCode getGS() {
        return GS;
    }
    
    @VsoProperty(displayName = "ES", readOnly = true)
    public WirelessPortCountryCode getES() {
        return ES;
    }
    
    @VsoProperty(displayName = "LK", readOnly = true)
    public WirelessPortCountryCode getLK() {
        return LK;
    }
    
    @VsoProperty(displayName = "SD", readOnly = true)
    public WirelessPortCountryCode getSD() {
        return SD;
    }
    
    @VsoProperty(displayName = "SR", readOnly = true)
    public WirelessPortCountryCode getSR() {
        return SR;
    }
    
    @VsoProperty(displayName = "SJ", readOnly = true)
    public WirelessPortCountryCode getSJ() {
        return SJ;
    }
    
    @VsoProperty(displayName = "SZ", readOnly = true)
    public WirelessPortCountryCode getSZ() {
        return SZ;
    }
    
    @VsoProperty(displayName = "SE", readOnly = true)
    public WirelessPortCountryCode getSE() {
        return SE;
    }
    
    @VsoProperty(displayName = "CH", readOnly = true)
    public WirelessPortCountryCode getCH() {
        return CH;
    }
    
    @VsoProperty(displayName = "SY", readOnly = true)
    public WirelessPortCountryCode getSY() {
        return SY;
    }
    
    @VsoProperty(displayName = "TW", readOnly = true)
    public WirelessPortCountryCode getTW() {
        return TW;
    }
    
    @VsoProperty(displayName = "TJ", readOnly = true)
    public WirelessPortCountryCode getTJ() {
        return TJ;
    }
    
    @VsoProperty(displayName = "TZ", readOnly = true)
    public WirelessPortCountryCode getTZ() {
        return TZ;
    }
    
    @VsoProperty(displayName = "TH", readOnly = true)
    public WirelessPortCountryCode getTH() {
        return TH;
    }
    
    @VsoProperty(displayName = "TL", readOnly = true)
    public WirelessPortCountryCode getTL() {
        return TL;
    }
    
    @VsoProperty(displayName = "TG", readOnly = true)
    public WirelessPortCountryCode getTG() {
        return TG;
    }
    
    @VsoProperty(displayName = "TK", readOnly = true)
    public WirelessPortCountryCode getTK() {
        return TK;
    }
    
    @VsoProperty(displayName = "TO", readOnly = true)
    public WirelessPortCountryCode getTO() {
        return TO;
    }
    
    @VsoProperty(displayName = "TT", readOnly = true)
    public WirelessPortCountryCode getTT() {
        return TT;
    }
    
    @VsoProperty(displayName = "TN", readOnly = true)
    public WirelessPortCountryCode getTN() {
        return TN;
    }
    
    @VsoProperty(displayName = "TR", readOnly = true)
    public WirelessPortCountryCode getTR() {
        return TR;
    }
    
    @VsoProperty(displayName = "TM", readOnly = true)
    public WirelessPortCountryCode getTM() {
        return TM;
    }
    
    @VsoProperty(displayName = "TC", readOnly = true)
    public WirelessPortCountryCode getTC() {
        return TC;
    }
    
    @VsoProperty(displayName = "TV", readOnly = true)
    public WirelessPortCountryCode getTV() {
        return TV;
    }
    
    @VsoProperty(displayName = "VI", readOnly = true)
    public WirelessPortCountryCode getVI() {
        return VI;
    }
    
    @VsoProperty(displayName = "UG", readOnly = true)
    public WirelessPortCountryCode getUG() {
        return UG;
    }
    
    @VsoProperty(displayName = "UA", readOnly = true)
    public WirelessPortCountryCode getUA() {
        return UA;
    }
    
    @VsoProperty(displayName = "AE", readOnly = true)
    public WirelessPortCountryCode getAE() {
        return AE;
    }
    
    @VsoProperty(displayName = "GB", readOnly = true)
    public WirelessPortCountryCode getGB() {
        return GB;
    }
    
    @VsoProperty(displayName = "UM", readOnly = true)
    public WirelessPortCountryCode getUM() {
        return UM;
    }
    
    @VsoProperty(displayName = "US", readOnly = true)
    public WirelessPortCountryCode getUS() {
        return US;
    }
    
    @VsoProperty(displayName = "UY", readOnly = true)
    public WirelessPortCountryCode getUY() {
        return UY;
    }
    
    @VsoProperty(displayName = "UZ", readOnly = true)
    public WirelessPortCountryCode getUZ() {
        return UZ;
    }
    
    @VsoProperty(displayName = "VU", readOnly = true)
    public WirelessPortCountryCode getVU() {
        return VU;
    }
    
    @VsoProperty(displayName = "VE", readOnly = true)
    public WirelessPortCountryCode getVE() {
        return VE;
    }
    
    @VsoProperty(displayName = "VN", readOnly = true)
    public WirelessPortCountryCode getVN() {
        return VN;
    }
    
    @VsoProperty(displayName = "WF", readOnly = true)
    public WirelessPortCountryCode getWF() {
        return WF;
    }
    
    @VsoProperty(displayName = "EH", readOnly = true)
    public WirelessPortCountryCode getEH() {
        return EH;
    }
    
    @VsoProperty(displayName = "YE", readOnly = true)
    public WirelessPortCountryCode getYE() {
        return YE;
    }
    
    @VsoProperty(displayName = "ZM", readOnly = true)
    public WirelessPortCountryCode getZM() {
        return ZM;
    }
    
    @VsoProperty(displayName = "ZW", readOnly = true)
    public WirelessPortCountryCode getZW() {
        return ZW;
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