package com.example.springstudy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CalcController {
	@RequestMapping("/calcinput")
	public String calcinput() {
		return "calcinput";
	}
	@RequestMapping("/calcoutput")
	public String calcoutput(@RequestParam("txt1") String txt1, 
			@RequestParam("txt2") String txt2, Model model) {
		model.addAttribute("txt1", txt1);
		model.addAttribute("txt2", txt2);
		Integer ans = Integer.parseInt(txt1) + Integer.parseInt(txt2);
		model.addAttribute("ans", "The answer is " + ans.toString() + " !!");
		return "calcoutput";
	}
}
