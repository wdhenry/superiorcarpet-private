import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobnewJob_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJob/newJob.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'customer.label', default: 'Carpet Care Job'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',9,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',13,['class':("list"),'action':("index")],2)
printHtmlPart(8)
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(9)
expressionOut.print(fieldValue(bean: cleaningJobCommandInstance, field: "firstName"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: cleaningJobCommandInstance, field: "lastName"))
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
expressionOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',24,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',25,['bean':(cleaningJobCommandInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',27,['bean':(cleaningJobCommandInstance)],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('render','g',31,['template':("formCleaningJob")],-1)
printHtmlPart(24)
invokeTag('submitButton','g',34,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(25)
})
invokeTag('form','g',36,['url':([controller:'cleaningJob', action:'saveJob'])],2)
printHtmlPart(26)
invokeTag('javascript','g',38,['src':("utils.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',39,['src':("cleaningJob/ratesService.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',40,['src':("cleaningJob/miscChargesNameService.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',41,['src':("cleaningJob/upholsteryNameService.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',42,['src':("cleaningJob/groupRooms.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',43,['src':("cleaningJob/additionalRooms.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',44,['src':("cleaningJob/stairs.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',45,['src':("cleaningJob/hardSurfaceRoom.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',46,['src':("cleaningJob/upholstery.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',47,['src':("cleaningJob/miscCharge.js")],-1)
printHtmlPart(2)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625380L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
