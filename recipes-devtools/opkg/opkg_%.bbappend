do_install_append() {
           {
                   echo 'src/gz all http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/all'
                   echo 'src/gz colibri http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/colibri' 
                   echo 'src/gz cortexa9hf-vfp-neon http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/cortexa9hf-vfp-neon'
                   echo 'src/gz cortexa9hf-vfp-neon-mx6qdl http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/cortexa9hf-vfp-neon-mx6qdl'
           }  >> ${D}${sysconfdir}/opkg/opkg.conf
}
