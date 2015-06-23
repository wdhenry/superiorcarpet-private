import com.superior.extractionjob.ExtractionJobCommand
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_extractionJob_formExtractionJob_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/extractionJob/_formExtractionJob.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'date', 'error'))
printHtmlPart(1)
invokeTag('datePicker','g',16,['name':("date"),'precision':("day"),'value':(extractionJobCommandInstance?.date)],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'lead', 'error'))
printHtmlPart(1)
invokeTag('select','g',25,['name':("lead"),'from':(com.superior.base.Lead.list()),'optionKey':("leadName"),'optionValue':("leadName"),'value':(extractionJobCommandInstance?.lead),'noSelection':(['Pick a Name':'--Pick a Name--']),'class':("sorted-asc")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'helper', 'error'))
printHtmlPart(4)
invokeTag('select','g',34,['name':("helper"),'from':(com.superior.base.Helper.list()),'optionKey':("helperName"),'optionValue':("helperName"),'value':(extractionJobCommandInstance?.helper),'noSelection':(['None':'--None--']),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'customerId', 'error'))
printHtmlPart(1)
invokeTag('field','g',39,['name':("customerId"),'type':("hidden"),'value':(extractionJobCommandInstance.customerId),'required':("")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'startHour', 'error'))
printHtmlPart(4)
invokeTag('select','g',61,['name':("startHour"),'from':(['01','02','03','04','05','06','07','08','09','10','11','12']),'value':(startHour),'class':("sorted-asc")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'startMinute', 'error'))
printHtmlPart(4)
invokeTag('select','g',70,['name':("startMinute"),'from':(['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']),'value':(startMinute),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'startAmPm', 'error'))
printHtmlPart(4)
invokeTag('select','g',76,['name':("startAmPm"),'from':(['AM', 'PM']),'value':(startAmPm),'class':("sorted-asc")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'endHour', 'error'))
printHtmlPart(4)
invokeTag('select','g',82,['name':("endHour"),'from':(['01','02','03','04','05','06','07','08','09','10','11','12']),'value':(endHour),'class':("sorted-asc")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: extractionJobCommandInstance, field: 'endMinute', 'error'))
printHtmlPart(4)
invokeTag('select','g',91,['name':("endMinute"),'from':(['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20',
					'21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40',
					'41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60']),'value':(endMinute),'class':("sorted-asc")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: cleaningJobCommandInstance, field: 'endAmPm', 'error'))
printHtmlPart(4)
invokeTag('select','g',97,['name':("endAmPm"),'from':(['AM', 'PM']),'value':(endAmPm),'class':("sorted-asc")],-1)
printHtmlPart(7)
invokeTag('render','g',103,['template':("formFanDehu")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625735L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
