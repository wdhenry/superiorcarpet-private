import com.superior.base.DailyWorkRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dailyWorkshowWork_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dailyWork/showWork.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'dailywork.label', default: 'Daily Work'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',10,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("index")],2)
printHtmlPart(7)
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("date"),'title':(message(code: 'dailyWorkRecord.date.label', default: 'Date'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("lead"),'title':(message(code: 'dailyWorkRecord.lead.label', default: 'Lead'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("leadHours"),'title':(message(code: 'dailyWorkRecord.leadHours.label', default: 'Hours'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',31,['property':("leadMinutes"),'title':(message(code: 'dailyWorkRecord.leadMinutes.label', default: 'Mins'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',33,['property':("helper"),'title':(message(code: 'dailyWorkRecord.helper.label', default: 'Helper'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',35,['property':("helperHours"),'title':(message(code: 'dailyWorkRecord.helperHours.label', default: 'Hours'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("helperMinutes"),'title':(message(code: 'dailyWorkRecord.helperMinutes.label', default: 'Mins'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',39,['property':("vanNumber"),'title':(message(code: 'dailyWorkRecord.van.label', default: 'Van'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',41,['property':("milesDriven"),'title':(message(code: 'dailyWorkRecord.miles.label', default: 'Miles'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',43,['property':("hoursOnUnit"),'title':(message(code: 'dailyWorkRecord.unit.label', default: 'Unit'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',45,['property':("dollarsCollected"),'title':(message(code: 'dailyWorkRecord.dollars.label', default: '$'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( dailyWorkRecordInstance in (dailyWorkRecordInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
invokeTag('formatDate','g',52,['format':("MM-dd-yyyy"),'date':(dailyWorkRecordInstance.date)],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: dailyWorkRecordInstance, field: "lead"))
printHtmlPart(18)
invokeTag('formatNumber','g',56,['number':(dailyWorkRecordInstance.leadHours),'type':("number")],-1)
printHtmlPart(18)
invokeTag('formatNumber','g',58,['number':(dailyWorkRecordInstance.leadMinutes),'type':("number")],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: dailyWorkRecordInstance, field: "helper"))
printHtmlPart(18)
invokeTag('formatNumber','g',62,['number':(dailyWorkRecordInstance.helperHours),'type':("number")],-1)
printHtmlPart(18)
invokeTag('formatNumber','g',64,['number':(dailyWorkRecordInstance.helperMinutes),'type':("number")],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: dailyWorkRecordInstance, field: "vanNumber"))
printHtmlPart(17)
invokeTag('formatNumber','g',68,['number':(dailyWorkRecordInstance.milesDriven),'type':("number")],-1)
printHtmlPart(18)
invokeTag('formatNumber','g',70,['number':(dailyWorkRecordInstance.hoursOnUnit),'type':("number")],-1)
printHtmlPart(18)
invokeTag('formatNumber','g',73,['number':(dailyWorkRecordInstance.dollarsCollected),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',81,['total':(dailyWorkRecordInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',84,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434340334544L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
