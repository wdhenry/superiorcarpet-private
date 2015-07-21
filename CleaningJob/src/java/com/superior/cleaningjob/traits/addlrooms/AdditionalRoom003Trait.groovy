package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom003Trait extends AdditionalRoom003TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName003
	BigDecimal squareFootage003
	BigDecimal roomCharge003
	String _preVacCheck003
	BigDecimal preVacCharge003
	
	static constraints = {
		roomName003(nullable:true)
		roomCharge003(nullable:true, scale: 2, min: 0.00)
		squareFootage003(nullable:true, scale: 1, min: 0.0)
		_preVacCheck003(nullable:true)
		preVacCharge003(nullable:true, scale: 2, min: 0.00)
	}
}
