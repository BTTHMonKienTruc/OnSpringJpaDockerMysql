package com.example.OnSpringJpaDockerMysql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "nhanvien")
@Data
public class Employee {
	
	@Id
	private String maNV;
	private String ten;
	private Integer luong;
	//
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Integer getLuong() {
		return luong;
	}
	public void setLuong(Integer luong) {
		this.luong = luong;
	}
	public Employee(String maNV, String ten, Integer luong) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + "]";
	}
	
}
