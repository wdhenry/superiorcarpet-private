	<tr>
		<th>Room Name</th>
		<th>Square Footage</th>
		<th>Cleaning Charge</th>
		<th>Etched</th>
		<th>Sealed/Waxed</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName', 'error')} ">
				<g:select name="hsRoomName" from="${com.superior.base.RoomName.list()}"
						optionKey="roomName" optionValue="roomName" 
						value="${cleaningJobCommandInstance?.hsRoomName}"
						noSelection="${['null':'Pick a Room']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage', 'error')} ">
				<g:field name="hsSquareFootage" type="number" value="${hsSquareFootage}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge', 'error')} ">
				<g:field name="hsRoomCharge" type="number" step="any" value="${hsRoomCharge}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge', 'error')} ">
				<g:checkBox name="hsEtchedCheck" value="${hsEtchedCheck}" />
				<g:field name="hsEtchedCharge" type="number" step="any" value="${hsEtchedCharge}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge', 'error')} ">
				<g:checkBox name="hsSealedWaxedCheck" value="${hsSealedWaxedCheck}" />
				<g:field name="hsSealedWaxedCharge" type="number" step="any" value="${hsSealedWaxedCharge} "/>
			</div>
		</td>
	</tr>