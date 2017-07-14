package org.giszk.controller;

import org.giszk.domain.User;
import org.giszk.service.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

/**
 * 处理用户请求控制器
 * 
 * @author zhangke
 *
 */
@Controller
public class UserController {
	/**
	 * 自动注入UserService
	 */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理login请求
	 * @return
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(String loginname,
			String password,
			ModelAndView mv,
			HttpSession session) {
		User user = userService.login(loginname, password);
		if (user != null) {
			session.setAttribute("user", user);
			mv.setView(new RedirectView("/zkbookapp/main"));
		} else {
			mv.addObject("message", "登录名或密码错误，请重新输入");
			mv.setViewName("loginForm");
		}
		return mv;
	}
}
