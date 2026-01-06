SUMMARY = "ssd1306 oled display driver"
DESCRIPTION = "ssd1306 oled display driver"
LICENSE = "MIT" 
SRCREV = "f39b263a0af807008c352d70772b935930158d8d"
PR = "r0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"
SRC_URI = "git://github.com/hitem12/ssd1306.git;branch=master;protocol=https"
inherit cmake 

DEPENDS = "i2c-tools cli11 freetype"
RDEPENDS_${PN} = "i2c-tools(>=4.4)"

EXTRA_OECMAKE += "-DCMAKE_CXX_STANDARD=20"
