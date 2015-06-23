import com.superior.base.UpholsteryName
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_upholsteryName_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/upholsteryName/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: upholsteryNameInstance, field: 'upholsteryName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("upholsteryName.upholsteryName.label"),'default':("Upholstery Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("upholsteryName"),'required':(""),'value':(upholsteryNameInstance?.upholsteryName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: upholsteryNameInstance, field: 'upholsteryCharge', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("upholsteryName.upholsteryCharge.label"),'default':("Upholstery Charge")],-1)
printHtmlPart(5)
invokeTag('field','g',19,['name':("upholsteryCharge"),'value':(fieldValue(bean: upholsteryNameInstance, field: 'upholsteryCharge'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: upholsteryNameInstance, field: 'upholsteryProtect', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("upholsteryName.upholsteryProtect.label"),'default':("Upholstery Protect")],-1)
printHtmlPart(5)
invokeTag('field','g',28,['name':("upholsteryProtect"),'value':(fieldValue(bean: upholsteryNameInstance, field: 'upholsteryProtect'))],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626311L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
