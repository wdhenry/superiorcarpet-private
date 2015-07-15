package com.superior.cleaningjob.traits.misccharges

trait MiscCharges4Trait {

	String miscChargesName4
	BigDecimal miscCharge4
	String miscVisible4

	static constraints = {
		miscChargesName4(nullable:true)
		miscCharge4(nullable:true, scale: 2, min: 0.00)
		miscVisible4(nullable:true)
	}
}
