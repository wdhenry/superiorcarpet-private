package com.superior.base



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UpholsteryNameController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UpholsteryName.list(params), model:[upholsteryNameInstanceCount: UpholsteryName.count()]
    }

    def show(UpholsteryName upholsteryNameInstance) {
        respond upholsteryNameInstance
    }

    def create() {
        respond new UpholsteryName(params)
    }

    @Transactional
    def save(UpholsteryName upholsteryNameInstance) {
        if (upholsteryNameInstance == null) {
            notFound()
            return
        }

        if (upholsteryNameInstance.hasErrors()) {
            respond upholsteryNameInstance.errors, view:'create'
            return
        }

        upholsteryNameInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'upholsteryName.label', default: 'UpholsteryName'), upholsteryNameInstance.id])
                redirect upholsteryNameInstance
            }
            '*' { respond upholsteryNameInstance, [status: CREATED] }
        }
    }

    def edit(UpholsteryName upholsteryNameInstance) {
        respond upholsteryNameInstance
    }

    @Transactional
    def update(UpholsteryName upholsteryNameInstance) {
        if (upholsteryNameInstance == null) {
            notFound()
            return
        }

        if (upholsteryNameInstance.hasErrors()) {
            respond upholsteryNameInstance.errors, view:'edit'
            return
        }

        upholsteryNameInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'UpholsteryName.label', default: 'UpholsteryName'), upholsteryNameInstance.id])
                redirect upholsteryNameInstance
            }
            '*'{ respond upholsteryNameInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(UpholsteryName upholsteryNameInstance) {

        if (upholsteryNameInstance == null) {
            notFound()
            return
        }

        upholsteryNameInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UpholsteryName.label', default: 'UpholsteryName'), upholsteryNameInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'upholsteryName.label', default: 'UpholsteryName'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
