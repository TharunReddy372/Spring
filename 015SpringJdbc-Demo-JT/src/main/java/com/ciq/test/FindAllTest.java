package com.ciq.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfiq;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class FindAllTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiq.class);
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		List<Employee> employees = employeeController.findAll();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
