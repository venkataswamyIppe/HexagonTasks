package com.hexagon.dao;

import javax.persistence.EntityManager;

import com.hexagon.model.Employee;
import com.hexagon.util.EntityManagerUtil;

public class EmployeeDAO {

	// select Operation
	public Employee get(Integer empId) {
		EntityManager entityManager = null;
		Employee employee = null;

		try {
			entityManager = EntityManagerUtil.getEntityManager();
			employee = (Employee) entityManager.find(Employee.class, empId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	// insert Operation
	public void insert(Employee employee) {
		EntityManager entityManager = null;
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
			System.out.println("record is inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update Operation
	public void update(Employee employee) {

		EntityManager entityManager = null;

		try {
			entityManager = EntityManagerUtil.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.merge(employee);
			entityManager.getTransaction().commit();
			System.out.println("record is updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete Operation
	public void delete(Integer empId) {

		EntityManager entityManager = null;

		try {

			entityManager = EntityManagerUtil.getEntityManager();
			entityManager.getTransaction().begin();
			Employee emp = (Employee) entityManager.find(Employee.class, empId);
			entityManager.remove(emp);
			entityManager.getTransaction().commit();
			System.out.println("updating record is deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
