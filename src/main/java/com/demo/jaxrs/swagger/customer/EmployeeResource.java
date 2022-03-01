package com.demo.jaxrs.swagger.customer;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.*;

import io.swagger.annotations.*;

@Path("employee")
@io.swagger.annotations.Api(value = "employee")
public class EmployeeResource {

	@GET
	@Path("{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Find employee by ID", notes = "Returns one employee by ID", response = Employee.class)
	@ApiResponses(value = { @ApiResponse(code = 500, message = "An internal erroroccurred"),
			@ApiResponse(code = 404, message = "Employee not found for ID") })

	public Employee getEmployee(@ApiParam(value = "Employee ID to find by") @PathParam("employeeId") int employeeId) {
		EmployeeService employeeService = new DefaultEmployeeService();
		Employee employee = null;
		try {
			employee = employeeService.getEmployee(employeeId);
		} catch (Exception e) {
			throw new WebApplicationException(
					Response.status(Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).build());
		}
		if (employee == null) {
			throw new WebApplicationException(
					Response.status(Status.NOT_FOUND).type(MediaType.APPLICATION_JSON).build());
		}
		return employee;
	}

}
