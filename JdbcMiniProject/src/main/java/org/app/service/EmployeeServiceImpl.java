package org.app.service;

import org.app.dto.Employee;
import org.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		if (employee.getQual().equals("BE")) {
			return employeeRepository.save(employee);
		} else {
			return null;
		}

	}

}
