import com.superior.base.Dehumidifiers
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dehumidifiersListshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dehumidifiersList/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'dehumidifiers.label', default: 'Dehumidifier'))],-1)
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
invokeTag('fieldValue','g',35,['bean':(dehumidifiersInstance),'field':("idNumber")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',40,['bean':(dehumidifiersInstance),'field':("serialNumber")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',45,['bean':(dehumidifiersInstance),'field':("model")],-1)
printHtmlPart(13)
invokeTag('formatNumber','g',51,['number':(dehumidifiersInstance.hours),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(13)
invokeTag('formatBoolean','g',56,['boolean':(dehumidifiersInstance?.isIn)],-1)
printHtmlPart(13)
createTagBody(2, {->
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "jobId"))
})
invokeTag('link','g',61,['action':("showJob"),'id':(dehumidifiersInstance.id)],2)
printHtmlPart(14)
invokeTag('formatDate','g',77,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateOut)],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',82,['bean':(dehumidifiersInstance),'field':("leadOut")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',87,['bean':(dehumidifiersInstance),'field':("helperOut")],-1)
printHtmlPart(15)
invokeTag('formatDate','g',105,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateIn)],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',110,['bean':(dehumidifiersInstance),'field':("leadIn")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',115,['bean':(dehumidifiersInstance),'field':("helperIn")],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',123,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432092396456L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
