package com.bullantus.farseeer.business.base;

import java.util.List;

import com.bullantus.farseeer.entities.base.BaseEntity;

public interface IBaseService<T extends BaseEntity> {
	
	List<T> getAll();

	T save(T item);

	List<T> saveAll(List<T> items);
	
	T update(T item);
	
	
	List<T> updateAll(List<T> items);

	void delete(T item);

	void deleteAll(List<T> items);
	
	T getById(Long id);
}
