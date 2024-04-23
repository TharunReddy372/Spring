package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.StudentController;

public class DeleteByIdTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentController studentController = (StudentController) applicationContext.getBean("studentController");
		
		studentController.deleteById(1004);
		System.out.println("Deleted Successfully");
	}

}
