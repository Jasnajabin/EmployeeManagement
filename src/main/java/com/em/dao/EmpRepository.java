package com.em.dao;

import org.springframework.data.repository.CrudRepository;

import com.em.Entity.Department;
import com.em.Entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{

	

}
