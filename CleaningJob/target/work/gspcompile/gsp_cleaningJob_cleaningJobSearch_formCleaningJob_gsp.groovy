import com.superior.cleaningjob.CleaningJobCommand
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJobSearch_formCleaningJob_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJobSearch/_formCleaningJob.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('render','g',7,['template':("formDetail")],-1)
printHtmlPart(1)
if(true && (cleaningJobCommandInstance.groupName != null)) {
printHtmlPart(2)
invokeTag('render','g',15,['template':("formGroupRooms")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.roomName001 != null)) {
printHtmlPart(5)
invokeTag('render','g',24,['template':("formRoom")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.stairDirection1 != null)) {
printHtmlPart(6)
invokeTag('render','g',33,['template':("formStairs")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.hsRoomName1 != null)) {
printHtmlPart(7)
invokeTag('render','g',42,['template':("formHardSurfaceRoom")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.upholsteryName1 != null)) {
printHtmlPart(8)
invokeTag('render','g',51,['template':("formUpholstery")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.miscChargesName1 != null)) {
printHtmlPart(9)
invokeTag('render','g',60,['template':("formMiscCharge")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (cleaningJobCommandInstance.comment != null)) {
printHtmlPart(10)
invokeTag('render','g',70,['template':("formComment")],-1)
printHtmlPart(11)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088626537L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
