<table>
	<tr>
		<th colspan="3" class="sectionhead">Stair Section</th>
	</tr>
	<tr>
		<th>Stair Direction</th>
		<th>Stair Count</th>
		<th>Stair Charge</th>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection1', 'error')} ">
				<g:select name="stairDirection1" from="${['Down', 'Up']}"
					value="${stairDirection1}"
					noSelection="${['Pick a Direction':'Pick a Direction']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount1', 'error')} ">
				<g:field name="stairCount1" type="number" value="${stairCount1}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge1', 'error')} ">
				<g:field name="stairCharge1" type="number" step="any"
					value="${stairCharge1}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection2', 'error')} ">
				<g:select name="stairDirection2" from="${['Down', 'Up']}"
					value="${stairDirection2}"
					noSelection="${['Pick a Direction':'Pick a Direction']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount2', 'error')} ">
				<g:field name="stairCount2" type="number" value="${stairCount2}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge2', 'error')} ">
				<g:field name="stairCharge2" type="number" step="any"
					value="${stairCharge2}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection3', 'error')} ">
				<g:select name="stairDirection3" from="${['Down', 'Up']}"
					value="${stairDirection3}"
					noSelection="${['Pick a Direction':'Pick a Direction']}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount3', 'error')} ">
				<g:field name="stairCount3" type="number" value="${stairCount3}" />
			</div>
		</td>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge3', 'error')} ">
				<g:field name="stairCharge3" type="number" step="any"
					value="${stairCharge3}" />
			</div>
		</td>
	</tr>
</table>