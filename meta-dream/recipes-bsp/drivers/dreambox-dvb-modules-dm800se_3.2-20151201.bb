require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "b003ae46cd13fd452ad7aeec750cc25e"
SRC_URI[modules.sha256sum] = "cb119122bb212e7a6b4cd7db4d48f73c4048b824f20496f4e86a21c5f66f9eb9"

RDEPENDS_${PN} += "kernel-module-stv0299"

COMPATIBLE_MACHINE = "dm800se"
