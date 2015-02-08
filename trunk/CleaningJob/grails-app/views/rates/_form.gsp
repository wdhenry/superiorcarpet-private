<%@ page import="com.superior.base.Rates" %>



<div class="fieldcontain ${hasErrors(bean: ratesInstance, field: 'rateName', 'error')} required">
	<label for="rateName">
		<g:message code="rates.rateName.label" default="Rate Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="rateName" required="" value="${ratesInstance?.rateName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ratesInstance, field: 'rateCharge', 'error')} ">
	<label for="rateCharge">
		<g:message code="rates.rateCharge.label" default="Rate Charge" />
		
	</label>
	<g:field name="rateCharge" value="${fieldValue(bean: ratesInstance, field: 'rateCharge')}"/>

</div>

