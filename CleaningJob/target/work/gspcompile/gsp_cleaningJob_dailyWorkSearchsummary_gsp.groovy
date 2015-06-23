import com.superior.base.DailyWorkRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dailyWorkSearchsummary_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dailyWorkSearch/summary.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'dailywork.label', default: 'Daily Work'))],-1)
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
invokeTag('message','g',15,['code':("default.search.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("search"),'action':("index")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("date"),'title':(message(code: 'dailywork.date.label', default: 'Date'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("lead"),'title':(message(code: 'dailywork.lead.label', default: 'Lead'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("leadHours"),'title':(message(code: 'dailywork.leadHours.label', default: 'Hours'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',33,['property':("leadMinutes"),'title':(message(code: 'dailywork.leadMinutes.label', default: 'Minutes'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',35,['property':("helper"),'title':(message(code: 'dailywork.helper.label', default: 'Helper'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',37,['property':("helperHours"),'title':(message(code: 'dailywork.helperHours.label', default: 'Hours'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',39,['property':("helperMinutes"),'title':(message(code: 'dailywork.helperMinutes.label', default: 'Minutes'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',41,['property':("vanNumber"),'title':(message(code: 'dailywork.van.label', default: 'Van'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',43,['property':("miles"),'title':(message(code: 'dailywork.miles.label', default: 'Miles'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',45,['property':("hours"),'title':(message(code: 'dailywork.hours.label', default: 'Unit Hours'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',47,['property':("collected"),'title':(message(code: 'dailywork.collected.label', default: 'Collected'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( dailyWorkInstance in (work) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
invokeTag('formatDate','g',55,['format':("MM-dd-yyyy"),'date':(dailyWorkInstance.date)],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: dailyWorkInstance, field: "lead"))
printHtmlPart(18)
invokeTag('formatNumber','g',59,['number':(dailyWorkInstance.leadHours),'type':("number")],-1)
printHtmlPart(19)
invokeTag('formatNumber','g',61,['number':(dailyWorkInstance.leadMinutes),'type':("number")],-1)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: dailyWorkInstance, field: "helper"))
printHtmlPart(19)
invokeTag('formatNumber','g',65,['number':(dailyWorkInstance.helperHours),'type':("number")],-1)
printHtmlPart(19)
invokeTag('formatNumber','g',67,['number':(dailyWorkInstance.helperMinutes),'type':("number")],-1)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: dailyWorkInstance, field: "vanNumber"))
printHtmlPart(18)
invokeTag('formatNumber','g',71,['number':(dailyWorkInstance.milesDriven),'type':("number")],-1)
printHtmlPart(19)
invokeTag('formatNumber','g',73,['number':(dailyWorkInstance.hoursOnUnit),'type':("number")],-1)
printHtmlPart(19)
invokeTag('formatNumber','g',76,['number':(dailyWorkInstance.dollarsCollected),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',84,['total':(dailyWorkJobInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',87,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625448L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
