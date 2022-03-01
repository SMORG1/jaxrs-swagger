package com.demo.jaxrs.swagger.customer;

import java.util.*;

import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private Date doj;

}
