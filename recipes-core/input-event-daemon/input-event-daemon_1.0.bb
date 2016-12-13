DESCRIPTION = "User space daemon processing input events"
HOMEPAGE = "http://github.com/gandro/input-event-daemon"
PR = "r1"
PV = "1.0"
LICENSE = "GPLv3"
SRCREV="${AUTOREV}"
SECTION = "apps"
LICENSE = "GPLv2 | BSD"
LIC_FILES_CHKSUM = "file://README;md5=2dbf5d639fbb8b941fbc567e5a085758"
DEPENDS = ""

inherit update-rc.d systemd
INITSCRIPT_NAME = "input-event-daemon"

SYSTEMD_SERVICE_${PN} = "input-event-daemon.service"
SYSTEMD_PACKAGES = "${PN}"

DEFAULT_PREFERENCE = "-1"

SRC_URI = " \
    git://github.com/gandro/input-event-daemon.git;branch=master;protocol=https \
    file://input-event-daemon.conf \
    file://input-event-daemon.service \
    file://init \
"
S = "${WORKDIR}/git"

do_compile() {
    make input-event-daemon
}

do_install() {
    install -d ${D}${sbindir} ${D}${sysconfdir}/init.d
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/input-event-daemon.conf ${D}${sysconfdir}
    install -m 0755 ${S}/input-event-daemon ${D}${sbindir}
    install -m 0755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/input-event-daemon
    install -c -m 0644 ${WORKDIR}/input-event-daemon.service ${D}${systemd_unitdir}/system
}

CONFFILES_${PN} += "${sysconfdir}/input-event-daemon.conf"
