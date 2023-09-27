package com.bullantus.farseeer.dataAccess.base;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;

import com.bullantus.farseeer.entities.base.BaseEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@MappedSuperclass
public abstract class GenericRepository<T extends BaseEntity> implements IBaseRepository<T> {

	private Class<T> type;

	protected GenericRepository() {
		this.type = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), GenericRepository.class);
	}

	@Autowired
	protected EntityManager entityManager;

	@Transactional
	@Override
	public List<T> getAll() {
		Session session = entityManager.unwrap(Session.class);
		HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(type);
		Root<T> table = criteria.from(type);
		criteria.where(builder.equal(table.get("isDeleted"), false));
		criteria.select(table).orderBy(builder.asc(table.get("id")));
		TypedQuery<T> query = session.createQuery(criteria);
		return query.getResultList();
	}

	@Transactional
	@Override
	public T save(T item) {
		
		//entityManager.unwrap(Session.class).saveOrUpdate(item); return item;
		 
		Session session = entityManager.unwrap(Session.class);
		session.merge(item);
		return item;
	}

	@Transactional

	@Override
	public List<T> saveAll(List<T> items) {
		Session session = entityManager.unwrap(Session.class);
		for (T t : items) {
			session.merge(t);
		}
		return items;
	}
	@Transactional
	@Override
	public T update(T item) {

		Session session = entityManager.unwrap(Session.class);
		session.merge(item);
		return item;
	}

	@Transactional
	@Override
	public List<T> updateAll(List<T> items){
		Session session = entityManager.unwrap(Session.class);
		for (T t : items) {
			session.merge(t);
		}
		return items;
	}
	
	@Transactional
	@Override
	public void delete(T item) {
		Session session = entityManager.unwrap(Session.class);
		item.setDeleted(true);
		// entityManager.unwrap(Session.class).saveOrUpdate(item);
		session.merge(item);

	}
	
	@Transactional
	@Override
	public void deleteAll(List<T> items) {
		Session session = entityManager.unwrap(Session.class);
		for (T t : items) {
			t.setDeleted(true);
			session.merge(t);
		}
		
	}
	
	@Transactional
	@Override
	public Optional<T> getById(long id) {

		Session session = entityManager.unwrap(Session.class);
		HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(type);
		Root<T> table = criteria.from(type);
		criteria.select(table);
		criteria.where(builder.and(builder.equal(table.get("id"), id), builder.equal(table.get("isDeleted"), false)));
		TypedQuery<T> query = session.createQuery(criteria);
		List<T> list=query.getResultList();
		if(list==null || list.isEmpty())
			return Optional.empty();
		return Optional.of(list.get(0));
	}

}
