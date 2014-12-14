package com.superior.dehumidifiers


import com.superior.base.Dehumidifiers
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DehumidifiersListController {

    static allowedMethods = [save: "POST", update: "PUT", fred: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Dehumidifiers.list(params), model:[dehumidifiersInstanceCount: Dehumidifiers.count()]
    }

    def show(Dehumidifiers dehumidifiersInstance) {
        respond dehumidifiersInstance
    }
}
