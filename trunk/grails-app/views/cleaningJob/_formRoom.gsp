	<tr>
		<th>Room Name</th>
		<th>Square Footage</th>
		<th>Cleaning Charge</th>
		<th>PreVac</th>
		<th>Protector</th>
		<th>Move Furn.</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomName', 'error')} ">
				<g:select name="roomName" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.roomName}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'squareFootage', 'error')} ">
				<g:field name="squareFootage" type="number" step="any" value="${squareFootage}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'roomCharge', 'error')} ">
				<g:field name="roomCharge" type="number" step="any" value="${roomCharge}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'preVacCharge', 'error')} ">
				<g:checkBox name="preVacCheck" value="${preVacCheck}" />
				<g:field name="preVacCharge" type="number" step="any" value="${preVacCharge}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'protectorCharge', 'error')} ">
				<g:checkBox name="protectorCheck" value="${protectorCheck}" />
				<g:field name="protectorCharge" type="number" step="any" value="${protectorCharge}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'moveFurnitureCharge', 'error')} ">
				<g:checkBox name="moveFurnitureCheck" value="${moveFurnitureCheck}" />
				<g:field name="moveFurnitureCharge" type="number" step="any" value="${moveFurnitureCharge} "/>
			</div>
		</td>
	</tr>