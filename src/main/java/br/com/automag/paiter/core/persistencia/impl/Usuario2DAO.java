package br.com.automag.paiter.core.persistencia.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.automag.paiter.core.entity.portalcom.Usuario;
import br.com.automag.paiter.core.persistencia.IUsuarioDAO;


public class Usuario2DAO implements IUsuarioDAO{


	private EntityManager entityManager;

	@Inject
	public Usuario2DAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Usuario getById(Long pk) {
		return (Usuario) entityManager.find(getTypeClass(), pk);
	}

	public Usuario save(Usuario entity) {
		try {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}

	public void update(Usuario entity) {
		entityManager.merge(entity);
	}

	public void delete(Usuario entity) {
		entityManager.remove(entity);
	}

	public List<Usuario> findAll() {
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

	@Override
	public void remove(Usuario entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findRange(int[] range) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
