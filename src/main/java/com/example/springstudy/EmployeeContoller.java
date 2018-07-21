package com.example.springstudy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EmployeeContoller {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping("/employeelist")
	public String getEmployeelist(Model model) {
		List<Employee> resultList = employeeService.getEmployeelist();
		model.addAttribute("employeelist", resultList);
		return "employeelist";
	}
}
