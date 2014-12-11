
<%@ page import="com.superior.base.WaterExtractionJob" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'waterExtractionJob.label', default: 'Water Extraction Job')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-waterExtractionJob" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
		<div id="list-waterExtractionJob" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="customerId" title="${message(code: 'waterExtractionJob.jobId.label', default: 'Job Id')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'waterExtractionJob.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="lead" title="${message(code: 'waterExtractionJob.lead.label', default: 'Lead')}" />
					
						<g:sortableColumn property="helper" title="${message(code: 'waterExtractionJob.helper.label', default: 'Helper')}" />
					
						<g:sortableColumn property="startTime" title="${message(code: 'waterExtractionJob.startTime.label', default: 'Start Time')}" />
					
						<g:sortableColumn property="endTime" title="${message(code: 'waterExtractionJob.endTime.label', default: 'End Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${jobs}" status="i" var="waterExtractionJobInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="details" id="${waterExtractionJobInstance.id}">${fieldValue(bean: waterExtractionJobInstance, field: "id")}</g:link></td>
					
						<td><g:formatDate date="${waterExtractionJobInstance.date}" /></td>
					
						<td>${fieldValue(bean: waterExtractionJobInstance, field: "lead")}</td>
					
						<td>${fieldValue(bean: waterExtractionJobInstance, field: "helper")}</td>
					
						<td><g:formatDate date="${waterExtractionJobInstance.startTime}" /></td>
					
						<td><g:formatDate date="${waterExtractionJobInstance.endTime}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${waterExtractionJobInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
