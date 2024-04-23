package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;

@Repository
public class EmployeeDAO {
	
	public void save(Employee employee) {
		System.out.println("Employee DAO Save Method : Employee Saved into DB "+employee);
	}

}
