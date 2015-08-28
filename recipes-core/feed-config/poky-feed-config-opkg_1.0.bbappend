do_install_append() {
	   rm -f ${D}${sysconfdir}/opkg/base-feeds.conf
	   touch ${D}${sysconfdir}/opkg/base-feeds.conf

	   {
	   	   echo 'src/gz all http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/all'
	   	   echo 'src/gz colibri_dual http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/colibri_dual' 
		   echo 'src/gz cortexa9hf-vfp-neon http://feeds.sigmadrone.org/feeds/colibri-dual-lsb/ipk/cortexa9hf-vfp-neon'
	   }  >> ${D}${sysconfdir}/opkg/base-feeds.conf
}
