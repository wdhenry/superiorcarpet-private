<%@ page import="com.superior.cleaningjob.CleaningJobCommand" %>

<table>
	<tr>
		<th colspan="4" class="sectionhead">Job Detail Section</th>
	</tr>
	<tr>
		<th>First Name</th>
		<th>Last/Company Name</th>
		<th>Address Line 1</th>
		<th>Address Line 2</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="firstName"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="lastName"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="addressLineOne"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="addressLineTwo"/></td>
	</tr>
	<tr>
		<th>Date</th>
		<th>Lead</th>
		<th>Helper</th>
		<th></th>
	</tr>
	<tr>
		<td><g:formatDate format="MM-dd-yyyy" date="${cleaningJobCommandInstance.date}" /></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="lead"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="helper"/></td>
	</tr>
</table>

<g:if test="${cleaningJobCommandInstance.groupName != null}">
	<table>
		<tr>
			<th colspan="2" class="sectionhead">Carpet Care Section</th>
		</tr>
		<tr>
			<th>Special</th>
			<th>Special Rate</th>
		</tr>
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="groupName"/></td>
			<td><g:formatNumber number="${cleaningJobCommandInstance.groupRate}" 
					type="currency" maxFractionDigits="2" currencyCode="USD" /></td>
		</tr>
	</table>
	
	<g:render template="formGroupRooms"></g:render>
</g:if>

<g:if test="${cleaningJobCommandInstance.roomName001 != null}">
	<table>
		<tr>
			<th colspan="6" class="sectionhead">Additional Room Section</th>
		</tr>
		<g:render template="formRoom"></g:render>
	</table>
</g:if>

<g:if test="${cleaningJobCommandInstance.stairDirection1 != null}">
	<table>
		<tr>
			<th colspan="3" class="sectionhead">Stair Section</th>
		</tr>
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
	</table>
</g:if>

<g:if test="${cleaningJobCommandInstance.hsRoomName1 != null}">
	<table>
		<tr>
			<th colspan="5" class="sectionhead">Hard Surface Room Section</th>
		</tr>
		<g:render template="formHardSurfaceRoom"></g:render>
	</table>
</g:if>

<g:if test="${cleaningJobCommandInstance.upholsteryName1 != null}">
	<table>
		<tr>
			<th colspan="4" class="sectionhead">Upholstery Section</th>
		</tr>
		<g:render template="formUpholstery"></g:render>
	</table>
</g:if>

<g:if test="${cleaningJobCommandInstance.miscChargesName != null}">
	<table>
		<tr>
			<th colspan="2" class="sectionhead">Miscellaneous Charge Section</th>
		</tr>
		<g:render template="formMiscCharge"></g:render>
	</table>
</g:if>

<g:if test="${cleaningJobCommandInstance.comment != null}">
	<table>
		<tr>
			<th colspan="1" class="sectionhead">Comment Section</th>
		</tr>
		<tr>
			<th>Comment</th>
		</tr>
		<tr>
			<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="comment"/></td>
		</tr>
	</table>
</g:if>