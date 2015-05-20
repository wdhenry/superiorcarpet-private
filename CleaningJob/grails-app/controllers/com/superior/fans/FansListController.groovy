package com.superior.fans


import com.superior.base.Customer
import com.superior.base.Fans
import com.superior.base.WaterExtractionJob
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FansListController {

    static allowedMethods = [save: "POST", update: "PUT", fred: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Fans.list(params), model:[dehumidifiersInstanceCount: Fans.count()]
    }

    def show(Fans fansInstance) {
        respond fansInstance
    }
	
	def showJob(Fans fansInstance) {
		WaterExtractionJob w = WaterExtractionJob.findById(fansInstance.jobId)
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
