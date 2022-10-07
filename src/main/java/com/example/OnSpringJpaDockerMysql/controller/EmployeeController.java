package com.example.OnSpringJpaDockerMysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnSpringJpaDockerMysql.entity.Employee;
import com.example.OnSpringJpaDockerMysql.sevice.EmployeeSevice;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeSevice employeeSevice;

	@Autowired
	public EmployeeController(EmployeeSevice employeeSevice) {
		this.employeeSevice = employeeSevice;
	}
	
	
	@GetMapping("/")
	public String myHome() {
		return "home";
	}
	//
	@GetMapping("/employes")
	public List<Employee> getEmployees() {
		return employeeSevice.findAll();
	}
	//
	@GetMapping("/cau03")
	public List<Employee> getEmployeesByLuongDuoi100000() {
		return employeeSevice.getEmployeesByLuongDuoi100000();
	}

}
