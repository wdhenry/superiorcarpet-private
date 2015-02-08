package com.superior.base



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class RatesController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Rates.list(params), model:[ratesInstanceCount: Rates.count()]
    }

    def show(Rates ratesInstance) {
        respond ratesInstance
    }

    def create() {
        respond new Rates(params)
    }

    @Transactional
    def save(Rates ratesInstance) {
        if (ratesInstance == null) {
            notFound()
            return
        }

        if (ratesInstance.hasErrors()) {
            respond ratesInstance.errors, view:'create'
            return
        }

        ratesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'rates.label', default: 'Rates'), ratesInstance.id])
                redirect ratesInstance
            }
            '*' { respond ratesInstance, [status: CREATED] }
        }
    }

    def edit(Rates ratesInstance) {
        respond ratesInstance
    }

    @Transactional
    def update(Rates ratesInstance) {
        if (ratesInstance == null) {
            notFound()
            return
        }

        if (ratesInstance.hasErrors()) {
            respond ratesInstance.errors, view:'edit'
            return
        }

        ratesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Rates.label', default: 'Rates'), ratesInstance.id])
                redirect ratesInstance
            }
            '*'{ respond ratesInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Rates ratesInstance) {

        if (ratesInstance == null) {
            notFound()
            return
        }

        ratesInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Rates.label', default: 'Rates'), ratesInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'rates.label', default: 'Rates'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
