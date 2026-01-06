DESCRIPTION = "A command line parser for C++11 and beyond."
HOMEPAGE = "https://github.com/CLIUtils/CLI11"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27559a6fd853c4b46ec4dea16597460c"

SRC_URI = "gitsm://github.com/CLIUtils/CLI11;protocol=https;branch=main;tag=v${PV}"
SRCREV = "bfffd37e1f804ca4fae1caae106935791696b6a9"

inherit cmake

# Wyłączamy wszystko oprócz instalacji nagłówków i plików CMake
EXTRA_OECMAKE += "\
    -DCLI11_BUILD_TESTS=OFF \
    -DCLI11_BUILD_EXAMPLES=OFF \
    -DCLI11_BUILD_DOCS=OFF \
    -DCLI11_PRECOMPILED=OFF \
"

# Header-only → główny pakiet pusty
RDEPENDS:${PN} = ""
FILES:${PN}-dev += "${includedir}/CLI ${libdir}/cmake/CLI11"

do_install:append() {
    if [ -d ${D}${datadir}/cmake ]; then
        install -d ${D}${libdir}/cmake
        mv ${D}${datadir}/cmake/* ${D}${libdir}/cmake/
        rm -rf ${D}${datadir}/cmake
    fi
}
BBCLASSEXTEND = "native nativesdk"