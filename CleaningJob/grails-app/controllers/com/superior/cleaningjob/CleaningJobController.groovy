package com.superior.cleaningjob

import static org.springframework.http.HttpStatus.*

import org.apache.commons.lang.StringUtils;

import com.superior.base.CarpetCareJob;
import com.superior.base.Customer;
import com.superior.base.MiscCharges
import com.superior.base.Room
import com.superior.base.Stair
import com.superior.base.Upholstery
import com.superior.customer.CustomerSearchCommand;

import grails.transaction.Transactional

@Transactional(readOnly = true)
class CleaningJobController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
	def index() {
		CustomerSearchCommand customerSearchCommandInstance = new CustomerSearchCommand()
		respond customerSearchCommandInstance , view:'search'
	}
	
	def search(CustomerSearchCommand customerSearchCommandInstance) {
		if (customerSearchCommandInstance == null) {
			respond customerSearchCommandInstance , view:'search'
			return
		}
		
		def custList = new ArrayList()
		if ((customerSearchCommandInstance.lastName != null) ||
			(customerSearchCommandInstance.firstName != null)) {
			if ((customerSearchCommandInstance.lastName != null) &&
				(customerSearchCommandInstance.firstName != null)) {
				custList = Customer.findAllByLastNameAndFirstName(customerSearchCommandInstance.lastName, customerSearchCommandInstance.firstName)
			} else if (customerSearchCommandInstance.lastName != null) {
					custList = Customer.findAllByLastName(customerSearchCommandInstance.lastName)
			} else if (customerSearchCommandInstance.firstName != null) {
					custList = Customer.findAllByFirstName(customerSearchCommandInstance.firstName)
			}
		} else if ((customerSearchCommandInstance.addressLineOne != null) ||
			(customerSearchCommandInstance.addressLineTwo != null)) {
			if ((customerSearchCommandInstance.addressLineOne != null) &&
				(customerSearchCommandInstance.addressLineTwo != null)) {
				custList = Customer.findAllByAddressLineOneAndAddressLineTwo(customerSearchCommandInstance.addressLineOne, customerSearchCommandInstance.addressLineTwo)
			} else if (customerSearchCommandInstance.addressLineOne != null) {
					custList = Customer.findAllByAddressLineOne(customerSearchCommandInstance.addressLineOne)
			} else if (customerSearchCommandInstance.addressLineTwo != null) {
					custList = Customer.findAllByAddressLineTwo(customerSearchCommandInstance.addressLineTwo)
			}
		}
			
		if (custList.size() > 0) {
			respond custList, view:'summary', model:[customers: custList,
											custListInstanceCount: custList.size()]
			return
		} else {
			customerSearchCommandInstance.errors.rejectValue('', 'No matching Customers Found   ')
			respond customerSearchCommandInstance.errors, view:'search'
			return
		}
	}
	
	def create() {
		respond new Customer(params)
	}
	
	@Transactional
	def saveCustomer(Customer customerInstance) {
		if (customerInstance == null) {
			notFound()
			return
		}

		if (customerInstance.hasErrors()) {
			respond customerInstance.errors, view:'create'
			return
		}

		customerInstance.save flush:true

		redirect action:'newJob', controller: "cleaningJob", params: [id: customerInstance.id]
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

		completenessCheck(cleaningJobCommandInstance)
		
		if (cleaningJobCommandInstance.hasErrors()) {
			respond cleaningJobCommandInstance.errors, view:'newJob'
			return
		}
		
		//Save Records
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
		if (cleaningJobCommandInstance.visible001 == "Y") {
			def roomInstance001 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName001,
				squareFootage: cleaningJobCommandInstance.squareFootage001,
				roomCharge: cleaningJobCommandInstance.roomCharge001,
				preVacCharge: cleaningJobCommandInstance.preVacCharge001,
				protectorCharge: cleaningJobCommandInstance.protectorCharge001,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge001,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance001.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving First Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving First Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible002 == "Y") {
			def roomInstance002 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName002,
				squareFootage: cleaningJobCommandInstance.squareFootage002,
				roomCharge: cleaningJobCommandInstance.roomCharge002,
				preVacCharge: cleaningJobCommandInstance.preVacCharge002,
				protectorCharge: cleaningJobCommandInstance.protectorCharge002,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge002,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance002.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Second Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Second Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible003 == "Y") {
			def roomInstance003 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName003,
				squareFootage: cleaningJobCommandInstance.squareFootage003,
				roomCharge: cleaningJobCommandInstance.roomCharge003,
				preVacCharge: cleaningJobCommandInstance.preVacCharge003,
				protectorCharge: cleaningJobCommandInstance.protectorCharge003,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge003,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance003.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Third Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Third Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible004 == "Y") {
			def roomInstance004 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName004,
				squareFootage: cleaningJobCommandInstance.squareFootage004,
				roomCharge: cleaningJobCommandInstance.roomCharge004,
				preVacCharge: cleaningJobCommandInstance.preVacCharge004,
				protectorCharge: cleaningJobCommandInstance.protectorCharge004,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge004,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance004.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fourth Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Fourth Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible005 == "Y") {
			def roomInstance005 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName005,
				squareFootage: cleaningJobCommandInstance.squareFootage005,
				roomCharge: cleaningJobCommandInstance.roomCharge005,
				preVacCharge: cleaningJobCommandInstance.preVacCharge005,
				protectorCharge: cleaningJobCommandInstance.protectorCharge005,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge005,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance005.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fifth Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Fifth Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible006 == "Y") {
			def roomInstance006 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName006,
				squareFootage: cleaningJobCommandInstance.squareFootage006,
				roomCharge: cleaningJobCommandInstance.roomCharge006,
				preVacCharge: cleaningJobCommandInstance.preVacCharge006,
				protectorCharge: cleaningJobCommandInstance.protectorCharge006,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge006,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance006.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Sixth Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Sixth Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible007 == "Y") {
			def roomInstance007 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName007,
				squareFootage: cleaningJobCommandInstance.squareFootage007,
				roomCharge: cleaningJobCommandInstance.roomCharge007,
				preVacCharge: cleaningJobCommandInstance.preVacCharge007,
				protectorCharge: cleaningJobCommandInstance.protectorCharge007,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge007,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance007.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Seventh Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Seventh Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.visible008 == "Y") {
			def roomInstance008 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: false,
				roomName: cleaningJobCommandInstance.roomName008,
				squareFootage: cleaningJobCommandInstance.squareFootage008,
				roomCharge: cleaningJobCommandInstance.roomCharge008,
				preVacCharge: cleaningJobCommandInstance.preVacCharge008,
				protectorCharge: cleaningJobCommandInstance.protectorCharge008,
				moveFurnitureCharge: cleaningJobCommandInstance.moveFurnitureCharge008,
				etchedCharge: 0.00,
				sealWaxCharge: 0.00)
	
			if(!roomInstance008.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Eighth Additional Room record',
					['', 'class Room'] as Object[],
					'Error saving Eighth Additional Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Stairs
		if (cleaningJobCommandInstance.stairVisible1 == "Y") {
			def stairInstance1 = new Stair(jobId: carpetCareJob.id,
				stairDirection: cleaningJobCommandInstance.stairDirection1,
				stairCount: cleaningJobCommandInstance.stairCount1,
				stairCharge: cleaningJobCommandInstance.stairCharge1)
	
			if (!stairInstance1.save(flush:true)) {
				cleaningJobCommandInstance.errors.reject(
					'Error saving First Stair record',
					['', 'class Stair'] as Object[],
					'Error saving First Stair record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		if (cleaningJobCommandInstance.stairVisible2 == "Y") {
			def stairInstance2 = new Stair(jobId: carpetCareJob.id,
				stairDirection: cleaningJobCommandInstance.stairDirection2,
				stairCount: cleaningJobCommandInstance.stairCount2,
				stairCharge: cleaningJobCommandInstance.stairCharge2)
	
			if (!stairInstance2.save(flush:true)) {
				cleaningJobCommandInstance.errors.reject(
					'Error saving Second Stair record',
					['', 'class Stair'] as Object[],
					'Error saving Second Stair record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		if (cleaningJobCommandInstance.stairVisible3 == "Y") {
			def stairInstance3 = new Stair(jobId: carpetCareJob.id,
				stairDirection: cleaningJobCommandInstance.stairDirection3,
				stairCount: cleaningJobCommandInstance.stairCount3,
				stairCharge: cleaningJobCommandInstance.stairCharge3)
	
			if (!stairInstance3.save(flush:true)) {
				cleaningJobCommandInstance.errors.reject(
					'Error saving Third Stair record',
					['', 'class Stair'] as Object[],
					'Error saving third Stair record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
			
		//Hard Surface Rooms
		if (cleaningJobCommandInstance.hsVisible1 == "Y") {
			def hsRoomInstance1 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName1,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage1,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge1,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge1,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge1)
	
			if(!hsRoomInstance1.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving First Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving First Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.hsVisible2 == "Y") {
			def hsRoomInstance2 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName2,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage2,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge2,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge2,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge2)
	
			if(!hsRoomInstance2.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Second Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving Second Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.hsVisible3 == "Y") {
			def hsRoomInstance3 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName3,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage3,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge3,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge3,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge3)
	
			if(!hsRoomInstance3.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Third Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving Third Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.hsVisible4 == "Y") {
			def hsRoomInstance4 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName4,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage4,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge4,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge4,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge4)
	
			if(!hsRoomInstance4.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fourth Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving Fourth Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.hsVisible5 == "Y") {
			def hsRoomInstance5 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName5,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage5,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge5,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge5,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge5)
	
			if(!hsRoomInstance5.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fifth Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving Fifth Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.hsVisible6 == "Y") {
			def hsRoomInstance6 = new Room(jobId: carpetCareJob.id,
				inGroup: false,
				hardSurface: true,
				roomName: cleaningJobCommandInstance.hsRoomName6,
				squareFootage: cleaningJobCommandInstance.hsSquareFootage6,
				roomCharge: cleaningJobCommandInstance.hsRoomCharge6,
				preVacCharge: 0.00,
				protectorCharge: 0.00,
				moveFurnitureCharge: 0.00,
				etchedCharge: cleaningJobCommandInstance.hsEtchedCharge6,
				sealWaxCharge: cleaningJobCommandInstance.hsSealedWaxedCharge6)
	
			if(!hsRoomInstance6.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Sixth Hard Surface Room record',
					['', 'class Room'] as Object[],
					'Error saving Sixth Hard Surface Room record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Upholstery
		if (cleaningJobCommandInstance.uVisible1 == "Y") {
			def upholsteryInstance1 = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName1,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount1,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge1,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge1)
	
			if(!upholsteryInstance1.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving First Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving First Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.uVisible2 == "Y") {
			def upholsteryInstance2 = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName2,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount2,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge2,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge2)
	
			if(!upholsteryInstance2.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Second Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving Second Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.uVisible3 == "Y") {
			def upholsteryInstance3 = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName3,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount3,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge3,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge3)
	
			if(!upholsteryInstance3.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Third Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving Third Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.uVisible4 == "Y") {
			def upholsteryInstance4 = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName4,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount4,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge4,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge4)
	
			if(!upholsteryInstance4.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fourth Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving Fourth Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.uVisible5 == "Y") {
			def upholsteryInstance5 = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName5,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount5,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge5,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge5)
	
			if(!upholsteryInstance5.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fifth Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving Fifth Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.uVisible6 == "Y") {
			def upholsteryInstance6 = new Upholstery(jobId: carpetCareJob.id,
				upholsteryName: cleaningJobCommandInstance.upholsteryName6,
				upholsteryCount: cleaningJobCommandInstance.upholsteryCount6,
				upholsteryCharge: cleaningJobCommandInstance.upholsteryCharge6,
				upholsteryProtectorCharge: cleaningJobCommandInstance.upholsteryProtectorCharge6)
	
			if(!upholsteryInstance6.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Sixth Upholstery record',
					['', 'class Upholstery'] as Object[],
					'Error saving Sixth Upholstery record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Miscellaneous Charges
		if (cleaningJobCommandInstance.miscVisible1 == "Y") {
			def miscChargesInstance1 = new MiscCharges(jobId: carpetCareJob.id,
				miscDescription: cleaningJobCommandInstance.miscChargesName1,
				miscCharge: cleaningJobCommandInstance.miscCharge1)
	
			if(!miscChargesInstance1.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving First Miscellaneous Charge record',
					['', 'class MiscCharges'] as Object[],
					'Error saving First Miscellaneous Charge record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.miscVisible2 == "Y") {
			def miscChargesInstance2 = new MiscCharges(jobId: carpetCareJob.id,
				miscDescription: cleaningJobCommandInstance.miscChargesName2,
				miscCharge: cleaningJobCommandInstance.miscCharge2)
	
			if(!miscChargesInstance2.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Second Miscellaneous Charge record',
					['', 'class MiscCharges'] as Object[],
					'Error saving Second Miscellaneous Charge record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (cleaningJobCommandInstance.miscVisible3 == "Y") {
			def miscChargesInstance3 = new MiscCharges(jobId: carpetCareJob.id,
				miscDescription: cleaningJobCommandInstance.miscChargesName3,
				miscCharge: cleaningJobCommandInstance.miscCharge3)
	
			if(!miscChargesInstance3.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Third Miscellaneous Charge record',
					['', 'class MiscCharges'] as Object[],
					'Error saving Third Miscellaneous Charge record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		if (cleaningJobCommandInstance.miscVisible4 == "Y") {
			def miscChargesInstance4 = new MiscCharges(jobId: carpetCareJob.id,
				miscDescription: cleaningJobCommandInstance.miscChargesName4,
				miscCharge: cleaningJobCommandInstance.miscCharge4)
	
			if(!miscChargesInstance4.save(flush:true)) {
				carpetCareJobInstance.delete()
				cleaningJobCommandInstance.errors.reject(
					'Error saving Fourth Miscellaneous Charge record',
					['', 'class MiscCharges'] as Object[],
					'Error saving Fourth Miscellaneous Charge record')
				respond cleaningJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
//		if (cleaningJobCommandInstance.miscVisible5 == "Y") {
//			def miscChargesInstance5 = new MiscCharges(jobId: carpetCareJob.id,
//				miscDescription: cleaningJobCommandInstance.miscChargesName5,
//				miscCharge: cleaningJobCommandInstance.miscCharge5)
//	
//			if(!miscChargesInstance5.save(flush:true)) {
//				carpetCareJobInstance.delete()
//				cleaningJobCommandInstance.errors.reject(
//					'Error saving Fifth Miscellaneous Charge record',
//					['', 'class MiscCharges'] as Object[],
//					'Error saving Fifth Miscellaneous Charge record')
//				respond cleaningJobCommandInstance.errors, view:'newJob'
//				return
//			}
//		}
//		
//		if (cleaningJobCommandInstance.miscVisible6 == "Y") {
//			def miscChargesInstance6 = new MiscCharges(jobId: carpetCareJob.id,
//				miscDescription: cleaningJobCommandInstance.miscChargesName6,
//				miscCharge: cleaningJobCommandInstance.miscCharge6)
//	
//			if(!miscChargesInstance6.save(flush:true)) {
//				carpetCareJobInstance.delete()
//				cleaningJobCommandInstance.errors.reject(
//					'Error saving Sixth Miscellaneous Charge record',
//					['', 'class MiscCharges'] as Object[],
//					'Error saving Sixth Miscellaneous Charge record')
//				respond cleaningJobCommandInstance.errors, view:'newJob'
//				return
//			}
//		}
		
//		if (cleaningJobCommandInstance.miscVisible7 == "Y") {
//			def miscChargesInstance7 = new MiscCharges(jobId: carpetCareJob.id,
//				miscDescription: cleaningJobCommandInstance.miscChargesName7,
//				miscCharge: cleaningJobCommandInstance.miscCharge7)
//	
//			if(!miscChargesInstance7.save(flush:true)) {
//				carpetCareJobInstance.delete()
//				cleaningJobCommandInstance.errors.reject(
//					'Error saving Seventh Miscellaneous Charge record',
//					['', 'class MiscCharges'] as Object[],
//					'Error saving Seventh Miscellaneous Charge record')
//				respond cleaningJobCommandInstance.errors, view:'newJob'
//				return
//			}
//		}
//		
//		if (cleaningJobCommandInstance.miscVisible8 == "Y") {
//			def miscChargesInstance8 = new MiscCharges(jobId: carpetCareJob.id,
//				miscDescription: cleaningJobCommandInstance.miscChargesName8,
//				miscCharge: cleaningJobCommandInstance.miscCharge8)
//	
//			if(!miscChargesInstance8.save(flush:true)) {
//				carpetCareJobInstance.delete()
//				cleaningJobCommandInstance.errors.reject(
//					'Error saving Eighth Miscellaneous Charge record',
//					['', 'class MiscCharges'] as Object[],
//					'Error saving Eighth Miscellaneous Charge record')
//				respond cleaningJobCommandInstance.errors, view:'newJob'
//				return
//			}
//		}

		redirect action: "index", controller: "cleaningJob"

	}

	private completenessCheck(CleaningJobCommand cleaningJobCommandInstance) {
		if (cleaningJobCommandInstance.lead == "Pick a Name") {
			cleaningJobCommandInstance.errors.rejectValue('lead', 'Must pick a Lead Name   ')
		}

		if ((cleaningJobCommandInstance.groupName == "No Special") &&
		(cleaningJobCommandInstance.visible001 != "Y") &&
		(cleaningJobCommandInstance.hsVisible1 != "Y") &&
		(cleaningJobCommandInstance.miscVisible1 != "Y") &&
		(cleaningJobCommandInstance.stairVisible1 != "Y") &&
		(cleaningJobCommandInstance.uVisible1 != "Y")) {
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

		//Additional Rooms
		if ((cleaningJobCommandInstance.visible001 == "Y") &&
		(cleaningJobCommandInstance.roomName001 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName001', 'Must enter Room Name of the First Room   ')
		}

		if ((cleaningJobCommandInstance.visible001 == "Y") &&
		(cleaningJobCommandInstance.squareFootage001 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage001', 'Must enter Square Footage of the First Room   ')
		}

		if ((cleaningJobCommandInstance.visible002 == "Y") &&
		(cleaningJobCommandInstance.roomName002 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName002', 'Must enter Room Name of the Second Room   ')
		}

		if ((cleaningJobCommandInstance.visible002 == "Y") &&
		(cleaningJobCommandInstance.squareFootage002 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage002', 'Must enter Square Footage of the Second Room   ')
		}

		if ((cleaningJobCommandInstance.visible003 == "Y") &&
		(cleaningJobCommandInstance.roomName003 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName003', 'Must enter Room Name of the Third Room   ')
		}

		if ((cleaningJobCommandInstance.visible003 == "Y") &&
		(cleaningJobCommandInstance.squareFootage003 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage003', 'Must enter Square Footage of the Third Room   ')
		}

		if ((cleaningJobCommandInstance.visible004 == "Y") &&
		(cleaningJobCommandInstance.roomName004 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName004', 'Must enter Room Name of the Fourth Room   ')
		}

		if ((cleaningJobCommandInstance.visible004 == "Y") &&
		(cleaningJobCommandInstance.squareFootage004 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage004', 'Must enter Square Footage of the Fourth Room   ')
		}

		if ((cleaningJobCommandInstance.visible005 == "Y") &&
		(cleaningJobCommandInstance.roomName005 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName005', 'Must enter Room Name of the Fifth Room   ')
		}

		if ((cleaningJobCommandInstance.visible005 == "Y") &&
		(cleaningJobCommandInstance.squareFootage005 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage005', 'Must enter Square Footage of the Fifth Room   ')
		}

		if ((cleaningJobCommandInstance.visible006 == "Y") &&
		(cleaningJobCommandInstance.roomName006 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName006', 'Must enter Room Name of the Sixth Room   ')
		}

		if ((cleaningJobCommandInstance.visible006 == "Y") &&
		(cleaningJobCommandInstance.squareFootage006 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage006', 'Must enter Square Footage of the Sixth Room   ')
		}

		if ((cleaningJobCommandInstance.visible007 == "Y") &&
		(cleaningJobCommandInstance.roomName007 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName007', 'Must enter Room Name of the Seventh Room   ')
		}

		if ((cleaningJobCommandInstance.visible007 == "Y") &&
		(cleaningJobCommandInstance.squareFootage007 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage007', 'Must enter Square Footage of the Seventh Room   ')
		}

		if ((cleaningJobCommandInstance.visible008 == "Y") &&
		(cleaningJobCommandInstance.roomName008 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('roomName008', 'Must enter Room Name of the Eighth Room   ')
		}

		if ((cleaningJobCommandInstance.visible008 == "Y") &&
		(cleaningJobCommandInstance.squareFootage008 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('squareFootage008', 'Must enter Square Footage of the Eighth Room   ')
		}
		
		//Hard Surface Rooms
		if ((cleaningJobCommandInstance.hsVisible1 == "Y") &&
		(cleaningJobCommandInstance.hsRoomName1 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsRoomName1', 'Must enter Room Name of the First Hard Surface Room   ')
		}

		if ((cleaningJobCommandInstance.hsVisible1 == "Y") &&
		(cleaningJobCommandInstance.hsSquareFootage1 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsSquareFootage1', 'Must enter Square Footage of the First Hard Surface Room   ')
		}

		if ((cleaningJobCommandInstance.hsVisible2 == "Y") &&
		(cleaningJobCommandInstance.hsRoomName2 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsRoomName2', 'Must enter Room Name of the Second Hard Surface Room   ')
		}

		if ((cleaningJobCommandInstance.hsVisible2 == "Y") &&
		(cleaningJobCommandInstance.hsSquareFootage2 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsSquareFootage2', 'Must enter Square Footage of the Second Hard Surface Room   ')
		}
		
		if ((cleaningJobCommandInstance.hsVisible3 == "Y") &&
			(cleaningJobCommandInstance.hsRoomName3 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('hsRoomName3', 'Must enter Room Name of the Third Hard Surface Room   ')
		}
	
		if ((cleaningJobCommandInstance.hsVisible3 == "Y") &&
		(cleaningJobCommandInstance.hsSquareFootage3 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsSquareFootage3', 'Must enter Square Footage of the Third Hard Surface Room   ')
		}
		
		if ((cleaningJobCommandInstance.hsVisible4 == "Y") &&
			(cleaningJobCommandInstance.hsRoomName4 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('hsRoomName4', 'Must enter Room Name of the Fourth Hard Surface Room   ')
		}
		
		if ((cleaningJobCommandInstance.hsVisible4 == "Y") &&
		(cleaningJobCommandInstance.hsSquareFootage4 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsSquareFootage4', 'Must enter Square Footage of the Fourth Hard Surface Room   ')
		}
		
		if ((cleaningJobCommandInstance.hsVisible5 == "Y") &&
			(cleaningJobCommandInstance.hsRoomName5 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('hsRoomName5', 'Must enter Room Name of the Fifth Hard Surface Room   ')
		}
			
		if ((cleaningJobCommandInstance.hsVisible5 == "Y") &&
		(cleaningJobCommandInstance.hsSquareFootage5 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsSquareFootage5', 'Must enter Square Footage of the Fifth Hard Surface Room   ')
		}
		
		if ((cleaningJobCommandInstance.hsVisible6 == "Y") &&
			(cleaningJobCommandInstance.hsRoomName6 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('hsRoomName6', 'Must enter Room Name of the Sixth Hard Surface Room   ')
		}
				
		if ((cleaningJobCommandInstance.hsVisible6 == "Y") &&
		(cleaningJobCommandInstance.hsSquareFootage6 == null)) {
			cleaningJobCommandInstance.errors.rejectValue('hsSquareFootage6', 'Must enter Square Footage of the Sixth Hard Surface Room   ')
		}
		
		if ((cleaningJobCommandInstance.stairVisible1 == "Y") &&
			(cleaningJobCommandInstance.stairDirection1 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('stairDirection1', 'Must enter a Stair Direction of the First Stair Set   ')
		}
			
		if ((cleaningJobCommandInstance.stairVisible1 == "Y") &&
			(cleaningJobCommandInstance.stairCount1 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('stairCount1', 'Must enter a Stair Count of the First Stair Set   ')
		}
		
		if ((cleaningJobCommandInstance.stairVisible2 == "Y") &&
			(cleaningJobCommandInstance.stairDirection2 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('stairDirection2', 'Must enter a Stair Direction of the Second Stair Set   ')
		}
		
		if ((cleaningJobCommandInstance.stairVisible2 == "Y") &&
			(cleaningJobCommandInstance.stairCount2 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('stairCount2', 'Must enter a Stair Count of the Second Stair Set   ')
		}
			
		if ((cleaningJobCommandInstance.stairVisible3 == "Y") &&
			(cleaningJobCommandInstance.stairDirection3 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('stairDirection3', 'Must enter a Stair Direction of the Third Stair Set   ')
		}
			
		if ((cleaningJobCommandInstance.stairVisible3 == "Y") &&
			(cleaningJobCommandInstance.stairCount3 == null)) {
				cleaningJobCommandInstance.errors.rejectValue('stairCount3', 'Must enter a Stair Count of the Third Stair Set   ')
		}
	}

}
