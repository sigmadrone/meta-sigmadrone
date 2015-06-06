# Common settings for wandboard boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_u-boot = "u-boot-colibri"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-colibri"
PREFERRED_VERSION_linux-colibri ?= "3.10.17"

SERIAL_CONSOLE = "115200 ttymxc1"

MACHINE_FEATURES += "pci touchscreen"

KERNEL_IMAGETYPE = "zImage"
