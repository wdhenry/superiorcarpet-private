package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom005Trait extends AdditionalRoom005TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName005
	BigDecimal squareFootage005
	BigDecimal roomCharge005
	String _preVacCheck005
	BigDecimal preVacCharge005
	
	static constraints = {
		roomName005(nullable:true)
		roomCharge005(nullable:true, scale: 2, min: 0.00)
		squareFootage005(nullable:true, scale: 1, min: 0.0)
		_preVacCheck005(nullable:true)
		preVacCharge005(nullable:true, scale: 2, min: 0.00)
	}
}
