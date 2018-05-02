package com.zym.springMVC.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/springMVC")
@Controller
public class TestRequestMapping {
	private static final String SUCCESS = "success";

	@RequestMapping("testpathVariable/{id}")
	public String testpathVariable(@PathVariable(value = "id") Integer id) {
		System.out.println("teatPathvariable:" + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testMethod", method = RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}

	/**
	 * @RequestMapping既可以修饰类又可以修饰方法 修饰类：相对于根目录 修饰方法：修理类下的多个方法之一
	 * @return
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
	public String testRest(@PathVariable("id") Integer id) {
		System.out.println("testRest Get :" + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest", method = RequestMethod.POST)
	public String testRest() {
		System.out.println("testRest Post ");
		return SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id) {
		System.out.println("testRest Delete: " + id);
		return "redirect:/springMVC/" + SUCCESS;
	}

	@RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id) {
		System.out.println("testRest put :" + id);
		return "redirect:/springMVC/" + SUCCESS;
	}

	@RequestMapping("/testRequestara")
	public String testRequestara(@RequestParam(value = "username") String username,
			@RequestParam(value = "password", required = false, defaultValue = "0") String password) {
		System.out.println("username:" + username + ",password:" + password);
		return SUCCESS;
	}

	@RequestMapping(SUCCESS)
	public String success() {
		return SUCCESS;
	}
}
