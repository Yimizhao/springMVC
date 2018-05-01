package com.zym.springMVC.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("/helloWorld")
	public String hello() {
		return "success";
	}
}
