import com.superior.base.MiscChargesName
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_miscChargesName_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/miscChargesName/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: miscChargesNameInstance, field: 'miscChargesName', 'error'))
printHtmlPart(1)
invokeTag('message','g',4,['code':("miscChargesName.miscChargesName.label"),'default':("Misc Charges Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',6,['name':("miscChargesName"),'required':(""),'value':(miscChargesNameInstance?.miscChargesName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: miscChargesNameInstance, field: 'miscChargeRate', 'error'))
printHtmlPart(4)
invokeTag('message','g',11,['code':("miscChargesName.miscChargeRate.label"),'default':("Rate Charge")],-1)
printHtmlPart(5)
invokeTag('field','g',14,['name':("miscChargeRate"),'value':(fieldValue(bean: miscChargesNameInstance, field: 'miscChargeRate'))],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088623130L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}