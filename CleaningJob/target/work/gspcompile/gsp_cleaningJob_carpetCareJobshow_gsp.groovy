import com.superior.base.CarpetCareJob
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_carpetCareJobshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/carpetCareJob/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'carpetCareJob.label', default: 'CarpetCareJob'))],-1)
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
if(true && (carpetCareJobInstance?.customerId)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("carpetCareJob.customerId.label"),'default':("Customer Id")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(carpetCareJobInstance),'field':("customerId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (carpetCareJobInstance?.date)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("carpetCareJob.date.label"),'default':("Date")],-1)
printHtmlPart(19)
invokeTag('formatDate','g',39,['format':("MM-dd-yyyy"),'date':(carpetCareJobInstance?.date)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (carpetCareJobInstance?.lead)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("carpetCareJob.lead.label"),'default':("Lead")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(carpetCareJobInstance),'field':("lead")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (carpetCareJobInstance?.helper)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("carpetCareJob.helper.label"),'default':("Helper")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(carpetCareJobInstance),'field':("helper")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (carpetCareJobInstance?.groupName)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("carpetCareJob.groupName.label"),'default':("Group Name")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(carpetCareJobInstance),'field':("groupName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (carpetCareJobInstance?.groupRate)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("carpetCareJob.groupRate.label"),'default':("Group Rate")],-1)
printHtmlPart(27)
invokeTag('formatNumber','g',77,['number':(carpetCareJobInstance.groupRate),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(28)
}
printHtmlPart(17)
if(true && (carpetCareJobInstance?.comment)) {
printHtmlPart(29)
invokeTag('message','g',85,['code':("carpetCareJob.comment.label"),'default':("Comment")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',87,['bean':(carpetCareJobInstance),'field':("comment")],-1)
printHtmlPart(16)
}
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
createTagBody(3, {->
invokeTag('message','g',95,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',95,['class':("edit"),'action':("edit"),'resource':(carpetCareJobInstance)],3)
printHtmlPart(33)
invokeTag('submitButton','g',96,['class':("delete"),'name':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(34)
})
invokeTag('form','g',98,['url':([resource:carpetCareJobInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',100,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625536L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
