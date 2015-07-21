package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom008TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck008
	BigDecimal protectorCharge008
	String _moveFurnitureCheck008
	BigDecimal moveFurnitureCharge008
	String visible008
	
	static constraints = {
		_protectorCheck008(nullable:true)
		protectorCharge008(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck008(nullable:true)
		moveFurnitureCharge008(nullable:true, scale: 2, min: 0.00)
		visible008(nullable:true)
	}
}
