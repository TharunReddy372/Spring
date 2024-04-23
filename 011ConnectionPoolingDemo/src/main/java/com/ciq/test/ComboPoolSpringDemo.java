package com.ciq.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ComboPoolSpringDemo {
	
	public static void main(String[] args) throws SQLException{
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		ComboPooledDataSource comboPooledDataSource =  (ComboPooledDataSource) applicationContext.getBean("comboPoolDataSource");
		
		System.out.println(comboPooledDataSource.getConnection());
	}


}
