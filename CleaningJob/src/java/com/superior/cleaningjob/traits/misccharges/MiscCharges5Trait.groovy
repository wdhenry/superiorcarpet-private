package com.superior.cleaningjob.traits.misccharges

trait MiscCharges5Trait {

	String miscChargesName5
	BigDecimal miscCharge5
	String miscVisible5

	static constraints = {
		miscChargesName5(nullable:true)
		miscCharge5(nullable:true, scale: 2, min: 0.00)
		miscVisible5(nullable:true)
	}
}
