package com.em;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.em.Entity.Employee;
import com.em.Service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@GetMapping("/emplo")
	public ResponseEntity<List<Employee>> getAllEmp() {
		List<Employee> employees = empService.getAllEmp();
		if (employees.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(employees));
	}

	@PostMapping("/emp")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee) {
		Employee employee2 = empService.saveEmp(employee);
		if (employee2 == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} else {
			return ResponseEntity.ok(employee2);
		}
		

	}
	@PutMapping("/emp/{id}")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee,@PathVariable("id")int id) {
		Employee employees=empService.updateEmp(employee, id);
		if(employees==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); 
			
		}
		return ResponseEntity.of(Optional.of(employees));
	}
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<Void>deleteEmpById(@PathVariable("id")int id) {
		empService.deleteEmp(id);
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}

	}
	@GetMapping("/emp/lookup")
	public List<Map<String, String>> lookupEmployees(@RequestParam(value = "lookup", required = false) boolean lookup) {
	    return empService.lookupEmp(lookup);
	}
}
