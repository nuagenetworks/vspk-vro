# VSPK-VRO

VSPK Plug-In for VMWare vRealize Orchestrator (vRO).

# Build

The following libraries need to be build (in the order listed) prior to building the plug-in:

* [java-bambou](https://github.com/nuagenetworks/java-bambou)
* [vro-plugin-base](https://github.com/nuagenetworks/vro-plugin-base)

To build plug-in: 

* mvn -Dmaven.wagon.http.ssl.insecure=true -Dvco.version={vro-version} -DrepoUrl=https://{vro-ip-address}:8281/vco-repo/ -Dbuild.number=1 -Dinstallation.mode=always clean install

Example:

* mvn -Dmaven.wagon.http.ssl.insecure=true -Dvco.version=7.0.1 -DrepoUrl=https://192.168.1.15:8281/vco-repo/ -Dbuild.number=1 -Dinstallation.mode=always clean install

# Install

To install plug-in:

* Follow instructions in INSTALL.txt
