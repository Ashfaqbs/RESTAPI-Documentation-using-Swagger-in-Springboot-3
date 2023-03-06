/**
 * 
 */
package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.Employee_Repository;

/**
 * @author Ashfaq PC
 *
 */

@Service
public class Employee_Service {

	/**
	 * 
	 */

	@Autowired
	private Employee_Repository employee_Repository;

	public List<Employee> getAllEmployee()
	{
		return employee_Repository.findAll();
	}




	public Employee getById(int id)
	{
		Employee employee = null;

		try {
			employee = employee_Repository.findById(id).get();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return employee;
	}



	public Employee updateById(int id,Employee employee)
	{
//		Employee employee2 = employee_Repository.findById(id).get();		
//		employee2=employee;
		employee_Repository.save(employee);

		return employee;
	}

	
	public Employee createEmployee(Employee employee)
	{
		employee_Repository.save(employee);
		return employee;
		
	}
	

	public void deleteById(int id)
	{
		employee_Repository.deleteById(id);
	}
	
	
	
}
