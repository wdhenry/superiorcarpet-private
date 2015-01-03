	<tr>
		<th>Miscellaneous Description</th>
		<th>Charge</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="miscChargesName"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.miscCharge}" 
				type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>