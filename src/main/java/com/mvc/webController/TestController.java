package com.mvc.webController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/jsp/test")
public class TestController {
	@RequestMapping(method=RequestMethod.GET)
	public String test(Model model) {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "a");
		map.put("b", "b");
		map.put("c", "c");
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("a", "1");
		map2.put("b", "2");
		map2.put("c", "3");
		list.add(map);
		list.add(map2);
		model.addAttribute("test", list);
		return "/jsp/test";
	}
}
