import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJob_formMiscCharge_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJob/_formMiscCharge.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',8,['code':("cleaningJob.numberMisc.label"),'default':("Select Number of Miscellaneous Charges")],-1)
printHtmlPart(1)
invokeTag('select','g',12,['name':("miscCount"),'from':(['01','02','03','04']),'noSelection':(['00':'00']),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName1', 'error'))
printHtmlPart(3)
invokeTag('select','g',37,['name':("miscChargesName1"),'from':(com.superior.base.MiscChargesName.list()),'optionKey':("miscChargesName"),'optionValue':("miscChargesName"),'value':(cleaningJobCommandInstance?.miscChargesName1),'noSelection':(['Pick Misc. Description':'--Pick Misc. Description--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge1', 'error'))
printHtmlPart(3)
invokeTag('field','g',43,['name':("miscCharge1"),'type':("number"),'step':("any"),'value':(miscCharge1)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible1', 'error'))
printHtmlPart(3)
invokeTag('field','g',49,['name':("miscVisible1"),'type':("hidden"),'value':("${miscVisible1} ")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName2', 'error'))
printHtmlPart(3)
invokeTag('select','g',61,['name':("miscChargesName2"),'from':(com.superior.base.MiscChargesName.list()),'optionKey':("miscChargesName"),'optionValue':("miscChargesName"),'value':(cleaningJobCommandInstance?.miscChargesName2),'noSelection':(['Pick Misc. Description':'--Pick Misc. Description--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge2', 'error'))
printHtmlPart(3)
invokeTag('field','g',67,['name':("miscCharge2"),'type':("number"),'step':("any"),'value':(miscCharge2)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible2', 'error'))
printHtmlPart(3)
invokeTag('field','g',73,['name':("miscVisible2"),'type':("hidden"),'value':("${miscVisible2} ")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName3', 'error'))
printHtmlPart(3)
invokeTag('select','g',85,['name':("miscChargesName3"),'from':(com.superior.base.MiscChargesName.list()),'optionKey':("miscChargesName"),'optionValue':("miscChargesName"),'value':(cleaningJobCommandInstance?.miscChargesName3),'noSelection':(['Pick Misc. Description':'--Pick Misc. Description--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge3', 'error'))
printHtmlPart(3)
invokeTag('field','g',91,['name':("miscCharge3"),'type':("number"),'step':("any"),'value':(miscCharge3)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible3', 'error'))
printHtmlPart(3)
invokeTag('field','g',97,['name':("miscVisible3"),'type':("hidden"),'value':("${miscVisible3} ")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscChargesName4', 'error'))
printHtmlPart(3)
invokeTag('select','g',109,['name':("miscChargesName4"),'from':(com.superior.base.MiscChargesName.list()),'optionKey':("miscChargesName"),'optionValue':("miscChargesName"),'value':(cleaningJobCommandInstance?.miscChargesName4),'noSelection':(['Pick Misc. Description':'--Pick Misc. Description--']),'class':("sorted-asc")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscCharge4', 'error'))
printHtmlPart(3)
invokeTag('field','g',115,['name':("miscCharge4"),'type':("number"),'step':("any"),'value':(miscCharge4)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'miscVisible4', 'error'))
printHtmlPart(3)
invokeTag('field','g',121,['name':("miscVisible4"),'type':("hidden"),'value':("${miscVisible4} ")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434162191474L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
