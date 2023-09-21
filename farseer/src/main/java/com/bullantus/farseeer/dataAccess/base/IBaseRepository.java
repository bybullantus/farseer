package com.bullantus.farseeer.dataAccess.base;

import java.util.List;

import com.bullantus.farseeer.entities.base.BaseEntity;


public interface IBaseRepository<T extends BaseEntity> {
	List<T> getAll();

	T add(T item);

	T update(T item);

	void delete(T item);

	T getById(long id);
	
	
}
