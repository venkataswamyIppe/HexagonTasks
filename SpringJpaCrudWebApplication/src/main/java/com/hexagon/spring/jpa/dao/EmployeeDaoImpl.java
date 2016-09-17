package com.hexagon.spring.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hexagon.spring.jpa.model.Employee;

@Service
@Repository
public class EmployeeDaoImpl implements EmployeeDao {


	// Injected database connection
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	// To Save the employee detail
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);

	}
	// To get list of all employees

	@SuppressWarnings("unchecked")
	public List<Employee> EmployeesList() {
		Query query = entityManager.createQuery("select e from Employee e");
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@SuppressWarnings({ "unchecked", "unused"})
	public List<Employee> getEmployee(int id) {
		TypedQuery<Object[]> query = (TypedQuery<Object[]>) entityManager
				.createQuery("SELECT c.id, c.firstName,c.lastName,c.dept,c.email FROM Employee AS c where c.id=" + id);
		List<Object[]> results = query.getResultList();
		return null;
	}

	@Transactional
	public void deleteEmployee(int id) {
		Query query = entityManager.createNativeQuery("delete from Employee where Emp_ID=" + id);
		query.executeUpdate();
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void editEmployee(Employee employee) {
		entityManager.merge(employee);
	}

}
