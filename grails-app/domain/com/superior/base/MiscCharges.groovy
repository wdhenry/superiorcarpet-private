package com.superior.base

class MiscCharges {

    Long jobId
	String miscDescription
	BigDecimal miscCharge
	 
    static constraints = {
		jobId(blank:false)
		miscDescription(blank:false)
		miscCharge(nullable:false, scale: 2, min: 0.01)
    }
}
