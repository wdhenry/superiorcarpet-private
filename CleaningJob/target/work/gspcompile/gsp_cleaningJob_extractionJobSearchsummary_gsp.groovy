import com.superior.base.WaterExtractionJob
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_extractionJobSearchsummary_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/extractionJobSearch/summary.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'waterExtractionJob.label', default: 'Water Extraction Job'))],-1)
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
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',26,['property':("customerId"),'title':(message(code: 'waterExtractionJob.jobId.label', default: 'Job Id'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',28,['property':("date"),'title':(message(code: 'waterExtractionJob.date.label', default: 'Date'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',30,['property':("lead"),'title':(message(code: 'waterExtractionJob.lead.label', default: 'Lead'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',32,['property':("helper"),'title':(message(code: 'waterExtractionJob.helper.label', default: 'Helper'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',34,['property':("startTime"),'title':(message(code: 'waterExtractionJob.startTime.label', default: 'Start Time'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',36,['property':("endTime"),'title':(message(code: 'waterExtractionJob.endTime.label', default: 'End Time'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( waterExtractionJobInstance in (jobs) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: waterExtractionJobInstance, field: "id"))
})
invokeTag('link','g',44,['action':("details"),'id':(waterExtractionJobInstance.id)],3)
printHtmlPart(16)
invokeTag('formatDate','g',46,['format':("MM-dd-yyyy"),'date':(waterExtractionJobInstance.date)],-1)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: waterExtractionJobInstance, field: "lead"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: waterExtractionJobInstance, field: "helper"))
printHtmlPart(16)
invokeTag('formatDate','g',52,['format':("hh:mm a"),'date':(waterExtractionJobInstance.startTime)],-1)
printHtmlPart(16)
invokeTag('formatDate','g',54,['format':("hh:mm a"),'date':(waterExtractionJobInstance.endTime)],-1)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',61,['total':(waterExtractionJobInstanceCount ?: 0)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',64,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625857L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
