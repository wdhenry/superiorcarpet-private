<%@ page import="com.superior.base.Dehumidifiers" %>



<table border=1 frame=void rules=rows>
	<tr>
		<th><span id="idNumber-label" class="property-label"><g:message code="dehumidifiers.idNumber.label" default="Id Number" /></span></th>
		<th><span id="serialNumber-label" class="property-label"><g:message code="dehumidifiers.serialNumber.label" default="Serial Number" /></span></th>
		<th><span id="model-label" class="property-label"><g:message code="dehumidifiers.model.label" default="Model" /></span></th>
		<th><span id="jobId-label" class="property-label"><g:message code="dehumidifiers.jobId.label" default="Job Id" /></span></th>
	</tr>
	<tr>
		<td><span class="property-value" aria-labelledby="idNumber-label"><g:fieldValue bean="${dehumidifiersInstance}" field="idNumber"/></span></td>
		<td><span class="property-value" aria-labelledby="serialNumber-label"><g:fieldValue bean="${dehumidifiersInstance}" field="serialNumber"/></span></td>
		<td><span class="property-value" aria-labelledby="model-label"><g:fieldValue bean="${dehumidifiersInstance}" field="model"/></span></td>
		<td><span class="property-value" aria-labelledby="jobId-label"><g:fieldValue bean="${dehumidifiersInstance}" field="jobId"/></span></td>
	</tr>
	<tr>
		<th><span id="dateOut-label" class="property-label"><g:message code="dehumidifiers.dateOut.label" default="Date Out" /></span></th>
		<th><span id="leadOut-label" class="property-label"><g:message code="dehumidifiers.leadOut.label" default="Lead Out" /></span></th>
		<th><span id="helperOut-label" class="property-label"><g:message code="dehumidifiers.helperOut.label" default="Helper Out" /></span></th>
		<th></th>
	</tr>
	<tr>
		<td><span class="property-value" aria-labelledby="dateOut-label"><g:formatDate format="MM-dd-yyyy" date="${dehumidifiersInstance?.dateOut}" /></span></td>
		<td><span class="property-value" aria-labelledby="leadOut-label"><g:fieldValue bean="${dehumidifiersInstance}" field="leadOut"/></span></td>
		<td><span class="property-value" aria-labelledby="helperOut-label"><g:fieldValue bean="${dehumidifiersInstance}" field="helperOut"/></span></td>
		<td></td>
	</tr>
	<tr>
		<th><span id="dateIn-label" class="property-label"><g:message code="dehumidifiers.dateIn.label" default="Date In" /></span></th>
		<th><span id="leadIn-label" class="property-label"><g:message code="dehumidifiers.leadIn.label" default="Lead In" /></span></th>
		<th><span id="helperIn-label" class="property-label"><g:message code="dehumidifiers.helperIn.label" default="Helper In" /></span></th>
		<th><span id="hours-label" class="property-label"><g:message code="dehumidifiers.hours.label" default="Hours" /></span></th>
	</tr>
	<tr>
		<td>
			<g:if test="${dehumidifiersInstance?.isIn}">
				<span class="property-value" aria-labelledby="dateIn-label"><g:formatDate format="MM-dd-yyyy" date="${dehumidifiersInstance?.dateIn}" /></span>
			</g:if>
			<g:if test="${!dehumidifiersInstance?.isIn}">
				<g:datePicker name="date" precision="day"  value="${dehumidifiersInstance?.dateIn}"  />
			</g:if>
		</td>
		<td>
			<g:if test="${dehumidifiersInstance?.isIn}">
				<span class="property-value" aria-labelledby="leadIn-label"><g:fieldValue bean="${dehumidifiersInstance}" field="leadIn"/></span>
			</g:if>
			<g:if test="${!dehumidifiersInstance?.isIn}">
				<g:select name="leadIn" from="${com.superior.base.Lead.list()}"
					optionKey="leadName" optionValue="leadName" 
					value="${dehumidifiersInstance?.leadIn}"
					noSelection="${['null':'--Pick a Name--']}"
					class="sorted-asc"/>
			</g:if>
		</td>
		<td>
			<g:if test="${dehumidifiersInstance?.isIn}">
				<span class="property-value" aria-labelledby="helperIn-label"><g:fieldValue bean="${dehumidifiersInstance}" field="helperIn"/></span>
			</g:if>
			<g:if test="${!dehumidifiersInstance?.isIn}">
				<g:select name="helperIn" from="${com.superior.base.Helper.list()}"
					optionKey="helperName" optionValue="helperName" 
					value="${dehumidifiersInstance?.helperIn}"
					noSelection="${['null':'--None--']}"
					class="sorted-asc"/>
			</g:if>
		</td>
		<td>
			<g:if test="${dehumidifiersInstance?.isIn}">
				<span class="property-value" aria-labelledby="hours-label">
					<g:formatNumber number="${dehumidifiersInstance.hours}"
								type="number" maxFractionDigits="2" minFractionDigits="2" />
				</span>
			</g:if>
			<g:if test="${!dehumidifiersInstance?.isIn}">	
				<span class="property-value" aria-labelledby="hours-label">
					<g:field name="hours" type="number" step="any" value="${dehumidifiersInstance?.hours}" />
				</span>
			</g:if>	
		</td>
	</tr>
</table>
