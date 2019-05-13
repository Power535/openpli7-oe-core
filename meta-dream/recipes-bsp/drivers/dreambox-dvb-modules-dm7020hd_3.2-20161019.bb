require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "e5af8817bd87d5cb3fb62c14f7f7a67d"
SRC_URI[modules.sha256sum] = "7f91ce7eeff5c33b8c9a011db9915c1e3f1c49b904a2b956e3af94072416d4dd"

RDEPENDS_${PN} += "kernel-module-stv0299"

COMPATIBLE_MACHINE = "dm7020hd"
