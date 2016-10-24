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

@VsoFinder(name = Constants.IKEENCRYPTIONPROFILE_IPSECSAREPLAYWINDOWSIZE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum IKEEncryptionprofileIPsecSAReplayWindowSize {

    WINDOW_SIZE_0("WINDOW_SIZE_0", "WINDOW_SIZE_0"), WINDOW_SIZE_1024("WINDOW_SIZE_1024", "WINDOW_SIZE_1024"), WINDOW_SIZE_128("WINDOW_SIZE_128", "WINDOW_SIZE_128"), WINDOW_SIZE_256("WINDOW_SIZE_256", "WINDOW_SIZE_256"), WINDOW_SIZE_32("WINDOW_SIZE_32", "WINDOW_SIZE_32"), WINDOW_SIZE_512("WINDOW_SIZE_512", "WINDOW_SIZE_512"), WINDOW_SIZE_64("WINDOW_SIZE_64", "WINDOW_SIZE_64");

    private final String id;
    private final String name;
   
    IKEEncryptionprofileIPsecSAReplayWindowSize(String id, String name) {
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

    
    @VsoProperty(displayName = "WINDOW_SIZE_0", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_0() {
        return WINDOW_SIZE_0;
    }
    
    @VsoProperty(displayName = "WINDOW_SIZE_1024", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_1024() {
        return WINDOW_SIZE_1024;
    }
    
    @VsoProperty(displayName = "WINDOW_SIZE_128", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_128() {
        return WINDOW_SIZE_128;
    }
    
    @VsoProperty(displayName = "WINDOW_SIZE_256", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_256() {
        return WINDOW_SIZE_256;
    }
    
    @VsoProperty(displayName = "WINDOW_SIZE_32", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_32() {
        return WINDOW_SIZE_32;
    }
    
    @VsoProperty(displayName = "WINDOW_SIZE_512", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_512() {
        return WINDOW_SIZE_512;
    }
    
    @VsoProperty(displayName = "WINDOW_SIZE_64", readOnly = true)
    public IKEEncryptionprofileIPsecSAReplayWindowSize getWINDOW_SIZE_64() {
        return WINDOW_SIZE_64;
    }
    

    public static IKEEncryptionprofileIPsecSAReplayWindowSize getEnumById(String id) {
        for (IKEEncryptionprofileIPsecSAReplayWindowSize item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};