
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
			
<%--			<fieldset class="buttons">--%>
<%--				<g:link class="print" action="print" controller="extractionJobSearch" resource="${extractionJobCommandInstance}"><g:message code="default.button.print.label" default="Print" /></g:link>--%>
<%--			</fieldset>--%>
		</div>
	</body>
</html>
