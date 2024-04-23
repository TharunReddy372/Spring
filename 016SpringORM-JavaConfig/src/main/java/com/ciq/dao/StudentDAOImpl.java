package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.dto.Student;
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void Save(Student student) {
		hibernateTemplate.save(student);
	}

	@Override
	public void update(Student student) {
		hibernateTemplate.update(student);
	}

	@Override
	public void deleteById(Integer sid) {
		Student student = new Student();
		student.setSid(sid);
		hibernateTemplate.delete(student);
	}

	@Override
	public Student findById(Integer sid) {
		return hibernateTemplate.get(Student.class, sid);
	}

	@Override
	public List<Student> findAll() {
		return hibernateTemplate.loadAll(Student.class);
	}

}
