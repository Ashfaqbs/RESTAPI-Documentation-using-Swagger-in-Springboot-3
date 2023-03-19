/**
 * 
 */
package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Ashfaq PC
 *
 */
@Entity
@Table(name = "Employee_Backend")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String company;
	private double salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String company, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}

	
	
	
}
