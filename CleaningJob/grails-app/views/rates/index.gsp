
<%@ page import="com.superior.base.Rates" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'rates.label', default: 'Rates')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-rates" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-rates" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="rateName" title="${message(code: 'rates.rateName.label', default: 'Rate Name')}" />
					
						<g:sortableColumn property="rateCharge" title="${message(code: 'rates.rateCharge.label', default: 'Rate Charge')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${ratesInstanceList}" status="i" var="ratesInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${ratesInstance.id}">${fieldValue(bean: ratesInstance, field: "rateName")}</g:link></td>
					
						<td><g:formatNumber number="${ratesInstance.rateCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" />
						</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${ratesInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
