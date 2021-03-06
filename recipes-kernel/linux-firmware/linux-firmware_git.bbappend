FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
  file://fw_bcm4329_apsta.bin \
  file://fw_bcm4330_apsta_bg.bin \
  file://fw_bcm4330_bg.bin \
  file://fw_bcm4330_abg.bin \
  file://nvram_ap6335.txt \
  file://fw_bcm4339a0_ag_apsta.bin \
"

do_install_append () {
	install -m 644 ${WORKDIR}/fw_bcm4329_apsta.bin ${D}/lib/firmware/brcm/brcmfmac4329-ap-sdio.bin
	install -m 644 ${WORKDIR}/fw_bcm4330_apsta_bg.bin ${D}/lib/firmware/brcm/brcmfmac4330-ap-sdio.bin
	install -m 644 ${WORKDIR}/fw_bcm4330_bg.bin ${D}/lib/firmware/brcm/fw_bcm4330_bg.bin
	install -m 644 ${WORKDIR}/fw_bcm4330_apsta_bg.bin ${D}/lib/firmware/brcm/fw_bcm4330_apsta_bg.bin
	install -m 644 ${WORKDIR}/fw_bcm4330_abg.bin ${D}/lib/firmware/brcm/fw_bcm4330_abg.bin
	install -m 644 ${WORKDIR}/nvram_ap6335.txt ${D}/lib/firmware/brcm/nvram_ap6335.txt
	install -m 644 ${WORKDIR}/fw_bcm4339a0_ag_apsta.bin ${D}/lib/firmware/brcm/fw_bcm4339a0_ag_apsta.bin
}

FILES_${PN}-bcm4329 += " \
  /lib/firmware/brcm/brcmfmac4329-ap-sdio.bin \
"

FILES_${PN}-bcm4330 += " \
  /lib/firmware/brcm/brcmfmac4330-ap-sdio.bin \
  /lib/firmware/brcm/fw_bcm4330_bg.bin \
  /lib/firmware/brcm/fw_bcm4330_abg.bin \
  /lib/firmware/brcm/fw_bcm4330_apsta_bg.bin \
"

FILES_${PN}-bcm4339 += " \
  /lib/firmware/brcm/nvram_ap6335.txt \
  /lib/firmware/brcm/fw_bcm4339a0_ag_apsta.bin \
"

ALTERNATIVE_TARGET_linux-firmware-bcm4329[brcmfmac4329-sdio.bin] = "${BRCM_FWDIR}/brcmfmac4329-ap-sdio.bin"
ALTERNATIVE_PRIORITY_linux-firmware-bcm4329[brcmfmac4329-sdio.bin] = "90"

ALTERNATIVE_TARGET_linux-firmware-bcm4330[brcmfmac4330-sdio.bin] = "${BRCM_FWDIR}/brcmfmac4330-ap-sdio.bin"
ALTERNATIVE_PRIORITY_linux-firmware-bcm4330[brcmfmac4330-sdio.bin] = "90"

ALTERNATIVE_TARGET_linux-firmware-bcm4330[fw_bcm4330_abg.bin] = "${BRCM_FWDIR}/fw_bcm4330_abg.bin"
ALTERNATIVE_PRIORITY_linux-firmware-bcm4330[fw_bcm4330_abg.bin] = "90"

ALTERNATIVE_TARGET_linux-firmware-bcm4330[fw_bcm4330_bg.bin] = "${BRCM_FWDIR}/fw_bcm4330_bg.bin"
ALTERNATIVE_PRIORITY_linux-firmware-bcm4330[fw_bcm4330_bg.bin] = "90"

ALTERNATIVE_TARGET_linux-firmware-bcm4330[fw_bcm4330_apsta_bg.bin] = "${BRCM_FWDIR}/fw_bcm4330_apsta_bg.bin"
ALTERNATIVE_PRIORITY_linux-firmware-bcm4330[fw_bcm4330_apsta_bg.bin] = "90"

