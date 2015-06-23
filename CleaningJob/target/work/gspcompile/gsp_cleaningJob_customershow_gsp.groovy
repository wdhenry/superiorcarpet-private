import com.superior.base.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_customershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/show.gsp" }
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
if(true && (customerInstance?.firstName)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("customer.firstName.label"),'default':("First Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(customerInstance),'field':("firstName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.lastName)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("customer.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(customerInstance),'field':("lastName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.addressLineOne)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("customer.addressLineOne.label"),'default':("Address Line One")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(customerInstance),'field':("addressLineOne")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.addressLineTwo)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("customer.addressLineTwo.label"),'default':("Address Line Two")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(customerInstance),'field':("addressLineTwo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.city)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("customer.city.label"),'default':("City")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(customerInstance),'field':("city")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.state)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("customer.state.label"),'default':("State")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(customerInstance),'field':("state")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.zip)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("customer.zip.label"),'default':("Zip")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(customerInstance),'field':("zip")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (customerInstance?.phoneNumber)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("customer.phoneNumber.label"),'default':("Phone Number")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(customerInstance),'field':("phoneNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
createTagBody(3, {->
invokeTag('message','g',101,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',101,['class':("edit"),'action':("edit"),'resource':(customerInstance)],3)
printHtmlPart(34)
})
invokeTag('form','g',102,['url':([resource:customerInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',102,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626435L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
