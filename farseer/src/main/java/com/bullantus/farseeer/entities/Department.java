package com.bullantus.farseeer.entities;

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
@Table(name = "departments")
public class Department extends BaseEntity{

	
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "departments", sequenceName = "departments.gen", initialValue = 1, allocationSize = 1)
	@Setter(value = AccessLevel.NONE)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@JoinColumn(name = "manager_id")
	@ManyToOne
	private Employe manager;
	
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Location location;
}
