package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom004Trait extends AdditionalRoom004TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName004
	BigDecimal squareFootage004
	BigDecimal roomCharge004
	String _preVacCheck004
	BigDecimal preVacCharge004
	
	static constraints = {
		roomName004(nullable:true)
		roomCharge004(nullable:true, scale: 2, min: 0.00)
		squareFootage004(nullable:true, scale: 1, min: 0.0)
		_preVacCheck004(nullable:true)
		preVacCharge004(nullable:true, scale: 2, min: 0.00)
	}
}
