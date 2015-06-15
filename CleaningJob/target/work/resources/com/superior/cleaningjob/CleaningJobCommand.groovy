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
	
	String roomName001
	BigDecimal squareFootage001
	BigDecimal roomCharge001
	String _preVacCheck001
	BigDecimal preVacCharge001
	String _protectorCheck001
	BigDecimal protectorCharge001
	String _moveFurnitureCheck001
	BigDecimal moveFurnitureCharge001
	String visible001
	String roomName002
	BigDecimal squareFootage002
	BigDecimal roomCharge002
	String _preVacCheck002
	BigDecimal preVacCharge002
	String _protectorCheck002
	BigDecimal protectorCharge002
	String _moveFurnitureCheck002
	BigDecimal moveFurnitureCharge002
	String visible002
	String roomName003
	BigDecimal squareFootage003
	BigDecimal roomCharge003
	String _preVacCheck003
	BigDecimal preVacCharge003
	String _protectorCheck003
	BigDecimal protectorCharge003
	String _moveFurnitureCheck003
	BigDecimal moveFurnitureCharge003
	String visible003
	String roomName004
	BigDecimal squareFootage004
	BigDecimal roomCharge004
	String _preVacCheck004
	BigDecimal preVacCharge004
	String _protectorCheck004
	BigDecimal protectorCharge004
	String _moveFurnitureCheck004
	BigDecimal moveFurnitureCharge004
	String visible004
	String roomName005
	BigDecimal squareFootage005
	BigDecimal roomCharge005
	String _preVacCheck005
	BigDecimal preVacCharge005
	String _protectorCheck005
	BigDecimal protectorCharge005
	String _moveFurnitureCheck005
	BigDecimal moveFurnitureCharge005
	String visible005
	String roomName006
	BigDecimal squareFootage006
	BigDecimal roomCharge006
	String _preVacCheck006
	BigDecimal preVacCharge006
	String _protectorCheck006
	BigDecimal protectorCharge006
	String _moveFurnitureCheck006
	BigDecimal moveFurnitureCharge006
	String visible006
	String roomName007
	BigDecimal squareFootage007
	BigDecimal roomCharge007
	String _preVacCheck007
	BigDecimal preVacCharge007
	String _protectorCheck007
	BigDecimal protectorCharge007
	String _moveFurnitureCheck007
	BigDecimal moveFurnitureCharge007
	String visible007
	String roomName008
	BigDecimal squareFootage008
	BigDecimal roomCharge008
	String _preVacCheck008
	BigDecimal preVacCharge008
	String _protectorCheck008
	BigDecimal protectorCharge008
	String _moveFurnitureCheck008
	BigDecimal moveFurnitureCharge008
	String visible008
	
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
	
	String miscChargesName1
	BigDecimal miscCharge1
	String miscVisible1
	String miscChargesName2
	BigDecimal miscCharge2
	String miscVisible2
	String miscChargesName3
	BigDecimal miscCharge3
	String miscVisible3
	String miscChargesName4
	BigDecimal miscCharge4
	String miscVisible4
