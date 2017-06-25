package top.giszk.controller;
import javax.servlet.http.HttpServletRequest;//servlet-api.jar
import javax.servlet.http.HttpServletResponse;//servlet-api.jar
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

public class HelloController implements Controller {
	private static final Log logger = LogFactory.getLog(HelloController.class);
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info("handleRequest被调用");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");;
		return mv;
	}
}
