<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'customer.label', default: 'Carpet Care Job')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#create-customer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message args="[entityName]" />Customer List</g:link></li>
			</ul>
		</div>
		<div id="create-job" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /> for Customer: ${fieldValue(bean: cleaningJobCommandInstance, field: "firstName")} ${fieldValue(bean: cleaningJobCommandInstance, field: "lastName")}</h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${cleaningJobCommandInstance}">
				<ul class="errors" role="alert">
					<g:eachError bean="${cleaningJobCommandInstance}" var="error">
						<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
					</g:eachError>
				</ul>
			</g:hasErrors>
		
			<g:form url="[controller:'cleaningJob', action:'saveJob']" >
				<fieldset class="form">
					<g:render template="formCleaningJob"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
				</fieldset>
			</g:form>
		</div>
		<g:javascript src="utils.js"/>
		<g:javascript src="cleaningJob/ratesService.js"/>
		<g:javascript src="cleaningJob/miscChargesNameService.js"/>
		<g:javascript src="cleaningJob/upholsteryNameService.js"/>
		<g:javascript src="cleaningJob/roomGroupService.js"/>
		<g:javascript src="cleaningJob/groupRooms.js"/>
		<g:javascript src="cleaningJob/additionalRooms.js"/>
		<g:javascript src="cleaningJob/stairs.js"/>
		<g:javascript src="cleaningJob/hardSurfaceRoom.js"/>
		<g:javascript src="cleaningJob/upholstery.js"/>
		<g:javascript src="cleaningJob/miscCharge.js"/>
	</body>
</html>
