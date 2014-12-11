<%@ page import="com.superior.base.Fans" %>



<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'idNumber', 'error')} required">
	<label for="idNumber">
		<g:message code="fans.idNumber.label" default="Id Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="idNumber" required="" value="${fansInstance?.idNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'serialNumber', 'error')} required">
	<label for="serialNumber">
		<g:message code="fans.serialNumber.label" default="Serial Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="serialNumber" required="" value="${fansInstance?.serialNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'model', 'error')} required">
	<label for="model">
		<g:message code="fans.model.label" default="Model" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="model" required="" value="${fansInstance?.model}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'isIn', 'error')} ">
	<label for="isIn">
		<g:message code="fans.isIn.label" default="Is In" />
		
	</label>
	<g:checkBox name="isIn" value="${fansInstance?.isIn}" />

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'jobId', 'error')} ">
	<label for="jobId">
		<g:message code="fans.jobId.label" default="Job Id" />
		
	</label>
	<g:field name="jobId" type="number" value="${fansInstance.jobId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'dateOut', 'error')} ">
	<label for="dateOut">
		<g:message code="fans.dateOut.label" default="Date Out" />
		
	</label>
	<g:datePicker name="dateOut" precision="day"  value="${fansInstance?.dateOut}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'dateIn', 'error')} ">
	<label for="dateIn">
		<g:message code="fans.dateIn.label" default="Date In" />
		
	</label>
	<g:datePicker name="dateIn" precision="day"  value="${fansInstance?.dateIn}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'leadOut', 'error')} ">
	<label for="leadOut">
		<g:message code="fans.leadOut.label" default="Lead Out" />
		
	</label>
	<g:textField name="leadOut" value="${fansInstance?.leadOut}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'helperOut', 'error')} ">
	<label for="helperOut">
		<g:message code="fans.helperOut.label" default="Helper Out" />
		
	</label>
	<g:textField name="helperOut" value="${fansInstance?.helperOut}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'leadIn', 'error')} ">
	<label for="leadIn">
		<g:message code="fans.leadIn.label" default="Lead In" />
		
	</label>
	<g:textField name="leadIn" value="${fansInstance?.leadIn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fansInstance, field: 'helperIn', 'error')} ">
	<label for="helperIn">
		<g:message code="fans.helperIn.label" default="Helper In" />
		
	</label>
	<g:textField name="helperIn" value="${fansInstance?.helperIn}"/>

</div>

