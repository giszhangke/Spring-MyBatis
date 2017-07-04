package top.giszk.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.CookieValue;

@Controller
public class DataBindingController {
	private static final Log logger = LogFactory.getLog(DataBindingController.class);
	
	@RequestMapping(value="/pathVariableTest/{userId}")
	public void pathVariableTest(
			@PathVariable Integer userId,
			 HttpServletResponse response) throws IOException {
		String message = "通过@PathVariable获得数据：" + userId;
		message = new String(message.getBytes(), "UTF-8");
		logger.info(message);
		PrintWriter writer = response.getWriter();
		writer.println(message);
	}
	
	@RequestMapping(value="/requestHeaderTest")
	public void requestHeaderTest(
			@RequestHeader("User-Agent") String userAgent,
			@RequestHeader(value="Accept") String[] accepts
			) {
		logger.info("通过@RequestHeader获得数据：" + userAgent);
		for (String accept : accepts) {
			logger.info(accept);
		}		
	}
	
	@RequestMapping(value="/cookieValueTest")
	public void cookieValueTest(
			@CookieValue(value="JSESSIONID", defaultValue="") String sessionId
			) {
		logger.info("通过@CookieValue获得数据：" + sessionId);
	}
}
