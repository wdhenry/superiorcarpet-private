import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formRoom_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formRoom.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (cleaningJobCommandInstance.roomName001 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',11,['bean':(cleaningJobCommandInstance),'field':("roomName001")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',13,['number':(cleaningJobCommandInstance.squareFootage001),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',15,['number':(cleaningJobCommandInstance.roomCharge001),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',17,['number':(cleaningJobCommandInstance.preVacCharge001),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',19,['number':(cleaningJobCommandInstance.protectorCharge001),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',21,['number':(cleaningJobCommandInstance.moveFurnitureCharge001),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName002 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',26,['bean':(cleaningJobCommandInstance),'field':("roomName002")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',28,['number':(cleaningJobCommandInstance.squareFootage002),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',30,['number':(cleaningJobCommandInstance.roomCharge002),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',32,['number':(cleaningJobCommandInstance.preVacCharge002),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',34,['number':(cleaningJobCommandInstance.protectorCharge002),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',36,['number':(cleaningJobCommandInstance.moveFurnitureCharge002),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName003 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',41,['bean':(cleaningJobCommandInstance),'field':("roomName003")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',43,['number':(cleaningJobCommandInstance.squareFootage003),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',45,['number':(cleaningJobCommandInstance.roomCharge003),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',47,['number':(cleaningJobCommandInstance.preVacCharge003),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',49,['number':(cleaningJobCommandInstance.protectorCharge003),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',51,['number':(cleaningJobCommandInstance.moveFurnitureCharge003),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName004 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',56,['bean':(cleaningJobCommandInstance),'field':("roomName004")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',58,['number':(cleaningJobCommandInstance.squareFootage004),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',60,['number':(cleaningJobCommandInstance.roomCharge004),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',62,['number':(cleaningJobCommandInstance.preVacCharge004),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',64,['number':(cleaningJobCommandInstance.protectorCharge004),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',66,['number':(cleaningJobCommandInstance.moveFurnitureCharge004),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName005 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',71,['bean':(cleaningJobCommandInstance),'field':("roomName005")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',73,['number':(cleaningJobCommandInstance.squareFootage005),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',75,['number':(cleaningJobCommandInstance.roomCharge005),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',77,['number':(cleaningJobCommandInstance.preVacCharge005),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',79,['number':(cleaningJobCommandInstance.protectorCharge005),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',81,['number':(cleaningJobCommandInstance.moveFurnitureCharge005),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName006 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',86,['bean':(cleaningJobCommandInstance),'field':("roomName006")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',88,['number':(cleaningJobCommandInstance.squareFootage006),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',90,['number':(cleaningJobCommandInstance.roomCharge006),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',92,['number':(cleaningJobCommandInstance.preVacCharge006),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',94,['number':(cleaningJobCommandInstance.protectorCharge006),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',96,['number':(cleaningJobCommandInstance.moveFurnitureCharge006),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName007 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',101,['bean':(cleaningJobCommandInstance),'field':("roomName007")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',103,['number':(cleaningJobCommandInstance.squareFootage007),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',105,['number':(cleaningJobCommandInstance.roomCharge007),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',107,['number':(cleaningJobCommandInstance.preVacCharge007),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',109,['number':(cleaningJobCommandInstance.protectorCharge007),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',111,['number':(cleaningJobCommandInstance.moveFurnitureCharge007),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName008 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',116,['bean':(cleaningJobCommandInstance),'field':("roomName008")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',118,['number':(cleaningJobCommandInstance.squareFootage008),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',120,['number':(cleaningJobCommandInstance.roomCharge008),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',122,['number':(cleaningJobCommandInstance.preVacCharge008),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',124,['number':(cleaningJobCommandInstance.protectorCharge008),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',126,['number':(cleaningJobCommandInstance.moveFurnitureCharge008),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088622607L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
