import com.superior.base.Dehumidifiers
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dehumidifiersshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dehumidifiers/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'dehumidifiers.label', default: 'Dehumidifiers'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (dehumidifiersInstance?.idNumber)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("dehumidifiers.idNumber.label"),'default':("Id Number")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(dehumidifiersInstance),'field':("idNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.serialNumber)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("dehumidifiers.serialNumber.label"),'default':("Serial Number")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(dehumidifiersInstance),'field':("serialNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.model)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("dehumidifiers.model.label"),'default':("Model")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(dehumidifiersInstance),'field':("model")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.isIn)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("dehumidifiers.isIn.label"),'default':("Is In")],-1)
printHtmlPart(23)
invokeTag('formatBoolean','g',57,['boolean':(dehumidifiersInstance?.isIn)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.hours)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("dehumidifiers.hours.label"),'default':("Hours")],-1)
printHtmlPart(25)
invokeTag('formatNumber','g',68,['number':(dehumidifiersInstance.hours),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(26)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.jobId)) {
printHtmlPart(27)
invokeTag('message','g',76,['code':("dehumidifiers.jobId.label"),'default':("Job Id")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',78,['bean':(dehumidifiersInstance),'field':("jobId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.dateOut)) {
printHtmlPart(29)
invokeTag('message','g',85,['code':("dehumidifiers.dateOut.label"),'default':("Date Out")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',87,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateOut)],-1)
printHtmlPart(16)
}
printHtmlPart(31)
if(true && (dehumidifiersInstance?.leadOut)) {
printHtmlPart(32)
invokeTag('message','g',94,['code':("dehumidifiers.leadOut.label"),'default':("Lead Out")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',96,['bean':(dehumidifiersInstance),'field':("leadOut")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.helperOut)) {
printHtmlPart(34)
invokeTag('message','g',103,['code':("dehumidifiers.helperOut.label"),'default':("Helper Out")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',105,['bean':(dehumidifiersInstance),'field':("helperOut")],-1)
printHtmlPart(16)
}
printHtmlPart(31)
if(true && (dehumidifiersInstance?.dateIn)) {
printHtmlPart(36)
invokeTag('message','g',112,['code':("dehumidifiers.dateIn.label"),'default':("Date In")],-1)
printHtmlPart(37)
invokeTag('formatDate','g',114,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateIn)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.leadIn)) {
printHtmlPart(38)
invokeTag('message','g',121,['code':("dehumidifiers.leadIn.label"),'default':("Lead In")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',123,['bean':(dehumidifiersInstance),'field':("leadIn")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dehumidifiersInstance?.helperIn)) {
printHtmlPart(40)
invokeTag('message','g',130,['code':("dehumidifiers.helperIn.label"),'default':("Helper In")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',132,['bean':(dehumidifiersInstance),'field':("helperIn")],-1)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',140,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',140,['class':("edit"),'action':("edit"),'resource':(dehumidifiersInstance)],3)
printHtmlPart(44)
invokeTag('submitButton','g',141,['class':("delete"),'name':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',143,['url':([resource:dehumidifiersInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',145,[:],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625994L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
