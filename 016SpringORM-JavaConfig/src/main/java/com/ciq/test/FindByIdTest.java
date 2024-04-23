package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.StudentController;
import com.ciq.dto.Student;


public class FindByIdTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentController studentController = (StudentController) applicationContext.getBean("studentController");
		Student student = studentController.findById(1001);
		
		System.out.println(student);
	}

}
