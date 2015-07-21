package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom006TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck006
	BigDecimal protectorCharge006
	String _moveFurnitureCheck006
	BigDecimal moveFurnitureCharge006
	String visible006
	
	static constraints = {
		_protectorCheck006(nullable:true)
		protectorCharge006(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck006(nullable:true)
		moveFurnitureCharge006(nullable:true, scale: 2, min: 0.00)
		visible006(nullable:true)
	}
}
