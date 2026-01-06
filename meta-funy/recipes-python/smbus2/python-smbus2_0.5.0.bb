
SUMMARY = "smbus2 is a drop-in replacement for smbus-cffi/smbus-python in pure Python"
HOMEPAGE = "https://github.com/kplindegaard/smbus2"
AUTHOR = "Karl-Petter Lindegaard <kp.lindegaard@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a3eca2de44816126b3c6f33811a9fba"

SRC_URI = "https://files.pythonhosted.org/packages/10/c9/6d85aa809e107adf85303010a59b340be109c8f815cbedc5c08c73bcffef/smbus2-0.5.0.tar.gz"
SRC_URI[md5sum] = "5708a6cbf052f45a3ad6dd83c00902a6"
SRC_URI[sha256sum] = "4a5946fd82277870c2878befdb1a29bb28d15cda14ea4d8d2d54cf3d4bdcb035"

S = "${UNPACKDIR}/smbus2-0.5.0"

RDEPENDS_${PN} = ""

inherit python_setuptools_build_meta
