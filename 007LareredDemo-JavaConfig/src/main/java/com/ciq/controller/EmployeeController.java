package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	public void save(Employee employee) {
		System.out.println("Employee controller save method ");
		employeeService.save(employee);
	}

}
