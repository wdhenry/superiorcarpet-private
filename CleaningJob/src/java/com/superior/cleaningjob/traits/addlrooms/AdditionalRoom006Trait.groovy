package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom006Trait extends AdditionalRoom006TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName006
	BigDecimal squareFootage006
	BigDecimal roomCharge006
	String _preVacCheck006
	BigDecimal preVacCharge006
	
	static constraints = {
		roomName006(nullable:true)
		roomCharge006(nullable:true, scale: 2, min: 0.00)
		squareFootage006(nullable:true, scale: 1, min: 0.0)
		_preVacCheck006(nullable:true)
		preVacCharge006(nullable:true, scale: 2, min: 0.00)
	}
}
