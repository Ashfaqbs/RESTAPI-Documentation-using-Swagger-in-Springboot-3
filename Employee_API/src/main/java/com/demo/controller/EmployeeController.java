/**
 * 
 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.Employee_Service;

/**
 * @author Ashfaq PC
 *
 */
@RestController
public class EmployeeController {

	/**
	 * 
	 */

	@Autowired
	private Employee_Service employee_Service;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> allEmployee = this.employee_Service.getAllEmployee();

		return (allEmployee != null) ? ResponseEntity.ok(allEmployee) : ResponseEntity.noContent().build();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
		Employee Employee = this.employee_Service.getById(id);

		return (Employee != null) ? ResponseEntity.ok(Employee) : ResponseEntity.noContent().build();
	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee employee) {
		this.employee_Service.createEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee employee, @PathVariable("id") int id) {
		this.employee_Service.updateById(id, employee);
		return ResponseEntity.ok(employee);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Void> deleteEmp(@PathVariable("id") int id) {
		this.employee_Service.deleteById(id);
		System.out.println(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
