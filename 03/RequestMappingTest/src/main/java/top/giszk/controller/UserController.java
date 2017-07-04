package top.giszk.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import java.util.ArrayList;
import top.giszk.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/user")
public class UserController {
	private static final Log logger = LogFactory.getLog(UserController.class);
	private static List<User> userList;
	
	public UserController() {
		super();
		userList = new ArrayList<User>();
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerForm() {
		logger.info("register GET方法被调用...");
		return "registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(
			@RequestParam("loginname") String loginName,
			@RequestParam("password") String password,
			@RequestParam("username") String userName) {
		logger.info("register POST方法被调用...");
		User user = new User(loginName, password, userName);
		userList.add(user);
		return "loginForm";
	}
	
	@RequestMapping(value="/login")
	public String login(
			@RequestParam("loginname") String loginName,
			@RequestParam("password") String password,
			Model model) {
		logger.info("登录名：" + loginName + " 密码：" + password);
		for (User user : userList) {
			if (user.getLoginName().equals(loginName) && user.getPassword().equals(password)) {
				model.addAttribute("user", user);
				return "welcome";
			}
		}
		return "loginForm";
	}
}
