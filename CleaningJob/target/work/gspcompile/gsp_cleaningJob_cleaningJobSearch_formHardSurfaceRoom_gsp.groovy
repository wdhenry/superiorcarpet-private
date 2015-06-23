import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formHardSurfaceRoom_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formHardSurfaceRoom.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (cleaningJobCommandInstance.hsRoomName1 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',10,['bean':(cleaningJobCommandInstance),'field':("hsRoomName1")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',12,['number':(cleaningJobCommandInstance.hsSquareFootage1),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',14,['number':(cleaningJobCommandInstance.hsRoomCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',16,['number':(cleaningJobCommandInstance.hsEtchedCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',18,['number':(cleaningJobCommandInstance.hsSealedWaxedCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.hsRoomName2 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',23,['bean':(cleaningJobCommandInstance),'field':("hsRoomName2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',25,['number':(cleaningJobCommandInstance.hsSquareFootage2),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',27,['number':(cleaningJobCommandInstance.hsRoomCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',29,['number':(cleaningJobCommandInstance.hsEtchedCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',31,['number':(cleaningJobCommandInstance.hsSealedWaxedCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.hsRoomName3 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',36,['bean':(cleaningJobCommandInstance),'field':("hsRoomName3")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',38,['number':(cleaningJobCommandInstance.hsSquareFootage3),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',40,['number':(cleaningJobCommandInstance.hsRoomCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',42,['number':(cleaningJobCommandInstance.hsEtchedCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',44,['number':(cleaningJobCommandInstance.hsSealedWaxedCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.hsRoomName4 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',49,['bean':(cleaningJobCommandInstance),'field':("hsRoomName4")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',51,['number':(cleaningJobCommandInstance.hsSquareFootage4),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',53,['number':(cleaningJobCommandInstance.hsRoomCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',55,['number':(cleaningJobCommandInstance.hsEtchedCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',57,['number':(cleaningJobCommandInstance.hsSealedWaxedCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.hsRoomName5 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',62,['bean':(cleaningJobCommandInstance),'field':("hsRoomName5")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',64,['number':(cleaningJobCommandInstance.hsSquareFootage5),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',66,['number':(cleaningJobCommandInstance.hsRoomCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',68,['number':(cleaningJobCommandInstance.hsEtchedCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',70,['number':(cleaningJobCommandInstance.hsSealedWaxedCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.hsRoomName6 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',75,['bean':(cleaningJobCommandInstance),'field':("hsRoomName6")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',77,['number':(cleaningJobCommandInstance.hsSquareFootage6),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',79,['number':(cleaningJobCommandInstance.hsRoomCharge6),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',81,['number':(cleaningJobCommandInstance.hsEtchedCharge6),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',83,['number':(cleaningJobCommandInstance.hsSealedWaxedCharge6),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088624922L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
