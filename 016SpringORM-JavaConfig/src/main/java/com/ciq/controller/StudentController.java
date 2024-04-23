package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.dto.Student;
import com.ciq.service.StudentService;
@Controller
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	public void save(Student student) {
		System.out.println("Student Controller Save Method");
		studentService.Save(student);
	}
	
	public void update(Student student) {
		studentService.update(student);
	}
	
	public void deleteById(Integer sid) {
		studentService.deleteById(sid);
	}
	
	public Student findById(Integer sid) {
		return studentService.findById(sid);
	}
	
	public List<Student> findAll(){
		return studentService.findAll();
	}

}
