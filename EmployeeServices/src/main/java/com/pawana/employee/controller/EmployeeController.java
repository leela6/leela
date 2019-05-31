package com.pawana.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawana.employee.helper.EmployeeHelper;
import com.pawana.employee.util.APIResponse;
import com.pawana.employee.vo.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeHelper employeeHelper;
	
	
	@GetMapping("/employee/{id}")
	public APIResponse<Employee> getEmployee(@PathVariable String id) {
		
		return employeeHelper.getEmployee(Integer.parseInt(id));
		
	}
	

	@PostMapping("/employee")
	public APIResponse<Employee> insertEmployee(@RequestBody Employee employee) {
		
		return employeeHelper.insertEmployee(employee);
		
	}

}
