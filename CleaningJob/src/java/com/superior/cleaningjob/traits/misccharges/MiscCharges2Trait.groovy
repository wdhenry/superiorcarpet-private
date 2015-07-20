package com.superior.cleaningjob.traits.misccharges

trait MiscCharges2Trait {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String miscChargesName2
	BigDecimal miscCharge2
	String miscVisible2

	static constraints = {
		miscChargesName2(nullable:true)
		miscCharge2(nullable:true, scale: 2, min: 0.00)
		miscVisible2(nullable:true)
	}
}
