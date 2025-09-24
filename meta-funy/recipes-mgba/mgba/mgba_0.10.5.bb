SUMMARY = "game boy advance emulator"
DESCRIPTION = ""
LICENSE = "MPL-2.0" 
#GNU
SRCREV = "${PV}"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"


SRC_URI = "git://github.com/mgba-emu/mgba.git;nobranch=1;rev=${PV};protocol=https"
# S = "${WORKDIR}/git"
DEPENDS = "libsdl2"
RDEPENDS = ""

inherit cmake
EXTRA_OECMAKE += "-DCMAKE_POLICY_VERSION_MINIMUM=3.5  -DCMAKE_INSTALL_PREFIX:PATH=/usr"

FILES:${PN} = " ${libdir}/lib*.so* \
                ${datadir}/icons/hicolor/* \
                ${bindir}/mgba "
