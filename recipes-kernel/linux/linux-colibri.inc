# Adapted from linux-imx.inc, copyright (C) 2012, 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for Colibri"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require recipes-kernel/linux/linux-imx.inc

# Put a local version until we have a true SRCREV to point to
SCMVERSION ?= "y"

SRCBRANCH ??= "colibri_3.10.17"
LOCALVERSION ?= "-${SRCBRANCH}"

# Allow override of COLIBRI_GITHUB_MIRROR to make use of
# local repository easier
COLIBRI_GITHUB_MIRROR ?= "git://github.com/sigmadrone/linux-colibri.git"

# SRC_URI for wandboard kernel
SRC_URI = "${COLIBRI_GITHUB_MIRROR};branch=${SRCBRANCH};protocol=https \
           file://defconfig \
"

KERNEL_MODULE_AUTOLOAD = "bcmdhd"
