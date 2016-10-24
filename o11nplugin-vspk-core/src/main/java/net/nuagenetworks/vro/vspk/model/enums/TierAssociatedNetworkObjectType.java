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

@VsoFinder(name = Constants.TIER_ASSOCIATEDNETWORKOBJECTTYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum TierAssociatedNetworkObjectType {

    ACLENTRY_LOCATION("ACLENTRY_LOCATION", "ACLENTRY_LOCATION"), ADDRESS_RANGE("ADDRESS_RANGE", "ADDRESS_RANGE"), ADDRESS_RANGE_STATE("ADDRESS_RANGE_STATE", "ADDRESS_RANGE_STATE"), ALARM("ALARM", "ALARM"), APPD_APPLICATION("APPD_APPLICATION", "APPD_APPLICATION"), APPD_EXTERNAL_APP_SERVICE("APPD_EXTERNAL_APP_SERVICE", "APPD_EXTERNAL_APP_SERVICE"), APPD_FLOW("APPD_FLOW", "APPD_FLOW"), APPD_FLOW_FORWARDING_POLICY("APPD_FLOW_FORWARDING_POLICY", "APPD_FLOW_FORWARDING_POLICY"), APPD_FLOW_SECURITY_POLICY("APPD_FLOW_SECURITY_POLICY", "APPD_FLOW_SECURITY_POLICY"), APPD_SERVICE("APPD_SERVICE", "APPD_SERVICE"), APPD_TIER("APPD_TIER", "APPD_TIER"), APPLICATION("APPLICATION", "APPLICATION"), AUTO_DISC_GATEWAY("AUTO_DISC_GATEWAY", "AUTO_DISC_GATEWAY"), BACK_HAUL_SERVICE_RESP("BACK_HAUL_SERVICE_RESP", "BACK_HAUL_SERVICE_RESP"), BGPPEER("BGPPEER", "BGPPEER"), BGP_DAMPENING_MED_RESPONSE("BGP_DAMPENING_MED_RESPONSE", "BGP_DAMPENING_MED_RESPONSE"), BGP_NEIGHBOR("BGP_NEIGHBOR", "BGP_NEIGHBOR"), BGP_NEIGHBOR_MED_RESPONSE("BGP_NEIGHBOR_MED_RESPONSE", "BGP_NEIGHBOR_MED_RESPONSE"), BGP_PROFILE("BGP_PROFILE", "BGP_PROFILE"), BGP_PROFILE_MED_RESPONSE("BGP_PROFILE_MED_RESPONSE", "BGP_PROFILE_MED_RESPONSE"), BOOTSTRAP("BOOTSTRAP", "BOOTSTRAP"), BOOTSTRAP_ACTIVATION("BOOTSTRAP_ACTIVATION", "BOOTSTRAP_ACTIVATION"), BRIDGEINTERFACE("BRIDGEINTERFACE", "BRIDGEINTERFACE"), CERTIFICATE("CERTIFICATE", "CERTIFICATE"), CHILD_ENTITY_POLICY_CHANGE("CHILD_ENTITY_POLICY_CHANGE", "CHILD_ENTITY_POLICY_CHANGE"), CLOUD_MGMT_SYSTEM("CLOUD_MGMT_SYSTEM", "CLOUD_MGMT_SYSTEM"), CONTAINER_RESYNC("CONTAINER_RESYNC", "CONTAINER_RESYNC"), CUSTOMER_VRF_SEQUENCENO("CUSTOMER_VRF_SEQUENCENO", "CUSTOMER_VRF_SEQUENCENO"), DC_CONFIG("DC_CONFIG", "DC_CONFIG"), DHCP_ALLOC_MESSAGE("DHCP_ALLOC_MESSAGE", "DHCP_ALLOC_MESSAGE"), DHCP_CONFIG_RESP("DHCP_CONFIG_RESP", "DHCP_CONFIG_RESP"), DHCP_OPTION("DHCP_OPTION", "DHCP_OPTION"), DISKSTATS("DISKSTATS", "DISKSTATS"), DOMAIN("DOMAIN", "DOMAIN"), DOMAIN_CONFIG("DOMAIN_CONFIG", "DOMAIN_CONFIG"), DOMAIN_CONFIG_RESP("DOMAIN_CONFIG_RESP", "DOMAIN_CONFIG_RESP"), DOMAIN_FLOATING_IP_ACL_TEMPLATE("DOMAIN_FLOATING_IP_ACL_TEMPLATE", "DOMAIN_FLOATING_IP_ACL_TEMPLATE"), DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY("DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY", "DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY"), DOMAIN_TEMPLATE("DOMAIN_TEMPLATE", "DOMAIN_TEMPLATE"), DSCP_FORWARDING_CLASS_MAPPING("DSCP_FORWARDING_CLASS_MAPPING", "DSCP_FORWARDING_CLASS_MAPPING"), DSCP_FORWARDING_CLASS_TABLE("DSCP_FORWARDING_CLASS_TABLE", "DSCP_FORWARDING_CLASS_TABLE"), EGRESS_ACL("EGRESS_ACL", "EGRESS_ACL"), EGRESS_ACL_ENTRY("EGRESS_ACL_ENTRY", "EGRESS_ACL_ENTRY"), EGRESS_ACL_TEMPLATE("EGRESS_ACL_TEMPLATE", "EGRESS_ACL_TEMPLATE"), EGRESS_ACL_TEMPLATE_ENTRY("EGRESS_ACL_TEMPLATE_ENTRY", "EGRESS_ACL_TEMPLATE_ENTRY"), EGRESS_QOS_MR("EGRESS_QOS_MR", "EGRESS_QOS_MR"), EGRESS_QOS_PRIMITIVE("EGRESS_QOS_PRIMITIVE", "EGRESS_QOS_PRIMITIVE"), EGRESS_QOS_QUEUE_MR("EGRESS_QOS_QUEUE_MR", "EGRESS_QOS_QUEUE_MR"), ENDPOINT("ENDPOINT", "ENDPOINT"), ENTERPRISE("ENTERPRISE", "ENTERPRISE"), ENTERPRISE_CONFIG("ENTERPRISE_CONFIG", "ENTERPRISE_CONFIG"), ENTERPRISE_CONFIG_RESP("ENTERPRISE_CONFIG_RESP", "ENTERPRISE_CONFIG_RESP"), ENTERPRISE_NETWORK("ENTERPRISE_NETWORK", "ENTERPRISE_NETWORK"), ENTERPRISE_PERMISSION("ENTERPRISE_PERMISSION", "ENTERPRISE_PERMISSION"), ENTERPRISE_PROFILE("ENTERPRISE_PROFILE", "ENTERPRISE_PROFILE"), ENTERPRISE_SECURED_DATA("ENTERPRISE_SECURED_DATA", "ENTERPRISE_SECURED_DATA"), ENTERPRISE_SECURITY("ENTERPRISE_SECURITY", "ENTERPRISE_SECURITY"), ENTITY_METADATA_BINDING("ENTITY_METADATA_BINDING", "ENTITY_METADATA_BINDING"), ESI_SEQUENCENO("ESI_SEQUENCENO", "ESI_SEQUENCENO"), EVENT_LOG("EVENT_LOG", "EVENT_LOG"), EVPN_BGP_COMMUNITY_TAG_ENTRY("EVPN_BGP_COMMUNITY_TAG_ENTRY", "EVPN_BGP_COMMUNITY_TAG_ENTRY"), EVPN_BGP_COMMUNITY_TAG_SEQ_NO("EVPN_BGP_COMMUNITY_TAG_SEQ_NO", "EVPN_BGP_COMMUNITY_TAG_SEQ_NO"), EXPORTIMPORT("EXPORTIMPORT", "EXPORTIMPORT"), EXTERNAL_SERVICE("EXTERNAL_SERVICE", "EXTERNAL_SERVICE"), FLOATINGIP("FLOATINGIP", "FLOATINGIP"), FLOATINGIP_ACL("FLOATINGIP_ACL", "FLOATINGIP_ACL"), FLOATINGIP_ACL_ENTRY("FLOATINGIP_ACL_ENTRY", "FLOATINGIP_ACL_ENTRY"), FLOATING_IP_ACL_TEMPLATE("FLOATING_IP_ACL_TEMPLATE", "FLOATING_IP_ACL_TEMPLATE"), FLOATING_IP_ACL_TEMPLATE_ENTRY("FLOATING_IP_ACL_TEMPLATE_ENTRY", "FLOATING_IP_ACL_TEMPLATE_ENTRY"), GATEWAY("GATEWAY", "GATEWAY"), GATEWAY_CONFIG("GATEWAY_CONFIG", "GATEWAY_CONFIG"), GATEWAY_CONFIG_RESP("GATEWAY_CONFIG_RESP", "GATEWAY_CONFIG_RESP"), GATEWAY_SECURED_DATA("GATEWAY_SECURED_DATA", "GATEWAY_SECURED_DATA"), GATEWAY_SECURITY("GATEWAY_SECURITY", "GATEWAY_SECURITY"), GATEWAY_SECURITY_PROFILE_REQUEST("GATEWAY_SECURITY_PROFILE_REQUEST", "GATEWAY_SECURITY_PROFILE_REQUEST"), GATEWAY_SECURITY_PROFILE_RESPONSE("GATEWAY_SECURITY_PROFILE_RESPONSE", "GATEWAY_SECURITY_PROFILE_RESPONSE"), GATEWAY_SECURITY_REQUEST("GATEWAY_SECURITY_REQUEST", "GATEWAY_SECURITY_REQUEST"), GATEWAY_SECURITY_RESPONSE("GATEWAY_SECURITY_RESPONSE", "GATEWAY_SECURITY_RESPONSE"), GATEWAY_SERVICE_CONFIG("GATEWAY_SERVICE_CONFIG", "GATEWAY_SERVICE_CONFIG"), GATEWAY_SERVICE_CONFIG_RESP("GATEWAY_SERVICE_CONFIG_RESP", "GATEWAY_SERVICE_CONFIG_RESP"), GATEWAY_TEMPLATE("GATEWAY_TEMPLATE", "GATEWAY_TEMPLATE"), GATEWAY_VPORT_CONFIG("GATEWAY_VPORT_CONFIG", "GATEWAY_VPORT_CONFIG"), GATEWAY_VPORT_CONFIG_RESP("GATEWAY_VPORT_CONFIG_RESP", "GATEWAY_VPORT_CONFIG_RESP"), GEO_VM_EVENT("GEO_VM_EVENT", "GEO_VM_EVENT"), GEO_VM_REQ("GEO_VM_REQ", "GEO_VM_REQ"), GEO_VM_RES("GEO_VM_RES", "GEO_VM_RES"), GROUP("GROUP", "GROUP"), GROUPKEY_ENCRYPTION_PROFILE("GROUPKEY_ENCRYPTION_PROFILE", "GROUPKEY_ENCRYPTION_PROFILE"), HEALTH_REQ("HEALTH_REQ", "HEALTH_REQ"), HOSTINTERFACE("HOSTINTERFACE", "HOSTINTERFACE"), HSC("HSC", "HSC"), IKE_ENCRYPTION_PROFILE("IKE_ENCRYPTION_PROFILE", "IKE_ENCRYPTION_PROFILE"), IKE_GATEWAY("IKE_GATEWAY", "IKE_GATEWAY"), IKE_GATEWAY_CONFIG("IKE_GATEWAY_CONFIG", "IKE_GATEWAY_CONFIG"), IKE_GATEWAY_PROFILE("IKE_GATEWAY_PROFILE", "IKE_GATEWAY_PROFILE"), IKE_GATEWAY_CONNECTION("IKE_GATEWAY_CONNECTION", "IKE_GATEWAY_CONNECTION"), IKE_CERTIFICATE("IKE_CERTIFICATE", "IKE_CERTIFICATE"), IKE_PSK("IKE_PSK", "IKE_PSK"), IKE_SUBNET("IKE_SUBNET", "IKE_SUBNET"), INFRASTRUCTURE_CONFIG("INFRASTRUCTURE_CONFIG", "INFRASTRUCTURE_CONFIG"), INFRASTRUCTURE_GATEWAY_PROFILE("INFRASTRUCTURE_GATEWAY_PROFILE", "INFRASTRUCTURE_GATEWAY_PROFILE"), INFRASTRUCTURE_PORT_PROFILE("INFRASTRUCTURE_PORT_PROFILE", "INFRASTRUCTURE_PORT_PROFILE"), INFRASTRUCTURE_VSC_PROFILE("INFRASTRUCTURE_VSC_PROFILE", "INFRASTRUCTURE_VSC_PROFILE"), INGRESS_ACL("INGRESS_ACL", "INGRESS_ACL"), INGRESS_ACL_ENTRY("INGRESS_ACL_ENTRY", "INGRESS_ACL_ENTRY"), INGRESS_ACL_TEMPLATE("INGRESS_ACL_TEMPLATE", "INGRESS_ACL_TEMPLATE"), INGRESS_ACL_TEMPLATE_ENTRY("INGRESS_ACL_TEMPLATE_ENTRY", "INGRESS_ACL_TEMPLATE_ENTRY"), INGRESS_ADV_FWD("INGRESS_ADV_FWD", "INGRESS_ADV_FWD"), INGRESS_ADV_FWD_ENTRY("INGRESS_ADV_FWD_ENTRY", "INGRESS_ADV_FWD_ENTRY"), INGRESS_ADV_FWD_TEMPLATE("INGRESS_ADV_FWD_TEMPLATE", "INGRESS_ADV_FWD_TEMPLATE"), INGRESS_ADV_FWD_TEMPLATE_ENTRY("INGRESS_ADV_FWD_TEMPLATE_ENTRY", "INGRESS_ADV_FWD_TEMPLATE_ENTRY"), INGRESS_EXT_SERVICE("INGRESS_EXT_SERVICE", "INGRESS_EXT_SERVICE"), INGRESS_EXT_SERVICE_ENTRY("INGRESS_EXT_SERVICE_ENTRY", "INGRESS_EXT_SERVICE_ENTRY"), INGRESS_EXT_SERVICE_TEMPLATE("INGRESS_EXT_SERVICE_TEMPLATE", "INGRESS_EXT_SERVICE_TEMPLATE"), INGRESS_EXT_SERVICE_TEMPLATE_ENTRY("INGRESS_EXT_SERVICE_TEMPLATE_ENTRY", "INGRESS_EXT_SERVICE_TEMPLATE_ENTRY"), IP_BINDING("IP_BINDING", "IP_BINDING"), JOB("JOB", "JOB"), KEYSERVER_MEMBER("KEYSERVER_MEMBER", "KEYSERVER_MEMBER"), KEYSERVER_MONITOR("KEYSERVER_MONITOR", "KEYSERVER_MONITOR"), KEYSERVER_MONITOR_ENCRYPTED_SEED("KEYSERVER_MONITOR_ENCRYPTED_SEED", "KEYSERVER_MONITOR_ENCRYPTED_SEED"), KEYSERVER_MONITOR_SEED("KEYSERVER_MONITOR_SEED", "KEYSERVER_MONITOR_SEED"), KEYSERVER_MONITOR_SEK("KEYSERVER_MONITOR_SEK", "KEYSERVER_MONITOR_SEK"), KEYSERVER_NOTIFICATION("KEYSERVER_NOTIFICATION", "KEYSERVER_NOTIFICATION"), L2DOMAIN("L2DOMAIN", "L2DOMAIN"), L2DOMAIN_SHARED("L2DOMAIN_SHARED", "L2DOMAIN_SHARED"), L2DOMAIN_TEMPLATE("L2DOMAIN_TEMPLATE", "L2DOMAIN_TEMPLATE"), LDAP_CONFIG("LDAP_CONFIG", "LDAP_CONFIG"), LIBVIRT_INTERFACE("LIBVIRT_INTERFACE", "LIBVIRT_INTERFACE"), LICENSE("LICENSE", "LICENSE"), LOCATION("LOCATION", "LOCATION"), MC_CHANNEL_MAP("MC_CHANNEL_MAP", "MC_CHANNEL_MAP"), MC_LIST("MC_LIST", "MC_LIST"), MC_RANGE("MC_RANGE", "MC_RANGE"), METADATA("METADATA", "METADATA"), METADATA_TAG("METADATA_TAG", "METADATA_TAG"), MIRROR_DESTINATION("MIRROR_DESTINATION", "MIRROR_DESTINATION"), MONITORING_PORT("MONITORING_PORT", "MONITORING_PORT"), MULTI_NIC_VPORT("MULTI_NIC_VPORT", "MULTI_NIC_VPORT"), NATMAPENTRY("NATMAPENTRY", "NATMAPENTRY"), NETWORK_ELEMENT("NETWORK_ELEMENT", "NETWORK_ELEMENT"), NETWORK_LAYOUT("NETWORK_LAYOUT", "NETWORK_LAYOUT"), NETWORK_MACRO_GROUP("NETWORK_MACRO_GROUP", "NETWORK_MACRO_GROUP"), NETWORK_POLICY_GROUP("NETWORK_POLICY_GROUP", "NETWORK_POLICY_GROUP"), NEXT_HOP_RESP("NEXT_HOP_RESP", "NEXT_HOP_RESP"), NODE_EXECUTION_ERROR("NODE_EXECUTION_ERROR", "NODE_EXECUTION_ERROR"), NSGATEWAY("NSGATEWAY", "NSGATEWAY"), NSGATEWAY_CONFIG("NSGATEWAY_CONFIG", "NSGATEWAY_CONFIG"), NSGATEWAY_TEMPLATE("NSGATEWAY_TEMPLATE", "NSGATEWAY_TEMPLATE"), NSG_NOTIFICATION("NSG_NOTIFICATION", "NSG_NOTIFICATION"), NSPORT("NSPORT", "NSPORT"), NSPORT_STATIC_CONFIG("NSPORT_STATIC_CONFIG", "NSPORT_STATIC_CONFIG"), NSPORT_TEMPLATE("NSPORT_TEMPLATE", "NSPORT_TEMPLATE"), NSPORT_VLAN_CONFIG("NSPORT_VLAN_CONFIG", "NSPORT_VLAN_CONFIG"), NSREDUNDANT_GW_GRP("NSREDUNDANT_GW_GRP", "NSREDUNDANT_GW_GRP"), NS_REDUNDANT_PORT("NS_REDUNDANT_PORT", "NS_REDUNDANT_PORT"), PATCONFIG_CONFIG_RESP("PATCONFIG_CONFIG_RESP", "PATCONFIG_CONFIG_RESP"), PATNATPOOL("PATNATPOOL", "PATNATPOOL"), PERMISSION("PERMISSION", "PERMISSION"), PERMITTED_ACTION("PERMITTED_ACTION", "PERMITTED_ACTION"), POLICING_POLICY("POLICING_POLICY", "POLICING_POLICY"), POLICY_DECISION("POLICY_DECISION", "POLICY_DECISION"), POLICY_GROUP("POLICY_GROUP", "POLICY_GROUP"), POLICY_GROUP_TEMPLATE("POLICY_GROUP_TEMPLATE", "POLICY_GROUP_TEMPLATE"), PORT("PORT", "PORT"), PORT_MR("PORT_MR", "PORT_MR"), PORT_PUSH("PORT_PUSH", "PORT_PUSH"), PORT_TEMPLATE("PORT_TEMPLATE", "PORT_TEMPLATE"), PORT_VLAN_CONFIG("PORT_VLAN_CONFIG", "PORT_VLAN_CONFIG"), PORT_VLAN_CONFIG_RESPONSE("PORT_VLAN_CONFIG_RESPONSE", "PORT_VLAN_CONFIG_RESPONSE"), PUBLIC_NETWORK("PUBLIC_NETWORK", "PUBLIC_NETWORK"), QOS_PRIMITIVE("QOS_PRIMITIVE", "QOS_PRIMITIVE"), RATE_LIMITER("RATE_LIMITER", "RATE_LIMITER"), RD_SEQUENCENO("RD_SEQUENCENO", "RD_SEQUENCENO"), REDUNDANT_GW_GRP("REDUNDANT_GW_GRP", "REDUNDANT_GW_GRP"), ROUTING_POLICY("ROUTING_POLICY", "ROUTING_POLICY"), ROUTING_POL_MED_RESPONSE("ROUTING_POL_MED_RESPONSE", "ROUTING_POL_MED_RESPONSE"), RTRD_ENTITY("RTRD_ENTITY", "RTRD_ENTITY"), RTRD_SEQUENCENO("RTRD_SEQUENCENO", "RTRD_SEQUENCENO"), SERVICES_GATEWAY_RESPONSE("SERVICES_GATEWAY_RESPONSE", "SERVICES_GATEWAY_RESPONSE"), SERVICE_GATEWAY_RESPONSE("SERVICE_GATEWAY_RESPONSE", "SERVICE_GATEWAY_RESPONSE"), SERVICE_VRF_SEQUENCENO("SERVICE_VRF_SEQUENCENO", "SERVICE_VRF_SEQUENCENO"), SHAPING_POLICY("SHAPING_POLICY", "SHAPING_POLICY"), SHARED_RESOURCE("SHARED_RESOURCE", "SHARED_RESOURCE"), SITE("SITE", "SITE"), SITE_REQ("SITE_REQ", "SITE_REQ"), SITE_RES("SITE_RES", "SITE_RES"), STATIC_ROUTE("STATIC_ROUTE", "STATIC_ROUTE"), STATIC_ROUTE_RESP("STATIC_ROUTE_RESP", "STATIC_ROUTE_RESP"), STATISTICS("STATISTICS", "STATISTICS"), STATSSERVER("STATSSERVER", "STATSSERVER"), STATS_COLLECTOR("STATS_COLLECTOR", "STATS_COLLECTOR"), STATS_POLICY("STATS_POLICY", "STATS_POLICY"), STATS_TCA("STATS_TCA", "STATS_TCA"), SUBNET("SUBNET", "SUBNET"), SUBNET_ENTRY("SUBNET_ENTRY", "SUBNET_ENTRY"), SUBNET_MAC_ENTRY("SUBNET_MAC_ENTRY", "SUBNET_MAC_ENTRY"), SUBNET_POOL_ENTRY("SUBNET_POOL_ENTRY", "SUBNET_POOL_ENTRY"), SUBNET_TEMPLATE("SUBNET_TEMPLATE", "SUBNET_TEMPLATE"), SYSTEM_CONFIG("SYSTEM_CONFIG", "SYSTEM_CONFIG"), SYSTEM_CONFIG_REQ("SYSTEM_CONFIG_REQ", "SYSTEM_CONFIG_REQ"), SYSTEM_CONFIG_RESP("SYSTEM_CONFIG_RESP", "SYSTEM_CONFIG_RESP"), SYSTEM_MONITORING("SYSTEM_MONITORING", "SYSTEM_MONITORING"), UNSUPPORTED("UNSUPPORTED", "UNSUPPORTED"), UPLINK_RD("UPLINK_RD", "UPLINK_RD"), USER("USER", "USER"), VIRTUAL_IP("VIRTUAL_IP", "VIRTUAL_IP"), VIRTUAL_MACHINE("VIRTUAL_MACHINE", "VIRTUAL_MACHINE"), VIRTUAL_MACHINE_REPORT("VIRTUAL_MACHINE_REPORT", "VIRTUAL_MACHINE_REPORT"), VLAN("VLAN", "VLAN"), VLAN_CONFIG_RESPONSE("VLAN_CONFIG_RESPONSE", "VLAN_CONFIG_RESPONSE"), VLAN_TEMPLATE("VLAN_TEMPLATE", "VLAN_TEMPLATE"), VMWARE_RELOAD_CONFIG("VMWARE_RELOAD_CONFIG", "VMWARE_RELOAD_CONFIG"), VMWARE_VCENTER("VMWARE_VCENTER", "VMWARE_VCENTER"), VMWARE_VCENTER_CLUSTER("VMWARE_VCENTER_CLUSTER", "VMWARE_VCENTER_CLUSTER"), VMWARE_VCENTER_DATACENTER("VMWARE_VCENTER_DATACENTER", "VMWARE_VCENTER_DATACENTER"), VMWARE_VCENTER_EAM_CONFIG("VMWARE_VCENTER_EAM_CONFIG", "VMWARE_VCENTER_EAM_CONFIG"), VMWARE_VCENTER_HYPERVISOR("VMWARE_VCENTER_HYPERVISOR", "VMWARE_VCENTER_HYPERVISOR"), VMWARE_VCENTER_VRS_BASE_CONFIG("VMWARE_VCENTER_VRS_BASE_CONFIG", "VMWARE_VCENTER_VRS_BASE_CONFIG"), VMWARE_VCENTER_VRS_CONFIG("VMWARE_VCENTER_VRS_CONFIG", "VMWARE_VCENTER_VRS_CONFIG"), VMWARE_VRS_ADDRESS_RANGE("VMWARE_VRS_ADDRESS_RANGE", "VMWARE_VRS_ADDRESS_RANGE"), VM_DESCRIPTION("VM_DESCRIPTION", "VM_DESCRIPTION"), VM_INTERFACE("VM_INTERFACE", "VM_INTERFACE"), VM_RESYNC("VM_RESYNC", "VM_RESYNC"), VNID_SEQUENCENO("VNID_SEQUENCENO", "VNID_SEQUENCENO"), VPN_CONNECT("VPN_CONNECT", "VPN_CONNECT"), VPORT("VPORT", "VPORT"), VPORTTAG("VPORTTAG", "VPORTTAG"), VPORTTAGTEMPLATE("VPORTTAGTEMPLATE", "VPORTTAGTEMPLATE"), VPORT_GATEWAY_RESPONSE("VPORT_GATEWAY_RESPONSE", "VPORT_GATEWAY_RESPONSE"), VPORT_MEDIATION_REQUEST("VPORT_MEDIATION_REQUEST", "VPORT_MEDIATION_REQUEST"), VPORT_MIRROR("VPORT_MIRROR", "VPORT_MIRROR"), VPORT_TAG_BASE("VPORT_TAG_BASE", "VPORT_TAG_BASE"), VPRN_LABEL_SEQUENCENO("VPRN_LABEL_SEQUENCENO", "VPRN_LABEL_SEQUENCENO"), VRS("VRS", "VRS"), VSC("VSC", "VSC"), VSD("VSD", "VSD"), VSD_COMPONENT("VSD_COMPONENT", "VSD_COMPONENT"), VSG_REDUNDANT_PORT("VSG_REDUNDANT_PORT", "VSG_REDUNDANT_PORT"), VSP("VSP", "VSP"), WAN_SERVICE("WAN_SERVICE", "WAN_SERVICE"), ZONE("ZONE", "ZONE"), ZONE_TEMPLATE("ZONE_TEMPLATE", "ZONE_TEMPLATE");

    private final String id;
    private final String name;
   
    TierAssociatedNetworkObjectType(String id, String name) {
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

    
    @VsoProperty(displayName = "ACLENTRY_LOCATION", readOnly = true)
    public TierAssociatedNetworkObjectType getACLENTRY_LOCATION() {
        return ACLENTRY_LOCATION;
    }
    
    @VsoProperty(displayName = "ADDRESS_RANGE", readOnly = true)
    public TierAssociatedNetworkObjectType getADDRESS_RANGE() {
        return ADDRESS_RANGE;
    }
    
    @VsoProperty(displayName = "ADDRESS_RANGE_STATE", readOnly = true)
    public TierAssociatedNetworkObjectType getADDRESS_RANGE_STATE() {
        return ADDRESS_RANGE_STATE;
    }
    
    @VsoProperty(displayName = "ALARM", readOnly = true)
    public TierAssociatedNetworkObjectType getALARM() {
        return ALARM;
    }
    
    @VsoProperty(displayName = "APPD_APPLICATION", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_APPLICATION() {
        return APPD_APPLICATION;
    }
    
    @VsoProperty(displayName = "APPD_EXTERNAL_APP_SERVICE", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_EXTERNAL_APP_SERVICE() {
        return APPD_EXTERNAL_APP_SERVICE;
    }
    
    @VsoProperty(displayName = "APPD_FLOW", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_FLOW() {
        return APPD_FLOW;
    }
    
    @VsoProperty(displayName = "APPD_FLOW_FORWARDING_POLICY", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_FLOW_FORWARDING_POLICY() {
        return APPD_FLOW_FORWARDING_POLICY;
    }
    
    @VsoProperty(displayName = "APPD_FLOW_SECURITY_POLICY", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_FLOW_SECURITY_POLICY() {
        return APPD_FLOW_SECURITY_POLICY;
    }
    
    @VsoProperty(displayName = "APPD_SERVICE", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_SERVICE() {
        return APPD_SERVICE;
    }
    
    @VsoProperty(displayName = "APPD_TIER", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPD_TIER() {
        return APPD_TIER;
    }
    
    @VsoProperty(displayName = "APPLICATION", readOnly = true)
    public TierAssociatedNetworkObjectType getAPPLICATION() {
        return APPLICATION;
    }
    
    @VsoProperty(displayName = "AUTO_DISC_GATEWAY", readOnly = true)
    public TierAssociatedNetworkObjectType getAUTO_DISC_GATEWAY() {
        return AUTO_DISC_GATEWAY;
    }
    
    @VsoProperty(displayName = "BACK_HAUL_SERVICE_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getBACK_HAUL_SERVICE_RESP() {
        return BACK_HAUL_SERVICE_RESP;
    }
    
    @VsoProperty(displayName = "BGPPEER", readOnly = true)
    public TierAssociatedNetworkObjectType getBGPPEER() {
        return BGPPEER;
    }
    
    @VsoProperty(displayName = "BGP_DAMPENING_MED_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getBGP_DAMPENING_MED_RESPONSE() {
        return BGP_DAMPENING_MED_RESPONSE;
    }
    
    @VsoProperty(displayName = "BGP_NEIGHBOR", readOnly = true)
    public TierAssociatedNetworkObjectType getBGP_NEIGHBOR() {
        return BGP_NEIGHBOR;
    }
    
    @VsoProperty(displayName = "BGP_NEIGHBOR_MED_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getBGP_NEIGHBOR_MED_RESPONSE() {
        return BGP_NEIGHBOR_MED_RESPONSE;
    }
    
    @VsoProperty(displayName = "BGP_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getBGP_PROFILE() {
        return BGP_PROFILE;
    }
    
    @VsoProperty(displayName = "BGP_PROFILE_MED_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getBGP_PROFILE_MED_RESPONSE() {
        return BGP_PROFILE_MED_RESPONSE;
    }
    
    @VsoProperty(displayName = "BOOTSTRAP", readOnly = true)
    public TierAssociatedNetworkObjectType getBOOTSTRAP() {
        return BOOTSTRAP;
    }
    
    @VsoProperty(displayName = "BOOTSTRAP_ACTIVATION", readOnly = true)
    public TierAssociatedNetworkObjectType getBOOTSTRAP_ACTIVATION() {
        return BOOTSTRAP_ACTIVATION;
    }
    
    @VsoProperty(displayName = "BRIDGEINTERFACE", readOnly = true)
    public TierAssociatedNetworkObjectType getBRIDGEINTERFACE() {
        return BRIDGEINTERFACE;
    }
    
    @VsoProperty(displayName = "CERTIFICATE", readOnly = true)
    public TierAssociatedNetworkObjectType getCERTIFICATE() {
        return CERTIFICATE;
    }
    
    @VsoProperty(displayName = "CHILD_ENTITY_POLICY_CHANGE", readOnly = true)
    public TierAssociatedNetworkObjectType getCHILD_ENTITY_POLICY_CHANGE() {
        return CHILD_ENTITY_POLICY_CHANGE;
    }
    
    @VsoProperty(displayName = "CLOUD_MGMT_SYSTEM", readOnly = true)
    public TierAssociatedNetworkObjectType getCLOUD_MGMT_SYSTEM() {
        return CLOUD_MGMT_SYSTEM;
    }
    
    @VsoProperty(displayName = "CONTAINER_RESYNC", readOnly = true)
    public TierAssociatedNetworkObjectType getCONTAINER_RESYNC() {
        return CONTAINER_RESYNC;
    }
    
    @VsoProperty(displayName = "CUSTOMER_VRF_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getCUSTOMER_VRF_SEQUENCENO() {
        return CUSTOMER_VRF_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "DC_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getDC_CONFIG() {
        return DC_CONFIG;
    }
    
    @VsoProperty(displayName = "DHCP_ALLOC_MESSAGE", readOnly = true)
    public TierAssociatedNetworkObjectType getDHCP_ALLOC_MESSAGE() {
        return DHCP_ALLOC_MESSAGE;
    }
    
    @VsoProperty(displayName = "DHCP_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getDHCP_CONFIG_RESP() {
        return DHCP_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "DHCP_OPTION", readOnly = true)
    public TierAssociatedNetworkObjectType getDHCP_OPTION() {
        return DHCP_OPTION;
    }
    
    @VsoProperty(displayName = "DISKSTATS", readOnly = true)
    public TierAssociatedNetworkObjectType getDISKSTATS() {
        return DISKSTATS;
    }
    
    @VsoProperty(displayName = "DOMAIN", readOnly = true)
    public TierAssociatedNetworkObjectType getDOMAIN() {
        return DOMAIN;
    }
    
    @VsoProperty(displayName = "DOMAIN_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getDOMAIN_CONFIG() {
        return DOMAIN_CONFIG;
    }
    
    @VsoProperty(displayName = "DOMAIN_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getDOMAIN_CONFIG_RESP() {
        return DOMAIN_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "DOMAIN_FLOATING_IP_ACL_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getDOMAIN_FLOATING_IP_ACL_TEMPLATE() {
        return DOMAIN_FLOATING_IP_ACL_TEMPLATE;
    }
    
    @VsoProperty(displayName = "DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getDOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY() {
        return DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY;
    }
    
    @VsoProperty(displayName = "DOMAIN_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getDOMAIN_TEMPLATE() {
        return DOMAIN_TEMPLATE;
    }
    
    @VsoProperty(displayName = "DSCP_FORWARDING_CLASS_MAPPING", readOnly = true)
    public TierAssociatedNetworkObjectType getDSCP_FORWARDING_CLASS_MAPPING() {
        return DSCP_FORWARDING_CLASS_MAPPING;
    }
    
    @VsoProperty(displayName = "DSCP_FORWARDING_CLASS_TABLE", readOnly = true)
    public TierAssociatedNetworkObjectType getDSCP_FORWARDING_CLASS_TABLE() {
        return DSCP_FORWARDING_CLASS_TABLE;
    }
    
    @VsoProperty(displayName = "EGRESS_ACL", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_ACL() {
        return EGRESS_ACL;
    }
    
    @VsoProperty(displayName = "EGRESS_ACL_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_ACL_ENTRY() {
        return EGRESS_ACL_ENTRY;
    }
    
    @VsoProperty(displayName = "EGRESS_ACL_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_ACL_TEMPLATE() {
        return EGRESS_ACL_TEMPLATE;
    }
    
    @VsoProperty(displayName = "EGRESS_ACL_TEMPLATE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_ACL_TEMPLATE_ENTRY() {
        return EGRESS_ACL_TEMPLATE_ENTRY;
    }
    
    @VsoProperty(displayName = "EGRESS_QOS_MR", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_QOS_MR() {
        return EGRESS_QOS_MR;
    }
    
    @VsoProperty(displayName = "EGRESS_QOS_PRIMITIVE", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_QOS_PRIMITIVE() {
        return EGRESS_QOS_PRIMITIVE;
    }
    
    @VsoProperty(displayName = "EGRESS_QOS_QUEUE_MR", readOnly = true)
    public TierAssociatedNetworkObjectType getEGRESS_QOS_QUEUE_MR() {
        return EGRESS_QOS_QUEUE_MR;
    }
    
    @VsoProperty(displayName = "ENDPOINT", readOnly = true)
    public TierAssociatedNetworkObjectType getENDPOINT() {
        return ENDPOINT;
    }
    
    @VsoProperty(displayName = "ENTERPRISE", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE() {
        return ENTERPRISE;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_CONFIG() {
        return ENTERPRISE_CONFIG;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_CONFIG_RESP() {
        return ENTERPRISE_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_NETWORK", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_NETWORK() {
        return ENTERPRISE_NETWORK;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_PERMISSION", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_PERMISSION() {
        return ENTERPRISE_PERMISSION;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_PROFILE() {
        return ENTERPRISE_PROFILE;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_SECURED_DATA", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_SECURED_DATA() {
        return ENTERPRISE_SECURED_DATA;
    }
    
    @VsoProperty(displayName = "ENTERPRISE_SECURITY", readOnly = true)
    public TierAssociatedNetworkObjectType getENTERPRISE_SECURITY() {
        return ENTERPRISE_SECURITY;
    }
    
    @VsoProperty(displayName = "ENTITY_METADATA_BINDING", readOnly = true)
    public TierAssociatedNetworkObjectType getENTITY_METADATA_BINDING() {
        return ENTITY_METADATA_BINDING;
    }
    
    @VsoProperty(displayName = "ESI_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getESI_SEQUENCENO() {
        return ESI_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "EVENT_LOG", readOnly = true)
    public TierAssociatedNetworkObjectType getEVENT_LOG() {
        return EVENT_LOG;
    }
    
    @VsoProperty(displayName = "EVPN_BGP_COMMUNITY_TAG_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getEVPN_BGP_COMMUNITY_TAG_ENTRY() {
        return EVPN_BGP_COMMUNITY_TAG_ENTRY;
    }
    
    @VsoProperty(displayName = "EVPN_BGP_COMMUNITY_TAG_SEQ_NO", readOnly = true)
    public TierAssociatedNetworkObjectType getEVPN_BGP_COMMUNITY_TAG_SEQ_NO() {
        return EVPN_BGP_COMMUNITY_TAG_SEQ_NO;
    }
    
    @VsoProperty(displayName = "EXPORTIMPORT", readOnly = true)
    public TierAssociatedNetworkObjectType getEXPORTIMPORT() {
        return EXPORTIMPORT;
    }
    
    @VsoProperty(displayName = "EXTERNAL_SERVICE", readOnly = true)
    public TierAssociatedNetworkObjectType getEXTERNAL_SERVICE() {
        return EXTERNAL_SERVICE;
    }
    
    @VsoProperty(displayName = "FLOATINGIP", readOnly = true)
    public TierAssociatedNetworkObjectType getFLOATINGIP() {
        return FLOATINGIP;
    }
    
    @VsoProperty(displayName = "FLOATINGIP_ACL", readOnly = true)
    public TierAssociatedNetworkObjectType getFLOATINGIP_ACL() {
        return FLOATINGIP_ACL;
    }
    
    @VsoProperty(displayName = "FLOATINGIP_ACL_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getFLOATINGIP_ACL_ENTRY() {
        return FLOATINGIP_ACL_ENTRY;
    }
    
    @VsoProperty(displayName = "FLOATING_IP_ACL_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getFLOATING_IP_ACL_TEMPLATE() {
        return FLOATING_IP_ACL_TEMPLATE;
    }
    
    @VsoProperty(displayName = "FLOATING_IP_ACL_TEMPLATE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getFLOATING_IP_ACL_TEMPLATE_ENTRY() {
        return FLOATING_IP_ACL_TEMPLATE_ENTRY;
    }
    
    @VsoProperty(displayName = "GATEWAY", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY() {
        return GATEWAY;
    }
    
    @VsoProperty(displayName = "GATEWAY_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_CONFIG() {
        return GATEWAY_CONFIG;
    }
    
    @VsoProperty(displayName = "GATEWAY_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_CONFIG_RESP() {
        return GATEWAY_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "GATEWAY_SECURED_DATA", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SECURED_DATA() {
        return GATEWAY_SECURED_DATA;
    }
    
    @VsoProperty(displayName = "GATEWAY_SECURITY", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SECURITY() {
        return GATEWAY_SECURITY;
    }
    
    @VsoProperty(displayName = "GATEWAY_SECURITY_PROFILE_REQUEST", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SECURITY_PROFILE_REQUEST() {
        return GATEWAY_SECURITY_PROFILE_REQUEST;
    }
    
    @VsoProperty(displayName = "GATEWAY_SECURITY_PROFILE_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SECURITY_PROFILE_RESPONSE() {
        return GATEWAY_SECURITY_PROFILE_RESPONSE;
    }
    
    @VsoProperty(displayName = "GATEWAY_SECURITY_REQUEST", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SECURITY_REQUEST() {
        return GATEWAY_SECURITY_REQUEST;
    }
    
    @VsoProperty(displayName = "GATEWAY_SECURITY_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SECURITY_RESPONSE() {
        return GATEWAY_SECURITY_RESPONSE;
    }
    
    @VsoProperty(displayName = "GATEWAY_SERVICE_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SERVICE_CONFIG() {
        return GATEWAY_SERVICE_CONFIG;
    }
    
    @VsoProperty(displayName = "GATEWAY_SERVICE_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_SERVICE_CONFIG_RESP() {
        return GATEWAY_SERVICE_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "GATEWAY_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_TEMPLATE() {
        return GATEWAY_TEMPLATE;
    }
    
    @VsoProperty(displayName = "GATEWAY_VPORT_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_VPORT_CONFIG() {
        return GATEWAY_VPORT_CONFIG;
    }
    
    @VsoProperty(displayName = "GATEWAY_VPORT_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getGATEWAY_VPORT_CONFIG_RESP() {
        return GATEWAY_VPORT_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "GEO_VM_EVENT", readOnly = true)
    public TierAssociatedNetworkObjectType getGEO_VM_EVENT() {
        return GEO_VM_EVENT;
    }
    
    @VsoProperty(displayName = "GEO_VM_REQ", readOnly = true)
    public TierAssociatedNetworkObjectType getGEO_VM_REQ() {
        return GEO_VM_REQ;
    }
    
    @VsoProperty(displayName = "GEO_VM_RES", readOnly = true)
    public TierAssociatedNetworkObjectType getGEO_VM_RES() {
        return GEO_VM_RES;
    }
    
    @VsoProperty(displayName = "GROUP", readOnly = true)
    public TierAssociatedNetworkObjectType getGROUP() {
        return GROUP;
    }
    
    @VsoProperty(displayName = "GROUPKEY_ENCRYPTION_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getGROUPKEY_ENCRYPTION_PROFILE() {
        return GROUPKEY_ENCRYPTION_PROFILE;
    }
    
    @VsoProperty(displayName = "HEALTH_REQ", readOnly = true)
    public TierAssociatedNetworkObjectType getHEALTH_REQ() {
        return HEALTH_REQ;
    }
    
    @VsoProperty(displayName = "HOSTINTERFACE", readOnly = true)
    public TierAssociatedNetworkObjectType getHOSTINTERFACE() {
        return HOSTINTERFACE;
    }
    
    @VsoProperty(displayName = "HSC", readOnly = true)
    public TierAssociatedNetworkObjectType getHSC() {
        return HSC;
    }
    
    @VsoProperty(displayName = "IKE_ENCRYPTION_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_ENCRYPTION_PROFILE() {
        return IKE_ENCRYPTION_PROFILE;
    }
    
    @VsoProperty(displayName = "IKE_GATEWAY", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_GATEWAY() {
        return IKE_GATEWAY;
    }
    
    @VsoProperty(displayName = "IKE_GATEWAY_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_GATEWAY_CONFIG() {
        return IKE_GATEWAY_CONFIG;
    }
    
    @VsoProperty(displayName = "IKE_GATEWAY_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_GATEWAY_PROFILE() {
        return IKE_GATEWAY_PROFILE;
    }
    
    @VsoProperty(displayName = "IKE_GATEWAY_CONNECTION", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_GATEWAY_CONNECTION() {
        return IKE_GATEWAY_CONNECTION;
    }
    
    @VsoProperty(displayName = "IKE_CERTIFICATE", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_CERTIFICATE() {
        return IKE_CERTIFICATE;
    }
    
    @VsoProperty(displayName = "IKE_PSK", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_PSK() {
        return IKE_PSK;
    }
    
    @VsoProperty(displayName = "IKE_SUBNET", readOnly = true)
    public TierAssociatedNetworkObjectType getIKE_SUBNET() {
        return IKE_SUBNET;
    }
    
    @VsoProperty(displayName = "INFRASTRUCTURE_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getINFRASTRUCTURE_CONFIG() {
        return INFRASTRUCTURE_CONFIG;
    }
    
    @VsoProperty(displayName = "INFRASTRUCTURE_GATEWAY_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getINFRASTRUCTURE_GATEWAY_PROFILE() {
        return INFRASTRUCTURE_GATEWAY_PROFILE;
    }
    
    @VsoProperty(displayName = "INFRASTRUCTURE_PORT_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getINFRASTRUCTURE_PORT_PROFILE() {
        return INFRASTRUCTURE_PORT_PROFILE;
    }
    
    @VsoProperty(displayName = "INFRASTRUCTURE_VSC_PROFILE", readOnly = true)
    public TierAssociatedNetworkObjectType getINFRASTRUCTURE_VSC_PROFILE() {
        return INFRASTRUCTURE_VSC_PROFILE;
    }
    
    @VsoProperty(displayName = "INGRESS_ACL", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ACL() {
        return INGRESS_ACL;
    }
    
    @VsoProperty(displayName = "INGRESS_ACL_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ACL_ENTRY() {
        return INGRESS_ACL_ENTRY;
    }
    
    @VsoProperty(displayName = "INGRESS_ACL_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ACL_TEMPLATE() {
        return INGRESS_ACL_TEMPLATE;
    }
    
    @VsoProperty(displayName = "INGRESS_ACL_TEMPLATE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ACL_TEMPLATE_ENTRY() {
        return INGRESS_ACL_TEMPLATE_ENTRY;
    }
    
    @VsoProperty(displayName = "INGRESS_ADV_FWD", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ADV_FWD() {
        return INGRESS_ADV_FWD;
    }
    
    @VsoProperty(displayName = "INGRESS_ADV_FWD_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ADV_FWD_ENTRY() {
        return INGRESS_ADV_FWD_ENTRY;
    }
    
    @VsoProperty(displayName = "INGRESS_ADV_FWD_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ADV_FWD_TEMPLATE() {
        return INGRESS_ADV_FWD_TEMPLATE;
    }
    
    @VsoProperty(displayName = "INGRESS_ADV_FWD_TEMPLATE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_ADV_FWD_TEMPLATE_ENTRY() {
        return INGRESS_ADV_FWD_TEMPLATE_ENTRY;
    }
    
    @VsoProperty(displayName = "INGRESS_EXT_SERVICE", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_EXT_SERVICE() {
        return INGRESS_EXT_SERVICE;
    }
    
    @VsoProperty(displayName = "INGRESS_EXT_SERVICE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_EXT_SERVICE_ENTRY() {
        return INGRESS_EXT_SERVICE_ENTRY;
    }
    
    @VsoProperty(displayName = "INGRESS_EXT_SERVICE_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_EXT_SERVICE_TEMPLATE() {
        return INGRESS_EXT_SERVICE_TEMPLATE;
    }
    
    @VsoProperty(displayName = "INGRESS_EXT_SERVICE_TEMPLATE_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getINGRESS_EXT_SERVICE_TEMPLATE_ENTRY() {
        return INGRESS_EXT_SERVICE_TEMPLATE_ENTRY;
    }
    
    @VsoProperty(displayName = "IP_BINDING", readOnly = true)
    public TierAssociatedNetworkObjectType getIP_BINDING() {
        return IP_BINDING;
    }
    
    @VsoProperty(displayName = "JOB", readOnly = true)
    public TierAssociatedNetworkObjectType getJOB() {
        return JOB;
    }
    
    @VsoProperty(displayName = "KEYSERVER_MEMBER", readOnly = true)
    public TierAssociatedNetworkObjectType getKEYSERVER_MEMBER() {
        return KEYSERVER_MEMBER;
    }
    
    @VsoProperty(displayName = "KEYSERVER_MONITOR", readOnly = true)
    public TierAssociatedNetworkObjectType getKEYSERVER_MONITOR() {
        return KEYSERVER_MONITOR;
    }
    
    @VsoProperty(displayName = "KEYSERVER_MONITOR_ENCRYPTED_SEED", readOnly = true)
    public TierAssociatedNetworkObjectType getKEYSERVER_MONITOR_ENCRYPTED_SEED() {
        return KEYSERVER_MONITOR_ENCRYPTED_SEED;
    }
    
    @VsoProperty(displayName = "KEYSERVER_MONITOR_SEED", readOnly = true)
    public TierAssociatedNetworkObjectType getKEYSERVER_MONITOR_SEED() {
        return KEYSERVER_MONITOR_SEED;
    }
    
    @VsoProperty(displayName = "KEYSERVER_MONITOR_SEK", readOnly = true)
    public TierAssociatedNetworkObjectType getKEYSERVER_MONITOR_SEK() {
        return KEYSERVER_MONITOR_SEK;
    }
    
    @VsoProperty(displayName = "KEYSERVER_NOTIFICATION", readOnly = true)
    public TierAssociatedNetworkObjectType getKEYSERVER_NOTIFICATION() {
        return KEYSERVER_NOTIFICATION;
    }
    
    @VsoProperty(displayName = "L2DOMAIN", readOnly = true)
    public TierAssociatedNetworkObjectType getL2DOMAIN() {
        return L2DOMAIN;
    }
    
    @VsoProperty(displayName = "L2DOMAIN_SHARED", readOnly = true)
    public TierAssociatedNetworkObjectType getL2DOMAIN_SHARED() {
        return L2DOMAIN_SHARED;
    }
    
    @VsoProperty(displayName = "L2DOMAIN_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getL2DOMAIN_TEMPLATE() {
        return L2DOMAIN_TEMPLATE;
    }
    
    @VsoProperty(displayName = "LDAP_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getLDAP_CONFIG() {
        return LDAP_CONFIG;
    }
    
    @VsoProperty(displayName = "LIBVIRT_INTERFACE", readOnly = true)
    public TierAssociatedNetworkObjectType getLIBVIRT_INTERFACE() {
        return LIBVIRT_INTERFACE;
    }
    
    @VsoProperty(displayName = "LICENSE", readOnly = true)
    public TierAssociatedNetworkObjectType getLICENSE() {
        return LICENSE;
    }
    
    @VsoProperty(displayName = "LOCATION", readOnly = true)
    public TierAssociatedNetworkObjectType getLOCATION() {
        return LOCATION;
    }
    
    @VsoProperty(displayName = "MC_CHANNEL_MAP", readOnly = true)
    public TierAssociatedNetworkObjectType getMC_CHANNEL_MAP() {
        return MC_CHANNEL_MAP;
    }
    
    @VsoProperty(displayName = "MC_LIST", readOnly = true)
    public TierAssociatedNetworkObjectType getMC_LIST() {
        return MC_LIST;
    }
    
    @VsoProperty(displayName = "MC_RANGE", readOnly = true)
    public TierAssociatedNetworkObjectType getMC_RANGE() {
        return MC_RANGE;
    }
    
    @VsoProperty(displayName = "METADATA", readOnly = true)
    public TierAssociatedNetworkObjectType getMETADATA() {
        return METADATA;
    }
    
    @VsoProperty(displayName = "METADATA_TAG", readOnly = true)
    public TierAssociatedNetworkObjectType getMETADATA_TAG() {
        return METADATA_TAG;
    }
    
    @VsoProperty(displayName = "MIRROR_DESTINATION", readOnly = true)
    public TierAssociatedNetworkObjectType getMIRROR_DESTINATION() {
        return MIRROR_DESTINATION;
    }
    
    @VsoProperty(displayName = "MONITORING_PORT", readOnly = true)
    public TierAssociatedNetworkObjectType getMONITORING_PORT() {
        return MONITORING_PORT;
    }
    
    @VsoProperty(displayName = "MULTI_NIC_VPORT", readOnly = true)
    public TierAssociatedNetworkObjectType getMULTI_NIC_VPORT() {
        return MULTI_NIC_VPORT;
    }
    
    @VsoProperty(displayName = "NATMAPENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getNATMAPENTRY() {
        return NATMAPENTRY;
    }
    
    @VsoProperty(displayName = "NETWORK_ELEMENT", readOnly = true)
    public TierAssociatedNetworkObjectType getNETWORK_ELEMENT() {
        return NETWORK_ELEMENT;
    }
    
    @VsoProperty(displayName = "NETWORK_LAYOUT", readOnly = true)
    public TierAssociatedNetworkObjectType getNETWORK_LAYOUT() {
        return NETWORK_LAYOUT;
    }
    
    @VsoProperty(displayName = "NETWORK_MACRO_GROUP", readOnly = true)
    public TierAssociatedNetworkObjectType getNETWORK_MACRO_GROUP() {
        return NETWORK_MACRO_GROUP;
    }
    
    @VsoProperty(displayName = "NETWORK_POLICY_GROUP", readOnly = true)
    public TierAssociatedNetworkObjectType getNETWORK_POLICY_GROUP() {
        return NETWORK_POLICY_GROUP;
    }
    
    @VsoProperty(displayName = "NEXT_HOP_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getNEXT_HOP_RESP() {
        return NEXT_HOP_RESP;
    }
    
    @VsoProperty(displayName = "NODE_EXECUTION_ERROR", readOnly = true)
    public TierAssociatedNetworkObjectType getNODE_EXECUTION_ERROR() {
        return NODE_EXECUTION_ERROR;
    }
    
    @VsoProperty(displayName = "NSGATEWAY", readOnly = true)
    public TierAssociatedNetworkObjectType getNSGATEWAY() {
        return NSGATEWAY;
    }
    
    @VsoProperty(displayName = "NSGATEWAY_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getNSGATEWAY_CONFIG() {
        return NSGATEWAY_CONFIG;
    }
    
    @VsoProperty(displayName = "NSGATEWAY_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getNSGATEWAY_TEMPLATE() {
        return NSGATEWAY_TEMPLATE;
    }
    
    @VsoProperty(displayName = "NSG_NOTIFICATION", readOnly = true)
    public TierAssociatedNetworkObjectType getNSG_NOTIFICATION() {
        return NSG_NOTIFICATION;
    }
    
    @VsoProperty(displayName = "NSPORT", readOnly = true)
    public TierAssociatedNetworkObjectType getNSPORT() {
        return NSPORT;
    }
    
    @VsoProperty(displayName = "NSPORT_STATIC_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getNSPORT_STATIC_CONFIG() {
        return NSPORT_STATIC_CONFIG;
    }
    
    @VsoProperty(displayName = "NSPORT_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getNSPORT_TEMPLATE() {
        return NSPORT_TEMPLATE;
    }
    
    @VsoProperty(displayName = "NSPORT_VLAN_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getNSPORT_VLAN_CONFIG() {
        return NSPORT_VLAN_CONFIG;
    }
    
    @VsoProperty(displayName = "NSREDUNDANT_GW_GRP", readOnly = true)
    public TierAssociatedNetworkObjectType getNSREDUNDANT_GW_GRP() {
        return NSREDUNDANT_GW_GRP;
    }
    
    @VsoProperty(displayName = "NS_REDUNDANT_PORT", readOnly = true)
    public TierAssociatedNetworkObjectType getNS_REDUNDANT_PORT() {
        return NS_REDUNDANT_PORT;
    }
    
    @VsoProperty(displayName = "PATCONFIG_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getPATCONFIG_CONFIG_RESP() {
        return PATCONFIG_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "PATNATPOOL", readOnly = true)
    public TierAssociatedNetworkObjectType getPATNATPOOL() {
        return PATNATPOOL;
    }
    
    @VsoProperty(displayName = "PERMISSION", readOnly = true)
    public TierAssociatedNetworkObjectType getPERMISSION() {
        return PERMISSION;
    }
    
    @VsoProperty(displayName = "PERMITTED_ACTION", readOnly = true)
    public TierAssociatedNetworkObjectType getPERMITTED_ACTION() {
        return PERMITTED_ACTION;
    }
    
    @VsoProperty(displayName = "POLICING_POLICY", readOnly = true)
    public TierAssociatedNetworkObjectType getPOLICING_POLICY() {
        return POLICING_POLICY;
    }
    
    @VsoProperty(displayName = "POLICY_DECISION", readOnly = true)
    public TierAssociatedNetworkObjectType getPOLICY_DECISION() {
        return POLICY_DECISION;
    }
    
    @VsoProperty(displayName = "POLICY_GROUP", readOnly = true)
    public TierAssociatedNetworkObjectType getPOLICY_GROUP() {
        return POLICY_GROUP;
    }
    
    @VsoProperty(displayName = "POLICY_GROUP_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getPOLICY_GROUP_TEMPLATE() {
        return POLICY_GROUP_TEMPLATE;
    }
    
    @VsoProperty(displayName = "PORT", readOnly = true)
    public TierAssociatedNetworkObjectType getPORT() {
        return PORT;
    }
    
    @VsoProperty(displayName = "PORT_MR", readOnly = true)
    public TierAssociatedNetworkObjectType getPORT_MR() {
        return PORT_MR;
    }
    
    @VsoProperty(displayName = "PORT_PUSH", readOnly = true)
    public TierAssociatedNetworkObjectType getPORT_PUSH() {
        return PORT_PUSH;
    }
    
    @VsoProperty(displayName = "PORT_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getPORT_TEMPLATE() {
        return PORT_TEMPLATE;
    }
    
    @VsoProperty(displayName = "PORT_VLAN_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getPORT_VLAN_CONFIG() {
        return PORT_VLAN_CONFIG;
    }
    
    @VsoProperty(displayName = "PORT_VLAN_CONFIG_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getPORT_VLAN_CONFIG_RESPONSE() {
        return PORT_VLAN_CONFIG_RESPONSE;
    }
    
    @VsoProperty(displayName = "PUBLIC_NETWORK", readOnly = true)
    public TierAssociatedNetworkObjectType getPUBLIC_NETWORK() {
        return PUBLIC_NETWORK;
    }
    
    @VsoProperty(displayName = "QOS_PRIMITIVE", readOnly = true)
    public TierAssociatedNetworkObjectType getQOS_PRIMITIVE() {
        return QOS_PRIMITIVE;
    }
    
    @VsoProperty(displayName = "RATE_LIMITER", readOnly = true)
    public TierAssociatedNetworkObjectType getRATE_LIMITER() {
        return RATE_LIMITER;
    }
    
    @VsoProperty(displayName = "RD_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getRD_SEQUENCENO() {
        return RD_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "REDUNDANT_GW_GRP", readOnly = true)
    public TierAssociatedNetworkObjectType getREDUNDANT_GW_GRP() {
        return REDUNDANT_GW_GRP;
    }
    
    @VsoProperty(displayName = "ROUTING_POLICY", readOnly = true)
    public TierAssociatedNetworkObjectType getROUTING_POLICY() {
        return ROUTING_POLICY;
    }
    
    @VsoProperty(displayName = "ROUTING_POL_MED_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getROUTING_POL_MED_RESPONSE() {
        return ROUTING_POL_MED_RESPONSE;
    }
    
    @VsoProperty(displayName = "RTRD_ENTITY", readOnly = true)
    public TierAssociatedNetworkObjectType getRTRD_ENTITY() {
        return RTRD_ENTITY;
    }
    
    @VsoProperty(displayName = "RTRD_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getRTRD_SEQUENCENO() {
        return RTRD_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "SERVICES_GATEWAY_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getSERVICES_GATEWAY_RESPONSE() {
        return SERVICES_GATEWAY_RESPONSE;
    }
    
    @VsoProperty(displayName = "SERVICE_GATEWAY_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getSERVICE_GATEWAY_RESPONSE() {
        return SERVICE_GATEWAY_RESPONSE;
    }
    
    @VsoProperty(displayName = "SERVICE_VRF_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getSERVICE_VRF_SEQUENCENO() {
        return SERVICE_VRF_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "SHAPING_POLICY", readOnly = true)
    public TierAssociatedNetworkObjectType getSHAPING_POLICY() {
        return SHAPING_POLICY;
    }
    
    @VsoProperty(displayName = "SHARED_RESOURCE", readOnly = true)
    public TierAssociatedNetworkObjectType getSHARED_RESOURCE() {
        return SHARED_RESOURCE;
    }
    
    @VsoProperty(displayName = "SITE", readOnly = true)
    public TierAssociatedNetworkObjectType getSITE() {
        return SITE;
    }
    
    @VsoProperty(displayName = "SITE_REQ", readOnly = true)
    public TierAssociatedNetworkObjectType getSITE_REQ() {
        return SITE_REQ;
    }
    
    @VsoProperty(displayName = "SITE_RES", readOnly = true)
    public TierAssociatedNetworkObjectType getSITE_RES() {
        return SITE_RES;
    }
    
    @VsoProperty(displayName = "STATIC_ROUTE", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATIC_ROUTE() {
        return STATIC_ROUTE;
    }
    
    @VsoProperty(displayName = "STATIC_ROUTE_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATIC_ROUTE_RESP() {
        return STATIC_ROUTE_RESP;
    }
    
    @VsoProperty(displayName = "STATISTICS", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATISTICS() {
        return STATISTICS;
    }
    
    @VsoProperty(displayName = "STATSSERVER", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATSSERVER() {
        return STATSSERVER;
    }
    
    @VsoProperty(displayName = "STATS_COLLECTOR", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATS_COLLECTOR() {
        return STATS_COLLECTOR;
    }
    
    @VsoProperty(displayName = "STATS_POLICY", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATS_POLICY() {
        return STATS_POLICY;
    }
    
    @VsoProperty(displayName = "STATS_TCA", readOnly = true)
    public TierAssociatedNetworkObjectType getSTATS_TCA() {
        return STATS_TCA;
    }
    
    @VsoProperty(displayName = "SUBNET", readOnly = true)
    public TierAssociatedNetworkObjectType getSUBNET() {
        return SUBNET;
    }
    
    @VsoProperty(displayName = "SUBNET_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getSUBNET_ENTRY() {
        return SUBNET_ENTRY;
    }
    
    @VsoProperty(displayName = "SUBNET_MAC_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getSUBNET_MAC_ENTRY() {
        return SUBNET_MAC_ENTRY;
    }
    
    @VsoProperty(displayName = "SUBNET_POOL_ENTRY", readOnly = true)
    public TierAssociatedNetworkObjectType getSUBNET_POOL_ENTRY() {
        return SUBNET_POOL_ENTRY;
    }
    
    @VsoProperty(displayName = "SUBNET_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getSUBNET_TEMPLATE() {
        return SUBNET_TEMPLATE;
    }
    
    @VsoProperty(displayName = "SYSTEM_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getSYSTEM_CONFIG() {
        return SYSTEM_CONFIG;
    }
    
    @VsoProperty(displayName = "SYSTEM_CONFIG_REQ", readOnly = true)
    public TierAssociatedNetworkObjectType getSYSTEM_CONFIG_REQ() {
        return SYSTEM_CONFIG_REQ;
    }
    
    @VsoProperty(displayName = "SYSTEM_CONFIG_RESP", readOnly = true)
    public TierAssociatedNetworkObjectType getSYSTEM_CONFIG_RESP() {
        return SYSTEM_CONFIG_RESP;
    }
    
    @VsoProperty(displayName = "SYSTEM_MONITORING", readOnly = true)
    public TierAssociatedNetworkObjectType getSYSTEM_MONITORING() {
        return SYSTEM_MONITORING;
    }
    
    @VsoProperty(displayName = "UNSUPPORTED", readOnly = true)
    public TierAssociatedNetworkObjectType getUNSUPPORTED() {
        return UNSUPPORTED;
    }
    
    @VsoProperty(displayName = "UPLINK_RD", readOnly = true)
    public TierAssociatedNetworkObjectType getUPLINK_RD() {
        return UPLINK_RD;
    }
    
    @VsoProperty(displayName = "USER", readOnly = true)
    public TierAssociatedNetworkObjectType getUSER() {
        return USER;
    }
    
    @VsoProperty(displayName = "VIRTUAL_IP", readOnly = true)
    public TierAssociatedNetworkObjectType getVIRTUAL_IP() {
        return VIRTUAL_IP;
    }
    
    @VsoProperty(displayName = "VIRTUAL_MACHINE", readOnly = true)
    public TierAssociatedNetworkObjectType getVIRTUAL_MACHINE() {
        return VIRTUAL_MACHINE;
    }
    
    @VsoProperty(displayName = "VIRTUAL_MACHINE_REPORT", readOnly = true)
    public TierAssociatedNetworkObjectType getVIRTUAL_MACHINE_REPORT() {
        return VIRTUAL_MACHINE_REPORT;
    }
    
    @VsoProperty(displayName = "VLAN", readOnly = true)
    public TierAssociatedNetworkObjectType getVLAN() {
        return VLAN;
    }
    
    @VsoProperty(displayName = "VLAN_CONFIG_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getVLAN_CONFIG_RESPONSE() {
        return VLAN_CONFIG_RESPONSE;
    }
    
    @VsoProperty(displayName = "VLAN_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getVLAN_TEMPLATE() {
        return VLAN_TEMPLATE;
    }
    
    @VsoProperty(displayName = "VMWARE_RELOAD_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_RELOAD_CONFIG() {
        return VMWARE_RELOAD_CONFIG;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER() {
        return VMWARE_VCENTER;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER_CLUSTER", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER_CLUSTER() {
        return VMWARE_VCENTER_CLUSTER;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER_DATACENTER", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER_DATACENTER() {
        return VMWARE_VCENTER_DATACENTER;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER_EAM_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER_EAM_CONFIG() {
        return VMWARE_VCENTER_EAM_CONFIG;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER_HYPERVISOR", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER_HYPERVISOR() {
        return VMWARE_VCENTER_HYPERVISOR;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER_VRS_BASE_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER_VRS_BASE_CONFIG() {
        return VMWARE_VCENTER_VRS_BASE_CONFIG;
    }
    
    @VsoProperty(displayName = "VMWARE_VCENTER_VRS_CONFIG", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VCENTER_VRS_CONFIG() {
        return VMWARE_VCENTER_VRS_CONFIG;
    }
    
    @VsoProperty(displayName = "VMWARE_VRS_ADDRESS_RANGE", readOnly = true)
    public TierAssociatedNetworkObjectType getVMWARE_VRS_ADDRESS_RANGE() {
        return VMWARE_VRS_ADDRESS_RANGE;
    }
    
    @VsoProperty(displayName = "VM_DESCRIPTION", readOnly = true)
    public TierAssociatedNetworkObjectType getVM_DESCRIPTION() {
        return VM_DESCRIPTION;
    }
    
    @VsoProperty(displayName = "VM_INTERFACE", readOnly = true)
    public TierAssociatedNetworkObjectType getVM_INTERFACE() {
        return VM_INTERFACE;
    }
    
    @VsoProperty(displayName = "VM_RESYNC", readOnly = true)
    public TierAssociatedNetworkObjectType getVM_RESYNC() {
        return VM_RESYNC;
    }
    
    @VsoProperty(displayName = "VNID_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getVNID_SEQUENCENO() {
        return VNID_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "VPN_CONNECT", readOnly = true)
    public TierAssociatedNetworkObjectType getVPN_CONNECT() {
        return VPN_CONNECT;
    }
    
    @VsoProperty(displayName = "VPORT", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORT() {
        return VPORT;
    }
    
    @VsoProperty(displayName = "VPORTTAG", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORTTAG() {
        return VPORTTAG;
    }
    
    @VsoProperty(displayName = "VPORTTAGTEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORTTAGTEMPLATE() {
        return VPORTTAGTEMPLATE;
    }
    
    @VsoProperty(displayName = "VPORT_GATEWAY_RESPONSE", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORT_GATEWAY_RESPONSE() {
        return VPORT_GATEWAY_RESPONSE;
    }
    
    @VsoProperty(displayName = "VPORT_MEDIATION_REQUEST", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORT_MEDIATION_REQUEST() {
        return VPORT_MEDIATION_REQUEST;
    }
    
    @VsoProperty(displayName = "VPORT_MIRROR", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORT_MIRROR() {
        return VPORT_MIRROR;
    }
    
    @VsoProperty(displayName = "VPORT_TAG_BASE", readOnly = true)
    public TierAssociatedNetworkObjectType getVPORT_TAG_BASE() {
        return VPORT_TAG_BASE;
    }
    
    @VsoProperty(displayName = "VPRN_LABEL_SEQUENCENO", readOnly = true)
    public TierAssociatedNetworkObjectType getVPRN_LABEL_SEQUENCENO() {
        return VPRN_LABEL_SEQUENCENO;
    }
    
    @VsoProperty(displayName = "VRS", readOnly = true)
    public TierAssociatedNetworkObjectType getVRS() {
        return VRS;
    }
    
    @VsoProperty(displayName = "VSC", readOnly = true)
    public TierAssociatedNetworkObjectType getVSC() {
        return VSC;
    }
    
    @VsoProperty(displayName = "VSD", readOnly = true)
    public TierAssociatedNetworkObjectType getVSD() {
        return VSD;
    }
    
    @VsoProperty(displayName = "VSD_COMPONENT", readOnly = true)
    public TierAssociatedNetworkObjectType getVSD_COMPONENT() {
        return VSD_COMPONENT;
    }
    
    @VsoProperty(displayName = "VSG_REDUNDANT_PORT", readOnly = true)
    public TierAssociatedNetworkObjectType getVSG_REDUNDANT_PORT() {
        return VSG_REDUNDANT_PORT;
    }
    
    @VsoProperty(displayName = "VSP", readOnly = true)
    public TierAssociatedNetworkObjectType getVSP() {
        return VSP;
    }
    
    @VsoProperty(displayName = "WAN_SERVICE", readOnly = true)
    public TierAssociatedNetworkObjectType getWAN_SERVICE() {
        return WAN_SERVICE;
    }
    
    @VsoProperty(displayName = "ZONE", readOnly = true)
    public TierAssociatedNetworkObjectType getZONE() {
        return ZONE;
    }
    
    @VsoProperty(displayName = "ZONE_TEMPLATE", readOnly = true)
    public TierAssociatedNetworkObjectType getZONE_TEMPLATE() {
        return ZONE_TEMPLATE;
    }
    

    public static TierAssociatedNetworkObjectType getEnumById(String id) {
        for (TierAssociatedNetworkObjectType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};