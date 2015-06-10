package com.superior.customer

import com.superior.base.Customer
import com.superior.customer.CustomerSearchCommand;

import grails.transaction.Transactional

@Transactional(readOnly = true)
class CustomerSearchController {

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
			
		if (custList.size() == 1) {
			respond custList, view:'details', model:[customerInstance: custList.get(0)]
			return
		} else if (custList.size() > 0) {
			respond custList, view:'summary', model:[customers: custList,
											custListInstanceCount: custList.size()]
			return
		} else {
			customerSearchCommandInstance.errors.rejectValue('', 'No matching Customers Found   ')
			respond customerSearchCommandInstance.errors, view:'search'
			return
		}
	}
	
	def details(Customer customerInstance) {
		respond customerInstance
	}
	
}
