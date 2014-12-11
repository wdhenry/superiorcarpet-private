package com.superior.dehureturn

import grails.validation.Validateable;

import java.util.Date;

@Validateable
class DehumidifiersCommand {

	Long dehuId
	String idNumber
	String serialNumber
	String model
	BigDecimal hours
	Long jobId
	Date dateOut
	Date dateIn
	boolean isIn
	String leadOut
	String helperOut
	String leadIn
	String helperIn
	
	static constraints = {
		idNumber(blank:true, nullable:true)
		serialNumber(blank:true, nullable:true)
		model(blank:true, nullable:true)
		isIn(blank:true, nullable:true)
		hours(nullable:true, scale: 1, min: 0.0)
		jobId(blank:true, nullable:true)
		dateOut(blank:true, nullable:true)
		dateIn(blank:true, nullable:true)
		leadOut(blank:true, nullable:true)
		helperOut(blank:true, nullable:true)
		leadIn(blank:true, nullable:true)
		helperIn(blank:true, nullable:true)
	}
}
