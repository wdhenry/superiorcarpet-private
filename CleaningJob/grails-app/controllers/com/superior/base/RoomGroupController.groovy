package com.superior.base



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class RoomGroupController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond RoomGroup.list(params), model:[roomGroupInstanceCount: RoomGroup.count()]
    }

    def show(RoomGroup roomGroupInstance) {
        respond roomGroupInstance
    }
	
	def findByGroupName(String groupName) {
		respond RoomGroup.findByGroupName(groupName)
	}

    def create() {
        respond new RoomGroup(params)
    }

    @Transactional
    def save(RoomGroup roomGroupInstance) {
        if (roomGroupInstance == null) {
            notFound()
            return
        }

        if (roomGroupInstance.hasErrors()) {
            respond roomGroupInstance.errors, view:'create'
            return
        }

        roomGroupInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'roomGroup.label', default: 'RoomGroup'), roomGroupInstance.id])
                redirect roomGroupInstance
            }
            '*' { respond roomGroupInstance, [status: CREATED] }
        }
    }

    def edit(RoomGroup roomGroupInstance) {
        respond roomGroupInstance
    }

    @Transactional
    def update(RoomGroup roomGroupInstance) {
        if (roomGroupInstance == null) {
            notFound()
            return
        }

        if (roomGroupInstance.hasErrors()) {
            respond roomGroupInstance.errors, view:'edit'
            return
        }

        roomGroupInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'RoomGroup.label', default: 'RoomGroup'), roomGroupInstance.id])
                redirect roomGroupInstance
            }
            '*'{ respond roomGroupInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(RoomGroup roomGroupInstance) {

        if (roomGroupInstance == null) {
            notFound()
            return
        }

        roomGroupInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'RoomGroup.label', default: 'RoomGroup'), roomGroupInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'roomGroup.label', default: 'RoomGroup'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
