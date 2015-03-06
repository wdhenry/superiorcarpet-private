<%@ page import="com.superior.cleaningjob.CleaningJobCommand"%>

<table>
	<tr>
		<th colspan="4" class="sectionhead">Job Detail Section</th>
	</tr>
	<tr>
		<th>Date</th>
		<th>Lead *</th>
		<th>Helper</th>
		<th></th>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'date', 'error')} required">
				<g:datePicker name="date" precision="day"
					value="${cleaningJobCommandInstance?.date}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'lead', 'error')} required">
				<g:select name="lead" from="${com.superior.base.Lead.list()}"
					optionKey="leadName" optionValue="leadName"
					value="${cleaningJobCommandInstance?.lead}"
					noSelection="${['Pick a Name':'Pick a Name']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'helper', 'error')} ">
				<g:select name="helper" from="${com.superior.base.Helper.list()}"
					optionKey="helperName" optionValue="helperName"
					value="${cleaningJobCommandInstance?.helper}"
					noSelection="${['None':'None']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'customerId', 'error')} required">
				<g:field name="customerId" type="hidden"
					value="${cleaningJobCommandInstance.customerId}" required="" />
			</div>
		</td>
	</tr>
</table>

<table>
	<tr>
		<th colspan="2" class="sectionhead">Carpet Care Section</th>
	</tr>
	<tr>
		<th>Special</th>
		<th>Special Rate</th>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'groupName', 'error')} ">
				<g:select name="groupName"
					from="${com.superior.base.RoomGroup.list()}" 
					optionKey="groupName"
					optionValue="groupName" 
					value="${cleaningJobCommandInstance?.groupName}"
					noSelection="${['No Special':'No Special']}"/>
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'groupRate', 'error')} ">
				<g:field name="groupRate" type="number" step="any"
					value="${fieldValue(bean: cleaningJobCommandInstance, field: 'groupRate')} " />
			</div>
		</td>
	</tr>
</table>

<g:render template="formGroupRooms"></g:render>

<table>
	<tr>
		<th colspan="7" class="sectionhead">Additional Room Section</th>
	</tr>
	<tr>
		<td colspan="7">  
			<div>
				<g:message code="cleaningJob.numberRooms.label" default="Select Number of Additional Rooms" />
				<g:select name="roomCount" 
					from="${['01','02','03','04','05','06','07','08','09','10','11','12']}"
					noSelection="${['00':'00']}"/>
			</div>
		</td>
	</tr>
</table>
<g:render template="formAdditionalRooms"></g:render>

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
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection1', 'error')} ">
				<g:select name="stairDirection1" from="${['Down', 'Up']}"
					value="${stairDirection1}"
					noSelection="${['Pick a Direction':'Pick a Direction']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount1', 'error')} ">
				<g:field name="stairCount1" type="number" value="${stairCount1}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge1', 'error')} ">
				<g:field name="stairCharge1" type="number" step="any"
					value="${stairCharge1}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection2', 'error')} ">
				<g:select name="stairDirection2" from="${['Down', 'Up']}"
					value="${stairDirection2}"
					noSelection="${['Pick a Direction':'Pick a Direction']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount2', 'error')} ">
				<g:field name="stairCount2" type="number" value="${stairCount2}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge2', 'error')} ">
				<g:field name="stairCharge2" type="number" step="any"
					value="${stairCharge2}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection3', 'error')} ">
				<g:select name="stairDirection3" from="${['Down', 'Up']}"
					value="${stairDirection3}"
					noSelection="${['Pick a Direction':'Pick a Direction']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount3', 'error')} ">
				<g:field name="stairCount3" type="number" value="${stairCount3}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge3', 'error')} ">
				<g:field name="stairCharge3" type="number" step="any"
					value="${stairCharge3}" />
			</div>
		</td>
	</tr>
</table>

<table>
	<tr>
		<th colspan="5" class="sectionhead">Hard Surface Room Section</th>
	</tr>
	<g:render template="formHardSurfaceRoom"></g:render>
</table>

<table>
	<tr>
		<th colspan="5" class="sectionhead">Upholstery Section</th>
	</tr>
	<tr id="upholstery0">
		<td colspan="5">  
			<div>
				<g:message code="cleaningJob.numberUpholstery.label" default="Select Number of Upholstery Items" />
				<g:select name="upholsteryCount" 
					from="${['01','02','03','04','05','06']}"
					noSelection="${['00':'00']}"/>
			</div>
		</td>
	</tr>
	<g:render template="formUpholstery"></g:render>
</table>

<table>
	<tr>
		<th colspan="2" class="sectionhead">Miscellaneous Charge Section</th>
	</tr>
	<g:render template="formMiscCharge"></g:render>
</table>

<table>
	<tr>
		<th colspan="1" class="sectionhead">Comment Section</th>
	</tr>
	<tr>
		<th>Comment</th>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'comment', 'error')} required">
				<g:textArea name="comment"
					value="${cleaningJobCommandInstance.comment}" />
			</div>
		</td>
	</tr>
</table>