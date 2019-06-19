package com.test.pawana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		System.out.println("inside hello world");
		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("Hello", "message", message);
	}
}
