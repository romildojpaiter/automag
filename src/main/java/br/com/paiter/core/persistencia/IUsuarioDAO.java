package br.com.paiter.core.persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.paiter.core.entity.portalcom.Usuario;


public interface IUsuarioDAO {

	public Usuario save(Usuario entidade);
	
	public void remove(Usuario entidade);
	
	public Usuario find(Long id);
	
	public List<Usuario> findAll();
	
	public List<Usuario> findRange(int[] range);
	
	public int count();
	
	public EntityManager getEntityManager();

}
