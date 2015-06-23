import com.superior.base.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_customer_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: customerInstance, field: 'firstName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("customer.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("firstName"),'value':(customerInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'lastName', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("customer.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("lastName"),'required':(""),'value':(customerInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'addressLineOne', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("customer.addressLineOne.label"),'default':("Address Line One")],-1)
printHtmlPart(5)
invokeTag('textField','g',28,['name':("addressLineOne"),'required':(""),'value':(customerInstance?.addressLineOne)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'addressLineTwo', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("customer.addressLineTwo.label"),'default':("Address Line Two")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("addressLineTwo"),'value':(customerInstance?.addressLineTwo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'city', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("customer.city.label"),'default':("City")],-1)
printHtmlPart(5)
invokeTag('textField','g',46,['name':("city"),'required':(""),'value':(customerInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'state', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("customer.state.label"),'default':("State")],-1)
printHtmlPart(5)
invokeTag('textField','g',55,['name':("state"),'maxlength':("2"),'required':(""),'value':(customerInstance?.state)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'zip', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("customer.zip.label"),'default':("Zip")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("zip"),'value':(customerInstance?.zip)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'phoneNumber', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("customer.phoneNumber.label"),'default':("Phone Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("phoneNumber"),'maxlength':("10"),'value':(customerInstance?.phoneNumber)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625496L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
