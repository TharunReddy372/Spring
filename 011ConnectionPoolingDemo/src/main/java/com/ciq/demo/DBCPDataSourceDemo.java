package com.ciq.demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCPDataSourceDemo {
	
	public static void main(String[] args) {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("tharun372");
        
        //DBCP configuration
        
        basicDataSource.setInitialSize(5);
        basicDataSource.setMaxTotal(10);
        basicDataSource.setMaxIdle(5);
        basicDataSource.setMinIdle(2);
        basicDataSource.setMaxWaitMillis(10000);
		
		try {
			Connection connection = basicDataSource.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
