import com.superior.base.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobsummary_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJob/summary.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
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
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('sortableColumn','g',28,['property':("firstName"),'title':(message(code: 'customer.firstName.label', default: 'First Name'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',30,['property':("lastName"),'title':(message(code: 'customer.lastName.label', default: 'Last Name'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',32,['property':("addressLineOne"),'title':(message(code: 'customer.addressLineOne.label', default: 'Address'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',34,['property':("addressLineTwo"),'title':(message(code: 'customer.addressLineTwo.label', default: 'Address'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',36,['property':("city"),'title':(message(code: 'customer.city.label', default: 'City'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',38,['property':("state"),'title':(message(code: 'customer.state.label', default: 'State'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',40,['property':("zip"),'title':(message(code: 'customer.zip.label', default: 'Zip'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',42,['property':("phone"),'title':(message(code: 'customer.phone.label', default: 'Phone'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( customerInstance in (customers) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: customerInstance, field: "firstName"))
})
invokeTag('link','g',50,['action':("newJob"),'id':(customerInstance.id)],3)
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: customerInstance, field: "lastName"))
})
invokeTag('link','g',52,['action':("newJob"),'id':(customerInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: customerInstance, field: "addressLineOne"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: customerInstance, field: "addressLineTwo"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: customerInstance, field: "city"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: customerInstance, field: "state"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: customerInstance, field: "zip"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: customerInstance, field: "phoneNumber"))
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
invokeTag('paginate','g',71,['total':(custListInstanceCount ?: 0)],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',74,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434075631147L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}