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
			if (room.isInGroup()) {
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
				if (room.hardSurface()) {
					def hsRoomCount = 1
					if (hsRoomCount == 1) {
						cleaningJobCommandInstance.setHsRoomName1(room.getRoomName())
						cleaningJobCommandInstance.setHsSquareFootage1(room.getSquareFootage())
						cleaningJobCommandInstance.setHsRoomCharge1(room.getRoomCharge())
						cleaningJobCommandInstance.setHsEtchedCharge1(room.getEtchedCharge())
						cleaningJobCommandInstance.setHsSealedWaxedCharge1(room.getSealWaxCharge())
					} else if (hsRoomCount == 2) {
						cleaningJobCommandInstance.setHsRoomName2(room.getRoomName())
						cleaningJobCommandInstance.setHsSquareFootage2(room.getSquareFootage())
						cleaningJobCommandInstance.setHsRoomCharge2(room.getRoomCharge())
						cleaningJobCommandInstance.setHsEtchedCharge2(room.getEtchedCharge())
						cleaningJobCommandInstance.setHsSealedWaxedCharge2(room.getSealWaxCharge())
					} else if (hsRoomCount == 3) {
						cleaningJobCommandInstance.setHsRoomName3(room.getRoomName())
						cleaningJobCommandInstance.setHsSquareFootage3(room.getSquareFootage())
						cleaningJobCommandInstance.setHsRoomCharge3(room.getRoomCharge())
						cleaningJobCommandInstance.setHsEtchedCharge3(room.getEtchedCharge())
						cleaningJobCommandInstance.setHsSealedWaxedCharge3(room.getSealWaxCharge())
					}
					hsRoomCount = hsRoomCount + 1
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
				cleaningJobCommandInstance.setStairDirection1(stair.stairDirection())
				cleaningJobCommandInstance.setStairCount1(stair.stairCount())
				cleaningJobCommandInstance.setStairCharge1(stair.stairCharge())
			} else if (stairCount == 2) {
				cleaningJobCommandInstance.setStairDirection2(stair.stairDirection())
				cleaningJobCommandInstance.setStairCount2(stair.stairCount())
				cleaningJobCommandInstance.setStairCharge2(stair.stairCharge())
			} else if (stairCount == 3) {
				cleaningJobCommandInstance.setStairDirection3(stair.stairDirection())
				cleaningJobCommandInstance.setStairCount3(stair.stairCount())
				cleaningJobCommandInstance.setStairCharge3(stair.stairCharge())
			}
			stairCount = stairCount + 1
		}

		def upholsteryList = new ArrayList()
		upholsteryList = Upholstery.findByJobId(carpetCareJobInstance.id)
		
		def upholsteryCount = 1
		for (upholstery in upholsteryList) {
			if (upholsteryCount == 1) {
				cleaningJobCommandInstance.setUpholsteryName1(upholstery.upholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount1(upholstery.upholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge1(upholstery.upholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge1(upholstery.upholsteryProtectorCharge())
			} else if (upholsteryCount == 2) {
				cleaningJobCommandInstance.setUpholsteryName2(upholstery.upholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount2(upholstery.upholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge2(upholstery.upholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge2(upholstery.upholsteryProtectorCharge())
			} else if (upholsteryCount == 3) {
				cleaningJobCommandInstance.setUpholsteryName3(upholstery.upholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount3(upholstery.upholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge3(upholstery.upholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge3(upholstery.upholsteryProtectorCharge())
			} else if (upholsteryCount == 4) {
				cleaningJobCommandInstance.setUpholsteryName4(upholstery.upholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount4(upholstery.upholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge4(upholstery.upholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge4(upholstery.upholsteryProtectorCharge())
			} else if (upholsteryCount == 5) {
				cleaningJobCommandInstance.setUpholsteryName5(upholstery.upholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount5(upholstery.upholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge5(upholstery.upholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge5(upholstery.upholsteryProtectorCharge())
			} else if (upholsteryCount == 6) {
				cleaningJobCommandInstance.setUpholsteryName6(upholstery.upholsteryName())
				cleaningJobCommandInstance.setUpholsteryCount6(upholstery.upholsteryCount())
				cleaningJobCommandInstance.setUpholsteryCharge6(upholstery.upholsteryCharge())
				cleaningJobCommandInstance.setUpholsteryProtectorCharge6(upholstery.upholsteryProtectorCharge())
			}
			upholsteryCount = upholsteryCount + 1
		}
		
		def miscChargeList = new ArrayList()
		miscChargeList = MiscCharges.findByJobId(carpetCareJobInstance.id)
		
		def miscChargeCount = 1
		for (miscCharge in miscChargeList) {
			if (miscChargeCount == 1) {
				cleaningJobCommandInstance.setMiscChargesName1(miscCharge.miscDescription())
				cleaningJobCommandInstance.setMiscCharge1(miscCharge.miscCharge())
			} else if (miscChargeCount == 2) {
				cleaningJobCommandInstance.setMiscChargesName2(miscCharge.miscDescription())
				cleaningJobCommandInstance.setMiscCharge2(miscCharge.miscCharge())
			} else if (miscChargeCount == 3) {
				cleaningJobCommandInstance.setMiscChargesName3(miscCharge.miscDescription())
				cleaningJobCommandInstance.setMiscCharge3(miscCharge.miscCharge())
			}
			miscChargeCount = miscChargeCount + 1
		}
		return cleaningJobCommandInstance
	}
	
}
