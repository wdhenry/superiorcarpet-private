package com.superior.base

class Customer {

    String lastName
	String firstName
	String addressLineOne
	String addressLineTwo
	String city
	String state
	String zip
	String phoneNumber
	
    static constraints = {
		id()
		firstName(nullable:true)
		lastName(blank:false)
		addressLineOne(blank:false)
		addressLineTwo(nullable:true)
		city(blank:false)
		state(maxSize:2, blank:false)
		zip(nullable:true)
		phoneNumber(maxSize:10, nullable:true)
    }
	
	String toString() {
		firstName + " " + lastName
	}
}
