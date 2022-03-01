package com.demo.jaxrs.swagger.customer;

public interface EmployeeService {

   /**
    * Selects a customer by customer ID.
    * 
    * @param customerId
    * @return Customer
    * @throws Exception
    */
   Employee getEmployee(int employeeId) throws Exception;

}
