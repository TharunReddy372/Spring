package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.controller.StudentController;
import com.ciq.dto.Student;


public class SaveTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentController  studentController= (StudentController) applicationContext.getBean("studentController");
//		StudentController  studentController=  applicationContext.getBean(StudentController.class);	
		studentController.save(new Student(1006,"Rakshith",30000.00));
	}

}
