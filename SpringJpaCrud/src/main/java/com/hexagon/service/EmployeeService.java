package com.hexagon.service;

import com.hexagon.dao.EmployeeDAO;
import com.hexagon.model.Employee;

public class EmployeeService {
	public static void main(String[] args) {

		EmployeeDAO empDAO = new EmployeeDAO();

		Employee createEmp1 = new Employee(1, "balram", "IT");
		Employee createEmp2 = new Employee(2, "venky", "IT");
		empDAO.insert(createEmp1);// Create
		empDAO.insert(createEmp2);// Create

		Employee readEmp1 = empDAO.get(1);// Read
		System.out.println("before updating record:" + readEmp1);

		Employee updateEmp = new Employee(1, "raju", "IT");
		empDAO.update(updateEmp);// Update

		Employee readEmp2 = empDAO.get(1);// Read
		System.out.println("after updated record :" + readEmp2);

		empDAO.delete(1); // Delete

	}
}
