package com.bjit.EmployeeModule.repository;

import com.bjit.EmployeeModule.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
