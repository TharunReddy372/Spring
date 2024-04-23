package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.controller.config.SpringConfig;
import com.ciq.dto.Employee;

public class SaveTest {
	
	public static void main(String[] args) {
		
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		EmployeeController employeeController =  (EmployeeController) applicationContext.getBean("EmployeeController");
		
		employeeController.save(new Employee(1006, "Sunil", 20000.00));
	}

		
}
