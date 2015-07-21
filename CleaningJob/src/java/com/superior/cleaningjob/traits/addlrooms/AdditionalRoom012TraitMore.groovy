package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom012TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck012
	BigDecimal protectorCharge012
	String _moveFurnitureCheck012
	BigDecimal moveFurnitureCharge012
	String visible012
	
	static constraints = {
		_protectorCheck012(nullable:true)
		protectorCharge012(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck012(nullable:true)
		moveFurnitureCharge012(nullable:true, scale: 2, min: 0.00)
		visible012(nullable:true)
	}
}
