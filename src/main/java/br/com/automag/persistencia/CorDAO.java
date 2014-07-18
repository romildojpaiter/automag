package br.com.automag.persistencia;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import br.com.automag.dominio.DominioAtivoInativo.DOMINIO_ATIVO_INATIVO;
import br.com.automag.entity.veiculos.Cor;
import br.com.paiter.core.persistencia.impl.GenericDAO;

public class CorDAO extends GenericDAO<Long, Cor> {

	@Inject
	public CorDAO(EntityManager entityManager) {
		super(entityManager);
	}

	/**
	 * Consulta de cores disponiveis ATIVA utilizano a Criteria do JPA
	 * 
	 * @return lista de objeto de corres
	 */
	public List<Cor> findCoresAtivas() {	
		
		// Constroi a Critéria
		CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Cor> criteriaQuery = builder.createQuery(Cor.class);
		// Roota o objeto cor
		Root<Cor> rootCor = criteriaQuery.from(Cor.class);
		// Selecionar poucos itens
		criteriaQuery.multiselect(rootCor.get("id"), rootCor.get("nome"));
		// Adicionando um parametro
		ParameterExpression<DOMINIO_ATIVO_INATIVO> paramAtivo = builder.parameter(DOMINIO_ATIVO_INATIVO.class);
		// Criteria Criada
		criteriaQuery.select(rootCor).where(builder.equal(rootCor.get("situacao"), paramAtivo));
		
		// Executa a Criteria 
		TypedQuery<Cor> query = this.getEntityManager().createQuery(criteriaQuery);
		query.setParameter(paramAtivo, DOMINIO_ATIVO_INATIVO.ATIVO);
		
		return query.getResultList();
	}

}