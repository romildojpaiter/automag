package br.com.automag.persistencia;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.entity.veiculos.Cor;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class CorDAO extends GenericDAO<Long, Cor> {

	@Inject
	public CorDAO(EntityManager entityManager) {
		super(entityManager);
	}

}