import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formGroupRooms_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formGroupRooms.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('fieldValue','g',6,['bean':(cleaningJobCommandInstance),'field':("groupName")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',8,['number':(cleaningJobCommandInstance.groupRate),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('fieldValue','g',19,['bean':(cleaningJobCommandInstance),'field':("roomName1")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',21,['number':(cleaningJobCommandInstance.squareFootage1),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',23,['number':(cleaningJobCommandInstance.preVacCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',25,['number':(cleaningJobCommandInstance.protectorCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',27,['number':(cleaningJobCommandInstance.moveFurnitureCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
if(true && (cleaningJobCommandInstance.roomName2 != null)) {
printHtmlPart(4)
invokeTag('fieldValue','g',31,['bean':(cleaningJobCommandInstance),'field':("roomName2")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',33,['number':(cleaningJobCommandInstance.squareFootage2),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',35,['number':(cleaningJobCommandInstance.preVacCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',37,['number':(cleaningJobCommandInstance.protectorCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',39,['number':(cleaningJobCommandInstance.moveFurnitureCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (cleaningJobCommandInstance.roomName3 != null)) {
printHtmlPart(4)
invokeTag('fieldValue','g',44,['bean':(cleaningJobCommandInstance),'field':("roomName3")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',46,['number':(cleaningJobCommandInstance.squareFootage3),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',48,['number':(cleaningJobCommandInstance.preVacCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',50,['number':(cleaningJobCommandInstance.protectorCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',52,['number':(cleaningJobCommandInstance.moveFurnitureCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (cleaningJobCommandInstance.roomName4 != null)) {
printHtmlPart(4)
invokeTag('fieldValue','g',57,['bean':(cleaningJobCommandInstance),'field':("roomName4")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',59,['number':(cleaningJobCommandInstance.squareFootage4),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',61,['number':(cleaningJobCommandInstance.preVacCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',63,['number':(cleaningJobCommandInstance.protectorCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',65,['number':(cleaningJobCommandInstance.moveFurnitureCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (cleaningJobCommandInstance.roomName5 != null)) {
printHtmlPart(4)
invokeTag('fieldValue','g',70,['bean':(cleaningJobCommandInstance),'field':("roomName5")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',72,['number':(cleaningJobCommandInstance.squareFootage5),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',74,['number':(cleaningJobCommandInstance.preVacCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',76,['number':(cleaningJobCommandInstance.protectorCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
invokeTag('formatNumber','g',78,['number':(cleaningJobCommandInstance.moveFurnitureCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(6)
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625802L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
