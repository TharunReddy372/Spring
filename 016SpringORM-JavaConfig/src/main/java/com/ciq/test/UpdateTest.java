package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.StudentController;
import com.ciq.dto.Student;



public class UpdateTest {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		StudentController studentController = (StudentController) applicationContext.getBean("studentController");
		
		studentController.update(new Student(1005,"Mohan",35000.00));
		
		System.out.println("Updated Successfully");
	}

}
