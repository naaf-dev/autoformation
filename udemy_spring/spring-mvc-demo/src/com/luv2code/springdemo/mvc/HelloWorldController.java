package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	@RequestMapping("showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new a controller method to read form data and
	// add data to the model
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the html form
		String name = request.getParameter("studentName");
		
		// convert the data to all caps
		String nameUpper = name.toUpperCase();
		
		// create the message 
		String message = "Yo! " + nameUpper;
		
		// add message to the model
		model.addAttribute("message", message);
		
		return "helloworld";
	}

	@RequestMapping("processFormVersionTree")
	public String processFormVersionTree(
			@RequestParam("studentName") String name,
			Model model) {
		
		// convert the data to all caps
		String nameUpper = name.toUpperCase();
		
		// create the message 
		String message = "Hey my friend from v3! " + nameUpper;
		
		// add message to the model
		model.addAttribute("message", message);
		
		return "helloworld";
	}
}
