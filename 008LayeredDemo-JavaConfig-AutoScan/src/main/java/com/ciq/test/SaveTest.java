package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfiguration;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class SaveTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.save(new Employee(1009,"Tharun",30000.00));
		
		
	}

}
