import com.superior.base.Fans
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_fansshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fans/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'fans.label', default: 'Fans'))],-1)
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
if(true && (fansInstance?.idNumber)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("fans.idNumber.label"),'default':("Id Number")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(fansInstance),'field':("idNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.serialNumber)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("fans.serialNumber.label"),'default':("Serial Number")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(fansInstance),'field':("serialNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.model)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("fans.model.label"),'default':("Model")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(fansInstance),'field':("model")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.isIn)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("fans.isIn.label"),'default':("Is In")],-1)
printHtmlPart(23)
invokeTag('formatBoolean','g',57,['boolean':(fansInstance?.isIn)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.jobId)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("fans.jobId.label"),'default':("Job Id")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(fansInstance),'field':("jobId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.dateOut)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("fans.dateOut.label"),'default':("Date Out")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',75,['format':("MM-dd-yyyy"),'date':(fansInstance?.dateOut)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.leadOut)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("fans.leadOut.label"),'default':("Lead Out")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(fansInstance),'field':("leadOut")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.helperOut)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("fans.helperOut.label"),'default':("Helper Out")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(fansInstance),'field':("helperOut")],-1)
printHtmlPart(16)
}
printHtmlPart(32)
if(true && (fansInstance?.isIn)) {
printHtmlPart(33)
invokeTag('message','g',100,['code':("fans.dateIn.label"),'default':("Date In")],-1)
printHtmlPart(34)
invokeTag('formatDate','g',102,['format':("MM-dd-yyyy"),'date':(fansInstance?.dateIn)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.isIn)) {
printHtmlPart(35)
invokeTag('message','g',109,['code':("fans.leadIn.label"),'default':("Lead In")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',111,['bean':(fansInstance),'field':("leadIn")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (fansInstance?.isIn)) {
printHtmlPart(37)
invokeTag('message','g',118,['code':("fans.helperIn.label"),'default':("Helper In")],-1)
printHtmlPart(38)
invokeTag('fieldValue','g',120,['bean':(fansInstance),'field':("helperIn")],-1)
printHtmlPart(16)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',128,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',128,['class':("edit"),'action':("edit"),'resource':(fansInstance)],3)
printHtmlPart(41)
invokeTag('submitButton','g',129,['class':("delete"),'name':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',131,['url':([resource:fansInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',133,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625658L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
