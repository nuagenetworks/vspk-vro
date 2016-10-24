# vspk-vro

VSPK Plug-In for VMWare vRealize Orchestrator (vRO).

# build

To build plug-in: 

* mvn -Dmaven.wagon.http.ssl.insecure=true -Dvco.version={vro-version} -DrepoUrl=https://{vro-ip-address}:8281/vco-repo/ clean install

Example:

* mvn -Dmaven.wagon.http.ssl.insecure=true -Dvco.version=7.0.1 -DrepoUrl=https://192.168.1.15:8281/vco-repo/ clean install

# install

To install plug-in:

* Follow instructions in INSTALL.txt