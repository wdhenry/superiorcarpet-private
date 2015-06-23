import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formUpholstery_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formUpholstery.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (cleaningJobCommandInstance.upholsteryName1 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',9,['bean':(cleaningJobCommandInstance),'field':("upholsteryName1")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',11,['number':(cleaningJobCommandInstance.upholsteryCount1),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',13,['number':(cleaningJobCommandInstance.upholsteryCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',15,['number':(cleaningJobCommandInstance.upholsteryProtectorCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.upholsteryName2 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',20,['bean':(cleaningJobCommandInstance),'field':("upholsteryName2")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',22,['number':(cleaningJobCommandInstance.upholsteryCount2),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',24,['number':(cleaningJobCommandInstance.upholsteryCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',26,['number':(cleaningJobCommandInstance.upholsteryProtectorCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.upholsteryName3 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',31,['bean':(cleaningJobCommandInstance),'field':("upholsteryName3")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',33,['number':(cleaningJobCommandInstance.upholsteryCount3),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',35,['number':(cleaningJobCommandInstance.upholsteryCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',37,['number':(cleaningJobCommandInstance.upholsteryProtectorCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.upholsteryName4 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',42,['bean':(cleaningJobCommandInstance),'field':("upholsteryName4")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',44,['number':(cleaningJobCommandInstance.upholsteryCount4),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',46,['number':(cleaningJobCommandInstance.upholsteryCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',48,['number':(cleaningJobCommandInstance.upholsteryProtectorCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.upholsteryName5 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',53,['bean':(cleaningJobCommandInstance),'field':("upholsteryName5")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',55,['number':(cleaningJobCommandInstance.upholsteryCount5),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',57,['number':(cleaningJobCommandInstance.upholsteryCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',59,['number':(cleaningJobCommandInstance.upholsteryProtectorCharge5),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.upholsteryName6 != null)) {
printHtmlPart(1)
invokeTag('fieldValue','g',64,['bean':(cleaningJobCommandInstance),'field':("upholsteryName6")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',66,['number':(cleaningJobCommandInstance.upholsteryCount6),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',68,['number':(cleaningJobCommandInstance.upholsteryCharge6),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('formatNumber','g',70,['number':(cleaningJobCommandInstance.upholsteryProtectorCharge6),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626119L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
