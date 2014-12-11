<table>
	<tr>
		<th colspan="2" class="sectionhead">Search By Customer Name</th>
	</tr>
	<tr>
		<th>Last Name</th>
		<th>First Name</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: customerSearchCommandInstance, field: 'lastName', 'error')} ">
				<g:textField name="lastName" value="${customerSearchCommandInstance?.lastName}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: customerSearchCommandInstance, field: 'firstName', 'error')} ">
				<g:textField name="firstName" value="${customerSearchCommandInstance?.firstName}"/>
			</div>
		</td>
	</tr>
	<tr>
		<th colspan="2" class="sectionhead">Search By Customer Address</th>
	</tr>
	<tr>
		<th>Address Line One</th>
		<th>Address Line Two</th>
	</tr>
	<tr>
		<td>
			<div class="fieldcontain ${hasErrors(bean: customerSearchCommandInstance, field: 'addressLineOne', 'error')} ">
				<g:textField name="addressLineOne" value="${customerSearchCommandInstance?.addressLineOne}"/>
			</div>
		</td>
		<td>
			<div class="fieldcontain ${hasErrors(bean: customerSearchCommandInstance, field: 'addressLineTwo', 'error')} ">
				<g:textField name="addressLineTwo" value="${customerSearchCommandInstance?.addressLineTwo}"/>
			</div>
		</td>
	</tr>
</table>



