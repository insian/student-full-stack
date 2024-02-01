package com.example.demo.service;

import com.example.demo.model.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);
	Iterable<Employee> getEmployees();
	Employee findEmployeeById(Integer employeeId);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Integer employeeId);
}
