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

import net.nuagenetworks.vro.vspk.model.fetchers.*;

import net.nuagenetworks.vro.model.fetchers.BaseFetcher;
import net.nuagenetworks.vro.model.BaseObjectExtensions;
import net.nuagenetworks.vro.model.BaseModelHelper;
import net.nuagenetworks.bambou.RestException;
import org.springframework.web.client.HttpClientErrorException;
import java.util.ArrayList;

public class ModelHelper extends BaseModelHelper {

    public static java.util.List<Session> getAllSessions() {
        return SessionManager.getInstance().getSessions();
    }

    public static Session getSessionById(String id) {
        return SessionManager.getInstance().getSessionById(id);
    }
    
    
    public static ContainerInterface getContainerInterfaceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ContainerInterface obj = null;
            obj = new ContainerInterface();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.CONTAINERINTERFACE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastChannelMapsFetcher getMultiCastChannelMapsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            MultiCastChannelMapsFetcher fetcher = obj.getMultiCastChannelMaps();
            return addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyDecisionsFetcher getPolicyDecisionsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            PolicyDecisionsFetcher fetcher = obj.getPolicyDecisions();
            return addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForContainerInterfaceId(String id) throws RestException {
        ContainerInterface obj = getObject(Constants.CONTAINERINTERFACE, id);
        if (obj == null) {
            obj = getContainerInterfaceById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ContainerInterface> getContainerInterfacesForFetcherId(String id) throws RestException {
        ContainerInterfacesFetcher fetcher = getContainerInterfacesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.CONTAINERINTERFACE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ContainerInterface>();
    }

    public static ContainerInterfacesFetcher getContainerInterfacesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.CONTAINERINTERFACES_FETCHER, id);
        if (fetcher != null) {
            return (ContainerInterfacesFetcher) fetcher;
        }
        if ((fetcher = getContainerInterfacesFetcherForZoneId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerInterfacesFetcherForDomainId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerInterfacesFetcherForVPortId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerInterfacesFetcherForSubnetId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerInterfacesFetcherForContainerId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerInterfacesFetcherForL2DomainId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerInterfacesFetcherForMeId(id)) != null) {
            return (ContainerInterfacesFetcher) addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ContainerInterface> getAllContainerInterfaces() throws RestException {
        java.util.List<ContainerInterface> allObjs = new ArrayList<ContainerInterface>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ContainerInterfacesFetcher fetcher = getContainerInterfacesFetcherForMeId(session.getId());
            java.util.List<ContainerInterface> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ContainerInterfacesFetcher> getAllContainerInterfacesFetchers() throws RestException {
        java.util.List<ContainerInterfacesFetcher> allObjs = new ArrayList<ContainerInterfacesFetcher>();
        return allObjs;
    }
    public static GroupKeyEncryptionProfile getGroupKeyEncryptionProfileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            GroupKeyEncryptionProfile obj = null;
            obj = new GroupKeyEncryptionProfile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GROUPKEYENCRYPTIONPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGroupKeyEncryptionProfileId(String id) throws RestException {
        GroupKeyEncryptionProfile obj = getObject(Constants.GROUPKEYENCRYPTIONPROFILE, id);
        if (obj == null) {
            obj = getGroupKeyEncryptionProfileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGroupKeyEncryptionProfileId(String id) throws RestException {
        GroupKeyEncryptionProfile obj = getObject(Constants.GROUPKEYENCRYPTIONPROFILE, id);
        if (obj == null) {
            obj = getGroupKeyEncryptionProfileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<GroupKeyEncryptionProfile> getGroupKeyEncryptionProfilesForFetcherId(String id) throws RestException {
        GroupKeyEncryptionProfilesFetcher fetcher = getGroupKeyEncryptionProfilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GROUPKEYENCRYPTIONPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<GroupKeyEncryptionProfile>();
    }

    public static GroupKeyEncryptionProfilesFetcher getGroupKeyEncryptionProfilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (GroupKeyEncryptionProfilesFetcher) fetcher;
        }
        if ((fetcher = getGroupKeyEncryptionProfilesFetcherForEnterpriseId(id)) != null) {
            return (GroupKeyEncryptionProfilesFetcher) addFetcher(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<GroupKeyEncryptionProfile> getAllGroupKeyEncryptionProfiles() throws RestException {
        java.util.List<GroupKeyEncryptionProfile> allObjs = new ArrayList<GroupKeyEncryptionProfile>();

        return allObjs;
    }

    public static java.util.List<GroupKeyEncryptionProfilesFetcher> getAllGroupKeyEncryptionProfilesFetchers() throws RestException {
        java.util.List<GroupKeyEncryptionProfilesFetcher> allObjs = new ArrayList<GroupKeyEncryptionProfilesFetcher>();
        return allObjs;
    }
    public static BRConnection getBRConnectionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BRConnection obj = null;
            obj = new BRConnection();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BRCONNECTION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<BRConnection> getBRConnectionsForFetcherId(String id) throws RestException {
        BRConnectionsFetcher fetcher = getBRConnectionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BRCONNECTION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BRConnection>();
    }

    public static BRConnectionsFetcher getBRConnectionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BRCONNECTIONS_FETCHER, id);
        if (fetcher != null) {
            return (BRConnectionsFetcher) fetcher;
        }
        if ((fetcher = getBRConnectionsFetcherForVLANId(id)) != null) {
            return (BRConnectionsFetcher) addFetcher(Constants.BRCONNECTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getBRConnectionsFetcherForVLANTemplateId(id)) != null) {
            return (BRConnectionsFetcher) addFetcher(Constants.BRCONNECTIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BRConnection> getAllBRConnections() throws RestException {
        java.util.List<BRConnection> allObjs = new ArrayList<BRConnection>();

        return allObjs;
    }

    public static java.util.List<BRConnectionsFetcher> getAllBRConnectionsFetchers() throws RestException {
        java.util.List<BRConnectionsFetcher> allObjs = new ArrayList<BRConnectionsFetcher>();
        return allObjs;
    }
    public static QOS getQOSById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            QOS obj = null;
            obj = new QOS();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.QOS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ContainersFetcher getContainersFetcherForQOSId(String id) throws RestException {
        QOS obj = getObject(Constants.QOS, id);
        if (obj == null) {
            obj = getQOSById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForQOSId(String id) throws RestException {
        QOS obj = getObject(Constants.QOS, id);
        if (obj == null) {
            obj = getQOSById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForQOSId(String id) throws RestException {
        QOS obj = getObject(Constants.QOS, id);
        if (obj == null) {
            obj = getQOSById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForQOSId(String id) throws RestException {
        QOS obj = getObject(Constants.QOS, id);
        if (obj == null) {
            obj = getQOSById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForQOSId(String id) throws RestException {
        QOS obj = getObject(Constants.QOS, id);
        if (obj == null) {
            obj = getQOSById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<QOS> getQOSsForFetcherId(String id) throws RestException {
        QOSsFetcher fetcher = getQOSsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.QOS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<QOS>();
    }

    public static QOSsFetcher getQOSsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.QOSS_FETCHER, id);
        if (fetcher != null) {
            return (QOSsFetcher) fetcher;
        }
        if ((fetcher = getQOSsFetcherForZoneId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForSubnetTemplateId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForDomainId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForVPortId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForSubnetId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForZoneTemplateId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForBridgeInterfaceId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForL2DomainTemplateId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForL2DomainId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForHostInterfaceId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForDomainTemplateId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getQOSsFetcherForPolicyDecisionId(id)) != null) {
            return (QOSsFetcher) addFetcher(Constants.QOSS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<QOS> getAllQOSs() throws RestException {
        java.util.List<QOS> allObjs = new ArrayList<QOS>();

        return allObjs;
    }

    public static java.util.List<QOSsFetcher> getAllQOSsFetchers() throws RestException {
        java.util.List<QOSsFetcher> allObjs = new ArrayList<QOSsFetcher>();
        return allObjs;
    }
    public static Infrastructureaccessprofile getInfrastructureaccessprofileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Infrastructureaccessprofile obj = null;
            obj = new Infrastructureaccessprofile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INFRASTRUCTUREACCESSPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForInfrastructureaccessprofileId(String id) throws RestException {
        Infrastructureaccessprofile obj = getObject(Constants.INFRASTRUCTUREACCESSPROFILE, id);
        if (obj == null) {
            obj = getInfrastructureaccessprofileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForInfrastructureaccessprofileId(String id) throws RestException {
        Infrastructureaccessprofile obj = getObject(Constants.INFRASTRUCTUREACCESSPROFILE, id);
        if (obj == null) {
            obj = getInfrastructureaccessprofileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Infrastructureaccessprofile> getInfrastructureaccessprofilesForFetcherId(String id) throws RestException {
        InfrastructureaccessprofilesFetcher fetcher = getInfrastructureaccessprofilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INFRASTRUCTUREACCESSPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Infrastructureaccessprofile>();
    }

    public static InfrastructureaccessprofilesFetcher getInfrastructureaccessprofilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INFRASTRUCTUREACCESSPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (InfrastructureaccessprofilesFetcher) fetcher;
        }return null;
    }

    public static java.util.List<Infrastructureaccessprofile> getAllInfrastructureaccessprofiles() throws RestException {
        java.util.List<Infrastructureaccessprofile> allObjs = new ArrayList<Infrastructureaccessprofile>();

        return allObjs;
    }

    public static java.util.List<InfrastructureaccessprofilesFetcher> getAllInfrastructureaccessprofilesFetchers() throws RestException {
        java.util.List<InfrastructureaccessprofilesFetcher> allObjs = new ArrayList<InfrastructureaccessprofilesFetcher>();
        return allObjs;
    }
    public static BGPPeer getBGPPeerById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BGPPeer obj = null;
            obj = new BGPPeer();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BGPPEER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBGPPeerId(String id) throws RestException {
        BGPPeer obj = getObject(Constants.BGPPEER, id);
        if (obj == null) {
            obj = getBGPPeerById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBGPPeerId(String id) throws RestException {
        BGPPeer obj = getObject(Constants.BGPPEER, id);
        if (obj == null) {
            obj = getBGPPeerById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<BGPPeer> getBGPPeersForFetcherId(String id) throws RestException {
        BGPPeersFetcher fetcher = getBGPPeersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BGPPEER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BGPPeer>();
    }

    public static BGPPeersFetcher getBGPPeersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BGPPEERS_FETCHER, id);
        if (fetcher != null) {
            return (BGPPeersFetcher) fetcher;
        }
        if ((fetcher = getBGPPeersFetcherForHSCId(id)) != null) {
            return (BGPPeersFetcher) addFetcher(Constants.BGPPEERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getBGPPeersFetcherForVSCId(id)) != null) {
            return (BGPPeersFetcher) addFetcher(Constants.BGPPEERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BGPPeer> getAllBGPPeers() throws RestException {
        java.util.List<BGPPeer> allObjs = new ArrayList<BGPPeer>();

        return allObjs;
    }

    public static java.util.List<BGPPeersFetcher> getAllBGPPeersFetchers() throws RestException {
        java.util.List<BGPPeersFetcher> allObjs = new ArrayList<BGPPeersFetcher>();
        return allObjs;
    }
    public static SharedNetworkResource getSharedNetworkResourceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            SharedNetworkResource obj = null;
            obj = new SharedNetworkResource();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.SHAREDNETWORKRESOURCE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AddressRangesFetcher getAddressRangesFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            AddressRangesFetcher fetcher = obj.getAddressRanges();
            return addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATIPEntriesFetcher getPATIPEntriesFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            PATIPEntriesFetcher fetcher = obj.getPATIPEntries();
            return addFetcher(Constants.PATIPENTRIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPNConnectionsFetcher getVPNConnectionsFetcherForSharedNetworkResourceId(String id) throws RestException {
        SharedNetworkResource obj = getObject(Constants.SHAREDNETWORKRESOURCE, id);
        if (obj == null) {
            obj = getSharedNetworkResourceById(id);
        }

        if (obj != null) {
            VPNConnectionsFetcher fetcher = obj.getVPNConnections();
            return addFetcher(Constants.VPNCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<SharedNetworkResource> getSharedNetworkResourcesForFetcherId(String id) throws RestException {
        SharedNetworkResourcesFetcher fetcher = getSharedNetworkResourcesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.SHAREDNETWORKRESOURCE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<SharedNetworkResource>();
    }

    public static SharedNetworkResourcesFetcher getSharedNetworkResourcesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, id);
        if (fetcher != null) {
            return (SharedNetworkResourcesFetcher) fetcher;
        }
        if ((fetcher = getSharedNetworkResourcesFetcherForMeId(id)) != null) {
            return (SharedNetworkResourcesFetcher) addFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, fetcher);
        }
        
        if ((fetcher = getSharedNetworkResourcesFetcherForPATMapperId(id)) != null) {
            return (SharedNetworkResourcesFetcher) addFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, fetcher);
        }
        
        if ((fetcher = getSharedNetworkResourcesFetcherForEnterpriseId(id)) != null) {
            return (SharedNetworkResourcesFetcher) addFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<SharedNetworkResource> getAllSharedNetworkResources() throws RestException {
        java.util.List<SharedNetworkResource> allObjs = new ArrayList<SharedNetworkResource>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            SharedNetworkResourcesFetcher fetcher = getSharedNetworkResourcesFetcherForMeId(session.getId());
            java.util.List<SharedNetworkResource> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<SharedNetworkResourcesFetcher> getAllSharedNetworkResourcesFetchers() throws RestException {
        java.util.List<SharedNetworkResourcesFetcher> allObjs = new ArrayList<SharedNetworkResourcesFetcher>();
        return allObjs;
    }
    public static VirtualIP getVirtualIPById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VirtualIP obj = null;
            obj = new VirtualIP();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VIRTUALIP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForVirtualIPId(String id) throws RestException {
        VirtualIP obj = getObject(Constants.VIRTUALIP, id);
        if (obj == null) {
            obj = getVirtualIPById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVirtualIPId(String id) throws RestException {
        VirtualIP obj = getObject(Constants.VIRTUALIP, id);
        if (obj == null) {
            obj = getVirtualIPById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVirtualIPId(String id) throws RestException {
        VirtualIP obj = getObject(Constants.VIRTUALIP, id);
        if (obj == null) {
            obj = getVirtualIPById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VirtualIP> getVirtualIPsForFetcherId(String id) throws RestException {
        VirtualIPsFetcher fetcher = getVirtualIPsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VIRTUALIP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VirtualIP>();
    }

    public static VirtualIPsFetcher getVirtualIPsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VIRTUALIPS_FETCHER, id);
        if (fetcher != null) {
            return (VirtualIPsFetcher) fetcher;
        }
        if ((fetcher = getVirtualIPsFetcherForRedirectionTargetId(id)) != null) {
            return (VirtualIPsFetcher) addFetcher(Constants.VIRTUALIPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVirtualIPsFetcherForVPortId(id)) != null) {
            return (VirtualIPsFetcher) addFetcher(Constants.VIRTUALIPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVirtualIPsFetcherForSubnetId(id)) != null) {
            return (VirtualIPsFetcher) addFetcher(Constants.VIRTUALIPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VirtualIP> getAllVirtualIPs() throws RestException {
        java.util.List<VirtualIP> allObjs = new ArrayList<VirtualIP>();

        return allObjs;
    }

    public static java.util.List<VirtualIPsFetcher> getAllVirtualIPsFetchers() throws RestException {
        java.util.List<VirtualIPsFetcher> allObjs = new ArrayList<VirtualIPsFetcher>();
        return allObjs;
    }
    public static DSCPForwardingClassTable getDSCPForwardingClassTableById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DSCPForwardingClassTable obj = null;
            obj = new DSCPForwardingClassTable();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DSCPFORWARDINGCLASSTABLE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DSCPForwardingClassMappingsFetcher getDSCPForwardingClassMappingsFetcherForDSCPForwardingClassTableId(String id) throws RestException {
        DSCPForwardingClassTable obj = getObject(Constants.DSCPFORWARDINGCLASSTABLE, id);
        if (obj == null) {
            obj = getDSCPForwardingClassTableById(id);
        }

        if (obj != null) {
            DSCPForwardingClassMappingsFetcher fetcher = obj.getDSCPForwardingClassMappings();
            return addFetcher(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDSCPForwardingClassTableId(String id) throws RestException {
        DSCPForwardingClassTable obj = getObject(Constants.DSCPFORWARDINGCLASSTABLE, id);
        if (obj == null) {
            obj = getDSCPForwardingClassTableById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDSCPForwardingClassTableId(String id) throws RestException {
        DSCPForwardingClassTable obj = getObject(Constants.DSCPFORWARDINGCLASSTABLE, id);
        if (obj == null) {
            obj = getDSCPForwardingClassTableById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<DSCPForwardingClassTable> getDSCPForwardingClassTablesForFetcherId(String id) throws RestException {
        DSCPForwardingClassTablesFetcher fetcher = getDSCPForwardingClassTablesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DSCPFORWARDINGCLASSTABLE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DSCPForwardingClassTable>();
    }

    public static DSCPForwardingClassTablesFetcher getDSCPForwardingClassTablesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, id);
        if (fetcher != null) {
            return (DSCPForwardingClassTablesFetcher) fetcher;
        }
        if ((fetcher = getDSCPForwardingClassTablesFetcherForEnterpriseId(id)) != null) {
            return (DSCPForwardingClassTablesFetcher) addFetcher(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DSCPForwardingClassTable> getAllDSCPForwardingClassTables() throws RestException {
        java.util.List<DSCPForwardingClassTable> allObjs = new ArrayList<DSCPForwardingClassTable>();

        return allObjs;
    }

    public static java.util.List<DSCPForwardingClassTablesFetcher> getAllDSCPForwardingClassTablesFetchers() throws RestException {
        java.util.List<DSCPForwardingClassTablesFetcher> allObjs = new ArrayList<DSCPForwardingClassTablesFetcher>();
        return allObjs;
    }
    public static MultiCastChannelMap getMultiCastChannelMapById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MultiCastChannelMap obj = null;
            obj = new MultiCastChannelMap();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MULTICASTCHANNELMAP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForMultiCastChannelMapId(String id) throws RestException {
        MultiCastChannelMap obj = getObject(Constants.MULTICASTCHANNELMAP, id);
        if (obj == null) {
            obj = getMultiCastChannelMapById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMultiCastChannelMapId(String id) throws RestException {
        MultiCastChannelMap obj = getObject(Constants.MULTICASTCHANNELMAP, id);
        if (obj == null) {
            obj = getMultiCastChannelMapById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMultiCastChannelMapId(String id) throws RestException {
        MultiCastChannelMap obj = getObject(Constants.MULTICASTCHANNELMAP, id);
        if (obj == null) {
            obj = getMultiCastChannelMapById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastRangesFetcher getMultiCastRangesFetcherForMultiCastChannelMapId(String id) throws RestException {
        MultiCastChannelMap obj = getObject(Constants.MULTICASTCHANNELMAP, id);
        if (obj == null) {
            obj = getMultiCastChannelMapById(id);
        }

        if (obj != null) {
            MultiCastRangesFetcher fetcher = obj.getMultiCastRanges();
            return addFetcher(Constants.MULTICASTRANGES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MultiCastChannelMap> getMultiCastChannelMapsForFetcherId(String id) throws RestException {
        MultiCastChannelMapsFetcher fetcher = getMultiCastChannelMapsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MULTICASTCHANNELMAP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MultiCastChannelMap>();
    }

    public static MultiCastChannelMapsFetcher getMultiCastChannelMapsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, id);
        if (fetcher != null) {
            return (MultiCastChannelMapsFetcher) fetcher;
        }
        if ((fetcher = getMultiCastChannelMapsFetcherForContainerInterfaceId(id)) != null) {
            return (MultiCastChannelMapsFetcher) addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMultiCastChannelMapsFetcherForVMInterfaceId(id)) != null) {
            return (MultiCastChannelMapsFetcher) addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMultiCastChannelMapsFetcherForMultiCastListId(id)) != null) {
            return (MultiCastChannelMapsFetcher) addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMultiCastChannelMapsFetcherForHostInterfaceId(id)) != null) {
            return (MultiCastChannelMapsFetcher) addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMultiCastChannelMapsFetcherForMeId(id)) != null) {
            return (MultiCastChannelMapsFetcher) addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MultiCastChannelMap> getAllMultiCastChannelMaps() throws RestException {
        java.util.List<MultiCastChannelMap> allObjs = new ArrayList<MultiCastChannelMap>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            MultiCastChannelMapsFetcher fetcher = getMultiCastChannelMapsFetcherForMeId(session.getId());
            java.util.List<MultiCastChannelMap> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<MultiCastChannelMapsFetcher> getAllMultiCastChannelMapsFetchers() throws RestException {
        java.util.List<MultiCastChannelMapsFetcher> allObjs = new ArrayList<MultiCastChannelMapsFetcher>();
        return allObjs;
    }
    public static RedundancyGroup getRedundancyGroupById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            RedundancyGroup obj = null;
            obj = new RedundancyGroup();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.REDUNDANCYGROUP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GatewaysFetcher getGatewaysFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            GatewaysFetcher fetcher = obj.getGateways();
            return addFetcher(Constants.GATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PortsFetcher getPortsFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            PortsFetcher fetcher = obj.getPorts();
            return addFetcher(Constants.PORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static WANServicesFetcher getWANServicesFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            WANServicesFetcher fetcher = obj.getWANServices();
            return addFetcher(Constants.WANSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VsgRedundantPortsFetcher getVsgRedundantPortsFetcherForRedundancyGroupId(String id) throws RestException {
        RedundancyGroup obj = getObject(Constants.REDUNDANCYGROUP, id);
        if (obj == null) {
            obj = getRedundancyGroupById(id);
        }

        if (obj != null) {
            VsgRedundantPortsFetcher fetcher = obj.getVsgRedundantPorts();
            return addFetcher(Constants.VSGREDUNDANTPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<RedundancyGroup> getRedundancyGroupsForFetcherId(String id) throws RestException {
        RedundancyGroupsFetcher fetcher = getRedundancyGroupsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.REDUNDANCYGROUP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<RedundancyGroup>();
    }

    public static RedundancyGroupsFetcher getRedundancyGroupsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.REDUNDANCYGROUPS_FETCHER, id);
        if (fetcher != null) {
            return (RedundancyGroupsFetcher) fetcher;
        }
        if ((fetcher = getRedundancyGroupsFetcherForMeId(id)) != null) {
            return (RedundancyGroupsFetcher) addFetcher(Constants.REDUNDANCYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedundancyGroupsFetcherForEnterpriseId(id)) != null) {
            return (RedundancyGroupsFetcher) addFetcher(Constants.REDUNDANCYGROUPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<RedundancyGroup> getAllRedundancyGroups() throws RestException {
        java.util.List<RedundancyGroup> allObjs = new ArrayList<RedundancyGroup>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            RedundancyGroupsFetcher fetcher = getRedundancyGroupsFetcherForMeId(session.getId());
            java.util.List<RedundancyGroup> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<RedundancyGroupsFetcher> getAllRedundancyGroupsFetchers() throws RestException {
        java.util.List<RedundancyGroupsFetcher> allObjs = new ArrayList<RedundancyGroupsFetcher>();
        return allObjs;
    }
    public static TCA getTCAById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            TCA obj = null;
            obj = new TCA();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.TCA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForTCAId(String id) throws RestException {
        TCA obj = getObject(Constants.TCA, id);
        if (obj == null) {
            obj = getTCAById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForTCAId(String id) throws RestException {
        TCA obj = getObject(Constants.TCA, id);
        if (obj == null) {
            obj = getTCAById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForTCAId(String id) throws RestException {
        TCA obj = getObject(Constants.TCA, id);
        if (obj == null) {
            obj = getTCAById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForTCAId(String id) throws RestException {
        TCA obj = getObject(Constants.TCA, id);
        if (obj == null) {
            obj = getTCAById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<TCA> getTCAsForFetcherId(String id) throws RestException {
        TCAsFetcher fetcher = getTCAsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.TCA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<TCA>();
    }

    public static TCAsFetcher getTCAsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.TCAS_FETCHER, id);
        if (fetcher != null) {
            return (TCAsFetcher) fetcher;
        }
        if ((fetcher = getTCAsFetcherForContainerInterfaceId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForZoneId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForDomainId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForVPortId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForSubnetId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForVMInterfaceId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForBridgeInterfaceId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForTierId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForL2DomainId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForHostInterfaceId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getTCAsFetcherForMeId(id)) != null) {
            return (TCAsFetcher) addFetcher(Constants.TCAS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<TCA> getAllTCAs() throws RestException {
        java.util.List<TCA> allObjs = new ArrayList<TCA>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            TCAsFetcher fetcher = getTCAsFetcherForMeId(session.getId());
            java.util.List<TCA> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<TCAsFetcher> getAllTCAsFetchers() throws RestException {
        java.util.List<TCAsFetcher> allObjs = new ArrayList<TCAsFetcher>();
        return allObjs;
    }
    public static Group getGroupById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Group obj = null;
            obj = new Group();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GROUP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForGroupId(String id) throws RestException {
        Group obj = getObject(Constants.GROUP, id);
        if (obj == null) {
            obj = getGroupById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGroupId(String id) throws RestException {
        Group obj = getObject(Constants.GROUP, id);
        if (obj == null) {
            obj = getGroupById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGroupId(String id) throws RestException {
        Group obj = getObject(Constants.GROUP, id);
        if (obj == null) {
            obj = getGroupById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UsersFetcher getUsersFetcherForGroupId(String id) throws RestException {
        Group obj = getObject(Constants.GROUP, id);
        if (obj == null) {
            obj = getGroupById(id);
        }

        if (obj != null) {
            UsersFetcher fetcher = obj.getUsers();
            return addFetcher(Constants.USERS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Group> getGroupsForFetcherId(String id) throws RestException {
        GroupsFetcher fetcher = getGroupsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GROUP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Group>();
    }

    public static GroupsFetcher getGroupsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GROUPS_FETCHER, id);
        if (fetcher != null) {
            return (GroupsFetcher) fetcher;
        }
        if ((fetcher = getGroupsFetcherForZoneId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGroupsFetcherForDomainId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGroupsFetcherForL2DomainTemplateId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGroupsFetcherForL2DomainId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGroupsFetcherForDomainTemplateId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGroupsFetcherForUserId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGroupsFetcherForEnterpriseId(id)) != null) {
            return (GroupsFetcher) addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Group> getAllGroups() throws RestException {
        java.util.List<Group> allObjs = new ArrayList<Group>();

        return allObjs;
    }

    public static java.util.List<GroupsFetcher> getAllGroupsFetchers() throws RestException {
        java.util.List<GroupsFetcher> allObjs = new ArrayList<GroupsFetcher>();
        return allObjs;
    }
    public static VsgRedundantPort getVsgRedundantPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VsgRedundantPort obj = null;
            obj = new VsgRedundantPort();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VSGREDUNDANTPORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForVsgRedundantPortId(String id) throws RestException {
        VsgRedundantPort obj = getObject(Constants.VSGREDUNDANTPORT, id);
        if (obj == null) {
            obj = getVsgRedundantPortById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForVsgRedundantPortId(String id) throws RestException {
        VsgRedundantPort obj = getObject(Constants.VSGREDUNDANTPORT, id);
        if (obj == null) {
            obj = getVsgRedundantPortById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVsgRedundantPortId(String id) throws RestException {
        VsgRedundantPort obj = getObject(Constants.VSGREDUNDANTPORT, id);
        if (obj == null) {
            obj = getVsgRedundantPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVsgRedundantPortId(String id) throws RestException {
        VsgRedundantPort obj = getObject(Constants.VSGREDUNDANTPORT, id);
        if (obj == null) {
            obj = getVsgRedundantPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForVsgRedundantPortId(String id) throws RestException {
        VsgRedundantPort obj = getObject(Constants.VSGREDUNDANTPORT, id);
        if (obj == null) {
            obj = getVsgRedundantPortById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VLANsFetcher getVLANsFetcherForVsgRedundantPortId(String id) throws RestException {
        VsgRedundantPort obj = getObject(Constants.VSGREDUNDANTPORT, id);
        if (obj == null) {
            obj = getVsgRedundantPortById(id);
        }

        if (obj != null) {
            VLANsFetcher fetcher = obj.getVLANs();
            return addFetcher(Constants.VLANS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VsgRedundantPort> getVsgRedundantPortsForFetcherId(String id) throws RestException {
        VsgRedundantPortsFetcher fetcher = getVsgRedundantPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VSGREDUNDANTPORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VsgRedundantPort>();
    }

    public static VsgRedundantPortsFetcher getVsgRedundantPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VSGREDUNDANTPORTS_FETCHER, id);
        if (fetcher != null) {
            return (VsgRedundantPortsFetcher) fetcher;
        }
        if ((fetcher = getVsgRedundantPortsFetcherForRedundancyGroupId(id)) != null) {
            return (VsgRedundantPortsFetcher) addFetcher(Constants.VSGREDUNDANTPORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VsgRedundantPort> getAllVsgRedundantPorts() throws RestException {
        java.util.List<VsgRedundantPort> allObjs = new ArrayList<VsgRedundantPort>();

        return allObjs;
    }

    public static java.util.List<VsgRedundantPortsFetcher> getAllVsgRedundantPortsFetchers() throws RestException {
        java.util.List<VsgRedundantPortsFetcher> allObjs = new ArrayList<VsgRedundantPortsFetcher>();
        return allObjs;
    }
    public static Zone getZoneById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Zone obj = null;
            obj = new Zone();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ZONE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ContainersFetcher getContainersFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetsFetcher getSubnetsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            SubnetsFetcher fetcher = obj.getSubnets();
            return addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForZoneId(String id) throws RestException {
        Zone obj = getObject(Constants.ZONE, id);
        if (obj == null) {
            obj = getZoneById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Zone> getZonesForFetcherId(String id) throws RestException {
        ZonesFetcher fetcher = getZonesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ZONE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Zone>();
    }

    public static ZonesFetcher getZonesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ZONES_FETCHER, id);
        if (fetcher != null) {
            return (ZonesFetcher) fetcher;
        }
        if ((fetcher = getZonesFetcherForDomainId(id)) != null) {
            return (ZonesFetcher) addFetcher(Constants.ZONES_FETCHER, fetcher);
        }
        
        if ((fetcher = getZonesFetcherForMeId(id)) != null) {
            return (ZonesFetcher) addFetcher(Constants.ZONES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Zone> getAllZones() throws RestException {
        java.util.List<Zone> allObjs = new ArrayList<Zone>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ZonesFetcher fetcher = getZonesFetcherForMeId(session.getId());
            java.util.List<Zone> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ZonesFetcher> getAllZonesFetchers() throws RestException {
        java.util.List<ZonesFetcher> allObjs = new ArrayList<ZonesFetcher>();
        return allObjs;
    }
    public static Application getApplicationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Application obj = null;
            obj = new Application();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.APPLICATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ApplicationBindingsFetcher getApplicationBindingsFetcherForApplicationId(String id) throws RestException {
        Application obj = getObject(Constants.APPLICATION, id);
        if (obj == null) {
            obj = getApplicationById(id);
        }

        if (obj != null) {
            ApplicationBindingsFetcher fetcher = obj.getApplicationBindings();
            return addFetcher(Constants.APPLICATIONBINDINGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MonitorscopesFetcher getMonitorscopesFetcherForApplicationId(String id) throws RestException {
        Application obj = getObject(Constants.APPLICATION, id);
        if (obj == null) {
            obj = getApplicationById(id);
        }

        if (obj != null) {
            MonitorscopesFetcher fetcher = obj.getMonitorscopes();
            return addFetcher(Constants.MONITORSCOPES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Application> getApplicationsForFetcherId(String id) throws RestException {
        ApplicationsFetcher fetcher = getApplicationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.APPLICATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Application>();
    }

    public static ApplicationsFetcher getApplicationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.APPLICATIONS_FETCHER, id);
        if (fetcher != null) {
            return (ApplicationsFetcher) fetcher;
        }
        if ((fetcher = getApplicationsFetcherForL7applicationsignatureId(id)) != null) {
            return (ApplicationsFetcher) addFetcher(Constants.APPLICATIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getApplicationsFetcherForEnterpriseId(id)) != null) {
            return (ApplicationsFetcher) addFetcher(Constants.APPLICATIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Application> getAllApplications() throws RestException {
        java.util.List<Application> allObjs = new ArrayList<Application>();

        return allObjs;
    }

    public static java.util.List<ApplicationsFetcher> getAllApplicationsFetchers() throws RestException {
        java.util.List<ApplicationsFetcher> allObjs = new ArrayList<ApplicationsFetcher>();
        return allObjs;
    }
    public static IKEGatewayProfile getIKEGatewayProfileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKEGatewayProfile obj = null;
            obj = new IKEGatewayProfile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKEGATEWAYPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKEGatewayProfileId(String id) throws RestException {
        IKEGatewayProfile obj = getObject(Constants.IKEGATEWAYPROFILE, id);
        if (obj == null) {
            obj = getIKEGatewayProfileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKEGatewayProfileId(String id) throws RestException {
        IKEGatewayProfile obj = getObject(Constants.IKEGATEWAYPROFILE, id);
        if (obj == null) {
            obj = getIKEGatewayProfileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKEGatewayProfile> getIKEGatewayProfilesForFetcherId(String id) throws RestException {
        IKEGatewayProfilesFetcher fetcher = getIKEGatewayProfilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKEGATEWAYPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKEGatewayProfile>();
    }

    public static IKEGatewayProfilesFetcher getIKEGatewayProfilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKEGATEWAYPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (IKEGatewayProfilesFetcher) fetcher;
        }
        if ((fetcher = getIKEGatewayProfilesFetcherForEnterpriseId(id)) != null) {
            return (IKEGatewayProfilesFetcher) addFetcher(Constants.IKEGATEWAYPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKEGatewayProfile> getAllIKEGatewayProfiles() throws RestException {
        java.util.List<IKEGatewayProfile> allObjs = new ArrayList<IKEGatewayProfile>();

        return allObjs;
    }

    public static java.util.List<IKEGatewayProfilesFetcher> getAllIKEGatewayProfilesFetchers() throws RestException {
        java.util.List<IKEGatewayProfilesFetcher> allObjs = new ArrayList<IKEGatewayProfilesFetcher>();
        return allObjs;
    }
    public static IKESubnet getIKESubnetById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKESubnet obj = null;
            obj = new IKESubnet();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKESUBNET, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKESubnetId(String id) throws RestException {
        IKESubnet obj = getObject(Constants.IKESUBNET, id);
        if (obj == null) {
            obj = getIKESubnetById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKESubnetId(String id) throws RestException {
        IKESubnet obj = getObject(Constants.IKESUBNET, id);
        if (obj == null) {
            obj = getIKESubnetById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKESubnet> getIKESubnetsForFetcherId(String id) throws RestException {
        IKESubnetsFetcher fetcher = getIKESubnetsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKESUBNET);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKESubnet>();
    }

    public static IKESubnetsFetcher getIKESubnetsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKESUBNETS_FETCHER, id);
        if (fetcher != null) {
            return (IKESubnetsFetcher) fetcher;
        }
        if ((fetcher = getIKESubnetsFetcherForIKEGatewayId(id)) != null) {
            return (IKESubnetsFetcher) addFetcher(Constants.IKESUBNETS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKESubnet> getAllIKESubnets() throws RestException {
        java.util.List<IKESubnet> allObjs = new ArrayList<IKESubnet>();

        return allObjs;
    }

    public static java.util.List<IKESubnetsFetcher> getAllIKESubnetsFetchers() throws RestException {
        java.util.List<IKESubnetsFetcher> allObjs = new ArrayList<IKESubnetsFetcher>();
        return allObjs;
    }
    public static InfrastructureGatewayProfile getInfrastructureGatewayProfileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            InfrastructureGatewayProfile obj = null;
            obj = new InfrastructureGatewayProfile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INFRASTRUCTUREGATEWAYPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForInfrastructureGatewayProfileId(String id) throws RestException {
        InfrastructureGatewayProfile obj = getObject(Constants.INFRASTRUCTUREGATEWAYPROFILE, id);
        if (obj == null) {
            obj = getInfrastructureGatewayProfileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForInfrastructureGatewayProfileId(String id) throws RestException {
        InfrastructureGatewayProfile obj = getObject(Constants.INFRASTRUCTUREGATEWAYPROFILE, id);
        if (obj == null) {
            obj = getInfrastructureGatewayProfileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<InfrastructureGatewayProfile> getInfrastructureGatewayProfilesForFetcherId(String id) throws RestException {
        InfrastructureGatewayProfilesFetcher fetcher = getInfrastructureGatewayProfilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INFRASTRUCTUREGATEWAYPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<InfrastructureGatewayProfile>();
    }

    public static InfrastructureGatewayProfilesFetcher getInfrastructureGatewayProfilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (InfrastructureGatewayProfilesFetcher) fetcher;
        }
        if ((fetcher = getInfrastructureGatewayProfilesFetcherForMeId(id)) != null) {
            return (InfrastructureGatewayProfilesFetcher) addFetcher(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<InfrastructureGatewayProfile> getAllInfrastructureGatewayProfiles() throws RestException {
        java.util.List<InfrastructureGatewayProfile> allObjs = new ArrayList<InfrastructureGatewayProfile>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            InfrastructureGatewayProfilesFetcher fetcher = getInfrastructureGatewayProfilesFetcherForMeId(session.getId());
            java.util.List<InfrastructureGatewayProfile> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<InfrastructureGatewayProfilesFetcher> getAllInfrastructureGatewayProfilesFetchers() throws RestException {
        java.util.List<InfrastructureGatewayProfilesFetcher> allObjs = new ArrayList<InfrastructureGatewayProfilesFetcher>();
        return allObjs;
    }
    public static DiskStat getDiskStatById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DiskStat obj = null;
            obj = new DiskStat();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DISKSTAT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<DiskStat> getDiskStatsForFetcherId(String id) throws RestException {
        DiskStatsFetcher fetcher = getDiskStatsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DISKSTAT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DiskStat>();
    }

    public static DiskStatsFetcher getDiskStatsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DISKSTATS_FETCHER, id);
        if (fetcher != null) {
            return (DiskStatsFetcher) fetcher;
        }return null;
    }

    public static java.util.List<DiskStat> getAllDiskStats() throws RestException {
        java.util.List<DiskStat> allObjs = new ArrayList<DiskStat>();

        return allObjs;
    }

    public static java.util.List<DiskStatsFetcher> getAllDiskStatsFetchers() throws RestException {
        java.util.List<DiskStatsFetcher> allObjs = new ArrayList<DiskStatsFetcher>();
        return allObjs;
    }
    public static PolicyGroupTemplate getPolicyGroupTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PolicyGroupTemplate obj = null;
            obj = new PolicyGroupTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.POLICYGROUPTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForPolicyGroupTemplateId(String id) throws RestException {
        PolicyGroupTemplate obj = getObject(Constants.POLICYGROUPTEMPLATE, id);
        if (obj == null) {
            obj = getPolicyGroupTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPolicyGroupTemplateId(String id) throws RestException {
        PolicyGroupTemplate obj = getObject(Constants.POLICYGROUPTEMPLATE, id);
        if (obj == null) {
            obj = getPolicyGroupTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForPolicyGroupTemplateId(String id) throws RestException {
        PolicyGroupTemplate obj = getObject(Constants.POLICYGROUPTEMPLATE, id);
        if (obj == null) {
            obj = getPolicyGroupTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPolicyGroupTemplateId(String id) throws RestException {
        PolicyGroupTemplate obj = getObject(Constants.POLICYGROUPTEMPLATE, id);
        if (obj == null) {
            obj = getPolicyGroupTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PolicyGroupTemplate> getPolicyGroupTemplatesForFetcherId(String id) throws RestException {
        PolicyGroupTemplatesFetcher fetcher = getPolicyGroupTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.POLICYGROUPTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PolicyGroupTemplate>();
    }

    public static PolicyGroupTemplatesFetcher getPolicyGroupTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.POLICYGROUPTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (PolicyGroupTemplatesFetcher) fetcher;
        }
        if ((fetcher = getPolicyGroupTemplatesFetcherForL2DomainTemplateId(id)) != null) {
            return (PolicyGroupTemplatesFetcher) addFetcher(Constants.POLICYGROUPTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (PolicyGroupTemplatesFetcher) addFetcher(Constants.POLICYGROUPTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PolicyGroupTemplate> getAllPolicyGroupTemplates() throws RestException {
        java.util.List<PolicyGroupTemplate> allObjs = new ArrayList<PolicyGroupTemplate>();

        return allObjs;
    }

    public static java.util.List<PolicyGroupTemplatesFetcher> getAllPolicyGroupTemplatesFetchers() throws RestException {
        java.util.List<PolicyGroupTemplatesFetcher> allObjs = new ArrayList<PolicyGroupTemplatesFetcher>();
        return allObjs;
    }
    public static FlowSecurityPolicy getFlowSecurityPolicyById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            FlowSecurityPolicy obj = null;
            obj = new FlowSecurityPolicy();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.FLOWSECURITYPOLICY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForFlowSecurityPolicyId(String id) throws RestException {
        FlowSecurityPolicy obj = getObject(Constants.FLOWSECURITYPOLICY, id);
        if (obj == null) {
            obj = getFlowSecurityPolicyById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForFlowSecurityPolicyId(String id) throws RestException {
        FlowSecurityPolicy obj = getObject(Constants.FLOWSECURITYPOLICY, id);
        if (obj == null) {
            obj = getFlowSecurityPolicyById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForFlowSecurityPolicyId(String id) throws RestException {
        FlowSecurityPolicy obj = getObject(Constants.FLOWSECURITYPOLICY, id);
        if (obj == null) {
            obj = getFlowSecurityPolicyById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<FlowSecurityPolicy> getFlowSecurityPoliciesForFetcherId(String id) throws RestException {
        FlowSecurityPoliciesFetcher fetcher = getFlowSecurityPoliciesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.FLOWSECURITYPOLICY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<FlowSecurityPolicy>();
    }

    public static FlowSecurityPoliciesFetcher getFlowSecurityPoliciesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.FLOWSECURITYPOLICIES_FETCHER, id);
        if (fetcher != null) {
            return (FlowSecurityPoliciesFetcher) fetcher;
        }
        if ((fetcher = getFlowSecurityPoliciesFetcherForFlowId(id)) != null) {
            return (FlowSecurityPoliciesFetcher) addFetcher(Constants.FLOWSECURITYPOLICIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<FlowSecurityPolicy> getAllFlowSecurityPolicies() throws RestException {
        java.util.List<FlowSecurityPolicy> allObjs = new ArrayList<FlowSecurityPolicy>();

        return allObjs;
    }

    public static java.util.List<FlowSecurityPoliciesFetcher> getAllFlowSecurityPoliciesFetchers() throws RestException {
        java.util.List<FlowSecurityPoliciesFetcher> allObjs = new ArrayList<FlowSecurityPoliciesFetcher>();
        return allObjs;
    }
    public static VCenterEAMConfig getVCenterEAMConfigById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterEAMConfig obj = null;
            obj = new VCenterEAMConfig();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VCENTEREAMCONFIG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVCenterEAMConfigId(String id) throws RestException {
        VCenterEAMConfig obj = getObject(Constants.VCENTEREAMCONFIG, id);
        if (obj == null) {
            obj = getVCenterEAMConfigById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVCenterEAMConfigId(String id) throws RestException {
        VCenterEAMConfig obj = getObject(Constants.VCENTEREAMCONFIG, id);
        if (obj == null) {
            obj = getVCenterEAMConfigById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VCenterEAMConfig> getVCenterEAMConfigsForFetcherId(String id) throws RestException {
        VCenterEAMConfigsFetcher fetcher = getVCenterEAMConfigsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VCENTEREAMCONFIG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VCenterEAMConfig>();
    }

    public static VCenterEAMConfigsFetcher getVCenterEAMConfigsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VCENTEREAMCONFIGS_FETCHER, id);
        if (fetcher != null) {
            return (VCenterEAMConfigsFetcher) fetcher;
        }
        if ((fetcher = getVCenterEAMConfigsFetcherForMeId(id)) != null) {
            return (VCenterEAMConfigsFetcher) addFetcher(Constants.VCENTEREAMCONFIGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VCenterEAMConfig> getAllVCenterEAMConfigs() throws RestException {
        java.util.List<VCenterEAMConfig> allObjs = new ArrayList<VCenterEAMConfig>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterEAMConfigsFetcher fetcher = getVCenterEAMConfigsFetcherForMeId(session.getId());
            java.util.List<VCenterEAMConfig> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VCenterEAMConfigsFetcher> getAllVCenterEAMConfigsFetchers() throws RestException {
        java.util.List<VCenterEAMConfigsFetcher> allObjs = new ArrayList<VCenterEAMConfigsFetcher>();
        return allObjs;
    }
    public static Location getLocationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Location obj = null;
            obj = new Location();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.LOCATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForLocationId(String id) throws RestException {
        Location obj = getObject(Constants.LOCATION, id);
        if (obj == null) {
            obj = getLocationById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForLocationId(String id) throws RestException {
        Location obj = getObject(Constants.LOCATION, id);
        if (obj == null) {
            obj = getLocationById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Location> getLocationsForFetcherId(String id) throws RestException {
        LocationsFetcher fetcher = getLocationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.LOCATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Location>();
    }

    public static LocationsFetcher getLocationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.LOCATIONS_FETCHER, id);
        if (fetcher != null) {
            return (LocationsFetcher) fetcher;
        }
        if ((fetcher = getLocationsFetcherForNSGatewayId(id)) != null) {
            return (LocationsFetcher) addFetcher(Constants.LOCATIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Location> getAllLocations() throws RestException {
        java.util.List<Location> allObjs = new ArrayList<Location>();

        return allObjs;
    }

    public static java.util.List<LocationsFetcher> getAllLocationsFetchers() throws RestException {
        java.util.List<LocationsFetcher> allObjs = new ArrayList<LocationsFetcher>();
        return allObjs;
    }
    public static EnterpriseSecurity getEnterpriseSecurityById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterpriseSecurity obj = null;
            obj = new EnterpriseSecurity();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENTERPRISESECURITY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EnterpriseSecuredDatasFetcher getEnterpriseSecuredDatasFetcherForEnterpriseSecurityId(String id) throws RestException {
        EnterpriseSecurity obj = getObject(Constants.ENTERPRISESECURITY, id);
        if (obj == null) {
            obj = getEnterpriseSecurityById(id);
        }

        if (obj != null) {
            EnterpriseSecuredDatasFetcher fetcher = obj.getEnterpriseSecuredDatas();
            return addFetcher(Constants.ENTERPRISESECUREDDATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEnterpriseSecurityId(String id) throws RestException {
        EnterpriseSecurity obj = getObject(Constants.ENTERPRISESECURITY, id);
        if (obj == null) {
            obj = getEnterpriseSecurityById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEnterpriseSecurityId(String id) throws RestException {
        EnterpriseSecurity obj = getObject(Constants.ENTERPRISESECURITY, id);
        if (obj == null) {
            obj = getEnterpriseSecurityById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EnterpriseSecurity> getEnterpriseSecuritiesForFetcherId(String id) throws RestException {
        EnterpriseSecuritiesFetcher fetcher = getEnterpriseSecuritiesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENTERPRISESECURITY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EnterpriseSecurity>();
    }

    public static EnterpriseSecuritiesFetcher getEnterpriseSecuritiesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENTERPRISESECURITIES_FETCHER, id);
        if (fetcher != null) {
            return (EnterpriseSecuritiesFetcher) fetcher;
        }
        if ((fetcher = getEnterpriseSecuritiesFetcherForEnterpriseId(id)) != null) {
            return (EnterpriseSecuritiesFetcher) addFetcher(Constants.ENTERPRISESECURITIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EnterpriseSecurity> getAllEnterpriseSecurities() throws RestException {
        java.util.List<EnterpriseSecurity> allObjs = new ArrayList<EnterpriseSecurity>();

        return allObjs;
    }

    public static java.util.List<EnterpriseSecuritiesFetcher> getAllEnterpriseSecuritiesFetchers() throws RestException {
        java.util.List<EnterpriseSecuritiesFetcher> allObjs = new ArrayList<EnterpriseSecuritiesFetcher>();
        return allObjs;
    }
    public static VCenterVRSConfig getVCenterVRSConfigById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterVRSConfig obj = null;
            obj = new VCenterVRSConfig();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VCENTERVRSCONFIG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVCenterVRSConfigId(String id) throws RestException {
        VCenterVRSConfig obj = getObject(Constants.VCENTERVRSCONFIG, id);
        if (obj == null) {
            obj = getVCenterVRSConfigById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVCenterVRSConfigId(String id) throws RestException {
        VCenterVRSConfig obj = getObject(Constants.VCENTERVRSCONFIG, id);
        if (obj == null) {
            obj = getVCenterVRSConfigById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSAddressRangesFetcher getVRSAddressRangesFetcherForVCenterVRSConfigId(String id) throws RestException {
        VCenterVRSConfig obj = getObject(Constants.VCENTERVRSCONFIG, id);
        if (obj == null) {
            obj = getVCenterVRSConfigById(id);
        }

        if (obj != null) {
            VRSAddressRangesFetcher fetcher = obj.getVRSAddressRanges();
            return addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSRedeploymentpoliciesFetcher getVRSRedeploymentpoliciesFetcherForVCenterVRSConfigId(String id) throws RestException {
        VCenterVRSConfig obj = getObject(Constants.VCENTERVRSCONFIG, id);
        if (obj == null) {
            obj = getVCenterVRSConfigById(id);
        }

        if (obj != null) {
            VRSRedeploymentpoliciesFetcher fetcher = obj.getVRSRedeploymentpolicies();
            return addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VCenterVRSConfig> getVCenterVRSConfigsForFetcherId(String id) throws RestException {
        VCenterVRSConfigsFetcher fetcher = getVCenterVRSConfigsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VCENTERVRSCONFIG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VCenterVRSConfig>();
    }

    public static VCenterVRSConfigsFetcher getVCenterVRSConfigsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VCENTERVRSCONFIGS_FETCHER, id);
        if (fetcher != null) {
            return (VCenterVRSConfigsFetcher) fetcher;
        }
        if ((fetcher = getVCenterVRSConfigsFetcherForMeId(id)) != null) {
            return (VCenterVRSConfigsFetcher) addFetcher(Constants.VCENTERVRSCONFIGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VCenterVRSConfig> getAllVCenterVRSConfigs() throws RestException {
        java.util.List<VCenterVRSConfig> allObjs = new ArrayList<VCenterVRSConfig>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterVRSConfigsFetcher fetcher = getVCenterVRSConfigsFetcherForMeId(session.getId());
            java.util.List<VCenterVRSConfig> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VCenterVRSConfigsFetcher> getAllVCenterVRSConfigsFetchers() throws RestException {
        java.util.List<VCenterVRSConfigsFetcher> allObjs = new ArrayList<VCenterVRSConfigsFetcher>();
        return allObjs;
    }
    public static EnterpriseNetwork getEnterpriseNetworkById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterpriseNetwork obj = null;
            obj = new EnterpriseNetwork();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENTERPRISENETWORK, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForEnterpriseNetworkId(String id) throws RestException {
        EnterpriseNetwork obj = getObject(Constants.ENTERPRISENETWORK, id);
        if (obj == null) {
            obj = getEnterpriseNetworkById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEnterpriseNetworkId(String id) throws RestException {
        EnterpriseNetwork obj = getObject(Constants.ENTERPRISENETWORK, id);
        if (obj == null) {
            obj = getEnterpriseNetworkById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEnterpriseNetworkId(String id) throws RestException {
        EnterpriseNetwork obj = getObject(Constants.ENTERPRISENETWORK, id);
        if (obj == null) {
            obj = getEnterpriseNetworkById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NetworkMacroGroupsFetcher getNetworkMacroGroupsFetcherForEnterpriseNetworkId(String id) throws RestException {
        EnterpriseNetwork obj = getObject(Constants.ENTERPRISENETWORK, id);
        if (obj == null) {
            obj = getEnterpriseNetworkById(id);
        }

        if (obj != null) {
            NetworkMacroGroupsFetcher fetcher = obj.getNetworkMacroGroups();
            return addFetcher(Constants.NETWORKMACROGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EnterpriseNetwork> getEnterpriseNetworksForFetcherId(String id) throws RestException {
        EnterpriseNetworksFetcher fetcher = getEnterpriseNetworksFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENTERPRISENETWORK);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EnterpriseNetwork>();
    }

    public static EnterpriseNetworksFetcher getEnterpriseNetworksFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENTERPRISENETWORKS_FETCHER, id);
        if (fetcher != null) {
            return (EnterpriseNetworksFetcher) fetcher;
        }
        if ((fetcher = getEnterpriseNetworksFetcherForNetworkMacroGroupId(id)) != null) {
            return (EnterpriseNetworksFetcher) addFetcher(Constants.ENTERPRISENETWORKS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterpriseNetworksFetcherForEnterpriseId(id)) != null) {
            return (EnterpriseNetworksFetcher) addFetcher(Constants.ENTERPRISENETWORKS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EnterpriseNetwork> getAllEnterpriseNetworks() throws RestException {
        java.util.List<EnterpriseNetwork> allObjs = new ArrayList<EnterpriseNetwork>();

        return allObjs;
    }

    public static java.util.List<EnterpriseNetworksFetcher> getAllEnterpriseNetworksFetchers() throws RestException {
        java.util.List<EnterpriseNetworksFetcher> allObjs = new ArrayList<EnterpriseNetworksFetcher>();
        return allObjs;
    }
    public static InfrastructureVscProfile getInfrastructureVscProfileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            InfrastructureVscProfile obj = null;
            obj = new InfrastructureVscProfile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INFRASTRUCTUREVSCPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForInfrastructureVscProfileId(String id) throws RestException {
        InfrastructureVscProfile obj = getObject(Constants.INFRASTRUCTUREVSCPROFILE, id);
        if (obj == null) {
            obj = getInfrastructureVscProfileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForInfrastructureVscProfileId(String id) throws RestException {
        InfrastructureVscProfile obj = getObject(Constants.INFRASTRUCTUREVSCPROFILE, id);
        if (obj == null) {
            obj = getInfrastructureVscProfileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<InfrastructureVscProfile> getInfrastructureVscProfilesForFetcherId(String id) throws RestException {
        InfrastructureVscProfilesFetcher fetcher = getInfrastructureVscProfilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INFRASTRUCTUREVSCPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<InfrastructureVscProfile>();
    }

    public static InfrastructureVscProfilesFetcher getInfrastructureVscProfilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (InfrastructureVscProfilesFetcher) fetcher;
        }
        if ((fetcher = getInfrastructureVscProfilesFetcherForMeId(id)) != null) {
            return (InfrastructureVscProfilesFetcher) addFetcher(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<InfrastructureVscProfile> getAllInfrastructureVscProfiles() throws RestException {
        java.util.List<InfrastructureVscProfile> allObjs = new ArrayList<InfrastructureVscProfile>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            InfrastructureVscProfilesFetcher fetcher = getInfrastructureVscProfilesFetcherForMeId(session.getId());
            java.util.List<InfrastructureVscProfile> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<InfrastructureVscProfilesFetcher> getAllInfrastructureVscProfilesFetchers() throws RestException {
        java.util.List<InfrastructureVscProfilesFetcher> allObjs = new ArrayList<InfrastructureVscProfilesFetcher>();
        return allObjs;
    }
    public static Permission getPermissionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Permission obj = null;
            obj = new Permission();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PERMISSION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForPermissionId(String id) throws RestException {
        Permission obj = getObject(Constants.PERMISSION, id);
        if (obj == null) {
            obj = getPermissionById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPermissionId(String id) throws RestException {
        Permission obj = getObject(Constants.PERMISSION, id);
        if (obj == null) {
            obj = getPermissionById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPermissionId(String id) throws RestException {
        Permission obj = getObject(Constants.PERMISSION, id);
        if (obj == null) {
            obj = getPermissionById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Permission> getPermissionsForFetcherId(String id) throws RestException {
        PermissionsFetcher fetcher = getPermissionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PERMISSION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Permission>();
    }

    public static PermissionsFetcher getPermissionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PERMISSIONS_FETCHER, id);
        if (fetcher != null) {
            return (PermissionsFetcher) fetcher;
        }
        if ((fetcher = getPermissionsFetcherForRedundancyGroupId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForVsgRedundantPortId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForZoneId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForDomainId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForWANServiceId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForPortId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForVLANId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForGatewayId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForL2DomainTemplateId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForL2DomainId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForNSGatewayId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForNSPortId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPermissionsFetcherForDomainTemplateId(id)) != null) {
            return (PermissionsFetcher) addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Permission> getAllPermissions() throws RestException {
        java.util.List<Permission> allObjs = new ArrayList<Permission>();

        return allObjs;
    }

    public static java.util.List<PermissionsFetcher> getAllPermissionsFetchers() throws RestException {
        java.util.List<PermissionsFetcher> allObjs = new ArrayList<PermissionsFetcher>();
        return allObjs;
    }
    public static IPReservation getIPReservationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IPReservation obj = null;
            obj = new IPReservation();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IPRESERVATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForIPReservationId(String id) throws RestException {
        IPReservation obj = getObject(Constants.IPRESERVATION, id);
        if (obj == null) {
            obj = getIPReservationById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIPReservationId(String id) throws RestException {
        IPReservation obj = getObject(Constants.IPRESERVATION, id);
        if (obj == null) {
            obj = getIPReservationById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIPReservationId(String id) throws RestException {
        IPReservation obj = getObject(Constants.IPRESERVATION, id);
        if (obj == null) {
            obj = getIPReservationById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IPReservation> getIPReservationsForFetcherId(String id) throws RestException {
        IPReservationsFetcher fetcher = getIPReservationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IPRESERVATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IPReservation>();
    }

    public static IPReservationsFetcher getIPReservationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IPRESERVATIONS_FETCHER, id);
        if (fetcher != null) {
            return (IPReservationsFetcher) fetcher;
        }
        if ((fetcher = getIPReservationsFetcherForSubnetId(id)) != null) {
            return (IPReservationsFetcher) addFetcher(Constants.IPRESERVATIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IPReservation> getAllIPReservations() throws RestException {
        java.util.List<IPReservation> allObjs = new ArrayList<IPReservation>();

        return allObjs;
    }

    public static java.util.List<IPReservationsFetcher> getAllIPReservationsFetchers() throws RestException {
        java.util.List<IPReservationsFetcher> allObjs = new ArrayList<IPReservationsFetcher>();
        return allObjs;
    }
    public static RedirectionTargetTemplate getRedirectionTargetTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            RedirectionTargetTemplate obj = null;
            obj = new RedirectionTargetTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.REDIRECTIONTARGETTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForRedirectionTargetTemplateId(String id) throws RestException {
        RedirectionTargetTemplate obj = getObject(Constants.REDIRECTIONTARGETTEMPLATE, id);
        if (obj == null) {
            obj = getRedirectionTargetTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForRedirectionTargetTemplateId(String id) throws RestException {
        RedirectionTargetTemplate obj = getObject(Constants.REDIRECTIONTARGETTEMPLATE, id);
        if (obj == null) {
            obj = getRedirectionTargetTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForRedirectionTargetTemplateId(String id) throws RestException {
        RedirectionTargetTemplate obj = getObject(Constants.REDIRECTIONTARGETTEMPLATE, id);
        if (obj == null) {
            obj = getRedirectionTargetTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForRedirectionTargetTemplateId(String id) throws RestException {
        RedirectionTargetTemplate obj = getObject(Constants.REDIRECTIONTARGETTEMPLATE, id);
        if (obj == null) {
            obj = getRedirectionTargetTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<RedirectionTargetTemplate> getRedirectionTargetTemplatesForFetcherId(String id) throws RestException {
        RedirectionTargetTemplatesFetcher fetcher = getRedirectionTargetTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.REDIRECTIONTARGETTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<RedirectionTargetTemplate>();
    }

    public static RedirectionTargetTemplatesFetcher getRedirectionTargetTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (RedirectionTargetTemplatesFetcher) fetcher;
        }
        if ((fetcher = getRedirectionTargetTemplatesFetcherForL2DomainTemplateId(id)) != null) {
            return (RedirectionTargetTemplatesFetcher) addFetcher(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (RedirectionTargetTemplatesFetcher) addFetcher(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<RedirectionTargetTemplate> getAllRedirectionTargetTemplates() throws RestException {
        java.util.List<RedirectionTargetTemplate> allObjs = new ArrayList<RedirectionTargetTemplate>();

        return allObjs;
    }

    public static java.util.List<RedirectionTargetTemplatesFetcher> getAllRedirectionTargetTemplatesFetchers() throws RestException {
        java.util.List<RedirectionTargetTemplatesFetcher> allObjs = new ArrayList<RedirectionTargetTemplatesFetcher>();
        return allObjs;
    }
    public static SubnetTemplate getSubnetTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            SubnetTemplate obj = null;
            obj = new SubnetTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.SUBNETTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AddressRangesFetcher getAddressRangesFetcherForSubnetTemplateId(String id) throws RestException {
        SubnetTemplate obj = getObject(Constants.SUBNETTEMPLATE, id);
        if (obj == null) {
            obj = getSubnetTemplateById(id);
        }

        if (obj != null) {
            AddressRangesFetcher fetcher = obj.getAddressRanges();
            return addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForSubnetTemplateId(String id) throws RestException {
        SubnetTemplate obj = getObject(Constants.SUBNETTEMPLATE, id);
        if (obj == null) {
            obj = getSubnetTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForSubnetTemplateId(String id) throws RestException {
        SubnetTemplate obj = getObject(Constants.SUBNETTEMPLATE, id);
        if (obj == null) {
            obj = getSubnetTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForSubnetTemplateId(String id) throws RestException {
        SubnetTemplate obj = getObject(Constants.SUBNETTEMPLATE, id);
        if (obj == null) {
            obj = getSubnetTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForSubnetTemplateId(String id) throws RestException {
        SubnetTemplate obj = getObject(Constants.SUBNETTEMPLATE, id);
        if (obj == null) {
            obj = getSubnetTemplateById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetsFetcher getSubnetsFetcherForSubnetTemplateId(String id) throws RestException {
        SubnetTemplate obj = getObject(Constants.SUBNETTEMPLATE, id);
        if (obj == null) {
            obj = getSubnetTemplateById(id);
        }

        if (obj != null) {
            SubnetsFetcher fetcher = obj.getSubnets();
            return addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<SubnetTemplate> getSubnetTemplatesForFetcherId(String id) throws RestException {
        SubnetTemplatesFetcher fetcher = getSubnetTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.SUBNETTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<SubnetTemplate>();
    }

    public static SubnetTemplatesFetcher getSubnetTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.SUBNETTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (SubnetTemplatesFetcher) fetcher;
        }
        if ((fetcher = getSubnetTemplatesFetcherForZoneTemplateId(id)) != null) {
            return (SubnetTemplatesFetcher) addFetcher(Constants.SUBNETTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getSubnetTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (SubnetTemplatesFetcher) addFetcher(Constants.SUBNETTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<SubnetTemplate> getAllSubnetTemplates() throws RestException {
        java.util.List<SubnetTemplate> allObjs = new ArrayList<SubnetTemplate>();

        return allObjs;
    }

    public static java.util.List<SubnetTemplatesFetcher> getAllSubnetTemplatesFetchers() throws RestException {
        java.util.List<SubnetTemplatesFetcher> allObjs = new ArrayList<SubnetTemplatesFetcher>();
        return allObjs;
    }
    public static MetadataTag getMetadataTagById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MetadataTag obj = null;
            obj = new MetadataTag();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.METADATATAG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForMetadataTagId(String id) throws RestException {
        MetadataTag obj = getObject(Constants.METADATATAG, id);
        if (obj == null) {
            obj = getMetadataTagById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMetadataTagId(String id) throws RestException {
        MetadataTag obj = getObject(Constants.METADATATAG, id);
        if (obj == null) {
            obj = getMetadataTagById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMetadataTagId(String id) throws RestException {
        MetadataTag obj = getObject(Constants.METADATATAG, id);
        if (obj == null) {
            obj = getMetadataTagById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MetadataTag> getMetadataTagsForFetcherId(String id) throws RestException {
        MetadataTagsFetcher fetcher = getMetadataTagsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.METADATATAG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MetadataTag>();
    }

    public static MetadataTagsFetcher getMetadataTagsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.METADATATAGS_FETCHER, id);
        if (fetcher != null) {
            return (MetadataTagsFetcher) fetcher;
        }
        if ((fetcher = getMetadataTagsFetcherForMetadataId(id)) != null) {
            return (MetadataTagsFetcher) addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadataTagsFetcherForMeId(id)) != null) {
            return (MetadataTagsFetcher) addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadataTagsFetcherForExternalServiceId(id)) != null) {
            return (MetadataTagsFetcher) addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadataTagsFetcherForGlobalMetadataId(id)) != null) {
            return (MetadataTagsFetcher) addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadataTagsFetcherForEnterpriseId(id)) != null) {
            return (MetadataTagsFetcher) addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MetadataTag> getAllMetadataTags() throws RestException {
        java.util.List<MetadataTag> allObjs = new ArrayList<MetadataTag>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            MetadataTagsFetcher fetcher = getMetadataTagsFetcherForMeId(session.getId());
            java.util.List<MetadataTag> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<MetadataTagsFetcher> getAllMetadataTagsFetchers() throws RestException {
        java.util.List<MetadataTagsFetcher> allObjs = new ArrayList<MetadataTagsFetcher>();
        return allObjs;
    }
    public static FloatingIPACLTemplate getFloatingIPACLTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            FloatingIPACLTemplate obj = null;
            obj = new FloatingIPACLTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.FLOATINGIPACLTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static FloatingIPACLTemplateEntriesFetcher getFloatingIPACLTemplateEntriesFetcherForFloatingIPACLTemplateId(String id) throws RestException {
        FloatingIPACLTemplate obj = getObject(Constants.FLOATINGIPACLTEMPLATE, id);
        if (obj == null) {
            obj = getFloatingIPACLTemplateById(id);
        }

        if (obj != null) {
            FloatingIPACLTemplateEntriesFetcher fetcher = obj.getFloatingIPACLTemplateEntries();
            return addFetcher(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForFloatingIPACLTemplateId(String id) throws RestException {
        FloatingIPACLTemplate obj = getObject(Constants.FLOATINGIPACLTEMPLATE, id);
        if (obj == null) {
            obj = getFloatingIPACLTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForFloatingIPACLTemplateId(String id) throws RestException {
        FloatingIPACLTemplate obj = getObject(Constants.FLOATINGIPACLTEMPLATE, id);
        if (obj == null) {
            obj = getFloatingIPACLTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<FloatingIPACLTemplate> getFloatingIPACLTemplatesForFetcherId(String id) throws RestException {
        FloatingIPACLTemplatesFetcher fetcher = getFloatingIPACLTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.FLOATINGIPACLTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<FloatingIPACLTemplate>();
    }

    public static FloatingIPACLTemplatesFetcher getFloatingIPACLTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (FloatingIPACLTemplatesFetcher) fetcher;
        }
        if ((fetcher = getFloatingIPACLTemplatesFetcherForDomainId(id)) != null) {
            return (FloatingIPACLTemplatesFetcher) addFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getFloatingIPACLTemplatesFetcherForMeId(id)) != null) {
            return (FloatingIPACLTemplatesFetcher) addFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getFloatingIPACLTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (FloatingIPACLTemplatesFetcher) addFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<FloatingIPACLTemplate> getAllFloatingIPACLTemplates() throws RestException {
        java.util.List<FloatingIPACLTemplate> allObjs = new ArrayList<FloatingIPACLTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            FloatingIPACLTemplatesFetcher fetcher = getFloatingIPACLTemplatesFetcherForMeId(session.getId());
            java.util.List<FloatingIPACLTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<FloatingIPACLTemplatesFetcher> getAllFloatingIPACLTemplatesFetchers() throws RestException {
        java.util.List<FloatingIPACLTemplatesFetcher> allObjs = new ArrayList<FloatingIPACLTemplatesFetcher>();
        return allObjs;
    }
    public static IKEGatewayConnection getIKEGatewayConnectionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKEGatewayConnection obj = null;
            obj = new IKEGatewayConnection();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKEGATEWAYCONNECTION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKEGatewayConnectionId(String id) throws RestException {
        IKEGatewayConnection obj = getObject(Constants.IKEGATEWAYCONNECTION, id);
        if (obj == null) {
            obj = getIKEGatewayConnectionById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKEGatewayConnectionId(String id) throws RestException {
        IKEGatewayConnection obj = getObject(Constants.IKEGATEWAYCONNECTION, id);
        if (obj == null) {
            obj = getIKEGatewayConnectionById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetsFetcher getSubnetsFetcherForIKEGatewayConnectionId(String id) throws RestException {
        IKEGatewayConnection obj = getObject(Constants.IKEGATEWAYCONNECTION, id);
        if (obj == null) {
            obj = getIKEGatewayConnectionById(id);
        }

        if (obj != null) {
            SubnetsFetcher fetcher = obj.getSubnets();
            return addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKEGatewayConnection> getIKEGatewayConnectionsForFetcherId(String id) throws RestException {
        IKEGatewayConnectionsFetcher fetcher = getIKEGatewayConnectionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKEGATEWAYCONNECTION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKEGatewayConnection>();
    }

    public static IKEGatewayConnectionsFetcher getIKEGatewayConnectionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKEGATEWAYCONNECTIONS_FETCHER, id);
        if (fetcher != null) {
            return (IKEGatewayConnectionsFetcher) fetcher;
        }
        if ((fetcher = getIKEGatewayConnectionsFetcherForSubnetId(id)) != null) {
            return (IKEGatewayConnectionsFetcher) addFetcher(Constants.IKEGATEWAYCONNECTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getIKEGatewayConnectionsFetcherForVLANId(id)) != null) {
            return (IKEGatewayConnectionsFetcher) addFetcher(Constants.IKEGATEWAYCONNECTIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKEGatewayConnection> getAllIKEGatewayConnections() throws RestException {
        java.util.List<IKEGatewayConnection> allObjs = new ArrayList<IKEGatewayConnection>();

        return allObjs;
    }

    public static java.util.List<IKEGatewayConnectionsFetcher> getAllIKEGatewayConnectionsFetchers() throws RestException {
        java.util.List<IKEGatewayConnectionsFetcher> allObjs = new ArrayList<IKEGatewayConnectionsFetcher>();
        return allObjs;
    }
    public static RedirectionTarget getRedirectionTargetById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            RedirectionTarget obj = null;
            obj = new RedirectionTarget();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.REDIRECTIONTARGET, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForRedirectionTargetId(String id) throws RestException {
        RedirectionTarget obj = getObject(Constants.REDIRECTIONTARGET, id);
        if (obj == null) {
            obj = getRedirectionTargetById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForRedirectionTargetId(String id) throws RestException {
        RedirectionTarget obj = getObject(Constants.REDIRECTIONTARGET, id);
        if (obj == null) {
            obj = getRedirectionTargetById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForRedirectionTargetId(String id) throws RestException {
        RedirectionTarget obj = getObject(Constants.REDIRECTIONTARGET, id);
        if (obj == null) {
            obj = getRedirectionTargetById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForRedirectionTargetId(String id) throws RestException {
        RedirectionTarget obj = getObject(Constants.REDIRECTIONTARGET, id);
        if (obj == null) {
            obj = getRedirectionTargetById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VirtualIPsFetcher getVirtualIPsFetcherForRedirectionTargetId(String id) throws RestException {
        RedirectionTarget obj = getObject(Constants.REDIRECTIONTARGET, id);
        if (obj == null) {
            obj = getRedirectionTargetById(id);
        }

        if (obj != null) {
            VirtualIPsFetcher fetcher = obj.getVirtualIPs();
            return addFetcher(Constants.VIRTUALIPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForRedirectionTargetId(String id) throws RestException {
        RedirectionTarget obj = getObject(Constants.REDIRECTIONTARGET, id);
        if (obj == null) {
            obj = getRedirectionTargetById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<RedirectionTarget> getRedirectionTargetsForFetcherId(String id) throws RestException {
        RedirectionTargetsFetcher fetcher = getRedirectionTargetsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.REDIRECTIONTARGET);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<RedirectionTarget>();
    }

    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.REDIRECTIONTARGETS_FETCHER, id);
        if (fetcher != null) {
            return (RedirectionTargetsFetcher) fetcher;
        }
        if ((fetcher = getRedirectionTargetsFetcherForContainerInterfaceId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForDomainId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForVPortId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForVMInterfaceId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForBridgeInterfaceId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForL2DomainId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForHostInterfaceId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRedirectionTargetsFetcherForMeId(id)) != null) {
            return (RedirectionTargetsFetcher) addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<RedirectionTarget> getAllRedirectionTargets() throws RestException {
        java.util.List<RedirectionTarget> allObjs = new ArrayList<RedirectionTarget>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            RedirectionTargetsFetcher fetcher = getRedirectionTargetsFetcherForMeId(session.getId());
            java.util.List<RedirectionTarget> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<RedirectionTargetsFetcher> getAllRedirectionTargetsFetchers() throws RestException {
        java.util.List<RedirectionTargetsFetcher> allObjs = new ArrayList<RedirectionTargetsFetcher>();
        return allObjs;
    }
    public static PATIPEntry getPATIPEntryById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PATIPEntry obj = null;
            obj = new PATIPEntry();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PATIPENTRY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<PATIPEntry> getPATIPEntriesForFetcherId(String id) throws RestException {
        PATIPEntriesFetcher fetcher = getPATIPEntriesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PATIPENTRY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PATIPEntry>();
    }

    public static PATIPEntriesFetcher getPATIPEntriesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PATIPENTRIES_FETCHER, id);
        if (fetcher != null) {
            return (PATIPEntriesFetcher) fetcher;
        }
        if ((fetcher = getPATIPEntriesFetcherForSharedNetworkResourceId(id)) != null) {
            return (PATIPEntriesFetcher) addFetcher(Constants.PATIPENTRIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PATIPEntry> getAllPATIPEntries() throws RestException {
        java.util.List<PATIPEntry> allObjs = new ArrayList<PATIPEntry>();

        return allObjs;
    }

    public static java.util.List<PATIPEntriesFetcher> getAllPATIPEntriesFetchers() throws RestException {
        java.util.List<PATIPEntriesFetcher> allObjs = new ArrayList<PATIPEntriesFetcher>();
        return allObjs;
    }
    public static AggregateMetadata getAggregateMetadataById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AggregateMetadata obj = null;
            obj = new AggregateMetadata();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.AGGREGATEMETADATA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<AggregateMetadata> getAggregateMetadatasForFetcherId(String id) throws RestException {
        AggregateMetadatasFetcher fetcher = getAggregateMetadatasFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.AGGREGATEMETADATA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AggregateMetadata>();
    }

    public static AggregateMetadatasFetcher getAggregateMetadatasFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.AGGREGATEMETADATAS_FETCHER, id);
        if (fetcher != null) {
            return (AggregateMetadatasFetcher) fetcher;
        }
        if ((fetcher = getAggregateMetadatasFetcherForVPortId(id)) != null) {
            return (AggregateMetadatasFetcher) addFetcher(Constants.AGGREGATEMETADATAS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AggregateMetadata> getAllAggregateMetadatas() throws RestException {
        java.util.List<AggregateMetadata> allObjs = new ArrayList<AggregateMetadata>();

        return allObjs;
    }

    public static java.util.List<AggregateMetadatasFetcher> getAllAggregateMetadatasFetchers() throws RestException {
        java.util.List<AggregateMetadatasFetcher> allObjs = new ArrayList<AggregateMetadatasFetcher>();
        return allObjs;
    }
    public static EgressACLEntryTemplate getEgressACLEntryTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EgressACLEntryTemplate obj = null;
            obj = new EgressACLEntryTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.EGRESSACLENTRYTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEgressACLEntryTemplateId(String id) throws RestException {
        EgressACLEntryTemplate obj = getObject(Constants.EGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLEntryTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForEgressACLEntryTemplateId(String id) throws RestException {
        EgressACLEntryTemplate obj = getObject(Constants.EGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLEntryTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEgressACLEntryTemplateId(String id) throws RestException {
        EgressACLEntryTemplate obj = getObject(Constants.EGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLEntryTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForEgressACLEntryTemplateId(String id) throws RestException {
        EgressACLEntryTemplate obj = getObject(Constants.EGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLEntryTemplateById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EgressACLEntryTemplate> getEgressACLEntryTemplatesForFetcherId(String id) throws RestException {
        EgressACLEntryTemplatesFetcher fetcher = getEgressACLEntryTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.EGRESSACLENTRYTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EgressACLEntryTemplate>();
    }

    public static EgressACLEntryTemplatesFetcher getEgressACLEntryTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (EgressACLEntryTemplatesFetcher) fetcher;
        }
        if ((fetcher = getEgressACLEntryTemplatesFetcherForDomainId(id)) != null) {
            return (EgressACLEntryTemplatesFetcher) addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLEntryTemplatesFetcherForMirrorDestinationId(id)) != null) {
            return (EgressACLEntryTemplatesFetcher) addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLEntryTemplatesFetcherForL2DomainId(id)) != null) {
            return (EgressACLEntryTemplatesFetcher) addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLEntryTemplatesFetcherForMeId(id)) != null) {
            return (EgressACLEntryTemplatesFetcher) addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLEntryTemplatesFetcherForEgressACLTemplateId(id)) != null) {
            return (EgressACLEntryTemplatesFetcher) addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EgressACLEntryTemplate> getAllEgressACLEntryTemplates() throws RestException {
        java.util.List<EgressACLEntryTemplate> allObjs = new ArrayList<EgressACLEntryTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            EgressACLEntryTemplatesFetcher fetcher = getEgressACLEntryTemplatesFetcherForMeId(session.getId());
            java.util.List<EgressACLEntryTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<EgressACLEntryTemplatesFetcher> getAllEgressACLEntryTemplatesFetchers() throws RestException {
        java.util.List<EgressACLEntryTemplatesFetcher> allObjs = new ArrayList<EgressACLEntryTemplatesFetcher>();
        return allObjs;
    }
    public static IngressExternalServiceTemplateEntry getIngressExternalServiceTemplateEntryById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressExternalServiceTemplateEntry obj = null;
            obj = new IngressExternalServiceTemplateEntry();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIngressExternalServiceTemplateEntryId(String id) throws RestException {
        IngressExternalServiceTemplateEntry obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateEntryById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForIngressExternalServiceTemplateEntryId(String id) throws RestException {
        IngressExternalServiceTemplateEntry obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateEntryById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIngressExternalServiceTemplateEntryId(String id) throws RestException {
        IngressExternalServiceTemplateEntry obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateEntryById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForIngressExternalServiceTemplateEntryId(String id) throws RestException {
        IngressExternalServiceTemplateEntry obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateEntryById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IngressExternalServiceTemplateEntry> getIngressExternalServiceTemplateEntriesForFetcherId(String id) throws RestException {
        IngressExternalServiceTemplateEntriesFetcher fetcher = getIngressExternalServiceTemplateEntriesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INGRESSEXTERNALSERVICETEMPLATEENTRY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IngressExternalServiceTemplateEntry>();
    }

    public static IngressExternalServiceTemplateEntriesFetcher getIngressExternalServiceTemplateEntriesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER, id);
        if (fetcher != null) {
            return (IngressExternalServiceTemplateEntriesFetcher) fetcher;
        }
        if ((fetcher = getIngressExternalServiceTemplateEntriesFetcherForIngressExternalServiceTemplateId(id)) != null) {
            return (IngressExternalServiceTemplateEntriesFetcher) addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IngressExternalServiceTemplateEntry> getAllIngressExternalServiceTemplateEntries() throws RestException {
        java.util.List<IngressExternalServiceTemplateEntry> allObjs = new ArrayList<IngressExternalServiceTemplateEntry>();

        return allObjs;
    }

    public static java.util.List<IngressExternalServiceTemplateEntriesFetcher> getAllIngressExternalServiceTemplateEntriesFetchers() throws RestException {
        java.util.List<IngressExternalServiceTemplateEntriesFetcher> allObjs = new ArrayList<IngressExternalServiceTemplateEntriesFetcher>();
        return allObjs;
    }
    public static Avatar getAvatarById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Avatar obj = null;
            obj = new Avatar();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.AVATAR, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForAvatarId(String id) throws RestException {
        Avatar obj = getObject(Constants.AVATAR, id);
        if (obj == null) {
            obj = getAvatarById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForAvatarId(String id) throws RestException {
        Avatar obj = getObject(Constants.AVATAR, id);
        if (obj == null) {
            obj = getAvatarById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Avatar> getAvatarsForFetcherId(String id) throws RestException {
        AvatarsFetcher fetcher = getAvatarsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.AVATAR);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Avatar>();
    }

    public static AvatarsFetcher getAvatarsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.AVATARS_FETCHER, id);
        if (fetcher != null) {
            return (AvatarsFetcher) fetcher;
        }
        if ((fetcher = getAvatarsFetcherForUserId(id)) != null) {
            return (AvatarsFetcher) addFetcher(Constants.AVATARS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAvatarsFetcherForEnterpriseId(id)) != null) {
            return (AvatarsFetcher) addFetcher(Constants.AVATARS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Avatar> getAllAvatars() throws RestException {
        java.util.List<Avatar> allObjs = new ArrayList<Avatar>();

        return allObjs;
    }

    public static java.util.List<AvatarsFetcher> getAllAvatarsFetchers() throws RestException {
        java.util.List<AvatarsFetcher> allObjs = new ArrayList<AvatarsFetcher>();
        return allObjs;
    }
    public static OverlayAddressPool getOverlayAddressPoolById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            OverlayAddressPool obj = null;
            obj = new OverlayAddressPool();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.OVERLAYADDRESSPOOL, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static OverlayPATNATEntriesFetcher getOverlayPATNATEntriesFetcherForOverlayAddressPoolId(String id) throws RestException {
        OverlayAddressPool obj = getObject(Constants.OVERLAYADDRESSPOOL, id);
        if (obj == null) {
            obj = getOverlayAddressPoolById(id);
        }

        if (obj != null) {
            OverlayPATNATEntriesFetcher fetcher = obj.getOverlayPATNATEntries();
            return addFetcher(Constants.OVERLAYPATNATENTRIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<OverlayAddressPool> getOverlayAddressPoolsForFetcherId(String id) throws RestException {
        OverlayAddressPoolsFetcher fetcher = getOverlayAddressPoolsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.OVERLAYADDRESSPOOL);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<OverlayAddressPool>();
    }

    public static OverlayAddressPoolsFetcher getOverlayAddressPoolsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.OVERLAYADDRESSPOOLS_FETCHER, id);
        if (fetcher != null) {
            return (OverlayAddressPoolsFetcher) fetcher;
        }
        if ((fetcher = getOverlayAddressPoolsFetcherForLinkId(id)) != null) {
            return (OverlayAddressPoolsFetcher) addFetcher(Constants.OVERLAYADDRESSPOOLS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<OverlayAddressPool> getAllOverlayAddressPools() throws RestException {
        java.util.List<OverlayAddressPool> allObjs = new ArrayList<OverlayAddressPool>();

        return allObjs;
    }

    public static java.util.List<OverlayAddressPoolsFetcher> getAllOverlayAddressPoolsFetchers() throws RestException {
        java.util.List<OverlayAddressPoolsFetcher> allObjs = new ArrayList<OverlayAddressPoolsFetcher>();
        return allObjs;
    }
    public static BootstrapActivation getBootstrapActivationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BootstrapActivation obj = null;
            obj = new BootstrapActivation();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BOOTSTRAPACTIVATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBootstrapActivationId(String id) throws RestException {
        BootstrapActivation obj = getObject(Constants.BOOTSTRAPACTIVATION, id);
        if (obj == null) {
            obj = getBootstrapActivationById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBootstrapActivationId(String id) throws RestException {
        BootstrapActivation obj = getObject(Constants.BOOTSTRAPACTIVATION, id);
        if (obj == null) {
            obj = getBootstrapActivationById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<BootstrapActivation> getBootstrapActivationsForFetcherId(String id) throws RestException {
        BootstrapActivationsFetcher fetcher = getBootstrapActivationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BOOTSTRAPACTIVATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BootstrapActivation>();
    }

    public static BootstrapActivationsFetcher getBootstrapActivationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BOOTSTRAPACTIVATIONS_FETCHER, id);
        if (fetcher != null) {
            return (BootstrapActivationsFetcher) fetcher;
        }
        if ((fetcher = getBootstrapActivationsFetcherForNSGatewayId(id)) != null) {
            return (BootstrapActivationsFetcher) addFetcher(Constants.BOOTSTRAPACTIVATIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BootstrapActivation> getAllBootstrapActivations() throws RestException {
        java.util.List<BootstrapActivation> allObjs = new ArrayList<BootstrapActivation>();

        return allObjs;
    }

    public static java.util.List<BootstrapActivationsFetcher> getAllBootstrapActivationsFetchers() throws RestException {
        java.util.List<BootstrapActivationsFetcher> allObjs = new ArrayList<BootstrapActivationsFetcher>();
        return allObjs;
    }
    public static LicenseStatus getLicenseStatusById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            LicenseStatus obj = null;
            obj = new LicenseStatus();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.LICENSESTATUS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<LicenseStatus> getLicenseStatusForFetcherId(String id) throws RestException {
        LicenseStatusFetcher fetcher = getLicenseStatusFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.LICENSESTATUS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<LicenseStatus>();
    }

    public static LicenseStatusFetcher getLicenseStatusFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.LICENSESTATUS_FETCHER, id);
        if (fetcher != null) {
            return (LicenseStatusFetcher) fetcher;
        }
        if ((fetcher = getLicenseStatusFetcherForMeId(id)) != null) {
            return (LicenseStatusFetcher) addFetcher(Constants.LICENSESTATUS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<LicenseStatus> getAllLicenseStatus() throws RestException {
        java.util.List<LicenseStatus> allObjs = new ArrayList<LicenseStatus>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            LicenseStatusFetcher fetcher = getLicenseStatusFetcherForMeId(session.getId());
            java.util.List<LicenseStatus> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<LicenseStatusFetcher> getAllLicenseStatusFetchers() throws RestException {
        java.util.List<LicenseStatusFetcher> allObjs = new ArrayList<LicenseStatusFetcher>();
        return allObjs;
    }
    public static Metadata getMetadataById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Metadata obj = null;
            obj = new Metadata();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.METADATA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForMetadataId(String id) throws RestException {
        Metadata obj = getObject(Constants.METADATA, id);
        if (obj == null) {
            obj = getMetadataById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadataTagsFetcher getMetadataTagsFetcherForMetadataId(String id) throws RestException {
        Metadata obj = getObject(Constants.METADATA, id);
        if (obj == null) {
            obj = getMetadataById(id);
        }

        if (obj != null) {
            MetadataTagsFetcher fetcher = obj.getMetadataTags();
            return addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Metadata> getMetadatasForFetcherId(String id) throws RestException {
        MetadatasFetcher fetcher = getMetadatasFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.METADATA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Metadata>();
    }

    public static MetadatasFetcher getMetadatasFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.METADATAS_FETCHER, id);
        if (fetcher != null) {
            return (MetadatasFetcher) fetcher;
        }
        if ((fetcher = getMetadatasFetcherForContainerInterfaceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGroupKeyEncryptionProfileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForQOSId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForInfrastructureaccessprofileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBGPPeerId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForSharedNetworkResourceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVirtualIPId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDSCPForwardingClassTableId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMultiCastChannelMapId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForRedundancyGroupId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForTCAId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGroupId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVsgRedundantPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForZoneId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKEGatewayProfileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKESubnetId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForInfrastructureGatewayProfileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPolicyGroupTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForFlowSecurityPolicyId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVCenterEAMConfigId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForLocationId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEnterpriseSecurityId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVCenterVRSConfigId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEnterpriseNetworkId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForInfrastructureVscProfileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPermissionId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIPReservationId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForRedirectionTargetTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForSubnetTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMetadataTagId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForFloatingIPACLTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKEGatewayConnectionId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForRedirectionTargetId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEgressACLEntryTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIngressExternalServiceTemplateEntryId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForAvatarId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBootstrapActivationId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForCloudMgmtSystemId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVSPId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDomainId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForRedundantPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDSCPForwardingClassMappingId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNetworkLayoutId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForWANServiceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVSDId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForFlowForwardingPolicyId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForStatisticsPolicyId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForSubnetId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForContainerId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForRateLimiterId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForKeyServerMonitorEncryptedSeedId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForZoneTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForKeyServerMonitorSeedId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGatewayTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVRSId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForHSCId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVLANId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForLDAPConfigurationId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVSDComponentId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForZFBRequestId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEnterprisePermissionId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForStaticRouteId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForJobId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVMInterfaceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGatewaySecuredDataId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVCenterHypervisorId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForKeyServerMonitorId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEventLogId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForLicenseId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEnterpriseProfileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBridgeInterfaceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVCenterClusterId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMultiCastRangeId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNetworkMacroGroupId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIngressAdvFwdEntryTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForAutoDiscoveredGatewayId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMultiCastListId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNextHopId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForKeyServerNotificationId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMirrorDestinationId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForTierId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDomainFIPAclTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForAddressMapId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGatewayId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMultiNICVPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForStatisticsId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNSPortTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForCertificateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVCenterDataCenterId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForL2DomainTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForApplicationServiceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKEGatewayId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForStatsCollectorInfoId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVCenterId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBulkStatisticsId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIngressACLEntryTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForRoutingPolicyId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForL2DomainId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKEGatewayConfigId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForHostInterfaceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEnterpriseSecuredDataId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKECertificateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIngressExternalServiceTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPortTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMeId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEndPointId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDHCPOptionId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForKeyServerMemberId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNSGatewayId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNSGatewayTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVSCId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForUplinkRDId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVMId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNSPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVRSAddressRangeId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBGPProfileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEgressQOSPolicyId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPublicNetworkMacroId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDomainFIPAclTemplateEntryId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForAddressRangeId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForDomainTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForSiteInfoId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVMResyncId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPolicyDecisionId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForFloatingIpId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEgressACLTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForMonitoringPortId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVPNConnectionId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNSRedundantGatewayGroupId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForExternalServiceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForKeyServerMonitorSEKId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIngressAdvFwdTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVPortMirrorId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPATNATPoolId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBGPNeighborId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForContainerResyncId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForAllAlarmId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKEPSKId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForSystemConfigId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIKEEncryptionprofileId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForFloatingIPACLTemplateEntryId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForInfrastructureConfigId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForUserId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForNATMapEntryId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForPolicyGroupId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForExternalAppServiceId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForAlarmId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForBootstrapId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForFlowId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForVLANTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGatewaySecurityId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForGlobalMetadataId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForEnterpriseId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForLinkId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMetadatasFetcherForIngressACLTemplateId(id)) != null) {
            return (MetadatasFetcher) addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Metadata> getAllMetadatas() throws RestException {
        java.util.List<Metadata> allObjs = new ArrayList<Metadata>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            MetadatasFetcher fetcher = getMetadatasFetcherForMeId(session.getId());
            java.util.List<Metadata> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<MetadatasFetcher> getAllMetadatasFetchers() throws RestException {
        java.util.List<MetadatasFetcher> allObjs = new ArrayList<MetadatasFetcher>();
        return allObjs;
    }
    public static CloudMgmtSystem getCloudMgmtSystemById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            CloudMgmtSystem obj = null;
            obj = new CloudMgmtSystem();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.CLOUDMGMTSYSTEM, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForCloudMgmtSystemId(String id) throws RestException {
        CloudMgmtSystem obj = getObject(Constants.CLOUDMGMTSYSTEM, id);
        if (obj == null) {
            obj = getCloudMgmtSystemById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForCloudMgmtSystemId(String id) throws RestException {
        CloudMgmtSystem obj = getObject(Constants.CLOUDMGMTSYSTEM, id);
        if (obj == null) {
            obj = getCloudMgmtSystemById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<CloudMgmtSystem> getCloudMgmtSystemsForFetcherId(String id) throws RestException {
        CloudMgmtSystemsFetcher fetcher = getCloudMgmtSystemsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.CLOUDMGMTSYSTEM);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<CloudMgmtSystem>();
    }

    public static CloudMgmtSystemsFetcher getCloudMgmtSystemsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.CLOUDMGMTSYSTEMS_FETCHER, id);
        if (fetcher != null) {
            return (CloudMgmtSystemsFetcher) fetcher;
        }
        if ((fetcher = getCloudMgmtSystemsFetcherForMeId(id)) != null) {
            return (CloudMgmtSystemsFetcher) addFetcher(Constants.CLOUDMGMTSYSTEMS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<CloudMgmtSystem> getAllCloudMgmtSystems() throws RestException {
        java.util.List<CloudMgmtSystem> allObjs = new ArrayList<CloudMgmtSystem>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            CloudMgmtSystemsFetcher fetcher = getCloudMgmtSystemsFetcherForMeId(session.getId());
            java.util.List<CloudMgmtSystem> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<CloudMgmtSystemsFetcher> getAllCloudMgmtSystemsFetchers() throws RestException {
        java.util.List<CloudMgmtSystemsFetcher> allObjs = new ArrayList<CloudMgmtSystemsFetcher>();
        return allObjs;
    }
    public static VSP getVSPById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VSP obj = null;
            obj = new VSP();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VSP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForVSPId(String id) throws RestException {
        VSP obj = getObject(Constants.VSP, id);
        if (obj == null) {
            obj = getVSPById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVSPId(String id) throws RestException {
        VSP obj = getObject(Constants.VSP, id);
        if (obj == null) {
            obj = getVSPById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static HSCsFetcher getHSCsFetcherForVSPId(String id) throws RestException {
        VSP obj = getObject(Constants.VSP, id);
        if (obj == null) {
            obj = getVSPById(id);
        }

        if (obj != null) {
            HSCsFetcher fetcher = obj.getHSCs();
            return addFetcher(Constants.HSCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVSPId(String id) throws RestException {
        VSP obj = getObject(Constants.VSP, id);
        if (obj == null) {
            obj = getVSPById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VSCsFetcher getVSCsFetcherForVSPId(String id) throws RestException {
        VSP obj = getObject(Constants.VSP, id);
        if (obj == null) {
            obj = getVSPById(id);
        }

        if (obj != null) {
            VSCsFetcher fetcher = obj.getVSCs();
            return addFetcher(Constants.VSCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VSDsFetcher getVSDsFetcherForVSPId(String id) throws RestException {
        VSP obj = getObject(Constants.VSP, id);
        if (obj == null) {
            obj = getVSPById(id);
        }

        if (obj != null) {
            VSDsFetcher fetcher = obj.getVSDs();
            return addFetcher(Constants.VSDS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VSP> getVSPsForFetcherId(String id) throws RestException {
        VSPsFetcher fetcher = getVSPsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VSP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VSP>();
    }

    public static VSPsFetcher getVSPsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VSPS_FETCHER, id);
        if (fetcher != null) {
            return (VSPsFetcher) fetcher;
        }
        if ((fetcher = getVSPsFetcherForMeId(id)) != null) {
            return (VSPsFetcher) addFetcher(Constants.VSPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VSP> getAllVSPs() throws RestException {
        java.util.List<VSP> allObjs = new ArrayList<VSP>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VSPsFetcher fetcher = getVSPsFetcherForMeId(session.getId());
            java.util.List<VSP> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VSPsFetcher> getAllVSPsFetchers() throws RestException {
        java.util.List<VSPsFetcher> allObjs = new ArrayList<VSPsFetcher>();
        return allObjs;
    }
    public static Domain getDomainById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Domain obj = null;
            obj = new Domain();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DOMAIN, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ApplicationperformancemanagementbindingsFetcher getApplicationperformancemanagementbindingsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            ApplicationperformancemanagementbindingsFetcher fetcher = obj.getApplicationperformancemanagementbindings();
            return addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BridgeInterfacesFetcher getBridgeInterfacesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            BridgeInterfacesFetcher fetcher = obj.getBridgeInterfaces();
            return addFetcher(Constants.BRIDGEINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainsFetcher getDomainsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            DomainsFetcher fetcher = obj.getDomains();
            return addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainTemplatesFetcher getDomainTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            DomainTemplatesFetcher fetcher = obj.getDomainTemplates();
            return addFetcher(Constants.DOMAINTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLEntryTemplatesFetcher getEgressACLEntryTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            EgressACLEntryTemplatesFetcher fetcher = obj.getEgressACLEntryTemplates();
            return addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLTemplatesFetcher getEgressACLTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            EgressACLTemplatesFetcher fetcher = obj.getEgressACLTemplates();
            return addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainFIPAclTemplatesFetcher getDomainFIPAclTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            DomainFIPAclTemplatesFetcher fetcher = obj.getDomainFIPAclTemplates();
            return addFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FloatingIPACLTemplatesFetcher getFloatingIPACLTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            FloatingIPACLTemplatesFetcher fetcher = obj.getFloatingIPACLTemplates();
            return addFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ExternalAppServicesFetcher getExternalAppServicesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            ExternalAppServicesFetcher fetcher = obj.getExternalAppServices();
            return addFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FloatingIpsFetcher getFloatingIpsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            FloatingIpsFetcher fetcher = obj.getFloatingIps();
            return addFetcher(Constants.FLOATINGIPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static HostInterfacesFetcher getHostInterfacesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            HostInterfacesFetcher fetcher = obj.getHostInterfaces();
            return addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLEntryTemplatesFetcher getIngressACLEntryTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            IngressACLEntryTemplatesFetcher fetcher = obj.getIngressACLEntryTemplates();
            return addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLTemplatesFetcher getIngressACLTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            IngressACLTemplatesFetcher fetcher = obj.getIngressACLTemplates();
            return addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            IngressAdvFwdTemplatesFetcher fetcher = obj.getIngressAdvFwdTemplates();
            return addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplatesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            IngressExternalServiceTemplatesFetcher fetcher = obj.getIngressExternalServiceTemplates();
            return addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static LinksFetcher getLinksFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            LinksFetcher fetcher = obj.getLinks();
            return addFetcher(Constants.LINKS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RoutingPoliciesFetcher getRoutingPoliciesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            RoutingPoliciesFetcher fetcher = obj.getRoutingPolicies();
            return addFetcher(Constants.ROUTINGPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetsFetcher getSubnetsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            SubnetsFetcher fetcher = obj.getSubnets();
            return addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UplinkRDsFetcher getUplinkRDsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            UplinkRDsFetcher fetcher = obj.getUplinkRDs();
            return addFetcher(Constants.UPLINKRDS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPNConnectionsFetcher getVPNConnectionsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            VPNConnectionsFetcher fetcher = obj.getVPNConnections();
            return addFetcher(Constants.VPNCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ZonesFetcher getZonesFetcherForDomainId(String id) throws RestException {
        Domain obj = getObject(Constants.DOMAIN, id);
        if (obj == null) {
            obj = getDomainById(id);
        }

        if (obj != null) {
            ZonesFetcher fetcher = obj.getZones();
            return addFetcher(Constants.ZONES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Domain> getDomainsForFetcherId(String id) throws RestException {
        DomainsFetcher fetcher = getDomainsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DOMAIN);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Domain>();
    }

    public static DomainsFetcher getDomainsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DOMAINS_FETCHER, id);
        if (fetcher != null) {
            return (DomainsFetcher) fetcher;
        }
        if ((fetcher = getDomainsFetcherForDomainId(id)) != null) {
            return (DomainsFetcher) addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDomainsFetcherForMeId(id)) != null) {
            return (DomainsFetcher) addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDomainsFetcherForDomainTemplateId(id)) != null) {
            return (DomainsFetcher) addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDomainsFetcherForEnterpriseId(id)) != null) {
            return (DomainsFetcher) addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Domain> getAllDomains() throws RestException {
        java.util.List<Domain> allObjs = new ArrayList<Domain>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            DomainsFetcher fetcher = getDomainsFetcherForMeId(session.getId());
            java.util.List<Domain> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<DomainsFetcher> getAllDomainsFetchers() throws RestException {
        java.util.List<DomainsFetcher> allObjs = new ArrayList<DomainsFetcher>();
        return allObjs;
    }
    public static RedundantPort getRedundantPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            RedundantPort obj = null;
            obj = new RedundantPort();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.REDUNDANTPORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForRedundantPortId(String id) throws RestException {
        RedundantPort obj = getObject(Constants.REDUNDANTPORT, id);
        if (obj == null) {
            obj = getRedundantPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForRedundantPortId(String id) throws RestException {
        RedundantPort obj = getObject(Constants.REDUNDANTPORT, id);
        if (obj == null) {
            obj = getRedundantPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSPortsFetcher getNSPortsFetcherForRedundantPortId(String id) throws RestException {
        RedundantPort obj = getObject(Constants.REDUNDANTPORT, id);
        if (obj == null) {
            obj = getRedundantPortById(id);
        }

        if (obj != null) {
            NSPortsFetcher fetcher = obj.getNSPorts();
            return addFetcher(Constants.NSPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VLANsFetcher getVLANsFetcherForRedundantPortId(String id) throws RestException {
        RedundantPort obj = getObject(Constants.REDUNDANTPORT, id);
        if (obj == null) {
            obj = getRedundantPortById(id);
        }

        if (obj != null) {
            VLANsFetcher fetcher = obj.getVLANs();
            return addFetcher(Constants.VLANS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<RedundantPort> getRedundantPortsForFetcherId(String id) throws RestException {
        RedundantPortsFetcher fetcher = getRedundantPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.REDUNDANTPORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<RedundantPort>();
    }

    public static RedundantPortsFetcher getRedundantPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.REDUNDANTPORTS_FETCHER, id);
        if (fetcher != null) {
            return (RedundantPortsFetcher) fetcher;
        }
        if ((fetcher = getRedundantPortsFetcherForNSRedundantGatewayGroupId(id)) != null) {
            return (RedundantPortsFetcher) addFetcher(Constants.REDUNDANTPORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<RedundantPort> getAllRedundantPorts() throws RestException {
        java.util.List<RedundantPort> allObjs = new ArrayList<RedundantPort>();

        return allObjs;
    }

    public static java.util.List<RedundantPortsFetcher> getAllRedundantPortsFetchers() throws RestException {
        java.util.List<RedundantPortsFetcher> allObjs = new ArrayList<RedundantPortsFetcher>();
        return allObjs;
    }
    public static DSCPForwardingClassMapping getDSCPForwardingClassMappingById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DSCPForwardingClassMapping obj = null;
            obj = new DSCPForwardingClassMapping();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DSCPFORWARDINGCLASSMAPPING, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDSCPForwardingClassMappingId(String id) throws RestException {
        DSCPForwardingClassMapping obj = getObject(Constants.DSCPFORWARDINGCLASSMAPPING, id);
        if (obj == null) {
            obj = getDSCPForwardingClassMappingById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDSCPForwardingClassMappingId(String id) throws RestException {
        DSCPForwardingClassMapping obj = getObject(Constants.DSCPFORWARDINGCLASSMAPPING, id);
        if (obj == null) {
            obj = getDSCPForwardingClassMappingById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<DSCPForwardingClassMapping> getDSCPForwardingClassMappingsForFetcherId(String id) throws RestException {
        DSCPForwardingClassMappingsFetcher fetcher = getDSCPForwardingClassMappingsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DSCPFORWARDINGCLASSMAPPING);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DSCPForwardingClassMapping>();
    }

    public static DSCPForwardingClassMappingsFetcher getDSCPForwardingClassMappingsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER, id);
        if (fetcher != null) {
            return (DSCPForwardingClassMappingsFetcher) fetcher;
        }
        if ((fetcher = getDSCPForwardingClassMappingsFetcherForDSCPForwardingClassTableId(id)) != null) {
            return (DSCPForwardingClassMappingsFetcher) addFetcher(Constants.DSCPFORWARDINGCLASSMAPPINGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DSCPForwardingClassMapping> getAllDSCPForwardingClassMappings() throws RestException {
        java.util.List<DSCPForwardingClassMapping> allObjs = new ArrayList<DSCPForwardingClassMapping>();

        return allObjs;
    }

    public static java.util.List<DSCPForwardingClassMappingsFetcher> getAllDSCPForwardingClassMappingsFetchers() throws RestException {
        java.util.List<DSCPForwardingClassMappingsFetcher> allObjs = new ArrayList<DSCPForwardingClassMappingsFetcher>();
        return allObjs;
    }
    public static NetworkLayout getNetworkLayoutById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NetworkLayout obj = null;
            obj = new NetworkLayout();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NETWORKLAYOUT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNetworkLayoutId(String id) throws RestException {
        NetworkLayout obj = getObject(Constants.NETWORKLAYOUT, id);
        if (obj == null) {
            obj = getNetworkLayoutById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNetworkLayoutId(String id) throws RestException {
        NetworkLayout obj = getObject(Constants.NETWORKLAYOUT, id);
        if (obj == null) {
            obj = getNetworkLayoutById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NetworkLayout> getNetworkLayoutsForFetcherId(String id) throws RestException {
        NetworkLayoutsFetcher fetcher = getNetworkLayoutsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NETWORKLAYOUT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NetworkLayout>();
    }

    public static NetworkLayoutsFetcher getNetworkLayoutsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NETWORKLAYOUTS_FETCHER, id);
        if (fetcher != null) {
            return (NetworkLayoutsFetcher) fetcher;
        }
        if ((fetcher = getNetworkLayoutsFetcherForMeId(id)) != null) {
            return (NetworkLayoutsFetcher) addFetcher(Constants.NETWORKLAYOUTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NetworkLayout> getAllNetworkLayouts() throws RestException {
        java.util.List<NetworkLayout> allObjs = new ArrayList<NetworkLayout>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            NetworkLayoutsFetcher fetcher = getNetworkLayoutsFetcherForMeId(session.getId());
            java.util.List<NetworkLayout> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<NetworkLayoutsFetcher> getAllNetworkLayoutsFetchers() throws RestException {
        java.util.List<NetworkLayoutsFetcher> allObjs = new ArrayList<NetworkLayoutsFetcher>();
        return allObjs;
    }
    public static OverlayPATNATEntry getOverlayPATNATEntryById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            OverlayPATNATEntry obj = null;
            obj = new OverlayPATNATEntry();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.OVERLAYPATNATENTRY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<OverlayPATNATEntry> getOverlayPATNATEntriesForFetcherId(String id) throws RestException {
        OverlayPATNATEntriesFetcher fetcher = getOverlayPATNATEntriesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.OVERLAYPATNATENTRY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<OverlayPATNATEntry>();
    }

    public static OverlayPATNATEntriesFetcher getOverlayPATNATEntriesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.OVERLAYPATNATENTRIES_FETCHER, id);
        if (fetcher != null) {
            return (OverlayPATNATEntriesFetcher) fetcher;
        }
        if ((fetcher = getOverlayPATNATEntriesFetcherForOverlayAddressPoolId(id)) != null) {
            return (OverlayPATNATEntriesFetcher) addFetcher(Constants.OVERLAYPATNATENTRIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<OverlayPATNATEntry> getAllOverlayPATNATEntries() throws RestException {
        java.util.List<OverlayPATNATEntry> allObjs = new ArrayList<OverlayPATNATEntry>();

        return allObjs;
    }

    public static java.util.List<OverlayPATNATEntriesFetcher> getAllOverlayPATNATEntriesFetchers() throws RestException {
        java.util.List<OverlayPATNATEntriesFetcher> allObjs = new ArrayList<OverlayPATNATEntriesFetcher>();
        return allObjs;
    }
    public static WANService getWANServiceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            WANService obj = null;
            obj = new WANService();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.WANSERVICE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForWANServiceId(String id) throws RestException {
        WANService obj = getObject(Constants.WANSERVICE, id);
        if (obj == null) {
            obj = getWANServiceById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForWANServiceId(String id) throws RestException {
        WANService obj = getObject(Constants.WANSERVICE, id);
        if (obj == null) {
            obj = getWANServiceById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForWANServiceId(String id) throws RestException {
        WANService obj = getObject(Constants.WANSERVICE, id);
        if (obj == null) {
            obj = getWANServiceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForWANServiceId(String id) throws RestException {
        WANService obj = getObject(Constants.WANSERVICE, id);
        if (obj == null) {
            obj = getWANServiceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForWANServiceId(String id) throws RestException {
        WANService obj = getObject(Constants.WANSERVICE, id);
        if (obj == null) {
            obj = getWANServiceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForWANServiceId(String id) throws RestException {
        WANService obj = getObject(Constants.WANSERVICE, id);
        if (obj == null) {
            obj = getWANServiceById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<WANService> getWANServicesForFetcherId(String id) throws RestException {
        WANServicesFetcher fetcher = getWANServicesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.WANSERVICE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<WANService>();
    }

    public static WANServicesFetcher getWANServicesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.WANSERVICES_FETCHER, id);
        if (fetcher != null) {
            return (WANServicesFetcher) fetcher;
        }
        if ((fetcher = getWANServicesFetcherForRedundancyGroupId(id)) != null) {
            return (WANServicesFetcher) addFetcher(Constants.WANSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getWANServicesFetcherForAutoDiscoveredGatewayId(id)) != null) {
            return (WANServicesFetcher) addFetcher(Constants.WANSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getWANServicesFetcherForGatewayId(id)) != null) {
            return (WANServicesFetcher) addFetcher(Constants.WANSERVICES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<WANService> getAllWANServices() throws RestException {
        java.util.List<WANService> allObjs = new ArrayList<WANService>();

        return allObjs;
    }

    public static java.util.List<WANServicesFetcher> getAllWANServicesFetchers() throws RestException {
        java.util.List<WANServicesFetcher> allObjs = new ArrayList<WANServicesFetcher>();
        return allObjs;
    }
    public static VSD getVSDById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VSD obj = null;
            obj = new VSD();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VSD, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForVSDId(String id) throws RestException {
        VSD obj = getObject(Constants.VSD, id);
        if (obj == null) {
            obj = getVSDById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VSDComponentsFetcher getVSDComponentsFetcherForVSDId(String id) throws RestException {
        VSD obj = getObject(Constants.VSD, id);
        if (obj == null) {
            obj = getVSDById(id);
        }

        if (obj != null) {
            VSDComponentsFetcher fetcher = obj.getVSDComponents();
            return addFetcher(Constants.VSDCOMPONENTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVSDId(String id) throws RestException {
        VSD obj = getObject(Constants.VSD, id);
        if (obj == null) {
            obj = getVSDById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVSDId(String id) throws RestException {
        VSD obj = getObject(Constants.VSD, id);
        if (obj == null) {
            obj = getVSDById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForVSDId(String id) throws RestException {
        VSD obj = getObject(Constants.VSD, id);
        if (obj == null) {
            obj = getVSDById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVSDId(String id) throws RestException {
        VSD obj = getObject(Constants.VSD, id);
        if (obj == null) {
            obj = getVSDById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VSD> getVSDsForFetcherId(String id) throws RestException {
        VSDsFetcher fetcher = getVSDsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VSD);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VSD>();
    }

    public static VSDsFetcher getVSDsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VSDS_FETCHER, id);
        if (fetcher != null) {
            return (VSDsFetcher) fetcher;
        }
        if ((fetcher = getVSDsFetcherForVSPId(id)) != null) {
            return (VSDsFetcher) addFetcher(Constants.VSDS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VSD> getAllVSDs() throws RestException {
        java.util.List<VSD> allObjs = new ArrayList<VSD>();

        return allObjs;
    }

    public static java.util.List<VSDsFetcher> getAllVSDsFetchers() throws RestException {
        java.util.List<VSDsFetcher> allObjs = new ArrayList<VSDsFetcher>();
        return allObjs;
    }
    public static VPort getVPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VPort obj = null;
            obj = new VPort();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VPORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AggregateMetadatasFetcher getAggregateMetadatasFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            AggregateMetadatasFetcher fetcher = obj.getAggregateMetadatas();
            return addFetcher(Constants.AGGREGATEMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static AlarmsFetcher getAlarmsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ApplicationperformancemanagementsFetcher getApplicationperformancemanagementsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            ApplicationperformancemanagementsFetcher fetcher = obj.getApplicationperformancemanagements();
            return addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BridgeInterfacesFetcher getBridgeInterfacesFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            BridgeInterfacesFetcher fetcher = obj.getBridgeInterfaces();
            return addFetcher(Constants.BRIDGEINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static HostInterfacesFetcher getHostInterfacesFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            HostInterfacesFetcher fetcher = obj.getHostInterfaces();
            return addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PortMappingsFetcher getPortMappingsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            PortMappingsFetcher fetcher = obj.getPortMappings();
            return addFetcher(Constants.PORTMAPPINGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VirtualIPsFetcher getVirtualIPsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            VirtualIPsFetcher fetcher = obj.getVirtualIPs();
            return addFetcher(Constants.VIRTUALIPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortMirrorsFetcher getVPortMirrorsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            VPortMirrorsFetcher fetcher = obj.getVPortMirrors();
            return addFetcher(Constants.VPORTMIRRORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSsFetcher getVRSsFetcherForVPortId(String id) throws RestException {
        VPort obj = getObject(Constants.VPORT, id);
        if (obj == null) {
            obj = getVPortById(id);
        }

        if (obj != null) {
            VRSsFetcher fetcher = obj.getVRSs();
            return addFetcher(Constants.VRSS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VPort> getVPortsForFetcherId(String id) throws RestException {
        VPortsFetcher fetcher = getVPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VPORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VPort>();
    }

    public static VPortsFetcher getVPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VPORTS_FETCHER, id);
        if (fetcher != null) {
            return (VPortsFetcher) fetcher;
        }
        if ((fetcher = getVPortsFetcherForZoneId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForRedirectionTargetId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForDomainId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForSubnetId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForVRSId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForTierId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForMultiNICVPortId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForL2DomainId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForFloatingIpId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortsFetcherForPolicyGroupId(id)) != null) {
            return (VPortsFetcher) addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VPort> getAllVPorts() throws RestException {
        java.util.List<VPort> allObjs = new ArrayList<VPort>();

        return allObjs;
    }

    public static java.util.List<VPortsFetcher> getAllVPortsFetchers() throws RestException {
        java.util.List<VPortsFetcher> allObjs = new ArrayList<VPortsFetcher>();
        return allObjs;
    }
    public static FlowForwardingPolicy getFlowForwardingPolicyById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            FlowForwardingPolicy obj = null;
            obj = new FlowForwardingPolicy();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.FLOWFORWARDINGPOLICY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForFlowForwardingPolicyId(String id) throws RestException {
        FlowForwardingPolicy obj = getObject(Constants.FLOWFORWARDINGPOLICY, id);
        if (obj == null) {
            obj = getFlowForwardingPolicyById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForFlowForwardingPolicyId(String id) throws RestException {
        FlowForwardingPolicy obj = getObject(Constants.FLOWFORWARDINGPOLICY, id);
        if (obj == null) {
            obj = getFlowForwardingPolicyById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForFlowForwardingPolicyId(String id) throws RestException {
        FlowForwardingPolicy obj = getObject(Constants.FLOWFORWARDINGPOLICY, id);
        if (obj == null) {
            obj = getFlowForwardingPolicyById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<FlowForwardingPolicy> getFlowForwardingPoliciesForFetcherId(String id) throws RestException {
        FlowForwardingPoliciesFetcher fetcher = getFlowForwardingPoliciesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.FLOWFORWARDINGPOLICY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<FlowForwardingPolicy>();
    }

    public static FlowForwardingPoliciesFetcher getFlowForwardingPoliciesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.FLOWFORWARDINGPOLICIES_FETCHER, id);
        if (fetcher != null) {
            return (FlowForwardingPoliciesFetcher) fetcher;
        }
        if ((fetcher = getFlowForwardingPoliciesFetcherForFlowId(id)) != null) {
            return (FlowForwardingPoliciesFetcher) addFetcher(Constants.FLOWFORWARDINGPOLICIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<FlowForwardingPolicy> getAllFlowForwardingPolicies() throws RestException {
        java.util.List<FlowForwardingPolicy> allObjs = new ArrayList<FlowForwardingPolicy>();

        return allObjs;
    }

    public static java.util.List<FlowForwardingPoliciesFetcher> getAllFlowForwardingPoliciesFetchers() throws RestException {
        java.util.List<FlowForwardingPoliciesFetcher> allObjs = new ArrayList<FlowForwardingPoliciesFetcher>();
        return allObjs;
    }
    public static Port getPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Port obj = null;
            obj = new Port();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VLANsFetcher getVLANsFetcherForPortId(String id) throws RestException {
        Port obj = getObject(Constants.PORT, id);
        if (obj == null) {
            obj = getPortById(id);
        }

        if (obj != null) {
            VLANsFetcher fetcher = obj.getVLANs();
            return addFetcher(Constants.VLANS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Port> getPortsForFetcherId(String id) throws RestException {
        PortsFetcher fetcher = getPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Port>();
    }

    public static PortsFetcher getPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PORTS_FETCHER, id);
        if (fetcher != null) {
            return (PortsFetcher) fetcher;
        }
        if ((fetcher = getPortsFetcherForRedundancyGroupId(id)) != null) {
            return (PortsFetcher) addFetcher(Constants.PORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPortsFetcherForAutoDiscoveredGatewayId(id)) != null) {
            return (PortsFetcher) addFetcher(Constants.PORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPortsFetcherForGatewayId(id)) != null) {
            return (PortsFetcher) addFetcher(Constants.PORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Port> getAllPorts() throws RestException {
        java.util.List<Port> allObjs = new ArrayList<Port>();

        return allObjs;
    }

    public static java.util.List<PortsFetcher> getAllPortsFetchers() throws RestException {
        java.util.List<PortsFetcher> allObjs = new ArrayList<PortsFetcher>();
        return allObjs;
    }
    public static StatisticsPolicy getStatisticsPolicyById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            StatisticsPolicy obj = null;
            obj = new StatisticsPolicy();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.STATISTICSPOLICY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForStatisticsPolicyId(String id) throws RestException {
        StatisticsPolicy obj = getObject(Constants.STATISTICSPOLICY, id);
        if (obj == null) {
            obj = getStatisticsPolicyById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForStatisticsPolicyId(String id) throws RestException {
        StatisticsPolicy obj = getObject(Constants.STATISTICSPOLICY, id);
        if (obj == null) {
            obj = getStatisticsPolicyById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<StatisticsPolicy> getStatisticsPoliciesForFetcherId(String id) throws RestException {
        StatisticsPoliciesFetcher fetcher = getStatisticsPoliciesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.STATISTICSPOLICY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<StatisticsPolicy>();
    }

    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.STATISTICSPOLICIES_FETCHER, id);
        if (fetcher != null) {
            return (StatisticsPoliciesFetcher) fetcher;
        }
        if ((fetcher = getStatisticsPoliciesFetcherForZoneId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForDomainId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForVPortId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForSubnetId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForTierId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForAddressMapId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForL2DomainId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForNSPortId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsPoliciesFetcherForPATNATPoolId(id)) != null) {
            return (StatisticsPoliciesFetcher) addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<StatisticsPolicy> getAllStatisticsPolicies() throws RestException {
        java.util.List<StatisticsPolicy> allObjs = new ArrayList<StatisticsPolicy>();

        return allObjs;
    }

    public static java.util.List<StatisticsPoliciesFetcher> getAllStatisticsPoliciesFetchers() throws RestException {
        java.util.List<StatisticsPoliciesFetcher> allObjs = new ArrayList<StatisticsPoliciesFetcher>();
        return allObjs;
    }
    public static Subnet getSubnetById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Subnet obj = null;
            obj = new Subnet();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.SUBNET, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AddressRangesFetcher getAddressRangesFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            AddressRangesFetcher fetcher = obj.getAddressRanges();
            return addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPNeighborsFetcher getBGPNeighborsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            BGPNeighborsFetcher fetcher = obj.getBGPNeighbors();
            return addFetcher(Constants.BGPNEIGHBORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerResyncsFetcher getContainerResyncsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            ContainerResyncsFetcher fetcher = obj.getContainerResyncs();
            return addFetcher(Constants.CONTAINERRESYNCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEGatewayConnectionsFetcher getIKEGatewayConnectionsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            IKEGatewayConnectionsFetcher fetcher = obj.getIKEGatewayConnections();
            return addFetcher(Constants.IKEGATEWAYCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IPReservationsFetcher getIPReservationsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            IPReservationsFetcher fetcher = obj.getIPReservations();
            return addFetcher(Constants.IPRESERVATIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMResyncsFetcher getVMResyncsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            VMResyncsFetcher fetcher = obj.getVMResyncs();
            return addFetcher(Constants.VMRESYNCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VirtualIPsFetcher getVirtualIPsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            VirtualIPsFetcher fetcher = obj.getVirtualIPs();
            return addFetcher(Constants.VIRTUALIPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForSubnetId(String id) throws RestException {
        Subnet obj = getObject(Constants.SUBNET, id);
        if (obj == null) {
            obj = getSubnetById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Subnet> getSubnetsForFetcherId(String id) throws RestException {
        SubnetsFetcher fetcher = getSubnetsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.SUBNET);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Subnet>();
    }

    public static SubnetsFetcher getSubnetsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.SUBNETS_FETCHER, id);
        if (fetcher != null) {
            return (SubnetsFetcher) fetcher;
        }
        if ((fetcher = getSubnetsFetcherForZoneId(id)) != null) {
            return (SubnetsFetcher) addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getSubnetsFetcherForSubnetTemplateId(id)) != null) {
            return (SubnetsFetcher) addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getSubnetsFetcherForIKEGatewayConnectionId(id)) != null) {
            return (SubnetsFetcher) addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getSubnetsFetcherForDomainId(id)) != null) {
            return (SubnetsFetcher) addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getSubnetsFetcherForMeId(id)) != null) {
            return (SubnetsFetcher) addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }
        
        if ((fetcher = getSubnetsFetcherForNSGatewayId(id)) != null) {
            return (SubnetsFetcher) addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Subnet> getAllSubnets() throws RestException {
        java.util.List<Subnet> allObjs = new ArrayList<Subnet>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            SubnetsFetcher fetcher = getSubnetsFetcherForMeId(session.getId());
            java.util.List<Subnet> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<SubnetsFetcher> getAllSubnetsFetchers() throws RestException {
        java.util.List<SubnetsFetcher> allObjs = new ArrayList<SubnetsFetcher>();
        return allObjs;
    }
    public static Container getContainerById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Container obj = null;
            obj = new Container();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.CONTAINER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerResyncsFetcher getContainerResyncsFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            ContainerResyncsFetcher fetcher = obj.getContainerResyncs();
            return addFetcher(Constants.CONTAINERRESYNCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSsFetcher getVRSsFetcherForContainerId(String id) throws RestException {
        Container obj = getObject(Constants.CONTAINER, id);
        if (obj == null) {
            obj = getContainerById(id);
        }

        if (obj != null) {
            VRSsFetcher fetcher = obj.getVRSs();
            return addFetcher(Constants.VRSS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Container> getContainersForFetcherId(String id) throws RestException {
        ContainersFetcher fetcher = getContainersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.CONTAINER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Container>();
    }

    public static ContainersFetcher getContainersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.CONTAINERS_FETCHER, id);
        if (fetcher != null) {
            return (ContainersFetcher) fetcher;
        }
        if ((fetcher = getContainersFetcherForQOSId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForZoneId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForDomainId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForVPortId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForSubnetId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForVRSId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForTierId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForL2DomainId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForMeId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForEgressACLTemplateId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForUserId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForEnterpriseId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainersFetcherForIngressACLTemplateId(id)) != null) {
            return (ContainersFetcher) addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Container> getAllContainers() throws RestException {
        java.util.List<Container> allObjs = new ArrayList<Container>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ContainersFetcher fetcher = getContainersFetcherForMeId(session.getId());
            java.util.List<Container> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ContainersFetcher> getAllContainersFetchers() throws RestException {
        java.util.List<ContainersFetcher> allObjs = new ArrayList<ContainersFetcher>();
        return allObjs;
    }
    public static RateLimiter getRateLimiterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            RateLimiter obj = null;
            obj = new RateLimiter();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.RATELIMITER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForRateLimiterId(String id) throws RestException {
        RateLimiter obj = getObject(Constants.RATELIMITER, id);
        if (obj == null) {
            obj = getRateLimiterById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForRateLimiterId(String id) throws RestException {
        RateLimiter obj = getObject(Constants.RATELIMITER, id);
        if (obj == null) {
            obj = getRateLimiterById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<RateLimiter> getRateLimitersForFetcherId(String id) throws RestException {
        RateLimitersFetcher fetcher = getRateLimitersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.RATELIMITER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<RateLimiter>();
    }

    public static RateLimitersFetcher getRateLimitersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.RATELIMITERS_FETCHER, id);
        if (fetcher != null) {
            return (RateLimitersFetcher) fetcher;
        }
        if ((fetcher = getRateLimitersFetcherForMeId(id)) != null) {
            return (RateLimitersFetcher) addFetcher(Constants.RATELIMITERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getRateLimitersFetcherForEnterpriseId(id)) != null) {
            return (RateLimitersFetcher) addFetcher(Constants.RATELIMITERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<RateLimiter> getAllRateLimiters() throws RestException {
        java.util.List<RateLimiter> allObjs = new ArrayList<RateLimiter>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            RateLimitersFetcher fetcher = getRateLimitersFetcherForMeId(session.getId());
            java.util.List<RateLimiter> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<RateLimitersFetcher> getAllRateLimitersFetchers() throws RestException {
        java.util.List<RateLimitersFetcher> allObjs = new ArrayList<RateLimitersFetcher>();
        return allObjs;
    }
    public static KeyServerMonitorEncryptedSeed getKeyServerMonitorEncryptedSeedById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerMonitorEncryptedSeed obj = null;
            obj = new KeyServerMonitorEncryptedSeed();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.KEYSERVERMONITORENCRYPTEDSEED, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForKeyServerMonitorEncryptedSeedId(String id) throws RestException {
        KeyServerMonitorEncryptedSeed obj = getObject(Constants.KEYSERVERMONITORENCRYPTEDSEED, id);
        if (obj == null) {
            obj = getKeyServerMonitorEncryptedSeedById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForKeyServerMonitorEncryptedSeedId(String id) throws RestException {
        KeyServerMonitorEncryptedSeed obj = getObject(Constants.KEYSERVERMONITORENCRYPTEDSEED, id);
        if (obj == null) {
            obj = getKeyServerMonitorEncryptedSeedById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<KeyServerMonitorEncryptedSeed> getKeyServerMonitorEncryptedSeedsForFetcherId(String id) throws RestException {
        KeyServerMonitorEncryptedSeedsFetcher fetcher = getKeyServerMonitorEncryptedSeedsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.KEYSERVERMONITORENCRYPTEDSEED);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<KeyServerMonitorEncryptedSeed>();
    }

    public static KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeedsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, id);
        if (fetcher != null) {
            return (KeyServerMonitorEncryptedSeedsFetcher) fetcher;
        }
        if ((fetcher = getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorSeedId(id)) != null) {
            return (KeyServerMonitorEncryptedSeedsFetcher) addFetcher(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, fetcher);
        }
        
        if ((fetcher = getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorId(id)) != null) {
            return (KeyServerMonitorEncryptedSeedsFetcher) addFetcher(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<KeyServerMonitorEncryptedSeed> getAllKeyServerMonitorEncryptedSeeds() throws RestException {
        java.util.List<KeyServerMonitorEncryptedSeed> allObjs = new ArrayList<KeyServerMonitorEncryptedSeed>();

        return allObjs;
    }

    public static java.util.List<KeyServerMonitorEncryptedSeedsFetcher> getAllKeyServerMonitorEncryptedSeedsFetchers() throws RestException {
        java.util.List<KeyServerMonitorEncryptedSeedsFetcher> allObjs = new ArrayList<KeyServerMonitorEncryptedSeedsFetcher>();
        return allObjs;
    }
    public static ZoneTemplate getZoneTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ZoneTemplate obj = null;
            obj = new ZoneTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ZONETEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForZoneTemplateId(String id) throws RestException {
        ZoneTemplate obj = getObject(Constants.ZONETEMPLATE, id);
        if (obj == null) {
            obj = getZoneTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForZoneTemplateId(String id) throws RestException {
        ZoneTemplate obj = getObject(Constants.ZONETEMPLATE, id);
        if (obj == null) {
            obj = getZoneTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForZoneTemplateId(String id) throws RestException {
        ZoneTemplate obj = getObject(Constants.ZONETEMPLATE, id);
        if (obj == null) {
            obj = getZoneTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForZoneTemplateId(String id) throws RestException {
        ZoneTemplate obj = getObject(Constants.ZONETEMPLATE, id);
        if (obj == null) {
            obj = getZoneTemplateById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetTemplatesFetcher getSubnetTemplatesFetcherForZoneTemplateId(String id) throws RestException {
        ZoneTemplate obj = getObject(Constants.ZONETEMPLATE, id);
        if (obj == null) {
            obj = getZoneTemplateById(id);
        }

        if (obj != null) {
            SubnetTemplatesFetcher fetcher = obj.getSubnetTemplates();
            return addFetcher(Constants.SUBNETTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ZoneTemplate> getZoneTemplatesForFetcherId(String id) throws RestException {
        ZoneTemplatesFetcher fetcher = getZoneTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ZONETEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ZoneTemplate>();
    }

    public static ZoneTemplatesFetcher getZoneTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ZONETEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (ZoneTemplatesFetcher) fetcher;
        }
        if ((fetcher = getZoneTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (ZoneTemplatesFetcher) addFetcher(Constants.ZONETEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ZoneTemplate> getAllZoneTemplates() throws RestException {
        java.util.List<ZoneTemplate> allObjs = new ArrayList<ZoneTemplate>();

        return allObjs;
    }

    public static java.util.List<ZoneTemplatesFetcher> getAllZoneTemplatesFetchers() throws RestException {
        java.util.List<ZoneTemplatesFetcher> allObjs = new ArrayList<ZoneTemplatesFetcher>();
        return allObjs;
    }
    public static KeyServerMonitorSeed getKeyServerMonitorSeedById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerMonitorSeed obj = null;
            obj = new KeyServerMonitorSeed();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.KEYSERVERMONITORSEED, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForKeyServerMonitorSeedId(String id) throws RestException {
        KeyServerMonitorSeed obj = getObject(Constants.KEYSERVERMONITORSEED, id);
        if (obj == null) {
            obj = getKeyServerMonitorSeedById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorSeedId(String id) throws RestException {
        KeyServerMonitorSeed obj = getObject(Constants.KEYSERVERMONITORSEED, id);
        if (obj == null) {
            obj = getKeyServerMonitorSeedById(id);
        }

        if (obj != null) {
            KeyServerMonitorEncryptedSeedsFetcher fetcher = obj.getKeyServerMonitorEncryptedSeeds();
            return addFetcher(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForKeyServerMonitorSeedId(String id) throws RestException {
        KeyServerMonitorSeed obj = getObject(Constants.KEYSERVERMONITORSEED, id);
        if (obj == null) {
            obj = getKeyServerMonitorSeedById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<KeyServerMonitorSeed> getKeyServerMonitorSeedsForFetcherId(String id) throws RestException {
        KeyServerMonitorSeedsFetcher fetcher = getKeyServerMonitorSeedsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.KEYSERVERMONITORSEED);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<KeyServerMonitorSeed>();
    }

    public static KeyServerMonitorSeedsFetcher getKeyServerMonitorSeedsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.KEYSERVERMONITORSEEDS_FETCHER, id);
        if (fetcher != null) {
            return (KeyServerMonitorSeedsFetcher) fetcher;
        }
        if ((fetcher = getKeyServerMonitorSeedsFetcherForKeyServerMonitorId(id)) != null) {
            return (KeyServerMonitorSeedsFetcher) addFetcher(Constants.KEYSERVERMONITORSEEDS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<KeyServerMonitorSeed> getAllKeyServerMonitorSeeds() throws RestException {
        java.util.List<KeyServerMonitorSeed> allObjs = new ArrayList<KeyServerMonitorSeed>();

        return allObjs;
    }

    public static java.util.List<KeyServerMonitorSeedsFetcher> getAllKeyServerMonitorSeedsFetchers() throws RestException {
        java.util.List<KeyServerMonitorSeedsFetcher> allObjs = new ArrayList<KeyServerMonitorSeedsFetcher>();
        return allObjs;
    }
    public static GatewayTemplate getGatewayTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            GatewayTemplate obj = null;
            obj = new GatewayTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GATEWAYTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGatewayTemplateId(String id) throws RestException {
        GatewayTemplate obj = getObject(Constants.GATEWAYTEMPLATE, id);
        if (obj == null) {
            obj = getGatewayTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGatewayTemplateId(String id) throws RestException {
        GatewayTemplate obj = getObject(Constants.GATEWAYTEMPLATE, id);
        if (obj == null) {
            obj = getGatewayTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PortTemplatesFetcher getPortTemplatesFetcherForGatewayTemplateId(String id) throws RestException {
        GatewayTemplate obj = getObject(Constants.GATEWAYTEMPLATE, id);
        if (obj == null) {
            obj = getGatewayTemplateById(id);
        }

        if (obj != null) {
            PortTemplatesFetcher fetcher = obj.getPortTemplates();
            return addFetcher(Constants.PORTTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<GatewayTemplate> getGatewayTemplatesForFetcherId(String id) throws RestException {
        GatewayTemplatesFetcher fetcher = getGatewayTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GATEWAYTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<GatewayTemplate>();
    }

    public static GatewayTemplatesFetcher getGatewayTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GATEWAYTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (GatewayTemplatesFetcher) fetcher;
        }
        if ((fetcher = getGatewayTemplatesFetcherForMeId(id)) != null) {
            return (GatewayTemplatesFetcher) addFetcher(Constants.GATEWAYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getGatewayTemplatesFetcherForEnterpriseId(id)) != null) {
            return (GatewayTemplatesFetcher) addFetcher(Constants.GATEWAYTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<GatewayTemplate> getAllGatewayTemplates() throws RestException {
        java.util.List<GatewayTemplate> allObjs = new ArrayList<GatewayTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            GatewayTemplatesFetcher fetcher = getGatewayTemplatesFetcherForMeId(session.getId());
            java.util.List<GatewayTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<GatewayTemplatesFetcher> getAllGatewayTemplatesFetchers() throws RestException {
        java.util.List<GatewayTemplatesFetcher> allObjs = new ArrayList<GatewayTemplatesFetcher>();
        return allObjs;
    }
    public static VRS getVRSById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VRS obj = null;
            obj = new VRS();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VRS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static HSCsFetcher getHSCsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            HSCsFetcher fetcher = obj.getHSCs();
            return addFetcher(Constants.HSCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MonitoringPortsFetcher getMonitoringPortsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            MonitoringPortsFetcher fetcher = obj.getMonitoringPorts();
            return addFetcher(Constants.MONITORINGPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiNICVPortsFetcher getMultiNICVPortsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            MultiNICVPortsFetcher fetcher = obj.getMultiNICVPorts();
            return addFetcher(Constants.MULTINICVPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VSCsFetcher getVSCsFetcherForVRSId(String id) throws RestException {
        VRS obj = getObject(Constants.VRS, id);
        if (obj == null) {
            obj = getVRSById(id);
        }

        if (obj != null) {
            VSCsFetcher fetcher = obj.getVSCs();
            return addFetcher(Constants.VSCS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VRS> getVRSsForFetcherId(String id) throws RestException {
        VRSsFetcher fetcher = getVRSsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VRS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VRS>();
    }

    public static VRSsFetcher getVRSsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VRSS_FETCHER, id);
        if (fetcher != null) {
            return (VRSsFetcher) fetcher;
        }
        if ((fetcher = getVRSsFetcherForVPortId(id)) != null) {
            return (VRSsFetcher) addFetcher(Constants.VRSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSsFetcherForContainerId(id)) != null) {
            return (VRSsFetcher) addFetcher(Constants.VRSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSsFetcherForHSCId(id)) != null) {
            return (VRSsFetcher) addFetcher(Constants.VRSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSsFetcherForVSCId(id)) != null) {
            return (VRSsFetcher) addFetcher(Constants.VRSS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSsFetcherForVMId(id)) != null) {
            return (VRSsFetcher) addFetcher(Constants.VRSS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VRS> getAllVRSs() throws RestException {
        java.util.List<VRS> allObjs = new ArrayList<VRS>();

        return allObjs;
    }

    public static java.util.List<VRSsFetcher> getAllVRSsFetchers() throws RestException {
        java.util.List<VRSsFetcher> allObjs = new ArrayList<VRSsFetcher>();
        return allObjs;
    }
    public static HSC getHSCById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            HSC obj = null;
            obj = new HSC();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.HSC, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPPeersFetcher getBGPPeersFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            BGPPeersFetcher fetcher = obj.getBGPPeers();
            return addFetcher(Constants.BGPPEERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MonitoringPortsFetcher getMonitoringPortsFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            MonitoringPortsFetcher fetcher = obj.getMonitoringPorts();
            return addFetcher(Constants.MONITORINGPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSsFetcher getVRSsFetcherForHSCId(String id) throws RestException {
        HSC obj = getObject(Constants.HSC, id);
        if (obj == null) {
            obj = getHSCById(id);
        }

        if (obj != null) {
            VRSsFetcher fetcher = obj.getVRSs();
            return addFetcher(Constants.VRSS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<HSC> getHSCsForFetcherId(String id) throws RestException {
        HSCsFetcher fetcher = getHSCsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.HSC);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<HSC>();
    }

    public static HSCsFetcher getHSCsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.HSCS_FETCHER, id);
        if (fetcher != null) {
            return (HSCsFetcher) fetcher;
        }
        if ((fetcher = getHSCsFetcherForVSPId(id)) != null) {
            return (HSCsFetcher) addFetcher(Constants.HSCS_FETCHER, fetcher);
        }
        
        if ((fetcher = getHSCsFetcherForVRSId(id)) != null) {
            return (HSCsFetcher) addFetcher(Constants.HSCS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<HSC> getAllHSCs() throws RestException {
        java.util.List<HSC> allObjs = new ArrayList<HSC>();

        return allObjs;
    }

    public static java.util.List<HSCsFetcher> getAllHSCsFetchers() throws RestException {
        java.util.List<HSCsFetcher> allObjs = new ArrayList<HSCsFetcher>();
        return allObjs;
    }
    public static VLAN getVLANById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VLAN obj = null;
            obj = new VLAN();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VLAN, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPNeighborsFetcher getBGPNeighborsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            BGPNeighborsFetcher fetcher = obj.getBGPNeighbors();
            return addFetcher(Constants.BGPNEIGHBORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BRConnectionsFetcher getBRConnectionsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            BRConnectionsFetcher fetcher = obj.getBRConnections();
            return addFetcher(Constants.BRCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEGatewayConnectionsFetcher getIKEGatewayConnectionsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            IKEGatewayConnectionsFetcher fetcher = obj.getIKEGatewayConnections();
            return addFetcher(Constants.IKEGATEWAYCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATNATPoolsFetcher getPATNATPoolsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            PATNATPoolsFetcher fetcher = obj.getPATNATPools();
            return addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UplinkConnectionsFetcher getUplinkConnectionsFetcherForVLANId(String id) throws RestException {
        VLAN obj = getObject(Constants.VLAN, id);
        if (obj == null) {
            obj = getVLANById(id);
        }

        if (obj != null) {
            UplinkConnectionsFetcher fetcher = obj.getUplinkConnections();
            return addFetcher(Constants.UPLINKCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VLAN> getVLANsForFetcherId(String id) throws RestException {
        VLANsFetcher fetcher = getVLANsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VLAN);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VLAN>();
    }

    public static VLANsFetcher getVLANsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VLANS_FETCHER, id);
        if (fetcher != null) {
            return (VLANsFetcher) fetcher;
        }
        if ((fetcher = getVLANsFetcherForVsgRedundantPortId(id)) != null) {
            return (VLANsFetcher) addFetcher(Constants.VLANS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVLANsFetcherForRedundantPortId(id)) != null) {
            return (VLANsFetcher) addFetcher(Constants.VLANS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVLANsFetcherForPortId(id)) != null) {
            return (VLANsFetcher) addFetcher(Constants.VLANS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVLANsFetcherForNSPortId(id)) != null) {
            return (VLANsFetcher) addFetcher(Constants.VLANS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VLAN> getAllVLANs() throws RestException {
        java.util.List<VLAN> allObjs = new ArrayList<VLAN>();

        return allObjs;
    }

    public static java.util.List<VLANsFetcher> getAllVLANsFetchers() throws RestException {
        java.util.List<VLANsFetcher> allObjs = new ArrayList<VLANsFetcher>();
        return allObjs;
    }
    public static LDAPConfiguration getLDAPConfigurationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            LDAPConfiguration obj = null;
            obj = new LDAPConfiguration();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.LDAPCONFIGURATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForLDAPConfigurationId(String id) throws RestException {
        LDAPConfiguration obj = getObject(Constants.LDAPCONFIGURATION, id);
        if (obj == null) {
            obj = getLDAPConfigurationById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForLDAPConfigurationId(String id) throws RestException {
        LDAPConfiguration obj = getObject(Constants.LDAPCONFIGURATION, id);
        if (obj == null) {
            obj = getLDAPConfigurationById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<LDAPConfiguration> getLDAPConfigurationsForFetcherId(String id) throws RestException {
        LDAPConfigurationsFetcher fetcher = getLDAPConfigurationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.LDAPCONFIGURATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<LDAPConfiguration>();
    }

    public static LDAPConfigurationsFetcher getLDAPConfigurationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.LDAPCONFIGURATIONS_FETCHER, id);
        if (fetcher != null) {
            return (LDAPConfigurationsFetcher) fetcher;
        }
        if ((fetcher = getLDAPConfigurationsFetcherForEnterpriseId(id)) != null) {
            return (LDAPConfigurationsFetcher) addFetcher(Constants.LDAPCONFIGURATIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<LDAPConfiguration> getAllLDAPConfigurations() throws RestException {
        java.util.List<LDAPConfiguration> allObjs = new ArrayList<LDAPConfiguration>();

        return allObjs;
    }

    public static java.util.List<LDAPConfigurationsFetcher> getAllLDAPConfigurationsFetchers() throws RestException {
        java.util.List<LDAPConfigurationsFetcher> allObjs = new ArrayList<LDAPConfigurationsFetcher>();
        return allObjs;
    }
    public static VSDComponent getVSDComponentById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VSDComponent obj = null;
            obj = new VSDComponent();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VSDCOMPONENT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVSDComponentId(String id) throws RestException {
        VSDComponent obj = getObject(Constants.VSDCOMPONENT, id);
        if (obj == null) {
            obj = getVSDComponentById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVSDComponentId(String id) throws RestException {
        VSDComponent obj = getObject(Constants.VSDCOMPONENT, id);
        if (obj == null) {
            obj = getVSDComponentById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VSDComponent> getVSDComponentsForFetcherId(String id) throws RestException {
        VSDComponentsFetcher fetcher = getVSDComponentsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VSDCOMPONENT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VSDComponent>();
    }

    public static VSDComponentsFetcher getVSDComponentsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VSDCOMPONENTS_FETCHER, id);
        if (fetcher != null) {
            return (VSDComponentsFetcher) fetcher;
        }
        if ((fetcher = getVSDComponentsFetcherForVSDId(id)) != null) {
            return (VSDComponentsFetcher) addFetcher(Constants.VSDCOMPONENTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VSDComponent> getAllVSDComponents() throws RestException {
        java.util.List<VSDComponent> allObjs = new ArrayList<VSDComponent>();

        return allObjs;
    }

    public static java.util.List<VSDComponentsFetcher> getAllVSDComponentsFetchers() throws RestException {
        java.util.List<VSDComponentsFetcher> allObjs = new ArrayList<VSDComponentsFetcher>();
        return allObjs;
    }
    public static ZFBRequest getZFBRequestById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ZFBRequest obj = null;
            obj = new ZFBRequest();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ZFBREQUEST, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForZFBRequestId(String id) throws RestException {
        ZFBRequest obj = getObject(Constants.ZFBREQUEST, id);
        if (obj == null) {
            obj = getZFBRequestById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForZFBRequestId(String id) throws RestException {
        ZFBRequest obj = getObject(Constants.ZFBREQUEST, id);
        if (obj == null) {
            obj = getZFBRequestById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForZFBRequestId(String id) throws RestException {
        ZFBRequest obj = getObject(Constants.ZFBREQUEST, id);
        if (obj == null) {
            obj = getZFBRequestById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ZFBRequest> getZFBRequestsForFetcherId(String id) throws RestException {
        ZFBRequestsFetcher fetcher = getZFBRequestsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ZFBREQUEST);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ZFBRequest>();
    }

    public static ZFBRequestsFetcher getZFBRequestsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ZFBREQUESTS_FETCHER, id);
        if (fetcher != null) {
            return (ZFBRequestsFetcher) fetcher;
        }
        if ((fetcher = getZFBRequestsFetcherForMeId(id)) != null) {
            return (ZFBRequestsFetcher) addFetcher(Constants.ZFBREQUESTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getZFBRequestsFetcherForEnterpriseId(id)) != null) {
            return (ZFBRequestsFetcher) addFetcher(Constants.ZFBREQUESTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ZFBRequest> getAllZFBRequests() throws RestException {
        java.util.List<ZFBRequest> allObjs = new ArrayList<ZFBRequest>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ZFBRequestsFetcher fetcher = getZFBRequestsFetcherForMeId(session.getId());
            java.util.List<ZFBRequest> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ZFBRequestsFetcher> getAllZFBRequestsFetchers() throws RestException {
        java.util.List<ZFBRequestsFetcher> allObjs = new ArrayList<ZFBRequestsFetcher>();
        return allObjs;
    }
    public static EnterprisePermission getEnterprisePermissionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterprisePermission obj = null;
            obj = new EnterprisePermission();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENTERPRISEPERMISSION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEnterprisePermissionId(String id) throws RestException {
        EnterprisePermission obj = getObject(Constants.ENTERPRISEPERMISSION, id);
        if (obj == null) {
            obj = getEnterprisePermissionById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEnterprisePermissionId(String id) throws RestException {
        EnterprisePermission obj = getObject(Constants.ENTERPRISEPERMISSION, id);
        if (obj == null) {
            obj = getEnterprisePermissionById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EnterprisePermission> getEnterprisePermissionsForFetcherId(String id) throws RestException {
        EnterprisePermissionsFetcher fetcher = getEnterprisePermissionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENTERPRISEPERMISSION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EnterprisePermission>();
    }

    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, id);
        if (fetcher != null) {
            return (EnterprisePermissionsFetcher) fetcher;
        }
        if ((fetcher = getEnterprisePermissionsFetcherForSharedNetworkResourceId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForRedundancyGroupId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForVsgRedundantPortId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForWANServiceId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForPortId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForVLANId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForGatewayId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForNSGatewayId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForNSPortId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisePermissionsFetcherForPATNATPoolId(id)) != null) {
            return (EnterprisePermissionsFetcher) addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EnterprisePermission> getAllEnterprisePermissions() throws RestException {
        java.util.List<EnterprisePermission> allObjs = new ArrayList<EnterprisePermission>();

        return allObjs;
    }

    public static java.util.List<EnterprisePermissionsFetcher> getAllEnterprisePermissionsFetchers() throws RestException {
        java.util.List<EnterprisePermissionsFetcher> allObjs = new ArrayList<EnterprisePermissionsFetcher>();
        return allObjs;
    }
    public static StaticRoute getStaticRouteById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            StaticRoute obj = null;
            obj = new StaticRoute();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.STATICROUTE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForStaticRouteId(String id) throws RestException {
        StaticRoute obj = getObject(Constants.STATICROUTE, id);
        if (obj == null) {
            obj = getStaticRouteById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForStaticRouteId(String id) throws RestException {
        StaticRoute obj = getObject(Constants.STATICROUTE, id);
        if (obj == null) {
            obj = getStaticRouteById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForStaticRouteId(String id) throws RestException {
        StaticRoute obj = getObject(Constants.STATICROUTE, id);
        if (obj == null) {
            obj = getStaticRouteById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<StaticRoute> getStaticRoutesForFetcherId(String id) throws RestException {
        StaticRoutesFetcher fetcher = getStaticRoutesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.STATICROUTE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<StaticRoute>();
    }

    public static StaticRoutesFetcher getStaticRoutesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.STATICROUTES_FETCHER, id);
        if (fetcher != null) {
            return (StaticRoutesFetcher) fetcher;
        }
        if ((fetcher = getStaticRoutesFetcherForContainerInterfaceId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStaticRoutesFetcherForSharedNetworkResourceId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStaticRoutesFetcherForDomainId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStaticRoutesFetcherForVMInterfaceId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStaticRoutesFetcherForL2DomainId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStaticRoutesFetcherForHostInterfaceId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        
        if ((fetcher = getStaticRoutesFetcherForMeId(id)) != null) {
            return (StaticRoutesFetcher) addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<StaticRoute> getAllStaticRoutes() throws RestException {
        java.util.List<StaticRoute> allObjs = new ArrayList<StaticRoute>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            StaticRoutesFetcher fetcher = getStaticRoutesFetcherForMeId(session.getId());
            java.util.List<StaticRoute> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<StaticRoutesFetcher> getAllStaticRoutesFetchers() throws RestException {
        java.util.List<StaticRoutesFetcher> allObjs = new ArrayList<StaticRoutesFetcher>();
        return allObjs;
    }
    public static Job getJobById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Job obj = null;
            obj = new Job();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.JOB, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForJobId(String id) throws RestException {
        Job obj = getObject(Constants.JOB, id);
        if (obj == null) {
            obj = getJobById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForJobId(String id) throws RestException {
        Job obj = getObject(Constants.JOB, id);
        if (obj == null) {
            obj = getJobById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Job> getJobsForFetcherId(String id) throws RestException {
        JobsFetcher fetcher = getJobsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.JOB);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Job>();
    }

    public static JobsFetcher getJobsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.JOBS_FETCHER, id);
        if (fetcher != null) {
            return (JobsFetcher) fetcher;
        }
        if ((fetcher = getJobsFetcherForPolicyGroupTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForRedirectionTargetTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForRedirectionTargetId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForEgressACLEntryTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForIngressExternalServiceTemplateEntryId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForDomainId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForVSDId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForVRSId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForHSCId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForZFBRequestId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForVCenterHypervisorId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForVCenterClusterId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForIngressAdvFwdEntryTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForGatewayId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForL2DomainTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForVCenterId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForIngressACLEntryTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForL2DomainId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForIngressExternalServiceTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForMeId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForNSGatewayId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForVSCId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForDomainTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForEgressACLTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForIngressAdvFwdTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForPolicyGroupId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForEnterpriseId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        
        if ((fetcher = getJobsFetcherForIngressACLTemplateId(id)) != null) {
            return (JobsFetcher) addFetcher(Constants.JOBS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Job> getAllJobs() throws RestException {
        java.util.List<Job> allObjs = new ArrayList<Job>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            JobsFetcher fetcher = getJobsFetcherForMeId(session.getId());
            java.util.List<Job> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<JobsFetcher> getAllJobsFetchers() throws RestException {
        java.util.List<JobsFetcher> allObjs = new ArrayList<JobsFetcher>();
        return allObjs;
    }
    public static VMInterface getVMInterfaceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VMInterface obj = null;
            obj = new VMInterface();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VMINTERFACE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastChannelMapsFetcher getMultiCastChannelMapsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            MultiCastChannelMapsFetcher fetcher = obj.getMultiCastChannelMaps();
            return addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyDecisionsFetcher getPolicyDecisionsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            PolicyDecisionsFetcher fetcher = obj.getPolicyDecisions();
            return addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForVMInterfaceId(String id) throws RestException {
        VMInterface obj = getObject(Constants.VMINTERFACE, id);
        if (obj == null) {
            obj = getVMInterfaceById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VMInterface> getVMInterfacesForFetcherId(String id) throws RestException {
        VMInterfacesFetcher fetcher = getVMInterfacesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VMINTERFACE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VMInterface>();
    }

    public static VMInterfacesFetcher getVMInterfacesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VMINTERFACES_FETCHER, id);
        if (fetcher != null) {
            return (VMInterfacesFetcher) fetcher;
        }
        if ((fetcher = getVMInterfacesFetcherForZoneId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMInterfacesFetcherForDomainId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMInterfacesFetcherForVPortId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMInterfacesFetcherForSubnetId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMInterfacesFetcherForL2DomainId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMInterfacesFetcherForMeId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMInterfacesFetcherForVMId(id)) != null) {
            return (VMInterfacesFetcher) addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VMInterface> getAllVMInterfaces() throws RestException {
        java.util.List<VMInterface> allObjs = new ArrayList<VMInterface>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VMInterfacesFetcher fetcher = getVMInterfacesFetcherForMeId(session.getId());
            java.util.List<VMInterface> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VMInterfacesFetcher> getAllVMInterfacesFetchers() throws RestException {
        java.util.List<VMInterfacesFetcher> allObjs = new ArrayList<VMInterfacesFetcher>();
        return allObjs;
    }
    public static GatewaySecuredData getGatewaySecuredDataById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            GatewaySecuredData obj = null;
            obj = new GatewaySecuredData();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GATEWAYSECUREDDATA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGatewaySecuredDataId(String id) throws RestException {
        GatewaySecuredData obj = getObject(Constants.GATEWAYSECUREDDATA, id);
        if (obj == null) {
            obj = getGatewaySecuredDataById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGatewaySecuredDataId(String id) throws RestException {
        GatewaySecuredData obj = getObject(Constants.GATEWAYSECUREDDATA, id);
        if (obj == null) {
            obj = getGatewaySecuredDataById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<GatewaySecuredData> getGatewaySecuredDatasForFetcherId(String id) throws RestException {
        GatewaySecuredDatasFetcher fetcher = getGatewaySecuredDatasFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GATEWAYSECUREDDATA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<GatewaySecuredData>();
    }

    public static GatewaySecuredDatasFetcher getGatewaySecuredDatasFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GATEWAYSECUREDDATAS_FETCHER, id);
        if (fetcher != null) {
            return (GatewaySecuredDatasFetcher) fetcher;
        }
        if ((fetcher = getGatewaySecuredDatasFetcherForGatewaySecurityId(id)) != null) {
            return (GatewaySecuredDatasFetcher) addFetcher(Constants.GATEWAYSECUREDDATAS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<GatewaySecuredData> getAllGatewaySecuredDatas() throws RestException {
        java.util.List<GatewaySecuredData> allObjs = new ArrayList<GatewaySecuredData>();

        return allObjs;
    }

    public static java.util.List<GatewaySecuredDatasFetcher> getAllGatewaySecuredDatasFetchers() throws RestException {
        java.util.List<GatewaySecuredDatasFetcher> allObjs = new ArrayList<GatewaySecuredDatasFetcher>();
        return allObjs;
    }
    public static VCenterHypervisor getVCenterHypervisorById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterHypervisor obj = null;
            obj = new VCenterHypervisor();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VCENTERHYPERVISOR, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVCenterHypervisorId(String id) throws RestException {
        VCenterHypervisor obj = getObject(Constants.VCENTERHYPERVISOR, id);
        if (obj == null) {
            obj = getVCenterHypervisorById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForVCenterHypervisorId(String id) throws RestException {
        VCenterHypervisor obj = getObject(Constants.VCENTERHYPERVISOR, id);
        if (obj == null) {
            obj = getVCenterHypervisorById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVCenterHypervisorId(String id) throws RestException {
        VCenterHypervisor obj = getObject(Constants.VCENTERHYPERVISOR, id);
        if (obj == null) {
            obj = getVCenterHypervisorById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSAddressRangesFetcher getVRSAddressRangesFetcherForVCenterHypervisorId(String id) throws RestException {
        VCenterHypervisor obj = getObject(Constants.VCENTERHYPERVISOR, id);
        if (obj == null) {
            obj = getVCenterHypervisorById(id);
        }

        if (obj != null) {
            VRSAddressRangesFetcher fetcher = obj.getVRSAddressRanges();
            return addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSMetricsFetcher getVRSMetricsFetcherForVCenterHypervisorId(String id) throws RestException {
        VCenterHypervisor obj = getObject(Constants.VCENTERHYPERVISOR, id);
        if (obj == null) {
            obj = getVCenterHypervisorById(id);
        }

        if (obj != null) {
            VRSMetricsFetcher fetcher = obj.getVRSMetrics();
            return addFetcher(Constants.VRSMETRICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSRedeploymentpoliciesFetcher getVRSRedeploymentpoliciesFetcherForVCenterHypervisorId(String id) throws RestException {
        VCenterHypervisor obj = getObject(Constants.VCENTERHYPERVISOR, id);
        if (obj == null) {
            obj = getVCenterHypervisorById(id);
        }

        if (obj != null) {
            VRSRedeploymentpoliciesFetcher fetcher = obj.getVRSRedeploymentpolicies();
            return addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VCenterHypervisor> getVCenterHypervisorsForFetcherId(String id) throws RestException {
        VCenterHypervisorsFetcher fetcher = getVCenterHypervisorsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VCENTERHYPERVISOR);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VCenterHypervisor>();
    }

    public static VCenterHypervisorsFetcher getVCenterHypervisorsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VCENTERHYPERVISORS_FETCHER, id);
        if (fetcher != null) {
            return (VCenterHypervisorsFetcher) fetcher;
        }
        if ((fetcher = getVCenterHypervisorsFetcherForVCenterClusterId(id)) != null) {
            return (VCenterHypervisorsFetcher) addFetcher(Constants.VCENTERHYPERVISORS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVCenterHypervisorsFetcherForVCenterDataCenterId(id)) != null) {
            return (VCenterHypervisorsFetcher) addFetcher(Constants.VCENTERHYPERVISORS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVCenterHypervisorsFetcherForMeId(id)) != null) {
            return (VCenterHypervisorsFetcher) addFetcher(Constants.VCENTERHYPERVISORS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VCenterHypervisor> getAllVCenterHypervisors() throws RestException {
        java.util.List<VCenterHypervisor> allObjs = new ArrayList<VCenterHypervisor>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterHypervisorsFetcher fetcher = getVCenterHypervisorsFetcherForMeId(session.getId());
            java.util.List<VCenterHypervisor> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VCenterHypervisorsFetcher> getAllVCenterHypervisorsFetchers() throws RestException {
        java.util.List<VCenterHypervisorsFetcher> allObjs = new ArrayList<VCenterHypervisorsFetcher>();
        return allObjs;
    }
    public static KeyServerMonitor getKeyServerMonitorById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerMonitor obj = null;
            obj = new KeyServerMonitor();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.KEYSERVERMONITOR, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForKeyServerMonitorId(String id) throws RestException {
        KeyServerMonitor obj = getObject(Constants.KEYSERVERMONITOR, id);
        if (obj == null) {
            obj = getKeyServerMonitorById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeedsFetcherForKeyServerMonitorId(String id) throws RestException {
        KeyServerMonitor obj = getObject(Constants.KEYSERVERMONITOR, id);
        if (obj == null) {
            obj = getKeyServerMonitorById(id);
        }

        if (obj != null) {
            KeyServerMonitorEncryptedSeedsFetcher fetcher = obj.getKeyServerMonitorEncryptedSeeds();
            return addFetcher(Constants.KEYSERVERMONITORENCRYPTEDSEEDS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static KeyServerMonitorSeedsFetcher getKeyServerMonitorSeedsFetcherForKeyServerMonitorId(String id) throws RestException {
        KeyServerMonitor obj = getObject(Constants.KEYSERVERMONITOR, id);
        if (obj == null) {
            obj = getKeyServerMonitorById(id);
        }

        if (obj != null) {
            KeyServerMonitorSeedsFetcher fetcher = obj.getKeyServerMonitorSeeds();
            return addFetcher(Constants.KEYSERVERMONITORSEEDS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static KeyServerMonitorSEKsFetcher getKeyServerMonitorSEKsFetcherForKeyServerMonitorId(String id) throws RestException {
        KeyServerMonitor obj = getObject(Constants.KEYSERVERMONITOR, id);
        if (obj == null) {
            obj = getKeyServerMonitorById(id);
        }

        if (obj != null) {
            KeyServerMonitorSEKsFetcher fetcher = obj.getKeyServerMonitorSEKs();
            return addFetcher(Constants.KEYSERVERMONITORSEKS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForKeyServerMonitorId(String id) throws RestException {
        KeyServerMonitor obj = getObject(Constants.KEYSERVERMONITOR, id);
        if (obj == null) {
            obj = getKeyServerMonitorById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<KeyServerMonitor> getKeyServerMonitorsForFetcherId(String id) throws RestException {
        KeyServerMonitorsFetcher fetcher = getKeyServerMonitorsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.KEYSERVERMONITOR);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<KeyServerMonitor>();
    }

    public static KeyServerMonitorsFetcher getKeyServerMonitorsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.KEYSERVERMONITORS_FETCHER, id);
        if (fetcher != null) {
            return (KeyServerMonitorsFetcher) fetcher;
        }
        if ((fetcher = getKeyServerMonitorsFetcherForEnterpriseId(id)) != null) {
            return (KeyServerMonitorsFetcher) addFetcher(Constants.KEYSERVERMONITORS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<KeyServerMonitor> getAllKeyServerMonitors() throws RestException {
        java.util.List<KeyServerMonitor> allObjs = new ArrayList<KeyServerMonitor>();

        return allObjs;
    }

    public static java.util.List<KeyServerMonitorsFetcher> getAllKeyServerMonitorsFetchers() throws RestException {
        java.util.List<KeyServerMonitorsFetcher> allObjs = new ArrayList<KeyServerMonitorsFetcher>();
        return allObjs;
    }
    public static VRSMetrics getVRSMetricsById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VRSMetrics obj = null;
            obj = new VRSMetrics();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VRSMETRICS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<VRSMetrics> getVRSMetricsForFetcherId(String id) throws RestException {
        VRSMetricsFetcher fetcher = getVRSMetricsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VRSMETRICS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VRSMetrics>();
    }

    public static VRSMetricsFetcher getVRSMetricsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VRSMETRICS_FETCHER, id);
        if (fetcher != null) {
            return (VRSMetricsFetcher) fetcher;
        }
        if ((fetcher = getVRSMetricsFetcherForVCenterHypervisorId(id)) != null) {
            return (VRSMetricsFetcher) addFetcher(Constants.VRSMETRICS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VRSMetrics> getAllVRSMetrics() throws RestException {
        java.util.List<VRSMetrics> allObjs = new ArrayList<VRSMetrics>();

        return allObjs;
    }

    public static java.util.List<VRSMetricsFetcher> getAllVRSMetricsFetchers() throws RestException {
        java.util.List<VRSMetricsFetcher> allObjs = new ArrayList<VRSMetricsFetcher>();
        return allObjs;
    }
    public static EventLog getEventLogById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EventLog obj = null;
            obj = new EventLog();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.EVENTLOG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEventLogId(String id) throws RestException {
        EventLog obj = getObject(Constants.EVENTLOG, id);
        if (obj == null) {
            obj = getEventLogById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEventLogId(String id) throws RestException {
        EventLog obj = getObject(Constants.EVENTLOG, id);
        if (obj == null) {
            obj = getEventLogById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EventLog> getEventLogsForFetcherId(String id) throws RestException {
        EventLogsFetcher fetcher = getEventLogsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.EVENTLOG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EventLog>();
    }

    public static EventLogsFetcher getEventLogsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.EVENTLOGS_FETCHER, id);
        if (fetcher != null) {
            return (EventLogsFetcher) fetcher;
        }
        if ((fetcher = getEventLogsFetcherForContainerInterfaceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForQOSId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVirtualIPId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForMultiCastChannelMapId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForRedundancyGroupId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForTCAId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForGroupId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForZoneId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForPolicyGroupTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForFlowSecurityPolicyId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForEnterpriseNetworkId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForPermissionId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForIPReservationId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForRedirectionTargetTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForSubnetTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForMetadataTagId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForRedirectionTargetId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForMetadataId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVSPId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForDomainId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForWANServiceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVSDId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVPortId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForFlowForwardingPolicyId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForPortId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForSubnetId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForContainerId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForZoneTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVRSId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForHSCId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVLANId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForStaticRouteId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVMInterfaceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForLicenseId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForEnterpriseProfileId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForBridgeInterfaceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForMultiCastRangeId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForAutoDiscoveredGatewayId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForTierId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForGatewayId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForL2DomainTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForApplicationServiceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForL2DomainId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForHostInterfaceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForEndPointId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForDHCPOptionId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForNSGatewayId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVSCId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForVMId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForNSPortId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForPublicNetworkMacroId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForAddressRangeId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForDomainTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForFloatingIpId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForEgressACLTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForNSRedundantGatewayGroupId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForExternalServiceId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForUserId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForPolicyGroupId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForFlowId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForEnterpriseId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getEventLogsFetcherForIngressACLTemplateId(id)) != null) {
            return (EventLogsFetcher) addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EventLog> getAllEventLogs() throws RestException {
        java.util.List<EventLog> allObjs = new ArrayList<EventLog>();

        return allObjs;
    }

    public static java.util.List<EventLogsFetcher> getAllEventLogsFetchers() throws RestException {
        java.util.List<EventLogsFetcher> allObjs = new ArrayList<EventLogsFetcher>();
        return allObjs;
    }
    public static License getLicenseById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            License obj = null;
            obj = new License();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.LICENSE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForLicenseId(String id) throws RestException {
        License obj = getObject(Constants.LICENSE, id);
        if (obj == null) {
            obj = getLicenseById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForLicenseId(String id) throws RestException {
        License obj = getObject(Constants.LICENSE, id);
        if (obj == null) {
            obj = getLicenseById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForLicenseId(String id) throws RestException {
        License obj = getObject(Constants.LICENSE, id);
        if (obj == null) {
            obj = getLicenseById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<License> getLicensesForFetcherId(String id) throws RestException {
        LicensesFetcher fetcher = getLicensesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.LICENSE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<License>();
    }

    public static LicensesFetcher getLicensesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.LICENSES_FETCHER, id);
        if (fetcher != null) {
            return (LicensesFetcher) fetcher;
        }
        if ((fetcher = getLicensesFetcherForMeId(id)) != null) {
            return (LicensesFetcher) addFetcher(Constants.LICENSES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<License> getAllLicenses() throws RestException {
        java.util.List<License> allObjs = new ArrayList<License>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            LicensesFetcher fetcher = getLicensesFetcherForMeId(session.getId());
            java.util.List<License> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<LicensesFetcher> getAllLicensesFetchers() throws RestException {
        java.util.List<LicensesFetcher> allObjs = new ArrayList<LicensesFetcher>();
        return allObjs;
    }
    public static Via getViaById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Via obj = null;
            obj = new Via();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VIA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<Via> getViasForFetcherId(String id) throws RestException {
        ViasFetcher fetcher = getViasFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VIA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Via>();
    }

    public static ViasFetcher getViasFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VIAS_FETCHER, id);
        if (fetcher != null) {
            return (ViasFetcher) fetcher;
        }return null;
    }

    public static java.util.List<Via> getAllVias() throws RestException {
        java.util.List<Via> allObjs = new ArrayList<Via>();

        return allObjs;
    }

    public static java.util.List<ViasFetcher> getAllViasFetchers() throws RestException {
        java.util.List<ViasFetcher> allObjs = new ArrayList<ViasFetcher>();
        return allObjs;
    }
    public static EnterpriseProfile getEnterpriseProfileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterpriseProfile obj = null;
            obj = new EnterpriseProfile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENTERPRISEPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EnterprisesFetcher getEnterprisesFetcherForEnterpriseProfileId(String id) throws RestException {
        EnterpriseProfile obj = getObject(Constants.ENTERPRISEPROFILE, id);
        if (obj == null) {
            obj = getEnterpriseProfileById(id);
        }

        if (obj != null) {
            EnterprisesFetcher fetcher = obj.getEnterprises();
            return addFetcher(Constants.ENTERPRISES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForEnterpriseProfileId(String id) throws RestException {
        EnterpriseProfile obj = getObject(Constants.ENTERPRISEPROFILE, id);
        if (obj == null) {
            obj = getEnterpriseProfileById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ExternalServicesFetcher getExternalServicesFetcherForEnterpriseProfileId(String id) throws RestException {
        EnterpriseProfile obj = getObject(Constants.ENTERPRISEPROFILE, id);
        if (obj == null) {
            obj = getEnterpriseProfileById(id);
        }

        if (obj != null) {
            ExternalServicesFetcher fetcher = obj.getExternalServices();
            return addFetcher(Constants.EXTERNALSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEnterpriseProfileId(String id) throws RestException {
        EnterpriseProfile obj = getObject(Constants.ENTERPRISEPROFILE, id);
        if (obj == null) {
            obj = getEnterpriseProfileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEnterpriseProfileId(String id) throws RestException {
        EnterpriseProfile obj = getObject(Constants.ENTERPRISEPROFILE, id);
        if (obj == null) {
            obj = getEnterpriseProfileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastListsFetcher getMultiCastListsFetcherForEnterpriseProfileId(String id) throws RestException {
        EnterpriseProfile obj = getObject(Constants.ENTERPRISEPROFILE, id);
        if (obj == null) {
            obj = getEnterpriseProfileById(id);
        }

        if (obj != null) {
            MultiCastListsFetcher fetcher = obj.getMultiCastLists();
            return addFetcher(Constants.MULTICASTLISTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EnterpriseProfile> getEnterpriseProfilesForFetcherId(String id) throws RestException {
        EnterpriseProfilesFetcher fetcher = getEnterpriseProfilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENTERPRISEPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EnterpriseProfile>();
    }

    public static EnterpriseProfilesFetcher getEnterpriseProfilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENTERPRISEPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (EnterpriseProfilesFetcher) fetcher;
        }
        if ((fetcher = getEnterpriseProfilesFetcherForMeId(id)) != null) {
            return (EnterpriseProfilesFetcher) addFetcher(Constants.ENTERPRISEPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EnterpriseProfile> getAllEnterpriseProfiles() throws RestException {
        java.util.List<EnterpriseProfile> allObjs = new ArrayList<EnterpriseProfile>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterpriseProfilesFetcher fetcher = getEnterpriseProfilesFetcherForMeId(session.getId());
            java.util.List<EnterpriseProfile> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<EnterpriseProfilesFetcher> getAllEnterpriseProfilesFetchers() throws RestException {
        java.util.List<EnterpriseProfilesFetcher> allObjs = new ArrayList<EnterpriseProfilesFetcher>();
        return allObjs;
    }
    public static PerformanceMonitor getPerformanceMonitorById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PerformanceMonitor obj = null;
            obj = new PerformanceMonitor();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PERFORMANCEMONITOR, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ApplicationperformancemanagementsFetcher getApplicationperformancemanagementsFetcherForPerformanceMonitorId(String id) throws RestException {
        PerformanceMonitor obj = getObject(Constants.PERFORMANCEMONITOR, id);
        if (obj == null) {
            obj = getPerformanceMonitorById(id);
        }

        if (obj != null) {
            ApplicationperformancemanagementsFetcher fetcher = obj.getApplicationperformancemanagements();
            return addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PerformanceMonitor> getPerformanceMonitorsForFetcherId(String id) throws RestException {
        PerformanceMonitorsFetcher fetcher = getPerformanceMonitorsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PERFORMANCEMONITOR);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PerformanceMonitor>();
    }

    public static PerformanceMonitorsFetcher getPerformanceMonitorsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PERFORMANCEMONITORS_FETCHER, id);
        if (fetcher != null) {
            return (PerformanceMonitorsFetcher) fetcher;
        }
        if ((fetcher = getPerformanceMonitorsFetcherForEnterpriseId(id)) != null) {
            return (PerformanceMonitorsFetcher) addFetcher(Constants.PERFORMANCEMONITORS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PerformanceMonitor> getAllPerformanceMonitors() throws RestException {
        java.util.List<PerformanceMonitor> allObjs = new ArrayList<PerformanceMonitor>();

        return allObjs;
    }

    public static java.util.List<PerformanceMonitorsFetcher> getAllPerformanceMonitorsFetchers() throws RestException {
        java.util.List<PerformanceMonitorsFetcher> allObjs = new ArrayList<PerformanceMonitorsFetcher>();
        return allObjs;
    }
    public static NextHopAddress getNextHopAddressById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NextHopAddress obj = null;
            obj = new NextHopAddress();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NEXTHOPADDRESS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<NextHopAddress> getNextHopAddressForFetcherId(String id) throws RestException {
        NextHopAddressFetcher fetcher = getNextHopAddressFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NEXTHOPADDRESS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NextHopAddress>();
    }

    public static NextHopAddressFetcher getNextHopAddressFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NEXTHOPADDRESS_FETCHER, id);
        if (fetcher != null) {
            return (NextHopAddressFetcher) fetcher;
        }
        if ((fetcher = getNextHopAddressFetcherForLinkId(id)) != null) {
            return (NextHopAddressFetcher) addFetcher(Constants.NEXTHOPADDRESS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NextHopAddress> getAllNextHopAddress() throws RestException {
        java.util.List<NextHopAddress> allObjs = new ArrayList<NextHopAddress>();

        return allObjs;
    }

    public static java.util.List<NextHopAddressFetcher> getAllNextHopAddressFetchers() throws RestException {
        java.util.List<NextHopAddressFetcher> allObjs = new ArrayList<NextHopAddressFetcher>();
        return allObjs;
    }
    public static BridgeInterface getBridgeInterfaceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BridgeInterface obj = null;
            obj = new BridgeInterface();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BRIDGEINTERFACE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyDecisionsFetcher getPolicyDecisionsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            PolicyDecisionsFetcher fetcher = obj.getPolicyDecisions();
            return addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForBridgeInterfaceId(String id) throws RestException {
        BridgeInterface obj = getObject(Constants.BRIDGEINTERFACE, id);
        if (obj == null) {
            obj = getBridgeInterfaceById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<BridgeInterface> getBridgeInterfacesForFetcherId(String id) throws RestException {
        BridgeInterfacesFetcher fetcher = getBridgeInterfacesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BRIDGEINTERFACE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BridgeInterface>();
    }

    public static BridgeInterfacesFetcher getBridgeInterfacesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BRIDGEINTERFACES_FETCHER, id);
        if (fetcher != null) {
            return (BridgeInterfacesFetcher) fetcher;
        }
        if ((fetcher = getBridgeInterfacesFetcherForDomainId(id)) != null) {
            return (BridgeInterfacesFetcher) addFetcher(Constants.BRIDGEINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getBridgeInterfacesFetcherForVPortId(id)) != null) {
            return (BridgeInterfacesFetcher) addFetcher(Constants.BRIDGEINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getBridgeInterfacesFetcherForL2DomainId(id)) != null) {
            return (BridgeInterfacesFetcher) addFetcher(Constants.BRIDGEINTERFACES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BridgeInterface> getAllBridgeInterfaces() throws RestException {
        java.util.List<BridgeInterface> allObjs = new ArrayList<BridgeInterface>();

        return allObjs;
    }

    public static java.util.List<BridgeInterfacesFetcher> getAllBridgeInterfacesFetchers() throws RestException {
        java.util.List<BridgeInterfacesFetcher> allObjs = new ArrayList<BridgeInterfacesFetcher>();
        return allObjs;
    }
    public static VCenterCluster getVCenterClusterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterCluster obj = null;
            obj = new VCenterCluster();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VCENTERCLUSTER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AutoDiscoverHypervisorFromClustersFetcher getAutoDiscoverHypervisorFromClustersFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            AutoDiscoverHypervisorFromClustersFetcher fetcher = obj.getAutoDiscoverHypervisorFromClusters();
            return addFetcher(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterHypervisorsFetcher getVCenterHypervisorsFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            VCenterHypervisorsFetcher fetcher = obj.getVCenterHypervisors();
            return addFetcher(Constants.VCENTERHYPERVISORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSAddressRangesFetcher getVRSAddressRangesFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            VRSAddressRangesFetcher fetcher = obj.getVRSAddressRanges();
            return addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSRedeploymentpoliciesFetcher getVRSRedeploymentpoliciesFetcherForVCenterClusterId(String id) throws RestException {
        VCenterCluster obj = getObject(Constants.VCENTERCLUSTER, id);
        if (obj == null) {
            obj = getVCenterClusterById(id);
        }

        if (obj != null) {
            VRSRedeploymentpoliciesFetcher fetcher = obj.getVRSRedeploymentpolicies();
            return addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VCenterCluster> getVCenterClustersForFetcherId(String id) throws RestException {
        VCenterClustersFetcher fetcher = getVCenterClustersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VCENTERCLUSTER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VCenterCluster>();
    }

    public static VCenterClustersFetcher getVCenterClustersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VCENTERCLUSTERS_FETCHER, id);
        if (fetcher != null) {
            return (VCenterClustersFetcher) fetcher;
        }
        if ((fetcher = getVCenterClustersFetcherForVCenterDataCenterId(id)) != null) {
            return (VCenterClustersFetcher) addFetcher(Constants.VCENTERCLUSTERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VCenterCluster> getAllVCenterClusters() throws RestException {
        java.util.List<VCenterCluster> allObjs = new ArrayList<VCenterCluster>();

        return allObjs;
    }

    public static java.util.List<VCenterClustersFetcher> getAllVCenterClustersFetchers() throws RestException {
        java.util.List<VCenterClustersFetcher> allObjs = new ArrayList<VCenterClustersFetcher>();
        return allObjs;
    }
    public static MultiCastRange getMultiCastRangeById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MultiCastRange obj = null;
            obj = new MultiCastRange();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MULTICASTRANGE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForMultiCastRangeId(String id) throws RestException {
        MultiCastRange obj = getObject(Constants.MULTICASTRANGE, id);
        if (obj == null) {
            obj = getMultiCastRangeById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMultiCastRangeId(String id) throws RestException {
        MultiCastRange obj = getObject(Constants.MULTICASTRANGE, id);
        if (obj == null) {
            obj = getMultiCastRangeById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMultiCastRangeId(String id) throws RestException {
        MultiCastRange obj = getObject(Constants.MULTICASTRANGE, id);
        if (obj == null) {
            obj = getMultiCastRangeById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MultiCastRange> getMultiCastRangesForFetcherId(String id) throws RestException {
        MultiCastRangesFetcher fetcher = getMultiCastRangesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MULTICASTRANGE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MultiCastRange>();
    }

    public static MultiCastRangesFetcher getMultiCastRangesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MULTICASTRANGES_FETCHER, id);
        if (fetcher != null) {
            return (MultiCastRangesFetcher) fetcher;
        }
        if ((fetcher = getMultiCastRangesFetcherForMultiCastChannelMapId(id)) != null) {
            return (MultiCastRangesFetcher) addFetcher(Constants.MULTICASTRANGES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MultiCastRange> getAllMultiCastRanges() throws RestException {
        java.util.List<MultiCastRange> allObjs = new ArrayList<MultiCastRange>();

        return allObjs;
    }

    public static java.util.List<MultiCastRangesFetcher> getAllMultiCastRangesFetchers() throws RestException {
        java.util.List<MultiCastRangesFetcher> allObjs = new ArrayList<MultiCastRangesFetcher>();
        return allObjs;
    }
    public static NetworkMacroGroup getNetworkMacroGroupById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NetworkMacroGroup obj = null;
            obj = new NetworkMacroGroup();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NETWORKMACROGROUP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EnterpriseNetworksFetcher getEnterpriseNetworksFetcherForNetworkMacroGroupId(String id) throws RestException {
        NetworkMacroGroup obj = getObject(Constants.NETWORKMACROGROUP, id);
        if (obj == null) {
            obj = getNetworkMacroGroupById(id);
        }

        if (obj != null) {
            EnterpriseNetworksFetcher fetcher = obj.getEnterpriseNetworks();
            return addFetcher(Constants.ENTERPRISENETWORKS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNetworkMacroGroupId(String id) throws RestException {
        NetworkMacroGroup obj = getObject(Constants.NETWORKMACROGROUP, id);
        if (obj == null) {
            obj = getNetworkMacroGroupById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNetworkMacroGroupId(String id) throws RestException {
        NetworkMacroGroup obj = getObject(Constants.NETWORKMACROGROUP, id);
        if (obj == null) {
            obj = getNetworkMacroGroupById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NetworkMacroGroup> getNetworkMacroGroupsForFetcherId(String id) throws RestException {
        NetworkMacroGroupsFetcher fetcher = getNetworkMacroGroupsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NETWORKMACROGROUP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NetworkMacroGroup>();
    }

    public static NetworkMacroGroupsFetcher getNetworkMacroGroupsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NETWORKMACROGROUPS_FETCHER, id);
        if (fetcher != null) {
            return (NetworkMacroGroupsFetcher) fetcher;
        }
        if ((fetcher = getNetworkMacroGroupsFetcherForEnterpriseNetworkId(id)) != null) {
            return (NetworkMacroGroupsFetcher) addFetcher(Constants.NETWORKMACROGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getNetworkMacroGroupsFetcherForEnterpriseId(id)) != null) {
            return (NetworkMacroGroupsFetcher) addFetcher(Constants.NETWORKMACROGROUPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NetworkMacroGroup> getAllNetworkMacroGroups() throws RestException {
        java.util.List<NetworkMacroGroup> allObjs = new ArrayList<NetworkMacroGroup>();

        return allObjs;
    }

    public static java.util.List<NetworkMacroGroupsFetcher> getAllNetworkMacroGroupsFetchers() throws RestException {
        java.util.List<NetworkMacroGroupsFetcher> allObjs = new ArrayList<NetworkMacroGroupsFetcher>();
        return allObjs;
    }
    public static IngressAdvFwdEntryTemplate getIngressAdvFwdEntryTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressAdvFwdEntryTemplate obj = null;
            obj = new IngressAdvFwdEntryTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INGRESSADVFWDENTRYTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIngressAdvFwdEntryTemplateId(String id) throws RestException {
        IngressAdvFwdEntryTemplate obj = getObject(Constants.INGRESSADVFWDENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdEntryTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForIngressAdvFwdEntryTemplateId(String id) throws RestException {
        IngressAdvFwdEntryTemplate obj = getObject(Constants.INGRESSADVFWDENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdEntryTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIngressAdvFwdEntryTemplateId(String id) throws RestException {
        IngressAdvFwdEntryTemplate obj = getObject(Constants.INGRESSADVFWDENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdEntryTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForIngressAdvFwdEntryTemplateId(String id) throws RestException {
        IngressAdvFwdEntryTemplate obj = getObject(Constants.INGRESSADVFWDENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdEntryTemplateById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IngressAdvFwdEntryTemplate> getIngressAdvFwdEntryTemplatesForFetcherId(String id) throws RestException {
        IngressAdvFwdEntryTemplatesFetcher fetcher = getIngressAdvFwdEntryTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INGRESSADVFWDENTRYTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IngressAdvFwdEntryTemplate>();
    }

    public static IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (IngressAdvFwdEntryTemplatesFetcher) fetcher;
        }
        if ((fetcher = getIngressAdvFwdEntryTemplatesFetcherForMirrorDestinationId(id)) != null) {
            return (IngressAdvFwdEntryTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressAdvFwdEntryTemplatesFetcherForMeId(id)) != null) {
            return (IngressAdvFwdEntryTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressAdvFwdEntryTemplatesFetcherForIngressAdvFwdTemplateId(id)) != null) {
            return (IngressAdvFwdEntryTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IngressAdvFwdEntryTemplate> getAllIngressAdvFwdEntryTemplates() throws RestException {
        java.util.List<IngressAdvFwdEntryTemplate> allObjs = new ArrayList<IngressAdvFwdEntryTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressAdvFwdEntryTemplatesFetcher fetcher = getIngressAdvFwdEntryTemplatesFetcherForMeId(session.getId());
            java.util.List<IngressAdvFwdEntryTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<IngressAdvFwdEntryTemplatesFetcher> getAllIngressAdvFwdEntryTemplatesFetchers() throws RestException {
        java.util.List<IngressAdvFwdEntryTemplatesFetcher> allObjs = new ArrayList<IngressAdvFwdEntryTemplatesFetcher>();
        return allObjs;
    }
    public static ApplicationBinding getApplicationBindingById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ApplicationBinding obj = null;
            obj = new ApplicationBinding();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.APPLICATIONBINDING, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<ApplicationBinding> getApplicationBindingsForFetcherId(String id) throws RestException {
        ApplicationBindingsFetcher fetcher = getApplicationBindingsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.APPLICATIONBINDING);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ApplicationBinding>();
    }

    public static ApplicationBindingsFetcher getApplicationBindingsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.APPLICATIONBINDINGS_FETCHER, id);
        if (fetcher != null) {
            return (ApplicationBindingsFetcher) fetcher;
        }
        if ((fetcher = getApplicationBindingsFetcherForApplicationId(id)) != null) {
            return (ApplicationBindingsFetcher) addFetcher(Constants.APPLICATIONBINDINGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getApplicationBindingsFetcherForApplicationperformancemanagementId(id)) != null) {
            return (ApplicationBindingsFetcher) addFetcher(Constants.APPLICATIONBINDINGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ApplicationBinding> getAllApplicationBindings() throws RestException {
        java.util.List<ApplicationBinding> allObjs = new ArrayList<ApplicationBinding>();

        return allObjs;
    }

    public static java.util.List<ApplicationBindingsFetcher> getAllApplicationBindingsFetchers() throws RestException {
        java.util.List<ApplicationBindingsFetcher> allObjs = new ArrayList<ApplicationBindingsFetcher>();
        return allObjs;
    }
    public static AutoDiscoveredGateway getAutoDiscoveredGatewayById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AutoDiscoveredGateway obj = null;
            obj = new AutoDiscoveredGateway();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.AUTODISCOVEREDGATEWAY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForAutoDiscoveredGatewayId(String id) throws RestException {
        AutoDiscoveredGateway obj = getObject(Constants.AUTODISCOVEREDGATEWAY, id);
        if (obj == null) {
            obj = getAutoDiscoveredGatewayById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForAutoDiscoveredGatewayId(String id) throws RestException {
        AutoDiscoveredGateway obj = getObject(Constants.AUTODISCOVEREDGATEWAY, id);
        if (obj == null) {
            obj = getAutoDiscoveredGatewayById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForAutoDiscoveredGatewayId(String id) throws RestException {
        AutoDiscoveredGateway obj = getObject(Constants.AUTODISCOVEREDGATEWAY, id);
        if (obj == null) {
            obj = getAutoDiscoveredGatewayById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSPortsFetcher getNSPortsFetcherForAutoDiscoveredGatewayId(String id) throws RestException {
        AutoDiscoveredGateway obj = getObject(Constants.AUTODISCOVEREDGATEWAY, id);
        if (obj == null) {
            obj = getAutoDiscoveredGatewayById(id);
        }

        if (obj != null) {
            NSPortsFetcher fetcher = obj.getNSPorts();
            return addFetcher(Constants.NSPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PortsFetcher getPortsFetcherForAutoDiscoveredGatewayId(String id) throws RestException {
        AutoDiscoveredGateway obj = getObject(Constants.AUTODISCOVEREDGATEWAY, id);
        if (obj == null) {
            obj = getAutoDiscoveredGatewayById(id);
        }

        if (obj != null) {
            PortsFetcher fetcher = obj.getPorts();
            return addFetcher(Constants.PORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static WANServicesFetcher getWANServicesFetcherForAutoDiscoveredGatewayId(String id) throws RestException {
        AutoDiscoveredGateway obj = getObject(Constants.AUTODISCOVEREDGATEWAY, id);
        if (obj == null) {
            obj = getAutoDiscoveredGatewayById(id);
        }

        if (obj != null) {
            WANServicesFetcher fetcher = obj.getWANServices();
            return addFetcher(Constants.WANSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<AutoDiscoveredGateway> getAutoDiscoveredGatewaysForFetcherId(String id) throws RestException {
        AutoDiscoveredGatewaysFetcher fetcher = getAutoDiscoveredGatewaysFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.AUTODISCOVEREDGATEWAY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AutoDiscoveredGateway>();
    }

    public static AutoDiscoveredGatewaysFetcher getAutoDiscoveredGatewaysFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.AUTODISCOVEREDGATEWAYS_FETCHER, id);
        if (fetcher != null) {
            return (AutoDiscoveredGatewaysFetcher) fetcher;
        }
        if ((fetcher = getAutoDiscoveredGatewaysFetcherForMeId(id)) != null) {
            return (AutoDiscoveredGatewaysFetcher) addFetcher(Constants.AUTODISCOVEREDGATEWAYS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AutoDiscoveredGateway> getAllAutoDiscoveredGateways() throws RestException {
        java.util.List<AutoDiscoveredGateway> allObjs = new ArrayList<AutoDiscoveredGateway>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            AutoDiscoveredGatewaysFetcher fetcher = getAutoDiscoveredGatewaysFetcherForMeId(session.getId());
            java.util.List<AutoDiscoveredGateway> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<AutoDiscoveredGatewaysFetcher> getAllAutoDiscoveredGatewaysFetchers() throws RestException {
        java.util.List<AutoDiscoveredGatewaysFetcher> allObjs = new ArrayList<AutoDiscoveredGatewaysFetcher>();
        return allObjs;
    }
    public static MultiCastList getMultiCastListById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MultiCastList obj = null;
            obj = new MultiCastList();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MULTICASTLIST, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMultiCastListId(String id) throws RestException {
        MultiCastList obj = getObject(Constants.MULTICASTLIST, id);
        if (obj == null) {
            obj = getMultiCastListById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMultiCastListId(String id) throws RestException {
        MultiCastList obj = getObject(Constants.MULTICASTLIST, id);
        if (obj == null) {
            obj = getMultiCastListById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastChannelMapsFetcher getMultiCastChannelMapsFetcherForMultiCastListId(String id) throws RestException {
        MultiCastList obj = getObject(Constants.MULTICASTLIST, id);
        if (obj == null) {
            obj = getMultiCastListById(id);
        }

        if (obj != null) {
            MultiCastChannelMapsFetcher fetcher = obj.getMultiCastChannelMaps();
            return addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MultiCastList> getMultiCastListsForFetcherId(String id) throws RestException {
        MultiCastListsFetcher fetcher = getMultiCastListsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MULTICASTLIST);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MultiCastList>();
    }

    public static MultiCastListsFetcher getMultiCastListsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MULTICASTLISTS_FETCHER, id);
        if (fetcher != null) {
            return (MultiCastListsFetcher) fetcher;
        }
        if ((fetcher = getMultiCastListsFetcherForEnterpriseProfileId(id)) != null) {
            return (MultiCastListsFetcher) addFetcher(Constants.MULTICASTLISTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMultiCastListsFetcherForEnterpriseId(id)) != null) {
            return (MultiCastListsFetcher) addFetcher(Constants.MULTICASTLISTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MultiCastList> getAllMultiCastLists() throws RestException {
        java.util.List<MultiCastList> allObjs = new ArrayList<MultiCastList>();

        return allObjs;
    }

    public static java.util.List<MultiCastListsFetcher> getAllMultiCastListsFetchers() throws RestException {
        java.util.List<MultiCastListsFetcher> allObjs = new ArrayList<MultiCastListsFetcher>();
        return allObjs;
    }
    public static NextHop getNextHopById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NextHop obj = null;
            obj = new NextHop();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NEXTHOP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNextHopId(String id) throws RestException {
        NextHop obj = getObject(Constants.NEXTHOP, id);
        if (obj == null) {
            obj = getNextHopById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNextHopId(String id) throws RestException {
        NextHop obj = getObject(Constants.NEXTHOP, id);
        if (obj == null) {
            obj = getNextHopById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NextHop> getNextHopsForFetcherId(String id) throws RestException {
        NextHopsFetcher fetcher = getNextHopsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NEXTHOP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NextHop>();
    }

    public static NextHopsFetcher getNextHopsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NEXTHOPS_FETCHER, id);
        if (fetcher != null) {
            return (NextHopsFetcher) fetcher;
        }return null;
    }

    public static java.util.List<NextHop> getAllNextHops() throws RestException {
        java.util.List<NextHop> allObjs = new ArrayList<NextHop>();

        return allObjs;
    }

    public static java.util.List<NextHopsFetcher> getAllNextHopsFetchers() throws RestException {
        java.util.List<NextHopsFetcher> allObjs = new ArrayList<NextHopsFetcher>();
        return allObjs;
    }
    public static KeyServerNotification getKeyServerNotificationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerNotification obj = null;
            obj = new KeyServerNotification();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.KEYSERVERNOTIFICATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForKeyServerNotificationId(String id) throws RestException {
        KeyServerNotification obj = getObject(Constants.KEYSERVERNOTIFICATION, id);
        if (obj == null) {
            obj = getKeyServerNotificationById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForKeyServerNotificationId(String id) throws RestException {
        KeyServerNotification obj = getObject(Constants.KEYSERVERNOTIFICATION, id);
        if (obj == null) {
            obj = getKeyServerNotificationById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<KeyServerNotification> getKeyServerNotificationsForFetcherId(String id) throws RestException {
        KeyServerNotificationsFetcher fetcher = getKeyServerNotificationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.KEYSERVERNOTIFICATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<KeyServerNotification>();
    }

    public static KeyServerNotificationsFetcher getKeyServerNotificationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.KEYSERVERNOTIFICATIONS_FETCHER, id);
        if (fetcher != null) {
            return (KeyServerNotificationsFetcher) fetcher;
        }return null;
    }

    public static java.util.List<KeyServerNotification> getAllKeyServerNotifications() throws RestException {
        java.util.List<KeyServerNotification> allObjs = new ArrayList<KeyServerNotification>();

        return allObjs;
    }

    public static java.util.List<KeyServerNotificationsFetcher> getAllKeyServerNotificationsFetchers() throws RestException {
        java.util.List<KeyServerNotificationsFetcher> allObjs = new ArrayList<KeyServerNotificationsFetcher>();
        return allObjs;
    }
    public static MirrorDestination getMirrorDestinationById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MirrorDestination obj = null;
            obj = new MirrorDestination();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MIRRORDESTINATION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EgressACLEntryTemplatesFetcher getEgressACLEntryTemplatesFetcherForMirrorDestinationId(String id) throws RestException {
        MirrorDestination obj = getObject(Constants.MIRRORDESTINATION, id);
        if (obj == null) {
            obj = getMirrorDestinationById(id);
        }

        if (obj != null) {
            EgressACLEntryTemplatesFetcher fetcher = obj.getEgressACLEntryTemplates();
            return addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMirrorDestinationId(String id) throws RestException {
        MirrorDestination obj = getObject(Constants.MIRRORDESTINATION, id);
        if (obj == null) {
            obj = getMirrorDestinationById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLEntryTemplatesFetcher getIngressACLEntryTemplatesFetcherForMirrorDestinationId(String id) throws RestException {
        MirrorDestination obj = getObject(Constants.MIRRORDESTINATION, id);
        if (obj == null) {
            obj = getMirrorDestinationById(id);
        }

        if (obj != null) {
            IngressACLEntryTemplatesFetcher fetcher = obj.getIngressACLEntryTemplates();
            return addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplatesFetcherForMirrorDestinationId(String id) throws RestException {
        MirrorDestination obj = getObject(Constants.MIRRORDESTINATION, id);
        if (obj == null) {
            obj = getMirrorDestinationById(id);
        }

        if (obj != null) {
            IngressAdvFwdEntryTemplatesFetcher fetcher = obj.getIngressAdvFwdEntryTemplates();
            return addFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMirrorDestinationId(String id) throws RestException {
        MirrorDestination obj = getObject(Constants.MIRRORDESTINATION, id);
        if (obj == null) {
            obj = getMirrorDestinationById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortMirrorsFetcher getVPortMirrorsFetcherForMirrorDestinationId(String id) throws RestException {
        MirrorDestination obj = getObject(Constants.MIRRORDESTINATION, id);
        if (obj == null) {
            obj = getMirrorDestinationById(id);
        }

        if (obj != null) {
            VPortMirrorsFetcher fetcher = obj.getVPortMirrors();
            return addFetcher(Constants.VPORTMIRRORS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MirrorDestination> getMirrorDestinationsForFetcherId(String id) throws RestException {
        MirrorDestinationsFetcher fetcher = getMirrorDestinationsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MIRRORDESTINATION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MirrorDestination>();
    }

    public static MirrorDestinationsFetcher getMirrorDestinationsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MIRRORDESTINATIONS_FETCHER, id);
        if (fetcher != null) {
            return (MirrorDestinationsFetcher) fetcher;
        }
        if ((fetcher = getMirrorDestinationsFetcherForMeId(id)) != null) {
            return (MirrorDestinationsFetcher) addFetcher(Constants.MIRRORDESTINATIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MirrorDestination> getAllMirrorDestinations() throws RestException {
        java.util.List<MirrorDestination> allObjs = new ArrayList<MirrorDestination>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            MirrorDestinationsFetcher fetcher = getMirrorDestinationsFetcherForMeId(session.getId());
            java.util.List<MirrorDestination> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<MirrorDestinationsFetcher> getAllMirrorDestinationsFetchers() throws RestException {
        java.util.List<MirrorDestinationsFetcher> allObjs = new ArrayList<MirrorDestinationsFetcher>();
        return allObjs;
    }
    public static Tier getTierById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Tier obj = null;
            obj = new Tier();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.TIER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ContainersFetcher getContainersFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForTierId(String id) throws RestException {
        Tier obj = getObject(Constants.TIER, id);
        if (obj == null) {
            obj = getTierById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Tier> getTiersForFetcherId(String id) throws RestException {
        TiersFetcher fetcher = getTiersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.TIER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Tier>();
    }

    public static TiersFetcher getTiersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.TIERS_FETCHER, id);
        if (fetcher != null) {
            return (TiersFetcher) fetcher;
        }return null;
    }

    public static java.util.List<Tier> getAllTiers() throws RestException {
        java.util.List<Tier> allObjs = new ArrayList<Tier>();

        return allObjs;
    }

    public static java.util.List<TiersFetcher> getAllTiersFetchers() throws RestException {
        java.util.List<TiersFetcher> allObjs = new ArrayList<TiersFetcher>();
        return allObjs;
    }
    public static DomainFIPAclTemplate getDomainFIPAclTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DomainFIPAclTemplate obj = null;
            obj = new DomainFIPAclTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DOMAINFIPACLTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DomainFIPAclTemplateEntriesFetcher getDomainFIPAclTemplateEntriesFetcherForDomainFIPAclTemplateId(String id) throws RestException {
        DomainFIPAclTemplate obj = getObject(Constants.DOMAINFIPACLTEMPLATE, id);
        if (obj == null) {
            obj = getDomainFIPAclTemplateById(id);
        }

        if (obj != null) {
            DomainFIPAclTemplateEntriesFetcher fetcher = obj.getDomainFIPAclTemplateEntries();
            return addFetcher(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDomainFIPAclTemplateId(String id) throws RestException {
        DomainFIPAclTemplate obj = getObject(Constants.DOMAINFIPACLTEMPLATE, id);
        if (obj == null) {
            obj = getDomainFIPAclTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDomainFIPAclTemplateId(String id) throws RestException {
        DomainFIPAclTemplate obj = getObject(Constants.DOMAINFIPACLTEMPLATE, id);
        if (obj == null) {
            obj = getDomainFIPAclTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<DomainFIPAclTemplate> getDomainFIPAclTemplatesForFetcherId(String id) throws RestException {
        DomainFIPAclTemplatesFetcher fetcher = getDomainFIPAclTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DOMAINFIPACLTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DomainFIPAclTemplate>();
    }

    public static DomainFIPAclTemplatesFetcher getDomainFIPAclTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (DomainFIPAclTemplatesFetcher) fetcher;
        }
        if ((fetcher = getDomainFIPAclTemplatesFetcherForDomainId(id)) != null) {
            return (DomainFIPAclTemplatesFetcher) addFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getDomainFIPAclTemplatesFetcherForMeId(id)) != null) {
            return (DomainFIPAclTemplatesFetcher) addFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getDomainFIPAclTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (DomainFIPAclTemplatesFetcher) addFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DomainFIPAclTemplate> getAllDomainFIPAclTemplates() throws RestException {
        java.util.List<DomainFIPAclTemplate> allObjs = new ArrayList<DomainFIPAclTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            DomainFIPAclTemplatesFetcher fetcher = getDomainFIPAclTemplatesFetcherForMeId(session.getId());
            java.util.List<DomainFIPAclTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<DomainFIPAclTemplatesFetcher> getAllDomainFIPAclTemplatesFetchers() throws RestException {
        java.util.List<DomainFIPAclTemplatesFetcher> allObjs = new ArrayList<DomainFIPAclTemplatesFetcher>();
        return allObjs;
    }
    public static AddressMap getAddressMapById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AddressMap obj = null;
            obj = new AddressMap();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ADDRESSMAP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForAddressMapId(String id) throws RestException {
        AddressMap obj = getObject(Constants.ADDRESSMAP, id);
        if (obj == null) {
            obj = getAddressMapById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForAddressMapId(String id) throws RestException {
        AddressMap obj = getObject(Constants.ADDRESSMAP, id);
        if (obj == null) {
            obj = getAddressMapById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForAddressMapId(String id) throws RestException {
        AddressMap obj = getObject(Constants.ADDRESSMAP, id);
        if (obj == null) {
            obj = getAddressMapById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForAddressMapId(String id) throws RestException {
        AddressMap obj = getObject(Constants.ADDRESSMAP, id);
        if (obj == null) {
            obj = getAddressMapById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<AddressMap> getAddressMapsForFetcherId(String id) throws RestException {
        AddressMapsFetcher fetcher = getAddressMapsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ADDRESSMAP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AddressMap>();
    }

    public static AddressMapsFetcher getAddressMapsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ADDRESSMAPS_FETCHER, id);
        if (fetcher != null) {
            return (AddressMapsFetcher) fetcher;
        }
        if ((fetcher = getAddressMapsFetcherForPATNATPoolId(id)) != null) {
            return (AddressMapsFetcher) addFetcher(Constants.ADDRESSMAPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AddressMap> getAllAddressMaps() throws RestException {
        java.util.List<AddressMap> allObjs = new ArrayList<AddressMap>();

        return allObjs;
    }

    public static java.util.List<AddressMapsFetcher> getAllAddressMapsFetchers() throws RestException {
        java.util.List<AddressMapsFetcher> allObjs = new ArrayList<AddressMapsFetcher>();
        return allObjs;
    }
    public static Gateway getGatewayById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Gateway obj = null;
            obj = new Gateway();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GATEWAY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATNATPoolsFetcher getPATNATPoolsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            PATNATPoolsFetcher fetcher = obj.getPATNATPools();
            return addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PortsFetcher getPortsFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            PortsFetcher fetcher = obj.getPorts();
            return addFetcher(Constants.PORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static WANServicesFetcher getWANServicesFetcherForGatewayId(String id) throws RestException {
        Gateway obj = getObject(Constants.GATEWAY, id);
        if (obj == null) {
            obj = getGatewayById(id);
        }

        if (obj != null) {
            WANServicesFetcher fetcher = obj.getWANServices();
            return addFetcher(Constants.WANSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Gateway> getGatewaysForFetcherId(String id) throws RestException {
        GatewaysFetcher fetcher = getGatewaysFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GATEWAY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Gateway>();
    }

    public static GatewaysFetcher getGatewaysFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GATEWAYS_FETCHER, id);
        if (fetcher != null) {
            return (GatewaysFetcher) fetcher;
        }
        if ((fetcher = getGatewaysFetcherForRedundancyGroupId(id)) != null) {
            return (GatewaysFetcher) addFetcher(Constants.GATEWAYS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGatewaysFetcherForMeId(id)) != null) {
            return (GatewaysFetcher) addFetcher(Constants.GATEWAYS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGatewaysFetcherForEnterpriseId(id)) != null) {
            return (GatewaysFetcher) addFetcher(Constants.GATEWAYS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Gateway> getAllGateways() throws RestException {
        java.util.List<Gateway> allObjs = new ArrayList<Gateway>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            GatewaysFetcher fetcher = getGatewaysFetcherForMeId(session.getId());
            java.util.List<Gateway> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<GatewaysFetcher> getAllGatewaysFetchers() throws RestException {
        java.util.List<GatewaysFetcher> allObjs = new ArrayList<GatewaysFetcher>();
        return allObjs;
    }
    public static MultiNICVPort getMultiNICVPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MultiNICVPort obj = null;
            obj = new MultiNICVPort();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MULTINICVPORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMultiNICVPortId(String id) throws RestException {
        MultiNICVPort obj = getObject(Constants.MULTINICVPORT, id);
        if (obj == null) {
            obj = getMultiNICVPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMultiNICVPortId(String id) throws RestException {
        MultiNICVPort obj = getObject(Constants.MULTINICVPORT, id);
        if (obj == null) {
            obj = getMultiNICVPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForMultiNICVPortId(String id) throws RestException {
        MultiNICVPort obj = getObject(Constants.MULTINICVPORT, id);
        if (obj == null) {
            obj = getMultiNICVPortById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MultiNICVPort> getMultiNICVPortsForFetcherId(String id) throws RestException {
        MultiNICVPortsFetcher fetcher = getMultiNICVPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MULTINICVPORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MultiNICVPort>();
    }

    public static MultiNICVPortsFetcher getMultiNICVPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MULTINICVPORTS_FETCHER, id);
        if (fetcher != null) {
            return (MultiNICVPortsFetcher) fetcher;
        }
        if ((fetcher = getMultiNICVPortsFetcherForVRSId(id)) != null) {
            return (MultiNICVPortsFetcher) addFetcher(Constants.MULTINICVPORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MultiNICVPort> getAllMultiNICVPorts() throws RestException {
        java.util.List<MultiNICVPort> allObjs = new ArrayList<MultiNICVPort>();

        return allObjs;
    }

    public static java.util.List<MultiNICVPortsFetcher> getAllMultiNICVPortsFetchers() throws RestException {
        java.util.List<MultiNICVPortsFetcher> allObjs = new ArrayList<MultiNICVPortsFetcher>();
        return allObjs;
    }
    public static Statistics getStatisticsById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Statistics obj = null;
            obj = new Statistics();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.STATISTICS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForStatisticsId(String id) throws RestException {
        Statistics obj = getObject(Constants.STATISTICS, id);
        if (obj == null) {
            obj = getStatisticsById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForStatisticsId(String id) throws RestException {
        Statistics obj = getObject(Constants.STATISTICS, id);
        if (obj == null) {
            obj = getStatisticsById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Statistics> getStatisticsForFetcherId(String id) throws RestException {
        StatisticsFetcher fetcher = getStatisticsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.STATISTICS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Statistics>();
    }

    public static StatisticsFetcher getStatisticsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.STATISTICS_FETCHER, id);
        if (fetcher != null) {
            return (StatisticsFetcher) fetcher;
        }
        if ((fetcher = getStatisticsFetcherForContainerInterfaceId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForZoneId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForEgressACLEntryTemplateId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForIngressExternalServiceTemplateEntryId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForDomainId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForVPortId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForSubnetId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForVMInterfaceId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForBridgeInterfaceId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForIngressAdvFwdEntryTemplateId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForTierId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForAddressMapId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForIngressACLEntryTemplateId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForL2DomainId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForHostInterfaceId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForNSPortId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        
        if ((fetcher = getStatisticsFetcherForPATNATPoolId(id)) != null) {
            return (StatisticsFetcher) addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Statistics> getAllStatistics() throws RestException {
        java.util.List<Statistics> allObjs = new ArrayList<Statistics>();

        return allObjs;
    }

    public static java.util.List<StatisticsFetcher> getAllStatisticsFetchers() throws RestException {
        java.util.List<StatisticsFetcher> allObjs = new ArrayList<StatisticsFetcher>();
        return allObjs;
    }
    public static NSPortTemplate getNSPortTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSPortTemplate obj = null;
            obj = new NSPortTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NSPORTTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNSPortTemplateId(String id) throws RestException {
        NSPortTemplate obj = getObject(Constants.NSPORTTEMPLATE, id);
        if (obj == null) {
            obj = getNSPortTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNSPortTemplateId(String id) throws RestException {
        NSPortTemplate obj = getObject(Constants.NSPORTTEMPLATE, id);
        if (obj == null) {
            obj = getNSPortTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VLANTemplatesFetcher getVLANTemplatesFetcherForNSPortTemplateId(String id) throws RestException {
        NSPortTemplate obj = getObject(Constants.NSPORTTEMPLATE, id);
        if (obj == null) {
            obj = getNSPortTemplateById(id);
        }

        if (obj != null) {
            VLANTemplatesFetcher fetcher = obj.getVLANTemplates();
            return addFetcher(Constants.VLANTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NSPortTemplate> getNSPortTemplatesForFetcherId(String id) throws RestException {
        NSPortTemplatesFetcher fetcher = getNSPortTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NSPORTTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NSPortTemplate>();
    }

    public static NSPortTemplatesFetcher getNSPortTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NSPORTTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (NSPortTemplatesFetcher) fetcher;
        }
        if ((fetcher = getNSPortTemplatesFetcherForNSGatewayTemplateId(id)) != null) {
            return (NSPortTemplatesFetcher) addFetcher(Constants.NSPORTTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NSPortTemplate> getAllNSPortTemplates() throws RestException {
        java.util.List<NSPortTemplate> allObjs = new ArrayList<NSPortTemplate>();

        return allObjs;
    }

    public static java.util.List<NSPortTemplatesFetcher> getAllNSPortTemplatesFetchers() throws RestException {
        java.util.List<NSPortTemplatesFetcher> allObjs = new ArrayList<NSPortTemplatesFetcher>();
        return allObjs;
    }
    public static Certificate getCertificateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Certificate obj = null;
            obj = new Certificate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.CERTIFICATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForCertificateId(String id) throws RestException {
        Certificate obj = getObject(Constants.CERTIFICATE, id);
        if (obj == null) {
            obj = getCertificateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForCertificateId(String id) throws RestException {
        Certificate obj = getObject(Constants.CERTIFICATE, id);
        if (obj == null) {
            obj = getCertificateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Certificate> getCertificatesForFetcherId(String id) throws RestException {
        CertificatesFetcher fetcher = getCertificatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.CERTIFICATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Certificate>();
    }

    public static CertificatesFetcher getCertificatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.CERTIFICATES_FETCHER, id);
        if (fetcher != null) {
            return (CertificatesFetcher) fetcher;
        }
        if ((fetcher = getCertificatesFetcherForMeId(id)) != null) {
            return (CertificatesFetcher) addFetcher(Constants.CERTIFICATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Certificate> getAllCertificates() throws RestException {
        java.util.List<Certificate> allObjs = new ArrayList<Certificate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            CertificatesFetcher fetcher = getCertificatesFetcherForMeId(session.getId());
            java.util.List<Certificate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<CertificatesFetcher> getAllCertificatesFetchers() throws RestException {
        java.util.List<CertificatesFetcher> allObjs = new ArrayList<CertificatesFetcher>();
        return allObjs;
    }
    public static VCenterDataCenter getVCenterDataCenterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenterDataCenter obj = null;
            obj = new VCenterDataCenter();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VCENTERDATACENTER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AutoDiscoverClustersFetcher getAutoDiscoverClustersFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            AutoDiscoverClustersFetcher fetcher = obj.getAutoDiscoverClusters();
            return addFetcher(Constants.AUTODISCOVERCLUSTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static AutoDiscoverHypervisorFromClustersFetcher getAutoDiscoverHypervisorFromClustersFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            AutoDiscoverHypervisorFromClustersFetcher fetcher = obj.getAutoDiscoverHypervisorFromClusters();
            return addFetcher(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterClustersFetcher getVCenterClustersFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            VCenterClustersFetcher fetcher = obj.getVCenterClusters();
            return addFetcher(Constants.VCENTERCLUSTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterHypervisorsFetcher getVCenterHypervisorsFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            VCenterHypervisorsFetcher fetcher = obj.getVCenterHypervisors();
            return addFetcher(Constants.VCENTERHYPERVISORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSAddressRangesFetcher getVRSAddressRangesFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            VRSAddressRangesFetcher fetcher = obj.getVRSAddressRanges();
            return addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSRedeploymentpoliciesFetcher getVRSRedeploymentpoliciesFetcherForVCenterDataCenterId(String id) throws RestException {
        VCenterDataCenter obj = getObject(Constants.VCENTERDATACENTER, id);
        if (obj == null) {
            obj = getVCenterDataCenterById(id);
        }

        if (obj != null) {
            VRSRedeploymentpoliciesFetcher fetcher = obj.getVRSRedeploymentpolicies();
            return addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VCenterDataCenter> getVCenterDataCentersForFetcherId(String id) throws RestException {
        VCenterDataCentersFetcher fetcher = getVCenterDataCentersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VCENTERDATACENTER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VCenterDataCenter>();
    }

    public static VCenterDataCentersFetcher getVCenterDataCentersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VCENTERDATACENTERS_FETCHER, id);
        if (fetcher != null) {
            return (VCenterDataCentersFetcher) fetcher;
        }
        if ((fetcher = getVCenterDataCentersFetcherForVCenterId(id)) != null) {
            return (VCenterDataCentersFetcher) addFetcher(Constants.VCENTERDATACENTERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VCenterDataCenter> getAllVCenterDataCenters() throws RestException {
        java.util.List<VCenterDataCenter> allObjs = new ArrayList<VCenterDataCenter>();

        return allObjs;
    }

    public static java.util.List<VCenterDataCentersFetcher> getAllVCenterDataCentersFetchers() throws RestException {
        java.util.List<VCenterDataCentersFetcher> allObjs = new ArrayList<VCenterDataCentersFetcher>();
        return allObjs;
    }
    public static L2DomainTemplate getL2DomainTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            L2DomainTemplate obj = null;
            obj = new L2DomainTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.L2DOMAINTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AddressRangesFetcher getAddressRangesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            AddressRangesFetcher fetcher = obj.getAddressRanges();
            return addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLTemplatesFetcher getEgressACLTemplatesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            EgressACLTemplatesFetcher fetcher = obj.getEgressACLTemplates();
            return addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLTemplatesFetcher getIngressACLTemplatesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            IngressACLTemplatesFetcher fetcher = obj.getIngressACLTemplates();
            return addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplatesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            IngressAdvFwdTemplatesFetcher fetcher = obj.getIngressAdvFwdTemplates();
            return addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplatesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            IngressExternalServiceTemplatesFetcher fetcher = obj.getIngressExternalServiceTemplates();
            return addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static L2DomainsFetcher getL2DomainsFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            L2DomainsFetcher fetcher = obj.getL2Domains();
            return addFetcher(Constants.L2DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupTemplatesFetcher getPolicyGroupTemplatesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            PolicyGroupTemplatesFetcher fetcher = obj.getPolicyGroupTemplates();
            return addFetcher(Constants.POLICYGROUPTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetTemplatesFetcher getRedirectionTargetTemplatesFetcherForL2DomainTemplateId(String id) throws RestException {
        L2DomainTemplate obj = getObject(Constants.L2DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getL2DomainTemplateById(id);
        }

        if (obj != null) {
            RedirectionTargetTemplatesFetcher fetcher = obj.getRedirectionTargetTemplates();
            return addFetcher(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<L2DomainTemplate> getL2DomainTemplatesForFetcherId(String id) throws RestException {
        L2DomainTemplatesFetcher fetcher = getL2DomainTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.L2DOMAINTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<L2DomainTemplate>();
    }

    public static L2DomainTemplatesFetcher getL2DomainTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.L2DOMAINTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (L2DomainTemplatesFetcher) fetcher;
        }
        if ((fetcher = getL2DomainTemplatesFetcherForEnterpriseId(id)) != null) {
            return (L2DomainTemplatesFetcher) addFetcher(Constants.L2DOMAINTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<L2DomainTemplate> getAllL2DomainTemplates() throws RestException {
        java.util.List<L2DomainTemplate> allObjs = new ArrayList<L2DomainTemplate>();

        return allObjs;
    }

    public static java.util.List<L2DomainTemplatesFetcher> getAllL2DomainTemplatesFetchers() throws RestException {
        java.util.List<L2DomainTemplatesFetcher> allObjs = new ArrayList<L2DomainTemplatesFetcher>();
        return allObjs;
    }
    public static VRSRedeploymentpolicy getVRSRedeploymentpolicyById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VRSRedeploymentpolicy obj = null;
            obj = new VRSRedeploymentpolicy();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VRSREDEPLOYMENTPOLICY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<VRSRedeploymentpolicy> getVRSRedeploymentpoliciesForFetcherId(String id) throws RestException {
        VRSRedeploymentpoliciesFetcher fetcher = getVRSRedeploymentpoliciesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VRSREDEPLOYMENTPOLICY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VRSRedeploymentpolicy>();
    }

    public static VRSRedeploymentpoliciesFetcher getVRSRedeploymentpoliciesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, id);
        if (fetcher != null) {
            return (VRSRedeploymentpoliciesFetcher) fetcher;
        }
        if ((fetcher = getVRSRedeploymentpoliciesFetcherForVCenterVRSConfigId(id)) != null) {
            return (VRSRedeploymentpoliciesFetcher) addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSRedeploymentpoliciesFetcherForVCenterHypervisorId(id)) != null) {
            return (VRSRedeploymentpoliciesFetcher) addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSRedeploymentpoliciesFetcherForVCenterClusterId(id)) != null) {
            return (VRSRedeploymentpoliciesFetcher) addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSRedeploymentpoliciesFetcherForVCenterDataCenterId(id)) != null) {
            return (VRSRedeploymentpoliciesFetcher) addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSRedeploymentpoliciesFetcherForVCenterId(id)) != null) {
            return (VRSRedeploymentpoliciesFetcher) addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VRSRedeploymentpolicy> getAllVRSRedeploymentpolicies() throws RestException {
        java.util.List<VRSRedeploymentpolicy> allObjs = new ArrayList<VRSRedeploymentpolicy>();

        return allObjs;
    }

    public static java.util.List<VRSRedeploymentpoliciesFetcher> getAllVRSRedeploymentpoliciesFetchers() throws RestException {
        java.util.List<VRSRedeploymentpoliciesFetcher> allObjs = new ArrayList<VRSRedeploymentpoliciesFetcher>();
        return allObjs;
    }
    public static ApplicationService getApplicationServiceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ApplicationService obj = null;
            obj = new ApplicationService();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.APPLICATIONSERVICE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForApplicationServiceId(String id) throws RestException {
        ApplicationService obj = getObject(Constants.APPLICATIONSERVICE, id);
        if (obj == null) {
            obj = getApplicationServiceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForApplicationServiceId(String id) throws RestException {
        ApplicationService obj = getObject(Constants.APPLICATIONSERVICE, id);
        if (obj == null) {
            obj = getApplicationServiceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForApplicationServiceId(String id) throws RestException {
        ApplicationService obj = getObject(Constants.APPLICATIONSERVICE, id);
        if (obj == null) {
            obj = getApplicationServiceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ApplicationService> getApplicationServicesForFetcherId(String id) throws RestException {
        ApplicationServicesFetcher fetcher = getApplicationServicesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.APPLICATIONSERVICE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ApplicationService>();
    }

    public static ApplicationServicesFetcher getApplicationServicesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.APPLICATIONSERVICES_FETCHER, id);
        if (fetcher != null) {
            return (ApplicationServicesFetcher) fetcher;
        }
        if ((fetcher = getApplicationServicesFetcherForMeId(id)) != null) {
            return (ApplicationServicesFetcher) addFetcher(Constants.APPLICATIONSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getApplicationServicesFetcherForEnterpriseId(id)) != null) {
            return (ApplicationServicesFetcher) addFetcher(Constants.APPLICATIONSERVICES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ApplicationService> getAllApplicationServices() throws RestException {
        java.util.List<ApplicationService> allObjs = new ArrayList<ApplicationService>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ApplicationServicesFetcher fetcher = getApplicationServicesFetcherForMeId(session.getId());
            java.util.List<ApplicationService> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ApplicationServicesFetcher> getAllApplicationServicesFetchers() throws RestException {
        java.util.List<ApplicationServicesFetcher> allObjs = new ArrayList<ApplicationServicesFetcher>();
        return allObjs;
    }
    public static IKEGateway getIKEGatewayById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKEGateway obj = null;
            obj = new IKEGateway();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKEGATEWAY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKEGatewayId(String id) throws RestException {
        IKEGateway obj = getObject(Constants.IKEGATEWAY, id);
        if (obj == null) {
            obj = getIKEGatewayById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEGatewayConfigsFetcher getIKEGatewayConfigsFetcherForIKEGatewayId(String id) throws RestException {
        IKEGateway obj = getObject(Constants.IKEGATEWAY, id);
        if (obj == null) {
            obj = getIKEGatewayById(id);
        }

        if (obj != null) {
            IKEGatewayConfigsFetcher fetcher = obj.getIKEGatewayConfigs();
            return addFetcher(Constants.IKEGATEWAYCONFIGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKESubnetsFetcher getIKESubnetsFetcherForIKEGatewayId(String id) throws RestException {
        IKEGateway obj = getObject(Constants.IKEGATEWAY, id);
        if (obj == null) {
            obj = getIKEGatewayById(id);
        }

        if (obj != null) {
            IKESubnetsFetcher fetcher = obj.getIKESubnets();
            return addFetcher(Constants.IKESUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKEGatewayId(String id) throws RestException {
        IKEGateway obj = getObject(Constants.IKEGATEWAY, id);
        if (obj == null) {
            obj = getIKEGatewayById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKEGateway> getIKEGatewaysForFetcherId(String id) throws RestException {
        IKEGatewaysFetcher fetcher = getIKEGatewaysFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKEGATEWAY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKEGateway>();
    }

    public static IKEGatewaysFetcher getIKEGatewaysFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKEGATEWAYS_FETCHER, id);
        if (fetcher != null) {
            return (IKEGatewaysFetcher) fetcher;
        }
        if ((fetcher = getIKEGatewaysFetcherForEnterpriseId(id)) != null) {
            return (IKEGatewaysFetcher) addFetcher(Constants.IKEGATEWAYS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKEGateway> getAllIKEGateways() throws RestException {
        java.util.List<IKEGateway> allObjs = new ArrayList<IKEGateway>();

        return allObjs;
    }

    public static java.util.List<IKEGatewaysFetcher> getAllIKEGatewaysFetchers() throws RestException {
        java.util.List<IKEGatewaysFetcher> allObjs = new ArrayList<IKEGatewaysFetcher>();
        return allObjs;
    }
    public static StatsCollectorInfo getStatsCollectorInfoById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            StatsCollectorInfo obj = null;
            obj = new StatsCollectorInfo();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.STATSCOLLECTORINFO, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForStatsCollectorInfoId(String id) throws RestException {
        StatsCollectorInfo obj = getObject(Constants.STATSCOLLECTORINFO, id);
        if (obj == null) {
            obj = getStatsCollectorInfoById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForStatsCollectorInfoId(String id) throws RestException {
        StatsCollectorInfo obj = getObject(Constants.STATSCOLLECTORINFO, id);
        if (obj == null) {
            obj = getStatsCollectorInfoById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<StatsCollectorInfo> getStatsCollectorInfosForFetcherId(String id) throws RestException {
        StatsCollectorInfosFetcher fetcher = getStatsCollectorInfosFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.STATSCOLLECTORINFO);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<StatsCollectorInfo>();
    }

    public static StatsCollectorInfosFetcher getStatsCollectorInfosFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.STATSCOLLECTORINFOS_FETCHER, id);
        if (fetcher != null) {
            return (StatsCollectorInfosFetcher) fetcher;
        }
        if ((fetcher = getStatsCollectorInfosFetcherForMeId(id)) != null) {
            return (StatsCollectorInfosFetcher) addFetcher(Constants.STATSCOLLECTORINFOS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<StatsCollectorInfo> getAllStatsCollectorInfos() throws RestException {
        java.util.List<StatsCollectorInfo> allObjs = new ArrayList<StatsCollectorInfo>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            StatsCollectorInfosFetcher fetcher = getStatsCollectorInfosFetcherForMeId(session.getId());
            java.util.List<StatsCollectorInfo> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<StatsCollectorInfosFetcher> getAllStatsCollectorInfosFetchers() throws RestException {
        java.util.List<StatsCollectorInfosFetcher> allObjs = new ArrayList<StatsCollectorInfosFetcher>();
        return allObjs;
    }
    public static VCenter getVCenterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCenter obj = null;
            obj = new VCenter();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VCENTER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AutodiscovereddatacentersFetcher getAutodiscovereddatacentersFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            AutodiscovereddatacentersFetcher fetcher = obj.getAutodiscovereddatacenters();
            return addFetcher(Constants.AUTODISCOVEREDDATACENTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterDataCentersFetcher getVCenterDataCentersFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            VCenterDataCentersFetcher fetcher = obj.getVCenterDataCenters();
            return addFetcher(Constants.VCENTERDATACENTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSAddressRangesFetcher getVRSAddressRangesFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            VRSAddressRangesFetcher fetcher = obj.getVRSAddressRanges();
            return addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSRedeploymentpoliciesFetcher getVRSRedeploymentpoliciesFetcherForVCenterId(String id) throws RestException {
        VCenter obj = getObject(Constants.VCENTER, id);
        if (obj == null) {
            obj = getVCenterById(id);
        }

        if (obj != null) {
            VRSRedeploymentpoliciesFetcher fetcher = obj.getVRSRedeploymentpolicies();
            return addFetcher(Constants.VRSREDEPLOYMENTPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VCenter> getVCentersForFetcherId(String id) throws RestException {
        VCentersFetcher fetcher = getVCentersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VCENTER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VCenter>();
    }

    public static VCentersFetcher getVCentersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VCENTERS_FETCHER, id);
        if (fetcher != null) {
            return (VCentersFetcher) fetcher;
        }
        if ((fetcher = getVCentersFetcherForMeId(id)) != null) {
            return (VCentersFetcher) addFetcher(Constants.VCENTERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VCenter> getAllVCenters() throws RestException {
        java.util.List<VCenter> allObjs = new ArrayList<VCenter>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VCentersFetcher fetcher = getVCentersFetcherForMeId(session.getId());
            java.util.List<VCenter> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VCentersFetcher> getAllVCentersFetchers() throws RestException {
        java.util.List<VCentersFetcher> allObjs = new ArrayList<VCentersFetcher>();
        return allObjs;
    }
    public static BulkStatistics getBulkStatisticsById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BulkStatistics obj = null;
            obj = new BulkStatistics();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BULKSTATISTICS, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBulkStatisticsId(String id) throws RestException {
        BulkStatistics obj = getObject(Constants.BULKSTATISTICS, id);
        if (obj == null) {
            obj = getBulkStatisticsById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBulkStatisticsId(String id) throws RestException {
        BulkStatistics obj = getObject(Constants.BULKSTATISTICS, id);
        if (obj == null) {
            obj = getBulkStatisticsById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<BulkStatistics> getBulkStatisticsForFetcherId(String id) throws RestException {
        BulkStatisticsFetcher fetcher = getBulkStatisticsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BULKSTATISTICS);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BulkStatistics>();
    }

    public static BulkStatisticsFetcher getBulkStatisticsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BULKSTATISTICS_FETCHER, id);
        if (fetcher != null) {
            return (BulkStatisticsFetcher) fetcher;
        }
        if ((fetcher = getBulkStatisticsFetcherForPATNATPoolId(id)) != null) {
            return (BulkStatisticsFetcher) addFetcher(Constants.BULKSTATISTICS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BulkStatistics> getAllBulkStatistics() throws RestException {
        java.util.List<BulkStatistics> allObjs = new ArrayList<BulkStatistics>();

        return allObjs;
    }

    public static java.util.List<BulkStatisticsFetcher> getAllBulkStatisticsFetchers() throws RestException {
        java.util.List<BulkStatisticsFetcher> allObjs = new ArrayList<BulkStatisticsFetcher>();
        return allObjs;
    }
    public static IngressACLEntryTemplate getIngressACLEntryTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressACLEntryTemplate obj = null;
            obj = new IngressACLEntryTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INGRESSACLENTRYTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIngressACLEntryTemplateId(String id) throws RestException {
        IngressACLEntryTemplate obj = getObject(Constants.INGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLEntryTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForIngressACLEntryTemplateId(String id) throws RestException {
        IngressACLEntryTemplate obj = getObject(Constants.INGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLEntryTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIngressACLEntryTemplateId(String id) throws RestException {
        IngressACLEntryTemplate obj = getObject(Constants.INGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLEntryTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForIngressACLEntryTemplateId(String id) throws RestException {
        IngressACLEntryTemplate obj = getObject(Constants.INGRESSACLENTRYTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLEntryTemplateById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IngressACLEntryTemplate> getIngressACLEntryTemplatesForFetcherId(String id) throws RestException {
        IngressACLEntryTemplatesFetcher fetcher = getIngressACLEntryTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INGRESSACLENTRYTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IngressACLEntryTemplate>();
    }

    public static IngressACLEntryTemplatesFetcher getIngressACLEntryTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (IngressACLEntryTemplatesFetcher) fetcher;
        }
        if ((fetcher = getIngressACLEntryTemplatesFetcherForDomainId(id)) != null) {
            return (IngressACLEntryTemplatesFetcher) addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLEntryTemplatesFetcherForMirrorDestinationId(id)) != null) {
            return (IngressACLEntryTemplatesFetcher) addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLEntryTemplatesFetcherForL2DomainId(id)) != null) {
            return (IngressACLEntryTemplatesFetcher) addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLEntryTemplatesFetcherForMeId(id)) != null) {
            return (IngressACLEntryTemplatesFetcher) addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLEntryTemplatesFetcherForIngressACLTemplateId(id)) != null) {
            return (IngressACLEntryTemplatesFetcher) addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IngressACLEntryTemplate> getAllIngressACLEntryTemplates() throws RestException {
        java.util.List<IngressACLEntryTemplate> allObjs = new ArrayList<IngressACLEntryTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressACLEntryTemplatesFetcher fetcher = getIngressACLEntryTemplatesFetcherForMeId(session.getId());
            java.util.List<IngressACLEntryTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<IngressACLEntryTemplatesFetcher> getAllIngressACLEntryTemplatesFetchers() throws RestException {
        java.util.List<IngressACLEntryTemplatesFetcher> allObjs = new ArrayList<IngressACLEntryTemplatesFetcher>();
        return allObjs;
    }
    public static RoutingPolicy getRoutingPolicyById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            RoutingPolicy obj = null;
            obj = new RoutingPolicy();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ROUTINGPOLICY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForRoutingPolicyId(String id) throws RestException {
        RoutingPolicy obj = getObject(Constants.ROUTINGPOLICY, id);
        if (obj == null) {
            obj = getRoutingPolicyById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForRoutingPolicyId(String id) throws RestException {
        RoutingPolicy obj = getObject(Constants.ROUTINGPOLICY, id);
        if (obj == null) {
            obj = getRoutingPolicyById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<RoutingPolicy> getRoutingPoliciesForFetcherId(String id) throws RestException {
        RoutingPoliciesFetcher fetcher = getRoutingPoliciesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ROUTINGPOLICY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<RoutingPolicy>();
    }

    public static RoutingPoliciesFetcher getRoutingPoliciesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ROUTINGPOLICIES_FETCHER, id);
        if (fetcher != null) {
            return (RoutingPoliciesFetcher) fetcher;
        }
        if ((fetcher = getRoutingPoliciesFetcherForDomainId(id)) != null) {
            return (RoutingPoliciesFetcher) addFetcher(Constants.ROUTINGPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getRoutingPoliciesFetcherForMeId(id)) != null) {
            return (RoutingPoliciesFetcher) addFetcher(Constants.ROUTINGPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getRoutingPoliciesFetcherForEnterpriseId(id)) != null) {
            return (RoutingPoliciesFetcher) addFetcher(Constants.ROUTINGPOLICIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<RoutingPolicy> getAllRoutingPolicies() throws RestException {
        java.util.List<RoutingPolicy> allObjs = new ArrayList<RoutingPolicy>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            RoutingPoliciesFetcher fetcher = getRoutingPoliciesFetcherForMeId(session.getId());
            java.util.List<RoutingPolicy> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<RoutingPoliciesFetcher> getAllRoutingPoliciesFetchers() throws RestException {
        java.util.List<RoutingPoliciesFetcher> allObjs = new ArrayList<RoutingPoliciesFetcher>();
        return allObjs;
    }
    public static NetworkPerformanceBinding getNetworkPerformanceBindingById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NetworkPerformanceBinding obj = null;
            obj = new NetworkPerformanceBinding();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NETWORKPERFORMANCEBINDING, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<NetworkPerformanceBinding> getNetworkPerformanceBindingsForFetcherId(String id) throws RestException {
        NetworkPerformanceBindingsFetcher fetcher = getNetworkPerformanceBindingsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NETWORKPERFORMANCEBINDING);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NetworkPerformanceBinding>();
    }

    public static NetworkPerformanceBindingsFetcher getNetworkPerformanceBindingsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, id);
        if (fetcher != null) {
            return (NetworkPerformanceBindingsFetcher) fetcher;
        }
        if ((fetcher = getNetworkPerformanceBindingsFetcherForNetworkPerformanceMeasurementId(id)) != null) {
            return (NetworkPerformanceBindingsFetcher) addFetcher(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NetworkPerformanceBinding> getAllNetworkPerformanceBindings() throws RestException {
        java.util.List<NetworkPerformanceBinding> allObjs = new ArrayList<NetworkPerformanceBinding>();

        return allObjs;
    }

    public static java.util.List<NetworkPerformanceBindingsFetcher> getAllNetworkPerformanceBindingsFetchers() throws RestException {
        java.util.List<NetworkPerformanceBindingsFetcher> allObjs = new ArrayList<NetworkPerformanceBindingsFetcher>();
        return allObjs;
    }
    public static L2Domain getL2DomainById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            L2Domain obj = null;
            obj = new L2Domain();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.L2DOMAIN, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AddressRangesFetcher getAddressRangesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            AddressRangesFetcher fetcher = obj.getAddressRanges();
            return addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ApplicationperformancemanagementbindingsFetcher getApplicationperformancemanagementbindingsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            ApplicationperformancemanagementbindingsFetcher fetcher = obj.getApplicationperformancemanagementbindings();
            return addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BridgeInterfacesFetcher getBridgeInterfacesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            BridgeInterfacesFetcher fetcher = obj.getBridgeInterfaces();
            return addFetcher(Constants.BRIDGEINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLEntryTemplatesFetcher getEgressACLEntryTemplatesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            EgressACLEntryTemplatesFetcher fetcher = obj.getEgressACLEntryTemplates();
            return addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLTemplatesFetcher getEgressACLTemplatesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            EgressACLTemplatesFetcher fetcher = obj.getEgressACLTemplates();
            return addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static HostInterfacesFetcher getHostInterfacesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            HostInterfacesFetcher fetcher = obj.getHostInterfaces();
            return addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLEntryTemplatesFetcher getIngressACLEntryTemplatesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            IngressACLEntryTemplatesFetcher fetcher = obj.getIngressACLEntryTemplates();
            return addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLTemplatesFetcher getIngressACLTemplatesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            IngressACLTemplatesFetcher fetcher = obj.getIngressACLTemplates();
            return addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplatesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            IngressAdvFwdTemplatesFetcher fetcher = obj.getIngressAdvFwdTemplates();
            return addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplatesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            IngressExternalServiceTemplatesFetcher fetcher = obj.getIngressExternalServiceTemplates();
            return addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UplinkRDsFetcher getUplinkRDsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            UplinkRDsFetcher fetcher = obj.getUplinkRDs();
            return addFetcher(Constants.UPLINKRDS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPNConnectionsFetcher getVPNConnectionsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            VPNConnectionsFetcher fetcher = obj.getVPNConnections();
            return addFetcher(Constants.VPNCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForL2DomainId(String id) throws RestException {
        L2Domain obj = getObject(Constants.L2DOMAIN, id);
        if (obj == null) {
            obj = getL2DomainById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<L2Domain> getL2DomainsForFetcherId(String id) throws RestException {
        L2DomainsFetcher fetcher = getL2DomainsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.L2DOMAIN);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<L2Domain>();
    }

    public static L2DomainsFetcher getL2DomainsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.L2DOMAINS_FETCHER, id);
        if (fetcher != null) {
            return (L2DomainsFetcher) fetcher;
        }
        if ((fetcher = getL2DomainsFetcherForL2DomainTemplateId(id)) != null) {
            return (L2DomainsFetcher) addFetcher(Constants.L2DOMAINS_FETCHER, fetcher);
        }
        
        if ((fetcher = getL2DomainsFetcherForMeId(id)) != null) {
            return (L2DomainsFetcher) addFetcher(Constants.L2DOMAINS_FETCHER, fetcher);
        }
        
        if ((fetcher = getL2DomainsFetcherForEnterpriseId(id)) != null) {
            return (L2DomainsFetcher) addFetcher(Constants.L2DOMAINS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<L2Domain> getAllL2Domains() throws RestException {
        java.util.List<L2Domain> allObjs = new ArrayList<L2Domain>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            L2DomainsFetcher fetcher = getL2DomainsFetcherForMeId(session.getId());
            java.util.List<L2Domain> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<L2DomainsFetcher> getAllL2DomainsFetchers() throws RestException {
        java.util.List<L2DomainsFetcher> allObjs = new ArrayList<L2DomainsFetcher>();
        return allObjs;
    }
    public static IKEGatewayConfig getIKEGatewayConfigById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKEGatewayConfig obj = null;
            obj = new IKEGatewayConfig();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKEGATEWAYCONFIG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKEGatewayConfigId(String id) throws RestException {
        IKEGatewayConfig obj = getObject(Constants.IKEGATEWAYCONFIG, id);
        if (obj == null) {
            obj = getIKEGatewayConfigById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKEGatewayConfigId(String id) throws RestException {
        IKEGatewayConfig obj = getObject(Constants.IKEGATEWAYCONFIG, id);
        if (obj == null) {
            obj = getIKEGatewayConfigById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKEGatewayConfig> getIKEGatewayConfigsForFetcherId(String id) throws RestException {
        IKEGatewayConfigsFetcher fetcher = getIKEGatewayConfigsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKEGATEWAYCONFIG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKEGatewayConfig>();
    }

    public static IKEGatewayConfigsFetcher getIKEGatewayConfigsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKEGATEWAYCONFIGS_FETCHER, id);
        if (fetcher != null) {
            return (IKEGatewayConfigsFetcher) fetcher;
        }
        if ((fetcher = getIKEGatewayConfigsFetcherForIKEGatewayId(id)) != null) {
            return (IKEGatewayConfigsFetcher) addFetcher(Constants.IKEGATEWAYCONFIGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKEGatewayConfig> getAllIKEGatewayConfigs() throws RestException {
        java.util.List<IKEGatewayConfig> allObjs = new ArrayList<IKEGatewayConfig>();

        return allObjs;
    }

    public static java.util.List<IKEGatewayConfigsFetcher> getAllIKEGatewayConfigsFetchers() throws RestException {
        java.util.List<IKEGatewayConfigsFetcher> allObjs = new ArrayList<IKEGatewayConfigsFetcher>();
        return allObjs;
    }
    public static HostInterface getHostInterfaceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            HostInterface obj = null;
            obj = new HostInterface();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.HOSTINTERFACE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DHCPOptionsFetcher getDHCPOptionsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            DHCPOptionsFetcher fetcher = obj.getDHCPOptions();
            return addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastChannelMapsFetcher getMultiCastChannelMapsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            MultiCastChannelMapsFetcher fetcher = obj.getMultiCastChannelMaps();
            return addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyDecisionsFetcher getPolicyDecisionsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            PolicyDecisionsFetcher fetcher = obj.getPolicyDecisions();
            return addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForHostInterfaceId(String id) throws RestException {
        HostInterface obj = getObject(Constants.HOSTINTERFACE, id);
        if (obj == null) {
            obj = getHostInterfaceById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<HostInterface> getHostInterfacesForFetcherId(String id) throws RestException {
        HostInterfacesFetcher fetcher = getHostInterfacesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.HOSTINTERFACE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<HostInterface>();
    }

    public static HostInterfacesFetcher getHostInterfacesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.HOSTINTERFACES_FETCHER, id);
        if (fetcher != null) {
            return (HostInterfacesFetcher) fetcher;
        }
        if ((fetcher = getHostInterfacesFetcherForDomainId(id)) != null) {
            return (HostInterfacesFetcher) addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getHostInterfacesFetcherForVPortId(id)) != null) {
            return (HostInterfacesFetcher) addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getHostInterfacesFetcherForL2DomainId(id)) != null) {
            return (HostInterfacesFetcher) addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }
        
        if ((fetcher = getHostInterfacesFetcherForMeId(id)) != null) {
            return (HostInterfacesFetcher) addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<HostInterface> getAllHostInterfaces() throws RestException {
        java.util.List<HostInterface> allObjs = new ArrayList<HostInterface>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            HostInterfacesFetcher fetcher = getHostInterfacesFetcherForMeId(session.getId());
            java.util.List<HostInterface> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<HostInterfacesFetcher> getAllHostInterfacesFetchers() throws RestException {
        java.util.List<HostInterfacesFetcher> allObjs = new ArrayList<HostInterfacesFetcher>();
        return allObjs;
    }
    public static EnterpriseSecuredData getEnterpriseSecuredDataById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterpriseSecuredData obj = null;
            obj = new EnterpriseSecuredData();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENTERPRISESECUREDDATA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEnterpriseSecuredDataId(String id) throws RestException {
        EnterpriseSecuredData obj = getObject(Constants.ENTERPRISESECUREDDATA, id);
        if (obj == null) {
            obj = getEnterpriseSecuredDataById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEnterpriseSecuredDataId(String id) throws RestException {
        EnterpriseSecuredData obj = getObject(Constants.ENTERPRISESECUREDDATA, id);
        if (obj == null) {
            obj = getEnterpriseSecuredDataById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EnterpriseSecuredData> getEnterpriseSecuredDatasForFetcherId(String id) throws RestException {
        EnterpriseSecuredDatasFetcher fetcher = getEnterpriseSecuredDatasFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENTERPRISESECUREDDATA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EnterpriseSecuredData>();
    }

    public static EnterpriseSecuredDatasFetcher getEnterpriseSecuredDatasFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENTERPRISESECUREDDATAS_FETCHER, id);
        if (fetcher != null) {
            return (EnterpriseSecuredDatasFetcher) fetcher;
        }
        if ((fetcher = getEnterpriseSecuredDatasFetcherForEnterpriseSecurityId(id)) != null) {
            return (EnterpriseSecuredDatasFetcher) addFetcher(Constants.ENTERPRISESECUREDDATAS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EnterpriseSecuredData> getAllEnterpriseSecuredDatas() throws RestException {
        java.util.List<EnterpriseSecuredData> allObjs = new ArrayList<EnterpriseSecuredData>();

        return allObjs;
    }

    public static java.util.List<EnterpriseSecuredDatasFetcher> getAllEnterpriseSecuredDatasFetchers() throws RestException {
        java.util.List<EnterpriseSecuredDatasFetcher> allObjs = new ArrayList<EnterpriseSecuredDatasFetcher>();
        return allObjs;
    }
    public static Applicationperformancemanagement getApplicationperformancemanagementById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Applicationperformancemanagement obj = null;
            obj = new Applicationperformancemanagement();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.APPLICATIONPERFORMANCEMANAGEMENT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ApplicationBindingsFetcher getApplicationBindingsFetcherForApplicationperformancemanagementId(String id) throws RestException {
        Applicationperformancemanagement obj = getObject(Constants.APPLICATIONPERFORMANCEMANAGEMENT, id);
        if (obj == null) {
            obj = getApplicationperformancemanagementById(id);
        }

        if (obj != null) {
            ApplicationBindingsFetcher fetcher = obj.getApplicationBindings();
            return addFetcher(Constants.APPLICATIONBINDINGS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Applicationperformancemanagement> getApplicationperformancemanagementsForFetcherId(String id) throws RestException {
        ApplicationperformancemanagementsFetcher fetcher = getApplicationperformancemanagementsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.APPLICATIONPERFORMANCEMANAGEMENT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Applicationperformancemanagement>();
    }

    public static ApplicationperformancemanagementsFetcher getApplicationperformancemanagementsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, id);
        if (fetcher != null) {
            return (ApplicationperformancemanagementsFetcher) fetcher;
        }
        if ((fetcher = getApplicationperformancemanagementsFetcherForVPortId(id)) != null) {
            return (ApplicationperformancemanagementsFetcher) addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getApplicationperformancemanagementsFetcherForPerformanceMonitorId(id)) != null) {
            return (ApplicationperformancemanagementsFetcher) addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getApplicationperformancemanagementsFetcherForEnterpriseId(id)) != null) {
            return (ApplicationperformancemanagementsFetcher) addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Applicationperformancemanagement> getAllApplicationperformancemanagements() throws RestException {
        java.util.List<Applicationperformancemanagement> allObjs = new ArrayList<Applicationperformancemanagement>();

        return allObjs;
    }

    public static java.util.List<ApplicationperformancemanagementsFetcher> getAllApplicationperformancemanagementsFetchers() throws RestException {
        java.util.List<ApplicationperformancemanagementsFetcher> allObjs = new ArrayList<ApplicationperformancemanagementsFetcher>();
        return allObjs;
    }
    public static IKECertificate getIKECertificateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKECertificate obj = null;
            obj = new IKECertificate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKECERTIFICATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKECertificateId(String id) throws RestException {
        IKECertificate obj = getObject(Constants.IKECERTIFICATE, id);
        if (obj == null) {
            obj = getIKECertificateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKECertificateId(String id) throws RestException {
        IKECertificate obj = getObject(Constants.IKECERTIFICATE, id);
        if (obj == null) {
            obj = getIKECertificateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKECertificate> getIKECertificatesForFetcherId(String id) throws RestException {
        IKECertificatesFetcher fetcher = getIKECertificatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKECERTIFICATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKECertificate>();
    }

    public static IKECertificatesFetcher getIKECertificatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKECERTIFICATES_FETCHER, id);
        if (fetcher != null) {
            return (IKECertificatesFetcher) fetcher;
        }
        if ((fetcher = getIKECertificatesFetcherForEnterpriseId(id)) != null) {
            return (IKECertificatesFetcher) addFetcher(Constants.IKECERTIFICATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKECertificate> getAllIKECertificates() throws RestException {
        java.util.List<IKECertificate> allObjs = new ArrayList<IKECertificate>();

        return allObjs;
    }

    public static java.util.List<IKECertificatesFetcher> getAllIKECertificatesFetchers() throws RestException {
        java.util.List<IKECertificatesFetcher> allObjs = new ArrayList<IKECertificatesFetcher>();
        return allObjs;
    }
    public static IngressExternalServiceTemplate getIngressExternalServiceTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressExternalServiceTemplate obj = null;
            obj = new IngressExternalServiceTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INGRESSEXTERNALSERVICETEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIngressExternalServiceTemplateId(String id) throws RestException {
        IngressExternalServiceTemplate obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATE, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressExternalServiceTemplateEntriesFetcher getIngressExternalServiceTemplateEntriesFetcherForIngressExternalServiceTemplateId(String id) throws RestException {
        IngressExternalServiceTemplate obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATE, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateById(id);
        }

        if (obj != null) {
            IngressExternalServiceTemplateEntriesFetcher fetcher = obj.getIngressExternalServiceTemplateEntries();
            return addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATEENTRIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForIngressExternalServiceTemplateId(String id) throws RestException {
        IngressExternalServiceTemplate obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATE, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIngressExternalServiceTemplateId(String id) throws RestException {
        IngressExternalServiceTemplate obj = getObject(Constants.INGRESSEXTERNALSERVICETEMPLATE, id);
        if (obj == null) {
            obj = getIngressExternalServiceTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IngressExternalServiceTemplate> getIngressExternalServiceTemplatesForFetcherId(String id) throws RestException {
        IngressExternalServiceTemplatesFetcher fetcher = getIngressExternalServiceTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INGRESSEXTERNALSERVICETEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IngressExternalServiceTemplate>();
    }

    public static IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (IngressExternalServiceTemplatesFetcher) fetcher;
        }
        if ((fetcher = getIngressExternalServiceTemplatesFetcherForDomainId(id)) != null) {
            return (IngressExternalServiceTemplatesFetcher) addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressExternalServiceTemplatesFetcherForL2DomainTemplateId(id)) != null) {
            return (IngressExternalServiceTemplatesFetcher) addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressExternalServiceTemplatesFetcherForL2DomainId(id)) != null) {
            return (IngressExternalServiceTemplatesFetcher) addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressExternalServiceTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (IngressExternalServiceTemplatesFetcher) addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IngressExternalServiceTemplate> getAllIngressExternalServiceTemplates() throws RestException {
        java.util.List<IngressExternalServiceTemplate> allObjs = new ArrayList<IngressExternalServiceTemplate>();

        return allObjs;
    }

    public static java.util.List<IngressExternalServiceTemplatesFetcher> getAllIngressExternalServiceTemplatesFetchers() throws RestException {
        java.util.List<IngressExternalServiceTemplatesFetcher> allObjs = new ArrayList<IngressExternalServiceTemplatesFetcher>();
        return allObjs;
    }
    public static PortTemplate getPortTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PortTemplate obj = null;
            obj = new PortTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PORTTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPortTemplateId(String id) throws RestException {
        PortTemplate obj = getObject(Constants.PORTTEMPLATE, id);
        if (obj == null) {
            obj = getPortTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPortTemplateId(String id) throws RestException {
        PortTemplate obj = getObject(Constants.PORTTEMPLATE, id);
        if (obj == null) {
            obj = getPortTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VLANTemplatesFetcher getVLANTemplatesFetcherForPortTemplateId(String id) throws RestException {
        PortTemplate obj = getObject(Constants.PORTTEMPLATE, id);
        if (obj == null) {
            obj = getPortTemplateById(id);
        }

        if (obj != null) {
            VLANTemplatesFetcher fetcher = obj.getVLANTemplates();
            return addFetcher(Constants.VLANTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PortTemplate> getPortTemplatesForFetcherId(String id) throws RestException {
        PortTemplatesFetcher fetcher = getPortTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PORTTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PortTemplate>();
    }

    public static PortTemplatesFetcher getPortTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PORTTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (PortTemplatesFetcher) fetcher;
        }
        if ((fetcher = getPortTemplatesFetcherForGatewayTemplateId(id)) != null) {
            return (PortTemplatesFetcher) addFetcher(Constants.PORTTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PortTemplate> getAllPortTemplates() throws RestException {
        java.util.List<PortTemplate> allObjs = new ArrayList<PortTemplate>();

        return allObjs;
    }

    public static java.util.List<PortTemplatesFetcher> getAllPortTemplatesFetchers() throws RestException {
        java.util.List<PortTemplatesFetcher> allObjs = new ArrayList<PortTemplatesFetcher>();
        return allObjs;
    }
    public static Me getMeById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Me obj = null;
            obj = session.getMe();
            if (obj.getId().equals(id)) {
                return addObject(Constants.ME, obj);
            }
            
        }

        return null;
    }
    public static ApplicationServicesFetcher getApplicationServicesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ApplicationServicesFetcher fetcher = obj.getApplicationServices();
            return addFetcher(Constants.APPLICATIONSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static AutoDiscoveredGatewaysFetcher getAutoDiscoveredGatewaysFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            AutoDiscoveredGatewaysFetcher fetcher = obj.getAutoDiscoveredGateways();
            return addFetcher(Constants.AUTODISCOVEREDGATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPNeighborsFetcher getBGPNeighborsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            BGPNeighborsFetcher fetcher = obj.getBGPNeighbors();
            return addFetcher(Constants.BGPNEIGHBORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPProfilesFetcher getBGPProfilesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            BGPProfilesFetcher fetcher = obj.getBGPProfiles();
            return addFetcher(Constants.BGPPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static CertificatesFetcher getCertificatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            CertificatesFetcher fetcher = obj.getCertificates();
            return addFetcher(Constants.CERTIFICATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static CloudMgmtSystemsFetcher getCloudMgmtSystemsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            CloudMgmtSystemsFetcher fetcher = obj.getCloudMgmtSystems();
            return addFetcher(Constants.CLOUDMGMTSYSTEMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainerInterfacesFetcher getContainerInterfacesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ContainerInterfacesFetcher fetcher = obj.getContainerInterfaces();
            return addFetcher(Constants.CONTAINERINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainsFetcher getDomainsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            DomainsFetcher fetcher = obj.getDomains();
            return addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterEAMConfigsFetcher getVCenterEAMConfigsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VCenterEAMConfigsFetcher fetcher = obj.getVCenterEAMConfigs();
            return addFetcher(Constants.VCENTEREAMCONFIGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLEntryTemplatesFetcher getEgressACLEntryTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            EgressACLEntryTemplatesFetcher fetcher = obj.getEgressACLEntryTemplates();
            return addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLTemplatesFetcher getEgressACLTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            EgressACLTemplatesFetcher fetcher = obj.getEgressACLTemplates();
            return addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainFIPAclTemplatesFetcher getDomainFIPAclTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            DomainFIPAclTemplatesFetcher fetcher = obj.getDomainFIPAclTemplates();
            return addFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FloatingIPACLTemplatesFetcher getFloatingIPACLTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            FloatingIPACLTemplatesFetcher fetcher = obj.getFloatingIPACLTemplates();
            return addFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressQOSPoliciesFetcher getEgressQOSPoliciesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            EgressQOSPoliciesFetcher fetcher = obj.getEgressQOSPolicies();
            return addFetcher(Constants.EGRESSQOSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisesFetcher getEnterprisesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            EnterprisesFetcher fetcher = obj.getEnterprises();
            return addFetcher(Constants.ENTERPRISES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterpriseProfilesFetcher getEnterpriseProfilesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            EnterpriseProfilesFetcher fetcher = obj.getEnterpriseProfiles();
            return addFetcher(Constants.ENTERPRISEPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ExternalAppServicesFetcher getExternalAppServicesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ExternalAppServicesFetcher fetcher = obj.getExternalAppServices();
            return addFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ExternalServicesFetcher getExternalServicesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ExternalServicesFetcher fetcher = obj.getExternalServices();
            return addFetcher(Constants.EXTERNALSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FloatingIpsFetcher getFloatingIpsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            FloatingIpsFetcher fetcher = obj.getFloatingIps();
            return addFetcher(Constants.FLOATINGIPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GatewaysFetcher getGatewaysFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            GatewaysFetcher fetcher = obj.getGateways();
            return addFetcher(Constants.GATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GatewayTemplatesFetcher getGatewayTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            GatewayTemplatesFetcher fetcher = obj.getGatewayTemplates();
            return addFetcher(Constants.GATEWAYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static HostInterfacesFetcher getHostInterfacesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            HostInterfacesFetcher fetcher = obj.getHostInterfaces();
            return addFetcher(Constants.HOSTINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static InfrastructureGatewayProfilesFetcher getInfrastructureGatewayProfilesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            InfrastructureGatewayProfilesFetcher fetcher = obj.getInfrastructureGatewayProfiles();
            return addFetcher(Constants.INFRASTRUCTUREGATEWAYPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static InfrastructureVscProfilesFetcher getInfrastructureVscProfilesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            InfrastructureVscProfilesFetcher fetcher = obj.getInfrastructureVscProfiles();
            return addFetcher(Constants.INFRASTRUCTUREVSCPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLEntryTemplatesFetcher getIngressACLEntryTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            IngressACLEntryTemplatesFetcher fetcher = obj.getIngressACLEntryTemplates();
            return addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLTemplatesFetcher getIngressACLTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            IngressACLTemplatesFetcher fetcher = obj.getIngressACLTemplates();
            return addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            IngressAdvFwdEntryTemplatesFetcher fetcher = obj.getIngressAdvFwdEntryTemplates();
            return addFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static KeyServerMembersFetcher getKeyServerMembersFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            KeyServerMembersFetcher fetcher = obj.getKeyServerMembers();
            return addFetcher(Constants.KEYSERVERMEMBERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static L2DomainsFetcher getL2DomainsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            L2DomainsFetcher fetcher = obj.getL2Domains();
            return addFetcher(Constants.L2DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static LicensesFetcher getLicensesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            LicensesFetcher fetcher = obj.getLicenses();
            return addFetcher(Constants.LICENSES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static LicenseStatusFetcher getLicenseStatusFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            LicenseStatusFetcher fetcher = obj.getLicenseStatus();
            return addFetcher(Constants.LICENSESTATUS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadataTagsFetcher getMetadataTagsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            MetadataTagsFetcher fetcher = obj.getMetadataTags();
            return addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MirrorDestinationsFetcher getMirrorDestinationsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            MirrorDestinationsFetcher fetcher = obj.getMirrorDestinations();
            return addFetcher(Constants.MIRRORDESTINATIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastChannelMapsFetcher getMultiCastChannelMapsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            MultiCastChannelMapsFetcher fetcher = obj.getMultiCastChannelMaps();
            return addFetcher(Constants.MULTICASTCHANNELMAPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NetworkLayoutsFetcher getNetworkLayoutsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            NetworkLayoutsFetcher fetcher = obj.getNetworkLayouts();
            return addFetcher(Constants.NETWORKLAYOUTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSGatewaysFetcher getNSGatewaysFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            NSGatewaysFetcher fetcher = obj.getNSGateways();
            return addFetcher(Constants.NSGATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSGatewayTemplatesFetcher getNSGatewayTemplatesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            NSGatewayTemplatesFetcher fetcher = obj.getNSGatewayTemplates();
            return addFetcher(Constants.NSGATEWAYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroupsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            NSRedundantGatewayGroupsFetcher fetcher = obj.getNSRedundantGatewayGroups();
            return addFetcher(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATMappersFetcher getPATMappersFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            PATMappersFetcher fetcher = obj.getPATMappers();
            return addFetcher(Constants.PATMAPPERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATNATPoolsFetcher getPATNATPoolsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            PATNATPoolsFetcher fetcher = obj.getPATNATPools();
            return addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupsFetcher getPolicyGroupsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            PolicyGroupsFetcher fetcher = obj.getPolicyGroups();
            return addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RateLimitersFetcher getRateLimitersFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            RateLimitersFetcher fetcher = obj.getRateLimiters();
            return addFetcher(Constants.RATELIMITERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetsFetcher getRedirectionTargetsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            RedirectionTargetsFetcher fetcher = obj.getRedirectionTargets();
            return addFetcher(Constants.REDIRECTIONTARGETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedundancyGroupsFetcher getRedundancyGroupsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            RedundancyGroupsFetcher fetcher = obj.getRedundancyGroups();
            return addFetcher(Constants.REDUNDANCYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RoutingPoliciesFetcher getRoutingPoliciesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            RoutingPoliciesFetcher fetcher = obj.getRoutingPolicies();
            return addFetcher(Constants.ROUTINGPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SharedNetworkResourcesFetcher getSharedNetworkResourcesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            SharedNetworkResourcesFetcher fetcher = obj.getSharedNetworkResources();
            return addFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SiteInfosFetcher getSiteInfosFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            SiteInfosFetcher fetcher = obj.getSiteInfos();
            return addFetcher(Constants.SITEINFOS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StaticRoutesFetcher getStaticRoutesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            StaticRoutesFetcher fetcher = obj.getStaticRoutes();
            return addFetcher(Constants.STATICROUTES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatsCollectorInfosFetcher getStatsCollectorInfosFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            StatsCollectorInfosFetcher fetcher = obj.getStatsCollectorInfos();
            return addFetcher(Constants.STATSCOLLECTORINFOS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetsFetcher getSubnetsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            SubnetsFetcher fetcher = obj.getSubnets();
            return addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SystemConfigsFetcher getSystemConfigsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            SystemConfigsFetcher fetcher = obj.getSystemConfigs();
            return addFetcher(Constants.SYSTEMCONFIGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static TCAsFetcher getTCAsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            TCAsFetcher fetcher = obj.getTCAs();
            return addFetcher(Constants.TCAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UplinkRDsFetcher getUplinkRDsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            UplinkRDsFetcher fetcher = obj.getUplinkRDs();
            return addFetcher(Constants.UPLINKRDS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UsersFetcher getUsersFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            UsersFetcher fetcher = obj.getUsers();
            return addFetcher(Constants.USERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCentersFetcher getVCentersFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VCentersFetcher fetcher = obj.getVCenters();
            return addFetcher(Constants.VCENTERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterHypervisorsFetcher getVCenterHypervisorsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VCenterHypervisorsFetcher fetcher = obj.getVCenterHypervisors();
            return addFetcher(Constants.VCENTERHYPERVISORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VCenterVRSConfigsFetcher getVCenterVRSConfigsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VCenterVRSConfigsFetcher fetcher = obj.getVCenterVRSConfigs();
            return addFetcher(Constants.VCENTERVRSCONFIGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VSPsFetcher getVSPsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            VSPsFetcher fetcher = obj.getVSPs();
            return addFetcher(Constants.VSPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ZFBAutoAssignmentsFetcher getZFBAutoAssignmentsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ZFBAutoAssignmentsFetcher fetcher = obj.getZFBAutoAssignments();
            return addFetcher(Constants.ZFBAUTOASSIGNMENTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ZFBRequestsFetcher getZFBRequestsFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ZFBRequestsFetcher fetcher = obj.getZFBRequests();
            return addFetcher(Constants.ZFBREQUESTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ZonesFetcher getZonesFetcherForMeId(String id) throws RestException {
        Me obj = getObject(Constants.ME, id);
        if (obj == null) {
            obj = getMeById(id);
        }

        if (obj != null) {
            ZonesFetcher fetcher = obj.getZones();
            return addFetcher(Constants.ZONES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Me> getMesForFetcherId(String id) throws RestException {
        MesFetcher fetcher = getMesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ME);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Me>();
    }

    public static MesFetcher getMesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MES_FETCHER, id);
        if (fetcher != null) {
            return (MesFetcher) fetcher;
        }return null;
    }

    public static java.util.List<Me> getAllMes() throws RestException {
        java.util.List<Me> allObjs = new ArrayList<Me>();

        return allObjs;
    }

    public static java.util.List<MesFetcher> getAllMesFetchers() throws RestException {
        java.util.List<MesFetcher> allObjs = new ArrayList<MesFetcher>();
        return allObjs;
    }
    public static EndPoint getEndPointById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EndPoint obj = null;
            obj = new EndPoint();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENDPOINT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForEndPointId(String id) throws RestException {
        EndPoint obj = getObject(Constants.ENDPOINT, id);
        if (obj == null) {
            obj = getEndPointById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEndPointId(String id) throws RestException {
        EndPoint obj = getObject(Constants.ENDPOINT, id);
        if (obj == null) {
            obj = getEndPointById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEndPointId(String id) throws RestException {
        EndPoint obj = getObject(Constants.ENDPOINT, id);
        if (obj == null) {
            obj = getEndPointById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EndPoint> getEndPointsForFetcherId(String id) throws RestException {
        EndPointsFetcher fetcher = getEndPointsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENDPOINT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EndPoint>();
    }

    public static EndPointsFetcher getEndPointsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENDPOINTS_FETCHER, id);
        if (fetcher != null) {
            return (EndPointsFetcher) fetcher;
        }
        if ((fetcher = getEndPointsFetcherForExternalServiceId(id)) != null) {
            return (EndPointsFetcher) addFetcher(Constants.ENDPOINTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EndPoint> getAllEndPoints() throws RestException {
        java.util.List<EndPoint> allObjs = new ArrayList<EndPoint>();

        return allObjs;
    }

    public static java.util.List<EndPointsFetcher> getAllEndPointsFetchers() throws RestException {
        java.util.List<EndPointsFetcher> allObjs = new ArrayList<EndPointsFetcher>();
        return allObjs;
    }
    public static L7applicationsignature getL7applicationsignatureById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            L7applicationsignature obj = null;
            obj = new L7applicationsignature();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.L7APPLICATIONSIGNATURE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ApplicationsFetcher getApplicationsFetcherForL7applicationsignatureId(String id) throws RestException {
        L7applicationsignature obj = getObject(Constants.L7APPLICATIONSIGNATURE, id);
        if (obj == null) {
            obj = getL7applicationsignatureById(id);
        }

        if (obj != null) {
            ApplicationsFetcher fetcher = obj.getApplications();
            return addFetcher(Constants.APPLICATIONS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<L7applicationsignature> getL7applicationsignaturesForFetcherId(String id) throws RestException {
        L7applicationsignaturesFetcher fetcher = getL7applicationsignaturesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.L7APPLICATIONSIGNATURE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<L7applicationsignature>();
    }

    public static L7applicationsignaturesFetcher getL7applicationsignaturesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.L7APPLICATIONSIGNATURES_FETCHER, id);
        if (fetcher != null) {
            return (L7applicationsignaturesFetcher) fetcher;
        }
        if ((fetcher = getL7applicationsignaturesFetcherForEnterpriseId(id)) != null) {
            return (L7applicationsignaturesFetcher) addFetcher(Constants.L7APPLICATIONSIGNATURES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<L7applicationsignature> getAllL7applicationsignatures() throws RestException {
        java.util.List<L7applicationsignature> allObjs = new ArrayList<L7applicationsignature>();

        return allObjs;
    }

    public static java.util.List<L7applicationsignaturesFetcher> getAllL7applicationsignaturesFetchers() throws RestException {
        java.util.List<L7applicationsignaturesFetcher> allObjs = new ArrayList<L7applicationsignaturesFetcher>();
        return allObjs;
    }
    public static DHCPOption getDHCPOptionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DHCPOption obj = null;
            obj = new DHCPOption();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DHCPOPTION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForDHCPOptionId(String id) throws RestException {
        DHCPOption obj = getObject(Constants.DHCPOPTION, id);
        if (obj == null) {
            obj = getDHCPOptionById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDHCPOptionId(String id) throws RestException {
        DHCPOption obj = getObject(Constants.DHCPOPTION, id);
        if (obj == null) {
            obj = getDHCPOptionById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDHCPOptionId(String id) throws RestException {
        DHCPOption obj = getObject(Constants.DHCPOPTION, id);
        if (obj == null) {
            obj = getDHCPOptionById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<DHCPOption> getDHCPOptionsForFetcherId(String id) throws RestException {
        DHCPOptionsFetcher fetcher = getDHCPOptionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DHCPOPTION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DHCPOption>();
    }

    public static DHCPOptionsFetcher getDHCPOptionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DHCPOPTIONS_FETCHER, id);
        if (fetcher != null) {
            return (DHCPOptionsFetcher) fetcher;
        }
        if ((fetcher = getDHCPOptionsFetcherForContainerInterfaceId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForSharedNetworkResourceId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForZoneId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForDomainId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForVPortId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForSubnetId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForVMInterfaceId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForBridgeInterfaceId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForL2DomainId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getDHCPOptionsFetcherForHostInterfaceId(id)) != null) {
            return (DHCPOptionsFetcher) addFetcher(Constants.DHCPOPTIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DHCPOption> getAllDHCPOptions() throws RestException {
        java.util.List<DHCPOption> allObjs = new ArrayList<DHCPOption>();

        return allObjs;
    }

    public static java.util.List<DHCPOptionsFetcher> getAllDHCPOptionsFetchers() throws RestException {
        java.util.List<DHCPOptionsFetcher> allObjs = new ArrayList<DHCPOptionsFetcher>();
        return allObjs;
    }
    public static KeyServerMember getKeyServerMemberById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerMember obj = null;
            obj = new KeyServerMember();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.KEYSERVERMEMBER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForKeyServerMemberId(String id) throws RestException {
        KeyServerMember obj = getObject(Constants.KEYSERVERMEMBER, id);
        if (obj == null) {
            obj = getKeyServerMemberById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForKeyServerMemberId(String id) throws RestException {
        KeyServerMember obj = getObject(Constants.KEYSERVERMEMBER, id);
        if (obj == null) {
            obj = getKeyServerMemberById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<KeyServerMember> getKeyServerMembersForFetcherId(String id) throws RestException {
        KeyServerMembersFetcher fetcher = getKeyServerMembersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.KEYSERVERMEMBER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<KeyServerMember>();
    }

    public static KeyServerMembersFetcher getKeyServerMembersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.KEYSERVERMEMBERS_FETCHER, id);
        if (fetcher != null) {
            return (KeyServerMembersFetcher) fetcher;
        }
        if ((fetcher = getKeyServerMembersFetcherForMeId(id)) != null) {
            return (KeyServerMembersFetcher) addFetcher(Constants.KEYSERVERMEMBERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<KeyServerMember> getAllKeyServerMembers() throws RestException {
        java.util.List<KeyServerMember> allObjs = new ArrayList<KeyServerMember>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerMembersFetcher fetcher = getKeyServerMembersFetcherForMeId(session.getId());
            java.util.List<KeyServerMember> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<KeyServerMembersFetcher> getAllKeyServerMembersFetchers() throws RestException {
        java.util.List<KeyServerMembersFetcher> allObjs = new ArrayList<KeyServerMembersFetcher>();
        return allObjs;
    }
    public static NSGateway getNSGatewayById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSGateway obj = null;
            obj = new NSGateway();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NSGATEWAY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BootstrapsFetcher getBootstrapsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            BootstrapsFetcher fetcher = obj.getBootstraps();
            return addFetcher(Constants.BOOTSTRAPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BootstrapActivationsFetcher getBootstrapActivationsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            BootstrapActivationsFetcher fetcher = obj.getBootstrapActivations();
            return addFetcher(Constants.BOOTSTRAPACTIVATIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GatewaySecuritiesFetcher getGatewaySecuritiesFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            GatewaySecuritiesFetcher fetcher = obj.getGatewaySecurities();
            return addFetcher(Constants.GATEWAYSECURITIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static InfrastructureConfigsFetcher getInfrastructureConfigsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            InfrastructureConfigsFetcher fetcher = obj.getInfrastructureConfigs();
            return addFetcher(Constants.INFRASTRUCTURECONFIGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static LocationsFetcher getLocationsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            LocationsFetcher fetcher = obj.getLocations();
            return addFetcher(Constants.LOCATIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MonitorscopesFetcher getMonitorscopesFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            MonitorscopesFetcher fetcher = obj.getMonitorscopes();
            return addFetcher(Constants.MONITORSCOPES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSGInfosFetcher getNSGInfosFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            NSGInfosFetcher fetcher = obj.getNSGInfos();
            return addFetcher(Constants.NSGINFOS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSPortsFetcher getNSPortsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            NSPortsFetcher fetcher = obj.getNSPorts();
            return addFetcher(Constants.NSPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATNATPoolsFetcher getPATNATPoolsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            PATNATPoolsFetcher fetcher = obj.getPATNATPools();
            return addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetsFetcher getSubnetsFetcherForNSGatewayId(String id) throws RestException {
        NSGateway obj = getObject(Constants.NSGATEWAY, id);
        if (obj == null) {
            obj = getNSGatewayById(id);
        }

        if (obj != null) {
            SubnetsFetcher fetcher = obj.getSubnets();
            return addFetcher(Constants.SUBNETS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NSGateway> getNSGatewaysForFetcherId(String id) throws RestException {
        NSGatewaysFetcher fetcher = getNSGatewaysFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NSGATEWAY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NSGateway>();
    }

    public static NSGatewaysFetcher getNSGatewaysFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NSGATEWAYS_FETCHER, id);
        if (fetcher != null) {
            return (NSGatewaysFetcher) fetcher;
        }
        if ((fetcher = getNSGatewaysFetcherForMeId(id)) != null) {
            return (NSGatewaysFetcher) addFetcher(Constants.NSGATEWAYS_FETCHER, fetcher);
        }
        
        if ((fetcher = getNSGatewaysFetcherForNSRedundantGatewayGroupId(id)) != null) {
            return (NSGatewaysFetcher) addFetcher(Constants.NSGATEWAYS_FETCHER, fetcher);
        }
        
        if ((fetcher = getNSGatewaysFetcherForEnterpriseId(id)) != null) {
            return (NSGatewaysFetcher) addFetcher(Constants.NSGATEWAYS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NSGateway> getAllNSGateways() throws RestException {
        java.util.List<NSGateway> allObjs = new ArrayList<NSGateway>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSGatewaysFetcher fetcher = getNSGatewaysFetcherForMeId(session.getId());
            java.util.List<NSGateway> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<NSGatewaysFetcher> getAllNSGatewaysFetchers() throws RestException {
        java.util.List<NSGatewaysFetcher> allObjs = new ArrayList<NSGatewaysFetcher>();
        return allObjs;
    }
    public static NSGatewayTemplate getNSGatewayTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSGatewayTemplate obj = null;
            obj = new NSGatewayTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NSGATEWAYTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNSGatewayTemplateId(String id) throws RestException {
        NSGatewayTemplate obj = getObject(Constants.NSGATEWAYTEMPLATE, id);
        if (obj == null) {
            obj = getNSGatewayTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNSGatewayTemplateId(String id) throws RestException {
        NSGatewayTemplate obj = getObject(Constants.NSGATEWAYTEMPLATE, id);
        if (obj == null) {
            obj = getNSGatewayTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSPortTemplatesFetcher getNSPortTemplatesFetcherForNSGatewayTemplateId(String id) throws RestException {
        NSGatewayTemplate obj = getObject(Constants.NSGATEWAYTEMPLATE, id);
        if (obj == null) {
            obj = getNSGatewayTemplateById(id);
        }

        if (obj != null) {
            NSPortTemplatesFetcher fetcher = obj.getNSPortTemplates();
            return addFetcher(Constants.NSPORTTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NSGatewayTemplate> getNSGatewayTemplatesForFetcherId(String id) throws RestException {
        NSGatewayTemplatesFetcher fetcher = getNSGatewayTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NSGATEWAYTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NSGatewayTemplate>();
    }

    public static NSGatewayTemplatesFetcher getNSGatewayTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NSGATEWAYTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (NSGatewayTemplatesFetcher) fetcher;
        }
        if ((fetcher = getNSGatewayTemplatesFetcherForMeId(id)) != null) {
            return (NSGatewayTemplatesFetcher) addFetcher(Constants.NSGATEWAYTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getNSGatewayTemplatesFetcherForEnterpriseId(id)) != null) {
            return (NSGatewayTemplatesFetcher) addFetcher(Constants.NSGATEWAYTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NSGatewayTemplate> getAllNSGatewayTemplates() throws RestException {
        java.util.List<NSGatewayTemplate> allObjs = new ArrayList<NSGatewayTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSGatewayTemplatesFetcher fetcher = getNSGatewayTemplatesFetcherForMeId(session.getId());
            java.util.List<NSGatewayTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<NSGatewayTemplatesFetcher> getAllNSGatewayTemplatesFetchers() throws RestException {
        java.util.List<NSGatewayTemplatesFetcher> allObjs = new ArrayList<NSGatewayTemplatesFetcher>();
        return allObjs;
    }
    public static VSC getVSCById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VSC obj = null;
            obj = new VSC();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VSC, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPPeersFetcher getBGPPeersFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            BGPPeersFetcher fetcher = obj.getBGPPeers();
            return addFetcher(Constants.BGPPEERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MonitoringPortsFetcher getMonitoringPortsFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            MonitoringPortsFetcher fetcher = obj.getMonitoringPorts();
            return addFetcher(Constants.MONITORINGPORTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSsFetcher getVRSsFetcherForVSCId(String id) throws RestException {
        VSC obj = getObject(Constants.VSC, id);
        if (obj == null) {
            obj = getVSCById(id);
        }

        if (obj != null) {
            VRSsFetcher fetcher = obj.getVRSs();
            return addFetcher(Constants.VRSS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VSC> getVSCsForFetcherId(String id) throws RestException {
        VSCsFetcher fetcher = getVSCsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VSC);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VSC>();
    }

    public static VSCsFetcher getVSCsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VSCS_FETCHER, id);
        if (fetcher != null) {
            return (VSCsFetcher) fetcher;
        }
        if ((fetcher = getVSCsFetcherForVSPId(id)) != null) {
            return (VSCsFetcher) addFetcher(Constants.VSCS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVSCsFetcherForVRSId(id)) != null) {
            return (VSCsFetcher) addFetcher(Constants.VSCS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VSC> getAllVSCs() throws RestException {
        java.util.List<VSC> allObjs = new ArrayList<VSC>();

        return allObjs;
    }

    public static java.util.List<VSCsFetcher> getAllVSCsFetchers() throws RestException {
        java.util.List<VSCsFetcher> allObjs = new ArrayList<VSCsFetcher>();
        return allObjs;
    }
    public static UplinkRD getUplinkRDById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            UplinkRD obj = null;
            obj = new UplinkRD();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.UPLINKRD, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForUplinkRDId(String id) throws RestException {
        UplinkRD obj = getObject(Constants.UPLINKRD, id);
        if (obj == null) {
            obj = getUplinkRDById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForUplinkRDId(String id) throws RestException {
        UplinkRD obj = getObject(Constants.UPLINKRD, id);
        if (obj == null) {
            obj = getUplinkRDById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<UplinkRD> getUplinkRDsForFetcherId(String id) throws RestException {
        UplinkRDsFetcher fetcher = getUplinkRDsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.UPLINKRD);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<UplinkRD>();
    }

    public static UplinkRDsFetcher getUplinkRDsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.UPLINKRDS_FETCHER, id);
        if (fetcher != null) {
            return (UplinkRDsFetcher) fetcher;
        }
        if ((fetcher = getUplinkRDsFetcherForDomainId(id)) != null) {
            return (UplinkRDsFetcher) addFetcher(Constants.UPLINKRDS_FETCHER, fetcher);
        }
        
        if ((fetcher = getUplinkRDsFetcherForL2DomainId(id)) != null) {
            return (UplinkRDsFetcher) addFetcher(Constants.UPLINKRDS_FETCHER, fetcher);
        }
        
        if ((fetcher = getUplinkRDsFetcherForMeId(id)) != null) {
            return (UplinkRDsFetcher) addFetcher(Constants.UPLINKRDS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<UplinkRD> getAllUplinkRDs() throws RestException {
        java.util.List<UplinkRD> allObjs = new ArrayList<UplinkRD>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            UplinkRDsFetcher fetcher = getUplinkRDsFetcherForMeId(session.getId());
            java.util.List<UplinkRD> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<UplinkRDsFetcher> getAllUplinkRDsFetchers() throws RestException {
        java.util.List<UplinkRDsFetcher> allObjs = new ArrayList<UplinkRDsFetcher>();
        return allObjs;
    }
    public static ZFBAutoAssignment getZFBAutoAssignmentById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ZFBAutoAssignment obj = null;
            obj = new ZFBAutoAssignment();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ZFBAUTOASSIGNMENT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<ZFBAutoAssignment> getZFBAutoAssignmentsForFetcherId(String id) throws RestException {
        ZFBAutoAssignmentsFetcher fetcher = getZFBAutoAssignmentsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ZFBAUTOASSIGNMENT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ZFBAutoAssignment>();
    }

    public static ZFBAutoAssignmentsFetcher getZFBAutoAssignmentsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ZFBAUTOASSIGNMENTS_FETCHER, id);
        if (fetcher != null) {
            return (ZFBAutoAssignmentsFetcher) fetcher;
        }
        if ((fetcher = getZFBAutoAssignmentsFetcherForMeId(id)) != null) {
            return (ZFBAutoAssignmentsFetcher) addFetcher(Constants.ZFBAUTOASSIGNMENTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ZFBAutoAssignment> getAllZFBAutoAssignments() throws RestException {
        java.util.List<ZFBAutoAssignment> allObjs = new ArrayList<ZFBAutoAssignment>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ZFBAutoAssignmentsFetcher fetcher = getZFBAutoAssignmentsFetcherForMeId(session.getId());
            java.util.List<ZFBAutoAssignment> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ZFBAutoAssignmentsFetcher> getAllZFBAutoAssignmentsFetchers() throws RestException {
        java.util.List<ZFBAutoAssignmentsFetcher> allObjs = new ArrayList<ZFBAutoAssignmentsFetcher>();
        return allObjs;
    }
    public static VM getVMById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VM obj = null;
            obj = new VM();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VM, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMResyncsFetcher getVMResyncsFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            VMResyncsFetcher fetcher = obj.getVMResyncs();
            return addFetcher(Constants.VMRESYNCS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMInterfacesFetcher getVMInterfacesFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            VMInterfacesFetcher fetcher = obj.getVMInterfaces();
            return addFetcher(Constants.VMINTERFACES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VRSsFetcher getVRSsFetcherForVMId(String id) throws RestException {
        VM obj = getObject(Constants.VM, id);
        if (obj == null) {
            obj = getVMById(id);
        }

        if (obj != null) {
            VRSsFetcher fetcher = obj.getVRSs();
            return addFetcher(Constants.VRSS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VM> getVMsForFetcherId(String id) throws RestException {
        VMsFetcher fetcher = getVMsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VM);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VM>();
    }

    public static VMsFetcher getVMsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VMS_FETCHER, id);
        if (fetcher != null) {
            return (VMsFetcher) fetcher;
        }
        if ((fetcher = getVMsFetcherForQOSId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForZoneId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForDomainId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForVPortId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForSubnetId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForVRSId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForTierId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForL2DomainId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForMeId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForEgressACLTemplateId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForUserId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForEnterpriseId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMsFetcherForIngressACLTemplateId(id)) != null) {
            return (VMsFetcher) addFetcher(Constants.VMS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VM> getAllVMs() throws RestException {
        java.util.List<VM> allObjs = new ArrayList<VM>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            VMsFetcher fetcher = getVMsFetcherForMeId(session.getId());
            java.util.List<VM> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<VMsFetcher> getAllVMsFetchers() throws RestException {
        java.util.List<VMsFetcher> allObjs = new ArrayList<VMsFetcher>();
        return allObjs;
    }
    public static NSPort getNSPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSPort obj = null;
            obj = new NSPort();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NSPORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VLANsFetcher getVLANsFetcherForNSPortId(String id) throws RestException {
        NSPort obj = getObject(Constants.NSPORT, id);
        if (obj == null) {
            obj = getNSPortById(id);
        }

        if (obj != null) {
            VLANsFetcher fetcher = obj.getVLANs();
            return addFetcher(Constants.VLANS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NSPort> getNSPortsForFetcherId(String id) throws RestException {
        NSPortsFetcher fetcher = getNSPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NSPORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NSPort>();
    }

    public static NSPortsFetcher getNSPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NSPORTS_FETCHER, id);
        if (fetcher != null) {
            return (NSPortsFetcher) fetcher;
        }
        if ((fetcher = getNSPortsFetcherForRedundantPortId(id)) != null) {
            return (NSPortsFetcher) addFetcher(Constants.NSPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getNSPortsFetcherForAutoDiscoveredGatewayId(id)) != null) {
            return (NSPortsFetcher) addFetcher(Constants.NSPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getNSPortsFetcherForNSGatewayId(id)) != null) {
            return (NSPortsFetcher) addFetcher(Constants.NSPORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NSPort> getAllNSPorts() throws RestException {
        java.util.List<NSPort> allObjs = new ArrayList<NSPort>();

        return allObjs;
    }

    public static java.util.List<NSPortsFetcher> getAllNSPortsFetchers() throws RestException {
        java.util.List<NSPortsFetcher> allObjs = new ArrayList<NSPortsFetcher>();
        return allObjs;
    }
    public static VRSAddressRange getVRSAddressRangeById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VRSAddressRange obj = null;
            obj = new VRSAddressRange();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VRSADDRESSRANGE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVRSAddressRangeId(String id) throws RestException {
        VRSAddressRange obj = getObject(Constants.VRSADDRESSRANGE, id);
        if (obj == null) {
            obj = getVRSAddressRangeById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVRSAddressRangeId(String id) throws RestException {
        VRSAddressRange obj = getObject(Constants.VRSADDRESSRANGE, id);
        if (obj == null) {
            obj = getVRSAddressRangeById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VRSAddressRange> getVRSAddressRangesForFetcherId(String id) throws RestException {
        VRSAddressRangesFetcher fetcher = getVRSAddressRangesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VRSADDRESSRANGE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VRSAddressRange>();
    }

    public static VRSAddressRangesFetcher getVRSAddressRangesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VRSADDRESSRANGES_FETCHER, id);
        if (fetcher != null) {
            return (VRSAddressRangesFetcher) fetcher;
        }
        if ((fetcher = getVRSAddressRangesFetcherForVCenterVRSConfigId(id)) != null) {
            return (VRSAddressRangesFetcher) addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSAddressRangesFetcherForVCenterHypervisorId(id)) != null) {
            return (VRSAddressRangesFetcher) addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSAddressRangesFetcherForVCenterClusterId(id)) != null) {
            return (VRSAddressRangesFetcher) addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSAddressRangesFetcherForVCenterDataCenterId(id)) != null) {
            return (VRSAddressRangesFetcher) addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVRSAddressRangesFetcherForVCenterId(id)) != null) {
            return (VRSAddressRangesFetcher) addFetcher(Constants.VRSADDRESSRANGES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VRSAddressRange> getAllVRSAddressRanges() throws RestException {
        java.util.List<VRSAddressRange> allObjs = new ArrayList<VRSAddressRange>();

        return allObjs;
    }

    public static java.util.List<VRSAddressRangesFetcher> getAllVRSAddressRangesFetchers() throws RestException {
        java.util.List<VRSAddressRangesFetcher> allObjs = new ArrayList<VRSAddressRangesFetcher>();
        return allObjs;
    }
    public static BGPProfile getBGPProfileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BGPProfile obj = null;
            obj = new BGPProfile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BGPPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBGPProfileId(String id) throws RestException {
        BGPProfile obj = getObject(Constants.BGPPROFILE, id);
        if (obj == null) {
            obj = getBGPProfileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBGPProfileId(String id) throws RestException {
        BGPProfile obj = getObject(Constants.BGPPROFILE, id);
        if (obj == null) {
            obj = getBGPProfileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<BGPProfile> getBGPProfilesForFetcherId(String id) throws RestException {
        BGPProfilesFetcher fetcher = getBGPProfilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BGPPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BGPProfile>();
    }

    public static BGPProfilesFetcher getBGPProfilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BGPPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (BGPProfilesFetcher) fetcher;
        }
        if ((fetcher = getBGPProfilesFetcherForMeId(id)) != null) {
            return (BGPProfilesFetcher) addFetcher(Constants.BGPPROFILES_FETCHER, fetcher);
        }
        
        if ((fetcher = getBGPProfilesFetcherForEnterpriseId(id)) != null) {
            return (BGPProfilesFetcher) addFetcher(Constants.BGPPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BGPProfile> getAllBGPProfiles() throws RestException {
        java.util.List<BGPProfile> allObjs = new ArrayList<BGPProfile>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            BGPProfilesFetcher fetcher = getBGPProfilesFetcherForMeId(session.getId());
            java.util.List<BGPProfile> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<BGPProfilesFetcher> getAllBGPProfilesFetchers() throws RestException {
        java.util.List<BGPProfilesFetcher> allObjs = new ArrayList<BGPProfilesFetcher>();
        return allObjs;
    }
    public static EgressQOSPolicy getEgressQOSPolicyById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EgressQOSPolicy obj = null;
            obj = new EgressQOSPolicy();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.EGRESSQOSPOLICY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEgressQOSPolicyId(String id) throws RestException {
        EgressQOSPolicy obj = getObject(Constants.EGRESSQOSPOLICY, id);
        if (obj == null) {
            obj = getEgressQOSPolicyById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEgressQOSPolicyId(String id) throws RestException {
        EgressQOSPolicy obj = getObject(Constants.EGRESSQOSPOLICY, id);
        if (obj == null) {
            obj = getEgressQOSPolicyById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EgressQOSPolicy> getEgressQOSPoliciesForFetcherId(String id) throws RestException {
        EgressQOSPoliciesFetcher fetcher = getEgressQOSPoliciesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.EGRESSQOSPOLICY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EgressQOSPolicy>();
    }

    public static EgressQOSPoliciesFetcher getEgressQOSPoliciesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.EGRESSQOSPOLICIES_FETCHER, id);
        if (fetcher != null) {
            return (EgressQOSPoliciesFetcher) fetcher;
        }
        if ((fetcher = getEgressQOSPoliciesFetcherForMeId(id)) != null) {
            return (EgressQOSPoliciesFetcher) addFetcher(Constants.EGRESSQOSPOLICIES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressQOSPoliciesFetcherForEnterpriseId(id)) != null) {
            return (EgressQOSPoliciesFetcher) addFetcher(Constants.EGRESSQOSPOLICIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EgressQOSPolicy> getAllEgressQOSPolicies() throws RestException {
        java.util.List<EgressQOSPolicy> allObjs = new ArrayList<EgressQOSPolicy>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            EgressQOSPoliciesFetcher fetcher = getEgressQOSPoliciesFetcherForMeId(session.getId());
            java.util.List<EgressQOSPolicy> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<EgressQOSPoliciesFetcher> getAllEgressQOSPoliciesFetchers() throws RestException {
        java.util.List<EgressQOSPoliciesFetcher> allObjs = new ArrayList<EgressQOSPoliciesFetcher>();
        return allObjs;
    }
    public static PublicNetworkMacro getPublicNetworkMacroById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PublicNetworkMacro obj = null;
            obj = new PublicNetworkMacro();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PUBLICNETWORKMACRO, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForPublicNetworkMacroId(String id) throws RestException {
        PublicNetworkMacro obj = getObject(Constants.PUBLICNETWORKMACRO, id);
        if (obj == null) {
            obj = getPublicNetworkMacroById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPublicNetworkMacroId(String id) throws RestException {
        PublicNetworkMacro obj = getObject(Constants.PUBLICNETWORKMACRO, id);
        if (obj == null) {
            obj = getPublicNetworkMacroById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPublicNetworkMacroId(String id) throws RestException {
        PublicNetworkMacro obj = getObject(Constants.PUBLICNETWORKMACRO, id);
        if (obj == null) {
            obj = getPublicNetworkMacroById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PublicNetworkMacro> getPublicNetworkMacrosForFetcherId(String id) throws RestException {
        PublicNetworkMacrosFetcher fetcher = getPublicNetworkMacrosFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PUBLICNETWORKMACRO);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PublicNetworkMacro>();
    }

    public static PublicNetworkMacrosFetcher getPublicNetworkMacrosFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PUBLICNETWORKMACROS_FETCHER, id);
        if (fetcher != null) {
            return (PublicNetworkMacrosFetcher) fetcher;
        }
        if ((fetcher = getPublicNetworkMacrosFetcherForEnterpriseId(id)) != null) {
            return (PublicNetworkMacrosFetcher) addFetcher(Constants.PUBLICNETWORKMACROS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PublicNetworkMacro> getAllPublicNetworkMacros() throws RestException {
        java.util.List<PublicNetworkMacro> allObjs = new ArrayList<PublicNetworkMacro>();

        return allObjs;
    }

    public static java.util.List<PublicNetworkMacrosFetcher> getAllPublicNetworkMacrosFetchers() throws RestException {
        java.util.List<PublicNetworkMacrosFetcher> allObjs = new ArrayList<PublicNetworkMacrosFetcher>();
        return allObjs;
    }
    public static DomainFIPAclTemplateEntry getDomainFIPAclTemplateEntryById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DomainFIPAclTemplateEntry obj = null;
            obj = new DomainFIPAclTemplateEntry();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DOMAINFIPACLTEMPLATEENTRY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDomainFIPAclTemplateEntryId(String id) throws RestException {
        DomainFIPAclTemplateEntry obj = getObject(Constants.DOMAINFIPACLTEMPLATEENTRY, id);
        if (obj == null) {
            obj = getDomainFIPAclTemplateEntryById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDomainFIPAclTemplateEntryId(String id) throws RestException {
        DomainFIPAclTemplateEntry obj = getObject(Constants.DOMAINFIPACLTEMPLATEENTRY, id);
        if (obj == null) {
            obj = getDomainFIPAclTemplateEntryById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<DomainFIPAclTemplateEntry> getDomainFIPAclTemplateEntriesForFetcherId(String id) throws RestException {
        DomainFIPAclTemplateEntriesFetcher fetcher = getDomainFIPAclTemplateEntriesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DOMAINFIPACLTEMPLATEENTRY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DomainFIPAclTemplateEntry>();
    }

    public static DomainFIPAclTemplateEntriesFetcher getDomainFIPAclTemplateEntriesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER, id);
        if (fetcher != null) {
            return (DomainFIPAclTemplateEntriesFetcher) fetcher;
        }
        if ((fetcher = getDomainFIPAclTemplateEntriesFetcherForDomainFIPAclTemplateId(id)) != null) {
            return (DomainFIPAclTemplateEntriesFetcher) addFetcher(Constants.DOMAINFIPACLTEMPLATEENTRIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DomainFIPAclTemplateEntry> getAllDomainFIPAclTemplateEntries() throws RestException {
        java.util.List<DomainFIPAclTemplateEntry> allObjs = new ArrayList<DomainFIPAclTemplateEntry>();

        return allObjs;
    }

    public static java.util.List<DomainFIPAclTemplateEntriesFetcher> getAllDomainFIPAclTemplateEntriesFetchers() throws RestException {
        java.util.List<DomainFIPAclTemplateEntriesFetcher> allObjs = new ArrayList<DomainFIPAclTemplateEntriesFetcher>();
        return allObjs;
    }
    public static AutoDiscoverCluster getAutoDiscoverClusterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AutoDiscoverCluster obj = null;
            obj = new AutoDiscoverCluster();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.AUTODISCOVERCLUSTER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<AutoDiscoverCluster> getAutoDiscoverClustersForFetcherId(String id) throws RestException {
        AutoDiscoverClustersFetcher fetcher = getAutoDiscoverClustersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.AUTODISCOVERCLUSTER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AutoDiscoverCluster>();
    }

    public static AutoDiscoverClustersFetcher getAutoDiscoverClustersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.AUTODISCOVERCLUSTERS_FETCHER, id);
        if (fetcher != null) {
            return (AutoDiscoverClustersFetcher) fetcher;
        }
        if ((fetcher = getAutoDiscoverClustersFetcherForVCenterDataCenterId(id)) != null) {
            return (AutoDiscoverClustersFetcher) addFetcher(Constants.AUTODISCOVERCLUSTERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AutoDiscoverCluster> getAllAutoDiscoverClusters() throws RestException {
        java.util.List<AutoDiscoverCluster> allObjs = new ArrayList<AutoDiscoverCluster>();

        return allObjs;
    }

    public static java.util.List<AutoDiscoverClustersFetcher> getAllAutoDiscoverClustersFetchers() throws RestException {
        java.util.List<AutoDiscoverClustersFetcher> allObjs = new ArrayList<AutoDiscoverClustersFetcher>();
        return allObjs;
    }
    public static AddressRange getAddressRangeById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AddressRange obj = null;
            obj = new AddressRange();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ADDRESSRANGE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForAddressRangeId(String id) throws RestException {
        AddressRange obj = getObject(Constants.ADDRESSRANGE, id);
        if (obj == null) {
            obj = getAddressRangeById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForAddressRangeId(String id) throws RestException {
        AddressRange obj = getObject(Constants.ADDRESSRANGE, id);
        if (obj == null) {
            obj = getAddressRangeById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForAddressRangeId(String id) throws RestException {
        AddressRange obj = getObject(Constants.ADDRESSRANGE, id);
        if (obj == null) {
            obj = getAddressRangeById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<AddressRange> getAddressRangesForFetcherId(String id) throws RestException {
        AddressRangesFetcher fetcher = getAddressRangesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ADDRESSRANGE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AddressRange>();
    }

    public static AddressRangesFetcher getAddressRangesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ADDRESSRANGES_FETCHER, id);
        if (fetcher != null) {
            return (AddressRangesFetcher) fetcher;
        }
        if ((fetcher = getAddressRangesFetcherForSharedNetworkResourceId(id)) != null) {
            return (AddressRangesFetcher) addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getAddressRangesFetcherForSubnetTemplateId(id)) != null) {
            return (AddressRangesFetcher) addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getAddressRangesFetcherForSubnetId(id)) != null) {
            return (AddressRangesFetcher) addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getAddressRangesFetcherForL2DomainTemplateId(id)) != null) {
            return (AddressRangesFetcher) addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }
        
        if ((fetcher = getAddressRangesFetcherForL2DomainId(id)) != null) {
            return (AddressRangesFetcher) addFetcher(Constants.ADDRESSRANGES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AddressRange> getAllAddressRanges() throws RestException {
        java.util.List<AddressRange> allObjs = new ArrayList<AddressRange>();

        return allObjs;
    }

    public static java.util.List<AddressRangesFetcher> getAllAddressRangesFetchers() throws RestException {
        java.util.List<AddressRangesFetcher> allObjs = new ArrayList<AddressRangesFetcher>();
        return allObjs;
    }
    public static DomainTemplate getDomainTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DomainTemplate obj = null;
            obj = new DomainTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DOMAINTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DomainsFetcher getDomainsFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            DomainsFetcher fetcher = obj.getDomains();
            return addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLTemplatesFetcher getEgressACLTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            EgressACLTemplatesFetcher fetcher = obj.getEgressACLTemplates();
            return addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainFIPAclTemplatesFetcher getDomainFIPAclTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            DomainFIPAclTemplatesFetcher fetcher = obj.getDomainFIPAclTemplates();
            return addFetcher(Constants.DOMAINFIPACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FloatingIPACLTemplatesFetcher getFloatingIPACLTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            FloatingIPACLTemplatesFetcher fetcher = obj.getFloatingIPACLTemplates();
            return addFetcher(Constants.FLOATINGIPACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLTemplatesFetcher getIngressACLTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            IngressACLTemplatesFetcher fetcher = obj.getIngressACLTemplates();
            return addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            IngressAdvFwdTemplatesFetcher fetcher = obj.getIngressAdvFwdTemplates();
            return addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            IngressExternalServiceTemplatesFetcher fetcher = obj.getIngressExternalServiceTemplates();
            return addFetcher(Constants.INGRESSEXTERNALSERVICETEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PermissionsFetcher getPermissionsFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            PermissionsFetcher fetcher = obj.getPermissions();
            return addFetcher(Constants.PERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PolicyGroupTemplatesFetcher getPolicyGroupTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            PolicyGroupTemplatesFetcher fetcher = obj.getPolicyGroupTemplates();
            return addFetcher(Constants.POLICYGROUPTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedirectionTargetTemplatesFetcher getRedirectionTargetTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            RedirectionTargetTemplatesFetcher fetcher = obj.getRedirectionTargetTemplates();
            return addFetcher(Constants.REDIRECTIONTARGETTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SubnetTemplatesFetcher getSubnetTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            SubnetTemplatesFetcher fetcher = obj.getSubnetTemplates();
            return addFetcher(Constants.SUBNETTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ZoneTemplatesFetcher getZoneTemplatesFetcherForDomainTemplateId(String id) throws RestException {
        DomainTemplate obj = getObject(Constants.DOMAINTEMPLATE, id);
        if (obj == null) {
            obj = getDomainTemplateById(id);
        }

        if (obj != null) {
            ZoneTemplatesFetcher fetcher = obj.getZoneTemplates();
            return addFetcher(Constants.ZONETEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<DomainTemplate> getDomainTemplatesForFetcherId(String id) throws RestException {
        DomainTemplatesFetcher fetcher = getDomainTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DOMAINTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DomainTemplate>();
    }

    public static DomainTemplatesFetcher getDomainTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DOMAINTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (DomainTemplatesFetcher) fetcher;
        }
        if ((fetcher = getDomainTemplatesFetcherForDomainId(id)) != null) {
            return (DomainTemplatesFetcher) addFetcher(Constants.DOMAINTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getDomainTemplatesFetcherForEnterpriseId(id)) != null) {
            return (DomainTemplatesFetcher) addFetcher(Constants.DOMAINTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DomainTemplate> getAllDomainTemplates() throws RestException {
        java.util.List<DomainTemplate> allObjs = new ArrayList<DomainTemplate>();

        return allObjs;
    }

    public static java.util.List<DomainTemplatesFetcher> getAllDomainTemplatesFetchers() throws RestException {
        java.util.List<DomainTemplatesFetcher> allObjs = new ArrayList<DomainTemplatesFetcher>();
        return allObjs;
    }
    public static SiteInfo getSiteInfoById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            SiteInfo obj = null;
            obj = new SiteInfo();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.SITEINFO, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForSiteInfoId(String id) throws RestException {
        SiteInfo obj = getObject(Constants.SITEINFO, id);
        if (obj == null) {
            obj = getSiteInfoById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForSiteInfoId(String id) throws RestException {
        SiteInfo obj = getObject(Constants.SITEINFO, id);
        if (obj == null) {
            obj = getSiteInfoById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<SiteInfo> getSiteInfosForFetcherId(String id) throws RestException {
        SiteInfosFetcher fetcher = getSiteInfosFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.SITEINFO);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<SiteInfo>();
    }

    public static SiteInfosFetcher getSiteInfosFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.SITEINFOS_FETCHER, id);
        if (fetcher != null) {
            return (SiteInfosFetcher) fetcher;
        }
        if ((fetcher = getSiteInfosFetcherForMeId(id)) != null) {
            return (SiteInfosFetcher) addFetcher(Constants.SITEINFOS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<SiteInfo> getAllSiteInfos() throws RestException {
        java.util.List<SiteInfo> allObjs = new ArrayList<SiteInfo>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            SiteInfosFetcher fetcher = getSiteInfosFetcherForMeId(session.getId());
            java.util.List<SiteInfo> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<SiteInfosFetcher> getAllSiteInfosFetchers() throws RestException {
        java.util.List<SiteInfosFetcher> allObjs = new ArrayList<SiteInfosFetcher>();
        return allObjs;
    }
    public static VMResync getVMResyncById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VMResync obj = null;
            obj = new VMResync();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VMRESYNC, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVMResyncId(String id) throws RestException {
        VMResync obj = getObject(Constants.VMRESYNC, id);
        if (obj == null) {
            obj = getVMResyncById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVMResyncId(String id) throws RestException {
        VMResync obj = getObject(Constants.VMRESYNC, id);
        if (obj == null) {
            obj = getVMResyncById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VMResync> getVMResyncsForFetcherId(String id) throws RestException {
        VMResyncsFetcher fetcher = getVMResyncsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VMRESYNC);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VMResync>();
    }

    public static VMResyncsFetcher getVMResyncsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VMRESYNCS_FETCHER, id);
        if (fetcher != null) {
            return (VMResyncsFetcher) fetcher;
        }
        if ((fetcher = getVMResyncsFetcherForSubnetId(id)) != null) {
            return (VMResyncsFetcher) addFetcher(Constants.VMRESYNCS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVMResyncsFetcherForVMId(id)) != null) {
            return (VMResyncsFetcher) addFetcher(Constants.VMRESYNCS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VMResync> getAllVMResyncs() throws RestException {
        java.util.List<VMResync> allObjs = new ArrayList<VMResync>();

        return allObjs;
    }

    public static java.util.List<VMResyncsFetcher> getAllVMResyncsFetchers() throws RestException {
        java.util.List<VMResyncsFetcher> allObjs = new ArrayList<VMResyncsFetcher>();
        return allObjs;
    }
    public static UplinkConnection getUplinkConnectionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            UplinkConnection obj = null;
            obj = new UplinkConnection();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.UPLINKCONNECTION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<UplinkConnection> getUplinkConnectionsForFetcherId(String id) throws RestException {
        UplinkConnectionsFetcher fetcher = getUplinkConnectionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.UPLINKCONNECTION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<UplinkConnection>();
    }

    public static UplinkConnectionsFetcher getUplinkConnectionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.UPLINKCONNECTIONS_FETCHER, id);
        if (fetcher != null) {
            return (UplinkConnectionsFetcher) fetcher;
        }
        if ((fetcher = getUplinkConnectionsFetcherForVLANId(id)) != null) {
            return (UplinkConnectionsFetcher) addFetcher(Constants.UPLINKCONNECTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getUplinkConnectionsFetcherForVLANTemplateId(id)) != null) {
            return (UplinkConnectionsFetcher) addFetcher(Constants.UPLINKCONNECTIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<UplinkConnection> getAllUplinkConnections() throws RestException {
        java.util.List<UplinkConnection> allObjs = new ArrayList<UplinkConnection>();

        return allObjs;
    }

    public static java.util.List<UplinkConnectionsFetcher> getAllUplinkConnectionsFetchers() throws RestException {
        java.util.List<UplinkConnectionsFetcher> allObjs = new ArrayList<UplinkConnectionsFetcher>();
        return allObjs;
    }
    public static PolicyDecision getPolicyDecisionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PolicyDecision obj = null;
            obj = new PolicyDecision();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.POLICYDECISION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPolicyDecisionId(String id) throws RestException {
        PolicyDecision obj = getObject(Constants.POLICYDECISION, id);
        if (obj == null) {
            obj = getPolicyDecisionById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPolicyDecisionId(String id) throws RestException {
        PolicyDecision obj = getObject(Constants.POLICYDECISION, id);
        if (obj == null) {
            obj = getPolicyDecisionById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static QOSsFetcher getQOSsFetcherForPolicyDecisionId(String id) throws RestException {
        PolicyDecision obj = getObject(Constants.POLICYDECISION, id);
        if (obj == null) {
            obj = getPolicyDecisionById(id);
        }

        if (obj != null) {
            QOSsFetcher fetcher = obj.getQOSs();
            return addFetcher(Constants.QOSS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PolicyDecision> getPolicyDecisionsForFetcherId(String id) throws RestException {
        PolicyDecisionsFetcher fetcher = getPolicyDecisionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.POLICYDECISION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PolicyDecision>();
    }

    public static PolicyDecisionsFetcher getPolicyDecisionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.POLICYDECISIONS_FETCHER, id);
        if (fetcher != null) {
            return (PolicyDecisionsFetcher) fetcher;
        }
        if ((fetcher = getPolicyDecisionsFetcherForContainerInterfaceId(id)) != null) {
            return (PolicyDecisionsFetcher) addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyDecisionsFetcherForVMInterfaceId(id)) != null) {
            return (PolicyDecisionsFetcher) addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyDecisionsFetcherForBridgeInterfaceId(id)) != null) {
            return (PolicyDecisionsFetcher) addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyDecisionsFetcherForHostInterfaceId(id)) != null) {
            return (PolicyDecisionsFetcher) addFetcher(Constants.POLICYDECISIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PolicyDecision> getAllPolicyDecisions() throws RestException {
        java.util.List<PolicyDecision> allObjs = new ArrayList<PolicyDecision>();

        return allObjs;
    }

    public static java.util.List<PolicyDecisionsFetcher> getAllPolicyDecisionsFetchers() throws RestException {
        java.util.List<PolicyDecisionsFetcher> allObjs = new ArrayList<PolicyDecisionsFetcher>();
        return allObjs;
    }
    public static Applicationperformancemanagementbinding getApplicationperformancemanagementbindingById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Applicationperformancemanagementbinding obj = null;
            obj = new Applicationperformancemanagementbinding();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<Applicationperformancemanagementbinding> getApplicationperformancemanagementbindingsForFetcherId(String id) throws RestException {
        ApplicationperformancemanagementbindingsFetcher fetcher = getApplicationperformancemanagementbindingsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDING);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Applicationperformancemanagementbinding>();
    }

    public static ApplicationperformancemanagementbindingsFetcher getApplicationperformancemanagementbindingsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, id);
        if (fetcher != null) {
            return (ApplicationperformancemanagementbindingsFetcher) fetcher;
        }
        if ((fetcher = getApplicationperformancemanagementbindingsFetcherForDomainId(id)) != null) {
            return (ApplicationperformancemanagementbindingsFetcher) addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, fetcher);
        }
        
        if ((fetcher = getApplicationperformancemanagementbindingsFetcherForL2DomainId(id)) != null) {
            return (ApplicationperformancemanagementbindingsFetcher) addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTBINDINGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Applicationperformancemanagementbinding> getAllApplicationperformancemanagementbindings() throws RestException {
        java.util.List<Applicationperformancemanagementbinding> allObjs = new ArrayList<Applicationperformancemanagementbinding>();

        return allObjs;
    }

    public static java.util.List<ApplicationperformancemanagementbindingsFetcher> getAllApplicationperformancemanagementbindingsFetchers() throws RestException {
        java.util.List<ApplicationperformancemanagementbindingsFetcher> allObjs = new ArrayList<ApplicationperformancemanagementbindingsFetcher>();
        return allObjs;
    }
    public static Autodiscovereddatacenter getAutodiscovereddatacenterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Autodiscovereddatacenter obj = null;
            obj = new Autodiscovereddatacenter();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.AUTODISCOVEREDDATACENTER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<Autodiscovereddatacenter> getAutodiscovereddatacentersForFetcherId(String id) throws RestException {
        AutodiscovereddatacentersFetcher fetcher = getAutodiscovereddatacentersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.AUTODISCOVEREDDATACENTER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Autodiscovereddatacenter>();
    }

    public static AutodiscovereddatacentersFetcher getAutodiscovereddatacentersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.AUTODISCOVEREDDATACENTERS_FETCHER, id);
        if (fetcher != null) {
            return (AutodiscovereddatacentersFetcher) fetcher;
        }
        if ((fetcher = getAutodiscovereddatacentersFetcherForVCenterId(id)) != null) {
            return (AutodiscovereddatacentersFetcher) addFetcher(Constants.AUTODISCOVEREDDATACENTERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Autodiscovereddatacenter> getAllAutodiscovereddatacenters() throws RestException {
        java.util.List<Autodiscovereddatacenter> allObjs = new ArrayList<Autodiscovereddatacenter>();

        return allObjs;
    }

    public static java.util.List<AutodiscovereddatacentersFetcher> getAllAutodiscovereddatacentersFetchers() throws RestException {
        java.util.List<AutodiscovereddatacentersFetcher> allObjs = new ArrayList<AutodiscovereddatacentersFetcher>();
        return allObjs;
    }
    public static FloatingIp getFloatingIpById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            FloatingIp obj = null;
            obj = new FloatingIp();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.FLOATINGIP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForFloatingIpId(String id) throws RestException {
        FloatingIp obj = getObject(Constants.FLOATINGIP, id);
        if (obj == null) {
            obj = getFloatingIpById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForFloatingIpId(String id) throws RestException {
        FloatingIp obj = getObject(Constants.FLOATINGIP, id);
        if (obj == null) {
            obj = getFloatingIpById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForFloatingIpId(String id) throws RestException {
        FloatingIp obj = getObject(Constants.FLOATINGIP, id);
        if (obj == null) {
            obj = getFloatingIpById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForFloatingIpId(String id) throws RestException {
        FloatingIp obj = getObject(Constants.FLOATINGIP, id);
        if (obj == null) {
            obj = getFloatingIpById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<FloatingIp> getFloatingIpsForFetcherId(String id) throws RestException {
        FloatingIpsFetcher fetcher = getFloatingIpsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.FLOATINGIP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<FloatingIp>();
    }

    public static FloatingIpsFetcher getFloatingIpsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.FLOATINGIPS_FETCHER, id);
        if (fetcher != null) {
            return (FloatingIpsFetcher) fetcher;
        }
        if ((fetcher = getFloatingIpsFetcherForDomainId(id)) != null) {
            return (FloatingIpsFetcher) addFetcher(Constants.FLOATINGIPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getFloatingIpsFetcherForMeId(id)) != null) {
            return (FloatingIpsFetcher) addFetcher(Constants.FLOATINGIPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<FloatingIp> getAllFloatingIps() throws RestException {
        java.util.List<FloatingIp> allObjs = new ArrayList<FloatingIp>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            FloatingIpsFetcher fetcher = getFloatingIpsFetcherForMeId(session.getId());
            java.util.List<FloatingIp> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<FloatingIpsFetcher> getAllFloatingIpsFetchers() throws RestException {
        java.util.List<FloatingIpsFetcher> allObjs = new ArrayList<FloatingIpsFetcher>();
        return allObjs;
    }
    public static EgressACLTemplate getEgressACLTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            EgressACLTemplate obj = null;
            obj = new EgressACLTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.EGRESSACLTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ContainersFetcher getContainersFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressACLEntryTemplatesFetcher getEgressACLEntryTemplatesFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            EgressACLEntryTemplatesFetcher fetcher = obj.getEgressACLEntryTemplates();
            return addFetcher(Constants.EGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForEgressACLTemplateId(String id) throws RestException {
        EgressACLTemplate obj = getObject(Constants.EGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getEgressACLTemplateById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<EgressACLTemplate> getEgressACLTemplatesForFetcherId(String id) throws RestException {
        EgressACLTemplatesFetcher fetcher = getEgressACLTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.EGRESSACLTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<EgressACLTemplate>();
    }

    public static EgressACLTemplatesFetcher getEgressACLTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (EgressACLTemplatesFetcher) fetcher;
        }
        if ((fetcher = getEgressACLTemplatesFetcherForDomainId(id)) != null) {
            return (EgressACLTemplatesFetcher) addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLTemplatesFetcherForL2DomainTemplateId(id)) != null) {
            return (EgressACLTemplatesFetcher) addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLTemplatesFetcherForL2DomainId(id)) != null) {
            return (EgressACLTemplatesFetcher) addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLTemplatesFetcherForMeId(id)) != null) {
            return (EgressACLTemplatesFetcher) addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEgressACLTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (EgressACLTemplatesFetcher) addFetcher(Constants.EGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<EgressACLTemplate> getAllEgressACLTemplates() throws RestException {
        java.util.List<EgressACLTemplate> allObjs = new ArrayList<EgressACLTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            EgressACLTemplatesFetcher fetcher = getEgressACLTemplatesFetcherForMeId(session.getId());
            java.util.List<EgressACLTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<EgressACLTemplatesFetcher> getAllEgressACLTemplatesFetchers() throws RestException {
        java.util.List<EgressACLTemplatesFetcher> allObjs = new ArrayList<EgressACLTemplatesFetcher>();
        return allObjs;
    }
    public static MonitoringPort getMonitoringPortById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            MonitoringPort obj = null;
            obj = new MonitoringPort();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MONITORINGPORT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForMonitoringPortId(String id) throws RestException {
        MonitoringPort obj = getObject(Constants.MONITORINGPORT, id);
        if (obj == null) {
            obj = getMonitoringPortById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForMonitoringPortId(String id) throws RestException {
        MonitoringPort obj = getObject(Constants.MONITORINGPORT, id);
        if (obj == null) {
            obj = getMonitoringPortById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<MonitoringPort> getMonitoringPortsForFetcherId(String id) throws RestException {
        MonitoringPortsFetcher fetcher = getMonitoringPortsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MONITORINGPORT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<MonitoringPort>();
    }

    public static MonitoringPortsFetcher getMonitoringPortsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MONITORINGPORTS_FETCHER, id);
        if (fetcher != null) {
            return (MonitoringPortsFetcher) fetcher;
        }
        if ((fetcher = getMonitoringPortsFetcherForVRSId(id)) != null) {
            return (MonitoringPortsFetcher) addFetcher(Constants.MONITORINGPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMonitoringPortsFetcherForHSCId(id)) != null) {
            return (MonitoringPortsFetcher) addFetcher(Constants.MONITORINGPORTS_FETCHER, fetcher);
        }
        
        if ((fetcher = getMonitoringPortsFetcherForVSCId(id)) != null) {
            return (MonitoringPortsFetcher) addFetcher(Constants.MONITORINGPORTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<MonitoringPort> getAllMonitoringPorts() throws RestException {
        java.util.List<MonitoringPort> allObjs = new ArrayList<MonitoringPort>();

        return allObjs;
    }

    public static java.util.List<MonitoringPortsFetcher> getAllMonitoringPortsFetchers() throws RestException {
        java.util.List<MonitoringPortsFetcher> allObjs = new ArrayList<MonitoringPortsFetcher>();
        return allObjs;
    }
    public static Monitorscope getMonitorscopeById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Monitorscope obj = null;
            obj = new Monitorscope();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.MONITORSCOPE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<Monitorscope> getMonitorscopesForFetcherId(String id) throws RestException {
        MonitorscopesFetcher fetcher = getMonitorscopesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.MONITORSCOPE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Monitorscope>();
    }

    public static MonitorscopesFetcher getMonitorscopesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.MONITORSCOPES_FETCHER, id);
        if (fetcher != null) {
            return (MonitorscopesFetcher) fetcher;
        }
        if ((fetcher = getMonitorscopesFetcherForApplicationId(id)) != null) {
            return (MonitorscopesFetcher) addFetcher(Constants.MONITORSCOPES_FETCHER, fetcher);
        }
        
        if ((fetcher = getMonitorscopesFetcherForNSGatewayId(id)) != null) {
            return (MonitorscopesFetcher) addFetcher(Constants.MONITORSCOPES_FETCHER, fetcher);
        }
        
        if ((fetcher = getMonitorscopesFetcherForNetworkPerformanceMeasurementId(id)) != null) {
            return (MonitorscopesFetcher) addFetcher(Constants.MONITORSCOPES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Monitorscope> getAllMonitorscopes() throws RestException {
        java.util.List<Monitorscope> allObjs = new ArrayList<Monitorscope>();

        return allObjs;
    }

    public static java.util.List<MonitorscopesFetcher> getAllMonitorscopesFetchers() throws RestException {
        java.util.List<MonitorscopesFetcher> allObjs = new ArrayList<MonitorscopesFetcher>();
        return allObjs;
    }
    public static AutoDiscoverHypervisorFromCluster getAutoDiscoverHypervisorFromClusterById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AutoDiscoverHypervisorFromCluster obj = null;
            obj = new AutoDiscoverHypervisorFromCluster();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.AUTODISCOVERHYPERVISORFROMCLUSTER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<AutoDiscoverHypervisorFromCluster> getAutoDiscoverHypervisorFromClustersForFetcherId(String id) throws RestException {
        AutoDiscoverHypervisorFromClustersFetcher fetcher = getAutoDiscoverHypervisorFromClustersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.AUTODISCOVERHYPERVISORFROMCLUSTER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AutoDiscoverHypervisorFromCluster>();
    }

    public static AutoDiscoverHypervisorFromClustersFetcher getAutoDiscoverHypervisorFromClustersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER, id);
        if (fetcher != null) {
            return (AutoDiscoverHypervisorFromClustersFetcher) fetcher;
        }
        if ((fetcher = getAutoDiscoverHypervisorFromClustersFetcherForVCenterClusterId(id)) != null) {
            return (AutoDiscoverHypervisorFromClustersFetcher) addFetcher(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAutoDiscoverHypervisorFromClustersFetcherForVCenterDataCenterId(id)) != null) {
            return (AutoDiscoverHypervisorFromClustersFetcher) addFetcher(Constants.AUTODISCOVERHYPERVISORFROMCLUSTERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AutoDiscoverHypervisorFromCluster> getAllAutoDiscoverHypervisorFromClusters() throws RestException {
        java.util.List<AutoDiscoverHypervisorFromCluster> allObjs = new ArrayList<AutoDiscoverHypervisorFromCluster>();

        return allObjs;
    }

    public static java.util.List<AutoDiscoverHypervisorFromClustersFetcher> getAllAutoDiscoverHypervisorFromClustersFetchers() throws RestException {
        java.util.List<AutoDiscoverHypervisorFromClustersFetcher> allObjs = new ArrayList<AutoDiscoverHypervisorFromClustersFetcher>();
        return allObjs;
    }
    public static VPNConnection getVPNConnectionById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VPNConnection obj = null;
            obj = new VPNConnection();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VPNCONNECTION, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVPNConnectionId(String id) throws RestException {
        VPNConnection obj = getObject(Constants.VPNCONNECTION, id);
        if (obj == null) {
            obj = getVPNConnectionById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVPNConnectionId(String id) throws RestException {
        VPNConnection obj = getObject(Constants.VPNCONNECTION, id);
        if (obj == null) {
            obj = getVPNConnectionById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VPNConnection> getVPNConnectionsForFetcherId(String id) throws RestException {
        VPNConnectionsFetcher fetcher = getVPNConnectionsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VPNCONNECTION);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VPNConnection>();
    }

    public static VPNConnectionsFetcher getVPNConnectionsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VPNCONNECTIONS_FETCHER, id);
        if (fetcher != null) {
            return (VPNConnectionsFetcher) fetcher;
        }
        if ((fetcher = getVPNConnectionsFetcherForSharedNetworkResourceId(id)) != null) {
            return (VPNConnectionsFetcher) addFetcher(Constants.VPNCONNECTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPNConnectionsFetcherForDomainId(id)) != null) {
            return (VPNConnectionsFetcher) addFetcher(Constants.VPNCONNECTIONS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPNConnectionsFetcherForL2DomainId(id)) != null) {
            return (VPNConnectionsFetcher) addFetcher(Constants.VPNCONNECTIONS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VPNConnection> getAllVPNConnections() throws RestException {
        java.util.List<VPNConnection> allObjs = new ArrayList<VPNConnection>();

        return allObjs;
    }

    public static java.util.List<VPNConnectionsFetcher> getAllVPNConnectionsFetchers() throws RestException {
        java.util.List<VPNConnectionsFetcher> allObjs = new ArrayList<VPNConnectionsFetcher>();
        return allObjs;
    }
    public static NSRedundantGatewayGroup getNSRedundantGatewayGroupById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSRedundantGatewayGroup obj = null;
            obj = new NSRedundantGatewayGroup();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NSREDUNDANTGATEWAYGROUP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForNSRedundantGatewayGroupId(String id) throws RestException {
        NSRedundantGatewayGroup obj = getObject(Constants.NSREDUNDANTGATEWAYGROUP, id);
        if (obj == null) {
            obj = getNSRedundantGatewayGroupById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForNSRedundantGatewayGroupId(String id) throws RestException {
        NSRedundantGatewayGroup obj = getObject(Constants.NSREDUNDANTGATEWAYGROUP, id);
        if (obj == null) {
            obj = getNSRedundantGatewayGroupById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNSRedundantGatewayGroupId(String id) throws RestException {
        NSRedundantGatewayGroup obj = getObject(Constants.NSREDUNDANTGATEWAYGROUP, id);
        if (obj == null) {
            obj = getNSRedundantGatewayGroupById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNSRedundantGatewayGroupId(String id) throws RestException {
        NSRedundantGatewayGroup obj = getObject(Constants.NSREDUNDANTGATEWAYGROUP, id);
        if (obj == null) {
            obj = getNSRedundantGatewayGroupById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSGatewaysFetcher getNSGatewaysFetcherForNSRedundantGatewayGroupId(String id) throws RestException {
        NSRedundantGatewayGroup obj = getObject(Constants.NSREDUNDANTGATEWAYGROUP, id);
        if (obj == null) {
            obj = getNSRedundantGatewayGroupById(id);
        }

        if (obj != null) {
            NSGatewaysFetcher fetcher = obj.getNSGateways();
            return addFetcher(Constants.NSGATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedundantPortsFetcher getRedundantPortsFetcherForNSRedundantGatewayGroupId(String id) throws RestException {
        NSRedundantGatewayGroup obj = getObject(Constants.NSREDUNDANTGATEWAYGROUP, id);
        if (obj == null) {
            obj = getNSRedundantGatewayGroupById(id);
        }

        if (obj != null) {
            RedundantPortsFetcher fetcher = obj.getRedundantPorts();
            return addFetcher(Constants.REDUNDANTPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NSRedundantGatewayGroup> getNSRedundantGatewayGroupsForFetcherId(String id) throws RestException {
        NSRedundantGatewayGroupsFetcher fetcher = getNSRedundantGatewayGroupsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NSREDUNDANTGATEWAYGROUP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NSRedundantGatewayGroup>();
    }

    public static NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroupsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, id);
        if (fetcher != null) {
            return (NSRedundantGatewayGroupsFetcher) fetcher;
        }
        if ((fetcher = getNSRedundantGatewayGroupsFetcherForMeId(id)) != null) {
            return (NSRedundantGatewayGroupsFetcher) addFetcher(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getNSRedundantGatewayGroupsFetcherForEnterpriseId(id)) != null) {
            return (NSRedundantGatewayGroupsFetcher) addFetcher(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NSRedundantGatewayGroup> getAllNSRedundantGatewayGroups() throws RestException {
        java.util.List<NSRedundantGatewayGroup> allObjs = new ArrayList<NSRedundantGatewayGroup>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSRedundantGatewayGroupsFetcher fetcher = getNSRedundantGatewayGroupsFetcherForMeId(session.getId());
            java.util.List<NSRedundantGatewayGroup> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<NSRedundantGatewayGroupsFetcher> getAllNSRedundantGatewayGroupsFetchers() throws RestException {
        java.util.List<NSRedundantGatewayGroupsFetcher> allObjs = new ArrayList<NSRedundantGatewayGroupsFetcher>();
        return allObjs;
    }
    public static ExternalService getExternalServiceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ExternalService obj = null;
            obj = new ExternalService();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.EXTERNALSERVICE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EndPointsFetcher getEndPointsFetcherForExternalServiceId(String id) throws RestException {
        ExternalService obj = getObject(Constants.EXTERNALSERVICE, id);
        if (obj == null) {
            obj = getExternalServiceById(id);
        }

        if (obj != null) {
            EndPointsFetcher fetcher = obj.getEndPoints();
            return addFetcher(Constants.ENDPOINTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForExternalServiceId(String id) throws RestException {
        ExternalService obj = getObject(Constants.EXTERNALSERVICE, id);
        if (obj == null) {
            obj = getExternalServiceById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForExternalServiceId(String id) throws RestException {
        ExternalService obj = getObject(Constants.EXTERNALSERVICE, id);
        if (obj == null) {
            obj = getExternalServiceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForExternalServiceId(String id) throws RestException {
        ExternalService obj = getObject(Constants.EXTERNALSERVICE, id);
        if (obj == null) {
            obj = getExternalServiceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadataTagsFetcher getMetadataTagsFetcherForExternalServiceId(String id) throws RestException {
        ExternalService obj = getObject(Constants.EXTERNALSERVICE, id);
        if (obj == null) {
            obj = getExternalServiceById(id);
        }

        if (obj != null) {
            MetadataTagsFetcher fetcher = obj.getMetadataTags();
            return addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ExternalService> getExternalServicesForFetcherId(String id) throws RestException {
        ExternalServicesFetcher fetcher = getExternalServicesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.EXTERNALSERVICE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ExternalService>();
    }

    public static ExternalServicesFetcher getExternalServicesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.EXTERNALSERVICES_FETCHER, id);
        if (fetcher != null) {
            return (ExternalServicesFetcher) fetcher;
        }
        if ((fetcher = getExternalServicesFetcherForEnterpriseProfileId(id)) != null) {
            return (ExternalServicesFetcher) addFetcher(Constants.EXTERNALSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getExternalServicesFetcherForMeId(id)) != null) {
            return (ExternalServicesFetcher) addFetcher(Constants.EXTERNALSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getExternalServicesFetcherForEnterpriseId(id)) != null) {
            return (ExternalServicesFetcher) addFetcher(Constants.EXTERNALSERVICES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ExternalService> getAllExternalServices() throws RestException {
        java.util.List<ExternalService> allObjs = new ArrayList<ExternalService>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ExternalServicesFetcher fetcher = getExternalServicesFetcherForMeId(session.getId());
            java.util.List<ExternalService> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ExternalServicesFetcher> getAllExternalServicesFetchers() throws RestException {
        java.util.List<ExternalServicesFetcher> allObjs = new ArrayList<ExternalServicesFetcher>();
        return allObjs;
    }
    public static KeyServerMonitorSEK getKeyServerMonitorSEKById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            KeyServerMonitorSEK obj = null;
            obj = new KeyServerMonitorSEK();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.KEYSERVERMONITORSEK, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForKeyServerMonitorSEKId(String id) throws RestException {
        KeyServerMonitorSEK obj = getObject(Constants.KEYSERVERMONITORSEK, id);
        if (obj == null) {
            obj = getKeyServerMonitorSEKById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForKeyServerMonitorSEKId(String id) throws RestException {
        KeyServerMonitorSEK obj = getObject(Constants.KEYSERVERMONITORSEK, id);
        if (obj == null) {
            obj = getKeyServerMonitorSEKById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<KeyServerMonitorSEK> getKeyServerMonitorSEKsForFetcherId(String id) throws RestException {
        KeyServerMonitorSEKsFetcher fetcher = getKeyServerMonitorSEKsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.KEYSERVERMONITORSEK);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<KeyServerMonitorSEK>();
    }

    public static KeyServerMonitorSEKsFetcher getKeyServerMonitorSEKsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.KEYSERVERMONITORSEKS_FETCHER, id);
        if (fetcher != null) {
            return (KeyServerMonitorSEKsFetcher) fetcher;
        }
        if ((fetcher = getKeyServerMonitorSEKsFetcherForKeyServerMonitorId(id)) != null) {
            return (KeyServerMonitorSEKsFetcher) addFetcher(Constants.KEYSERVERMONITORSEKS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<KeyServerMonitorSEK> getAllKeyServerMonitorSEKs() throws RestException {
        java.util.List<KeyServerMonitorSEK> allObjs = new ArrayList<KeyServerMonitorSEK>();

        return allObjs;
    }

    public static java.util.List<KeyServerMonitorSEKsFetcher> getAllKeyServerMonitorSEKsFetchers() throws RestException {
        java.util.List<KeyServerMonitorSEKsFetcher> allObjs = new ArrayList<KeyServerMonitorSEKsFetcher>();
        return allObjs;
    }
    public static IngressAdvFwdTemplate getIngressAdvFwdTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressAdvFwdTemplate obj = null;
            obj = new IngressAdvFwdTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INGRESSADVFWDTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIngressAdvFwdTemplateId(String id) throws RestException {
        IngressAdvFwdTemplate obj = getObject(Constants.INGRESSADVFWDTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplatesFetcherForIngressAdvFwdTemplateId(String id) throws RestException {
        IngressAdvFwdTemplate obj = getObject(Constants.INGRESSADVFWDTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdTemplateById(id);
        }

        if (obj != null) {
            IngressAdvFwdEntryTemplatesFetcher fetcher = obj.getIngressAdvFwdEntryTemplates();
            return addFetcher(Constants.INGRESSADVFWDENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForIngressAdvFwdTemplateId(String id) throws RestException {
        IngressAdvFwdTemplate obj = getObject(Constants.INGRESSADVFWDTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIngressAdvFwdTemplateId(String id) throws RestException {
        IngressAdvFwdTemplate obj = getObject(Constants.INGRESSADVFWDTEMPLATE, id);
        if (obj == null) {
            obj = getIngressAdvFwdTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IngressAdvFwdTemplate> getIngressAdvFwdTemplatesForFetcherId(String id) throws RestException {
        IngressAdvFwdTemplatesFetcher fetcher = getIngressAdvFwdTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INGRESSADVFWDTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IngressAdvFwdTemplate>();
    }

    public static IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (IngressAdvFwdTemplatesFetcher) fetcher;
        }
        if ((fetcher = getIngressAdvFwdTemplatesFetcherForDomainId(id)) != null) {
            return (IngressAdvFwdTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressAdvFwdTemplatesFetcherForL2DomainTemplateId(id)) != null) {
            return (IngressAdvFwdTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressAdvFwdTemplatesFetcherForL2DomainId(id)) != null) {
            return (IngressAdvFwdTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressAdvFwdTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (IngressAdvFwdTemplatesFetcher) addFetcher(Constants.INGRESSADVFWDTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IngressAdvFwdTemplate> getAllIngressAdvFwdTemplates() throws RestException {
        java.util.List<IngressAdvFwdTemplate> allObjs = new ArrayList<IngressAdvFwdTemplate>();

        return allObjs;
    }

    public static java.util.List<IngressAdvFwdTemplatesFetcher> getAllIngressAdvFwdTemplatesFetchers() throws RestException {
        java.util.List<IngressAdvFwdTemplatesFetcher> allObjs = new ArrayList<IngressAdvFwdTemplatesFetcher>();
        return allObjs;
    }
    public static VPortMirror getVPortMirrorById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VPortMirror obj = null;
            obj = new VPortMirror();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VPORTMIRROR, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVPortMirrorId(String id) throws RestException {
        VPortMirror obj = getObject(Constants.VPORTMIRROR, id);
        if (obj == null) {
            obj = getVPortMirrorById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVPortMirrorId(String id) throws RestException {
        VPortMirror obj = getObject(Constants.VPORTMIRROR, id);
        if (obj == null) {
            obj = getVPortMirrorById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VPortMirror> getVPortMirrorsForFetcherId(String id) throws RestException {
        VPortMirrorsFetcher fetcher = getVPortMirrorsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VPORTMIRROR);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VPortMirror>();
    }

    public static VPortMirrorsFetcher getVPortMirrorsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VPORTMIRRORS_FETCHER, id);
        if (fetcher != null) {
            return (VPortMirrorsFetcher) fetcher;
        }
        if ((fetcher = getVPortMirrorsFetcherForVPortId(id)) != null) {
            return (VPortMirrorsFetcher) addFetcher(Constants.VPORTMIRRORS_FETCHER, fetcher);
        }
        
        if ((fetcher = getVPortMirrorsFetcherForMirrorDestinationId(id)) != null) {
            return (VPortMirrorsFetcher) addFetcher(Constants.VPORTMIRRORS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VPortMirror> getAllVPortMirrors() throws RestException {
        java.util.List<VPortMirror> allObjs = new ArrayList<VPortMirror>();

        return allObjs;
    }

    public static java.util.List<VPortMirrorsFetcher> getAllVPortMirrorsFetchers() throws RestException {
        java.util.List<VPortMirrorsFetcher> allObjs = new ArrayList<VPortMirrorsFetcher>();
        return allObjs;
    }
    public static PATNATPool getPATNATPoolById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PATNATPool obj = null;
            obj = new PATNATPool();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PATNATPOOL, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AddressMapsFetcher getAddressMapsFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            AddressMapsFetcher fetcher = obj.getAddressMaps();
            return addFetcher(Constants.ADDRESSMAPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BulkStatisticsFetcher getBulkStatisticsFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            BulkStatisticsFetcher fetcher = obj.getBulkStatistics();
            return addFetcher(Constants.BULKSTATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterprisePermissionsFetcher getEnterprisePermissionsFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            EnterprisePermissionsFetcher fetcher = obj.getEnterprisePermissions();
            return addFetcher(Constants.ENTERPRISEPERMISSIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NATMapEntriesFetcher getNATMapEntriesFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            NATMapEntriesFetcher fetcher = obj.getNATMapEntries();
            return addFetcher(Constants.NATMAPENTRIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsFetcher getStatisticsFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            StatisticsFetcher fetcher = obj.getStatistics();
            return addFetcher(Constants.STATISTICS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static StatisticsPoliciesFetcher getStatisticsPoliciesFetcherForPATNATPoolId(String id) throws RestException {
        PATNATPool obj = getObject(Constants.PATNATPOOL, id);
        if (obj == null) {
            obj = getPATNATPoolById(id);
        }

        if (obj != null) {
            StatisticsPoliciesFetcher fetcher = obj.getStatisticsPolicies();
            return addFetcher(Constants.STATISTICSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PATNATPool> getPATNATPoolsForFetcherId(String id) throws RestException {
        PATNATPoolsFetcher fetcher = getPATNATPoolsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PATNATPOOL);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PATNATPool>();
    }

    public static PATNATPoolsFetcher getPATNATPoolsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PATNATPOOLS_FETCHER, id);
        if (fetcher != null) {
            return (PATNATPoolsFetcher) fetcher;
        }
        if ((fetcher = getPATNATPoolsFetcherForVLANId(id)) != null) {
            return (PATNATPoolsFetcher) addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPATNATPoolsFetcherForGatewayId(id)) != null) {
            return (PATNATPoolsFetcher) addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPATNATPoolsFetcherForMeId(id)) != null) {
            return (PATNATPoolsFetcher) addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPATNATPoolsFetcherForNSGatewayId(id)) != null) {
            return (PATNATPoolsFetcher) addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPATNATPoolsFetcherForEnterpriseId(id)) != null) {
            return (PATNATPoolsFetcher) addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PATNATPool> getAllPATNATPools() throws RestException {
        java.util.List<PATNATPool> allObjs = new ArrayList<PATNATPool>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            PATNATPoolsFetcher fetcher = getPATNATPoolsFetcherForMeId(session.getId());
            java.util.List<PATNATPool> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<PATNATPoolsFetcher> getAllPATNATPoolsFetchers() throws RestException {
        java.util.List<PATNATPoolsFetcher> allObjs = new ArrayList<PATNATPoolsFetcher>();
        return allObjs;
    }
    public static PATMapper getPATMapperById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PATMapper obj = null;
            obj = new PATMapper();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PATMAPPER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static SharedNetworkResourcesFetcher getSharedNetworkResourcesFetcherForPATMapperId(String id) throws RestException {
        PATMapper obj = getObject(Constants.PATMAPPER, id);
        if (obj == null) {
            obj = getPATMapperById(id);
        }

        if (obj != null) {
            SharedNetworkResourcesFetcher fetcher = obj.getSharedNetworkResources();
            return addFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PATMapper> getPATMappersForFetcherId(String id) throws RestException {
        PATMappersFetcher fetcher = getPATMappersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PATMAPPER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PATMapper>();
    }

    public static PATMappersFetcher getPATMappersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PATMAPPERS_FETCHER, id);
        if (fetcher != null) {
            return (PATMappersFetcher) fetcher;
        }
        if ((fetcher = getPATMappersFetcherForMeId(id)) != null) {
            return (PATMappersFetcher) addFetcher(Constants.PATMAPPERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PATMapper> getAllPATMappers() throws RestException {
        java.util.List<PATMapper> allObjs = new ArrayList<PATMapper>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            PATMappersFetcher fetcher = getPATMappersFetcherForMeId(session.getId());
            java.util.List<PATMapper> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<PATMappersFetcher> getAllPATMappersFetchers() throws RestException {
        java.util.List<PATMappersFetcher> allObjs = new ArrayList<PATMappersFetcher>();
        return allObjs;
    }
    public static BGPNeighbor getBGPNeighborById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            BGPNeighbor obj = null;
            obj = new BGPNeighbor();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BGPNEIGHBOR, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBGPNeighborId(String id) throws RestException {
        BGPNeighbor obj = getObject(Constants.BGPNEIGHBOR, id);
        if (obj == null) {
            obj = getBGPNeighborById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBGPNeighborId(String id) throws RestException {
        BGPNeighbor obj = getObject(Constants.BGPNEIGHBOR, id);
        if (obj == null) {
            obj = getBGPNeighborById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<BGPNeighbor> getBGPNeighborsForFetcherId(String id) throws RestException {
        BGPNeighborsFetcher fetcher = getBGPNeighborsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BGPNEIGHBOR);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<BGPNeighbor>();
    }

    public static BGPNeighborsFetcher getBGPNeighborsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BGPNEIGHBORS_FETCHER, id);
        if (fetcher != null) {
            return (BGPNeighborsFetcher) fetcher;
        }
        if ((fetcher = getBGPNeighborsFetcherForSubnetId(id)) != null) {
            return (BGPNeighborsFetcher) addFetcher(Constants.BGPNEIGHBORS_FETCHER, fetcher);
        }
        
        if ((fetcher = getBGPNeighborsFetcherForVLANId(id)) != null) {
            return (BGPNeighborsFetcher) addFetcher(Constants.BGPNEIGHBORS_FETCHER, fetcher);
        }
        
        if ((fetcher = getBGPNeighborsFetcherForMeId(id)) != null) {
            return (BGPNeighborsFetcher) addFetcher(Constants.BGPNEIGHBORS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<BGPNeighbor> getAllBGPNeighbors() throws RestException {
        java.util.List<BGPNeighbor> allObjs = new ArrayList<BGPNeighbor>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            BGPNeighborsFetcher fetcher = getBGPNeighborsFetcherForMeId(session.getId());
            java.util.List<BGPNeighbor> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<BGPNeighborsFetcher> getAllBGPNeighborsFetchers() throws RestException {
        java.util.List<BGPNeighborsFetcher> allObjs = new ArrayList<BGPNeighborsFetcher>();
        return allObjs;
    }
    public static ContainerResync getContainerResyncById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ContainerResync obj = null;
            obj = new ContainerResync();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.CONTAINERRESYNC, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForContainerResyncId(String id) throws RestException {
        ContainerResync obj = getObject(Constants.CONTAINERRESYNC, id);
        if (obj == null) {
            obj = getContainerResyncById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForContainerResyncId(String id) throws RestException {
        ContainerResync obj = getObject(Constants.CONTAINERRESYNC, id);
        if (obj == null) {
            obj = getContainerResyncById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ContainerResync> getContainerResyncsForFetcherId(String id) throws RestException {
        ContainerResyncsFetcher fetcher = getContainerResyncsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.CONTAINERRESYNC);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ContainerResync>();
    }

    public static ContainerResyncsFetcher getContainerResyncsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.CONTAINERRESYNCS_FETCHER, id);
        if (fetcher != null) {
            return (ContainerResyncsFetcher) fetcher;
        }
        if ((fetcher = getContainerResyncsFetcherForSubnetId(id)) != null) {
            return (ContainerResyncsFetcher) addFetcher(Constants.CONTAINERRESYNCS_FETCHER, fetcher);
        }
        
        if ((fetcher = getContainerResyncsFetcherForContainerId(id)) != null) {
            return (ContainerResyncsFetcher) addFetcher(Constants.CONTAINERRESYNCS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ContainerResync> getAllContainerResyncs() throws RestException {
        java.util.List<ContainerResync> allObjs = new ArrayList<ContainerResync>();

        return allObjs;
    }

    public static java.util.List<ContainerResyncsFetcher> getAllContainerResyncsFetchers() throws RestException {
        java.util.List<ContainerResyncsFetcher> allObjs = new ArrayList<ContainerResyncsFetcher>();
        return allObjs;
    }
    public static AllAlarm getAllAlarmById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            AllAlarm obj = null;
            obj = new AllAlarm();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ALLALARM, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForAllAlarmId(String id) throws RestException {
        AllAlarm obj = getObject(Constants.ALLALARM, id);
        if (obj == null) {
            obj = getAllAlarmById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForAllAlarmId(String id) throws RestException {
        AllAlarm obj = getObject(Constants.ALLALARM, id);
        if (obj == null) {
            obj = getAllAlarmById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<AllAlarm> getAllAlarmsForFetcherId(String id) throws RestException {
        AllAlarmsFetcher fetcher = getAllAlarmsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ALLALARM);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<AllAlarm>();
    }

    public static AllAlarmsFetcher getAllAlarmsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ALLALARMS_FETCHER, id);
        if (fetcher != null) {
            return (AllAlarmsFetcher) fetcher;
        }
        if ((fetcher = getAllAlarmsFetcherForEnterpriseId(id)) != null) {
            return (AllAlarmsFetcher) addFetcher(Constants.ALLALARMS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<AllAlarm> getAllAllAlarms() throws RestException {
        java.util.List<AllAlarm> allObjs = new ArrayList<AllAlarm>();

        return allObjs;
    }

    public static java.util.List<AllAlarmsFetcher> getAllAllAlarmsFetchers() throws RestException {
        java.util.List<AllAlarmsFetcher> allObjs = new ArrayList<AllAlarmsFetcher>();
        return allObjs;
    }
    public static IKEPSK getIKEPSKById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKEPSK obj = null;
            obj = new IKEPSK();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKEPSK, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKEPSKId(String id) throws RestException {
        IKEPSK obj = getObject(Constants.IKEPSK, id);
        if (obj == null) {
            obj = getIKEPSKById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKEPSKId(String id) throws RestException {
        IKEPSK obj = getObject(Constants.IKEPSK, id);
        if (obj == null) {
            obj = getIKEPSKById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKEPSK> getIKEPSKsForFetcherId(String id) throws RestException {
        IKEPSKsFetcher fetcher = getIKEPSKsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKEPSK);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKEPSK>();
    }

    public static IKEPSKsFetcher getIKEPSKsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKEPSKS_FETCHER, id);
        if (fetcher != null) {
            return (IKEPSKsFetcher) fetcher;
        }
        if ((fetcher = getIKEPSKsFetcherForEnterpriseId(id)) != null) {
            return (IKEPSKsFetcher) addFetcher(Constants.IKEPSKS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKEPSK> getAllIKEPSKs() throws RestException {
        java.util.List<IKEPSK> allObjs = new ArrayList<IKEPSK>();

        return allObjs;
    }

    public static java.util.List<IKEPSKsFetcher> getAllIKEPSKsFetchers() throws RestException {
        java.util.List<IKEPSKsFetcher> allObjs = new ArrayList<IKEPSKsFetcher>();
        return allObjs;
    }
    public static SystemConfig getSystemConfigById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            SystemConfig obj = null;
            obj = new SystemConfig();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.SYSTEMCONFIG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForSystemConfigId(String id) throws RestException {
        SystemConfig obj = getObject(Constants.SYSTEMCONFIG, id);
        if (obj == null) {
            obj = getSystemConfigById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForSystemConfigId(String id) throws RestException {
        SystemConfig obj = getObject(Constants.SYSTEMCONFIG, id);
        if (obj == null) {
            obj = getSystemConfigById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<SystemConfig> getSystemConfigsForFetcherId(String id) throws RestException {
        SystemConfigsFetcher fetcher = getSystemConfigsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.SYSTEMCONFIG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<SystemConfig>();
    }

    public static SystemConfigsFetcher getSystemConfigsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.SYSTEMCONFIGS_FETCHER, id);
        if (fetcher != null) {
            return (SystemConfigsFetcher) fetcher;
        }
        if ((fetcher = getSystemConfigsFetcherForMeId(id)) != null) {
            return (SystemConfigsFetcher) addFetcher(Constants.SYSTEMCONFIGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<SystemConfig> getAllSystemConfigs() throws RestException {
        java.util.List<SystemConfig> allObjs = new ArrayList<SystemConfig>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            SystemConfigsFetcher fetcher = getSystemConfigsFetcherForMeId(session.getId());
            java.util.List<SystemConfig> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<SystemConfigsFetcher> getAllSystemConfigsFetchers() throws RestException {
        java.util.List<SystemConfigsFetcher> allObjs = new ArrayList<SystemConfigsFetcher>();
        return allObjs;
    }
    public static IKEEncryptionprofile getIKEEncryptionprofileById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IKEEncryptionprofile obj = null;
            obj = new IKEEncryptionprofile();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.IKEENCRYPTIONPROFILE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIKEEncryptionprofileId(String id) throws RestException {
        IKEEncryptionprofile obj = getObject(Constants.IKEENCRYPTIONPROFILE, id);
        if (obj == null) {
            obj = getIKEEncryptionprofileById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIKEEncryptionprofileId(String id) throws RestException {
        IKEEncryptionprofile obj = getObject(Constants.IKEENCRYPTIONPROFILE, id);
        if (obj == null) {
            obj = getIKEEncryptionprofileById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IKEEncryptionprofile> getIKEEncryptionprofilesForFetcherId(String id) throws RestException {
        IKEEncryptionprofilesFetcher fetcher = getIKEEncryptionprofilesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.IKEENCRYPTIONPROFILE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IKEEncryptionprofile>();
    }

    public static IKEEncryptionprofilesFetcher getIKEEncryptionprofilesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.IKEENCRYPTIONPROFILES_FETCHER, id);
        if (fetcher != null) {
            return (IKEEncryptionprofilesFetcher) fetcher;
        }
        if ((fetcher = getIKEEncryptionprofilesFetcherForEnterpriseId(id)) != null) {
            return (IKEEncryptionprofilesFetcher) addFetcher(Constants.IKEENCRYPTIONPROFILES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IKEEncryptionprofile> getAllIKEEncryptionprofiles() throws RestException {
        java.util.List<IKEEncryptionprofile> allObjs = new ArrayList<IKEEncryptionprofile>();

        return allObjs;
    }

    public static java.util.List<IKEEncryptionprofilesFetcher> getAllIKEEncryptionprofilesFetchers() throws RestException {
        java.util.List<IKEEncryptionprofilesFetcher> allObjs = new ArrayList<IKEEncryptionprofilesFetcher>();
        return allObjs;
    }
    public static FloatingIPACLTemplateEntry getFloatingIPACLTemplateEntryById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            FloatingIPACLTemplateEntry obj = null;
            obj = new FloatingIPACLTemplateEntry();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.FLOATINGIPACLTEMPLATEENTRY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForFloatingIPACLTemplateEntryId(String id) throws RestException {
        FloatingIPACLTemplateEntry obj = getObject(Constants.FLOATINGIPACLTEMPLATEENTRY, id);
        if (obj == null) {
            obj = getFloatingIPACLTemplateEntryById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForFloatingIPACLTemplateEntryId(String id) throws RestException {
        FloatingIPACLTemplateEntry obj = getObject(Constants.FLOATINGIPACLTEMPLATEENTRY, id);
        if (obj == null) {
            obj = getFloatingIPACLTemplateEntryById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<FloatingIPACLTemplateEntry> getFloatingIPACLTemplateEntriesForFetcherId(String id) throws RestException {
        FloatingIPACLTemplateEntriesFetcher fetcher = getFloatingIPACLTemplateEntriesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.FLOATINGIPACLTEMPLATEENTRY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<FloatingIPACLTemplateEntry>();
    }

    public static FloatingIPACLTemplateEntriesFetcher getFloatingIPACLTemplateEntriesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER, id);
        if (fetcher != null) {
            return (FloatingIPACLTemplateEntriesFetcher) fetcher;
        }
        if ((fetcher = getFloatingIPACLTemplateEntriesFetcherForFloatingIPACLTemplateId(id)) != null) {
            return (FloatingIPACLTemplateEntriesFetcher) addFetcher(Constants.FLOATINGIPACLTEMPLATEENTRIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<FloatingIPACLTemplateEntry> getAllFloatingIPACLTemplateEntries() throws RestException {
        java.util.List<FloatingIPACLTemplateEntry> allObjs = new ArrayList<FloatingIPACLTemplateEntry>();

        return allObjs;
    }

    public static java.util.List<FloatingIPACLTemplateEntriesFetcher> getAllFloatingIPACLTemplateEntriesFetchers() throws RestException {
        java.util.List<FloatingIPACLTemplateEntriesFetcher> allObjs = new ArrayList<FloatingIPACLTemplateEntriesFetcher>();
        return allObjs;
    }
    public static InfrastructureConfig getInfrastructureConfigById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            InfrastructureConfig obj = null;
            obj = new InfrastructureConfig();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INFRASTRUCTURECONFIG, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForInfrastructureConfigId(String id) throws RestException {
        InfrastructureConfig obj = getObject(Constants.INFRASTRUCTURECONFIG, id);
        if (obj == null) {
            obj = getInfrastructureConfigById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForInfrastructureConfigId(String id) throws RestException {
        InfrastructureConfig obj = getObject(Constants.INFRASTRUCTURECONFIG, id);
        if (obj == null) {
            obj = getInfrastructureConfigById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<InfrastructureConfig> getInfrastructureConfigsForFetcherId(String id) throws RestException {
        InfrastructureConfigsFetcher fetcher = getInfrastructureConfigsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INFRASTRUCTURECONFIG);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<InfrastructureConfig>();
    }

    public static InfrastructureConfigsFetcher getInfrastructureConfigsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INFRASTRUCTURECONFIGS_FETCHER, id);
        if (fetcher != null) {
            return (InfrastructureConfigsFetcher) fetcher;
        }
        if ((fetcher = getInfrastructureConfigsFetcherForNSGatewayId(id)) != null) {
            return (InfrastructureConfigsFetcher) addFetcher(Constants.INFRASTRUCTURECONFIGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<InfrastructureConfig> getAllInfrastructureConfigs() throws RestException {
        java.util.List<InfrastructureConfig> allObjs = new ArrayList<InfrastructureConfig>();

        return allObjs;
    }

    public static java.util.List<InfrastructureConfigsFetcher> getAllInfrastructureConfigsFetchers() throws RestException {
        java.util.List<InfrastructureConfigsFetcher> allObjs = new ArrayList<InfrastructureConfigsFetcher>();
        return allObjs;
    }
    public static User getUserById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            User obj = null;
            obj = new User();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.USER, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AvatarsFetcher getAvatarsFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            AvatarsFetcher fetcher = obj.getAvatars();
            return addFetcher(Constants.AVATARS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForUserId(String id) throws RestException {
        User obj = getObject(Constants.USER, id);
        if (obj == null) {
            obj = getUserById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<User> getUsersForFetcherId(String id) throws RestException {
        UsersFetcher fetcher = getUsersFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.USER);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<User>();
    }

    public static UsersFetcher getUsersFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.USERS_FETCHER, id);
        if (fetcher != null) {
            return (UsersFetcher) fetcher;
        }
        if ((fetcher = getUsersFetcherForGroupId(id)) != null) {
            return (UsersFetcher) addFetcher(Constants.USERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getUsersFetcherForMeId(id)) != null) {
            return (UsersFetcher) addFetcher(Constants.USERS_FETCHER, fetcher);
        }
        
        if ((fetcher = getUsersFetcherForEnterpriseId(id)) != null) {
            return (UsersFetcher) addFetcher(Constants.USERS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<User> getAllUsers() throws RestException {
        java.util.List<User> allObjs = new ArrayList<User>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            UsersFetcher fetcher = getUsersFetcherForMeId(session.getId());
            java.util.List<User> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<UsersFetcher> getAllUsersFetchers() throws RestException {
        java.util.List<UsersFetcher> allObjs = new ArrayList<UsersFetcher>();
        return allObjs;
    }
    public static NATMapEntry getNATMapEntryById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NATMapEntry obj = null;
            obj = new NATMapEntry();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NATMAPENTRY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForNATMapEntryId(String id) throws RestException {
        NATMapEntry obj = getObject(Constants.NATMAPENTRY, id);
        if (obj == null) {
            obj = getNATMapEntryById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForNATMapEntryId(String id) throws RestException {
        NATMapEntry obj = getObject(Constants.NATMAPENTRY, id);
        if (obj == null) {
            obj = getNATMapEntryById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NATMapEntry> getNATMapEntriesForFetcherId(String id) throws RestException {
        NATMapEntriesFetcher fetcher = getNATMapEntriesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NATMAPENTRY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NATMapEntry>();
    }

    public static NATMapEntriesFetcher getNATMapEntriesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NATMAPENTRIES_FETCHER, id);
        if (fetcher != null) {
            return (NATMapEntriesFetcher) fetcher;
        }
        if ((fetcher = getNATMapEntriesFetcherForPATNATPoolId(id)) != null) {
            return (NATMapEntriesFetcher) addFetcher(Constants.NATMAPENTRIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NATMapEntry> getAllNATMapEntries() throws RestException {
        java.util.List<NATMapEntry> allObjs = new ArrayList<NATMapEntry>();

        return allObjs;
    }

    public static java.util.List<NATMapEntriesFetcher> getAllNATMapEntriesFetchers() throws RestException {
        java.util.List<NATMapEntriesFetcher> allObjs = new ArrayList<NATMapEntriesFetcher>();
        return allObjs;
    }
    public static PolicyGroup getPolicyGroupById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PolicyGroup obj = null;
            obj = new PolicyGroup();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.POLICYGROUP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForPolicyGroupId(String id) throws RestException {
        PolicyGroup obj = getObject(Constants.POLICYGROUP, id);
        if (obj == null) {
            obj = getPolicyGroupById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForPolicyGroupId(String id) throws RestException {
        PolicyGroup obj = getObject(Constants.POLICYGROUP, id);
        if (obj == null) {
            obj = getPolicyGroupById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForPolicyGroupId(String id) throws RestException {
        PolicyGroup obj = getObject(Constants.POLICYGROUP, id);
        if (obj == null) {
            obj = getPolicyGroupById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForPolicyGroupId(String id) throws RestException {
        PolicyGroup obj = getObject(Constants.POLICYGROUP, id);
        if (obj == null) {
            obj = getPolicyGroupById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VPortsFetcher getVPortsFetcherForPolicyGroupId(String id) throws RestException {
        PolicyGroup obj = getObject(Constants.POLICYGROUP, id);
        if (obj == null) {
            obj = getPolicyGroupById(id);
        }

        if (obj != null) {
            VPortsFetcher fetcher = obj.getVPorts();
            return addFetcher(Constants.VPORTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<PolicyGroup> getPolicyGroupsForFetcherId(String id) throws RestException {
        PolicyGroupsFetcher fetcher = getPolicyGroupsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.POLICYGROUP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PolicyGroup>();
    }

    public static PolicyGroupsFetcher getPolicyGroupsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.POLICYGROUPS_FETCHER, id);
        if (fetcher != null) {
            return (PolicyGroupsFetcher) fetcher;
        }
        if ((fetcher = getPolicyGroupsFetcherForContainerInterfaceId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForDomainId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForVPortId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForVMInterfaceId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForBridgeInterfaceId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForL2DomainId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForHostInterfaceId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        
        if ((fetcher = getPolicyGroupsFetcherForMeId(id)) != null) {
            return (PolicyGroupsFetcher) addFetcher(Constants.POLICYGROUPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PolicyGroup> getAllPolicyGroups() throws RestException {
        java.util.List<PolicyGroup> allObjs = new ArrayList<PolicyGroup>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            PolicyGroupsFetcher fetcher = getPolicyGroupsFetcherForMeId(session.getId());
            java.util.List<PolicyGroup> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<PolicyGroupsFetcher> getAllPolicyGroupsFetchers() throws RestException {
        java.util.List<PolicyGroupsFetcher> allObjs = new ArrayList<PolicyGroupsFetcher>();
        return allObjs;
    }
    public static DemarcationService getDemarcationServiceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            DemarcationService obj = null;
            obj = new DemarcationService();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.DEMARCATIONSERVICE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<DemarcationService> getDemarcationServicesForFetcherId(String id) throws RestException {
        DemarcationServicesFetcher fetcher = getDemarcationServicesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.DEMARCATIONSERVICE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<DemarcationService>();
    }

    public static DemarcationServicesFetcher getDemarcationServicesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.DEMARCATIONSERVICES_FETCHER, id);
        if (fetcher != null) {
            return (DemarcationServicesFetcher) fetcher;
        }
        if ((fetcher = getDemarcationServicesFetcherForLinkId(id)) != null) {
            return (DemarcationServicesFetcher) addFetcher(Constants.DEMARCATIONSERVICES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<DemarcationService> getAllDemarcationServices() throws RestException {
        java.util.List<DemarcationService> allObjs = new ArrayList<DemarcationService>();

        return allObjs;
    }

    public static java.util.List<DemarcationServicesFetcher> getAllDemarcationServicesFetchers() throws RestException {
        java.util.List<DemarcationServicesFetcher> allObjs = new ArrayList<DemarcationServicesFetcher>();
        return allObjs;
    }
    public static NSGInfo getNSGInfoById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NSGInfo obj = null;
            obj = new NSGInfo();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NSGINFO, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<NSGInfo> getNSGInfosForFetcherId(String id) throws RestException {
        NSGInfosFetcher fetcher = getNSGInfosFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NSGINFO);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NSGInfo>();
    }

    public static NSGInfosFetcher getNSGInfosFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NSGINFOS_FETCHER, id);
        if (fetcher != null) {
            return (NSGInfosFetcher) fetcher;
        }
        if ((fetcher = getNSGInfosFetcherForNSGatewayId(id)) != null) {
            return (NSGInfosFetcher) addFetcher(Constants.NSGINFOS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NSGInfo> getAllNSGInfos() throws RestException {
        java.util.List<NSGInfo> allObjs = new ArrayList<NSGInfo>();

        return allObjs;
    }

    public static java.util.List<NSGInfosFetcher> getAllNSGInfosFetchers() throws RestException {
        java.util.List<NSGInfosFetcher> allObjs = new ArrayList<NSGInfosFetcher>();
        return allObjs;
    }
    public static ExternalAppService getExternalAppServiceById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            ExternalAppService obj = null;
            obj = new ExternalAppService();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.EXTERNALAPPSERVICE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForExternalAppServiceId(String id) throws RestException {
        ExternalAppService obj = getObject(Constants.EXTERNALAPPSERVICE, id);
        if (obj == null) {
            obj = getExternalAppServiceById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForExternalAppServiceId(String id) throws RestException {
        ExternalAppService obj = getObject(Constants.EXTERNALAPPSERVICE, id);
        if (obj == null) {
            obj = getExternalAppServiceById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<ExternalAppService> getExternalAppServicesForFetcherId(String id) throws RestException {
        ExternalAppServicesFetcher fetcher = getExternalAppServicesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.EXTERNALAPPSERVICE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<ExternalAppService>();
    }

    public static ExternalAppServicesFetcher getExternalAppServicesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, id);
        if (fetcher != null) {
            return (ExternalAppServicesFetcher) fetcher;
        }
        if ((fetcher = getExternalAppServicesFetcherForDomainId(id)) != null) {
            return (ExternalAppServicesFetcher) addFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getExternalAppServicesFetcherForMeId(id)) != null) {
            return (ExternalAppServicesFetcher) addFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, fetcher);
        }
        
        if ((fetcher = getExternalAppServicesFetcherForEnterpriseId(id)) != null) {
            return (ExternalAppServicesFetcher) addFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<ExternalAppService> getAllExternalAppServices() throws RestException {
        java.util.List<ExternalAppService> allObjs = new ArrayList<ExternalAppService>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            ExternalAppServicesFetcher fetcher = getExternalAppServicesFetcherForMeId(session.getId());
            java.util.List<ExternalAppService> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<ExternalAppServicesFetcher> getAllExternalAppServicesFetchers() throws RestException {
        java.util.List<ExternalAppServicesFetcher> allObjs = new ArrayList<ExternalAppServicesFetcher>();
        return allObjs;
    }
    public static Alarm getAlarmById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Alarm obj = null;
            obj = new Alarm();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ALARM, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForAlarmId(String id) throws RestException {
        Alarm obj = getObject(Constants.ALARM, id);
        if (obj == null) {
            obj = getAlarmById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForAlarmId(String id) throws RestException {
        Alarm obj = getObject(Constants.ALARM, id);
        if (obj == null) {
            obj = getAlarmById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Alarm> getAlarmsForFetcherId(String id) throws RestException {
        AlarmsFetcher fetcher = getAlarmsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ALARM);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Alarm>();
    }

    public static AlarmsFetcher getAlarmsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ALARMS_FETCHER, id);
        if (fetcher != null) {
            return (AlarmsFetcher) fetcher;
        }
        if ((fetcher = getAlarmsFetcherForRedundancyGroupId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForTCAId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVsgRedundantPortId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForWANServiceId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVSDId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVPortId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForPortId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForContainerId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVRSId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForHSCId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVLANId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForGatewayId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForNSGatewayId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVSCId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForVMId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForNSPortId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForNSRedundantGatewayGroupId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        
        if ((fetcher = getAlarmsFetcherForEnterpriseId(id)) != null) {
            return (AlarmsFetcher) addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Alarm> getAllAlarms() throws RestException {
        java.util.List<Alarm> allObjs = new ArrayList<Alarm>();

        return allObjs;
    }

    public static java.util.List<AlarmsFetcher> getAllAlarmsFetchers() throws RestException {
        java.util.List<AlarmsFetcher> allObjs = new ArrayList<AlarmsFetcher>();
        return allObjs;
    }
    public static Bootstrap getBootstrapById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Bootstrap obj = null;
            obj = new Bootstrap();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.BOOTSTRAP, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForBootstrapId(String id) throws RestException {
        Bootstrap obj = getObject(Constants.BOOTSTRAP, id);
        if (obj == null) {
            obj = getBootstrapById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForBootstrapId(String id) throws RestException {
        Bootstrap obj = getObject(Constants.BOOTSTRAP, id);
        if (obj == null) {
            obj = getBootstrapById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Bootstrap> getBootstrapsForFetcherId(String id) throws RestException {
        BootstrapsFetcher fetcher = getBootstrapsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.BOOTSTRAP);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Bootstrap>();
    }

    public static BootstrapsFetcher getBootstrapsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.BOOTSTRAPS_FETCHER, id);
        if (fetcher != null) {
            return (BootstrapsFetcher) fetcher;
        }
        if ((fetcher = getBootstrapsFetcherForNSGatewayId(id)) != null) {
            return (BootstrapsFetcher) addFetcher(Constants.BOOTSTRAPS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Bootstrap> getAllBootstraps() throws RestException {
        java.util.List<Bootstrap> allObjs = new ArrayList<Bootstrap>();

        return allObjs;
    }

    public static java.util.List<BootstrapsFetcher> getAllBootstrapsFetchers() throws RestException {
        java.util.List<BootstrapsFetcher> allObjs = new ArrayList<BootstrapsFetcher>();
        return allObjs;
    }
    public static Flow getFlowById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Flow obj = null;
            obj = new Flow();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.FLOW, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static EventLogsFetcher getEventLogsFetcherForFlowId(String id) throws RestException {
        Flow obj = getObject(Constants.FLOW, id);
        if (obj == null) {
            obj = getFlowById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FlowForwardingPoliciesFetcher getFlowForwardingPoliciesFetcherForFlowId(String id) throws RestException {
        Flow obj = getObject(Constants.FLOW, id);
        if (obj == null) {
            obj = getFlowById(id);
        }

        if (obj != null) {
            FlowForwardingPoliciesFetcher fetcher = obj.getFlowForwardingPolicies();
            return addFetcher(Constants.FLOWFORWARDINGPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static FlowSecurityPoliciesFetcher getFlowSecurityPoliciesFetcherForFlowId(String id) throws RestException {
        Flow obj = getObject(Constants.FLOW, id);
        if (obj == null) {
            obj = getFlowById(id);
        }

        if (obj != null) {
            FlowSecurityPoliciesFetcher fetcher = obj.getFlowSecurityPolicies();
            return addFetcher(Constants.FLOWSECURITYPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForFlowId(String id) throws RestException {
        Flow obj = getObject(Constants.FLOW, id);
        if (obj == null) {
            obj = getFlowById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForFlowId(String id) throws RestException {
        Flow obj = getObject(Constants.FLOW, id);
        if (obj == null) {
            obj = getFlowById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Flow> getFlowsForFetcherId(String id) throws RestException {
        FlowsFetcher fetcher = getFlowsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.FLOW);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Flow>();
    }

    public static FlowsFetcher getFlowsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.FLOWS_FETCHER, id);
        if (fetcher != null) {
            return (FlowsFetcher) fetcher;
        }return null;
    }

    public static java.util.List<Flow> getAllFlows() throws RestException {
        java.util.List<Flow> allObjs = new ArrayList<Flow>();

        return allObjs;
    }

    public static java.util.List<FlowsFetcher> getAllFlowsFetchers() throws RestException {
        java.util.List<FlowsFetcher> allObjs = new ArrayList<FlowsFetcher>();
        return allObjs;
    }
    public static VLANTemplate getVLANTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            VLANTemplate obj = null;
            obj = new VLANTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.VLANTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static BRConnectionsFetcher getBRConnectionsFetcherForVLANTemplateId(String id) throws RestException {
        VLANTemplate obj = getObject(Constants.VLANTEMPLATE, id);
        if (obj == null) {
            obj = getVLANTemplateById(id);
        }

        if (obj != null) {
            BRConnectionsFetcher fetcher = obj.getBRConnections();
            return addFetcher(Constants.BRCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForVLANTemplateId(String id) throws RestException {
        VLANTemplate obj = getObject(Constants.VLANTEMPLATE, id);
        if (obj == null) {
            obj = getVLANTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForVLANTemplateId(String id) throws RestException {
        VLANTemplate obj = getObject(Constants.VLANTEMPLATE, id);
        if (obj == null) {
            obj = getVLANTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UplinkConnectionsFetcher getUplinkConnectionsFetcherForVLANTemplateId(String id) throws RestException {
        VLANTemplate obj = getObject(Constants.VLANTEMPLATE, id);
        if (obj == null) {
            obj = getVLANTemplateById(id);
        }

        if (obj != null) {
            UplinkConnectionsFetcher fetcher = obj.getUplinkConnections();
            return addFetcher(Constants.UPLINKCONNECTIONS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<VLANTemplate> getVLANTemplatesForFetcherId(String id) throws RestException {
        VLANTemplatesFetcher fetcher = getVLANTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.VLANTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<VLANTemplate>();
    }

    public static VLANTemplatesFetcher getVLANTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.VLANTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (VLANTemplatesFetcher) fetcher;
        }
        if ((fetcher = getVLANTemplatesFetcherForNSPortTemplateId(id)) != null) {
            return (VLANTemplatesFetcher) addFetcher(Constants.VLANTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getVLANTemplatesFetcherForPortTemplateId(id)) != null) {
            return (VLANTemplatesFetcher) addFetcher(Constants.VLANTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<VLANTemplate> getAllVLANTemplates() throws RestException {
        java.util.List<VLANTemplate> allObjs = new ArrayList<VLANTemplate>();

        return allObjs;
    }

    public static java.util.List<VLANTemplatesFetcher> getAllVLANTemplatesFetchers() throws RestException {
        java.util.List<VLANTemplatesFetcher> allObjs = new ArrayList<VLANTemplatesFetcher>();
        return allObjs;
    }
    public static PortMapping getPortMappingById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            PortMapping obj = null;
            obj = new PortMapping();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.PORTMAPPING, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }public static java.util.List<PortMapping> getPortMappingsForFetcherId(String id) throws RestException {
        PortMappingsFetcher fetcher = getPortMappingsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.PORTMAPPING);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<PortMapping>();
    }

    public static PortMappingsFetcher getPortMappingsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.PORTMAPPINGS_FETCHER, id);
        if (fetcher != null) {
            return (PortMappingsFetcher) fetcher;
        }
        if ((fetcher = getPortMappingsFetcherForVPortId(id)) != null) {
            return (PortMappingsFetcher) addFetcher(Constants.PORTMAPPINGS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<PortMapping> getAllPortMappings() throws RestException {
        java.util.List<PortMapping> allObjs = new ArrayList<PortMapping>();

        return allObjs;
    }

    public static java.util.List<PortMappingsFetcher> getAllPortMappingsFetchers() throws RestException {
        java.util.List<PortMappingsFetcher> allObjs = new ArrayList<PortMappingsFetcher>();
        return allObjs;
    }
    public static GatewaySecurity getGatewaySecurityById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            GatewaySecurity obj = null;
            obj = new GatewaySecurity();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GATEWAYSECURITY, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GatewaySecuredDatasFetcher getGatewaySecuredDatasFetcherForGatewaySecurityId(String id) throws RestException {
        GatewaySecurity obj = getObject(Constants.GATEWAYSECURITY, id);
        if (obj == null) {
            obj = getGatewaySecurityById(id);
        }

        if (obj != null) {
            GatewaySecuredDatasFetcher fetcher = obj.getGatewaySecuredDatas();
            return addFetcher(Constants.GATEWAYSECUREDDATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGatewaySecurityId(String id) throws RestException {
        GatewaySecurity obj = getObject(Constants.GATEWAYSECURITY, id);
        if (obj == null) {
            obj = getGatewaySecurityById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGatewaySecurityId(String id) throws RestException {
        GatewaySecurity obj = getObject(Constants.GATEWAYSECURITY, id);
        if (obj == null) {
            obj = getGatewaySecurityById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<GatewaySecurity> getGatewaySecuritiesForFetcherId(String id) throws RestException {
        GatewaySecuritiesFetcher fetcher = getGatewaySecuritiesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GATEWAYSECURITY);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<GatewaySecurity>();
    }

    public static GatewaySecuritiesFetcher getGatewaySecuritiesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GATEWAYSECURITIES_FETCHER, id);
        if (fetcher != null) {
            return (GatewaySecuritiesFetcher) fetcher;
        }
        if ((fetcher = getGatewaySecuritiesFetcherForNSGatewayId(id)) != null) {
            return (GatewaySecuritiesFetcher) addFetcher(Constants.GATEWAYSECURITIES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<GatewaySecurity> getAllGatewaySecurities() throws RestException {
        java.util.List<GatewaySecurity> allObjs = new ArrayList<GatewaySecurity>();

        return allObjs;
    }

    public static java.util.List<GatewaySecuritiesFetcher> getAllGatewaySecuritiesFetchers() throws RestException {
        java.util.List<GatewaySecuritiesFetcher> allObjs = new ArrayList<GatewaySecuritiesFetcher>();
        return allObjs;
    }
    public static GlobalMetadata getGlobalMetadataById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            GlobalMetadata obj = null;
            obj = new GlobalMetadata();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.GLOBALMETADATA, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForGlobalMetadataId(String id) throws RestException {
        GlobalMetadata obj = getObject(Constants.GLOBALMETADATA, id);
        if (obj == null) {
            obj = getGlobalMetadataById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForGlobalMetadataId(String id) throws RestException {
        GlobalMetadata obj = getObject(Constants.GLOBALMETADATA, id);
        if (obj == null) {
            obj = getGlobalMetadataById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadataTagsFetcher getMetadataTagsFetcherForGlobalMetadataId(String id) throws RestException {
        GlobalMetadata obj = getObject(Constants.GLOBALMETADATA, id);
        if (obj == null) {
            obj = getGlobalMetadataById(id);
        }

        if (obj != null) {
            MetadataTagsFetcher fetcher = obj.getMetadataTags();
            return addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<GlobalMetadata> getGlobalMetadatasForFetcherId(String id) throws RestException {
        GlobalMetadatasFetcher fetcher = getGlobalMetadatasFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.GLOBALMETADATA);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<GlobalMetadata>();
    }

    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.GLOBALMETADATAS_FETCHER, id);
        if (fetcher != null) {
            return (GlobalMetadatasFetcher) fetcher;
        }
        if ((fetcher = getGlobalMetadatasFetcherForContainerInterfaceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGroupKeyEncryptionProfileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForQOSId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForInfrastructureaccessprofileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBGPPeerId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForSharedNetworkResourceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVirtualIPId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDSCPForwardingClassTableId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMultiCastChannelMapId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForRedundancyGroupId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForTCAId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGroupId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVsgRedundantPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForZoneId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKEGatewayProfileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKESubnetId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForInfrastructureGatewayProfileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPolicyGroupTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForFlowSecurityPolicyId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVCenterEAMConfigId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForLocationId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEnterpriseSecurityId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVCenterVRSConfigId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEnterpriseNetworkId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForInfrastructureVscProfileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPermissionId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIPReservationId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForRedirectionTargetTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForSubnetTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMetadataTagId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForFloatingIPACLTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKEGatewayConnectionId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForRedirectionTargetId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEgressACLEntryTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIngressExternalServiceTemplateEntryId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForAvatarId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBootstrapActivationId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForCloudMgmtSystemId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVSPId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDomainId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForRedundantPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDSCPForwardingClassMappingId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNetworkLayoutId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForWANServiceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVSDId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForFlowForwardingPolicyId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForStatisticsPolicyId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForSubnetId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForContainerId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForRateLimiterId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForKeyServerMonitorEncryptedSeedId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForZoneTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForKeyServerMonitorSeedId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGatewayTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVRSId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForHSCId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVLANId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForLDAPConfigurationId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVSDComponentId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForZFBRequestId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEnterprisePermissionId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForStaticRouteId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForJobId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVMInterfaceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGatewaySecuredDataId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVCenterHypervisorId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForKeyServerMonitorId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEventLogId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForLicenseId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEnterpriseProfileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBridgeInterfaceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVCenterClusterId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMultiCastRangeId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNetworkMacroGroupId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIngressAdvFwdEntryTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForAutoDiscoveredGatewayId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMultiCastListId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNextHopId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForKeyServerNotificationId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMirrorDestinationId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForTierId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDomainFIPAclTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForAddressMapId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGatewayId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMultiNICVPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForStatisticsId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNSPortTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForCertificateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVCenterDataCenterId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForL2DomainTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForApplicationServiceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKEGatewayId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForStatsCollectorInfoId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVCenterId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBulkStatisticsId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIngressACLEntryTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForRoutingPolicyId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForL2DomainId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKEGatewayConfigId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForHostInterfaceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEnterpriseSecuredDataId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKECertificateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIngressExternalServiceTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPortTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMeId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEndPointId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDHCPOptionId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForKeyServerMemberId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNSGatewayId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNSGatewayTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVSCId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForUplinkRDId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVMId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNSPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVRSAddressRangeId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBGPProfileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEgressQOSPolicyId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPublicNetworkMacroId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDomainFIPAclTemplateEntryId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForAddressRangeId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForDomainTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForSiteInfoId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVMResyncId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPolicyDecisionId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForFloatingIpId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEgressACLTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForMonitoringPortId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVPNConnectionId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNSRedundantGatewayGroupId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForExternalServiceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForKeyServerMonitorSEKId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIngressAdvFwdTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVPortMirrorId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPATNATPoolId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBGPNeighborId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForContainerResyncId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForAllAlarmId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKEPSKId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForSystemConfigId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIKEEncryptionprofileId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForFloatingIPACLTemplateEntryId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForInfrastructureConfigId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForUserId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForNATMapEntryId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForPolicyGroupId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForExternalAppServiceId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForAlarmId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForBootstrapId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForFlowId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForVLANTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGatewaySecurityId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForGlobalMetadataId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForEnterpriseId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForLinkId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        
        if ((fetcher = getGlobalMetadatasFetcherForIngressACLTemplateId(id)) != null) {
            return (GlobalMetadatasFetcher) addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<GlobalMetadata> getAllGlobalMetadatas() throws RestException {
        java.util.List<GlobalMetadata> allObjs = new ArrayList<GlobalMetadata>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            GlobalMetadatasFetcher fetcher = getGlobalMetadatasFetcherForMeId(session.getId());
            java.util.List<GlobalMetadata> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<GlobalMetadatasFetcher> getAllGlobalMetadatasFetchers() throws RestException {
        java.util.List<GlobalMetadatasFetcher> allObjs = new ArrayList<GlobalMetadatasFetcher>();
        return allObjs;
    }
    public static NetworkPerformanceMeasurement getNetworkPerformanceMeasurementById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            NetworkPerformanceMeasurement obj = null;
            obj = new NetworkPerformanceMeasurement();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.NETWORKPERFORMANCEMEASUREMENT, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static MonitorscopesFetcher getMonitorscopesFetcherForNetworkPerformanceMeasurementId(String id) throws RestException {
        NetworkPerformanceMeasurement obj = getObject(Constants.NETWORKPERFORMANCEMEASUREMENT, id);
        if (obj == null) {
            obj = getNetworkPerformanceMeasurementById(id);
        }

        if (obj != null) {
            MonitorscopesFetcher fetcher = obj.getMonitorscopes();
            return addFetcher(Constants.MONITORSCOPES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NetworkPerformanceBindingsFetcher getNetworkPerformanceBindingsFetcherForNetworkPerformanceMeasurementId(String id) throws RestException {
        NetworkPerformanceMeasurement obj = getObject(Constants.NETWORKPERFORMANCEMEASUREMENT, id);
        if (obj == null) {
            obj = getNetworkPerformanceMeasurementById(id);
        }

        if (obj != null) {
            NetworkPerformanceBindingsFetcher fetcher = obj.getNetworkPerformanceBindings();
            return addFetcher(Constants.NETWORKPERFORMANCEBINDINGS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<NetworkPerformanceMeasurement> getNetworkPerformanceMeasurementsForFetcherId(String id) throws RestException {
        NetworkPerformanceMeasurementsFetcher fetcher = getNetworkPerformanceMeasurementsFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.NETWORKPERFORMANCEMEASUREMENT);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<NetworkPerformanceMeasurement>();
    }

    public static NetworkPerformanceMeasurementsFetcher getNetworkPerformanceMeasurementsFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, id);
        if (fetcher != null) {
            return (NetworkPerformanceMeasurementsFetcher) fetcher;
        }
        if ((fetcher = getNetworkPerformanceMeasurementsFetcherForEnterpriseId(id)) != null) {
            return (NetworkPerformanceMeasurementsFetcher) addFetcher(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<NetworkPerformanceMeasurement> getAllNetworkPerformanceMeasurements() throws RestException {
        java.util.List<NetworkPerformanceMeasurement> allObjs = new ArrayList<NetworkPerformanceMeasurement>();

        return allObjs;
    }

    public static java.util.List<NetworkPerformanceMeasurementsFetcher> getAllNetworkPerformanceMeasurementsFetchers() throws RestException {
        java.util.List<NetworkPerformanceMeasurementsFetcher> allObjs = new ArrayList<NetworkPerformanceMeasurementsFetcher>();
        return allObjs;
    }
    public static Enterprise getEnterpriseById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Enterprise obj = null;
            obj = new Enterprise();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.ENTERPRISE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static AlarmsFetcher getAlarmsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            AlarmsFetcher fetcher = obj.getAlarms();
            return addFetcher(Constants.ALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static AllAlarmsFetcher getAllAlarmsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            AllAlarmsFetcher fetcher = obj.getAllAlarms();
            return addFetcher(Constants.ALLALARMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ApplicationsFetcher getApplicationsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ApplicationsFetcher fetcher = obj.getApplications();
            return addFetcher(Constants.APPLICATIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ApplicationperformancemanagementsFetcher getApplicationperformancemanagementsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ApplicationperformancemanagementsFetcher fetcher = obj.getApplicationperformancemanagements();
            return addFetcher(Constants.APPLICATIONPERFORMANCEMANAGEMENTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ApplicationServicesFetcher getApplicationServicesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ApplicationServicesFetcher fetcher = obj.getApplicationServices();
            return addFetcher(Constants.APPLICATIONSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static AvatarsFetcher getAvatarsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            AvatarsFetcher fetcher = obj.getAvatars();
            return addFetcher(Constants.AVATARS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static BGPProfilesFetcher getBGPProfilesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            BGPProfilesFetcher fetcher = obj.getBGPProfiles();
            return addFetcher(Constants.BGPPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ContainersFetcher getContainersFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainsFetcher getDomainsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            DomainsFetcher fetcher = obj.getDomains();
            return addFetcher(Constants.DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DomainTemplatesFetcher getDomainTemplatesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            DomainTemplatesFetcher fetcher = obj.getDomainTemplates();
            return addFetcher(Constants.DOMAINTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static DSCPForwardingClassTablesFetcher getDSCPForwardingClassTablesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            DSCPForwardingClassTablesFetcher fetcher = obj.getDSCPForwardingClassTables();
            return addFetcher(Constants.DSCPFORWARDINGCLASSTABLES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EgressQOSPoliciesFetcher getEgressQOSPoliciesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            EgressQOSPoliciesFetcher fetcher = obj.getEgressQOSPolicies();
            return addFetcher(Constants.EGRESSQOSPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterpriseNetworksFetcher getEnterpriseNetworksFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            EnterpriseNetworksFetcher fetcher = obj.getEnterpriseNetworks();
            return addFetcher(Constants.ENTERPRISENETWORKS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EnterpriseSecuritiesFetcher getEnterpriseSecuritiesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            EnterpriseSecuritiesFetcher fetcher = obj.getEnterpriseSecurities();
            return addFetcher(Constants.ENTERPRISESECURITIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ExternalAppServicesFetcher getExternalAppServicesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ExternalAppServicesFetcher fetcher = obj.getExternalAppServices();
            return addFetcher(Constants.EXTERNALAPPSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ExternalServicesFetcher getExternalServicesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ExternalServicesFetcher fetcher = obj.getExternalServices();
            return addFetcher(Constants.EXTERNALSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GatewaysFetcher getGatewaysFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            GatewaysFetcher fetcher = obj.getGateways();
            return addFetcher(Constants.GATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GatewayTemplatesFetcher getGatewayTemplatesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            GatewayTemplatesFetcher fetcher = obj.getGatewayTemplates();
            return addFetcher(Constants.GATEWAYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupsFetcher getGroupsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            GroupsFetcher fetcher = obj.getGroups();
            return addFetcher(Constants.GROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GroupKeyEncryptionProfilesFetcher getGroupKeyEncryptionProfilesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            GroupKeyEncryptionProfilesFetcher fetcher = obj.getGroupKeyEncryptionProfiles();
            return addFetcher(Constants.GROUPKEYENCRYPTIONPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKECertificatesFetcher getIKECertificatesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            IKECertificatesFetcher fetcher = obj.getIKECertificates();
            return addFetcher(Constants.IKECERTIFICATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEEncryptionprofilesFetcher getIKEEncryptionprofilesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            IKEEncryptionprofilesFetcher fetcher = obj.getIKEEncryptionprofiles();
            return addFetcher(Constants.IKEENCRYPTIONPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEGatewaysFetcher getIKEGatewaysFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            IKEGatewaysFetcher fetcher = obj.getIKEGateways();
            return addFetcher(Constants.IKEGATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEGatewayProfilesFetcher getIKEGatewayProfilesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            IKEGatewayProfilesFetcher fetcher = obj.getIKEGatewayProfiles();
            return addFetcher(Constants.IKEGATEWAYPROFILES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IKEPSKsFetcher getIKEPSKsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            IKEPSKsFetcher fetcher = obj.getIKEPSKs();
            return addFetcher(Constants.IKEPSKS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static KeyServerMonitorsFetcher getKeyServerMonitorsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            KeyServerMonitorsFetcher fetcher = obj.getKeyServerMonitors();
            return addFetcher(Constants.KEYSERVERMONITORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static L2DomainsFetcher getL2DomainsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            L2DomainsFetcher fetcher = obj.getL2Domains();
            return addFetcher(Constants.L2DOMAINS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static L2DomainTemplatesFetcher getL2DomainTemplatesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            L2DomainTemplatesFetcher fetcher = obj.getL2DomainTemplates();
            return addFetcher(Constants.L2DOMAINTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static L7applicationsignaturesFetcher getL7applicationsignaturesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            L7applicationsignaturesFetcher fetcher = obj.getL7applicationsignatures();
            return addFetcher(Constants.L7APPLICATIONSIGNATURES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static LDAPConfigurationsFetcher getLDAPConfigurationsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            LDAPConfigurationsFetcher fetcher = obj.getLDAPConfigurations();
            return addFetcher(Constants.LDAPCONFIGURATIONS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadataTagsFetcher getMetadataTagsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            MetadataTagsFetcher fetcher = obj.getMetadataTags();
            return addFetcher(Constants.METADATATAGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MultiCastListsFetcher getMultiCastListsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            MultiCastListsFetcher fetcher = obj.getMultiCastLists();
            return addFetcher(Constants.MULTICASTLISTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NetworkMacroGroupsFetcher getNetworkMacroGroupsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            NetworkMacroGroupsFetcher fetcher = obj.getNetworkMacroGroups();
            return addFetcher(Constants.NETWORKMACROGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NetworkPerformanceMeasurementsFetcher getNetworkPerformanceMeasurementsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            NetworkPerformanceMeasurementsFetcher fetcher = obj.getNetworkPerformanceMeasurements();
            return addFetcher(Constants.NETWORKPERFORMANCEMEASUREMENTS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSGatewaysFetcher getNSGatewaysFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            NSGatewaysFetcher fetcher = obj.getNSGateways();
            return addFetcher(Constants.NSGATEWAYS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSGatewayTemplatesFetcher getNSGatewayTemplatesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            NSGatewayTemplatesFetcher fetcher = obj.getNSGatewayTemplates();
            return addFetcher(Constants.NSGATEWAYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroupsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            NSRedundantGatewayGroupsFetcher fetcher = obj.getNSRedundantGatewayGroups();
            return addFetcher(Constants.NSREDUNDANTGATEWAYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PATNATPoolsFetcher getPATNATPoolsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            PATNATPoolsFetcher fetcher = obj.getPATNATPools();
            return addFetcher(Constants.PATNATPOOLS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PerformanceMonitorsFetcher getPerformanceMonitorsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            PerformanceMonitorsFetcher fetcher = obj.getPerformanceMonitors();
            return addFetcher(Constants.PERFORMANCEMONITORS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static PublicNetworkMacrosFetcher getPublicNetworkMacrosFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            PublicNetworkMacrosFetcher fetcher = obj.getPublicNetworkMacros();
            return addFetcher(Constants.PUBLICNETWORKMACROS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RateLimitersFetcher getRateLimitersFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            RateLimitersFetcher fetcher = obj.getRateLimiters();
            return addFetcher(Constants.RATELIMITERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RedundancyGroupsFetcher getRedundancyGroupsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            RedundancyGroupsFetcher fetcher = obj.getRedundancyGroups();
            return addFetcher(Constants.REDUNDANCYGROUPS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static RoutingPoliciesFetcher getRoutingPoliciesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            RoutingPoliciesFetcher fetcher = obj.getRoutingPolicies();
            return addFetcher(Constants.ROUTINGPOLICIES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static SharedNetworkResourcesFetcher getSharedNetworkResourcesFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            SharedNetworkResourcesFetcher fetcher = obj.getSharedNetworkResources();
            return addFetcher(Constants.SHAREDNETWORKRESOURCES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static UsersFetcher getUsersFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            UsersFetcher fetcher = obj.getUsers();
            return addFetcher(Constants.USERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static ZFBRequestsFetcher getZFBRequestsFetcherForEnterpriseId(String id) throws RestException {
        Enterprise obj = getObject(Constants.ENTERPRISE, id);
        if (obj == null) {
            obj = getEnterpriseById(id);
        }

        if (obj != null) {
            ZFBRequestsFetcher fetcher = obj.getZFBRequests();
            return addFetcher(Constants.ZFBREQUESTS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Enterprise> getEnterprisesForFetcherId(String id) throws RestException {
        EnterprisesFetcher fetcher = getEnterprisesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.ENTERPRISE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Enterprise>();
    }

    public static EnterprisesFetcher getEnterprisesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.ENTERPRISES_FETCHER, id);
        if (fetcher != null) {
            return (EnterprisesFetcher) fetcher;
        }
        if ((fetcher = getEnterprisesFetcherForEnterpriseProfileId(id)) != null) {
            return (EnterprisesFetcher) addFetcher(Constants.ENTERPRISES_FETCHER, fetcher);
        }
        
        if ((fetcher = getEnterprisesFetcherForMeId(id)) != null) {
            return (EnterprisesFetcher) addFetcher(Constants.ENTERPRISES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Enterprise> getAllEnterprises() throws RestException {
        java.util.List<Enterprise> allObjs = new ArrayList<Enterprise>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            EnterprisesFetcher fetcher = getEnterprisesFetcherForMeId(session.getId());
            java.util.List<Enterprise> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<EnterprisesFetcher> getAllEnterprisesFetchers() throws RestException {
        java.util.List<EnterprisesFetcher> allObjs = new ArrayList<EnterprisesFetcher>();
        return allObjs;
    }
    public static Link getLinkById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            Link obj = null;
            obj = new Link();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.LINK, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static DemarcationServicesFetcher getDemarcationServicesFetcherForLinkId(String id) throws RestException {
        Link obj = getObject(Constants.LINK, id);
        if (obj == null) {
            obj = getLinkById(id);
        }

        if (obj != null) {
            DemarcationServicesFetcher fetcher = obj.getDemarcationServices();
            return addFetcher(Constants.DEMARCATIONSERVICES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForLinkId(String id) throws RestException {
        Link obj = getObject(Constants.LINK, id);
        if (obj == null) {
            obj = getLinkById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForLinkId(String id) throws RestException {
        Link obj = getObject(Constants.LINK, id);
        if (obj == null) {
            obj = getLinkById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static NextHopAddressFetcher getNextHopAddressFetcherForLinkId(String id) throws RestException {
        Link obj = getObject(Constants.LINK, id);
        if (obj == null) {
            obj = getLinkById(id);
        }

        if (obj != null) {
            NextHopAddressFetcher fetcher = obj.getNextHopAddress();
            return addFetcher(Constants.NEXTHOPADDRESS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static OverlayAddressPoolsFetcher getOverlayAddressPoolsFetcherForLinkId(String id) throws RestException {
        Link obj = getObject(Constants.LINK, id);
        if (obj == null) {
            obj = getLinkById(id);
        }

        if (obj != null) {
            OverlayAddressPoolsFetcher fetcher = obj.getOverlayAddressPools();
            return addFetcher(Constants.OVERLAYADDRESSPOOLS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<Link> getLinksForFetcherId(String id) throws RestException {
        LinksFetcher fetcher = getLinksFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.LINK);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<Link>();
    }

    public static LinksFetcher getLinksFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.LINKS_FETCHER, id);
        if (fetcher != null) {
            return (LinksFetcher) fetcher;
        }
        if ((fetcher = getLinksFetcherForDomainId(id)) != null) {
            return (LinksFetcher) addFetcher(Constants.LINKS_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<Link> getAllLinks() throws RestException {
        java.util.List<Link> allObjs = new ArrayList<Link>();

        return allObjs;
    }

    public static java.util.List<LinksFetcher> getAllLinksFetchers() throws RestException {
        java.util.List<LinksFetcher> allObjs = new ArrayList<LinksFetcher>();
        return allObjs;
    }
    public static IngressACLTemplate getIngressACLTemplateById(String id) {
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressACLTemplate obj = null;
            obj = new IngressACLTemplate();
            obj.setId(id);

            try {
                session.fetch(obj);
                return addObject(Constants.INGRESSACLTEMPLATE, obj);
            } catch (RestException | HttpClientErrorException ex) {
                // Object not found in session
            }

            
        }

        return null;
    }
    public static ContainersFetcher getContainersFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            ContainersFetcher fetcher = obj.getContainers();
            return addFetcher(Constants.CONTAINERS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static EventLogsFetcher getEventLogsFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            EventLogsFetcher fetcher = obj.getEventLogs();
            return addFetcher(Constants.EVENTLOGS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static GlobalMetadatasFetcher getGlobalMetadatasFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            GlobalMetadatasFetcher fetcher = obj.getGlobalMetadatas();
            return addFetcher(Constants.GLOBALMETADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static IngressACLEntryTemplatesFetcher getIngressACLEntryTemplatesFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            IngressACLEntryTemplatesFetcher fetcher = obj.getIngressACLEntryTemplates();
            return addFetcher(Constants.INGRESSACLENTRYTEMPLATES_FETCHER, fetcher);
        }

        return null;
    }
    
    public static JobsFetcher getJobsFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            JobsFetcher fetcher = obj.getJobs();
            return addFetcher(Constants.JOBS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static MetadatasFetcher getMetadatasFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            MetadatasFetcher fetcher = obj.getMetadatas();
            return addFetcher(Constants.METADATAS_FETCHER, fetcher);
        }

        return null;
    }
    
    public static VMsFetcher getVMsFetcherForIngressACLTemplateId(String id) throws RestException {
        IngressACLTemplate obj = getObject(Constants.INGRESSACLTEMPLATE, id);
        if (obj == null) {
            obj = getIngressACLTemplateById(id);
        }

        if (obj != null) {
            VMsFetcher fetcher = obj.getVMs();
            return addFetcher(Constants.VMS_FETCHER, fetcher);
        }

        return null;
    }
    public static java.util.List<IngressACLTemplate> getIngressACLTemplatesForFetcherId(String id) throws RestException {
        IngressACLTemplatesFetcher fetcher = getIngressACLTemplatesFetcherById(id);
        if (fetcher != null) {
            try {
                Session session = fetcher.getSession();
                session.fetch(fetcher);
                return addFetcherObjects(fetcher, Constants.INGRESSACLTEMPLATE);
            } catch (RestException | HttpClientErrorException ex) {
                // Error fetching objects
            }
        }

        return new ArrayList<IngressACLTemplate>();
    }

    public static IngressACLTemplatesFetcher getIngressACLTemplatesFetcherById(String id) throws RestException {
        BaseFetcher<? extends BaseObjectExtensions> fetcher = getFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, id);
        if (fetcher != null) {
            return (IngressACLTemplatesFetcher) fetcher;
        }
        if ((fetcher = getIngressACLTemplatesFetcherForDomainId(id)) != null) {
            return (IngressACLTemplatesFetcher) addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLTemplatesFetcherForL2DomainTemplateId(id)) != null) {
            return (IngressACLTemplatesFetcher) addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLTemplatesFetcherForL2DomainId(id)) != null) {
            return (IngressACLTemplatesFetcher) addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLTemplatesFetcherForMeId(id)) != null) {
            return (IngressACLTemplatesFetcher) addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        
        if ((fetcher = getIngressACLTemplatesFetcherForDomainTemplateId(id)) != null) {
            return (IngressACLTemplatesFetcher) addFetcher(Constants.INGRESSACLTEMPLATES_FETCHER, fetcher);
        }
        return null;
    }

    public static java.util.List<IngressACLTemplate> getAllIngressACLTemplates() throws RestException {
        java.util.List<IngressACLTemplate> allObjs = new ArrayList<IngressACLTemplate>();
        for (Session session : SessionManager.getInstance().getSessions()) {
            IngressACLTemplatesFetcher fetcher = getIngressACLTemplatesFetcherForMeId(session.getId());
            java.util.List<IngressACLTemplate> objs = session.fetch(fetcher);
            allObjs.addAll(objs);
        }
        

        return allObjs;
    }

    public static java.util.List<IngressACLTemplatesFetcher> getAllIngressACLTemplatesFetchers() throws RestException {
        java.util.List<IngressACLTemplatesFetcher> allObjs = new ArrayList<IngressACLTemplatesFetcher>();
        return allObjs;
    }
}