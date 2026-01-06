FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://wpa_supplicant.conf.my \
            file://wpa_init.d \
            "

inherit update-rc.d 
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME = "wpa_init"

do_install:append() {
    install -m 600  ${UNPACKDIR}/wpa_supplicant.conf.my ${D}${sysconfdir}/wpa_supplicant.conf
    install -d ${D}${sysconfdir}/init.d
    install -m 755  ${UNPACKDIR}/wpa_init.d ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}

}
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN} += "bash"

FILES_${PN} += "${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}"

