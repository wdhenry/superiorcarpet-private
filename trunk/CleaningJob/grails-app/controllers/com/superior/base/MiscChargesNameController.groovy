package com.superior.base

import grails.transaction.Transactional

@Transactional(readOnly = true)
class MiscChargesNameController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond MiscChargesName.list(params), model:[miscChargesNameInstanceCount: MiscChargesName.count()]
	}

	def show(MiscChargesName miscChargesNameInstance) {
		respond miscChargesNameInstance
	}

	def findByMiscChargesName(String miscChargeName) {
		respond MiscChargesName.findByMiscChargesName(miscChargeName)
	}


	def create() {
		respond new MiscChargesName(params)
	}

	@Transactional
	def save(MiscChargesName miscChargesNameInstance) {
		if (miscChargesNameInstance == null) {
			notFound()
			return
		}

		if (miscChargesNameInstance.hasErrors()) {
			respond miscChargesNameInstance.errors, view:'create'
			return
		}

		miscChargesNameInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [message(code: 'miscChargesName.label', default: 'Misc Charges Name'), miscChargesNameInstance.id])
				redirect miscChargesNameInstance
			}
			'*' { respond miscChargesNameInstance, [status: CREATED] }
		}
	}

	def edit(MiscChargesName miscChargesNameInstance) {
		respond miscChargesNameInstance
	}

	@Transactional
	def update(MiscChargesName miscChargesNameInstance) {
		if (miscChargesNameInstance == null) {
			notFound()
			return
		}

		if (miscChargesNameInstance.hasErrors()) {
			respond miscChargesNameInstance.errors, view:'edit'
			return
		}

		miscChargesNameInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [message(code: 'miscChargesName.label', default: 'Misc Charges Name'), miscChargesNameInstance.id])
				redirect miscChargesNameInstance
			}
			'*'{ respond miscChargesNameInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(MiscChargesName miscChargesNameInstance) {

		if (miscChargesNameInstance == null) {
			notFound()
			return
		}

		miscChargesNameInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'miscChargesName.label', default: 'Misc Charges Name'), miscChargesNameInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'miscChargesName.label', default: 'Misc Charges Name'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
