import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formStairs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formStairs.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('fieldValue','g',7,['bean':(cleaningJobCommandInstance),'field':("stairDirection1")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',9,['number':(cleaningJobCommandInstance.stairCount1),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(1)
invokeTag('formatNumber','g',11,['number':(cleaningJobCommandInstance.stairCharge1),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(2)
if(true && (cleaningJobCommandInstance.stairDirection2 != null)) {
printHtmlPart(3)
invokeTag('fieldValue','g',15,['bean':(cleaningJobCommandInstance),'field':("stairDirection2")],-1)
printHtmlPart(4)
invokeTag('formatNumber','g',17,['number':(cleaningJobCommandInstance.stairCount2),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(4)
invokeTag('formatNumber','g',19,['number':(cleaningJobCommandInstance.stairCharge2),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
}
printHtmlPart(6)
if(true && (cleaningJobCommandInstance.stairDirection3 != null)) {
printHtmlPart(7)
invokeTag('fieldValue','g',24,['bean':(cleaningJobCommandInstance),'field':("stairDirection3")],-1)
printHtmlPart(4)
invokeTag('formatNumber','g',26,['number':(cleaningJobCommandInstance.stairCount3),'type':("number"),'maxFractionDigits':("0"),'minFractionDigits':("0")],-1)
printHtmlPart(4)
invokeTag('formatNumber','g',28,['number':(cleaningJobCommandInstance.stairCharge3),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(5)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626353L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
