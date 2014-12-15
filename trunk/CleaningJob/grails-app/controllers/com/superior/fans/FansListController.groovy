package com.superior.fans


import com.superior.base.Fans
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FansListController {

    static allowedMethods = [save: "POST", update: "PUT", fred: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Fans.list(params), model:[dehumidifiersInstanceCount: Fans.count()]
    }

    def show(Fans fansInstance) {
        respond fansInstance
    }
}
