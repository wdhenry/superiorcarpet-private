<%@ page import="com.superior.base.MiscChargesName"%>

<div class="fieldcontain ${hasErrors(bean: miscChargesNameInstance, field: 'miscChargesName', 'error')} required">
	<label for="miscChargesName"> <g:message code="miscChargesName.miscChargesName.label" default="Misc Charges Name" /> <span class="required-indicator">*</span>
	</label>
	<g:textField name="miscChargesName" required="" value="${miscChargesNameInstance?.miscChargesName}" />

</div>

<div class="fieldcontain ${hasErrors(bean: miscChargesNameInstance, field: 'miscChargeRate', 'error')} ">
	<label for="miscChargeRate"> <g:message code="miscChargesName.miscChargeRate.label" default="Rate Charge" />

	</label>
	<g:field name="miscChargeRate" value="${fieldValue(bean: miscChargesNameInstance, field: 'miscChargeRate')}" />

</div>

