# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-colibri.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# Colibri branch - based on Wandboard wandboard_imx_4.1.15_1.1.0_ga from Wandboard git
SRCBRANCH = "colibri_4.1.15"
SRCREV = "2ad687a2cddc443fb9baa6fed131f704009e1f14"
LOCALVERSION = "-1.0.0-colibri"

COMPATIBLE_MACHINE = "(colibri)"
