package com.ciq.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.StudentController;
import com.ciq.dto.Student;



public class FindAllTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentController studentController = (StudentController) applicationContext.getBean("studentController");
		
		
		List<Student> students = studentController.findAll();
		
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
