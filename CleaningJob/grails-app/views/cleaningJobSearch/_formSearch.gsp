<table>
	<tr>
		<th colspan="2" class="sectionhead">Search By Job Date</th>
	</tr>
	<tr>
		<th colspan="2">Date of Job</th>
	</tr>
	<tr>
		<td colspan="2">
			<div class="fieldcontain ${hasErrors(bean: cleaningSearchCommandInstance, field: 'date', 'error')} ">
				<g:datePicker name="date" precision="day"  value="${cleaningSearchCommandInstance?.date}"  />
			</div>
		</td>
	</tr>
</table>



