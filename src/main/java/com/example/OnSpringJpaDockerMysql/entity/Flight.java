package com.example.OnSpringJpaDockerMysql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "chuyenbay")
@Data
@AllArgsConstructor		// contructor  full tham so
@NoArgsConstructor // contructor  k tham so
@Setter
@Getter
@Builder
@ToString
public class Flight {
	
	@Id
	private String maCB;
    private String gadi;
    private String gaden;
    private int dodai;
    private String giodi;
    private String gioden;
    private int chiphi;
}
