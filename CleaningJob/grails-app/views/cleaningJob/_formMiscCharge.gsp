<table>
	<tr>
		<th colspan="3" class="sectionhead">Miscellaneous Charge Section</th>
	</tr>
	<tr>
		<td colspan="3">  
			<div>
				<g:message code="cleaningJob.numberMisc.label" default="Select Number of Miscellaneous Charges" />
				<g:select name="miscCount" 
					from="${['01','02','03']}"
					noSelection="${['00':'00']}"/>
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
						noSelection="${['Pick Misc. Description':'Pick Misc. Description']}"/>
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
						noSelection="${['Pick Misc. Description':'Pick Misc. Description']}"/>
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
						noSelection="${['Pick Misc. Description':'Pick Misc. Description']}"/>
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
	</tbody>
</table>