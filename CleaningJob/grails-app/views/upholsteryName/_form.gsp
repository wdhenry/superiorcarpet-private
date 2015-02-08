<%@ page import="com.superior.base.UpholsteryName" %>



<div class="fieldcontain ${hasErrors(bean: upholsteryNameInstance, field: 'upholsteryName', 'error')} required">
	<label for="upholsteryName">
		<g:message code="upholsteryName.upholsteryName.label" default="Upholstery Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="upholsteryName" required="" value="${upholsteryNameInstance?.upholsteryName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: upholsteryNameInstance, field: 'upholsteryCharge', 'error')} ">
	<label for="upholsteryCharge">
		<g:message code="upholsteryName.upholsteryCharge.label" default="Upholstery Charge" />
		
	</label>
	<g:field name="upholsteryCharge" value="${fieldValue(bean: upholsteryNameInstance, field: 'upholsteryCharge')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: upholsteryNameInstance, field: 'upholsteryProtect', 'error')} ">
	<label for="upholsteryProtect">
		<g:message code="upholsteryName.upholsteryProtect.label" default="Upholstery Protect" />
		
	</label>
	<g:field name="upholsteryProtect" value="${fieldValue(bean: upholsteryNameInstance, field: 'upholsteryProtect')}"/>

</div>

