<%@ page import="com.superior.extractionjob.ExtractionJobCommand" %>

<table>
	<tr>
		<th colspan="4" class="sectionhead">Extraction Job Detail Section</th>
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
				<g:if test="${extractionJobCommandInstance.fanId01 == null}">
					<tr>
						<td>NONE</td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId01 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId01"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId02 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId02"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId03 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId03"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId04 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId04"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId05 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId05"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId06 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId06"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId07 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId07"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId08 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId08"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId09 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId09"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId10 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId10"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId11 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId11"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.fanId12 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="fanId12"/></td>
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
				<g:if test="${extractionJobCommandInstance.dehuId01 == null}">
					<tr>
						<td>NONE</td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId01 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId01"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId02 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId02"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId03 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId03"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId04 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId04"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId05 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId05"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId06 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId06"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId07 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId07"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId08 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId08"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId09 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId09"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId10 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId10"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId11 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId11"/></td>
					</tr>
				</g:if>
				<g:if test="${extractionJobCommandInstance.dehuId12 != null}">
					<tr>
						<td><g:fieldValue bean="${extractionJobCommandInstance}" field="dehuId12"/></td>
					</tr>
				</g:if>
			</table>
		</td>
	<tr>
</table>
