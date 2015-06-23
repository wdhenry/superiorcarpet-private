import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJobindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(createLink(uri: '/customer/index'))
printHtmlPart(6)
expressionOut.print(createLink(uri: '/cleaningJob/index'))
printHtmlPart(7)
expressionOut.print(createLink(uri: '/extractionJob/index'))
printHtmlPart(8)
expressionOut.print(createLink(uri: '/dailyWork/index'))
printHtmlPart(9)
expressionOut.print(createLink(uri: '/dehuReturn/index'))
printHtmlPart(10)
expressionOut.print(createLink(uri: '/fanReturn/index'))
printHtmlPart(11)
expressionOut.print(createLink(uri: '/customerSearch/index'))
printHtmlPart(12)
expressionOut.print(createLink(uri: '/cleaningJobSearch/index'))
printHtmlPart(13)
expressionOut.print(createLink(uri: '/extractionJobSearch/index'))
printHtmlPart(14)
expressionOut.print(createLink(uri: '/dailyWorkSearch/index'))
printHtmlPart(15)
expressionOut.print(createLink(uri: '/dehumidifiersList/index'))
printHtmlPart(16)
expressionOut.print(createLink(uri: '/fansList/index'))
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626208L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
