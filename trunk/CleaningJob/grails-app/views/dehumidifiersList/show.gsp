
<%@ page import="com.superior.base.Dehumidifiers" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dehumidifiers.label', default: 'Dehumidifier')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-dehumidifiers" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-dehumidifiers" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<tr>
					<th>Id Number</th>
					<th>Serial Number</th>
					<th>Model</th>
					<th>Hours on Unit</th>
					<th>Is In</th>
					<th>Job at Last</th>
				</tr>
				<tr>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="idNumber"/>
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="serialNumber"/>
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="model"/>
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:formatNumber number="${dehumidifiersInstance.hours}"
								type="number" maxFractionDigits="2" minFractionDigits="2" />
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:formatBoolean boolean="${dehumidifiersInstance?.isIn}" />
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="jobId"/>
						</div>
					</td>
				</tr>
				<tr>
					<th></th>
					<th>Date Out</th>
					<th>Lead Out</th>
					<th>Helper Out</th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<td></td>
					<td>
						<div class="fieldcontain">
							<g:formatDate format="MM-dd-yyyy" date="${dehumidifiersInstance?.dateOut}" />
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="leadOut"/>
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="helperOut"/>
						</div>
					</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th></th>
					<th>Date In</th>
					<th>Lead In</th>
					<th>Helper In</th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<td></td>
					<td>
						<div class="fieldcontain">
							<g:formatDate format="MM-dd-yyyy" date="${dehumidifiersInstance?.dateIn}" />
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="leadIn"/>
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							<g:fieldValue bean="${dehumidifiersInstance}" field="helperIn"/>
						</div>
					</td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>
	</body>
</html>
