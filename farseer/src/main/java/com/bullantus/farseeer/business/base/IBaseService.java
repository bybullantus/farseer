package com.bullantus.farseeer.business.base;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IBaseService<T> {
	
	CompletableFuture<List<T>> getAll();

	CompletableFuture<T> add(T item);

	CompletableFuture<T> update(T item);

	void delete(T item);

	CompletableFuture<T> getById(Long id);
}
