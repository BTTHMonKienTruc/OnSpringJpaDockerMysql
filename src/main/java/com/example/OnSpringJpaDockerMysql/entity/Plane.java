package com.example.OnSpringJpaDockerMysql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "maybay")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class Plane {
	@Id
	private int maMB;
	private String loai;
	private int tambay;

}
