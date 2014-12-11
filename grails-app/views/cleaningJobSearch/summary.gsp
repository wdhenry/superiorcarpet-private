
<%@ page import="com.superior.base.CarpetCareJob" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'carpetCareJob.label', default: 'Carpet Care Job')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-carpetCareJob" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
		<div id="list-carpetCareJob" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="customerId" title="${message(code: 'carpetCareJob.jobId.label', default: 'Job Id')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'carpetCareJob.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="lead" title="${message(code: 'carpetCareJob.lead.label', default: 'Lead')}" />
					
						<g:sortableColumn property="helper" title="${message(code: 'carpetCareJob.helper.label', default: 'Helper')}" />
					
						<g:sortableColumn property="groupName" title="${message(code: 'carpetCareJob.groupName.label', default: 'Group Name')}" />
					
						<g:sortableColumn property="groupRate" title="${message(code: 'carpetCareJob.groupRate.label', default: 'Group Rate')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${jobs}" status="i" var="carpetCareJobInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="details" id="${carpetCareJobInstance.id}">${fieldValue(bean: carpetCareJobInstance, field: "id")}</g:link></td>
					
						<td><g:formatDate date="${carpetCareJobInstance.date}" /></td>
					
						<td>${fieldValue(bean: carpetCareJobInstance, field: "lead")}</td>
					
						<td>${fieldValue(bean: carpetCareJobInstance, field: "helper")}</td>
					
						<td>${fieldValue(bean: carpetCareJobInstance, field: "groupName")}</td>
					
						<td>${fieldValue(bean: carpetCareJobInstance, field: "groupRate")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${carpetCareJobInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
