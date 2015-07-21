package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom005TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck005
	BigDecimal protectorCharge005
	String _moveFurnitureCheck005
	BigDecimal moveFurnitureCharge005
	String visible005
	
	static constraints = {
		_protectorCheck005(nullable:true)
		protectorCharge005(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck005(nullable:true)
		moveFurnitureCharge005(nullable:true, scale: 2, min: 0.00)
		visible005(nullable:true)
	}
}
