
SUMMARY = "A component library to support SBC display drivers"
HOMEPAGE = "https://github.com/rm-hull/luma.core"
AUTHOR = "Richard Hull <richard.hull@destructuring-bind.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2083293a38df91b8d470d3fe30069262"

SRC_URI = "https://files.pythonhosted.org/packages/0a/1a/e706039601ac5a3e3a13a5baf8d9fc3764a62e425a674c296f7ddfc546a0/luma_core-2.5.1.tar.gz"
SRC_URI[md5sum] = "198b392a0090322f2bd65ef9bf28853f"
SRC_URI[sha256sum] = "9b88fbe868989ec4477e210fe2993e774a7425d7de8378814109f98be32ca653"

S = "${UNPACKDIR}/luma_core-2.5.1"

RDEPENDS:${PN} = "python-pillow python-smbus2 python-cbor2"
DEPENDS_${PN} = "python-pillow python-smbus2 python-cbor2"
inherit python_setuptools_build_meta
