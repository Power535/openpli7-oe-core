require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "3eb8df29743c84ddb80d10a06fd2f520"
SRC_URI[modules.sha256sum] = "783063caad0072f5c2b9ef63c191ca5cb8e2b008156cf246412aa6c5cc68f2ac"

RDEPENDS_${PN} += "kernel-module-stv0299"

COMPATIBLE_MACHINE = "dm8000"
