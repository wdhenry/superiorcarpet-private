package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom003TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck003
	BigDecimal protectorCharge003
	String _moveFurnitureCheck003
	BigDecimal moveFurnitureCharge003
	String visible003
	
	static constraints = {
		_protectorCheck003(nullable:true)
		protectorCharge003(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck003(nullable:true)
		moveFurnitureCharge003(nullable:true, scale: 2, min: 0.00)
		visible003(nullable:true)
	}
}
