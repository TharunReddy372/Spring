package com.ciq.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;

@Repository
@Primary
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void save(Employee employee) {
		System.out.println("Employee DAO Save method : Employee SAved into DB "+employee);
		
	}
	

}
