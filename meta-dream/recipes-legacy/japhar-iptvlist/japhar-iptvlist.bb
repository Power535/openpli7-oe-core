PV = "1.11"
PR = "r11"

require conf/license/openpli-gplv2.inc

SRC_URI[md5sum] = "461940cf5b24bbc40480610d91d953d4"
SRC_URI[sha256sum] = "d18180b7e77c08fcd982f3ebe709f0c8836f5cfd04f0d75b914b2d2ac9e0a4a7"

SRC_URI = " \
	http://jam.japhar.com/download/addons/settings/OpenPLi/userbouquet.favourites.tv;md5sum=461940cf5b24bbc40480610d91d953d4 \
"

do_install() {
    install -d ${D}/etc/enigma2/
    install -m 0644 ${WORKDIR}/userbouquet.favourites.tv ${D}/etc/enigma2/
}

FILES_${PN} = " \
	/etc \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

