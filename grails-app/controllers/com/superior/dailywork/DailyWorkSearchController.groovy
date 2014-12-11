package com.superior.dailywork

import com.superior.dailywork.DailyWorkSearchCommand
import com.superior.base.DailyWorkRecord
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DailyWorkSearchController {

    def index() { 
		DailyWorkSearchCommand dailySearchCommandInstance = new DailyWorkSearchCommand()
		respond dailySearchCommandInstance , view:'search'
	}
	
	def search(DailyWorkSearchCommand dailySearchCommandInstance) {
		if (dailySearchCommandInstance == null) {
			respond dailySearchCommandInstance , view:'search'
			return
		}
		
		def workList = new ArrayList()
		if (dailySearchCommandInstance.lead != "NONE") {
			workList = DailyWorkRecord.findAllByLead(dailySearchCommandInstance.lead)
		} else if (dailySearchCommandInstance.helper != "NONE") {
			workList = DailyWorkRecord.findAllByHelper(dailySearchCommandInstance.helper)
		} else if (dailySearchCommandInstance.lowDate != null) {
			workList = DailyWorkRecord.findAllByDate(dailySearchCommandInstance.lowDate)
		} else {
			dailySearchCommandInstance.errors.rejectValue('', 'No Search Criteria Entered   ')
			respond dailySearchCommandInstance.errors, view:'search'
			return
		}
				
		if (workList.size() > 0) {
			respond workList, view:'summary', model:[work: workList,
												dailyWorkJobInstanceCount: workList.size()]
			return
		} else {
			dailySearchCommandInstance.errors.rejectValue('', 'No matching Daily Work Found   ')
			respond dailySearchCommandInstance.errors, view:'search'
			return
		}
	}
}
