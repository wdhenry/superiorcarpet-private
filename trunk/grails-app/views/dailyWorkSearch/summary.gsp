
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
				<li><g:link class="search" action="index"><g:message code="default.search.label" args="[entityName]" /></g:link></li>
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
					
						<g:sortableColumn property="date" title="${message(code: 'dailywork.date.label', default: 'Date')}" />
						
						<g:sortableColumn property="lead" title="${message(code: 'dailywork.lead.label', default: 'Lead')}" />
					
						<g:sortableColumn property="leadHours" title="${message(code: 'dailywork.leadHours.label', default: 'Hours')}" />
					
						<g:sortableColumn property="leadMinutes" title="${message(code: 'dailywork.leadMinutes.label', default: 'Minutes')}" />
					
						<g:sortableColumn property="helper" title="${message(code: 'dailywork.helper.label', default: 'Helper')}" />
					
						<g:sortableColumn property="helperHours" title="${message(code: 'dailywork.helperHours.label', default: 'Hours')}" />
					
						<g:sortableColumn property="helperMinutes" title="${message(code: 'dailywork.helperMinutes.label', default: 'Minutes')}" />
						
						<g:sortableColumn property="vanNumber" title="${message(code: 'dailywork.van.label', default: 'Van')}" />
						
						<g:sortableColumn property="miles" title="${message(code: 'dailywork.miles.label', default: 'Miles')}" />
						
						<g:sortableColumn property="hours" title="${message(code: 'dailywork.hours.label', default: 'Unit Hours')}" />
						
						<g:sortableColumn property="collected" title="${message(code: 'dailywork.collected.label', default: 'Collected')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${work}" status="i" var="dailyworkInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td>${fieldValue(bean: dailyworkInstance, field: "date")}</td>
						
						<td>${fieldValue(bean: dailyworkInstance, field: "lead")}</td>
						
						<td>${fieldValue(bean: dailyworkInstance, field: "leadHours")}</td>
					
						<td>${fieldValue(bean: dailyworkInstance, field: "leadMinutes")}</td>
					
						<td>${fieldValue(bean: dailyworkInstance, field: "helper")}</td>
					
						<td>${fieldValue(bean: dailyworkInstance, field: "helperHours")}</td>
						
						<td>${fieldValue(bean: dailyworkInstance, field: "helperMinutes")}</td>
					
						<td>${fieldValue(bean: dailyworkInstance, field: "vanNumber")}</td>
						
						<td>${fieldValue(bean: dailyworkInstance, field: "milesDriven")}</td>
						
						<td>${fieldValue(bean: dailyworkInstance, field: "hoursOnUnit")}</td>
						
						<td>${fieldValue(bean: dailyworkInstance, field: "dollarsCollected")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dailyWorkJobInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
