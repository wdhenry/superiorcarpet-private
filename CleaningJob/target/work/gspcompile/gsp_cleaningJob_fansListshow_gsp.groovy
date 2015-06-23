import com.superior.base.Fans
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_fansListshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fansList/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'fans.label', default: 'Fan'))],-1)
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
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('fieldValue','g',34,['bean':(fansInstance),'field':("idNumber")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',39,['bean':(fansInstance),'field':("serialNumber")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',44,['bean':(fansInstance),'field':("model")],-1)
printHtmlPart(13)
invokeTag('formatBoolean','g',49,['boolean':(fansInstance?.isIn)],-1)
printHtmlPart(13)
createTagBody(2, {->
expressionOut.print(fieldValue(bean: fansInstance, field: "jobId"))
})
invokeTag('link','g',54,['action':("showJob"),'id':(fansInstance.id)],2)
printHtmlPart(14)
invokeTag('formatDate','g',69,['format':("MM-dd-yyyy"),'date':(fansInstance?.dateOut)],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',74,['bean':(fansInstance),'field':("leadOut")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',79,['bean':(fansInstance),'field':("helperOut")],-1)
printHtmlPart(15)
invokeTag('formatDate','g',96,['format':("MM-dd-yyyy"),'date':(fansInstance?.dateIn)],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',101,['bean':(fansInstance),'field':("leadIn")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',106,['bean':(fansInstance),'field':("helperIn")],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',114,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432094473083L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
