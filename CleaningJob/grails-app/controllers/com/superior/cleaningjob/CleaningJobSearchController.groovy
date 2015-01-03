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
			respond jobList, view:'summary', model:[jobs: jobList,
												carpetCareJobInstanceCount: jobList.size()]
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

		def count = 1
		for (room in roomList) {
			if (room.getInGroup()) {
				if (count == 1) {
					cleaningJobCommandInstance.setRoomName1(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage1(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge1(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge1(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge1(room.getMoveFurnitureCharge())
				} else if (count == 2) {
					cleaningJobCommandInstance.setRoomName2(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage2(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge2(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge2(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge2(room.getMoveFurnitureCharge())
				} else if (count == 3) {
					cleaningJobCommandInstance.setRoomName3(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage3(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge3(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge3(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge3(room.getMoveFurnitureCharge())
				} else if (count == 4) {
					cleaningJobCommandInstance.setRoomName4(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage4(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge4(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge4(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge4(room.getMoveFurnitureCharge())
				} else if (count == 5) {
					cleaningJobCommandInstance.setRoomName5(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage5(room.getSquareFootage())
					cleaningJobCommandInstance.setPreVacCharge5(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge5(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge5(room.getMoveFurnitureCharge())
				}
				count = count + 1
			} else {
				if (!room.getHardSurface()) {
					cleaningJobCommandInstance.setRoomName(room.getRoomName())
					cleaningJobCommandInstance.setSquareFootage(room.getSquareFootage())
					cleaningJobCommandInstance.setRoomCharge(room.getRoomCharge())
					cleaningJobCommandInstance.setPreVacCharge(room.getPreVacCharge())
					cleaningJobCommandInstance.setProtectorCharge(room.getProtectorCharge())
					cleaningJobCommandInstance.setMoveFurnitureCharge(room.getMoveFurnitureCharge())
				} else {
					cleaningJobCommandInstance.setHsRoomName(room.getRoomName())
					cleaningJobCommandInstance.setHsSquareFootage(room.getSquareFootage())
					cleaningJobCommandInstance.setHsRoomCharge(room.getRoomCharge())
					cleaningJobCommandInstance.setHsEtchedCharge(room.getEtchedCharge())
					cleaningJobCommandInstance.setHsSealedWaxedCharge(room.getSealWaxCharge())
				}
			}
		}

		def stairList = new ArrayList()
		stairList = Stair.findAllByJobId(carpetCareJobInstance.id)

		count = 1
		for (stair in stairList) {
			if (count == 1) {
				cleaningJobCommandInstance.setStairDirection1(stair.getStairDirection())
				cleaningJobCommandInstance.setStairCount1(stair.getStairCount())
				cleaningJobCommandInstance.setStairCharge1(stair.getStairCharge())
			} else if (count == 2) {
				cleaningJobCommandInstance.setStairDirection2(stair.getStairDirection())
				cleaningJobCommandInstance.setStairCount2(stair.getStairCount())
				cleaningJobCommandInstance.setStairCharge2(stair.getStairCharge())
			} else if (count == 3) {
				cleaningJobCommandInstance.setStairDirection3(stair.getStairDirection())
				cleaningJobCommandInstance.setStairCount3(stair.getStairCount())
				cleaningJobCommandInstance.setStairCharge3(stair.getStairCharge())
			}
			count = count + 1
		}

		Upholstery upholsteryInstance = Upholstery.findByJobId(carpetCareJobInstance.id)
		if (upholsteryInstance != null) {
			cleaningJobCommandInstance.setUpholsteryName(upholsteryInstance.getUpholsteryName())
			cleaningJobCommandInstance.setUpholsteryCount(upholsteryInstance.getUpholsteryCount())
			cleaningJobCommandInstance.setUpholsteryCharge(upholsteryInstance.getUpholsteryCharge())
			cleaningJobCommandInstance.setUpholsteryProtectorCharge(upholsteryInstance.getUpholsteryProtectorCharge())
		}

		MiscCharges miscChargesInstance = MiscCharges.findByJobId(carpetCareJobInstance.id)
		if (miscChargesInstance != null) {
			cleaningJobCommandInstance.setMiscChargesName(miscChargesInstance.getMiscDescription())
			cleaningJobCommandInstance.setMiscCharge(miscChargesInstance.getMiscCharge())
		}
		return cleaningJobCommandInstance
	}
	
}
