package com.superior.base

class RoomGroup {

    String groupName
	BigDecimal groupCharge
	
    static constraints = {
		groupName(blank:false)
		groupCharge(nullable:true, scale: 2, min: 0.00)
    }
}
