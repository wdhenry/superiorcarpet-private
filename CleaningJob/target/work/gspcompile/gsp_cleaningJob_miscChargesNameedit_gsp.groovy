import com.superior.base.MiscChargesName
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_miscChargesNameedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/miscChargesName/edit.gsp" }
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
invokeTag('message','g',7,['code':("default.edit.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',16,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',18,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',19,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',24,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(16)
expressionOut.print(error.field)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('message','g',34,['error':(error)],-1)
printHtmlPart(19)
})
invokeTag('eachError','g',35,['bean':(miscChargesNameInstance),'var':("error")],3)
printHtmlPart(20)
})
invokeTag('hasErrors','g',37,['bean':(miscChargesNameInstance)],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(21)
invokeTag('hiddenField','g',39,['name':("version"),'value':(miscChargesNameInstance?.version)],-1)
printHtmlPart(22)
invokeTag('render','g',41,['template':("form")],-1)
printHtmlPart(23)
invokeTag('submitButton','g',44,['class':("save"),'name':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',46,['url':([resource:miscChargesNameInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088623150L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
