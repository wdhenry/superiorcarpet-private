
<%@ page import="com.superior.base.UpholsteryName" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'upholsteryName.label', default: 'UpholsteryName')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-upholsteryName" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-upholsteryName" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list upholsteryName">
			
				<g:if test="${upholsteryNameInstance?.upholsteryName}">
				<li class="fieldcontain">
					<span id="upholsteryName-label" class="property-label"><g:message code="upholsteryName.upholsteryName.label" default="Upholstery Name" /></span>
					
						<span class="property-value" aria-labelledby="upholsteryName-label"><g:fieldValue bean="${upholsteryNameInstance}" field="upholsteryName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${upholsteryNameInstance?.upholsteryCharge}">
				<li class="fieldcontain">
					<span id="upholsteryCharge-label" class="property-label"><g:message code="upholsteryName.upholsteryCharge.label" default="Upholstery Charge" /></span>
					
						<span class="property-value" aria-labelledby="upholsteryCharge-label">
							<g:formatNumber number="${upholsteryNameInstance.upholsteryCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" />
						</span>
					
				</li>
				</g:if>
			
				<g:if test="${upholsteryNameInstance?.upholsteryProtect}">
				<li class="fieldcontain">
					<span id="upholsteryProtect-label" class="property-label"><g:message code="upholsteryName.upholsteryProtect.label" default="Upholstery Protect" /></span>
					
						<span class="property-value" aria-labelledby="upholsteryProtect-label">
							<g:formatNumber number="${upholsteryNameInstance.upholsteryProtect}"
								type="currency" maxFractionDigits="2" currencyCode="USD" />
						</span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:upholsteryNameInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${upholsteryNameInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:submitButton class="delete" name="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
