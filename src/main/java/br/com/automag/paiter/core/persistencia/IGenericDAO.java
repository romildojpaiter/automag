package br.com.automag.paiter.core.persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.automag.paiter.core.entity.BasePersistEntity;

public interface IGenericDAO<T extends BasePersistEntity> {
	
	public T save(T entidade);
	
	public void remove(T entidade);
	
	public T find(Long id);
	
	public List<T> findAll();
	
	public List<T> findRange(int[] range);
	
	public int count();
	
	public EntityManager getEntityManager();

}
