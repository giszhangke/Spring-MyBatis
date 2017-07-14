package org.giszk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 动态页面跳转控制器
 * @author zhangke
 *
 */
@Controller
public class FormController {
	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable("formName") String formName) {
		// 动态跳转页面
		return formName;
	}
}
