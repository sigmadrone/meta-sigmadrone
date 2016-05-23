# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-colibri.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# Colibri branch - based on Wandboard 3.10.17_1.0.2_ga from Wandboard git
SRCBRANCH = "colibri_3.10.17"
SRCREV = "f3cd5d30e08d8740103b49c0ec41c3ae759e5392"
LOCALVERSION = "-1.0.0-colibri"

COMPATIBLE_MACHINE = "(colibri)"
