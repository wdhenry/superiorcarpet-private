package com.superior.base

class UpholsteryName {

    String upholsteryName
	BigDecimal upholsteryCharge
	
    static constraints = {
		upholsteryName(blank:false)
		upholsteryCharge(nullable:true, scale: 2, min: 0.00)
    }
}
