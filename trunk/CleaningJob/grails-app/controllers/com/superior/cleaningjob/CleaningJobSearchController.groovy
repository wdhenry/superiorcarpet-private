package com.superior.cleaningjob

import java.util.Date;

import com.superior.base.CarpetCareJob
import com.superior.base.Customer
import com.superior.base.MiscCharges 
import com.superior.base.Room
import com.superior.base.Stair
import com.superior.base.Upholstery
import com.superior.customer.CustomerSearchCommand

import grails.transaction.Transactional

@Transactional(readOnly = true)
class CleaningJobSearchController {

    def index() { 
		CleaningSearchCommand cleaningSearchCommandInstance = new CleaningSearchCommand()
		respond cleaningSearchCommandInstance , view:'search'
	}
	
	def search(CleaningSearchCommand cleaningSearchCommandInstance) {
		if (cleaningSearchCommandInstance == null) {
			respond cleaningSearchCommandInstance , view:'search'
			return
		}
		
		def jobList = new ArrayList() 
		if (cleaningSearchCommandInstance.date != null) {
			jobList = CarpetCareJob.findAllByDate(cleaningSearchCommandInstance.date)
		}
		
		if (jobList.size() == 1) {
			CarpetCareJob carpetCareJobInstance = jobList.get(0)
			CleaningJobCommand cleaningJobCommandInstance = buildDisplayObject(carpetCareJobInstance)
			
			respond carpetCareJobInstance, view:'details', model:[cleaningJobCommandInstance: cleaningJobCommandInstance] 
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList, carpetCareJobInstanceCount: jobList.size()]
			return
		} else {
			cleaningSearchCommandInstance.errors.rejectValue('', 'No matching Cleaning Jobs Found   ')
			respond cleaningSearchCommandInstance.errors, view:'search'
			return
		}
	}

	def details(CarpetCareJob carpetCareJobInstance) {
		CleaningJobCommand cleaningJobCommandInstance = buildDisplayObject(carpetCareJobInstance)
			
		respond carpetCareJobInstance, view:'details', model:[cleaningJobCommandInstance: cleaningJobCommandInstance]
	}
	
	def custjobs(Long id) {
		def jobList = CarpetCareJob.findAllByCustomerId(id)
		
		if (jobList.size() == 1) {
			CarpetCareJob carpetCareJobInstance = jobList.get(0)
			CleaningJobCommand cleaningJobCommandInstance = buildDisplayObject(carpetCareJobInstance)
			
			respond carpetCareJobInstance, view:'details', model:[cleaningJobCommandInstance: cleaningJobCommandInstance] 
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList, carpetCareJobInstanceCount: jobList.size()]
			return
		} else {
			CustomerSearchCommand customerSearchCommandInstance = new CustomerSearchCommand();
			customerSearchCommandInstance.errors.rejectValue('', 'No matching Cleaning Jobs Found   ')
			def err = 'No matching Cleaning Jobs Found   '
			redirect view:'search', controller:'customerSearch', model: [CustomerSearchCommand: customerSearchCommandInstance]
			return
		}
	}
	
	private CleaningJobCommand buildDisplayObject(CarpetCareJob carpetCareJobInstance) {

		Customer customerInstance = Customer.findById(carpetCareJobInstance.customerId)

		CleaningJobCommand cleaningJobCommandInstance = new CleaningJobCommand(
												date: carpetCareJobInstance.date,
												lead: carpetCareJobInstance.lead,
												helper: carpetCareJobInstance.helper,
												customerId: carpetCareJobInstance.customerId,
												firstName: customerInstance.firstName,
												lastName: customerInstance.lastName,
												addressLineOne: customerInstance.addressLineOne,
												addressLineTwo: customerInstance.addressLineTwo,
												groupName: carpetCareJobInstance.groupName,
												groupRate: carpetCareJobInstance.groupRate,
												comment: carpetCareJobInstance.comment)

		def roomList = new ArrayList()
		roomList = Room.findAllByJobId(carpetCareJobInstance.id)

		def groupCount = 1
		for (room in roomList) {
			if (room.getInGroup()) {
				if (groupCount == 1) {
					cleaningJobCommandInstance.setRoomName1(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage1(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge1(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge1(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge1(room.getMoveFurnitureCharge())
				} else if (groupCount == 2) {
					cleaningJobCommandInstance.setRoomName2(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage2(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge2(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge2(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge2(room.getMoveFurnitureCharge())
				} else if (groupCount == 3) {
					cleaningJobCommandInstance.setRoomName3(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage3(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge3(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge3(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge3(room.getMoveFurnitureCharge())
				} else if (groupCount == 4) {
					cleaningJobCommandInstance.setRoomName4(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage4(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge4(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge4(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge4(room.getMoveFurnitureCharge())
				} else if (groupCount == 5) {
					cleaningJobCommandInstance.setRoomName5(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage5(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge5(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge5(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge5(room.getMoveFurnitureCharge())
				}
				groupCount = groupCount + 1
			} else {
				if (room.getHardSurface()) {
					cleaningJobCommandInstance.setHsRoomName(room.getRoomName())
					cleaningJobCommandInstance.setHsSquareFootage(room.getSquareFootage())
					cleaningJobCommandInstance.setHsRoomCharge(room.getRoomCharge())
					cleaningJobCommandInstance.setHsEtchedCharge(room.getEtchedCharge())
					cleaningJobCommandInstance.setHsSealedWaxedCharge(room.getSealWaxCharge())
				} else {
					def roomCount = 1
					if (roomCount == 1) {
						cleaningJobCommandInstance.setRoomName001(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage001(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge001(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge001(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge001(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge001(room.getMoveFurnitureCharge())
					} else if (roomCount == 2) {
						cleaningJobCommandInstance.setRoomName002(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage002(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge002(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge002(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge002(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge002(room.getMoveFurnitureCharge())
					} else if (roomCount == 3) {
						cleaningJobCommandInstance.setRoomName003(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage003(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge003(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge003(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge003(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge003(room.getMoveFurnitureCharge())
					} else if (roomCount == 4) {
						cleaningJobCommandInstance.setRoomName004(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage004(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge004(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge004(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge004(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge004(room.getMoveFurnitureCharge())
					} else if (roomCount == 5) {
						cleaningJobCommandInstance.setRoomName005(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage005(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge005(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge005(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge005(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge005(room.getMoveFurnitureCharge())
					} else if (roomCount == 6) {
						cleaningJobCommandInstance.setRoomName006(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage006(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge006(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge006(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge006(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge006(room.getMoveFurnitureCharge())
					} else if (roomCount == 7) {
						cleaningJobCommandInstance.setRoomName007(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage007(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge007(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge007(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge007(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge007(room.getMoveFurnitureCharge())
					} else if (roomCount == 8) {
						cleaningJobCommandInstance.setRoomName008(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage008(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge008(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge008(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge008(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge008(room.getMoveFurnitureCharge())
					} else if (roomCount == 9) {
						cleaningJobCommandInstance.setRoomName009(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage009(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge009(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge009(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge009(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge009(room.getMoveFurnitureCharge())
					} else if (roomCount == 10) {
						cleaningJobCommandInstance.setRoomName010(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage010(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge010(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge010(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge010(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge010(room.getMoveFurnitureCharge())
					} else if (roomCount == 11) {
						cleaningJobCommandInstance.setRoomName011(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage011(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge011(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge011(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge011(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge011(room.getMoveFurnitureCharge())
					} else if (roomCount == 12) {
						cleaningJobCommandInstance.setRoomName012(room.getRoomName())
						cleaningJobCommandInstance.setSquareFootage012(room.getSquareFootage())
						cleaningJobCommandInstance.setRoomCharge012(room.getRoomCharge())
						cleaningJobCommandInstance.setPreVacCharge012(room.getPreVacCharge())
						cleaningJobCommandInstance.setProtectorCharge012(room.getProtectorCharge())
						cleaningJobCommandInstance.setMoveFurnitureCharge012(room.getMoveFurnitureCharge())
					}
					roomCount = roomCount + 1
				}
			}
		}

		def stairList = new ArrayList()
		stairList = Stair.findAllByJobId(carpetCareJobInstance.id)

		def stairCount = 1
		for (stair in stairList) {
			if (stairCount == 1) {
				cleaningJobCommandInstance.setStairDirection1(stair.getStairDirection())
				cleaningJobCommandInstance.setStairCount1(stair.getStairCount())
				cleaningJobCommandInstance.setStairCharge1(stair.getStairCharge())
			} else if (stairCount == 2) {
				cleaningJobCommandInstance.setStairDirection2(stair.getStairDirection())
				cleaningJobCommandInstance.setStairCount2(stair.getStairCount())
				cleaningJobCommandInstance.setStairCharge2(stair.getStairCharge())
			} else if (stairCount == 3) {
				cleaningJobCommandInstance.setStairDirection3(stair.getStairDirection())
				cleaningJobCommandInstance.setStairCount3(stair.getStairCount())
				cleaningJobCommandInstance.setStairCharge3(stair.getStairCharge())
			}
			stairCount = stairCount + 1
		}

		def upholsteryList = new ArrayList()
		upholsteryList = Upholstery.findByJobId(carpetCareJobInstance.id)
		
		def upholsteryCount = 1
		for (upholstery in upholsteryList) {
			if (upholsteryCount == 1) {
				cleaningJobCommandInstance.setUpholsteryName1(upholstery.getUpholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount1(upholstery.getUpholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge1(upholstery.getUpholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge1(upholstery.getUpholsteryProtectorCharge())
			} else if (upholsteryCount == 2) {
				cleaningJobCommandInstance.setUpholsteryName2(upholstery.getUpholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount2(upholstery.getUpholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge2(upholstery.getUpholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge2(upholstery.getUpholsteryProtectorCharge())
			} else if (upholsteryCount == 3) {
				cleaningJobCommandInstance.setUpholsteryName3(upholstery.getUpholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount3(upholstery.getUpholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge3(upholstery.getUpholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge3(upholstery.getUpholsteryProtectorCharge())
			} else if (upholsteryCount == 4) {
				cleaningJobCommandInstance.setUpholsteryName4(upholstery.getUpholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount4(upholstery.getUpholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge4(upholstery.getUpholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge4(upholstery.getUpholsteryProtectorCharge())
			} else if (upholsteryCount == 5) {
				cleaningJobCommandInstance.setUpholsteryName5(upholstery.getUpholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount5(upholstery.getUpholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge5(upholstery.getUpholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge5(upholstery.getUpholsteryProtectorCharge())
			} else if (upholsteryCount == 6) {
				cleaningJobCommandInstance.setUpholsteryName6(upholstery.getUpholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount6(upholstery.getUpholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge6(upholstery.getUpholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge6(upholstery.getUpholsteryProtectorCharge())
			}
			upholsteryCount = upholsteryCount + 1
		}
		
		MiscCharges miscChargesInstance = MiscCharges.findByJobId(carpetCareJobInstance.id)
		if (miscChargesInstance != null) {
			cleaningJobCommandInstance.setMiscChargesName(miscChargesInstance.getMiscDescription())
			cleaningJobCommandInstance.setMiscCharge(miscChargesInstance.getMiscCharge())
		}
		return cleaningJobCommandInstance
	}
	
}
