package com.mvc.webController;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/contact")
public class ContactController {
	@RequestMapping(method = RequestMethod.GET)
	public String Contact(HttpSession session, Model model) {
		return "/jsp/contact";
	}
}
