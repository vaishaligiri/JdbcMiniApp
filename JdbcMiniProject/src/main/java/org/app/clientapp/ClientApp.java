package org.app.clientapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.app.config.AppConfig;
import org.app.dto.Employee;
import org.app.service.EmployeeServiceImpl;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeServiceImpl employee = (EmployeeServiceImpl) context.getBean("employeeService");
		Employee emp = Employee.builder().id(2).name("ram").email("ram@gmail.com").sal(10000).qual("BE").build();

		emp=employee.save(emp);
		if(emp!=null)
		{
			System.out.println("Record Save Success........."+emp);
		}
		else
		{
			System.out.println("some problem is there.......");
		}
	}

}
