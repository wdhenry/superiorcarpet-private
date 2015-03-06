<table>
	<tr>
		<th colspan="7" class="sectionhead">Additional Room Section</th>
	</tr>
	<tr>
		<td colspan="7">  
			<div>
				<g:message code="cleaningJob.numberRooms.label" default="Select Number of Additional Rooms" />
				<g:select name="roomCount" 
					from="${['01','02','03','04','05','06','07','08']}"
					noSelection="${['00':'00']}"/>
			</div>
		</td>
	</tr>
</table>
<table id="additionalRoomTable">
	<thead>
		<tr>
			<th>Room Name *</th>
			<th>Square Footage *</th>
			<th>Cleaning Charge *</th>
			<th>PreVac</th>
			<th>Protector</th>
			<th>Move Furn.</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr id="room00">
			<td colspan="7">No additional rooms selected</td>
		</tr>
		<tr id="room01">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName001', 'error')} ">
					<g:select name="roomName001" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName001}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage001', 'error')} ">
					<g:field name="squareFootage001" type="number" step="any" 
						value="${squareFootage001}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge001', 'error')} ">
					<g:field name="roomCharge001" type="number" step="any" 
						value="${roomCharge001}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge001', 'error')} ">
					<g:checkBox name="preVacCheck001" value="${preVacCheck001}" />
					<g:field name="preVacCharge001" type="number" step="any" 
					value="${preVacCharge001}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge001', 'error')} ">
					<g:checkBox name="protectorCheck001" value="${protectorCheck001}" />
					<g:field name="protectorCharge001" type="number" step="any" 
						value="${protectorCharge001}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge001', 'error')} ">
					<g:field name="moveFurnitureCharge001" type="number" step="any" 
						value="${moveFurnitureCharge001} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible001', 'error')} ">
					<g:field name="visible001" type="hidden"  
						value="${visible001} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room02">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName002', 'error')} ">
					<g:select name="roomName002" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName002}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage002', 'error')} ">
					<g:field name="squareFootage002" type="number" step="any" 
						value="${squareFootage002}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge002', 'error')} ">
					<g:field name="roomCharge002" type="number" step="any" 
						value="${roomCharge002}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge002', 'error')} ">
					<g:checkBox name="preVacCheck002" value="${preVacCheck002}" />
					<g:field name="preVacCharge002" type="number" step="any" 
					value="${preVacCharge002}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge002', 'error')} ">
					<g:checkBox name="protectorCheck002" value="${protectorCheck002}" />
					<g:field name="protectorCharge002" type="number" step="any" 
						value="${protectorCharge002}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge002', 'error')} ">
					<g:field name="moveFurnitureCharge002" type="number" step="any" 
						value="${moveFurnitureCharge002} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible002', 'error')} ">
					<g:field name="visible002" type="hidden"  
						value="${visible002} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room03">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName003', 'error')} ">
					<g:select name="roomName003" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName003}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage003', 'error')} ">
					<g:field name="squareFootage003" type="number" step="any" 
						value="${squareFootage003}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge003', 'error')} ">
					<g:field name="roomCharge003" type="number" step="any" 
						value="${roomCharge003}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge003', 'error')} ">
					<g:checkBox name="preVacCheck003" value="${preVacCheck003}" />
					<g:field name="preVacCharge003" type="number" step="any" 
					value="${preVacCharge003}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge003', 'error')} ">
					<g:checkBox name="protectorCheck003" value="${protectorCheck003}" />
					<g:field name="protectorCharge003" type="number" step="any" 
						value="${protectorCharge003}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge003', 'error')} ">
					<g:field name="moveFurnitureCharge003" type="number" step="any" 
						value="${moveFurnitureCharge003} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible003', 'error')} ">
					<g:field name="visible003" type="hidden"  
						value="${visible003} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room04">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName004', 'error')} ">
					<g:select name="roomName004" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName004}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage004', 'error')} ">
					<g:field name="squareFootage004" type="number" step="any" 
						value="${squareFootage004}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge004', 'error')} ">
					<g:field name="roomCharge004" type="number" step="any" 
						value="${roomCharge004}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge004', 'error')} ">
					<g:checkBox name="preVacCheck004" value="${preVacCheck004}" />
					<g:field name="preVacCharge004" type="number" step="any" 
					value="${preVacCharge004}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge004', 'error')} ">
					<g:checkBox name="protectorCheck004" value="${protectorCheck004}" />
					<g:field name="protectorCharge004" type="number" step="any" 
						value="${protectorCharge004}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge004', 'error')} ">
					<g:field name="moveFurnitureCharge004" type="number" step="any" 
						value="${moveFurnitureCharge004} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible004', 'error')} ">
					<g:field name="visible004" type="hidden"  
						value="${visible004} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room05">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName005', 'error')} ">
					<g:select name="roomName005" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName005}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage005', 'error')} ">
					<g:field name="squareFootage005" type="number" step="any" 
						value="${squareFootage005}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge005', 'error')} ">
					<g:field name="roomCharge005" type="number" step="any" 
						value="${roomCharge005}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge005', 'error')} ">
					<g:checkBox name="preVacCheck005" value="${preVacCheck005}" />
					<g:field name="preVacCharge005" type="number" step="any" 
					value="${preVacCharge005}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge005', 'error')} ">
					<g:checkBox name="protectorCheck005" value="${protectorCheck005}" />
					<g:field name="protectorCharge005" type="number" step="any" 
						value="${protectorCharge005}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge005', 'error')} ">
					<g:field name="moveFurnitureCharge005" type="number" step="any" 
						value="${moveFurnitureCharge005} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible005', 'error')} ">
					<g:field name="visible005" type="hidden"  
						value="${visible005} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room06">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName006', 'error')} ">
					<g:select name="roomName006" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName006}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage006', 'error')} ">
					<g:field name="squareFootage006" type="number" step="any" 
						value="${squareFootage006}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge006', 'error')} ">
					<g:field name="roomCharge006" type="number" step="any" 
						value="${roomCharge006}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge006', 'error')} ">
					<g:checkBox name="preVacCheck006" value="${preVacCheck006}" />
					<g:field name="preVacCharge006" type="number" step="any" 
					value="${preVacCharge006}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge006', 'error')} ">
					<g:checkBox name="protectorCheck006" value="${protectorCheck006}" />
					<g:field name="protectorCharge006" type="number" step="any" 
						value="${protectorCharge006}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge006', 'error')} ">
					<g:field name="moveFurnitureCharge006" type="number" step="any" 
						value="${moveFurnitureCharge006} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible006', 'error')} ">
					<g:field name="visible006" type="hidden"  
						value="${visible006} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room07">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName007', 'error')} ">
					<g:select name="roomName007" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName007}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage007', 'error')} ">
					<g:field name="squareFootage007" type="number" step="any" 
						value="${squareFootage007}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge007', 'error')} ">
					<g:field name="roomCharge007" type="number" step="any" 
						value="${roomCharge007}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge007', 'error')} ">
					<g:checkBox name="preVacCheck007" value="${preVacCheck007}" />
					<g:field name="preVacCharge007" type="number" step="any" 
					value="${preVacCharge007}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge007', 'error')} ">
					<g:checkBox name="protectorCheck007" value="${protectorCheck007}" />
					<g:field name="protectorCharge007" type="number" step="any" 
						value="${protectorCharge007}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge007', 'error')} ">
					<g:field name="moveFurnitureCharge007" type="number" step="any" 
						value="${moveFurnitureCharge007} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible007', 'error')} ">
					<g:field name="visible007" type="hidden"  
						value="${visible007} "/>
				</div>
			</td>
		</tr>
		
		<tr id="room08">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName008', 'error')} ">
					<g:select name="roomName008" 
						from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName008}"
						noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage008', 'error')} ">
					<g:field name="squareFootage008" type="number" step="any" 
						value="${squareFootage008}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge008', 'error')} ">
					<g:field name="roomCharge008" type="number" step="any" 
						value="${roomCharge008}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge008', 'error')} ">
					<g:checkBox name="preVacCheck008" value="${preVacCheck008}" />
					<g:field name="preVacCharge008" type="number" step="any" 
					value="${preVacCharge008}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge008', 'error')} ">
					<g:checkBox name="protectorCheck008" value="${protectorCheck008}" />
					<g:field name="protectorCharge008" type="number" step="any" 
						value="${protectorCharge008}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge008', 'error')} ">
					<g:field name="moveFurnitureCharge008" type="number" step="any" 
						value="${moveFurnitureCharge008} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'visible008', 'error')} ">
					<g:field name="visible008" type="hidden"  
						value="${visible008} "/>
				</div>
			</td>
		</tr>		
	</tbody>
</table>