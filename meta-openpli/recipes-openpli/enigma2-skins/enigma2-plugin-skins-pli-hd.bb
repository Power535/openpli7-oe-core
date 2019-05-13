DESCRIPTION = "PLi HD skin"
MAINTAINER = "littlesat"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/share/enigma2/PLi-HD/skin.xml;beginline=3;endline=8;md5=1d560d35b9194281a488eb3a32d9c8bf"

inherit gitpkgv allarch

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"

SRC_URI = "git://github.com/littlesat/skin-PLiHD.git"

FILES_${PN} = "/usr/share/enigma2/"

S = "${WORKDIR}/git"

do_compile() {
}

do_install() {
	install -d ${D}/usr/share
	cp -r ${S}/usr/share/* ${D}/usr/share/
	chmod -R a+rX ${D}/usr/share/enigma2/

	if [ "${MACHINE}" = "dm800" ]
	then
		echo "Extra Dreambox fixes!"
		rm -r ${D}/usr/share/enigma2/PLi-HD1/
		rm -r ${D}/usr/share/enigma2/PLi-HD2/
		rm -r ${D}/usr/share/enigma2/PLi-FullHD/
		rm -r ${D}/usr/share/enigma2/PLi-FullNightHD/
	fi

	if [ "${MACHINE}" = "dm500hd" ]
	then
		echo "Extra Dreambox fixes!"
		rm -r ${D}/usr/share/enigma2/PLi-HD1/
		rm -r ${D}/usr/share/enigma2/PLi-HD2/
		rm -r ${D}/usr/share/enigma2/PLi-FullHD/
		rm -r ${D}/usr/share/enigma2/PLi-FullNightHD/
	fi

	if [ "${MACHINE}" = "dm800se" ]
	then
		echo "Extra Dreambox fixes!"
		rm -r ${D}/usr/share/enigma2/PLi-HD1/
		rm -r ${D}/usr/share/enigma2/PLi-HD2/
		rm -r ${D}/usr/share/enigma2/PLi-FullHD/
		rm -r ${D}/usr/share/enigma2/PLi-FullNightHD/
	fi
}
