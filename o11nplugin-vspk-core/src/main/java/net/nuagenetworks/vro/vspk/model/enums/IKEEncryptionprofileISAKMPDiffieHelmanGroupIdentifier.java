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

@VsoFinder(name = Constants.IKEENCRYPTIONPROFILE_ISAKMPDIFFIEHELMANGROUPIDENTIFIER_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier {

    GROUP_14_2048_BIT_DH("GROUP_14_2048_BIT_DH", "GROUP_14_2048_BIT_DH"), GROUP_15_3072_BIT_DH("GROUP_15_3072_BIT_DH", "GROUP_15_3072_BIT_DH"), GROUP_16_4096_BIT_DH("GROUP_16_4096_BIT_DH", "GROUP_16_4096_BIT_DH"), GROUP_17_6144_BIT_DH("GROUP_17_6144_BIT_DH", "GROUP_17_6144_BIT_DH"), GROUP_18_8192_BIT_DH("GROUP_18_8192_BIT_DH", "GROUP_18_8192_BIT_DH"), GROUP_1_768_BIT_DH("GROUP_1_768_BIT_DH", "GROUP_1_768_BIT_DH"), GROUP_2_1024_BIT_DH("GROUP_2_1024_BIT_DH", "GROUP_2_1024_BIT_DH"), GROUP_5_1536_BIT_DH("GROUP_5_1536_BIT_DH", "GROUP_5_1536_BIT_DH");

    private final String id;
    private final String name;
   
    IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier(String id, String name) {
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

    
    @VsoProperty(displayName = "GROUP_14_2048_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_14_2048_BIT_DH() {
        return GROUP_14_2048_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_15_3072_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_15_3072_BIT_DH() {
        return GROUP_15_3072_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_16_4096_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_16_4096_BIT_DH() {
        return GROUP_16_4096_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_17_6144_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_17_6144_BIT_DH() {
        return GROUP_17_6144_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_18_8192_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_18_8192_BIT_DH() {
        return GROUP_18_8192_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_1_768_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_1_768_BIT_DH() {
        return GROUP_1_768_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_2_1024_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_2_1024_BIT_DH() {
        return GROUP_2_1024_BIT_DH;
    }
    
    @VsoProperty(displayName = "GROUP_5_1536_BIT_DH", readOnly = true)
    public IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getGROUP_5_1536_BIT_DH() {
        return GROUP_5_1536_BIT_DH;
    }
    

    public static IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier getEnumById(String id) {
        for (IKEEncryptionprofileISAKMPDiffieHelmanGroupIdentifier item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};