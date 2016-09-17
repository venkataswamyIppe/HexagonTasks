package com.hexagon.spring.jpa.dao;

import java.util.List;

import com.hexagon.spring.jpa.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee) ;

	public List<Employee> EmployeesList() ;
	
	public List<Employee> getEmployee(int id);
	
	public void deleteEmployee(int id) ;
	 
	public void editEmployee(Employee employee);
}
