package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom002Trait extends AdditionalRoom002TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName002
	BigDecimal squareFootage002
	BigDecimal roomCharge002
	String _preVacCheck002
	BigDecimal preVacCharge002
	
	static constraints = {
		roomName002(nullable:true)
		roomCharge002(nullable:true, scale: 2, min: 0.00)
		squareFootage002(nullable:true, scale: 1, min: 0.0)
		_preVacCheck002(nullable:true)
		preVacCharge002(nullable:true, scale: 2, min: 0.00)
		_protectorCheck002(nullable:true)
	}
}
