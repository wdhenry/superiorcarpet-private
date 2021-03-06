<%@ page import="com.superior.base.Customer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'customer.label', default: 'Customer')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-customer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="search" action="index"><g:message code="default.search.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-customer" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${customerSearchCommandInstance}">
				<ul class="errors" role="alert">
					<g:eachError bean="${customerSearchCommandInstance}" var="error">
						<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
					</g:eachError>
				</ul>
			</g:hasErrors>
			<table>
				<thead>
					<tr>
						<g:sortableColumn property="id" title="${message(code: 'customer.id.label', default: 'Id')}" />
						<g:sortableColumn property="firstName" title="${message(code: 'customer.firstName.label', default: 'First Name')}" />
						<g:sortableColumn property="lastName" title="${message(code: 'customer.lastName.label', default: 'Last Name')}" />
						<g:sortableColumn property="addressLineOne" title="${message(code: 'customer.addressLineOne.label', default: 'Address')}" />
						<g:sortableColumn property="addressLineTwo" title="${message(code: 'customer.addressLineTwo.label', default: 'Address')}" />
						<g:sortableColumn property="city" title="${message(code: 'customer.city.label', default: 'City')}" />
						<g:sortableColumn property="state" title="${message(code: 'customer.state.label', default: 'State')}" />
						<g:sortableColumn property="zip" title="${message(code: 'customer.zip.label', default: 'Zip')}" />
						<g:sortableColumn property="phone" title="${message(code: 'customer.phone.label', default: 'Phone')}" />
					</tr>
				</thead>
				<tbody>
				<g:each in="${customers}" status="i" var="customerInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
						<td><g:link action="details" id="${customerInstance.id}">${fieldValue(bean: customerInstance, field: "id")}</g:link></td>
						<td>${fieldValue(bean: customerInstance, field: "firstName")}</td>
						<td>${fieldValue(bean: customerInstance, field: "lastName")}</td>
						<td>${fieldValue(bean: customerInstance, field: "addressLineOne")}</td>
						<td>${fieldValue(bean: customerInstance, field: "addressLineTwo")}</td>
						<td>${fieldValue(bean: customerInstance, field: "city")}</td>
						<td>${fieldValue(bean: customerInstance, field: "state")}</td>
						<td>${fieldValue(bean: customerInstance, field: "zip")}</td>
						<td>${fieldValue(bean: customerInstance, field: "phoneNumber")}</td>
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${custListInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
