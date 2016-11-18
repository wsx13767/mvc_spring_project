package com.mvc.webController;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class HelloWorldController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpSession session, Model model) {
//		return "redirect:/Hello";
		return "/index";
	}
	
}
