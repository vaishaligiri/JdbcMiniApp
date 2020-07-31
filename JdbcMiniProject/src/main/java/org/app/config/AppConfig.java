package org.app.config;

import org.app.repository.EmployeeRepositoryImpl;
import org.app.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"org.app.*"})
public class AppConfig {

	@Bean(name="dataSource")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mysql");
		dataSource.setUsername("root");
		dataSource.setPassword("system");
		return dataSource;
		
	}
	@Bean(name="template")
	public JdbcTemplate getTemploate()
	{
		return new JdbcTemplate(getDataSource());
	
	}
	
}










