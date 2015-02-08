
<%@ page import="com.superior.base.UpholsteryName" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'upholsteryName.label', default: 'UpholsteryName')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-upholsteryName" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-upholsteryName" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="upholsteryName" title="${message(code: 'upholsteryName.upholsteryName.label', default: 'Upholstery Name')}" />
					
						<g:sortableColumn property="upholsteryCharge" title="${message(code: 'upholsteryName.upholsteryCharge.label', default: 'Upholstery Charge')}" />
					
						<g:sortableColumn property="upholsteryProtect" title="${message(code: 'upholsteryName.upholsteryProtect.label', default: 'Upholstery Protect')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${upholsteryNameInstanceList}" status="i" var="upholsteryNameInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${upholsteryNameInstance.id}">${fieldValue(bean: upholsteryNameInstance, field: "upholsteryName")}</g:link></td>
					
						<td>
							<g:formatNumber number="${upholsteryNameInstance.upholsteryCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" />
						</td>
					
						<td>
							<g:formatNumber number="${upholsteryNameInstance.upholsteryProtect}"
								type="currency" maxFractionDigits="2" currencyCode="USD" />
						</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${upholsteryNameInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
