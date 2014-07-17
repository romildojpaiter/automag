package br.com.automag.persistencia;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.entity.veiculos.ItemOpcional;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class ItemOpcionalDAO extends GenericDAO<Long, ItemOpcional> {

	@Inject
	public ItemOpcionalDAO(EntityManager entityManager) {
		super(entityManager);
	}

}