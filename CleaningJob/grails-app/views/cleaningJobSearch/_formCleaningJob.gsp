<%@ page import="com.superior.cleaningjob.CleaningJobCommand" %>

<table>
	<tr>
		<th colspan="4" class="sectionhead">Job Detail Section</th>
	</tr>
	<g:render template="formDetail"></g:render>
</table>

<g:if test="${cleaningJobCommandInstance.groupName != null}">
	<table>
		<tr>
			<th colspan="2" class="sectionhead">Carpet Care Section</th>
		</tr>
		<g:render template="formGroupRooms"></g:render>
	</table>
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
		<g:render template="formStairs"></g:render>
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

<g:if test="${cleaningJobCommandInstance.miscChargesName1 != null}">
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
	</table>
	<g:render template="formComment"></g:render>
</g:if>