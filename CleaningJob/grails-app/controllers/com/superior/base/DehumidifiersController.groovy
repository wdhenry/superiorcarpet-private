package com.superior.base



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DehumidifiersController {

    static allowedMethods = [save: "POST", update: "PUT", fred: "PUT", delete: "DELETE"]

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

    @Transactional
    def save(Dehumidifiers dehumidifiersInstance) {
        if (dehumidifiersInstance == null) {
            notFound()
            return
        }

        if (dehumidifiersInstance.hasErrors()) {
            respond dehumidifiersInstance.errors, view:'create'
            return
        }

        dehumidifiersInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dehumidifiers.label', default: 'Dehumidifiers'), dehumidifiersInstance.id])
                redirect dehumidifiersInstance
            }
            '*' { respond dehumidifiersInstance, [status: CREATED] }
        }
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

        dehumidifiersInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Dehumidifiers.label', default: 'Dehumidifiers'), dehumidifiersInstance.id])
                redirect dehumidifiersInstance
            }
            '*'{ respond dehumidifiersInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Dehumidifiers dehumidifiersInstance) {

        if (dehumidifiersInstance == null) {
            notFound()
            return
        }

        dehumidifiersInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Dehumidifiers.label', default: 'Dehumidifiers'), dehumidifiersInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
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
