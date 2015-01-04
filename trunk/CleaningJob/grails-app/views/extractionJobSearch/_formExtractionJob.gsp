<%@ page import="com.superior.extractionjob.ExtractionJobCommand" %>

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
		<td><g:fieldValue bean="${extractionJobCommandInstance}" field="firstName"/></td>
		<td><g:fieldValue bean="${extractionJobCommandInstance}" field="lastName"/></td>
		<td><g:fieldValue bean="${extractionJobCommandInstance}" field="addressLineOne"/></td>
		<td><g:fieldValue bean="${extractionJobCommandInstance}" field="addressLineTwo"/></td>
	</tr>
	<tr>
		<th>Date</th>
		<th>Lead</th>
		<th>Helper</th>
		<th></th>
	</tr>
	<tr>
		<td><g:formatDate format="MM-dd-yyyy" date="${extractionJobCommandInstance.date}" /></td>
		<td><g:fieldValue bean="${extractionJobCommandInstance}" field="lead"/></td>
		<td><g:fieldValue bean="${extractionJobCommandInstance}" field="helper"/></td>
	</tr>
</table>

<table>
	<tr>
		<th colspan="2" class="sectionhead">Water Extraction Section</th>
	</tr>
	<tr>
		<td>
			<table>
				<tr>
					<th class="sectionhead">Start Time</th>
				</tr>
				<tr>
					<td><g:formatDate format="hh:mm a" date="${extractionJobCommandInstance.startTime}" /></td>
				</tr>
				<tr>
					<th class="sectionhead">Fans Left</th>
				</tr>
				<g:if test="${extractionJobCommandInstance.fanId1 == null}">
					<tr>
						<td>NONE</td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId1 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId1"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId2 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId2"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId3 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId3"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId4 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId4"/></td>
					</tr>
				</g:if>
			</table>
		</td>
		<td>
			<table>
				<tr>
					<th class="sectionhead">End Time</th>
				</tr>
				<tr>
					<td><g:formatDate format="hh:mm a" date="${extractionJobCommandInstance.endTime}" /></td>
				</tr>
				<tr>
					<th class="sectionhead">Dehumidifiers Left</th>
				</tr>
				<g:if test="${extractionJobCommandInstance.dehuId1 == null}">
					<tr>
						<td>NONE</td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId1 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId1"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId1 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId2"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId1 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId3"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId1 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId4"/></td>
					</tr>
				</g:if>
			</table>
		</td>
	<tr>
</table>
