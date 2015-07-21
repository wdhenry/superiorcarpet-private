package com.superior.cleaningjob.traits.addlrooms

trait AdditionalRoom009TraitMore {
	
	// A trait can only have 10 fields... http://stackoverflow.com/a/30596420/2460544
	String _protectorCheck009
	BigDecimal protectorCharge009
	String _moveFurnitureCheck009
	BigDecimal moveFurnitureCharge009
	String visible009
	
	static constraints = {
		_protectorCheck009(nullable:true)
		protectorCharge009(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck009(nullable:true)
		moveFurnitureCharge009(nullable:true, scale: 2, min: 0.00)
		visible009(nullable:true)
	}
}
