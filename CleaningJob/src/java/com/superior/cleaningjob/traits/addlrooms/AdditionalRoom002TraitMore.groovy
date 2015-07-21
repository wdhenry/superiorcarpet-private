package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom002TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck002
	BigDecimal protectorCharge002
	String _moveFurnitureCheck002
	BigDecimal moveFurnitureCharge002
	String visible002
	
	static constraints = {
		_protectorCheck002(nullable:true)
		protectorCharge002(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck002(nullable:true)
		moveFurnitureCharge002(nullable:true, scale: 2, min: 0.00)
		visible002(nullable:true)
	}
}
