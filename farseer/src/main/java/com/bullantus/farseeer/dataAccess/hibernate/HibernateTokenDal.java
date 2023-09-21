package com.bullantus.farseeer.dataAccess.hibernate;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.springframework.stereotype.Repository;

import com.bullantus.farseeer.dataAccess.ITokenDal;
import com.bullantus.farseeer.dataAccess.base.GenericRepository;

import com.bullantus.farseeer.entities.Token;


import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
public class HibernateTokenDal extends GenericRepository<Token> implements ITokenDal{

	@Override
	@Transactional
	public List<Token> getTokenbyUserId(Long id) {
		Session session = entityManager.unwrap(Session.class);
		HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Token> criteria = builder.createQuery(Token.class);
		Root<Token> table = criteria.from(Token.class);
		criteria.where(builder.equal(table.get("id"), id));
		criteria.select(table).orderBy(builder.asc(table.get("id")));
		TypedQuery<Token> query = session.createQuery(criteria);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Optional<Token> getByToken(String token) {

		Session session = entityManager.unwrap(Session.class);
		HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Token> criteria = builder.createQuery(Token.class);
		Root<Token> table = criteria.from(Token.class);
		criteria.select(table);
		criteria.where(builder.equal(table.get("token"), token));
		TypedQuery<Token> query = session.createQuery(criteria);
		return Optional.of(query.getSingleResult());
	}

}
