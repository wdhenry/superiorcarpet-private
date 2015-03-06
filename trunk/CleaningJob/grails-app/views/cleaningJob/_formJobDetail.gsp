<table>
	<tr>
		<th colspan="4" class="sectionhead">Job Detail Section</th>
	</tr>
	<tr>
		<th>Date</th>
		<th>Lead *</th>
		<th>Helper</th>
		<th></th>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'date', 'error')} required">
				<g:datePicker name="date" precision="day"
					value="${cleaningJobCommandInstance?.date}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'lead', 'error')} required">
				<g:select name="lead" from="${com.superior.base.Lead.list()}"
					optionKey="leadName" optionValue="leadName"
					value="${cleaningJobCommandInstance?.lead}"
					noSelection="${['Pick a Name':'Pick a Name']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'helper', 'error')} ">
				<g:select name="helper" from="${com.superior.base.Helper.list()}"
					optionKey="helperName" optionValue="helperName"
					value="${cleaningJobCommandInstance?.helper}"
					noSelection="${['None':'None']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'customerId', 'error')} required">
				<g:field name="customerId" type="hidden"
					value="${cleaningJobCommandInstance.customerId}" required="" />
			</div>
		</td>
	</tr>
</table>