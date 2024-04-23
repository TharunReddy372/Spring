package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfiq;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class DeleteByIdTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiq.class);
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.deleteById(1001);
		
		System.out.println("Successfully Deleted");
	}

}
