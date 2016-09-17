package com.hexagon.spring.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
	@Id
	@Column(name = "EMP_Id",nullable = false, length = 5)
	private Integer id;
	@Column(name = "EMP_firstName", nullable = false, length = 30)
	private String firstName;
	@Column(name = "EMP_lastName", nullable = false, length = 30)
	private String lastName;
	@Column(name = "EMP_Dept", nullable = false, length = 30)
	private String dept;
	@Column(name = "EMP_Email", nullable = false, length = 30)
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
