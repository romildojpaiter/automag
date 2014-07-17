package br.com.automag.persistencia;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.entity.veiculos.Veiculo;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class VeiculoDAO extends GenericDAO<Long, Veiculo> {

	@Inject
	public VeiculoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}