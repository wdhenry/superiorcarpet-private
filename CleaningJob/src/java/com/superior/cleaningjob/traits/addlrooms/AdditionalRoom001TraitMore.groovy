package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom001TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck001
	BigDecimal protectorCharge001
	String _moveFurnitureCheck001
	BigDecimal moveFurnitureCharge001
	String visible001
	
	static constraints = {
		_protectorCheck001(nullable:true)
		protectorCharge001(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck001(nullable:true)
		moveFurnitureCharge001(nullable:true, scale: 2, min: 0.00)
		visible001(nullable:true)
	}
}
