package com.oybo.drive.motorsport.back.apirest.bean;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Component
@Configuration
public class datasource {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_drivemotorsports?serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("oybo");
		return dataSource;
	}
}
