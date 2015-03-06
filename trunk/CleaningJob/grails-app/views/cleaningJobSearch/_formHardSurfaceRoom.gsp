	<tr>
		<th>Room Name</th>
		<th>Square Footage</th>
		<th>Cleaning Charge</th>
		<th>Etched</th>
		<th>Sealed/Waxed</th>
	</tr>
	<g:if test="${cleaningJobCommandInstance.hsRoomName1 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName1"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage1}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge1}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge1}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge1}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.hsRoomName2 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName2"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage2}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.hsRoomName3 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName3"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage3}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.hsRoomName4 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName4"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage4}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.hsRoomName5 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName5"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage5}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.hsRoomName6 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="hsRoomName6"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSquareFootage6}"
									type="number" maxFractionDigits="2" minFractionDigits="2" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsRoomCharge6}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsEtchedCharge6}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.hsSealedWaxedCharge6}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	