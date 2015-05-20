package com.superior.dehumidifiers


import com.superior.base.Customer
import com.superior.base.Dehumidifiers
import com.superior.base.WaterExtractionJob
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DehumidifiersListController {

    static allowedMethods = [save: "POST", update: "PUT", fred: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Dehumidifiers.list(params), model:[dehumidifiersInstanceCount: Dehumidifiers.count()]
    }

    def show(Dehumidifiers dehumidifiersInstance) {
        respond dehumidifiersInstance
    }
	
	def showJob(Dehumidifiers dehumidifiersInstance) {
		WaterExtractionJob w = WaterExtractionJob.findById(dehumidifiersInstance.jobId)
		if (w == null) {
			notFound()
			return
		} else {
			Customer customerInstance = Customer.findById(w.customerId)
			if (customerInstance == null) {
				notFound()
				return
			} else {
				respond customerInstance, view:'customer';
			}
		}
	}
}
