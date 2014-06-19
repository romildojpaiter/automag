package br.com.paiter.core.persistencia.impl;

import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.paiter.core.entity.portalcom.Usuario;

public class UsuarioDAO extends GenericDAO<Long, Usuario>{

	@Inject
	public UsuarioDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public boolean emailJaCadastro(String email) {
		try {
			Query query = this.getEntityManager().createNamedQuery("findByEmail").setParameter("email", email);
			Usuario usuario = (Usuario) query.getSingleResult();
			return (usuario == null ? true : false);
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}

	public boolean loginJaCadastro(String login) {
		try {
			Usuario usuario = this.selecionarUsuarioByUsername(login);
			return (usuario == null ? true : false);
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}


	public Usuario selecionarUsuarioByUsername(String login) {
		Query query = this.getEntityManager().createNamedQuery("findByLogin").setParameter("login", login);
		Usuario usuario = null;
		try {
			usuario = (Usuario) query.getSingleResult();
			return usuario;
		} catch (NoResultException e) {
			return usuario;
		}
	}

	public Set<String> listarPermissoesByPerfil(String role) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Set<String> listarPerfilsByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
