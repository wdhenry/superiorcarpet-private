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

    @Transactional
    def save(Fans fansInstance) {
        if (fansInstance == null) {
            notFound()
            return
        }

        if (fansInstance.hasErrors()) {
            respond fansInstance.errors, view:'create'
            return
        }

        fansInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'fans.label', default: 'Fans'), fansInstance.id])
                redirect fansInstance
            }
            '*' { respond fansInstance, [status: CREATED] }
        }
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

        fansInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Fans.label', default: 'Fans'), fansInstance.id])
                redirect fansInstance
            }
            '*'{ respond fansInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Fans fansInstance) {

        if (fansInstance == null) {
            notFound()
            return
        }

        fansInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Fans.label', default: 'Fans'), fansInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
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
