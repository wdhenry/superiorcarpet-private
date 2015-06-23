import com.superior.base.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_fansListcustomer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fansList/customer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'fans.label', default: 'Fans'))],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName1"),'value':(message(code: 'customer.label', default: 'Customer'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName1])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (customerInstance?.firstName)) {
printHtmlPart(12)
invokeTag('message','g',27,['code':("customer.firstName.label"),'default':("First Name")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',29,['bean':(customerInstance),'field':("firstName")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.lastName)) {
printHtmlPart(16)
invokeTag('message','g',36,['code':("customer.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(17)
invokeTag('fieldValue','g',38,['bean':(customerInstance),'field':("lastName")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.addressLineOne)) {
printHtmlPart(18)
invokeTag('message','g',45,['code':("customer.addressLineOne.label"),'default':("Address Line One")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',47,['bean':(customerInstance),'field':("addressLineOne")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.addressLineTwo)) {
printHtmlPart(20)
invokeTag('message','g',54,['code':("customer.addressLineTwo.label"),'default':("Address Line Two")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',56,['bean':(customerInstance),'field':("addressLineTwo")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.city)) {
printHtmlPart(22)
invokeTag('message','g',63,['code':("customer.city.label"),'default':("City")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',65,['bean':(customerInstance),'field':("city")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.state)) {
printHtmlPart(24)
invokeTag('message','g',72,['code':("customer.state.label"),'default':("State")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',74,['bean':(customerInstance),'field':("state")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.zip)) {
printHtmlPart(26)
invokeTag('message','g',81,['code':("customer.zip.label"),'default':("Zip")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',83,['bean':(customerInstance),'field':("zip")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (customerInstance?.phoneNumber)) {
printHtmlPart(28)
invokeTag('message','g',90,['code':("customer.phoneNumber.label"),'default':("Phone Number")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',92,['bean':(customerInstance),'field':("phoneNumber")],-1)
printHtmlPart(14)
}
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088624976L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
