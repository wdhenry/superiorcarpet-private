package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom011Trait extends AdditionalRoom011TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName011
	BigDecimal squareFootage011
	BigDecimal roomCharge011
	String _preVacCheck011
	BigDecimal preVacCharge011
	
	static constraints = {
		roomName011(nullable:true)
		roomCharge011(nullable:true, scale: 2, min: 0.00)
		squareFootage011(nullable:true, scale: 1, min: 0.0)
		_preVacCheck011(nullable:true)
		preVacCharge011(nullable:true, scale: 2, min: 0.00)
	}
}
