package br.com.automag.persistencia;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.automag.dominio.DominioAtivoInativo.DOMINIO_ATIVO_INATIVO;
import br.com.automag.entity.veiculos.Marca;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class MarcaDAO extends GenericDAO<Long, Marca> {

	@Inject
	public MarcaDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Marca> findMarcasAtivas(){
		TypedQuery<Marca> query = this.getEntityManager().createQuery("from Marca m WHERE m.situacao = :situacao", Marca.class);
		query.setParameter("situacao", DOMINIO_ATIVO_INATIVO.ATIVO);
		
		return query.getResultList();
	}

}