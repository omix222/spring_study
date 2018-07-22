package com.example.springstudy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeelist() {
		List<Employee> resultList = new ArrayList<Employee>();
		resultList.add(new Employee("id001","Takaha Hiro","ITP"));
		resultList.add(new Employee("id002","Seki Yu","JFW"));
		return resultList;
	}
	
	public List<Employee> getEmployeelistUsingRepository() {
		return employeeRepository.findAll();
	}
}
