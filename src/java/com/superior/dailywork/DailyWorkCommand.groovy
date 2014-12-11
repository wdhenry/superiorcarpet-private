package com.superior.dailywork

import grails.validation.Validateable;

import java.util.Date;

@Validateable
class DailyWorkCommand {

	Date date
	
	String lead1
	String leadHours1
	String leadMinutes1
	String helper1
	String helperHours1
	String helperMinutes1
	String vanNumber1
	BigDecimal milesDriven1
	BigDecimal hoursOnUnit1
	BigDecimal dollarsCollected1
	
	String lead2
	String leadHours2
	String leadMinutes2
	String helper2
	String helperHours2
	String helperMinutes2
	String vanNumber2
	BigDecimal milesDriven2
	BigDecimal hoursOnUnit2
	BigDecimal dollarsCollected2
	
	String lead3
	String leadHours3
	String leadMinutes3
	String helper3
	String helperHours3
	String helperMinutes3
	String vanNumber3
	BigDecimal milesDriven3
	BigDecimal hoursOnUnit3
	BigDecimal dollarsCollected3
	
	String lead4
	String leadHours4
	String leadMinutes4
	String helper4
	String helperHours4
	String helperMinutes4
	String vanNumber4
	BigDecimal milesDriven4
	BigDecimal hoursOnUnit4
	BigDecimal dollarsCollected4
	
	String lead5
	String leadHours5
	String leadMinutes5
	String helper5
	String helperHours5
	String helperMinutes5
	String vanNumber5
	BigDecimal milesDriven5
	BigDecimal hoursOnUnit5
	BigDecimal dollarsCollected5
	
	String lead6
	String leadHours6
	String leadMinutes6
	String helper6
	String helperHours6
	String helperMinutes6
	String vanNumber6
	BigDecimal milesDriven6
	BigDecimal hoursOnUnit6
	BigDecimal dollarsCollected6
		
	static constraints = {
		date(blank:false)
		lead1(blank:false)
		leadHours1(blank:false)
		leadMinutes1(blank:false)
		helper1(nullable:true)
		helperHours1(blank:false)
		helperMinutes1(blank:false)
		vanNumber1(blank:false)
		milesDriven1(nullable:false, scale: 1, min: 0.0)
		hoursOnUnit1(nullable:false, scale: 1, min: 0.0)
		dollarsCollected1(nullable:false, scale: 2, min: 0.00)
		lead2(nullable:true)
		leadHours2(nullable:true)
		leadMinutes2(nullable:true)
		helper2(nullable:true)
		helperHours2(nullable:true)
		helperMinutes2(nullable:true)
		vanNumber2(nullable:true)
		milesDriven2(nullable:true, scale: 1, min: 0.0)
		hoursOnUnit2(nullable:true, scale: 1, min: 0.0)
		dollarsCollected2(nullable:true, scale: 2, min: 0.00)
		lead3(nullable:true)
		leadHours3(nullable:true)
		leadMinutes3(nullable:true)
		helper3(nullable:true)
		helperHours3(nullable:true)
		helperMinutes3(nullable:true)
		vanNumber3(nullable:true)
		milesDriven3(nullable:true, scale: 1, min: 0.0)
		hoursOnUnit3(nullable:true, scale: 1, min: 0.0)
		dollarsCollected3(nullable:true, scale: 2, min: 0.00)
		lead4(nullable:true)
		leadHours4(nullable:true)
		leadMinutes4(nullable:true)
		helper4(nullable:true)
		helperHours4(nullable:true)
		helperMinutes4(nullable:true)
		vanNumber4(nullable:true)
		milesDriven4(nullable:true, scale: 1, min: 0.0)
		hoursOnUnit4(nullable:true, scale: 1, min: 0.0)
		dollarsCollected4(nullable:true, scale: 2, min: 0.00)
		lead5(nullable:true)
		leadHours5(nullable:true)
		leadMinutes5(nullable:true)
		helper5(nullable:true)
		helperHours5(nullable:true)
		helperMinutes5(nullable:true)
		vanNumber5(nullable:true)
		milesDriven5(nullable:true, scale: 1, min: 0.0)
		hoursOnUnit5(nullable:true, scale: 1, min: 0.0)
		dollarsCollected5(nullable:true, scale: 2, min: 0.00)
		lead6(nullable:true)
		leadHours6(nullable:true)
		leadMinutes6(nullable:true)
		helper6(nullable:true)
		helperHours6(nullable:true)
		helperMinutes6(nullable:true)
		vanNumber6(nullable:true)
		milesDriven6(nullable:true, scale: 1, min: 0.0)
		hoursOnUnit6(nullable:true, scale: 1, min: 0.0)
		dollarsCollected6(nullable:true, scale: 2, min: 0.00)
	}
}
