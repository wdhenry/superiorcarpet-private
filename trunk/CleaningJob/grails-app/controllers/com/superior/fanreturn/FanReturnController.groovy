package com.superior.fanreturn

import static org.springframework.http.HttpStatus.*
import com.superior.base.Customer
import com.superior.base.Fans
import com.superior.base.WaterExtractionJob
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FanReturnController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Fans.findAllByIsIn(false), model:[fanInstanceCount: Fans.count()]
    }

    def edit(Fans fansInstance) {
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
	
    @Transactional
    def update(Fans fansInstance) {
        if (fansInstance == null) {
            notFound()
            return
        }

        if (fansInstance.hasErrors()) {
            respond fansInstance.errors, view:'edit'
            return
        }
		
		Fans f = Fans.findByIdNumber(fansInstance.id)
		f.dateIn = fansInstance.dateIn
		f.isIn = true
		f.leadIn = fansInstance.leadIn
		f.helperIn = fansInstance.helperIn

		if (!f.save(flush:true)) {
			fansInstance.errors.reject(
				'Error checking in Fan',
				['', 'class Fans'] as Object[],
				'Error checking in Fan')
			respond fansInstance.errors, view:'edit'
			return
		}

		redirect action: "index", controller: "fanReturn"
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'fans.label', default: 'Fans'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
