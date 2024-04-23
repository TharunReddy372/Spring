package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class UpdateTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.update(new Employee(1005,"Suresh",30000.00));
		
		System.out.println("Updated Successfully");
		
	}

}
