package com.em.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.em.Entity.Employee;
import com.em.dao.EmpRepository;

@Component
public class EmpService {

	@Autowired
	EmpRepository empRepository;

	public Employee saveEmp(Employee employee) {
		Employee employee2 = empRepository.save(employee);
		return employee2;
	}
	public List<Employee> getAllEmp() {
		List<Employee>employees=(List<Employee>) empRepository.findAll();
		return employees;
	}
	public Employee updateEmp(Employee employee, int id) {
		employee.setId(id);
		Employee employees=empRepository.save(employee);
		return employees;
	}
	public void deleteEmp(int id) {
		empRepository.deleteById(id);
	}
	
	public List<Map<String,String>> lookupEmp(boolean lookup){
		List<Employee>employee=(List<Employee>) empRepository.findAll();
		 if (lookup) {
		        return employee.stream().map(employees -> {
		            Map<String, String> emp = new HashMap<>();
		            emp.put("id", String.valueOf(((Employee) emp).getId()));
		            emp.put("ename", ((Employee) employee).getEname());
		            return emp;
		        }).collect(Collectors.toList());
		    } else {
		        return Collections.emptyList();
		    }
	}

}
