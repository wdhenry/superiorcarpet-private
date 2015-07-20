package com.superior.cleaningjob.traits.misccharges

trait MiscCharges7Trait {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String miscChargesName7
	BigDecimal miscCharge7
	String miscVisible7

	static constraints = {
		miscChargesName7(nullable:true)
		miscCharge7(nullable:true, scale: 2, min: 0.00)
		miscVisible7(nullable:true)
	}
}
