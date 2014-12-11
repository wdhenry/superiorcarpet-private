package com.superior.base

class Stair {

    Long jobId
	String stairDirection
	double stairCount
	BigDecimal stairCharge
	 
    static constraints = {
		jobId(blank:false)
		stairDirection(blank:false)
		stairCount(blank:false)
		stairCharge(nullable:false, scale: 2, min: 0.01)
    }
}
