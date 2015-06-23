import com.superior.base.RoomGroup
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_roomGroup_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/roomGroup/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: roomGroupInstance, field: 'groupName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("roomGroup.groupName.label"),'default':("Group Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("groupName"),'required':(""),'value':(roomGroupInstance?.groupName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: roomGroupInstance, field: 'groupCharge', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("roomGroup.groupCharge.label"),'default':("Group Charge")],-1)
printHtmlPart(5)
invokeTag('field','g',19,['name':("groupCharge"),'value':(fieldValue(bean: roomGroupInstance, field: 'groupCharge'))],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625710L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
