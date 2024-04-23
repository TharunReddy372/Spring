package com.ciq.dao;

import java.util.List;

import com.ciq.dto.Student;

public interface StudentDAO {
	
	public void Save(Student student);
	
	public void update(Student student);
	
	public void deleteById(Integer sid);
	
	public Student findById(Integer sid);
	
	public List<Student>findAll();

}
