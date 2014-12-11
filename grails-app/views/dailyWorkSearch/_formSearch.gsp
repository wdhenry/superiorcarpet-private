<table>
	<tr>
		<th colspan="3" class="sectionhead">Search By Lead Name and Date Range</th>
	</tr>
	<tr>
		<th>Lead</th>
		<th>Begin Date</th>
		<th>End Date</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'lead', 'error')} ">
				<g:select name="lead" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailySearchCommandInstance?.lead}"
						noSelection="${['NONE':'Pick a Name']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'leadLowDate', 'error')} ">
				<g:datePicker name="leadLowDate" precision="day"  value="${dailySearchCommandInstance?.leadLowDate}"  />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'leadHighDate', 'error')} ">
				<g:datePicker name="leadHighDate" precision="day"  value="${dailySearchCommandInstance?.leadHighDate}"  />
			</div>
		</td>
	</tr>
	<tr>
		<th colspan="3" class="sectionhead">Search By Helper Name and Date Range</th>
	</tr>
	<tr>
		<th>Helper</th>
		<th>Begin Date</th>
		<th>End Date</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'helper', 'error')} ">
				<g:select name="helper" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailySearchCommandInstance?.helper}"
						noSelection="${['NONE':'Pick a Name']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'helperLowDate', 'error')} ">
				<g:datePicker name="helperLowDate" precision="day"  value="${dailySearchCommandInstance?.helperLowDate}"  />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'helperHighDate', 'error')} ">
				<g:datePicker name="helperHighDate" precision="day"  value="${dailySearchCommandInstance?.helperHighDate}"  />
			</div>
		</td>
	</tr>
	<tr>
		<th colspan="2" class="sectionhead">Search By Date Range</th>
	</tr>
	<tr>
		<th>Begin Date</th>
		<th>End Date</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'lowDate', 'error')} ">
				<g:datePicker name="lowDate" precision="day"  value="${cleaningSearchCommandInstance?.lowDate}"  />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailySearchCommandInstance, field: 'highDate', 'error')} ">
				<g:datePicker name="highDate" precision="day"  value="${cleaningSearchCommandInstance?.highDate}"  />
			</div>
		</td>
	</tr>
</table>



