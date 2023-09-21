package com.bullantus.farseeer.business.base;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IBaseService<T> {
	
	List<T> getAll();

	T save(T item);

	List<T> saveAll(List<T> items);
	
	T update(T item);

	void delete(T item);

	T getById(Long id);
}
