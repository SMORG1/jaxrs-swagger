package com.demo.jaxrs.swagger.customer;

import java.text.*;

public class DefaultEmployeeService implements EmployeeService {

	public Employee getEmployee(int employeeId) throws Exception {
		Employee employee = null;
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		if (employeeId == 1) {
			employee = new Employee(1, "First", "Employee", format.parse("10/01/2015"));
		} else if (employeeId == 2) {
			employee = new Employee(2, "Second", "Employee", format.parse("05/05/2013"));
		} else if (employeeId == 3) {
			employee = new Employee(3, "Third", "Employee", format.parse("01/06/1999"));
		}

		return employee;
	}

}
