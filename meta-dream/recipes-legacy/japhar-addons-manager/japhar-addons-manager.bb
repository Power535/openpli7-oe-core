SUMMARY = "Japhar JAM panel"
HOMEPAGE = "http://www.japhar.com/"
DESCRIPTION = "Download plugins from Addon server"
MAINTAINER = "<warlord.ourdreambox@gmail.com>"
LICENSE = "CLOSED"
PV = "5.3"
SRC_URI = "file://panel.tgz"
PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/jam"

do_install () {
   cp -r ${S}/usr ${D}/
   ln -s images/addons_logo.png ${D}/usr/lib/enigma2/python/Plugins/Extensions/AddOnJaphar/
}

FILES_${PN} = "/usr"
