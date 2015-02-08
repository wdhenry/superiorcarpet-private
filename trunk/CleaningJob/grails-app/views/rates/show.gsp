
<%@ page import="com.superior.base.Rates" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'rates.label', default: 'Rates')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-rates" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-rates" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list rates">
			
				<g:if test="${ratesInstance?.rateName}">
				<li class="fieldcontain">
					<span id="rateName-label" class="property-label"><g:message code="rates.rateName.label" default="Rate Name" /></span>
					
						<span class="property-value" aria-labelledby="rateName-label"><g:fieldValue bean="${ratesInstance}" field="rateName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ratesInstance?.rateCharge}">
				<li class="fieldcontain">
					<span id="rateCharge-label" class="property-label"><g:message code="rates.rateCharge.label" default="Rate Charge" /></span>
					
						<span class="property-value" aria-labelledby="rateCharge-label"><g:formatNumber number="${ratesInstance.rateCharge}"
							 type="currency" maxFractionDigits="2" currencyCode="USD" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:ratesInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${ratesInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
