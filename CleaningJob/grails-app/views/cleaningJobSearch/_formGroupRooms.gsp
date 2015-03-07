	<tr>
		<th>Special</th>
		<th>Special Rate</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="groupName"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.groupRate}" 
				type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>
<table>
	<tr>
		<th>Group Room Name</th>
		<th>Square Footage</th>
		<th>PreVac</th>
		<th>Protector</th>
		<th>Move Furn.</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="roomName1"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.squareFootage1}"
								type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.preVacCharge1}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.protectorCharge1}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.moveFurnitureCharge1}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>
	<g:if test="${cleaningJobCommandInstance.roomName2 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="roomName2"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.squareFootage2}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.preVacCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.protectorCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.moveFurnitureCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.roomName3 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="roomName3"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.squareFootage3}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.preVacCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.protectorCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.moveFurnitureCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.roomName4 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="roomName4"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.squareFootage4}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.preVacCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.protectorCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.moveFurnitureCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.roomName5 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="roomName5"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.squareFootage5}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.preVacCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.protectorCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.moveFurnitureCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	
</table>