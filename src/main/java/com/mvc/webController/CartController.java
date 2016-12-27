package com.mvc.webController;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class CartController {
    @RequestMapping(method = RequestMethod.GET)
    public String Cart(HttpSession session, Model model) {
    	return "/jsp/cart";
    }
}
