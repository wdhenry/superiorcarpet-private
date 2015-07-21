package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom001Trait extends AdditionalRoom001TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName001
	BigDecimal squareFootage001
	BigDecimal roomCharge001
	String _preVacCheck001
	BigDecimal preVacCharge001
	
	static constraints = {
		roomName001(nullable:true)
		roomCharge001(nullable:true, scale: 2, min: 0.00)
		squareFootage001(nullable:true, scale: 1, min: 0.0)
		_preVacCheck001(nullable:true)
		preVacCharge001(nullable:true, scale: 2, min: 0.00)
	}
}
