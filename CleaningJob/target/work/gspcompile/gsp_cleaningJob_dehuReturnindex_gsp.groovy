import com.superior.base.Dehumidifiers
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dehuReturnindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dehuReturn/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'dehumidifiers.label', default: 'Dehumidifiers Returns'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',26,['property':("idNumber"),'title':(message(code: 'dehureturn.idNumber.label', default: 'Id'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',28,['property':("serialNumber"),'title':(message(code: 'dehureturn.serialNumber.label', default: 'Serial Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',30,['property':("model"),'title':(message(code: 'dehureturn.model.label', default: 'Model'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',32,['property':("jobId"),'title':(message(code: 'dehureturn.jobId.label', default: 'Where'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',34,['property':("dateOut"),'title':(message(code: 'dehureturn.dateOut.label', default: 'Out'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',36,['property':("leadOut"),'title':(message(code: 'dehureturn.leadOut.label', default: 'Lead'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',38,['property':("helperOut"),'title':(message(code: 'dehureturn.helperOut.label', default: 'Helper'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',40,['property':("dateIn"),'title':(message(code: 'dehureturn.dateIn.label', default: 'In'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',42,['property':("leadIn"),'title':(message(code: 'dehureturn.leadIn.label', default: 'Lead'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',44,['property':("helperIn"),'title':(message(code: 'dehureturn.helperOut.label', default: 'Helper'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( dehumidifiersInstance in (dehumidifiersInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "idNumber"))
})
invokeTag('link','g',52,['action':("edit"),'id':(dehumidifiersInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "serialNumber"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "model"))
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "jobId"))
})
invokeTag('link','g',58,['action':("showJob"),'id':(dehumidifiersInstance.id)],3)
printHtmlPart(18)
invokeTag('formatDate','g',60,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateOut)],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "leadOut"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "helperOut"))
printHtmlPart(18)
invokeTag('formatDate','g',66,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateIn)],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "leadIn"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: dehumidifiersInstance, field: "helperIn"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',77,['total':(dehumidifiersInstanceCount ?: 0)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',80,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626399L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
