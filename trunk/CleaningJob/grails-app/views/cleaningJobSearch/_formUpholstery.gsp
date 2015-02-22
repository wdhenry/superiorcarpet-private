	<tr>
		<th>Upholstery Piece</th>
		<th>Count</th>
		<th>Cleaning Charge</th>
		<th>Protector</th>
	</tr>
	<g:if test="${cleaningJobCommandInstance.upholsteryName1 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName1"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount1}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge1}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge1}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.upholsteryName2 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName2"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount2}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge2}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.upholsteryName3 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName3"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount3}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge3}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.upholsteryName4 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName4"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount4}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge4}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.upholsteryName5 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName5"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount5}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge5}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>
	<g:if test="${cleaningJobCommandInstance.upholsteryName6 != null}">
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="upholsteryName6"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCount6}"
									type="number" maxFractionDigits="0" minFractionDigits="0" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryCharge6}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.upholsteryProtectorCharge6}"
									type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</g:if>