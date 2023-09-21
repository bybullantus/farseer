package com.bullantus.farseeer.entities.base;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	boolean isActive = true;
	boolean isDeleted;
}
