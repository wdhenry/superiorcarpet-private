package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom010Trait extends AdditionalRoom010TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName010
	BigDecimal squareFootage010
	BigDecimal roomCharge010
	String _preVacCheck010
	BigDecimal preVacCharge010
	
	static constraints = {
		roomName010(nullable:true)
		roomCharge010(nullable:true, scale: 2, min: 0.00)
		squareFootage010(nullable:true, scale: 1, min: 0.0)
		_preVacCheck010(nullable:true)
		preVacCharge010(nullable:true, scale: 2, min: 0.00)
	}
}
