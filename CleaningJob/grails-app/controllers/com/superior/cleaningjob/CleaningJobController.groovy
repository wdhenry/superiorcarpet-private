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
		for (int i = 1; i < 6; i++) {
			if (cleaningJobCommandInstance."roomName${i}" != "Pick a Room") {
				def roomInstance = new Room(jobId: carpetCareJob.id,
					inGroup: true,
					hardSurface: false,
					roomName: cleaningJobCommandInstance."roomName${i}",
					squareFootage: cleaningJobCommandInstance."squareFootage${i}",
					roomCharge: 0.00,
					preVacCharge: cleaningJobCommandInstance."preVacCharge${i}",
					protectorCharge: cleaningJobCommandInstance."protectorCharge${i}",
					moveFurnitureCharge: cleaningJobCommandInstance."moveFurnitureCharge${i}",
					etchedCharge: 0.00,
					sealWaxCharge: 0.00)
				
				if (!roomInstance.save(flush:true)) {
					carpetCareJobInstance.delete()
					cleaningJobCommandInstance.errors.reject(
						"Error saving Room ${i} record of a Group",
						['', 'class Room'] as Object[],
						"Error saving Room ${i} record of a Group")
					respond cleaningJobCommandInstance.errors, view:'newJob'
					return
				}
			}
		}
		
		//Additional Rooms
		for (int i = 1; i < 9; i++) {
			if (cleaningJobCommandInstance."visible00${i}" == "Y") {
				def roomInstance = new Room(jobId: carpetCareJob.id,
					inGroup: false,
					hardSurface: false,
					roomName: cleaningJobCommandInstance."roomName00${i}",
					squareFootage: cleaningJobCommandInstance."squareFootage00${i}",
					roomCharge: cleaningJobCommandInstance."roomCharge00${i}",
					preVacCharge: cleaningJobCommandInstance."preVacCharge00${i}",
					protectorCharge: cleaningJobCommandInstance."protectorCharge00${i}",
					moveFurnitureCharge: cleaningJobCommandInstance."moveFurnitureCharge00${i}",
					etchedCharge: 0.00,
					sealWaxCharge: 0.00)
		
				if(!roomInstance.save(flush:true)) {
					carpetCareJobInstance.delete()
					cleaningJobCommandInstance.errors.reject(
						"Error saving Additional Room record numbet ${i}",
						['', 'class Room'] as Object[],
						"Error saving Additional Room record ${i}")
					respond cleaningJobCommandInstance.errors, view:'newJob'
					return
				}
			}
		}
		
		//Stairs
		for (int i = 1; i < 4; i++) {
			if (cleaningJobCommandInstance."stairVisible${i}" == "Y") {
				def stairInstance = new Stair(jobId: carpetCareJob.id,
					stairDirection: cleaningJobCommandInstance."stairDirection${i}",
					stairCount: cleaningJobCommandInstance."stairCount${i}",
					stairCharge: cleaningJobCommandInstance."stairCharge${i}")
		
				if (!stairInstance.save(flush:true)) {
					cleaningJobCommandInstance.errors.reject(
						"Error saving Stair record ${i}",
						['', 'class Stair'] as Object[],
						"Error saving Stair record ${i}")
					respond cleaningJobCommandInstance.errors, view:'newJob'
					return
				}
			}
		}
			
		//Hard Surface Rooms
		for (int i = 1; i < 7; i++) {
			if (cleaningJobCommandInstance."hsVisible${i}" == "Y") {
				def hsRoomInstance = new Room(jobId: carpetCareJob.id,
					inGroup: false,
					hardSurface: true,
					roomName: cleaningJobCommandInstance."hsRoomName${i}",
					squareFootage: cleaningJobCommandInstance."hsSquareFootage${i}",
					roomCharge: cleaningJobCommandInstance."hsRoomCharge${i}",
					preVacCharge: 0.00,
					protectorCharge: 0.00,
					moveFurnitureCharge: 0.00,
					etchedCharge: cleaningJobCommandInstance."hsEtchedCharge${i}",
					sealWaxCharge: cleaningJobCommandInstance."hsSealedWaxedCharge${i}")
		
				if(!hsRoomInstance.save(flush:true)) {
					carpetCareJobInstance.delete()
					cleaningJobCommandInstance.errors.reject(
						"Error saving Hard Surface Room record ${i}",
						['', 'class Room'] as Object[],
						"Error saving Hard Surface Room record ${i}")
					respond cleaningJobCommandInstance.errors, view:'newJob'
					return
				}
			}
		}
		
		//Upholstery
		for (int i = 1; i < 7; i++) {
			if (cleaningJobCommandInstance."uVisible${i}" == "Y") {
				def upholsteryInstance = new Upholstery(jobId: carpetCareJob.id,
					upholsteryName: cleaningJobCommandInstance."upholsteryName${i}",
					upholsteryCount: cleaningJobCommandInstance."upholsteryCount${i}",
					upholsteryCharge: cleaningJobCommandInstance."upholsteryCharge${i}",
					upholsteryProtectorCharge: cleaningJobCommandInstance."upholsteryProtectorCharge${i}")
		
				if(!upholsteryInstance.save(flush:true)) {
					carpetCareJobInstance.delete()
					cleaningJobCommandInstance.errors.reject(
						"Error saving Upholstery record ${i}",
						['', 'class Upholstery'] as Object[],
						"Error saving Upholstery record ${i}")
					respond cleaningJobCommandInstance.errors, view:'newJob'
					return
				}
			}
		}
		
		//Miscellaneous Charges
		for (int i = 1; i < 5; i++) {
			if (cleaningJobCommandInstance."miscVisible${i}" == "Y") {
				def miscChargesInstance = new MiscCharges(jobId: carpetCareJob.id,
					miscDescription: cleaningJobCommandInstance."miscChargesName${i}",
					miscCharge: cleaningJobCommandInstance."miscCharge${i}")
		
				if(!miscChargesInstance.save(flush:true)) {
					carpetCareJobInstance.delete()
					cleaningJobCommandInstance.errors.reject(
						"Error saving Miscellaneous Charge record ${i}",
						['', 'class MiscCharges'] as Object[],
						"Error saving Miscellaneous Charge record ${i}")
					respond cleaningJobCommandInstance.errors, view:'newJob'
					return
				}
			}
		}

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

		for (int i = 1; i < 6; i++) {
			if ((cleaningJobCommandInstance."roomName${i}" != "Pick a Room") &&
				(cleaningJobCommandInstance."squareFootage${i}" == null)) {
					cleaningJobCommandInstance.errors.rejectValue("squareFootage${i}", "Must enter Square Footage of Room Number ${i}   ")
			}
		}

		//Additional Rooms
		for (int i = 1; i < 9; i++) {
			if (cleaningJobCommandInstance."visible00${i}" == "Y") {
				if (cleaningJobCommandInstance."roomName00${i}" == null) {
					cleaningJobCommandInstance.errors.rejectValue("roomName00${i}", "Must enter Room Name for Room ${i}   ")
				}
				if (cleaningJobCommandInstance."squareFootage00${i}" == null) {
					cleaningJobCommandInstance.errors.rejectValue("squareFootage00${i}", "Must enter Square Footage for Room ${i}   ")
				}
			}
		}
		
		//Hard Surface Rooms
		for (int i = 1; i < 7; i++) {
			if (cleaningJobCommandInstance."hsVisible${i}" == "Y") {
				if (cleaningJobCommandInstance."hsRoomName${i}" == null) {
					cleaningJobCommandInstance.errors.rejectValue("hsRoomName${i}", "Must enter Room Name for Hard Surface Room ${i}   ")
				}
	
				if (cleaningJobCommandInstance."hsSquareFootage${i}" == null) {
					cleaningJobCommandInstance.errors.rejectValue("hsSquareFootage${i}", "Must enter Square Footage for Hard Surface Room ${i}   ")
				}
			}	
		}
		
		//Stairs
		for (int i = 1; i < 4; i++) {
			if (cleaningJobCommandInstance."stairVisible${i}" == "Y") {
				if (cleaningJobCommandInstance."stairDirection${i}" == null) {
					cleaningJobCommandInstance.errors.rejectValue("stairDirection${i}", "Must enter a Stair Direction for Stair Set ${i}   ")
				}
			
				if (cleaningJobCommandInstance."stairCount${i}" == null) {
					cleaningJobCommandInstance.errors.rejectValue("stairCount${i}", "Must enter a Stair Count for Stair Set ${i}   ")
				}
			} 	
		}
	}
}
