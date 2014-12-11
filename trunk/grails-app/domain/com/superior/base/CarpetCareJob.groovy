package com.superior.base

class CarpetCareJob {

    Date date
	String lead
	String helper
	Long customerId
	String groupName
	BigDecimal groupRate
	String comment
	
    static constraints = {
		customerId(blank:false)
		date(blank:false)
		lead(blank:false)
		helper(nullable:true)
		groupName(nullable:true)
		groupRate(nullable:true, scale: 2, min: 0.00)
		comment(nullable:true)
    }
	
	String toString() {
		"Carpet Care Job " + id + " on " + date
	}
}
