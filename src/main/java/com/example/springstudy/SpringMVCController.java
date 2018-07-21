package com.example.springstudy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SpringMVCController {
	@RequestMapping("/web/hello")
	public String hello() {
		return "hello";
	}
}
