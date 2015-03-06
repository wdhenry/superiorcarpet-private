<table>
	<tr>
		<th colspan="1" class="sectionhead">Comment Section</th>
	</tr>
	<tr>
		<th>Comment</th>
	</tr>
	<tr>
		<td>
			<div
				class="fieldcontain ${hasErrors(bean: cleaningJobCommandInstance, field: 'comment', 'error')} required">
				<g:textArea name="comment"
					value="${cleaningJobCommandInstance.comment}" />
			</div>
		</td>
	</tr>
</table>