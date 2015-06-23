import com.superior.base.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_extractionJobindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/extractionJob/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
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
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',26,['property':("firstName"),'title':(message(code: 'customer.firstName.label', default: 'First Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',28,['property':("lastName"),'title':(message(code: 'customer.lastName.label', default: 'Last Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',30,['property':("addressLineOne"),'title':(message(code: 'customer.addressLineOne.label', default: 'Address'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',32,['property':("addressLineTwo"),'title':(message(code: 'customer.addressLineTwo.label', default: 'Address'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',34,['property':("city"),'title':(message(code: 'customer.city.label', default: 'City'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',36,['property':("state"),'title':(message(code: 'customer.state.label', default: 'State'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',38,['property':("zip"),'title':(message(code: 'customer.zip.label', default: 'Zip'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',40,['property':("phone"),'title':(message(code: 'customer.phone.label', default: 'Phone'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( customerInstance in (customerInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: customerInstance, field: "firstName"))
})
invokeTag('link','g',48,['action':("newJob"),'id':(customerInstance.id)],3)
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: customerInstance, field: "lastName"))
})
invokeTag('link','g',50,['action':("newJob"),'id':(customerInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: customerInstance, field: "addressLineOne"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: customerInstance, field: "addressLineTwo"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: customerInstance, field: "city"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: customerInstance, field: "state"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: customerInstance, field: "zip"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: customerInstance, field: "phoneNumber"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',69,['total':(customerInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',72,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626359L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
