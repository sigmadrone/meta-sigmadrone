FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append_wandboard = " \
			 file://lighttpd.conf \
"

do_install_append () {
        rm -f ${D}${sysconfdir}/lighttpd.conf
        install -m 0644 ${WORKDIR}/lighttpd.conf ${D}${sysconfdir}
}
