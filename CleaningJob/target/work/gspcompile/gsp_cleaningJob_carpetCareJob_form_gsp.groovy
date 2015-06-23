import com.superior.base.CarpetCareJob
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_carpetCareJob_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/carpetCareJob/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'customerId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("carpetCareJob.customerId.label"),'default':("Customer Id")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("customerId"),'type':("number"),'value':(carpetCareJobInstance.customerId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'date', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("carpetCareJob.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("date"),'precision':("day"),'value':(carpetCareJobInstance?.date)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'lead', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("carpetCareJob.lead.label"),'default':("Lead")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("lead"),'required':(""),'value':(carpetCareJobInstance?.lead)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'helper', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("carpetCareJob.helper.label"),'default':("Helper")],-1)
printHtmlPart(7)
invokeTag('textField','g',37,['name':("helper"),'value':(carpetCareJobInstance?.helper)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'groupName', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("carpetCareJob.groupName.label"),'default':("Group Name")],-1)
printHtmlPart(7)
invokeTag('textField','g',46,['name':("groupName"),'value':(carpetCareJobInstance?.groupName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'groupRate', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("carpetCareJob.groupRate.label"),'default':("Group Rate")],-1)
printHtmlPart(7)
invokeTag('field','g',55,['name':("groupRate"),'value':(fieldValue(bean: carpetCareJobInstance, field: 'groupRate'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: carpetCareJobInstance, field: 'comment', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("carpetCareJob.comment.label"),'default':("Comment")],-1)
printHtmlPart(7)
invokeTag('textField','g',64,['name':("comment"),'value':(carpetCareJobInstance?.comment)],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625705L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
