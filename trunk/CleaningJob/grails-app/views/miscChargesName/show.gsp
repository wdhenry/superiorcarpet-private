<%@ page import="com.superior.base.MiscChargesName"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName" value="${message(code: 'miscChargesName.label', default: 'MiscChargesName')}" />
<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
	<a href="#show-miscChargesName" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label" /></a></li>
			<li><g:link class="list" action="index">
					<g:message code="default.list.label" args="[entityName]" />
				</g:link></li>
			<li><g:link class="create" action="create">
					<g:message code="default.new.label" args="[entityName]" />
				</g:link></li>
		</ul>
	</div>
	<div id="show-miscChargesName" class="content scaffold-show" role="main">
		<h1>
			<g:message code="default.show.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<ol class="property-list miscChargesName">

			<g:if test="${miscChargesNameInstance?.miscChargesName}">
				<li class="fieldcontain"><span id="miscChargesName-label" class="property-label"><g:message code="miscChargesName.miscChargesName.label" default="Misc Charges Name" /></span>

					<span class="property-value" aria-labelledby="miscChargesName-label"><g:fieldValue bean="${miscChargesNameInstance}" field="miscChargesName" /></span></li>
			</g:if>

			<g:if test="${miscChargesNameInstance?.miscChargeRate}">
				<li class="fieldcontain"><span id="miscChargeRate-label" class="property-label"><g:message code="miscChargesName.miscChargeRate.label" default="Misc Charge Rate" /></span>

					<span class="property-value" aria-labelledby="miscChargeRate-label"><g:formatNumber number="${miscChargesNameInstance.miscChargeRate}" type="currency"
							maxFractionDigits="2" currencyCode="USD" /></span></li>
			</g:if>

		</ol>
		<g:form url="[resource:miscChargesNameInstance, action:'delete']" method="DELETE">
			<fieldset class="buttons">
				<g:link class="edit" action="edit" resource="${miscChargesNameInstance}">
					<g:message code="default.button.edit.label" default="Edit" />
				</g:link>
				<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}"
					onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
			</fieldset>
		</g:form>
	</div>
</body>
</html>
