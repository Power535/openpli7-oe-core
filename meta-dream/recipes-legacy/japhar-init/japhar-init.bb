PV = "1.0"
PR = "r0"

require conf/license/openpli-gplv2.inc

# Setup Dreamboxes Japhar images
#
#SRC_URI = " \
#	file://japhar-init.sh \
#"

do_install() {
    install -d ${D}/etc/enigma2/
    touch ${D}/etc/enigma2/settings
    if [ "${MACHINE}" = "dm800" ]
    then
      echo "config.inputDevices.event1.enabled=true" >> ${D}/etc/enigma2/settings
      echo "config.inputDevices.event1.name=dreambox remote control (native)" >> ${D}/etc/enigma2/settings
      echo "config.inputDevices.event1.repeat=300" >> ${D}/etc/enigma2/settings
      echo "config.inputDevices.event2.enabled=true" >> ${D}/etc/enigma2/settings
      echo "config.inputDevices.event2.name=dreambox advanced remote control (native)" >> ${D}/etc/enigma2/settings
      echo "config.inputDevices.event2.repeat=300" >> ${D}/etc/enigma2/settings
    fi
    echo "config.servicelist.startupservice=4097:0:0:0:0:0:0:0:0:0:http%3a//217.182.192.240%3a8080/hls/ottofmtv/1_2/index.m3u8:8 FM" >> ${D}/etc/enigma2/settings
    if [ "${MACHINE}" = "dm800" ] || [ "${MACHINE}" = "dm500hd" ] || [ "${MACHINE}" = "dm800se" ] || [ "${MACHINE}" = "dm800sev2" ] || [ "${MACHINE}" = "dm8000" ]
    then
	echo "config.skin.primary_skin=PLi-HD/skin.xml" >> ${D}/etc/enigma2/settings
    fi
    if [ "${MACHINE}" = "dm520" ]
    then
	echo "config.skin.primary_skin=PLi-FullNightHD/skin.xml" >> ${D}/etc/enigma2/settings
    fi
    echo "config.usage.setup_level=expert" >> ${D}/etc/enigma2/settings
    chown root:root ${D}/etc/enigma2/settings

#    install -d ${D}/etc/cron/crontabs
#    touch ${D}/etc/cron/crontabs/root
#    echo "1 1 * * * ntpd -p 0.pool.ntp.org" >> ${D}/etc/cron/crontabs/root
#    chown root:root ${D}/etc/cron/crontabs/root

    install -d ${D}/etc/init.d
    touch ${D}/etc/init.d/softcam.None
    echo "# Placeholder for no cam" >> ${D}/etc/init.d/softcam.None
    chmod 755 ${D}/etc/init.d/softcam.None
    ln -s /etc/init.d/softcam.None ${D}/etc/init.d/softcam

    install -d ${D}/etc/rc0.d
    ln -s /etc/init.d/softcam ${D}/etc/rc0.d/K50softcam
    install -d ${D}/etc/rc1.d
    ln -s /etc/init.d/softcam ${D}/etc/rc1.d/K50softcam
    install -d ${D}/etc/rc6.d
    ln -s /etc/init.d/softcam ${D}/etc/rc6.d/K50softcam

    install -d ${D}/etc/rc2.d
    ln -s /etc/init.d/softcam ${D}/etc/rc2.d/S50softcam
    install -d ${D}/etc/rc3.d
    ln -s /etc/init.d/softcam ${D}/etc/rc3.d/S50softcam
    install -d ${D}/etc/rc4.d
    ln -s /etc/init.d/softcam ${D}/etc/rc4.d/S50softcam
    install -d ${D}/etc/rc5.d
    ln -s /etc/init.d/softcam ${D}/etc/rc5.d/S50softcam

}

FILES_${PN} = " \
	/etc \
"
PACKAGE_ARCH = "${MACHINE_ARCH}"
