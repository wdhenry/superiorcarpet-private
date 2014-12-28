
<%@ page import="com.superior.base.Fans" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fans.label', default: 'Fans')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-fans" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-fans" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list fans">
			
				<g:if test="${fansInstance?.idNumber}">
				<li class="fieldcontain">
					<span id="idNumber-label" class="property-label"><g:message code="fans.idNumber.label" default="Id Number" /></span>
					
						<span class="property-value" aria-labelledby="idNumber-label"><g:fieldValue bean="${fansInstance}" field="idNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.serialNumber}">
				<li class="fieldcontain">
					<span id="serialNumber-label" class="property-label"><g:message code="fans.serialNumber.label" default="Serial Number" /></span>
					
						<span class="property-value" aria-labelledby="serialNumber-label"><g:fieldValue bean="${fansInstance}" field="serialNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.model}">
				<li class="fieldcontain">
					<span id="model-label" class="property-label"><g:message code="fans.model.label" default="Model" /></span>
					
						<span class="property-value" aria-labelledby="model-label"><g:fieldValue bean="${fansInstance}" field="model"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.isIn}">
				<li class="fieldcontain">
					<span id="isIn-label" class="property-label"><g:message code="fans.isIn.label" default="Is In" /></span>
					
						<span class="property-value" aria-labelledby="isIn-label"><g:formatBoolean boolean="${fansInstance?.isIn}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.jobId}">
				<li class="fieldcontain">
					<span id="jobId-label" class="property-label"><g:message code="fans.jobId.label" default="Job Id" /></span>
					
						<span class="property-value" aria-labelledby="jobId-label"><g:fieldValue bean="${fansInstance}" field="jobId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.dateOut}">
				<li class="fieldcontain">
					<span id="dateOut-label" class="property-label"><g:message code="fans.dateOut.label" default="Date Out" /></span>
					
						<span class="property-value" aria-labelledby="dateOut-label"><g:formatDate format="MM-dd-yyyy" date="${fansInstance?.dateOut}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.leadOut}">
				<li class="fieldcontain">
					<span id="leadOut-label" class="property-label"><g:message code="fans.leadOut.label" default="Lead Out" /></span>
					
						<span class="property-value" aria-labelledby="leadOut-label"><g:fieldValue bean="${fansInstance}" field="leadOut"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.helperOut}">
				<li class="fieldcontain">
					<span id="helperOut-label" class="property-label"><g:message code="fans.helperOut.label" default="Helper Out" /></span>
					
						<span class="property-value" aria-labelledby="helperOut-label"><g:fieldValue bean="${fansInstance}" field="helperOut"/></span>
					
				</li>
				</g:if>
				
				<g:if test="${fansInstance?.isIn}">
				<li class="fieldcontain">
					<span id="dateIn-label" class="property-label"><g:message code="fans.dateIn.label" default="Date In" /></span>
					
						<span class="property-value" aria-labelledby="dateIn-label"><g:formatDate format="MM-dd-yyyy" date="${fansInstance?.dateIn}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.isIn}">
				<li class="fieldcontain">
					<span id="leadIn-label" class="property-label"><g:message code="fans.leadIn.label" default="Lead In" /></span>
					
						<span class="property-value" aria-labelledby="leadIn-label"><g:fieldValue bean="${fansInstance}" field="leadIn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fansInstance?.isIn}">
				<li class="fieldcontain">
					<span id="helperIn-label" class="property-label"><g:message code="fans.helperIn.label" default="Helper In" /></span>
					
						<span class="property-value" aria-labelledby="helperIn-label"><g:fieldValue bean="${fansInstance}" field="helperIn"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:fansInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${fansInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
