package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

}
