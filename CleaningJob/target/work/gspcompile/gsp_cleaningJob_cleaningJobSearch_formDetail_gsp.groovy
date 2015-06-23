import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formDetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formDetail.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('fieldValue','g',8,['bean':(cleaningJobCommandInstance),'field':("firstName")],-1)
printHtmlPart(1)
invokeTag('fieldValue','g',9,['bean':(cleaningJobCommandInstance),'field':("lastName")],-1)
printHtmlPart(1)
invokeTag('fieldValue','g',10,['bean':(cleaningJobCommandInstance),'field':("addressLineOne")],-1)
printHtmlPart(1)
invokeTag('fieldValue','g',11,['bean':(cleaningJobCommandInstance),'field':("addressLineTwo")],-1)
printHtmlPart(2)
invokeTag('formatDate','g',20,['format':("MM-dd-yyyy"),'date':(cleaningJobCommandInstance.date)],-1)
printHtmlPart(1)
invokeTag('fieldValue','g',21,['bean':(cleaningJobCommandInstance),'field':("lead")],-1)
printHtmlPart(1)
invokeTag('fieldValue','g',22,['bean':(cleaningJobCommandInstance),'field':("helper")],-1)
printHtmlPart(3)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625940L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
