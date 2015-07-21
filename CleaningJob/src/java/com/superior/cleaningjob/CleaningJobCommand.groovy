package com.superior.cleaningjob

import grails.validation.Validateable

import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom001Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom002Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom003Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom004Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom005Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom006Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom007Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom008Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom009Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom010Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom011Trait
import com.superior.cleaningjob.traits.addlrooms.AdditionalRoom012Trait

import com.superior.cleaningjob.traits.misccharges.MiscCharges1Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges2Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges3Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges4Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges5Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges6Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges7Trait
import com.superior.cleaningjob.traits.misccharges.MiscCharges8Trait

@Validateable
class CleaningJobCommand implements 
	MiscCharges1Trait, MiscCharges2Trait, MiscCharges3Trait, MiscCharges4Trait, 
	MiscCharges5Trait, MiscCharges6Trait, MiscCharges7Trait, MiscCharges8Trait,
	AdditionalRoom001Trait, AdditionalRoom002Trait, AdditionalRoom003Trait, AdditionalRoom004Trait, AdditionalRoom005Trait, AdditionalRoom006Trait,
	AdditionalRoom007Trait, AdditionalRoom008Trait, AdditionalRoom009Trait, AdditionalRoom010Trait, AdditionalRoom011Trait, AdditionalRoom012Trait {

	Date date
	String date_day
	String date_year
	String date_month
	String lead
	String helper
	Long customerId
	String firstName
	String lastName
	String addressLineOne
	String addressLineTwo
	String groupName
	BigDecimal groupRate
	String comment
	
	String roomName1
	BigDecimal squareFootage1
	String _preVacCheck1
	BigDecimal preVacCharge1
	String _protectorCheck1
	BigDecimal protectorCharge1
	String _moveFurnitureCheck1
	BigDecimal moveFurnitureCharge1
	String roomName2
	BigDecimal squareFootage2
	BigDecimal preVacCharge2
	BigDecimal protectorCharge2
	BigDecimal moveFurnitureCharge2
	String roomName3
	BigDecimal squareFootage3
	BigDecimal preVacCharge3
	BigDecimal protectorCharge3
	BigDecimal moveFurnitureCharge3
	String roomName4
	BigDecimal squareFootage4
	BigDecimal preVacCharge4
	BigDecimal protectorCharge4
	BigDecimal moveFurnitureCharge4
	
	String stairDirection1
	BigDecimal stairCount1
	BigDecimal stairCharge1
	String stairVisible1
	String stairDirection2
	BigDecimal stairCount2
	BigDecimal stairCharge2
	String stairVisible2
	String stairDirection3
	BigDecimal stairCount3
	BigDecimal stairCharge3
	String stairVisible3
	
	String hsRoomName1
	BigDecimal hsSquareFootage1
	BigDecimal hsRoomCharge1
	String _hsEtchedCheck1
	BigDecimal hsEtchedCharge1
	String _hsSealedWaxedCheck1
	BigDecimal hsSealedWaxedCharge1
	String hsVisible1
	String hsRoomName2
	BigDecimal hsSquareFootage2
	BigDecimal hsRoomCharge2
	String _hsEtchedCheck2
	BigDecimal hsEtchedCharge2
	String _hsSealedWaxedCheck2
	BigDecimal hsSealedWaxedCharge2
	String hsVisible2
	String hsRoomName3
	BigDecimal hsSquareFootage3
	BigDecimal hsRoomCharge3
	String _hsEtchedCheck3
	BigDecimal hsEtchedCharge3
	String _hsSealedWaxedCheck3
	BigDecimal hsSealedWaxedCharge3
	String hsVisible3
	String hsRoomName4
	BigDecimal hsSquareFootage4
	BigDecimal hsRoomCharge4
	String _hsEtchedCheck4
	BigDecimal hsEtchedCharge4
	String _hsSealedWaxedCheck4
	BigDecimal hsSealedWaxedCharge4
	String hsVisible4
	String hsRoomName5
	BigDecimal hsSquareFootage5
	BigDecimal hsRoomCharge5
	String _hsEtchedCheck5
	BigDecimal hsEtchedCharge5
	String _hsSealedWaxedCheck5
	BigDecimal hsSealedWaxedCharge5
	String hsVisible5
	String hsRoomName6
	BigDecimal hsSquareFootage6
	BigDecimal hsRoomCharge6
	String _hsEtchedCheck6
	BigDecimal hsEtchedCharge6
	String _hsSealedWaxedCheck6
	BigDecimal hsSealedWaxedCharge6
	String hsVisible6
	
	String upholsteryName1
	BigDecimal upholsteryCount1
	BigDecimal upholsteryCharge1
	String _upholsteryProtectorCheck1
	BigDecimal upholsteryProtectorCharge1
	String uVisible1
	String upholsteryName2
	BigDecimal upholsteryCount2
	BigDecimal upholsteryCharge2
	String _upholsteryProtectorCheck2
	BigDecimal upholsteryProtectorCharge2
	String uVisible2
	String upholsteryName3
	BigDecimal upholsteryCount3
	BigDecimal upholsteryCharge3
	String _upholsteryProtectorCheck3
	BigDecimal upholsteryProtectorCharge3
	String uVisible3
	String upholsteryName4
	BigDecimal upholsteryCount4
	BigDecimal upholsteryCharge4
	String _upholsteryProtectorCheck4
	BigDecimal upholsteryProtectorCharge4
	String uVisible4
	String upholsteryName5
	BigDecimal upholsteryCount5
	BigDecimal upholsteryCharge5
	String _upholsteryProtectorCheck5
	BigDecimal upholsteryProtectorCharge5
	String uVisible5
	String upholsteryName6
	BigDecimal upholsteryCount6
	BigDecimal upholsteryCharge6
	String _upholsteryProtectorCheck6
	BigDecimal upholsteryProtectorCharge6
	String uVisible6
	
	static constraints = {
		date(blank:false)
		lead(blank:false)
		helper(nullable:true)
		customerId(blank:false)
		firstName(nullable:true)
		lastName(nullable:true)
		addressLineOne(nullable:true)
		addressLineTwo(nullable:true)
		groupName(nullable:true)
		groupRate(nullable:true, scale: 2, min: 0.00)
		comment(nullable:true)
		
		roomName1(nullable:true)
		squareFootage1(nullable:true, scale: 1, min: 0.0)
		_preVacCheck1(nullable:true)
		preVacCharge1(nullable:true, scale: 2, min: 0.00)
		_protectorCheck1(nullable:true)
		protectorCharge1(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck1(nullable:true)
		moveFurnitureCharge1(nullable:true, scale: 2, min: 0.00)
		roomName2(nullable:true)
		squareFootage2(nullable:true, scale: 1, min: 0.0)
		preVacCharge2(nullable:true, scale: 2, min: 0.00)
		protectorCharge2(nullable:true, scale: 2, min: 0.00)
		moveFurnitureCharge2(nullable:true, scale: 2, min: 0.00)
		roomName3(nullable:true)
		squareFootage3(nullable:true, scale: 1, min: 0.0)
		preVacCharge3(nullable:true, scale: 2, min: 0.00)
		protectorCharge3(nullable:true, scale: 2, min: 0.00)
		moveFurnitureCharge3(nullable:true, scale: 2, min: 0.00)
		roomName4(nullable:true)
		squareFootage4(nullable:true, scale: 1, min: 0.0)
		preVacCharge4(nullable:true, scale: 2, min: 0.00)
		protectorCharge4(nullable:true, scale: 2, min: 0.00)
		moveFurnitureCharge4(nullable:true, scale: 2, min: 0.00)

		stairDirection1(nullable:true)
		stairCount1(nullable:true, scale: 0, min: 0.0)
		stairCharge1(nullable:true, scale: 2, min: 0.00)
		stairVisible1(nullable:true)
		stairDirection2(nullable:true)
		stairCount2(nullable:true, scale: 0, min: 0.0)
		stairCharge2(nullable:true, scale: 2, min: 0.00)
		stairVisible2(nullable:true)
		stairDirection3(nullable:true)
		stairCount3(nullable:true, scale: 0, min: 0.0)
		stairCharge3(nullable:true, scale: 2, min: 0.00)
		stairVisible3(nullable:true)
		
		hsRoomName1(nullable:true)
		hsRoomCharge1(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage1(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck1(nullable:true)
		hsEtchedCharge1(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck1(nullable:true)
		hsSealedWaxedCharge1(nullable:true, scale: 2, min: 0.00)
		hsVisible1(nullable:true)
		hsRoomName2(nullable:true)
		hsRoomCharge2(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage2(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck2(nullable:true)
		hsEtchedCharge2(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck2(nullable:true)
		hsSealedWaxedCharge2(nullable:true, scale: 2, min: 0.00)
		hsVisible2(nullable:true)
		hsRoomName3(nullable:true)
		hsRoomCharge3(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage3(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck3(nullable:true)
		hsEtchedCharge3(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck3(nullable:true)
		hsSealedWaxedCharge3(nullable:true, scale: 2, min: 0.00)
		hsVisible3(nullable:true)
		hsRoomName4(nullable:true)
		hsRoomCharge4(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage4(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck4(nullable:true)
		hsEtchedCharge4(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck4(nullable:true)
		hsSealedWaxedCharge4(nullable:true, scale: 2, min: 0.00)
		hsVisible4(nullable:true)
		hsRoomName5(nullable:true)
		hsRoomCharge5(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage5(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck5(nullable:true)
		hsEtchedCharge5(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck5(nullable:true)
		hsSealedWaxedCharge5(nullable:true, scale: 2, min: 0.00)
		hsVisible5(nullable:true)
		hsRoomName6(nullable:true)
		hsRoomCharge6(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage6(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck6(nullable:true)
		hsEtchedCharge6(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck6(nullable:true)
		hsSealedWaxedCharge6(nullable:true, scale: 2, min: 0.00)
		hsVisible6(nullable:true)
		
		upholsteryName1(nullable:true)
		upholsteryCount1(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge1(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck1(nullable:true)
		upholsteryProtectorCharge1(nullable:true, scale: 2, min: 0.00)
		uVisible1(nullable:true)
		upholsteryName2(nullable:true)
		upholsteryCount2(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge2(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck2(nullable:true)
		upholsteryProtectorCharge2(nullable:true, scale: 2, min: 0.00)
		uVisible2(nullable:true)
		upholsteryName3(nullable:true)
		upholsteryCount3(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge3(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck3(nullable:true)
		upholsteryProtectorCharge3(nullable:true, scale: 2, min: 0.00)
		uVisible3(nullable:true)
		upholsteryName4(nullable:true)
		upholsteryCount4(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge4(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck4(nullable:true)
		upholsteryProtectorCharge4(nullable:true, scale: 2, min: 0.00)
		uVisible4(nullable:true)
		upholsteryName5(nullable:true)
		upholsteryCount5(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge5(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck5(nullable:true)
		upholsteryProtectorCharge5(nullable:true, scale: 2, min: 0.00)
		uVisible5(nullable:true)
		upholsteryName6(nullable:true)
		upholsteryCount6(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge6(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck6(nullable:true)
		upholsteryProtectorCharge6(nullable:true, scale: 2, min: 0.00)
		uVisible6(nullable:true)
	}
	
	String toString() {
		"Cleaning Job"
	}
}
