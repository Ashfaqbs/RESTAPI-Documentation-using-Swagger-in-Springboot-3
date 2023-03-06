/**
 * 
 */
package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

/**
 * @author Ashfaq PC
 *
 */
@Repository
public interface Employee_Repository extends JpaRepository<Employee, Integer>{

}
