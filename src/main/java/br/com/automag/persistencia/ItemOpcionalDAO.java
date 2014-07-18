package br.com.automag.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.automag.entity.veiculos.ItemOpcional;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class ItemOpcionalDAO extends GenericDAO<Long, ItemOpcional> {

	@Inject
	public ItemOpcionalDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<ItemOpcional> findAllItensOpcionaisAtivos(){
		List<ItemOpcional> resultado = this.getEntityManager().createNamedQuery("findAllItensOpcionaisAtivos", ItemOpcional.class).getResultList();
		if(resultado == null){
			return new ArrayList<ItemOpcional>();
		}
		return resultado;
	}

}