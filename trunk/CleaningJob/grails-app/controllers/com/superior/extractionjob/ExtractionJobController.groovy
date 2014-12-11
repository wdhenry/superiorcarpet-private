package com.superior.extractionjob

import com.superior.base.Customer;
import com.superior.base.Dehumidifiers
import com.superior.base.Fans
import com.superior.base.WaterExtractionJob
import com.superior.cleaningjob.CleaningJobCommand;
import com.superior.extractionjob.ExtractionJobCommand

import grails.transaction.Transactional

import java.text.SimpleDateFormat

@Transactional(readOnly = true)
class ExtractionJobController {

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

		redirect action: "index", controller: "extractionJob"
	}
	
	def newJob(Customer customerInstance) {
		ExtractionJobCommand extractionJobCommandInstance = new ExtractionJobCommand(customerId: customerInstance.id,
															firstName: customerInstance.firstName,
															lastName: customerInstance.lastName)
		respond extractionJobCommandInstance
	}
			
	@Transactional
	def saveJob(ExtractionJobCommand extractionJobCommandInstance) {
		
		if (extractionJobCommandInstance == null) {
			notFound()
			return
		}

		if (extractionJobCommandInstance.lead == "Pick a Name") {
			extractionJobCommandInstance.errors.rejectValue('lead', 'Must pick a Lead Name   ')
		}
		
		if (extractionJobCommandInstance.fanId1 != "0") {
			if ((extractionJobCommandInstance.fanId1 == extractionJobCommandInstance.fanId2) ||
				(extractionJobCommandInstance.fanId1 == extractionJobCommandInstance.fanId3) ||
				(extractionJobCommandInstance.fanId1 == extractionJobCommandInstance.fanId4)) {
				extractionJobCommandInstance.errors.rejectValue('fanId1', 'First Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanId2 != "0") {
			if ((extractionJobCommandInstance.fanId2 == extractionJobCommandInstance.fanId1) ||
				(extractionJobCommandInstance.fanId2 == extractionJobCommandInstance.fanId3) ||
				(extractionJobCommandInstance.fanId2 == extractionJobCommandInstance.fanId4)) {
				extractionJobCommandInstance.errors.rejectValue('fanId2', 'Second Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanId3 != "0") {
			if ((extractionJobCommandInstance.fanId3 == extractionJobCommandInstance.fanId1) ||
				(extractionJobCommandInstance.fanId3 == extractionJobCommandInstance.fanId2) ||
				(extractionJobCommandInstance.fanId3 == extractionJobCommandInstance.fanId4)) {
				extractionJobCommandInstance.errors.rejectValue('fanId3', 'Third Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanId4 != "0") {
			if ((extractionJobCommandInstance.fanId4 == extractionJobCommandInstance.fanId1) ||
				(extractionJobCommandInstance.fanId4 == extractionJobCommandInstance.fanId2) ||
				(extractionJobCommandInstance.fanId4 == extractionJobCommandInstance.fanId3)) {
				extractionJobCommandInstance.errors.rejectValue('fanId4', 'Fourth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuId1 != "0") {
			if ((extractionJobCommandInstance.dehuId1 == extractionJobCommandInstance.dehuId2) ||
				(extractionJobCommandInstance.dehuId1 == extractionJobCommandInstance.dehuId3) ||
				(extractionJobCommandInstance.dehuId1 == extractionJobCommandInstance.dehuId4)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId1', 'First Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuId2 != "0") {
			if ((extractionJobCommandInstance.dehuId2 == extractionJobCommandInstance.dehuId1) ||
				(extractionJobCommandInstance.dehuId2 == extractionJobCommandInstance.dehuId3) ||
				(extractionJobCommandInstance.dehuId2 == extractionJobCommandInstance.dehuId4)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId2', 'Second Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuId3 != "0") {
			if ((extractionJobCommandInstance.dehuId3 == extractionJobCommandInstance.dehuId1) ||
				(extractionJobCommandInstance.dehuId3 == extractionJobCommandInstance.dehuId2) ||
				(extractionJobCommandInstance.dehuId3 == extractionJobCommandInstance.dehuId4)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId3', 'Third Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuId4 != "0") {
			if ((extractionJobCommandInstance.dehuId4 == extractionJobCommandInstance.dehuId1) ||
				(extractionJobCommandInstance.dehuId4 == extractionJobCommandInstance.dehuId2) ||
				(extractionJobCommandInstance.dehuId4 == extractionJobCommandInstance.dehuId3)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId4', 'Fourth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.hasErrors()) {
			respond extractionJobCommandInstance.errors, view:'newJob'
			return
		}
		
		def df = new SimpleDateFormat("MM/dd/yyyy")

		def stringDay = df.format(extractionJobCommandInstance.date)
		def stringStartTime = extractionJobCommandInstance.startHour + ":" + 
								extractionJobCommandInstance.startMinute + ":" + 
								extractionJobCommandInstance.startAmPm
		def startDate = new SimpleDateFormat("MM/dd/yyyy-h:mm:a").parse(stringDay + "-" + stringStartTime)
		
		def stringEndTime = extractionJobCommandInstance.endHour + ":" +
								extractionJobCommandInstance.endMinute + ":" +
								extractionJobCommandInstance.endAmPm
		def endDate = new SimpleDateFormat("MM/dd/yyyy-h:mm:a").parse(stringDay + "-" + stringEndTime)
		
		def waterExtractionJobInstance = new WaterExtractionJob(
											date: extractionJobCommandInstance.date,
											lead: extractionJobCommandInstance.lead,
											helper: extractionJobCommandInstance.helper,
											customerId: extractionJobCommandInstance.customerId,
											startTime: startDate,
											endTime: endDate)

		def waterExtractionJob = waterExtractionJobInstance.save(flush:true)
		if (waterExtractionJob == null) {
			extractionJobCommandInstance.errors.reject(
			'Error saving the Job record',
			['', 'class WaterExtractionJob'] as Object[],
			'Error saving the Job record')
			respond extractionJobCommandInstance.errors, view:'newJob'
			return
		}
		
		//Fans	
		if (extractionJobCommandInstance.fanId1 != "0") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId1)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Fan 1 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 1 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanId2 != "0") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId2)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Fan 2 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 2 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanId3 != "0") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId3)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Fan 3 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 3 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanId4 != "0") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId4)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Fan 4 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 4 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}

		//Dehumidifiers
		if (extractionJobCommandInstance.dehuId1 != "0") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId1)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Dehumidifier 1 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 1 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuId2 != "0") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId2)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Dehumidifier 2 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 2 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuId3 != "0") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId3)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Dehumidifier 3 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 3 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuId4 != "0") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId4)
			f.jobId = waterExtractionJob.id
			f.dateOut = extractionJobCommandInstance.date
			f.dateIn = null
			f.isIn = false
			f.leadOut = extractionJobCommandInstance.lead
			f.helperOut = extractionJobCommandInstance.helper
			f.leadIn = " "
			f.helperIn = " "
	
			if (!f.save(flush:true)) {
				carpetCareJobInstance.delete()
				waterExtractionJobCommandInstance.errors.reject(
					'Error saving Dehumidifier 4 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 4 record')
				respond waterExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}

				
		redirect action: "index", controller: "extractionJob"
	}
}
