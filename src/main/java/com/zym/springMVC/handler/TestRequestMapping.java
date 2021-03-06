package com.zym.springMVC.handler;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.zym.springMVC.entities.User;

@SessionAttributes(types = { User.class })
@RequestMapping("/springMVC")
@Controller
public class TestRequestMapping {
	private static final String SUCCESS = "success";

	@ModelAttribute
	public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		if (!Objects.isNull(id)) {
			User user = new User("Jock", "123456", "Jock@zym.com", 25, 1);
			map.put("user", user);
		}
	}

	@RequestMapping("testModelAttribute")
	public String testModelAttribute(User user) {
		System.out.println("testModelAttribute User:" + user);
		return SUCCESS;
	}

	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String, Object> map) {
		User user = new User("Jack", "123", "ajaf@163.com", 26);
		map.put("user", user);
		return SUCCESS;
	}

	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		ModelAndView modelAndView = new ModelAndView(SUCCESS);
		modelAndView.addObject("name", "Yimi");
		return modelAndView;
	}

	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo's user:" + user);
		return SUCCESS;
	}

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
