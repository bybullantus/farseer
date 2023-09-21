package com.bullantus.farseeer.entities;

import java.util.Date;

import com.bullantus.farseeer.entities.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employe extends BaseEntity {


	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "employees", sequenceName = "employees.gen", initialValue = 1, allocationSize = 1)
	@Setter(value = AccessLevel.NONE)
	private Long id;
	
	@Column(name = "first_name",length = 20)
	private String firstName;
	
	@Column(name = "last_name",length = 25)
	private String lastName;
	
	@Column(name = "email",length = 25)
	private String email;
	
	@Column(name = "phone_number",length = 20)
	private String phoneNumber;
	
	@Column(name = "hire_date")
	private Date hireDate;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
	
	@Column(name = "salary")
	private Double salary;
	
	@Column(name = "commission_pct")
	private Double commissionPct;
	
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Employe manager;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
}
