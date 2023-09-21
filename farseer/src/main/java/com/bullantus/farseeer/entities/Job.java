package com.bullantus.farseeer.entities;

import java.util.Date;

import com.bullantus.farseeer.entities.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "jobs")
public class Job extends BaseEntity{

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "jobs", sequenceName = "jobs.gen", initialValue = 1, allocationSize = 1)
	@Setter(value = AccessLevel.NONE)
	private Integer id;
	
	@Column(name = "title",length = 35)
	private String title;
	
	@Column(name = "min_salary")
	private Double minSalary;
	
	@Column(name = "max_salary")
	private Double maxSalary;
}
