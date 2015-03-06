<table>
	<tr>
		<th colspan="5" class="sectionhead">Upholstery Section</th>
	</tr>
	<tr>
		<td colspan="5">  
			<div>
				<g:message code="cleaningJob.numberUpholstery.label" default="Select Number of Upholstery Items" />
				<g:select name="upholsteryCount" 
					from="${['01','02','03','04','05','06']}"
					noSelection="${['00':'00']}"/>
			</div>
		</td>
	</tr>
</table>
<table id="upholsteryTable">
	<thead>
		<tr>
			<th>Upholstery Piece</th>
			<th>Count</th>
			<th>Cleaning Charge</th>
			<th>Protector</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr id="upholstery0">
			<td colspan="5">No upholstery selected</td>
		</tr>
		<tr id="upholstery1">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName1', 'error')} ">
					<g:select name="upholsteryName1" 
						from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName1}"
						noSelection="${['Pick Upholstery Name':'Pick Upholstery Name']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount1', 'error')} ">
					<g:field name="upholsteryCount1" type="number" 
						value="${upholsteryCount1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge1', 'error')} ">
					<g:field name="upholsteryCharge1" type="number" step="any" 
						value="${upholsteryCharge1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge1', 'error')} ">
					<g:checkBox name="upholsteryProtectorCheck1" 
						value="${protectorCheck1}" />
					<g:field name="upholsteryProtectorCharge1" type="number" step="any" 
						value="${upholsteryProtectorCharge1}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'uVisible1', 'error')} ">
					<g:field name="uVisible1" type="hidden"  
						value="${uVisible1} "/>
				</div>
			</td>
		</tr>
		<tr id="upholstery2">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName2', 'error')} ">
					<g:select name="upholsteryName2" 
						from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName2}"
						noSelection="${['Pick Upholstery Name':'Pick Upholstery Name']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount2', 'error')} ">
					<g:field name="upholsteryCount2" type="number" 
						value="${upholsteryCount2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge2', 'error')} ">
					<g:field name="upholsteryCharge2" type="number" step="any" 
						value="${upholsteryCharge2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge2', 'error')} ">
					<g:checkBox name="upholsteryProtectorCheck2" 
						value="${protectorCheck2}" />
					<g:field name="upholsteryProtectorCharge2" type="number" step="any" 
						value="${upholsteryProtectorCharge2}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'uVisible2', 'error')} ">
					<g:field name="uVisible2" type="hidden"  
						value="${uVisible2} "/>
				</div>
			</td>
		</tr>
		<tr id="upholstery3">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName3', 'error')} ">
					<g:select name="upholsteryName3" 
						from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName3}"
						noSelection="${['Pick Upholstery Name':'Pick Upholstery Name']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount3', 'error')} ">
					<g:field name="upholsteryCount3" type="number" 
						value="${upholsteryCount3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge3', 'error')} ">
					<g:field name="upholsteryCharge3" type="number" step="any" 
						value="${upholsteryCharge3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge3', 'error')} ">
					<g:checkBox name="upholsteryProtectorCheck3" 
						value="${protectorCheck3}" />
					<g:field name="upholsteryProtectorCharge3" type="number" step="any" 
						value="${upholsteryProtectorCharge3}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'uVisible3', 'error')} ">
					<g:field name="uVisible3" type="hidden"  
						value="${uVisible3} "/>
				</div>
			</td>
		</tr>
		<tr id="upholstery4">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName4', 'error')} ">
					<g:select name="upholsteryName4" 
						from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName4}"
						noSelection="${['Pick Upholstery Name':'Pick Upholstery Name']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount4', 'error')} ">
					<g:field name="upholsteryCount4" type="number" 
						value="${upholsteryCount4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge4', 'error')} ">
					<g:field name="upholsteryCharge4" type="number" step="any" 
						value="${upholsteryCharge4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge4', 'error')} ">
					<g:checkBox name="upholsteryProtectorCheck4" 
						value="${protectorCheck4}" />
					<g:field name="upholsteryProtectorCharge4" type="number" step="any" 
						value="${upholsteryProtectorCharge4}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'uVisible4', 'error')} ">
					<g:field name="uVisible4" type="hidden"  
						value="${uVisible4} "/>
				</div>
			</td>
		</tr>
		<tr id="upholstery5">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName5', 'error')} ">
					<g:select name="upholsteryName5" 
						from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName5}"
						noSelection="${['Pick Upholstery Name':'Pick Upholstery Name']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount5', 'error')} ">
					<g:field name="upholsteryCount5" type="number" 
						value="${upholsteryCount5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge5', 'error')} ">
					<g:field name="upholsteryCharge5" type="number" step="any" 
						value="${upholsteryCharge5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge5', 'error')} ">
					<g:checkBox name="upholsteryProtectorCheck5" 
						value="${protectorCheck5}" />
					<g:field name="upholsteryProtectorCharge5" type="number" step="any" 
						value="${upholsteryProtectorCharge5}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'uVisible5', 'error')} ">
					<g:field name="uVisible5" type="hidden"  
						value="${uVisible5} "/>
				</div>
			</td>
		</tr>
		<tr id="upholstery6">
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryName6', 'error')} ">
					<g:select name="upholsteryName6" 
						from="${com.superior.base.UpholsteryName.list()}"
						optionKey="upholsteryName" optionValue="upholsteryName" 
						value="${cleaningJobCommandInstance?.upholsteryName6}"
						noSelection="${['Pick Upholstery Name':'Pick Upholstery Name']}"/>
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCount6', 'error')} ">
					<g:field name="upholsteryCount6" type="number" 
						value="${upholsteryCount6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryCharge6', 'error')} ">
					<g:field name="upholsteryCharge6" type="number" step="any" 
						value="${upholsteryCharge6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'upholsteryProtectorCharge6', 'error')} ">
					<g:checkBox name="upholsteryProtectorCheck6" 
						value="${protectorCheck6}" />
					<g:field name="upholsteryProtectorCharge6" type="number" step="any" 
						value="${upholsteryProtectorCharge6}" />
				</div>
			</td>
			<td>
				<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'uVisible6', 'error')} ">
					<g:field name="uVisible6" type="hidden"  
						value="${uVisible6} "/>
				</div>
			</td>
		</tr>
</table>