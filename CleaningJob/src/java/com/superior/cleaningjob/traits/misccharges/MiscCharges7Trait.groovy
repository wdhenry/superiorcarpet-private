package com.superior.cleaningjob.traits.misccharges

trait MiscCharges7Trait {

	String miscChargesName7
	BigDecimal miscCharge7
	String miscVisible7

	static constraints = {
		miscChargesName7(nullable:true)
		miscCharge7(nullable:true, scale: 2, min: 0.00)
		miscVisible7(nullable:true)
	}
}
