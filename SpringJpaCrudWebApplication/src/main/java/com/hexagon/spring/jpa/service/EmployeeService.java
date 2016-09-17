package com.hexagon.spring.jpa.service;

import java.util.List;

import com.hexagon.spring.jpa.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee) ;

	public List<Employee> EmployeesList();
	
	public List<Employee> getEmployee(int id) ;
	
	public void deleteEmployee(int empId);

	public void editEmployee(Employee employee);


}
