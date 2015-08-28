FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
	file://init \
	file://sigmadrone-hostapd.conf \
"
do_install_append () {
    install -m 755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/hostapd
    install -m 0644 ${WORKDIR}/sigmadrone-hostapd.conf ${D}${sysconfdir}/hostapd.conf
}
