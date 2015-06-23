import com.superior.base.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_customerSearchdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customerSearch/details.gsp" }
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
invokeTag('message','g',15,['code':("default.search.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (customerInstance?.firstName)) {
printHtmlPart(13)
invokeTag('message','g',27,['code':("customer.firstName.label"),'default':("First Name")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',28,['bean':(customerInstance),'field':("firstName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',33,['code':("customer.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(17)
invokeTag('fieldValue','g',34,['bean':(customerInstance),'field':("lastName")],-1)
printHtmlPart(18)
invokeTag('message','g',38,['code':("customer.addressLineOne.label"),'default':("Address Line One")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(customerInstance),'field':("addressLineOne")],-1)
printHtmlPart(20)
if(true && (customerInstance?.addressLineTwo)) {
printHtmlPart(21)
invokeTag('message','g',44,['code':("customer.addressLineTwo.label"),'default':("Address Line Two")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',45,['bean':(customerInstance),'field':("addressLineTwo")],-1)
printHtmlPart(15)
}
printHtmlPart(23)
invokeTag('message','g',50,['code':("customer.city.label"),'default':("City")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',51,['bean':(customerInstance),'field':("city")],-1)
printHtmlPart(25)
invokeTag('message','g',55,['code':("customer.state.label"),'default':("State")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',56,['bean':(customerInstance),'field':("state")],-1)
printHtmlPart(27)
invokeTag('message','g',60,['code':("customer.zip.label"),'default':("Zip")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',61,['bean':(customerInstance),'field':("zip")],-1)
printHtmlPart(29)
invokeTag('message','g',65,['code':("customer.phoneNumber.label"),'default':("Phone Number")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',66,['bean':(customerInstance),'field':("phoneNumber")],-1)
printHtmlPart(31)
createTagBody(2, {->
invokeTag('message','g',70,['code':("default.button.search.label"),'default':("Search for Carpet Care Jobs")],-1)
})
invokeTag('link','g',70,['class':("search"),'action':("custjobs"),'controller':("cleaningJobSearch"),'id':(customerInstance.id)],2)
printHtmlPart(32)
createTagBody(2, {->
invokeTag('message','g',71,['code':("default.button.search.label"),'default':("Search for Water Extraction Jobs")],-1)
})
invokeTag('link','g',71,['class':("search"),'action':("custjobs"),'controller':("extractionJobSearch"),'id':(customerInstance.id)],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',74,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625969L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
