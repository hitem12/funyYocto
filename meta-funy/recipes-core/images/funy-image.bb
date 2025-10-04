DESCRIPTION = ""
LICENSE = "MIT"

inherit core-image
IMAGE_FEATURES += " \
    empty-root-password \
    allow-root-login \
    ssh-server-openssh \ 
    serial-autologin-root \
    package-management \
    " 
IMAGE_INSTALL:append = " \
    mgba \
    i2c-tools \
    "