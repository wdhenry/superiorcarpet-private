package com.superior.cleaningjob.traits.misccharges

trait MiscCharges3Trait {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String miscChargesName3
	BigDecimal miscCharge3
	String miscVisible3

	static constraints = {
		miscChargesName3(nullable:true)
		miscCharge3(nullable:true, scale: 2, min: 0.00)
		miscVisible3(nullable:true)
	}
}
