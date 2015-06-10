package com.superior.extractionjob

import com.superior.base.Customer
import com.superior.base.Dehumidifiers
import com.superior.base.Fans
import com.superior.base.WaterExtractionJob;
import com.superior.customer.CustomerSearchCommand

import grails.transaction.Transactional

@Transactional(readOnly = true)
class ExtractionJobSearchController {

    def index() { 
		ExtractionSearchCommand extractionSearchCommandInstance = new ExtractionSearchCommand()
		respond extractionSearchCommandInstance , view:'search'
	}
	
	def search(ExtractionSearchCommand extractionSearchCommandInstance) {
		if (extractionSearchCommandInstance == null) {
			respond extractionSearchCommandInstance , view:'search'
			return
		}
		
		def jobList = new ArrayList() 
		if (extractionSearchCommandInstance.date != null) {
			jobList = WaterExtractionJob.findAllByDate(extractionSearchCommandInstance.date)
		}
		
		if (jobList.size() == 1) {
			WaterExtractionJob waterExtractionJobInstance = jobList.get(0)
			ExtractionJobCommand extractionJobCommandInstance = buildDisplayObject(waterExtractionJobInstance)
			 
			respond waterExtractionJobInstance, view:'details', model:[extractionJobCommandInstance: extractionJobCommandInstance]
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList, extractionJobInstanceCount: jobList.size()]
			return
		} else {
			extractionSearchCommandInstance.errors.rejectValue('', 'No matching Extraction Jobs Found   ')
			respond extractionSearchCommandInstance.errors, view:'search'
			return
		}
	}
	
	def details(WaterExtractionJob waterExtractionJobInstance) {
		ExtractionJobCommand extractionJobCommandInstance = buildDisplayObject(waterExtractionJobInstance)
		
		respond waterExtractionJobInstance, view:'details', model:[extractionJobCommandInstance: extractionJobCommandInstance]
	}
	
	def custjobs(Long id) {
		def jobList = WaterExtractionJob.findAllByCustomerId(id)
		
		if (jobList.size() == 1) {
			WaterExtractionJob waterExtractionJobInstance = jobList.get(0)
			ExtractionJobCommand extractionJobCommandInstance = buildDisplayObject(waterExtractionJobInstance)
		
			respond waterExtractionJobInstance, view:'details', model:[extractionJobCommandInstance: extractionJobCommandInstance]
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList, waterExtractionJobInstanceCount: jobList.size()]
			return
		} else {
//			CustomerSearchCommand customerSearchCommandInstance = new CustomerSearchCommand();
//			customerSearchCommandInstance.errors.rejectValue('', 'No matching Extraction Jobs Found   ')
//			def err = 'No matching Extraction Jobs Found   '
//			redirect view:'search', controller:'customerSearch', model: [CustomerSearchCommand: customerSearchCommandInstance]
			
			Customer customerInstance = new Customer();
			def custList = new ArrayList()
	
			customerInstance.errors.rejectValue('', 'No matching Extraction Jobs Found   ')
			flash.message = "No matching Extraction Jobs Found   "
			redirect view:'details', controller:'customerSearch', model:[customerInstance: customerInstance]
			return
		}
	}
	
	private ExtractionJobCommand buildDisplayObject(WaterExtractionJob waterExtractionJobInstance) {
		
		Customer customerInstance = Customer.findById(waterExtractionJobInstance.customerId)

		ExtractionJobCommand extractionJobCommandInstance = new ExtractionJobCommand(
												date: waterExtractionJobInstance.date,
												lead: waterExtractionJobInstance.lead,
												helper: waterExtractionJobInstance.helper,
												customerId: waterExtractionJobInstance.customerId,
												firstName: customerInstance.firstName,
												lastName: customerInstance.lastName,
												addressLineOne: customerInstance.addressLineOne,
												addressLineTwo: customerInstance.addressLineTwo,
												startTime: waterExtractionJobInstance.startTime,
												endTime: waterExtractionJobInstance.endTime,
												fanId01: null,
												fanId02: null,
												fanId03: null,
												fanId04: null,
												fanId05: null,
												fanId06: null,
												fanId07: null,
												fanId08: null,
												fanId09: null,
												fanId10: null,
												fanId11: null,
												fanId12: null,
												dehuId01: null,
												dehuId02: null,
												dehuId03: null,
												dehuId04: null,
												dehuId05: null,
												dehuId06: null,
												dehuId07: null,
												dehuId08: null,
												dehuId09: null,
												dehuId10: null,
												dehuId11: null,
												dehuId12: null)

		def fanList = new ArrayList()
		fanList = Fans.findAllByJobId(waterExtractionJobInstance.id)

		def count = 1
		for (fan in fanList) {
			if (count == 1) {
				extractionJobCommandInstance.setFanId01(fan.getDisplayValue())
			} else if (count == 2) {
				extractionJobCommandInstance.setFanId02(fan.getDisplayValue())
			} else if (count == 3) {
				extractionJobCommandInstance.setFanId03(fan.getDisplayValue())
			} else if (count == 4) {
				extractionJobCommandInstance.setFanId04(fan.getDisplayValue())
			} else if (count == 5) {
				extractionJobCommandInstance.setFanId05(fan.getDisplayValue())
			} else if (count == 6) {
				extractionJobCommandInstance.setFanId06(fan.getDisplayValue())
			} else if (count == 7) {
				extractionJobCommandInstance.setFanId07(fan.getDisplayValue())
			} else if (count == 8) {
				extractionJobCommandInstance.setFanId08(fan.getDisplayValue())
			} else if (count == 9) {
				extractionJobCommandInstance.setFanId09(fan.getDisplayValue())
			} else if (count == 10) {
				extractionJobCommandInstance.setFanId10(fan.getDisplayValue())
			} else if (count == 11) {
				extractionJobCommandInstance.setFanId11(fan.getDisplayValue())
			} else if (count == 12) {
				extractionJobCommandInstance.setFanId12(fan.getDisplayValue())
			}
			count = count + 1
		}
		
		def dehuList = new ArrayList()
		dehuList = Dehumidifiers.findAllByJobId(waterExtractionJobInstance.id)

		count = 1
		for (dehu in dehuList) {
			if (count == 1) {
				extractionJobCommandInstance.setDehuId01(dehu.getDisplayValue())
			} else if (count == 2) {
				extractionJobCommandInstance.setDehuId02(dehu.getDisplayValue())
			} else if (count == 3) {
				extractionJobCommandInstance.setDehuId03(dehu.getDisplayValue())
			} else if (count == 4) {
				extractionJobCommandInstance.setDehuId04(dehu.getDisplayValue())
			} else if (count == 5) {
				extractionJobCommandInstance.setDehuId05(dehu.getDisplayValue())
			} else if (count == 6) {
				extractionJobCommandInstance.setDehuId06(dehu.getDisplayValue())
			} else if (count == 7) {
				extractionJobCommandInstance.setDehuId07(dehu.getDisplayValue())
			} else if (count == 8) {
				extractionJobCommandInstance.setDehuId08(dehu.getDisplayValue())
			} else if (count == 9) {
				extractionJobCommandInstance.setDehuId09(dehu.getDisplayValue())
			} else if (count == 10) {
				extractionJobCommandInstance.setDehuId10(dehu.getDisplayValue())
			} else if (count == 11) {
				extractionJobCommandInstance.setDehuId11(dehu.getDisplayValue())
			} else if (count == 12) {
				extractionJobCommandInstance.setDehuId12(dehu.getDisplayValue())
			}
			count = count + 1
		}
		
		return extractionJobCommandInstance
	}
}
