package com.superior.base

class Upholstery {

	Long jobId
	String upholsteryName
	double upholsteryCount
	BigDecimal upholsteryCharge
	BigDecimal upholsteryProtectorCharge	
	
    static constraints = {
		jobId(blank:false)
		upholsteryName(blank:false)
		upholsteryCount(blank:false)
		upholsteryCharge(nullable:false, scale: 2, min: 0.01)
		upholsteryProtectorCharge(nullable:true, scale: 2, min: 0.00)
    }
}
