package com.example.OnSpringJpaDockerMysql.sevice;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.OnSpringJpaDockerMysql.entity.Employee;

public interface EmployeeSevice {
	
	public List<Employee> findAll();
	public Employee findById(String maNV);
	public void save(Employee employee);
	public void delete(String maNV);
	

	@Query(value = "SELECT * FROM lab04_jpa.nhanvien WHERE Luong > 10000", nativeQuery = true)
	public List<Employee> getEmployeesByLuongDuoi100000();
	

}
