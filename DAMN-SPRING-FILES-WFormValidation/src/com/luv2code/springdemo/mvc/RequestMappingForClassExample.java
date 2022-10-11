package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/example")
@Controller
public class RequestMappingForClassExample {

	@RequestMapping("/")
	public String homePage() {
		return "main-menu";
	}
	
	@RequestMapping("/formPage")
	public String formPageMethod() {
		return "helloworld-view";
	}
	
	@RequestMapping("/processingDataToModel")
	public String processingAndModelingValue(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();
		
		model.addAttribute("message",theName);
		
		return "addingDataExample";
	}
	
	
}

