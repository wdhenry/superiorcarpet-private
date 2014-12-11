
<%@ page import="com.superior.base.Customer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'customer.label', default: 'Customer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-customer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.search.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-customer" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<ol class="property-list customer">
				<g:if test="${customerInstance?.firstName}">
					<li class="fieldcontain">
						<span id="firstName-label" class="property-label"><g:message code="customer.firstName.label" default="First Name" /></span>
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${customerInstance}" field="firstName"/></span>
					</li>
				</g:if>
				
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="customer.lastName.label" default="Last Name" /></span>
					<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${customerInstance}" field="lastName"/></span>
				</li>
				
				<li class="fieldcontain">
					<span id="addressLineOne-label" class="property-label"><g:message code="customer.addressLineOne.label" default="Address Line One" /></span>
					<span class="property-value" aria-labelledby="addressLineOne-label"><g:fieldValue bean="${customerInstance}" field="addressLineOne"/></span>
				</li>
				
				<g:if test="${customerInstance?.addressLineTwo}">
					<li class="fieldcontain">
						<span id="addressLineTwo-label" class="property-label"><g:message code="customer.addressLineTwo.label" default="Address Line Two" /></span>
						<span class="property-value" aria-labelledby="addressLineTwo-label"><g:fieldValue bean="${customerInstance}" field="addressLineTwo"/></span>
					</li>
				</g:if>
				
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="customer.city.label" default="City" /></span>
					<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${customerInstance}" field="city"/></span>
				</li>
			
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="customer.state.label" default="State" /></span>
					<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${customerInstance}" field="state"/></span>
				</li>
				
				<li class="fieldcontain">
					<span id="zip-label" class="property-label"><g:message code="customer.zip.label" default="Zip" /></span>
					<span class="property-value" aria-labelledby="zip-label"><g:fieldValue bean="${customerInstance}" field="zip"/></span>
				</li>
				
				<li class="fieldcontain">
					<span id="phoneNumber-label" class="property-label"><g:message code="customer.phoneNumber.label" default="Phone Number" /></span>
					<span class="property-value" aria-labelledby="phoneNumber-label"><g:fieldValue bean="${customerInstance}" field="phoneNumber"/></span>
				</li>
			</ol>
			<fieldset class="buttons">
				<g:link class="search" action="custjobs" controller="cleaningJobSearch" id="${customerInstance.id}"><g:message code="default.button.search.label" default="Search for Carpet Care Jobs" /></g:link>
				<g:link class="search" action="custjobs" controller="extractionJobSearch" id="${customerInstance.id}"><g:message code="default.button.search.label" default="Search for Water Extraction Jobs" /></g:link>
			</fieldset>
		</div>
	</body>
</html>
