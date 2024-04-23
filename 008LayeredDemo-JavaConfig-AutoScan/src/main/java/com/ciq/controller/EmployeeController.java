package com.ciq.controller;

import org.springframework.stereotype.Controller;

import com.ciq.dto.Employee;
import com.ciq.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public void save(Employee employee) {
		System.out.println("Employee  controller save method");
		employeeService.save(employee);
	}

}
