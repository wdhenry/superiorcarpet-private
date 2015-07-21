package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom007TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck007
	BigDecimal protectorCharge007
	String _moveFurnitureCheck007
	BigDecimal moveFurnitureCharge007
	String visible007
	
	static constraints = {
		_protectorCheck007(nullable:true)
		protectorCharge007(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck007(nullable:true)
		moveFurnitureCharge007(nullable:true, scale: 2, min: 0.00)
		visible007(nullable:true)
	}
}
