import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJob_formJobDetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJob/_formJobDetail.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'date', 'error'))
printHtmlPart(1)
invokeTag('datePicker','g',16,['name':("date"),'precision':("day"),'value':(cleaningJobCommandInstance?.date)],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'lead', 'error'))
printHtmlPart(1)
invokeTag('select','g',26,['name':("lead"),'from':(com.superior.base.Lead.list()),'optionKey':("leadName"),'optionValue':("leadName"),'value':(cleaningJobCommandInstance?.lead),'noSelection':(['Pick a Name':'--Pick a Name--']),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'helper', 'error'))
printHtmlPart(3)
invokeTag('select','g',36,['name':("helper"),'from':(com.superior.base.Helper.list()),'optionKey':("helperName"),'optionValue':("helperName"),'value':(cleaningJobCommandInstance?.helper),'noSelection':(['None':'--None--']),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'customerId', 'error'))
printHtmlPart(1)
invokeTag('field','g',43,['name':("customerId"),'type':("hidden"),'value':(cleaningJobCommandInstance.customerId),'required':("")],-1)
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625931L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
