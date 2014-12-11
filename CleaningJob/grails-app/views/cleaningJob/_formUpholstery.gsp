	<tr>
		<th>Upholstery Piece</th>
		<th>Count</th>
		<th>Cleaning Charge</th>
		<th>Protector</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName', 'error')} ">
				<g:select name="upholsteryName" from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName}"
						noSelection="${['null':'Pick Upholstery Name']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount', 'error')} ">
				<g:field name="upholsteryCount" type="number" value="${upholsteryCount}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge', 'error')} ">
				<g:field name="upholsteryCharge" type="number" step="any" value="${upholsteryCharge}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge', 'error')} ">
				<g:checkBox name="upholsteryProtectorCheck" value="${protectorCheck}" />
				<g:field name="upholsteryProtectorCharge" type="number" step="any" value="${upholsteryProtectorCharge}" />
			</div>
		</td>
	</tr>