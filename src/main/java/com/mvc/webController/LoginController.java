package com.mvc.webController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String login() {
		return "/jsp/login";
	}
	
	@RequestMapping(value="/logincheck",method=RequestMethod.POST)
	public @ResponseBody String logincheck(User user, HttpServletRequest req) {	
		System.out.println("aa");
//		JSONObject json = new JSONObject();
		System.out.println(req.getParameter("name"));
	    String result = userService.logincheck(user.getName(), user.getPassword());

	    return result;
	}
	
	
}
