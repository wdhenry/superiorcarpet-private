package com.superior.fanreturn

import static org.springframework.http.HttpStatus.*
import com.superior.base.Fans
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FanReturnController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Fans.list(params), model:[fanInstanceCount: Fans.count()]
    }

    def edit(Fans fansInstance) {
        respond fansInstance
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
