package com.superior.extractionjob

import java.util.Date;

import grails.validation.Validateable;

@Validateable
class ExtractionJobCommand {

	Date date
	String date_day
	String date_year
	String date_month
	String lead
	String helper
	Date startTime
	String startHour
	String startMinute
	String startAmPm
	Date endTime
	String endHour
	String endMinute
	String endAmPm
	Long customerId
	String firstName
	String lastName
	String addressLineOne
	String addressLineTwo
	String fanId01
	String fanVisible01
	String fanId02
	String fanVisible02
	String fanId03
	String fanVisible03
	String fanId04
	String fanVisible04
	String fanId05
	String fanVisible05
	String fanId06
	String fanVisible06
	String fanId07
	String fanVisible07
	String fanId08
	String fanVisible08
	String fanId09
	String fanVisible09
	String fanId10
	String fanVisible10
	String fanId11
	String fanVisible11
	String fanId12
	String fanVisible12
	String dehuId01
	String dehuVisible01
	String dehuId02
	String dehuVisible02
	String dehuId03
	String dehuVisible03
	String dehuId04
	String dehuVisible04
	String dehuId05
	String dehuVisible05
	String dehuId06
	String dehuVisible06
	String dehuId07
	String dehuVisible07
	String dehuId08
	String dehuVisible08
	String dehuId09
	String dehuVisible09
	String dehuId10
	String dehuVisible10
	String dehuId11
	String dehuVisible11
	String dehuId12
	String dehuVisible12
	
	static constraints = {
		date(blank:false)
		lead(blank:false)
		helper(nullable:true)
		startTime(nullable:true)
		startHour(blank:false)
		startMinute(blank:false)
		startAmPm(blank:false)
		endTime(nullable:true)
		endHour(blank:false)
		endMinute(blank:false)
		endAmPm(blank:false)
		customerId(blank:false)
		firstName(nullable:true)
		lastName(nullable:true)
		addressLineOne(nullable:true)
		addressLineTwo(nullable:true)
		fanId01(nullable:true)
		fanVisible01(nullable:true)
		fanId02(nullable:true)
		fanVisible02(nullable:true)
		fanId03(nullable:true)
		fanVisible03(nullable:true)
		fanId04(nullable:true)
		fanVisible04(nullable:true)
		fanId05(nullable:true)
		fanVisible05(nullable:true)
		fanId06(nullable:true)
		fanVisible06(nullable:true)
		fanId07(nullable:true)
		fanVisible07(nullable:true)
		fanId08(nullable:true)
		fanVisible08(nullable:true)
		fanId09(nullable:true)
		fanVisible09(nullable:true)
		fanId10(nullable:true)
		fanVisible10(nullable:true)
		fanId11(nullable:true)
		fanVisible11(nullable:true)
		fanId12(nullable:true)
		fanVisible12(nullable:true)
		dehuId01(nullable:true)
		dehuVisible01(nullable:true)
		dehuId02(nullable:true)
		dehuVisible02(nullable:true)
		dehuId03(nullable:true)
		dehuVisible03(nullable:true)
		dehuId04(nullable:true)
		dehuVisible04(nullable:true)
		dehuId05(nullable:true)
		dehuVisible05(nullable:true)
		dehuId06(nullable:true)
		dehuVisible06(nullable:true)
		dehuId07(nullable:true)
		dehuVisible07(nullable:true)
		dehuId08(nullable:true)
		dehuVisible08(nullable:true)
		dehuId09(nullable:true)
		dehuVisible09(nullable:true)
		dehuId10(nullable:true)
		dehuVisible10(nullable:true)
		dehuId11(nullable:true)
		dehuVisible11(nullable:true)
		dehuId12(nullable:true)
		dehuVisible12(nullable:true)
	}
	
	String toString() {
		"Exraction Job"
	}
}
