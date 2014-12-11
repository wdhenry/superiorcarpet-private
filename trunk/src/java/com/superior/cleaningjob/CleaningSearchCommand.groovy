package com.superior.cleaningjob

import grails.validation.Validateable;
import java.util.Date;

@Validateable
class CleaningSearchCommand {

	Date date
	
	static constraints = {
		date(blank:false)
	}
}
