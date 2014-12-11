package com.superior.extractionjob

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
			respond jobList, view:'details', model:[jobsInstance: jobList.get(0)]
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList,
												extractionJobInstanceCount: jobList.size()]
			return
		} else {
			extractionSearchCommandInstance.errors.rejectValue('', 'No matching Extraction Jobs Found   ')
			respond extractionSearchCommandInstance.errors, view:'search'
			return
		}
	}
	
	def details(WaterExtractionJob waterExtractionJobInstance) {
		respond waterExtractionJobInstance
	}
	
	def custjobs(Long id) {
		def jobList = WaterExtractionJob.findAllByCustomerId(id)
		
		if (jobList.size() == 1) {
			respond jobList, view:'details', model:[waterExtractionJobInstance: jobList.get(0)]
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList,
												waterExtractionJobInstanceCount: jobList.size()]
			return
		} else {
			CustomerSearchCommand customerSearchCommandInstance = new CustomerSearchCommand();
			customerSearchCommandInstance
			customerSearchCommandInstance.errors.rejectValue('', 'No matching Extraction Jobs Found   ')
			def err = 'No matching Extraction Jobs Found   '
			redirect view:'search', controller:'customerSearch', model: [CustomerSearchCommand: customerSearchCommandInstance]
			return
		}
	}
}
