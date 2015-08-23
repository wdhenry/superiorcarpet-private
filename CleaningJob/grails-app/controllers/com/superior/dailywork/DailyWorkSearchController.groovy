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
			def query = DailyWorkRecord.where {
				lead == dailySearchCommandInstance.lead &&
				date in dailySearchCommandInstance.leadLowDate..dailySearchCommandInstance.leadHighDate
			}
			workList = query.list()
		} else if (dailySearchCommandInstance.helper != "NONE") {
			def query = DailyWorkRecord.where {
				helper == dailySearchCommandInstance.helper &&
				date in dailySearchCommandInstance.helperLowDate..dailySearchCommandInstance.helperHighDate
			}
			workList = query.list()
		} else if (dailySearchCommandInstance.lowDate != null) {
			def query = DailyWorkRecord.where {
				date in dailySearchCommandInstance.lowDate..dailySearchCommandInstance.highDate
			}
			workList = query.list()
		}
				
		if (workList.size() > 0) {
			def DailyWorkRecord totals = new DailyWorkRecord(date: null, lead: "Totals", helper: " ", vanNumber: " ", leadHours: 0, leadMinutes: 0, helperHours: 0, helperMinutes: 0, milesDriven: 0, hoursOnUnit: 0, dollarsCollected: 0.00)
			for (DailyWorkRecord wr : workList) {
				totals.leadHours = totals.leadHours + wr.leadHours
				totals.leadMinutes = totals.leadMinutes + wr.leadMinutes
				totals.helperHours = totals.helperHours + wr.helperHours
				totals.helperMinutes = totals.helperMinutes + wr.helperMinutes
				totals.milesDriven = totals.milesDriven + wr.milesDriven
				totals.hoursOnUnit = totals.hoursOnUnit + wr.hoursOnUnit
				totals.dollarsCollected = totals.dollarsCollected + wr.dollarsCollected
			}
			workList.add(totals)
			respond workList, view:'summary', model:[work: workList, dailyWorkJobInstanceCount: workList.size()]
			return
		} else {
			dailySearchCommandInstance.errors.reject('default.search.not.found', ["daily work"].toArray(), '')
			respond dailySearchCommandInstance.errors, view:'search'
			return
		}
	}
}
