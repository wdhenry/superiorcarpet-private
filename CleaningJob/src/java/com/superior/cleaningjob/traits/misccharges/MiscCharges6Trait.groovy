package com.superior.cleaningjob.traits.misccharges

trait MiscCharges6Trait {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String miscChargesName6
	BigDecimal miscCharge6
	String miscVisible6

	static constraints = {
		miscChargesName6(nullable:true)
		miscCharge6(nullable:true, scale: 2, min: 0.00)
		miscVisible6(nullable:true)
	}
}
