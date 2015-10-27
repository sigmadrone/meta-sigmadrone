# Common settings for wandboard boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_u-boot = "u-boot-colibri"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-colibri"
PREFERRED_VERSION_linux-colibri ?= "3.10.17"
PREFERRED_PROVIDER_sshd ?= "openssh"
PREFERRED_PROVIDER_jpeg-native ?= "jpeg-native"

# Because hostapd v1 does not seem to work with the BCM4329
PREFERRED_VERSION_hostap-daemon = "2.0"

SERIAL_CONSOLE = "115200 ttymxc1"

MACHINE_FEATURES += "pci touchscreen"

IMAGE_INSTALL_append = " \
	sshd \
	i2c-tools \
	nfs-utils \
	nfs-utils-client \
	json-glib \
	libjson \
	boost \
	linux-firmware \
	hostapd \
	dhcp-server \
	dhcp-server-config \
	openssh-sftp-server \
	gdb \
	gdbserver \
	lighttpd \
	sigmad \
"

KERNEL_IMAGETYPE = "zImage"
