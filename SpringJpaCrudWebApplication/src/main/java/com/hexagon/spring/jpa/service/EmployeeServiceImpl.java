package com.hexagon.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hexagon.spring.jpa.dao.EmployeeDao;
import com.hexagon.spring.jpa.model.Employee;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	
	public List<Employee> EmployeesList() {
		return employeeDao.EmployeesList();
	}

	public List<Employee> getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}
	public void deleteEmployee(int id)
	{
		employeeDao.deleteEmployee(id);
	}

	public void editEmployee(Employee employee) {
		employeeDao.editEmployee(employee);
	}

	
}
