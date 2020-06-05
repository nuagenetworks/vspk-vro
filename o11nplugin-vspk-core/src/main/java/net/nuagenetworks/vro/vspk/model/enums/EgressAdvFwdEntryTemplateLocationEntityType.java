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

@VsoFinder(name = Constants.EGRESSADVFWDENTRYTEMPLATE_LOCATIONENTITYTYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum EgressAdvFwdEntryTemplateLocationEntityType {

    PGEXPRESSION("PGEXPRESSION", "PGEXPRESSION"), PGEXPRESSIONTEMPLATE("PGEXPRESSIONTEMPLATE", "PGEXPRESSIONTEMPLATE"), POLICYGROUP("POLICYGROUP", "POLICYGROUP"), POLICYGROUPTEMPLATE("POLICYGROUPTEMPLATE", "POLICYGROUPTEMPLATE"), REDIRECTIONTARGET("REDIRECTIONTARGET", "REDIRECTIONTARGET"), REDIRECTIONTARGETTEMPLATE("REDIRECTIONTARGETTEMPLATE", "REDIRECTIONTARGETTEMPLATE"), SUBNET("SUBNET", "SUBNET"), SUBNETTEMPLATE("SUBNETTEMPLATE", "SUBNETTEMPLATE"), ZONE("ZONE", "ZONE"), ZONETEMPLATE("ZONETEMPLATE", "ZONETEMPLATE");

    private final String id;
    private final String name;
   
    EgressAdvFwdEntryTemplateLocationEntityType(String id, String name) {
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

    
    @VsoProperty(displayName = "PGEXPRESSION", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getPGEXPRESSION() {
        return PGEXPRESSION;
    }
    
    @VsoProperty(displayName = "PGEXPRESSIONTEMPLATE", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getPGEXPRESSIONTEMPLATE() {
        return PGEXPRESSIONTEMPLATE;
    }
    
    @VsoProperty(displayName = "POLICYGROUP", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getPOLICYGROUP() {
        return POLICYGROUP;
    }
    
    @VsoProperty(displayName = "POLICYGROUPTEMPLATE", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getPOLICYGROUPTEMPLATE() {
        return POLICYGROUPTEMPLATE;
    }
    
    @VsoProperty(displayName = "REDIRECTIONTARGET", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getREDIRECTIONTARGET() {
        return REDIRECTIONTARGET;
    }
    
    @VsoProperty(displayName = "REDIRECTIONTARGETTEMPLATE", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getREDIRECTIONTARGETTEMPLATE() {
        return REDIRECTIONTARGETTEMPLATE;
    }
    
    @VsoProperty(displayName = "SUBNET", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getSUBNET() {
        return SUBNET;
    }
    
    @VsoProperty(displayName = "SUBNETTEMPLATE", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getSUBNETTEMPLATE() {
        return SUBNETTEMPLATE;
    }
    
    @VsoProperty(displayName = "ZONE", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getZONE() {
        return ZONE;
    }
    
    @VsoProperty(displayName = "ZONETEMPLATE", readOnly = true)
    public EgressAdvFwdEntryTemplateLocationEntityType getZONETEMPLATE() {
        return ZONETEMPLATE;
    }
    

    public static EgressAdvFwdEntryTemplateLocationEntityType getEnumById(String id) {
        for (EgressAdvFwdEntryTemplateLocationEntityType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};