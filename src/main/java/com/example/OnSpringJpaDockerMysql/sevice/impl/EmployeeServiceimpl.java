package com.example.OnSpringJpaDockerMysql.sevice.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.OnSpringJpaDockerMysql.entity.Employee;
import com.example.OnSpringJpaDockerMysql.repository.EmployeeRepository;
import com.example.OnSpringJpaDockerMysql.sevice.EmployeeSevice;

@Service
@Transactional
public class EmployeeServiceimpl implements EmployeeSevice{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(String maNV) {
		// TODO Auto-generated method stub
		
		Optional<Employee> result = employeeRepository.findById(maNV);
		Employee e =null;
		if (result.isPresent()) {
			e = result.get();
		}
		else {
			throw new RuntimeException("Khong tim thay ma: "+maNV);
		}
		
		return e;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(String maNV) {
		employeeRepository.deleteById(maNV);
	}

	@Override
	public List<Employee> getEmployeesByLuongDuoi100000() {
		return employeeRepository.getEmployeesByLuongDuoi100000();
	}

}
