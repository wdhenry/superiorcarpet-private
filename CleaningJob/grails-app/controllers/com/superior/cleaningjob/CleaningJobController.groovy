package com.superior.cleaningjob

import static org.springframework.http.HttpStatus.*

import org.apache.commons.lang.StringUtils;

import com.superior.base.CarpetCareJob;
import com.superior.base.Customer;
import com.superior.base.MiscCharges
import com.superior.base.Room
import com.superior.base.Stair
import com.superior.base.Upholstery

import grails.transaction.Transactional

@Transactional(readOnly = true)
class CleaningJobController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
    def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond Customer.list(params), model:[customerInstanceCount: Customer.count()]
	}
	
	def create() {
		respond new Customer(params)
	}
	
	@Transactional
	def save(Customer customerInstance) {
		if (customerInstance == null) {
			notFound()
			return
		}

		if (customerInstance.hasErrors()) {
			respond customerInstance.errors, view:'create'
			return
		}

		customerInstance.save flush:true

		redirect action: "index", controller: "cleaningJob"
	}
	
	def newJob(Customer customerInstance) {
//		def rooms = []
		CleaningJobCommand cleaningJobCommandInstance = new CleaningJobCommand(customerId: customerInstance.id, 
															firstName: customerInstance.firstName, 
															lastName: customerInstance.lastName)
		respond cleaningJobCommandInstance
	}
	
	@Transactional
	def saveJob(CleaningJobCommand cleaningJobCommandInstance) {
	
		if (cleaningJobCommandInstance == null) {
			notFound()
			return
		}

		if (cleaningJobCommandInstance.lead == "Pick a Name") {
			cleaningJobCommandInstance.errors.rejectValue('lead', 'Must pick a Lead Name   ')
		}
		
		if ((cleaningJobCommandInstance.groupName == "No Special") &&
			(cleaningJobCommandInstance.roomName == "Pick a Room") &&
			(cleaningJobCommandInstance.hsRoomName == "Pick a Room") &&
			(cleaningJobCommandInstance.miscChargesName == "Pick Misc. Description") &&
			(cleaningJobCommandInstance.stairDirection1 == "Pick a Direction") &&
			(cleaningJobCommandInstance.stairDirection2 == "Pick a Direction") &&
			(cleaningJobCommandInstance.stairDirection3 == "Pick a Direction") &&
			(cleaningJobCommandInstance.stairDirection3 == "Pick Upholstery Name")) {
			cleaningJobCommandInstance.errors.rejectValue('', 'Must fill in at least one section for the job   ')
		}
		
		if (cleaningJobCommandInstance.groupName == "No Special") {
			if ((cleaningJobCommandInstance.roomName1 != "Pick a Room") &&
				(cleaningJobCommandInstance.roomName2 != "Pick a Room") &&
				(cleaningJobCommandInstance.roomName3 != "Pick a Room") &&
				(cleaningJobCommandInstance.roomName4 != "Pick a Room") &&
				(cleaningJobCommandInstance.roomName5 != "Pick a Room")) {
				cleaningJobCommandInstance.errors.rejectValue('groupName', 'Must pick a Room Special if a Room is picked   ')
			}
		}

		if (cleaningJobCommandInstance.groupName != "No Special") {
			if ((cleaningJobCommandInstance.groupRate == null) ||
				(cleaningJobCommandInstance.groupRate == " ")) {
				cleaningJobCommandInstance.errors.rejectValue('groupRate', 'Must enter a Special Rate if a Room Special is picked   ')
			}
		}
				
		if ((cleaningJobCommandInstance.groupName != "No Special") &&
			(cleaningJobCommandInstance.roomName1 == "Pick a Room")) {
			cleaningJobCommandInstance.errors.rejectValue('roomName1', 'Must pick 1st Room if a Room Special is picked   ')
		} 	
			
		if ((cleaningJobCommandInstance.groupName == "2 Room Special") ||
			(cleaningJobCommandInstance.groupName == "3 Room Special") ||
			(cleaningJobCommandInstance.groupName == "4 Room Special") ||
			(cleaningJobCommandInstance.groupName == "5 Room Special")) {
				if (cleaningJobCommandInstance.roomName2 == "Pick a Room") {
					cleaningJobCommandInstance.errors.rejectValue('roomName2', 'Must pick 2nd Room if a Room Special is picked   ')
				}
		}
		
		if ((cleaningJobCommandInstance.groupName == "3 Room Special") ||
			(cleaningJobCommandInstance.groupName == "4 Room Special") ||
			(cleaningJobCommandInstance.groupName == "5 Room Special")) {
				if (cleaningJobCommandInstance.roomName3 == "Pick a Room") {
					cleaningJobCommandInstance.errors.rejectValue('roomName3', 'Must pick 3rd Room if a Room Special is picked   ')
				}
		}
			
		if ((cleaningJobCommandInstance.groupName == "4 Room Special") ||
			(cleaningJobCommandInstance.groupName == "5 Room Special")) {
				if (cleaningJobCommandInstance.roomName4 == "Pick a Room") {
					cleaningJobCommandInstance.errors.rejectValue('roomName4', 'Must pick 4th Room if a Room Special is picked   ')
				}
		}
		
		if ((cleaningJobCommandInstance.groupName == "5 Room Special")) {
				if (cleaningJobCommandInstance.roomName5 == "Pick a Room") {
					cleaningJobCommandInstance.errors.rejectValue('roomName5', 'Must pick 5th Room if a Room Special is picked   ')
				}
		}

		if ((cleaningJobCommandInstance.roomName1 != "Pick a Room") &&
			(cleaningJobCommandInstance.squareFootage1 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage1', 'Must enter Square Footage of the First Room   ')
		}
		
		if ((cleaningJobCommandInstance.roomName2 != "Pick a Room") &&
			(cleaningJobCommandInstance.squareFootage2 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage2', 'Must enter Square Footage of the Second Room   ')
		}
			
		if ((cleaningJobCommandInstance.roomName3 != "Pick a Room") &&
			(cleaningJobCommandInstance.squareFootage3 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage3', 'Must enter Square Footage of the Third Room   ')
		}
			
		if ((cleaningJobCommandInstance.roomName4 != "Pick a Room") &&
			(cleaningJobCommandInstance.squareFootage4 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage4', 'Must enter Square Footage of the Fourth Room   ')
		}
		
		if ((cleaningJobCommandInstance.roomName5 != "Pick a Room") &&
			(cleaningJobCommandInstance.squareFootage5 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage5', 'Must enter Square Footage of the Fifth Room   ')
		}
			
		if (cleaningJobCommandInstance.hasErrors()) {
			respond cleaningJobCommandInstance.errors, view:'newJob'
			return
		}
		
		def carpetCareJobInstance = new CarpetCareJob(date: cleaningJobCommandInstance.date,
														lead: cleaningJobCommandInstance.lead,
														helper: cleaningJobCommandInstance.helper,
														customerId: cleaningJobCommandInstance.customerId,
														groupName: cleaningJobCommandInstance.groupName,
														groupRate: cleaningJobCommandInstance.groupRate,
														comment: cleaningJobCommandInstance.comment)
		
		def carpetCareJob = carpetCareJobInstance.save(flush:true)
		if (carpetCareJob == null) {
			cleaningJobCommandInstance.errors.reject(
				'Error saving the Job record',
				['', 'class CarpetCareJob'] as Object[],
				'Error saving the Job record')
			respond cleaningJobCommandInstance.errors, view:'newJob'
			return
		}
		
		//Group rooms
		if (cleaningJobCommandInstance.roomName1 != "Pick a Room") {
			def roomInstance1 = new Room(jobId: carpetCareJob.id,
				inGroup: true,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName1,
				squareFootage: cleaningJobCommandInstance.squareFootage1,
				roomCharge: 0.00,
				preVacCharge: cleaningJobCommandInstance.preVacCharge1,
				protectorCharge: cleaningJobCommandInstance.protectorCharge1,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge1,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if (!roomInstance1.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Room 1 record of a Group',
					['', 'class Room'] as Object[],
					'Error saving Room 1 record of a Group')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.roomName2 != "Pick a Room") {
			def roomInstance2 = new Room(jobId: carpetCareJob.id,
				inGroup: true,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName2,
				squareFootage: cleaningJobCommandInstance.squareFootage2,
				roomCharge: 0.00,
				preVacCharge: cleaningJobCommandInstance.preVacCharge2,
				protectorCharge: cleaningJobCommandInstance.protectorCharge2,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge2,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if (!roomInstance2.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Room 2 record of a Group',
					['', 'class Room'] as Object[],
					'Error saving Room 2 record of a Group')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
					
		if (cleaningJobCommandInstance.roomName3 != "Pick a Room") {
			def roomInstance3 = new Room(jobId: carpetCareJob.id,
				inGroup: true,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName3,
				squareFootage: cleaningJobCommandInstance.squareFootage3,
				roomCharge: 0.00,
				preVacCharge: cleaningJobCommandInstance.preVacCharge3,
				protectorCharge: cleaningJobCommandInstance.protectorCharge3,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge3,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if (!roomInstance3.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Room 3 record of a Group',
					['', 'class Room'] as Object[],
					'Error saving Room 3 record of a Group')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		if (cleaningJobCommandInstance.roomName4 != "Pick a Room") {
			def roomInstance4 = new Room(jobId: carpetCareJob.id,
				inGroup: true,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName4,
				squareFootage: cleaningJobCommandInstance.squareFootage4,
				roomCharge: 0.00,
				preVacCharge: cleaningJobCommandInstance.preVacCharge4,
				protectorCharge: cleaningJobCommandInstance.protectorCharge4,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge4,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if (!roomInstance4.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Room 4 record of a Group',
					['', 'class Room'] as Object[],
					'Error saving Room 4 record of a Group')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		if (cleaningJobCommandInstance.roomName5 != "Pick a Room") {
			def roomInstance5 = new Room(jobId: carpetCareJob.id,
				inGroup: true,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName5,
				squareFootage: cleaningJobCommandInstance.squareFootage5,
				roomCharge: 0.00,
				preVacCharge: cleaningJobCommandInstance.preVacCharge5,
				protectorCharge: cleaningJobCommandInstance.protectorCharge5,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge5,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance5.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Room 5 record of a Group',
					['', 'class Room'] as Object[],
					'Error saving Room 5 record of a Group')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Additional Rooms
		if (cleaningJobCommandInstance.roomName != "Pick a Room") {
			def roomInstanceA = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName,
				squareFootage: cleaningJobCommandInstance.squareFootage,
				roomCharge: cleaningJobCommandInstance.roomCharge,
				preVacCharge: cleaningJobCommandInstance.preVacCharge,
				protectorCharge: cleaningJobCommandInstance.protectorCharge,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstanceA.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving first Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving first Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		//Stairs
		if (cleaningJobCommandInstance.stairDirection1 != "Pick a Direction") {
			def stairInstance1 = new Stair(jobId: carpetCareJob.id,
				stairDirection: cleaningJobCommandInstance.stairDirection1,
				stairCount: cleaningJobCommandInstance.stairCount1,
				stairCharge: cleaningJobCommandInstance.stairCharge1)
	
			if (!stairInstance1.save(flush:true)) {
				cleaningJobCommandInstance.errors.reject(
					'Error saving first Stair record',
					['', 'class Stair'] as Object[],
					'Error saving first Stair record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		if (cleaningJobCommandInstance.stairDirection2 != "Pick a Direction") {
			def stairInstance2 = new Stair(jobId: carpetCareJob.id,
				stairDirection: cleaningJobCommandInstance.stairDirection2,
				stairCount: cleaningJobCommandInstance.stairCount2,
				stairCharge: cleaningJobCommandInstance.stairCharge2)
	
			if (!stairInstance2.save(flush:true)) {
				cleaningJobCommandInstance.errors.reject(
					'Error saving second Stair record',
					['', 'class Stair'] as Object[],
					'Error saving second Stair record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		if (cleaningJobCommandInstance.stairDirection3 != "Pick a Direction") {
			def stairInstance3 = new Stair(jobId: carpetCareJob.id,
				stairDirection: cleaningJobCommandInstance.stairDirection3,
				stairCount: cleaningJobCommandInstance.stairCount3,
				stairCharge: cleaningJobCommandInstance.stairCharge3)
	
			if (!stairInstance3.save(flush:true)) {
				cleaningJobCommandInstance.errors.reject(
					'Error saving third Stair record',
					['', 'class Stair'] as Object[],
					'Error saving thir Stair record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		//Hard Surface Rooms
		if (cleaningJobCommandInstance.hsRoomName != "Pick a Room") {
			def hsRoomInstanceA = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge)
	
			if(!hsRoomInstanceA.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving first Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving first Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Upholstery
		if (cleaningJobCommandInstance.upholsteryName != "Pick Upholstery Name") {
			def upholsteryInstanceA = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge)
	
			if(!upholsteryInstanceA.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving first Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving first Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Miscellaneous Charges
		if (cleaningJobCommandInstance.miscChargesName != "Pick Misc. Description") {
			def miscChargesInstanceA = new MiscCharges(jobId: carpetCareJob.id,
				miscDescription: cleaningJobCommandInstance.miscChargesName,
				miscCharge: cleaningJobCommandInstance.miscCharge)
	
			if(!miscChargesInstanceA.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving first Miscellaneous Charge record',
					['', 'class MiscCharges'] as Object[],
					'Error saving first Miscellaneous Charge record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		redirect action: "index", controller: "cleaningJob"

	}

}
