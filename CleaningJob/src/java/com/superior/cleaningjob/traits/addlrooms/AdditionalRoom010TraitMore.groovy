package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom010TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck010
	BigDecimal protectorCharge010
	String _moveFurnitureCheck010
	BigDecimal moveFurnitureCharge010
	String visible010
	
	static constraints = {
		_protectorCheck010(nullable:true)
		protectorCharge010(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck010(nullable:true)
		moveFurnitureCharge010(nullable:true, scale: 2, min: 0.00)
		visible010(nullable:true)
	}
}
