package br.com.automag.paiter.core.persistencia.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class GenericDAO<PK, T> {

	private EntityManager entityManager;

	@Inject
	public GenericDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public T getById(PK pk) {
		return (T) entityManager.find(getTypeClass(), pk);
	}

	public void save(T entity) throws Exception {
		try {
			entityManager.persist(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	public void update(T entity) {
		entityManager.merge(entity);
	}

	public void delete(T entity) {
		entityManager.remove(entity);
	}

	public List<T> findAll() {
		return entityManager.createQuery(("FROM " + getTypeClass().getName()))
				.getResultList();
	}

	private Class<?> getTypeClass() {
		Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
		return clazz;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
