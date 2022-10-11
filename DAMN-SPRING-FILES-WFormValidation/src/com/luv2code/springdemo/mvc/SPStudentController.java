package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class SPStudentController {

	@RequestMapping("/")
	public String beginningMethod() {
		return "student-mainmenu";
	}
	
	/*MODEL OLUSTURULDU ICERISINE ATTRIBUTE EKLENDI VE VIEW KISMINA YOLLANDI*/
	@RequestMapping("/showForm")
	public String showFromMethod(Model model) {
		model.addAttribute("student",new SPStudent());
		
		return "student-form";
	}
	
	/*DAHA ONCESINDEKI OLUSTURULMUS MODEL DAN student parametreli olan çekildi ve baþka bir student nesnesine binding edildi
	 * BU OLAYIN GERÇEKLEÞMESÝ MECBURÝ
	 * */
	
	@RequestMapping("/processForm")
	public String processFormMethod(@ModelAttribute("student") SPStudent theStudent) {
		
		System.out.println("STUDENT NAME: " + theStudent.getFirstName()
							+"STUDENT SURNAME: "+ theStudent.getSecondName());
		
		return "student-confirmation";
	}
	
	
	// -------------------------------------------------------------------------------
	//ASAGIDAKI KISIMDAKI ORNEKTE KULLANILAN DROPDOWN ELEMANLARI HARDCODED SEKILDEDIR (JSP ICERISINDE)
	//BUNUN YERINE COUNTRY CLASS I ICERISINDE LINKEDHASHMAP TANIMLAYIP CONSTRUCTOR ICERISINDE ELEMANLARI EKLERSEK
	//VE BUNLARI JSP SAYFASINDA FORM:OPTIONS DA ITEMS="..." ICERISINDE CAGIRIRSAK DAHA EFETIK BÝR YAPIDA OLMUS OLUR 
	@RequestMapping("/showDropDownPage")
	public String dropDownPageMethod(Model model) {
		model.addAttribute("country", new Country());
		return "student-dropdown-mainpage";
	}
	
	@RequestMapping("/showDropDownResult")
	public String showResultMethod(@ModelAttribute("country") Country result) {
		return "student-dropdown-resultpage";
	}
	
	// -------------------------------------------------------------------------------
	@RequestMapping("/showBetterDropDownPage")
	public String betterDropDownPageMethod(Model model) {
		model.addAttribute("betterCountry", new BetterCountry());
		
		return "student-dropdownbetter-mainpage";
	}
	
	
	@RequestMapping("/showBetterDropDownResult")
	public String betterDropDownResultMethod(@ModelAttribute("betterCountry") BetterCountry coutry) {
		return "student-dropdownbetter-resultpage";
	}
	
	// -------------------------------------------------------------------------------
	@RequestMapping("/showRadioButtonPage")
	public String showPageMethod(Model theModel) {
		theModel.addAttribute("radiobuttonresult", new Language());
		
		return "student-radiobutton-mainpage";
	}
	
	
	@RequestMapping("/showRadioButtonResult")
	public String showResultofRadibuttonMethod(@ModelAttribute("radiobuttonresult") Language result) {		
		return "student-radiobutton-resultpage";
	}
	
	
}
