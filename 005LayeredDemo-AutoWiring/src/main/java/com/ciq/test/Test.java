package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.dao.EmployeeDAO;
import com.ciq.dto.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.save(new Employee(1001,"Tharun",30000.00));
	}

}
