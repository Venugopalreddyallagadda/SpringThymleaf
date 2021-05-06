package com.ojas.service;

import java.util.List;

import com.ojas.domain.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public void save(Employee theEmployee);
	public void deleteById(Integer theId);

}
