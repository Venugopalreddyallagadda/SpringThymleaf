package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.EmpRepository;
import com.ojas.domain.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		empRepository.save(theEmployee);
		
	}

	@Override
	public void deleteById(Integer theId) {
		empRepository.deleteById(theId);
		
	}

}
