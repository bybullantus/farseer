package com.bullantus.farseeer.business.base;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.bullantus.farseeer.entities.base.BaseEntity;

public interface IBaseService<T extends BaseEntity> {
	
	List<T> getAll();

	T save(T item);

	List<T> saveAll(List<T> items);
	
	T update(T item);

	void delete(T item);

	T getById(Long id);
}
