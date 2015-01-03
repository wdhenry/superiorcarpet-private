package com.superior.cleaningjob

import grails.validation.Validateable

import org.apache.commons.collections.list.LazyList;
import org.apache.commons.collections.FactoryUtils;

@Validateable
class CleaningJobCommand {

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
	String roomName5
	BigDecimal squareFootage5
	BigDecimal preVacCharge5
	BigDecimal protectorCharge5
	BigDecimal moveFurnitureCharge5
	
	String roomName
	BigDecimal squareFootage
	BigDecimal roomCharge
	String _preVacCheck
	BigDecimal preVacCharge
	String _protectorCheck
	BigDecimal protectorCharge
	String _moveFurnitureCheck
	BigDecimal moveFurnitureCharge
	
	String stairDirection1
	BigDecimal stairCount1
	BigDecimal stairCharge1
	String stairDirection2
	BigDecimal stairCount2
	BigDecimal stairCharge2
	String stairDirection3
	BigDecimal stairCount3
	BigDecimal stairCharge3
	
	String hsRoomName
	BigDecimal hsSquareFootage
	BigDecimal hsRoomCharge
	String _hsEtchedCheck
	BigDecimal hsEtchedCharge
	String _hsSealedWaxedCheck
	BigDecimal hsSealedWaxedCharge
	
	String upholsteryName
	BigDecimal upholsteryCount
	BigDecimal upholsteryCharge
	String _upholsteryProtectorCheck
	BigDecimal upholsteryProtectorCharge
	
	String miscChargesName
	BigDecimal miscCharge
	
//	static hasMany = [rooms:RoomCommand]
	
//	List rooms = new ArrayList()
	
//	def getRoomsList() {
//		return LazyList.decorate(
//			  rooms,
//			  FactoryUtils.instantiateFactory(RoomCommand.class))
//	}
	
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
		roomName5(nullable:true)
		squareFootage5(nullable:true, scale: 1, min: 0.0)
		preVacCharge5(nullable:true, scale: 2, min: 0.00)
		protectorCharge5(nullable:true, scale: 2, min: 0.00)
		moveFurnitureCharge5(nullable:true, scale: 2, min: 0.00)
		roomName(nullable:true)
		roomCharge(nullable:true, scale: 2, min: 0.00)
		squareFootage(nullable:true, scale: 1, min: 0.0)
		_preVacCheck(nullable:true)
		preVacCharge(nullable:true, scale: 2, min: 0.00)
		_protectorCheck(nullable:true)
		protectorCharge(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck(nullable:true)
		moveFurnitureCharge(nullable:true, scale: 2, min: 0.00)
		stairDirection1(nullable:true)
		stairCount1(nullable:true, scale: 0, min: 0.0)
		stairCharge1(nullable:true, scale: 2, min: 0.00)
		stairDirection2(nullable:true)
		stairCount2(nullable:true, scale: 0, min: 0.0)
		stairCharge2(nullable:true, scale: 2, min: 0.00)
		stairDirection3(nullable:true)
		stairCount3(nullable:true, scale: 0, min: 0.0)
		stairCharge3(nullable:true, scale: 2, min: 0.00)
		hsRoomName(nullable:true)
		hsRoomCharge(nullable:true, scale: 2, min: 0.00)
		hsSquareFootage(nullable:true, scale: 1, min: 0.0)
		_hsEtchedCheck(nullable:true)
		hsEtchedCharge(nullable:true, scale: 2, min: 0.00)
		_hsSealedWaxedCheck(nullable:true)
		hsSealedWaxedCharge(nullable:true, scale: 2, min: 0.00)
		upholsteryName(nullable:true)
		upholsteryCount(nullable:true, scale: 0, min: 0.0)
		upholsteryCharge(nullable:true, scale: 2, min: 0.00)
		_upholsteryProtectorCheck(nullable:true)
		upholsteryProtectorCharge(nullable:true, scale: 2, min: 0.00)
		miscChargesName(nullable:true)
		miscCharge(nullable:true, scale: 2, min: 0.00)
	}
	
	String toString() {
		"Cleaning Job"
	}
}
