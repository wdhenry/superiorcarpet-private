<%@ page import="com.superior.base.CarpetCareJob" %>



<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'customerId', 'error')} required">
	<label for="customerId">
		<g:message code="carpetCareJob.customerId.label" default="Customer Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="customerId" type="number" value="${carpetCareJobInstance.customerId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="carpetCareJob.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="day"  value="${carpetCareJobInstance?.date}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'lead', 'error')} required">
	<label for="lead">
		<g:message code="carpetCareJob.lead.label" default="Lead" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lead" required="" value="${carpetCareJobInstance?.lead}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'helper', 'error')} ">
	<label for="helper">
		<g:message code="carpetCareJob.helper.label" default="Helper" />
		
	</label>
	<g:textField name="helper" value="${carpetCareJobInstance?.helper}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'groupName', 'error')} ">
	<label for="groupName">
		<g:message code="carpetCareJob.groupName.label" default="Group Name" />
		
	</label>
	<g:textField name="groupName" value="${carpetCareJobInstance?.groupName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'groupRate', 'error')} ">
	<label for="groupRate">
		<g:message code="carpetCareJob.groupRate.label" default="Group Rate" />
		
	</label>
	<g:field name="groupRate" value="${fieldValue(bean: carpetCareJobInstance, field: 'groupRate')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: carpetCareJobInstance, field: 'comment', 'error')} ">
	<label for="comment">
		<g:message code="carpetCareJob.comment.label" default="Comment" />
		
	</label>
	<g:textField name="comment" value="${carpetCareJobInstance?.comment}"/>

</div>

