import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formMiscCharge_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formMiscCharge.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('fieldValue','g',6,['bean':(cleaningJobCommandInstance),'field':("miscChargesName1")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',8,['number':(cleaningJobCommandInstance.miscCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('fieldValue','g',11,['bean':(cleaningJobCommandInstance),'field':("miscChargesName2")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',13,['number':(cleaningJobCommandInstance.miscCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('fieldValue','g',16,['bean':(cleaningJobCommandInstance),'field':("miscChargesName3")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',18,['number':(cleaningJobCommandInstance.miscCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
invokeTag('fieldValue','g',21,['bean':(cleaningJobCommandInstance),'field':("miscChargesName4")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',23,['number':(cleaningJobCommandInstance.miscCharge4),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(3)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434161321840L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
