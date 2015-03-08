package com.superior.base

class MiscChargesName {

    String miscChargesName
	BigDecimal miscChargeRate
	
    static constraints = {
		miscChargesName(nullable: false)
		miscChargeRate(nullable:true, scale: 2, min: 0.00)
    }
}
