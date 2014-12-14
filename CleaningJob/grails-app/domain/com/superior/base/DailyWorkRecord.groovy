package com.superior.base

import java.util.Date;

class DailyWorkRecord {

	Date date
	String lead
	int leadHours
	int leadMinutes
	String helper
	int helperHours
	int helperMinutes
	String vanNumber
	BigDecimal milesDriven
	BigDecimal hoursOnUnit
	BigDecimal dollarsCollected
	
    static constraints = {
		date(blank:false)
		lead(blank:false)
		leadHours(blank:false)
		leadMinutes(blank:false)
		helper(nullable:true)
		helperHours(blank:false)
		helperMinutes(blank:false)
		vanNumber(blank:false)
		milesDriven(nullable:false, scale: 1, min: 0.0)
		hoursOnUnit(nullable:false, scale: 1, min: 0.0)
		dollarsCollected(nullable:false, scale: 2, min: 0.00)
    }
}
