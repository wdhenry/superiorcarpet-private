<%@ page import="com.superior.base.Dehumidifiers" %>



<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'idNumber', 'error')} required">
	<label for="idNumber">
		<g:message code="dehumidifiers.idNumber.label" default="Id Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="idNumber" required="" value="${dehumidifiersInstance?.idNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'serialNumber', 'error')} required">
	<label for="serialNumber">
		<g:message code="dehumidifiers.serialNumber.label" default="Serial Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="serialNumber" required="" value="${dehumidifiersInstance?.serialNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'model', 'error')} required">
	<label for="model">
		<g:message code="dehumidifiers.model.label" default="Model" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="model" required="" value="${dehumidifiersInstance?.model}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'isIn', 'error')} ">
	<label for="isIn">
		<g:message code="dehumidifiers.isIn.label" default="Is In" />
		
	</label>
	<g:checkBox name="isIn" value="${dehumidifiersInstance?.isIn}" />

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'hours', 'error')} ">
	<label for="hours">
		<g:message code="dehumidifiers.hours.label" default="Hours" />
		
	</label>
	<g:field name="hours" value="${fieldValue(bean: dehumidifiersInstance, field: 'hours')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'jobId', 'error')} ">
	<label for="jobId">
		<g:message code="dehumidifiers.jobId.label" default="Job Id" />
		
	</label>
	<g:field name="jobId" type="number" value="${dehumidifiersInstance.jobId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'dateOut', 'error')} ">
	<label for="dateOut">
		<g:message code="dehumidifiers.dateOut.label" default="Date Out" />
		
	</label>
	<g:datePicker name="dateOut" precision="day"  value="${dehumidifiersInstance?.dateOut}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'dateIn', 'error')} ">
	<label for="dateIn">
		<g:message code="dehumidifiers.dateIn.label" default="Date In" />
		
	</label>
	<g:datePicker name="dateIn" precision="day"  value="${dehumidifiersInstance?.dateIn}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'leadOut', 'error')} ">
	<label for="leadOut">
		<g:message code="dehumidifiers.leadOut.label" default="Lead Out" />
		
	</label>
	<g:textField name="leadOut" value="${dehumidifiersInstance?.leadOut}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'helperOut', 'error')} ">
	<label for="helperOut">
		<g:message code="dehumidifiers.helperOut.label" default="Helper Out" />
		
	</label>
	<g:textField name="helperOut" value="${dehumidifiersInstance?.helperOut}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'leadIn', 'error')} ">
	<label for="leadIn">
		<g:message code="dehumidifiers.leadIn.label" default="Lead In" />
		
	</label>
	<g:textField name="leadIn" value="${dehumidifiersInstance?.leadIn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dehumidifiersInstance, field: 'helperIn', 'error')} ">
	<label for="helperIn">
		<g:message code="dehumidifiers.helperIn.label" default="Helper In" />
		
	</label>
	<g:textField name="helperIn" value="${dehumidifiersInstance?.helperIn}"/>

</div>

