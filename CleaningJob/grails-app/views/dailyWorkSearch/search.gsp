
<%@ page import="com.superior.base.DailyWorkRecord" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dailywork.label', default: 'Daily Work')}" />
		<title><g:message code="default.search.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#searchlist-dailywork" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
		<div id="search-dailywork" class="content scaffold-list" role="main">
			<h1><g:message code="default.search.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${dailySearchCommandInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${dailySearchCommandInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:dailySearchCommandInstance, action:'search']" >
				<fieldset class="form">
					<g:render template="formSearch"/>
				</fieldset>
				<fieldset class="buttons">
					<g:actionSubmit class="save" action="search" value="${message(code: 'default.button.search.label', default: 'Search')}" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>