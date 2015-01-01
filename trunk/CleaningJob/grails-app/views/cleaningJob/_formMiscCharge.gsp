	<tr>
		<th>Miscellaneous Description</th>
		<th>Charge</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName', 'error')} ">
				<g:select name="miscChargesName" from="${com.superior.base.MiscChargesName.list()}"
				 	optionKey="miscChargesName" optionValue="miscChargesName"
					value="${cleaningJobCommandInstance?.miscChargesName}" 
					noSelection="${['Pick Misc. Description':'Pick Misc. Description']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge', 'error')} ">
				<g:field name="miscCharge" type="number" step="any" value="${miscCharge}" />
			</div>
		</td>
	</tr>