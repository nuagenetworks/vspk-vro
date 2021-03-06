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

@VsoFinder(name = Constants.GROUP_ROLE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum GroupRole {

    ADMINOPERATOR("ADMINOPERATOR", "ADMINOPERATOR"), AUDITADMIN("AUDITADMIN", "AUDITADMIN"), CMS("CMS", "CMS"), CSPOPERATOR("CSPOPERATOR", "CSPOPERATOR"), CSPROOT("CSPROOT", "CSPROOT"), JMS("JMS", "JMS"), NETCONFMGR("NETCONFMGR", "NETCONFMGR"), ORGADMIN("ORGADMIN", "ORGADMIN"), ORGNETWORKDESIGNER("ORGNETWORKDESIGNER", "ORGNETWORKDESIGNER"), ORGUSER("ORGUSER", "ORGUSER"), POSTACTIVATION("POSTACTIVATION", "POSTACTIVATION"), PREACTIVATION("PREACTIVATION", "PREACTIVATION"), SECURITYADMINISTRATOR("SECURITYADMINISTRATOR", "SECURITYADMINISTRATOR"), STATS("STATS", "STATS"), SYSTEM("SYSTEM", "SYSTEM"), UNKNOWN("UNKNOWN", "UNKNOWN"), USER("USER", "USER");

    private final String id;
    private final String name;
   
    GroupRole(String id, String name) {
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

    
    @VsoProperty(displayName = "ADMINOPERATOR", readOnly = true)
    public GroupRole getADMINOPERATOR() {
        return ADMINOPERATOR;
    }
    
    @VsoProperty(displayName = "AUDITADMIN", readOnly = true)
    public GroupRole getAUDITADMIN() {
        return AUDITADMIN;
    }
    
    @VsoProperty(displayName = "CMS", readOnly = true)
    public GroupRole getCMS() {
        return CMS;
    }
    
    @VsoProperty(displayName = "CSPOPERATOR", readOnly = true)
    public GroupRole getCSPOPERATOR() {
        return CSPOPERATOR;
    }
    
    @VsoProperty(displayName = "CSPROOT", readOnly = true)
    public GroupRole getCSPROOT() {
        return CSPROOT;
    }
    
    @VsoProperty(displayName = "JMS", readOnly = true)
    public GroupRole getJMS() {
        return JMS;
    }
    
    @VsoProperty(displayName = "NETCONFMGR", readOnly = true)
    public GroupRole getNETCONFMGR() {
        return NETCONFMGR;
    }
    
    @VsoProperty(displayName = "ORGADMIN", readOnly = true)
    public GroupRole getORGADMIN() {
        return ORGADMIN;
    }
    
    @VsoProperty(displayName = "ORGNETWORKDESIGNER", readOnly = true)
    public GroupRole getORGNETWORKDESIGNER() {
        return ORGNETWORKDESIGNER;
    }
    
    @VsoProperty(displayName = "ORGUSER", readOnly = true)
    public GroupRole getORGUSER() {
        return ORGUSER;
    }
    
    @VsoProperty(displayName = "POSTACTIVATION", readOnly = true)
    public GroupRole getPOSTACTIVATION() {
        return POSTACTIVATION;
    }
    
    @VsoProperty(displayName = "PREACTIVATION", readOnly = true)
    public GroupRole getPREACTIVATION() {
        return PREACTIVATION;
    }
    
    @VsoProperty(displayName = "SECURITYADMINISTRATOR", readOnly = true)
    public GroupRole getSECURITYADMINISTRATOR() {
        return SECURITYADMINISTRATOR;
    }
    
    @VsoProperty(displayName = "STATS", readOnly = true)
    public GroupRole getSTATS() {
        return STATS;
    }
    
    @VsoProperty(displayName = "SYSTEM", readOnly = true)
    public GroupRole getSYSTEM() {
        return SYSTEM;
    }
    
    @VsoProperty(displayName = "UNKNOWN", readOnly = true)
    public GroupRole getUNKNOWN() {
        return UNKNOWN;
    }
    
    @VsoProperty(displayName = "USER", readOnly = true)
    public GroupRole getUSER() {
        return USER;
    }
    

    public static GroupRole getEnumById(String id) {
        for (GroupRole item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};