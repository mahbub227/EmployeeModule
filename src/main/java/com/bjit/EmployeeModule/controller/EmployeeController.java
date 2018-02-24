package com.bjit.EmployeeModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bjit.EmployeeModule.model.Employee;
import com.bjit.EmployeeModule.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
   
	
	/*@RequestMapping("/")
	public String show(Model model) {
		model.addAttribute("message", "Welcome to Spring");
		return "home";
	}*/
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
	    return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/")
	public String showEmployeeList(Model model) {
		model.addAttribute("employeeList", employeeService.employeeList());
		return "home";
	}
	
}
