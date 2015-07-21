package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom009Trait extends AdditionalRoom009TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName009
	BigDecimal squareFootage009
	BigDecimal roomCharge009
	String _preVacCheck009
	BigDecimal preVacCharge009
	
	static constraints = {
		roomName009(nullable:true)
		roomCharge009(nullable:true, scale: 2, min: 0.00)
		squareFootage009(nullable:true, scale: 1, min: 0.0)
		_preVacCheck009(nullable:true)
		preVacCharge009(nullable:true, scale: 2, min: 0.00)
	}
}
