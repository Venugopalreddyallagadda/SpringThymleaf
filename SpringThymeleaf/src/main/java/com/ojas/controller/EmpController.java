package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ojas.domain.Employee;
import com.ojas.service.EmployeeService;

@Controller
@RequestMapping("/emps")
public class EmpController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/req")
	public String reqpage(ModelMap map) {
		Employee e = new Employee();
		map.addAttribute("employee", e);
		return "Register";
	}
	
	@PostMapping("/save")
	public String addEmployee(@ModelAttribute Employee employee,ModelMap map) {
		empService.save(employee);
		map.addAttribute("emp",employee);
		return "Info";
	}
	
	@RequestMapping("/all") 
	public String showDates(ModelMap map) {
	map.addAttribute("message","Hello UI");
	List<Employee> emps = empService.findAll();
	map.addAttribute("list",emps);
	return "Data";
	}
}

