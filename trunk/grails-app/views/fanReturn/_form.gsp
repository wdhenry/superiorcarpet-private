<%@ page import="com.superior.base.Fans" %>

<table border=1 frame=void rules=rows>
	<tr>
		<th><span id="idNumber-label" class="property-label"><g:message code="fans.idNumber.label" default="Id Number" /></span></th>
		<th><span id="serialNumber-label" class="property-label"><g:message code="fans.serialNumber.label" default="Serial Number" /></span></th>
		<th><span id="model-label" class="property-label"><g:message code="fans.model.label" default="Model" /></span></th>
		<th><span id="jobId-label" class="property-label"><g:message code="fans.jobId.label" default="Job Id" /></span>
	</tr>
	<tr>
		<td>
			<span class="property-value" aria-labelledby="idNumber-label"><g:fieldValue bean="${fansInstance}" field="idNumber"/></span>
		</td>
		<td>
			<span class="property-value" aria-labelledby="serialNumber-label"><g:fieldValue bean="${fansInstance}" field="serialNumber"/></span>
		</td>
		<td>
			<span class="property-value" aria-labelledby="model-label"><g:fieldValue bean="${fansInstance}" field="model"/></span>
		</td>
		<td>
			<span class="property-value" aria-labelledby="jobId-label"><g:fieldValue bean="${fansInstance}" field="jobId"/></span>
		</td>
	</tr>
	<tr>
		<th><span id="dateOut-label" class="property-label"><g:message code="fans.dateOut.label" default="Date Out" /></span></th>
		<th><span id="leadOut-label" class="property-label"><g:message code="fans.leadOut.label" default="Lead Out" /></span></th>
		<th><span id="helperOut-label" class="property-label"><g:message code="fans.helperOut.label" default="Helper Out" /></span></th>
	</tr>
	<tr>
		<td>
			<span class="property-value" aria-labelledby="dateOut-label"><g:formatDate date="${fansInstance?.dateOut}" /></span>
		</td>
		<td>
			<span class="property-value" aria-labelledby="leadOut-label"><g:fieldValue bean="${fansInstance}" field="leadOut"/></span>
		</td>
		<td>
			<span class="property-value" aria-labelledby="helperOut-label"><g:fieldValue bean="${fansInstance}" field="helperOut"/></span>
		</td>
	</tr>
	<tr>
		<th><span id="dateIn-label" class="property-label"><g:message code="fans.dateIn.label" default="Date In" /></span></th>
		<th><span id="leadIn-label" class="property-label"><g:message code="fans.leadIn.label" default="Lead In" /></span></th>
		<th><span id="helperIn-label" class="property-label"><g:message code="fans.helperIn.label" default="Helper In" /></span></th>
	</tr>
	<tr>
		<td>
			<g:if test="${fansInstance?.dateIn}">
				<span class="property-value" aria-labelledby="dateIn-label"><g:formatDate date="${fansInstance?.dateIn}" /></span>
			</g:if>
			<g:if test="${!fansInstance?.dateIn}">
				<g:datePicker name="date" precision="day"  value="${fansInstance?.dateIn}"  />
			</g:if>
		</td>
		<td>
			<g:if test="${fansInstance?.leadIn}">
				<span class="property-value" aria-labelledby="leadIn-label"><g:fieldValue bean="${fansInstance}" field="leadIn"/></span>
			</g:if>
			<g:if test="${!fansInstance?.leadIn}">
				<g:select name="leadIn" from="${com.superior.base.Lead.list()}"
					optionKey="leadName" optionValue="leadName" 
					value="${fansInstance?.leadIn}"
					noSelection="${['null':'Pick a Name']}"/>
			</g:if>
		</td>
		<td>
			<g:if test="${fansInstance?.helperIn}">
				<span class="property-value" aria-labelledby="helperIn-label"><g:fieldValue bean="${fansInstance}" field="helperIn"/></span>
			</g:if>
			<g:if test="${!fansInstance?.helperIn}">
				<g:select name="helperIn" from="${com.superior.base.Helper.list()}"
					optionKey="helperName" optionValue="helperName" 
					value="${fansInstance?.helperIn}"
					noSelection="${['null':'None']}"/>
			</g:if>
		</td>
	</tr>
</table>
