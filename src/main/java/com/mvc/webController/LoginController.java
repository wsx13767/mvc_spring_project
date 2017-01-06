package com.mvc.webController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.formBean.LoginFormBean;
import com.mvc.model.User;
import com.mvc.service.UserService;

import net.sf.json.JSONObject;






@Controller
@RequestMapping("/login")
public class LoginController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("test", "aaaa");
		return "/jsp/login";
	}
	
	@RequestMapping(value="/logincheck",method=RequestMethod.POST)
	public @ResponseBody void logincheck(LoginFormBean formBean, HttpServletRequest req,
			HttpServletResponse res, Model model) throws IOException {	
		String account = formBean.getAccount();
		String password = formBean.getPassword();
		boolean result = false;
		if (account == null || password == null) {
			return;
		} else {
			result = userService.logincheck(formBean.getAccount(), formBean.getPassword());
			if (result) {
				req.getSession().setAttribute("login", account);
			}
		}
	    System.out.println(result);
	    res.getWriter().print(result);
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public @ResponseBody void logout(HttpServletResponse res, HttpServletRequest req) throws IOException {
		req.getSession().invalidate();
	}
	
	
}
