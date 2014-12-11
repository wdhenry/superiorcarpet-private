package com.superior.base

class Room {

    Long jobId
	boolean inGroup
	boolean hardSurface
	String roomName
	double squareFootage
	BigDecimal roomCharge
	BigDecimal preVacCharge
	BigDecimal protectorCharge
	BigDecimal moveFurnitureCharge
	BigDecimal etchedCharge
	BigDecimal sealWaxCharge

    static constraints = {
		jobId(blank:false)
		inGroup(blank:false)
		hardSurface(blank:false)
		roomName(blank:false)
		squareFootage(blank:false)
		roomCharge(nullable:false, scale: 2, min: 0.00)
		preVacCharge(nullable:true, scale: 2, min: 0.00)
		protectorCharge(nullable:true, scale: 2, min: 0.00)
		moveFurnitureCharge(nullable:true, scale: 2, min: 0.00)
		etchedCharge(nullable:true, scale: 2, min: 0.00)
		sealWaxCharge(nullable:true, scale: 2, min: 0.00)
		
    }
}
