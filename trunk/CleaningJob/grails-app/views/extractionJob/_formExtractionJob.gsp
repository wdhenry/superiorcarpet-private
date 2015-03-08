<%@ page import="com.superior.extractionjob.ExtractionJobCommand" %>

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
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'date', 'error')} required">
				<g:datePicker name="date" precision="day"  value="${extractionJobCommandInstance?.date}"  />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'lead', 'error')} required">
				<g:select name="lead" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${extractionJobCommandInstance?.lead}"
						noSelection="${['Pick a Name':'Pick a Name']}"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'helper', 'error')} ">
				<g:select name="helper" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${extractionJobCommandInstance?.helper}"
						noSelection="${['None':'None']}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'customerId', 'error')} required">
				<g:field name="customerId" type="hidden" value="${extractionJobCommandInstance.customerId}" required=""/>
			</div>
		</td>
	</tr>
</table>

<table>
	<tr>
		<th colspan="6" class="sectionhead">Water Extraction Section</th>
	</tr>
	<tr>
		<th>Start Hour</th>
		<th>Start Minute</th>
		<th>Start AM/PM</th>
		<th>End Hour</th>
		<th>End Minute</th>
		<th>End AM/PM</th>
	</tr>
	<tr>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'startHour', 'error')} ">
				<g:select name="startHour" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${startHour}" />
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'startMinute', 'error')} ">
				<g:select name="startMinute" 
				from="${['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${startMinute}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'startAmPm', 'error')} ">
				<g:select name="startAmPm" from="${['AM', 'PM']}"
					value="${startAmPm}" />
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'endHour', 'error')} ">
				<g:select name="endHour" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${endHour}" />
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'endMinute', 'error')} ">
				<g:select name="endMinute" 
				from="${['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${endMinute}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'endAmPm', 'error')} ">
				<g:select name="endAmPm" from="${['AM', 'PM']}"
					value="${endAmPm}" />
			</div>
		</td>
	</tr>
</table>

<g:render template="formFanDehu"></g:render>
