package com.superior.dehureturn

import static org.springframework.http.HttpStatus.*
import com.superior.base.Dehumidifiers
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DehuReturnController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Dehumidifiers.list(params), model:[dehumidifiersInstanceCount: Dehumidifiers.count()]
    }

    def show(Dehumidifiers dehumidifiersInstance) {
        respond dehumidifiersInstance
    }

    def create() {
        respond new Dehumidifiers(params)
    }
    
    def edit(Dehumidifiers dehumidifiersInstance) {
        respond dehumidifiersInstance
    }

    @Transactional
    def update(Dehumidifiers dehumidifiersInstance) {
        if (dehumidifiersInstance == null) {
            notFound()
            return
        }

        if (dehumidifiersInstance.hasErrors()) {
            respond dehumidifiersInstance.errors, view:'edit'
            return
        }

		Dehumidifiers f = Dehumidifiers.findByIdNumber(dehumidifiersInstance.id)
		f.dateIn = dehumidifiersInstance.dateIn
		f.isIn = true
		f.leadIn = dehumidifiersInstance.leadIn
		f.helperIn = dehumidifiersInstance.helperIn

		if (!f.save(flush:true)) {
			dehumidifiersInstance.errors.reject(
				'Error checking in Dehumidifier',
				['', 'class Dehumidifiers'] as Object[],
				'Error checking in Dehumidifier')
			respond dehumidifiersInstance.errors, view:'edit'
			return
		}
		
		redirect action: "index", controller: "dehuReturn"
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dehumidifiers.label', default: 'Dehumidifiers'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
