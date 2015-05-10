<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Superior Carpet Main Menu</title>
		<style type="text/css" media="screen">
			#page-body {
				margin: 2em 1em 1.25em 2em;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}
		</style>
	</head>
	<body>
		<div id="page-body" role="main">
			<div id="controller-list" role="navigation">
				<h2>Main Menu:</h2>
				<ol>
					<li class="controller"><a href="${createLink(uri: '/customer/index')}">Add/Maintain Customers</a></li>
					<li class="controller"><a href="${createLink(uri: '/cleaningJob/index')}">Enter A Cleaning Job</a></li>
					<li class="controller"><a href="${createLink(uri: '/extractionJob/index')}">Enter A Water Extraction Job</a></li>
					<li class="controller"><a href="${createLink(uri: '/dailyWork/index')}">Enter Team Daily Work</a></li>
					<li class="controller"><a href="${createLink(uri: '/dehuReturn/index')}">Dehumidifier Return</a></li>
					<li class="controller"><a href="${createLink(uri: '/fanReturn/index')}">Fan Return</a></li>
				</ol>
			</div>
			
			<div id="controller-list" role="navigation">
				<h2>Search Menu:</h2>
				<ol>
					<li class="controller"><a href="${createLink(uri: '/customerSearch/index')}">Search for Customers</a></li>
					<li class="controller"><a href="${createLink(uri: '/cleaningJobSearch/index')}">Search for Cleaning Jobs</a></li>
					<li class="controller"><a href="${createLink(uri: '/extractionJobSearch/index')}">Search for Extraction Jobs</a></li>
					<li class="controller"><a href="${createLink(uri: '/dailyWorkSearch/index')}">Search for Daily Work</a></li>
					<li class="controller"><a href="${createLink(uri: '/dehumidifiersList/index')}">List of Dehumidifiers</a></li>
					<li class="controller"><a href="${createLink(uri: '/fansList/index')}">List of Fans</a></li>
				</ol>
			</div>
			
<%--			<div id="controller-list" role="navigation">--%>
<%--				<h2>Temporary List of Applications:</h2>--%>
<%--				<ul>--%>
<%--					<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">--%>
<%--						<li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>--%>
<%--					</g:each>--%>
<%--				</ul>--%>
<%--			</div>--%>
		</div>
		
<%--		<div id="status" role="complementary">--%>
<%--			<h1>Application Status</h1>--%>
<%--			<ul>--%>
<%--				<li>App version: <g:meta name="app.version"/></li>--%>
<%--				<li>Grails version: <g:meta name="app.grails.version"/></li>--%>
<%--				<li>Groovy version: ${GroovySystem.getVersion()}</li>--%>
<%--				<li>JVM version: ${System.getProperty('java.version')}</li>--%>
<%--				<li>Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</li>--%>
<%--				<li>Controllers: ${grailsApplication.controllerClasses.size()}</li>--%>
<%--				<li>Domains: ${grailsApplication.domainClasses.size()}</li>--%>
<%--				<li>Services: ${grailsApplication.serviceClasses.size()}</li>--%>
<%--				<li>Tag Libraries: ${grailsApplication.tagLibClasses.size()}</li>--%>
<%--			</ul>--%>
<%--			<h1>Installed Plugins</h1>--%>
<%--			<ul>--%>
<%--				<g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">--%>
<%--					<li>${plugin.name} - ${plugin.version}</li>--%>
<%--				</g:each>--%>
<%--			</ul>--%>
<%--		</div>--%>
		
	</body>
</html>
