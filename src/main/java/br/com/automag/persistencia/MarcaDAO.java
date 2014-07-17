package br.com.automag.persistencia;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.entity.veiculos.Marca;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class MarcaDAO extends GenericDAO<Long, Marca> {

	@Inject
	public MarcaDAO(EntityManager entityManager) {
		super(entityManager);
	}

}