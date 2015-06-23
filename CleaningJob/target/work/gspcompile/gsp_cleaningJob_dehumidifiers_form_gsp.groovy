import com.superior.base.Dehumidifiers
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dehumidifiers_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dehumidifiers/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'idNumber', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("dehumidifiers.idNumber.label"),'default':("Id Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("idNumber"),'required':(""),'value':(dehumidifiersInstance?.idNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'serialNumber', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("dehumidifiers.serialNumber.label"),'default':("Serial Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("serialNumber"),'required':(""),'value':(dehumidifiersInstance?.serialNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'model', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("dehumidifiers.model.label"),'default':("Model")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("model"),'required':(""),'value':(dehumidifiersInstance?.model)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'isIn', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("dehumidifiers.isIn.label"),'default':("Is In")],-1)
printHtmlPart(7)
invokeTag('checkBox','g',37,['name':("isIn"),'value':(dehumidifiersInstance?.isIn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'hours', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("dehumidifiers.hours.label"),'default':("Hours")],-1)
printHtmlPart(7)
invokeTag('field','g',46,['name':("hours"),'value':(fieldValue(bean: dehumidifiersInstance, field: 'hours'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'jobId', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("dehumidifiers.jobId.label"),'default':("Job Id")],-1)
printHtmlPart(7)
invokeTag('field','g',55,['name':("jobId"),'type':("number"),'value':(dehumidifiersInstance.jobId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'dateOut', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("dehumidifiers.dateOut.label"),'default':("Date Out")],-1)
printHtmlPart(7)
invokeTag('datePicker','g',64,['name':("dateOut"),'precision':("day"),'value':(dehumidifiersInstance?.dateOut),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'dateIn', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("dehumidifiers.dateIn.label"),'default':("Date In")],-1)
printHtmlPart(7)
invokeTag('datePicker','g',73,['name':("dateIn"),'precision':("day"),'value':(dehumidifiersInstance?.dateIn),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'leadOut', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("dehumidifiers.leadOut.label"),'default':("Lead Out")],-1)
printHtmlPart(7)
invokeTag('textField','g',82,['name':("leadOut"),'value':(dehumidifiersInstance?.leadOut)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'helperOut', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("dehumidifiers.helperOut.label"),'default':("Helper Out")],-1)
printHtmlPart(7)
invokeTag('textField','g',91,['name':("helperOut"),'value':(dehumidifiersInstance?.helperOut)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'leadIn', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("dehumidifiers.leadIn.label"),'default':("Lead In")],-1)
printHtmlPart(7)
invokeTag('textField','g',100,['name':("leadIn"),'value':(dehumidifiersInstance?.leadIn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dehumidifiersInstance, field: 'helperIn', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("dehumidifiers.helperIn.label"),'default':("Helper In")],-1)
printHtmlPart(7)
invokeTag('textField','g',109,['name':("helperIn"),'value':(dehumidifiersInstance?.helperIn)],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625760L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
