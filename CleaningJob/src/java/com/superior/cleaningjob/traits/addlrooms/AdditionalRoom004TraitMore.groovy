package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom004TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck004
	BigDecimal protectorCharge004
	String _moveFurnitureCheck004
	BigDecimal moveFurnitureCharge004
	String visible004
	
	static constraints = {
		_protectorCheck004(nullable:true)
		protectorCharge004(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck004(nullable:true)
		moveFurnitureCharge004(nullable:true, scale: 2, min: 0.00)
		visible004(nullable:true)
	}
}
