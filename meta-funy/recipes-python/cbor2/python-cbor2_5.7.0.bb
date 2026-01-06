
SUMMARY = "CBOR (de)serializer with extensive tag support"
HOMEPAGE = "None"
AUTHOR = "None <Alex Grönholm <alex.gronholm@nextday.fi>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a79e64179819c7ce293372c059f1dbd8"

SRC_URI = "https://files.pythonhosted.org/packages/3a/89/01df16cdc9c60c07956756c90fe92c684021003079e358a78e213bce45a2/cbor2-5.7.0.tar.gz"
SRC_URI[md5sum] = "020774d7dc1213dd67aaf57433db9bee"
SRC_URI[sha256sum] = "3f6d843f4db4d0ec501c46453c22a4fbebb1abfb5b740e1bcab34c615cd7406b"

S = "${UNPACKDIR}/cbor2-5.7.0"
inherit pypi python_setuptools_build_meta

DEPENDS = "python3-setuptools-scm-native"

