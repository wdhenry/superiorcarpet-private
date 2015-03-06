	<tr>
		<th>Miscellaneous Description</th>
		<th>Charge</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="miscChargesName1"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.miscCharge1}" 
				type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="miscChargesName2"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.miscCharge2}" 
				type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="miscChargesName3"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.miscCharge3}" 
				type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>