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
	String startHour
	String startMinute
	String startAmPm
	String endHour
	String endMinute
	String endAmPm
	Long customerId
	String firstName
	String lastName
	String fanId1
	String fanId2
	String fanId3
	String fanId4
	String dehuId1
	String dehuId2
	String dehuId3
	String dehuId4
	
	static constraints = {
		date(blank:false)
		lead(blank:false)
		helper(nullable:true)
		startHour(blank:false)
		startMinute(blank:false)
		startAmPm(blank:false)
		endHour(blank:false)
		endMinute(blank:false)
		endAmPm(blank:false)
		customerId(blank:false)
		firstName(nullable:true)
		lastName(nullable:true)
		fanId1(nullable:true)
		fanId2(nullable:true)
		fanId3(nullable:true)
		fanId4(nullable:true)
		dehuId1(nullable:true)
		dehuId2(nullable:true)
		dehuId3(nullable:true)
		dehuId4(nullable:true)
		
	}
	
	String toString() {
		"Exraction Job"
	}
}
