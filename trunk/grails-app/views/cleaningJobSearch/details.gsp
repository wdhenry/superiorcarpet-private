
<%@ page import="com.superior.base.CarpetCareJob" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'carpetCareJob.label', default: 'Carpet Care Job')}" />
		<g:set var="customerName" value="${message(code: 'carpetCareJob.label', default: 'Customer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-carpetCareJob" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.search.label" args="[entityName]" /></g:link></li>
				<li><g:link class="search" action="index" controller="customerSearch" ><g:message code="default.search.label" args="[customerName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-carpetCareJob" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<ol class="property-list carpetCareJob">
				<li class="fieldcontain">
					<span id="customerId-label" class="property-label"><g:message code="carpetCareJob.customerId.label" default="Customer Id" /></span>
					<span class="property-value" aria-labelledby="customerId-label"><g:fieldValue bean="${carpetCareJobInstance}" field="customerId"/></span>
				</li>
				
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="carpetCareJob.date.label" default="Date" /></span>
					<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${carpetCareJobInstance?.date}" /></span>
				</li>
			
				<li class="fieldcontain">
					<span id="lead-label" class="property-label"><g:message code="carpetCareJob.lead.label" default="Lead" /></span>
					<span class="property-value" aria-labelledby="lead-label"><g:fieldValue bean="${carpetCareJobInstance}" field="lead"/></span>
				</li>
				
				<li class="fieldcontain">
					<span id="helper-label" class="property-label"><g:message code="carpetCareJob.helper.label" default="Helper" /></span>
					<span class="property-value" aria-labelledby="helper-label"><g:fieldValue bean="${carpetCareJobInstance}" field="helper"/></span>
				</li>
				
				<g:if test="${carpetCareJobInstance?.groupName}">
					<li class="fieldcontain">
						<span id="groupName-label" class="property-label"><g:message code="carpetCareJob.groupName.label" default="Group Name" /></span>
						<span class="property-value" aria-labelledby="groupName-label"><g:fieldValue bean="${carpetCareJobInstance}" field="groupName"/></span>
					</li>
				</g:if>
			
				<g:if test="${carpetCareJobInstance?.groupRate}">
					<li class="fieldcontain">
						<span id="groupRate-label" class="property-label"><g:message code="carpetCareJob.groupRate.label" default="Group Rate" /></span>
						<span class="property-value" aria-labelledby="groupRate-label"><g:fieldValue bean="${carpetCareJobInstance}" field="groupRate"/></span>
					</li>
				</g:if>
			
				<g:if test="${carpetCareJobInstance?.comment}">
					<li class="fieldcontain">
						<span id="comment-label" class="property-label"><g:message code="carpetCareJob.comment.label" default="Comment" /></span>
						<span class="property-value" aria-labelledby="comment-label"><g:fieldValue bean="${carpetCareJobInstance}" field="comment"/></span>
					</li>
				</g:if>
			</ol>
			
			<fieldset class="buttons">
				<g:link class="print" action="print" controller="cleaningJobSearch" resource="${carpetCareJobInstance}"><g:message code="default.button.print.label" default="Print" /></g:link>
			</fieldset>
		</div>
	</body>
</html>
