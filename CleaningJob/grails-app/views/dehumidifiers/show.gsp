
<%@ page import="com.superior.base.Dehumidifiers" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dehumidifiers.label', default: 'Dehumidifiers')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-dehumidifiers" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-dehumidifiers" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list dehumidifiers">
			
				<g:if test="${dehumidifiersInstance?.idNumber}">
				<li class="fieldcontain">
					<span id="idNumber-label" class="property-label"><g:message code="dehumidifiers.idNumber.label" default="Id Number" /></span>
					
						<span class="property-value" aria-labelledby="idNumber-label"><g:fieldValue bean="${dehumidifiersInstance}" field="idNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.serialNumber}">
				<li class="fieldcontain">
					<span id="serialNumber-label" class="property-label"><g:message code="dehumidifiers.serialNumber.label" default="Serial Number" /></span>
					
						<span class="property-value" aria-labelledby="serialNumber-label"><g:fieldValue bean="${dehumidifiersInstance}" field="serialNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.model}">
				<li class="fieldcontain">
					<span id="model-label" class="property-label"><g:message code="dehumidifiers.model.label" default="Model" /></span>
					
						<span class="property-value" aria-labelledby="model-label"><g:fieldValue bean="${dehumidifiersInstance}" field="model"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.isIn}">
				<li class="fieldcontain">
					<span id="isIn-label" class="property-label"><g:message code="dehumidifiers.isIn.label" default="Is In" /></span>
					
						<span class="property-value" aria-labelledby="isIn-label"><g:formatBoolean boolean="${dehumidifiersInstance?.isIn}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.hours}">
				<li class="fieldcontain">
					<span id="hours-label" class="property-label"><g:message code="dehumidifiers.hours.label" default="Hours" /></span>
					
						<span class="property-value" aria-labelledby="hours-label"><g:fieldValue bean="${dehumidifiersInstance}" field="hours"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.jobId}">
				<li class="fieldcontain">
					<span id="jobId-label" class="property-label"><g:message code="dehumidifiers.jobId.label" default="Job Id" /></span>
					
						<span class="property-value" aria-labelledby="jobId-label"><g:fieldValue bean="${dehumidifiersInstance}" field="jobId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.dateOut}">
				<li class="fieldcontain">
					<span id="dateOut-label" class="property-label"><g:message code="dehumidifiers.dateOut.label" default="Date Out" /></span>
					
						<span class="property-value" aria-labelledby="dateOut-label"><g:formatDate date="${dehumidifiersInstance?.dateOut}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.dateIn}">
				<li class="fieldcontain">
					<span id="dateIn-label" class="property-label"><g:message code="dehumidifiers.dateIn.label" default="Date In" /></span>
					
						<span class="property-value" aria-labelledby="dateIn-label"><g:formatDate date="${dehumidifiersInstance?.dateIn}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.leadOut}">
				<li class="fieldcontain">
					<span id="leadOut-label" class="property-label"><g:message code="dehumidifiers.leadOut.label" default="Lead Out" /></span>
					
						<span class="property-value" aria-labelledby="leadOut-label"><g:fieldValue bean="${dehumidifiersInstance}" field="leadOut"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.helperOut}">
				<li class="fieldcontain">
					<span id="helperOut-label" class="property-label"><g:message code="dehumidifiers.helperOut.label" default="Helper Out" /></span>
					
						<span class="property-value" aria-labelledby="helperOut-label"><g:fieldValue bean="${dehumidifiersInstance}" field="helperOut"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.leadIn}">
				<li class="fieldcontain">
					<span id="leadIn-label" class="property-label"><g:message code="dehumidifiers.leadIn.label" default="Lead In" /></span>
					
						<span class="property-value" aria-labelledby="leadIn-label"><g:fieldValue bean="${dehumidifiersInstance}" field="leadIn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dehumidifiersInstance?.helperIn}">
				<li class="fieldcontain">
					<span id="helperIn-label" class="property-label"><g:message code="dehumidifiers.helperIn.label" default="Helper In" /></span>
					
						<span class="property-value" aria-labelledby="helperIn-label"><g:fieldValue bean="${dehumidifiersInstance}" field="helperIn"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:dehumidifiersInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${dehumidifiersInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
