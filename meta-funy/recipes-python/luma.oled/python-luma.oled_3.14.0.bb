
SUMMARY = "A small library to drive an OLED device with either SSD1306, SSD1309, SSD1322, SSD1325, SSD1327, SSD1331, SSD1351, SSD1362, SH1106, SH1107 or WS0010 chipset"
HOMEPAGE = "https://github.com/rm-hull/luma.oled"
AUTHOR = "Richard Hull <richard.hull@destructuring-bind.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=95cba8b3a40c6f55d5d901980fe6e067"

SRC_URI = "https://files.pythonhosted.org/packages/95/a7/c5a51d4980a3a4db3b63570731eeac61f2e1142d5462f7e2866ed9d87070/luma_oled-3.14.0.tar.gz"
SRC_URI[md5sum] = "3961cd4f28c2dbd1fe09d7c2d55df2f8"
SRC_URI[sha256sum] = "36218565eda0614c8cf44ef42cb9a5904ddf808e4516e99ddae111fc93c5a206"

S = "${UNPACKDIR}/luma_oled-3.14.0"

RDEPENDS:${PN} = "python-luma.core"
DEPENDS_${PN} = "python-luma.core"
inherit python_setuptools_build_meta
