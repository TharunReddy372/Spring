package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.StudentDAO;
import com.ciq.dto.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public void Save(Student student) {
		System.out.println("Student Service Save method");
		studentDAO.Save(student);
	}

	@Override
	public void update(Student student) {
		studentDAO.update(student);
	}

	@Override
	public void deleteById(Integer sid) {
		studentDAO.deleteById(sid);
	}

	@Override
	public Student findById(Integer sid) {
		return studentDAO.findById(sid);
	}

	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

}
