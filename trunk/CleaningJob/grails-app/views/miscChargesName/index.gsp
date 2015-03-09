<%@ page import="com.superior.base.MiscChargesName"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName" value="${message(code: 'miscChargesName.label', default: 'MiscChargesName')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
	<a href="#list-miscChargesName" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="default.new.label" args="[entityName]" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-miscChargesName" class="content scaffold-list" role="main">
		<h1>
			<g:message code="default.list.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					<g:sortableColumn property="miscChargesName" title="${message(code: 'miscChargesName.miscChargesName.label', default: 'Misc Charge Name')}" />

					<g:sortableColumn property="miscChargeRate" title="${message(code: 'miscChargesName.miscChargeRate.label', default: 'Misc Charge Rate')}" />

				</tr>
			</thead>
			<tbody>
				<g:each in="${miscChargesNameInstanceList}" status="i" var="miscChargesNameInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${miscChargesNameInstance.id}">
								${fieldValue(bean: miscChargesNameInstance, field: "miscChargesName")}
							</g:link></td>

						<td><g:formatNumber number="${miscChargesNameInstance.miscChargeRate}" type="currency" maxFractionDigits="2" currencyCode="USD" /></td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${miscChargesNameInstanceCount ?: 0}" />
		</div>
	</div>
</body>
</html>
