<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Superior Carpet Maintenance Menu</title>
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
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
		<div id="page-body" role="main">
			<div id="controller-list" role="navigation">
				<h2>Maintenance Tools:</h2>
				<ol>
					<li class="controller"><a href="${createLink(uri: '/lead/index')}">Lead Names</a></li>
					<li class="controller"><a href="${createLink(uri: '/helper/index')}">Helper Names</a></li>
					<li class="controller"><a href="${createLink(uri: '/rates/index')}">Rates</a></li>
					<li class="controller"><a href="${createLink(uri: '/roomGroup/index')}">Room Groups</a></li>
					<li class="controller"><a href="${createLink(uri: '/roomName/index')}">Room Names</a></li>
					<li class="controller"><a href="${createLink(uri: '/upholsteryName/index')}">Upholstery Names and Rates</a></li>
					<li class="controller"><a href="${createLink(uri: '/miscChargesName/index')}">Miscellaneous Charge Descriptions</a></li>
					<li class="controller"><a href="${createLink(uri: '/dehumidifiers/index')}">Dehumidifiers</a></li>
					<li class="controller"><a href="${createLink(uri: '/fans/index')}">Fans</a></li>
				</ol>
			</div>
		</div>
	</body>
</html>