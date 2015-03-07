	<tr>
		<th>First Name</th>
		<th>Last/Company Name</th>
		<th>Address Line 1</th>
		<th>Address Line 2</th>
	</tr>
	<tr>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="firstName"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="lastName"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="addressLineOne"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="addressLineTwo"/></td>
	</tr>
	<tr>
		<th>Date</th>
		<th>Lead</th>
		<th>Helper</th>
		<th></th>
	</tr>
	<tr>
		<td><g:formatDate format="MM-dd-yyyy" date="${cleaningJobCommandInstance.date}" /></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="lead"/></td>
		<td><g:fieldValue bean="${cleaningJobCommandInstance}" field="helper"/></td>
	</tr>