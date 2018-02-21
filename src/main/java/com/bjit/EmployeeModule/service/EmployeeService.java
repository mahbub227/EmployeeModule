package com.bjit.EmployeeModule.service;

import java.util.List;

import com.bjit.EmployeeModule.model.Employee;

public interface EmployeeService {
	
	public List<Employee> employeeList();
	public Employee addEmployee(Employee employee);
	
	
}
