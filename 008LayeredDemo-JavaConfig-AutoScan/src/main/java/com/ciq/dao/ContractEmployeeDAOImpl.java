package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;

@Repository
public class ContractEmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void save(Employee employee) {
		System.out.println("Employee DAO save method for contract Employee : Employee saved into DB "+employee);
		
	}

}
