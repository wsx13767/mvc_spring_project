package com.mvc.webController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.service.OrderService;
import com.mvc.service.UserService;





@Controller
@RequestMapping("/")
public class IndexController {

	private OrderService orderService;
	@Autowired
	public void setUserService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpSession session, Model model) {
		List<Map<String, Object>> list = orderService.queryAllOrder();

		model.addAttribute("list", list);
		return "/index";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String indexPost(Model model,HttpServletRequest req) {
		return "/index";
	}
	
}
