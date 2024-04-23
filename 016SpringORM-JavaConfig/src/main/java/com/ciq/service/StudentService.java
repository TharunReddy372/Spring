package com.ciq.service;

import java.util.List;

import com.ciq.dto.Student;

public interface StudentService {
	
	public void Save(Student student);
	
	public void update(Student student);
	
	public void deleteById(Integer sid);
	
	public Student findById(Integer sid);
	
	public List<Student> findAll();

}
