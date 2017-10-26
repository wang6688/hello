package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/test.htm")
	public String hello(ModelMap modelMap){
		modelMap.addAttribute("message", "hello,world!");
		return "test";
		
	}
}
