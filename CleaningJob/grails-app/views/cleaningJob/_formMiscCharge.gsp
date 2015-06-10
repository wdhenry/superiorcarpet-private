<table>
	<tr>
		<th colspan="3" class="sectionhead">Miscellaneous Charge Section</th>
	</tr>
	<tr>
		<td colspan="3">  
			<div>
				<g:message code="cleaningJob.numberMisc.label" default="Select Number of Miscellaneous Charges" />
				<g:select name="miscCount" 
					from="${['01','02','03','04','05','06','07','08']}"
					noSelection="${['00':'00']}"
					class="sorted-asc"/>
			</div>
		</td>
	</tr>
</table>
<table id="miscellaneousChargeTable">
	<thead>
		<tr>
			<th>Miscellaneous Description</th>
			<th>Charge</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr id="misc00">
			<td colspan="3">No miscellaneous charges selected</td>
		</tr>
		<tr id="misc01">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName1', 'error')} ">
					<g:select name="miscChargesName1" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName1}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge1', 'error')} ">
					<g:field name="miscCharge1" type="number" step="any" 
						value="${miscCharge1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible1', 'error')} ">
					<g:field name="miscVisible1" type="hidden"  
						value="${miscVisible1} "/>
				</div>
			</td>
		</tr>
		<tr id="misc02">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName2', 'error')} ">
					<g:select name="miscChargesName2" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName2}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge2', 'error')} ">
					<g:field name="miscCharge2" type="number" step="any" 
						value="${miscCharge2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible2', 'error')} ">
					<g:field name="miscVisible2" type="hidden"  
						value="${miscVisible2} "/>
				</div>
			</td>
		</tr>
		<tr id="misc03">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName3', 'error')} ">
					<g:select name="miscChargesName3" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName3}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge3', 'error')} ">
					<g:field name="miscCharge3" type="number" step="any" 
						value="${miscCharge3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible3', 'error')} ">
					<g:field name="miscVisible3" type="hidden"  
						value="${miscVisible3} "/>
				</div>
			</td>
		</tr>
		<tr id="misc04">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName4', 'error')} ">
					<g:select name="miscChargesName4" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName4}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge4', 'error')} ">
					<g:field name="miscCharge4" type="number" step="any" 
						value="${miscCharge4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible4', 'error')} ">
					<g:field name="miscVisible4" type="hidden"  
						value="${miscVisible4} "/>
				</div>
			</td>
		</tr>
		<tr id="misc05">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName5', 'error')} ">
					<g:select name="miscChargesName5" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName5}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge5', 'error')} ">
					<g:field name="miscCharge5" type="number" step="any" 
						value="${miscCharge5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible5', 'error')} ">
					<g:field name="miscVisible5" type="hidden"  
						value="${miscVisible5} "/>
				</div>
			</td>
		</tr>
		<tr id="misc06">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName6', 'error')} ">
					<g:select name="miscChargesName6" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName6}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge6', 'error')} ">
					<g:field name="miscCharge6" type="number" step="any" 
						value="${miscCharge6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible6', 'error')} ">
					<g:field name="miscVisible6" type="hidden"  
						value="${miscVisible6} "/>
				</div>
			</td>
		</tr>
		<tr id="misc07">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName7', 'error')} ">
					<g:select name="miscChargesName7" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName7}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge7', 'error')} ">
					<g:field name="miscCharge7" type="number" step="any" 
						value="${miscCharge7}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible7', 'error')} ">
					<g:field name="miscVisible7" type="hidden"  
						value="${miscVisible7} "/>
				</div>
			</td>
		</tr>
		<tr id="misc08">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName8', 'error')} ">
					<g:select name="miscChargesName8" 
						from="${com.superior.base.MiscChargesName.list()}"
					 	optionKey="miscChargesName" optionValue="miscChargesName"
						value="${cleaningJobCommandInstance?.miscChargesName8}" 
						noSelection="${['Pick Misc. Description':'--Pick Misc. Description--']}"
						class="sorted-asc"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge8', 'error')} ">
					<g:field name="miscCharge8" type="number" step="any" 
						value="${miscCharge8}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible8', 'error')} ">
					<g:field name="miscVisible8" type="hidden"  
						value="${miscVisible8} "/>
				</div>
			</td>
		</tr>
	</tbody>
</table>