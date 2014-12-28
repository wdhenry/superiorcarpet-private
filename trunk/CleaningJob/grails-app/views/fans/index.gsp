
<%@ page import="com.superior.base.Fans" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fans.label', default: 'Fans')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-fans" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
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
					
						<g:sortableColumn property="idNumber" title="${message(code: 'fans.idNumber.label', default: 'Id Number')}" />
					
						<g:sortableColumn property="serialNumber" title="${message(code: 'fans.serialNumber.label', default: 'Serial Number')}" />
					
						<g:sortableColumn property="model" title="${message(code: 'fans.model.label', default: 'Model')}" />
					
						<g:sortableColumn property="isIn" title="${message(code: 'fans.isIn.label', default: 'Is In')}" />
					
						<g:sortableColumn property="jobId" title="${message(code: 'fans.jobId.label', default: 'Job Id')}" />
					
						<g:sortableColumn property="dateOut" title="${message(code: 'fans.dateOut.label', default: 'Date Out')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${fansInstanceList}" status="i" var="fansInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${fansInstance.id}">${fieldValue(bean: fansInstance, field: "idNumber")}</g:link></td>
					
						<td>${fieldValue(bean: fansInstance, field: "serialNumber")}</td>
					
						<td>${fieldValue(bean: fansInstance, field: "model")}</td>
					
						<td><g:formatBoolean boolean="${fansInstance.isIn}" /></td>
					
						<td>${fieldValue(bean: fansInstance, field: "jobId")}</td>
					
						<td><g:formatDate format="MM-dd-yyyy" date="${fansInstance.dateOut}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${fansInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
