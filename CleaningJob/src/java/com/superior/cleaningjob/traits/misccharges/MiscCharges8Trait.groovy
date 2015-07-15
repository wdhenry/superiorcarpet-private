package com.superior.cleaningjob.traits.misccharges

trait MiscCharges8Trait {

	String miscChargesName8
	BigDecimal miscCharge8
	String miscVisible8

	static constraints = {
		miscChargesName8(nullable:true)
		miscCharge8(nullable:true, scale: 2, min: 0.00)
		miscVisible8(nullable:true)
	}
}
