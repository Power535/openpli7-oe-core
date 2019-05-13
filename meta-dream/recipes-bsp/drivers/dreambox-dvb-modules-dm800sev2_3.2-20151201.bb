require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "11f0599a7f7c8d97bbc0fc6ef362abd4"
SRC_URI[modules.sha256sum] = "a1afd7a98d9bff57503b8ac63da0949770028041932e74619bd1718f1f7e8e86"

RDEPENDS_${PN} += "kernel-module-stv0299"

COMPATIBLE_MACHINE = "dm800sev2"
