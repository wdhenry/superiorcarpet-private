import com.superior.base.MiscChargesName
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_miscChargesNameindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/miscChargesName/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'miscChargesName.label', default: 'MiscChargesName'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('message','g',10,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',21,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',32,['property':("miscChargesName"),'title':(message(code: 'miscChargesName.miscChargesName.label', default: 'Misc Charge Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',34,['property':("miscChargeRate"),'title':(message(code: 'miscChargesName.miscChargeRate.label', default: 'Misc Charge Rate'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( miscChargesNameInstance in (miscChargesNameInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(fieldValue(bean: miscChargesNameInstance, field: "miscChargesName"))
printHtmlPart(18)
})
invokeTag('link','g',44,['action':("show"),'id':(miscChargesNameInstance.id)],3)
printHtmlPart(19)
invokeTag('formatNumber','g',46,['number':(miscChargesNameInstance.miscChargeRate),'type':("currency"),'maxFractionDigits':("2"),'currencyCode':("USD")],-1)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',53,['total':(miscChargesNameInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',56,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625726L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
