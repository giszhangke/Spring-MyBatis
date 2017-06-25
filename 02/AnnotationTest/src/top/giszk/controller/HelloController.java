package top.giszk.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController是一个基本注解的控制器
 * 可以同时处理多个请求动作，并且无需实现任何接口
 * org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 * @author zhangke
 *
 */
@Controller
public class HelloController {
	private static final Log logger = LogFactory.getLog(HelloController.class); 
	
	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		logger.info("hello 方法被调用");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}
}
