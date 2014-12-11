package com.superior.extractionjob

import java.util.Date;

import grails.validation.Validateable;

@Validateable
class ExtractionSearchCommand {

	Date date
	
	static constraints = {
		date(blank:false)
	}
}
