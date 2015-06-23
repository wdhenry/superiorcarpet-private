import com.superior.base.Fans
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_fanReturn_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fanReturn/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',5,['code':("fans.idNumber.label"),'default':("Id Number")],-1)
printHtmlPart(1)
invokeTag('message','g',6,['code':("fans.serialNumber.label"),'default':("Serial Number")],-1)
printHtmlPart(2)
invokeTag('message','g',7,['code':("fans.model.label"),'default':("Model")],-1)
printHtmlPart(3)
invokeTag('message','g',8,['code':("fans.jobId.label"),'default':("Job Id")],-1)
printHtmlPart(4)
invokeTag('fieldValue','g',11,['bean':(fansInstance),'field':("idNumber")],-1)
printHtmlPart(5)
invokeTag('fieldValue','g',12,['bean':(fansInstance),'field':("serialNumber")],-1)
printHtmlPart(6)
invokeTag('fieldValue','g',13,['bean':(fansInstance),'field':("model")],-1)
printHtmlPart(7)
invokeTag('fieldValue','g',14,['bean':(fansInstance),'field':("jobId")],-1)
printHtmlPart(8)
invokeTag('message','g',17,['code':("fans.dateOut.label"),'default':("Date Out")],-1)
printHtmlPart(9)
invokeTag('message','g',18,['code':("fans.leadOut.label"),'default':("Lead Out")],-1)
printHtmlPart(10)
invokeTag('message','g',19,['code':("fans.helperOut.label"),'default':("Helper Out")],-1)
printHtmlPart(11)
invokeTag('formatDate','g',23,['format':("MM-dd-yyyy"),'date':(fansInstance?.dateOut)],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',24,['bean':(fansInstance),'field':("leadOut")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',25,['bean':(fansInstance),'field':("helperOut")],-1)
printHtmlPart(14)
invokeTag('message','g',29,['code':("fans.dateIn.label"),'default':("Date In")],-1)
printHtmlPart(15)
invokeTag('message','g',30,['code':("fans.leadIn.label"),'default':("Lead In")],-1)
printHtmlPart(16)
invokeTag('message','g',31,['code':("fans.helperIn.label"),'default':("Helper In")],-1)
printHtmlPart(17)
if(true && (fansInstance?.isIn)) {
printHtmlPart(18)
invokeTag('formatDate','g',38,['format':("MM-dd-yyyy"),'date':(fansInstance?.dateIn)],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (!fansInstance?.isIn)) {
printHtmlPart(21)
invokeTag('datePicker','g',42,['name':("date"),'precision':("day"),'value':(fansInstance?.dateIn)],-1)
printHtmlPart(20)
}
printHtmlPart(22)
if(true && (fansInstance?.isIn)) {
printHtmlPart(23)
invokeTag('fieldValue','g',47,['bean':(fansInstance),'field':("leadIn")],-1)
printHtmlPart(24)
}
printHtmlPart(20)
if(true && (!fansInstance?.isIn)) {
printHtmlPart(21)
invokeTag('select','g',53,['name':("leadIn"),'from':(com.superior.base.Lead.list()),'optionKey':("leadName"),'optionValue':("leadName"),'value':(fansInstance?.leadIn),'noSelection':(['Pick a Name':'--Pick a Name--'])],-1)
printHtmlPart(20)
}
printHtmlPart(22)
if(true && (fansInstance?.isIn)) {
printHtmlPart(25)
invokeTag('fieldValue','g',58,['bean':(fansInstance),'field':("helperIn")],-1)
printHtmlPart(24)
}
printHtmlPart(20)
if(true && (!fansInstance?.isIn)) {
printHtmlPart(21)
invokeTag('select','g',65,['name':("helperIn"),'from':(com.superior.base.Helper.list()),'optionKey':("helperName"),'optionValue':("helperName"),'value':(fansInstance?.helperIn),'noSelection':(['None':'--None--']),'class':("sorted-asc")],-1)
printHtmlPart(20)
}
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625362L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
