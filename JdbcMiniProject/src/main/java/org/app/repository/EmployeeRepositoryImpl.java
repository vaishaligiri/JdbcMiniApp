package org.app.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.app.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	JdbcTemplate template;

	public Employee save(final Employee employee) {

		int value = template.update("insert into employee values(?,?,?,?,?)", new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1,employee.getId());
				ps.setString(2, employee.getName());
				ps.setString(3, employee.getEmail());
				ps.setInt(4, employee.getSal());
				ps.setString(5, employee.getQual());

			}

		});
		if (value > 0) {
			return employee;
		} else {
			return null;
		}

	}

}
