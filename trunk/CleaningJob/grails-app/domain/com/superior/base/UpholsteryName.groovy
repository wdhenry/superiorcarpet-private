package com.superior.base

class UpholsteryName {

    String upholsteryName
	BigDecimal upholsteryCharge
	BigDecimal upholsteryProtect
	
    static constraints = {
		upholsteryName(blank:false)
		upholsteryCharge(nullable:true, scale: 2, min: 0.00)
		upholsteryProtect(nullable:true, scale: 2, min: 0.00)
    }
}
