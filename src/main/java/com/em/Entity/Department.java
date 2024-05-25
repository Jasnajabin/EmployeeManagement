package com.em.Entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String dname;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private LocalDate creationDate;
	private String departmentHead;
	@OneToOne(mappedBy = "department")
	@JsonBackReference
	private Employee employees;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	

	public Employee getEmployees() {
		return employees;
	}

	public void setEmployees(Employee employee) {
		this.employees = employees;
	}

	public Department(int id, String dname, LocalDate creationDate, String departmentHead, Employee employees) {
		super();
		this.id = id;
		this.dname = dname;
		this.creationDate = creationDate;
		this.departmentHead = departmentHead;
		this.employees = employees;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", creationDate=" + creationDate + ", departmentHead="
				+ departmentHead + ", employee=" + employees + "]";
	}

}
