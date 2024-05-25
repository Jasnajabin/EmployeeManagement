package com.em;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.em.Entity.Department;
import com.em.Entity.Employee;
import com.em.Service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/dep")
	public ResponseEntity<Department> saveDep(@RequestBody Department department) {
		Department department2 = departmentService.saveDep(department);
		if (department2 == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} else {
			return ResponseEntity.ok(department2);
		}
		

	}
	@DeleteMapping("/dep/{id}")
	public ResponseEntity<Void>deleteDepById(@PathVariable("id")int id) {
		departmentService.deleteDep(id);
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}

	}
	@PutMapping("/dep/{id}")
	public ResponseEntity<Department> updateDep(@RequestBody Department department,@PathVariable("id")int id) {
		Department department2=departmentService.updateDep(department, id);
		if(department2==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); 
			
		}
		return ResponseEntity.of(Optional.of(department2));
	}
}
