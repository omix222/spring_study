package com.example.springstudy;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	public List<Employee> getEmployeelist() {
		List<Employee> resultList = new ArrayList<Employee>();
		resultList.add(new Employee("id001","Takahashi Hiromi","ITP"));
		resultList.add(new Employee("id002","Seki Yuta","JFW"));
		return resultList;
	}
}
