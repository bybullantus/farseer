package com.bullantus.farseeer.dataAccess.base;

import java.util.List;
import java.util.Optional;

import com.bullantus.farseeer.entities.base.BaseEntity;


public interface IBaseRepository<T extends BaseEntity> {
	List<T> getAll();

	T save(T item);
	
	List<T> saveAll(List<T> items);

	T update(T item);

	void delete(T item);

	Optional<T> getById(long id);
	
	
}