//	String miscChargesName5
//	BigDecimal miscCharge5
//	String miscVisible5
//	String miscChargesName6
//	BigDecimal miscCharge6
//	String miscVisible6
//	String miscChargesName7
//	BigDecimal miscCharge7
//	String miscVisible7
//	String miscChargesName8
//	BigDecimal miscCharge8
//	String miscVisible8
	
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
		roomName001(nullable:true)
		roomCharge001(nullable:true, scale: 2, min: 0.00)
		squareFootage001(nullable:true, scale: 1, min: 0.0)
		_preVacCheck001(nullable:true)
		preVacCharge001(nullable:true, scale: 2, min: 0.00)
		_protectorCheck001(nullable:true)
		protectorCharge001(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck001(nullable:true)
		moveFurnitureCharge001(nullable:true, scale: 2, min: 0.00)
		visible001(nullable:true)
		roomName002(nullable:true)
		roomCharge002(nullable:true, scale: 2, min: 0.00)
		squareFootage002(nullable:true, scale: 1, min: 0.0)
		_preVacCheck002(nullable:true)
		preVacCharge002(nullable:true, scale: 2, min: 0.00)
		_protectorCheck002(nullable:true)
		protectorCharge002(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck002(nullable:true)
		moveFurnitureCharge002(nullable:true, scale: 2, min: 0.00)
		visible002(nullable:true)
		roomName003(nullable:true)
		roomCharge003(nullable:true, scale: 2, min: 0.00)
		squareFootage003(nullable:true, scale: 1, min: 0.0)
		_preVacCheck003(nullable:true)
		preVacCharge003(nullable:true, scale: 2, min: 0.00)
		_protectorCheck003(nullable:true)
		protectorCharge003(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck003(nullable:true)
		moveFurnitureCharge003(nullable:true, scale: 2, min: 0.00)
		visible003(nullable:true)
		roomName004(nullable:true)
		roomCharge004(nullable:true, scale: 2, min: 0.00)
		squareFootage004(nullable:true, scale: 1, min: 0.0)
		_preVacCheck004(nullable:true)
		preVacCharge004(nullable:true, scale: 2, min: 0.00)
		_protectorCheck004(nullable:true)
		protectorCharge004(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck004(nullable:true)
		moveFurnitureCharge004(nullable:true, scale: 2, min: 0.00)
		visible004(nullable:true)
		roomName005(nullable:true)
		roomCharge005(nullable:true, scale: 2, min: 0.00)
		squareFootage005(nullable:true, scale: 1, min: 0.0)
		_preVacCheck005(nullable:true)
		preVacCharge005(nullable:true, scale: 2, min: 0.00)
		_protectorCheck005(nullable:true)
		protectorCharge005(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck005(nullable:true)
		moveFurnitureCharge005(nullable:true, scale: 2, min: 0.00)
		visible005(nullable:true)
		roomName006(nullable:true)
		roomCharge006(nullable:true, scale: 2, min: 0.00)
		squareFootage006(nullable:true, scale: 1, min: 0.0)
		_preVacCheck006(nullable:true)
		preVacCharge006(nullable:true, scale: 2, min: 0.00)
		_protectorCheck006(nullable:true)
		protectorCharge006(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck006(nullable:true)
		moveFurnitureCharge006(nullable:true, scale: 2, min: 0.00)
		visible006(nullable:true)
		roomName007(nullable:true)
		roomCharge007(nullable:true, scale: 2, min: 0.00)
		squareFootage007(nullable:true, scale: 1, min: 0.0)
		_preVacCheck007(nullable:true)
		preVacCharge007(nullable:true, scale: 2, min: 0.00)
		_protectorCheck007(nullable:true)
		protectorCharge007(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck007(nullable:true)
		moveFurnitureCharge007(nullable:true, scale: 2, min: 0.00)
		visible007(nullable:true)
		roomName008(nullable:true)
		roomCharge008(nullable:true, scale: 2, min: 0.00)
		squareFootage008(nullable:true, scale: 1, min: 0.0)
		_preVacCheck008(nullable:true)
		preVacCharge008(nullable:true, scale: 2, min: 0.00)
		_protectorCheck008(nullable:true)
		protectorCharge008(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck008(nullable:true)
		moveFurnitureCharge008(nullable:true, scale: 2, min: 0.00)
		visible008(nullable:true)
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
		miscChargesName1(nullable:true)
		miscCharge1(nullable:true, scale: 2, min: 0.00)
		miscVisible1(nullable:true)
		miscChargesName2(nullable:true)
		miscCharge2(nullable:true, scale: 2, min: 0.00)
		miscVisible2(nullable:true)
		miscChargesName3(nullable:true)
		miscCharge3(nullable:true, scale: 2, min: 0.00)
		miscVisible3(nullable:true)
		miscChargesName4(nullable:true)
		miscCharge4(nullable:true, scale: 2, min: 0.00)
		miscVisible4(nullable:true)
//		miscChargesName5(nullable:true)
//		miscCharge5(nullable:true, scale: 2, min: 0.00)
//		miscVisible5(nullable:true)
//		miscChargesName6(nullable:true)
//		miscCharge6(nullable:true, scale: 2, min: 0.00)
//		miscVisible6(nullable:true)
//		miscChargesName7(nullable:true)
//		miscCharge7(nullable:true, scale: 2, min: 0.00)
//		miscVisible7(nullable:true)
//		miscChargesName8(nullable:true)
//		miscCharge8(nullable:true, scale: 2, min: 0.00)
//		miscVisible8(nullable:true)
	}
	
	String toString() {
		"Cleaning Job"
	}
}
