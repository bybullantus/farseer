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
@Table(name = "job_histories")
public class JobHistory extends BaseEntity{

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "job_history", sequenceName = "job_history.gen", initialValue = 1, allocationSize = 1)
	@Setter(value = AccessLevel.NONE)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employe employe;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
}
