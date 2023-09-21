package com.bullantus.farseeer.dataAccess.base;

import java.util.List;

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
	public T add(T item) {
		
		//entityManager.unwrap(Session.class).saveOrUpdate(item); return item;
		 
		Session session = entityManager.unwrap(Session.class);
		session.merge(item);
		return item;
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
	public void delete(T item) {
		item.setActive(false);
		// entityManager.unwrap(Session.class).saveOrUpdate(item);
		entityManager.merge(item);

	}
	
	@Transactional
	@Override
	public T getById(long id) {

		Session session = entityManager.unwrap(Session.class);
		HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<T> criteria = builder.createQuery(type);
		Root<T> table = criteria.from(type);
		criteria.select(table);
		criteria.where(builder.and(builder.equal(table.get("id"), id), builder.equal(table.get("isDeleted"), false)));
		TypedQuery<T> query = session.createQuery(criteria);
		List<T> a = query.getResultList();
		if (a.size() <= 0)
			return null;
		return query.getSingleResult();
	}

}
