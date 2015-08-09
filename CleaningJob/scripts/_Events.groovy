eventConfigureTomcat = {tomcat ->
	tomcat.addUser("user", "password")
	tomcat.addRole("user", "superiorcarpet-gui")
}
