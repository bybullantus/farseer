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
@Table(name = "locations")
public class Location  extends BaseEntity{

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "locations", sequenceName = "locations.gen", initialValue = 1, allocationSize = 1)
	@Setter(value = AccessLevel.NONE)
	private Integer id;
	
	@Column(name = "street_address",length = 40)
	private String streetAddress;
	
	@Column(name = "postal_code",length = 12)
	private String postalCode;
	
	@Column(name = "city",length = 30)
	private String city;
	
	@Column(name = "state_province",length = 25)
	private String stateProvince;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
}
