<table>
	<tr>
		<th colspan="6" class="sectionhead">Hard Surface Room Section</th>
	</tr>
	<tr>
		<td colspan="6">  
			<div>
				<g:message code="cleaningJob.numberHsRooms.label" default="Select Number of Hard Surface Rooms" />
				<g:select name="hsRoomCount" 
					from="${['01','02','03','04','05','06']}"
					noSelection="${['00':'00']}"/>
			</div>
		</td>
	</tr>
</table>
<table id="hardSurfaceRoomTable">
	<thead>
		<tr>
			<th>Room Name</th>
			<th>Square Footage</th>
			<th>Cleaning Charge</th>
			<th>Etched</th>
			<th>Sealed/Waxed</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr id="hsRoom00">
			<td colspan="6">No hard surface rooms selected</td>
		</tr>
		<tr id="hsRoom01" style="display: none;">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName1', 'error')} ">
					<g:select name="hsRoomName1" from="${com.superior.base.RoomName.list()}"
							optionKey="roomName" optionValue="roomName" 
							value="${cleaningJobCommandInstance?.hsRoomName1}"
							noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage1', 'error')} ">
					<g:field name="hsSquareFootage1" type="number" 
						value="${hsSquareFootage1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge1', 'error')} ">
					<g:field name="hsRoomCharge1" type="number" step="any" 
						value="${hsRoomCharge1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge1', 'error')} ">
					<g:checkBox name="hsEtchedCheck1" value="${hsEtchedCheck1}" />
					<g:field name="hsEtchedCharge1" type="number" step="any" 
						value="${hsEtchedCharge1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge1', 'error')} ">
					<g:checkBox name="hsSealedWaxedCheck1" value="${hsSealedWaxedCheck1}" />
					<g:field name="hsSealedWaxedCharge1" type="number" step="any" 
						value="${hsSealedWaxedCharge1} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsVisible1', 'error')} ">
					<g:field name="hsVisible1" type="hidden"  
						value="${hsVisible1} "/>
				</div>
			</td>
		</tr>
		<tr id="hsRoom02" style="display: none;">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName2', 'error')} ">
					<g:select name="hsRoomName2" from="${com.superior.base.RoomName.list()}"
							optionKey="roomName" optionValue="roomName" 
							value="${cleaningJobCommandInstance?.hsRoomName2}"
							noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage2', 'error')} ">
					<g:field name="hsSquareFootage2" type="number" 
						value="${hsSquareFootage2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge2', 'error')} ">
					<g:field name="hsRoomCharge2" type="number" step="any" 
						value="${hsRoomCharge2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge2', 'error')} ">
					<g:checkBox name="hsEtchedCheck2" value="${hsEtchedCheck2}" />
					<g:field name="hsEtchedCharge2" type="number" step="any" 
						value="${hsEtchedCharge2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge2', 'error')} ">
					<g:checkBox name="hsSealedWaxedCheck2" value="${hsSealedWaxedCheck2}" />
					<g:field name="hsSealedWaxedCharge2" type="number" step="any" 
						value="${hsSealedWaxedCharge2} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsVisible2', 'error')} ">
					<g:field name="hsVisible2" type="hidden"  
						value="${hsVisible2} "/>
				</div>
			</td>
		</tr>
		<tr id="hsRoom03" style="display: none;">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName3', 'error')} ">
					<g:select name="hsRoomName3" from="${com.superior.base.RoomName.list()}"
							optionKey="roomName" optionValue="roomName" 
							value="${cleaningJobCommandInstance?.hsRoomName3}"
							noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage3', 'error')} ">
					<g:field name="hsSquareFootage3" type="number" 
						value="${hsSquareFootage3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge3', 'error')} ">
					<g:field name="hsRoomCharge3" type="number" step="any" 
						value="${hsRoomCharge3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge3', 'error')} ">
					<g:checkBox name="hsEtchedCheck3" value="${hsEtchedCheck3}" />
					<g:field name="hsEtchedCharge3" type="number" step="any" 
						value="${hsEtchedCharge3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge3', 'error')} ">
					<g:checkBox name="hsSealedWaxedCheck3" value="${hsSealedWaxedCheck3}" />
					<g:field name="hsSealedWaxedCharge3" type="number" step="any" 
						value="${hsSealedWaxedCharge3} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsVisible3', 'error')} ">
					<g:field name="hsVisible3" type="hidden"  
						value="${hsVisible3} "/>
				</div>
			</td>
		</tr>
		<tr id="hsRoom04" style="display: none;">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName4', 'error')} ">
					<g:select name="hsRoomName4" from="${com.superior.base.RoomName.list()}"
							optionKey="roomName" optionValue="roomName" 
							value="${cleaningJobCommandInstance?.hsRoomName4}"
							noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage4', 'error')} ">
					<g:field name="hsSquareFootage4" type="number" 
						value="${hsSquareFootage4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge4', 'error')} ">
					<g:field name="hsRoomCharge4" type="number" step="any" 
						value="${hsRoomCharge4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge4', 'error')} ">
					<g:checkBox name="hsEtchedCheck4" value="${hsEtchedCheck4}" />
					<g:field name="hsEtchedCharge4" type="number" step="any" 
						value="${hsEtchedCharge4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge4', 'error')} ">
					<g:checkBox name="hsSealedWaxedCheck4" value="${hsSealedWaxedCheck4}" />
					<g:field name="hsSealedWaxedCharge4" type="number" step="any" 
						value="${hsSealedWaxedCharge4} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsVisible4', 'error')} ">
					<g:field name="hsVisible4" type="hidden"  
						value="${hsVisible4} "/>
				</div>
			</td>
		</tr>
		<tr id="hsRoom05" style="display: none;">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName5', 'error')} ">
					<g:select name="hsRoomName5" from="${com.superior.base.RoomName.list()}"
							optionKey="roomName" optionValue="roomName" 
							value="${cleaningJobCommandInstance?.hsRoomName5}"
							noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage5', 'error')} ">
					<g:field name="hsSquareFootage5" type="number" 
						value="${hsSquareFootage5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge5', 'error')} ">
					<g:field name="hsRoomCharge5" type="number" step="any" 
						value="${hsRoomCharge5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge5', 'error')} ">
					<g:checkBox name="hsEtchedCheck5" value="${hsEtchedCheck5}" />
					<g:field name="hsEtchedCharge5" type="number" step="any" 
						value="${hsEtchedCharge5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge5', 'error')} ">
					<g:checkBox name="hsSealedWaxedCheck5" value="${hsSealedWaxedCheck5}" />
					<g:field name="hsSealedWaxedCharge5" type="number" step="any" 
						value="${hsSealedWaxedCharge5} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsVisible5', 'error')} ">
					<g:field name="hsVisible5" type="hidden"  
						value="${hsVisible5} "/>
				</div>
			</td>
		</tr>
		<tr id="hsRoom06" style="display: none;">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomName6', 'error')} ">
					<g:select name="hsRoomName6" from="${com.superior.base.RoomName.list()}"
							optionKey="roomName" optionValue="roomName" 
							value="${cleaningJobCommandInstance?.hsRoomName6}"
							noSelection="${['Pick a Room':'Pick a Room']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSquareFootage6', 'error')} ">
					<g:field name="hsSquareFootage6" type="number" 
						value="${hsSquareFootage6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsRoomCharge6', 'error')} ">
					<g:field name="hsRoomCharge6" type="number" step="any" 
						value="${hsRoomCharge6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsEtchedCharge6', 'error')} ">
					<g:checkBox name="hsEtchedCheck6" value="${hsEtchedCheck6}" />
					<g:field name="hsEtchedCharge6" type="number" step="any" 
						value="${hsEtchedCharge6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsSealedWaxedCharge6', 'error')} ">
					<g:checkBox name="hsSealedWaxedCheck6" value="${hsSealedWaxedCheck6}" />
					<g:field name="hsSealedWaxedCharge6" type="number" step="any" 
						value="${hsSealedWaxedCharge6} "/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hsVisible6', 'error')} ">
					<g:field name="hsVisible6" type="hidden"  
						value="${hsVisible6} "/>
				</div>
			</td>
		</tr>
	</tbody>
</table>