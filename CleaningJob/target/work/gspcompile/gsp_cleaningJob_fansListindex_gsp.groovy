import com.superior.base.Fans
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_fansListindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fansList/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'fans.label', default: 'Fans'))],-1)
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
invokeTag('sortableColumn','g',26,['property':("idNumber"),'title':(message(code: 'fans.idNumber.label', default: 'Id Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',28,['property':("serialNumber"),'title':(message(code: 'fans.serialNumber.label', default: 'Serial Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',30,['property':("model"),'title':(message(code: 'fans.model.label', default: 'Model'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',32,['property':("isIn"),'title':(message(code: 'fans.isIn.label', default: 'Is In'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( fansInstance in (fansInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: fansInstance, field: "idNumber"))
})
invokeTag('link','g',40,['action':("show"),'id':(fansInstance.id)],3)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: fansInstance, field: "serialNumber"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: fansInstance, field: "model"))
printHtmlPart(16)
invokeTag('formatBoolean','g',46,['boolean':(fansInstance.isIn)],-1)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',53,['total':(fansInstanceCount ?: 0)],-1)
printHtmlPart(19)
createTagBody(2, {->
invokeTag('message','g',56,['code':("default.button.print.label"),'default':("Print")],-1)
})
invokeTag('link','g',56,['class':("print"),'action':("print"),'resource':(fansInstance)],2)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626328L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
