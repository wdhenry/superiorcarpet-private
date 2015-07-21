package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom007Trait extends AdditionalRoom007TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String roomName007
	BigDecimal squareFootage007
	BigDecimal roomCharge007
	String _preVacCheck007
	BigDecimal preVacCharge007
	
	static constraints = {
		roomName007(nullable:true)
		roomCharge007(nullable:true, scale: 2, min: 0.00)
		squareFootage007(nullable:true, scale: 1, min: 0.0)
		_preVacCheck007(nullable:true)
		preVacCharge007(nullable:true, scale: 2, min: 0.00)
	}
}
