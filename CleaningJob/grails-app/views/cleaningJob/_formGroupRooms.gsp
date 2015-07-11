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
					noSelection="${['No Special':'--No Special--']}"
					class="sorted-asc" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'groupRate', 'error')} ">
				<g:field name="groupRate" type="number" step="any"
					value="${groupRate}" />
			</div>
		</td>
	</tr>
</table>
<table id="groupRoomTable">
	<thead>
		<tr>
			<th>Group Room Name *</th>
			<th>Square Footage *</th>
			<th>PreVac</th>
			<th>Protector</th>
			<th>Move Furn.</th>
		</tr>
	</thead>
	<tbody>
		<tr id="room0">
			<td colspan="5">Pick a room special</td>
		</tr>
		<tr id="room1">
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName1', 'error')} ">
					<g:select name="roomName1"
						from="${com.superior.base.RoomName.list()}" 
						optionKey="roomName" optionValue="roomName"
						value="${cleaningJobCommandInstance?.roomName1}"
						noSelection="${['Pick a Room':'--Pick a Room--']}" 
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage1', 'error')} ">
					<g:field name="squareFootage1" type="number" step="any"
						value="${squareFootage1}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge1', 'error')} ">
					<g:checkBox name="preVacCheck1" value="${preVacCheck1}" />
					<g:field name="preVacCharge1" type="number" step="any"
						value="${preVacCharge1}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge1', 'error')} ">
					<g:checkBox name="protectorCheck1" value="${protectorCheck1}" />
					<g:field name="protectorCharge1" type="number" step="any"
						value="${protectorCharge1}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge1', 'error')} ">
					<g:field name="moveFurnitureCharge1" type="number" step="any"
						value="${moveFurnitureCharge1} " />
				</div>
			</td>
		</tr>

		<tr id="room2">
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName2', 'error')} ">
					<g:select name="roomName2"
						from="${com.superior.base.RoomName.list()}" optionKey="roomName"
						optionValue="roomName"
						value="${cleaningJobCommandInstance?.roomName2}"
						noSelection="${['Pick a Room':'--Pick a Room--']}" 
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage2', 'error')} ">
					<g:field name="squareFootage2" type="number" step="any"
						value="${squareFootage2}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge2', 'error')} ">
					<g:checkBox name="preVacCheck2" value="${preVacCheck2}" />
					<g:field name="preVacCharge2" type="number" step="any"
						value="${preVacCharge2}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge2', 'error')} ">
					<g:checkBox name="protectorCheck2" value="${protectorCheck2}" />
					<g:field name="protectorCharge2" type="number" step="any"
						value="${protectorCharge2}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge2', 'error')} ">
					<g:field name="moveFurnitureCharge2" type="number" step="any"
						value="${moveFurnitureCharge2} " />
				</div>
			</td>
		</tr>
		<tr id="room3">
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName3', 'error')} ">
					<g:select name="roomName3"
						from="${com.superior.base.RoomName.list()}" optionKey="roomName"
						optionValue="roomName"
						value="${cleaningJobCommandInstance?.roomName3}"
						noSelection="${['Pick a Room':'--Pick a Room--']}" 
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage3', 'error')} ">
					<g:field name="squareFootage3" type="number" step="any"
						value="${squareFootage3}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge3', 'error')} ">
					<g:checkBox name="preVacCheck3" value="${preVacCheck3}" />
					<g:field name="preVacCharge3" type="number" step="any"
						value="${preVacCharge3}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge3', 'error')} ">
					<g:checkBox name="protectorCheck3" value="${protectorCheck3}" />
					<g:field name="protectorCharge3" type="number" step="any"
						value="${protectorCharge3}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge3', 'error')} ">
					<g:field name="moveFurnitureCharge3" type="number" step="any"
						value="${moveFurnitureCharge3} " />
				</div>
			</td>
		</tr>
		<tr id="room4">
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName4', 'error')} ">
					<g:select name="roomName4"
						from="${com.superior.base.RoomName.list()}" optionKey="roomName"
						optionValue="roomName"
						value="${cleaningJobCommandInstance?.roomName4}"
						noSelection="${['Pick a Room':'--Pick a Room--']}" 
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage4', 'error')} ">
					<g:field name="squareFootage4" type="number" step="any"
						value="${squareFootage4}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge4', 'error')} ">
					<g:checkBox name="preVacCheck4" value="${preVacCheck1}" />
					<g:field name="preVacCharge4" type="number" step="any"
						value="${preVacCharge4}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge4', 'error')} ">
					<g:checkBox name="protectorCheck4" value="${protectorCheck4}" />
					<g:field name="protectorCharge4" type="number" step="any"
						value="${protectorCharge4}" />
				</div>
			</td>
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge4', 'error')} ">
					<g:field name="moveFurnitureCharge4" type="number" step="any"
						value="${moveFurnitureCharge4} " />
				</div>
			</td>
		</tr>
	</tbody>
</table>