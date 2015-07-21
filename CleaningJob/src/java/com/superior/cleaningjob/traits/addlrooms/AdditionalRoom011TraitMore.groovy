package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom011TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck011
	BigDecimal protectorCharge011
	String _moveFurnitureCheck011
	BigDecimal moveFurnitureCharge011
	String visible011
	
	static constraints = {
		_protectorCheck011(nullable:true)
		protectorCharge011(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck011(nullable:true)
		moveFurnitureCharge011(nullable:true, scale: 2, min: 0.00)
		visible011(nullable:true)
	}
}
