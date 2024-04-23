package com.ciq.demo;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0DataSource {
	
	public static void main(String[] args) throws PropertyVetoException {
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("tharun372");
		
		//c3p0 configuration
		comboPooledDataSource.setInitialPoolSize(5);
		comboPooledDataSource.setMinPoolSize(10);
		comboPooledDataSource.setMinPoolSize(2);
		comboPooledDataSource.setMaxIdleTime(1000);
		
		try {
			Connection connection = comboPooledDataSource.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
