
<%@ page import="com.superior.base.Dehumidifiers" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dehumidifiers.label', default: 'Dehumidifiers')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dehumidifiers" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-dehumidifiers" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="idNumber" title="${message(code: 'dehumidifiers.idNumber.label', default: 'Id Number')}" />
					
						<g:sortableColumn property="serialNumber" title="${message(code: 'dehumidifiers.serialNumber.label', default: 'Serial Number')}" />
					
						<g:sortableColumn property="model" title="${message(code: 'dehumidifiers.model.label', default: 'Model')}" />
					
						<g:sortableColumn property="isIn" title="${message(code: 'dehumidifiers.isIn.label', default: 'Is In')}" />
					
						<g:sortableColumn property="hours" title="${message(code: 'dehumidifiers.hours.label', default: 'Hours')}" />
					
						<g:sortableColumn property="jobId" title="${message(code: 'dehumidifiers.jobId.label', default: 'Job Id')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dehumidifiersInstanceList}" status="i" var="dehumidifiersInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dehumidifiersInstance.id}">${fieldValue(bean: dehumidifiersInstance, field: "idNumber")}</g:link></td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "serialNumber")}</td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "model")}</td>
					
						<td><g:formatBoolean boolean="${dehumidifiersInstance.isIn}" /></td>
					
						<td><g:formatNumber number="${dehumidifiersInstance.hours}"
								type="number" maxFractionDigits="2" minFractionDigits="2" />
						</td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "jobId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dehumidifiersInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
