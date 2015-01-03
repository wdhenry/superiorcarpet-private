	<tr>
		<th>Upholstery Piece</th>
		<th>Count</th>
		<th>Cleaning Charge</th>
		<th>Protector</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount}"
								type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>