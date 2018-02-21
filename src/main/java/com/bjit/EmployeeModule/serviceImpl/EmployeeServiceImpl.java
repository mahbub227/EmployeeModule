package com.bjit.EmployeeModule.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.EmployeeModule.model.Employee;
import com.bjit.EmployeeModule.repository.EmployeeRepository;
import com.bjit.EmployeeModule.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> employeeList() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	
	

}