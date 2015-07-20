package com.superior.cleaningjob.traits.misccharges

trait MiscCharges4Trait {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String miscChargesName4
	BigDecimal miscCharge4
	String miscVisible4

	static constraints = {
		miscChargesName4(nullable:true)
		miscCharge4(nullable:true, scale: 2, min: 0.00)
		miscVisible4(nullable:true)
	}
}
