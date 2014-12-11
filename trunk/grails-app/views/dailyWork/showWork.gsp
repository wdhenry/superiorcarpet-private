<%@ page import="com.superior.base.DailyWorkRecord" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dailywork.label', default: 'Daily Work')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dailywork" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="index"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-dailywork" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="id" title="${message(code: 'dailyWorkRecord.id.label', default: 'Id')}" />
						
						<g:sortableColumn property="date" title="${message(code: 'dailyWorkRecord.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="lead" title="${message(code: 'dailyWorkRecord.lead.label', default: 'Lead')}" />
					
						<g:sortableColumn property="leadHours" title="${message(code: 'dailyWorkRecord.leadHours.label', default: 'Hours')}" />
					
						<g:sortableColumn property="leadMinutes" title="${message(code: 'dailyWorkRecord.leadMinutes.label', default: 'Mins')}" />
					
						<g:sortableColumn property="helper" title="${message(code: 'dailyWorkRecord.helper.label', default: 'Helper')}" />
					
						<g:sortableColumn property="helperHours" title="${message(code: 'dailyWorkRecord.helperHours.label', default: 'Hours')}" />
						
						<g:sortableColumn property="helperMinutes" title="${message(code: 'dailyWorkRecord.helperMinutes.label', default: 'Mins')}" />
						
						<g:sortableColumn property="vanNumber" title="${message(code: 'dailyWorkRecord.van.label', default: 'Van')}" />
						
						<g:sortableColumn property="milesDriven" title="${message(code: 'dailyWorkRecord.miles.label', default: 'Miles')}" />
						
						<g:sortableColumn property="hoursOnUnit" title="${message(code: 'dailyWorkRecord.unit.label', default: 'Unit')}" />
						
						<g:sortableColumn property="dollarsCollected" title="${message(code: 'dailyWorkRecord.dollars.label', default: '$')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dailyWorkRecordInstanceList}" status="i" var="dailyWorkRecordInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
<%--						<td><g:link action="newJob" id="${dailyWorkRecordInstance.id}">${fieldValue(bean: dailyWorkRecordInstance, field: "id")}</g:link></td>--%>
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "id")}</td>
					
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "date")}</td>
						
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "lead")}</td>
					
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "leadHours")}</td>
					
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "leadMinutes")}</td>
					
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "helper")}</td>
					
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "helperHours")}</td>
						
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "helperMinutes")}</td>
						
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "vanNumber")}</td>
						
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "milesDriven")}</td>
						
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "hoursOnUnit")}</td>
						
						<td>${fieldValue(bean: dailyWorkRecordInstance, field: "dollarsCollected")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dailyWorkRecordInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
