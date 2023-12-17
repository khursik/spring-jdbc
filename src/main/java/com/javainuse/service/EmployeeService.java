package com.javainuse.service;

import java.util.List;

import com.javainuse.dao.EmployeeDAO;
import com.javainuse.domain.Employee;

public class EmployeeService {
	EmployeeDAO empDAO;

	public EmployeeService() {
	}
	//Constructor for EmployeeService for constructor injection
	public EmployeeService(EmployeeDAO empDAO) {
		super();
		this.empDAO = empDAO;
	}

	public void addNewEmployee(Employee emp) {
		empDAO.addNewEmployee(emp);
	}

	public List<Employee> getEmployees() {
		return empDAO.getAllEmployees();
	}

}