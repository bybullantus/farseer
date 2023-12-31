package com.bullantus.farseeer.business.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bullantus.farseeer.dataAccess.base.IBaseRepository;
import com.bullantus.farseeer.entities.base.BaseEntity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericService<T extends BaseEntity,K extends IBaseRepository<T> > implements IBaseService<T> {
	
	
	@Autowired
	protected K genericDal;
	
	
	@Override
	
	public List<T> getAll() {
		return  genericDal.getAll();
	}
	
	@Override
	
	public T save(T item) {
		return genericDal.save(item);
	}

	@Override
	public List<T> saveAll(List<T> items) {
		return genericDal.saveAll(items);
	}
	
	@Override
	
	public T update(T item) {
		return genericDal.update(item);
	}

	@Override
	public List<T> updateAll(List<T> items){
		return genericDal.updateAll(items);
	}
	
	@Override
	public void delete(T item) {
		genericDal.delete(item);
	}

	@Override
	public void deleteAll(List<T> items) {
		genericDal.deleteAll(items);
	}
	
	@Override
	public T getById(Long id) {
		return genericDal.getById(id).orElseThrow(()->new RuntimeException("Data Not Found"));
	}
	    
}
