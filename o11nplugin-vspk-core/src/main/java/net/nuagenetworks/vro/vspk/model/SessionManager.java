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

package net.nuagenetworks.vro.vspk.model;

import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.vro.model.BaseSessionManager;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import ch.dunes.vso.sdk.api.IPluginFactory;
import java.util.List;

@VsoObject(create = false, strict = true, singleton = true)
public class SessionManager extends BaseSessionManager<Session> {
    private static SessionManager instance;

    public SessionManager() {
        super(Constants.PLUGIN_ROOT, Constants.PLUGIN_CONFIG_FILENAME);
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }

        return instance; 
    }

    public static SessionManager createScriptingSingleton(IPluginFactory factory) {
        return getInstance();
    }

    @Override
    protected Session createSession(String username, String password, String enterprise, String apiUrl, String certificate) {
        return new Session(username, password, enterprise, apiUrl, certificate);
    }

    @VsoMethod
    public void addSession(Session session) throws RestException {
        super.addSession(session);
    }

    @VsoMethod
    public void removeSession(Session session) throws RestException {
        super.removeSession(session);
    }

    @VsoMethod
    public Session getSessionById(String sessionId) {
        return super.getSessionById(sessionId);
    }

    @VsoMethod
    public List<Session> getSessions() {
        return super.getSessions();
    }
}