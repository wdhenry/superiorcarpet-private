package com.superior.base

class Rates {

	String rateName
	BigDecimal rateCharge
	
	static constraints = {
		rateName(blank:false)
		rateCharge(nullable:true, scale: 2, min: 0.00)
	}
}
