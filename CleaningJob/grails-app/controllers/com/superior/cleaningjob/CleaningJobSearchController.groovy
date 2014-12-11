package com.superior.cleaningjob

import com.superior.base.CarpetCareJob
import com.superior.base.Customer
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
			respond jobList, view:'details', model:[carpetCareJobInstance: jobList.get(0)]
		} else if (jobList.size() > 0) {
			respond jobList, view:'summary', model:[jobs: jobList,
												carpetCareJobInstanceCount: jobList.size()]
			return
		} else {
			cleaningSearchCommandInstance.errors.rejectValue('', 'No matching Cleaning Jobs Found   ')
			respond cleaningSearchCommandInstance.errors, view:'search'
			return
		}
	}
	
	def details(CarpetCareJob carpetCareJobInstance) {
		respond carpetCareJobInstance
	}
	
	def custjobs(Long id) {
		def jobList = CarpetCareJob.findAllByCustomerId(id)
		
		if (jobList.size() == 1) {
			respond jobList, view:'details', model:[jobsInstance: jobList.get(0)]
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
}
