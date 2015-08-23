<%@ page import="com.superior.base.Fans" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fans.label', default: 'Fans')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#edit-fans" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="edit-fans" class="content scaffold-edit" role="main">
			<h1><g:message code="default.edit.label" args="[entityName]" />-fanReturn/edit.gsp</h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${fansInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${fansInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[ controller:'fanReturn', action:'updateFanReturn', id:fansInstance.id ]" method="PUT" >
				<g:hiddenField name="version" value="${fansInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton class="save" name="update" value="${message(code: 'default.button.checkin.label', default: 'Check In')}" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
