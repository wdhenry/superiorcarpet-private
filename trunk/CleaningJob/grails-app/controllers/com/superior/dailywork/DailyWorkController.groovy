package com.superior.dailywork

import com.superior.base.DailyWorkRecord

import grails.transaction.Transactional;

@Transactional(readOnly = true)
class DailyWorkController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
	def index() {
		DailyWorkCommand dailyWorkCommandInstance = new DailyWorkCommand()
		respond dailyWorkCommandInstance
	}
	
	def showWork(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond DailyWorkRecord.list(params), model:[dailyWorkRecordInstanceCount: DailyWorkRecord.count()]
	}
			
	@Transactional
	def saveJob(DailyWorkCommand dailyWorkCommandInstance) {
		
		if (dailyWorkCommandInstance == null) {
			notFound()
			return
		}

		//Row 1 Edits
		if (dailyWorkCommandInstance.lead1 == "Pick a Name") {
			dailyWorkCommandInstance.errors.rejectValue('lead1', 'Must pick a Lead Name, Row 1   ')
		}
		
		if ((dailyWorkCommandInstance.lead1 != "Pick a Name") &&
			(dailyWorkCommandInstance.leadHours1 == '00') &&
			(dailyWorkCommandInstance.leadMinutes1 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('lead1', 'Must Enter Hours or Minutes if Entering a Lead, Row 1   ')
		}
		
		if ((dailyWorkCommandInstance.helper1 != "None") &&
			(dailyWorkCommandInstance.helperHours1 == '00') &&
			(dailyWorkCommandInstance.helperMinutes1 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('helper1', 'Must Enter Hours or Minutes if Entering a Helper, Row 1   ')
		}
			
		if ((dailyWorkCommandInstance.helper1 == "None") &&
			((dailyWorkCommandInstance.helperHours1 != '00') ||
			(dailyWorkCommandInstance.helperMinutes1 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('helper1', 'Must pick a Helper Name if Entering Hours or Minutes for Helper, Row 1   ')
		}
		
		if (dailyWorkCommandInstance.lead1 != "Pick a Name") {
			if (dailyWorkCommandInstance.vanNumber1 == "Pick a Van") {
				dailyWorkCommandInstance.errors.rejectValue('vanNumber1', 'Must pick a Van, if entering a Lead, Row 1   ')
			}
			if (dailyWorkCommandInstance.milesDriven1 == null) {
				dailyWorkCommandInstance.errors.rejectValue('milesDriven1', 'Must enter Miles Driven, if entering a Lead, Row 1   ')
			}
			if (dailyWorkCommandInstance.hoursOnUnit1 == null) {
				dailyWorkCommandInstance.errors.rejectValue('hoursOnUnit1', 'Must enter Hours on Unit, if entering a Lead, Row 1   ')
			}
			if (dailyWorkCommandInstance.dollarsCollected1 == null) {
				dailyWorkCommandInstance.errors.rejectValue('dollarsCollected1', 'Must enter Dollars Collected, if entering a Lead, Row 1   ')
			}
		}	
		
		//Row 2 Edits
		if ((dailyWorkCommandInstance.lead2 != "Pick a Name") &&
			(dailyWorkCommandInstance.leadHours2 == '00') &&
			(dailyWorkCommandInstance.leadMinutes2 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('lead2', 'Must Enter Hours or Minutes if Entering a Lead, Row 2   ')
		}
		
		if ((dailyWorkCommandInstance.lead2 == "Pick a Name") &&
			((dailyWorkCommandInstance.leadHours2 != '00') ||
			(dailyWorkCommandInstance.leadMinutes2 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('lead2', 'Must pick a Lead Name if Entering Hours or Minutes for Lead, Row 2   ')
		}
		
		if ((dailyWorkCommandInstance.helper2 != "None") &&
			(dailyWorkCommandInstance.helperHours2 == '00') &&
			(dailyWorkCommandInstance.helperMinutes2 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('helper2', 'Must Enter Hours or Minutes if Entering a Helper, Row 2   ')
		}
			
		if ((dailyWorkCommandInstance.helper2 == "None") &&
			((dailyWorkCommandInstance.helperHours2 != '00') ||
			(dailyWorkCommandInstance.helperMinutes2 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('helper2', 'Must pick a Helper Name if Entering Hours or Minutes for Helper, Row 2   ')
		}
		
		if (dailyWorkCommandInstance.lead2 != "Pick a Name") {
			if (dailyWorkCommandInstance.vanNumber2 == "Pick a Van") {
				dailyWorkCommandInstance.errors.rejectValue('vanNumber2', 'Must pick a Van, if entering a Lead, Row 2   ')
			}
			if (dailyWorkCommandInstance.milesDriven2 == null) {
				dailyWorkCommandInstance.errors.rejectValue('milesDriven2', 'Must enter Miles Driven, if entering a Lead, Row 2   ')
			}
			if (dailyWorkCommandInstance.hoursOnUnit2 == null) {
				dailyWorkCommandInstance.errors.rejectValue('hoursOnUnit2', 'Must enter Hours on Unit, if entering a Lead, Row 2   ')
			}
			if (dailyWorkCommandInstance.dollarsCollected2 == null) {
				dailyWorkCommandInstance.errors.rejectValue('dollarsCollected2', 'Must enter Dollars Collected, if entering a Lead, Row 2   ')
			}
		}
		
		//Row 3 Edits
		if ((dailyWorkCommandInstance.lead3 != "Pick a Name") &&
			(dailyWorkCommandInstance.leadHours3 == '00') &&
			(dailyWorkCommandInstance.leadMinutes3 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('lead3', 'Must Enter Hours or Minutes if Entering a Lead, Row 3   ')
		}
		
		if ((dailyWorkCommandInstance.lead3 == "Pick a Name") &&
			((dailyWorkCommandInstance.leadHours3 != '00') ||
			(dailyWorkCommandInstance.leadMinutes3 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('lead3', 'Must pick a Lead Name if Entering Hours or Minutes for Lead, Row 3   ')
		}
		
		if ((dailyWorkCommandInstance.helper3 != "None") &&
			(dailyWorkCommandInstance.helperHours3 == '00') &&
			(dailyWorkCommandInstance.helperMinutes3 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('helper3', 'Must Enter Hours or Minutes if Entering a Helper, Row 3   ')
		}
			
		if ((dailyWorkCommandInstance.helper3 == "None") &&
			((dailyWorkCommandInstance.helperHours3 != '00') ||
			(dailyWorkCommandInstance.helperMinutes3 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('helper3', 'Must pick a Helper Name if Entering Hours or Minutes for Helper, Row 3   ')
		}
		
		if (dailyWorkCommandInstance.lead3 != "Pick a Name") {
			if (dailyWorkCommandInstance.vanNumber3 == "Pick a Van") {
				dailyWorkCommandInstance.errors.rejectValue('vanNumber3', 'Must pick a Van, if entering a Lead, Row 3   ')
			}
			if (dailyWorkCommandInstance.milesDriven3 == null) {
				dailyWorkCommandInstance.errors.rejectValue('milesDriven3', 'Must enter Miles Driven, if entering a Lead, Row 3   ')
			}
			if (dailyWorkCommandInstance.hoursOnUnit3 == null) {
				dailyWorkCommandInstance.errors.rejectValue('hoursOnUnit3', 'Must enter Hours on Unit, if entering a Lead, Row 3   ')
			}
			if (dailyWorkCommandInstance.dollarsCollected3 == null) {
				dailyWorkCommandInstance.errors.rejectValue('dollarsCollected3', 'Must enter Dollars Collected, if entering a Lead, Row 3   ')
			}
		}
		
		//Row 4 Edits
		if ((dailyWorkCommandInstance.lead4 != "Pick a Name") &&
			(dailyWorkCommandInstance.leadHours4 == '00') &&
			(dailyWorkCommandInstance.leadMinutes4 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('lead4', 'Must Enter Hours or Minutes if Entering a Lead, Row 4   ')
		}
		
		if ((dailyWorkCommandInstance.lead4 == "Pick a Name") &&
			((dailyWorkCommandInstance.leadHours4 != '00') ||
			(dailyWorkCommandInstance.leadMinutes4 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('lead4', 'Must pick a Lead Name if Entering Hours or Minutes for Lead, Row 4   ')
		}
		
		if ((dailyWorkCommandInstance.helper4 != "None") &&
			(dailyWorkCommandInstance.helperHours4 == '00') &&
			(dailyWorkCommandInstance.helperMinutes4 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('helper4', 'Must Enter Hours or Minutes if Entering a Helper, Row 4   ')
		}
			
		if ((dailyWorkCommandInstance.helper4 == "None") &&
			((dailyWorkCommandInstance.helperHours4 != '00') ||
			(dailyWorkCommandInstance.helperMinutes4 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('helper4', 'Must pick a Helper Name if Entering Hours or Minutes for Helper, Row 4   ')
		}
		
		if (dailyWorkCommandInstance.lead4 != "Pick a Name") {
			if (dailyWorkCommandInstance.vanNumber4 == "Pick a Van") {
				dailyWorkCommandInstance.errors.rejectValue('vanNumber4', 'Must pick a Van, if entering a Lead, Row 4   ')
			}
			if (dailyWorkCommandInstance.milesDriven4 == null) {
				dailyWorkCommandInstance.errors.rejectValue('milesDriven4', 'Must enter Miles Driven, if entering a Lead, Row 4   ')
			}
			if (dailyWorkCommandInstance.hoursOnUnit4 == null) {
				dailyWorkCommandInstance.errors.rejectValue('hoursOnUnit4', 'Must enter Hours on Unit, if entering a Lead, Row 4   ')
			}
			if (dailyWorkCommandInstance.dollarsCollected4 == null) {
				dailyWorkCommandInstance.errors.rejectValue('dollarsCollected4', 'Must enter Dollars Collected, if entering a Lead, Row 4   ')
			}
		}
		
		//Row 5 Edits
		if ((dailyWorkCommandInstance.lead5 != "Pick a Name") &&
			(dailyWorkCommandInstance.leadHours5 == '00') &&
			(dailyWorkCommandInstance.leadMinutes5 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('lead5', 'Must Enter Hours or Minutes if Entering a Lead, Row 5   ')
		}
		
		if ((dailyWorkCommandInstance.lead5 == "Pick a Name") &&
			((dailyWorkCommandInstance.leadHours5 != '00') ||
			(dailyWorkCommandInstance.leadMinutes5 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('lead5', 'Must pick a Lead Name if Entering Hours or Minutes for Lead, Row 5   ')
		}
		
		if ((dailyWorkCommandInstance.helper5 != "None") &&
			(dailyWorkCommandInstance.helperHours5 == '00') &&
			(dailyWorkCommandInstance.helperMinutes5 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('helper5', 'Must Enter Hours or Minutes if Entering a Helper, Row 5   ')
		}
			
		if ((dailyWorkCommandInstance.helper5 == "None") &&
			((dailyWorkCommandInstance.helperHours5 != '00') ||
			(dailyWorkCommandInstance.helperMinutes5 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('helper5', 'Must pick a Helper Name if Entering Hours or Minutes for Helper, Row 5   ')
		}
		
		if (dailyWorkCommandInstance.lead5 != "Pick a Name") {
			if (dailyWorkCommandInstance.vanNumber5 == "Pick a Van") {
				dailyWorkCommandInstance.errors.rejectValue('vanNumber5', 'Must pick a Van, if entering a Lead, Row 5   ')
			}
			if (dailyWorkCommandInstance.milesDriven5 == null) {
				dailyWorkCommandInstance.errors.rejectValue('milesDriven5', 'Must enter Miles Driven, if entering a Lead, Row 5   ')
			}
			if (dailyWorkCommandInstance.hoursOnUnit5 == null) {
				dailyWorkCommandInstance.errors.rejectValue('hoursOnUnit5', 'Must enter Hours on Unit, if entering a Lead, Row 5   ')
			}
			if (dailyWorkCommandInstance.dollarsCollected5 == null) {
				dailyWorkCommandInstance.errors.rejectValue('dollarsCollected5', 'Must enter Dollars Collected, if entering a Lead, Row 5   ')
			}
		}
		
		//Row 6 Edits
		if ((dailyWorkCommandInstance.lead6 != "Pick a Name") &&
			(dailyWorkCommandInstance.leadHours6 == '00') &&
			(dailyWorkCommandInstance.leadMinutes6 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('lead6', 'Must Enter Hours or Minutes if Entering a Lead, Row 6   ')
		}
		
		if ((dailyWorkCommandInstance.lead6 == "Pick a Name") &&
			((dailyWorkCommandInstance.leadHours6 != '00') ||
			(dailyWorkCommandInstance.leadMinutes6 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('lead6', 'Must pick a Lead Name if Entering Hours or Minutes for Lead, Row 6   ')
		}
		
		if ((dailyWorkCommandInstance.helper6 != "None") &&
			(dailyWorkCommandInstance.helperHours6 == '00') &&
			(dailyWorkCommandInstance.helperMinutes6 == '00')) {
			dailyWorkCommandInstance.errors.rejectValue('helper6', 'Must Enter Hours or Minutes if Entering a Helper, Row 6   ')
		}
			
		if ((dailyWorkCommandInstance.helper6 == "None") &&
			((dailyWorkCommandInstance.helperHours6 != '00') ||
			(dailyWorkCommandInstance.helperMinutes6 != '00'))) {
			dailyWorkCommandInstance.errors.rejectValue('helper6', 'Must pick a Helper Name if Entering Hours or Minutes for Helper, Row 6   ')
		}
		
		if (dailyWorkCommandInstance.lead6 != "Pick a Name") {
			if (dailyWorkCommandInstance.vanNumber6 == "Pick a Van") {
				dailyWorkCommandInstance.errors.rejectValue('vanNumber6', 'Must pick a Van, if entering a Lead, Row 6   ')
			}
			if (dailyWorkCommandInstance.milesDriven6 == null) {
				dailyWorkCommandInstance.errors.rejectValue('milesDriven6', 'Must enter Miles Driven, if entering a Lead, Row 6   ')
			}
			if (dailyWorkCommandInstance.hoursOnUnit6 == null) {
				dailyWorkCommandInstance.errors.rejectValue('hoursOnUnit6', 'Must enter Hours on Unit, if entering a Lead, Row 6   ')
			}
			if (dailyWorkCommandInstance.dollarsCollected6 == null) {
				dailyWorkCommandInstance.errors.rejectValue('dollarsCollected6', 'Must enter Dollars Collected, if entering a Lead, Row 6   ')
			}
		}
		
		if (dailyWorkCommandInstance.hasErrors()) {
			respond dailyWorkCommandInstance.errors, view:'index'
			return
		}
		
		//Row 1 Save
		if (dailyWorkCommandInstance.lead1 != "Pick a Name") {
			def dailyWorkRecordInstance1 = new DailyWorkRecord(
												date: dailyWorkCommandInstance.date,
												lead: dailyWorkCommandInstance.lead1,
												leadHours: dailyWorkCommandInstance.leadHours1,
												leadMinutes: dailyWorkCommandInstance.leadMinutes1,
												helper: dailyWorkCommandInstance.helper1,
												helperHours: dailyWorkCommandInstance.helperHours1,
												helperMinutes: dailyWorkCommandInstance.helperMinutes1,
												vanNumber: dailyWorkCommandInstance.vanNumber1,
												milesDriven: dailyWorkCommandInstance.milesDriven1,
												hoursOnUnit: dailyWorkCommandInstance.hoursOnUnit1,
												dollarsCollected: dailyWorkCommandInstance.dollarsCollected1)
		
			def dailyWorkRecord1 = dailyWorkRecordInstance1.save(flush:true)
			if (dailyWorkRecord1 == null) {
				dailyWorkCommandInstance1.errors.reject(
				'Error saving the First Teams record',
				['', 'class DailyWorkRecord'] as Object[],
				'Error saving the First Teams record')
				respond dailyWorkCommandInstance1.errors, view:'index'
				return
			}
		}
		
		//Row 2 Save
		if (dailyWorkCommandInstance.lead2 != "Pick a Name") {
			def dailyWorkRecordInstance2 = new DailyWorkRecord(
												date: dailyWorkCommandInstance.date,
												lead: dailyWorkCommandInstance.lead2,
												leadHours: dailyWorkCommandInstance.leadHours2,
												leadMinutes: dailyWorkCommandInstance.leadMinutes2,
												helper: dailyWorkCommandInstance.helper2,
												helperHours: dailyWorkCommandInstance.helperHours2,
												helperMinutes: dailyWorkCommandInstance.helperMinutes2,
												vanNumber: dailyWorkCommandInstance.vanNumber2,
												milesDriven: dailyWorkCommandInstance.milesDriven2,
												hoursOnUnit: dailyWorkCommandInstance.hoursOnUnit2,
												dollarsCollected: dailyWorkCommandInstance.dollarsCollected2)
		
			def dailyWorkRecord2 = dailyWorkRecordInstance2.save(flush:true)
			if (dailyWorkRecord2 == null) {
				dailyWorkCommandInstance2.errors.reject(
				'Error saving the Second Teams record',
				['', 'class DailyWorkRecord'] as Object[],
				'Error saving the Second Teams record')
				respond dailyWorkCommandInstance2.errors, view:'index'
				return
			}
		}
		
		//Row 3 Save
		if (dailyWorkCommandInstance.lead3 != "Pick a Name") {
			def dailyWorkRecordInstance3 = new DailyWorkRecord(
												date: dailyWorkCommandInstance.date,
												lead: dailyWorkCommandInstance.lead3,
												leadHours: dailyWorkCommandInstance.leadHours3,
												leadMinutes: dailyWorkCommandInstance.leadMinutes3,
												helper: dailyWorkCommandInstance.helper3,
												helperHours: dailyWorkCommandInstance.helperHours3,
												helperMinutes: dailyWorkCommandInstance.helperMinutes3,
												vanNumber: dailyWorkCommandInstance.vanNumber3,
												milesDriven: dailyWorkCommandInstance.milesDriven3,
												hoursOnUnit: dailyWorkCommandInstance.hoursOnUnit3,
												dollarsCollected: dailyWorkCommandInstance.dollarsCollected3)
		
			def dailyWorkRecord3 = dailyWorkRecordInstance3.save(flush:true)
			if (dailyWorkRecord3 == null) {
				dailyWorkCommandInstance3.errors.reject(
				'Error saving the Third Teams record',
				['', 'class DailyWorkRecord'] as Object[],
				'Error saving the Third Teams record')
				respond dailyWorkCommandInstance3.errors, view:'index'
				return
			}
		}
		
		//Row 4 Save
		if (dailyWorkCommandInstance.lead4 != "Pick a Name") {
			def dailyWorkRecordInstance4 = new DailyWorkRecord(
												date: dailyWorkCommandInstance.date,
												lead: dailyWorkCommandInstance.lead4,
												leadHours: dailyWorkCommandInstance.leadHours4,
												leadMinutes: dailyWorkCommandInstance.leadMinutes4,
												helper: dailyWorkCommandInstance.helper4,
												helperHours: dailyWorkCommandInstance.helperHours4,
												helperMinutes: dailyWorkCommandInstance.helperMinutes4,
												vanNumber: dailyWorkCommandInstance.vanNumber4,
												milesDriven: dailyWorkCommandInstance.milesDriven4,
												hoursOnUnit: dailyWorkCommandInstance.hoursOnUnit4,
												dollarsCollected: dailyWorkCommandInstance.dollarsCollected4)
		
			def dailyWorkRecord4 = dailyWorkRecordInstance4.save(flush:true)
			if (dailyWorkRecord4 == null) {
				dailyWorkCommandInstance4.errors.reject(
				'Error saving the Fourth Teams record',
				['', 'class DailyWorkRecord'] as Object[],
				'Error saving the Fourth Teams record')
				respond dailyWorkCommandInstance4.errors, view:'index'
				return
			}
		}
		
		//Row 5 Save
		if (dailyWorkCommandInstance.lead5 != "Pick a Name") {
			def dailyWorkRecordInstance5 = new DailyWorkRecord(
												date: dailyWorkCommandInstance.date,
												lead: dailyWorkCommandInstance.lead5,
												leadHours: dailyWorkCommandInstance.leadHours5,
												leadMinutes: dailyWorkCommandInstance.leadMinutes5,
												helper: dailyWorkCommandInstance.helper5,
												helperHours: dailyWorkCommandInstance.helperHours5,
												helperMinutes: dailyWorkCommandInstance.helperMinutes5,
												vanNumber: dailyWorkCommandInstance.vanNumber5,
												milesDriven: dailyWorkCommandInstance.milesDriven5,
												hoursOnUnit: dailyWorkCommandInstance.hoursOnUnit5,
												dollarsCollected: dailyWorkCommandInstance.dollarsCollected5)
		
			def dailyWorkRecord5 = dailyWorkRecordInstance5.save(flush:true)
			if (dailyWorkRecord5 == null) {
				dailyWorkCommandInstance5.errors.reject(
				'Error saving the Fifth Teams record',
				['', 'class DailyWorkRecord'] as Object[],
				'Error saving the Fifth Teams record')
				respond dailyWorkCommandInstance5.errors, view:'index'
				return
			}
		}
		
		//Row 6 Save
		if (dailyWorkCommandInstance.lead6 != "Pick a Name") {
			def dailyWorkRecordInstance6 = new DailyWorkRecord(
												date: dailyWorkCommandInstance.date,
												lead: dailyWorkCommandInstance.lead6,
												leadHours: dailyWorkCommandInstance.leadHours6,
												leadMinutes: dailyWorkCommandInstance.leadMinutes6,
												helper: dailyWorkCommandInstance.helper6,
												helperHours: dailyWorkCommandInstance.helperHours6,
												helperMinutes: dailyWorkCommandInstance.helperMinutes6,
												vanNumber: dailyWorkCommandInstance.vanNumber6,
												milesDriven: dailyWorkCommandInstance.milesDriven6,
												hoursOnUnit: dailyWorkCommandInstance.hoursOnUnit6,
												dollarsCollected: dailyWorkCommandInstance.dollarsCollected6)
		
			def dailyWorkRecord6 = dailyWorkRecordInstance6.save(flush:true)
			if (dailyWorkRecord6 == null) {
				dailyWorkCommandInstance6.errors.reject(
				'Error saving the Sixth Teams record',
				['', 'class DailyWorkRecord'] as Object[],
				'Error saving the Sixth Teams record')
				respond dailyWorkCommandInstance6.errors, view:'index'
				return
			}
		}
		
		redirect action: "showWork", controller: "dailyWork"
	}
}
