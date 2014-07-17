package br.com.automag.persistencia;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.entity.veiculos.Modelo;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class ModeloDAO extends GenericDAO<Long, Modelo> {

	@Inject
	public ModeloDAO(EntityManager entityManager) {
		super(entityManager);
	}

}