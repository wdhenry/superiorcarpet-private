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
	String roomName009
	BigDecimal squareFootage009
	BigDecimal roomCharge009
	String _preVacCheck009
	BigDecimal preVacCharge009
	String _protectorCheck009
	BigDecimal protectorCharge009
	String _moveFurnitureCheck009
	BigDecimal moveFurnitureCharge009
	String visible009
	String roomName010
	BigDecimal squareFootage010
	BigDecimal roomCharge010
	String _preVacCheck010
	BigDecimal preVacCharge010
	String _protectorCheck010
	BigDecimal protectorCharge010
	String _moveFurnitureCheck010
	BigDecimal moveFurnitureCharge010
	String visible010
	String roomName011
	BigDecimal squareFootage011
	BigDecimal roomCharge011
	String _preVacCheck011
	BigDecimal preVacCharge011
	String _protectorCheck011
	BigDecimal protectorCharge011
	String _moveFurnitureCheck011
	BigDecimal moveFurnitureCharge011
	String visible011
	String roomName012
	BigDecimal squareFootage012
	BigDecimal roomCharge012
	String _preVacCheck012
	BigDecimal preVacCharge012
	String _protectorCheck012
	BigDecimal protectorCharge012
	String _moveFurnitureCheck012
	BigDecimal moveFurnitureCharge012
	String visible012
	
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
		roomName009(nullable:true)
		roomCharge009(nullable:true, scale: 2, min: 0.00)
		squareFootage009(nullable:true, scale: 1, min: 0.0)
		_preVacCheck009(nullable:true)
		preVacCharge009(nullable:true, scale: 2, min: 0.00)
		_protectorCheck009(nullable:true)
		protectorCharge009(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck009(nullable:true)
		moveFurnitureCharge009(nullable:true, scale: 2, min: 0.00)
		visible009(nullable:true)
		roomName010(nullable:true)
		roomCharge010(nullable:true, scale: 2, min: 0.00)
		squareFootage010(nullable:true, scale: 1, min: 0.0)
		_preVacCheck010(nullable:true)
		preVacCharge010(nullable:true, scale: 2, min: 0.00)
		_protectorCheck010(nullable:true)
		protectorCharge010(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck010(nullable:true)
		moveFurnitureCharge010(nullable:true, scale: 2, min: 0.00)
		visible010(nullable:true)
		roomName011(nullable:true)
		roomCharge011(nullable:true, scale: 2, min: 0.00)
		squareFootage011(nullable:true, scale: 1, min: 0.0)
		_preVacCheck011(nullable:true)
		preVacCharge011(nullable:true, scale: 2, min: 0.00)
		_protectorCheck011(nullable:true)
		protectorCharge011(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck011(nullable:true)
		moveFurnitureCharge011(nullable:true, scale: 2, min: 0.00)
		visible011(nullable:true)
		roomName012(nullable:true)
		roomCharge012(nullable:true, scale: 2, min: 0.00)
		squareFootage012(nullable:true, scale: 1, min: 0.0)
		_preVacCheck012(nullable:true)
		preVacCharge012(nullable:true, scale: 2, min: 0.00)
		_protectorCheck012(nullable:true)
		protectorCharge012(nullable:true, scale: 2, min: 0.00)
		_moveFurnitureCheck012(nullable:true)
		moveFurnitureCharge012(nullable:true, scale: 2, min: 0.00)
		visible012(nullable:true)
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
