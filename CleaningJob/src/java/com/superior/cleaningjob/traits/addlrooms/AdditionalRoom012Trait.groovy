package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom012Trait extends AdditionalRoom012TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName012
	BigDecimal squareFootage012
	BigDecimal roomCharge012
	String _preVacCheck012
	BigDecimal preVacCharge012
	
	static constraints = {
		roomName012(nullable:true)
		roomCharge012(nullable:true, scale: 2, min: 0.00)
		squareFootage012(nullable:true, scale: 1, min: 0.0)
		_preVacCheck012(nullable:true)
		preVacCharge012(nullable:true, scale: 2, min: 0.00)
	}
}
