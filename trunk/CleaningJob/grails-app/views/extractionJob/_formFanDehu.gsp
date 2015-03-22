<table>
	<tr>
		<th class="sectionhead">Fan Section</th>
		<th class="sectionhead">Dehumidifier Section</th>
	</tr>
	<tr>
		<td>
			<div>
				<g:message code="extractionJob.numberFans.label" default="Select Number of Fans Left on Job" />
				<g:select name="fanCount" 
					from="${['01','02','03','04','05','06','07','08','09','10','11','12']}"
					noSelection="${['00':'00']}"
					class="sorted-asc"/>
			</div>
		</td>
		<td>
			<div>
				<g:message code="extractionJob.numberDehus.label" default="Select Number of Dehumidifiers Left on Job" />
				<g:select name="dehuCount" 
					from="${['01','02','03','04','05','06','07','08','09','10','11','12']}"
					noSelection="${['00':'00']}"
					class="sorted-asc"/>
			</div>
		</td>
	</tr>
	<tr>
		<td>
			<table id="fansTable">
				<thead>
					<tr>
						<th>Fans</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr id="fan00">
						<td colspan="2">No fans selected</td>
					</tr>
					<tr id="fan01" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId01', 'error')} ">
								<g:select name="fanId01" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId01}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible01', 'error')} ">
								<g:field name="fanVisible01" type="hidden"  
									value="${fanVisible01} "/>
							</div>
						</td>
					</tr>
					<tr id="fan02" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId02', 'error')} ">
								<g:select name="fanId02" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId02}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible02', 'error')} ">
								<g:field name="fanVisible02" type="hidden"  
									value="${fanVisible02} "/>
							</div>
						</td>
					</tr>
					<tr id="fan03" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId03', 'error')} ">
								<g:select name="fanId03" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId03}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible03', 'error')} ">
								<g:field name="fanVisible03" type="hidden"  
									value="${fanVisible03} "/>
							</div>
						</td>
					</tr>
					<tr id="fan04" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId04', 'error')} ">
								<g:select name="fanId04" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId04}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible04', 'error')} ">
								<g:field name="fanVisible04" type="hidden"  
									value="${fanVisible04} "/>
							</div>
						</td>
					</tr>
					<tr id="fan05" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId05', 'error')} ">
								<g:select name="fanId05" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId05}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible05', 'error')} ">
								<g:field name="fanVisible05" type="hidden"  
									value="${fanVisible05} "/>
							</div>
						</td>
					</tr>
					<tr id="fan06" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId06', 'error')} ">
								<g:select name="fanId06" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId06}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible06', 'error')} ">
								<g:field name="fanVisible06" type="hidden"  
									value="${fanVisible06} "/>
							</div>
						</td>
					</tr>
					<tr id="fan07" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId07', 'error')} ">
								<g:select name="fanId07" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId07}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible07', 'error')} ">
								<g:field name="fanVisible07" type="hidden"  
									value="${fanVisible07} "/>
							</div>
						</td>
					</tr>
					<tr id="fan08" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId08', 'error')} ">
								<g:select name="fanId08" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId08}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible08', 'error')} ">
								<g:field name="fanVisible08" type="hidden"  
									value="${fanVisible08} "/>
							</div>
						</td>
					</tr>
					<tr id="fan09" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId09', 'error')} ">
								<g:select name="fanId09" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId09}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible09', 'error')} ">
								<g:field name="fanVisible09" type="hidden"  
									value="${fanVisible09} "/>
							</div>
						</td>
					</tr>
					<tr id="fan10" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId10', 'error')} ">
								<g:select name="fanId10" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId10}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible10', 'error')} ">
								<g:field name="fanVisible10" type="hidden"  
									value="${fanVisible10} "/>
							</div>
						</td>
					</tr>
					<tr id="fan11" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId11', 'error')} ">
								<g:select name="fanId11" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId11}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible11', 'error')} ">
								<g:field name="fanVisible11" type="hidden"  
									value="${fanVisible11} "/>
							</div>
						</td>
					</tr>
					<tr id="fan12" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanId12', 'error')} ">
								<g:select name="fanId12" 
										from="${com.superior.base.Fans.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.fanId12}"
										noSelection="${['00':'--Select Fan--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'fanVisible12', 'error')} ">
								<g:field name="fanVisible12" type="hidden"  
									value="${fanVisible12} "/>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</td>
		<td>	
			<table id="dehusTable">
				<thead>
					<tr>
						<th>Dehumidifiers</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr id="dehu00">
						<td colspan="2">No dehumidifiers selected</td>
					</tr>
					<tr id="dehu01" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId01', 'error')} ">
								<g:select name="dehuId01" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId01}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible01', 'error')} ">
								<g:field name="dehuVisible01" type="hidden"  
									value="${dehuVisible01} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu02" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId02', 'error')} ">
								<g:select name="dehuId02" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId02}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible02', 'error')} ">
								<g:field name="dehuVisible02" type="hidden"  
									value="${dehuVisible02} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu03" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId03', 'error')} ">
								<g:select name="dehuId03" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId03}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible03', 'error')} ">
								<g:field name="dehuVisible03" type="hidden"  
									value="${dehuVisible03} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu04" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId04', 'error')} ">
								<g:select name="dehuId04" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId04}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible04', 'error')} ">
								<g:field name="dehuVisible04" type="hidden"  
									value="${dehuVisible04} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu05" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId05', 'error')} ">
								<g:select name="dehuId05" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId05}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible05', 'error')} ">
								<g:field name="dehuVisible05" type="hidden"  
									value="${dehuVisible05} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu06" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId06', 'error')} ">
								<g:select name="dehuId06" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId06}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible06', 'error')} ">
								<g:field name="dehuVisible06" type="hidden"  
									value="${dehuVisible06} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu07" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId07', 'error')} ">
								<g:select name="dehuId07" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId07}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible07', 'error')} ">
								<g:field name="dehuVisible07" type="hidden"  
									value="${dehuVisible07} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu08" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId08', 'error')} ">
								<g:select name="dehuId08" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId08}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible08', 'error')} ">
								<g:field name="dehuVisible08" type="hidden"  
									value="${dehuVisible08} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu09" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId09', 'error')} ">
								<g:select name="dehuId09" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId09}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible09', 'error')} ">
								<g:field name="dehuVisible09" type="hidden"  
									value="${dehuVisible09} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu10" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId10', 'error')} ">
								<g:select name="dehuId10" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId10}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible10', 'error')} ">
								<g:field name="dehuVisible10" type="hidden"  
									value="${dehuVisible10} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu11" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId11', 'error')} ">
								<g:select name="dehuId11" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId11}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible11', 'error')} ">
								<g:field name="dehuVisible11" type="hidden"  
									value="${dehuVisible11} "/>
							</div>
						</td>
					</tr>
					<tr id="dehu12" style="display: none;">
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuId12', 'error')} ">
								<g:select name="dehuId12" 
										from="${com.superior.base.Dehumidifiers.findAllByIsIn(true)}"
										optionKey="idNumber" optionValue="displayValue" 
										value="${extractionJobCommandInstance?.dehuId12}"
										noSelection="${['00':'--Select Dehumidifier--']}"
										class="sorted-asc"/>
							</div>
						</td>
						<td>
							<div class="fieldcontain ${hasErrors(bean: extractionJobCommandInstance, field: 'dehuVisible12', 'error')} ">
								<g:field name="dehuVisible12" type="hidden"  
									value="${dehuVisible12} "/>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</td>
	</tr>
</table>