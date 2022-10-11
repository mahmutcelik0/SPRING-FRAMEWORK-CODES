package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class AddingDataController {

	
	@RequestMapping("/")
	public String showBeginningPage() {
		return "main-menu";
	}
	
	@RequestMapping("/formPage")
	public String formToProcessPage() {
		return "helloworld-view";
	}
	
	@RequestMapping("/processingDataToModel")
	public String process(HttpServletRequest request, Model model) {
		
		String formValue = request.getParameter("studentName");
		
		formValue = formValue.toUpperCase();
		
		model.addAttribute("message", formValue);
		
		return "addingDataExample";
	}
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "addingDataExample";
	}
}

