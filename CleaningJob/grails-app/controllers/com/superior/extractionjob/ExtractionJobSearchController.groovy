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
			CustomerSearchCommand customerSearchCommandInstance = new CustomerSearchCommand();
			customerSearchCommandInstance.errors.rejectValue('', 'No matching Extraction Jobs Found   ')
			def err = 'No matching Extraction Jobs Found   '
			redirect view:'search', controller:'customerSearch', model: [CustomerSearchCommand: customerSearchCommandInstance]
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
												fanId1: null,
												fanId2: null,
												fanId3: null,
												fanId4: null,
												dehuId1: null,
												dehuId2: null,
												dehuId3: null,
												dehuId4: null)

		def fanList = new ArrayList()
		fanList = Fans.findAllByJobId(waterExtractionJobInstance.id)

		def count = 1
		for (fan in fanList) {
			if (count == 1) {
				extractionJobCommandInstance.setFanId1(fan.getDisplayValue())
			} else if (count == 2) {
				extractionJobCommandInstance.setFanId2(fan.getDisplayValue())
			} else if (count == 3) {
				extractionJobCommandInstance.setFanId3(fan.getDisplayValue())
			} else if (count == 4) {
				extractionJobCommandInstance.setFanId4(fan.getDisplayValue())
			} 
			count = count + 1
		}
		
		def dehuList = new ArrayList()
		dehuList = Dehumidifiers.findAllByJobId(waterExtractionJobInstance.id)

		count = 1
		for (dehu in dehuList) {
			if (count == 1) {
				extractionJobCommandInstance.setDehuId1(dehu.getDisplayValue())
			} else if (count == 2) {
				extractionJobCommandInstance.setDehuId2(dehu.getDisplayValue())
			} else if (count == 3) {
				extractionJobCommandInstance.setDehuId3(dehu.getDisplayValue())
			} else if (count == 4) {
				extractionJobCommandInstance.setDehuId4(dehu.getDisplayValue())
			}
			count = count + 1
		}
		
		return extractionJobCommandInstance
	}
}
