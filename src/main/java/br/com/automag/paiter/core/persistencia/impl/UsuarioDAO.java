package br.com.automag.paiter.core.persistencia.impl;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.paiter.core.entity.portalcom.Usuario;

public class UsuarioDAO extends GenericDAO<Long, Usuario>{

	@Inject
	public UsuarioDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
