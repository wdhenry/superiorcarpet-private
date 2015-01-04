
<%@ page import="com.superior.base.WaterExtractionJob" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'waterExtractionJob.label', default: 'Water Extraction Job')}" />
		<g:set var="customerName" value="${message(code: 'carpetCareJob.label', default: 'Customer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-waterExtractionJob" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.search.label" args="[entityName]" /></g:link></li>
				<li><g:link class="search" action="index" controller="customerSearch" ><g:message code="default.search.label" args="[customerName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-waterExtractionJob" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<fieldset class="form">
					<g:render template="formExtractionJob"/>
				</fieldset>
			
<%--			<ol class="property-list waterExtractionJob">--%>
<%--				<li class="fieldcontain">--%>
<%--					<span id="customerId-label" class="property-label"><g:message code="waterExtractionJob.customerId.label" default="Customer Id" /></span>--%>
<%--					<span class="property-value" aria-labelledby="customerId-label"><g:fieldValue bean="${extractionJobCommandInstance}" field="customerId"/></span>--%>
<%--				</li>--%>
<%--				--%>
<%--				<li class="fieldcontain">--%>
<%--					<span id="date-label" class="property-label"><g:message code="waterExtractionJob.date.label" default="Date" /></span>--%>
<%--					<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${extractionJobCommandInstance?.date}" /></span>--%>
<%--				</li>--%>
<%--			--%>
<%--				<li class="fieldcontain">--%>
<%--					<span id="lead-label" class="property-label"><g:message code="waterExtractionJob.lead.label" default="Lead" /></span>--%>
<%--					<span class="property-value" aria-labelledby="lead-label"><g:fieldValue bean="${extractionJobCommandInstance}" field="lead"/></span>--%>
<%--				</li>--%>
<%--				--%>
<%--				<li class="fieldcontain">--%>
<%--					<span id="helper-label" class="property-label"><g:message code="waterExtractionJob.helper.label" default="Helper" /></span>--%>
<%--					<span class="property-value" aria-labelledby="helper-label"><g:fieldValue bean="${extractionJobCommandInstance}" field="helper"/></span>--%>
<%--				</li>--%>
<%--				--%>
<%--				<li class="fieldcontain">--%>
<%--					<span id="groupName-label" class="property-label"><g:message code="waterExtractionJob.startTime.label" default="Start Time" /></span>--%>
<%--					<span class="property-value" aria-labelledby="groupName-label"><g:formatDate date="${extractionJobCommandInstance?.startTime}" /></span>--%>
<%--				</li>--%>
<%--			--%>
<%--				<li class="fieldcontain">--%>
<%--					<span id="groupRate-label" class="property-label"><g:message code="waterExtractionJob.endTime.label" default="End Time" /></span>--%>
<%--					<span class="property-value" aria-labelledby="groupRate-label"><g:formatDate date="${extractionJobCommandInstance?.endTime}" /></span>--%>
<%--				</li>--%>
<%--			</ol>--%>
			
			<fieldset class="buttons">
				<g:link class="print" action="print" controller="extractionJobSearch" resource="${extractionJobCommandInstance}"><g:message code="default.button.print.label" default="Print" /></g:link>
			</fieldset>
		</div>
	</body>
</html>
