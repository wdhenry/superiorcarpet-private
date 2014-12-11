package com.superior.base

import java.text.SimpleDateFormat
import java.util.Date;

class WaterExtractionJob {

    Date date
	String lead
	String helper
	Long customerId
	Date startTime
	Date endTime
	
    static constraints = {
		customerId(blank:false)
		date(blank:false)
		lead(blank:false)
		helper(nullable:true)
		startTime(blank:false)
		endTime(blank:false)
    }
	
	String toString() {
		"Water Extraction Job " + id + " on " + date
	}
	
}
