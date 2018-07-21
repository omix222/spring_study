package com.example.springstudy;

public class Employee {
	private String id;
	private String name;
	private String departmentName;
	public Employee(String id, String name, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
