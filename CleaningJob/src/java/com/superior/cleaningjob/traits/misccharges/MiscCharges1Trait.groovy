package com.superior.cleaningjob.traits.misccharges

trait MiscCharges1Trait {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String miscChargesName1
	BigDecimal miscCharge1
	String miscVisible1

	static constraints = {
		miscChargesName1(nullable:true)
		miscCharge1(nullable:true, scale: 2, min: 0.00)
		miscVisible1(nullable:true)
	}
}
