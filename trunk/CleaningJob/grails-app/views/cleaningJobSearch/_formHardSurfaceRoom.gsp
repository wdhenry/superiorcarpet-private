	<tr>
		<th>Room Name</th>
		<th>Square Footage</th>
		<th>Cleaning Charge</th>
		<th>Etched</th>
		<th>Sealed/Waxed</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage}"
								type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge}"
								type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>