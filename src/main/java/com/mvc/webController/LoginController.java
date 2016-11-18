package com.mvc.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.service.UserService;






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
		userService.findAll();
		return "/jsp/login";
	}
	

	
	
}
