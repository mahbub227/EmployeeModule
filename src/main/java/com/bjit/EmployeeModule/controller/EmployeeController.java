package com.bjit.EmployeeModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bjit.EmployeeModule.model.Employee;
import com.bjit.EmployeeModule.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
   
	
	@RequestMapping("/")
	public String show() {
		return "Hello, Welcome to Employee!";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
	    return employeeService.addEmployee(employee);
	}
	
	@RequestMapping("/list")
	public List<Employee> showEmployeeList() {
		return employeeService.employeeList();
	}
	
}
