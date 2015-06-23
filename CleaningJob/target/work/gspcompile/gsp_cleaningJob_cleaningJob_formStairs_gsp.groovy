import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJob_formStairs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJob/_formStairs.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',8,['code':("cleaningJob.numberStairs.label"),'default':("Select Number of Sets of Stairs")],-1)
printHtmlPart(1)
invokeTag('select','g',12,['name':("stairCount"),'from':(['01','02','03']),'noSelection':(['00':'00']),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection1', 'error'))
printHtmlPart(3)
invokeTag('select','g',37,['name':("stairDirection1"),'from':(['Down - 1st Set', 'Down - 2nd Set', 'Up - 1st Set', 'Up - 2nd Set']),'value':(stairDirection1),'noSelection':(['Pick a Direction':'--Pick a Direction--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount1', 'error'))
printHtmlPart(3)
invokeTag('field','g',43,['name':("stairCount1"),'type':("number"),'value':(stairCount1)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge1', 'error'))
printHtmlPart(3)
invokeTag('field','g',50,['name':("stairCharge1"),'type':("number"),'step':("any"),'value':(stairCharge1)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairVisible1', 'error'))
printHtmlPart(3)
invokeTag('field','g',56,['name':("stairVisible1"),'type':("hidden"),'value':("${stairVisible1} ")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection2', 'error'))
printHtmlPart(3)
invokeTag('select','g',67,['name':("stairDirection2"),'from':(['Down', 'Up']),'value':(stairDirection2),'noSelection':(['Pick a Direction':'--Pick a Direction--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount2', 'error'))
printHtmlPart(3)
invokeTag('field','g',73,['name':("stairCount2"),'type':("number"),'value':(stairCount2)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge2', 'error'))
printHtmlPart(3)
invokeTag('field','g',80,['name':("stairCharge2"),'type':("number"),'step':("any"),'value':(stairCharge2)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairVisible2', 'error'))
printHtmlPart(3)
invokeTag('field','g',86,['name':("stairVisible2"),'type':("hidden"),'value':("${stairVisible2} ")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairDirection3', 'error'))
printHtmlPart(3)
invokeTag('select','g',97,['name':("stairDirection3"),'from':(['Down', 'Up']),'value':(stairDirection3),'noSelection':(['Pick a Direction':'--Pick a Direction--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairCount3', 'error'))
printHtmlPart(3)
invokeTag('field','g',103,['name':("stairCount3"),'type':("number"),'value':(stairCount3)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairCharge3', 'error'))
printHtmlPart(3)
invokeTag('field','g',110,['name':("stairCharge3"),'type':("number"),'step':("any"),'value':(stairCharge3)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'stairVisible3', 'error'))
printHtmlPart(3)
invokeTag('field','g',116,['name':("stairVisible3"),'type':("hidden"),'value':("${stairVisible3} ")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088624953L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
