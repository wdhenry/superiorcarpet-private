
<%@ page import="com.superior.base.Fans" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fans.label', default: 'Fans Returns')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-fans" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
		<div id="list-fans" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="idNumber" title="${message(code: 'fanreturn.idNumber.label', default: 'Id')}" />
					
						<g:sortableColumn property="serialNumber" title="${message(code: 'fanreturn.serialNumber.label', default: 'Serial Number')}" />
					
						<g:sortableColumn property="model" title="${message(code: 'fanreturn.model.label', default: 'Model')}" />
					
						<g:sortableColumn property="jobId" title="${message(code: 'fanreturn.jobId.label', default: 'Job Id')}" />
					
						<g:sortableColumn property="dateOut" title="${message(code: 'fanreturn.dateOut.label', default: 'Out')}" />
					
						<g:sortableColumn property="leadOut" title="${message(code: 'fanreturn.leadOut.label', default: 'Lead')}" />
						
						<g:sortableColumn property="helperOut" title="${message(code: 'fanreturn.helperOut.label', default: 'Helper')}" />
						
						<g:sortableColumn property="dateIn" title="${message(code: 'fanreturn.dateIn.label', default: 'In')}" />
						
						<g:sortableColumn property="leadIn" title="${message(code: 'fanreturn.leadIn.label', default: 'Lead')}" />
						
						<g:sortableColumn property="helperIn" title="${message(code: 'fanreturn.helperOut.label', default: 'Helper')}" />
						
					</tr>
				</thead>
				<tbody>
				<g:each in="${fansInstanceList}" status="i" var="fanInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="edit" id="${fanInstance.id}">${fieldValue(bean: fanInstance, field: "idNumber")}</g:link></td>
					
						<td>${fieldValue(bean: fanInstance, field: "serialNumber")}</td>
					
						<td>${fieldValue(bean: fanInstance, field: "model")}</td>
					
						<td>${fieldValue(bean: fanInstance, field: "jobId")}</td>
					
						<td><g:formatDate format="MM-dd-yyyy" date="${fanInstance.dateOut}" /></td>
						
						<td>${fieldValue(bean: fanInstance, field: "leadOut")}</td>
						
						<td>${fieldValue(bean: fanInstance, field: "helperOut")}</td>
						
						<td><g:formatDate format="MM-dd-yyyy" date="${fanInstance.dateIn}" /></td>
						
						<td>${fieldValue(bean: fanInstance, field: "leadIn")}</td>
						
						<td>${fieldValue(bean: fanInstance, field: "helperIn")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${fanInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
