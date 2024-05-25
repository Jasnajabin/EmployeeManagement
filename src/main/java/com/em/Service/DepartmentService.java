package com.em.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.em.Entity.Department;
import com.em.Entity.Employee;
import com.em.dao.DepRepository;



@Component
public class DepartmentService {
	@Autowired
	DepRepository depRepository;
	public Department saveDep(Department department) {
		Department departments= depRepository.save(department);
		return departments;
	}
	public void deleteDep(int id) {
		depRepository.deleteById(id);
	}
	public Department updateDep(Department department, int id) {
		department.setId(id);
		Department department2=depRepository.save(department);
		return department2;
	}
}
