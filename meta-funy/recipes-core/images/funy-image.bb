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
    i2c-tools \
    dhcpcd \
    python3 \
    python3-pip \
    python-luma.oled \
    ssd1306 \
    fontconfig \
    kernel-module-spidev \
    "

# Install debugging tools
IMAGE_INSTALL:append = " gdb gdbserver "

# Enable full debug symbol generation
INHIBIT_PACKAGE_STRIP = "0"
INHIBIT_SYSROOT_STRIP = "1"

# Copy debug symbols into rootfs-dbg
IMAGE_CLASSES:append = " image-combined-dbg"
IMAGE_GEN_DEBUGFS = "1"

# Recommended (clean debug symbol split)
PACKAGE_DEBUG_SPLIT_STYLE = "debug-without-src"
