package com.bullantus.farseeer.business.base;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import com.bullantus.farseeer.dataAccess.base.IBaseRepository;
import com.bullantus.farseeer.entities.base.BaseEntity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericManager<T extends BaseEntity,K extends IBaseRepository<T> > implements IBaseService<T> {
	
	
	@Autowired
	protected K genericDal;
	
	
	@Override
	@Async
	public CompletableFuture<List<T>> getAll() {
		return CompletableFuture.completedFuture( genericDal.getAll());
	}
	
	@Override
	@Async
	public CompletableFuture<T> add(T item) {
		return CompletableFuture.completedFuture( genericDal.add(item));
	}

	
	@Override
	@Async
	public CompletableFuture<T> update(T item) {
		return CompletableFuture.completedFuture( genericDal.update(item));
	}

	
	@Override
	public void delete(T item) {
		genericDal.delete(item);
	}

	
	@Override
	@Async
	public CompletableFuture<T> getById(Long id) {
		return CompletableFuture.completedFuture( genericDal.getById(id));
	}

	
	    
}
