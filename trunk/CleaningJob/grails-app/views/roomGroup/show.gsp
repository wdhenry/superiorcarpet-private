
<%@ page import="com.superior.base.RoomGroup" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'roomGroup.label', default: 'RoomGroup')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-roomGroup" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-roomGroup" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list roomGroup">
			
				<g:if test="${roomGroupInstance?.groupName}">
				<li class="fieldcontain">
					<span id="groupName-label" class="property-label"><g:message code="roomGroup.groupName.label" default="Group Name" /></span>
					
						<span class="property-value" aria-labelledby="groupName-label"><g:fieldValue bean="${roomGroupInstance}" field="groupName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${roomGroupInstance?.groupCharge}">
				<li class="fieldcontain">
					<span id="groupCharge-label" class="property-label"><g:message code="roomGroup.groupCharge.label" default="Group Charge" /></span>
					
						<span class="property-value" aria-labelledby="groupCharge-label">
							<g:formatNumber number="${roomGroupInstance.groupCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" />
						</span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:roomGroupInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${roomGroupInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:submitButton class="delete" name="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
