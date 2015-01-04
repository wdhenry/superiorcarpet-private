package com.superior.base

import java.util.Date;

class Fans {

	String idNumber
	String serialNumber
	String model
	Long jobId
	Date dateOut
	Date dateIn
	boolean isIn
	String leadOut
	String helperOut
	String leadIn
	String helperIn
	
	static transients = [ 'displayValue' ]
	
	public String getDisplayValue() {
			return "$idNumber - $model - $serialNumber"
	}
	
    static constraints = {
		idNumber(blank:false)
		serialNumber(blank:false)
		model(blank:false)
		isIn(blank:false)
		jobId(blank:true, nullable:true)
		dateOut(blank:true, nullable:true)
		dateIn(blank:true, nullable:true)
		leadOut(blank:true, nullable:true)
		helperOut(blank:true, nullable:true)
		leadIn(blank:true, nullable:true)
		helperIn(blank:true, nullable:true)
    }
}
