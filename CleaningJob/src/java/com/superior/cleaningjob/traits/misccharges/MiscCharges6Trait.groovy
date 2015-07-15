package com.superior.cleaningjob.traits.misccharges

trait MiscCharges6Trait {

	String miscChargesName6
	BigDecimal miscCharge6
	String miscVisible6

	static constraints = {
		miscChargesName6(nullable:true)
		miscCharge6(nullable:true, scale: 2, min: 0.00)
		miscVisible6(nullable:true)
	}
}
