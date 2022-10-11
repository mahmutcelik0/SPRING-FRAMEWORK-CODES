package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class BindingRequestParamExample {

	@RequestMapping("/")
	public String mainMenuMethod() {
		return "main-menu";
	}
	
	@RequestMapping("/formPage")
	public String formPage() {
		return "helloworld-view";
	}
	
	@RequestMapping("/processingDataToModel")
	public String processingAndModelingValue(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();
		
		model.addAttribute("message",theName);
		
		return "addingDataExample";
	}
	
}

