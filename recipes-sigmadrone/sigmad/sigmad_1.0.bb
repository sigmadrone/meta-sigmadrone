DESCRIPTION = "Sigmadrone open drone software"
HOMEPAGE = "http://www.sigmadrone.com"
PR = "r1"
LICENSE = "GPLv3"
PV = "1.0"
SRCREV="${AUTOREV}"
SECTION = "apps"
SRC_URI = "git://dev.sigmadrone.org/sigmadrone/sigmadrone.git;branch=master;protocol=https \
	file://init \
"
LIC_FILES_CHKSUM = "file://doc/LICENSE;md5=df37e7030b5a0d0adf6ab3fbbe547e38"
S = "${WORKDIR}/git"
PACKAGES = "${PN}-dbg ${PN} ${PN}-doc ${PN}-dev ${PN}-staticdev ${PN}-locale"
FILES_${PN} += "${bindir} /www/pages"


inherit update-rc.d
INITSCRIPT_NAME = "sigmad"


DEPENDS = "boost"
RDEPENDS_${PN} = "lighttpd boost"
PARALLEL_MAKE = ""
SIGMADRONE_ARCH = "arm"

do_compile() {
    oe_runmake ARCH=${SIGMADRONE_ARCH} -C source
}

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/sigmad
    install -d ${D}${bindir}
    install -m 0755 ${S}/source/sigmad/bin-${SIGMADRONE_ARCH}/sigmad ${D}${bindir}
    install -m 644 -D ${S}/source/tools/webui/images/logo.ico ${D}/www/pages/images/logo.ico
    install -m 644 -D ${S}/source/tools/webui/images/logo.svg ${D}/www/pages/images/logo.svg
    install -m 644 -D ${S}/source/tools/webui/main.html ${D}/www/pages/main.html
    install -m 644 -D ${S}/source/tools/webui/bootstrap/fonts/glyphicons-halflings-regular.eot ${D}/www/pages/bootstrap/fonts/glyphicons-halflings-regular.eot
    install -m 644 -D ${S}/source/tools/webui/bootstrap/fonts/glyphicons-halflings-regular.ttf ${D}/www/pages/bootstrap/fonts/glyphicons-halflings-regular.ttf
    install -m 644 -D ${S}/source/tools/webui/bootstrap/fonts/glyphicons-halflings-regular.svg ${D}/www/pages/bootstrap/fonts/glyphicons-halflings-regular.svg
    install -m 644 -D ${S}/source/tools/webui/bootstrap/fonts/glyphicons-halflings-regular.woff ${D}/www/pages/bootstrap/fonts/glyphicons-halflings-regular.woff
    install -m 644 -D ${S}/source/tools/webui/bootstrap/fonts/glyphicons-halflings-regular.woff2 ${D}/www/pages/bootstrap/fonts/glyphicons-halflings-regular.woff2
    install -m 644 -D ${S}/source/tools/webui/bootstrap/js/bootstrap.min.js ${D}/www/pages/bootstrap/js/bootstrap.min.js
    install -m 644 -D ${S}/source/tools/webui/bootstrap/js/bootstrap.js ${D}/www/pages/bootstrap/js/bootstrap.js
    install -m 644 -D ${S}/source/tools/webui/bootstrap/js/npm.js ${D}/www/pages/bootstrap/js/npm.js
    install -m 644 -D ${S}/source/tools/webui/bootstrap/css/bootstrap-theme.min.css ${D}/www/pages/bootstrap/css/bootstrap-theme.min.css
    install -m 644 -D ${S}/source/tools/webui/bootstrap/css/bootstrap.min.css ${D}/www/pages/bootstrap/css/bootstrap.min.css
    install -m 644 -D ${S}/source/tools/webui/bootstrap/css/bootstrap-theme.css ${D}/www/pages/bootstrap/css/bootstrap-theme.css
    install -m 644 -D ${S}/source/tools/webui/bootstrap/css/bootstrap.css ${D}/www/pages/bootstrap/css/bootstrap.css
    install -m 644 -D ${S}/source/tools/webui/css/main.css ${D}/www/pages/css/main.css
    install -m 644 -D ${S}/source/tools/webui/jquery/jquery-2.1.1.min.js ${D}/www/pages/jquery/jquery-2.1.1.min.js
}
