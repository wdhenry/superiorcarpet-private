package com.superior.customer

import grails.validation.Validateable;

@Validateable
class CustomerSearchCommand {

	String lastName
	String firstName
	String addressLineOne
	String addressLineTwo
	
	static constraints = {
		firstName(nullable:true)
		lastName(nullable:true)
		addressLineOne(nullable:true)
		addressLineTwo(nullable:true)
	}
}
