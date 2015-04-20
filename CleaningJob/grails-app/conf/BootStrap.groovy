import com.superior.base.CarpetCareJob
import com.superior.base.Customer
import com.superior.base.DailyWorkRecord
import com.superior.base.Dehumidifiers
import com.superior.base.Fans
import com.superior.base.Helper
import com.superior.base.Lead
import com.superior.base.MiscChargesName
import com.superior.base.Rates
import com.superior.base.RoomGroup
import com.superior.base.RoomName
import com.superior.base.UpholsteryName
import com.superior.base.WaterExtractionJob
import java.text.SimpleDateFormat

class BootStrap {

//    def init = { servletContext ->
//		Date date = new SimpleDateFormat("MMMM d, yyyy").parse("November 25, 2014");
//		
//		if (!Helper.count()) {
//			new Helper(helperName: "Kashtyn Henry").save(failOnError: true)
//			new Helper(helperName: "Treyce Henry").save(failOnError: true)
//		}
//		
//		if (!Lead.count()) {
//			new Lead(leadName: "Brandon Henry").save(failOnError: true)
//			new Lead(leadName: "Mike Petithory").save(failOnError: true)
//		}
//		
//		if (!Rates.count()) {
//			new Rates(rateName: "CarpetCleaning", rateCharge:10.00).save(failOnError: true)
//			new Rates(rateName: "CarpetPreVac", rateCharge:1.00).save(failOnError: true)
//			new Rates(rateName: "CarpetProtector", rateCharge:2.00).save(failOnError: true)
//			new Rates(rateName: "StairCleaning", rateCharge:2.00).save(failOnError: true)
//			new Rates(rateName: "SurfaceCleaning", rateCharge:6.00).save(failOnError: true)
//			new Rates(rateName: "SurfaceEtched", rateCharge:1.50).save(failOnError: true)
//			new Rates(rateName: "SurfaceSealedWaxed", rateCharge:5.75).save(failOnError: true)
//		}
//		
//		if (!RoomGroup.count()) {
//			new RoomGroup(groupName: "1 Room Special", groupCharge:29.95).save(failOnError: true)
//			new RoomGroup(groupName: "2 Room Special", groupCharge:39.95).save(failOnError: true)
//			new RoomGroup(groupName: "3 Room Special", groupCharge:49.95).save(failOnError: true)
//			new RoomGroup(groupName: "4 Room Special", groupCharge:59.95).save(failOnError: true)
//			new RoomGroup(groupName: "5 Room Special", groupCharge:69.95).save(failOnError: true)
//		}
//		
//		if (!RoomName.count()) {
//			new RoomName(roomName: "Den").save(failOnError: true)
//			new RoomName(roomName: "Dining Room").save(failOnError: true)
//			new RoomName(roomName: "Kitchen").save(failOnError: true)
//			new RoomName(roomName: "Living Room").save(failOnError: true)
//			new RoomName(roomName: "Master Bedroom").save(failOnError: true)
//			new RoomName(roomName: "Rec Room").save(failOnError: true)
//			new RoomName(roomName: "Spare Bedroom 1").save(failOnError: true)
//			new RoomName(roomName: "Spare Bedroom 2").save(failOnError: true)
//			new RoomName(roomName: "Spare Bedroom 3").save(failOnError: true)
//			new RoomName(roomName: "Hallway").save(failOnError: true)
//		}
//		
//		if (!UpholsteryName.count()) {
//			new UpholsteryName(upholsteryName: "Chair", upholsteryCharge: 5.00, upholsteryProtect: 6.00).save(failOnError: true)
//			new UpholsteryName(upholsteryName: "Couch", upholsteryCharge: 10.00, upholsteryProtect: 11.00).save(failOnError: true)
//			new UpholsteryName(upholsteryName: "Ottoman", upholsteryCharge: 7.00, upholsteryProtect: 8.00).save(failOnError: true)
//			new UpholsteryName(upholsteryName: "Recliner", upholsteryCharge: 15.00, upholsteryProtect: 16.00).save(failOnError: true)
//			new UpholsteryName(upholsteryName: "Sectional", upholsteryCharge: 20.00, upholsteryProtect: 21.00).save(failOnError: true)
//		}
//		
//		if (!MiscChargesName.count()) {
//			new MiscChargesName(miscChargesName: "Heavy Soil", miscChargeRate: 15.00).save(failOnError: true)
//			new MiscChargesName(miscChargesName: "Spot Removal", miscChargeRate: 25.00).save(failOnError: true)
//		}
//		
//		if (!Fans.count()) { 
//			new Fans(idNumber: "1", serialNumber: "FR67JKP", model: "FAN-XYZ", dateOut: date, jobId: 1, leadOut: "Brandon Henry", helperOut: "Kashtyn Henry", dateIn: date, leadIn: "Mike Petithory", helperIn: null, isIn: true).save(failOnError: true)
//			new Fans(idNumber: "3", serialNumber: "GR345TRN", model: "DFHSLMP", dateOut: date, jobId: 2, leadOut: "Mike Petithory", helperOut: "Treyce Henry", dateIn: date, leadIn: "Mike Petithory", helperIn: "Kashtyn Henry", isIn: true).save(failOnError: true)
//			new Fans(idNumber: "10", serialNumber: "TZ67JKP", model: "FAN-XYZ", dateOut: date, jobId: 2, leadOut: "Brandon Henry", helperOut: "Treyce Henry", dateIn: null, leadIn: null, helperIn: null, isIn: false).save(failOnError: true)
//			new Fans(idNumber: "30", serialNumber: "SZ345TRN", model: "DFHSLMP", dateOut: date, jobId: 1, leadOut: "Brandon Henry", helperOut: "Kashtyn Henry", dateIn: date, leadIn: "Mike Petithory", helperIn: null, isIn: true).save(failOnError: true)
//		}
//		
//		if (!Dehumidifiers.count()) {
//			new Dehumidifiers(idNumber: "1", serialNumber: "WH45SRT", model: "VII", hours: 23.6, dateOut: date, jobId: 1, leadOut: "Brandon Henry", helperOut: "Kashtyn Henry", dateIn: date, leadIn: "Mike Petithory", helperIn: null, isIn: true).save(failOnError: true)
//			new Dehumidifiers(idNumber: "2", serialNumber: "WH46SRT", model: "VII", hours: 13.2, dateOut: date, jobId: 2, leadOut: "Mike Petithory", helperOut: "Treyce Henry", dateIn: null, leadIn: null, helperIn: null, isIn: false).save(failOnError: true)
//			new Dehumidifiers(idNumber: "10", serialNumber: "XX45SRT", model: "VII", hours: 48.6, dateOut: date, jobId: 2, leadOut: "Mike Petithory", helperOut: "Kashtyn Henry", dateIn: null, leadIn: null, helperIn: null, isIn: false).save(failOnError: true)
//			new Dehumidifiers(idNumber: "20", serialNumber: "XX46SRT", model: "VII", hours: 126.2, dateOut: date, jobId:1, leadOut: "Brandon Henry", helperOut: "Kashtyn Henry", dateIn: date, leadIn: "Mike Petithory", helperIn: null, isIn: true).save(failOnError: true)
//		}
//		
//		if (!Customer.count()) {
//			new Customer(lastName: "Henry", firstName: "Wayne", addressLineOne: "727 N. Hickory Blvd.", city: "Pleasant Hill", state: "IA", zip: "50327").save(failOnError: true)
//			new Customer(lastName: "Athene", addressLineOne: "Unknown", city: "West Des Moines", state: "IA").save(failOnError: true)
//			new Customer(lastName: "Henry", firstName: "Betty", addressLineOne: "7427 N. Hickory Blvd.", city: "Pleasant Hill", state: "IA", zip: "50327").save(failOnError: true)
//		}
//		
//		if (!CarpetCareJob.count()) {
//			new CarpetCareJob(date: date, lead: "Brandon Henry", helper: "Kashtyn Henry", customerId: 1).save(failOnError: true)
//			new CarpetCareJob(date: date, lead: "Mike Petithory", helper: "Treyce Henry", customerId: 1).save(failOnError: true)
//		}
//		
//		if (!WaterExtractionJob.count()) {
//			new WaterExtractionJob(date: date, lead: "Brandon Henry", helper: "Kashtyn Henry", customerId: 1, startTime: new Date(), endTime: new Date()).save(failOnError: true)
//			new WaterExtractionJob(date: date, lead: "Mike Petithory", helper: "Treyce Henry", customerId: 2, startTime: new Date(), endTime: new Date()).save(failOnError: true)
//		}
//		
//		if (!DailyWorkRecord.count()) {
//			new DailyWorkRecord(date: date, lead: "Brandon Henry", helper: "Kashtyn Henry", vanNumber: "2", leadHours: 6, leadMinutes: 0, helperHours: 5, helperMinutes: 30, milesDriven: 25, hoursOnUnit: 1325, dollarsCollected: 625.00 ).save(failOnError: true)
//			new DailyWorkRecord(date: date, lead: "Mike Petithory", helper: "Treyce Henry", vanNumber: "1", leadHours: 8, leadMinutes: 0, helperHours: 8, helperMinutes: 0, milesDriven: 40, hoursOnUnit: 5254, dollarsCollected: 1430.00 ).save(failOnError: true)
//			new DailyWorkRecord(date: new Date(), lead: "Mike Petithory", helper: "Treyce Henry", vanNumber: "1", leadHours: 8, leadMinutes: 0, helperHours: 8, helperMinutes: 0, milesDriven: 40, hoursOnUnit: 5254, dollarsCollected: 1430.00 ).save(failOnError: true)
//		}
//    }
	
	def init = {
		
	}
    def destroy = {
    }
}
