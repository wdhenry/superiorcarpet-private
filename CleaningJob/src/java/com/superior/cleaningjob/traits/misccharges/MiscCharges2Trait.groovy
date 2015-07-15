package com.superior.cleaningjob.traits.misccharges

trait MiscCharges2Trait {

	String miscChargesName2
	BigDecimal miscCharge2
	String miscVisible2

	static constraints = {
		miscChargesName2(nullable:true)
		miscCharge2(nullable:true, scale: 2, min: 0.00)
		miscVisible2(nullable:true)
	}
}
