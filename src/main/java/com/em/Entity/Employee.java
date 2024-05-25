package com.em.Entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ename;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private LocalDate dob;
	private int salary;
	private String address;
	private String role;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private LocalDate jDate;
	private String yearlyBP;
	private String rManager;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Department department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDate getjDate() {
		return jDate;
	}

	public void setjDate(LocalDate jDate) {
		this.jDate = jDate;
	}

	public String getYearlyBP() {
		return yearlyBP;
	}

	public void setYearlyBP(String yearlyBP) {
		this.yearlyBP = yearlyBP;
	}

	public String getrManager() {
		return rManager;
	}

	public void setrManager(String rManager) {
		this.rManager = rManager;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(int id, String ename, LocalDate dob, int salary, String address, String role, LocalDate jDate,
			String yearlyBP, String rManager, Department department) {
		super();
		this.id = id;
		this.ename = ename;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.role = role;
		this.jDate = jDate;
		this.yearlyBP = yearlyBP;
		this.rManager = rManager;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", dob=" + dob + ", salary=" + salary + ", address="
				+ address + ", role=" + role + ", jDate=" + jDate + ", yearlyBP=" + yearlyBP + ", rManager=" + rManager
				+ ", department=" + department + "]";
	}

}
