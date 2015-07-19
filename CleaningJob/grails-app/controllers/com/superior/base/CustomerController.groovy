package com.superior.base



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import com.superior.customer.CustomerSearchCommand;

@Transactional(readOnly = true)
class CustomerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        CustomerSearchCommand customerSearchCommandInstance = new CustomerSearchCommand()
		respond customerSearchCommandInstance , view:'search'
    }

    def search(CustomerSearchCommand customerSearchCommandInstance) {
		if (customerSearchCommandInstance == null) {
			respond customerSearchCommandInstance , view:'search'
			return
		}
		
		def custList = new ArrayList()
		if ((customerSearchCommandInstance.lastName != null) ||
			(customerSearchCommandInstance.firstName != null)) {
			if ((customerSearchCommandInstance.lastName != null) &&
				(customerSearchCommandInstance.firstName != null)) {
				custList = Customer.findAllByLastNameAndFirstName(customerSearchCommandInstance.lastName, customerSearchCommandInstance.firstName)
			} else if (customerSearchCommandInstance.lastName != null) {
					custList = Customer.findAllByLastName(customerSearchCommandInstance.lastName)
			} else if (customerSearchCommandInstance.firstName != null) {
					custList = Customer.findAllByFirstName(customerSearchCommandInstance.firstName)
			}
		} else if ((customerSearchCommandInstance.addressLineOne != null) ||
			(customerSearchCommandInstance.addressLineTwo != null)) {
			if ((customerSearchCommandInstance.addressLineOne != null) &&
				(customerSearchCommandInstance.addressLineTwo != null)) {
				custList = Customer.findAllByAddressLineOneAndAddressLineTwo(customerSearchCommandInstance.addressLineOne, customerSearchCommandInstance.addressLineTwo)
			} else if (customerSearchCommandInstance.addressLineOne != null) {
					custList = Customer.findAllByAddressLineOne(customerSearchCommandInstance.addressLineOne)
			} else if (customerSearchCommandInstance.addressLineTwo != null) {
					custList = Customer.findAllByAddressLineTwo(customerSearchCommandInstance.addressLineTwo)
			}
		}
			
		if (custList.size() > 0) {
			respond custList, view:'summary', model:[customers: custList,
											custListInstanceCount: custList.size()]
			return
		} else {
			customerSearchCommandInstance.errors.reject('No matching customers found')
			respond customerSearchCommandInstance.errors, view:'search'
			return
		}
	}

	def show(Customer customerInstance) {
		respond customerInstance
	}
	
    def create() {
        respond new Customer(params)
    }

    @Transactional
    def save(Customer customerInstance) {
        if (customerInstance == null) {
            notFound()
            return
        }

        if (customerInstance.hasErrors()) {
            respond customerInstance.errors, view:'create'
            return
        }

        customerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'customer.label', default: 'Customer'), customerInstance.id])
                redirect customerInstance
            }
            '*' { respond customerInstance, [status: CREATED] }
        }
    }

    def edit(Customer customerInstance) {
        respond customerInstance
    }

    @Transactional
    def update(Customer customerInstance) {
        if (customerInstance == null) {
            notFound()
            return
        }

        if (customerInstance.hasErrors()) {
            respond customerInstance.errors, view:'edit'
            return
        }

        customerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Customer.label', default: 'Customer'), customerInstance.id])
                redirect customerInstance
            }
            '*'{ respond customerInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Customer customerInstance) {

        if (customerInstance == null) {
            notFound()
            return
        }

        customerInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Customer.label', default: 'Customer'), customerInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'customer.label', default: 'Customer'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
