package com.superior.base



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CarpetCareJobController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CarpetCareJob.list(params), model:[carpetCareJobInstanceCount: CarpetCareJob.count()]
    }

    def show(CarpetCareJob carpetCareJobInstance) {
        respond carpetCareJobInstance
    }

    def create() {
        respond new CarpetCareJob(params)
    }

    @Transactional
    def save(CarpetCareJob carpetCareJobInstance) {
        if (carpetCareJobInstance == null) {
            notFound()
            return
        }

        if (carpetCareJobInstance.hasErrors()) {
            respond carpetCareJobInstance.errors, view:'create'
            return
        }

        carpetCareJobInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'carpetCareJob.label', default: 'CarpetCareJob'), carpetCareJobInstance.id])
                redirect carpetCareJobInstance
            }
            '*' { respond carpetCareJobInstance, [status: CREATED] }
        }
    }

    def edit(CarpetCareJob carpetCareJobInstance) {
        respond carpetCareJobInstance
    }

    @Transactional
    def update(CarpetCareJob carpetCareJobInstance) {
        if (carpetCareJobInstance == null) {
            notFound()
            return
        }

        if (carpetCareJobInstance.hasErrors()) {
            respond carpetCareJobInstance.errors, view:'edit'
            return
        }

        carpetCareJobInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'CarpetCareJob.label', default: 'CarpetCareJob'), carpetCareJobInstance.id])
                redirect carpetCareJobInstance
            }
            '*'{ respond carpetCareJobInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CarpetCareJob carpetCareJobInstance) {

        if (carpetCareJobInstance == null) {
            notFound()
            return
        }

        carpetCareJobInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'CarpetCareJob.label', default: 'CarpetCareJob'), carpetCareJobInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'carpetCareJob.label', default: 'CarpetCareJob'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
