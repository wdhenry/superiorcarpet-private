import com.superior.cleaningjob.CleaningJobCommand
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cleaningJob_cleaningJob_formCleaningJob_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cleaningJob/_formCleaningJob.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('render','g',3,['template':("formJobDetail")],-1)
printHtmlPart(0)
invokeTag('render','g',5,['template':("formGroupRooms")],-1)
printHtmlPart(0)
invokeTag('render','g',7,['template':("formAdditionalRooms")],-1)
printHtmlPart(0)
invokeTag('render','g',9,['template':("formStairs")],-1)
printHtmlPart(0)
invokeTag('render','g',11,['template':("formHardSurfaceRoom")],-1)
printHtmlPart(0)
invokeTag('render','g',13,['template':("formUpholstery")],-1)
printHtmlPart(0)
invokeTag('render','g',15,['template':("formMiscCharge")],-1)
printHtmlPart(0)
invokeTag('render','g',1,['template':("formComment")],-1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1432088625974L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
