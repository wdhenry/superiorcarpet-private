<%@ page import="com.superior.base.RoomGroup" %>



<div class="fieldcontain ${hasErrors(bean: roomGroupInstance, field: 'groupName', 'error')} required">
	<label for="groupName">
		<g:message code="roomGroup.groupName.label" default="Group Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="groupName" required="" value="${roomGroupInstance?.groupName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: roomGroupInstance, field: 'groupCharge', 'error')} ">
	<label for="groupCharge">
		<g:message code="roomGroup.groupCharge.label" default="Group Charge" />
		
	</label>
	<g:field name="groupCharge" value="${fieldValue(bean: roomGroupInstance, field: 'groupCharge')}"/>

</div>

