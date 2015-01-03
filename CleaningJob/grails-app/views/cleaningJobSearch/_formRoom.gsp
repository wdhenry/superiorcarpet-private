	<tr>
		<th>Room Name</th>
		<th>Square Footage</th>
		<th>Cleaning Charge</th>
		<th>PreVac</th>
		<th>Protector</th>
		<th>Move Furn.</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="roomName"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.squareFootage}"
								type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.roomCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.preVacCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.protectorCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.moveFurnitureCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>