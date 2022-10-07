package com.example.OnSpringJpaDockerMysql.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "chungnhan")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class Certification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4981517413291572881L;

	@Id
	@JoinColumn (name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false )
	@ManyToOne(optional = false)
	private Employee employee;

	@Id
	@JoinColumn (name = "MaMB", referencedColumnName = "MaMB", insertable = false, updatable = false )
	@ManyToOne(optional = false)
	private Plane plane;
	
}
