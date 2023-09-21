package com.bullantus.farseeer.entities.base;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	boolean isActive = true;
	boolean isDeleted=false;
}
