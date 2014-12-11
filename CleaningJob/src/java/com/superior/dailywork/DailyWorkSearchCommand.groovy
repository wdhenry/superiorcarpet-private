package com.superior.dailywork

import grails.validation.Validateable;

@Validateable
class DailyWorkSearchCommand {

	String lead
	Date leadLowDate
	Date leadHighDate
	String helper
	Date helperLowDate
	Date helperHighDate
	Date lowDate
	Date highDate
	
	static constraints = {
		lead(nullable:true)
		leadLowDate(blank:false)
		leadHighDate(blank:false)
		helper(nullable:true)
		helperLowDate(blank:false)
		helperHighDate(blank:false)
		lowDate(blank:false)
		highDate(blank:false)
	}
}
