<%@ page import="com.superior.base.Customer" %>



<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="customer.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${customerInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="customer.lastName.label" default="Company/Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${customerInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'addressLineOne', 'error')} required">
	<label for="addressLineOne">
		<g:message code="customer.addressLineOne.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressLineOne" required="" value="${customerInstance?.addressLineOne}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'addressLineTwo', 'error')} ">
	<label for="addressLineTwo">
		<g:message code="customer.addressLineTwo.label" default="Address" />
		
	</label>
	<g:textField name="addressLineTwo" value="${customerInstance?.addressLineTwo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="customer.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${customerInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="customer.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" maxlength="2" required="" value="${customerInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'zip', 'error')} ">
	<label for="zip">
		<g:message code="customer.zip.label" default="Zip" />
		
	</label>
	<g:textField name="zip" value="${customerInstance?.zip}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'phoneNumber', 'error')} ">
	<label for="phoneNumber">
		<g:message code="customer.phoneNumber.label" default="Phone Number" />
		
	</label>
	<g:textField name="phoneNumber" maxlength="10" value="${customerInstance?.phoneNumber}"/>

</div>

