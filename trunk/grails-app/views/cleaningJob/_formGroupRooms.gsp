<table>
	<tr>
		<th>Group Room Name *</th>
		<th>Square Footage *</th>
		<th>PreVac</th>
		<th>Protector</th>
		<th>Move Furn.</th>
	</tr>
	
<%--	<tr id="room1" style="display:none;">--%>
	<tr id="room1">
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName1', 'error')} ">
				<g:select name="roomName1" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName1}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage1', 'error')} ">
				<g:field name="squareFootage1" type="number" step="any" value="${squareFootage1}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge1', 'error')} ">
				<g:checkBox name="preVacCheck1" value="${preVacCheck1}" />
				<g:field name="preVacCharge1" type="number" step="any" value="${preVacCharge1}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge1', 'error')} ">
				<g:checkBox name="protectorCheck1" value="${protectorCheck1}" />
				<g:field name="protectorCharge1" type="number" step="any" value="${protectorCharge1}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge1', 'error')} ">
				<g:checkBox name="moveFurnitureCheck1" value="${moveFurnitureCheck1}" />
				<g:field name="moveFurnitureCharge1" type="number" step="any" value="${moveFurnitureCharge1} "/>
			</div>
		</td>
	</tr>
	
	<tr  id="room2">
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName2', 'error')} ">
				<g:select name="roomName2" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName2}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage2', 'error')} ">
				<g:field name="squareFootage2" type="number" step="any" value="${squareFootage2}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge2', 'error')} ">
				<g:checkBox name="preVacCheck2" value="${preVacCheck2}" />
				<g:field name="preVacCharge2" type="number" step="any" value="${preVacCharge2}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge2', 'error')} ">
				<g:checkBox name="protectorCheck2" value="${protectorCheck2}" />
				<g:field name="protectorCharge2" type="number" step="any" value="${protectorCharge2}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge2', 'error')} ">
				<g:checkBox name="moveFurnitureCheck2" value="${moveFurnitureCheck2}" />
				<g:field name="moveFurnitureCharge2" type="number" step="any" value="${moveFurnitureCharge2} "/>
			</div>
		</td>
	</tr>
	<tr id="room3">
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName3', 'error')} ">
				<g:select name="roomName3" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName3}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage3', 'error')} ">
				<g:field name="squareFootage3" type="number" step="any" value="${squareFootage3}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge3', 'error')} ">
				<g:checkBox name="preVacCheck3" value="${preVacCheck3}" />
				<g:field name="preVacCharge3" type="number" step="any" value="${preVacCharge3}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge3', 'error')} ">
				<g:checkBox name="protectorCheck3" value="${protectorCheck3}" />
				<g:field name="protectorCharge3" type="number" step="any" value="${protectorCharge3}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge3', 'error')} ">
				<g:checkBox name="moveFurnitureCheck3" value="${moveFurnitureCheck3}" />
				<g:field name="moveFurnitureCharge3" type="number" step="any" value="${moveFurnitureCharge3} "/>
			</div>
		</td>
	</tr>
	<tr id="room4">
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName4', 'error')} ">
				<g:select name="roomName4" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName4}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage4', 'error')} ">
				<g:field name="squareFootage4" type="number" step="any" value="${squareFootage4}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge4', 'error')} ">
				<g:checkBox name="preVacCheck4" value="${preVacCheck1}" />
				<g:field name="preVacCharge4" type="number" step="any" value="${preVacCharge4}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge4', 'error')} ">
				<g:checkBox name="protectorCheck4" value="${protectorCheck4}" />
				<g:field name="protectorCharge4" type="number" step="any" value="${protectorCharge4}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge4', 'error')} ">
				<g:checkBox name="moveFurnitureCheck4" value="${moveFurnitureCheck4}" />
				<g:field name="moveFurnitureCharge4" type="number" step="any" value="${moveFurnitureCharge4} "/>
			</div>
		</td>
	</tr>
	<tr id="room5">
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName5', 'error')} ">
				<g:select name="roomName5" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName5}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage5', 'error')} ">
				<g:field name="squareFootage5" type="number" step="any" value="${squareFootage5}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge5', 'error')} ">
				<g:checkBox name="preVacCheck5" value="${preVacCheck5}" />
				<g:field name="preVacCharge5" type="number" step="any" value="${preVacCharge5}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge5', 'error')} ">
				<g:checkBox name="protectorCheck5" value="${protectorCheck5}" />
				<g:field name="protectorCharge5" type="number" step="any" value="${protectorCharge5}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge5', 'error')} ">
				<g:checkBox name="moveFurnitureCheck5" value="${moveFurnitureCheck5}" />
			<g:field name="moveFurnitureCharge5" type="number" step="any" value="${moveFurnitureCharge5} "/>
			</div>
		</td>
	</tr>
	
</table>