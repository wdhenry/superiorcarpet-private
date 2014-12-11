
<%@ page import="com.superior.base.Dehumidifiers" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dehumidifiers.label', default: 'Dehumidifiers Returns')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dehumidifiers" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
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
					
						<g:sortableColumn property="idNumber" title="${message(code: 'dehureturn.idNumber.label', default: 'Id')}" />
					
						<g:sortableColumn property="serialNumber" title="${message(code: 'dehureturn.serialNumber.label', default: 'Serial Number')}" />
					
						<g:sortableColumn property="model" title="${message(code: 'dehureturn.model.label', default: 'Model')}" />
					
						<g:sortableColumn property="jobId" title="${message(code: 'dehureturn.jobId.label', default: 'Where')}" />
						
						<g:sortableColumn property="dateOut" title="${message(code: 'dehureturn.dateOut.label', default: 'Out')}" />
					
						<g:sortableColumn property="leadOut" title="${message(code: 'dehureturn.leadOut.label', default: 'Lead')}" />
						
						<g:sortableColumn property="helperOut" title="${message(code: 'dehureturn.helperOut.label', default: 'Helper')}" />
						
						<g:sortableColumn property="dateIn" title="${message(code: 'dehureturn.dateIn.label', default: 'In')}" />
						
						<g:sortableColumn property="leadIn" title="${message(code: 'dehureturn.leadIn.label', default: 'Lead')}" />
						
						<g:sortableColumn property="helperIn" title="${message(code: 'dehureturn.helperOut.label', default: 'Helper')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dehumidifiersInstanceList}" status="i" var="dehumidifiersInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="edit" id="${dehumidifiersInstance.id}">${fieldValue(bean: dehumidifiersInstance, field: "idNumber")}</g:link></td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "serialNumber")}</td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "model")}</td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "jobId")}</td>
						
						<td>${fieldValue(bean: dehumidifiersInstance, field: "dateOut")}</td>
					
						<td>${fieldValue(bean: dehumidifiersInstance, field: "leadOut")}</td>
						
						<td>${fieldValue(bean: dehumidifiersInstance, field: "helperOut")}</td>
						
						<td>${fieldValue(bean: dehumidifiersInstance, field: "dateIn")}</td>
						
						<td>${fieldValue(bean: dehumidifiersInstance, field: "leadIn")}</td>
						
						<td>${fieldValue(bean: dehumidifiersInstance, field: "helperIn")}</td>
					
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
