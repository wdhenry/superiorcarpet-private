import com.superior.base.CarpetCareJob
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_carpetCareJobindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/carpetCareJob/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("customerId"),'title':(message(code: 'carpetCareJob.customerId.label', default: 'Customer Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("date"),'title':(message(code: 'carpetCareJob.date.label', default: 'Date'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("lead"),'title':(message(code: 'carpetCareJob.lead.label', default: 'Lead'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("helper"),'title':(message(code: 'carpetCareJob.helper.label', default: 'Helper'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("groupName"),'title':(message(code: 'carpetCareJob.groupName.label', default: 'Group Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("groupRate"),'title':(message(code: 'carpetCareJob.groupRate.label', default: 'Group Rate'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( carpetCareJobInstance in (carpetCareJobInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: carpetCareJobInstance, field: "customerId"))
})
invokeTag('link','g',45,['action':("show"),'id':(carpetCareJobInstance.id)],3)
printHtmlPart(17)
invokeTag('formatDate','g',47,['format':("MM-dd-yyyy"),'date':(carpetCareJobInstance.date)],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: carpetCareJobInstance, field: "lead"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: carpetCareJobInstance, field: "helper"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: carpetCareJobInstance, field: "groupName"))
printHtmlPart(17)
invokeTag('formatNumber','g',56,['number':(carpetCareJobInstance.groupRate),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',63,['total':(carpetCareJobInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',66,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626460L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
