package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class DeleteByIdTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.deleteById(1006);
		
		System.out.println("Deleted Successfully");
	}

}
