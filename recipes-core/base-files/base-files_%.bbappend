do_install_append() {
	{
		echo 'alias ll="ls -l --color"'
	} >> ${D}${sysconfdir}/profile
}
