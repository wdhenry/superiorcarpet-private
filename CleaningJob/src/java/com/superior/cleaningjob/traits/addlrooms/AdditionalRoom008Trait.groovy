package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom008Trait extends AdditionalRoom008TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName008
	BigDecimal squareFootage008
	BigDecimal roomCharge008
	String _preVacCheck008
	BigDecimal preVacCharge008
	
	static constraints = {
		roomName008(nullable:true)
		roomCharge008(nullable:true, scale: 2, min: 0.00)
		squareFootage008(nullable:true, scale: 1, min: 0.0)
		_preVacCheck008(nullable:true)
		preVacCharge008(nullable:true, scale: 2, min: 0.00)
	}
}
