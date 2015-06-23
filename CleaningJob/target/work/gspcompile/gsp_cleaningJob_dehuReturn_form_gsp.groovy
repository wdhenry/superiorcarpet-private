import com.superior.base.Dehumidifiers
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_dehuReturn_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dehuReturn/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',7,['code':("dehumidifiers.idNumber.label"),'default':("Id Number")],-1)
printHtmlPart(1)
invokeTag('message','g',8,['code':("dehumidifiers.serialNumber.label"),'default':("Serial Number")],-1)
printHtmlPart(2)
invokeTag('message','g',9,['code':("dehumidifiers.model.label"),'default':("Model")],-1)
printHtmlPart(3)
invokeTag('message','g',10,['code':("dehumidifiers.jobId.label"),'default':("Job Id")],-1)
printHtmlPart(4)
invokeTag('fieldValue','g',13,['bean':(dehumidifiersInstance),'field':("idNumber")],-1)
printHtmlPart(5)
invokeTag('fieldValue','g',14,['bean':(dehumidifiersInstance),'field':("serialNumber")],-1)
printHtmlPart(6)
invokeTag('fieldValue','g',15,['bean':(dehumidifiersInstance),'field':("model")],-1)
printHtmlPart(7)
invokeTag('fieldValue','g',16,['bean':(dehumidifiersInstance),'field':("jobId")],-1)
printHtmlPart(8)
invokeTag('message','g',19,['code':("dehumidifiers.dateOut.label"),'default':("Date Out")],-1)
printHtmlPart(9)
invokeTag('message','g',20,['code':("dehumidifiers.leadOut.label"),'default':("Lead Out")],-1)
printHtmlPart(10)
invokeTag('message','g',21,['code':("dehumidifiers.helperOut.label"),'default':("Helper Out")],-1)
printHtmlPart(11)
invokeTag('formatDate','g',25,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateOut)],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',26,['bean':(dehumidifiersInstance),'field':("leadOut")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',27,['bean':(dehumidifiersInstance),'field':("helperOut")],-1)
printHtmlPart(14)
invokeTag('message','g',31,['code':("dehumidifiers.dateIn.label"),'default':("Date In")],-1)
printHtmlPart(15)
invokeTag('message','g',32,['code':("dehumidifiers.leadIn.label"),'default':("Lead In")],-1)
printHtmlPart(16)
invokeTag('message','g',33,['code':("dehumidifiers.helperIn.label"),'default':("Helper In")],-1)
printHtmlPart(17)
invokeTag('message','g',34,['code':("dehumidifiers.hours.label"),'default':("Hours")],-1)
printHtmlPart(18)
if(true && (dehumidifiersInstance?.isIn)) {
printHtmlPart(19)
invokeTag('formatDate','g',39,['format':("MM-dd-yyyy"),'date':(dehumidifiersInstance?.dateIn)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (!dehumidifiersInstance?.isIn)) {
printHtmlPart(22)
invokeTag('datePicker','g',42,['name':("date"),'precision':("day"),'value':(dehumidifiersInstance?.dateIn)],-1)
printHtmlPart(21)
}
printHtmlPart(23)
if(true && (dehumidifiersInstance?.isIn)) {
printHtmlPart(24)
invokeTag('fieldValue','g',47,['bean':(dehumidifiersInstance),'field':("leadIn")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (!dehumidifiersInstance?.isIn)) {
printHtmlPart(22)
invokeTag('select','g',54,['name':("leadIn"),'from':(com.superior.base.Lead.list()),'optionKey':("leadName"),'optionValue':("leadName"),'value':(dehumidifiersInstance?.leadIn),'noSelection':(['null':'--Pick a Name--']),'class':("sorted-asc")],-1)
printHtmlPart(21)
}
printHtmlPart(23)
if(true && (dehumidifiersInstance?.isIn)) {
printHtmlPart(25)
invokeTag('fieldValue','g',59,['bean':(dehumidifiersInstance),'field':("helperIn")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (!dehumidifiersInstance?.isIn)) {
printHtmlPart(22)
invokeTag('select','g',66,['name':("helperIn"),'from':(com.superior.base.Helper.list()),'optionKey':("helperName"),'optionValue':("helperName"),'value':(dehumidifiersInstance?.helperIn),'noSelection':(['null':'--None--']),'class':("sorted-asc")],-1)
printHtmlPart(21)
}
printHtmlPart(23)
if(true && (dehumidifiersInstance?.isIn)) {
printHtmlPart(26)
invokeTag('formatNumber','g',73,['number':(dehumidifiersInstance.hours),'type':("number"),'maxFractionDigits':("2"),'minFractionDigits':("2")],-1)
printHtmlPart(27)
}
printHtmlPart(21)
if(true && (!dehumidifiersInstance?.isIn)) {
printHtmlPart(28)
invokeTag('field','g',78,['name':("hours"),'type':("number"),'step':("any"),'value':(dehumidifiersInstance?.hours)],-1)
printHtmlPart(27)
}
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088623124L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
