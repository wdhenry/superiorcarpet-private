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
			Customer customerInstance = new Customer();
			def custList = new ArrayList()
			
			customerInstance.errors.rejectValue('', 'No matching Cleaning Jobs Found   ')
			flash.message = "No matching Cleaning Jobs Found   "
			redirect view:'details', controller:'customerSearch', model:[customerInstance: customerInstance]
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

		getRoomRecs(carpetCareJobInstance, cleaningJobCommandInstance)

		getStairRecs(carpetCareJobInstance, cleaningJobCommandInstance)

		getUpholsteryRecs(carpetCareJobInstance, cleaningJobCommandInstance)
		
		getMiscellaneousRecs(carpetCareJobInstance, cleaningJobCommandInstance)
		return cleaningJobCommandInstance
	}

	private getRoomRecs(CarpetCareJob carpetCareJobInstance, CleaningJobCommand cleaningJobCommandInstance) {
		def roomList = new ArrayList()
		roomList = Room.findAllByJobId(carpetCareJobInstance.id)

		int groupCount = 1
		int hsRoomCount = 1
		int roomCount = 1

		for (room in roomList) {
			if (room.isInGroup()) {
				cleaningJobCommandInstance."setRoomName${groupCount}"(room.getRoomName())
				cleaningJobCommandInstance."setSquareFootage${groupCount}"(room.getSquareFootage())
				cleaningJobCommandInstance."setPreVacCharge${groupCount}"(room.getPreVacCharge())
				cleaningJobCommandInstance."setProtectorCharge${groupCount}"(room.getProtectorCharge())
				cleaningJobCommandInstance."setMoveFurnitureCharge${groupCount}"(room.getMoveFurnitureCharge())
				groupCount = groupCount + 1
			} else {
				if (room.isHardSurface()) {
					cleaningJobCommandInstance."setHsRoomName${hsRoomCount}"(room.getRoomName())
					cleaningJobCommandInstance."setHsSquareFootage${hsRoomCount}"(room.getSquareFootage())
					cleaningJobCommandInstance."setHsRoomCharge${hsRoomCount}"(room.getRoomCharge())
					cleaningJobCommandInstance."setHsEtchedCharge${hsRoomCount}"(room.getEtchedCharge())
					cleaningJobCommandInstance."setHsSealedWaxedCharge${hsRoomCount}"(room.getSealWaxCharge())
					hsRoomCount = hsRoomCount + 1
				} else {
					cleaningJobCommandInstance."setRoomName00${roomCount}"(room.getRoomName())
					cleaningJobCommandInstance."setSquareFootage00${roomCount}"(room.getSquareFootage())
					cleaningJobCommandInstance."setRoomCharge00${roomCount}"(room.getRoomCharge())
					cleaningJobCommandInstance."setPreVacCharge00${roomCount}"(room.getPreVacCharge())
					cleaningJobCommandInstance."setProtectorCharge00${roomCount}"(room.getProtectorCharge())
					cleaningJobCommandInstance."setMoveFurnitureCharge00${roomCount}"(room.getMoveFurnitureCharge())
					roomCount = roomCount + 1
				}
			}
		}
	}

	private getStairRecs(CarpetCareJob carpetCareJobInstance, CleaningJobCommand cleaningJobCommandInstance) {
		def stairList = new ArrayList()
		stairList = Stair.findAllByJobId(carpetCareJobInstance.id)

		int stairCount = 1
		for (stair in stairList) {
			cleaningJobCommandInstance."setStairDirection${stairCount}"(stair.getStairDirection())
			cleaningJobCommandInstance."setStairCount${stairCount}"(stair.getStairCount())
			cleaningJobCommandInstance."setStairCharge${stairCount}"(stair.getStairCharge())
			stairCount = stairCount + 1
		}
	}

	private getUpholsteryRecs(CarpetCareJob carpetCareJobInstance, CleaningJobCommand cleaningJobCommandInstance) {
		def upholsteryList = new ArrayList()
		upholsteryList = Upholstery.findAllByJobId(carpetCareJobInstance.id)

		int upholsteryCount = 1
		for (upholstery in upholsteryList) {
			cleaningJobCommandInstance."setUpholsteryName${upholsteryCount}"(upholstery.getUpholsteryName())
			cleaningJobCommandInstance."setUpholsteryCount${upholsteryCount}"(upholstery.getUpholsteryCount())
			cleaningJobCommandInstance."setUpholsteryCharge${upholsteryCount}"(upholstery.getUpholsteryCharge())
			cleaningJobCommandInstance."setUpholsteryProtectorCharge${upholsteryCount}"(upholstery.getUpholsteryProtectorCharge())
			upholsteryCount = upholsteryCount + 1
		}
	}

	private getMiscellaneousRecs(CarpetCareJob carpetCareJobInstance, CleaningJobCommand cleaningJobCommandInstance) {
		def miscChargeList = new ArrayList()
		miscChargeList = MiscCharges.findAllByJobId(carpetCareJobInstance.id)

		int miscChargeCount = 1
		for (miscCharge in miscChargeList) {
			cleaningJobCommandInstance."setMiscChargesName${miscChargeCount}"(miscCharge.getMiscDescription())
			cleaningJobCommandInstance."setMiscCharge${miscChargeCount}"(miscCharge.getMiscCharge())
			miscChargeCount = miscChargeCount + 1
		}
	}
	
}
