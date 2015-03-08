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
		
		if (extractionJobCommandInstance.fanVisible01 == "Y") {
			if ((extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId01 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId01', 'First Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible02 == "Y") {
			if ((extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId02 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId02', 'Second Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible03 == "Y") {
			if ((extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId03 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId03', 'Third Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible04 == "Y") {
			if ((extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId04 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId04', 'Fourth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible05 == "Y") {
			if ((extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId05 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId05', 'Fifth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible06 == "Y") {
			if ((extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId06 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId06', 'Sixth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible07 == "Y") {
			if ((extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId07 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId07', 'Seventh Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible08 == "Y") {
			if ((extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId08 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId08', 'Eighth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible09 == "Y") {
			if ((extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId09 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId09', 'Ninth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible10 == "Y") {
			if ((extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId10 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId10', 'Tenth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible11 == "Y") {
			if ((extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId01) ||
				(extractionJobCommandInstance.fanId11 == extractionJobCommandInstance.fanId12)) {
				extractionJobCommandInstance.errors.rejectValue('fanId11', 'Eleventh Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.fanVisible12 == "Y") {
			if ((extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId02) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId03) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId04) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId05) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId06) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId07) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId08) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId09) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId10) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId11) ||
				(extractionJobCommandInstance.fanId12 == extractionJobCommandInstance.fanId01)) {
				extractionJobCommandInstance.errors.rejectValue('fanId12', 'Twelfth Selected Fan must not match any of the other Selected Fans   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible01 == "Y") {
			if ((extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId01 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId01', 'First Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible02 == "Y") {
			if ((extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId02 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId02', 'Second Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible03 == "Y") {
			if ((extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId03 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId03', 'Third Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible04 == "Y") {
			if ((extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId04 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId04', 'Fourth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible05 == "Y") {
			if ((extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId05 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId05', 'Fifth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible06 == "Y") {
			if ((extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId06 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId06', 'Sixth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible07 == "Y") {
			if ((extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId07 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId07', 'Seventh Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible08 == "Y") {
			if ((extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId08 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId08', 'Eighth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible09 == "Y") {
			if ((extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId09 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId09', 'Ninth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible10 == "Y") {
			if ((extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId10 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId10', 'Tenth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible11 == "Y") {
			if ((extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId01) ||
				(extractionJobCommandInstance.dehuId11 == extractionJobCommandInstance.dehuId12)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId11', 'Eleventh Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible12 == "Y") {
			if ((extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId02) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId03) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId04) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId05) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId06) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId07) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId08) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId09) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId10) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId11) ||
				(extractionJobCommandInstance.dehuId12 == extractionJobCommandInstance.dehuId01)) {
				extractionJobCommandInstance.errors.rejectValue('dehuId12', 'Twelfth Selected Dehumidifier must not match any of the other Selected Dehumidifiers   ')
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
		if (extractionJobCommandInstance.fanVisible01 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId01)
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
		
		if (extractionJobCommandInstance.fanVisible02 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId02)
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
		
		if (extractionJobCommandInstance.fanVisible03 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId03)
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
		
		if (extractionJobCommandInstance.fanVisible04 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId04)
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
		
		if (extractionJobCommandInstance.fanVisible05 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId05)
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
					'Error saving Fan 5 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 5 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible06 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId06)
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
					'Error saving Fan 6 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 6 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible07 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId07)
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
					'Error saving Fan 7 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 7 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible08 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId08)
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
					'Error saving Fan 8 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 8 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible09 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId09)
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
					'Error saving Fan 9 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 9 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible10 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId10)
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
					'Error saving Fan 10 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 10 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible11 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId111)
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
					'Error saving Fan 11 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 11 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.fanVisible12 == "Y") {
			Fans f = Fans.findByIdNumber(extractionJobCommandInstance.fanId12)
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
					'Error saving Fan 12 record',
					['', 'class Fans'] as Object[],
					'Error saving Fan 12 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		//Dehumidifiers
		if (extractionJobCommandInstance.dehuVisible01 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId01)
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
		
		if (extractionJobCommandInstance.dehuVisible02 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId02)
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
		
		if (extractionJobCommandInstance.dehuVisible03 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId03)
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
		
		if (extractionJobCommandInstance.dehuVisible04 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId04)
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
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible05 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId05)
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
					'Error saving Dehumidifier 5 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 5 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible06 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId06)
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
					'Error saving Dehumidifier 6 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 6 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible07 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId07)
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
					'Error saving Dehumidifier 7 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 7 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible08 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId08)
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
					'Error saving Dehumidifier 8 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 8 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible09 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId09)
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
					'Error saving Dehumidifier 9 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 9 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible10 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId10)
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
					'Error saving Dehumidifier 10 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 10 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible11 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId11)
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
					'Error saving Dehumidifier 11 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 11 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		if (extractionJobCommandInstance.dehuVisible12 == "Y") {
			Dehumidifiers f = Dehumidifiers.findByIdNumber(extractionJobCommandInstance.dehuId12)
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
					'Error saving Dehumidifier 12 record',
					['', 'class Dehumidifiers'] as Object[],
					'Error saving Dehumidifier 12 record')
				respond waerExtractionJobCommandInstance.errors, view:'newJob'
				return
			}
		}
		
		redirect action: "index", controller: "extractionJob"
	}
}
