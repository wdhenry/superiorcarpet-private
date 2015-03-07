	<tr>
		<th>Stair Direction</th>
		<th>Stair Count</th>
		<th>Stair Charge</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="stairDirection1"/></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.stairCount1}"
								type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
		<td><g:formatNumber number="${cleaningJobCommandInstance.stairCharge1}" 
				type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
	</tr>
	<g:if test="${cleaningJobCommandInstance.stairDirection2 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="stairDirection2"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.stairCount2}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.stairCharge2}" 
					type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.stairDirection3 != null}">	
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="stairDirection3"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.stairCount3}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.stairCharge3}" 
					type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>