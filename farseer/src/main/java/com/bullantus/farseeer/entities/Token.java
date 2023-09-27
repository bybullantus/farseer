package com.bullantus.farseeer.entities;

import com.bullantus.farseeer.entities.base.BaseEntity;
import com.bullantus.farseeer.entities.enums.TokenType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
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
@Table(name = "tokens")
public class Token extends BaseEntity {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "tokens", sequenceName = "tokens.gen", initialValue = 1, allocationSize = 1)
	@Setter(value = AccessLevel.NONE)
	public Integer id;

	@Column(unique = true,name = "token")
	public String token;

	@Enumerated(EnumType.STRING)
	public TokenType tokenType = TokenType.BEARER;

	@Column(name = "revoker")
	public boolean revoked;

	@Column(name = "expired")
	public boolean expired;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User user;
}