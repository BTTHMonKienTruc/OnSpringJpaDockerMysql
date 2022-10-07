package com.example.OnSpringJpaDockerMysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.OnSpringJpaDockerMysql.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

	@Query(value = "SELECT * FROM lab04_jpa.nhanvien WHERE Luong > 100000", nativeQuery = true)
	public List<Employee> getEmployeesByLuongDuoi100000();
}
