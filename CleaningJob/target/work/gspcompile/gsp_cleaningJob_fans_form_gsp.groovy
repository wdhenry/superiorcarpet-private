import com.superior.base.Fans
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_fans_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fans/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: fansInstance, field: 'idNumber', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("fans.idNumber.label"),'default':("Id Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("idNumber"),'required':(""),'value':(fansInstance?.idNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'serialNumber', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("fans.serialNumber.label"),'default':("Serial Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("serialNumber"),'required':(""),'value':(fansInstance?.serialNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'model', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("fans.model.label"),'default':("Model")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("model"),'required':(""),'value':(fansInstance?.model)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'isIn', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("fans.isIn.label"),'default':("Is In")],-1)
printHtmlPart(7)
invokeTag('checkBox','g',37,['name':("isIn"),'value':(fansInstance?.isIn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'jobId', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("fans.jobId.label"),'default':("Job Id")],-1)
printHtmlPart(7)
invokeTag('field','g',46,['name':("jobId"),'type':("number"),'value':(fansInstance.jobId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'dateOut', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("fans.dateOut.label"),'default':("Date Out")],-1)
printHtmlPart(7)
invokeTag('datePicker','g',55,['name':("dateOut"),'precision':("day"),'value':(fansInstance?.dateOut),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'dateIn', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("fans.dateIn.label"),'default':("Date In")],-1)
printHtmlPart(7)
invokeTag('datePicker','g',64,['name':("dateIn"),'precision':("day"),'value':(fansInstance?.dateIn),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'leadOut', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("fans.leadOut.label"),'default':("Lead Out")],-1)
printHtmlPart(7)
invokeTag('textField','g',73,['name':("leadOut"),'value':(fansInstance?.leadOut)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'helperOut', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("fans.helperOut.label"),'default':("Helper Out")],-1)
printHtmlPart(7)
invokeTag('textField','g',82,['name':("helperOut"),'value':(fansInstance?.helperOut)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'leadIn', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("fans.leadIn.label"),'default':("Lead In")],-1)
printHtmlPart(7)
invokeTag('textField','g',91,['name':("leadIn"),'value':(fansInstance?.leadIn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: fansInstance, field: 'helperIn', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("fans.helperIn.label"),'default':("Helper In")],-1)
printHtmlPart(7)
invokeTag('textField','g',100,['name':("helperIn"),'value':(fansInstance?.helperIn)],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625744L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
