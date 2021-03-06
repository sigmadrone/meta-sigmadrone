# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-colibri.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# Colibri branch - based on Wandboard 3.14.28_1.0.0_ga from Wandboard git
SRCBRANCH = "colibri_3.14.28"
SRCREV = "d4e2e875d7b2a495faf12faaafb9e10d1b8f8a29"
LOCALVERSION = "-1.0.0-colibri"

COMPATIBLE_MACHINE = "(colibri)"
