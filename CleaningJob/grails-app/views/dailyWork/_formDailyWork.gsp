<%@ page import="com.superior.extractionjob.ExtractionJobCommand" %>

<table>
	<tr>
		<th colspan="5">Date of Work</th>
	</tr>
	<tr>
		<td colspan="5">
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'date', 'error')} required">
				<g:datePicker name="date" precision="day"  value="${dailyWorkCommandInstance?.date}"  />
			</div>
		</td>
	</tr>
	<tr>
		<th></th>
		<th>Van 1</th>
		<th>Van 2</th>
		<th>Van 3</th>
		<th>Van 4</th>
	</tr>
	<tr>
		<td>
		<span>Lead *</span>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead1', 'error')} required">
				<g:select name="lead1" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead1}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead2', 'error')} required">
				<g:select name="lead2" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead2}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead3', 'error')} required">
				<g:select name="lead3" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead3}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead4', 'error')} required">
				<g:select name="lead4" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead4}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Hours Worked</span>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours1', 'error')} ">
				<g:select name="leadHours1" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours1}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours2', 'error')} ">
				<g:select name="leadHours2" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours2}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours3', 'error')} ">
				<g:select name="leadHours3" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours3}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours4', 'error')} ">
				<g:select name="leadHours4" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours4}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Minutes Worked</span>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes1', 'error')} ">
				<g:select name="leadMinutes1" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes1}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes2', 'error')} ">
				<g:select name="leadMinutes2" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes2}" noSelection="${['00':'00']}" />
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes3', 'error')} ">
				<g:select name="leadMinutes3" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes3}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes4', 'error')} ">
				<g:select name="leadMinutes4" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes4}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Helper</span>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper1', 'error')} ">
				<g:select name="helper1" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper1}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper2', 'error')} ">
				<g:select name="helper2" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper2}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper3', 'error')} ">
				<g:select name="helper3" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper3}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper4', 'error')} ">
				<g:select name="helper4" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper4}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Hours Worked</span>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours1', 'error')} ">
				<g:select name="helperHours1" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours1}" noSelection="${['00':'00']}"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours2', 'error')} ">
				<g:select name="helperHours2" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours2}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours3', 'error')} ">
				<g:select name="helperHours3" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours3}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours4', 'error')} ">
				<g:select name="helperHours4" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours4}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Minutes Worked</span>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes1', 'error')} ">
				<g:select name="helperMinutes1" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes1}" 
				noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes2', 'error')} ">
				<g:select name="helperMinutes2" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes2}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes3', 'error')} ">
				<g:select name="helperMinutes3" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes3}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes4', 'error')} ">
				<g:select name="helperMinutes4" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes4}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Miles Driven</span>
		</td>	
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven1', 'error')} ">
				<g:field name="milesDriven1" type="number" step="any" value="${milesDriven1}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven2', 'error')} ">
				<g:field name="milesDriven2" type="number" step="any" value="${milesDriven2}" />
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven3', 'error')} ">
				<g:field name="milesDriven3" type="number" step="any" value="${milesDriven3}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven4', 'error')} ">
				<g:field name="milesDriven4" type="number" step="any" value="${milesDriven4}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Unit Hours</span>
		</td>	
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit1', 'error')} ">
				<g:field name="hoursOnUnit1" type="number" step="any" value="${hoursOnUnit1}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit2', 'error')} ">
				<g:field name="hoursOnUnit2" type="number" step="any" value="${hoursOnUnit2}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit3', 'error')} ">
				<g:field name="hoursOnUnit3" type="number" step="any" value="${hoursOnUnit3}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit4', 'error')} ">
				<g:field name="hoursOnUnit4" type="number" step="any" value="${hoursOnUnit4}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>$ Collected</span>
		</td>	
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected1', 'error')} ">
				<g:field name="dollarsCollected1" type="number" step="any" value="${dollarsCollected1}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected2', 'error')} ">
				<g:field name="dollarsCollected2" type="number" step="any" value="${dollarsCollected2}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected3', 'error')} ">
				<g:field name="dollarsCollected3" type="number" step="any" value="${dollarsCollected3}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected4', 'error')} ">
				<g:field name="dollarsCollected4" type="number" step="any" value="${dollarsCollected4}" />
			</div>
		</td>
	</tr>
	<tr>
		<th></th>
		<th>Van 5</th>
		<th>Van 6</th>
		<th>Van 7</th>
		<th>Astro</th>
		
	</tr>
	<tr>
		<td>
		<span>Lead *</span>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead5', 'error')} required">
				<g:select name="lead5" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead5}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead6', 'error')} required">
				<g:select name="lead6" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead6}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead7', 'error')} required">
				<g:select name="lead7" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead7}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'lead8', 'error')} required">
				<g:select name="lead8" from="${com.superior.base.Lead.list()}"
						optionKey="leadName" optionValue="leadName" 
						value="${dailyWorkCommandInstance?.lead8}"
						noSelection="${['Pick a Name':'--Pick a Name--']}"
						class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Hours Worked</span>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours5', 'error')} ">
				<g:select name="leadHours5" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours5}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours6', 'error')} ">
				<g:select name="leadHours6" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours6}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours7', 'error')} ">
				<g:select name="leadHours7" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours7}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadHours8', 'error')} ">
				<g:select name="leadHours8" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${leadHours8}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Minutes Worked</span>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes5', 'error')} ">
				<g:select name="leadMinutes5" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes5}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes6', 'error')} ">
				<g:select name="leadMinutes6" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes6}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes7', 'error')} ">
				<g:select name="leadMinutes7" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes7}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'leadMinutes8', 'error')} ">
				<g:select name="leadMinutes8" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${leadMinutes8}" noSelection="${['00':'00']}" 
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Helper</span>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper5', 'error')} ">
				<g:select name="helper5" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper5}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper6', 'error')} ">
				<g:select name="helper6" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper6}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper7', 'error')} ">
				<g:select name="helper7" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper7}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
		<td>	
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helper8', 'error')} ">
				<g:select name="helper8" from="${com.superior.base.Helper.list()}"
						optionKey="helperName" optionValue="helperName" 
						value="${dailyWorkCommandInstance?.helper8}"
						noSelection="${['None':'--None--']}"
						class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Hours Worked</span>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours5', 'error')} ">
				<g:select name="helperHours5" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours5}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours6', 'error')} ">
				<g:select name="helperHours6" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours6}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours7', 'error')} ">
				<g:select name="helperHours7" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours7}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperHours8', 'error')} ">
				<g:select name="helperHours8" from="${['01','02','03','04','05','06','07','08','09','10','11','12']}" 
				value="${helperHours8}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Minutes Worked</span>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes5', 'error')} ">
				<g:select name="helperMinutes5" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes5}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes6', 'error')} ">
				<g:select name="helperMinutes6" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes6}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes7', 'error')} ">
				<g:select name="helperMinutes7" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes7}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
		<td>		
			<div class="fieldcontain ${hasErrors(bean: dailyWorkCommandInstance, field: 'helperMinutes8', 'error')} ">
				<g:select name="helperMinutes8" 
				from="${['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']}" 
				value="${helperMinutes8}" noSelection="${['00':'00']}"
				class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Miles Driven</span>
		</td>	
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven5', 'error')} ">
				<g:field name="milesDriven5" type="number" step="any" value="${milesDriven5}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven6', 'error')} ">
				<g:field name="milesDriven6" type="number" step="any" value="${milesDriven6}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven7', 'error')} ">
				<g:field name="milesDriven7" type="number" step="any" value="${milesDriven7}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'milesDriven8', 'error')} ">
				<g:field name="milesDriven8" type="number" step="any" value="${milesDriven8}" />
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<span>Unit Hours</span>
		</td>	
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit5', 'error')} ">
				<g:field name="hoursOnUnit5" type="number" step="any" value="${hoursOnUnit5}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit6', 'error')} ">
				<g:field name="hoursOnUnit6" type="number" step="any" value="${hoursOnUnit6}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'hoursOnUnit7', 'error')} ">
				<g:field name="hoursOnUnit7" type="number" step="any" value="${hoursOnUnit7}" />
			</div>
		</td>
		<td>
			<span>N/A</span>
		</td>
	</tr>
	<tr>
		<td>
			<span>$ Collected</span>
		</td>	
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected5', 'error')} ">
				<g:field name="dollarsCollected5" type="number" step="any" value="${dollarsCollected5}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected6', 'error')} ">
				<g:field name="dollarsCollected6" type="number" step="any" value="${dollarsCollected6}" />
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'dollarsCollected7', 'error')} ">
				<g:field name="dollarsCollected7" type="number" step="any" value="${dollarsCollected7}" />
			</div>
		</td>
		<td>
			<span>N/A</span>
		</td>
	</tr>
</table>