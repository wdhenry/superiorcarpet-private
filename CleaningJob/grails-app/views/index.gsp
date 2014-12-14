<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Superior Carpet Main Menu</title>
		<g:javascript library="jquery" />
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

<%----%>
<%--			h2 {--%>
<%--				margin-top: 1em;--%>
<%--				margin-bottom: 0.3em;--%>
<%--				font-size: 1em;--%>
<%--			}--%>
<%----%>
<%--			p {--%>
<%--				line-height: 1.5;--%>
<%--				margin: 0.25em 0;--%>
<%--			}--%>

<%--			@media screen and (max-width: 480px) {--%>
<%--				#status {--%>
<%--					display: none;--%>
<%--				}--%>
<%----%>
<%--				#page-body {--%>
<%--					margin: 0 1em 1em;--%>
<%--				}--%>
<%----%>
<%--				#page-body h1 {--%>
<%--					margin-top: 0;--%>
<%--				}--%>
<%--			}--%>

<%--			#status {--%>
<%--				background-color: #eee;--%>
<%--				border: .2em solid #fff;--%>
<%--				margin: 2em 2em 1em;--%>
<%--				padding: 1em;--%>
<%--				width: 12em;--%>
<%--				float: left;--%>
<%--				-moz-box-shadow: 0px 0px 1.25em #ccc;--%>
<%--				-webkit-box-shadow: 0px 0px 1.25em #ccc;--%>
<%--				box-shadow: 0px 0px 1.25em #ccc;--%>
<%--				-moz-border-radius: 0.6em;--%>
<%--				-webkit-border-radius: 0.6em;--%>
<%--				border-radius: 0.6em;--%>
<%--			}--%>
<%----%>
<%--			.ie6 #status {--%>
<%--				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */--%>
<%--			}--%>
<%----%>
<%--			#status ul {--%>
<%--				font-size: 0.9em;--%>
<%--				list-style-type: none;--%>
<%--				margin-bottom: 0.6em;--%>
<%--				padding: 0;--%>
<%--			}--%>
<%----%>
<%--			#status li {--%>
<%--				line-height: 1.3;--%>
<%--			}--%>
<%----%>
<%--			#status h1 {--%>
<%--				text-transform: uppercase;--%>
<%--				font-size: 1.1em;--%>
<%--				margin: 0 0 0.3em;--%>
<%--			}--%>
<%----%>
		</style>
	</head>
	<body>
		<div id="page-body" role="main">
			<div id="controller-list" role="navigation">
				<h2>Main Menu:</h2>
				<ol>
					<li class="controller"><a href="/CleaningJob/customer/index">Add/Maintain Customers</a></li>
					<li class="controller"><a href="/CleaningJob/cleaningJob/index">Enter A Cleaning Job</a></li>
					<li class="controller"><a href="/CleaningJob/extractionJob/index">Enter A Water Extraction Job</a></li>
					<li class="controller"><a href="/CleaningJob/dailyWork/index">Enter Team Daily Work</a></li>
					<li class="controller"><a href="/CleaningJob/dehuReturn/index">Dehumidifier Return</a></li>
					<li class="controller"><a href="/CleaningJob/fanReturn/index">Fan Return</a></li>
				</ol>
			</div>
			
			<div id="controller-list" role="navigation">
				<h2>Search Menu:</h2>
				<ol>
					<li class="controller"><a href="/CleaningJob/customerSearch/index">Search for Customers</a></li>
					<li class="controller"><a href="/CleaningJob/cleaningJobSearch/index">Search for Cleaning Jobs</a></li>
					<li class="controller"><a href="/CleaningJob/extractionJobSearch/index">Search for Extraction Jobs</a></li>
					<li class="controller"><a href="/CleaningJob/dailyWorkSearch/index">Search for Daily Work</a></li>
				</ol>
			</div>
			
			<div id="controller-list" role="navigation">
				<h2>Maintenance Tools:</h2>
				<ol>
					<li class="controller"><a href="/CleaningJob/lead/index">Lead Names</a></li>
					<li class="controller"><a href="/CleaningJob/helper/index">Helper Names</a></li>
					<li class="controller"><a href="/CleaningJob/roomGroup/index">Room Groups</a></li>
					<li class="controller"><a href="/CleaningJob/roomName/index">Room Names</a></li>
					<li class="controller"><a href="/CleaningJob/upholsteryName/index">Upholstery Names</a></li>
					<li class="controller"><a href="/CleaningJob/miscChargesName/index">Miscellaneous Charge Descriptions</a></li>
					<li class="controller"><a href="/CleaningJob/dehumidifiers/index">Dehumidifiers</a></li>
					<li class="controller"><a href="/CleaningJob/fans/index">Fans</a></li>
				</ol>
			</div>
			
			<div id="controller-list" role="navigation">
				<h2>Temporary List of Applications:</h2>
				<ul>
					<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
						<li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
					</g:each>
				</ul>
			</div>
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
