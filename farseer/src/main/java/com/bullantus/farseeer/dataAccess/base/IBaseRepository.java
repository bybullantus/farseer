package com.bullantus.farseeer.dataAccess.base;

import java.util.List;
import java.util.Optional;

import com.bullantus.farseeer.entities.base.BaseEntity;

public interface IBaseRepository<T extends BaseEntity> {
	
	List<T> getAll();

	T save(T item);

	List<T> saveAll(List<T> items);

	T update(T item);
	
	List<T> updateAll(List<T> items);

	void delete(T item);
	
	void deleteAll(List<T> items);

	Optional<T> getById(long id);

}
