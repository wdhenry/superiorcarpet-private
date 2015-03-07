<table>
	<tr>
		<th colspan="4" class="sectionhead">Stair Section</th>
	</tr>
	<tr>
		<td colspan="7">  
			<div>
				<g:message code="cleaningJob.numberStairs.label" default="Select Number of Sets of Stairs" />
				<g:select name="stairCount" 
					from="${['01','02','03']}"
					noSelection="${['00':'00']}"/>
			</div>
		</td>
	</tr>
</table>
<table id="stairTable">
	<thead>
		<tr>
			<th>Stair Direction</th>
			<th>Stair Count</th>
			<th>Stair Charge</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr id="stair0">
			<td colspan="7">No set of stairs selected</td>
		</tr>
		<tr id="stair1">
			<td>
				<div
					class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection1', 'error')} ">
					<g:select name="stairDirection1" from="${['Down - 1st Set', 'Down - 2nd Set', 'Up - 1st Set', 'Up - 2nd Set']}"
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
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairVisible1', 'error')} ">
					<g:field name="stairVisible1" type="hidden"  
						value="${stairVisible1} "/>
				</div>
			</td>
		</tr>
		<tr id="stair2">
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
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairVisible2', 'error')} ">
					<g:field name="stairVisible2" type="hidden"  
						value="${stairVisible2} "/>
				</div>
			</td>
		</tr>
		<tr id="stair3">
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
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'stairVisible3', 'error')} ">
					<g:field name="stairVisible3" type="hidden"  
						value="${stairVisible3} "/>
				</div>
			</td>
		</tr>
	</tbody>
</table>